/* (c) 2015 Markus Riegel
 * license: MIT
 */
package com.marcorei.infinitefire;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;

/**
 * Simplified DataSnapshot.
 * InfiniteFireSnapshot allows that an {@link InfiniteFireArray} can be replaced for testing.
 * You'll get the key and the value but without the overhead.
 */
public class InfiniteFireSnapshot<T> {
    private String key;
    private T value;
    private DatabaseReference ref;

    public InfiniteFireSnapshot(@NonNull String key, T value, DatabaseReference ref) {
        this.key = key;
        this.value = value;
        this.ref = ref;
    }

    public String getKey() {
        return key;
    }

    @Nullable
    public T getValue() {
        return value;
    }

    public DatabaseReference getRef(){ return ref; }

    public void updateValue(String key, String value) {
        ref.child(key).setValue(value);
    }
}

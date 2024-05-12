package com.bytedance.android.live.network.gson;

import com.google.gson.Gson;
import com.google.gson.i;

/* loaded from: classes12.dex */
public abstract class AbsJsonDeserializer<T> implements i<T> {
    public final Gson LIZ;

    public AbsJsonDeserializer(Gson gson) {
        this.LIZ = gson;
    }
}

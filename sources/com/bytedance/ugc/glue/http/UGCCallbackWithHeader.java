package com.bytedance.ugc.glue.http;

import android.util.Pair;
import java.util.List;

/* loaded from: classes6.dex */
public interface UGCCallbackWithHeader<T> {
    void onResponse(int i, T t, List<Pair<String, String>> list);
}

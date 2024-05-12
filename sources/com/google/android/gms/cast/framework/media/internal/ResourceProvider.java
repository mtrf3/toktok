package com.google.android.gms.cast.framework.media.internal;

import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public final class ResourceProvider {
    public static final Map<String, Integer> LIZ;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", Integer.valueOf(R.drawable.a_0));
        hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(R.drawable.al));
        hashMap.put("pauseDrawableResId", Integer.valueOf(R.drawable.ae));
        hashMap.put("playDrawableResId", Integer.valueOf(R.drawable.af));
        hashMap.put("skipNextDrawableResId", Integer.valueOf(R.drawable.aj));
        hashMap.put("skipPrevDrawableResId", Integer.valueOf(R.drawable.ak));
        hashMap.put("forwardDrawableResId", Integer.valueOf(R.drawable.aa));
        hashMap.put("forward10DrawableResId", Integer.valueOf(R.drawable.ab));
        hashMap.put("forward30DrawableResId", Integer.valueOf(R.drawable.ac));
        hashMap.put("rewindDrawableResId", Integer.valueOf(R.drawable.ag));
        hashMap.put("rewind10DrawableResId", Integer.valueOf(R.drawable.ah));
        hashMap.put("rewind30DrawableResId", Integer.valueOf(R.drawable.ai));
        hashMap.put("disconnectDrawableResId", Integer.valueOf(R.drawable.a_));
        hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(R.dimen.a2));
        hashMap.put("castingToDeviceStringResId", Integer.valueOf(R.string.c));
        hashMap.put("stopLiveStreamStringResId", Integer.valueOf(R.string.aa));
        hashMap.put("pauseStringResId", Integer.valueOf(R.string.a2));
        hashMap.put("playStringResId", Integer.valueOf(R.string.a3));
        hashMap.put("skipNextStringResId", Integer.valueOf(R.string.a8));
        hashMap.put("skipPrevStringResId", Integer.valueOf(R.string.a9));
        hashMap.put("forwardStringResId", Integer.valueOf(R.string.q));
        hashMap.put("forward10StringResId", Integer.valueOf(R.string.r));
        hashMap.put("forward30StringResId", Integer.valueOf(R.string.s));
        hashMap.put("rewindStringResId", Integer.valueOf(R.string.a4));
        hashMap.put("rewind10StringResId", Integer.valueOf(R.string.a5));
        hashMap.put("rewind30StringResId", Integer.valueOf(R.string.a6));
        hashMap.put("disconnectStringResId", Integer.valueOf(R.string.g));
        LIZ = Collections.unmodifiableMap(hashMap);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.get(str);
    }
}

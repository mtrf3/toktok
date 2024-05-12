package com.ss.ttlivestreamer.livestreamv2;

import android.text.TextUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveStreamBpsFpsUpdater {
    public final WeakReference<LiveStreamBuilder> builderWeak;
    public final HashMap<String, int[]> bitrateRangeMap = new HashMap<>();
    public final HashMap<String, Float> bitrateRatioMap = new HashMap<>();
    public final HashMap<String, Integer> fpsMap = new HashMap<>();
    public final HashMap<String, Integer> fpsForEncodeMap = new HashMap<>();

    public synchronized int getFpsForEncode() {
        int i;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        i = 0;
        int i2 = Integer.MAX_VALUE;
        boolean z = false;
        for (String str2 : this.fpsForEncodeMap.keySet()) {
            if (!str2.equals("lastFpsForEncode")) {
                Integer num = this.fpsForEncodeMap.get(str2);
                if (num != null && num.intValue() < i2) {
                    i2 = num.intValue();
                    str = str2;
                    z = true;
                }
                try {
                    jSONObject.put(str2, num);
                } catch (Exception unused) {
                }
            }
        }
        if (z) {
            i = i2;
        }
        try {
            jSONObject.put("selected", str);
        } catch (Exception unused2) {
        }
        Integer num2 = this.fpsForEncodeMap.get("lastFpsForEncode");
        if (num2 == null || num2.intValue() != i) {
            AVLog.iow("getFpsForEncode", jSONObject.toString());
            this.fpsForEncodeMap.put("lastFpsForEncode", Integer.valueOf(i));
        }
        return i;
    }

    public synchronized int getFpsForUpdate() {
        JSONObject optJSONObject;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        int i = Integer.MAX_VALUE;
        boolean z = false;
        for (String str2 : this.fpsMap.keySet()) {
            Integer num = this.fpsMap.get(str2);
            if (num != null && num.intValue() < i) {
                i = num.intValue();
                str = str2;
                z = true;
            }
            try {
                jSONObject.put(str2, num);
            } catch (Exception unused) {
            }
        }
        LiveStreamBuilder liveStreamBuilder = this.builderWeak.get();
        if (!z && liveStreamBuilder != null && liveStreamBuilder.getSdkParams() != null && (optJSONObject = liveStreamBuilder.getSdkParams().optJSONObject("PushBase")) != null && optJSONObject.has("fps")) {
            i = optJSONObject.optInt("fps");
            if (i > 0) {
                str = "sdkParams";
                z = true;
            }
            try {
                jSONObject.put("sdkParams", i);
            } catch (Exception unused2) {
            }
        }
        try {
            jSONObject.put("selected", str);
        } catch (Exception unused3) {
        }
        if (z && liveStreamBuilder.getPushBase().fps != i) {
            AVLog.iow("getFpsForUpdate", jSONObject.toString());
            return i;
        }
        return -1;
    }

    public synchronized int[] getBitrateRangeForUpdate() {
        JSONObject jSONObject;
        int i;
        String str = "";
        JSONObject jSONObject2 = new JSONObject();
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        boolean z = false;
        for (String str2 : this.bitrateRangeMap.keySet()) {
            int[] iArr = this.bitrateRangeMap.get(str2);
            if (iArr != null && iArr.length >= 3 && ((i = iArr[2]) < i2 || ((i == i2 && iArr[1] < i3) || (i == i2 && iArr[1] == i3 && iArr[0] < i4)))) {
                i4 = iArr[0];
                i3 = iArr[1];
                if (i4 > 0 && i3 > 0 && i > 0) {
                    str = str2;
                    z = true;
                }
                try {
                    jSONObject2.put(str2, new JSONArray().put(i4).put(i3).put(i));
                } catch (Exception unused) {
                }
                i2 = i;
            }
        }
        LiveStreamBuilder liveStreamBuilder = this.builderWeak.get();
        if (!z && liveStreamBuilder != null) {
            if (liveStreamBuilder.getSdkParams() != null) {
                jSONObject = liveStreamBuilder.getSdkParams().optJSONObject("PushBase");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.has("defaultBitrate") && jSONObject.has("minBitrate") && jSONObject.has("maxBitrate")) {
                i4 = jSONObject.optInt("defaultBitrate");
                i3 = jSONObject.optInt("minBitrate");
                i2 = jSONObject.optInt("maxBitrate");
                if (i4 > 0 && i3 > 0 && i2 > 0) {
                    str = "sdkParams";
                    z = true;
                }
                try {
                    jSONObject2.put("sdkParams", new JSONArray().put(i4).put(i3).put(i2));
                } catch (Exception unused2) {
                }
            }
        }
        try {
            jSONObject2.put("selected", str);
        } catch (Exception unused3) {
        }
        if (!z || liveStreamBuilder == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.bitrateRatioMap.keySet().iterator();
        float f = 1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Float f2 = this.bitrateRatioMap.get(next);
            if (f2 != null && f2.floatValue() > 1.0E-7f) {
                f *= f2.floatValue();
                try {
                    jSONArray.put(new JSONObject().put(next, f2));
                } catch (Exception unused4) {
                }
            }
        }
        int round = Math.round(i4 * f);
        int round2 = Math.round(i3 * f);
        int round3 = Math.round(i2 * f);
        int min = Math.min(Math.max(round, round2), round3);
        if (liveStreamBuilder.getPushBase().defaultBitrate == min && liveStreamBuilder.getPushBase().minBitrate == round2 && liveStreamBuilder.getPushBase().maxBitrate == round3) {
            return null;
        }
        try {
            AVLog.iow("getBitrateRangeForUpdate", new JSONObject().put("result", new JSONArray().put(min).put(round2).put(round3)).put("range", jSONObject2).put("ratios", jSONArray).toString());
        } catch (Exception unused5) {
        }
        return new int[]{min, round2, round3};
    }

    public LiveStreamBpsFpsUpdater(LiveStreamBuilder liveStreamBuilder) {
        this.builderWeak = new WeakReference<>(liveStreamBuilder);
    }

    public synchronized void calculateBitrateRatio(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Float f2 = this.bitrateRatioMap.get(str);
        if (f <= Float.MIN_NORMAL) {
            if (f2 != null) {
                this.bitrateRatioMap.remove(str);
            }
        } else if (f2 == null || Math.abs(f2.floatValue() - f) > 1.0E-7f) {
            this.bitrateRatioMap.put(str, Float.valueOf(f));
        }
    }

    public synchronized void calculateFpsForEncode(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Integer num = this.fpsForEncodeMap.get(str);
        if (i <= 0) {
            if (num != null) {
                this.fpsForEncodeMap.remove(str);
            }
        } else if (num == null || num.intValue() != i) {
            this.fpsForEncodeMap.put(str, Integer.valueOf(i));
        }
    }

    public synchronized void calculateFrameRate(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Integer num = this.fpsMap.get(str);
        if (i <= 0) {
            if (num != null) {
                this.fpsMap.remove(str);
            }
        } else if (num == null || num.intValue() != i) {
            this.fpsMap.put(str, Integer.valueOf(i));
        }
    }

    public synchronized void calculateBitrateRange(int i, int i2, int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int[] iArr = this.bitrateRangeMap.get(str);
        if (i <= 0 || i2 <= 0 || i3 <= 0) {
            if (iArr != null) {
                this.bitrateRangeMap.remove(str);
            }
        } else if (iArr == null || iArr.length < 3 || iArr[0] != i || iArr[1] != i2 || iArr[2] != i3) {
            this.bitrateRangeMap.put(str, new int[]{i, i2, i3});
        }
    }
}

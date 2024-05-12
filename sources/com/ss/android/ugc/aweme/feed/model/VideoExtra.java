package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class VideoExtra implements Serializable {
    public String format;
    public int realBitrate;

    public VideoExtra() {
    }

    public String getFormat() {
        return this.format;
    }

    public int getRealBitrate() {
        return this.realBitrate;
    }

    public VideoExtra(JSONObject jSONObject) {
        this.realBitrate = jSONObject.optInt("real_bitrate");
        this.format = jSONObject.optString("format");
    }

    public static VideoExtra from(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new VideoExtra(new JSONObject(str));
            }
        } catch (Throwable unused) {
        }
        return new VideoExtra();
    }
}

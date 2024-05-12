package com.bytedance.android.livesdk.config;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveStreamTestConfig {

    @InterfaceC65349Pkn("enable")
    public boolean mEnable;

    @InterfaceC65349Pkn("with")
    public int mWidth = -1;

    @InterfaceC65349Pkn("height")
    public int mHeight = -1;

    @InterfaceC65349Pkn("defaultbBitRate")
    public int mDefaultBitrate = -1;

    @InterfaceC65349Pkn("minBitRate")
    public int mMinBitrate = -1;

    @InterfaceC65349Pkn("maxBitRate")
    public int mMaxBitrate = -1;

    @InterfaceC65349Pkn("fps")
    public int mFps = -1;

    @InterfaceC65349Pkn("vCode")
    public String mVCodec = "";

    @InterfaceC65349Pkn("useHardware")
    public boolean mUseHardware = true;

    @InterfaceC65349Pkn("mixMaxBitRate")
    public int mMixMaxBitrate = -1;

    @InterfaceC65349Pkn("mixDefaultBitRate")
    public int mMixDefaultBitrate = -1;

    @InterfaceC65349Pkn("minMinBitRate")
    public int mMixMinBitrate = -1;

    public Map<String, String> getStringMap() {
        HashMap hashMap = new HashMap();
        if (!this.mEnable) {
            return hashMap;
        }
        try {
            int i = this.mWidth;
            if (i > 0) {
                hashMap.put("width", String.valueOf(i));
            }
            int i2 = this.mHeight;
            if (i2 > 0) {
                hashMap.put("height", String.valueOf(i2));
            }
            int i3 = this.mDefaultBitrate;
            if (i3 > 0) {
                hashMap.put("defaultBitrate", String.valueOf(i3));
            }
            int i4 = this.mMinBitrate;
            if (i4 > 0) {
                hashMap.put("minBitrate", String.valueOf(i4));
            }
            int i5 = this.mMaxBitrate;
            if (i5 > 0) {
                hashMap.put("maxBitrate", String.valueOf(i5));
            }
            int i6 = this.mFps;
            if (i6 > 0) {
                hashMap.put("fps", String.valueOf(i6));
            }
            if (!TextUtils.isEmpty(this.mVCodec)) {
                hashMap.put("vCodec", this.mVCodec);
            }
            hashMap.put("useHardware", String.valueOf(this.mUseHardware));
            int i7 = this.mMixMaxBitrate;
            if (i7 > 0) {
                hashMap.put("mixMaxBitrate", String.valueOf(i7));
            }
            int i8 = this.mMixDefaultBitrate;
            if (i8 > 0) {
                hashMap.put("mixDefaultBitrate", String.valueOf(i8));
            }
            int i9 = this.mMixMinBitrate;
            if (i9 > 0) {
                hashMap.put("mixMinBitrate", String.valueOf(i9));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return hashMap;
    }
}

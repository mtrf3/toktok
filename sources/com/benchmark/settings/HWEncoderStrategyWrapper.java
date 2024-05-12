package com.benchmark.settings;

import X.C89989ZTl;
import com.benchmark.ByteBenchBundle;
import com.benchmark.mediacodec.TEMediaCodecEncodeSettings;

/* loaded from: classes19.dex */
public class HWEncoderStrategyWrapper {
    public long mStrategyHandle;

    private native TEMediaCodecEncodeSettings native_getSetting(long j, TEMediaCodecEncodeSettings tEMediaCodecEncodeSettings);

    private native String native_getVideoOutputPath(long j);

    private native String native_getYUVPath(long j);

    private native void native_update(long j, long j2);

    public TEMediaCodecEncodeSettings getSettings() {
        return native_getSetting(this.mStrategyHandle, new TEMediaCodecEncodeSettings());
    }

    public String getVideoOutputPath() {
        return native_getVideoOutputPath(this.mStrategyHandle);
    }

    public String getYUVPath() {
        return native_getYUVPath(this.mStrategyHandle);
    }

    public HWEncoderStrategyWrapper(long j) {
        this.mStrategyHandle = j;
    }

    public void update(C89989ZTl c89989ZTl, C89989ZTl c89989ZTl2, int i) {
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        byte[] bArr = c89989ZTl.LIZIZ;
        if (bArr != null) {
            obtain.setInt("encode_frame_size", bArr.length);
        } else {
            obtain.setInt("encode_frame_size", 0);
        }
        obtain.setLong("pts", c89989ZTl.LIZLLL);
        obtain.setBool("key_frame", c89989ZTl.LJFF);
        obtain.setBool("end_frame", c89989ZTl.LJI);
        native_update(this.mStrategyHandle, obtain.getHandle());
        obtain.recycle();
    }
}

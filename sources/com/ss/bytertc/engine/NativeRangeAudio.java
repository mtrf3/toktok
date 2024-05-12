package com.ss.bytertc.engine;

import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.ReceiveRange;
import com.ss.bytertc.engine.type.AttenuationType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;

/* loaded from: classes33.dex */
public class NativeRangeAudio implements IRangeAudio {
    public long mNaiveInstance;

    public static native void nativeEnableRangeAudio(long j, boolean z);

    public static native int nativeSetAttenuationType(long j, int i, float f);

    public static native void nativeSetNoAttenuationFlags(long j, String[] strArr);

    public static native int nativeUpdatePosition(long j, float f, float f2, float f3);

    public static native int nativeUpdateReceiveRange(long j, int i, int i2);

    public NativeRangeAudio(long j) {
        this.mNaiveInstance = j;
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public void enableRangeAudio(boolean z) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeRangeAudio", "native RangeAudio is invalid, enableRangeAudio failed.");
        } else {
            nativeEnableRangeAudio(j, z);
        }
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public void setNoAttenuationFlags(List<String> list) {
        if (this.mNaiveInstance == 0) {
            LogUtil.e("NativeRangeAudio", "native range audio is invalid, setNoAttenuationFlags failed.");
            return;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        nativeSetNoAttenuationFlags(this.mNaiveInstance, strArr);
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int updatePosition(Position position) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeRangeAudio", "native RangeAudio is invalid, updatePosition failed.");
            return -1;
        }
        return nativeUpdatePosition(j, position.x, position.y, position.z);
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int updateReceiveRange(ReceiveRange receiveRange) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeRangeAudio", "native RangeAudio is invalid, updateReceiveRange failed.");
            return -1;
        }
        return nativeUpdateReceiveRange(j, receiveRange.min, receiveRange.max);
    }

    @Override // com.ss.bytertc.engine.audio.IRangeAudio
    public int setAttenuationModel(AttenuationType attenuationType, float f) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativeRangeAudio", "native range audio is invalid, setAttenuationModel failed.");
            return -1;
        }
        return nativeSetAttenuationType(j, attenuationType.value(), f);
    }
}

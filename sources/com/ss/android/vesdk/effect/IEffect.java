package com.ss.android.vesdk.effect;

import X.C79380VDk;
import X.C83791WuZ;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.util.List;

/* loaded from: classes15.dex */
public interface IEffect {
    int addTrackAlgorithm(int i, int i2, VEBaseAlgorithmParam vEBaseAlgorithmParam, int i3, int i4);

    int addTrackFilter(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4);

    void enableEffectWithCameraFacing(boolean z, int i);

    C83791WuZ getEffectFilterTime(long j);

    void regBachAlgorithmCallback(List<C79380VDk> list);

    int removeTrackAlgorithm(int i);

    int removeTrackFilter(int i);

    void sendEffectMsg(int i, long j, long j2, byte[] bArr);

    void setARCoreParam(VEARCoreParam vEARCoreParam);

    <T> int setFilterParam(int i, String str, T t);

    void unregBachAlgorithmCallback();

    int updateTrackAlgorithmParam(int i, VEBaseAlgorithmParam vEBaseAlgorithmParam);

    int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);

    int updateTrackFilterTime(int i, int i2, int i3);
}

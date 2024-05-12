package X;

import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;

/* renamed from: X.HnY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45136HnY extends MusicRequestCallback {
    public final C45137HnZ LIZ = new C45137HnZ();
    public final long LIZIZ;
    public final MusicRequestCallback LIZJ;

    public C45136HnY(MusicRequestCallback musicRequestCallback, Object... objArr) {
        this.LIZJ = musicRequestCallback;
        this.LIZIZ = C45137HnZ.LIZIZ(objArr, musicRequestCallback, this);
    }

    @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
    public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZJ.onInfoCallBack(musicRequestCallbackInfoType, f, i, str, unorderedMapStrStr);
        if (musicRequestCallbackInfoType == null) {
            return;
        }
        int i2 = C45223Hox.LIZ[musicRequestCallbackInfoType.ordinal()];
        if (i2 != 1 && i2 != 2) {
            return;
        }
        C45137HnZ c45137HnZ = this.LIZ;
        long j = this.LIZIZ;
        c45137HnZ.getClass();
        C45137HnZ.LIZ(j);
    }
}

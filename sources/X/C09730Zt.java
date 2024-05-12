package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;

/* renamed from: X.0Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09730Zt {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GamePreparationLiveQualityItem(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", desc=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sdkKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", suggested=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C09730Zt(PushStreamInfo.Quality quality) {
        String str = quality.name;
        String str2 = quality.desc;
        String str3 = quality.sdkKey;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}

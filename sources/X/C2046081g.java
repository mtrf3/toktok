package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.81g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2046081g {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2046081g)) {
            return false;
        }
        C2046081g c2046081g = (C2046081g) obj;
        return o.LJ(this.LIZ, c2046081g.LIZ) && o.LJ(this.LIZIZ, c2046081g.LIZIZ) && this.LIZJ == c2046081g.LIZJ && o.LJ(this.LIZLLL, c2046081g.LIZLLL) && this.LJ == c2046081g.LJ && o.LJ(this.LJFF, c2046081g.LJFF) && this.LJI == c2046081g.LJI && this.LJII == c2046081g.LJII && o.LJ(this.LJIIIIZZ, c2046081g.LJIIIIZZ);
    }

    public final int hashCode() {
        return this.LJIIIIZZ.hashCode() + ((((C79062V1e.LJ(this.LJFF, (C79062V1e.LJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31, 31) + this.LJ) * 31, 31) + this.LJI) * 31) + this.LJII) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiBitRateEtParams(resolutionListStr=");
        LIZ.append(this.LIZ);
        LIZ.append(", imageSizeListStr=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", useMultiBitrateCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", ladderErrCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", skippedImageCnt=");
        LIZ.append(this.LJ);
        LIZ.append(", playLadderNameList=");
        LIZ.append(this.LJFF);
        LIZ.append(", imageFirstFrameDuration=");
        LIZ.append(this.LJI);
        LIZ.append(", imageFirstFrameRendered=");
        LIZ.append(this.LJII);
        LIZ.append(", scene=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C2046081g(int i, int i2, int i3, int i4, String resolutionListStr, String imageSizeListStr, String ladderErrCode, String playLadderNameList, String scene) {
        o.LJIIIZ(resolutionListStr, "resolutionListStr");
        o.LJIIIZ(imageSizeListStr, "imageSizeListStr");
        o.LJIIIZ(ladderErrCode, "ladderErrCode");
        o.LJIIIZ(playLadderNameList, "playLadderNameList");
        o.LJIIIZ(scene, "scene");
        this.LIZ = resolutionListStr;
        this.LIZIZ = imageSizeListStr;
        this.LIZJ = i;
        this.LIZLLL = ladderErrCode;
        this.LJ = i2;
        this.LJFF = playLadderNameList;
        this.LJI = i3;
        this.LJII = i4;
        this.LJIIIIZZ = scene;
    }
}

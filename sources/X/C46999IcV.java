package X;

/* renamed from: X.IcV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46999IcV {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = 5;
    public int LJ = 3;
    public int LJFF = 1;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaySessionConfig{singleThreadMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", enableSessionPool=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enableSameCodecSessionReuse=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableSingleReuseFor264=");
        LIZ.append(this.LJII);
        LIZ.append(", enableMtkByteVC1Reuse=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", maxPoolSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", corePoolSize=");
        LIZ.append(this.LJ);
        LIZ.append(", sessionPoolSize=");
        LIZ.append(this.LJFF);
        LIZ.append(", enablePrerenderSessionReuse=");
        C76965UIn.LIZJ(LIZ, this.LJI, ", enablePrerenderSessionReuse4Dash=", true, ", enableReuseForAudioOnly=");
        LIZ.append(false);
        LIZ.append(", enableSessionReuseRefactor=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", disableReuseFor264=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", maxMismatchCnt=");
        LIZ.append(this.LJIIL);
        LIZ.append(", enableSessionPoolAdjustMethod=");
        return C48339Iy7.LIZJ(LIZ, this.LJIILIIL, '}', LIZ);
    }
}

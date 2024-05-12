package X;

/* renamed from: X.0AC, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AC {
    public int LIZIZ;
    public int LIZJ;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public int LIZ = -1;
    public int LIZLLL = 1;

    public final int LIZIZ() {
        if (this.LJI) {
            return this.LIZIZ - this.LIZJ;
        }
        return this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("State{mTargetPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", mData=");
        LIZ.append((Object) null);
        LIZ.append(", mItemCount=");
        LIZ.append(this.LJ);
        LIZ.append(", mIsMeasuring=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mPreviousLayoutItemCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mStructureChanged=");
        LIZ.append(this.LJFF);
        LIZ.append(", mInPreLayout=");
        LIZ.append(this.LJI);
        LIZ.append(", mRunSimpleAnimations=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mRunPredictiveAnimations=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIJ, '}', LIZ);
    }

    public final void LIZ(int i) {
        if ((this.LIZLLL & i) != 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Layout state should be one of ");
        LIZ.append(Integer.toBinaryString(i));
        LIZ.append(" but it is ");
        LIZ.append(Integer.toBinaryString(this.LIZLLL));
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}

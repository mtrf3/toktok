package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class JGR implements NIY {
    public final /* synthetic */ JGI LIZ;

    @Override // X.NIY
    public final Boolean LIZ() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            return mSearchAdViewCallBack.LIZ();
        }
        return null;
    }

    @Override // X.NIY
    public final void LIZIZ() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            mSearchAdViewCallBack.LIZIZ();
        }
    }

    @Override // X.NIY
    public final void LIZJ() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            mSearchAdViewCallBack.LIZJ();
        }
    }

    @Override // X.NIY
    public final void LIZLLL() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            mSearchAdViewCallBack.LIZLLL();
        }
    }

    @Override // X.NIY
    public final View LJ() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            return mSearchAdViewCallBack.LJ();
        }
        return null;
    }

    @Override // X.NIY
    public final void LJFF() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            mSearchAdViewCallBack.LJFF();
        }
    }

    @Override // X.NIY
    public final void LJLLJ() {
        JGS mSearchAdViewCallBack = this.LIZ.getMSearchAdViewCallBack();
        if (mSearchAdViewCallBack != null) {
            mSearchAdViewCallBack.LJLLJ();
        }
    }

    @Override // X.NIY
    public final int getCurrentPosition() {
        return (int) this.LIZ.getMPlayVideoHelper().LIZLLL();
    }

    @Override // X.NIY
    public final boolean LJJJJLL() {
        return J1C.LIZIZ();
    }

    public JGR(JGI jgi) {
        this.LIZ = jgi;
    }
}

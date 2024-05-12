package X;

import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;

/* loaded from: classes15.dex */
public final class VZB implements VZG {
    public boolean LIZ;
    public final /* synthetic */ VZ9 LIZIZ;
    public final /* synthetic */ XSwiperUI LIZJ;

    @Override // X.VZG
    public final void LIZLLL(int i) {
        XSwiperUI xSwiperUI = this.LIZJ;
        if (xSwiperUI.LJLJJI) {
            C49615Jdb c49615Jdb = new C49615Jdb(xSwiperUI.getSign(), "scrollend");
            c49615Jdb.LIZJ(Integer.valueOf(i), "current");
            VNU vnu = this.LIZJ.mContext;
            if (vnu != null) {
                vnu.LJLJJL.LIZIZ(c49615Jdb);
            }
        }
    }

    @Override // X.VZG
    public final void onPageScrollStateChanged(int i) {
        XSwiperUI xSwiperUI = this.LIZJ;
        if (xSwiperUI.LJLLL) {
            if (i == 1) {
                this.LIZ = true;
                xSwiperUI.LLI.removeCallbacks(xSwiperUI.LLII);
            } else {
                if (!this.LIZ) {
                    return;
                }
                this.LIZ = false;
                xSwiperUI.LLI.removeCallbacks(xSwiperUI.LLII);
                XSwiperUI xSwiperUI2 = this.LIZJ;
                xSwiperUI2.LLI.postDelayed(xSwiperUI2.LLII, xSwiperUI2.LJLZ);
            }
        }
    }

    public VZB(XSwiperUI xSwiperUI, VZ9 vz9) {
        this.LIZJ = xSwiperUI;
        this.LIZIZ = vz9;
    }

    @Override // X.VZG
    public final void LIZ(boolean z, boolean z2) {
        XSwiperUI xSwiperUI = this.LIZJ;
        if (xSwiperUI.LJLJJLL) {
            C49615Jdb c49615Jdb = new C49615Jdb(xSwiperUI.getSign(), "scrolltobounce");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "isToBegin");
            c49615Jdb.LIZJ(Boolean.valueOf(z2), "isToEnd");
            VNU vnu = this.LIZJ.mContext;
            if (vnu != null) {
                vnu.LJLJJL.LIZIZ(c49615Jdb);
            }
        }
    }

    @Override // X.VZG
    public final void LIZJ(int i, boolean z) {
        XSwiperUI xSwiperUI = this.LIZJ;
        if (xSwiperUI.LJLJI) {
            C49615Jdb c49615Jdb = new C49615Jdb(xSwiperUI.getSign(), "scrollstart");
            c49615Jdb.LIZJ(Integer.valueOf(i), "current");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "isDragged");
            VNU vnu = this.LIZJ.mContext;
            if (vnu != null) {
                vnu.LJLJJL.LIZIZ(c49615Jdb);
            }
        }
    }

    @Override // X.VZG
    public final void LJ(int i, boolean z) {
        ((VZ9) this.LIZJ.mView).setSelected(i);
        XSwiperUI xSwiperUI = this.LIZJ;
        if (xSwiperUI.LJLILLLLZI && !z) {
            C49615Jdb c49615Jdb = new C49615Jdb(xSwiperUI.getSign(), "change");
            c49615Jdb.LIZJ(Integer.valueOf(i), "current");
            VNU vnu = this.LIZJ.mContext;
            if (vnu != null) {
                vnu.LJLJJL.LIZIZ(c49615Jdb);
            }
        }
    }

    @Override // X.VZG
    public final void LIZIZ(float f, float f2, boolean z) {
        this.LIZJ.recognizeGesturere();
        if (this.LIZJ.LJLJJL) {
            long currentTimeMillis = System.currentTimeMillis();
            XSwiperUI xSwiperUI = this.LIZJ;
            long j = currentTimeMillis - xSwiperUI.LJZL;
            int i = xSwiperUI.LJZI;
            if (i > 0 && j <= i) {
                return;
            }
            xSwiperUI.LJZL = currentTimeMillis;
            C49615Jdb c49615Jdb = new C49615Jdb(xSwiperUI.getSign(), "transition");
            c49615Jdb.LIZJ(Integer.valueOf(this.LIZIZ.getViewPager().getCurrentIndex()), "current");
            c49615Jdb.LIZJ(Boolean.valueOf(z), "isDragged");
            c49615Jdb.LIZJ(Float.valueOf(V9Y.LIZIZ(f)), "dx");
            c49615Jdb.LIZJ(Float.valueOf(V9Y.LIZIZ(f2)), "dy");
            VNU vnu = this.LIZJ.mContext;
            if (vnu != null) {
                vnu.LJLJJL.LIZIZ(c49615Jdb);
            }
        }
    }
}

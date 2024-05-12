package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;

/* loaded from: classes15.dex */
public final class VUD implements VUP {
    public C0FT LIZ;
    public final /* synthetic */ VUG LIZIZ;
    public final /* synthetic */ UIScrollView LIZJ;

    @Override // X.VUP
    public final void LIZIZ() {
        if (this.LIZ == null) {
            UIScrollView uIScrollView = this.LIZJ;
            this.LIZ = new C0FT(uIScrollView.mContext, uIScrollView.mScrollMonitorTag);
        }
        C0FS.LIZIZ(this.LIZ.LIZ);
        UIScrollView uIScrollView2 = this.LIZJ;
        if (uIScrollView2.LJLJLLL) {
            uIScrollView2.LJJIIJ();
        }
        UIScrollView uIScrollView3 = this.LIZJ;
        if (uIScrollView3.LJLJJL) {
            uIScrollView3.LJJIIZI(uIScrollView3.getScrollX(), this.LIZJ.getScrollY(), this.LIZJ.getScrollX(), this.LIZJ.getScrollY(), "scrollstart");
        }
        UIScrollView uIScrollView4 = this.LIZJ;
        if (uIScrollView4.mEnableScrollMonitor) {
            uIScrollView4.mContext.LJLLL.LJJII(new C60877Nur(this.LIZIZ, uIScrollView4.getTagName(), this.LIZJ.mScrollMonitorTag));
        }
    }

    @Override // X.VUP
    public final void LIZJ() {
        VNV vnv;
        C0FT c0ft = this.LIZ;
        if (c0ft != null) {
            C0FS.LIZIZ(c0ft.LIZ);
        }
        UIScrollView uIScrollView = this.LIZJ;
        if (uIScrollView.LJLJJLL) {
            uIScrollView.LJJIIZI(uIScrollView.getScrollX(), this.LIZJ.getScrollY(), this.LIZJ.getScrollX(), this.LIZJ.getScrollY(), "scrollend");
        }
        UIScrollView uIScrollView2 = this.LIZJ;
        if (uIScrollView2.mEnableScrollMonitor && (vnv = uIScrollView2.mContext.LJLLL) != null) {
            vnv.LJJIII(new C60877Nur(this.LIZIZ, uIScrollView2.getTagName(), this.LIZJ.mScrollMonitorTag));
        }
    }

    @Override // X.VUP
    public final void LIZLLL() {
        UIScrollView uIScrollView = this.LIZJ;
        T t = uIScrollView.mView;
        if (t != 0 && uIScrollView.mEnableScrollMonitor) {
            uIScrollView.mContext.LJLLL.LJIIIIZZ(new C60877Nur(t, uIScrollView.getTagName(), this.LIZJ.mScrollMonitorTag));
        }
    }

    @Override // X.VUP
    public final void LIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScrollStateChanged: ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxUIScrollView", X1D.LIZIZ(LIZ));
        this.LIZJ.LJJIIJZLJL(i);
    }

    public VUD(UIScrollView uIScrollView, VUG vug) {
        this.LIZJ = uIScrollView;
        this.LIZIZ = vug;
    }

    @Override // X.VUP
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        UIScrollView uIScrollView = this.LIZJ;
        if (uIScrollView.LJLJLLL) {
            uIScrollView.LJJIIJ();
        }
        UIScrollView uIScrollView2 = this.LIZJ;
        if (uIScrollView2.LJLJJI) {
            uIScrollView2.LJJIIZI(i, i2, i3, i4, "scroll");
        }
        UIScrollView uIScrollView3 = this.LIZJ;
        if (uIScrollView3.LJLJI || uIScrollView3.LJLILLLLZI) {
            int LJJIJ = uIScrollView3.LJJIJ(i, i2);
            UIScrollView uIScrollView4 = this.LIZJ;
            if (!uIScrollView4.LJLJI || (LJJIJ & 2) == 0 || (uIScrollView4.LJLLL & 2) != 0) {
                if (uIScrollView4.LJLILLLLZI && (LJJIJ & 1) != 0 && (uIScrollView4.LJLLL & 1) == 0) {
                    uIScrollView4.LJJIIZI(uIScrollView4.getScrollX(), this.LIZJ.getScrollY(), this.LIZJ.getScrollX(), this.LIZJ.getScrollY(), "scrolltoupper");
                }
            } else {
                uIScrollView4.LJJIIZI(uIScrollView4.getScrollX(), this.LIZJ.getScrollY(), this.LIZJ.getScrollX(), this.LIZJ.getScrollY(), "scrolltolower");
            }
            this.LIZJ.LJLLL = LJJIJ;
        }
    }
}

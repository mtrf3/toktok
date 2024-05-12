package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.LynxSearchList;

/* renamed from: X.VUf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79817VUf extends C0A6 {
    public final VNL LJLIL;
    public final RecyclerView LJLILLLLZI;
    public long LJLJJLL;
    public final LynxSearchList LJLJL;
    public int LJLJLJ;
    public final int LJLJI = 200;
    public final int LJLJJI = 50;
    public final int LJLJJL = 50;
    public int LJLJLLL = 1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        this.LJLJL.recognizeGesturere();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LynxSearchList lynxSearchList = this.LJLJL;
                if (lynxSearchList.mEnableScrollMonitor) {
                    lynxSearchList.mContext.LJLLL.LJIIIIZZ(new C60877Nur(recyclerView, lynxSearchList.getTagName(), this.LJLJL.mScrollMonitorTag));
                }
                this.LJLJL.notifyScrollStateChanged(2);
                return;
            }
            LynxSearchList lynxSearchList2 = this.LJLJL;
            if (lynxSearchList2.mEnableScrollMonitor) {
                lynxSearchList2.mContext.LJLLL.LJJII(new C60877Nur(recyclerView, lynxSearchList2.getTagName(), this.LJLJL.mScrollMonitorTag));
            }
            this.LJLJL.notifyScrollStateChanged(1);
            return;
        }
        LynxSearchList lynxSearchList3 = this.LJLJL;
        if (lynxSearchList3.mEnableScrollMonitor) {
            lynxSearchList3.mContext.LJLLL.LJJIII(new C60877Nur(recyclerView, lynxSearchList3.getTagName(), this.LJLJL.mScrollMonitorTag));
        }
        this.LJLJL.notifyScrollStateChanged(0);
    }

    public C79817VUf(VNL vnl, RecyclerView recyclerView, LynxSearchList lynxSearchList) {
        this.LJLIL = vnl;
        this.LJLILLLLZI = recyclerView;
        recyclerView.LJIIJJI(this);
        this.LJLJL = lynxSearchList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(androidx.recyclerview.widget.RecyclerView r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79817VUf.LJIILL(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void LJIILLIIL(int i, String str, int i2, int i3, int i4) {
        if (0 != 0) {
            VUO vuo = new VUO(this.LJLJL.getSign(), str);
            vuo.LJ(i2, i3, i4, null);
            this.LJLIL.LIZIZ(vuo);
        }
    }
}

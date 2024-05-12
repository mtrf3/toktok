package X;

import android.view.View;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;

/* loaded from: classes10.dex */
public final class LZL implements C0C3 {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ EdgeSlideGuideAssem LJLJI;

    public LZL(EdgeSlideGuideAssem edgeSlideGuideAssem) {
        this.LJLJI = edgeSlideGuideAssem;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        LZN lzn;
        ActivityC45651qj LIZ;
        this.LJLIL = this.LJLILLLLZI;
        this.LJLILLLLZI = i;
        EdgeSlideGuideAssem edgeSlideGuideAssem = this.LJLJI;
        edgeSlideGuideAssem.LLFFF = false;
        if (edgeSlideGuideAssem.LJZL == -1 && (LIZ = C212428Vi.LIZ(edgeSlideGuideAssem)) != null) {
            this.LJLJI.LJZL = C84193Sd.LIZ(LIZ).LJLIL.getValue().intValue();
        }
        EdgeSlideGuideAssem edgeSlideGuideAssem2 = this.LJLJI;
        if (!edgeSlideGuideAssem2.L3(edgeSlideGuideAssem2.LJZL)) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                EdgeSlideGuideAssem edgeSlideGuideAssem3 = this.LJLJI;
                View containerView = edgeSlideGuideAssem3.getContainerView();
                if (containerView != null) {
                    C17N.LJJIIJZLJL(containerView);
                }
                TuxTextView tuxTextView = edgeSlideGuideAssem3.LJZ;
                if (tuxTextView == null) {
                    return;
                }
                C17N.LJJIIJZLJL(tuxTextView);
                return;
            }
            this.LJLJI.LLFFF = true;
            return;
        }
        EdgeSlideGuideAssem edgeSlideGuideAssem4 = this.LJLJI;
        View containerView2 = edgeSlideGuideAssem4.getContainerView();
        if (containerView2 != null) {
            C17N.LJJIIJZLJL(containerView2);
        }
        TuxTextView tuxTextView2 = edgeSlideGuideAssem4.LJZ;
        if (tuxTextView2 != null) {
            C17N.LJJIIJZLJL(tuxTextView2);
        }
        EdgeSlideGuideAssem edgeSlideGuideAssem5 = this.LJLJI;
        if (edgeSlideGuideAssem5.LLD && (lzn = edgeSlideGuideAssem5.LLIIIILZ) != null) {
            PopupManager.LJIIL(lzn);
        }
        this.LJLJI.LLF = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0083  */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r10) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZL.onPageSelected(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        if (r2.M3(r2.LL) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0127, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:
    
        if (r2.K3(r2.LL) != false) goto L72;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r13, float r14, int r15) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZL.onPageScrolled(int, float, int):void");
    }
}

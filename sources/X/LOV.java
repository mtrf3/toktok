package X;

import Y.AObjectS138S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOV implements InterfaceC54179LOd {
    public AObjectS138S0100000_9 LJLIL;
    public final /* synthetic */ LOS LJLILLLLZI;
    public final /* synthetic */ LOU LJLJI;

    @Override // X.InterfaceC54179LOd
    public final void LIZ() {
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZIZ(LOP tab) {
        TuxTextView tuxTextView;
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        TuxTextView tuxTextView2;
        o.LJIIIZ(tab, "tab");
        LOW tabAnimationHelper = this.LJLILLLLZI.getTabAnimationHelper();
        Object obj = null;
        if (tabAnimationHelper != null) {
            tabAnimationHelper.LIZIZ(tab);
        } else {
            LOX lox2 = tab.LIZLLL;
            int childCount = this.LJLJI.getChildCount();
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    View childAt = this.LJLJI.getChildAt(i);
                    if ((childAt instanceof LOX) && (mCustomTextView$homepage_common_release = (lox = (LOX) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release.getVisibility() == 0) {
                        TextView mCustomTextView$homepage_common_release2 = lox.getMCustomTextView$homepage_common_release();
                        if (mCustomTextView$homepage_common_release2 != null) {
                            mCustomTextView$homepage_common_release2.setAlpha(this.LJLJI.LLFFF);
                        }
                        if (C52307Kfv.LIZ()) {
                            TextView mCustomTextView$homepage_common_release3 = lox.getMCustomTextView$homepage_common_release();
                            if ((mCustomTextView$homepage_common_release3 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) mCustomTextView$homepage_common_release3) != null) {
                                LOS los = this.LJLILLLLZI;
                                if (los.LL == 17) {
                                    tuxTextView2.LJJIZ(17.0f, 22, C2059886o.LIZ(), 0.02f);
                                } else {
                                    tuxTextView2.setTuxFont(los.getUnSelectedTuxFont());
                                }
                            }
                        }
                    }
                    if (i == childCount) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (lox2 != null) {
                TextView mCustomTextView$homepage_common_release4 = lox2.getMCustomTextView$homepage_common_release();
                if (mCustomTextView$homepage_common_release4 != null) {
                    mCustomTextView$homepage_common_release4.setAlpha(1.0f);
                }
                if ((C52309Kfx.LIZ() || C52307Kfv.LIZ()) && (mCustomTextView$homepage_common_release4 instanceof TuxTextView) && (tuxTextView = (TuxTextView) mCustomTextView$homepage_common_release4) != null) {
                    LOS los2 = this.LJLILLLLZI;
                    if (los2.LL == 17) {
                        T5S t5s = new T5S();
                        t5s.LIZ(23);
                        tuxTextView.LJJIZ(17.0f, 22, t5s.getTypeface(), 0.02f);
                    } else {
                        tuxTextView.setTuxFont(los2.getSelectedTuxFont());
                    }
                }
                if (!this.LJLILLLLZI.getSwipeMode()) {
                    C8HI.LIZJ().LIZIZ(mCustomTextView$homepage_common_release4, "bold");
                }
            }
        }
        if (!this.LJLILLLLZI.getSwipeMode()) {
            if (C51645KOr.LIZIZ.LJIIIZ()) {
                Object obj2 = tab.LJ;
                if (obj2 instanceof String) {
                    obj = obj2;
                }
                if (o.LJ(obj, "MUSIC_DSP_XTAB")) {
                    this.LJLJI.LJIIJJI(tab, false);
                } else {
                    this.LJLJI.LJIIJ(tab, false);
                }
            } else {
                this.LJLJI.LJIIIZ(tab, false);
            }
        } else if (C51645KOr.LIZIZ.LJIIIZ()) {
            Object obj3 = tab.LJ;
            if (obj3 instanceof String) {
                obj = obj3;
            }
            if (o.LJ(obj, "MUSIC_DSP_XTAB")) {
                this.LJLJI.LJIIL(tab, false);
            }
        }
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        if (iMusicDspService.LJIIIZ()) {
            if (this.LJLIL == null) {
                this.LJLIL = new AObjectS138S0100000_9(this.LJLJI, 2);
            }
            AObjectS138S0100000_9 aObjectS138S0100000_9 = this.LJLIL;
            if (aObjectS138S0100000_9 != null) {
                iMusicDspService.LJIIL(aObjectS138S0100000_9);
            }
        }
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZJ(LOP lop) {
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        TuxTextView tuxTextView;
        LOW tabAnimationHelper = this.LJLILLLLZI.getTabAnimationHelper();
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        TextView textView = null;
        if (iMusicDspService.LJIIIZ()) {
            AObjectS138S0100000_9 aObjectS138S0100000_9 = this.LJLIL;
            if (aObjectS138S0100000_9 != null) {
                iMusicDspService.LJ(aObjectS138S0100000_9);
            }
            this.LJLIL = null;
        }
        if (!this.LJLILLLLZI.getSwipeMode()) {
            if (iMusicDspService.LJIIIZ()) {
                Object obj = lop.LJ;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                if (o.LJ(obj, "MUSIC_DSP_XTAB")) {
                    this.LJLJI.LJIIJJI(lop, true);
                } else {
                    this.LJLJI.LJIIJ(lop, true);
                }
            } else {
                this.LJLJI.LJIIIZ(lop, true);
            }
        } else if (iMusicDspService.LJIIIZ()) {
            Object obj2 = lop.LJ;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            if (o.LJ(obj2, "MUSIC_DSP_XTAB")) {
                this.LJLJI.LJIIL(lop, true);
            }
        }
        if (tabAnimationHelper != null) {
            tabAnimationHelper.LIZJ(lop);
        } else if (!this.LJLILLLLZI.getSwipeMode() && (lox = lop.LIZLLL) != null && (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) != null) {
            C8HI.LIZJ().LIZIZ(mCustomTextView$homepage_common_release, "medium");
        }
        if (this.LJLILLLLZI.LLIIZ) {
            LOX lox2 = lop.LIZLLL;
            if (lox2 != null) {
                textView = lox2.getMCustomTextView$homepage_common_release();
            }
            if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                LOS los = this.LJLILLLLZI;
                if (los.LL == 17) {
                    tuxTextView.LJJIZ(17.0f, 22, C2059886o.LIZ(), 0.02f);
                } else {
                    tuxTextView.setTuxFont(los.getUnSelectedTuxFont());
                }
            }
        }
    }

    public LOV(LOS los, LOU lou) {
        this.LJLILLLLZI = los;
        this.LJLJI = lou;
    }
}

package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.AqS25S0010000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONY implements OO2, C90T {
    public static int LLII;
    public Context LJLIL;
    public Aweme LJLILLLLZI;
    public View LJLJI;
    public OIN LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public SmartImageView LJLJL;
    public TuxTextView LJLJLJ;
    public RecyclerView LJLJLLL;
    public SY4 LJLL;
    public TuxIconView LJLLI;
    public ViewStub LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public OO3 LJLZ;
    public C61799ONf<Option> LJZ;
    public Option LJZL;
    public FeedSurvey LLD;
    public boolean LLFF;
    public long LLFFF;
    public boolean LLFII;
    public C61800ONg LLI;
    public int LJZI = -1;
    public OML LL = OML.FEED_TYPE;
    public final EnumC61784OMq LLF = EnumC61784OMq.BACKGROUND;
    public final ONJ LLFZ = new ONJ("background");
    public final ACListenerS30S0100000_10 LLIFFJFJJ = new ACListenerS30S0100000_10(this, 187);

    @Override // X.C90T
    public final void LIZIZ() {
    }

    @Override // X.C90T
    public final void LIZJ() {
        this.LJZI = -1;
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLLLL;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLLLLLL;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJLJJL;
        if (view5 != null) {
            view5.setVisibility(0);
            view5.setAlpha(1.0f);
        }
        this.LJZL = null;
        C61799ONf<Option> c61799ONf = this.LJZ;
        if (c61799ONf != null) {
            c61799ONf.LJLIL = -1;
            c61799ONf.notifyDataSetChanged();
        }
        C61800ONg LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJI();
        }
    }

    @Override // X.C90T
    public final void LJIIL() {
    }

    @Override // X.OO2
    public final void LIZ() {
        View view = this.LJLJJL;
        if (view != null) {
            C61799ONf<Option> c61799ONf = this.LJZ;
            if (c61799ONf != null) {
                c61799ONf.LJLIL = -1;
                c61799ONf.notifyDataSetChanged();
            }
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    @Override // X.OO8
    public final void LJ() {
        LJI(EnumC61773OMf.SWIPE, this.LJLILLLLZI);
    }

    @Override // X.OO8
    public final boolean LJFF() {
        boolean z;
        String str;
        if (OMS.LJ(this.LJLILLLLZI)) {
            HashSet<String> hashSet = OMS.LJFF;
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, hashSet)) {
                z = false;
                this.LLFZ.LJIIJ(new AqS25S0010000_10(z, 1));
                if (!z && C78685UuP.LJJJZ(ONN.LIZ(this.LJLILLLLZI))) {
                    return true;
                }
                return false;
            }
        }
        z = true;
        this.LLFZ.LJIIJ(new AqS25S0010000_10(z, 1));
        if (!z) {
        }
        return false;
    }

    @Override // X.C90T
    public final void LJII() {
        View view = this.LJLLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJLLLLLL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    public final C61815ONv LJIIIZ() {
        String aid;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            return C55016LiW.LIZ().LIZIZ(aid);
        }
        return null;
    }

    @Override // X.OO8
    public final void LJIILIIL() {
        String aid;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            OMS.LJFF.add(aid);
        }
        LJIIJJI();
    }

    public final C61800ONg LJIILJJIL() {
        if (this.LLI == null && this.LLFF) {
            this.LLI = new C61800ONg();
        }
        return this.LLI;
    }

    @Override // X.C90T
    public final boolean isShowing() {
        View view = this.LJLJI;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C90F
    public final void LJIIJJI() {
        String str;
        String str2;
        if (!isShowing()) {
            return;
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = this.LJLILLLLZI;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C61811ONr LIZ2 = LIZ.LIZ(str);
        C61779OMl.LJIIIIZZ(this.LL);
        if (LIZ2 != null) {
            if (LIZ2.LIZ) {
                return;
            }
        } else {
            LIZ2 = new C61811ONr();
        }
        LIZ2.LIZ = true;
        C61798ONe LIZ3 = C55016LiW.LIZ();
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ3.LIZLLL(str2, LIZ2);
        FeedSurvey feedSurvey = this.LLD;
        if (feedSurvey != null) {
            str3 = feedSurvey.getId();
        }
        C61779OMl.LJI(this.LJLILLLLZI, this.LL, str3);
    }

    public final void LJIIIIZZ(boolean z) {
        SY4 sy4 = this.LJLL;
        if (sy4 != null) {
            sy4.setEnabled(false);
            sy4.setClickable(false);
            sy4.setButtonVariant(2);
            sy4.setText(R.string.rx2);
            if (this.LLF == EnumC61784OMq.FORCE_VIDEO_NO_COVER) {
                sy4.setAlpha(0.4f);
            }
        }
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
        if (aweme == null) {
            return;
        }
        C61811ONr LIZ = C55016LiW.LIZ().LIZ(aweme.getAid());
        if (LIZ == null) {
            LIZ = new C61811ONr();
            C55016LiW.LIZ().LIZLLL(aweme.getAid(), LIZ);
        }
        View view = this.LJLJJL;
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLFF) {
                if (LIZ.LJIIIIZZ) {
                    return;
                }
                C61800ONg LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LJ(z);
                }
                if (!z) {
                    LIZ.LJIIIIZZ = true;
                    return;
                }
                return;
            }
            if (LIZ.LJII) {
                return;
            }
            C61779OMl.LIZ(aweme, z);
            if (!z) {
                LIZ.LJII = true;
                return;
            }
            return;
        }
        if (!C61780OMm.LJI || LIZ.LJII) {
            return;
        }
        C61779OMl.LIZ(aweme, z);
        if (!z) {
            LIZ.LJII = true;
        }
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        C61811ONr LIZ;
        Option[] optionArr;
        o.LJIIIZ(operation, "operation");
        if (aweme == null || (LIZ = C55016LiW.LIZ().LIZ(aweme.getAid())) == null || LIZ.LJI) {
            return;
        }
        View view = this.LJLJJL;
        if (view != null) {
            if (view.getVisibility() != 0 && this.LLFF && LIZ.LIZIZ) {
                C61800ONg LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LIZLLL(operation, !LIZ.LJ);
                }
                LIZ.LJ = true;
            } else if (LIZ.LIZ) {
                Option option = this.LJZL;
                if (option != null) {
                    optionArr = new Option[]{option};
                } else {
                    optionArr = null;
                }
                aweme.getAid();
                C61779OMl.LIZIZ(operation, optionArr, aweme, !LIZ.LIZLLL);
                LIZ.LIZLLL = true;
            }
        }
        C55016LiW.LIZ().LIZLLL(aweme.getAid(), LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    @Override // X.C90T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r16, android.content.Context r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, android.view.View r19, android.view.View r20, android.view.View r21, android.view.View r22, X.OO3 r23) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ONY.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, X.OO3):void");
    }
}

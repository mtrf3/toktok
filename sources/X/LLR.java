package X;

import Y.ACallableS36S1100000_9;
import Y.ACallableS7S1000000_9;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS52S0110000_9;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLR extends LLQ {
    public static final LLR LIZJ = new LLR();
    public static final List<String> LIZLLL = new ArrayList();
    public static final HashMap<String, Integer> LJ = new HashMap<>();
    public static boolean LJFF;
    public static C54102LLe LJI;
    public static C54105LLh LJII;
    public static C54134LMk LJIIIIZZ;
    public static final LLX LJIIIZ;
    public static LLQ LJIIJ;

    static {
        LFH.LIZIZ.LIZLLL().LJIIZILJ();
        LJIIIZ = LEZ.LIZ;
    }

    @Override // X.LLQ
    public final View LJIIJJI() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIJJI();
        }
        return null;
    }

    @Override // X.LLQ
    public final View LJIIL() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIL();
        }
        return null;
    }

    @Override // X.LLQ
    public final View LJIILIIL() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIILIIL();
        }
        return null;
    }

    @Override // X.LLQ
    public final CharSequence LJIILJJIL() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIILJJIL();
        }
        return null;
    }

    @Override // X.LLQ
    public final void LJIL() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJIL();
        }
    }

    @Override // X.LLQ
    public final void LJJII() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJII();
        }
    }

    @Override // X.LLQ
    public final void LJJIJIL() {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIJIL();
        }
    }

    @Override // X.LLQ
    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        Integer num;
        C54113LLp c54113LLp;
        View view = null;
        LJJJI(activityC45651qj, null);
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LIZJ(activityC45651qj);
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI != null) {
            LLQ llq2 = LJIIJ;
            OptValue LIZ = LLW.LIZ();
            if (LIZ == null || (num = LIZ.enableHomeTabDynamicText) == null || num.intValue() != 1) {
                return;
            }
            if (llq2 != null) {
                view = llq2.LJIIJ("HOME");
            }
            if (!(view instanceof C54113LLp) || (c54113LLp = (C54113LLp) view) == null) {
                return;
            }
            C54098LLa.LIZLLL = llq2;
            C54098LLa.LIZIZ = new WeakReference<>(c54113LLp);
            C54098LLa.LIZJ = c54113LLp.getIconData().LIZJ;
            HomeTabViewModel LIZ2 = HomeTabViewModel.LJLJLLL.LIZ(LJJIFFI);
            com.bytedance.hox.Hox LIZ3 = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI);
            for (InterfaceC54080LKi interfaceC54080LKi : ORZ.LLJI(LIZ2.pU())) {
                String tag = interfaceC54080LKi.tag();
                AqS62S1100000_9 aqS62S1100000_9 = new AqS62S1100000_9(interfaceC54080LKi, tag, 10);
                o.LJIIIZ(tag, "tag");
                LIZ3.hv0(tag, new LLU(aqS62S1100000_9));
            }
            LLV func = LLV.LJLIL;
            o.LJIIIZ(func, "func");
            LIZ3.hv0("HOME", new C53962LFu(func));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.LLQ
    public final void LIZLLL(boolean z) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LIZLLL(z);
        }
    }

    @Override // X.LLQ
    public final void LJI(boolean z) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJI(z);
        }
    }

    @Override // X.LLQ
    public final View LJIIIIZZ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIIIZZ(tag);
        }
        return null;
    }

    @Override // X.LLQ
    public final int LJIIIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIIZ(tag);
        }
        return 0;
    }

    @Override // X.LLQ
    public final View LJIIJ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIJ(tag);
        }
        return null;
    }

    @Override // X.LLQ
    public final void LJIILL(String tag) {
        o.LJIIIZ(tag, "tag");
        C10K.LIZIZ(new ACallableS7S1000000_9(tag, 1), C10K.LJIIIIZZ, null);
    }

    @Override // X.LLQ
    public final boolean LJIIZILJ(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            return llq.LJIIZILJ(tag);
        }
        return false;
    }

    @Override // X.LLQ
    public final void LJIJJ(String str) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJIJJ(str);
        }
    }

    @Override // X.LLQ
    public final void LJIJJLI(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJIJJLI(tag);
        }
    }

    @Override // X.LLQ
    public final void LJJ(String str) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJ(str);
        }
    }

    @Override // X.LLQ
    public final void LJJI(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJI(tag);
        }
    }

    @Override // X.LLQ
    public final void LJJIFFI(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIFFI(tag);
        }
    }

    @Override // X.LLQ
    public final void LJJIII(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIII(tag);
        }
    }

    @Override // X.LLQ
    public final void LJJIIJ(String str) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIIJ(str);
        }
    }

    @Override // X.LLQ
    public final void LJJIIJZLJL(float f) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIIJZLJL(f);
        }
    }

    @Override // X.LLQ
    public final void LJJIIZ(C55949LxZ c55949LxZ) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIIZ(c55949LxZ);
        }
    }

    @Override // X.LLQ
    public final void LJJIJIIJI(int i) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIJIIJI(i);
        }
    }

    @Override // X.LLQ
    public final void LJJIJIIJIL(String tag) {
        o.LJIIIZ(tag, "tag");
        C10K.LIZIZ(new ACallableS7S1000000_9(tag, 2), C10K.LJIIIIZZ, null);
    }

    @Override // X.LLQ
    public final void LJJIJL(String tag) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIJL(tag);
        }
    }

    @Override // X.LLQ
    public final void LJJJ(List<? extends InterfaceC54080LKi> list) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJJ(list);
        }
    }

    @Override // X.LLQ
    public final void LIZ(String tag, InterfaceC88472Yns<? super Context, ? extends View> viewCreateLogic) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(viewCreateLogic, "viewCreateLogic");
        C10K.LIZIZ(new ACallableS36S1100000_9(viewCreateLogic, tag, 6), C10K.LJIIIIZZ, null);
    }

    @Override // X.LLQ
    public final void LIZIZ(String tag, UrlModel urlModel) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LIZIZ(tag, urlModel);
        }
    }

    @Override // X.LLQ
    public final void LJ(int i, String tag) {
        o.LJIIIZ(tag, "tag");
        LJFF(i, tag, false);
    }

    @Override // X.LLQ
    public final void LJIJ(ActivityC45651qj activityC45651qj, Configuration newConfig) {
        LLQ llq;
        o.LJIIIZ(newConfig, "newConfig");
        if (LJJJI(activityC45651qj, newConfig) && (llq = LJIIJ) != null) {
            llq.LJIJI();
            llq.LJJIJ(LJFF, false);
            C10K.LIZIZ(LLS.LJLIL, C10K.LJIIIIZZ, null);
            for (Map.Entry<String, Integer> entry : LJ.entrySet()) {
                LIZJ.LJ(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    @Override // X.LLQ
    public final void LJJIJ(boolean z, boolean z2) {
        LJFF = z;
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIJ(z, z2);
        }
    }

    @Override // X.LLQ
    public final void LJJIJLIJ(String tag, C57568Mia c57568Mia) {
        o.LJIIIZ(tag, "tag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIJLIJ(tag, c57568Mia);
        }
    }

    @Override // X.LLQ
    public final void LJJIL(String str, L7P l7p) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIL(str, l7p);
        }
    }

    @Override // X.LLQ
    public final void LJJIZ(String tabTag, String str) {
        o.LJIIIZ(tabTag, "tabTag");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIZ(tabTag, str);
        }
    }

    public final boolean LJJJI(ActivityC45651qj activityC45651qj, Configuration configuration) {
        AbstractC225698tR value;
        LLQ llq;
        if (LJIIIIZZ == null) {
            return false;
        }
        AbstractC225698tR abstractC225698tR = this.LIZ;
        if (LJIIIZ.LIZIZ(activityC45651qj, configuration)) {
            value = C225708tS.LIZ;
        } else {
            value = C225688tQ.LIZ;
        }
        o.LJIIIZ(value, "value");
        if (!o.LJ(value, this.LIZ)) {
            this.LIZ = value;
            LFQ.LIZ(new AqS52S0110000_9(value, this.LIZIZ, 0));
        }
        AbstractC225698tR abstractC225698tR2 = this.LIZ;
        if (o.LJ(abstractC225698tR2, C225688tQ.LIZ)) {
            llq = LJII;
        } else if (o.LJ(abstractC225698tR2, C225708tS.LIZ)) {
            llq = LJI;
        } else {
            throw new C162476Zf();
        }
        LJIIJ = llq;
        return !o.LJ(abstractC225698tR, this.LIZ);
    }

    @Override // X.LLQ
    public final void LJFF(int i, String tag, boolean z) {
        o.LJIIIZ(tag, "tag");
        C10K.LIZIZ(new LLT(tag, i, z), C10K.LJIIIIZZ, null);
    }

    @Override // X.LLQ
    public final void LJII(String str, String str2, boolean z) {
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJII(str, str2, z);
        }
    }

    @Override // X.LLQ
    public final void LJJIIZI(String tag, Drawable drawable, AbstractC55918Lx4 abstractC55918Lx4, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(drawable, "drawable");
        LLQ llq = LJIIJ;
        if (llq != null) {
            llq.LJJIIZI(tag, drawable, abstractC55918Lx4, layoutParams, scaleType);
        }
    }
}

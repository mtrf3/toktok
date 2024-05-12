package Y;

import X.C142485iW;
import X.C153155zj;
import X.C1552667m;
import X.C1555068k;
import X.C161516Vn;
import X.C5V3;
import X.C63E;
import X.C67P;
import X.C67S;
import X.C6CT;
import X.C6W7;
import X.C76800UCe;
import X.C78939UyV;
import X.C81184Vtc;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS1S1200000_2 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        StickerHintTextViewModel stickerHintTextViewModel = ((C63E) this.l1).LJZL;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.hv0().postValue(new C6CT(C81184Vtc.LJ(((C63E) this.l1).LJLJJI.getContext()) / 2.0f, ((C67P) this.l2).getGuidanceRectBottom() + ((C63E) this.l1).LLIIJLIL, 6, this.s0));
        } else {
            o.LJIJI("hintTextViewModel");
            throw null;
        }
    }

    public final void LIZ$1() {
        Object parent = ((C67S) this.l1).LJLJJI.getParent();
        if (parent != null) {
            C67S c67s = (C67S) this.l1;
            View view = (View) parent;
            if (view.getTag() instanceof C1552667m) {
                Object tag = view.getTag();
                o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                C1552667m c1552667m = (C1552667m) tag;
                if (!o.LJ(c67s.LLJJ, c1552667m)) {
                    c67s.LLJJ = c1552667m;
                    c67s.LLILZIL.setScaleInfo(c1552667m);
                }
            }
        }
        TextStickerData textStickerData = (TextStickerData) this.l2;
        if (textStickerData != null) {
            C67S c67s2 = (C67S) this.l1;
            c67s2.LLJILJILJ = this.s0;
            c67s2.LLJJI = new C142485iW(textStickerData.getTextWrapList(), c67s2.LLJILJILJ);
            c67s2.LLJILLL = textStickerData.getEffectTextLayoutConfig();
            InnerEffectTextLayoutConfig effectTextLayoutConfig = textStickerData.getEffectTextLayoutConfig();
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = null;
            if (effectTextLayoutConfig != null) {
                innerEffectTextLayoutConfig = C78939UyV.LJJJJJL(effectTextLayoutConfig, c67s2.LLJJ.L());
            }
            textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
            c67s2.LIZIZ(textStickerData, false);
            C1555068k c1555068k = c67s2.LLILZIL;
            c1555068k.getClass();
            c1555068k.setInnerLayoutConfig(textStickerData.getEffectTextLayoutConfig());
            if (c1555068k.LLJJL != null) {
                c1555068k.setEffectText(textStickerData.getTextWrapList());
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            c1555068k.LJIJJLI(textStickerData.getTextWrapList(), textStickerData.getInlineTextStyles(), textStickerData.getBgMode(), textStickerData.getColor(), textStickerData.getAlign(), textStickerData.getFontType(), false, textStickerData.getFontSize(), 0, null, textStickerData.isUseColorDropper(), textStickerData.isAdjustTextRollbar());
        }
    }

    public static final void run$0(ARunnableS1S1200000_2 aRunnableS1S1200000_2) {
        boolean LIZ;
        try {
            aRunnableS1S1200000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1200000_2 aRunnableS1S1200000_2) {
        boolean LIZ;
        try {
            aRunnableS1S1200000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S1200000_2 aRunnableS1S1200000_2) {
        C5V3 c5v3;
        C6W7 c6w7 = (C6W7) aRunnableS1S1200000_2.l1;
        C153155zj c153155zj = (C153155zj) aRunnableS1S1200000_2.l2;
        String str = aRunnableS1S1200000_2.s0;
        C161516Vn c161516Vn = c6w7.LIZ.LLIILZL;
        C5V3 c5v32 = c161516Vn.LJIIIIZZ;
        if (c5v32 != null && c5v32.isShowing() && (c5v3 = c161516Vn.LJIIIIZZ) != null) {
            c5v3.dismiss();
        }
        if (c153155zj == null || TextUtils.isEmpty(str)) {
            c6w7.LIZ.LJLJI.LJLJJL.LIZIZ(c153155zj);
            return;
        }
        throw null;
    }

    public ARunnableS1S1200000_2(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}

package Y;

import X.C74413TIj;
import X.EnumC74323TEx;
import X.InterfaceC29911Fj;
import X.InterfaceC72860Sie;
import X.T4C;
import X.THR;
import X.TK6;
import X.TK9;
import X.TKA;
import X.TKB;
import X.ViewOnClickListenerC74332TFg;
import X.W48;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AObjectS87S0100000_12 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            default:
                return;
        }
    }

    public AObjectS87S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            ((TTSearchStickerViewModel) aObjectS87S0100000_12.l0).LLF.setValue(bool);
        }
    }

    public static final void onChanged$1(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        if (((THR) aObjectS87S0100000_12.l0).LJLJLJ && o.LJ(obj, Boolean.TRUE)) {
            THR thr = (THR) aObjectS87S0100000_12.l0;
            thr.LJLJLJ = false;
            thr.LJJZZI();
        }
    }

    public static final void onChanged$2(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        if (o.LJ(obj, Boolean.FALSE)) {
            Iterator it = ((ArrayList) ((T4C) aObjectS87S0100000_12.l0).LJLILLLLZI).iterator();
            while (it.hasNext()) {
                InterfaceC72860Sie interfaceC72860Sie = (InterfaceC72860Sie) it.next();
                if (interfaceC72860Sie instanceof ViewOnClickListenerC74332TFg) {
                    ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = (ViewOnClickListenerC74332TFg) interfaceC72860Sie;
                    if (viewOnClickListenerC74332TFg.LLIFFJFJJ) {
                        viewOnClickListenerC74332TFg.LJ();
                    }
                }
            }
        }
    }

    public static final void onChanged$3(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        TKA tka;
        EnumC74323TEx enumC74323TEx;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            TKB tkb = (TKB) ((W48) aObjectS87S0100000_12.l0).LLI.getValue();
            if (tkb != null && (tka = tkb.LIZJ) != null && tka.LIZIZ) {
                C74413TIj<CategoryEffectModel> value = tka.LIZ(tka.LIZJ, false).getValue();
                if (value != null) {
                    enumC74323TEx = value.LIZIZ;
                } else {
                    enumC74323TEx = null;
                }
                if (enumC74323TEx == EnumC74323TEx.ERROR) {
                    tka.LIZIZ().LIZIZ();
                }
            }
            AqS162S0100000_12 aqS162S0100000_12 = ((W48) aObjectS87S0100000_12.l0).LLIFFJFJJ;
            if (aqS162S0100000_12 != null) {
                aqS162S0100000_12.invoke();
            }
            ((W48) aObjectS87S0100000_12.l0).LLIFFJFJJ = null;
            return;
        }
        TKB tkb2 = (TKB) ((W48) aObjectS87S0100000_12.l0).LLI.getValue();
        if (tkb2 == null) {
            return;
        }
        TKA tka2 = tkb2.LIZJ;
        if (tka2 != null && tka2.LIZIZ && tka2.LIZLLL.isInitialized()) {
            tka2.LIZIZ().LIZJ();
        }
        TK9 tk9 = tkb2.LIZLLL;
        if (tk9 == null || !tk9.LIZIZ || !tk9.LIZLLL.isInitialized()) {
            return;
        }
        tk9.LIZJ = null;
        ((TK6) tk9.LIZLLL.getValue()).LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
    
        if (r12 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$4(Y.AObjectS87S0100000_12 r11, java.lang.Object r12) {
        /*
            X.TIj r12 = (X.C74413TIj) r12
            X.TAu r10 = X.C74216TAu.LIZIZ
            boolean r0 = r10.LIZIZ()
            r8 = 14
            r6 = 0
            r7 = 1
            r5 = 0
            if (r0 == 0) goto Lea
            if (r12 == 0) goto Lee
            M r0 = r12.LIZ
            com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate r0 = (com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate) r0
            if (r0 == 0) goto L2d
            java.lang.Object r9 = r11.l0
            X.W48 r9 = (X.W48) r9
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r1 = r0.getCategoryEffectModel()
            if (r1 == 0) goto L2d
            java.lang.String r0 = r1.getCategoryKey()
            if (r0 == 0) goto L2d
            int r0 = r0.length()
            if (r0 != 0) goto Lc2
        L2d:
            X.TEx r1 = r12.LIZIZ
        L2f:
            X.TEx r0 = X.EnumC74323TEx.SUCCESS
            r4 = 12
            java.lang.String r3 = "prop_category"
            if (r1 != r0) goto Lb4
            java.lang.Object r0 = r11.l0
            X.W48 r0 = (X.W48) r0
            X.I9W r0 = r0.LJJLIIJ()
            if (r0 == 0) goto L5c
            X.TEZ r0 = r0.LLLLL()
            if (r0 == 0) goto L5c
            X.THp r0 = r0.LJJJJLL()
            if (r0 == 0) goto L5c
            X.TJV r0 = r0.LIZ()
            if (r0 == 0) goto L5c
            androidx.lifecycle.LiveData r0 = X.C74310TEk.LIZIZ(r0, r6, r8)
            if (r0 == 0) goto L5c
            r0.removeObserver(r11)
        L5c:
            boolean r0 = r10.LIZIZ()
            if (r0 == 0) goto L8d
            boolean r0 = r10.LJIIIZ()
            if (r0 != 0) goto L8d
            java.lang.Object r0 = r11.l0
            X.W48 r0 = (X.W48) r0
            X.I9W r0 = r0.LJJLIIJ()
            if (r0 == 0) goto La6
            com.bytedance.als.LiveEvent r0 = r0.sF()
            if (r0 == 0) goto La6
            java.lang.Object r1 = r0.LIZJ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto La6
            java.lang.Object r0 = r11.l0
            X.W48 r0 = (X.W48) r0
            X.1qj r0 = r0.LJZI
            X.C78596Usy.LJJJLIIL(r0, r7)
        L8d:
            M r0 = r12.LIZ
            com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate r0 = (com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate) r0
            if (r0 == 0) goto La0
            java.util.List r0 = r0.getCategoryList()
            if (r0 == 0) goto La0
            boolean r0 = r0.isEmpty()
            if (r0 != r7) goto La0
            r6 = 1
        La0:
            r0 = r6 ^ 1
            X.WPY.LIZIZ(r0, r3, r5, r4)
        La5:
            return
        La6:
            java.lang.Object r2 = r11.l0
            X.W48 r2 = (X.W48) r2
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 1022(0x3fe, float:1.432E-42)
            r1.<init>(r2, r0)
            r2.LLIFFJFJJ = r1
            goto L8d
        Lb4:
            if (r12 == 0) goto Lc0
            X.TEx r1 = r12.LIZIZ
        Lb8:
            X.TEx r0 = X.EnumC74323TEx.ERROR
            if (r1 != r0) goto La5
            X.WPY.LIZIZ(r6, r3, r5, r4)
            goto La5
        Lc0:
            r1 = r5
            goto Lb8
        Lc2:
            if (r1 == 0) goto L2d
            X.I9W r0 = r9.LJJLIIJ()
            if (r0 == 0) goto L2d
            X.TEZ r4 = r0.LLLLL()
            if (r4 != 0) goto Ld2
            goto L2d
        Ld2:
            X.THp r3 = r4.LJJJJLL()
            X.TJV r2 = r3.LIZ()
            java.lang.String r0 = "sticker_category:favorite"
            androidx.lifecycle.LiveData r1 = X.C74310TEk.LIZ(r2, r0, r6, r8)
            X.TIM r0 = new X.TIM
            r0.<init>(r2, r9, r4, r3)
            r1.observe(r9, r0)
            goto L2d
        Lea:
            if (r12 == 0) goto Lee
            goto L2d
        Lee:
            r1 = r5
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS87S0100000_12.onChanged$4(Y.AObjectS87S0100000_12, java.lang.Object):void");
    }

    public static final void onChanged$5(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            ((TTSearchStickerViewModel) aObjectS87S0100000_12.l0).LLF.setValue(bool);
        }
    }

    public static final void onChanged$6(AObjectS87S0100000_12 aObjectS87S0100000_12, Object obj) {
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            ((TTSearchStickerViewModel) aObjectS87S0100000_12.l0).LLF.setValue(bool);
        }
    }
}

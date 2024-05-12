package kotlin.jvm.internal;

import X.AbstractC537929f;
import X.AbstractC65781Prl;
import X.C04D;
import X.C0DL;
import X.C0DV;
import X.C0MG;
import X.C0MI;
import X.C0MK;
import X.C0XI;
import X.C10370av;
import X.C10490b7;
import X.C10500b8;
import X.C12F;
import X.C12M;
import X.C12U;
import X.C17650mf;
import X.C20G;
import X.C24450xd;
import X.C24780yA;
import X.C25710zf;
import X.C266312t;
import X.C267913j;
import X.C283419i;
import X.C29321Dc;
import X.C31691Mf;
import X.C32501Pi;
import X.C32531Pl;
import X.C35931b3;
import X.C40431iJ;
import X.C40517FvF;
import X.C42331lN;
import X.C45751qt;
import X.C45771qv;
import X.C45851r3;
import X.C45921rA;
import X.C46081rQ;
import X.C46111rT;
import X.C61878OQg;
import X.C65777Prh;
import X.C76800UCe;
import X.C78842Uww;
import X.C78847Ux1;
import X.C78923UyF;
import X.C78983UzD;
import X.C79081V1x;
import X.InterfaceC22350uF;
import X.InterfaceC23370vt;
import X.InterfaceC24760y8;
import X.InterfaceC267813i;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import Y.IDCListenerS241S0100000;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.IDqS32S0300000;

/* loaded from: classes.dex */
public class IDqS32S0300000 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        Executor executor = (Executor) this.l2;
        final InterfaceC22350uF interfaceC22350uF = (InterfaceC22350uF) this.l0;
        final Object obj = this.l1;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IDqS32S0300000.invoke$lambda$0$1(InterfaceC22350uF.this, obj);
            }
        });
    }

    public static final Object invoke$0(IDqS32S0300000 iDqS32S0300000) {
        ((C04D) iDqS32S0300000.l0).removeOnAttachStateChangeListener((IDCListenerS241S0100000) iDqS32S0300000.l1);
        C04D c04d = (C04D) iDqS32S0300000.l0;
        InterfaceC267813i listener = (InterfaceC267813i) iDqS32S0300000.l2;
        o.LJIIIZ(c04d, "<this>");
        o.LJIIIZ(listener, "listener");
        C267913j c267913j = (C267913j) c04d.getTag(R.id.hwm);
        if (c267913j == null) {
            c267913j = new C267913j();
            c04d.setTag(R.id.hwm, c267913j);
        }
        c267913j.LIZ.remove(listener);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS32S0300000 iDqS32S0300000) {
        iDqS32S0300000.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS32S0300000 iDqS32S0300000) {
        int intValue = ((Number) ((InterfaceC65784Pro) iDqS32S0300000.l0).invoke()).intValue();
        int intValue2 = ((Number) ((InterfaceC65784Pro) iDqS32S0300000.l1).invoke()).intValue();
        int intValue3 = ((Number) ((InterfaceC65784Pro) iDqS32S0300000.l2).invoke()).intValue();
        int i = (intValue / intValue2) * intValue2;
        return C78842Uww.LJJ(Math.max(i - intValue3, 0), i + intValue2 + intValue3);
    }

    public static final Object invoke$11(IDqS32S0300000 iDqS32S0300000) {
        Object obj;
        if (((InterfaceC88471Ynr) iDqS32S0300000.l0) != null) {
            ((C35931b3) iDqS32S0300000.l1).LJL(200, C24780yA.LJFF);
            C35931b3 composer = (C35931b3) iDqS32S0300000.l1;
            InterfaceC88471Ynr composable = (InterfaceC88471Ynr) iDqS32S0300000.l0;
            o.LJIIIZ(composer, "composer");
            o.LJIIIZ(composable, "composable");
            C65777Prh.LJ(2, composable);
            composable.invoke(composer, 1);
            ((C35931b3) iDqS32S0300000.l1).LJJJJJ(false);
        } else {
            ((C35931b3) iDqS32S0300000.l1).getClass();
            C35931b3 c35931b3 = (C35931b3) iDqS32S0300000.l1;
            if (((ArrayList) c35931b3.LJIJ).isEmpty()) {
                c35931b3.LJIIL = c35931b3.LJJIIZ.LJIILJJIL() + c35931b3.LJIIL;
            } else {
                C24450xd c24450xd = c35931b3.LJJIIZ;
                int LJFF = c24450xd.LJFF();
                int i = c24450xd.LJI;
                if (i < c24450xd.LJII) {
                    obj = c24450xd.LJIIJJI(i, c24450xd.LIZIZ);
                } else {
                    obj = null;
                }
                Object LJ = c24450xd.LJ();
                c35931b3.LJLJI(LJFF, obj, LJ);
                c35931b3.LJLIIL(null, C78847Ux1.LJFF(c24450xd.LJI, c24450xd.LIZIZ));
                c35931b3.LJJLIIIJJIZ();
                c24450xd.LIZLLL();
                c35931b3.LJLJJI(LJFF, obj, LJ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS32S0300000 iDqS32S0300000) {
        C12M c12m = (C12M) iDqS32S0300000.l0;
        c12m.LIZ = (C12F) iDqS32S0300000.l1;
        C12U c12u = (C12U) iDqS32S0300000.l2;
        c12u.getClass();
        if (!o.LJ(c12u.LJJIL, c12m)) {
            C12M c12m2 = c12u.LJJIL;
            c12m2.LIZIZ(c12m);
            c12u.LJJIL = c12m;
            c12m.LIZ(c12m2);
            C266312t LJIILJJIL = c12u.LJIILJJIL();
            if (LJIILJJIL != null) {
                if (o.LJ(c12m, c12u.LJJJJJL)) {
                    LJIILJJIL.LIZJ = true;
                } else if (o.LJ(c12m, c12u.LJJJI)) {
                    LJIILJJIL.LIZJ = false;
                }
                if (o.LJ(c12m, c12u.LJJJJIZL)) {
                    LJIILJJIL.LIZLLL = true;
                } else if (o.LJ(c12m, c12u.LJJJI) || o.LJ(c12m, c12u.LJJJJJL)) {
                    LJIILJJIL.LIZLLL = false;
                }
                LJIILJJIL.LJ = o.LJ(c12m, c12u.LJJJJJ);
            }
        }
        C12U c12u2 = (C12U) iDqS32S0300000.l2;
        C12F c12f = c12u2.LJJIL.LIZ;
        if (c12f != null) {
            c12u2.LJJ(c12f);
            ((C12U) iDqS32S0300000.l2).LJJIL.LIZ = null;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS32S0300000 iDqS32S0300000) {
        C25710zf<C29321Dc> LJJ = ((C46081rQ) iDqS32S0300000.l0).LJLLLL.LIZ.LJJ();
        int i = LJJ.LJLJI;
        int i2 = 0;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                C46081rQ c46081rQ = c29321DcArr[i3].LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ);
                c46081rQ.LJLL = c46081rQ.LJLJLLL;
                c46081rQ.LJLJLLL = false;
                i3++;
            } while (i3 < i);
        }
        C25710zf<C29321Dc> LJJ2 = ((C0DV) iDqS32S0300000.l1).LIZ.LJJ();
        int i4 = LJJ2.LJLJI;
        if (i4 > 0) {
            C29321Dc[] c29321DcArr2 = LJJ2.LJLIL;
            o.LJII(c29321DcArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i5 = 0;
            do {
                C29321Dc c29321Dc = c29321DcArr2[i5];
                if (c29321Dc.LLFF == C0DL.InLayoutBlock) {
                    C0DL c0dl = C0DL.NotUsed;
                    o.LJIIIZ(c0dl, "<set-?>");
                    c29321Dc.LLFF = c0dl;
                }
                i5++;
            } while (i5 < i4);
        }
        ((C46081rQ) iDqS32S0300000.l0).LJJIIZ(C45751qt.LJLIL);
        ((AbstractC537929f) iDqS32S0300000.l2).LJLJJLL().LIZJ();
        ((C46081rQ) iDqS32S0300000.l0).LJJIIZ(C45771qv.LJLIL);
        C25710zf<C29321Dc> LJJ3 = ((C46081rQ) iDqS32S0300000.l0).LJLLLL.LIZ.LJJ();
        int i6 = LJJ3.LJLJI;
        if (i6 > 0) {
            C29321Dc[] c29321DcArr3 = LJJ3.LJLIL;
            o.LJII(c29321DcArr3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C46081rQ c46081rQ2 = c29321DcArr3[i2].LLIFFJFJJ.LJIIJJI;
                o.LJI(c46081rQ2);
                if (!c46081rQ2.LJLJLLL) {
                    c46081rQ2.LJLIL();
                }
                i2++;
            } while (i2 < i6);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS32S0300000 iDqS32S0300000) {
        C29321Dc c29321Dc = ((C0DV) iDqS32S0300000.l0).LIZ;
        int i = 0;
        c29321Dc.LLD = 0;
        C25710zf<C29321Dc> LJJ = c29321Dc.LJJ();
        int i2 = LJJ.LJLJI;
        if (i2 > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                C29321Dc c29321Dc2 = c29321DcArr[i3];
                c29321Dc2.LL = c29321Dc2.LJZL;
                c29321Dc2.LJZL = Integer.MAX_VALUE;
                if (c29321Dc2.LLF == C0DL.InLayoutBlock) {
                    c29321Dc2.LLF = C0DL.NotUsed;
                }
                i3++;
            } while (i3 < i2);
        }
        ((C46111rT) iDqS32S0300000.l1).LJJIIZ(C45851r3.LJLIL);
        ((C29321Dc) iDqS32S0300000.l2).LLI.LIZIZ.LJLJJLL().LIZJ();
        C29321Dc c29321Dc3 = ((C0DV) iDqS32S0300000.l0).LIZ;
        C25710zf<C29321Dc> LJJ2 = c29321Dc3.LJJ();
        int i4 = LJJ2.LJLJI;
        if (i4 > 0) {
            C29321Dc[] c29321DcArr2 = LJJ2.LJLIL;
            o.LJII(c29321DcArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                C29321Dc c29321Dc4 = c29321DcArr2[i];
                if (c29321Dc4.LL != c29321Dc4.LJZL) {
                    c29321Dc3.LJJIJLIJ();
                    c29321Dc3.LJJII();
                    if (c29321Dc4.LJZL == Integer.MAX_VALUE) {
                        c29321Dc4.LJJIJIIJIL();
                    }
                }
                i++;
            } while (i < i4);
        }
        ((C46111rT) iDqS32S0300000.l1).LJJIIZ(C45921rA.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS32S0300000 iDqS32S0300000) {
        Object value = ((InterfaceC24760y8) iDqS32S0300000.l0).getValue();
        InterfaceC24760y8 interfaceC24760y8 = (InterfaceC24760y8) iDqS32S0300000.l1;
        final C0MG c0mg = (C0MG) iDqS32S0300000.l2;
        return ((C0MI) value).LIZ(new C0MK() { // from class: X.1HT
            @Override // X.C0MK
            public final boolean LIZ(Object obj) {
                return C0MG.this.LIZ(obj);
            }
        }, interfaceC24760y8.getValue());
    }

    public static final Object invoke$5(IDqS32S0300000 iDqS32S0300000) {
        long j;
        long j2 = ((C10370av) ((InterfaceC88472Yns) ((InterfaceC24760y8) iDqS32S0300000.l1).getValue()).invoke((InterfaceC23370vt) iDqS32S0300000.l0)).LIZ;
        if (C78923UyF.LJIILL(((C10370av) ((InterfaceC35811ar) iDqS32S0300000.l2).getValue()).LIZ) && C78923UyF.LJIILL(j2)) {
            j = C10370av.LJI(((C10370av) ((InterfaceC35811ar) iDqS32S0300000.l2).getValue()).LIZ, j2);
        } else {
            j = C10370av.LIZLLL;
        }
        return new C10370av(j);
    }

    public static final Object invoke$6(IDqS32S0300000 iDqS32S0300000) {
        Float f;
        if (((BoringLayout.Metrics) ((C0XI) iDqS32S0300000.l0).LIZ.getValue()) != null) {
            f = Float.valueOf(r0.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence = (CharSequence) iDqS32S0300000.l1;
            f = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), (TextPaint) iDqS32S0300000.l2)));
        }
        float floatValue = f.floatValue();
        CharSequence charSequence2 = (CharSequence) iDqS32S0300000.l1;
        TextPaint textPaint = (TextPaint) iDqS32S0300000.l2;
        if (floatValue == 0.0f || !(charSequence2 instanceof Spanned)) {
            return f;
        }
        if (textPaint.getLetterSpacing() == 0.0f) {
            Spanned spanned = (Spanned) charSequence2;
            if (!C78983UzD.LJJJ(spanned, C10500b8.class) && !C78983UzD.LJJJ(spanned, C10490b7.class)) {
                return f;
            }
        }
        return Float.valueOf(f.floatValue() + 0.5f);
    }

    public static final Object invoke$7(IDqS32S0300000 iDqS32S0300000) {
        C32531Pl c32531Pl = new C32531Pl();
        ((InterfaceC88472Yns) ((InterfaceC24760y8) iDqS32S0300000.l0).getValue()).invoke(c32531Pl);
        return new C42331lN(c32531Pl.LIZIZ, (C40517FvF) ((InterfaceC24760y8) iDqS32S0300000.l1).getValue(), C61878OQg.INSTANCE, (C32501Pi) iDqS32S0300000.l2);
    }

    public static final Object invoke$8(IDqS32S0300000 iDqS32S0300000) {
        C79081V1x.LJJIJIL(((C20G) iDqS32S0300000.l0).LJLJLLL);
        C20G.LLILLJJLI((C20G) iDqS32S0300000.l0, (LiveEffect) iDqS32S0300000.l1, (View) iDqS32S0300000.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS32S0300000 iDqS32S0300000) {
        C31691Mf.LIZ.LJIIJJI();
        C20G.LLILLJJLI((C20G) iDqS32S0300000.l0, (LiveEffect) iDqS32S0300000.l1, (View) iDqS32S0300000.l2);
        return C76800UCe.LIZ;
    }

    public static final void invoke$lambda$0$1(InterfaceC22350uF callback, Object exception) {
        o.LJIIIZ(callback, "$callback");
        o.LJIIIZ(exception, "$exception");
        callback.LIZ(exception);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C04D c04d, IDCListenerS241S0100000 iDCListenerS241S0100000, C283419i c283419i, int i) {
        super(0);
        this.$t = i;
        this.l0 = c04d;
        this.l1 = iDCListenerS241S0100000;
        this.l2 = c283419i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C0DV c0dv, C46111rT c46111rT, C29321Dc c29321Dc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0dv;
        this.l1 = c46111rT;
        this.l2 = c29321Dc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C0XI c0xi, CharSequence charSequence, C17650mf c17650mf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0xi;
        this.l1 = charSequence;
        this.l2 = c17650mf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(InterfaceC23370vt interfaceC23370vt, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC23370vt;
        this.l1 = interfaceC35811ar;
        this.l2 = interfaceC35811ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS32S0300000(InterfaceC24760y8 interfaceC24760y8, InterfaceC24760y8<? extends C0MI<Object, Object>> interfaceC24760y82, InterfaceC24760y8<Object> interfaceC24760y83, C0MG c0mg) {
        super(0);
        this.$t = c0mg;
        this.l0 = interfaceC24760y8;
        this.l1 = interfaceC24760y82;
        this.l2 = interfaceC24760y83;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C12M c12m, C12F c12f, C12U c12u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c12m;
        this.l1 = c12f;
        this.l2 = c12u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, C32501Pi c32501Pi, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC35811ar;
        this.l1 = interfaceC35811ar2;
        this.l2 = c32501Pi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C40431iJ c40431iJ, C35931b3 c35931b3, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c40431iJ;
        this.l1 = c35931b3;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C46081rQ c46081rQ, C0DV c0dv, AbstractC537929f abstractC537929f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c46081rQ;
        this.l1 = c0dv;
        this.l2 = abstractC537929f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS32S0300000(C20G c20g, LiveEffect liveEffect, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20g;
        this.l1 = liveEffect;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS32S0300000(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<Integer> interfaceC65784Pro2, InterfaceC65784Pro<Integer> interfaceC65784Pro3, InterfaceC65784Pro<Integer> interfaceC65784Pro4) {
        super(0);
        this.$t = interfaceC65784Pro4;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = interfaceC65784Pro3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS32S0300000(Executor executor, Executor executor2, InterfaceC22350uF<R1, E1> interfaceC22350uF, E1 e1) {
        super(0);
        this.$t = e1;
        this.l2 = executor;
        this.l0 = executor2;
        this.l1 = interfaceC22350uF;
    }
}

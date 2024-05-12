package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C47006Icc;
import X.C47007Icd;
import X.C47020Icq;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.C8NK;
import X.IVM;
import X.IX4;
import X.IX7;
import X.InterfaceC47021Icr;
import X.InterfaceC49025JLx;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.JLW;
import X.KHW;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchBuiltInFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class AqS54S0400000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS54S0400000_8 aqS54S0400000_8, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        Assembler assembler = (Assembler) aqS54S0400000_8.l0;
        SearchSingleCardTemplateAssem searchSingleCardTemplateAssem = (SearchSingleCardTemplateAssem) aqS54S0400000_8.l1;
        assembler.nv0(searchSingleCardTemplateAssem, new AqS139S0200000_8((JLW) aqS54S0400000_8.l3, (JLW<InterfaceC49025JLx>) searchSingleCardTemplateAssem, (SearchSingleCardTemplateAssem<InterfaceC49025JLx>) 9));
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(SearchBuiltInFeedbackAssem.class);
        reusedUiContentAssem.LIZJ = new SearchBuiltInFeedbackAssem();
        reusedUiContentAssem.LJFF = (View) aqS54S0400000_8.l2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS54S0400000_8 aqS54S0400000_8, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS54S0400000_8.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((EComPhotoSearchServiceImpl) aqS54S0400000_8.l1).LJI((Context) aqS54S0400000_8.l2, (KHW) aqS54S0400000_8.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS54S0400000_8 aqS54S0400000_8, Object obj) {
        boolean z;
        InterfaceC47021Icr action = (InterfaceC47021Icr) obj;
        o.LJIIIZ(action, "action");
        C47006Icc c47006Icc = (C47006Icc) aqS54S0400000_8.l0;
        C47020Icq LIZJ = action.LIZJ(c47006Icc.LIZJ, (IX4) aqS54S0400000_8.l1, (OnUIPlayListener) aqS54S0400000_8.l2, c47006Icc.LJ);
        C47006Icc c47006Icc2 = (C47006Icc) aqS54S0400000_8.l0;
        IX4 ix4 = (IX4) aqS54S0400000_8.l1;
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aqS54S0400000_8.l2;
        IVM ivm = (IVM) aqS54S0400000_8.l3;
        if (!LIZJ.LIZ) {
            z = false;
        } else {
            C47007Icd c47007Icd = LIZJ.LIZIZ;
            if (c47007Icd == null) {
                c47007Icd = null;
            } else {
                ix4.LJLJJL = c47006Icc2.LJFF;
                ix4.LJLJJLL = c47007Icd.LJIJ.ordinal();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startSession | data : recycleType(");
                LIZ.append(c47006Icc2.LJFF);
                LIZ.append(") ; sessionStatus(");
                LIZ.append(c47007Icd.LJIJ.ordinal());
                LIZ.append(')');
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg, "msg");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startSession | current : ");
                LIZ2.append(c47007Icd);
                LIZ2.append(" | action: ");
                LIZ2.append(action);
                String msg2 = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(msg2, "msg");
                c47007Icd.LJIIIIZZ(onUIPlayListener);
                c47007Icd.LJIIIZ(ivm);
                c47007Icd.LJ(ix4);
            }
            c47006Icc2.LIZJ = c47007Icd;
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, X.IX7] */
    public static final Object invoke$3(AqS54S0400000_8 aqS54S0400000_8, Object obj) {
        ?? e = (IX7) obj;
        o.LJIIIZ(e, "e");
        if (((C47007Icd) aqS54S0400000_8.l0).LJIIJJI == e.LJIIJJI) {
            ((C34K) aqS54S0400000_8.l1).element = true;
        } else if (((ArrayList) aqS54S0400000_8.l2).contains(Integer.valueOf(e.LJIIJJI))) {
            ((C68322mC) aqS54S0400000_8.l3).element = e;
        } else {
            ((ArrayList) aqS54S0400000_8.l2).add(Integer.valueOf(e.LJIIJJI));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0400000_8(C47006Icc c47006Icc, IX4 ix4, OnUIPlayListener onUIPlayListener, IVM ivm, int i) {
        super(1);
        this.$t = i;
        this.l0 = c47006Icc;
        this.l1 = ix4;
        this.l2 = onUIPlayListener;
        this.l3 = ivm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0400000_8(C47007Icd c47007Icd, C47007Icd c47007Icd2, C34K c34k, ArrayList<Integer> arrayList, C68322mC<C47007Icd> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = c47007Icd;
        this.l1 = c47007Icd2;
        this.l2 = c34k;
        this.l3 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0400000_8(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl, Context context, KHW khw) {
        super(1);
        this.$t = khw;
        this.l0 = interfaceC65784Pro;
        this.l1 = interfaceC65784Pro2;
        this.l2 = eComPhotoSearchServiceImpl;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0400000_8(Assembler assembler, Assembler assembler2, SearchSingleCardTemplateAssem<InterfaceC49025JLx> searchSingleCardTemplateAssem, View view, JLW<InterfaceC49025JLx> jlw) {
        super(1);
        this.$t = jlw;
        this.l0 = assembler;
        this.l1 = assembler2;
        this.l2 = searchSingleCardTemplateAssem;
        this.l3 = view;
    }
}

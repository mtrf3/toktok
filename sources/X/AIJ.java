package X;

import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AIJ extends AbstractC65781Prl implements InterfaceC88472Yns<AI8, C76800UCe> {
    public final /* synthetic */ AI9 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ AIL LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ InterfaceC35811ar<AI9> LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIJ(AI9 ai9, String str, String str2, boolean z, AIL ail, boolean z2, boolean z3, boolean z4, InterfaceC35811ar interfaceC35811ar, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = ai9;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = ail;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = z4;
        this.LJLJLLL = interfaceC35811ar;
        this.LJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AI8 ai8) {
        Class<?> cls;
        Class<?> cls2;
        AKC akc;
        AI8 it = ai8;
        o.LJIIIZ(it, "it");
        AI9 value = this.LJLJLLL.getValue();
        if (value != null) {
            cls = value.getClass();
        } else {
            cls = null;
        }
        AI9 ai9 = this.LJLIL;
        if (ai9 != null) {
            cls2 = ai9.getClass();
        } else {
            cls2 = null;
        }
        if (!o.LJ(cls, cls2)) {
            it.setAccessory(this.LJLIL);
        }
        this.LJLJLLL.setValue(this.LJLIL);
        it.setOnClickListener(new AqS167S0100000_1(this.LJLL, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 229));
        it.setTitle(this.LJLILLLLZI);
        it.setSubtitle(this.LJLJI);
        it.setCellEnabled(this.LJLJJI);
        AIL ail = this.LJLJJL;
        o.LJIIIZ(ail, "<this>");
        int i = AIK.LIZ[ail.ordinal()];
        if (i != 1) {
            if (i == 2) {
                akc = AKC.PADDING_32;
            } else {
                throw new C162476Zf();
            }
        } else {
            akc = AKC.PADDING_16;
        }
        it.setInset(akc);
        it.setWithSeparator(this.LJLJJLL);
        it.setShowAlertBadge(this.LJLJL);
        it.setIcon((C2068389v) null);
        it.setLoading(this.LJLJLJ);
        return C76800UCe.LIZ;
    }
}

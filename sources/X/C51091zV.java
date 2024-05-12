package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51091zV extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ List<InterfaceC39071g7> LJLIL;
    public final /* synthetic */ AbstractC39201gK[] LJLILLLLZI;
    public final /* synthetic */ InterfaceC88475Ynv<Integer, int[], EnumC23500w6, InterfaceC23370vt, int[], C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC44861pS LJLJJL;
    public final /* synthetic */ int[] LJLJJLL;
    public final /* synthetic */ EnumC09360Yi LJLJL;
    public final /* synthetic */ C0YV[] LJLJLJ;
    public final /* synthetic */ AbstractC09380Yk LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ C76732zl LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C51091zV(List<? extends InterfaceC39071g7> list, AbstractC39201gK[] abstractC39201gKArr, InterfaceC88475Ynv<? super Integer, ? super int[], ? super EnumC23500w6, ? super InterfaceC23370vt, ? super int[], C76800UCe> interfaceC88475Ynv, int i, InterfaceC44861pS interfaceC44861pS, int[] iArr, EnumC09360Yi enumC09360Yi, C0YV[] c0yvArr, AbstractC09380Yk abstractC09380Yk, int i2, C76732zl c76732zl) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = abstractC39201gKArr;
        this.LJLJI = interfaceC88475Ynv;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC44861pS;
        this.LJLJJLL = iArr;
        this.LJLJL = enumC09360Yi;
        this.LJLJLJ = c0yvArr;
        this.LJLJLLL = abstractC09380Yk;
        this.LJLL = i2;
        this.LJLLI = c76732zl;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x layout) {
        AbstractC09380Yk abstractC09380Yk;
        int i;
        EnumC23500w6 layoutDirection;
        int i2;
        o.LJIIIZ(layout, "$this$layout");
        int size = this.LJLIL.size();
        int[] iArr = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC39201gK abstractC39201gK = this.LJLILLLLZI[i4];
            o.LJI(abstractC39201gK);
            if (this.LJLJL == EnumC09360Yi.Horizontal) {
                i2 = abstractC39201gK.LJLIL;
            } else {
                i2 = abstractC39201gK.LJLILLLLZI;
            }
            iArr[i4] = i2;
        }
        this.LJLJI.invoke(Integer.valueOf(this.LJLJJI), iArr, this.LJLJJL.getLayoutDirection(), this.LJLJJL, this.LJLJJLL);
        AbstractC39201gK[] abstractC39201gKArr = this.LJLILLLLZI;
        C0YV[] c0yvArr = this.LJLJLJ;
        AbstractC09380Yk abstractC09380Yk2 = this.LJLJLLL;
        int i5 = this.LJLL;
        EnumC09360Yi enumC09360Yi = this.LJLJL;
        InterfaceC44861pS interfaceC44861pS = this.LJLJJL;
        int[] iArr2 = this.LJLJJLL;
        int length = abstractC39201gKArr.length;
        int i6 = 0;
        while (i3 < length) {
            AbstractC39201gK abstractC39201gK2 = abstractC39201gKArr[i3];
            int i7 = i6 + 1;
            o.LJI(abstractC39201gK2);
            C0YV c0yv = c0yvArr[i6];
            if (c0yv == null || (abstractC09380Yk = c0yv.LIZJ) == null) {
                abstractC09380Yk = abstractC09380Yk2;
            }
            EnumC09360Yi enumC09360Yi2 = EnumC09360Yi.Horizontal;
            if (enumC09360Yi == enumC09360Yi2) {
                i = abstractC39201gK2.LJLILLLLZI;
            } else {
                i = abstractC39201gK2.LJLIL;
            }
            int i8 = i5 - i;
            if (enumC09360Yi == enumC09360Yi2) {
                layoutDirection = EnumC23500w6.Ltr;
            } else {
                layoutDirection = interfaceC44861pS.getLayoutDirection();
            }
            int LIZ = abstractC09380Yk.LIZ(i8, layoutDirection, abstractC39201gK2);
            if (enumC09360Yi == enumC09360Yi2) {
                AbstractC274515x.LIZJ(abstractC39201gK2, iArr2[i6], LIZ, 0.0f);
            } else {
                AbstractC274515x.LIZJ(abstractC39201gK2, LIZ, iArr2[i6], 0.0f);
            }
            i3++;
            i6 = i7;
        }
        return C76800UCe.LIZ;
    }
}

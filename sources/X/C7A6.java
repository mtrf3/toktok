package X;

import com.ss.android.ugc.aweme.nows.interaction.assem.NowLikeAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7A6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7A6 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowLikeAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C7A6 LJLIL = new C7A6();

    public C7A6() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowLikeAssem nowLikeAssem, C43I<? extends Boolean> c43i) {
        NowLikeAssem selectSubscribe = nowLikeAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            Boolean.valueOf(((Boolean) c43i2.LIZ).booleanValue()).booleanValue();
            InterfaceC1805076o interfaceC1805076o = (InterfaceC1805076o) selectSubscribe.LLIIIILZ.getValue();
            if (interfaceC1805076o != null) {
                boolean booleanValue = ((C7AH) selectSubscribe.m4().getState()).LJLILLLLZI.LIZ.booleanValue();
                long longValue = ((C7AH) selectSubscribe.m4().getState()).LJLJI.LIZ.longValue();
                String aid = ((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                o.LJIIIIZZ(aid, "aid");
                interfaceC1805076o.Ss0(longValue, booleanValue, false, aid);
            }
        }
        return C76800UCe.LIZ;
    }
}

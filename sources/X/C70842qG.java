package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70842qG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SystemShareActivity LJLIL;
    public final /* synthetic */ EnumC70862qI LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70842qG(SystemShareActivity systemShareActivity, EnumC70862qI enumC70862qI, String str, InterfaceC67352kd<? super C70842qG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = systemShareActivity;
        this.LJLILLLLZI = enumC70862qI;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70842qG(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        C45838Hys c45838Hys = this.LJLIL.LJLIL;
        if (this.LJLILLLLZI == EnumC70862qI.IMAGE) {
            i = 1;
        } else {
            i = 2;
        }
        c45838Hys.LIZ = i;
        List<String> LJJIJ = C47261Igj.LJJIJ(this.LJLJI);
        c45838Hys.getClass();
        c45838Hys.LIZIZ = LJJIJ;
        this.LJLIL.LLFII();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

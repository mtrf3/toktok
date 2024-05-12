package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$2$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70852qH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SystemShareActivity LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ EnumC70862qI LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70852qH(SystemShareActivity systemShareActivity, List<String> list, EnumC70862qI enumC70862qI, InterfaceC67352kd<? super C70852qH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = systemShareActivity;
        this.LJLILLLLZI = list;
        this.LJLJI = enumC70862qI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70852qH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        C45838Hys c45838Hys = this.LJLIL.LJLIL;
        List<String> list = this.LJLILLLLZI;
        c45838Hys.getClass();
        o.LJIIIZ(list, "<set-?>");
        c45838Hys.LIZIZ = list;
        SystemShareActivity systemShareActivity = this.LJLIL;
        C45838Hys c45838Hys2 = systemShareActivity.LJLIL;
        if (this.LJLJI == EnumC70862qI.IMAGE) {
            i = 3;
        } else {
            i = 4;
        }
        c45838Hys2.LIZ = i;
        systemShareActivity.LLFII();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.handler.TcmBannerHandler$isValid$2", f = "TcmBannerHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.40a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1023640a extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C40Z LJLIL;
    public final /* synthetic */ C1023840c LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023640a(C40Z c40z, C1023840c c1023840c, InterfaceC67352kd<? super C1023640a> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c40z;
        this.LJLILLLLZI = c1023840c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1023640a(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C63088OpQ coreInfo;
        java.util.Map<String, String> ext;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZ.isDebugMode()) {
            return Boolean.TRUE;
        }
        C63120Opw LIZ = this.LJLIL.LIZJ.LIZ(this.LJLILLLLZI.LIZIZ.getConversationId());
        boolean z = false;
        if (this.LJLILLLLZI.LIZIZ.isTCM() || (LIZ != null && C79004UzY.LJJIIJZLJL(LIZ))) {
            String str2 = null;
            if (LIZ != null && (coreInfo = LIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
                str = ext.get("a:banner_setter");
            } else {
                str = null;
            }
            User LIZJ = C80763Ey.LIZJ();
            if (LIZJ != null) {
                str2 = LIZJ.getUid();
            }
            if (!o.LJ(str, str2)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

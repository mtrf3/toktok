package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.im.sdk.chatlist.data.LastMessageProperty;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DmHelper$markLastPropertyRead$1$localExt$1", f = "DmHelper.kt", l = {123}, m = "invokeSuspend")
/* renamed from: X.30s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C770630s extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, String>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770630s(String str, InterfaceC67352kd<? super C770630s> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C770630s(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer mark_read;
        java.util.Map<String, String> LJJLIL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.LJLIL;
                C141335gf.LIZJ(obj);
                return obj2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C141335gf.LIZJ(obj);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLJI);
        if (LIZ == null) {
            return null;
        }
        AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
        anonymousClass325.getClass();
        LastMessageProperty LJ = AnonymousClass325.LJ(LIZ);
        if (LJ != null && ((mark_read = LJ.getMark_read()) == null || mark_read.intValue() != 1)) {
            LJ.setMark_read(1);
            java.util.Map<String, String> localExt = LIZ.getLocalExt();
            if (localExt != null && (LJJLIL = C113554cx.LJJLIL(localExt)) != null) {
                LJJLIL.put("a:s_latest_message_property", GsonProtectorUtils.toJson(AnonymousClass325.LIZIZ, LJ));
                LIZ.setLocalExt(LJJLIL);
                String conversationId = LIZ.getConversationId();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("markLastPropertyRead :");
                LIZ2.append(conversationId);
                C34B.LIZIZ("DmHelper", X1D.LIZIZ(LIZ2));
            }
        }
        java.util.Map<String, String> localExt2 = LIZ.getLocalExt();
        if (localExt2 == null) {
            localExt2 = new LinkedHashMap<>();
        }
        String conversationId2 = LIZ.getConversationId();
        o.LJIIIIZZ(conversationId2, "modifyConversation.conversationId");
        this.LJLIL = localExt2;
        this.LJLILLLLZI = 1;
        if (anonymousClass325.LJIIIIZZ(localExt2, conversationId2, this) != enumC58928NAu) {
            return localExt2;
        }
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

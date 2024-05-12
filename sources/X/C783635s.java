package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.ImUserPictureAnalytics$viewPictureDetail$1", f = "ImUserPictureAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783635s extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC75532xp LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783635s(int i, InterfaceC75532xp interfaceC75532xp, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        int i = this.LJLIL;
        String str = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        boolean z2 = this.LJLJJI;
        return new C783635s(i, this.LJLJL, str, this.LJLJJL, this.LJLJJLL, interfaceC67352kd, z, z2);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        int i = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", "chat");
        LIZIZ.put("chat_type", C98583tu.LIZIZ(i));
        LIZIZ.put("conversation_id", str3);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(str3);
        if (LIZ != null) {
            str = C79004UzY.LJIILL(LIZ);
        } else {
            str = null;
        }
        LIZIZ.put("to_user_id", str);
        C783835u.LIZ(LIZIZ, this.LJLILLLLZI);
        java.util.Map<String, String> LJJLIL = C113554cx.LJJLIL(LIZIZ);
        String str4 = "1";
        if (this.LJLJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJLIL.put("is_masked", str2);
        if (!this.LJLJJI) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJLIL.put("is_sensitive", str4);
        LJJLIL.put("message_id", this.LJLJJL);
        LJJLIL.put("server_message_id", this.LJLJJLL);
        this.LJLJL.LIZIZ("picture_view", LJJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.ImUserPictureAnalytics$privateVideoOpen$1", f = "ImUserPictureAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783735t extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC75532xp LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783735t(int i, InterfaceC75532xp interfaceC75532xp, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC75532xp;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = i;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C783735t(this.LJLJJL, this.LJLIL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, interfaceC67352kd, this.LJLJI, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C141335gf.LIZJ(obj);
        C1HQ c1hq = new C1HQ();
        String str = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        boolean z2 = this.LJLJJI;
        int i = this.LJLJJL;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJL;
        C783835u.LIZ(c1hq, str);
        c1hq.put("message_type", "private_video");
        c1hq.put("enter_from", "chat");
        String str4 = "1";
        if (z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_masked", obj2);
        if (!z2) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_sensitive", str4);
        c1hq.put("chat_type", C98583tu.LIZIZ(i));
        c1hq.put("message_id", str2);
        c1hq.put("server_message_id", str3);
        this.LJLIL.LIZIZ("private_video_play", C113554cx.LJJLIL(c1hq));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.HashSet;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.IMInboxAvatarAnalytics$onLoadResultInner$1", f = "DMAvatarAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75542xq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC75532xp LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75542xq(String str, String str2, InterfaceC75532xp interfaceC75532xp, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC67352kd<? super C75542xq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = interfaceC75532xp;
        this.LJLJJI = i;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = z4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75542xq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean contains;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('_');
        LIZ.append(this.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        HashSet<String> hashSet = C31A.LIZIZ;
        synchronized (hashSet) {
            contains = hashSet.contains(LIZIZ);
            if (!contains) {
                hashSet.add(LIZIZ);
            }
        }
        InterfaceC75532xp interfaceC75532xp = this.LJLJI;
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ(WM7.SCENE_SERVICE, this.LJLILLLLZI);
        oszArr[1] = new OSZ("res_source", String.valueOf(this.LJLJJI));
        if (this.LJLJJL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_group", str);
        if (this.LJLJJLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("success", str2);
        if (this.LJLJL) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[4] = new OSZ("is_same_user", str3);
        if (contains) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_first_time", str4);
        if (!this.LJLJJLL || this.LJLJLJ) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("is_default", str5);
        interfaceC75532xp.LIZIZ("im_avatar_load_result", C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

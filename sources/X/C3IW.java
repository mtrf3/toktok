package X;

import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$shortUrl$2", f = "FriendsEmptyPageMainSectionVM.kt", l = {141}, m = "invokeSuspend")
/* renamed from: X.3IW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IW(String str, InterfaceC67352kd<? super C3IW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IW(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AbstractC73672Svk<ShortenUrlModel> shortenUrl = C77266UUc.LIZIZ.shortenUrl(this.LJLILLLLZI);
                this.LJLIL = 1;
                obj = C77318UWc.LIZIZ(shortenUrl, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            String url = ((ShortenUrlModel) obj).getUrl();
            if (url == null) {
                return this.LJLILLLLZI;
            }
            return url;
        } catch (Throwable th) {
            C221018lt.LIZJ("Friends", "short url error", th);
            return this.LJLILLLLZI;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$setMetadata$1", f = "BackgroundAudioBrowserService.kt", l = {374}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XNS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BackgroundAudioBrowserService LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ BackgroundAudioBrowserService LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XNS(Aweme aweme, BackgroundAudioBrowserService backgroundAudioBrowserService, InterfaceC67352kd<? super XNS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = aweme;
        this.LJLJJI = backgroundAudioBrowserService;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XNS(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarMedium;
        BackgroundAudioBrowserService backgroundAudioBrowserService;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    backgroundAudioBrowserService = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                User author = this.LJLJI.getAuthor();
                if (author != null && (avatarMedium = author.getAvatarMedium()) != null) {
                    backgroundAudioBrowserService = this.LJLJJI;
                    this.LJLIL = backgroundAudioBrowserService;
                    this.LJLILLLLZI = 1;
                    backgroundAudioBrowserService.getClass();
                    C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                    W5U.LJII(C78939UyV.LJ(avatarMedium)).LJIIIZ(new C39583FgB(new C34K(), c84654XKg));
                    obj = c84654XKg.LIZ();
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                return C76800UCe.LIZ;
            }
            Bitmap bitmap = (Bitmap) obj;
            C84741XNp c84741XNp = backgroundAudioBrowserService.LJLL;
            if (c84741XNp != null) {
                c84741XNp.LIZJ(bitmap);
                C84751XNz c84751XNz = backgroundAudioBrowserService.LJLJLLL;
                if (c84751XNz != null) {
                    XNV xnv = c84751XNz.LJIIIZ;
                    xnv.LJI = bitmap;
                    xnv.LIZIZ = Boolean.valueOf(c84751XNz.LIZLLL.LIZLLL());
                    xnv.LIZJ = Boolean.valueOf(c84751XNz.LIZLLL.LJFF());
                    c84751XNz.LJFF(xnv);
                    return C76800UCe.LIZ;
                }
                o.LJIJI("xNotificationController");
                throw null;
            }
            o.LJIJI("xAndroidSessionController");
            throw null;
        } catch (Throwable th) {
            th.getMessage();
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

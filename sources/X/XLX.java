package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService$setMetadata$1", f = "BackgroundAudioService.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XLX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BackgroundAudioService LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PodcastInfo LJLJI;
    public final /* synthetic */ BackgroundAudioService LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XLX(PodcastInfo podcastInfo, BackgroundAudioService backgroundAudioService, InterfaceC67352kd<? super XLX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = podcastInfo;
        this.LJLJJI = backgroundAudioService;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XLX(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BackgroundAudioService backgroundAudioService;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
            if (i != 0) {
                if (i == 1) {
                    backgroundAudioService = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                PodcastUrlModel cover = this.LJLJI.getCover();
                if (cover != null) {
                    backgroundAudioService = this.LJLJJI;
                    this.LJLIL = backgroundAudioService;
                    this.LJLILLLLZI = 1;
                    backgroundAudioService.getClass();
                    C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                    W5U.LJII(new ImageUrlModel(cover.getUri(), cover.getUrlList())).LJIIIZ(new C39582FgA(new C34K(), c84654XKg));
                    obj = c84654XKg.LIZ();
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                return C76800UCe.LIZ;
            }
            Bitmap bitmap = (Bitmap) obj;
            C84742XNq c84742XNq = backgroundAudioService.LJLJLLL;
            if (c84742XNq != null) {
                c84742XNq.LIZJ(bitmap);
                XO0 xo0 = backgroundAudioService.LJLJLJ;
                if (xo0 != null) {
                    C84729XNd c84729XNd = xo0.LJIIIZ;
                    c84729XNd.LJ = bitmap;
                    xo0.LJ(c84729XNd);
                    return C76800UCe.LIZ;
                }
                o.LJIJI("xNotificationController");
                throw null;
            }
            o.LJIJI("xAndroidSessionController");
            throw null;
        } catch (Throwable unused) {
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

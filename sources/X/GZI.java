package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.share.OnThisDayDownloadPhotoLogic$downloadPhotoModeResource$1$result$2$result$1", f = "OnThisDayDownloadPhotoLogic.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GZI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ GZJ LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ ForwardImageDownloader.ImageDownloadListener LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZI(GZJ gzj, List<String> list, String str, String str2, ForwardImageDownloader.ImageDownloadListener imageDownloadListener, InterfaceC67352kd<? super GZI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gzj;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = imageDownloadListener;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GZI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GZJ gzj = this.LJLILLLLZI;
            List<String> list = this.LJLJI;
            String str = this.LJLJJI;
            String str2 = this.LJLJJL;
            ForwardImageDownloader.ImageDownloadListener imageDownloadListener = this.LJLJJLL;
            this.LJLIL = 1;
            gzj.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C41821GbB.LIZ(list, str, str2, new GZL(c84654XKg, imageDownloadListener));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

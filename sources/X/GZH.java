package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.share.OnThisDayDownloadPhotoLogic$downloadPhotoModeResource$1", f = "OnThisDayDownloadPhotoLogic.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GZH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public GZJ LJLIL;
    public ForwardImageDownloader.ImageDownloadListener LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ ForwardMedia LJLJLJ;
    public final /* synthetic */ List<ForwardMediaDownloader.DownloadConfig> LJLJLLL;
    public final /* synthetic */ ForwardImageDownloader.ImageDownloadListener LJLL;
    public final /* synthetic */ GZJ LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZH(ForwardMedia forwardMedia, List<ForwardMediaDownloader.DownloadConfig> list, ForwardImageDownloader.ImageDownloadListener imageDownloadListener, GZJ gzj, InterfaceC67352kd<? super GZH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLJ = forwardMedia;
        this.LJLJLLL = list;
        this.LJLL = imageDownloadListener;
        this.LJLLI = gzj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GZH gzh = new GZH(this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
        gzh.LJLJL = obj;
        return gzh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cd, code lost:
    
        if (r5 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:5:0x0020). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r13.LJLJJLL
            r0 = 1
            if (r1 == 0) goto L78
            if (r1 != r0) goto Ld0
            java.lang.Object r5 = r13.LJLJJL
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r4 = r13.LJLJJI
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r0 = r13.LJLJI
            java.util.Collection r0 = (java.util.Collection) r0
            com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader$ImageDownloadListener r11 = r13.LJLILLLLZI
            X.GZJ r7 = r13.LJLIL
            java.lang.Object r2 = r13.LJLJL
            X.2pa r2 = (X.InterfaceC70422pa) r2
            X.C141335gf.LIZJ(r14)
        L20:
            r5.add(r14)
            r5 = r0
        L24:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r1 = r4.next()
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            r12 = 0
            if (r0 == 0) goto L3f
            java.util.List r8 = r0.getUrlList()
            if (r8 != 0) goto L41
        L3f:
            X.OQg r8 = X.C61878OQg.INSTANCE
        L41:
            java.lang.Object r0 = r1.getSecond()
            com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader$DownloadConfig r0 = (com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadConfig) r0
            java.lang.String r9 = r0.getCacheDir()
            java.lang.Object r0 = r1.getSecond()
            com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader$DownloadConfig r0 = (com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadConfig) r0
            java.lang.String r10 = r0.getFileName()
            X.GZI r6 = new X.GZI
            r1 = r6
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 3
            X.XKn r1 = X.XKX.LIZIZ(r2, r12, r12, r1, r0)
            r13.LJLJL = r2
            r13.LJLIL = r7
            r13.LJLILLLLZI = r11
            r13.LJLJI = r5
            r13.LJLJJI = r4
            r13.LJLJJL = r5
            r0 = 1
            r13.LJLJJLL = r0
            java.lang.Object r14 = r1.LJJIJ(r13)
            if (r14 != r3) goto L76
            return r3
        L76:
            r0 = r5
            goto L20
        L78:
            X.C141335gf.LIZJ(r14)
            java.lang.Object r2 = r13.LJLJL
            X.2pa r2 = (X.InterfaceC70422pa) r2
            com.ss.android.ugc.aweme.services.story.forward.ForwardMedia r0 = r13.LJLJLJ
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r0.getPhotoModeImageInfo()
            if (r0 == 0) goto Ld8
            java.util.List r1 = r0.getImageList()
            if (r1 == 0) goto Ld8
            java.util.ArrayList r5 = new java.util.ArrayList
            r4 = 10
            int r0 = X.C32I.LJJL(r1, r4)
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDisplayImageNoWatermark()
            r5.add(r0)
            goto L9c
        Lb0:
            java.util.List<com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader$DownloadConfig> r0 = r13.LJLJLLL
            java.util.List r1 = X.ORZ.LLJJIII(r5, r0)
            X.GZJ r7 = r13.LJLLI
            com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader$ImageDownloadListener r11 = r13.LJLL
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r5.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r4 = r1.iterator()
            goto L24
        Lcb:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Ld8
            goto Lda
        Ld0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld8:
            X.OQg r5 = X.C61878OQg.INSTANCE
        Lda:
            com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader$ImageDownloadListener r0 = r13.LJLL
            r0.onSuccess(r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

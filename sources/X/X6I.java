package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDDListenerS59S0100000_15;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalSound;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioFetcher$createJob$1", f = "ReuseAudioFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X6I extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ X6M LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6I(X6M x6m, String str, InterfaceC67352kd<? super X6I> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = x6m;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new X6I(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<OriginalSound> list;
        String str;
        List<String> list2;
        Audio audio;
        C141335gf.LIZJ(obj);
        IDDListenerS59S0100000_15 iDDListenerS59S0100000_15 = new IDDListenerS59S0100000_15(this.LJLIL, 0);
        try {
            X6M x6m = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            x6m.getClass();
            Aweme LIZ = X6M.LIZ(str2);
            if (LIZ == null || (audio = LIZ.getAudio()) == null || (list = audio.getOriginalSoundInfos()) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (!list.isEmpty()) {
                this.LJLIL.LJFF = ((OriginalSound) ListProtector.get(list, 0)).playAddr;
            }
            if (LIZ != null) {
                X6M x6m2 = this.LJLIL;
                x6m2.LJ = LIZ;
                X6G x6g = x6m2.LIZJ;
                if (x6g != null) {
                    UrlModel urlModel = x6m2.LJFF;
                    o.LJI(urlModel);
                    x6g.LJFF(urlModel, LIZ);
                }
            }
            UrlModel urlModel2 = this.LJLIL.LJFF;
            if (urlModel2 != null) {
                str = V0N.LJIILL(urlModel2);
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                X6M x6m3 = this.LJLIL;
                IDownloadService downloadService = DownloadServiceManager.INSTANCE.getDownloadService();
                UrlModel urlModel3 = this.LJLIL.LJFF;
                o.LJI(urlModel3);
                X5R with = downloadService.with(V0N.LJIILL(urlModel3));
                UrlModel urlModel4 = this.LJLIL.LJFF;
                o.LJI(urlModel4);
                if (urlModel4.getUrlList().size() > 1) {
                    UrlModel urlModel5 = this.LJLIL.LJFF;
                    o.LJI(urlModel5);
                    List<String> urlList = urlModel5.getUrlList();
                    UrlModel urlModel6 = this.LJLIL.LJFF;
                    o.LJI(urlModel6);
                    list2 = urlList.subList(1, urlModel6.getUrlList().size());
                } else {
                    list2 = C61878OQg.INSTANCE;
                }
                with.LJIIIIZZ = list2;
                X6M x6m4 = this.LJLIL;
                with.LJ = x6m4.LJI;
                UrlModel urlModel7 = x6m4.LJFF;
                o.LJI(urlModel7);
                with.LIZJ = C30581Hy.LJIILL(V0N.LJIILL(urlModel7));
                with.LJII = 3;
                with.LJI = C47261Igj.LJJIJ(new HttpHeader("downloader_scene", "reuse_audio"));
                with.LJIIJ = "reuse_audio";
                with.LJIIL = iDDListenerS59S0100000_15;
                with.LJJI = true;
                with.LJIL = true;
                C78857UxB.LJIIL(with.LIZJ());
                x6m3.getClass();
            }
        } catch (Exception unused) {
            X6G x6g2 = this.LJLIL.LIZJ;
            if (x6g2 != null) {
                x6g2.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

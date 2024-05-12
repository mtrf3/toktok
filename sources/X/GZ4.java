package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.story.IStoryService;
import defpackage.b1;
import defpackage.e1;
import defpackage.i0;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadPhotoModeSourceMedia$1", f = "ForwardOnThisDayEnvironment.kt", l = {512}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GZ4 extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super C41703GYh>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ CreativeInfo LJLJJI;
    public final /* synthetic */ ForwardConfig LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZ4(Context context, CreativeInfo creativeInfo, ForwardConfig forwardConfig, ForwardMedia forwardMedia, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = forwardMedia;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = forwardConfig;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        ForwardMedia forwardMedia = this.LJLJI;
        GZ4 gz4 = new GZ4(this.LJLJJLL, this.LJLJJI, this.LJLJJL, forwardMedia, interfaceC67352kd);
        gz4.LJLILLLLZI = obj;
        return gz4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ss.android.ugc.aweme.services.story.forward.ForwardImageDownloader] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List<PhotoModeImageUrlModel> imageList;
        List<String> urlList;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            C41700GYe.LJI("downloadSourceMedia start");
            C44428Hc8 c44428Hc8 = C41700GYe.LIZLLL;
            if (c44428Hc8 != null && !c44428Hc8.LIZIZ) {
                c44428Hc8.LIZLLL();
            }
            ForwardMedia forwardMedia = this.LJLJI;
            String str = null;
            String absolutePath = C43073GvN.LJFF(C62850Ola.LJ(), EnumC43651HBf.STREAM_EDIT_VIDEO, null, 6).getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "getAPI().storageService.…_EDIT_VIDEO).absolutePath");
            String LJIJJLI = C78966Uyw.LJIJJLI(absolutePath);
            PhotoModeImageInfo photoModeImageInfo = forwardMedia.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                list = new ArrayList(C32I.LJJL(imageList, 10));
                for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                    StringBuilder LIZ = X1D.LIZ();
                    UrlModel displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark();
                    if (displayImageNoWatermark != null && (urlList = displayImageNoWatermark.getUrlList()) != null) {
                        str = (String) ORZ.LJLLJ(urlList);
                    }
                    String LIZIZ = b1.LIZIZ(str, LIZ, ".png", LIZ);
                    list.add(new ForwardMediaDownloader.DownloadConfig(LJIJJLI, LIZIZ, i0.LJFF(LJIJJLI, LIZIZ), false, false, e1.LIZ(31744, "creation_force_2_use_stream_downloader", true, false), false, 64, null));
                    str = null;
                }
            } else {
                list = C61878OQg.INSTANCE;
            }
            ?? LJ = ((IStoryService) ((C43119Gw7) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService()).LIZ.get()).LJII().LJ();
            ForwardMedia forwardMedia2 = this.LJLJI;
            LJ.downloadPhotoModeResource(forwardMedia2, list, new GZ8(list, c3ck, this.LJLJJI, forwardMedia2, this.LJLJJL, this.LJLJJLL));
            GZ7 gz7 = GZ7.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, gz7, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super C41703GYh> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

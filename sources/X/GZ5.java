package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.story.IStoryService;
import defpackage.b1;
import defpackage.e1;
import defpackage.i0;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadSourceMedia$1", f = "ForwardOnThisDayEnvironment.kt", l = {409}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GZ5 extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super String>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ CreativeInfo LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZ5(ForwardMedia forwardMedia, CreativeInfo creativeInfo, InterfaceC67352kd<? super GZ5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = forwardMedia;
        this.LJLJJI = creativeInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GZ5 gz5 = new GZ5(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        gz5.LJLILLLLZI = obj;
        return gz5;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            C41700GYe.LJI("downloadSourceMedia start");
            C44428Hc8 c44428Hc8 = C41700GYe.LIZLLL;
            if (c44428Hc8 != null && !c44428Hc8.LIZIZ) {
                c44428Hc8.LIZLLL();
            }
            ForwardMedia forwardMedia = this.LJLJI;
            String absolutePath = C43073GvN.LJFF(C62850Ola.LJ(), EnumC43651HBf.STREAM_EDIT_VIDEO, null, 6).getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "getAPI().storageService.…_EDIT_VIDEO).absolutePath");
            String LJIJJLI = C78966Uyw.LJIJJLI(absolutePath);
            StringBuilder LIZ = X1D.LIZ();
            String LIZIZ = b1.LIZIZ((String) ORZ.LJLLJ(forwardMedia.getVideo().getPlayAddressList()), LIZ, ".mp4", LIZ);
            ForwardMediaDownloader.DownloadConfig downloadConfig = new ForwardMediaDownloader.DownloadConfig(LJIJJLI, LIZIZ, i0.LJFF(LJIJJLI, LIZIZ), false, false, e1.LIZ(31744, "creation_force_2_use_stream_downloader", true, false), false, 64, null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("trigger normal downloader with config:");
            LIZ2.append(downloadConfig);
            C41700GYe.LJI(X1D.LIZIZ(LIZ2));
            ((IStoryService) ((C43119Gw7) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService()).LIZ.get()).LJII().LJI().download(this.LJLJI.getVideo(), downloadConfig, null, new GZ9(this.LJLJJI, downloadConfig, c3ck));
            GZA gza = GZA.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, gza, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super String> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

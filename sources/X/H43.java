package X;

import android.app.Application;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.normal.AddEffectWatermarkTask$loadEffectWatermarkResource$1", f = "AddEffectWatermarkTask.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H43 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int[] LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ H2Z LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C142385iM, int[], C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H43(H2Z h2z, InterfaceC88471Ynr<? super C142385iM, ? super int[], C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super H43> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = h2z;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H43(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int[] LIZIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LIZIZ = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            VideoPublishEditModel videoPublishEditModel = this.LJLJI.LJFF;
            if (videoPublishEditModel != null) {
                TimeSpeedModelExtension LIZIZ2 = H49.LIZIZ(videoPublishEditModel);
                if (LIZIZ2 != null) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLJI.LJFF;
                    if (videoPublishEditModel2 != null) {
                        LIZIZ = C44526Hdi.LIZIZ(videoPublishEditModel2);
                        String stickerId = LIZIZ2.getStickerId();
                        o.LJIIIIZZ(stickerId, "firstSegment.stickerId");
                        String name = LIZIZ2.getEffectInfo().getName();
                        H2Z h2z = this.LJLJI;
                        UrlModel iconUrl = LIZIZ2.getEffectInfo().getIconUrl();
                        h2z.getClass();
                        com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel = new com.ss.android.ugc.effectmanager.common.model.UrlModel(null, 1, null);
                        List<String> urlList = iconUrl.getUrlList();
                        o.LJIIIIZZ(urlList, "urlList");
                        urlModel.setUrlList(urlList);
                        urlModel.setUri(iconUrl.getUri());
                        ViralEffectInfo viralEffectInfo = new ViralEffectInfo(stickerId, name, urlModel);
                        VideoPublishEditModel videoPublishEditModel3 = this.LJLJI.LJFF;
                        if (videoPublishEditModel3 != null) {
                            CreativeInfo creativeInfo = videoPublishEditModel3.creativeInfo;
                            o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
                            H4O LIZJ = H49.LIZJ(creativeInfo, LIZIZ, viralEffectInfo);
                            InterfaceC43114Gw2 LIZJ2 = C60903NvH.LJIIJJI().LIZJ();
                            C76940UHo c76940UHo = new C76940UHo();
                            Application application = C60903NvH.LJ;
                            o.LJIIIIZZ(application, "getApplication()");
                            this.LJLIL = LIZIZ;
                            this.LJLILLLLZI = 1;
                            obj = LIZJ2.LIZ(c76940UHo, application, LIZJ, this);
                            if (obj == enumC58928NAu) {
                                return enumC58928NAu;
                            }
                        } else {
                            o.LJIJI("editModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("editModel");
                        throw null;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                o.LJIJI("editModel");
                throw null;
            }
        }
        this.LJLJJI.invoke(obj, LIZIZ);
        C67996QmO c67996QmO = this.LJLJI.LJI;
        if (c67996QmO == null) {
            o.LJIJI("nodeCallback");
            throw null;
        }
        c67996QmO.LIZIZ(new C43393H1h("effect-watermark", "effect watermark load successfully"), EnumC43531H6p.OUTER);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

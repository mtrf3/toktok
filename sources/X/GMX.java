package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$defferTaskList$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AwemeDraft>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJL;
    public final /* synthetic */ List<String> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMX(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, List<String> list, InterfaceC67352kd<? super GMX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = videoPublishEditModel;
        this.LJLJJL = videoPublishEditModel2;
        this.LJLJJLL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GMX gmx = new GMX(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        gmx.LJLJI = obj;
        return gmx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        java.util.Map linkedHashMap;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                linkedHashMap = (java.util.Map) this.LJLIL;
                interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLJI;
            VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
            VideoPublishEditModel videoPublishEditModel2 = this.LJLJJL;
            if (o.LJ(videoPublishEditModel.getCreationId(), videoPublishEditModel2.getCreationId())) {
                linkedHashMap = C113554cx.LJJJLIIL();
            } else {
                linkedHashMap = new LinkedHashMap();
                C42236Ghs LIZ = C42083GfP.LIZ(VideoPublishEditModel.class, InterfaceC43620HAa.class);
                try {
                    CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "originModel.creativeInfo");
                    CreativeInfo creativeInfo2 = videoPublishEditModel2.creativeInfo;
                    o.LJIIIIZZ(creativeInfo2, "targetModel.creativeInfo");
                    LIZ.LIZIZ(videoPublishEditModel2, new GPU(creativeInfo, creativeInfo2, new AqS186S0100000_4(linkedHashMap, (java.util.Map<String, String>) 266)));
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJLJJL;
            this.LJLJI = interfaceC70422pa;
            this.LJLIL = linkedHashMap;
            this.LJLILLLLZI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C78934UyQ.LJLIL.LIZJ();
            C41388GMe.LIZJ(16, videoPublishEditModel3, new AqS173S0100000_7(c84654XKg, 296), new AqS173S0100000_7(c84654XKg, 297));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XKX.LIZIZ(interfaceC70422pa, null, null, new C63132dp(linkedHashMap, this.LJLJJLL, null), 3);
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AwemeDraft> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

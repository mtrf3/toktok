package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$retryPublish$1", f = "StoryPublishServiceImpl.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 91, 97}, m = "invokeSuspend")
/* renamed from: X.GLg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41364GLg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SimplePublishModel LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ PublishFailureReason LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41364GLg(SimplePublishModel simplePublishModel, ActivityC45651qj activityC45651qj, PublishFailureReason publishFailureReason, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C41364GLg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = simplePublishModel;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = publishFailureReason;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41364GLg c41364GLg = new C41364GLg(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c41364GLg.LJLILLLLZI = obj;
        return c41364GLg;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        AwemeDraft LJ = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(this.LJLJI.getCreationId(), 0, null, 6, null), true));
        if (LJ == null) {
            XIF xif = EXT.LIZ;
            C65242hE c65242hE = new C65242hE(this.LJLJJLL, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c65242hE, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService();
        ActivityC45651qj LIZIZ = C45039Hlz.LIZIZ(this.LJLJJI, true);
        if (LIZIZ == null) {
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            XIF xif2 = EXT.LIZ;
            C65262hG c65262hG = new C65262hG(interfaceC88472Yns, null);
            this.LJLIL = 2;
            if (XKX.LJI(xif2, c65262hG, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        C268713r.LIZ().LJIIJJI(LIZIZ, LJ, this.LJLJJL);
        XIF xif3 = EXT.LIZ;
        C65252hF c65252hF = new C65252hF(this.LJLJJLL, null);
        this.LJLIL = 3;
        if (XKX.LJI(xif3, c65252hF, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

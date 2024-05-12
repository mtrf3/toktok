package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$musicLoaderJob$1", f = "ChangAvatarActionStage.kt", l = {205}, m = "invokeSuspend")
/* renamed from: X.2mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68502mU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C41356GKy LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68502mU(C41356GKy c41356GKy, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C68502mU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c41356GKy;
        this.LJLJJI = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68502mU c68502mU = new C68502mU(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c68502mU.LJLILLLLZI = obj;
        return c68502mU;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            ActivityC45651qj activityC45651qj = this.LJLJI.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            XKX.LIZLLL(interfaceC70422pa, null, null, new C68482mS(activityC45651qj, videoPublishEditModel, c84654XKg, null), 3);
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

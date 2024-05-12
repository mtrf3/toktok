package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$checkAddValid$1$resizeImageTask$1", f = "VideoChosenResultFromAddSceneImpl.kt", l = {133}, m = "invokeSuspend")
/* renamed from: X.GdJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41953GdJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C41988Gds LJLILLLLZI;
    public final /* synthetic */ List<MediaModel> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41953GdJ(C41988Gds c41988Gds, List<? extends MediaModel> list, InterfaceC67352kd<? super C41953GdJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c41988Gds;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41953GdJ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C41988Gds c41988Gds = this.LJLILLLLZI;
            List<MediaModel> list = this.LJLJI;
            this.LJLIL = 1;
            obj = c41988Gds.LJFF(list, this);
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

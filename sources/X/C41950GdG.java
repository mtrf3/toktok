package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS56S0201000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$compressSingleVideo$2", f = "VideoChosenResultFromAddSceneImpl.kt", l = {263}, m = "invokeSuspend")
/* renamed from: X.GdG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41950GdG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends String>>, Object> {
    public C5W8 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C5W8 LJLJI;
    public final /* synthetic */ VideoSegment LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C41988Gds LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41950GdG(C5W8 c5w8, VideoSegment videoSegment, int i, C41988Gds c41988Gds, InterfaceC67352kd<? super C41950GdG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c5w8;
        this.LJLJJI = videoSegment;
        this.LJLJJL = i;
        this.LJLJJLL = c41988Gds;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41950GdG(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C5W8 c5w8 = this.LJLJI;
            VideoSegment videoSegment = this.LJLJJI;
            int i2 = this.LJLJJL;
            C41988Gds c41988Gds = this.LJLJJLL;
            this.LJLIL = c5w8;
            this.LJLILLLLZI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            c5w8.LIZIZ(videoSegment, false, false, new AqS56S0201000_7(i2, new C76732zl(), c41988Gds, 1), new AqS189S0100000_7(c84654XKg, 35));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

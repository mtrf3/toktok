package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compressSingleVideo$2", f = "CutOptimizedVideoChosenHandler.kt", l = {1025}, m = "invokeSuspend")
/* renamed from: X.5VQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends String>>, Object> {
    public C5W8 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C5W8 LJLJI;
    public final /* synthetic */ VideoSegment LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ C43544H7c LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5VQ(C5W8 c5w8, VideoSegment videoSegment, boolean z, boolean z2, int i, boolean z3, C43544H7c c43544H7c, InterfaceC67352kd<? super C5VQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c5w8;
        this.LJLJJI = videoSegment;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = i;
        this.LJLJLJ = z3;
        this.LJLJLLL = c43544H7c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5VQ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C5W8 c5w8 = this.LJLJI;
            VideoSegment videoSegment = this.LJLJJI;
            boolean z = this.LJLJJL;
            boolean z2 = this.LJLJJLL;
            int i2 = this.LJLJL;
            boolean z3 = this.LJLJLJ;
            C43544H7c c43544H7c = this.LJLJLLL;
            this.LJLIL = c5w8;
            this.LJLILLLLZI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            c5w8.LIZIZ(videoSegment, z, z2, new C5VP(i2, new C76732zl(), z3, c43544H7c), new C5VO(c43544H7c, videoSegment, System.currentTimeMillis(), c84654XKg));
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMediaForVideo2Sticker$1$compressVideoTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {577}, m = "invokeSuspend")
/* renamed from: X.5Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135915Vb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C43544H7c LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ArrayList<VideoSegment> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135915Vb(C43544H7c c43544H7c, CreativeInfo creativeInfo, ArrayList<VideoSegment> arrayList, InterfaceC67352kd<? super C135915Vb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c43544H7c;
        this.LJLJI = creativeInfo;
        this.LJLJJI = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C135915Vb(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C43544H7c c43544H7c = this.LJLILLLLZI;
            CreativeInfo creativeInfo = this.LJLJI;
            ArrayList<VideoSegment> arrayList = this.LJLJJI;
            this.LJLIL = 1;
            obj = C43544H7c.LJII(c43544H7c, creativeInfo, arrayList, false, false, false, true, false, this, 92);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends Boolean, ? extends Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
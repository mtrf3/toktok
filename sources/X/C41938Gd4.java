package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$resolveMedia$1$compressVideoTask$1", f = "SaveDraftByPath.kt", l = {75}, m = "invokeSuspend")
/* renamed from: X.Gd4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41938Gd4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
    public int LJLIL;
    public final /* synthetic */ ArrayList<VideoSegment> LJLILLLLZI;
    public final /* synthetic */ C5W8 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41938Gd4(ArrayList<VideoSegment> arrayList, C5W8 c5w8, InterfaceC67352kd<? super C41938Gd4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = arrayList;
        this.LJLJI = c5w8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41938Gd4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C41935Gd1 c41935Gd1 = C41935Gd1.LIZ;
            ArrayList<VideoSegment> arrayList = this.LJLILLLLZI;
            C5W8 c5w8 = this.LJLJI;
            o.LJII(c5w8, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedCompressVideoHelper");
            this.LJLIL = 1;
            obj = c41935Gd1.LIZ(arrayList, (C44512HdU) c5w8, this);
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

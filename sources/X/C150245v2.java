package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.draft.ImageEditAutoSaveDraftComponent$recoverDraft$1$1", f = "ImageEditAutoSaveDraftComponent.kt", l = {64}, m = "invokeSuspend")
/* renamed from: X.5v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150245v2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ C150225v0 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150245v2(VideoPublishEditModel videoPublishEditModel, C150225v0 c150225v0, InterfaceC67352kd<? super C150245v2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c150225v0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C150245v2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            C41021G8b c41021G8b = new C41021G8b(this.LJLILLLLZI, new GLI("ImageEditAutoSaveDraftComponent", 20));
            C150255v3 c150255v3 = C150255v3.LJLIL;
            this.LJLIL = 1;
            obj = LJFF.LIZIZ(c41021G8b, c150255v3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJJLIIIJJI((C142535ib) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

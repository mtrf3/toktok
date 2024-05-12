package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel$processDataAsync$1$finalNLEModel$1", f = "EditCapCutViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5L4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super NLEModel>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5L4(VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C5L4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5L4(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C135215Sj.LIZIZ(this.LJLIL, true).LJFF();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super NLEModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

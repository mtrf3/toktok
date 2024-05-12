package X;

import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$fetchVoiceEffectList$1$3", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137655aj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TTSFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137655aj(TTSFragment tTSFragment, InterfaceC67352kd<? super C137655aj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = tTSFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137655aj(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ActivityC45651qj mo49getActivity;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.mo49getActivity() == null || ((mo49getActivity = this.LJLIL.mo49getActivity()) != null && mo49getActivity.isFinishing())) {
            return C76800UCe.LIZ;
        }
        C73305Spp c73305Spp = this.LJLIL.LLFII;
        if (c73305Spp != null) {
            C146035oF.LIZIZ(c73305Spp);
        }
        this.LJLIL.nm();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.EditorProTTSHelper$readText$2$response$1", f = "EditorProTTSHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137825b0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137825b0(String str, String str2, InterfaceC67352kd<? super C137825b0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137825b0(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C141265gY.LIZ(null, this.LJLIL, this.LJLILLLLZI, "TTS");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

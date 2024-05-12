package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$downloadAudio$1$response$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137765au extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137765au(String str, String str2, String str3, InterfaceC67352kd<? super C137765au> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137765au(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C141265gY.LIZ(null, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

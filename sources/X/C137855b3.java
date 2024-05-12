package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$downloadAudio$2$response$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137855b3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ReadTextEffectBean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137855b3(String str, String str2, int i, ReadTextEffectBean readTextEffectBean, InterfaceC67352kd<? super C137855b3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = readTextEffectBean;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137855b3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        String str2 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        Integer num = new Integer(this.LJLJI);
        if (OUP.LJJIIJZLJL(this.LJLJJI.effect)) {
            str = "Vop";
        } else {
            str = "TTS";
        }
        return C141265gY.LIZ(num, str2, str3, str);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TextToSpeechApi.FetchTextAudioResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

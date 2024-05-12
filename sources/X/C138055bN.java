package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import djb.IDaS67S0100000_2;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138055bN extends AbstractC65781Prl implements InterfaceC88473Ynt<String, SpeakerCenter.KevaSpeakerBean, Effect, C76800UCe> {
    public final /* synthetic */ C138075bP LJLIL;
    public final /* synthetic */ CoroutineExceptionHandler LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C68322mC<TextStickerData> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ TextStickerData LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138055bN(C138075bP c138075bP, IDaS67S0100000_2 iDaS67S0100000_2, long j, C68322mC c68322mC, String str, TextStickerData textStickerData) {
        super(3);
        this.LJLIL = c138075bP;
        this.LJLILLLLZI = iDaS67S0100000_2;
        this.LJLJI = j;
        this.LJLJJI = c68322mC;
        this.LJLJJL = str;
        this.LJLJJLL = textStickerData;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, Effect effect) {
        String realSpeaker = str;
        SpeakerCenter.KevaSpeakerBean speakerBean = kevaSpeakerBean;
        o.LJIIIZ(realSpeaker, "realSpeaker");
        o.LJIIIZ(speakerBean, "speakerBean");
        C138075bP c138075bP = this.LJLIL;
        XKX.LIZLLL(c138075bP.LLIIZ, this.LJLILLLLZI, null, new C138005bI(c138075bP, this.LJLJI, this.LJLJJI, this.LJLJJL, realSpeaker, effect, speakerBean, this.LJLJJLL, null), 2);
        return C76800UCe.LIZ;
    }
}

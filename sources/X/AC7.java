package X;

import com.ss.android.ugc.aweme.captionsheet.TranslationPanelFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class AC7 implements InterfaceC85901XnV {
    public final /* synthetic */ InterfaceC88472Yns<PushSettings, C76800UCe> LJLIL;
    public final /* synthetic */ TranslationPanelFragment LJLILLLLZI;

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        this.LJLIL.invoke(pushSettings);
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    public AC7(AqS170S0100000_4 aqS170S0100000_4, TranslationPanelFragment translationPanelFragment) {
        this.LJLIL = aqS170S0100000_4;
        this.LJLILLLLZI = translationPanelFragment;
    }
}

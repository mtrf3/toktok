package X;

import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2E extends AbstractC65781Prl implements InterfaceC88473Ynt<TranslationControlsAssem, Y1Y, Boolean, C76800UCe> {
    public static final Y2E LJLIL = new Y2E();

    public Y2E() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(TranslationControlsAssem translationControlsAssem, Y1Y state, Boolean bool) {
        TranslationControlsAssem selectSubscribe = translationControlsAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (!booleanValue && !(state instanceof Y1X)) {
            selectSubscribe.getContainerView().setVisibility(0);
        } else {
            selectSubscribe.getContainerView().setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.panel.TakoSpeechAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7LK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7LK extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7LK LJLIL = new C7LK();

    public C7LK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(TakoSpeechAssem.class);
        uiContentAssem.LJIIIIZZ = new TakoSpeechAssem();
        uiContentAssem.LJI = R.id.k9x;
        return C76800UCe.LIZ;
    }
}

package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86726Y1y extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C86726Y1y LJLIL = new C86726Y1y();

    public C86726Y1y() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, C43I<? extends C195357lb> c43i) {
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = null;
            selectSubscribe.B4();
            TranslationStatusViewModel u4 = selectSubscribe.u4();
            u4.sv0();
            ((Handler) u4.LJLLLLLL.getValue()).removeCallbacksAndMessages(null);
            u4.LJZI = null;
            u4.LJLLLL = false;
            u4.onEvent(C86764Y3k.LIZIZ);
            u4.LJZL = ILV.SWITCH_VIDEO;
            u4.LJLLL.LIZLLL();
            u4.setState(Y3A.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}

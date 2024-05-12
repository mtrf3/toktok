package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final /* synthetic */ class XMI extends TBS implements InterfaceC88472Yns<String[], C76800UCe> {
    public XMI(TranslationStatusViewModel translationStatusViewModel) {
        super(1, translationStatusViewModel, TranslationStatusViewModel.class, "onDoNotTransCodeChanged", "onDoNotTransCodeChanged([Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String[] strArr) {
        String[] p0 = strArr;
        o.LJIIIZ(p0, "p0");
        ((TranslationStatusViewModel) this.receiver).pv0(p0);
        return C76800UCe.LIZ;
    }
}

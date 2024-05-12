package X;

import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86727Y1z extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, C43I<? extends String>, C76800UCe> {
    public static final C86727Y1z LJLIL = new C86727Y1z();

    public C86727Y1z() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, C43I<? extends String> c43i) {
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && o.LJ(c43i2.LIZ, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid())) {
            TranslationStatusViewModel u4 = selectSubscribe.u4();
            u4.getClass();
            if (((Number) C53054Kry.LIZ.getValue()).intValue() != 0) {
                ((Handler) u4.LJLLLLLL.getValue()).postDelayed(new ARunnableS51S0100000_15(u4, 52), 100L);
            }
        }
        return C76800UCe.LIZ;
    }
}

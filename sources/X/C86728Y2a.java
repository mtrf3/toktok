package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Y2a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86728Y2a extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, Boolean, C76800UCe> {
    public static final C86728Y2a LJLIL = new C86728Y2a();

    public C86728Y2a() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, Boolean bool) {
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.q4(40.0d);
        } else {
            selectSubscribe.q4(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        return C76800UCe.LIZ;
    }
}

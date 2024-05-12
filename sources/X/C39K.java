package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.abtest.IMInboxUnreadCountDiffCheckSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.39K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39K extends AbstractC65781Prl implements InterfaceC65784Pro<IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig> {
    public static final C39K LJLIL = new C39K();

    public C39K() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig invoke() {
        Object obj;
        try {
            Object obj2 = (IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig) SettingsManager.LIZLLL().LJIIIIZZ("im_inbox_unread_count_difference_check", IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig.class, IMInboxUnreadCountDiffCheckSettings.LIZ);
            C3C5.m7constructorimpl(obj2);
            obj = obj2;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            obj = LIZ;
        }
        boolean m12isFailureimpl = C3C5.m12isFailureimpl(obj);
        IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig differenceCheckConfig = obj;
        if (m12isFailureimpl || obj == null) {
            differenceCheckConfig = IMInboxUnreadCountDiffCheckSettings.LIZ;
        }
        o.LJIIIIZZ(differenceCheckConfig, "kotlin.runCatching {\n   … }.getOrNull() ?: DEFAULT");
        return differenceCheckConfig;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.service.appsettings.DMTakoConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.44x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1036344x extends AbstractC65781Prl implements InterfaceC65784Pro<DMTakoConfig> {
    public static final C1036344x LJLIL = new C1036344x();

    public C1036344x() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final DMTakoConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        DMTakoConfig dMTakoConfig = C1036144v.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("im_chat_bot_config", DMTakoConfig.class, dMTakoConfig);
        if (LJIIIIZZ != 0) {
            dMTakoConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(dMTakoConfig, "SettingsManager.getInsta…s::class.java) ?: DEFAULT");
        return dMTakoConfig;
    }
}

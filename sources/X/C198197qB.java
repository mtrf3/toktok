package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.nows.campaign.p004new.year.NowNewYearEventConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.7qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198197qB extends AbstractC65781Prl implements InterfaceC65784Pro<NowNewYearEventConfig> {
    public static final C198197qB LJLIL = new C198197qB();

    public C198197qB() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final NowNewYearEventConfig invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        NowNewYearEventConfig nowNewYearEventConfig = C198177q9.LIZIZ;
        Object LJIIIIZZ = LIZLLL.LJIIIIZZ("tt_now_2023_new_year_event", NowNewYearEventConfig.class, nowNewYearEventConfig);
        if (LJIIIIZZ != 0) {
            nowNewYearEventConfig = LJIIIIZZ;
        }
        o.LJIIIIZZ(nowNewYearEventConfig, "SettingsManager.getInsta…:class.java) ?: NO_EVENTS");
        return nowNewYearEventConfig;
    }
}

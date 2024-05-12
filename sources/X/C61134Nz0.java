package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;

/* renamed from: X.Nz0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61134Nz0 extends AbstractC65781Prl implements InterfaceC65784Pro<FeedCardInsertConfig> {
    public static final C61134Nz0 LJLIL = new C61134Nz0();

    public C61134Nz0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FeedCardInsertConfig invoke() {
        try {
            return (FeedCardInsertConfig) SettingsManager.LIZLLL().LJIIIIZZ("fcp_card_config", FeedCardInsertConfig.class, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}

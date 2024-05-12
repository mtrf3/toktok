package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LazyLoadBlockList;

/* renamed from: X.Mxy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58522Mxy extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C58522Mxy LJLIL = new C58522Mxy();

    public C58522Mxy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return SettingsManager.INSTANCE.getStringArrayValue(LazyLoadBlockList.class);
    }
}

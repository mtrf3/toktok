package X;

import com.bytedance.android.livesdk.livesetting.level.LiveLevelSystemResourceSetting;

/* renamed from: X.Bmw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29810Bmw extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29810Bmw LJLIL = new C29810Bmw();

    public C29810Bmw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig().effectStrategy);
    }
}

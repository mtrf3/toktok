package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRestoreParamsSettings;

/* renamed from: X.MxP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58487MxP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58487MxP LJLIL = new C58487MxP();

    public C58487MxP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicRestoreParamsSettings.INSTANCE.getValue());
    }
}

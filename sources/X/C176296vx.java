package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.6vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176296vx extends AbstractC65781Prl implements InterfaceC65784Pro<int[]> {
    public static final C176296vx LJLIL = new C176296vx();

    public C176296vx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final int[] invoke() {
        try {
            SettingsManager.LIZLLL().getClass();
            int[] iArr = (int[]) SettingsManager.LJII("comment_batch_max_limit", int[].class);
            if (iArr == null) {
                return C176286vw.LIZ;
            }
            return iArr;
        } catch (Throwable unused) {
            return C176286vw.LIZ;
        }
    }
}

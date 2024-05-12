package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;

/* renamed from: X.DuD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35357DuD extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35357DuD LJLIL = new C35357DuD();

    public C35357DuD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        int LIZ = C00F.LIZ(31744, 0, "feed_tab_viewpager_scroll_duration", true);
        C35356DuC.LIZ.getClass();
        if (LIZ == C35356DuC.LIZIZ) {
            i = 200;
        } else if (LIZ == C35356DuC.LIZJ) {
            i = LiveCoverMinSizeSetting.DEFAULT;
        } else if (LIZ == C35356DuC.LIZLLL) {
            i = 300;
        } else if (LIZ == C35356DuC.LJ) {
            i = 350;
        }
        return Integer.valueOf(i);
    }
}

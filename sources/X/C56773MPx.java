package X;

import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.MPx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56773MPx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C56773MPx LJLIL = new C56773MPx();

    public C56773MPx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        boolean z = false;
        if (LJJIJIL != null && (bool = (Boolean) LJJIJIL.LJIIIZ(Boolean.FALSE, "live_square_inbox_refresh")) != null && bool.booleanValue() && !C46604IQu.LJ()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

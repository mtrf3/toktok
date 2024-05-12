package X;

import com.ss.android.ugc.aweme.common.MobClick;

/* renamed from: X.AFw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25936AFw extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C25936AFw LJLIL = new C25936AFw();

    public C25936AFw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        FMX.LJIIL("enter_blocked_accounts", c188727au.LIZ);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("black_list");
        mobClick.setLabelName("message");
        FMX.onEvent(mobClick);
        return C76800UCe.LIZ;
    }
}

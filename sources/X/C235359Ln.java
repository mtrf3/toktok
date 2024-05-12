package X;

import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarActivityAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarBackAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarFindFriendsAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarQrCodeAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSuggestBAAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235359Ln extends AbstractC65781Prl implements InterfaceC88472Yns<C235809Ng<EnumC235349Lm>, C76800UCe> {
    public static final C235359Ln LJLIL = new C235359Ln();

    public C235359Ln() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C235809Ng<EnumC235349Lm> c235809Ng) {
        C235809Ng<EnumC235349Lm> startArea = c235809Ng;
        o.LJIIIZ(startArea, "$this$startArea");
        startArea.LIZ(EnumC235349Lm.Back, C65352Pkq.LIZ(MineNavBarBackAssem.class));
        startArea.LIZ(EnumC235349Lm.FindFriends, C65352Pkq.LIZ(MineNavBarFindFriendsAssem.class));
        startArea.LIZ(EnumC235349Lm.QRCODE, C65352Pkq.LIZ(MineNavBarQrCodeAssem.class));
        startArea.LIZ(EnumC235349Lm.SuggestBA, C65352Pkq.LIZ(MineNavBarSuggestBAAssem.class));
        startArea.LIZ(EnumC235349Lm.Activity, C65352Pkq.LIZ(MineNavBarActivityAssem.class));
        return C76800UCe.LIZ;
    }
}

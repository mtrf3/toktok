package X;

import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user.UserNavBarBellAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user.UserNavBarMoreAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235819Nh extends AbstractC65781Prl implements InterfaceC88472Yns<C235809Ng<EnumC235829Ni>, C76800UCe> {
    public static final C235819Nh LJLIL = new C235819Nh();

    public C235819Nh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C235809Ng<EnumC235829Ni> c235809Ng) {
        C235809Ng<EnumC235829Ni> endArea = c235809Ng;
        o.LJIIIZ(endArea, "$this$endArea");
        endArea.LIZ(EnumC235829Ni.Bell, C65352Pkq.LIZ(UserNavBarBellAssem.class));
        endArea.LIZ(EnumC235829Ni.More, C65352Pkq.LIZ(UserNavBarMoreAssem.class));
        return C76800UCe.LIZ;
    }
}

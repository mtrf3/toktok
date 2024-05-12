package X;

import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarLiveEventEntranceAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSettingAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarViewerEntranceAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235799Nf extends AbstractC65781Prl implements InterfaceC88472Yns<C235809Ng<EnumC235829Ni>, C76800UCe> {
    public static final C235799Nf LJLIL = new C235799Nf();

    public C235799Nf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C235809Ng<EnumC235829Ni> c235809Ng) {
        C235809Ng<EnumC235829Ni> endArea = c235809Ng;
        o.LJIIIZ(endArea, "$this$endArea");
        endArea.LIZ(EnumC235829Ni.ProfileViewer, C65352Pkq.LIZ(MineNavBarViewerEntranceAssem.class));
        endArea.LIZ(EnumC235829Ni.LiveEvent, C65352Pkq.LIZ(MineNavBarLiveEventEntranceAssem.class));
        endArea.LIZ(EnumC235829Ni.Setting, C65352Pkq.LIZ(MineNavBarSettingAssem.class));
        return C76800UCe.LIZ;
    }
}

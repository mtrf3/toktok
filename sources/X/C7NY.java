package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7NY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NY extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C7NY LJLIL = new C7NY();

    public C7NY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(GroupInviteUIAssem.class);
        uiContentAssem.LJIIIIZZ = new GroupInviteUIAssem();
        uiContentAssem.LJI = R.id.j71;
        return C76800UCe.LIZ;
    }
}

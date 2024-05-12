package X;

import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingsCommonSubFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85925Xnt implements InterfaceC85953XoL {
    public final /* synthetic */ PushSettingsCommonSubFragment LJLIL;

    public C85925Xnt(PushSettingsCommonSubFragment pushSettingsCommonSubFragment) {
        this.LJLIL = pushSettingsCommonSubFragment;
    }

    @Override // X.InterfaceC85953XoL
    public final void LIZ(int i, String itemId) {
        String str;
        String str2;
        o.LJIIIZ(itemId, "itemId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onPushSwitchStatus ");
        LIZ.append(itemId);
        LIZ.append(", status: ");
        LIZ.append(i);
        LIZ.append("....");
        C85934Xo2.LIZ(X1D.LIZIZ(LIZ));
        String pageLabel = this.LJLIL.LJLJLLL;
        o.LJIIIZ(pageLabel, "pageLabel");
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        if (o.LJ(pageLabel, "in_app_push_setting")) {
            str2 = "inner_notification_switch";
        } else {
            str2 = "notification_switch";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("label", itemId);
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL(str2, c188727au.LIZ);
        C85940Xo8.LIZIZ.LIZ(i, itemId);
        this.LJLIL.LJLJJL.LJIILL(itemId, Integer.valueOf(i));
    }
}

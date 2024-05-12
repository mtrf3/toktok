package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.TWv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74789TWv {
    public static DataChannel LIZIZ;
    public static volatile boolean LIZLLL;
    public static final C74789TWv LIZ = new C74789TWv();
    public static final CopyOnWriteArrayList<InterfaceC74790TWw> LIZJ = new CopyOnWriteArrayList<>();

    public static boolean LIZJ() {
        Boolean bool;
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(HasMultiGuestV3GuestModeratorWidget.class);
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public static void LIZ() {
        boolean LIZIZ2 = LIZIZ();
        if (LIZLLL != LIZIZ2) {
            LIZLLL = LIZIZ2;
            Iterator<InterfaceC74790TWw> it = LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(LIZIZ2);
            }
        }
    }

    public static boolean LIZIZ() {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hasModeratorPermission, hasAdminManageGuestPermission=");
        LIZ2.append(((IUserManageService) CN1.LIZ(IUserManageService.class)).X00());
        LIZ2.append(", isHitModeratorLibra=");
        LIZ2.append(C74697TTh.LIZ());
        LIZ2.append(", isAnchor=");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZ2.append(C74947TbD.LJIILLIIL(LJ));
        LIZ2.append(", techSwitchSetting=");
        LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting linkMicMultiGuestV3AndroidModeratorTechSwitchSetting = LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE;
        LIZ2.append(linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue());
        LIZ2.append(", ");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestAsGuestModeratorHelper", LIZIZ2);
        if (((IUserManageService) CN1.LIZ(IUserManageService.class)).X00() && C74697TTh.LIZ()) {
            User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
            if (!C74947TbD.LJIILLIIL(LJ2) && linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue()) {
                return true;
            }
        }
        return false;
    }
}

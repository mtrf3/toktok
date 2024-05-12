package Y;

import X.BJ3;
import X.BZI;
import X.C28787BRn;
import X.C29306Beo;
import X.InterfaceC64592gB;
import X.OSZ;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import java.util.Map;

/* loaded from: classes6.dex */
public class AfS4S0111000_5 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS4S0111000_5 afS4S0111000_5, Object obj) {
        UserAttr userAttr;
        Map<Integer, Integer> map;
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = (ModeratorPermissionEditFragment) afS4S0111000_5.l0;
        OSZ osz = new OSZ(Integer.valueOf(afS4S0111000_5.i2), Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(afS4S0111000_5.z1)) ? 1 : 0));
        if (!moderatorPermissionEditFragment.LJLJL && (userAttr = (UserAttr) moderatorPermissionEditFragment.LJLLI.getValue()) != null && (map = userAttr.adminPermissions) != 0) {
            map.put(osz.getFirst(), osz.getSecond());
        }
        ((ModeratorPermissionEditFragment) afS4S0111000_5.l0).Hl(afS4S0111000_5.i2, afS4S0111000_5.z1, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS4S0111000_5 afS4S0111000_5, Object obj) {
        String str;
        UserAttr userAttr;
        Map<Integer, Integer> map;
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = (ModeratorPermissionEditFragmentSheet) afS4S0111000_5.l0;
        OSZ osz = new OSZ(Integer.valueOf(afS4S0111000_5.i2), Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(afS4S0111000_5.z1)) ? 1 : 0));
        if (!moderatorPermissionEditFragmentSheet.LLI && (userAttr = (UserAttr) moderatorPermissionEditFragmentSheet.LLIIII.getValue()) != null && (map = userAttr.adminPermissions) != 0) {
            map.put(osz.getFirst(), osz.getSecond());
        }
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet2 = (ModeratorPermissionEditFragmentSheet) afS4S0111000_5.l0;
        boolean z = afS4S0111000_5.z1;
        int i = afS4S0111000_5.i2;
        moderatorPermissionEditFragmentSheet2.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_moderator_setting_click");
        moderatorPermissionEditFragmentSheet2.Pl(LIZ);
        LIZ.LJIJJ(BJ3.LIZ(i), "setting_name");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        LIZ.LJIJJ(str, "to_status");
        LIZ.LJJIIJZLJL();
    }

    public AfS4S0111000_5(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}

package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.UpdateAdminParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BF5<T> implements InterfaceC15040iS {
    public final /* synthetic */ ModeratorPermissionEditFragmentSheet LIZ;

    public BF5(ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet) {
        this.LIZ = moderatorPermissionEditFragmentSheet;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        C2A7 c2a7 = ((C17240m0) obj).LIZLLL;
        if (c2a7 != null) {
            c2a7.LJII();
        }
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = this.LIZ;
        java.util.Map<C41071jL, Integer> map = moderatorPermissionEditFragmentSheet.LLIFFJFJJ;
        if (map != null) {
            java.util.Set<Map.Entry> entrySet = ((LinkedHashMap) map).entrySet();
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(entrySet, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (Map.Entry entry : entrySet) {
                OSZ osz = new OSZ(Integer.valueOf(((Number) entry.getValue()).intValue()), Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(((CompoundButton) entry.getKey()).isChecked())) ? 1 : 0));
                linkedHashMap.put(osz.getFirst(), osz.getSecond());
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_moderator_confirm");
            moderatorPermissionEditFragmentSheet.Pl(LIZ);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(BJ3.LIZ(((Number) entry2.getKey()).intValue()), entry2.getValue());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C51029K0z.LJJIIZ(linkedHashMap2.size()));
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry3.getKey(), String.valueOf(((Number) entry3.getValue()).intValue()));
            }
            LIZ.LJJIFFI(linkedHashMap3);
            LIZ.LJJIIJZLJL();
            AdminApi adminApi = (AdminApi) C1A.LIZJ(AdminApi.class);
            BFC bfc = moderatorPermissionEditFragmentSheet.LLD;
            if (bfc != null) {
                C1EW.LIZ(adminApi.updateAdminWithExtra(new UpdateAdminParams(3, bfc.LIZ, moderatorPermissionEditFragmentSheet.LLFF, ((Number) moderatorPermissionEditFragmentSheet.LLFII.getValue()).longValue(), linkedHashMap)).LJII(BTJ.LIZIZ(moderatorPermissionEditFragmentSheet))).LJJJLIIL(new AfS54S0200000_5(moderatorPermissionEditFragmentSheet, linkedHashMap, 51), new AfS57S0100000_5(moderatorPermissionEditFragmentSheet, 272));
                return;
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        o.LJIJI("switchPermissionMap");
        throw null;
    }
}

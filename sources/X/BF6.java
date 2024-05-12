package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.UpdateAdminParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BF6 implements View.OnClickListener {
    public final /* synthetic */ C2A7 LJLIL;
    public final /* synthetic */ ModeratorPermissionEditFragment LJLILLLLZI;

    public BF6(C2A7 c2a7, ModeratorPermissionEditFragment moderatorPermissionEditFragment) {
        this.LJLIL = c2a7;
        this.LJLILLLLZI = moderatorPermissionEditFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.LJII();
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = this.LJLILLLLZI;
        java.util.Map<C41071jL, Integer> map = moderatorPermissionEditFragment.LJLJLLL;
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
            moderatorPermissionEditFragment.Al(LIZ);
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
            BFC bfc = moderatorPermissionEditFragment.LJLIL;
            if (bfc != null) {
                C1EW.LIZ(adminApi.updateAdminWithExtra(new UpdateAdminParams(3, bfc.LIZ, moderatorPermissionEditFragment.LJLJI, ((Number) moderatorPermissionEditFragment.LJLJJL.getValue()).longValue(), linkedHashMap)).LJII(BTJ.LIZIZ(moderatorPermissionEditFragment))).LJJJLIIL(new AfS54S0200000_5(moderatorPermissionEditFragment, linkedHashMap, 52), new AfS57S0100000_5(moderatorPermissionEditFragment, 275));
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

package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public final class TSK extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, String>> {
    public static final TSK LJLIL = new TSK();

    public TSK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, String> invoke() {
        String str;
        Integer num;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        U8H LJJZZI;
        C76696U8e LJJIII;
        HashMap<String, String> hashMap = new HashMap<>();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LJJZZI = R6.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (str = LJJIII.getLayoutId()) == null) {
            str = "";
        }
        hashMap.put("layout_id", str);
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJI = R62.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            num = Integer.valueOf(LJJIIZI.size());
        } else {
            num = null;
        }
        hashMap.put("linked_user_count", String.valueOf(num));
        return hashMap;
    }
}

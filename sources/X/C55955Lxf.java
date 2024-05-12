package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55955Lxf extends AbstractC65781Prl implements InterfaceC88472Yns<C55978Ly2, C76800UCe> {
    public static final C55955Lxf LJLIL = new C55955Lxf();

    public C55955Lxf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C55978Ly2 c55978Ly2) {
        C55978Ly2 shopMainState = c55978Ly2;
        o.LJIIIZ(shopMainState, "shopMainState");
        List<ToolEntryVO> LIZ = shopMainState.LJLL.LIZ();
        if (LIZ == null) {
            return null;
        }
        int i = 0;
        for (ToolEntryVO toolEntryVO : LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                ToolEntryVO toolEntryVO2 = toolEntryVO;
                java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("button_name", toolEntryVO2.getButtonName()), new OSZ("actionsheet_name", "mall_tools"), new OSZ("page_struc_type", "tools_in"), new OSZ("item_order", String.valueOf(i2)));
                if (toolEntryVO2.getNotify()) {
                    LJJLIIIIJ.put("notice_number", "");
                    LJJLIIIIJ.put("notice_type", "red_dot");
                }
                C56045Lz7.LIZ.getClass();
                C56045Lz7.LJ(LJJLIIIIJ);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}

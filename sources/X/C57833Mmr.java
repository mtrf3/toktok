package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectangleAuthCellImpl;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectangleLargeAuthCellImpl;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.SquareAuthCellImpl;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.SquareMultiColAuthCellImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57833Mmr implements InterfaceC57841Mmz {
    public final C57859MnH LIZ;

    @Override // X.InterfaceC57841Mmz
    public final Class<? extends PowerCell<?>>[] LIZIZ() {
        Class<? extends PowerCell<?>> cls;
        Class<? extends PowerCell<?>>[] clsArr = new Class[1];
        C57859MnH c57859MnH = this.LIZ;
        o.LJIIIZ(c57859MnH, "<this>");
        int i = c57859MnH.getListConfig().LIZ;
        if (i != 400) {
            if (i == 401) {
                if (((Number) C52343KgV.LIZ.getValue()).intValue() == 1 && C57898Mnu.LJI(c57859MnH)) {
                    cls = RectangleLargeAuthCellImpl.class;
                } else if (C52342KgU.LIZIZ() && C57898Mnu.LJII(c57859MnH)) {
                    cls = SquareMultiColAuthCellImpl.class;
                } else {
                    cls = RectangleAuthCellImpl.class;
                }
            } else {
                "list variant not in [LIST_HORIZONTAL, LIST_VERTICAL]".toString();
                throw new IllegalStateException("list variant not in [LIST_HORIZONTAL, LIST_VERTICAL]");
            }
        } else {
            cls = SquareAuthCellImpl.class;
        }
        clsArr[0] = cls;
        return clsArr;
    }

    public C57833Mmr(C57859MnH config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
    }

    @Override // X.InterfaceC57841Mmz
    public final AbstractC57829Mmn<? extends InterfaceC57927MoN> LIZ(InterfaceC57927MoN element) {
        C57900Mnw c57900Mnw;
        o.LJIIIZ(element, "element");
        if (!(element instanceof C57900Mnw) || (c57900Mnw = (C57900Mnw) element) == null) {
            return null;
        }
        return new C57834Mms(c57900Mnw, this.LIZ.getUiConfig());
    }
}

package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.LargeRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.MultiColSquareRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserVideoCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.SquareRecUserCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Mml, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57827Mml implements InterfaceC57841Mmz {
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
                if (c57859MnH.getUiConfig().LIZ == 102) {
                    cls = RectRecUserVideoCell.class;
                } else if (((Number) C52343KgV.LIZ.getValue()).intValue() == 1 && C57898Mnu.LJI(c57859MnH)) {
                    cls = LargeRectRecUserCell.class;
                } else if (C52342KgU.LIZIZ() && C57898Mnu.LJII(c57859MnH)) {
                    cls = MultiColSquareRecUserCell.class;
                } else {
                    cls = RectRecUserCell.class;
                }
            } else {
                "list variant not in [LIST_HORIZONTAL, LIST_VERTICAL]".toString();
                throw new IllegalStateException("list variant not in [LIST_HORIZONTAL, LIST_VERTICAL]");
            }
        } else {
            cls = SquareRecUserCell.class;
        }
        clsArr[0] = cls;
        return clsArr;
    }

    public C57827Mml(C57859MnH config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
    }

    @Override // X.InterfaceC57841Mmz
    public final AbstractC57829Mmn<? extends InterfaceC57927MoN> LIZ(InterfaceC57927MoN element) {
        RecUser recUser;
        o.LJIIIZ(element, "element");
        if (!(element instanceof RecUser) || (recUser = (RecUser) element) == null) {
            return null;
        }
        return new C57826Mmk(recUser, this.LIZ.getUiConfig());
    }
}

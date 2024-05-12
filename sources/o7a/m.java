package o7a;

import X.C38350F3i;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes13.dex */
public final class m {
    public static void LIZ(String str, p8.a aVar, TuxTextView tuxTextView, ViewGroup.LayoutParams layoutParams) {
        Integer LJJIL;
        Float LJJIJLIJ;
        if (o.LJ(str, "app:tux_font")) {
            String str2 = aVar.LIZ;
            if (str2 == null) {
                return;
            }
            switch (str2.hashCode()) {
                case -2075419153:
                    if (!str2.equals("P3_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(72);
                    return;
                case -1878905648:
                    if (!str2.equals("P2_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(62);
                    return;
                case -1682392143:
                    if (!str2.equals("P1_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(52);
                    return;
                case -1401011141:
                    if (!str2.equals("SmallText2_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(91);
                    return;
                case -781223674:
                    if (!str2.equals("H4_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(42);
                    return;
                case -628105945:
                    if (!str2.equals("H2_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(21);
                    return;
                case -584710169:
                    if (!str2.equals("H3_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(32);
                    return;
                case -521510333:
                    if (!str2.equals("P1_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(53);
                    return;
                case -492881182:
                    if (!str2.equals("P2_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(63);
                    return;
                case -464252031:
                    if (!str2.equals("P3_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(73);
                    return;
                case -392759522:
                    if (!str2.equals("P1_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(51);
                    return;
                case -388196664:
                    if (!str2.equals("H2_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(22);
                    return;
                case -191683159:
                    if (!str2.equals("H1_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(12);
                    return;
                case 51952425:
                    if (!str2.equals("H4_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(41);
                    return;
                case 287298848:
                    if (!str2.equals("P3_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(71);
                    return;
                case 406443322:
                    if (!str2.equals("SmallText1_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(81);
                    return;
                case 968394811:
                    if (!str2.equals("H1_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(13);
                    return;
                case 997023962:
                    if (!str2.equals("H2_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(23);
                    return;
                case 1025653113:
                    if (!str2.equals("H3_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(33);
                    return;
                case 1054282264:
                    if (!str2.equals("H4_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(43);
                    return;
                case 1179348518:
                    if (!str2.equals("H1_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(11);
                    return;
                case 1421546036:
                    if (!str2.equals("SmallText2_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(92);
                    return;
                case 1618059541:
                    if (!str2.equals("SmallText1_Semibold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(82);
                    return;
                case 1721080231:
                    if (!str2.equals("SmallText1_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(83);
                    return;
                case 1749709382:
                    if (!str2.equals("SmallText2_Bold")) {
                        return;
                    }
                    tuxTextView.setTuxFont(93);
                    return;
                case 1859406888:
                    if (!str2.equals("H3_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(31);
                    return;
                case 2094753311:
                    if (!str2.equals("P2_Regular")) {
                        return;
                    }
                    tuxTextView.setTuxFont(61);
                    return;
                default:
                    return;
            }
        }
        if (!o.LJ(str, "app:tux_minTextSize") || !(aVar instanceof a.d)) {
            return;
        }
        String str3 = aVar.LIZ;
        String str4 = ((a.d) aVar).LIZIZ;
        if (o.LJ(str4, "dp")) {
            if (str3 != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str3)) != null) {
                tuxTextView.setMinTextSize(LJJIJLIJ.floatValue());
                return;
            }
            return;
        }
        if (!o.LJ(str4, "px") || str3 == null || (LJJIL = C38350F3i.LJJIL(str3)) == null) {
            return;
        }
        tuxTextView.setMinTextSizePx(LJJIL.intValue());
    }
}

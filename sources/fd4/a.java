package fd4;

import X.C16880lQ;
import X.C80684VlY;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class a {
    public int LIZ;
    public int LIZIZ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    public final void LIZ(String str, p8.a aVar, C80684VlY c80684VlY, ViewGroup.LayoutParams layoutParams) {
        int i;
        Context context = c80684VlY.getContext();
        String LJ = q8.a.LJ(str);
        switch (LJ.hashCode()) {
            case -1961467498:
                if (LJ.equals("fadingEdge")) {
                    if (o.LJ("horizontal", aVar.LIZ)) {
                        c80684VlY.setHorizontalFadingEdgeEnabled(true);
                        return;
                    } else {
                        if (o.LJ("vertical", aVar.LIZ)) {
                            c80684VlY.setVerticalFadingEdgeEnabled(true);
                            return;
                        }
                        return;
                    }
                }
                q8.a.LJFF(c80684VlY.getContext(), C16880lQ.LJLLJ(a.class), str);
                throw null;
            case -1554954719:
                if (LJ.equals("tabTextColor")) {
                    o.LJIIIIZZ(context, "context");
                    this.LIZIZ = q8.a.LIZIZ(context, aVar);
                    return;
                }
                q8.a.LJFF(c80684VlY.getContext(), C16880lQ.LJLLJ(a.class), str);
                throw null;
            case 292665719:
                if (LJ.equals("tux_font")) {
                    String str2 = aVar.LIZ;
                    o.LJIIIIZZ(str2, "params.value");
                    switch (str2.hashCode()) {
                        case -2075419153:
                            if (str2.equals("P3_Semibold")) {
                                i = 72;
                                break;
                            } else {
                                return;
                            }
                        case -1878905648:
                            if (str2.equals("P2_Semibold")) {
                                i = 62;
                                break;
                            } else {
                                return;
                            }
                        case -1682392143:
                            if (str2.equals("P1_Semibold")) {
                                i = 52;
                                break;
                            } else {
                                return;
                            }
                        case -1401011141:
                            if (str2.equals("SmallText2_Regular")) {
                                i = 91;
                                break;
                            } else {
                                return;
                            }
                        case -781223674:
                            if (str2.equals("H4_Semibold")) {
                                i = 42;
                                break;
                            } else {
                                return;
                            }
                        case -628105945:
                            if (str2.equals("H2_Regular")) {
                                i = 21;
                                break;
                            } else {
                                return;
                            }
                        case -584710169:
                            if (str2.equals("H3_Semibold")) {
                                i = 32;
                                break;
                            } else {
                                return;
                            }
                        case -521510333:
                            if (str2.equals("P1_Bold")) {
                                i = 53;
                                break;
                            } else {
                                return;
                            }
                        case -492881182:
                            if (str2.equals("P2_Bold")) {
                                i = 63;
                                break;
                            } else {
                                return;
                            }
                        case -464252031:
                            if (str2.equals("P3_Bold")) {
                                i = 73;
                                break;
                            } else {
                                return;
                            }
                        case -392759522:
                            if (str2.equals("P1_Regular")) {
                                i = 51;
                                break;
                            } else {
                                return;
                            }
                        case -388196664:
                            if (str2.equals("H2_Semibold")) {
                                i = 22;
                                break;
                            } else {
                                return;
                            }
                        case -191683159:
                            if (str2.equals("H1_Semibold")) {
                                i = 12;
                                break;
                            } else {
                                return;
                            }
                        case 51952425:
                            if (str2.equals("H4_Regular")) {
                                i = 41;
                                break;
                            } else {
                                return;
                            }
                        case 287298848:
                            if (str2.equals("P3_Regular")) {
                                i = 71;
                                break;
                            } else {
                                return;
                            }
                        case 406443322:
                            if (str2.equals("SmallText1_Regular")) {
                                i = 81;
                                break;
                            } else {
                                return;
                            }
                        case 968394811:
                            if (str2.equals("H1_Bold")) {
                                i = 13;
                                break;
                            } else {
                                return;
                            }
                        case 997023962:
                            if (str2.equals("H2_Bold")) {
                                i = 23;
                                break;
                            } else {
                                return;
                            }
                        case 1025653113:
                            if (str2.equals("H3_Bold")) {
                                i = 33;
                                break;
                            } else {
                                return;
                            }
                        case 1054282264:
                            if (str2.equals("H4_Bold")) {
                                i = 43;
                                break;
                            } else {
                                return;
                            }
                        case 1179348518:
                            if (str2.equals("H1_Regular")) {
                                i = 11;
                                break;
                            } else {
                                return;
                            }
                        case 1421546036:
                            if (str2.equals("SmallText2_Semibold")) {
                                i = 92;
                                break;
                            } else {
                                return;
                            }
                        case 1618059541:
                            if (str2.equals("SmallText1_Semibold")) {
                                i = 82;
                                break;
                            } else {
                                return;
                            }
                        case 1721080231:
                            if (str2.equals("SmallText1_Bold")) {
                                i = 83;
                                break;
                            } else {
                                return;
                            }
                        case 1749709382:
                            if (str2.equals("SmallText2_Bold")) {
                                i = 93;
                                break;
                            } else {
                                return;
                            }
                        case 1859406888:
                            if (str2.equals("H3_Regular")) {
                                i = 31;
                                break;
                            } else {
                                return;
                            }
                        case 2094753311:
                            if (str2.equals("P2_Regular")) {
                                i = 61;
                                break;
                            } else {
                                return;
                            }
                        default:
                            return;
                    }
                    c80684VlY.setTabTuxFont(i);
                    return;
                }
                q8.a.LJFF(c80684VlY.getContext(), C16880lQ.LJLLJ(a.class), str);
                throw null;
            case 1771050694:
                if (LJ.equals("tabSelectedTextColor")) {
                    o.LJIIIIZZ(context, "context");
                    this.LIZ = q8.a.LIZIZ(context, aVar);
                    return;
                }
                q8.a.LJFF(c80684VlY.getContext(), C16880lQ.LJLLJ(a.class), str);
                throw null;
            default:
                q8.a.LJFF(c80684VlY.getContext(), C16880lQ.LJLLJ(a.class), str);
                throw null;
        }
    }
}

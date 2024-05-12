package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102073zX {
    public InterfaceC99713vj LIZ;
    public C99033ud LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1003));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C102133zd.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C102143ze.LJLIL);

    public final C63120Opw LIZ() {
        String str;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C99033ud c99033ud = this.LIZIZ;
        if (c99033ud != null) {
            str = c99033ud.getConversationId();
        } else {
            str = null;
        }
        return c4wc.LIZ(str);
    }

    public final List<C109544Rq> LIZIZ() {
        return (List) this.LIZLLL.getValue();
    }

    public final NextLiveData<C102093zZ> LIZJ() {
        return (NextLiveData) this.LJ.getValue();
    }

    public static void LJ(C102073zX c102073zX, int i) {
        int i2;
        String str;
        C102093zZ value = c102073zX.LIZJ().getValue();
        if (value != null) {
            value.LIZIZ = i;
            ((List) value.LIZJ.getValue()).clear();
            c102073zX.LIZJ().setValue(c102073zX.LIZJ().getValue());
            C102083zY c102083zY = (C102083zY) c102073zX.LIZJ.getValue();
            if (c102083zY != null) {
                C109544Rq message = value.LIZ;
                o.LJIIIZ(message, "message");
                if (i == -1) {
                    C34B.LIZIZ("ReadStateReporter", "reportReadState state non");
                    return;
                }
                if (c102083zY.LIZ.isGroupChat() && i == 1) {
                    i2 = 2;
                } else {
                    i2 = i;
                }
                if (o.LJ(c102083zY.LIZIZ, message) && c102083zY.LIZJ == i2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("reportReadState state same to last: ");
                    LIZ.append(i2);
                    LIZ.append(", ");
                    LIZ.append(i);
                    C34B.LIZIZ("ReadStateReporter", X1D.LIZIZ(LIZ));
                    return;
                }
                c102083zY.LIZIZ = message;
                c102083zY.LIZJ = i2;
                if (i2 != 0) {
                    if (i2 != 2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("reportReadState invalid read state: ");
                        LIZ2.append(i2);
                        LIZ2.append(", ");
                        LIZ2.append(i);
                        C34B.LIZIZ("ReadStateReporter", X1D.LIZIZ(LIZ2));
                        str = "";
                    } else {
                        str = "read";
                    }
                } else {
                    str = "send";
                }
                c102083zY.LIZIZ(str);
            }
        }
    }

    public final boolean LIZLLL(C109544Rq c109544Rq, Integer num) {
        if (c109544Rq == null) {
            LIZJ().setValue(null);
            return true;
        }
        if (LIZJ().getValue() != null) {
            C102093zZ value = LIZJ().getValue();
            o.LJI(value);
            if (o.LJ(c109544Rq, value.LIZ)) {
                C102093zZ value2 = LIZJ().getValue();
                o.LJI(value2);
                value2.LIZ = c109544Rq;
                return false;
            }
        }
        C99033ud c99033ud = this.LIZIZ;
        if (c99033ud != null) {
            NextLiveData<C102093zZ> LIZJ = LIZJ();
            C102093zZ c102093zZ = new C102093zZ(c109544Rq, c99033ud);
            if (num != null) {
                c102093zZ.LIZIZ = num.intValue();
            }
            LIZJ.setValue(c102093zZ);
        }
        return true;
    }
}

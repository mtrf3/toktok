package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Co9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32433Co9 {
    public static final C32434CoA LIZ = new C32434CoA(true);
    public static final C32434CoA LIZIZ = new C32434CoA(false);

    public static void LJ() {
        C32441CoH.LIZ("reset");
        LIZ(true);
        LIZ(false);
    }

    public static void LIZ(boolean z) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dump\n");
        C32434CoA c32434CoA = LIZ;
        LIZ2.append(c32434CoA.LIZJ());
        LIZ2.append('\n');
        C32434CoA c32434CoA2 = LIZIZ;
        LIZ2.append(c32434CoA2.LIZJ());
        C32441CoH.LIZ(X1D.LIZIZ(LIZ2));
        C32441CoH.LIZ("clear");
        if (z) {
            c32434CoA.LIZIZ = 0;
            c32434CoA.LIZJ = 0;
            c32434CoA.LIZLLL = 0;
            c32434CoA.LJ = 0;
            c32434CoA.LJFF = 0;
            c32434CoA.LJI = 0;
            return;
        }
        c32434CoA2.LIZIZ = 0;
        c32434CoA2.LIZJ = 0;
        c32434CoA2.LIZLLL = 0;
        c32434CoA2.LJ = 0;
        c32434CoA2.LJFF = 0;
        c32434CoA2.LJI = 0;
    }

    public static void LIZIZ(JSONObject jSONObject) {
        C32434CoA c32434CoA = LIZ;
        int i = c32434CoA.LIZIZ;
        C32434CoA c32434CoA2 = LIZIZ;
        jSONObject.put("queue_size", i + c32434CoA2.LIZIZ);
        jSONObject.put("self_queue_size", c32434CoA.LIZIZ);
        jSONObject.put("others_queue_size", c32434CoA2.LIZIZ);
        jSONObject.put("queue_node_count", c32434CoA.LIZJ + c32434CoA2.LIZJ);
        jSONObject.put("self_queue_node_count", c32434CoA.LIZJ);
        jSONObject.put("others_queue_node_count", c32434CoA2.LIZJ);
        jSONObject.put("small_gift_node_count", c32434CoA.LIZLLL + c32434CoA2.LIZLLL);
        jSONObject.put("70_5200_node_count", c32434CoA.LJ + c32434CoA2.LJ);
        jSONObject.put("5200_30000_node_count", c32434CoA.LJFF + c32434CoA2.LJFF);
        jSONObject.put("more_than_30000_node_count", c32434CoA.LJI + c32434CoA2.LJI);
    }

    public static void LIZJ(C78072UkW msg, boolean z) {
        o.LJIIIZ(msg, "msg");
        C32441CoH.LIZ("onAdd");
        C32434CoA c32434CoA = LIZ;
        C32434CoA c32434CoA2 = LIZIZ;
        if (z) {
            c32434CoA.LIZ(msg);
        } else {
            c32434CoA2.LIZ(msg);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dump\n");
        LIZ2.append(c32434CoA.LIZJ());
        LIZ2.append('\n');
        LIZ2.append(c32434CoA2.LIZJ());
        C32441CoH.LIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LIZLLL(C78072UkW c78072UkW, boolean z) {
        C32441CoH.LIZ("onRemove");
        C32434CoA c32434CoA = LIZ;
        C32434CoA c32434CoA2 = LIZIZ;
        if (z) {
            c32434CoA.LIZIZ(c78072UkW);
        } else {
            c32434CoA2.LIZIZ(c78072UkW);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dump\n");
        LIZ2.append(c32434CoA.LIZJ());
        LIZ2.append('\n');
        LIZ2.append(c32434CoA2.LIZJ());
        C32441CoH.LIZ(X1D.LIZIZ(LIZ2));
    }
}

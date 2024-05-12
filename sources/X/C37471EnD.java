package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.EnD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37471EnD implements InterfaceC37466En8 {
    public static final List<EventName> LIZJ = Arrays.asList(EventName.NavigateStart, EventName.WorkerEnvironmentInitializeStart, EventName.WorkerEnvironmentInitializeEnd, EventName.WorkerScriptRequestStart, EventName.WorkerScriptRequestEnd, EventName.WorkerExecuteStart);
    public final m LIZ = new m();
    public final java.util.Set<EventName> LIZIZ = new HashSet(LIZJ);

    public void LIZ() {
        throw null;
    }

    @Override // X.InterfaceC37466En8
    public final boolean LIZIZ() {
        return ((HashSet) this.LIZIZ).isEmpty();
    }

    @Override // X.BQ6
    public final void accept(Tracing.Event event) {
        Tracing.Event event2 = event;
        if (LIZIZ()) {
            return;
        }
        if (!((HashSet) this.LIZIZ).contains(event2.name)) {
            return;
        }
        ((HashSet) this.LIZIZ).remove(event2.name);
        switch (C37472EnE.LIZ[event2.name.ordinal()]) {
            case 1:
                LIZJ(event2, "NAVS", "t");
                break;
            case 2:
                LIZJ(event2, "WEI", "s");
                break;
            case 3:
                LIZJ(event2, "WEI", "e");
                break;
            case 4:
                LIZJ(event2, "RW", "s");
                break;
            case 5:
                LIZJ(event2, "RW", "e");
                break;
            case 6:
                LIZJ(event2, "WR", "t");
                break;
        }
        if (!LIZIZ()) {
            return;
        }
        LIZ();
    }

    public final void LIZJ(Tracing.Event event, String str, String str2) {
        m mVar;
        j LJJIJ = this.LIZ.LJJIJ(str);
        if (LJJIJ != null && (LJJIJ instanceof m)) {
            mVar = LJJIJ.LJIIZILJ();
        } else {
            mVar = new m();
        }
        mVar.LJJIIJ(str2, event.timestamp);
        j jsonTree = GsonProtectorUtils.toJsonTree(GsonUtils.LIZIZ(), event.args);
        jsonTree.getClass();
        if (jsonTree instanceof m) {
            for (Map.Entry<String, j> entry : jsonTree.LJIIZILJ().entrySet()) {
                mVar.LJJII(entry.getKey(), entry.getValue());
            }
        }
        this.LIZ.LJJII(str, mVar);
    }
}

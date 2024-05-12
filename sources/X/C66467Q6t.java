package X;

import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q6t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66467Q6t extends BaseState {
    public final List<Q79> LIZIZ = new ArrayList();

    @Override // X.Q7F
    public final String getName() {
        return "BuildingState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJFF() {
        ((ArrayList) this.LIZIZ).add(PTM.LJI(this.LIZ.LJ));
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            Q79 q79 = (Q79) it.next();
            C66465Q6r.LJIILLIIL.getClass();
            q79.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZJ(Q7F q7f) {
        PSY.LJFF("BuildingState", "exitState: ");
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        if (q7f.getClass() == C66469Q6v.class) {
            PSY.LIZLLL("BuildingState", "find last building abnormal exit");
            Iterator it = ((ArrayList) this.LIZIZ).iterator();
            while (it.hasNext()) {
                ((Q79) it.next()).clearAll();
            }
            PSY.LJFF("BuildingState", "cleanAllSnapshot: ");
            this.LIZ.LJFF();
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            Q79 q79 = (Q79) it2.next();
            Boolean valueOf = Boolean.valueOf(q79.LJ());
            if (!valueOf.booleanValue()) {
                stringBuffer.append(",SettingAndAB");
                q79.getName();
            }
            StringBuilder LIZ = X1D.LIZ();
            q79.getName();
            LIZ.append("SettingAndAB");
            LIZ.append(" makeSnapshot ");
            LIZ.append(valueOf);
            PSY.LJFF("BuildingState", X1D.LIZIZ(LIZ));
        }
        if (stringBuffer.length() > 0) {
            String substring = stringBuffer.substring(1);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cf_names", substring);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            SafeModeReporter.LIZJ("safemode_make_snapshot_fail", jSONObject);
        }
        this.LIZ.LJIIIIZZ();
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZ(long j, String str, String str2) {
        PSY.LIZLLL("BuildingState", "find exception in building");
    }
}

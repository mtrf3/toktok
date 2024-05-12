package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fro, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40304Fro implements IEvent {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;
    public final String LJLJI;
    public final Object LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40304Fro)) {
            return false;
        }
        C40304Fro c40304Fro = (C40304Fro) obj;
        return o.LJ(this.LJLIL, c40304Fro.LJLIL) && o.LJ(this.LJLILLLLZI, c40304Fro.LJLILLLLZI) && o.LJ(this.LJLJI, c40304Fro.LJLJI) && o.LJ(this.LJLJJI, c40304Fro.LJLJJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        JSONObject jSONObject = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.LJLJJI;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsBridgeEvent(funcName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", params=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", callbackId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", jsBridge=");
        return U26.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C40304Fro(Object obj, String funcName, String str, JSONObject jSONObject) {
        o.LJIIIZ(funcName, "funcName");
        this.LJLIL = funcName;
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = str;
        this.LJLJJI = obj;
    }
}

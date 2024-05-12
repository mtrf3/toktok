package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.LRi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54262LRi implements IEvent {
    public final java.util.Map<Integer, Integer> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public final boolean LIZJ() {
        if (this.LJLIL.containsKey(29999) || this.LJLIL.containsKey(19999) || this.LJLIL.containsKey(30000)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent post() {
        if (this.LJLIL.isEmpty()) {
            return this;
        }
        C2U8.LIZ(this);
        o.LJIIIIZZ(this, "super.post()");
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final IEvent postSticky() {
        if (this.LJLIL.isEmpty()) {
            return this;
        }
        C2U8.LIZIZ(this);
        o.LJIIIIZZ(this, "super.postSticky()");
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LJLILLLLZI);
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            int intValue2 = ((Number) entry.getValue()).intValue();
            sb.append(" ");
            sb.append(intValue);
            sb.append(",");
            sb.append(intValue2);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public C54262LRi(int i) {
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = i;
        this.LJLJI = 100;
    }

    public final boolean LIZ(int i) {
        return this.LJLIL.containsKey(Integer.valueOf(i));
    }

    public final int LIZIZ(int i) {
        Integer num = this.LJLIL.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C54262LRi(int i, int i2) {
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = 2;
        this.LJLJI = i;
    }

    public final void LIZLLL(int i, int i2) {
        this.LJLIL.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PIB extends PIC {
    public final List<JSONObject> LJ;
    public final List<String> LJFF;
    public final AtomicBoolean LJI;

    public PIB(PIE pie) {
        super(pie);
        this.LJ = new CopyOnWriteArrayList();
        this.LJFF = new CopyOnWriteArrayList();
        this.LJI = new AtomicBoolean(false);
    }

    @Override // X.PIC
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null) {
            return;
        }
        if (this.LJI.get()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(jSONObject);
            LIZ.append(" is end after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
            X1D.LIZIZ(LIZ);
            return;
        }
        try {
            PDY pdy = PDY.LIZJ;
            PIE pie = this.LIZJ;
            if (!pdy.LIZ(pie.LIZ, pie.LJFF) && !this.LIZJ.LJFF && C64082PDa.LIZIZ().LJLIL && C64082PDa.LIZIZ().LIZJ(this.LIZJ.LIZ, z) == 0) {
                return;
            }
            LIZJ(jSONObject, z);
            if (!((CopyOnWriteArrayList) this.LJFF).contains(str)) {
                ((CopyOnWriteArrayList) this.LJ).add(jSONObject);
                ((CopyOnWriteArrayList) this.LJFF).add(str);
            } else {
                ListProtector.set(this.LJ, ((CopyOnWriteArrayList) this.LJFF).indexOf(str), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }
}

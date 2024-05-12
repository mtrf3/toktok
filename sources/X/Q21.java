package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class Q21 extends Q20 {
    public final ArrayList<Pattern> LIZJ = new ArrayList<>();

    public Q21(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            try {
                this.LIZJ.add(PatternProtector.compile(it.next()));
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.Q20
    public final boolean LIZIZ(C66343Q1z c66343Q1z) {
        Q28 LIZ = c66343Q1z.LIZ(this);
        if (super.LIZIZ(c66343Q1z) && LIZ.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // X.Q20
    public final void LJ(C66343Q1z c66343Q1z, Q20 q20) {
        c66343Q1z.LIZ(this).LIZ = true;
        Q28 LIZ = c66343Q1z.LIZ(this);
        try {
            String str = (String) q20.LIZLLL(c66343Q1z);
            Iterator<Pattern> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                if (it.next().matcher(str).matches()) {
                    LIZ.LIZIZ = true;
                    return;
                }
            }
        } catch (Exception unused) {
            LIZ.LIZIZ = false;
        }
    }
}

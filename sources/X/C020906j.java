package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.06j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C020906j implements Iterable<Intent> {
    public final ArrayList<Intent> LJLIL = new ArrayList<>();
    public final Context LJLILLLLZI;

    public final void LJFF() {
        if (!this.LJLIL.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.LJLIL.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            C04250Er.LIZ(this.LJLILLLLZI, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.LJLIL.iterator();
    }

    public C020906j(Context context) {
        this.LJLILLLLZI = context;
    }

    public final void LIZJ(ComponentName componentName) {
        int size = this.LJLIL.size();
        try {
            Intent LIZIZ = C021806s.LIZIZ(this.LJLILLLLZI, componentName);
            while (LIZIZ != null) {
                ListProtector.add(this.LJLIL, size, LIZIZ);
                LIZIZ = C021806s.LIZIZ(this.LJLILLLLZI, LIZIZ.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

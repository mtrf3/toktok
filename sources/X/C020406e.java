package X;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.06e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C020406e {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZLLL;
    public final Bundle LJFF;
    public final java.util.Set<String> LJI;
    public final CharSequence[] LIZJ = null;
    public final int LJ = 0;

    public static RemoteInput LIZ(C020406e c020406e) {
        java.util.Set<String> set;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(c020406e.LIZ).setLabel(c020406e.LIZIZ).setChoices(c020406e.LIZJ).setAllowFreeFormInput(c020406e.LIZLLL).addExtras(c020406e.LJFF);
        if (Build.VERSION.SDK_INT >= 26 && (set = c020406e.LJI) != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                C020106b.LIZLLL(addExtras, it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C020206c.LIZIZ(addExtras, c020406e.LJ);
        }
        return addExtras.build();
    }

    public C020406e(String str, CharSequence charSequence, boolean z, Bundle bundle, java.util.Set set) {
        this.LIZ = str;
        this.LIZIZ = charSequence;
        this.LIZLLL = z;
        this.LJFF = bundle;
        this.LJI = set;
    }
}

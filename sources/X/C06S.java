package X;

import android.os.PersistableBundle;

/* renamed from: X.06S, reason: invalid class name */
/* loaded from: classes.dex */
public class C06S {
    public static C06V LIZ(PersistableBundle persistableBundle) {
        C06U c06u = new C06U();
        c06u.LIZ = persistableBundle.getString("name");
        c06u.LIZJ = persistableBundle.getString("uri");
        c06u.LIZLLL = persistableBundle.getString("key");
        c06u.LJ = persistableBundle.getBoolean("isBot");
        c06u.LJFF = persistableBundle.getBoolean("isImportant");
        return new C06V(c06u);
    }

    public static PersistableBundle LIZIZ(C06V c06v) {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = c06v.LIZ;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        persistableBundle.putString("name", str);
        persistableBundle.putString("uri", c06v.LIZJ);
        persistableBundle.putString("key", c06v.LIZLLL);
        persistableBundle.putBoolean("isBot", c06v.LJ);
        persistableBundle.putBoolean("isImportant", c06v.LJFF);
        return persistableBundle;
    }
}

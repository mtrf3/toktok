package X;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.06T, reason: invalid class name */
/* loaded from: classes.dex */
public class C06T {
    public static C06V LIZ(Person person) {
        C06U c06u = new C06U();
        c06u.LIZ = person.getName();
        IconCompat iconCompat = null;
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            icon.getClass();
            int LIZJ = C07B.LIZJ(icon);
            if (LIZJ != 2) {
                if (LIZJ != 4) {
                    if (LIZJ != 6) {
                        iconCompat = new IconCompat(-1);
                        iconCompat.LIZIZ = icon;
                    } else {
                        android.net.Uri LIZLLL = C07B.LIZLLL(icon);
                        LIZLLL.getClass();
                        String uri = LIZLLL.toString();
                        uri.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.LIZIZ = uri;
                    }
                } else {
                    android.net.Uri LIZLLL2 = C07B.LIZLLL(icon);
                    LIZLLL2.getClass();
                    String uri2 = LIZLLL2.toString();
                    uri2.getClass();
                    iconCompat = new IconCompat(4);
                    iconCompat.LIZIZ = uri2;
                }
            } else {
                iconCompat = IconCompat.LIZJ(null, C07B.LIZIZ(icon), C07B.LIZ(icon));
            }
        }
        c06u.LIZIZ = iconCompat;
        c06u.LIZJ = person.getUri();
        c06u.LIZLLL = person.getKey();
        c06u.LJ = person.isBot();
        c06u.LJFF = person.isImportant();
        return new C06V(c06u);
    }

    public static Person LIZIZ(C06V c06v) {
        Person.Builder name = new Person.Builder().setName(c06v.LIZ);
        IconCompat iconCompat = c06v.LIZIZ;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.LJIIIIZZ(null);
        }
        return name.setIcon(icon).setUri(c06v.LIZJ).setKey(c06v.LIZLLL).setBot(c06v.LJ).setImportant(c06v.LJFF).build();
    }
}

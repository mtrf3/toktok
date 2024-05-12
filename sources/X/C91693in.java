package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.3in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91693in<T> implements Comparator {
    public static final C91693in<T> LJLIL = new C91693in<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        IMUser iMUser = (IMUser) obj;
        IMUser iMUser2 = (IMUser) obj2;
        String initialLetter = iMUser.getInitialLetter();
        o.LJIIIIZZ(initialLetter, "u1.initialLetter");
        Character LLFZ = C40689Fy1.LLFZ(initialLetter);
        boolean z2 = false;
        if (LLFZ != null) {
            z = Character.isLetter(LLFZ.charValue());
        } else {
            z = false;
        }
        String initialLetter2 = iMUser2.getInitialLetter();
        o.LJIIIIZZ(initialLetter2, "u2.initialLetter");
        Character LLFZ2 = C40689Fy1.LLFZ(initialLetter2);
        if (LLFZ2 != null) {
            z2 = Character.isLetter(LLFZ2.charValue());
        }
        if (z) {
            if (!z2) {
                return -1;
            }
        } else if (z2) {
            return 1;
        }
        if (o.LJ(iMUser.getInitialLetter(), iMUser2.getInitialLetter())) {
            String displayName = iMUser.getDisplayName();
            String str = "";
            if (displayName == null) {
                displayName = "";
            }
            Locale locale = Locale.ROOT;
            String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", displayName, locale, "this as java.lang.String).toLowerCase(locale)");
            String displayName2 = iMUser2.getDisplayName();
            if (displayName2 != null) {
                str = displayName2;
            }
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return LIZIZ.compareTo(lowerCase);
        }
        String initialLetter3 = iMUser.getInitialLetter();
        String initialLetter4 = iMUser2.getInitialLetter();
        o.LJIIIIZZ(initialLetter4, "u2.initialLetter");
        return initialLetter3.compareTo(initialLetter4);
    }
}

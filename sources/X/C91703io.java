package X;

import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.3io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91703io<T> implements Comparator {
    public static final C91703io<T> LJLIL = new C91703io<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        IMConversation iMConversation = (IMConversation) obj;
        IMConversation iMConversation2 = (IMConversation) obj2;
        String initialLetter = iMConversation.getInitialLetter();
        o.LJIIIIZZ(initialLetter, "u1.initialLetter");
        Character LLFZ = C40689Fy1.LLFZ(initialLetter);
        boolean z2 = false;
        if (LLFZ != null) {
            z = Character.isLetter(LLFZ.charValue());
        } else {
            z = false;
        }
        String initialLetter2 = iMConversation2.getInitialLetter();
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
        if (o.LJ(iMConversation.getInitialLetter(), iMConversation2.getInitialLetter())) {
            String displayName = iMConversation.getDisplayName();
            String str = "";
            if (displayName == null) {
                displayName = "";
            }
            Locale locale = Locale.ROOT;
            String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", displayName, locale, "this as java.lang.String).toLowerCase(locale)");
            String displayName2 = iMConversation2.getDisplayName();
            if (displayName2 != null) {
                str = displayName2;
            }
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return LIZIZ.compareTo(lowerCase);
        }
        String initialLetter3 = iMConversation.getInitialLetter();
        String initialLetter4 = iMConversation2.getInitialLetter();
        o.LJIIIIZZ(initialLetter4, "u2.initialLetter");
        return initialLetter3.compareTo(initialLetter4);
    }
}
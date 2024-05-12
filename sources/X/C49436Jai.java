package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.config.UserRelationTagStyle;

/* renamed from: X.Jai, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49436Jai {
    public static final UserRelationTagStyle LIZ = new UserRelationTagStyle(0, null, null, null, null, 31, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49437Jaj.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C49441Jan.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C49440Jam.LJLIL);
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;

    static {
        C221108m2.LIZIZ(C49442Jao.LJLIL);
        LJ = C221108m2.LIZIZ(C49439Jal.LJLIL);
        LJFF = C221108m2.LIZIZ(C49438Jak.LJLIL);
    }

    public static UserRelationTagStyle LIZJ() {
        return (UserRelationTagStyle) LIZIZ.getValue();
    }

    public static Drawable LIZ(boolean z) {
        Integer LJJJIL;
        if (z) {
            LJJJIL = C78897Uxp.LJJJIL(LIZJ().darkBackgroundColor);
        } else {
            LJJJIL = C78897Uxp.LJJJIL(LIZJ().backgroundColor);
        }
        if (LJJJIL != null) {
            return C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(2), LJJJIL.intValue());
        }
        return null;
    }

    public static Integer LIZIZ(boolean z) {
        if (z) {
            return C78897Uxp.LJJJIL(LIZJ().darkFontColor);
        }
        return C78897Uxp.LJJJIL(LIZJ().fontColor);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import kotlin.jvm.internal.o;

/* renamed from: X.Xza, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86650Xza extends C86669Xzt {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C62822Ol8 LJ;

    public final void LJII(C188727au c188727au) {
        String str = this.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("author_id", str3);
        String str4 = this.LIZLLL;
        if (str4 != null) {
            str2 = str4;
        }
        c188727au.LJIIIZ("enter_from", str2);
    }

    public final void LJIIIIZZ(C188727au c188727au) {
        int i;
        Aweme aweme = this.LIZ;
        if (aweme != null && C86670Xzu.LJII(aweme) != null) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "has_subtitle");
    }

    public final void LJIIIZ(C188727au c188727au) {
        String str;
        AutocaptionType LJII;
        Aweme aweme = this.LIZ;
        if (aweme == null || (LJII = C86670Xzu.LJII(aweme)) == null || (str = LJII.getLanguage()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("subtitle_lang", str);
    }

    public final void LJIIJ(C188727au c188727au) {
        String str;
        AutocaptionType LJII;
        Aweme aweme = this.LIZ;
        if (aweme != null && (LJII = C86670Xzu.LJII(aweme)) != null) {
            str = LJII.getLanguage();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("subtitle_source_lang", str);
    }

    public final void LJIIJJI(C188727au c188727au) {
        String str;
        Aweme aweme = this.LIZ;
        if (aweme != null && C86670Xzu.LJII(aweme) != null) {
            str = "sticker_creator";
        } else {
            str = "";
        }
        c188727au.LJIIIZ("subtitle_type", str);
    }

    public final void LJIIL(EnumC86777Y3x enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        LJII(c188727au);
        c188727au.LIZLLL(0, "use_transl");
        C86669Xzt.LIZ(c188727au, enterMethod);
        LJIIJJI(c188727au);
        LJIIIZ(c188727au);
        LJIIJ(c188727au);
        LIZLLL(c188727au);
        C86669Xzt.LJFF(c188727au);
        LJIIIIZZ(c188727au);
        LJ(c188727au, true, null);
        c188727au.LIZLLL(1 ^ (CaptionKevaServiceImpl.LJJJJI().LJJI() ? 1 : 0), "is_to_turn_on");
        FMX.LJIIL("show_subtitle_options", c188727au.LIZ);
    }

    public C86650Xza(Aweme aweme, String str, String str2, String str3) {
        super(aweme);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = C221108m2.LIZIZ(C86651Xzb.LJLIL);
    }
}

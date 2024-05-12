package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86661Xzl extends C86669Xzt {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C62822Ol8 LJ;

    public static C188727au LJIIJ(C188727au c188727au) {
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        if (LIZIZ.isEmpty()) {
            return c188727au;
        }
        c188727au.LJI("search_keyword", (String) LIZIZ.get("search_keyword"));
        c188727au.LJI("search_id", (String) LIZIZ.get("search_id"));
        c188727au.LJI("search_type", (String) LIZIZ.get("search_type"));
        return c188727au;
    }

    public final void LJIIIZ(C188727au c188727au) {
        int i;
        Aweme aweme = this.LIZ;
        if (aweme != null && C86670Xzu.LJIIIIZZ(aweme) != null) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "has_subtitle");
    }

    public final void LJIIL(C188727au c188727au) {
        String str;
        CaptionItemModel LJIIIIZZ;
        Aweme aweme = this.LIZ;
        if (aweme != null && (LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme)) != null) {
            str = LJIIIIZZ.getLanguageName();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("subtitle_source_lang", str);
    }

    public final void LJIILIIL(C188727au c188727au) {
        c188727au.LJIIIZ("subtitle_type", C86670Xzu.LJIIJJI(this.LIZ));
    }

    public final C188727au LJIILJJIL(C188727au c188727au) {
        c188727au.LIZLLL(C86670Xzu.LJIJI(this.LIZ), "use_transl");
        return c188727au;
    }

    public final void LJII(C188727au c188727au, String str) {
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("group_id", str2);
        String str3 = this.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("author_id", str3);
        if (str == null && (str = this.LIZLLL) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
    }

    public final void LJIIIIZZ(C188727au c188727au, boolean z) {
        c188727au.LIZLLL(C86670Xzu.LJIILLIIL(this.LIZ, z), "cla_subtitle_type");
    }

    public final void LJIIJJI(C188727au c188727au, boolean z) {
        c188727au.LJIIIZ("subtitle_lang", C86670Xzu.LIZLLL(this.LIZ, z));
    }

    public final void LJIILL(Context context, boolean z) {
        C188727au c188727au = new C188727au();
        LJII(c188727au, null);
        LJIILIIL(c188727au);
        LJIIJJI(c188727au, z);
        LJIIL(c188727au);
        c188727au.LIZLLL(LJI(c188727au) ? 1 : 0, "have_transl");
        LJIILJJIL(c188727au);
        LJIIIZ(c188727au);
        c188727au.LIZLLL(0, "have_tts");
        c188727au.LIZLLL(0, "use_tts");
        LJIIIIZZ(c188727au, z);
        LJIIJ(c188727au);
        LIZLLL(c188727au);
        c188727au.LIZLLL(!z ? 1 : 0, "use_transl");
        c188727au.LIZLLL(C79004UzY.LJJJIL(context, this.LIZ), "is_landscape_screen");
        FMX.LJIIL("click_subtitle", c188727au.LIZ);
    }

    public C86661Xzl(String str, String str2, String str3, Aweme aweme) {
        super(aweme);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = C221108m2.LIZIZ(C86666Xzq.LJLIL);
    }

    public final void LJIILLIIL(boolean z, EnumC86777Y3x enterMethod, int i, Integer num, Float f) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        LJII(c188727au, null);
        LJIILIIL(c188727au);
        LJIIJJI(c188727au, z);
        LJIIL(c188727au);
        C86669Xzt.LIZ(c188727au, enterMethod);
        LJIILJJIL(c188727au);
        c188727au.LIZLLL(LJI(c188727au) ? 1 : 0, "have_transl");
        c188727au.LIZLLL(0, "have_tts");
        c188727au.LIZLLL(0, "use_tts");
        LJIIIIZZ(c188727au, z);
        LIZLLL(c188727au);
        c188727au.LIZLLL(i, "is_landscape_screen");
        C86669Xzt.LJFF(c188727au);
        LJIIIZ(c188727au);
        LJIIJ(c188727au);
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "subtitle_index");
        }
        if (f != null) {
            c188727au.LIZIZ(f.floatValue(), "subtitle_position");
        }
        LJIILJJIL(c188727au);
        FMX.LJIIL("hide_subtitle", c188727au.LIZ);
    }

    public static void LJIIZILJ(C86661Xzl c86661Xzl, boolean z, EnumC86777Y3x enterMethod, String str, String str2, EnumC86689Y0n enumC86689Y0n, Integer num, String str3, String str4, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str3 = null;
        }
        if ((i2 & 128) != 0) {
            str4 = null;
        }
        c86661Xzl.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        c86661Xzl.LJII(c188727au, str);
        c188727au.LJIIIZ("target_lang", ((ITranslationService) c86661Xzl.LJ.getValue()).LJJIIZI());
        c86661Xzl.LJIILJJIL(c188727au);
        C86669Xzt.LIZ(c188727au, enterMethod);
        c86661Xzl.LJIILIIL(c188727au);
        c86661Xzl.LJIIJJI(c188727au, z);
        c86661Xzl.LJIIL(c188727au);
        c86661Xzl.LIZLLL(c188727au);
        C86669Xzt.LJFF(c188727au);
        LJIIJ(c188727au);
        c86661Xzl.LJIIIZ(c188727au);
        c188727au.LIZLLL(i, "is_landscape_screen");
        c86661Xzl.LJ(c188727au, z, str4);
        if (str3 != null) {
            c188727au.LJIIIZ("captions_unavailable_reason", str3);
        }
        if (enumC86689Y0n != null) {
            C86669Xzt.LIZIZ(c188727au, enumC86689Y0n);
        }
        int i3 = 0;
        if (!o.LJ(str2, "") && ((C86670Xzu.LJJIJIIJIL(c86661Xzl.LIZ) || C86670Xzu.LJJIJIIJI(c86661Xzl.LIZ)) && str2 != null)) {
            c188727au.LJIIIZ("author_options", str2);
        }
        if (!o.LJ(str2, "manage")) {
            if (num != null) {
                i3 = num.intValue();
            } else if (!CaptionKevaServiceImpl.LJJJJI().LJJI()) {
                i3 = 1;
            }
            c188727au.LIZLLL(i3, "is_to_turn_on");
        }
        FMX.LJIIL("show_subtitle_options", c188727au.LIZ);
    }
}

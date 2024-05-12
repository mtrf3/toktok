package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86901Y8r {
    public final List LIZ;
    public final List LIZIZ;
    public final AwemePagerVM LIZJ;
    public final C86894Y8k LIZLLL;
    public final View LJ;
    public final Context LJFF;

    public final void LIZ() {
        int i;
        String string = this.LJFF.getString(R.string.rft);
        o.LJIIIIZZ(string, "context.getString(R.stri…rofile_tab_text_showcase)");
        C79234V7u.LIZLLL(this, 16, string, R.raw.icon_3pt_bag, false, false, null);
        String string2 = this.LJFF.getString(R.string.rfs);
        o.LJIIIIZZ(string2, "context.getString(R.stri…vv_profile_tab_text_shop)");
        C79234V7u.LIZLLL(this, 20, string2, R.raw.icon_3pt_bag, false, false, null);
        String string3 = this.LJFF.getString(R.string.rfj);
        o.LJIIIIZZ(string3, "context.getString(R.stri…rofile_tab_text_business)");
        C79234V7u.LIZLLL(this, 21, string3, R.raw.icon_3pt_store, false, false, null);
        String string4 = this.LJFF.getString(R.string.rfo);
        o.LJIIIIZZ(string4, "context.getString(R.stri…v_profile_tab_text_music)");
        C79234V7u.LIZLLL(this, 3, string4, R.raw.icon_3pt_music_note_alt, false, false, null);
        String string5 = this.LJFF.getString(R.string.rfo);
        o.LJIIIIZZ(string5, "context.getString(R.stri…v_profile_tab_text_music)");
        C79234V7u.LIZLLL(this, 17, string5, R.raw.icon_3pt_music_note_alt, true, false, new C86903Y8t(this.LIZJ));
        String string6 = this.LJFF.getString(R.string.rfp);
        o.LJIIIIZZ(string6, "context.getString(R.stri…v_profile_tab_text_posts)");
        C79234V7u.LIZLLL(this, 0, string6, R.raw.icon_3pt_collection, false, false, null);
        String string7 = this.LJFF.getString(R.string.rff);
        o.LJIIIIZZ(string7, "context.getString(R.stri…erprofile_tab_text_likes)");
        C79234V7u.LIZLLL(this, 1, string7, R.raw.icon_3pt_heart, false, true, new C86905Y8v(this.LIZJ));
        String string8 = this.LJFF.getString(R.string.rfq);
        o.LJIIIIZZ(string8, "context.getString(R.stri…profile_tab_text_private)");
        C79234V7u.LIZLLL(this, 14, string8, R.raw.icon_3pt_lock_keyhole, false, true, new C86906Y8w(this.LIZJ));
        String string9 = this.LJFF.getString(R.string.rfl);
        o.LJIIIIZZ(string9, "context.getString(R.stri…profile_tab_text_effects)");
        C79234V7u.LIZLLL(this, 6, string9, R.raw.icon_3pt_effect, true, false, new C86900Y8q(this.LIZJ));
        String string10 = this.LJFF.getString(R.string.rfm);
        o.LJIIIIZZ(string10, "context.getString(R.stri…ofile_tab_text_favorites)");
        AwemePagerVM awemePagerVM = this.LIZJ;
        if (awemePagerVM.LJLJI) {
            i = R.raw.icon_3pt_bookmark_eye_slash;
        } else {
            i = R.raw.icon_3pt_bookmark;
        }
        C79234V7u.LIZLLL(this, 8, string10, i, false, true, new C86902Y8s(awemePagerVM));
        String string11 = this.LJFF.getString(R.string.rfr);
        o.LJIIIIZZ(string11, "context.getString(R.stri…_profile_tab_text_repost)");
        C79234V7u.LIZLLL(this, 18, string11, R.raw.icon_3pt_repost, false, false, null);
        String string12 = this.LJFF.getString(R.string.rfu);
        o.LJIIIIZZ(string12, "context.getString(R.stri…rofile_tab_text_stickers)");
        C79234V7u.LIZLLL(this, 19, string12, R.raw.icon_3pt_sticker, false, false, null);
        Y4F LIZIZ = C58071Mqh.LIZIZ(this.LJFF, this.LIZLLL);
        boolean z = true;
        if (!C86907Y8x.LIZIZ() && C00F.LIZ(31744, 0, "profile_video_sort_style", true) == 0) {
            z = false;
        }
        C79234V7u.LJFF(this, LIZIZ, 0, z, (int) C44384HbQ.LJJJLL(48), new C86895Y8l(this.LIZJ, this.LIZLLL, this.LJ));
        Context context = this.LJFF;
        Y4F LIZLLL = C58071Mqh.LIZLLL(context, this.LIZLLL, context.getString(R.string.rfp), Integer.valueOf(R.raw.icon_arrow_triangle_down_large_fill), Boolean.TRUE);
        boolean LIZJ = C86907Y8x.LIZJ();
        C86894Y8k c86894Y8k = this.LIZLLL;
        String string13 = this.LJFF.getString(R.string.rfr);
        o.LJIIIIZZ(string13, "context.getString(R.stri…_profile_tab_text_repost)");
        c86894Y8k.getClass();
        C79234V7u.LJFF(this, LIZLLL, 1, LIZJ, ((int) C44384HbQ.LJJJLL(25)) + C86894Y8k.LIZIZ(string13), new C86895Y8l(this.LIZJ, this.LIZLLL, this.LJ));
    }

    public C86901Y8r(AwemePagerVM pagerVM, C86894Y8k c86894Y8k, View view) {
        o.LJIIIZ(pagerVM, "pagerVM");
        this.LIZ = new ArrayList();
        this.LIZIZ = new ArrayList();
        this.LIZJ = pagerVM;
        this.LIZLLL = c86894Y8k;
        this.LJ = view;
        this.LJFF = c86894Y8k.getContext();
    }
}

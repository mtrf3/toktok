package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225308so extends AbstractC45355Hr5 {
    public final Bundle LIZJ;
    public int LIZLLL;
    public int LJ;
    public Aweme LJFF;

    public C225308so(Bundle bundle) {
        this.LIZJ = bundle;
    }

    @Override // X.AbstractC45355Hr5
    public final void LIZJ(long j, String str) {
        String str2;
        Integer num;
        String str3;
        String string;
        this.LIZIZ = j;
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LIZIZ, "start_download");
        c188727au.LIZLLL(this.LJ, "is_self_video");
        c188727au.LIZLLL(this.LIZLLL, "is_server_watermark");
        Aweme aweme = this.LJFF;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("group_id", str2);
        Aweme aweme2 = this.LJFF;
        if (aweme2 != null) {
            num = Integer.valueOf(aweme2.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        c188727au.LJIIIZ("download_url", this.LIZ);
        Bundle bundle = this.LIZJ;
        if (bundle == null || (str3 = bundle.getString("download_id")) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("download_id", str3);
        Bundle bundle2 = this.LIZJ;
        if (bundle2 != null && (string = bundle2.getString("download_method")) != null) {
            str4 = string;
        }
        c188727au.LJIIIZ("download_method", str4);
        if (o.LJ(str, "homepage_nearby")) {
            LQA lqa = LQA.LIZIZ;
            java.util.Map<String, String> map = c188727au.LIZ;
            o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            lqa.LJII(str, (HashMap) map, this.LJFF, true);
        }
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJFF, null);
        if (!LJIIJJI.isEmpty()) {
            c188727au.LJIIIIZZ(LJIIJJI);
        }
        FMX.LJIIL("download_start", c188727au.LIZ);
    }

    @Override // X.AbstractC45355Hr5
    public final void LIZIZ(int i, String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        long currentTimeMillis = System.currentTimeMillis();
        C10K.LIZJ(new CallableC45369HrJ(str, this, currentTimeMillis, enterFrom, i, currentTimeMillis - this.LIZIZ));
    }

    @Override // X.AbstractC45355Hr5
    public final void LIZ(long j, long j2, int i, String str, boolean z, String enterFrom, int i2, int i3) {
        String str2;
        String str3;
        Integer num;
        String str4;
        User user;
        String str5;
        String str6;
        String str7;
        String string;
        o.LJIIIZ(enterFrom, "enterFrom");
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis(), "end_download");
        c188727au.LJ(j2, "package_size");
        c188727au.LJ(j - this.LIZIZ, "duration");
        c188727au.LIZLLL(this.LJ, "is_self_video");
        c188727au.LJIIIZ("download_url", this.LIZ);
        c188727au.LIZLLL(this.LIZLLL, "is_server_watermark");
        c188727au.LJIIIZ("enter_from", enterFrom);
        Bundle bundle = this.LIZJ;
        if (bundle != null) {
            str2 = bundle.getString("download_method");
        } else {
            str2 = null;
        }
        String str8 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("download_method", str2);
        Aweme aweme = this.LJFF;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("group_id", str3);
        Aweme aweme2 = this.LJFF;
        if (aweme2 != null) {
            num = Integer.valueOf(aweme2.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        Aweme aweme3 = this.LJFF;
        if (aweme3 == null || (str4 = aweme3.getAuthorUid()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("author_id", str4);
        c188727au.LIZLLL(i2, "download_result");
        Aweme aweme4 = this.LJFF;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        } else {
            user = null;
        }
        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user));
        if (C54838Lfe.LJIIZILJ(this.LJFF)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        c188727au.LJIIIZ("story_type", str5);
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJFF)));
        Bundle bundle2 = this.LIZJ;
        if (bundle2 == null || (str6 = bundle2.getString("detail_tab_name")) == null) {
            str6 = "";
        }
        c188727au.LJIIIZ("detail_tab_name", str6);
        c188727au.LJIIIZ("enter_position", C222578oP.LJII(C84763XOl.LJIIIIZZ(), enterFrom, null));
        c188727au.LIZLLL(i3, "is_landscape_screen");
        Bundle bundle3 = this.LIZJ;
        if (bundle3 == null || (str7 = bundle3.getString("download_id")) == null) {
            str7 = "";
        }
        c188727au.LJIIIZ("download_id", str7);
        V0N.LJI(c188727au, this.LJFF);
        Object LJII = c220488l2.LJII(this.LJFF, c188727au);
        C222578oP.LIZJ(LJII, this.LJFF, null, null, 14);
        C188727au c188727au2 = (C188727au) LJII;
        if (o.LJ(enterFrom, "homepage_nearby")) {
            LQA lqa = LQA.LIZIZ;
            java.util.Map<String, String> map = c188727au2.LIZ;
            o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            lqa.LJII(enterFrom, (HashMap) map, this.LJFF, true);
        }
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJFF, null);
        if (!LJIIJJI.isEmpty()) {
            c188727au2.LJIIIIZZ(LJIIJJI);
        }
        if (j2 == -1) {
            c188727au2.LIZLLL(i, "error_code");
            c188727au2.LIZLLL(z ? 1 : 0, "retry_failed");
            c188727au2.LJI("error_message", str);
        }
        Bundle bundle4 = this.LIZJ;
        if (bundle4 != null && (string = bundle4.getString("download_outer_path")) != null) {
            str8 = string;
        }
        C36922EeM.LIZLLL(4, "download-outer-path", str8);
        FMX.LJIIL("download_end", c188727au2.LIZ);
    }
}

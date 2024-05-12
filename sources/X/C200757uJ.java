package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200757uJ extends JHL<C200757uJ> {
    public String LJJL;
    public String LJJLI;
    public Aweme LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public boolean LJJLJLI;
    public int LJJLL;
    public Boolean LJJZ;
    public String LJJZZI;
    public int LJJZZIII;
    public boolean LJL;
    public String LJLI;

    public C200757uJ() {
        super("click_more_button");
        this.LJJZ = Boolean.FALSE;
        this.LJJZZIII = -1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str;
        String str2 = this.LJJL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str2, c1798874e);
        LJ("author_id", this.LJJLI, c1798874e);
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(C227768wm.LJIIZILJ(this.LJJLIIIIJ));
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LJ(this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJ)) {
            LJ("playlist_type", this.LJJLIIIJ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLLLLLLLZ)) {
            LJ("log_pb", this.LJJLIIIJLLLLLLLZ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJ("prop_id", this.LJJLIIIJJIZ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJ("effect_id", this.LJJLIIIJL, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LIZLLL("enter_method", this.LJJLJ);
        }
        if (this.LJJLIIIJLJLI != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LJ("scene_id", C08380Uo.LIZ(LIZ, this.LJJLIIIJLJLI, "", LIZ), InterfaceC1798974f.LIZ);
        }
        if (this.LJJLJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL("is_horizontal_screen", str);
        LIZJ(this.LJJLL, "is_landscape_screen");
        String str3 = this.LJJLIIJ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("previous_page", str3, c1799074g);
        if (!TextUtils.isEmpty(this.LJJLIL)) {
            LJ("impr_type", this.LJJLIL, c1799074g);
        }
        LIZLLL("is_casting", Boolean.toString(this.LJL));
        LIZLLL("casting_session_id", this.LJLI);
        LIZLLL("request_id", C227768wm.LJIIZILJ(this.LJJLIIIIJ));
        if (IG2.LIZ) {
            LIZLLL("is_fullscreen", "1");
        }
        if (this.LJJZ.booleanValue()) {
            LIZLLL("story_type", "story");
        } else {
            LIZLLL("story_type", "post");
        }
        int i = this.LJJZZIII;
        if (i >= 0) {
            LIZJ(i, "is_share_to_story");
        }
        Aweme aweme = this.LJJLIIIIJ;
        if (aweme != null) {
            aweme.getTrendingBarFYP();
            LIZJ(this.LJJJJJ.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJJJJ), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJJJJ), "pic_cnt");
            String LIZ2 = C187677Yd.LIZ(this.LJJLIIIIJ);
            if (LIZ2 != null && !LIZ2.isEmpty()) {
                LIZLLL("photo_content_type", LIZ2);
            }
            LIZJ(this.LJJLIIIIJ.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            HashMap params = (HashMap) this.LIZIZ;
            Aweme aweme2 = this.LJJLIIIIJ;
            o.LJIIIZ(params, "params");
            java.util.Map LIZ3 = C191847fw.LIZ(aweme2);
            if (!LIZ3.isEmpty()) {
                params.putAll(LIZ3);
            }
            LIZ(C190807eG.LIZ(this.LJJLIIIIJ, this.LIZLLL));
        }
        if (!TextUtils.isEmpty(this.LJJZZI)) {
            LIZLLL("story_collection_id", this.LJJZZI);
        }
    }

    public final void LJJIIZ(Aweme aweme) {
        LJIILL(aweme);
        this.LJJLIIIIJ = aweme;
        this.LJJL = aweme.getAid();
        this.LJJLIL = C227768wm.LJFF(aweme);
    }
}

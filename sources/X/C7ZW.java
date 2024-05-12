package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.anchor.service.EcommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7ZW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZW extends JHL<C7ZW> {
    public Aweme LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public int LJJLJLI;
    public final Gson LJJLL;
    public int LJJZ;

    public C7ZW() {
        super("dislike");
        this.LJJLIIIJJI = "";
        this.LJJLL = new Gson();
        this.LJJZ = -1;
        this.LJI = true;
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJJLI;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str, c1798874e);
        LJ("author_id", this.LJJLIIIIJ, c1798874e);
        String str2 = this.LJJLIIIJ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("enter_method", str2, c1799074g);
        if (C1808377v.LIZ().LIZIZ(this.LJJLI)) {
            LJ("previous_page", "push", c1799074g);
        }
        if (C227768wm.LJJIIJ(this.LIZLLL)) {
            LIZIZ(this.LJJLIIIJJI);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJJIZ)) {
            LJ("impr_type", this.LJJLIIIJJIZ, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJL)) {
            LJ("content_type", this.LJJLIIIJL, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJLJLI)) {
            LJ("display_method", this.LJJLIIIJLJLI, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJJLIIIJILLIZJL)) {
            LJ("panel_source", this.LJJLIIIJILLIZJL, c1799074g);
        }
        if (!C188587ag.LJFF(this.LJJJJJ)) {
            LIZLLL("rec_type", C188587ag.LIZJ(this.LJJJJJ));
            LIZLLL("relation_type", C188587ag.LIZ(this.LJJJJJ));
        } else {
            LIZLLL("relation_type", "");
        }
        if (!TextUtils.isEmpty(this.LJJLJ)) {
            LJ("follow_status", this.LJJLJ, c1799074g);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJJLIIIJLLLLLLLZ);
        LIZ.append("");
        LIZLLL("is_reposted", X1D.LIZIZ(LIZ));
        LIZLLL("repost_from_group_id", this.LJJLIIJ);
        LIZLLL("repost_from_user_id", this.LJJLIL);
        LIZJ(this.LJJLJLI, "is_promoted");
        Aweme aweme = this.LJJL;
        if (aweme != null) {
            LIZJ(aweme.getAwemeType(), "aweme_type");
            LIZJ(C227768wm.LJIJJ(this.LJJL), "text_post_content");
            LIZJ(C227768wm.LJIILIIL(this.LJJL), "pic_cnt");
            String LIZ2 = C187677Yd.LIZ(this.LJJL);
            if (LIZ2 != null && !LIZ2.isEmpty()) {
                LIZLLL("photo_content_type", LIZ2);
            }
            HashMap<String, String> mobParams = this.LJJL.getMobParams();
            if (mobParams != null) {
                LIZ(mobParams);
            }
            java.util.Map<String, Object> LJ = EcommerceAnchorService.LIZ().LJ(this.LJJJJJ);
            if (LJ != null) {
                for (Map.Entry<String, Object> entry : LJ.entrySet()) {
                    LIZLLL(entry.getKey(), entry.getValue().toString());
                }
            }
            LIZLLL("req_id", this.LJJLIIIJJI);
            try {
                LIZLLL("impr_id", ((LogPbBean) this.LJJLL.LJI(C3A5.LIZ.LIZIZ(this.LJJLIIIJJI), LogPbBean.class)).getImprId());
            } catch (Exception unused) {
                LIZLLL("impr_id", "");
            }
            LIZJ(this.LJJL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        try {
            HashMap params = (HashMap) this.LIZIZ;
            Aweme aweme2 = this.LJJL;
            o.LJIIIZ(params, "params");
            java.util.Map LIZ3 = C191847fw.LIZ(aweme2);
            if (!LIZ3.isEmpty()) {
                params.putAll(LIZ3);
            }
        } catch (Exception unused2) {
        }
        LIZ(C190807eG.LIZ(this.LJJL, this.LIZLLL));
        int i = this.LJJZ;
        if (i != -1) {
            LIZJ(i, "music_name");
        }
    }

    public final void LJJIIZ(Aweme aweme) {
        LJIILL(aweme);
        this.LJJL = aweme;
        this.LJJLIIIJJIZ = C227768wm.LJFF(aweme);
        if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
            this.LJJLJLI = 1;
        }
        C78866UxK.LJIIZILJ(this, aweme.getAuthor());
    }
}

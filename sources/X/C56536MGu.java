package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;

/* renamed from: X.MGu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56536MGu implements MGV {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public NewFaceStickerBean LJLJI;

    @Override // X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    @Override // X.MGV
    public boolean sendCustomRequest(C51031K1b c51031K1b, int i) {
        return false;
    }

    public C56536MGu() {
    }

    public void setFaceStickerBean(NewFaceStickerBean newFaceStickerBean) {
        this.LJLJI = newFaceStickerBean;
    }

    public C56536MGu(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.MGV
    public MGX getJumpToVideoParam(MGX mgx, Aweme aweme) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "prop_page");
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("tag_id", mgx.LIZLLL);
        c188727au.LIZLLL(mgx.LJFF, "rank_index");
        c188727au.LJIIIZ("process_id", mgx.LJ);
        FMX.LJIIL("feed_enter", c188727au.LIZ);
        int i = this.LJLILLLLZI;
        if (i == 35) {
            mgx.LIZ = "from_effect_discover_tab";
        } else if (i == 36) {
            mgx.LIZ = "from_effect_discover_panel";
        } else {
            mgx.LIZ = "from_sticker";
        }
        mgx.LIZIZ = "sticker_id";
        mgx.LIZJ = "prop_page";
        return mgx;
    }

    @Override // X.MGV
    public C51031K1b getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C51031K1b c51031K1b = new C51031K1b();
        c51031K1b.LJJ(new MIP(this.LJLIL, i));
        return c51031K1b;
    }

    @Override // X.MGV
    public C220538l7 onCreateDetailAwemeViewHolder(View view, String str, MH9 mh9) {
        int i = this.LJLILLLLZI;
        if (i == 35 || i == 36) {
            return new C56423MCl(view, str, mh9, this.LJLILLLLZI);
        }
        return new MH8(view, str, mh9, new C56539MGx(this));
    }
}

package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;

/* renamed from: X.Ja9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49401Ja9 implements InterfaceC51701KQv {
    public final /* synthetic */ SearchUserViewHolder LIZ;

    @Override // X.InterfaceC51701KQv
    public final int LIZ() {
        return 14;
    }

    @Override // X.InterfaceC51701KQv
    public final String getEnterMethod() {
        return "click_follow";
    }

    @Override // X.InterfaceC51701KQv
    public final String getEnterFrom() {
        if (this.LIZ.LJLJL().LIZ) {
            return "general_search";
        }
        return "search_result";
    }

    public C49401Ja9(SearchUserViewHolder searchUserViewHolder) {
        this.LIZ = searchUserViewHolder;
    }

    @Override // X.InterfaceC51701KQv
    public final void LIZIZ(User user, int i) {
        String str;
        String str2;
        String str3;
        if (user == null) {
            return;
        }
        if (i == 0) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        JQA LJLJL = this.LIZ.LJLJL();
        String str4 = "";
        if (i != 1) {
            str2 = "";
        } else if (user.getFollowerStatus() == 1) {
            str2 = "mutual";
        } else {
            str2 = "single";
        }
        C188577af c188577af = new C188577af(str);
        if (C78685UuP.LJJJZ(LJLJL.LJJI)) {
            str3 = LJLJL.LJJI;
        } else {
            C50948Jz6 LJJLIIIJLJLI = Z9N.LIZIZ.LJJLIIIJLJLI();
            if (LJJLIIIJLJLI != null) {
                str3 = LJJLIIIJLJLI.getSourcePage();
            } else {
                str3 = null;
            }
        }
        c188577af.LJJIL = LJLJL.LJII;
        c188577af.LJIL = "1";
        c188577af.LJJIFFI = user.getUid();
        c188577af.LIZLLL = LJLJL.LJFF;
        c188577af.LJJLIIIJ = user.getUid();
        c188577af.LJJIIJZLJL = LJLJL.LJIIIIZZ;
        c188577af.LJJL = LJLJL.LJFF;
        c188577af.LJJLJ = str2;
        c188577af.LJJLIIIJJI = user.getRequestId();
        String str5 = LJLJL.LJ;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c188577af.LJ("search_keyword", str5, c1799074g);
        c188577af.LJ("is_search_scene", "1", c1799074g);
        c188577af.LIZJ(C45804HyK.LJJIIJ(user), "relation_tag");
        if (str3 != null) {
            str4 = str3;
        }
        c188577af.LIZLLL("source_page", str4);
        c188577af.LJIILIIL();
    }
}

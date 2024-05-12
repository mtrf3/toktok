package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C113554cx;
import X.C221018lt;
import X.C227128vk;
import X.C227218vt;
import X.C227228vu;
import X.C227238vv;
import X.C227248vw;
import X.C78857UxB;
import X.EnumC227268vy;
import X.OSZ;
import X.X1D;
import X.XKQ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IRelationListApi;
import com.ss.android.ugc.aweme.relation.api.RelationListApiService;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchFriendListVM extends AssemViewModel<C227218vt> {
    public final IRelationListApi LJLIL;
    public XKQ LJLILLLLZI;
    public final Map<String, String> LJLJI;

    public SearchFriendListVM() {
        RelationListApiService api = RelationListApiService.LIZIZ;
        o.LJIIIZ(api, "api");
        this.LJLIL = api;
        this.LJLJI = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "find_friends"));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C227218vt defaultState() {
        return new C227218vt(0);
    }

    public final void LLIIIL(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("search keyword: ");
        LIZ.append(keyword);
        C221018lt.LJFF("[ffp]_Search", X1D.LIZIZ(LIZ));
        if (keyword.length() == 0) {
            setState(C227248vw.LJLIL);
            return;
        }
        setState(C227238vv.LJLIL);
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLILLLLZI = XKX.LIZLLL(getAssemVMScope(), null, null, new C227228vu(this, keyword, null), 3);
    }

    public final C227128vk gv0(User user, String str, String str2) {
        EnumC227268vy LJJIJIIJI = C78857UxB.LJJIJIIJI(user);
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("search_id", str);
        oszArr[1] = new OSZ("search_keyword", str2);
        String uid = user.getUid();
        String str3 = "";
        if (uid == null) {
            uid = "";
        }
        oszArr[2] = new OSZ("search_result_id", uid);
        oszArr[3] = new OSZ("section_type", LJJIJIIJI.getTrackName());
        oszArr[4] = new OSZ("token_type", "person");
        String uniqueId = user.getUniqueId();
        if (uniqueId != null) {
            str3 = uniqueId;
        }
        oszArr[5] = new OSZ("user_name", str3);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LJJLIIIIJ.putAll(this.LJLJI);
        return new C227128vk(user, LJJLIIIIJ, LJJIJIIJI);
    }
}

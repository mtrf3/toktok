package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C188727au;
import X.C214188as;
import X.C41424GNo;
import X.C51009K0f;
import X.C51018K0o;
import X.C78404Ups;
import X.DialogInterfaceOnCancelListenerC51013K0j;
import X.DialogInterfaceOnClickListenerC51011K0h;
import X.FMX;
import X.Z9N;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRelatedSuggestionVM extends AssemViewModel<C51009K0f> {
    public Aweme LJLJI;
    public boolean LJLJJI;
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public final IAccountUserService LJLJJL = AccountService.LJIJ().LJFF();
    public final C214188as LJLJJLL = C78404Ups.LIZJ(this, new AqS158S0100000_8(this, 315));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C51009K0f defaultState() {
        return new C51009K0f(false, false, false);
    }

    public final void gv0(Context context, View hideLayout) {
        o.LJIIIZ(hideLayout, "hideLayout");
        Aweme aweme = this.LJLJI;
        if (aweme == null) {
            return;
        }
        setState(C51018K0o.LJLIL);
        String suggestContent = this.LJLIL;
        String keywordId = this.LJLILLLLZI;
        boolean z = this.LJLJJI;
        o.LJIIIZ(suggestContent, "suggestContent");
        o.LJIIIZ(keywordId, "keywordId");
        C41424GNo c41424GNo = new C41424GNo(context);
        c41424GNo.LIZ(new String[]{context.getResources().getString(R.string.qf4), context.getResources().getString(R.string.qf6), context.getResources().getString(R.string.qf3), context.getResources().getString(R.string.qf5)}, new DialogInterfaceOnClickListenerC51011K0h(aweme, suggestContent, keywordId, z, hideLayout, this));
        c41424GNo.LIZ.LIZ.LJIILIIL = new DialogInterfaceOnCancelListenerC51013K0j(aweme, suggestContent, keywordId, z, this);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_group_id", aweme.getAid());
        c188727au.LJIIIZ("board_type", "android");
        c188727au.LJIIIZ("group_id", keywordId);
        c188727au.LJIIIZ("words_content", suggestContent);
        if (z) {
            c188727au.LJI("is_from_photo", "1");
        }
        FMX.LJIIL("comment_related_search_board_show", c188727au.LIZ);
        c41424GNo.LIZIZ();
        Z9N z9n = Z9N.LIZIZ;
        z9n.LIZ.LLLIIII(-1L, "comment_related_search", true);
        z9n.LJIIIZ("cancel", this.LJLIL, "LONG_PRESS");
    }
}

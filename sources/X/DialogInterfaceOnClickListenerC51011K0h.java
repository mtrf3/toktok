package X;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.K0h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC51011K0h implements DialogInterface.OnClickListener {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ SearchRelatedSuggestionVM LJLJJLL;

    public DialogInterfaceOnClickListenerC51011K0h(Aweme aweme, String str, String str2, boolean z, View view, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = view;
        this.LJLJJLL = searchRelatedSuggestionVM;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "undefined";
                    } else {
                        str = "others";
                    }
                } else {
                    str = "Inappropriate content";
                }
            } else {
                str = "Unrelated content";
            }
        } else {
            str = "Not interested";
        }
        C51012K0i.LIZ(this.LJLIL, str, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        dialogInterface.dismiss();
        this.LJLJJL.setVisibility(8);
        C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
        c26045AKb.LJIIIIZZ(R.string.wm);
        c26045AKb.LJIIJ();
        SearchRelatedSuggestionVM searchRelatedSuggestionVM = this.LJLJJLL;
        Aweme aweme = this.LJLIL;
        searchRelatedSuggestionVM.getClass();
        o.LJIIIZ(aweme, "aweme");
        C51016K0m c51016K0m = (C51016K0m) searchRelatedSuggestionVM.LJLJJLL.getValue().getOperator();
        c51016K0m.getClass();
        if (c51016K0m.LJLIL.isLogin() && C51019K0p.LIZ()) {
            String curUserId = c51016K0m.LJLIL.getCurUserId();
            o.LJIIIIZZ(curUserId, "userService.curUserId");
            if (!TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(curUserId)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(curUserId);
                LIZ.append(aweme.getAid());
                C51010K0g.LIZ.storeBoolean(X1D.LIZIZ(LIZ), true);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("add blacklist ");
                LIZ2.append(aweme.getAid());
                LIZ2.append(" , ");
                LIZ2.append(curUserId);
                C49133JQb.LIZ(X1D.LIZIZ(LIZ2), new Object[0]);
            }
        }
        searchRelatedSuggestionVM.setState(C51015K0l.LJLIL);
    }
}

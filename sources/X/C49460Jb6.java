package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.repo.SearchEffectListResponse;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Jb6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49460Jb6 extends AbstractC65781Prl implements InterfaceC88472Yns<SearchEffectListResponse, C76800UCe> {
    public final /* synthetic */ SearchEffectListActivity LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49460Jb6(SearchEffectListActivity searchEffectListActivity, long j) {
        super(1);
        this.LJLIL = searchEffectListActivity;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SearchEffectListResponse searchEffectListResponse) {
        String str;
        String str2;
        String str3;
        C50433Jqn searchCommonModel;
        SearchEffectListResponse response = searchEffectListResponse;
        o.LJIIIZ(response, "response");
        C50653JuL.LJLILLLLZI.getClass();
        java.util.Map LIZIZ = C50654JuM.LIZIZ();
        C49458Jb4 c49458Jb4 = new C49458Jb4("search");
        LogPbBean logPbBean = response.logPb;
        String str4 = null;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        c49458Jb4.LJIIZILJ("impr_id", str);
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ = C50651JuJ.LIZJ();
        if (LIZJ != null && (searchCommonModel = LIZJ.getSearchCommonModel()) != null) {
            str4 = searchCommonModel.getEnterFrom();
        }
        c49458Jb4.LJIJI(str4);
        c49458Jb4.LJIIZILJ("search_type", "effect");
        c49458Jb4.LJIIZILJ("enter_method", "click_more_general_list");
        c49458Jb4.LJIIZILJ("search_keyword", this.LJLIL.LJLJI);
        c49458Jb4.LJIIZILJ("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJLILLLLZI));
        c49458Jb4.LJIIZILJ("group_id", C50293JoX.LJFF());
        if (response.status_code == 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c49458Jb4.LJIIZILJ("is_success", str2);
        c49458Jb4.LJJIII((String) LIZIZ.get("search_id"));
        c49458Jb4.LJIILIIL();
        LogPbBean logPbBean2 = response.logPb;
        if (logPbBean2 == null || (str3 = logPbBean2.getImprId()) == null) {
            str3 = "";
        }
        LIZIZ.put("search_id", str3);
        C50654JuM.LIZJ(LIZIZ, false);
        return C76800UCe.LIZ;
    }
}

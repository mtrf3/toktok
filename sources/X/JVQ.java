package X;

import Y.ACallableS9S2100000_8;
import Y.AObjectS10S0001000_5;
import Y.AObjectS31S0000000_8;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVQ extends JZQ {
    public static final /* synthetic */ int LJLLL = 0;
    public final String LJLJI;
    public final InterfaceC48970JJu LJLJJI;
    public final C49708Jf6 LJLJJL;
    public JQT LJLJJLL;
    public C49719JfH LJLJL;
    public final JWG LJLJLJ;
    public final int LJLL;
    public String LJLLI;
    public final C49002JLa<Aweme> LJLLILLLL = new C49002JLa<>(this);
    public final C8YF LJLLJ = new C8YF(this);
    public final int LJLJLLL = 0;

    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        SearchVideoHolder searchVideoHolder;
        if (this.LJLL == 9) {
            searchVideoHolder = new SearchVideoHolder(C28289B8j.LIZ(viewGroup, R.layout.cj8, viewGroup, false), this.LJLJI, this.LJLJJI, this.LJLLJ, this.LJLJJL.getFragment());
            JQT jqt = this.LJLJJLL;
            if (jqt != null && ((Number) J21.LIZ.getValue()).intValue() != 0) {
                searchVideoHolder.LLJILJIL = jqt;
            }
            searchVideoHolder.LL(this.LJLJL);
        } else if (this.LJLJLLL == 1) {
            searchVideoHolder = new SearchVideoHolder(C28289B8j.LIZ(viewGroup, R.layout.cgz, viewGroup, false), this.LJLJI, this.LJLJJI, this.LJLLJ, this.LJLJJL.getFragment());
        } else {
            searchVideoHolder = null;
        }
        JQT jqt2 = this.LJLJJLL;
        if (jqt2 != null) {
            jqt2.LJJIJLIJ(searchVideoHolder);
        }
        return searchVideoHolder;
    }

    @Override // X.JZQ
    public final void LJZL(FollowStatus followStatus) {
        User author;
        List<T> list = this.mmItems;
        if (list == 0 || list.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId)) {
            return;
        }
        for (T t : list) {
            if (t != null && (author = t.getAuthor()) != null && followStatus.userId.equals(author.getUid())) {
                author.setFollowStatus(followStatus.followStatus);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JZQ, X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C49708Jf6 c49708Jf6;
        JWG jwg;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof InterfaceC49280JVs) {
            JY2.LIZIZ(viewHolder.itemView, ((InterfaceC49280JVs) viewHolder).LJLJL());
        }
        if (viewHolder.getItemViewType() == 0 && (c49708Jf6 = this.LJLJJL) != null && c49708Jf6.getUserVisibleHint() && (jwg = this.LJLJLJ) != null) {
            jwg.vk(viewHolder);
        }
        if (viewHolder instanceof SearchVideoHolder) {
            C10K.LIZJ(new ACallableS9S2100000_8((SearchVideoHolder) viewHolder, "unknown", "search_result", 1));
        }
    }

    @Override // X.JZQ, X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC49280JVs) {
            JY2.LIZJ(viewHolder.itemView);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof SearchVideoHolder) {
            ((SearchVideoHolder) viewHolder).LJLL.LJLIIIL();
        }
    }

    @Override // X.C8HS
    public final void setData(List<Aweme> list) {
        super.setData(list);
        this.LJLLILLLL.LIZJ(new AObjectS31S0000000_8(9), list);
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<Aweme> list) {
        super.setDataAfterLoadMore(list);
        final int i = 0;
        this.LJLLILLLL.LIZJ(new InterfaceC88472Yns() { // from class: X.JVy
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        return obj;
                    default:
                        return SettingNewVersionFragment.lambda$initUnits$85((C2068389v) obj);
                }
            }
        }, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51777KTt
    public final void LJLLLLLL(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        List<T> list = this.mmItems;
        if (list == 0) {
            return;
        }
        if (viewHolder instanceof InterfaceC49280JVs) {
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            InterfaceC50157JmL LIZ = K0M.LIZ();
            if (LIZ != null) {
                str = LIZ.LIZJ().LIZ;
                str4 = LIZ.LIZJ().LIZIZ;
                LIZ.LIZIZ();
                str3 = LIZ.LIZJ().LIZJ;
                str2 = LIZ.LIZJ().LIZLLL;
            } else {
                str = "";
                str2 = "normal";
                str3 = "normal";
                str4 = "";
            }
            if (i % 10 == 0) {
                JVR.LIZJ("cell");
            }
            String requestId = aweme.getRequestId();
            new LogPbBean().setImprId(requestId);
            String logPbStr = C3A5.LIZ.LIZLLL(requestId);
            JWD.LIZ.getClass();
            String LIZ2 = JWE.LIZ(4);
            InterfaceC49275JVn.LIZ.getClass();
            String LIZ3 = C49270JVi.LIZ(4);
            JQA jqa = new JQA();
            jqa.LJFF = "search_result";
            jqa.LIZ = false;
            jqa.LIZJ(str);
            jqa.LIZIZ(requestId);
            o.LJIIIZ(logPbStr, "logPbStr");
            jqa.LJIIJJI = logPbStr;
            jqa.LJIIL = i;
            jqa.LIZLLL(str4);
            jqa.LIZIZ = 4;
            jqa.LIZJ = LIZ2;
            jqa.LIZLLL = LIZ3;
            if (str3 != null) {
                jqa.LJIJI = str3;
            } else {
                jqa.LJIJI = "normal";
            }
            if (str2 != null) {
                jqa.LJIJJ = str2;
            } else {
                jqa.LJIJJ = "normal";
            }
            jqa.LJJIIZ = new AObjectS10S0001000_5(1, 5);
            ((InterfaceC49280JVs) viewHolder).LLLLIIIILLL(jqa);
            View view = viewHolder.itemView;
            String str5 = jqa.LJIIIIZZ;
            String str6 = jqa.LJFF;
            Integer valueOf = Integer.valueOf(jqa.LJIIL);
            Boolean bool = Boolean.TRUE;
            C49586Jd8.bindSource(view, new C49586Jd8(str5, str6, valueOf, bool));
            new SearchContextAbilityImpl(viewHolder.itemView, this.LJLJJL.getFragment(), null).j4(new C49584Jd6(jqa.LJIIIIZZ, 0, jqa.LJFF, Integer.valueOf(jqa.LJIIL), bool, jqa.LJJIJIIJI));
        }
        if (viewHolder instanceof JW1) {
            ((JW1) viewHolder).LJZ(this.LJLLI);
        }
        if (viewHolder instanceof SearchVideoHolder) {
            Aweme aweme2 = (Aweme) ListProtector.get(list, i);
            ((SearchVideoHolder) viewHolder).LJLLJ = new TranslateSearchDesc(aweme2.getSearchDocTranslate(), aweme2.getSearchDocOriginLanguage());
        }
        if (this.LJLL == 9) {
            SearchVideoHolder searchVideoHolder = (SearchVideoHolder) viewHolder;
            searchVideoHolder.LJLL.LJJZ(i, new C49105JOz((Aweme) ListProtector.get(list, i)));
            Aweme aweme3 = (Aweme) ListProtector.get(list, i);
            C49708Jf6 c49708Jf6 = this.LJLJJL;
            if (c49708Jf6 == null || c49708Jf6.getUserVisibleHint()) {
                z = true;
            } else {
                z = false;
            }
            searchVideoHolder.l0(aweme3, i, i, z, false);
            return;
        }
        boolean z2 = true;
        if (this.LJLJLLL != 1) {
            return;
        }
        SearchVideoHolder searchVideoHolder2 = (SearchVideoHolder) viewHolder;
        searchVideoHolder2.LJLL.LJJZ(i, new C49105JOz((Aweme) ListProtector.get(list, i)));
        Aweme aweme4 = (Aweme) ListProtector.get(list, i);
        C49708Jf6 c49708Jf62 = this.LJLJJL;
        if (c49708Jf62 != null && !c49708Jf62.getUserVisibleHint()) {
            z2 = false;
        }
        searchVideoHolder2.l0(aweme4, i, i, z2, false);
    }

    public JVQ(C49708Jf6 c49708Jf6, String str, InterfaceC48970JJu interfaceC48970JJu, JWG jwg, int i) {
        this.LJLJI = str;
        this.LJLJJI = interfaceC48970JJu;
        this.LJLJJL = c49708Jf6;
        this.LJLJLJ = jwg;
        this.LJLL = i;
    }
}

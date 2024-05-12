package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZD extends JZH<SearchLiveStruct> {
    public C49820Jgu LJLJJLL;
    public JQA LJLJL;
    public final JZC LJLJLJ;

    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        o.LJI(viewGroup);
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.cgs, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new JZE(view);
    }

    @Override // X.C8HS
    public final void setData(List<SearchLiveStruct> list) {
        this.LJLJJL.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setData(list);
        C1DH.LJJIJIIJI(new ARunnableS44S0100000_8(this, 186));
    }

    @Override // X.JZH, X.AbstractC51777KTt, X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        SearchLiveStruct searchLiveStruct;
        String str;
        String str2;
        String str3;
        String str4;
        User author;
        String str5;
        User author2;
        String str6;
        Long l;
        Long l2;
        String str7;
        String str8;
        User author3;
        User author4;
        User author5;
        C86393XvR LJJIJIL;
        String LIZ;
        User author6;
        User author7;
        UrlModel urlModel;
        User author8;
        UrlModel urlModel2;
        User author9;
        User author10;
        o.LJIIIZ(holder, "holder");
        super.onBindBasicViewHolder(holder, i);
        List<T> list = this.mmItems;
        if (list == 0 || (searchLiveStruct = (SearchLiveStruct) ListProtector.get(list, i)) == null) {
            return;
        }
        C50652JuK.Companion.getClass();
        C50321Joz LIZIZ = C50651JuJ.LIZIZ();
        String str9 = "";
        if (LIZIZ == null) {
            str = "";
            str2 = "";
        } else {
            str = LIZIZ.getSearchId();
            str2 = LIZIZ.getSearchKeyword();
            LIZIZ.getTabIndex();
        }
        if (i % 10 == 0) {
            JVR.LIZJ("live");
        }
        LogPbBean logPbBean = searchLiveStruct.getLogPbBean();
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
            logPbBean.setImprId("");
        }
        String implId = logPbBean.getImprId();
        String logPbStr = C3A5.LIZ.LIZLLL(implId);
        JWD.LIZ.getClass();
        String LIZ2 = JWE.LIZ(7);
        InterfaceC49275JVn.LIZ.getClass();
        String LIZ3 = C49270JVi.LIZ(7);
        JQA jqa = new JQA();
        jqa.LJFF = "";
        int i2 = 0;
        jqa.LIZ = false;
        jqa.LIZJ(str);
        o.LJIIIIZZ(implId, "implId");
        jqa.LJIIIIZZ = implId;
        o.LJIIIIZZ(logPbStr, "logPbStr");
        jqa.LJIIJJI = logPbStr;
        jqa.LJIIJ = logPbBean;
        jqa.LJIIL = i;
        jqa.LIZLLL(str2);
        jqa.LIZIZ = 7;
        jqa.LIZJ = LIZ2;
        jqa.LIZLLL = LIZ3;
        this.LJLJL = jqa;
        if (holder instanceof JZE) {
            JZE jze = (JZE) holder;
            jze.LLLLIIIILLL(jqa);
            InterfaceC49765Jg1 interfaceC49765Jg1 = this.LJLJJI;
            if (interfaceC49765Jg1 != null && interfaceC49765Jg1.getKeyword() != null) {
                this.LJLJJI.getKeyword();
            }
            jze.LJLJL = searchLiveStruct;
            Aweme liveAweme = searchLiveStruct.getLiveAweme();
            jze.LJLJLJ = liveAweme;
            if (liveAweme != null) {
                SmartImageView smartImageView = jze.LJLJLLL;
                if (smartImageView != null) {
                    jze.P(smartImageView);
                    Aweme aweme = jze.LJLJLJ;
                    if (aweme == null || (author10 = aweme.getAuthor()) == null || (urlModel2 = author10.roomCover) == null) {
                        Aweme aweme2 = jze.LJLJLJ;
                        if (aweme2 != null && (author9 = aweme2.getAuthor()) != null) {
                            urlModel2 = author9.getAvatarLarger();
                        } else {
                            urlModel2 = null;
                        }
                    }
                    W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel2));
                    LJII.LJJIIJ = jze.LJLJLLL;
                    Context context = jze.getContext();
                    S3I s3i = new S3I();
                    s3i.LJFF = new C81726W5q(V2B.LJI(context, 2.0f), V2B.LJI(context, 2.0f), 0.0f, 0.0f);
                    s3i.LIZIZ = V2B.LJI(context, 0.0f);
                    LJII.LJIJJLI = new S3L(s3i);
                    C16880lQ.LLJJJ(LJII);
                }
                if (jze.LJLL != null) {
                    Aweme aweme3 = jze.LJLJLJ;
                    if (aweme3 != null && (author8 = aweme3.getAuthor()) != null) {
                        urlModel = author8.getAvatarThumb();
                    } else {
                        urlModel = null;
                    }
                    W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel));
                    LJII2.LJIILIIL(J7H.LIZ(100));
                    LJII2.LJJIIJ = jze.LJLL;
                    C16880lQ.LLJJJ(LJII2);
                }
                Aweme aweme4 = jze.LJLJLJ;
                if (aweme4 != null && (author7 = aweme4.getAuthor()) != null) {
                    str3 = author7.getRoomTitle();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    TextView textView = jze.LJLLI;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    TextView textView2 = jze.LJLLI;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = jze.LJLLI;
                    if (textView3 != null) {
                        Aweme aweme5 = jze.LJLJLJ;
                        if (aweme5 != null && (author = aweme5.getAuthor()) != null) {
                            str4 = author.getRoomTitle();
                        } else {
                            str4 = null;
                        }
                        textView3.setText(str4);
                    }
                }
                View view = jze.LJLLJ;
                if (view != null) {
                    jze.P(view);
                }
                TextView textView4 = jze.LJLLILLLL;
                if (textView4 != null) {
                    Aweme aweme6 = jze.LJLJLJ;
                    if (aweme6 != null && (author2 = aweme6.getAuthor()) != null) {
                        str5 = author2.getSearchUserName();
                    } else {
                        str5 = null;
                    }
                    textView4.setText(str5);
                }
                Aweme liveAweme2 = searchLiveStruct.getLiveAweme();
                JQA LJLJL = jze.LJLJL();
                SearchGlobalViewModel M = jze.M();
                if (M != null) {
                    str6 = M.jv0();
                } else {
                    str6 = null;
                }
                LJLJL.LIZ(str6);
                JN8 LIZIZ2 = JND.LIZIZ(LJLJL);
                LIZIZ2.LJIIZILJ("token_type", "live_card");
                LIZIZ2.LJJI(Integer.valueOf(jze.getAdapterPosition()));
                LIZIZ2.LJJIIJZLJL(CardStruct.IStatusCode.DEFAULT);
                Aweme aweme7 = jze.LJLJLJ;
                if (aweme7 != null && (author6 = aweme7.getAuthor()) != null) {
                    l = Long.valueOf(C78934UyQ.LJIILJJIL(author6));
                } else {
                    l = null;
                }
                LIZIZ2.LJIJ("search_result_id", String.valueOf(l));
                LIZIZ2.LJIJI("search_result");
                LIZIZ2.LJJIIZ(liveAweme2);
                LIZIZ2.LJJIIZI(liveAweme2);
                LIZIZ2.LJIILIIL();
                HashMap hashMap = new HashMap();
                ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LIZ = LJJIJIL.LIZ()) != null) {
                    str9 = LIZ;
                }
                hashMap.put("sdk_version", str9);
                hashMap.put("_param_live_platform", "live");
                JQA LJLJL2 = jze.LJLJL();
                C49006JLe c49006JLe = new C49006JLe();
                c49006JLe.LJIIZILJ("enter_from_merge", "general_search");
                c49006JLe.LJIIZILJ("enter_method", "live_cell_more");
                if (liveAweme2 != null && (author5 = liveAweme2.getAuthor()) != null) {
                    l2 = Long.valueOf(C78934UyQ.LJIILJJIL(author5));
                } else {
                    l2 = null;
                }
                c49006JLe.LJIIZILJ("room_id", String.valueOf(l2));
                if (liveAweme2 != null && (author4 = liveAweme2.getAuthor()) != null) {
                    str7 = author4.getUid();
                } else {
                    str7 = null;
                }
                c49006JLe.LJIIZILJ("anchor_id", str7);
                c49006JLe.LJIIZILJ("action_type", "click");
                c49006JLe.LJIIZILJ("search_id", LJLJL2.LJII);
                c49006JLe.LJIIZILJ("search_type", LJLJL2.LIZJ);
                c49006JLe.LJIIZILJ("search_keyword", LJLJL2.LJ);
                if (liveAweme2 != null) {
                    str8 = liveAweme2.getRequestId();
                } else {
                    str8 = null;
                }
                c49006JLe.LJIIZILJ("request_id", str8);
                c49006JLe.LIZ(hashMap);
                Aweme aweme8 = jze.LJLJLJ;
                if (aweme8 != null && (author3 = aweme8.getAuthor()) != null) {
                    i2 = author3.getFollowStatus();
                }
                c49006JLe.LJJIII(i2);
                c49006JLe.LJIILIIL();
            }
            JZC handler = this.LJLJLJ;
            o.LJIIIZ(handler, "handler");
            jze.LJLLL = handler;
        }
        this.LJLJJL.LIZ(i, getBasicItemCount());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZD(SearchResultParam searchResultParam, InterfaceC49816Jgq keywordReader, JZI loadMoreFunction, InterfaceC50036JkO liveLoadMoreListener) {
        super(searchResultParam, keywordReader, loadMoreFunction);
        o.LJIIIZ(keywordReader, "keywordReader");
        o.LJIIIZ(loadMoreFunction, "loadMoreFunction");
        o.LJIIIZ(liveLoadMoreListener, "liveLoadMoreListener");
        this.LJLJLJ = new JZC(this, liveLoadMoreListener);
    }
}

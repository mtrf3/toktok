package com.ss.android.ugc.now.interaction.ui;

import X.ActivityC45651qj;
import X.AnonymousClass733;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C177996yh;
import X.C1794072i;
import X.C188727au;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C76800UCe;
import X.C77123UOp;
import X.C79045V0n;
import X.C7GI;
import X.C8VV;
import X.C90903hW;
import X.EF7;
import X.FMX;
import X.InterfaceC1802075k;
import X.JBR;
import X.SY9;
import X.SYL;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LikeListFragment extends AbsFragment implements InterfaceC1802075k {
    public SYL LJLIL;
    public Aweme LJLILLLLZI;
    public NowFeedMobHierarchyData LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // X.InterfaceC1802075k
    public final void ch(AnonymousClass733 container) {
        o.LJIIIZ(container, "container");
    }

    @Override // X.InterfaceC1802075k
    public final void setAid(String str) {
    }

    @Override // X.InterfaceC1802075k
    public final String Qf() {
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        long j = 0;
        if (C7GI.LIZJ(this.LJLJJL)) {
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
                j = statistics2.getDiggCount();
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(count)");
            return LJJIIJ;
        }
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
            j = statistics.getDiggCount();
        }
        String quantityString = EF7.LIZIZ().getResources().getQuantityString(R.plurals.jl, (int) j, Long.valueOf(j));
        o.LJIIIIZZ(quantityString, "AppContextManager.getApp…     count,\n            )");
        return quantityString;
    }

    @Override // X.InterfaceC1802075k
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_thumbs_up);
        Integer LJI = C79045V0n.LJI(R.attr.gx, context);
        if (LJI != null) {
            sy9.LJ(LJI.intValue());
        }
        return sy9;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.InterfaceC1802075k
    public final RecyclerView LLIIIZ() {
        return this.LJLIL;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // X.InterfaceC1802075k
    public final void LLJLILLLLZIIL(int i) {
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC1802075k
    public final void nb(NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLJI = nowFeedMobHierarchyData;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1802075k
    public final void setData(Aweme aweme) {
        this.LJLILLLLZI = aweme;
    }

    @Override // X.InterfaceC1802075k
    public final void A7(String str, String str2) {
        String str3;
        Integer num;
        String str4;
        Integer num2;
        String str5;
        String str6;
        long j;
        C177996yh.LIZIZ("LikeListFragment", "onCommentPageDismiss");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJI;
            Integer num3 = null;
            if (nowFeedMobHierarchyData != null) {
                str3 = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                str3 = null;
            }
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            if (author != null) {
                num = Integer.valueOf(author.getFollowStatus());
            } else {
                num = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str4 = nowPostInfo.getNowMediaType();
            } else {
                str4 = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LJLJI;
            if (nowFeedMobHierarchyData2 != null) {
                num2 = nowFeedMobHierarchyData2.isNowClear();
            } else {
                num2 = null;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str3);
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("author_id", authorUid);
            c188727au.LJFF(num, "follow_status");
            c188727au.LJIIIZ("action_type", str);
            c188727au.LJIIIZ("now_type", str4);
            c188727au.LJIIIZ("enter_method", str2);
            c188727au.LJFF(num2, "is_now_clear");
            FMX.LJIIL("close_reaction_panel", c188727au.LIZ);
            if (C45804HyK.LJJJJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LJLJI;
                if (nowFeedMobHierarchyData3 != null) {
                    str5 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    str5 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str6 = nowPostInfo2.getNowMediaType();
                } else {
                    str6 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = aweme.getAuthorUid();
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    num3 = Integer.valueOf(author2.getFollowStatus());
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    j = statistics.getPlayCount();
                } else {
                    j = 0;
                }
                C1794072i.LIZIZ(str5, "reaction", str2, str6, str, aid2, authorUid2, num3, Long.valueOf(j));
            }
        }
    }

    @Override // X.InterfaceC1802075k
    public final void f0(ActivityC45651qj activityC45651qj, String str) {
        String str2;
        Integer num;
        String str3;
        Long l;
        Integer num2;
        String str4;
        String str5;
        long j;
        SYL syl;
        if (getUserVisibleHint() && !this.LJLJJI && mo49getActivity() != null) {
            this.LJLJJI = true;
        }
        if (o.LJ(str, "change_tab") && (syl = this.LJLIL) != null) {
            C12460eI.LIZ(syl);
        }
        C177996yh.LIZIZ("LikeListFragment", "onCommentPageShow");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJI;
            Integer num3 = null;
            if (nowFeedMobHierarchyData != null) {
                str2 = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                str2 = null;
            }
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            if (author != null) {
                num = Integer.valueOf(author.getFollowStatus());
            } else {
                num = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str3 = nowPostInfo.getNowMediaType();
            } else {
                str3 = null;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                l = Long.valueOf(statistics.getDiggCount());
            } else {
                l = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LJLJI;
            if (nowFeedMobHierarchyData2 != null) {
                num2 = nowFeedMobHierarchyData2.isNowClear();
            } else {
                num2 = null;
            }
            C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", str2, "group_id", aid);
            LJIIIIZZ.LJI("author_id", authorUid);
            LJIIIIZZ.LJFF(num, "follow_status");
            LJIIIIZZ.LJI("now_type", str3);
            LJIIIIZZ.LJI("enter_method", str);
            LJIIIIZZ.LJFF(l, "comment_cnt");
            LJIIIIZZ.LJFF(num2, "is_now_clear");
            FMX.LJIIL("show_reaction_panel", LJIIIIZZ.LIZ);
            if (C45804HyK.LJJJJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LJLJI;
                if (nowFeedMobHierarchyData3 != null) {
                    str4 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    str4 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str5 = nowPostInfo2.getNowMediaType();
                } else {
                    str5 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = aweme.getAuthorUid();
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    num3 = Integer.valueOf(author2.getFollowStatus());
                }
                AwemeStatistics statistics2 = aweme.getStatistics();
                if (statistics2 != null) {
                    j = statistics2.getPlayCount();
                } else {
                    j = 0;
                }
                C1794072i.LIZJ(str4, "reaction", str, str5, aid2, authorUid2, num3, Long.valueOf(j));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SYL syl;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 825));
        View view2 = getView();
        if (view2 != null) {
            syl = (SYL) view2.findViewById(R.id.isf);
        } else {
            syl = null;
        }
        this.LJLIL = syl;
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.title);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        try {
            view = C16880lQ.LLLLIILL(inflater, R.layout.ban, viewGroup, false);
        } catch (Exception unused) {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}

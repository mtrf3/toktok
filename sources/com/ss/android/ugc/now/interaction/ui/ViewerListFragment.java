package com.ss.android.ugc.now.interaction.ui;

import X.ActivityC45651qj;
import X.AnonymousClass733;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C177996yh;
import X.C1794072i;
import X.C29S;
import X.C3C5;
import X.C45631qh;
import X.C45804HyK;
import X.C76800UCe;
import X.C77123UOp;
import X.C79045V0n;
import X.C7GI;
import X.C8VV;
import X.C90903hW;
import X.EF7;
import X.InterfaceC1802075k;
import X.SY4;
import X.SY9;
import X.SYL;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
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
public final class ViewerListFragment extends AbsFragment implements InterfaceC1802075k {
    public SYL LJLIL;
    public C45631qh LJLILLLLZI;
    public Aweme LJLJI;
    public NowFeedMobHierarchyData LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

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
        if (C7GI.LIZJ(this.LJLJJLL)) {
            Aweme aweme = this.LJLJI;
            if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
                j = statistics2.getPlayCount();
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(count)");
            return LJJIIJ;
        }
        Aweme aweme2 = this.LJLJI;
        if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
            j = statistics.getPlayCount();
        }
        String quantityString = EF7.LIZIZ().getResources().getQuantityString(R.plurals.jn, (int) j, Long.valueOf(j));
        o.LJIIIIZZ(quantityString, "AppContextManager.getApp…     count,\n            )");
        return quantityString;
    }

    @Override // X.InterfaceC1802075k
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_play);
        Integer LJI = C79045V0n.LJI(R.attr.gx, context);
        if (LJI != null) {
            sy9.LJ(LJI.intValue());
        }
        return sy9;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
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
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC1802075k
    public final void nb(NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LJLJJI = nowFeedMobHierarchyData;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1802075k
    public final void setData(Aweme aweme) {
        this.LJLJI = aweme;
    }

    @Override // X.InterfaceC1802075k
    public final void A7(String str, String str2) {
        String str3;
        String str4;
        long j;
        C177996yh.LIZIZ("ViewerListFragment", "onViewerPageDismiss");
        Aweme aweme = this.LJLJI;
        if (aweme != null && C45804HyK.LJJJJ(aweme)) {
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJJI;
            Integer num = null;
            if (nowFeedMobHierarchyData != null) {
                str3 = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                str3 = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str4 = nowPostInfo.getNowMediaType();
            } else {
                str4 = null;
            }
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            if (author != null) {
                num = Integer.valueOf(author.getFollowStatus());
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getPlayCount();
            } else {
                j = 0;
            }
            C1794072i.LIZIZ(str3, "views", str2, str4, str, aid, authorUid, num, Long.valueOf(j));
        }
    }

    @Override // X.InterfaceC1802075k
    public final void f0(ActivityC45651qj activityC45651qj, String str) {
        String str2;
        String str3;
        String str4;
        SYL syl;
        if (getUserVisibleHint() && !this.LJLJJL && mo49getActivity() != null) {
            this.LJLJJL = true;
        }
        if (o.LJ(str, "change_tab") && (syl = this.LJLIL) != null) {
            C12460eI.LIZ(syl);
        }
        C177996yh.LIZIZ("ViewerListFragment", "onViewerPageShow");
        Aweme aweme = this.LJLJI;
        if (aweme != null && C45804HyK.LJJJJ(aweme)) {
            long j = 0;
            String str5 = null;
            Integer num = null;
            if (C7GI.LIZIZ()) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJJI;
                if (nowFeedMobHierarchyData != null) {
                    str3 = nowFeedMobHierarchyData.getEnterFrom();
                } else {
                    str3 = null;
                }
                NowPostInfo nowPostInfo = aweme.nowPostInfo;
                if (nowPostInfo != null) {
                    str4 = nowPostInfo.getNowMediaType();
                } else {
                    str4 = null;
                }
                String aid = aweme.getAid();
                String authorUid = aweme.getAuthorUid();
                User author = aweme.getAuthor();
                if (author != null) {
                    num = Integer.valueOf(author.getFollowStatus());
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                C1794072i.LIZJ(str3, "views", str, str4, aid, authorUid, num, Long.valueOf(j));
                return;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LJLJJI;
            if (nowFeedMobHierarchyData2 == null || (str2 = nowFeedMobHierarchyData2.getEnterFrom()) == null) {
                str2 = "";
            }
            NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
            if (nowPostInfo2 != null) {
                str5 = nowPostInfo2.getNowMediaType();
            }
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                j = statistics2.getPlayCount();
            }
            C1794072i.LJFF(j, str2, "show", str5);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SY4 sy4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C45631qh c45631qh = null;
        SYL syl = null;
        if (C7GI.LIZIZ()) {
            C8VV.LIZ(this, false, new AqS169S0100000_3(this, 820));
            View view2 = getView();
            if (view2 != null) {
                syl = (SYL) view2.findViewById(R.id.isf);
            }
            this.LJLIL = syl;
            View view3 = getView();
            if (view3 != null) {
                view3.findViewById(R.id.title);
                return;
            }
            return;
        }
        View view4 = getView();
        if (view4 != null) {
            c45631qh = (C45631qh) view4.findViewById(R.id.kw4);
        }
        this.LJLILLLLZI = c45631qh;
        if (c45631qh != null) {
            c45631qh.post(new ARunnableS39S0100000_3(this, 183));
        }
        View view5 = getView();
        if (view5 == null || (sy4 = (SY4) view5.findViewById(R.id.az5)) == null) {
            return;
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 258));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        try {
            if (C7GI.LIZIZ()) {
                view = C16880lQ.LLLLIILL(inflater, R.layout.bap, viewGroup, false);
            } else {
                view = C16880lQ.LLLLIILL(inflater, R.layout.baq, viewGroup, false);
            }
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

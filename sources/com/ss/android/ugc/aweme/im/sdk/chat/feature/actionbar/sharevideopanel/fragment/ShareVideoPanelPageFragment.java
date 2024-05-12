package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment;

import X.AbstractC030309z;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C110494Vh;
import X.C119254m9;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C252569vg;
import X.C26045AKb;
import X.C27740Aue;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C48203Ivv;
import X.C4GS;
import X.C51031K1b;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C8HS;
import X.C90903hW;
import X.C92103jS;
import X.EnumC111394Yt;
import X.EnumC92073jP;
import X.FKM;
import X.HG3;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.LFH;
import X.ORZ;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelPageFragment;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareVideoPanelPageFragment extends BaseFragment implements InterfaceC223218pR<Aweme>, InterfaceC191547fS {
    public static final /* synthetic */ int LJLL = 0;
    public int LJLIL;
    public C73305Spp LJLILLLLZI;
    public C119254m9 LJLJI;
    public RecyclerView LJLJJI;
    public C51031K1b<AbstractC51036K1g<Aweme, FeedItemList>> LJLJJL;
    public C4GS LJLJJLL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C73306Spq LJLJL = new C73306Spq();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C92103jS.LJLIL);

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        C119254m9 c119254m9 = this.LJLJI;
        if (c119254m9 == null) {
            return;
        }
        c119254m9.setLoading(true);
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        C51031K1b<AbstractC51036K1g<Aweme, FeedItemList>> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LJIILL(4, Boolean.TRUE, HG3.LJIILL().getCurUserId(), Integer.valueOf(vl()), 7000, HG3.LJIILL().getCurSecUserId());
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        C119254m9 c119254m9 = this.LJLJI;
        if (c119254m9 != null) {
            c119254m9.setLoading(false);
        }
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setStatus(this.LJLJL);
        }
    }

    public final void refresh() {
        C51031K1b<AbstractC51036K1g<Aweme, FeedItemList>> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LJIILL(1, Boolean.TRUE, HG3.LJIILL().getCurUserId(), Integer.valueOf(vl()), 1000, HG3.LJIILL().getCurSecUserId());
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C4GS c4gs = this.LJLJJLL;
        if (c4gs != null) {
            c4gs.showLoadMoreLoading();
        }
    }

    public final int vl() {
        int i = this.LJLIL;
        if (i == EnumC92073jP.LIKED.getType()) {
            return 1;
        }
        if (i == EnumC92073jP.FAVORITE.getType()) {
            return 4;
        }
        EnumC92073jP.YOURS.getType();
        return 0;
    }

    public final int wl() {
        return LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ValueAnimator animator;
        super.onDestroyView();
        C119254m9 c119254m9 = this.LJLJI;
        if (c119254m9 != null && (animator = c119254m9.getAnimator()) != null) {
            animator.cancel();
        }
        C51031K1b<AbstractC51036K1g<Aweme, FeedItemList>> c51031K1b = this.LJLJJL;
        if (c51031K1b != null) {
            c51031K1b.LJJII();
            c51031K1b.LIZIZ();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        C119254m9 c119254m9 = this.LJLJI;
        if (c119254m9 != null) {
            c119254m9.setLoading(false);
        }
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            C252569vg.LIZ(c73305Spp, "share_video_panel_page", exc, new C110494Vh(this));
            if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE && C48203Ivv.LIZJ(FKM.LIZ())) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.dtk);
                c26045AKb.LJIIJ();
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C4GS c4gs;
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null && (c4gs = this.LJLJJLL) != null) {
            c4gs.showPullUpLoadMore(recyclerView, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        super.onActivityCreated(bundle);
        if (LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm") && (mo49getActivity = mo49getActivity()) != null) {
            C27740Aue.LJII(mo49getActivity);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        RecyclerView recyclerView = this.LJLJJI;
        C0A2 c0a2 = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if ((c0a2 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) c0a2) != null) {
            gridLayoutManager.LLJLIL(wl());
            RecyclerView recyclerView2 = this.LJLJJI;
            if (recyclerView2 != null) {
                recyclerView2.LJJJJZI();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(new AqS173S0100000_7(this, 69));
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (!C54838Lfe.LJJI(aweme2) && aweme2.getAwemeType() != 43 && aweme2.getAwemeType() != 41) {
                    arrayList.add(aweme);
                }
            }
            if (!arrayList.isEmpty()) {
                C119254m9 c119254m9 = this.LJLJI;
                if (c119254m9 != null) {
                    c119254m9.setLoading(false);
                }
                C73305Spp c73305Spp = this.LJLILLLLZI;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(8);
                }
                C4GS c4gs = this.LJLJJLL;
                if (c4gs != null) {
                    c4gs.setData(ORZ.LLJILJILJ(arrayList));
                    if (z) {
                        c4gs.setLoadMoreListener(this);
                        return;
                    } else {
                        c4gs.setLoadMoreListener((InterfaceC191547fS) null);
                        c4gs.setShowFooter(false);
                        return;
                    }
                }
                return;
            }
        }
        Ne();
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        C4GS c4gs = this.LJLJJLL;
        if (c4gs != null) {
            if (list == null) {
                list = c4gs.getData();
            }
            c4gs.setDataAfterLoadMore(list);
            if (z) {
                c4gs.resetLoadMoreState();
            } else {
                c4gs.setLoadMoreListener((InterfaceC191547fS) null);
                c4gs.setShowFooter(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.4GS] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final String string;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = arguments.getInt("panel_type");
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("conversation_id")) == null) {
                return;
            }
            this.LJLILLLLZI = (C73305Spp) view.findViewById(R.id.jvf);
            C119254m9 c119254m9 = (C119254m9) view.findViewById(R.id.jve);
            this.LJLJI = c119254m9;
            if (c119254m9 != null) {
                c119254m9.setPreviewItemRes(LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIIJZLJL(wl()));
            }
            C119254m9 c119254m92 = this.LJLJI;
            if (c119254m92 != null) {
                c119254m92.setAnimationDuration(800L);
            }
            this.LJLJJI = (RecyclerView) view.findViewById(R.id.jvd);
            final int i = this.LJLIL;
            this.LJLJJLL = new C8HS<Aweme>(i, this, string) { // from class: X.4GS
                public final Fragment LJLIL;
                public final String LJLILLLLZI;
                public final int LJLJI;
                public final int LJLJJI;

                @Override // X.MK7, X.AbstractC029409q
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
                    C4GR c4gr;
                    Context context;
                    Activity LJIJJ;
                    o.LJIIIZ(holder, "holder");
                    super.onViewAttachedToWindow(holder);
                    if ((holder instanceof C4GR) && (c4gr = (C4GR) holder) != null && (context = c4gr.itemView.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                        C9XU.LIZIZ(LJIJJ, c4gr);
                    }
                }

                @Override // X.MK7, X.AbstractC029409q
                public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
                    C4GR c4gr;
                    o.LJIIIZ(holder, "holder");
                    super.onViewDetachedFromWindow(holder);
                    if ((holder instanceof C4GR) && (c4gr = (C4GR) holder) != null) {
                        C9XU.LIZLLL(c4gr);
                    }
                }

                @Override // X.C4II
                public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    UrlModel urlModel;
                    long j;
                    List<Aweme> data = getData();
                    if (data != null && (viewHolder instanceof C4GR)) {
                        C4GR c4gr = (C4GR) viewHolder;
                        Aweme aweme = (Aweme) ListProtector.get(data, i2);
                        c4gr.getClass();
                        o.LJIIIZ(aweme, "aweme");
                        c4gr.LJLJL = aweme;
                        c4gr.LJLJLJ = i2;
                        c4gr.LJLJLLL.LIZIZ(aweme);
                        Video video = aweme.getVideo();
                        if (video != null) {
                            urlModel = video.getCover();
                        } else {
                            urlModel = null;
                        }
                        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                        LJII.LJJIIJ = c4gr.LJLJJL;
                        C16880lQ.LLJJJ(LJII);
                        TuxTextView tuxTextView = c4gr.LJLJJLL;
                        if (tuxTextView == null) {
                            return;
                        }
                        AwemeStatistics statistics = aweme.getStatistics();
                        if (statistics != null) {
                            j = statistics.getPlayCount();
                        } else {
                            j = 0;
                        }
                        tuxTextView.setText(C77123UOp.LJJIIJ(j));
                    }
                }

                @Override // X.C4II
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
                    View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b2t, viewGroup, false);
                    o.LJIIIIZZ(itemView, "itemView");
                    return new C4GR(itemView, this.LJLILLLLZI, this.LJLIL, this.LJLJI, this.LJLJJI);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(false, 1, null);
                    o.LJIIIZ(this, "fragment");
                    this.LJLIL = this;
                    this.LJLILLLLZI = string;
                    this.LJLJI = i;
                    this.LJLJJI = 3;
                }
            };
            AbstractC51036K1g<Aweme, ?> createAwemeModel = ProfileServiceImpl.LIZ().createAwemeModel();
            if ((createAwemeModel instanceof AbstractC51036K1g) && createAwemeModel != null) {
                C51031K1b<AbstractC51036K1g<Aweme, FeedItemList>> c51031K1b = new C51031K1b<>();
                c51031K1b.LJJ(createAwemeModel);
                c51031K1b.LJLILLLLZI = this;
                this.LJLJJL = c51031K1b;
            }
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(wl()));
                recyclerView.setAdapter(this.LJLJJLL);
                recyclerView.LJII(new AbstractC030309z() { // from class: X.4Vg
                    @Override // X.AbstractC030309z
                    public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                        T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                        super.LJ(rect, view2, recyclerView2, c0ac);
                        int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                        if (LJJJJIZL < 0) {
                            return;
                        }
                        boolean z = true;
                        if ((LJJJJIZL + 1) % ShareVideoPanelPageFragment.this.wl() != 0) {
                            z = false;
                        }
                        if (!z) {
                            rect.right = AnonymousClass391.LIZ(1.5d);
                        }
                        rect.bottom = AnonymousClass391.LIZ(1.5d);
                    }
                }, -1);
            }
            C73306Spq c73306Spq = this.LJLJL;
            String string2 = getString(R.string.b6g);
            o.LJIIIIZZ(string2, "getString(R.string.action_bar_empty_state_header)");
            c73306Spq.getClass();
            c73306Spq.LJFF = string2;
            int i2 = this.LJLIL;
            if (i2 == EnumC92073jP.LIKED.getType()) {
                str = getString(R.string.b6h);
                o.LJIIIIZZ(str, "getString(R.string.actio…ar_empty_state_like_body)");
            } else if (i2 == EnumC92073jP.FAVORITE.getType()) {
                str = getString(R.string.b6f);
                o.LJIIIIZZ(str, "getString(R.string.actio…bar_empty_state_fav_body)");
            } else if (i2 == EnumC92073jP.YOURS.getType()) {
                str = getString(R.string.b6i);
                o.LJIIIIZZ(str, "getString(R.string.actio…ar_empty_state_your_body)");
            } else {
                str = "";
            }
            c73306Spq.LJI = str;
            refresh();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2a, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}

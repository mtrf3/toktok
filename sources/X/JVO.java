package X;

import Y.ACListenerS28S0100000_8;
import Y.AObjectS31S0000000_8;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.IDqS452S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JVO extends C8HS<SearchMixFeed> implements InterfaceC49498Jbi, JWN<SearchMixFeed> {
    public static final C78880UxY LJLZ = new C78880UxY();
    public final RecyclerView LJLIL;
    public final JIB LJLILLLLZI;
    public final JV4 LJLJI;
    public final InterfaceC191547fS LJLJJI;
    public InterfaceC48970JJu LJLJJL;
    public ClickSearchViewModel LJLJJLL;
    public SearchResultParam LJLJL;
    public GlobalDoodleConfig LJLJLJ;
    public final C49491Jbb LJLJLLL;
    public final C49002JLa<SearchMixFeed> LJLL;
    public final SearchGlobalViewModel LJLLI;
    public final C49636Jdw LJLLILLLL;
    public final JZG LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final JYU LJLLLLLL;

    public final int LJIJ() {
        List<T> list = this.mmItems;
        if (list != 0) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (JWA.LIZIZ(((SearchMixFeed) it.next()).LJI().schema)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final SearchMixFeed LJLZ() {
        List<T> list = this.mmItems;
        Object obj = null;
        if (list == 0) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SearchMixFeed searchMixFeed = (SearchMixFeed) next;
            if (searchMixFeed.LJIIIIZZ() && C49111JPf.LIZJ(searchMixFeed)) {
                obj = next;
                break;
            }
        }
        return (SearchMixFeed) obj;
    }

    public final boolean LJZI() {
        Aweme aweme;
        java.util.Map<String, String> searchExtraParams;
        SearchMixFeed LJLZ2 = LJLZ();
        if (LJLZ2 != null && (aweme = LJLZ2.getAweme()) != null && (searchExtraParams = aweme.getSearchExtraParams()) != null && searchExtraParams.containsKey("is_click_trending_native_card_enter")) {
            return true;
        }
        return false;
    }

    public static int LJZ(SearchMixFeed searchMixFeed) {
        switch (searchMixFeed.getFeedType()) {
            case 61:
                return 11;
            case 70:
                return 10;
            case 555:
                return 12;
            case 65280:
                return 1;
            case 65458:
                return 2;
            case 65465:
                return 5;
            case 65467:
                return 6;
            case 65514:
                return 8;
            default:
                return -1;
        }
    }

    @Override // X.InterfaceC49350JYk
    public final boolean LJJIJIL(int i) {
        List<T> list;
        if (i < 0 || (list = this.mmItems) == 0 || i >= list.size()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC49350JYk
    public final Object LJJIZ(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            return ListProtector.get(list, i);
        }
        return null;
    }

    @Override // X.InterfaceC49498Jbi
    public final JSH LJJLIIIJJI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return JSI.LIZIZ(parent);
    }

    public final int LJJLIIIJL(String str) {
        String str2;
        List<Aweme> awemeList;
        Aweme aweme;
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        int i = 0;
        for (T t : list) {
            if (t.getFeedType() == 65514) {
                DynamicPatch LJI = t.LJI();
                if (LJI != null && (awemeList = LJI.getAwemeList()) != null && (aweme = (Aweme) ORZ.LJLLLL(awemeList)) != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, str)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    @Override // X.InterfaceC49498Jbi
    public final SearchBotHolder LJLIIL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new SearchBotHolder(C50365Jph.LIZIZ(R.layout.ci2, parent));
    }

    @Override // X.InterfaceC49498Jbi
    public final C49206JSw LJLLI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C49208JSy.LIZ(parent);
    }

    public final int LJLLLLLL(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "aweme");
        List<T> list = this.mmItems;
        if (list != 0) {
            int i = 0;
            for (T t : list) {
                if (LJZ(t) == 1) {
                    Aweme aweme2 = t.getAweme();
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, aweme.getAid())) {
                        return i;
                    }
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            return LJZ((SearchMixFeed) ListProtector.get(list, i));
        }
        return -1;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.LJLLLLLL.getClass();
        C49618Jde.LIZ(this.LJLIL, new ARunnableS27S0200000_8(this, holder, 84));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.LJLLLLLL.getClass();
        if (holder instanceof JW4) {
            C49262JVa.LIZ((JW4) holder);
        }
        if (holder instanceof AbstractC208618Gr) {
            ((AbstractC208618Gr) holder).LJJII(false);
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        JY2.LIZJ(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof InterfaceC49284JVw) {
            ((InterfaceC49284JVw) holder).LJJJJIZL();
        }
    }

    @Override // X.C8HS
    public final void setData(List<SearchMixFeed> list) {
        List arrayList;
        this.LJLLL = 0;
        this.LJLLLLLL.LIZIZ();
        this.LJLL.LIZJ(new AObjectS31S0000000_8(5), list);
        if (list == null || (arrayList = ORZ.LLJILJILJ(list)) == null) {
            arrayList = new ArrayList();
            setShowFooter(false);
        }
        List<T> list2 = this.mmItems;
        this.mmItems = arrayList;
        if (list2 != 0) {
            if (list2.size() > arrayList.size()) {
                notifyDataSetChanged();
            } else {
                int i = 0;
                while (i < list2.size() && ListProtector.get(list2, i) == ListProtector.get(arrayList, i)) {
                    i++;
                }
                if (i == 0) {
                    notifyDataSetChanged();
                } else {
                    int size = arrayList.size() - i;
                    int size2 = list2.size() - i;
                    if (size2 > 0) {
                        notifyItemRangeRemoved(i, size2);
                    }
                    if (size > 0) {
                        notifyItemRangeInserted(i, size);
                    }
                }
                this.LJLIL.LJLI(0);
            }
        } else {
            notifyDataSetChanged();
        }
        C49491Jbb.LJIIIZ.set(0);
        JZG jzg = this.LJLLJ;
        if (jzg != null) {
            jzg.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<SearchMixFeed> list) {
        this.LJLL.LIZJ(new AObjectS31S0000000_8(6), list);
        super.setDataAfterLoadMore(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[DONT_GENERATE] */
    @Override // X.JWN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVO.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.JWN
    public RecyclerView.ViewHolder LJJJJL(int i, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 8) {
                            C78880UxY c78880UxY = LJLZ;
                            switch (i) {
                                case 10:
                                    SearchResultParam searchResultParam = this.LJLJL;
                                    JIB containerStatusProvider = this.LJLILLLLZI;
                                    o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
                                    return new JPM(searchResultParam, C50365Jph.LIZIZ(R.layout.chu, parent), containerStatusProvider, c78880UxY);
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    return C49126JPu.LIZ(parent, this.LJLILLLLZI, c78880UxY);
                                case 12:
                                    JIB containerStatusProvider2 = this.LJLILLLLZI;
                                    o.LJIIIZ(containerStatusProvider2, "containerStatusProvider");
                                    return new JPP(C50365Jph.LIZIZ(R.layout.chr, parent), containerStatusProvider2, c78880UxY);
                                default:
                                    return new C49282JVu(new View(parent.getContext()));
                            }
                        }
                        return this.LJLJLLL.LIZ();
                    }
                    return new C49571Jct(C50365Jph.LIZIZ(R.layout.ch4, parent), parent);
                }
                return new JUW(C50365Jph.LIZIZ(R.layout.ci4, parent));
            }
            C49491Jbb c49491Jbb = this.LJLJLLL;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49491Jbb.LIZLLL.LIZ).poll();
            if (viewHolder == null) {
                viewHolder = c49491Jbb.LIZLLL.LIZ();
            }
            o.LJIIIIZZ(viewHolder, "viewHolder");
            return viewHolder;
        }
        C49491Jbb c49491Jbb2 = this.LJLJLLL;
        RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49491Jbb2.LJ.LIZ).poll();
        if (viewHolder2 == null) {
            C49494Jbe c49494Jbe = c49491Jbb2.LJFF;
            if (((ConcurrentLinkedQueue) c49494Jbe.LIZ).size() <= 0 || (viewHolder2 = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49494Jbe.LIZ).poll()) == null) {
                viewHolder2 = c49491Jbb2.LJ.LIZ();
            }
        }
        o.LJIIIIZZ(viewHolder2, "viewHolder");
        return viewHolder2;
    }

    @Override // X.InterfaceC49350JYk
    public final boolean LJJJLIIL(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return false;
        }
        return o.LJ(obj, obj2);
    }

    @Override // X.InterfaceC49498Jbi
    public final RecyclerView.ViewHolder LJJLIIIJLLLLLLLZ(ViewGroup parent, boolean z) {
        int i;
        Aweme aweme;
        o.LJIIIZ(parent, "parent");
        JIB provider = this.LJLILLLLZI;
        JV4 jv4 = this.LJLJI;
        ClickSearchViewModel clickSearchViewModel = this.LJLJJLL;
        InterfaceC48970JJu interfaceC48970JJu = this.LJLJJL;
        if (interfaceC48970JJu != null) {
            o.LJIIIZ(provider, "provider");
            View LIZIZ = C50365Jph.LIZIZ(R.layout.ciy, parent);
            ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp = new ViewOnAttachStateChangeListenerC49251JUp(LIZIZ);
            viewOnAttachStateChangeListenerC49251JUp.LLIILII = provider;
            viewOnAttachStateChangeListenerC49251JUp.LLIIL = jv4;
            viewOnAttachStateChangeListenerC49251JUp.LLIILZL = interfaceC48970JJu;
            viewOnAttachStateChangeListenerC49251JUp.LLIIZ = clickSearchViewModel;
            View findViewById = LIZIZ.findViewById(R.id.lh3);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.top_video_divider)");
            viewOnAttachStateChangeListenerC49251JUp.LJLJL = findViewById;
            View findViewById2 = LIZIZ.findViewById(R.id.lhe);
            o.LJIIIIZZ(findViewById2, "view.findViewById<Avatar…id.top_video_user_avatar)");
            C57128MbU c57128MbU = (C57128MbU) findViewById2;
            C57127MbT avatarImageView = c57128MbU.getAvatarImageView();
            o.LJIIIIZZ(avatarImageView, "avatarImageView");
            C49421JaT.LJFF(avatarImageView);
            viewOnAttachStateChangeListenerC49251JUp.LJLJLJ = c57128MbU;
            View findViewById3 = LIZIZ.findViewById(R.id.lhg);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.top_video_user_live_avatar)");
            viewOnAttachStateChangeListenerC49251JUp.LJLJLLL = (C53873LCj) findViewById3;
            View findViewById4 = LIZIZ.findViewById(R.id.lhj);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.top_video_username)");
            viewOnAttachStateChangeListenerC49251JUp.LJLL = (TextView) findViewById4;
            View findViewById5 = LIZIZ.findViewById(R.id.lhi);
            o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.t…video_user_relation_text)");
            viewOnAttachStateChangeListenerC49251JUp.LJLLI = (TextView) findViewById5;
            View findViewById6 = LIZIZ.findViewById(R.id.lhd);
            o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.top_video_timestamp)");
            viewOnAttachStateChangeListenerC49251JUp.LJLLILLLL = (TextView) findViewById6;
            Context context = viewOnAttachStateChangeListenerC49251JUp.LJLILLLLZI;
            o.LJIIIIZZ(context, "context");
            JVU jvu = new JVU(context, LIZIZ);
            jvu.setReferencedIds(new int[]{R.id.lhh, R.id.lhi});
            viewOnAttachStateChangeListenerC49251JUp.LJLLJ = jvu;
            Context context2 = viewOnAttachStateChangeListenerC49251JUp.LJLILLLLZI;
            o.LJIIIIZZ(context2, "context");
            JVU jvu2 = new JVU(context2, LIZIZ);
            jvu2.setReferencedIds(new int[]{R.id.lhj, R.id.lhd});
            viewOnAttachStateChangeListenerC49251JUp.LJLLL = jvu2;
            C57128MbU c57128MbU2 = viewOnAttachStateChangeListenerC49251JUp.LJLJLJ;
            if (c57128MbU2 != null) {
                c57128MbU2.setOnClickListener(new ViewOnClickListenerC13880ga((View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJJ.getValue()));
                JVU jvu3 = viewOnAttachStateChangeListenerC49251JUp.LJLLL;
                if (jvu3 != null) {
                    JVD.LIZJ(jvu3, (View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJJ.getValue());
                    View findViewById7 = LIZIZ.findViewById(R.id.lgv);
                    o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.top_video_caption)");
                    viewOnAttachStateChangeListenerC49251JUp.LJLLLL = (TuxTextLayoutView) findViewById7;
                    View findViewById8 = LIZIZ.findViewById(R.id.lh1);
                    o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.top_video_core_group)");
                    viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL = (ConstraintLayout) findViewById8;
                    View findViewById9 = LIZIZ.findViewById(R.id.lh8);
                    o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.top_video_player_view)");
                    viewOnAttachStateChangeListenerC49251JUp.LJZ = (C48887JGp) findViewById9;
                    View findViewById10 = LIZIZ.findViewById(R.id.lh2);
                    o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.top_video_cover)");
                    viewOnAttachStateChangeListenerC49251JUp.LJLZ = (C164086cG) findViewById10;
                    View findViewById11 = LIZIZ.findViewById(R.id.lhc);
                    o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.top_video_tag)");
                    viewOnAttachStateChangeListenerC49251JUp.LJZI = (TuxTextView) findViewById11;
                    View findViewById12 = LIZIZ.findViewById(R.id.lh9);
                    o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.top_video_progress_bar)");
                    viewOnAttachStateChangeListenerC49251JUp.LJZL = (ProgressBar) findViewById12;
                    View findViewById13 = LIZIZ.findViewById(R.id.lh7);
                    o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.top_video_player_button)");
                    JOM jom = (JOM) findViewById13;
                    viewOnAttachStateChangeListenerC49251JUp.LL = jom;
                    jom.setOnClickListener(new ViewOnClickListenerC13880ga((View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJ.getValue()));
                    C164086cG c164086cG = viewOnAttachStateChangeListenerC49251JUp.LJLZ;
                    if (c164086cG != null) {
                        Context context3 = viewOnAttachStateChangeListenerC49251JUp.LJLILLLLZI;
                        o.LJIIIIZZ(context3, "context");
                        Integer LJI = C79045V0n.LJI(R.attr.cj, context3);
                        if (LJI != null) {
                            i = LJI.intValue();
                        } else {
                            i = 0;
                        }
                        c164086cG.setPlaceholderImage(C51763KTf.LIZ(0.0f, 0.0f, 0.0f, 0.0f, i));
                        viewOnAttachStateChangeListenerC49251JUp.LLIIJLIL = LIZIZ.findViewById(R.id.n6s);
                        if (C46314IFq.LIZIZ() && ((aweme = viewOnAttachStateChangeListenerC49251JUp.LLILZLL) == null || !aweme.isAd())) {
                            viewOnAttachStateChangeListenerC49251JUp.LLD = (JON) LIZIZ.findViewById(R.id.k7p);
                            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                            ConstraintLayout constraintLayout = viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL;
                            if (constraintLayout != null) {
                                anonymousClass064.LJII(constraintLayout);
                                anonymousClass064.LJIIIZ(R.id.lh7, 6, 0, 6, 0);
                                anonymousClass064.LJI(R.id.lh7, 7);
                                ConstraintLayout constraintLayout2 = viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL;
                                if (constraintLayout2 != null) {
                                    anonymousClass064.LIZIZ(constraintLayout2);
                                    JOM jom2 = viewOnAttachStateChangeListenerC49251JUp.LL;
                                    if (jom2 != null) {
                                        float f = 12;
                                        float f2 = 22;
                                        jom2.setPaddingRelative(C05040Hs.LIZ(1, f), C05040Hs.LIZ(1, f2), C05040Hs.LIZ(1, f2), O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics())));
                                        View findViewById14 = LIZIZ.findViewById(R.id.n5y);
                                        o.LJIIIIZZ(findViewById14, "view.findViewById(R.id.video_holder_tux_mask)");
                                        ((ImageView) findViewById14).setVisibility(0);
                                    } else {
                                        o.LJIJI("playerStateIcon");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("videoMediaGroup");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoMediaGroup");
                                throw null;
                            }
                        }
                        JON jon = viewOnAttachStateChangeListenerC49251JUp.LLD;
                        if (jon != null) {
                            C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC49251JUp, 84));
                        }
                        C48887JGp c48887JGp = viewOnAttachStateChangeListenerC49251JUp.LJZ;
                        if (c48887JGp != null) {
                            c48887JGp.setEnableLifecycleObserver(true);
                            c48887JGp.setEnableHideCoverAnim(true);
                            C164086cG c164086cG2 = viewOnAttachStateChangeListenerC49251JUp.LJLZ;
                            if (c164086cG2 != null) {
                                c48887JGp.setMCoverView(c164086cG2);
                                c48887JGp.setCoverVisibilityChangeListener(new AqS174S0100000_8(viewOnAttachStateChangeListenerC49251JUp, 232));
                                JGI core = c48887JGp.getCore();
                                if (core != null) {
                                    core.setEnableProgressCallback(true);
                                    C48881JGj dataProvider = core.getDataProvider();
                                    ConstraintLayout constraintLayout3 = viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL;
                                    if (constraintLayout3 != null) {
                                        dataProvider.LIZ = constraintLayout3;
                                        JIB jib = viewOnAttachStateChangeListenerC49251JUp.LLIILII;
                                        if (jib != null) {
                                            core.setContainerStatusProvider(jib);
                                            core.setVideoUiListener((C49045JMr) viewOnAttachStateChangeListenerC49251JUp.LLILLIZIL.getValue());
                                            InterfaceC47247IgV surfaceHolder = core.getSurfaceHolder();
                                            JIB jib2 = viewOnAttachStateChangeListenerC49251JUp.LLIILII;
                                            if (jib2 != null) {
                                                surfaceHolder.N7(jib2.LIZJ());
                                            } else {
                                                o.LJIJI("containerProvider");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("containerProvider");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("videoMediaGroup");
                                        throw null;
                                    }
                                }
                                C48887JGp c48887JGp2 = viewOnAttachStateChangeListenerC49251JUp.LJZ;
                                if (c48887JGp2 != null) {
                                    c48887JGp2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC49251JUp, 85)));
                                    if (C46442IKo.LIZIZ()) {
                                        ConstraintLayout constraintLayout4 = viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL;
                                        if (constraintLayout4 != null) {
                                            C16880lQ.LJIL(constraintLayout4, new ACListenerS28S0100000_8(viewOnAttachStateChangeListenerC49251JUp, 86));
                                        } else {
                                            o.LJIJI("videoMediaGroup");
                                            throw null;
                                        }
                                    }
                                    View findViewById15 = LIZIZ.findViewById(R.id.lh6);
                                    o.LJIIIIZZ(findViewById15, "view.findViewById(R.id.top_video_like_icon)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLF = (JON) findViewById15;
                                    View findViewById16 = LIZIZ.findViewById(R.id.lh4);
                                    o.LJIIIIZZ(findViewById16, "view.findViewById(R.id.top_video_like_count)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLFF = (TuxTextView) findViewById16;
                                    o.LJIIIIZZ(LIZIZ.findViewById(R.id.lgz), "view.findViewById(R.id.top_video_comment_icon)");
                                    View findViewById17 = LIZIZ.findViewById(R.id.lgx);
                                    o.LJIIIIZZ(findViewById17, "view.findViewById(R.id.top_video_comment_count)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLFFF = (TuxTextView) findViewById17;
                                    o.LJIIIIZZ(LIZIZ.findViewById(R.id.lhb), "view.findViewById(R.id.top_video_share_icon)");
                                    View findViewById18 = LIZIZ.findViewById(R.id.lh_);
                                    o.LJIIIIZZ(findViewById18, "view.findViewById(R.id.top_video_share_count)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLFII = (TuxTextView) findViewById18;
                                    View findViewById19 = LIZIZ.findViewById(R.id.lh5);
                                    o.LJIIIIZZ(findViewById19, "view.findViewById<View>(R.id.top_video_like_group)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLFZ = findViewById19;
                                    View findViewById20 = LIZIZ.findViewById(R.id.lgy);
                                    o.LJIIIIZZ(findViewById20, "view.findViewById<View>(….top_video_comment_group)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLI = findViewById20;
                                    View findViewById21 = LIZIZ.findViewById(R.id.lha);
                                    o.LJIIIIZZ(findViewById21, "view.findViewById<View>(…id.top_video_share_group)");
                                    viewOnAttachStateChangeListenerC49251JUp.LLIFFJFJJ = findViewById21;
                                    View view = viewOnAttachStateChangeListenerC49251JUp.LLFZ;
                                    if (view != null) {
                                        C16880lQ.LJIIJ((View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJIL.getValue(), view);
                                        View view2 = viewOnAttachStateChangeListenerC49251JUp.LLI;
                                        if (view2 != null) {
                                            C16880lQ.LJIIJ((View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJIL.getValue(), view2);
                                            View view3 = viewOnAttachStateChangeListenerC49251JUp.LLIFFJFJJ;
                                            if (view3 != null) {
                                                C16880lQ.LJIIJ((View.OnClickListener) viewOnAttachStateChangeListenerC49251JUp.LLJJJIL.getValue(), view3);
                                                View findViewById22 = LIZIZ.findViewById(R.id.lh0);
                                                o.LJIIIIZZ(findViewById22, "view.findViewById(R.id.top_video_comment_stub)");
                                                viewOnAttachStateChangeListenerC49251JUp.LLIIIJ = (ViewStub) findViewById22;
                                                View findViewById23 = LIZIZ.findViewById(R.id.lgw);
                                                o.LJIIIIZZ(findViewById23, "view.findViewById(R.id.t…_video_click_search_stub)");
                                                viewOnAttachStateChangeListenerC49251JUp.LLIIIZ = (ViewStub) findViewById23;
                                                View findViewById24 = LIZIZ.findViewById(R.id.lgo);
                                                o.LJIIIIZZ(findViewById24, "view.findViewById(R.id.t…_ad_inside_bottom_layout)");
                                                viewOnAttachStateChangeListenerC49251JUp.LLII = (ViewGroup) findViewById24;
                                                View findViewById25 = LIZIZ.findViewById(R.id.lgq);
                                                o.LJIIIIZZ(findViewById25, "view.findViewById(R.id.t…ad_outside_bottom_layout)");
                                                viewOnAttachStateChangeListenerC49251JUp.LLIIII = (ViewGroup) findViewById25;
                                                View findViewById26 = LIZIZ.findViewById(R.id.lgp);
                                                o.LJIIIIZZ(findViewById26, "view.findViewById(R.id.top_video_ad_mask_layout)");
                                                viewOnAttachStateChangeListenerC49251JUp.LLIIIILZ = (ViewGroup) findViewById26;
                                                C57128MbU c57128MbU3 = viewOnAttachStateChangeListenerC49251JUp.LJLJLJ;
                                                if (c57128MbU3 != null) {
                                                    C78897Uxp.LJJJJL(c57128MbU3, C32151Nz.LJIIZILJ(24));
                                                    C53873LCj c53873LCj = viewOnAttachStateChangeListenerC49251JUp.LJLJLLL;
                                                    if (c53873LCj != null) {
                                                        C78897Uxp.LJJJJL(c53873LCj, C32151Nz.LJIIZILJ(24));
                                                        TextView textView = viewOnAttachStateChangeListenerC49251JUp.LJLL;
                                                        if (textView != null) {
                                                            C78897Uxp.LJJJJLI(textView, null);
                                                            JON jon2 = viewOnAttachStateChangeListenerC49251JUp.LLD;
                                                            if (jon2 != null) {
                                                                C78897Uxp.LJJJJLI(jon2, null);
                                                            }
                                                            JOM jom3 = viewOnAttachStateChangeListenerC49251JUp.LL;
                                                            if (jom3 != null) {
                                                                C78897Uxp.LJJJJLI(jom3, null);
                                                                TextView textView2 = viewOnAttachStateChangeListenerC49251JUp.LJLLI;
                                                                if (textView2 != null) {
                                                                    C78897Uxp.LJJJJLI(textView2, null);
                                                                    View view4 = viewOnAttachStateChangeListenerC49251JUp.LLFZ;
                                                                    if (view4 != null) {
                                                                        C78897Uxp.LJJJJLI(view4, null);
                                                                        View view5 = viewOnAttachStateChangeListenerC49251JUp.LLI;
                                                                        if (view5 != null) {
                                                                            C78897Uxp.LJJJJLI(view5, null);
                                                                            View view6 = viewOnAttachStateChangeListenerC49251JUp.LLIFFJFJJ;
                                                                            if (view6 != null) {
                                                                                C78897Uxp.LJJJJLI(view6, null);
                                                                                LIZIZ.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC49251JUp);
                                                                                SearchAdMainService.LJIIJJI().LJIIIIZZ().LJII(true);
                                                                                TopVideoHolderVM Q = viewOnAttachStateChangeListenerC49251JUp.Q();
                                                                                SearchGlobalViewModel globalVM = viewOnAttachStateChangeListenerC49251JUp.P();
                                                                                ClickSearchViewModel clickSearchViewModel2 = viewOnAttachStateChangeListenerC49251JUp.LLIIZ;
                                                                                Q.getClass();
                                                                                o.LJIIIZ(globalVM, "globalVM");
                                                                                Q.LJLLLLLL = globalVM;
                                                                                Q.LL = clickSearchViewModel2;
                                                                                Q.LJZI = true;
                                                                                C68182ly.LIZIZ(Q.LJLILLLLZI, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJI);
                                                                                Object value = viewOnAttachStateChangeListenerC49251JUp.LLILLJJLI.getValue();
                                                                                o.LJIIIIZZ(value, "<get-userService>(...)");
                                                                                C68182ly.LIZIZ(((IUserService) value).LJFF(), viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJIJIL);
                                                                                C68182ly.LIZIZ(Q.LJLJJI, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJILJILJ);
                                                                                C68182ly.LIZIZ(Q.LJLJJLL, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJILLL);
                                                                                C68182ly.LIZIZ(Q.LJLJLJ, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJJIJIIJIL);
                                                                                C68182ly.LIZIZ(Q.LJLL, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJJIJIL);
                                                                                C68182ly.LIZIZ(viewOnAttachStateChangeListenerC49251JUp.P().LJLILLLLZI, viewOnAttachStateChangeListenerC49251JUp.getActivity(), viewOnAttachStateChangeListenerC49251JUp.LLJILJIL);
                                                                                return viewOnAttachStateChangeListenerC49251JUp;
                                                                            }
                                                                            o.LJIJI("shareContainer");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("commentContainer");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("likeContainer");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("userRelationText");
                                                                throw null;
                                                            }
                                                            o.LJIJI("playerStateIcon");
                                                            throw null;
                                                        }
                                                        o.LJIJI("usernameText");
                                                        throw null;
                                                    }
                                                    o.LJIJI("userLiveCircleView");
                                                    throw null;
                                                }
                                                o.LJIJI("userAvatar");
                                                throw null;
                                            }
                                            o.LJIJI("shareContainer");
                                            throw null;
                                        }
                                        o.LJIJI("commentContainer");
                                        throw null;
                                    }
                                    o.LJIJI("likeContainer");
                                    throw null;
                                }
                                o.LJIJI("videoView");
                                throw null;
                            }
                            o.LJIJI("videoCover");
                            throw null;
                        }
                        o.LJIJI("videoView");
                        throw null;
                    }
                    o.LJIJI("videoCover");
                    throw null;
                }
                o.LJIJI("usernameGroup");
                throw null;
            }
            o.LJIJI("userAvatar");
            throw null;
        }
        o.LJIJI("awemeClickListener");
        throw null;
    }

    public final JQA LJZL(int i, SearchMixFeed searchMixFeed) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC50157JmL LIZ = K0M.LIZ();
        String str6 = "";
        if (LIZ == null) {
            str = "normal";
            str2 = "normal";
            str3 = "";
            str4 = "";
        } else {
            str3 = LIZ.LIZJ().LIZ;
            str4 = LIZ.LIZJ().LIZIZ;
            LIZ.LIZIZ();
            str2 = LIZ.LIZJ().LIZLLL;
            str = LIZ.LIZJ().LIZJ;
        }
        if (i % 10 == 0) {
            JVR.LIZJ("jedi");
        }
        LogPbBean logPbBean = searchMixFeed.LJLJJLL;
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
        }
        String imprId = logPbBean.getImprId();
        if (imprId == null) {
            imprId = "";
        }
        String logPbStr = C3A5.LIZ.LIZLLL(imprId);
        JWD.LIZ.getClass();
        String LIZ2 = JWE.LIZ(3);
        InterfaceC49275JVn.LIZ.getClass();
        String LIZ3 = C49270JVi.LIZ(3);
        JQA jqa = new JQA();
        jqa.LJFF = "general_search";
        jqa.LIZ = true;
        SearchGlobalViewModel searchGlobalViewModel = this.LJLLI;
        String str7 = null;
        if (searchGlobalViewModel == null || (str5 = searchGlobalViewModel.gv0()) == null) {
            str5 = "unknown";
        }
        jqa.LJJIFFI = str5;
        SearchGlobalViewModel searchGlobalViewModel2 = this.LJLLI;
        if (searchGlobalViewModel2 != null) {
            str7 = searchGlobalViewModel2.jv0();
        }
        jqa.LIZ(str7);
        jqa.LIZJ(str3);
        jqa.LJIIIIZZ = imprId;
        o.LJIIIIZZ(logPbStr, "logPbStr");
        jqa.LJIIJJI = logPbStr;
        jqa.LJIIJ = logPbBean;
        int i2 = searchMixFeed.LJLILLLLZI;
        if (i2 < 0) {
            i2 = i;
        }
        jqa.LJIIL = i2;
        jqa.LIZLLL(str4);
        jqa.LIZIZ = 3;
        jqa.LIZJ = LIZ2;
        jqa.LIZLLL = LIZ3;
        if (str != null) {
            jqa.LJIJI = str;
        } else {
            jqa.LJIJI = "normal";
        }
        if (str2 != null) {
            jqa.LJIJJ = str2;
        } else {
            jqa.LJIJJ = "normal";
        }
        SearchCardInfo searchCardInfo = searchMixFeed.searchCardInfo;
        if (searchCardInfo != null) {
            String str8 = searchCardInfo.alasrc;
            if (str8 == null) {
                str8 = "";
            }
            jqa.LJJIJ = str8;
            String str9 = searchCardInfo.docId;
            if (str9 != null) {
                str6 = str9;
            }
            jqa.LJJIJIIJI = str6;
            jqa.LJJIJIIJIL = searchCardInfo;
        }
        return jqa;
    }

    public final void LLD(FollowStatus followStatus, User user) {
        if (user != null && o.LJ(followStatus.userId, user.getUid())) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (JWC.LIZ.enableAsyncBind) {
            this.LJLLLLLL.LIZ(holder, i);
        } else {
            LJIJJ(holder, i);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (JWC.LIZ.enableAsyncBind) {
            return this.LJLLLLLL.LIZJ(parent, i);
        }
        return LJJJJL(i, parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVO(RecyclerView recyclerView, JW7 container, JV4 jv4, InterfaceC191547fS loadMoreFunction) {
        super(false, 1, null);
        SearchGlobalViewModel searchGlobalViewModel;
        ActivityC45651qj mo49getActivity;
        C50650JuI immutableData;
        ActivityC45651qj mo49getActivity2;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(loadMoreFunction, "loadMoreFunction");
        C49636Jdw c49636Jdw = null;
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = container;
        this.LJLJI = jv4;
        this.LJLJJI = loadMoreFunction;
        this.LJLJLLL = new C49491Jbb(recyclerView, this);
        this.LJLL = new C49002JLa<>(this);
        if (C50089JlF.LIZJ) {
            C50089JlF.LIZ.submit(RunnableC49377JZl.LJLIL);
        }
        this.LJLLJ = new JZG(((Number) C34255DcR.LIZ.getValue()).intValue(), loadMoreFunction);
        TopFeedFragment topFeedFragment = container.LIZ;
        if (topFeedFragment != null && (mo49getActivity2 = topFeedFragment.mo49getActivity()) != null) {
            searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchGlobalViewModel.class);
        } else {
            searchGlobalViewModel = null;
        }
        this.LJLLI = searchGlobalViewModel;
        TopFeedFragment topFeedFragment2 = container.LIZ;
        if (topFeedFragment2 != null && (mo49getActivity = topFeedFragment2.mo49getActivity()) != null) {
            C50652JuK.Companion.getClass();
            C50652JuK LJIIJ = C50651JuJ.LJIIJ(mo49getActivity);
            if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null) {
                c49636Jdw = immutableData.getSearchSessionModel();
            }
        }
        this.LJLLILLLL = c49636Jdw;
        this.LJLLLLLL = JWL.LIZJ(recyclerView, this, JWL.LIZIZ(new IDqS452S0100000_6(this, 2)), JWL.LIZ(recyclerView, this, new AqS190S0100000_8(this, 67)));
    }

    public final void LL(Aweme aweme, boolean z, long j, long j2) {
        String shareId = C48880JGi.LIZ(this.LJLILLLLZI.getIdentifier(), aweme.getAid());
        o.LJIIIIZZ(shareId, "shareId");
        C48892JGu.LIZIZ(aweme, z, shareId, j, j2);
    }
}

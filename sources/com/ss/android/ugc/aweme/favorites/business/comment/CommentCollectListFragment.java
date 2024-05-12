package com.ss.android.ugc.aweme.favorites.business.comment;

import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C174046sK;
import X.C176166vk;
import X.C176906ww;
import X.C2068389v;
import X.C26045AKb;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C8BR;
import X.C8HS;
import X.InterfaceC51034K1e;
import X.InterfaceC55058LjC;
import X.KL2;
import X.QD3;
import X.QX2;
import Y.ACallableS0S0002000_3;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.CommentCollectListFragmentData;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes4.dex */
public final class CommentCollectListFragment extends BaseCollectListFragment<Comment, CollectedCommentList> {
    public boolean LJLLI;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public CommentCollectListFragment() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Hl() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            o.LJI(c8br);
            c8br.LJJ(new AbstractC51036K1g<Comment, CollectedCommentList>() { // from class: X.6ww
                @Override // X.C8BS
                public final boolean checkParams(Object... params) {
                    o.LJIIIZ(params, "params");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final List<Comment> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    o.LJI(t);
                    List<Comment> list = ((CollectedCommentList) t).items;
                    o.LJI(list);
                    return list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final boolean isHasMore() {
                    T t = this.mData;
                    if (t == 0 || ((CollectedCommentList) t).hasMore != 1) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedCommentList] */
                {
                    ?? collectedCommentList = new CollectedCommentList();
                    collectedCommentList.items = new ArrayList();
                    collectedCommentList.hasMore = 1;
                    this.mData = collectedCommentList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v1, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedCommentList] */
                @Override // X.C8BS
                public final void handleData(Object obj) {
                    boolean z;
                    List<Comment> list;
                    ?? r12 = (CollectedCommentList) obj;
                    int i = 0;
                    if (r12 == 0 || C79004UzY.LJJIFFI(r12.items)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mIsNewDataEmpty = z;
                    if (!z) {
                        int i2 = this.mListQueryType;
                        if (i2 != 1) {
                            if (i2 != 4) {
                                return;
                            }
                            T t = this.mData;
                            if (t == 0) {
                                this.mData = r12;
                                return;
                            }
                            List<Comment> list2 = ((CollectedCommentList) t).items;
                            Objects.requireNonNull(list2);
                            Integer num = null;
                            if (r12 != 0) {
                                list = r12.items;
                            } else {
                                list = null;
                            }
                            T t2 = this.mData;
                            o.LJI(t2);
                            List<Comment> list3 = ((CollectedCommentList) t2).items;
                            ArrayList arrayList = new ArrayList();
                            o.LJI(list);
                            for (Comment comment : list) {
                                arrayList.add(comment);
                                o.LJI(list3);
                                Iterator<Comment> it = list3.iterator();
                                while (it.hasNext()) {
                                    if (o.LJ(comment.getCid(), it.next().getCid())) {
                                        arrayList.remove(comment);
                                    }
                                }
                            }
                            list2.addAll(arrayList);
                            T t3 = this.mData;
                            o.LJI(t3);
                            CollectedCommentList collectedCommentList = (CollectedCommentList) t3;
                            if (r12 != 0) {
                                num = Integer.valueOf(r12.cursor);
                            }
                            o.LJI(num);
                            collectedCommentList.cursor = num.intValue();
                            T t4 = this.mData;
                            o.LJI(t4);
                            CollectedCommentList collectedCommentList2 = (CollectedCommentList) t4;
                            if (r12.hasMore == 1) {
                                T t5 = this.mData;
                                o.LJI(t5);
                                if (((CollectedCommentList) t5).hasMore == 1) {
                                    i = 1;
                                }
                            }
                            collectedCommentList2.hasMore = i;
                            return;
                        }
                        this.mData = r12;
                        return;
                    }
                    T t6 = this.mData;
                    if (t6 == 0) {
                        return;
                    }
                    if (this.mListQueryType == 1) {
                        List<Comment> list4 = ((CollectedCommentList) t6).items;
                        Objects.requireNonNull(list4);
                        list4.clear();
                    }
                    T t7 = this.mData;
                    o.LJI(t7);
                    ((CollectedCommentList) t7).hasMore = 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final void loadMoreList(Object... params) {
                    o.LJIIIZ(params, "params");
                    T t = this.mData;
                    o.LJI(t);
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(((CollectedCommentList) t).cursor, 0), 0);
                }

                @Override // X.AbstractC51036K1g
                public final void refreshList(Object... params) {
                    o.LJIIIZ(params, "params");
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(0, 0), 0);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void LJIIJJI() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            o.LJI(c8br);
            c8br.LJIILL(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Ll() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_comment;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.ga_);
        o.LJIIIIZZ(string, "getString(R.string.fav_comments_empty_title)");
        c73306Spq.LJFF = string;
        String string2 = getString(R.string.ga9);
        o.LJIIIIZZ(string2, "getString(R.string.fav_comments_empty_body)");
        c73306Spq.LJI = string2;
        if (getContext() instanceof InterfaceC55058LjC) {
            C73305Spp c73305Spp = this.LJLJJL;
            o.LJI(c73305Spp);
            o.LJI(this.LJLJJL);
            c73305Spp.setTopMargin(C63081OpJ.LJIJJLI(r0.getContext(), 53.0f));
        } else {
            c73306Spq.LIZ(c2068389v);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        o.LJI(c73305Spp2);
        c73305Spp2.setStatus(c73306Spq);
        C73305Spp c73305Spp3 = this.LJLJJL;
        o.LJI(c73305Spp3);
        c73305Spp3.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void refreshData() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            o.LJI(c8br);
            c8br.LJIILL(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final C8HS<Comment> Il() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            return new CommentCollectListAdapter(mo49getActivity, this, this.LJLLI);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Jl() {
        super.Jl();
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            o.LJI(recyclerView);
            recyclerView.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void I3() {
        LLLZI();
    }

    public CommentCollectListFragment(boolean z) {
        this();
        this.LJLLI = z;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void initView(View view) {
        o.LJIIIZ(view, "view");
        super.initView(view);
        RecyclerView recyclerView = this.LJLJJI;
        o.LJI(recyclerView);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (int) KL2.LIZJ(getContext(), 8.0f);
        RecyclerView recyclerView2 = this.LJLJJI;
        o.LJI(recyclerView2);
        recyclerView2.setLayoutParams(marginLayoutParams);
    }

    @QD3
    public final void omCommentDeleteEvent(C174046sK c174046sK) {
        Object[] objArr;
        AbstractC51036K1g abstractC51036K1g;
        List items;
        if (this.LJLJJLL == null || c174046sK == null) {
            return;
        }
        Object obj = c174046sK.LJLILLLLZI;
        if ((obj instanceof Object[]) && (objArr = (Object[]) obj) != null) {
            int i = 0;
            if (objArr.length == 2) {
                Object obj2 = objArr[1];
                C8BR c8br = this.LJLL;
                if (c8br == null || (abstractC51036K1g = (AbstractC51036K1g) c8br.LJLIL) == null || (items = abstractC51036K1g.getItems()) == null) {
                    return;
                }
                int size = items.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (o.LJ(((Comment) ListProtector.get(items, i)).getCid(), obj2)) {
                        if (i != -1) {
                            ListProtector.remove(items, i);
                        }
                    } else {
                        i++;
                    }
                }
                InterfaceC51034K1e interfaceC51034K1e = this.LJLL;
                if (interfaceC51034K1e != null) {
                    interfaceC51034K1e.onSuccess();
                }
            }
        }
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/tiktok/comment/listcollection/v1/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            refreshData();
        }
    }

    @QD3
    public final void onCommentCollectEvent(C176166vk c) {
        o.LJIIIZ(c, "c");
        if (this.LJLJJLL == null) {
            return;
        }
        Comment comment = c.LJLIL;
        C8BR c8br = this.LJLL;
        o.LJI(c8br);
        T t = c8br.LJLIL;
        o.LJI(t);
        List items = ((AbstractC51036K1g) t).getItems();
        o.LJIIIIZZ(items, "mCollectPresenter!!.model!!.getItems()");
        int i = 0;
        if (comment.isCollected()) {
            ListProtector.add(items, 0, comment);
        } else {
            int size = items.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (o.LJ(((Comment) ListProtector.get(items, i)).getCid(), comment.getCid())) {
                    if (i != -1) {
                        ListProtector.remove(items, i);
                    }
                } else {
                    i++;
                }
            }
        }
        InterfaceC51034K1e interfaceC51034K1e = this.LJLL;
        o.LJI(interfaceC51034K1e);
        interfaceC51034K1e.onSuccess();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CommentCollectListFragmentData commentCollectListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (commentCollectListFragmentData = (CommentCollectListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LJLLI = commentCollectListFragmentData.isMyProfile;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, X.InterfaceC223218pR
    public final void J5(List<Comment> list, boolean z) {
        int i;
        super.J5(list, z);
        C8BR c8br = this.LJLL;
        o.LJI(c8br);
        if (c8br.LJLIL instanceof C176906ww) {
            C8BR c8br2 = this.LJLL;
            o.LJI(c8br2);
            T t = c8br2.LJLIL;
            o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectedModel");
            T t2 = t.mData;
            if (t2 == 0) {
                i = 0;
            } else {
                i = ((CollectedCommentList) t2).invalidCount;
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (i != 0 && mo49getActivity != null) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIZ(mo49getActivity.getString(R.string.ivw, Integer.valueOf(i)));
                c26045AKb.LJIIJ();
            }
        }
    }
}

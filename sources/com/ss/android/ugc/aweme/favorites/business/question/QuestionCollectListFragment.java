package com.ss.android.ugc.aweme.favorites.business.question;

import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C176926wy;
import X.C185517Pv;
import X.C2068389v;
import X.C26045AKb;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C8BR;
import X.C8G5;
import X.C8HS;
import X.InterfaceC51034K1e;
import X.InterfaceC55058LjC;
import X.KL2;
import X.QD3;
import X.QX2;
import Y.ACallableS0S0002000_3;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.favorites.model.CollectedQuestionList;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes4.dex */
public final class QuestionCollectListFragment extends BaseCollectListFragment<ForumStruct, CollectedQuestionList> {
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public QuestionCollectListFragment() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Hl() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            c8br.LJJ(new AbstractC51036K1g<ForumStruct, CollectedQuestionList>() { // from class: X.6wy
                @Override // X.C8BS
                public final boolean checkParams(Object... params) {
                    o.LJIIIZ(params, "params");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final List<ForumStruct> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    o.LJI(t);
                    List<ForumStruct> list = ((CollectedQuestionList) t).items;
                    o.LJI(list);
                    return list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final boolean isHasMore() {
                    T t = this.mData;
                    if (t == 0 || ((CollectedQuestionList) t).hasMore != 1) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedQuestionList] */
                {
                    ?? collectedQuestionList = new CollectedQuestionList();
                    collectedQuestionList.items = new ArrayList();
                    collectedQuestionList.hasMore = 1;
                    this.mData = collectedQuestionList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v1, types: [T, com.ss.android.ugc.aweme.favorites.model.CollectedQuestionList] */
                @Override // X.C8BS
                public final void handleData(Object obj) {
                    boolean z;
                    List<ForumStruct> list;
                    ?? r12 = (CollectedQuestionList) obj;
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
                            List<ForumStruct> list2 = ((CollectedQuestionList) t).items;
                            Objects.requireNonNull(list2);
                            Integer num = null;
                            if (r12 != 0) {
                                list = r12.items;
                            } else {
                                list = null;
                            }
                            T t2 = this.mData;
                            o.LJI(t2);
                            List<ForumStruct> list3 = ((CollectedQuestionList) t2).items;
                            ArrayList arrayList = new ArrayList();
                            o.LJI(list);
                            for (ForumStruct forumStruct : list) {
                                arrayList.add(forumStruct);
                                o.LJI(list3);
                                Iterator<ForumStruct> it = list3.iterator();
                                while (it.hasNext()) {
                                    if (o.LJ(forumStruct.getId(), it.next().getId())) {
                                        arrayList.remove(forumStruct);
                                    }
                                }
                            }
                            list2.addAll(arrayList);
                            T t3 = this.mData;
                            o.LJI(t3);
                            CollectedQuestionList collectedQuestionList = (CollectedQuestionList) t3;
                            if (r12 != 0) {
                                num = Integer.valueOf(r12.cursor);
                            }
                            o.LJI(num);
                            collectedQuestionList.cursor = num.intValue();
                            T t4 = this.mData;
                            o.LJI(t4);
                            CollectedQuestionList collectedQuestionList2 = (CollectedQuestionList) t4;
                            if (r12 != 0 && r12.hasMore == 1) {
                                T t5 = this.mData;
                                o.LJI(t5);
                                if (((CollectedQuestionList) t5).hasMore == 1) {
                                    i = 1;
                                }
                            }
                            collectedQuestionList2.hasMore = i;
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
                        List<ForumStruct> list4 = ((CollectedQuestionList) t6).items;
                        Objects.requireNonNull(list4);
                        list4.clear();
                    }
                    T t7 = this.mData;
                    o.LJI(t7);
                    ((CollectedQuestionList) t7).hasMore = 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final void loadMoreList(Object... params) {
                    o.LJIIIZ(params, "params");
                    T t = this.mData;
                    o.LJI(t);
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(((CollectedQuestionList) t).cursor, 10, 1), 0);
                }

                @Override // X.AbstractC51036K1g
                public final void refreshList(Object... params) {
                    o.LJIIIZ(params, "params");
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(0, 12, 1), 0);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void LJIIJJI() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            c8br.LJIILL(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Ll() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_error_qa_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.pn0);
        o.LJIIIIZZ(string, "getString(R.string.qa_page_empty_title)");
        c73306Spq.LJFF = string;
        String string2 = getString(R.string.pmz);
        o.LJIIIIZZ(string2, "getString(R.string.qa_page_empty_desc)");
        c73306Spq.LJI = string2;
        if (getContext() instanceof InterfaceC55058LjC) {
            C73305Spp c73305Spp = this.LJLJJL;
            if (c73305Spp != null) {
                c73305Spp.setTopMargin(C63081OpJ.LJIJJLI(c73305Spp.getContext(), 53.0f));
            }
        } else {
            c73306Spq.LIZ(c2068389v);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            c73305Spp2.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp3 = this.LJLJJL;
        if (c73305Spp3 == null) {
            return;
        }
        c73305Spp3.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void refreshData() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            c8br.LJIILL(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final C8HS<ForumStruct> Il() {
        if (mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            return new C8G5(mo49getActivity, this);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Jl() {
        super.Jl();
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            recyclerView.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void I3() {
        LLLZI();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void initView(View view) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        super.initView(view);
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            layoutParams = recyclerView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (int) KL2.LIZJ(getContext(), 8.0f);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setLayoutParams(marginLayoutParams);
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/tiktok/v1/forum/listcollection/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            refreshData();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onQuestionCollectEvent(C185517Pv e) {
        List list;
        AbstractC51036K1g abstractC51036K1g;
        o.LJIIIZ(e, "e");
        if (this.LJLJJLL == null) {
            return;
        }
        ForumStruct forumStruct = e.LJLIL;
        C8BR c8br = this.LJLL;
        Integer num = null;
        if (c8br != null && (abstractC51036K1g = (AbstractC51036K1g) c8br.LJLIL) != null) {
            list = abstractC51036K1g.getItems();
        } else {
            list = null;
        }
        int i = 0;
        if (forumStruct.isCollected()) {
            if (list != null) {
                ListProtector.add(list, 0, forumStruct);
            }
        } else {
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            o.LJI(num);
            int intValue = num.intValue();
            while (true) {
                if (i >= intValue) {
                    break;
                }
                if (o.LJ(((ForumStruct) ListProtector.get(list, i)).getId(), forumStruct.getId())) {
                    if (i != -1) {
                        ListProtector.remove(list, i);
                    }
                } else {
                    i++;
                }
            }
        }
        InterfaceC51034K1e interfaceC51034K1e = this.LJLL;
        if (interfaceC51034K1e != null) {
            interfaceC51034K1e.onSuccess();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, X.InterfaceC223218pR
    public final void J5(List<ForumStruct> list, boolean z) {
        Object obj;
        int i;
        super.J5(list, z);
        C8BR c8br = this.LJLL;
        AbstractC51036K1g abstractC51036K1g = null;
        if (c8br != null) {
            obj = c8br.LJLIL;
        } else {
            obj = null;
        }
        if (obj instanceof C176926wy) {
            if (c8br != null) {
                abstractC51036K1g = (AbstractC51036K1g) c8br.LJLIL;
            }
            o.LJII(abstractC51036K1g, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.question.QuestionCollectedModel");
            T t = abstractC51036K1g.mData;
            if (t == 0) {
                i = 0;
            } else {
                i = ((CollectedQuestionList) t).invalidCount;
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (i != 0 && mo49getActivity != null) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIZ(mo49getActivity.getString(R.string.pn1, Integer.valueOf(i)));
                c26045AKb.LJIIJ();
            }
        }
    }
}

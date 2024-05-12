package com.ss.android.ugc.aweme.setting.page.privacy;

import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C2068389v;
import X.C235119Kp;
import X.C252709vu;
import X.C51031K1b;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78840Uwu;
import X.C79045V0n;
import X.C7MY;
import X.C8DP;
import X.C8HG;
import X.C8HH;
import X.C8HS;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC61213O0r;
import X.ORZ;
import X.T9H;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.adapter.BlackHolder;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class BlackListPage extends BasePage implements InterfaceC223218pR<User>, InterfaceC191547fS {
    public C73305Spp LJLJI;
    public RecyclerView LJLJJI;
    public C8HG LJLJJL;
    public C8HH LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cjw;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<User> list, boolean z) {
        o.LJIIIZ(list, "list");
    }

    public final C73305Spp Al() {
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("mStatusView");
        throw null;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        C8HH c8hh = this.LJLJJLL;
        o.LJI(c8hh);
        c8hh.LJIILL(4);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        AbstractC51036K1g abstractC51036K1g;
        List list;
        AbstractC51036K1g abstractC51036K1g2;
        C8HG c8hg = this.LJLJJL;
        if (c8hg != null) {
            C8HH c8hh = this.LJLJJLL;
            if (c8hh != null && (abstractC51036K1g2 = (AbstractC51036K1g) c8hh.LJLIL) != null) {
                list = abstractC51036K1g2.getItems();
            } else {
                list = null;
            }
            c8hg.setData(list);
        }
        C8HH c8hh2 = this.LJLJJLL;
        if (c8hh2 != null && (abstractC51036K1g = (AbstractC51036K1g) c8hh2.LJLIL) != null && abstractC51036K1g.isHasMore()) {
            Al().setVisibility(8);
            return;
        }
        C8HG c8hg2 = this.LJLJJL;
        o.LJI(c8hg2);
        if (c8hg2.mShowFooter) {
            C8HG c8hg3 = this.LJLJJL;
            o.LJI(c8hg3);
            c8hg3.setShowFooter(false);
            C8HG c8hg4 = this.LJLJJL;
            o.LJI(c8hg4);
            c8hg4.notifyDataSetChanged();
            C8HG c8hg5 = this.LJLJJL;
            o.LJI(c8hg5);
            c8hg5.showLoadMoreEmpty();
        }
        Al().setVisibility(0);
        if (isAdded()) {
            C73305Spp Al = Al();
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_person;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = getString(R.string.cal);
            o.LJIIIIZZ(string, "getString(R.string.block_list_empty)");
            c73306Spq.LJFF = string;
            Al.setStatus(c73306Spq);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C8HG c8hg = this.LJLJJL;
        o.LJI(c8hg);
        c8hg.showLoadMoreLoading();
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        Al().setVisibility(0);
        Al().LJFF();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C8HG c8hg = this.LJLJJL;
        if (c8hg != null) {
            c8hg.resetLoadMoreState();
        }
        C8HH c8hh = this.LJLJJLL;
        o.LJI(c8hh);
        c8hh.LJIILL(1);
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception e) {
        o.LJIIIZ(e, "e");
        C8HG c8hg = this.LJLJJL;
        o.LJI(c8hg);
        if (c8hg.mShowFooter) {
            C8HG c8hg2 = this.LJLJJL;
            o.LJI(c8hg2);
            c8hg2.setShowFooter(false);
            C8HG c8hg3 = this.LJLJJL;
            o.LJI(c8hg3);
            c8hg3.notifyDataSetChanged();
        }
        Al().setVisibility(0);
        C73305Spp Al = Al();
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new AqS153S0100000_3(this, 856));
        Al.setStatus(c73306Spq);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception e) {
        o.LJIIIZ(e, "e");
        C8HG c8hg = this.LJLJJL;
        o.LJI(c8hg);
        c8hg.showLoadMoreError();
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<User> list, boolean z) {
        o.LJIIIZ(list, "list");
        C8HG c8hg = this.LJLJJL;
        o.LJI(c8hg);
        c8hg.setShowFooter(true);
        if (!z) {
            C8HG c8hg2 = this.LJLJJL;
            o.LJI(c8hg2);
            c8hg2.showLoadMoreEmpty();
        } else {
            C8HG c8hg3 = this.LJLJJL;
            o.LJI(c8hg3);
            c8hg3.resetLoadMoreState();
        }
        C8HG c8hg4 = this.LJLJJL;
        if (c8hg4 != null) {
            c8hg4.setData(ORZ.LLJILJILJ(list));
        }
        Al().setVisibility(8);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<User> list, boolean z) {
        List list2;
        if (!z) {
            if (list == null || list.isEmpty()) {
                Ne();
                return;
            } else {
                C8HG c8hg = this.LJLJJL;
                o.LJI(c8hg);
                c8hg.showLoadMoreEmpty();
            }
        } else {
            C8HG c8hg2 = this.LJLJJL;
            o.LJI(c8hg2);
            c8hg2.resetLoadMoreState();
        }
        C8HG c8hg3 = this.LJLJJL;
        if (c8hg3 != null) {
            if (list != null) {
                list2 = ORZ.LLJILJILJ(list);
            } else {
                list2 = null;
            }
            c8hg3.setDataAfterLoadMore(list2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.8HH, X.8BR] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.8HG] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLJI = (C73305Spp) C7MY.LIZLLL(view, "view", R.id.am0, "view.findViewById(R.id.black_list_status_view)");
        View findViewById = view.findViewById(R.id.alz);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.black_list_recycler_view)");
        this.LJLJJI = (RecyclerView) findViewById;
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.p96);
        o.LJIIIIZZ(string, "getString(R.string.priva…_safety_blocked_accounts)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS153S0100000_3(this, 855));
        c252709vu.setNavActions(c235119Kp);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            view.setBackgroundColor(intValue);
            C252709vu c252709vu2 = (C252709vu) view.findViewById(R.id.la4);
            c252709vu2.setNavBackground(intValue);
            c252709vu2.LJIILJJIL(false);
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.setBackgroundColor(intValue);
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        ?? r1 = new C51031K1b<T9H>() { // from class: X.8HH
            @Override // X.C51031K1b, X.C8BR, X.C8BT
            public final void onSuccess() {
                super.onSuccess();
            }
        };
        this.LJLJJLL = r1;
        r1.LJJ(new T9H());
        C8HH c8hh = this.LJLJJLL;
        if (c8hh != null) {
            c8hh.LJLILLLLZI = this;
        }
        final ActivityC45651qj mo49getActivity = mo49getActivity();
        final C8HH c8hh2 = this.LJLJJLL;
        this.LJLJJL = new C8HS<User>(mo49getActivity, c8hh2) { // from class: X.8HG
            public final Activity LJLIL;
            public final C8HH LJLILLLLZI;

            @Override // X.MK7, X.C4II, X.AbstractC029409q
            public final int getItemCount() {
                if (C79004UzY.LJJIFFI(this.mmItems) && ((AbstractC51036K1g) this.LJLILLLLZI.LJLIL).isHasMore()) {
                    if (this.mShowFooter) {
                        return getBasicItemCount() + 1;
                    }
                    return getBasicItemCount();
                }
                return super.getItemCount();
            }

            {
                this.LJLIL = mo49getActivity;
                this.LJLILLLLZI = c8hh2;
                setLoadEmptyText(R.string.rhe);
            }

            @Override // X.C4II
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z;
                boolean z2;
                int i2;
                List<T> list = this.mmItems;
                Objects.requireNonNull(list);
                ((BlackHolder) viewHolder).bind((User) ListProtector.get(list, i));
                int basicItemCount = getBasicItemCount();
                View view2 = viewHolder.itemView;
                int i3 = 0;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == basicItemCount - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o.LJIIIZ(view2, "view");
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                Integer LIZIZ = C19N.LIZIZ(view2, "view.context", R.attr.cl);
                int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                int LIZIZ2 = C7MY.LIZIZ(6);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZ = LIZIZ;
                if (z) {
                    float f = LJJIIZ;
                    c110614Vt.LJIIIIZZ = Float.valueOf(f);
                    c110614Vt.LJIIIZ = Float.valueOf(f);
                }
                if (z2) {
                    float f2 = LJJIIZ;
                    c110614Vt.LJIIJ = Float.valueOf(f2);
                    c110614Vt.LJIIJJI = Float.valueOf(f2);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C06460Ne.LIZ(view2, "view.context", c110614Vt)});
                layerDrawable.setLayerInset(0, LJJIIZ2, 0, LJJIIZ2, 0);
                view2.setBackground(layerDrawable);
                if (LJJIIZ2 > 0 && LIZIZ2 > 0) {
                    if (z) {
                        i2 = LIZIZ2;
                    } else {
                        i2 = 0;
                    }
                    if (z2) {
                        i3 = LIZIZ2;
                    }
                    C26338AVi.LJIIIZ(view2, Integer.valueOf(LJJIIZ2), Integer.valueOf(i2), Integer.valueOf(LJJIIZ2), Integer.valueOf(i3), 16);
                }
            }

            @Override // X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                return new BlackHolder(C28289B8j.LIZ(viewGroup, R.layout.ckz, viewGroup, false), this.LJLIL);
            }
        };
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(wrapLinearLayoutManager);
            RecyclerView recyclerView3 = this.LJLJJI;
            if (recyclerView3 != null) {
                C8DP.LIZ(6, recyclerView3);
                RecyclerView recyclerView4 = this.LJLJJI;
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(this.LJLJJL);
                    C8HG c8hg = this.LJLJJL;
                    o.LJI(c8hg);
                    c8hg.setLoadMoreListener(this);
                    C8HG c8hg2 = this.LJLJJL;
                    o.LJI(c8hg2);
                    c8hg2.setShowFooter(true);
                    LJII();
                    return;
                }
                o.LJIJI("mRecyclerView");
                throw null;
            }
            o.LJIJI("mRecyclerView");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }
}

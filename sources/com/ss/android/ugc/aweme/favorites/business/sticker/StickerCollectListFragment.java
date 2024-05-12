package com.ss.android.ugc.aweme.favorites.business.sticker;

import X.AbstractC51036K1g;
import X.C2068389v;
import X.C4II;
import X.C56503MFn;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C76P;
import X.C8BR;
import X.C8HS;
import X.InterfaceC55058LjC;
import X.QD3;
import Y.ACallableS0S0002000_3;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StickerCollectListFragment extends BaseCollectListFragment<NewFaceStickerBean, StickerList> {
    public boolean LJLLI;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public StickerCollectListFragment() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final void Hl() {
        C8BR c8br = this.LJLL;
        if (c8br != null) {
            c8br.LJJ(new AbstractC51036K1g<NewFaceStickerBean, StickerList>() { // from class: X.76Q
                @Override // X.C8BS
                public final boolean checkParams(Object... params) {
                    o.LJIIIZ(params, "params");
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final List<NewFaceStickerBean> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    o.LJI(t);
                    return ((StickerList) t).items;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final boolean isHasMore() {
                    T t = this.mData;
                    if (t == 0 || ((StickerList) t).hasMore != 1) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.favorites.bean.StickerList] */
                {
                    ?? stickerList = new StickerList();
                    stickerList.items = new ArrayList();
                    stickerList.hasMore = 0;
                    this.mData = stickerList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.favorites.bean.StickerList] */
                @Override // X.C8BS
                public final void handleData(Object obj) {
                    boolean z;
                    final boolean z2;
                    ?? r8 = (StickerList) obj;
                    int i = 0;
                    if (r8 == 0 || C79004UzY.LJJIFFI(r8.items)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mIsNewDataEmpty = z;
                    if (!z) {
                        if (r8 != 0) {
                            Iterator<NewFaceStickerBean> it = r8.items.iterator();
                            while (it.hasNext()) {
                                it.next().logPbBean = r8.logPbBean;
                            }
                        }
                        int i2 = this.mListQueryType;
                        if (i2 != 1) {
                            if (i2 != 4) {
                                return;
                            }
                            T t = this.mData;
                            if (t == 0) {
                                this.mData = r8;
                                return;
                            }
                            if (r8 == 0) {
                                return;
                            }
                            List<NewFaceStickerBean> list = ((StickerList) t).items;
                            List<NewFaceStickerBean> list2 = r8.items;
                            o.LJIIIIZZ(list2, "data.items");
                            T t2 = this.mData;
                            o.LJI(t2);
                            final List<NewFaceStickerBean> list3 = ((StickerList) t2).items;
                            if (list3 == null || list3.isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            list.addAll(C65552Po4.LIZ(list2, new InterfaceC65503PnH() { // from class: X.76R
                                @Override // X.InterfaceC65503PnH
                                public final boolean apply(Object obj2) {
                                    if (!z2) {
                                        List<NewFaceStickerBean> list4 = list3;
                                        o.LJI(list4);
                                        if (list4.contains(obj2)) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }));
                            T t3 = this.mData;
                            o.LJI(t3);
                            ((StickerList) t3).cursor = r8.cursor;
                            T t4 = this.mData;
                            o.LJI(t4);
                            StickerList stickerList = (StickerList) t4;
                            if (r8.hasMore == 1) {
                                T t5 = this.mData;
                                o.LJI(t5);
                                if (((StickerList) t5).hasMore == 1) {
                                    i = 1;
                                }
                            }
                            stickerList.hasMore = i;
                            return;
                        }
                        this.mData = r8;
                        return;
                    }
                    T t6 = this.mData;
                    if (t6 != 0) {
                        if (this.mListQueryType == 1) {
                            ((StickerList) t6).items.clear();
                        }
                        T t7 = this.mData;
                        o.LJI(t7);
                        ((StickerList) t7).hasMore = 0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC51036K1g
                public final void loadMoreList(Object... params) {
                    o.LJIIIZ(params, "params");
                    T t = this.mData;
                    o.LJI(t);
                    int i = ((StickerList) t).cursor;
                    if (AV1.LJIIJJI()) {
                        return;
                    }
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(i, 10, 2), 0);
                }

                @Override // X.AbstractC51036K1g
                public final void refreshList(Object... params) {
                    o.LJIIIZ(params, "params");
                    if (AV1.LJIIJJI()) {
                        return;
                    }
                    FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S0002000_3(0, 12, 2), 0);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment
    public final C8HS<NewFaceStickerBean> Il() {
        return new C56503MFn();
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
        c2068389v.LIZ = R.raw.icon_large_bookmark;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.gac);
        o.LJIIIIZZ(string, "getString(R.string.favorite_effects_empty_title)");
        c73306Spq.LJFF = string;
        String string2 = getString(R.string.gab);
        o.LJIIIIZZ(string2, "getString(R.string.favorite_effects_empty_desc)");
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

    @Override // com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLLI = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLLI) {
            this.LJLLI = false;
            refreshData();
        }
    }

    @QD3
    public final void onStickerCollectEvent(C76P event) {
        NewFaceStickerBean newFaceStickerBean;
        AbstractC51036K1g abstractC51036K1g;
        List items;
        o.LJIIIZ(event, "event");
        if (!isViewValid() || (newFaceStickerBean = event.LJLIL) == null) {
            return;
        }
        if (!newFaceStickerBean.isFavorite) {
            C8BR c8br = this.LJLL;
            if (c8br == null || (abstractC51036K1g = (AbstractC51036K1g) c8br.LJLIL) == null || (items = abstractC51036K1g.getItems()) == null) {
                return;
            }
            int size = items.size();
            Iterator it = items.iterator();
            while (it.hasNext()) {
                NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) it.next();
                if (newFaceStickerBean2 != null && TextUtils.equals(newFaceStickerBean2.id, newFaceStickerBean.id)) {
                    this.LJLLI = false;
                    it.remove();
                }
            }
            if (size != items.size()) {
                C4II c4ii = this.LJLJJLL;
                if (c4ii != null) {
                    c4ii.notifyDataSetChanged();
                }
            } else {
                this.LJLLI = true;
            }
            if (items.isEmpty()) {
                Ne();
                return;
            }
            return;
        }
        this.LJLLI = true;
    }
}

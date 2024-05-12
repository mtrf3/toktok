package com.ss.android.ugc.aweme.rss.feed.ui;

import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C26045AKb;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KPL;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.T3R;
import X.T3S;
import X.T3T;
import X.T3U;
import X.T3V;
import X.T3W;
import X.T3Z;
import X.TBT;
import X.TBW;
import X.W5G;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RssEntryViewHolder extends PowerCell<T3V> implements KPL {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C63044Ooi c63044Ooi = (C63044Ooi) _$_findCachedViewById(R.id.j8r);
        if (c63044Ooi != null) {
            C16880lQ.LJJJJ(c63044Ooi, new ACListenerS32S0100000_12(this, 79));
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 80), itemView);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.T3X
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C33W) obj).LJLJJI);
            }
        }, C213688a4.LIZLLL(), new AqS194S0100000_12(this, 142), 4);
    }

    public RssEntryViewHolder() {
        C214298b3 c214298b3;
        C65776Prg LIZ = C65352Pkq.LIZ(RssFeedViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 900);
        T3U t3u = T3U.INSTANCE;
        if (o.LJ(null, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, T3S.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 901), new AqS162S0100000_12((InterfaceC93923mO) this, 902), T3Z.INSTANCE, t3u, new AqS162S0100000_12((InterfaceC93923mO) this, 903), 256);
        } else if (o.LJ(null, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, T3T.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 904), new AqS162S0100000_12((InterfaceC93923mO) this, 895), T3W.INSTANCE, t3u, new AqS162S0100000_12((InterfaceC93923mO) this, 896), 256);
        } else {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, T3R.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 897), new AqS162S0100000_12((InterfaceC93923mO) this, 898), new AqS162S0100000_12((InterfaceC93923mO) this, 899), t3u, (InterfaceC65784Pro) null, 384);
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 894));
    }

    public final RssArticle L() {
        T3V item = getItem();
        if (item != null) {
            return item.LJLIL;
        }
        return null;
    }

    public final void M() {
        boolean z;
        RssArticle rssArticle;
        RssArticle L = L();
        if (L != null) {
            if (L.isPublished) {
                ((C26045AKb) this.LJLILLLLZI.getValue()).LIZIZ();
                ((C26045AKb) this.LJLILLLLZI.getValue()).LJIIJ();
                return;
            }
            RssFeedViewModel rssFeedViewModel = (RssFeedViewModel) this.LJLIL.getValue();
            RssArticle rssArticle2 = rssFeedViewModel.LJLJJI;
            if (rssArticle2 != null && rssArticle2.guid == L.guid) {
                z = true;
                rssArticle = null;
            } else {
                z = false;
                rssArticle = L;
            }
            rssFeedViewModel.LJLJJI = rssArticle;
            rssFeedViewModel.setState(new AqS44S0110000_1(z, L, 8));
        }
    }

    public final void N(boolean z) {
        C63044Ooi c63044Ooi;
        RssArticle L;
        if ((z && (L = L()) != null && L.isPublished) || (c63044Ooi = (C63044Ooi) _$_findCachedViewById(R.id.j8r)) == null) {
            return;
        }
        c63044Ooi.setEnabled(z);
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(T3V item) {
        float f;
        W5G w5g;
        o.LJIIIZ(item, "item");
        RssArticle L = L();
        if (L != null) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.j8t);
            if (textView != null) {
                textView.setText(L.title);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.j8q);
            if (textView2 != null) {
                textView2.setText(L.description);
            }
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.j8p);
            if (textView3 != null) {
                textView3.setText(L.date);
            }
            String str = (String) ORZ.LJLLLL(L.imageUrls);
            if (str != null && (w5g = (W5G) _$_findCachedViewById(R.id.j8s)) != null) {
                w5g.setImageURI(str);
            }
            if (L.isPublished) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.j8t);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setAlpha(f);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.j8q);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setAlpha(f);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.j8p);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setAlpha(f);
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.j8s);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setAlpha(f);
            }
            N(!L.isPublished);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.T3a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C33W) obj).LJLJJL;
            }
        }, null, new AqS194S0100000_12(this, 269), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.caz, viewGroup, false, "from(parent.context).inf…rss_entry, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        N(true);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}

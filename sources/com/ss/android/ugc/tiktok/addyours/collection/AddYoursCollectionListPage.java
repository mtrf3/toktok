package com.ss.android.ugc.tiktok.addyours.collection;

import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213218Yj;
import X.C214298b3;
import X.C214528bQ;
import X.C219248j2;
import X.C219278j5;
import X.C219368jE;
import X.C221108m2;
import X.C226388uY;
import X.C245319jz;
import X.C252659vp;
import X.C33Q;
import X.C3C8;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72704Sg8;
import X.C76800UCe;
import X.C78926UyI;
import X.C7VQ;
import X.C8YN;
import X.C8YZ;
import X.EnumC219268j4;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBT;
import X.TBW;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class AddYoursCollectionListPage extends BaseFavoritePage implements KPL, AddYoursCollectionAbility {
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C65776Prg LJLJI = C65352Pkq.LIZ(AddYoursCollectionListAssem.class);
    public final String LJLJJI = "add_yours";
    public final String LJLJJL = "questions";

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final boolean xl() {
        return false;
    }

    public AddYoursCollectionListPage() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursCollectionListVM.class);
        this.LJLJJLL = new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1421), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C219278j5.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1420));
    }

    public final AddYoursCollectionListVM Kl() {
        return (AddYoursCollectionListVM) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final int Gl() {
        return C226388uY.LIZJ(R.string.bcx, R.string.bd3);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String Al() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C65776Prg Hl() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final String Il() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionAbility
    public final void ek0(C219368jE item) {
        o.LJIIIZ(item, "item");
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C252659vp[] c252659vpArr = new C252659vp[2];
        C252659vp c252659vp = new C252659vp();
        c252659vp.LIZ(R.string.cgc);
        c252659vp.LIZJ(R.raw.icon_bookmark_fill);
        c252659vp.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 178), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c252659vpArr[0] = c252659vp;
        C252659vp LIZ = C72704Sg8.LIZ(R.raw.icon_a_rectangle_on_rectangle);
        LIZ.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 179), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        if (item.LJLJLJ) {
            LIZ.LIZ(R.string.qfr);
        } else {
            LIZ.LIZ(R.string.sjo);
        }
        c252659vpArr[1] = LIZ;
        c245319jz.LIZ(c252659vpArr);
        c245319jz.LIZJ().show(fragmentManager, "add_yours_collection");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(C219248j2 event) {
        Object obj;
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI != EnumC219268j4.COLLECT) {
            return;
        }
        int collectStatus = event.LJLIL.getCollectStatus();
        if (collectStatus != 0) {
            if (collectStatus != 1) {
                return;
            }
            AddYoursCollectionListVM Kl = Kl();
            AddYoursTopic topic = event.LJLIL;
            Kl.getClass();
            o.LJIIIZ(topic, "topic");
            Kl.listAddItemAt(0, (int) new C219368jE(topic));
            return;
        }
        AddYoursCollectionListVM Kl2 = Kl();
        AddYoursTopic topic2 = event.LJLIL;
        Kl2.getClass();
        o.LJIIIZ(topic2, "topic");
        List<ITEM> listGetAll = Kl2.listGetAll();
        if (listGetAll == 0) {
            return;
        }
        Iterator it = listGetAll.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                long j = ((C219368jE) obj).LJLIL;
                Long topicId = topic2.getTopicId();
                if (topicId != null && j == topicId.longValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C219368jE c219368jE = (C219368jE) obj;
        if (c219368jE == null) {
            return;
        }
        Kl2.listRemoveItem((AddYoursCollectionListVM) c219368jE);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage
    public final C7VQ wl(Context context) {
        o.LJIIIZ(context, "context");
        final C213218Yj Jl = Jl(context);
        C7VQ c7vq = new C7VQ(this, Jl) { // from class: X.8j1
            @QD3(threadMode = ThreadMode.MAIN)
            public final void onCollectEvent(C219248j2 event) {
                o.LJIIIZ(event, "event");
                if (event.LJLILLLLZI != EnumC219268j4.COLLECT) {
                    return;
                }
                int collectStatus = event.LJLIL.getCollectStatus();
                if (collectStatus != 0) {
                    if (collectStatus != 1) {
                        return;
                    }
                    LJFF(this.LJLIL);
                    return;
                }
                LIZIZ(this.LJLIL);
            }
        };
        this.LJLIL = c7vq;
        return c7vq;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, AddYoursCollectionAbility.class, null);
        C8YN.LJII(this, Kl(), new TBT() { // from class: X.8j6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219308j8) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 132), 6);
        C8YN.LJII(this, Kl(), new TBT() { // from class: X.8j7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219308j8) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 133), 6);
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

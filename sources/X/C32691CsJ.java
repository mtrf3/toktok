package X;

import Y.AObserverS69S0200000_5;
import Y.IDcS37S0100000_5;
import Y.IDrS45S0100000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.OffsetGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelShowOptV2Setting;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import djb.IDaS22S0000000_5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.CsJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32691CsJ extends AbstractC029409q<C32721Csn> {
    public final Room LJLIL;
    public final C32676Cs4 LJLILLLLZI;
    public final DataChannel LJLJI;
    public final GiftPanelLeafViewModel LJLJJI;
    public final BagListViewModel LJLJJL;
    public final IDaS22S0000000_5 LJLJJLL;
    public final List<RunnableC31065CHd> LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLJJI;
        if (giftPanelLeafViewModel != null && (mutableLiveData = giftPanelLeafViewModel.LJLJI) != null && (value = mutableLiveData.getValue()) != null) {
            return value.size();
        }
        return 0;
    }

    public final void LJLZ(C32721Csn c32721Csn, EnumC32734Ct0 enumC32734Ct0) {
        int i;
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        List<AbstractC32698CsQ<? extends C30896CAq>> value;
        if (enumC32734Ct0 == null) {
            i = -1;
        } else {
            i = C32735Ct1.LIZIZ[enumC32734Ct0.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        BagListViewModel bagListViewModel = this.LJLJJL;
                        if (bagListViewModel != null && (mutableLiveData = bagListViewModel.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && value.isEmpty()) {
                            C29306Beo.LJI(c32721Csn.LJLJI);
                            C29306Beo.LJI(c32721Csn.LJLILLLLZI);
                            C29306Beo.LJI(c32721Csn.LJLJJI);
                            C29306Beo.LJI(c32721Csn.LJLJJLL);
                            C29306Beo.LJJLJLI(c32721Csn.LJLJJL);
                            return;
                        }
                        c32721Csn.L();
                        return;
                    }
                    c32721Csn.L();
                    C29306Beo.LJJLJLI(c32721Csn.LJLIL);
                    return;
                }
                C29306Beo.LJI(c32721Csn.LJLJI);
                C29306Beo.LJI(c32721Csn.LJLILLLLZI);
                C29306Beo.LJI(c32721Csn.LJLJJI);
                C29306Beo.LJJLJLI(c32721Csn.LJLJJLL);
                C29306Beo.LJI(c32721Csn.LJLJJL);
                c32721Csn.LJLJJLL.LIZ(new AqS155S0100000_5(this, 285));
                C29306Beo.LJI(c32721Csn.LJLIL);
                return;
            }
            C29306Beo.LJI(c32721Csn.LJLJI);
            C29306Beo.LJI(c32721Csn.LJLILLLLZI);
            C29306Beo.LJI(c32721Csn.LJLJJI);
            C29306Beo.LJI(c32721Csn.LJLJJLL);
            C29306Beo.LJJLJLI(c32721Csn.LJLJJL);
            return;
        }
        C29306Beo.LJJLJLI(c32721Csn.LJLJI);
        C29306Beo.LJI(c32721Csn.LJLILLLLZI);
        C29306Beo.LJI(c32721Csn.LJLJJI);
        C29306Beo.LJI(c32721Csn.LJLJJLL);
        C29306Beo.LJI(c32721Csn.LJLJJL);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C32721Csn c32721Csn, int i) {
        int i2;
        C71892SJk c71892SJk;
        MutableLiveData<EnumC32736Ct2> mutableLiveData;
        MutableLiveData<List<C32713Csf>> mutableLiveData2;
        List<C32713Csf> value;
        C32713Csf c32713Csf;
        MutableLiveData<EnumC32734Ct0> mutableLiveData3;
        C32713Csf c32713Csf2;
        MutableLiveData<EnumC32734Ct0> mutableLiveData4;
        GiftPanelLeafViewModel giftPanelLeafViewModel;
        MutableLiveData<EnumC32736Ct2> mutableLiveData5;
        BagListViewModel bagListViewModel;
        MutableLiveData<EnumC32734Ct0> mutableLiveData6;
        MutableLiveData<List<C32713Csf>> mutableLiveData7;
        List<C32713Csf> value2;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        C32681Cs9 c32681Cs9;
        MutableLiveData<List<C32713Csf>> mutableLiveData8;
        List<C32713Csf> value3;
        C32713Csf c32713Csf3;
        List<Long> list;
        C32721Csn holder = c32721Csn;
        o.LJIIIZ(holder, "holder");
        RunnableC31065CHd runnableC31065CHd = holder.LJLIL;
        runnableC31065CHd.LJLJJLL();
        ViewTreeObserver viewTreeObserver = runnableC31065CHd.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this.LJLILLLLZI.LLJLIL);
        }
        ViewTreeObserver viewTreeObserver2 = runnableC31065CHd.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnPreDrawListener(this.LJLILLLLZI.LLJLIL);
        }
        EnumC32736Ct2 enumC32736Ct2 = null;
        r3 = null;
        EnumC32734Ct0 enumC32734Ct0 = null;
        enumC32736Ct2 = null;
        runnableC31065CHd.setItemAnimator(null);
        C32687CsF c32687CsF = new C32687CsF(this.LJLJI, this.LJLJJI);
        C32676Cs4 callback = this.LJLILLLLZI;
        o.LJIIIZ(callback, "callback");
        c32687CsF.LJLJJI = callback;
        runnableC31065CHd.setAdapter(c32687CsF);
        if (LiveGiftPanelShowOptV2Setting.INSTANCE.getValue()) {
            runnableC31065CHd.setRecycledViewPool((RecyclerView.RecycledViewPool) C33658DIw.LIZ.getValue());
        }
        runnableC31065CHd.getContext();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(new C32764CtU(this.LJLILLLLZI));
        offsetGridLayoutManager.LLFZ = true;
        if (C32696CsO.LIZJ()) {
            offsetGridLayoutManager.LLIILII = new IDcS37S0100000_5(this, 2);
        }
        runnableC31065CHd.setLayoutManager(offsetGridLayoutManager);
        runnableC31065CHd.setClipChildren(false);
        if (C31160CKu.LIZLLL()) {
            runnableC31065CHd.setHasFixedSize(true);
        }
        if (C31160CKu.LIZIZ() > 0) {
            runnableC31065CHd.setItemViewCacheSize(C31160CKu.LIZIZ());
        }
        Context context = runnableC31065CHd.getContext();
        GiftPanelLeafViewModel giftPanelLeafViewModel2 = this.LJLJJI;
        if (giftPanelLeafViewModel2 != null && (mutableLiveData8 = giftPanelLeafViewModel2.LJLJI) != null && (value3 = mutableLiveData8.getValue()) != null && (c32713Csf3 = (C32713Csf) ListProtector.get(value3, i)) != null && (list = c32713Csf3.LIZLLL) != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (runnableC31065CHd.getItemDecorationCount() <= 0) {
            C71892SJk c71892SJk2 = new C71892SJk(runnableC31065CHd, new C47121t6(context, null));
            c71892SJk2.LJLJI = i2;
            RecyclerView recyclerView = c71892SJk2.LJLIL;
            if (recyclerView != null) {
                recyclerView.LJJJJZI();
            }
            runnableC31065CHd.LJII(c71892SJk2, 0);
        } else {
            AbstractC030309z LJJJJZ = runnableC31065CHd.LJJJJZ(0);
            if ((LJJJJZ instanceof C71892SJk) && (c71892SJk = (C71892SJk) LJJJJZ) != null) {
                c71892SJk.LJLJI = i2;
                RecyclerView recyclerView2 = c71892SJk.LJLIL;
                if (recyclerView2 != null) {
                    recyclerView2.LJJJJZI();
                }
            }
        }
        List<C0A6> list2 = runnableC31065CHd.LLJILJILJ;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        C88207Yjb.LJ(runnableC31065CHd);
        runnableC31065CHd.LJIIJJI(new IDrS45S0100000_5(this, 4));
        GiftPanelLeafViewModel giftPanelLeafViewModel3 = this.LJLJJI;
        if (giftPanelLeafViewModel3 != null && (mutableLiveData7 = giftPanelLeafViewModel3.LJLJI) != null && (value2 = mutableLiveData7.getValue()) != null && (!value2.isEmpty()) && (linkedList = ((C32713Csf) ListProtector.get(value2, i)).LIZJ) != null) {
            AbstractC029409q adapter = runnableC31065CHd.getAdapter();
            if ((adapter instanceof C32681Cs9) && (c32681Cs9 = (C32681Cs9) adapter) != null) {
                c32681Cs9.LJZ(linkedList);
            }
        }
        AObserverS69S0200000_5 aObserverS69S0200000_5 = holder.LJLJL;
        if (aObserverS69S0200000_5 != null && (bagListViewModel = this.LJLJJL) != null && (mutableLiveData6 = bagListViewModel.LJLJJLL) != null) {
            mutableLiveData6.removeObserver(aObserverS69S0200000_5);
        }
        C32770Cta c32770Cta = holder.LJLJLJ;
        if (c32770Cta != null && (giftPanelLeafViewModel = this.LJLJJI) != null && (mutableLiveData5 = giftPanelLeafViewModel.LJLJL) != null) {
            mutableLiveData5.removeObserver(c32770Cta);
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel4 = this.LJLJJI;
        if (giftPanelLeafViewModel4 != null) {
            List<C32713Csf> value4 = giftPanelLeafViewModel4.LJLJI.getValue();
            if (value4 != null && (c32713Csf2 = (C32713Csf) ORZ.LJLLLLLL(i, value4)) != null && c32713Csf2.LIZ == 16) {
                AObserverS69S0200000_5 aObserverS69S0200000_52 = new AObserverS69S0200000_5((Object) this, (User) holder, (InterfaceC88472Yns<? super User, C76800UCe>) 23);
                BagListViewModel bagListViewModel2 = this.LJLJJL;
                if (bagListViewModel2 != null && (mutableLiveData4 = bagListViewModel2.LJLJJLL) != null) {
                    C32676Cs4 c32676Cs4 = this.LJLILLLLZI;
                    c32676Cs4.getClass();
                    mutableLiveData4.observe(c32676Cs4, aObserverS69S0200000_52);
                }
                holder.LJLJL = aObserverS69S0200000_52;
            } else {
                C32770Cta c32770Cta2 = new C32770Cta(this, holder, i);
                MutableLiveData<EnumC32736Ct2> mutableLiveData9 = giftPanelLeafViewModel4.LJLJL;
                C32676Cs4 c32676Cs42 = this.LJLILLLLZI;
                c32676Cs42.getClass();
                mutableLiveData9.observe(c32676Cs42, c32770Cta2);
                holder.LJLJLJ = c32770Cta2;
            }
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel5 = this.LJLJJI;
        if (giftPanelLeafViewModel5 != null && (mutableLiveData2 = giftPanelLeafViewModel5.LJLJI) != null && (value = mutableLiveData2.getValue()) != null && (c32713Csf = (C32713Csf) ORZ.LJLLLLLL(i, value)) != null && c32713Csf.LIZ == 16) {
            BagListViewModel bagListViewModel3 = this.LJLJJL;
            if (bagListViewModel3 != null && (mutableLiveData3 = bagListViewModel3.LJLJJLL) != null) {
                enumC32734Ct0 = mutableLiveData3.getValue();
            }
            LJLZ(holder, enumC32734Ct0);
        } else {
            GiftPanelLeafViewModel giftPanelLeafViewModel6 = this.LJLJJI;
            if (giftPanelLeafViewModel6 != null && (mutableLiveData = giftPanelLeafViewModel6.LJLJL) != null) {
                enumC32736Ct2 = mutableLiveData.getValue();
            }
            LJLLLLLL(holder, i, enumC32736Ct2);
        }
        ListProtector.set(this.LJLJL, i, holder.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final C32721Csn onCreateViewHolder(ViewGroup viewGroup, int i) {
        View root = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.doo, viewGroup, false);
        o.LJIIIIZZ(root, "root");
        C32721Csn c32721Csn = new C32721Csn(root);
        C0AX.LIZ(viewGroup, c32721Csn.itemView, R.id.lj7);
        View view = c32721Csn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c32721Csn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C32721Csn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c32721Csn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c32721Csn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C32721Csn.class.getName();
        return c32721Csn;
    }

    public final void LJLLLLLL(C32721Csn c32721Csn, int i, EnumC32736Ct2 enumC32736Ct2) {
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        C32713Csf c32713Csf;
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LJLJJI;
        if (giftPanelLeafViewModel != null && (mutableLiveData = giftPanelLeafViewModel.LJLJI) != null && (value = mutableLiveData.getValue()) != null && (c32713Csf = (C32713Csf) ORZ.LJLLLLLL(i, value)) != null) {
            LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList = c32713Csf.LIZJ;
            if (linkedList == null || linkedList.isEmpty()) {
                C29306Beo.LJI(c32721Csn.LJLJI);
                C29306Beo.LJJLJLI(c32721Csn.LJLILLLLZI);
                C29306Beo.LJI(c32721Csn.LJLJJI);
                C29306Beo.LJI(c32721Csn.LJLJJLL);
                C29306Beo.LJI(c32721Csn.LJLJJL);
            }
            if (enumC32736Ct2 != null) {
                int i2 = C32735Ct1.LIZ[enumC32736Ct2.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            C29306Beo.LJI(c32721Csn.LJLJI);
                            C29306Beo.LJI(c32721Csn.LJLILLLLZI);
                            C29306Beo.LJJLJLI(c32721Csn.LJLJJI);
                            C29306Beo.LJI(c32721Csn.LJLJJLL);
                            C29306Beo.LJI(c32721Csn.LJLJJL);
                            c32721Csn.LJLJJI.LIZ(new AqS155S0100000_5(this, 283));
                            return;
                        }
                    } else {
                        C29306Beo.LJJLJLI(c32721Csn.LJLJI);
                        C29306Beo.LJI(c32721Csn.LJLILLLLZI);
                        C29306Beo.LJI(c32721Csn.LJLJJI);
                        C29306Beo.LJI(c32721Csn.LJLJJLL);
                        C29306Beo.LJI(c32721Csn.LJLJJL);
                        return;
                    }
                } else {
                    c32721Csn.L();
                    return;
                }
            }
            C29306Beo.LJI(c32721Csn.LJLJI);
            C29306Beo.LJI(c32721Csn.LJLILLLLZI);
            C29306Beo.LJJLJLI(c32721Csn.LJLJJI);
            C29306Beo.LJI(c32721Csn.LJLJJLL);
            C29306Beo.LJI(c32721Csn.LJLJJL);
            c32721Csn.LJLJJI.LIZ(new AqS155S0100000_5(this, 284));
        }
    }

    public C32691CsJ(Room room, C32676Cs4 giftPanelLeaf, DataChannel dataChannel, GiftPanelLeafViewModel giftPanelLeafViewModel, BagListViewModel bagListViewModel) {
        o.LJIIIZ(giftPanelLeaf, "giftPanelLeaf");
        this.LJLIL = room;
        this.LJLILLLLZI = giftPanelLeaf;
        this.LJLJI = dataChannel;
        this.LJLJJI = giftPanelLeafViewModel;
        this.LJLJJL = bagListViewModel;
        this.LJLJJLL = new IDaS22S0000000_5(CoroutineExceptionHandler.LJJJJIZL, 2);
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(null);
            i++;
        } while (i < 10);
        this.LJLJL = arrayList;
    }
}

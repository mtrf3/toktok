package X;

import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS6S0301000_5;
import Y.ARunnableS9S0101000_5;
import Y.AfS57S0100000_5;
import Y.IDDListenerS392S0100000_5;
import Y.IDLListenerS193S0100000_5;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.livesdk.BoxGiftPageEvent;
import com.bytedance.android.livesdk.GiftLimitDisableEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLeafPostSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendGiftListAckSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.postrechargeretention.PostRechargeRetentionViewModel;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import djb.IDaS22S0000000_5;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Cs4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32676Cs4 extends DialogLeaf implements InterfaceC32719Csl, InterfaceC151715xP, AMD<ViewModelProvider.AndroidViewModelFactory> {
    public String LJLLJ;
    public String LJLLL;
    public List<? extends Gift> LJLLLL;
    public final String LJLLLLLL;
    public RunnableC31065CHd LJLZ;
    public C32681Cs9 LJZ;
    public C0CM LJZI;
    public C32709Csb LJZL;
    public C47121t6 LL;
    public CVT LLD;
    public C32733Csz LLF;
    public View LLFF;
    public C77557UcD LLFFF;
    public C32733Csz LLFII;
    public C71892SJk LLFZ;
    public List<Long> LLI;
    public java.util.Map<Long, C32830CuY> LLIFFJFJJ;
    public final LinkedList<Integer> LLII;
    public final LinkedList<Long> LLIIII;
    public final java.util.Map<Long, Integer> LLIIIILZ;
    public final C73893SzJ<User> LLIIIJ;
    public final int LLIIIL;
    public final int LLIIIZ;
    public final C73318Sq2 LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public Room LLIL;
    public boolean LLILII;
    public long LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public final ArrayList<GiftPage> LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public ViewGroup LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public RiskCtl LLJ;
    public T4Y LLJI;
    public CX5 LLJIJIL;
    public TextView LLJILJIL;
    public boolean LLJILJILJ;
    public C32674Cs2 LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public final long LLJJIJIL;
    public final long LLJJJ;
    public final long LLJJJIL;
    public boolean LLJJJJ;
    public CopyOnWriteArraySet<Double> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final int LLJJL;
    public final AtomicBoolean LLJJLIIIJLLLLLLLZ;
    public final IDaS22S0000000_5 LLJL;
    public final IDDListenerS392S0100000_5 LLJLIL;
    public final IDLListenerS193S0100000_5 LLJLILLLLZIIL;
    public final C32743Ct9 LLJLL;
    public C31563Ca7 LLJLLIL;
    public final AObserverS73S0100000_5 LLJLLL;
    public final AObserverS73S0100000_5 LLJZ;
    public final C32550Cq2 LLJZIJLIL;
    public int LLL;

    @Override // X.AbstractC32579CqV
    public final void LJIILIIL() {
        this.LLIILII = true;
        C20990s3.LIZ().VX();
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x035b, code lost:
    
        if (r4 == null) goto L161;
     */
    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC32579CqV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.onStart():void");
    }

    @Override // X.AbstractC32579CqV
    public final int LJIIL() {
        return EnumC32750CtG.GIFT_PANEL_LEAF.getZIndex();
    }

    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf
    public final C32780Ctk LJJI() {
        C32780Ctk c32780Ctk = new C32780Ctk();
        c32780Ctk.LIZ = R.style.abp;
        c32780Ctk.LIZJ = 48;
        c32780Ctk.LIZIZ = 80;
        return c32780Ctk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r6.getTabByGiftId(r0) == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        r1 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst();
        r0 = r2.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r3 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r5 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst().checkTabCanDisplay(r1.getTabByGiftId(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r8.getTabByGiftId(r0) != (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0058, code lost:
    
        if (r6.getTabByGiftId(r0) == (-1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJIIJZLJL():void");
    }

    public final BagListViewModel LJJIJ() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (BagListViewModel) ViewModelProviders.of(fragment).get(BagListViewModel.class);
    }

    public final GiftPanelLeafViewModel LJJIJIL() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) ViewModelProviders.of(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJIJLIJ() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
    }

    public final PostRechargeRetentionViewModel LJJIZ() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (PostRechargeRetentionViewModel) ViewModelProviders.of(fragment).get(PostRechargeRetentionViewModel.class);
    }

    public final User LJJJIL() {
        DataChannel dataChannel;
        Room room;
        User user = C32129CjF.LIZ.LIZJ;
        if (user == null) {
            GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
            if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                return room.getOwner();
            }
            return null;
        }
        return user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
    
        if ((r3 instanceof X.C32739Ct5) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0122, code lost:
    
        if ((r3 instanceof X.C32741Ct7) == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0296 A[LOOP:2: B:122:0x0290->B:124:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[LOOP:0: B:15:0x003f->B:97:0x0218, LOOP_START, PHI: r8
      0x003f: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:14:0x003d, B:97:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0218 A[LOOP:0: B:15:0x003f->B:97:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0091 A[EDGE_INSN: B:98:0x0091->B:102:0x0091 BREAK  A[LOOP:0: B:15:0x003f->B:97:0x0218], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJJJL():void");
    }

    public final void LJJJJLL() {
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        LinearLayoutManager linearLayoutManager;
        int i = 0;
        if (this.LLJJLIIIJLLLLLLLZ.compareAndSet(true, false)) {
            RunnableC31065CHd runnableC31065CHd = this.LJLZ;
            C0A2 c0a2 = null;
            if ((runnableC31065CHd == null || runnableC31065CHd.getLayoutManager() == null) && LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
                GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
                if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLJI) != null && (value = mutableLiveData.getValue()) != null) {
                    Iterator<C32713Csf> it = value.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().LIZ == LJJIJIIJI()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                }
                LJJJZ(i);
            }
            C32694CsM.LJJ = SystemClock.uptimeMillis() - C32129CjF.LIZ.LJIIJ;
            C32694CsM.LJIILIIL = SystemClock.uptimeMillis();
            RunnableC31065CHd runnableC31065CHd2 = this.LJLZ;
            if (runnableC31065CHd2 != null) {
                c0a2 = runnableC31065CHd2.getLayoutManager();
            }
            if ((c0a2 instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) c0a2) != null) {
                int LLILLJJLI = (linearLayoutManager.LLILLJJLI() - linearLayoutManager.LLILL()) + 1;
                C32694CsM.LJJI = LLILLJJLI;
                if (C32694CsM.LJJIIJ >= C32694CsM.LJJI) {
                    C32694CsM.LJJIJL = SystemClock.uptimeMillis();
                }
                RunnableC31065CHd runnableC31065CHd3 = this.LJLZ;
                if (runnableC31065CHd3 != null) {
                    runnableC31065CHd3.postDelayed(new ARunnableS9S0101000_5(LLILLJJLI, this, 2), this.LLJJIJIL);
                }
            }
        }
    }

    public final void LJJL() {
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
            GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
            int i = 0;
            if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLJI) != null && (value = mutableLiveData.getValue()) != null) {
                Iterator<C32713Csf> it = value.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().LIZ == LJJIJIIJI()) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
            }
            LJJJZ(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("intendedPosition ");
            LIZ.append(i);
            C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJJLIIIJLJLI() {
        View view;
        if (this.LJLJI.LIZ != EnumC32545Cpx.END && (view = this.LJLJJI) != null) {
            view.postDelayed(new ARunnableS41S0100000_5(this, 2), 330L);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW != null && (fragment = c32580CqW.getFragment()) != null) {
            lifecycle = fragment.getLifecycle();
        } else {
            lifecycle = null;
        }
        o.LJI(lifecycle);
        return lifecycle;
    }

    @Override // X.AMD
    public final ViewModelProvider.AndroidViewModelFactory getViewModelFactory() {
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
        Context LLLLL = C16880lQ.LLLLL(this.LJLIL);
        o.LJII(LLLLL, "null cannot be cast to non-null type android.app.Application");
        return companion.getInstance((Application) LLLLL);
    }

    @Override // X.InterfaceC32719Csl
    public final boolean LJFF() {
        User LJJJIL;
        DataChannel dataChannel;
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null && C29306Beo.LJJII(dataChannel)) {
            return true;
        }
        RiskCtl riskCtl = this.LLJ;
        if (riskCtl != null && riskCtl.disableSendGift && (LJJJIL = LJJJIL()) != null && LJJJIL.getId() == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC32579CqV
    public final void LJIILL() {
        DataChannel dataChannel;
        Fragment fragment;
        super.LJIILL();
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null) {
            C32580CqW c32580CqW = this.LJLJJL;
            if (c32580CqW != null) {
                fragment = c32580CqW.getFragment();
            } else {
                fragment = null;
            }
            dataChannel.lv0(fragment, GiftLimitDisableEvent.class, new AqS171S0100000_5(this, 4));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC32579CqV
    public final void LJIJJ() {
        C0CM c0cm;
        C32580CqW c32580CqW;
        C32580CqW c32580CqW2;
        C32580CqW c32580CqW3;
        C32580CqW c32580CqW4;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        C32506CpK<AbstractC32126CjC> c32506CpK;
        super.LJIJJ();
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (c32506CpK = LJJIJLIJ.LJLJI) != null) {
            C32550Cq2 observer = this.LLJZIJLIL;
            o.LJIIIZ(observer, "observer");
            C62819Ol5.LJIIJ("removeObserver");
            c32506CpK.LIZ.remove(observer);
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLZ;
        if (runnableC31065CHd != null && (viewTreeObserver2 = runnableC31065CHd.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnPreDrawListener(this.LLJLIL);
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLZ;
        if (runnableC31065CHd2 != null && (viewTreeObserver = runnableC31065CHd2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LLJLILLLLZIIL);
        }
        C32128CjE c32128CjE = C32129CjF.LIZ;
        if (c32128CjE.LJIILL && (c32580CqW3 = this.LJLJJL) != null && c32580CqW3.LJJLL(this.LLIIIL) && (c32580CqW4 = this.LJLJJL) != null) {
            c32580CqW4.LJJZ(this.LLIIIL);
        }
        if (c32128CjE.LJIJ && (c32580CqW = this.LJLJJL) != null && c32580CqW.LJJLL(this.LLIIIZ) && (c32580CqW2 = this.LJLJJL) != null) {
            c32580CqW2.LJJZ(this.LLIIIZ);
        }
        if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
            C32709Csb c32709Csb = this.LJZL;
            if (c32709Csb != null && (c0cm = this.LJZI) != null) {
                ((ArrayList) c0cm.LJLJI.LJLIL).remove(c32709Csb);
            }
            GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
            if (LJJIJIL != null) {
                LJJIJIL.LJLJJI.removeObservers(this);
                LJJIJIL.LJLJL.removeObservers(this);
            }
            GiftManager.inst().unRegisterGiftListListener(this.LLJLL);
        }
    }

    public final void LJJIFFI() {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData2;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = null;
        if (C31160CKu.LIZLLL()) {
            GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
            if (LJJIJIL != null) {
                XKX.LIZLLL(LifecycleKt.getCoroutineScope(getLifecycle()), C78613UtF.LIZ.plus(this.LLJL), null, new C32685CsD(this, LJJIJIL, null), 2);
                return;
            }
            return;
        }
        GiftPanelLeafViewModel LJJIJIL2 = LJJIJIL();
        if (LJJIJIL2 == null || (mutableLiveData = LJJIJIL2.LJLILLLLZI) == null || mutableLiveData.getValue() == null) {
            return;
        }
        GiftPanelLeafViewModel LJJIJIL3 = LJJIJIL();
        int i = 0;
        if (LJJIJIL3 != null && (mutableLiveData2 = LJJIJIL3.LJLILLLLZI) != null && (value = mutableLiveData2.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = i2 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null && next.LIZJ() == LJJJI() && next.LIZLLL) {
                    next.LIZJ = true;
                    next.LIZLLL = false;
                    i = i2;
                    abstractC32698CsQ = next;
                    break;
                }
                i2 = i3;
            }
        }
        C32681Cs9 c32681Cs9 = this.LJZ;
        if (c32681Cs9 == null) {
            return;
        }
        c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
    }

    public final void LJJIIZ() {
        int i;
        MutableLiveData<EnumC32734Ct0> mutableLiveData;
        EnumC32734Ct0 value;
        MutableLiveData<EnumC32734Ct0> mutableLiveData2;
        EnumC32734Ct0 value2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deal with empty current state ");
        BagListViewModel LJJIJ = LJJIJ();
        String str = null;
        if (LJJIJ != null && (mutableLiveData2 = LJJIJ.LJLJJLL) != null && (value2 = mutableLiveData2.getValue()) != null) {
            str = value2.name();
        }
        LIZ.append(str);
        Logger.i("BAGS", X1D.LIZIZ(LIZ));
        BagListViewModel LJJIJ2 = LJJIJ();
        if (LJJIJ2 == null || (mutableLiveData = LJJIJ2.LJLJJLL) == null || (value = mutableLiveData.getValue()) == null) {
            i = -1;
        } else {
            i = C32747CtD.LIZ[value.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C32733Csz c32733Csz = this.LLFII;
                    if (c32733Csz != null) {
                        c32733Csz.setVisibility(8);
                    }
                    View view = this.LLFF;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    CVT cvt = this.LLD;
                    if (cvt == null) {
                        return;
                    }
                    cvt.setVisibility(8);
                    return;
                }
                C32733Csz c32733Csz2 = this.LLFII;
                if (c32733Csz2 != null) {
                    c32733Csz2.setVisibility(0);
                }
                CVT cvt2 = this.LLD;
                if (cvt2 != null) {
                    cvt2.setVisibility(8);
                }
                View view2 = this.LLFF;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                C32733Csz c32733Csz3 = this.LLFII;
                if (c32733Csz3 == null) {
                    return;
                }
                c32733Csz3.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 2)));
                return;
            }
            View view3 = this.LLFF;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            CVT cvt3 = this.LLD;
            if (cvt3 != null) {
                cvt3.setVisibility(8);
            }
            C32733Csz c32733Csz4 = this.LLFII;
            if (c32733Csz4 == null) {
                return;
            }
            c32733Csz4.setVisibility(8);
            return;
        }
        CVT cvt4 = this.LLD;
        if (cvt4 != null) {
            cvt4.setVisibility(0);
        }
        View view4 = this.LLFF;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        C32733Csz c32733Csz5 = this.LLFII;
        if (c32733Csz5 == null) {
            return;
        }
        c32733Csz5.setVisibility(8);
    }

    public final int LJJIJIIJI() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJI) == null || (value = mutableLiveData.getValue()) == null) {
            return 1;
        }
        return value.intValue();
    }

    public final int LJJIJIIJIL() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJL) == null || (value = mutableLiveData.getValue()) == null) {
            return 1;
        }
        return value.intValue();
    }

    public final long LJJJI() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJLL) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    public final boolean LJJJJIZL() {
        GiftLeafRootViewModel LJJIJLIJ;
        DataChannel dataChannel;
        if (GiftManager.inst().getPollGifts() == null || (LJJIJLIJ = LJJIJLIJ()) == null || (dataChannel = LJJIJLIJ.LJLIL) == null || !o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.FALSE) || !((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).zq() || C32129CjF.LIZ.LIZLLL == EnumC35487DwJ.GUEST) {
            return false;
        }
        Long LIZJ = InterfaceC30442Bx8.LIZLLL.LIZJ();
        long pz = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).pz();
        if (LIZJ != null && LIZJ.longValue() == pz) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6 A[LOOP:0: B:33:0x0067->B:55:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EDGE_INSN: B:56:0x00c8->B:57:0x00c8 BREAK  A[LOOP:0: B:33:0x0067->B:55:0x00a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJJJZI():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
    
        if ((r2 instanceof X.C32741Ct7) == false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5 A[LOOP:0: B:28:0x0052->B:110:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a2 A[EDGE_INSN: B:111:0x00a2->B:115:0x00a2 BREAK  A[LOOP:0: B:28:0x0052->B:110:0x01a5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL() {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJJLL():void");
    }

    public C32676Cs4(Context context) {
        super(context, EnumC32750CtG.GIFT_PANEL_LEAF.getZIndex());
        this.LJLLJ = "";
        this.LJLLL = "";
        this.LJLLLLLL = "GiftPanelLeaf";
        this.LLI = C61878OQg.INSTANCE;
        this.LLIFFJFJJ = new LinkedHashMap();
        this.LLII = new LinkedList<>();
        this.LLIIII = new LinkedList<>();
        this.LLIIIILZ = new LinkedHashMap();
        this.LLIIIJ = new C73893SzJ<>();
        this.LLIIIL = EnumC32750CtG.GIFT_PANEL_MULTI_GUEST_VIEW.getZIndex();
        this.LLIIIZ = EnumC32750CtG.GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF.getZIndex();
        this.LLIIJI = new C73318Sq2();
        this.LLIIJLIL = true;
        this.LLIIL = true;
        this.LLIILII = true;
        this.LLIILZL = true;
        this.LLILIL = -1L;
        this.LLILL = 1;
        this.LLILLIZIL = 1;
        this.LLILLJJLI = new ArrayList<>();
        this.LLJJ = true;
        this.LLJJI = true;
        this.LLJJIII = true;
        this.LLJJIJIL = 100L;
        this.LLJJJ = 7777777L;
        this.LLJJJIL = -10L;
        this.LLJJJJJIL = new CopyOnWriteArraySet<>();
        this.LLJJL = 20;
        this.LLJJLIIIJLLLLLLLZ = new AtomicBoolean(true);
        this.LLJL = new IDaS22S0000000_5(CoroutineExceptionHandler.LJJJJIZL, 0);
        this.LLJLIL = new IDDListenerS392S0100000_5(this, 0);
        this.LLJLILLLLZIIL = new IDLListenerS193S0100000_5(this, 0);
        this.LLJLL = new C32743Ct9(this);
        this.LLJLLL = new AObserverS73S0100000_5(this, 0);
        this.LLJZ = new AObserverS73S0100000_5(this, 2);
        this.LLJZIJLIL = new C32550Cq2(this);
    }

    @Override // X.InterfaceC32719Csl
    public final void LIZIZ(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        C32694CsM.LJJIIZI.put(Long.valueOf(abstractC32698CsQ.LIZJ()), Boolean.FALSE);
    }

    @Override // X.InterfaceC32719Csl
    public final void LIZJ(boolean z) {
        C77557UcD c77557UcD = this.LLFFF;
        if (c77557UcD != null) {
            T2J.LJII(c77557UcD, false);
        }
    }

    @Override // X.InterfaceC32719Csl
    public final void LIZLLL(AbstractC32698CsQ<? extends C30896CAq> panel) {
        o.LJIIIZ(panel, "panel");
        C32694CsM.LJJIIZ.put(Long.valueOf(panel.LIZJ()), Boolean.FALSE);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJII(AbstractC32698CsQ<? extends C30896CAq> panel) {
        o.LJIIIZ(panel, "panel");
        C32694CsM.LJJIIZ.put(Long.valueOf(panel.LIZJ()), Boolean.TRUE);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIIIIZZ(long j) {
        boolean z;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        DataChannel dataChannel;
        Room room;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData2;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value2;
        DataChannel dataChannel2;
        Room room2;
        int i = 0;
        if (LJJJI() == j && LJJIJIIJIL() == C32129CjF.LIZ.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        long j2 = 0;
        if (z) {
            GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = null;
            if (LJJIJIL != null && (mutableLiveData2 = LJJIJIL.LJLILLLLZI) != null && (value2 = mutableLiveData2.getValue()) != null) {
                Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int i3 = i2 + 1;
                    AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                    if (next != null && next.LIZJ() == j) {
                        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
                        if (c32313CmD.LJIIL() && c32313CmD.LJII() == next.LIZJ()) {
                            BZI LIZ = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_click");
                            C32456CoW.LIZ(LIZ);
                            LIZ.LJJIIJZLJL();
                            AbstractC32320CmK.LIZJ(c32313CmD, this.LJLIL, "first_recharge", null, 60);
                        } else if (LJFF()) {
                            int LJJIJL = LJJIJL(Long.valueOf(j));
                            GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
                            if (LJJIJLIJ != null && (dataChannel2 = LJJIJLIJ.LJLIL) != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                                j2 = room2.getOwnerUserId();
                            }
                            C32720Csm.LIZ(j, LJJIJL, i2, j2);
                        }
                        i = i2;
                        abstractC32698CsQ = next;
                    } else {
                        i2 = i3;
                    }
                }
            }
            C32681Cs9 c32681Cs9 = this.LJZ;
            if (c32681Cs9 != null) {
                c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
                return;
            }
            return;
        }
        GiftPanelLeafViewModel LJJIJIL2 = LJJIJIL();
        if (LJJIJIL2 != null && (mutableLiveData = LJJIJIL2.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it2 = value.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int i5 = i4 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next2 = it2.next();
                if (next2 != null && next2.LIZJ() == j) {
                    if (LJFF()) {
                        int LJJIJL2 = LJJIJL(Long.valueOf(j));
                        GiftLeafRootViewModel LJJIJLIJ2 = LJJIJLIJ();
                        if (LJJIJLIJ2 != null && (dataChannel = LJJIJLIJ2.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                            j2 = room.getOwnerUserId();
                        }
                        C32720Csm.LIZ(j, LJJIJL2, i4, j2);
                    }
                } else {
                    i4 = i5;
                }
            }
        }
        LJJIII(j);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIIJJI(long j) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        int i = 0;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = null;
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = i2 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null && next.LIZJ() == LJJJI()) {
                    next.LIZJ = true;
                    next.LIZLLL = false;
                    next.LJ = null;
                    i = i2;
                    abstractC32698CsQ = next;
                    break;
                }
                i2 = i3;
            }
        }
        C32681Cs9 c32681Cs9 = this.LJZ;
        if (c32681Cs9 != null) {
            c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
        }
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIILLIIL(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        C32694CsM.LJJIIZI.put(Long.valueOf(abstractC32698CsQ.LIZJ()), Boolean.TRUE);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIJ(long j) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        int i = 0;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = null;
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i3 = i2 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null && next.LIZJ() == j) {
                    if (LJJJI() == j) {
                        next.LIZJ = true;
                        next.LIZLLL = false;
                    } else {
                        next.LIZJ = false;
                        next.LIZLLL = false;
                    }
                    i = i2;
                    abstractC32698CsQ = next;
                } else {
                    i2 = i3;
                }
            }
        }
        C32681Cs9 c32681Cs9 = this.LJZ;
        if (c32681Cs9 != null) {
            c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJII(LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        ViewGroup viewGroup;
        long j;
        long j2;
        long j3;
        String str;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Long l;
        boolean z;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData2;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value2;
        long LJJJ;
        DataChannel dataChannel3;
        EnumC32766CtW enumC32766CtW;
        MutableLiveData<EnumC32766CtW> mutableLiveData3;
        MutableLiveData<EnumC32766CtW> mutableLiveData4;
        MutableLiveData<EnumC32736Ct2> mutableLiveData5;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changing data, panel size: ");
        LIZ.append(linkedList.size());
        LIZ.append(", adapter: ");
        LIZ.append(this.LJZ);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
        EnumC32766CtW enumC32766CtW2 = null;
        int i = 0;
        if (linkedList.isEmpty()) {
            if (LJJIJIIJI() != 16) {
                C32444CoK.LIZ(this.LJLLLLLL, "mAdapter panels is null");
                this.LLILL = 0;
                GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
                if (LJJIJIL == null || (mutableLiveData5 = LJJIJIL.LJLJL) == null) {
                    return;
                }
                mutableLiveData5.setValue(EnumC32736Ct2.FAILED);
                return;
            }
            LJJIIZ();
        } else {
            C47121t6 c47121t6 = this.LL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            View view = this.LLFF;
            if (view != null) {
                view.setVisibility(8);
            }
            C32733Csz c32733Csz = this.LLFII;
            if (c32733Csz != null) {
                c32733Csz.setVisibility(8);
            }
            this.LLILL = 1;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = linkedList;
        if (LiveGiftPanelManualSortSetting.INSTANCE.isEnable() && LJJIJIIJI() == 1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("changedPanels, ");
            GiftPanelLeafViewModel LJJIJIL2 = LJJIJIL();
            if (LJJIJIL2 != null && (mutableLiveData4 = LJJIJIL2.LJLLLL) != null) {
                enumC32766CtW2 = mutableLiveData4.getValue();
            }
            LIZ2.append(enumC32766CtW2);
            C32444CoK.LIZ("giftpanelsort", X1D.LIZIZ(LIZ2));
            GiftPanelLeafViewModel LJJIJIL3 = LJJIJIL();
            if (LJJIJIL3 == null || (mutableLiveData3 = LJJIJIL3.LJLLLL) == null || (enumC32766CtW = mutableLiveData3.getValue()) == null) {
                enumC32766CtW = EnumC32766CtW.DEFAULT;
            }
            o.LJIIIIZZ(enumC32766CtW, "giftDiaLogVM?.sortState?…alue ?: SortState.DEFAULT");
            C32738Ct4.LIZ(linkedList, enumC32766CtW, this.LLI);
            c68322mC.element = linkedList;
        }
        C78076Uka c78076Uka = C78110Ul8.LIZ;
        T t = c68322mC.element;
        c78076Uka.getClass();
        if (t == 0) {
            new LinkedList();
        }
        GiftManager.inst().updatePanelList((LinkedList) c68322mC.element);
        C32128CjE c32128CjE = C32129CjF.LIZ;
        c32128CjE.getClass();
        LJJLIIIJILLIZJL(C32778Cti.LIZ(C15380j0.LIZLLL()));
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = LJJJI();
        if (this.LLIIJLIL) {
            String str2 = this.LJLLLLLL;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("changeData#mStartNewSession ");
            LIZ3.append(c72242sW.element);
            C32444CoK.LIZ(str2, X1D.LIZIZ(LIZ3));
            this.LLIIJLIL = false;
            if (LJJIJIIJI() != 16) {
                if (this.LLIIZ) {
                    LJJJ = 0;
                } else {
                    LJJJ = LJJJ((LinkedList) c68322mC.element, false);
                }
                c72242sW.element = LJJJ;
                LJJLIIIJILLIZJL(LJJJ);
                GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
                if (LJJIJLIJ != null && (dataChannel3 = LJJIJLIJ.LJLIL) != null) {
                    dataChannel3.rv0(GiftSelectedChangeEvent.class, C32341Cmf.LIZLLL(c72242sW.element));
                }
                PostRechargeRetentionViewModel LJJIZ = LJJIZ();
                if (LJJIZ != null) {
                    LJJIZ.LJLJJL = C32341Cmf.LIZLLL(c72242sW.element);
                }
                long j4 = c32128CjE.LJIILIIL;
                if (j4 == -1) {
                    j4 = C32272ClY.LIZ(Long.valueOf(c72242sW.element));
                }
                PostRechargeRetentionViewModel LJJIZ2 = LJJIZ();
                if (LJJIZ2 != null) {
                    LJJIZ2.LJLJJLL = j4;
                }
            }
            if (this.LLIIL) {
                this.LLIIL = false;
                GiftPanelLeafViewModel LJJIJIL4 = LJJIJIL();
                if (LJJIJIL4 != null && (mutableLiveData2 = LJJIJIL4.LJLILLLLZI) != null && (value2 = mutableLiveData2.getValue()) != null) {
                    C32783Ctn.LIZ.LJIIIIZZ(LJJIJIIJIL(), value2);
                }
                C88137YiT.LIZ.LIZ = true;
                if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
                    C0CM c0cm = this.LJZI;
                    if (c0cm != null) {
                        c0cm.postDelayed(new ARunnableS24S0200000_5(this, c72242sW, 1), 0L);
                    }
                } else {
                    RunnableC31065CHd runnableC31065CHd = this.LJLZ;
                    if (runnableC31065CHd != null) {
                        runnableC31065CHd.postDelayed(new ARunnableS24S0200000_5(this, c72242sW, 2), 0L);
                    }
                }
            }
        } else {
            GiftPanelLeafViewModel LJJIJIL5 = LJJIJIL();
            if (LJJIJIL5 != null && (mutableLiveData = LJJIJIL5.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
                C32783Ctn.LIZ.LJIIIIZZ(LJJIJIIJI(), value);
            }
            C88137YiT.LIZ.LIZ = false;
            if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
                C0CM c0cm2 = this.LJZI;
                if (c0cm2 != null) {
                    c0cm2.postDelayed(new ARunnableS24S0200000_5(this, c72242sW, 3), 0L);
                }
            } else {
                RunnableC31065CHd runnableC31065CHd2 = this.LJLZ;
                if (runnableC31065CHd2 != null) {
                    runnableC31065CHd2.postDelayed(new ARunnableS24S0200000_5(this, c72242sW, 4), 0L);
                }
            }
        }
        Iterator it = ((AbstractSequentialList) c68322mC.element).iterator();
        while (it.hasNext()) {
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) it.next();
            if ((abstractC32698CsQ instanceof C32774Cte) || (abstractC32698CsQ instanceof C32742Ct8)) {
                abstractC32698CsQ.LIZJ = true;
                abstractC32698CsQ.LJIIIIZZ = true;
                LJJLIIIJILLIZJL(abstractC32698CsQ.LIZJ());
            } else {
                if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ() == LJJJI()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    abstractC32698CsQ.LJIIIIZZ = true;
                    abstractC32698CsQ.LIZJ = true;
                    abstractC32698CsQ.LJII = C32833Cub.LIZIZ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("item?.id == selectedGiftId, ");
                    LIZ4.append(LJJJI());
                    C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ4));
                } else if (abstractC32698CsQ != null) {
                    if (abstractC32698CsQ.LIZJ) {
                        abstractC32698CsQ.LJIIIIZZ = true;
                        abstractC32698CsQ.LIZJ = false;
                        abstractC32698CsQ.LJII = "";
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("item?.id == selectedGiftId, ");
                        LIZ5.append(abstractC32698CsQ.LIZJ);
                        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ5));
                    } else {
                        abstractC32698CsQ.LJIIIIZZ = false;
                    }
                }
            }
        }
        if (!this.LLIIZ) {
            i = LJJJJI(c72242sW.element, (LinkedList) c68322mC.element);
        }
        String str3 = this.LJLLLLLL;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("changeData# gift = ");
        C06510Nj.LIZIZ(LIZ6, c72242sW.element, ", pos = ", i);
        C32444CoK.LIZ(str3, X1D.LIZIZ(LIZ6));
        if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled()) {
            viewGroup = this.LJZI;
        } else {
            viewGroup = this.LJLZ;
        }
        if (LiveGiftLeafPostSettings.INSTANCE.getValue()) {
            if (viewGroup != null) {
                viewGroup.postDelayed(new ARunnableS6S0301000_5(this, c68322mC, i, c72242sW, 0), 40L);
            }
        } else {
            if (this.LLL == 1) {
                C32681Cs9 c32681Cs9 = this.LJZ;
                if (c32681Cs9 != null) {
                    c32681Cs9.LJLZ((LinkedList) c68322mC.element);
                }
            } else {
                C32681Cs9 c32681Cs92 = this.LJZ;
                if (c32681Cs92 != null) {
                    c32681Cs92.LJZ((LinkedList) c68322mC.element);
                }
            }
            if (viewGroup != null) {
                viewGroup.postDelayed(new ARunnableS9S0101000_5(i, this, 1), 40L);
            }
            LJJJJLI(LJJIL(Long.valueOf(c72242sW.element)));
        }
        C32781Ctl.LIZ.LIZLLL();
        if (LiveGiftSendGiftListAckSettings.INSTANCE.getValue()) {
            AbstractSequentialList abstractSequentialList = (AbstractSequentialList) c68322mC.element;
            GiftLeafRootViewModel LJJIJLIJ2 = LJJIJLIJ();
            if (LJJIJLIJ2 != null && (dataChannel2 = LJJIJLIJ2.LJLIL) != null && (l = (Long) dataChannel2.kv0(BCN.class)) != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            GiftLeafRootViewModel LJJIJLIJ3 = LJJIJLIJ();
            if (LJJIJLIJ3 != null && (dataChannel = LJJIJLIJ3.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
            }
            String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(j2);
            if (LIZJ == null) {
                LIZJ = "";
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = abstractSequentialList.iterator();
            while (it2.hasNext()) {
                AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) it2.next();
                if (abstractC32698CsQ2 != null) {
                    j3 = abstractC32698CsQ2.LIZJ();
                } else {
                    j3 = 0;
                }
                Gift findGiftById = GiftManager.inst().findGiftById(j3);
                if (findGiftById == null || (str = findGiftById.recommendInfo) == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gift_id", j3);
                jSONObject.put("recommend_info", str);
                jSONArray.put(jSONObject);
            }
            C1EW.LIZ(((GiftRetrofitApi) Q7L.LIZIZ(GiftRetrofitApi.class)).sendGiftListAck(j, LIZJ, jSONArray.toString())).LJJJLIIL(new AfS57S0100000_5(this, 1), new AfS57S0100000_5(this, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r11 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(long r32) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJIII(long):void");
    }

    public final boolean LJJIIJ(long j) {
        long j2;
        C32470Cok c32470Cok;
        FreqLimitGiftOption freqLimitOption;
        int i;
        DataChannel dataChannel;
        Room room;
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        HashMap<Long, C32470Cok> hashMap = GiftManager.inst().freqLimitInfoList;
        if (hashMap == null || (c32470Cok = hashMap.get(Long.valueOf(j))) == null || (freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(j))) == null) {
            return false;
        }
        if (!c32470Cok.LIZIZ) {
            i = c32470Cok.LIZ;
        } else {
            Integer num = (Integer) ((LinkedHashMap) c32470Cok.LIZJ).get(Long.valueOf(j2));
            if (num != null) {
                i = num.intValue();
            } else {
                i = c32470Cok.LIZ;
            }
        }
        if (i > 0 || freqLimitOption.refreshTimeStamp <= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[LOOP:0: B:12:0x001d->B:55:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[EDGE_INSN: B:56:0x00c3->B:60:0x00c3 BREAK  A[LOOP:0: B:12:0x001d->B:55:0x00ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJL(java.lang.Long r15) {
        /*
            r14 = this;
            X.CHd r0 = r14.LJLZ
            r13 = 0
            if (r0 == 0) goto Lc0
            X.0A2 r8 = r0.getLayoutManager()
        L9:
            boolean r0 = r8 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto Lbd
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
        Lf:
            r12 = 0
            if (r8 == 0) goto Lb9
            int r7 = r8.LLILL()
            int r6 = r8.LLILLJJLI()
        L1a:
            if (r7 > r6) goto Lc3
            r11 = 0
        L1d:
            if (r8 == 0) goto Lb4
            android.view.View r3 = r8.LJJIJIL(r7)
            if (r3 == 0) goto Lb5
            int r2 = r3.getBottom()
            int r0 = r3.getTop()
        L2d:
            int r2 = r2 - r0
            if (r3 == 0) goto Lb2
            int r0 = r3.getTop()
        L34:
            double r0 = (double) r0
            double r4 = (double) r2
            r9 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r9 = r9 * r4
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto Lac
            if (r3 == 0) goto La8
            int r0 = r3.getBottom()
        L43:
            double r2 = (double) r0
            X.CHd r0 = r14.LJLZ
            if (r0 == 0) goto L9d
            int r0 = r0.getHeight()
        L4c:
            double r0 = (double) r0
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r9
            double r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lac
            int r11 = r11 + 1
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel r0 = r14.LJJIJIL()
            if (r0 == 0) goto L9b
            androidx.lifecycle.MutableLiveData<java.util.LinkedList<X.CsQ<? extends X.CAq>>> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            if (r0 == 0) goto L9b
            int r0 = r0.size()
        L6d:
            if (r7 >= r0) goto Lac
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel r0 = r14.LJJIJIL()
            if (r0 == 0) goto L99
            androidx.lifecycle.MutableLiveData<java.util.LinkedList<X.CsQ<? extends X.CAq>>> r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L99
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            if (r0 == 0) goto L99
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r7, r0)
            X.CsQ r0 = (X.AbstractC32698CsQ) r0
            if (r0 == 0) goto L99
            long r0 = r0.LIZJ()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L91:
            r1 = r15
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto Lac
            return r11
        L99:
            r0 = r13
            goto L91
        L9b:
            r0 = 0
            goto L6d
        L9d:
            android.content.Context r1 = r14.LJLIL
            r0 = 1133740032(0x43938000, float:295.0)
            float r0 = X.B9K.LIZ(r1, r0)
            int r0 = (int) r0
            goto L4c
        La8:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L43
        Lac:
            if (r7 == r6) goto Lc3
            int r7 = r7 + 1
            goto L1d
        Lb2:
            r0 = 0
            goto L34
        Lb4:
            r3 = r13
        Lb5:
            r2 = 0
            r0 = 0
            goto L2d
        Lb9:
            r7 = 0
            r6 = 0
            goto L1a
        Lbd:
            r8 = r13
            goto Lf
        Lc0:
            r8 = r13
            goto L9
        Lc3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJIJL(java.lang.Long):int");
    }

    public final AbstractC32698CsQ<? extends C30896CAq> LJJIL(Long l) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        Long l2;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            while (it.hasNext()) {
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null) {
                    l2 = Long.valueOf(next.LIZJ());
                } else {
                    l2 = null;
                }
                if (o.LJ(l2, l)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final void LJJJJJL(long j) {
        Boolean bool;
        boolean z;
        int i;
        String str;
        C76854UEg c76854UEg;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        String str2;
        Long valueOf = Long.valueOf(j);
        HashMap<Long, Boolean> hashMap = C32694CsM.LJJIIZ;
        if (hashMap.containsKey(valueOf)) {
            bool = hashMap.get(Long.valueOf(j));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        } else {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        C32694CsM.LJJIJ++;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            while (it.hasNext()) {
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next instanceof C32774Cte) {
                    next.getClass();
                    if (-1000 == LJJJI()) {
                        if (C88133YiP.LIZ.LIZ) {
                            str2 = "call";
                        } else {
                            str2 = "click";
                        }
                        C32696CsO.LIZ(str2);
                        return;
                    }
                }
            }
        }
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        if (!c32785Ctp.LJIIIZ) {
            boolean z2 = C88133YiP.LIZ.LIZ;
            long LJJJI = LJJJI();
            boolean LJIILLIIL = C15380j0.LJIILLIIL();
            int LJJIJIIJIL = LJJIJIIJIL();
            String tabName = GiftManager.inst().getTabName(LJJIJIIJIL());
            int LJJIJL = LJJIJL(Long.valueOf(LJJJI()));
            Gift findGiftById = GiftManager.inst().findGiftById(j);
            if (findGiftById != null) {
                i = findGiftById.diamondCount;
            } else {
                i = 0;
            }
            Integer valueOf2 = Integer.valueOf(i);
            Long valueOf3 = Long.valueOf(this.LLILIL);
            Gift findGiftById2 = GiftManager.inst().findGiftById(j);
            if (findGiftById2 == null || (str = findGiftById2.recommendInfo) == null) {
                str = "";
            }
            boolean LJFF = LJFF();
            List<Long> list = this.LLI;
            java.util.Map<Long, C32830CuY> map = this.LLIFFJFJJ;
            PostRechargeRetentionViewModel LJJIZ = LJJIZ();
            if (LJJIZ != null) {
                c76854UEg = LJJIZ.gv0();
            } else {
                c76854UEg = null;
            }
            z = false;
            c32785Ctp.LJIILIIL(z2, LJJJI, LJIILLIIL, LJJIJIIJIL, tabName, LJJIJL, valueOf2, valueOf3, str, LJFF, list, map, booleanValue, c76854UEg);
        } else {
            z = false;
        }
        c32785Ctp.LJIIIZ = z;
        if (j == AbstractC32320CmK.LIZ.LJII()) {
            C32456CoW.LIZIZ(C88133YiP.LIZ.LIZ);
        }
        C32129CjF.LIZ.LJIIJJI = C30725C4b.LIZ();
    }

    public final void LJJJJLI(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        C32506CpK<AbstractC32523Cpb> c32506CpK;
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (c32506CpK = LJJIJLIJ.LJLJJI) != null) {
            c32506CpK.LIZ(new C32516CpU(abstractC32698CsQ));
        }
    }

    public final void LJJJJZ(int i) {
        int i2;
        Integer num;
        MutableLiveData<List<C32713Csf>> mutableLiveData;
        List<C32713Csf> value;
        C32713Csf c32713Csf;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        MutableLiveData<List<C32713Csf>> mutableLiveData2;
        List<C32713Csf> value2;
        C32713Csf c32713Csf2;
        List<Long> list;
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData3;
        List<AbstractC32698CsQ<? extends C30896CAq>> value3;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData4;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData5;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value4;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData6;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList2;
        MutableLiveData<List<C32713Csf>> mutableLiveData7;
        List<C32713Csf> value5;
        C32713Csf c32713Csf3;
        MutableLiveData<List<C32713Csf>> mutableLiveData8;
        List<C32713Csf> value6;
        if (C32696CsO.LIZIZ && this.LLIILZL) {
            C32444CoK.LIZ("GiftPanelSwipe", "Delaying gift tab change");
            return;
        }
        LJJIFFI();
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData8 = LJJIJIL.LJLJI) != null && (value6 = mutableLiveData8.getValue()) != null) {
            Iterator<C32713Csf> it = value6.iterator();
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().LIZ == i) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
        } else {
            i2 = 0;
        }
        GiftPanelLeafViewModel LJJIJIL2 = LJJIJIL();
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList3 = null;
        if (LJJIJIL2 != null && (mutableLiveData6 = LJJIJIL2.LJLILLLLZI) != null) {
            GiftPanelLeafViewModel LJJIJIL3 = LJJIJIL();
            if (LJJIJIL3 != null && (mutableLiveData7 = LJJIJIL3.LJLJI) != null && (value5 = mutableLiveData7.getValue()) != null && (c32713Csf3 = (C32713Csf) ListProtector.get(value5, i2)) != null) {
                linkedList2 = c32713Csf3.LIZJ;
            } else {
                linkedList2 = null;
            }
            mutableLiveData6.setValue(linkedList2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setting intended position: ");
        LIZ.append(i2);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Setting active Panel list, size: ");
        GiftPanelLeafViewModel LJJIJIL4 = LJJIJIL();
        if (LJJIJIL4 != null && (mutableLiveData5 = LJJIJIL4.LJLILLLLZI) != null && (value4 = mutableLiveData5.getValue()) != null) {
            num = Integer.valueOf(value4.size());
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(", tab: ");
        LIZ2.append(i);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ2));
        LJJJZ(i2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Setting active recyclerView: ");
        LIZ3.append(this.LJLZ);
        LIZ3.append(", tab: ");
        LIZ3.append(this.LJZ);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ3));
        GiftPanelLeafViewModel LJJIJIL5 = LJJIJIL();
        if (LJJIJIL5 != null && (mutableLiveData4 = LJJIJIL5.LJLILLLLZI) != null) {
            linkedList3 = mutableLiveData4.getValue();
        }
        LJJJLIIL(i, linkedList3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("tab change to: ");
        LIZ4.append(LJJIJIIJI());
        LIZ4.append(", position: ");
        LIZ4.append(i2);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ4));
        if (LJJIJIIJI() == 16) {
            BagListViewModel LJJIJ = LJJIJ();
            if (LJJIJ != null && (mutableLiveData3 = LJJIJ.LJLILLLLZI) != null && (value3 = mutableLiveData3.getValue()) != null) {
                LJJLIIIJJI(value3);
                C32661Crp.LJFF(value3);
                for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ : value3) {
                    BZI LIZ5 = C28787BRn.LIZ("livesdk_backpack_match_item_show");
                    LIZ5.LJIIZILJ();
                    C32661Crp.LIZJ(LIZ5);
                    C32661Crp.LIZIZ(LIZ5, abstractC32698CsQ);
                    LIZ5.LJJIIJZLJL();
                }
            }
            this.LLI = C61878OQg.INSTANCE;
            C71892SJk c71892SJk = this.LLFZ;
            if (c71892SJk == null) {
                return;
            }
            c71892SJk.LJLJI = 0;
            RecyclerView recyclerView = c71892SJk.LJLIL;
            if (recyclerView == null) {
                return;
            }
            recyclerView.LJJJJZI();
            return;
        }
        if (C32696CsO.LIZJ() || LJJIJIIJI() == 15) {
            this.LLI = C61878OQg.INSTANCE;
            C71892SJk c71892SJk2 = this.LLFZ;
            if (c71892SJk2 != null) {
                c71892SJk2.LJLJI = 0;
                RecyclerView recyclerView2 = c71892SJk2.LJLIL;
                if (recyclerView2 != null) {
                    recyclerView2.LJJJJZI();
                }
            }
        } else {
            GiftPanelLeafViewModel LJJIJIL6 = LJJIJIL();
            if (LJJIJIL6 != null && (mutableLiveData2 = LJJIJIL6.LJLJI) != null && (value2 = mutableLiveData2.getValue()) != null && (c32713Csf2 = (C32713Csf) ORZ.LJLLLLLL(i2, value2)) != null && (list = c32713Csf2.LIZLLL) != null) {
                this.LLI = list;
            }
            int size = this.LLI.size();
            C71892SJk c71892SJk3 = this.LLFZ;
            if (c71892SJk3 != null) {
                c71892SJk3.LJLJI = size;
                RecyclerView recyclerView3 = c71892SJk3.LJLIL;
                if (recyclerView3 != null) {
                    recyclerView3.LJJJJZI();
                }
            }
        }
        GiftPanelLeafViewModel LJJIJIL7 = LJJIJIL();
        if (LJJIJIL7 != null && (mutableLiveData = LJJIJIL7.LJLJI) != null && (value = mutableLiveData.getValue()) != null && (c32713Csf = (C32713Csf) ListProtector.get(value, i2)) != null && (linkedList = c32713Csf.LIZJ) != null) {
            LJJII(linkedList);
        }
    }

    public final void LJJJLZIJ(long j) {
        C0A2 c0a2;
        GridLayoutManager gridLayoutManager;
        if (C31160CKu.LIZLLL()) {
            GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
            if (LJJIJIL != null) {
                RunnableC31065CHd runnableC31065CHd = this.LJLZ;
                if (runnableC31065CHd != null) {
                    c0a2 = runnableC31065CHd.getLayoutManager();
                } else {
                    c0a2 = null;
                }
                if (c0a2 instanceof GridLayoutManager) {
                    gridLayoutManager = (GridLayoutManager) c0a2;
                } else {
                    gridLayoutManager = null;
                }
                if (runnableC31065CHd != null && gridLayoutManager != null) {
                    XKX.LIZLLL(LifecycleKt.getCoroutineScope(getLifecycle()), C78613UtF.LIZ.plus(this.LLJL), null, new C32688CsG(LJJIJIL, runnableC31065CHd, gridLayoutManager, this, j, null), 2);
                    return;
                }
                return;
            }
            return;
        }
        ORS.LJJLIL(C32758CtO.LJLIL, this.LLII);
        ORS.LJJLIL(C32759CtP.LJLIL, this.LLIIII);
        LJJJJL();
        LJJJLL();
        LJJJJJL(j);
    }

    public final void LJJJZ(int i) {
        AbstractC029409q abstractC029409q;
        AbstractC029409q abstractC029409q2;
        Object obj;
        C0CM c0cm = this.LJZI;
        C71892SJk c71892SJk = null;
        if (c0cm != null) {
            abstractC029409q = c0cm.getAdapter();
        } else {
            abstractC029409q = null;
        }
        o.LJII(abstractC029409q, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.adapter.LiveGiftPanelPageAdapter");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) ListProtector.get(((C32691CsJ) abstractC029409q).LJLJL, i);
        this.LJLZ = runnableC31065CHd;
        if (runnableC31065CHd != null) {
            abstractC029409q2 = runnableC31065CHd.getAdapter();
        } else {
            abstractC029409q2 = null;
        }
        this.LJZ = (C32681Cs9) abstractC029409q2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activeRecyclerView ");
        LIZ.append(this.LJZ);
        C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ));
        RunnableC31065CHd runnableC31065CHd2 = this.LJLZ;
        if (runnableC31065CHd2 != null) {
            obj = runnableC31065CHd2.LJJJJZ(0);
        } else {
            obj = null;
        }
        if (obj instanceof C71892SJk) {
            c71892SJk = (C71892SJk) obj;
        }
        this.LLFZ = c71892SJk;
    }

    public final void LJJLI(int i) {
        MutableLiveData<Integer> mutableLiveData;
        BagListViewModel LJJIJ;
        MutableLiveData<Boolean> mutableLiveData2;
        C32129CjF.LIZ.LJIIIIZZ = i;
        if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled() && i == 16 && (LJJIJ = LJJIJ()) != null && (mutableLiveData2 = LJJIJ.LJLJL) != null) {
            mutableLiveData2.setValue(Boolean.TRUE);
        }
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJI) == null) {
            return;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
    }

    public final void LJJLIIIIJ(int i) {
        MutableLiveData<Integer> mutableLiveData;
        C32129CjF.LIZ.LJFF = i;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(Integer.valueOf(i));
    }

    public final void LJJLIIIJ(String str) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        int i = 0;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = null;
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null) {
                    if (next.LIZJ() == LJJJI()) {
                        i = i2;
                        abstractC32698CsQ = next;
                        if (next == null) {
                        }
                    }
                    next.LJII = str;
                }
                i2 = i3;
            }
        }
        LJJIFFI();
        C32681Cs9 c32681Cs9 = this.LJZ;
        if (c32681Cs9 != null) {
            c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
        }
    }

    public final void LJJLIIIJILLIZJL(long j) {
        MutableLiveData<Long> mutableLiveData;
        GiftPanelLeafViewModel LJJIJIL = LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJJLL) == null) {
            return;
        }
        mutableLiveData.setValue(Long.valueOf(j));
    }

    public final void LJJLIIIJJI(List<? extends AbstractC32698CsQ<? extends C30896CAq>> list) {
        MutableLiveData<Boolean> mutableLiveData;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData2;
        BagListViewModel LJJIJ = LJJIJ();
        if (LJJIJ != null && (mutableLiveData = LJJIJ.LJLJL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends AbstractC32698CsQ<? extends C30896CAq>> it = list.iterator();
            while (true) {
                abstractC32698CsQ = null;
                Boolean bool = null;
                abstractC32698CsQ = null;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null) {
                    bool = Boolean.valueOf(next.LIZJ);
                }
                arrayList.add(bool);
            }
            C32681Cs9 c32681Cs9 = this.LJZ;
            if (c32681Cs9 != null) {
                LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList = new LinkedList<>();
                linkedList.addAll(list);
                c32681Cs9.LJLZ(linkedList);
            }
            if (list.isEmpty()) {
                C32444CoK.LIZ("GiftPanelSwipe", "match items empty");
                LJJIIZ();
            } else {
                View view = this.LLFF;
                if (view != null) {
                    view.setVisibility(8);
                }
                C32733Csz c32733Csz = this.LLFII;
                if (c32733Csz != null) {
                    c32733Csz.setVisibility(8);
                }
                CVT cvt = this.LLD;
                if (cvt != null) {
                    cvt.setVisibility(8);
                }
            }
            RunnableC31065CHd runnableC31065CHd = this.LJLZ;
            if (runnableC31065CHd != null) {
                runnableC31065CHd.postDelayed(new ARunnableS41S0100000_5(this, 1), 40L);
            }
            BagListViewModel LJJIJ2 = LJJIJ();
            if (LJJIJ2 != null && (mutableLiveData2 = LJJIJ2.LJLJI) != null) {
                abstractC32698CsQ = mutableLiveData2.getValue();
            }
            LJJJJLI(abstractC32698CsQ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x037c, code lost:
    
        if (r10.contains(java.lang.Double.valueOf(r9.id)) == true) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ(java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r20) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJLIIIJJIZ(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(long r42) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJLIIIJL(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJJJJI(long j, LinkedList linkedList) {
        if (linkedList == null) {
            return -1;
        }
        Iterator it = ORZ.LLJJI(linkedList).iterator();
        while (true) {
            C199797sl c199797sl = (C199797sl) it;
            if (!c199797sl.hasNext()) {
                return -1;
            }
            C2058786d c2058786d = (C2058786d) c199797sl.next();
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) c2058786d.LIZIZ;
            if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ() == j) {
                return c2058786d.LIZ;
            }
        }
    }

    public static void LJJJLIIL(int i, LinkedList linkedList) {
        T t;
        GiftLockInfo giftLockInfo;
        java.util.Set<Long> set;
        new HashMap().put(Integer.valueOf(i), new HashMap());
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) next;
                    if (abstractC32698CsQ != null && (t = abstractC32698CsQ.LIZIZ) != 0 && (t instanceof Gift) && (giftLockInfo = ((Gift) t).giftSubInfo) != null && giftLockInfo.mLockType == 2 && !giftLockInfo.mLock && (set = GiftManager.inst().lockedGiftsMap.get(Integer.valueOf(i))) != null && set.contains(Long.valueOf(abstractC32698CsQ.LIZJ()))) {
                        abstractC32698CsQ.LJIIIZ = true;
                        abstractC32698CsQ.LJIIJ = i3;
                        i3++;
                    }
                    i2 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIIZILJ(long j, boolean z) {
        GiftPanelLeafViewModel LJJIJIL;
        if (C88137YiT.LIZ.LIZ && (LJJIJIL = LJJIJIL()) != null && !LJJIJIL.LJLLL) {
            if (z) {
                C32694CsM.LJJII++;
            } else {
                C32694CsM.LJJIFFI++;
            }
        }
        C32694CsM.LJJIIJ++;
        C32694CsM.LJJIIJZLJL.put(Long.valueOf(j), Boolean.valueOf(z));
        int i = C32694CsM.LJJIIJ;
        int i2 = C32694CsM.LJJI;
        if (i == i2 && i2 != 0) {
            C32694CsM.LJJIJL = SystemClock.uptimeMillis();
        }
    }

    public final void LJJIIZI(String requestHash, AbstractC32474Coo abstractC32474Coo) {
        DataChannel dataChannel;
        Room room;
        o.LJIIIZ(requestHash, "requestHash");
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && room.getId() != 0) {
            GiftManager.inst().giftRepository.LIZ(3, room.getId(), abstractC32474Coo, requestHash, this.LLILII);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJJ(java.util.LinkedList<X.AbstractC32698CsQ<? extends X.C30896CAq>> r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJJ(java.util.LinkedList, boolean):long");
    }

    public final void LJJJJ(Gift gift, EnumC32491Cp5 enumC32491Cp5) {
        DataChannel dataChannel;
        C32488Cp2 c32488Cp2 = new C32488Cp2(gift, this.LJLLLL, null, this.LLILLJJLI, enumC32491Cp5);
        GiftLeafRootViewModel LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null && (dataChannel = LJJIJLIJ.LJLIL) != null) {
            dataChannel.qv0(BoxGiftPageEvent.class, c32488Cp2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(int r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJJJJJ(int, java.util.List):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJI(int i, long j, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        boolean z;
        C0A2 layoutManager;
        C77557UcD c77557UcD;
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue() && !abstractC32698CsQ.LIZLLL && (c77557UcD = this.LLFFF) != null) {
            T2J.LJII(c77557UcD, true);
        }
        LJJL();
        if (LJJJI() == j && LJJIJIIJIL() == LJJIJIIJI()) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC32698CsQ.LJIIIIZZ() && abstractC32698CsQ.LIZJ) {
            return;
        }
        C32694CsM.LJJIJIIJI = SystemClock.uptimeMillis();
        C32679Cs7 c32679Cs7 = new C32679Cs7(this, abstractC32698CsQ, i, z, j, this.LJLIL);
        c32679Cs7.LIZ = i;
        RunnableC31065CHd runnableC31065CHd = this.LJLZ;
        if (runnableC31065CHd != null && (layoutManager = runnableC31065CHd.getLayoutManager()) != null) {
            layoutManager.LLIIIILZ(c32679Cs7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r9 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023e  */
    @Override // com.bytedance.android.livesdk.ui.framework.DialogLeaf, X.AbstractC32579CqV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<android.view.View, X.C018905p> LJIJJLI(android.content.Context r11, android.view.ViewGroup r12, android.view.LayoutInflater r13) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32676Cs4.LJIJJLI(android.content.Context, android.view.ViewGroup, android.view.LayoutInflater):X.OSZ");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC32719Csl
    public final void LJIIIZ(long j, float f, float f2, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C77557UcD c77557UcD = this.LLFFF;
        if (c77557UcD != null) {
            T2J.LJIIIIZZ(c77557UcD, j, f, f2, i, false, new C32752CtI(j, this), interfaceC65784Pro);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showCombo ");
        LIZ.append(this.LLFFF);
        C32444CoK.LIZLLL("GiftPanelCombo", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}

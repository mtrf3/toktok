package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape;

import X.AMD;
import X.AML;
import X.AbstractC019505v;
import X.AbstractC26082ALm;
import X.AbstractC32320CmK;
import X.AbstractC32474Coo;
import X.BCW;
import X.BY6;
import X.BZI;
import X.C09650Zl;
import X.C157166Eu;
import X.C16880lQ;
import X.C1EW;
import X.C28507BGt;
import X.C28787BRn;
import X.C29927Bop;
import X.C30326BvG;
import X.C30725C4b;
import X.C32104Ciq;
import X.C32129CjF;
import X.C32136CjM;
import X.C32673Cs1;
import X.C32694CsM;
import X.C32733Csz;
import X.C32772Ctc;
import X.C32778Cti;
import X.C32781Ctl;
import X.C32785Ctp;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C76907UGh;
import X.C77283UUt;
import X.C77348UXg;
import X.C77446UaQ;
import X.C79359VCp;
import X.C88133YiP;
import X.C88137YiT;
import X.C89524ZBo;
import X.CGY;
import X.CVT;
import X.EnumC29511Bi7;
import X.EnumC29609Bjh;
import X.EnumC31509CYf;
import X.EnumC35487DwJ;
import X.InterfaceC151715xP;
import X.InterfaceC29882Bo6;
import X.InterfaceC30442Bx8;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.Q7L;
import X.T4Y;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.AfS57S0100000_5;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowPrivilegeCenterEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftGuestInfoWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.level.PrivilegeCenterEntranceCacheSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicGiftDialogSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLandScapeGiftDialog extends LiveDialogFragment implements InterfaceC151715xP, AMD<ViewModelProvider.AndroidViewModelFactory> {
    public static final /* synthetic */ int LLF = 0;
    public List<GiftPage> LJLIL;
    public Room LJLILLLLZI;
    public boolean LJLJI;
    public LiveNewGiftPanelWidget LJLJJI;
    public EnumC35487DwJ LJLJJL;
    public C32136CjM LJLJJLL;
    public GiftPrivilegeCenterViewModel LJLJL;
    public LiveNewGiftBottomWidget LJLJLJ;
    public C79359VCp LJLJLLL;
    public C32104Ciq LJLL;
    public View LJLLI;
    public long LJLLILLLL;
    public Runnable LJLLL;
    public C32673Cs1 LJZ;
    public CVT LJZI;
    public View LJZL;
    public C32733Csz LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public String LJLLJ = "";
    public final List<GiftPage> LJLLLL = new ArrayList();
    public final C73318Sq2 LJLLLLLL = new C73318Sq2();
    public final WidgetCreateTimeUtil LJLZ = new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        int i2;
        int i3;
        DataChannel dataChannel = this.dataChannel;
        boolean z = true;
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.kv0(BCW.class);
            if (bool != null) {
                z = bool.booleanValue();
            }
            C32104Ciq c32104Ciq = this.LJLL;
            if (c32104Ciq != null) {
                c32104Ciq.LJLILLLLZI = dataChannel;
                IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
                c32104Ciq.LJLIL = iMessageManager;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.GIFT_UPDATE.getIntType(), c32104Ciq);
                }
            }
            if (!z) {
                i = R.layout.cxi;
                i2 = R.style.abq;
                i3 = 5;
                C28507BGt c28507BGt = new C28507BGt(i);
                c28507BGt.LIZJ = i2;
                c28507BGt.LJIILIIL = 48;
                c28507BGt.LJII = i3;
                return c28507BGt;
            }
        }
        i = R.layout.cxh;
        i2 = R.style.abp;
        i3 = 80;
        C28507BGt c28507BGt2 = new C28507BGt(i);
        c28507BGt2.LIZJ = i2;
        c28507BGt2.LJIILIIL = 48;
        c28507BGt2.LJII = i3;
        return c28507BGt2;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        this.LJLLLLLL.LIZLLL();
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        return new BY6(R.layout.cxi);
    }

    @Override // X.AMD
    public final ViewModelProvider.AndroidViewModelFactory getViewModelFactory() {
        Context context;
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
        Context context2 = getContext();
        if (context2 != null) {
            context = C16880lQ.LLLLL(context2);
        } else {
            context = null;
        }
        o.LJII(context, "null cannot be cast to non-null type android.app.Application");
        return companion.getInstance((Application) context);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        MutableLiveData<Integer> mutableLiveData;
        IMessageManager iMessageManager;
        super.onDestroy();
        C32781Ctl.LIZ.LIZLLL();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C32136CjM c32136CjM = this.LJLJJLL;
        if (c32136CjM == null || c32136CjM.LIZJ == null || c32136CjM.LIZLLL == null || c32136CjM.LJ == null) {
            return;
        }
        C32104Ciq c32104Ciq = this.LJLL;
        if (c32104Ciq != null && (iMessageManager = c32104Ciq.LJLIL) != null) {
            iMessageManager.removeMessageListener(c32104Ciq);
        }
        this.LJLZ.send();
        C32136CjM c32136CjM2 = this.LJLJJLL;
        if (c32136CjM2 != null) {
            c32136CjM2.LIZJ.removeObservers(this);
            c32136CjM2.LIZLLL.removeObservers(this);
            c32136CjM2.LJ.removeObservers(this);
        }
        C32136CjM c32136CjM3 = this.LJLJJLL;
        if (c32136CjM3 != null && (mutableLiveData = c32136CjM3.LIZIZ) != null) {
            num = mutableLiveData.getValue();
        } else {
            num = null;
        }
        int size = ((ArrayList) this.LJLLLL).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = ((GiftPage) ListProtector.get(this.LJLLLL, i)).pageType;
            if (num == null || i2 != num.intValue()) {
                i++;
            } else {
                C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                GiftPage giftPage = (GiftPage) ListProtector.get(this.LJLLLL, i);
                c32785Ctp.getClass();
                o.LJIIIZ(giftPage, "giftPage");
                BZI LIZ = C28787BRn.LIZ("tab_leave");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
                LIZ.LJIJJ(giftPage.pageName, "live");
                LIZ.LJIJJ(Integer.valueOf(i + 1), "tab_position");
                LIZ.LJIJJ(Long.valueOf((C30725C4b.LIZ() - c32785Ctp.LJFF) / 1000), "stay_duration");
                LIZ.LJJIIJZLJL();
                break;
            }
        }
        C32129CjF.LIZ.LJIILLIIL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LJLJJI;
        if (liveNewGiftPanelWidget == null) {
            return;
        }
        liveNewGiftPanelWidget.LLIFFJFJJ = SystemClock.uptimeMillis() - this.LJLLILLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (X.C15410j3.LIZJ(getContext()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r4 = false;
     */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r5 = this;
            super.onStart()
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 != 0) goto L23
        L7:
            android.app.Dialog r0 = r5.getDialog()
            if (r0 == 0) goto L22
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L22
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L22
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r5)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r5)
            X.C10A.LIZIZ(r0, r5)
        L22:
            return
        L23:
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = 1
            if (r0 == 0) goto Lc3
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto Lc1
        L34:
            boolean r0 = r5.LJLJI
            if (r0 != 0) goto L42
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.C15410j3.LIZJ(r0)
            if (r0 == 0) goto Lc1
        L42:
            android.app.Dialog r0 = r5.getDialog()
            if (r0 == 0) goto L8d
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L8d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setNavigationBarColor(r0)
            r1 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L6a
            boolean r0 = r5.LJLJI
            if (r0 != 0) goto Lbd
            android.content.Context r0 = r2.getContext()
            boolean r0 = X.C15410j3.LIZJ(r0)
            if (r0 != 0) goto Lbd
        L6a:
            r2.addFlags(r1)
        L6d:
            r1 = -1
            if (r4 == 0) goto Lac
            r0 = -2
            r2.setLayout(r1, r0)
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            int r0 = X.C15380j0.LJIIL()
            r1.width = r0
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            int r1 = X.C15380j0.LJIIJJI()
            int r0 = X.C15380j0.LJIILIIL()
            int r1 = r1 - r0
            r2.height = r1
        L8d:
            java.lang.Runnable r3 = r5.LJLLL
            if (r3 == 0) goto L9f
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r2.<init>(r0)
            r0 = 10
            r2.postDelayed(r3, r0)
        L9f:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            if (r2 == 0) goto L7
            java.lang.Class<com.bytedance.android.live.gift.GiftDialogVisibilityChannel> r1 = com.bytedance.android.live.gift.GiftDialogVisibilityChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.rv0(r1, r0)
            goto L7
        Lac:
            if (r3 == 0) goto Lb2
            r2.setLayout(r1, r1)
            goto L8d
        Lb2:
            r0 = 2131166644(0x7f0705b4, float:1.794754E38)
            int r0 = X.C15380j0.LJFF(r0)
            r2.setLayout(r0, r1)
            goto L8d
        Lbd:
            r2.clearFlags(r1)
            goto L6d
        Lc1:
            r4 = 0
            goto L42
        Lc3:
            r3 = 1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveLandScapeGiftDialog.onStart():void");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(GiftDialogVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_GIFT;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        super.onCreate(bundle);
        C32694CsM.LJII = SystemClock.uptimeMillis();
        C88137YiT.LIZ.LIZ = true;
        AbstractC32320CmK.LIZ.LJFF = this.LJLLJ;
        this.LJLLILLLL = SystemClock.uptimeMillis();
        CGY.LIZ();
        C88133YiP.LIZ.LIZ = true;
        C32129CjF.LIZ.LJIILLIIL = true;
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel = (GiftPrivilegeCenterViewModel) ViewModelProviders.of(this).get(GiftPrivilegeCenterViewModel.class);
        this.LJLJL = giftPrivilegeCenterViewModel;
        if (giftPrivilegeCenterViewModel != null && (mutableLiveData = giftPrivilegeCenterViewModel.LJLIL) != null) {
            mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 24));
        }
    }

    public final void wl(boolean z) {
        if (z) {
            View view = this.LJLLI;
            if (view != null) {
                view.setVisibility(0);
            }
            C62814Ol0.LJJIII(this.LJLILLLLZI, this.dataChannel, "show", "gift_panel");
        } else {
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        View view3 = this.LJLLI;
        if (view3 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 154), view3);
        }
    }

    public final void xl(List<? extends GiftPage> list) {
        List<GiftPage> list2;
        C32136CjM c32136CjM;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        ((ArrayList) this.LJLLLL).clear();
        boolean z = false;
        for (GiftPage giftPage : list) {
            C32136CjM c32136CjM2 = this.LJLJJLL;
            if (c32136CjM2 != null && (mutableLiveData2 = c32136CjM2.LIZIZ) != null) {
                Integer value = mutableLiveData2.getValue();
                int i = giftPage.pageType;
                if (value != null && value.intValue() == i) {
                    z = true;
                }
            }
            ((ArrayList) this.LJLLLL).add(giftPage);
        }
        if (!z && (c32136CjM = this.LJLJJLL) != null && (mutableLiveData = c32136CjM.LIZIZ) != null) {
            mutableLiveData.setValue(1);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LJLJJI;
        if (liveNewGiftPanelWidget != null && (list2 = this.LJLLLL) != null) {
            ArrayList arrayList = (ArrayList) list2;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(5);
                Gson gson = C09650Zl.LIZJ;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, it.next()), GiftPage.class));
                }
                liveNewGiftPanelWidget.LJLJLJ.clear();
                liveNewGiftPanelWidget.LJLJLJ.addAll(arrayList2);
                Iterator<GiftPage> it2 = liveNewGiftPanelWidget.LJLJLJ.iterator();
                while (it2.hasNext()) {
                    GiftPage next = it2.next();
                    if (liveNewGiftPanelWidget.LJLJL == EnumC35487DwJ.GUEST) {
                        GiftManager.filterInteractNotSupportGift(next.gifts, liveNewGiftPanelWidget.LJLJJLL);
                    } else {
                        GiftManager.filterNotSupportGift(next.gifts, liveNewGiftPanelWidget.LJLJJLL);
                    }
                    GiftManager.filterNotDisplayedOnPanel(next.gifts);
                    GiftManager.filterFirstRechargeGift(next.gifts);
                    Iterator<Gift> it3 = next.gifts.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().isRandomGift) {
                            it3.remove();
                        }
                    }
                }
                if (!liveNewGiftPanelWidget.LJZI) {
                    liveNewGiftPanelWidget.LJZI = true;
                    liveNewGiftPanelWidget.LJZ(1, arrayList2);
                }
            }
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.LJLJLJ;
        if (liveNewGiftBottomWidget != null) {
            liveNewGiftBottomWidget.LJLJLLL = this.LJLLLL;
            liveNewGiftBottomWidget.LJLZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<C89524ZBo> mutableLiveData2;
        MutableLiveData<C77348UXg> mutableLiveData3;
        boolean z;
        Long l;
        View view2;
        Long l2;
        View findViewById;
        ViewGroup viewGroup;
        MutableLiveData<Long> mutableLiveData4;
        Boolean bool;
        boolean z2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str = C77283UUt.LIZIZ;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C77283UUt.LIZ = str;
        DataChannel dataChannel = this.dataChannel;
        boolean z3 = false;
        if (dataChannel != null) {
            this.LJLILLLLZI = (Room) dataChannel.kv0(RoomChannel.class);
            Boolean bool2 = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            this.LJLJI = z2;
        }
        View view3 = getView();
        if (view3 != null) {
            View findViewById2 = view3.findViewById(R.id.gza);
            View findViewById3 = view3.findViewById(R.id.du1);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.gift_panel_error_view)");
            this.LL = (C32733Csz) findViewById3;
            View findViewById4 = view3.findViewById(R.id.du9);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.gift_panel_loading_view)");
            this.LJZI = (CVT) findViewById4;
            View findViewById5 = view3.findViewById(R.id.cvf);
            o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.empty_list)");
            this.LJZL = findViewById5;
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 344), findViewById2);
            if (GameLinkMicGiftDialogSetting.INSTANCE.isBlockBarrier()) {
                ((AbstractC019505v) view3.findViewById(R.id.ah5)).setReferencedIds(new int[]{R.id.e21, R.id.g7a});
            } else {
                ((AbstractC019505v) view3.findViewById(R.id.ah5)).setReferencedIds(new int[]{R.id.e21, R.id.g7a, R.id.lem});
            }
        }
        View view4 = getView();
        if (view4 != null && getContext() != null && this.dataChannel != null) {
            C32694CsM.LJIIIIZZ = SystemClock.uptimeMillis();
            C32694CsM.LJIIIZ = SystemClock.uptimeMillis();
            WidgetManager of = WidgetManager.of(this, view4, C30326BvG.LIZ);
            of.mWidgetCreateTimeListener = this.LJLZ;
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = new LiveNewGiftPanelWidget();
            C32136CjM c32136CjM = this.LJLJJLL;
            liveNewGiftPanelWidget.LJLL = c32136CjM;
            liveNewGiftPanelWidget.LJLJL = this.LJLJJL;
            liveNewGiftPanelWidget.LJLLI = z;
            liveNewGiftPanelWidget.LJLLL = this.LJLLJ;
            liveNewGiftPanelWidget.LLI = this.LJLLILLLL;
            this.LJLJJI = liveNewGiftPanelWidget;
            if (c32136CjM == null || (mutableLiveData4 = c32136CjM.LJI) == null || (l = mutableLiveData4.getValue()) == null) {
                l = 0L;
            }
            long longValue = l.longValue();
            long LIZ = C32778Cti.LIZ(getContext());
            if (longValue == 0) {
                longValue = LIZ;
            }
            LiveNewGiftPanelWidget liveNewGiftPanelWidget2 = this.LJLJJI;
            if (liveNewGiftPanelWidget2 != null) {
                liveNewGiftPanelWidget2.LJLLILLLL = longValue;
            }
            View view5 = getView();
            Long l3 = null;
            if (view5 != null && (viewGroup = (ViewGroup) view5.findViewById(R.id.c_6)) != null) {
                viewGroup.setClipChildren(!z);
            }
            of.load(R.id.gzb, this.LJLJJI, false);
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = new LiveNewGiftPageIndicatorWidget();
            liveNewGiftPageIndicatorWidget.LJLJI = this.LJLJJLL;
            of.load(R.id.hfj, liveNewGiftPageIndicatorWidget);
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = new LiveNewGiftBottomWidget();
            liveNewGiftBottomWidget.LJLLI = this.LJLJJLL;
            String source = this.LJLLJ;
            o.LJIIIZ(source, "source");
            liveNewGiftBottomWidget.LJLL = source;
            this.LJLJLJ = liveNewGiftBottomWidget;
            of.load(R.id.gz8, liveNewGiftBottomWidget, false);
            List<? extends GiftPage> list = this.LJLIL;
            if (list != null) {
                LiveNewGiftPanelWidget liveNewGiftPanelWidget3 = this.LJLJJI;
                if (liveNewGiftPanelWidget3 != null) {
                    liveNewGiftPanelWidget3.LLIIIL = 1;
                }
                if (list.isEmpty()) {
                    C32673Cs1 c32673Cs1 = new C32673Cs1(this);
                    this.LJZ = c32673Cs1;
                    vl("", c32673Cs1);
                } else {
                    xl(list);
                    C32694CsM.LJJIJIIJIL = SystemClock.uptimeMillis();
                    vl("", null);
                }
                if (this.LJLJJL == EnumC35487DwJ.GUEST && !GameLinkMicGiftDialogSetting.INSTANCE.isBlockWidget()) {
                    LiveNewGiftGuestInfoWidget liveNewGiftGuestInfoWidget = new LiveNewGiftGuestInfoWidget();
                    liveNewGiftGuestInfoWidget.LJLIL = this.LJLJJLL;
                    of.load(R.id.dt1, liveNewGiftGuestInfoWidget);
                    View view6 = getView();
                    if (view6 != null && (findViewById = view6.findViewById(R.id.dt1)) != null) {
                        findViewById.setVisibility(0);
                    }
                }
                if (getView() != null) {
                    C65776Prg LIZ2 = C65352Pkq.LIZ(LiveCPCViewModel.class);
                    AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ2, 1166);
                    C76907UGh.LJ(this, (LiveCPCViewModel) new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS72S0400000_12(this, aqS154S0100000_4, LIZ2, C32772Ctc.INSTANCE, 25)).getValue(), (T4Y) _$_findCachedViewById(R.id.g7a), true, new AqS171S0100000_5(this, 730));
                }
                View view7 = getView();
                if (view7 != null) {
                    view2 = view7.findViewById(R.id.i5_);
                } else {
                    view2 = null;
                }
                this.LJLLI = view2;
                if (PrivilegeCenterEntranceCacheSetting.INSTANCE.getValue()) {
                    Boolean LIZ3 = InterfaceC30442Bx8.B2.LIZ();
                    if (LIZ3 != null) {
                        z3 = LIZ3.booleanValue();
                    }
                    wl(z3);
                    GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel = this.LJLJL;
                    if (giftPrivilegeCenterViewModel != null) {
                        giftPrivilegeCenterViewModel.gv0(z3, this.LJLILLLLZI);
                    }
                } else {
                    PrivilegeApi privilegeApi = (PrivilegeApi) Q7L.LIZIZ(PrivilegeApi.class);
                    Room room = this.LJLILLLLZI;
                    if (room != null) {
                        l2 = Long.valueOf(room.getId());
                    } else {
                        l2 = null;
                    }
                    String valueOf = String.valueOf(l2);
                    Room room2 = this.LJLILLLLZI;
                    if (room2 != null) {
                        l3 = Long.valueOf(room2.getOwnerUserId());
                    }
                    C1EW.LIZ(privilegeApi.getUserPrivilegeInfo(false, valueOf, String.valueOf(l3), EnumC29511Bi7.REQUEST_FROM_SCENE_GIFT_PANEL.getType())).LJJJLIIL(new AfS57S0100000_5(this, 283), new AfS57S0100000_5(this, 284));
                }
                C32694CsM.LJIIJ = SystemClock.uptimeMillis();
            } else {
                o.LJIJI("currentGiftPages");
                throw null;
            }
        }
        C32136CjM c32136CjM2 = this.LJLJJLL;
        if (c32136CjM2 != null && (mutableLiveData3 = c32136CjM2.LIZJ) != null) {
            mutableLiveData3.observe(this, new AObserverS73S0100000_5(this, 45));
        }
        C32136CjM c32136CjM3 = this.LJLJJLL;
        if (c32136CjM3 != null && (mutableLiveData2 = c32136CjM3.LIZLLL) != null) {
            mutableLiveData2.observe(this, new AObserverS73S0100000_5(this, 46));
        }
        C32136CjM c32136CjM4 = this.LJLJJLL;
        if (c32136CjM4 != null && (mutableLiveData = c32136CjM4.LJ) != null) {
            mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 47));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.qv0(GiftDialogDismissEvent.class, Boolean.TRUE);
            dataChannel3.mv0(GiftDialogDismissEvent.class, this, new AqS171S0100000_5(this, 731));
            dataChannel3.lv0(this, ShowPrivilegeCenterEvent.class, new AqS171S0100000_5(this, 732));
        }
        if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
            this.LJLLLLLL.LIZ(C73943T0h.LIZ().LJ(C77446UaQ.class).LJJJJZI(new AfS57S0100000_5(this, 282)));
        }
        C79359VCp c79359VCp = this.LJLJLLL;
        if (c79359VCp != null) {
            c79359VCp.LIZ = getContext();
        }
    }

    public final void vl(String str, AbstractC32474Coo abstractC32474Coo) {
        Room room = this.LJLILLLLZI;
        if (room != null && room.getId() != 0) {
            GiftManager.inst().giftRepository.LIZ(3, room.getId(), abstractC32474Coo, "", this.LJLJI);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
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

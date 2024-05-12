package X;

import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.AfS37S0000000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveChargePanelPositionSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Cq5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32553Cq5 extends AbstractC32517CpV {
    public RecyclerView LJLJLLL;
    public C32567CqJ LJLL;
    public TextView LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public C47061t0 LJLLL;
    public TextView LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public long LJZ;
    public View LJZI;
    public FrameLayout LJZL;
    public Room LL;
    public final C73318Sq2 LLD;
    public ConstraintLayout LLF;
    public final int LLFF;
    public final C32565CqH LLFFF;

    @Override // X.AbstractC32579CqV
    public final void LJIILL() {
        ConstraintLayout constraintLayout;
        Fragment fragment;
        C32580CqW c32580CqW;
        Fragment fragment2;
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        C32506CpK<AbstractC32350Cmo> c32506CpK;
        C32676Cs4 c32676Cs4;
        Context context;
        FrameLayout frameLayout;
        DataChannel dataChannel;
        C32567CqJ c32567CqJ;
        GiftPanelLeafViewModel LJJII;
        MutableLiveData<Integer> mutableLiveData2;
        C32543Cpv c32543Cpv = this.LJLJL;
        if (c32543Cpv != null) {
            c32543Cpv.LIZ(new C32552Cq4(this));
        }
        View view = this.LJLJJI;
        Fragment fragment3 = null;
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        } else {
            constraintLayout = null;
        }
        this.LLF = constraintLayout;
        if (constraintLayout != null) {
            this.LJZL = (FrameLayout) constraintLayout.findViewById(R.id.fga);
            this.LJLLI = (TextView) constraintLayout.findViewById(R.id.ag4);
            this.LJLLLLLL = constraintLayout.findViewById(R.id.h1n);
            this.LJLLILLLL = constraintLayout.findViewById(R.id.ipr);
            this.LJLLJ = constraintLayout.findViewById(R.id.gmz);
            this.LJLLL = (C47061t0) constraintLayout.findViewById(R.id.f9k);
            this.LJLLLL = (TextView) constraintLayout.findViewById(R.id.v3);
            this.LJLZ = constraintLayout.findViewById(R.id.i5_);
            this.LJZI = constraintLayout.findViewById(R.id.ipv);
            constraintLayout.findViewById(R.id.gkx);
            View view2 = this.LJLLLLLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 5), view2);
            }
            View view3 = this.LJLLILLLL;
            if (view3 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 6), view3);
            }
            TextView textView = (TextView) constraintLayout.findViewById(R.id.ipy);
            TextView textView2 = (TextView) constraintLayout.findViewById(R.id.bh4);
            textView.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            textView2.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
            RecyclerView recyclerView = (RecyclerView) constraintLayout.findViewById(R.id.h0g);
            this.LJLJLLL = recyclerView;
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(0);
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
            if (!(abstractC32579CqV instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV) == null) {
                c32676Cs4 = null;
            }
            C32567CqJ c32567CqJ2 = new C32567CqJ(c32676Cs4, LJJII());
            this.LJLL = c32567CqJ2;
            c32567CqJ2.LJLJI = this;
            if (LiveGiftPanelSwipeSetting.INSTANCE.isEnabled() && c32676Cs4 != null && (LJJII = LJJII()) != null && (mutableLiveData2 = LJJII.LJLJJI) != null) {
                mutableLiveData2.observe(c32676Cs4, new AObserverS73S0100000_5(this, 6));
            }
            GiftLeafRootViewModel LJJIII = LJJIII();
            if (LJJIII != null && (dataChannel = LJJIII.LJLIL) != null && (c32567CqJ = this.LJLL) != null) {
                c32567CqJ.LJLJJLL = dataChannel;
            }
            RecyclerView recyclerView2 = this.LJLJLLL;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.LJLL);
            }
            this.LJZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            LJJIJIIJIL();
            C73454SsE LJI = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJI();
            C32580CqW c32580CqW2 = this.LJLJJL;
            if (c32580CqW2 != null) {
                fragment3 = c32580CqW2.getFragment();
            }
            ((InterfaceC29856Bng) LJI.LIZJ(C73933Szx.LIZLLL(fragment3))).LIZJ(new AfS57S0100000_5(this, 13), new AfS37S0000000_5(this, 0));
            ConstraintLayout constraintLayout2 = this.LLF;
            if (constraintLayout2 != null) {
                constraintLayout2.setPadding(0, C87277YNd.LJIIJJI(2), 0, C87277YNd.LJIIJJI(12));
            }
            View view4 = this.LJLJJI;
            if (view4 != null && (context = view4.getContext()) != null && C26338AVi.LIZJ(context) && (frameLayout = this.LJZL) != null) {
                frameLayout.setScaleX(-1.0f);
            }
        }
        ConstraintLayout constraintLayout3 = this.LLF;
        if (constraintLayout3 != null) {
            constraintLayout3.setVisibility(0);
        }
        GiftLeafRootViewModel LJJIII2 = LJJIII();
        if (LJJIII2 != null && (c32506CpK = LJJIII2.LJLJJL) != null) {
            c32506CpK.LIZJ(this.LJLJI, this.LLFFF);
        }
        C32580CqW c32580CqW3 = this.LJLJJL;
        if (c32580CqW3 != null && (fragment = c32580CqW3.getFragment()) != null && (c32580CqW = this.LJLJJL) != null && (fragment2 = c32580CqW.getFragment()) != null && (giftPrivilegeCenterViewModel = (GiftPrivilegeCenterViewModel) ViewModelProviders.of(fragment2).get(GiftPrivilegeCenterViewModel.class)) != null && (mutableLiveData = giftPrivilegeCenterViewModel.LJLIL) != null) {
            mutableLiveData.observe(fragment, new AObserverS73S0100000_5(this, 4));
        }
    }

    public final GiftPanelLeafViewModel LJJIFFI() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) ViewModelProviders.of(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftPanelLeafViewModel LJJII() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) ViewModelProviders.of(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJIII() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW != null && (fragment = c32580CqW.getFragment()) != null) {
            return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
        }
        return null;
    }

    public final int LJJIIJ() {
        C32676Cs4 c32676Cs4;
        AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
        if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs4 = (C32676Cs4) abstractC32579CqV) != null) {
            return c32676Cs4.LJJIJIIJI();
        }
        return 1;
    }

    public final C31563Ca7 LJJIIJZLJL() {
        C32676Cs4 c32676Cs4;
        AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
        if (!(abstractC32579CqV instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV) == null) {
            return null;
        }
        return c32676Cs4.LLJLLIL;
    }

    public final void LJJIJ() {
        long j;
        GiftLeafRootViewModel LJJIII;
        DataChannel dataChannel;
        Long l;
        View view = this.LJZI;
        if (view != null && view.getVisibility() == 0) {
            InterfaceC30442Bx8.LLLIIIL.LIZ(Boolean.FALSE);
            view.setVisibility(8);
        }
        if (!C32097Cij.LIZ(EnumC32096Cii.RECHARGE_DIALOG)) {
            return;
        }
        String str = C32129CjF.LIZ.LJ;
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        int i = 0;
        long j2 = 0;
        if (c32313CmD.LJIIL() && LiveChargePanelPositionSetting.INSTANCE.getValue()) {
            long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            Gift LJI = c32313CmD.LJI();
            Long l2 = null;
            if (LJI != null) {
                l = Long.valueOf(LJI.id);
            } else {
                l = null;
            }
            Gift findGiftById = GiftManager.inst().findGiftById(LJJI());
            if (findGiftById != null) {
                l2 = Long.valueOf(findGiftById.id);
            }
            if (!o.LJ(l, l2)) {
                Gift findGiftById2 = GiftManager.inst().findGiftById(LJJI());
                if (findGiftById2 != null) {
                    i = findGiftById2.diamondCount;
                }
                long j3 = i - LIZ;
                if (j3 > 0) {
                    j2 = j3;
                }
                j = LJJI();
                C15960jw c15960jw = new C15960jw("click", j2, "normal", str, null);
                c15960jw.LJIIIIZZ = j;
                c15960jw.LJIIIZ = i;
                c15960jw.LJI = true;
                LJJIII = LJJIII();
                if (LJJIII == null && (dataChannel = LJJIII.LJLIL) != null) {
                    dataChannel.qv0(ShowRechargeDialogEvent.class, c15960jw);
                    return;
                }
            }
        }
        j = 0;
        i = 0;
        C15960jw c15960jw2 = new C15960jw("click", j2, "normal", str, null);
        c15960jw2.LJIIIIZZ = j;
        c15960jw2.LJIIIZ = i;
        c15960jw2.LJI = true;
        LJJIII = LJJIII();
        if (LJJIII == null) {
        }
    }

    @Override // X.AbstractC32579CqV
    public final void LJIJJ() {
        C32506CpK<AbstractC32350Cmo> c32506CpK;
        super.LJIJJ();
        GiftLeafRootViewModel LJJIII = LJJIII();
        if (LJJIII != null && (c32506CpK = LJJIII.LJLJJL) != null) {
            C32565CqH observer = this.LLFFF;
            o.LJIIIZ(observer, "observer");
            C62819Ol5.LJIIJ("removeObserver");
            c32506CpK.LIZ.remove(observer);
        }
    }

    public final long LJJI() {
        Long l;
        MutableLiveData<Long> mutableLiveData;
        GiftPanelLeafViewModel LJJII = LJJII();
        if (LJJII == null || (mutableLiveData = LJJII.LJLJJLL) == null || (l = mutableLiveData.getValue()) == null) {
            l = 0L;
        }
        return l.longValue();
    }

    public final boolean LJJIIZI() {
        DataChannel dataChannel;
        GiftLeafRootViewModel LJJIII = LJJIII();
        if (LJJIII == null || (dataChannel = LJJIII.LJLIL) == null || !C29306Beo.LJJII(dataChannel)) {
            return false;
        }
        return true;
    }

    public final void LJJIJIIJIL() {
        String str;
        boolean z;
        View view;
        if (LJJIIJ() == 5) {
            return;
        }
        TextView textView = this.LJLLI;
        if (textView != null) {
            if (B83.LIZ().LIZIZ().isLogin()) {
                long j = this.LJZ;
                if (10000 <= j && j < 1000000) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder LIZ = X1D.LIZ();
                    String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000)}, 1));
                    o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                    LIZ.append(LLLZI);
                    LIZ.append('K');
                    str = X1D.LIZIZ(LIZ);
                } else if (j >= 1000000) {
                    double d = j / 1000000;
                    StringBuilder LIZ2 = X1D.LIZ();
                    String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                    o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                    LIZ2.append(LLLZI2);
                    LIZ2.append('M');
                    str = X1D.LIZIZ(LIZ2);
                } else if (j >= 1000) {
                    StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
                    stringBuffer.insert(1, ',');
                    str = stringBuffer.toString();
                    o.LJIIIIZZ(str, "{\n                String….toString()\n            }");
                } else {
                    str = String.valueOf(j);
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            textView.setText(str);
        }
        if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
            Boolean LIZJ = InterfaceC30442Bx8.LLLIIIL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_EXCHANGE_RED_DOT.value");
            if (LIZJ.booleanValue() && ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL.getValidUser() && (view = this.LJZI) != null) {
                view.setVisibility(0);
            }
            if (this.LJZ > 0) {
                View view2 = this.LJLLLLLL;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.LJLLILLLL;
                if (view3 != null) {
                    C29306Beo.LJJLIIIJJI(view3, !LJJIIZI());
                    return;
                }
                return;
            }
            View view4 = this.LJLLLLLL;
            if (view4 != null) {
                C29306Beo.LJJLIIIJJI(view4, !LJJIIZI());
            }
            View view5 = this.LJLLILLLL;
            if (view5 == null) {
                return;
            }
            view5.setVisibility(8);
            return;
        }
        if (this.LJZ <= 0) {
            return;
        }
        View view6 = this.LJLLLLLL;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        View view7 = this.LJLLILLLL;
        if (view7 == null) {
            return;
        }
        C29306Beo.LJJLIIIJJI(view7, !LJJIIZI());
    }

    public C32553Cq5(Context context) {
        super(context, EnumC32750CtG.GIFT_PANEL_SUB.getZIndex());
        this.LLD = new C73318Sq2();
        this.LLFF = R.layout.dok;
        this.LLFFF = new C32565CqH(this);
    }

    public final void LJJIIZ(boolean z) {
        DataChannel dataChannel;
        C32129CjF.LIZ.getClass();
        if (z) {
            GiftLeafRootViewModel LJJIII = LJJIII();
            if (LJJIII != null) {
                dataChannel = LJJIII.LJLIL;
            } else {
                dataChannel = null;
            }
            C62814Ol0.LJJIII(this.LL, dataChannel, "show", "gift_panel");
            C31563Ca7 LJJIIJZLJL = LJJIIJZLJL();
            if (LJJIIJZLJL != null) {
                LJJIIJZLJL.LJJZZI(C32555Cq7.LJLIL);
            }
            View view = this.LJLZ;
            if (view != null) {
                C29306Beo.LJJLIIIJJI(view, !LJJIIZI());
            }
            View view2 = this.LJLZ;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 4), view2);
                return;
            }
            return;
        }
        C31563Ca7 LJJIIJZLJL2 = LJJIIJZLJL();
        if (LJJIIJZLJL2 != null) {
            LJJIIJZLJL2.LJJZZI(C32556Cq8.LJLIL);
        }
        View view3 = this.LJLZ;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    public final void LJJIJIIJI(boolean z) {
        if (z) {
            View view = this.LJLLJ;
            if (view != null) {
                view.setVisibility(8);
            }
            LJJIJIIJIL();
            return;
        }
        View view2 = this.LJLLILLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJLLLLLL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    @Override // X.AbstractC32579CqV
    public final OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LJIIIZ = C20910rv.LJIIIZ(this.LLFF);
        if (LJIIIZ == null && (LJIIIZ = C16880lQ.LLLLIILL(layoutInflater, this.LLFF, parent, false)) == null) {
            return null;
        }
        this.LJLJJI = LJIIIZ;
        C018905p c018905p = new C018905p(-1, -1);
        View view = this.LJLJJI;
        o.LJI(view);
        return new OSZ<>(view, c018905p);
    }
}

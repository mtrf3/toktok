package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.B83;
import X.C15960jw;
import X.C16880lQ;
import X.C169696lJ;
import X.C1DH;
import X.C29306Beo;
import X.C32097Cij;
import X.C32136CjM;
import X.C32568CqK;
import X.C32569CqL;
import X.C32570CqM;
import X.C8HI;
import X.CN1;
import X.EnumC32096Cii;
import X.EnumC32766CtW;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS9S0101000_5;
import Y.AfS57S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.ExclusiveShowRedDotEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNewGiftBottomWidget extends LiveWidget {
    public C32568CqK LJLIL;
    public RecyclerView LJLILLLLZI;
    public TextView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public long LJLJLJ;
    public List<? extends GiftPage> LJLJLLL;
    public String LJLL = "";
    public C32136CjM LJLLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dok;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        int i;
        int size;
        int i2;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        long j;
        List<? extends GiftPage> list = this.LJLJLLL;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(8);
        Boolean showUserLevelRedDot = InterfaceC30442Bx8.l0.LIZJ();
        boolean ge0 = ((IFansClubService) CN1.LIZ(IFansClubService.class)).ge0();
        Iterator<? extends GiftPage> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            GiftPage next = it.next();
            if (next.display) {
                C32570CqM c32570CqM = new C32570CqM();
                c32570CqM.LIZ = next.pageName;
                int i3 = next.pageType;
                c32570CqM.LIZJ = i3;
                if (this.LJLLI != null && LiveGiftPanelManualSortSetting.INSTANCE.isEnable() && i3 == 1) {
                    Room LJIILL = C1DH.LJIILL(this.dataChannel);
                    if (LJIILL != null) {
                        j = LJIILL.getId();
                    } else {
                        j = 0;
                    }
                    EnumC32766CtW LIZ = C32569CqL.LIZ(j);
                    c32570CqM.LJI = LIZ;
                    if (this.LJLLI != null) {
                        i = C32136CjM.LIZ(next.pageType, LIZ);
                    }
                    c32570CqM.LJFF = i;
                }
                c32570CqM.LIZLLL = next.pagePanelBanner;
                if (next.pageType == 15) {
                    o.LJIIIIZZ(showUserLevelRedDot, "showUserLevelRedDot");
                    if (showUserLevelRedDot.booleanValue() || ge0) {
                        c32570CqM.LJ = true;
                    }
                }
                arrayList.add(c32570CqM);
            }
        }
        C32568CqK c32568CqK = this.LJLIL;
        if (c32568CqK != null) {
            c32568CqK.LJLIL = arrayList;
            C32136CjM c32136CjM = c32568CqK.LJLILLLLZI;
            if (c32136CjM == null || (mutableLiveData = c32136CjM.LIZIZ) == null || (value = mutableLiveData.getValue()) == null) {
                i2 = 0;
            } else {
                i2 = value.intValue();
            }
            c32568CqK.LJLJJL = i2;
            c32568CqK.notifyDataSetChanged();
        }
        if (arrayList.size() <= 1) {
            RecyclerView recyclerView = this.LJLILLLLZI;
            if (recyclerView != null) {
                C29306Beo.LJI(recyclerView);
                return;
            } else {
                o.LJIJI("newTabList");
                throw null;
            }
        }
        RecyclerView recyclerView2 = this.LJLILLLLZI;
        if (recyclerView2 != null) {
            C29306Beo.LJJLJLI(recyclerView2);
            C32568CqK c32568CqK2 = this.LJLIL;
            if (c32568CqK2 == null || c32568CqK2.LJLIL.isEmpty() || (size = c32568CqK2.LJLIL.size()) < 0) {
                return;
            }
            while (((C32570CqM) ListProtector.get(c32568CqK2.LJLIL, i)).LIZJ != c32568CqK2.LJLJJL) {
                if (i == size) {
                    return;
                } else {
                    i++;
                }
            }
            if (i <= 0) {
                return;
            }
            RecyclerView recyclerView3 = this.LJLILLLLZI;
            if (recyclerView3 != null) {
                recyclerView3.postDelayed(new ARunnableS9S0101000_5(i, this, 11), 20L);
                return;
            } else {
                o.LJIJI("newTabList");
                throw null;
            }
        }
        o.LJIJI("newTabList");
        throw null;
    }

    public final void LJZ() {
        View view = this.LJLJL;
        if (view != null) {
            if (C29306Beo.LJJIIJ(view)) {
                InterfaceC30442Bx8.LLLIIIL.LIZ(Boolean.FALSE);
                View view2 = this.LJLJL;
                if (view2 != null) {
                    C29306Beo.LJI(view2);
                } else {
                    o.LJIJI("redDot");
                    throw null;
                }
            }
            if (!C32097Cij.LIZ(EnumC32096Cii.RECHARGE_DIALOG)) {
                return;
            }
            DataChannel dataChannel = this.dataChannel;
            C15960jw c15960jw = new C15960jw("click", 0L, "normal", this.LJLL, null);
            c15960jw.LJI = true;
            dataChannel.qv0(ShowRechargeDialogEvent.class, c15960jw);
            return;
        }
        o.LJIJI("redDot");
        throw null;
    }

    public final void LL() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        C32136CjM c32136CjM = this.LJLLI;
        if (c32136CjM == null || (mutableLiveData = c32136CjM.LIZIZ) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 5) {
            if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
                Boolean LIZJ = InterfaceC30442Bx8.LLLIIIL.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_SHOW_EXCHANGE_RED_DOT.value");
                if (LIZJ.booleanValue() && ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL.getValidUser()) {
                    View view = this.LJLJL;
                    if (view != null) {
                        view.setVisibility(0);
                    } else {
                        o.LJIJI("redDot");
                        throw null;
                    }
                }
                if (this.LJLJLJ > 0) {
                    View view2 = this.LJLJJLL;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        View view3 = this.LJLJJI;
                        if (view3 != null) {
                            view3.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("rechargeBlock");
                            throw null;
                        }
                    }
                    o.LJIJI("noCoinBlock");
                    throw null;
                }
                View view4 = this.LJLJJLL;
                if (view4 != null) {
                    view4.setVisibility(0);
                    View view5 = this.LJLJJI;
                    if (view5 != null) {
                        view5.setVisibility(8);
                        return;
                    } else {
                        o.LJIJI("rechargeBlock");
                        throw null;
                    }
                }
                o.LJIJI("noCoinBlock");
                throw null;
            }
            if (this.LJLJLJ <= 0) {
                return;
            }
            View view6 = this.LJLJJLL;
            if (view6 != null) {
                view6.setVisibility(8);
                View view7 = this.LJLJJI;
                if (view7 != null) {
                    view7.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("rechargeBlock");
                    throw null;
                }
            }
            o.LJIJI("noCoinBlock");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Integer num;
        boolean z;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        MutableLiveData<Integer> mutableLiveData2;
        super.onCreate();
        View findViewById = findViewById(R.id.ag4);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.balance)");
        this.LJLJI = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.h1n);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.no_coin_block)");
        this.LJLJJLL = findViewById2;
        View findViewById3 = findViewById(R.id.ipr);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.recharge_block)");
        this.LJLJJI = findViewById3;
        View findViewById4 = findViewById(R.id.gmz);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.more_props_block)");
        this.LJLJJL = findViewById4;
        View findViewById5 = findViewById(R.id.ipv);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.recharge_red_dot)");
        this.LJLJL = findViewById5;
        C32136CjM c32136CjM = this.LJLLI;
        if (c32136CjM != null && (mutableLiveData2 = c32136CjM.LIZIZ) != null) {
            num = mutableLiveData2.getValue();
        } else {
            num = null;
        }
        if (num != null) {
            C32136CjM c32136CjM2 = this.LJLLI;
            if (c32136CjM2 == null || (mutableLiveData = c32136CjM2.LIZIZ) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                View view = this.LJLJJL;
                if (view != null) {
                    C29306Beo.LJI(view);
                    View view2 = this.LJLJJI;
                    if (view2 != null) {
                        C29306Beo.LJI(view2);
                    } else {
                        o.LJIJI("rechargeBlock");
                        throw null;
                    }
                } else {
                    o.LJIJI("morePropBlock");
                    throw null;
                }
            } else {
                LL();
            }
            View view3 = this.LJLJJLL;
            if (view3 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT), view3);
                View view4 = this.LJLJJI;
                if (view4 != null) {
                    C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 391), view4);
                    View view5 = this.LJLJJL;
                    if (view5 != null) {
                        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 392), view5);
                        TextView textView = (TextView) findViewById(R.id.ipy);
                        TextView textView2 = (TextView) findViewById(R.id.bh4);
                        textView.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                        textView2.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                    } else {
                        o.LJIJI("morePropBlock");
                        throw null;
                    }
                } else {
                    o.LJIJI("rechargeBlock");
                    throw null;
                }
            } else {
                o.LJIJI("noCoinBlock");
                throw null;
            }
        }
        LJLZ();
        LJZI(((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ());
        ((InterfaceC29856Bng) ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJI().LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(new AfS57S0100000_5(this, 318), new InterfaceC64592gB() { // from class: X.2hk
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJI("live_new_gift_bottom_widget", (Throwable) obj);
            }
        });
        View findViewById6 = findViewById(R.id.h0g);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.new_tab_list)");
        this.LJLILLLLZI = (RecyclerView) findViewById6;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            C32568CqK c32568CqK = new C32568CqK();
            c32568CqK.LJLILLLLZI = this.LJLLI;
            c32568CqK.LJLJI = this;
            this.LJLIL = c32568CqK;
            RecyclerView recyclerView2 = this.LJLILLLLZI;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c32568CqK);
                this.dataChannel.mv0(ExclusiveShowRedDotEvent.class, this, new AqS171S0100000_5(this, 799));
                C32568CqK c32568CqK2 = this.LJLIL;
                if (c32568CqK2 != null) {
                    DataChannel dataChannel = this.dataChannel;
                    o.LJIIIIZZ(dataChannel, "dataChannel");
                    c32568CqK2.LJLJJLL = dataChannel;
                    return;
                }
                return;
            }
            o.LJIJI("newTabList");
            throw null;
        }
        o.LJIJI("newTabList");
        throw null;
    }

    public final void LJZI(long j) {
        String str;
        boolean z;
        TextView textView = this.LJLJI;
        if (textView != null) {
            if (B83.LIZ().LIZIZ().isLogin()) {
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
                    StringBuilder LIZ2 = X1D.LIZ();
                    String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000)}, 1));
                    o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                    LIZ2.append(LLLZI2);
                    LIZ2.append('M');
                    str = X1D.LIZIZ(LIZ2);
                } else if (j >= 1000) {
                    StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
                    stringBuffer.insert(1, ',');
                    str = stringBuffer.toString();
                    o.LJIIIIZZ(str, "{\n            StringBuff…',').toString()\n        }");
                } else {
                    str = String.valueOf(j);
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            textView.setText(str);
            this.LJLJLJ = j;
            LL();
            return;
        }
        o.LJIJI("balance");
        throw null;
    }

    public final void LJZL(boolean z) {
        if (z) {
            View view = this.LJLJJL;
            if (view != null) {
                view.setVisibility(8);
                LL();
                return;
            } else {
                o.LJIJI("morePropBlock");
                throw null;
            }
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setVisibility(8);
            View view3 = this.LJLJJLL;
            if (view3 != null) {
                view3.setVisibility(8);
                return;
            } else {
                o.LJIJI("noCoinBlock");
                throw null;
            }
        }
        o.LJIJI("rechargeBlock");
        throw null;
    }

    public final void LLF(int i) {
        String LIZIZ = C169696lJ.LIZIZ('+', i);
        TextView textView = (TextView) findViewById(R.id.v3);
        textView.setText(LIZIZ);
        textView.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L);
        o.LJIIIIZZ(duration, "ofFloat(addNumber, View.…N_400.toLong(),\n        )");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(350L);
        o.LJIIIIZZ(duration2, "ofFloat(addNumber, View.…N_350.toLong(),\n        )");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.play(duration2).after(700L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, 0.0f, -35.0f).setDuration(300L);
        o.LJIIIIZZ(duration3, "ofFloat(addNumber, View.…0.toLong(),\n            )");
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -35.0f, -40.0f).setDuration(700L);
        o.LJIIIIZZ(duration4, "ofFloat(addNumber, View.…0.toLong(),\n            )");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(duration3);
        animatorSet2.play(duration4).after(300L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.start();
    }
}

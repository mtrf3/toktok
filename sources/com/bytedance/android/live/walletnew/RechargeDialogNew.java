package com.bytedance.android.live.walletnew;

import X.ActivityC45651qj;
import X.B83;
import X.BEQ;
import X.BF3;
import X.BK7;
import X.BZI;
import X.C018905p;
import X.C06510Nj;
import X.C06540Nm;
import X.C0N3;
import X.C10A;
import X.C11090c5;
import X.C113554cx;
import X.C13E;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C28787BRn;
import X.C28835BTj;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C2A7;
import X.C32151Nz;
import X.C32355Cmt;
import X.C32357Cmv;
import X.C32360Cmy;
import X.C32364Cn2;
import X.C3C5;
import X.C41081jM;
import X.C47121t6;
import X.C47261Igj;
import X.C5H3;
import X.C72259SXn;
import X.C73411SrX;
import X.C73933Szx;
import X.C73943T0h;
import X.C76800UCe;
import X.C77445UaP;
import X.C77480Uay;
import X.C77518Uba;
import X.C77541Ubx;
import X.C77580Uca;
import X.C77588Uci;
import X.C77591Ucl;
import X.C77607Ud1;
import X.C77608Ud2;
import X.C77612Ud6;
import X.C77629UdN;
import X.C77630UdO;
import X.C77635UdT;
import X.C77670Ue2;
import X.C77681UeD;
import X.C77698UeU;
import X.C77719Uep;
import X.C78996UzQ;
import X.C79146V4k;
import X.C87277YNd;
import X.C90903hW;
import X.CCJ;
import X.CN1;
import X.DialogC31813Ce9;
import X.InterfaceC11100c6;
import X.InterfaceC29856Bng;
import X.InterfaceC77573UcT;
import X.InterfaceC77595Ucp;
import X.InterfaceC77611Ud5;
import X.InterfaceC77682UeE;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.Q7L;
import X.Q8U;
import X.T4W;
import X.TTL;
import X.UI8;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS44S1100000_5;
import Y.AObserverS69S0200000_5;
import Y.AObserverS69S0300000_13;
import Y.AObserverS81S0100000_13;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import Y.IDHandlerS13S0100000;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.PopupData;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWalletWebAppGuideAvailable;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFESchema;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.c1;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import ujb.s;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class RechargeDialogNew extends BaseRechargeFragment implements InterfaceC77595Ucp {
    public static final /* synthetic */ int LJLLL = 0;
    public InterfaceC77682UeE LJLJI;
    public C77591Ucl LJLJJI;
    public DataChannel LJLJJL;
    public InterfaceC77611Ud5 LJLJJLL;
    public C77719Uep LJLJL;
    public ViewGroup LJLJLJ;
    public C13E LJLJLLL;
    public C32357Cmv LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 183));
    public final C77580Uca LJLLILLLL = new C77580Uca(this);

    @Override // com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // X.InterfaceC77595Ucp
    public final void LLLLLILLIL() {
        C13E c13e = this.LJLJLLL;
        if (c13e != null) {
            c13e.LIZIZ.removeMessages(10);
            C29306Beo.LJJJJ(c13e.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (C77629UdN.LIZ) {
            C77629UdN.LJII = true;
            C77630UdO.LJFF();
        }
        super.onStop();
    }

    public final RechargeViewModel vl() {
        return (RechargeViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJII() {
        BEQ beq;
        View view = getView();
        if (view != null && (beq = (BEQ) view.findViewById(R.id.kf_)) != null) {
            beq.LIZLLL();
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJIJ() {
        BEQ beq;
        View view = getView();
        if (view != null && (beq = (BEQ) view.findViewById(R.id.kf_)) != null) {
            beq.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        vl().onDestroy();
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        vl().onDestroy();
        _$_clearFindViewByIdCache();
    }

    public final void wl() {
        Long l;
        String str;
        int sv0 = vl().sv0();
        if (sv0 != -3) {
            if (sv0 != 3) {
                return;
            }
            DataChannel dataChannel = this.LJLJJL;
            C77591Ucl c77591Ucl = this.LJLJJI;
            if (c77591Ucl != null) {
                Map<String, String> map = c77591Ucl.LIZIZ;
                BZI LIZ = C28787BRn.LIZ("livesdk_kyc_incentive_banner_show");
                C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "user_id", "recharge_incentive", "page_type");
                LIZ.LJIJJ("room_recharge", "popup_entrance");
                LIZ.LJJIFFI(map);
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJJIIJZLJL();
                return;
            }
            o.LJIJI("rechargeDialogConfig");
            throw null;
        }
        String mChargeReason = vl().tv0();
        String mRequestPage = vl().yv0();
        DataChannel dataChannel2 = this.LJLJJL;
        C77591Ucl c77591Ucl2 = this.LJLJJI;
        if (c77591Ucl2 != null) {
            Map<String, String> map2 = c77591Ucl2.LIZIZ;
            o.LJIIIZ(mChargeReason, "mChargeReason");
            o.LJIIIZ(mRequestPage, "mRequestPage");
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_vip_channel_entrance_show");
            C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "user_id");
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            LIZ2.LJIJJ(String.valueOf(l), "anchor_id");
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            LIZ2.LJIJJ(String.valueOf(str), "room_id");
            LIZ2.LJIJJ(mChargeReason, "charge_reason");
            LIZ2.LJIJJ(mRequestPage, "request_page");
            LIZ2.LJJIFFI(map2);
            LIZ2.LJIILLIIL(dataChannel2);
            LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel2, "user_live_duration"));
            LIZ2.LJJIIJZLJL();
            return;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    public final void Al(boolean z) {
        long j;
        String str;
        int i;
        PopupData popupData;
        Map<String, Boolean> map;
        BalanceStructExtra balanceStructExtra;
        int i2;
        CurrencyInfo currencyInfo;
        BalanceStructExtra balanceStructExtra2;
        String str2;
        int i3 = 0;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(0, 11);
        C77591Ucl c77591Ucl = this.LJLJJI;
        String str3 = null;
        if (c77591Ucl != null) {
            Boolean.valueOf(LJJIJIIJI.contains(Integer.valueOf(c77591Ucl.LIZLLL))).booleanValue();
            WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
            RevenueExchange revenueExchange = walletStruct.revenue;
            if (revenueExchange != null && revenueExchange.getAllowRetentionPopup()) {
                IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
                long j2 = 0;
                if (iBrowserService != null && (str2 = (String) iBrowserService.Wn(getContext(), "timestamp_exchange_retention_popup_shown")) != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                if (z) {
                    str = "package";
                } else {
                    str = "cashier";
                }
                if ((Calendar.getInstance().getTimeInMillis() - j) / 3600000 > 24) {
                    Diamond diamond = vl().LLIILII;
                    if (diamond != null) {
                        i = diamond.count;
                    } else {
                        i = 0;
                    }
                    WalletStruct walletStruct2 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
                    RevenueExchange revenueExchange2 = walletStruct2.revenue;
                    if (revenueExchange2 == null || !revenueExchange2.getEnableExchange() || revenueExchange2.getBalance() <= i || (balanceStructExtra2 = walletStruct2.LIZ) == null || balanceStructExtra2.getBasePackage() == null) {
                        BalanceStruct balanceStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL;
                        BalanceStructExtra exchangeInfo = balanceStruct.getExchangeInfo();
                        if (exchangeInfo != null) {
                            j2 = exchangeInfo.getCoins();
                        }
                        if (balanceStruct.getExchangeInfo() == null || !balanceStruct.getValidUser() || j2 <= i) {
                            return;
                        }
                    }
                    RevenueExchange revenueExchange3 = walletStruct.revenue;
                    if (revenueExchange3 != null && (popupData = revenueExchange3.getPopupData()) != null && (map = popupData.disPlayScenario) != null && o.LJ(map.get("2"), Boolean.TRUE)) {
                        Diamond diamond2 = vl().LLIILII;
                        C77591Ucl c77591Ucl2 = this.LJLJJI;
                        if (c77591Ucl2 != null) {
                            String str4 = c77591Ucl2.LIZJ;
                            boolean LJIIJ = C29306Beo.LJIIJ(this.LJLJJL);
                            String retentionPopupSchema = LiveWalletFESchema.INSTANCE.getRetentionPopupSchema();
                            String LJ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJ(vl().zv0(), false);
                            C32364Cn2 c32364Cn2 = new C32364Cn2(retentionPopupSchema);
                            if (vl().zv0() == -1) {
                                c32364Cn2.LIZ(0, "way");
                                balanceStructExtra = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJJL.getExchangeInfo();
                            } else {
                                c32364Cn2.LIZ(1, "way");
                                balanceStructExtra = walletStruct.LIZ;
                            }
                            if (diamond2 != null) {
                                i2 = diamond2.count;
                            } else {
                                i2 = 0;
                            }
                            c32364Cn2.LIZ(i2, "coin_amount");
                            c32364Cn2.LIZJ("balance", LJ);
                            if (balanceStructExtra != null && (currencyInfo = balanceStructExtra.getCurrencyInfo()) != null) {
                                str3 = currencyInfo.getCode();
                            }
                            c32364Cn2.LIZJ("currency_code", str3);
                            c32364Cn2.LIZJ("enter_from", "live_detail");
                            c32364Cn2.LIZ(0, "source");
                            c32364Cn2.LIZ(LJIIJ ? 1 : 0, "is_anchor");
                            Boolean LIZ = walletStruct.LIZ();
                            o.LJIIIIZZ(LIZ, "walletStruct.liveAutoExchangeEnable");
                            c32364Cn2.LIZ(LIZ.booleanValue() ? 1 : 0, "ab_enable_auto");
                            c32364Cn2.LIZ(walletStruct.isPeriodicPayout ? 1 : 0, "is_periodic_payout");
                            c32364Cn2.LIZJ("recharge_stage", str);
                            c32364Cn2.LIZJ("charge_reason", str4);
                            RevenueExchange revenueExchange4 = walletStruct.revenue;
                            if (revenueExchange4 != null && revenueExchange4.isRevenue()) {
                                i3 = 1;
                            }
                            c32364Cn2.LIZ(i3, "has_short_video_gift");
                            String LIZLLL = c32364Cn2.LIZLLL();
                            o.LJIIIIZZ(LIZLLL, "builder.build()");
                            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(mo49getActivity(), UriProtector.parse(LIZLLL));
                            return;
                        }
                        o.LJIJI("rechargeDialogConfig");
                        throw null;
                    }
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    @Override // X.InterfaceC77595Ucp
    public final void l4(NoticesResult.Notice notice) {
        String str;
        Boolean bool;
        String str2;
        String str3 = null;
        if (notice != null) {
            str = notice.content;
        } else {
            str = null;
        }
        int i = 8;
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.h4j);
            if (notice != null) {
                bool = notice.closable;
            } else {
                bool = null;
            }
            if (bool != null) {
                Boolean bool2 = notice.closable;
                o.LJIIIIZZ(bool2, "notice.closable");
                if (bool2.booleanValue()) {
                    i = 0;
                }
            }
            imageView.setVisibility(i);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.h4k);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.h4l);
            if (notice != null) {
                str2 = notice.content;
            } else {
                str2 = null;
            }
            textView.setText(str2);
            RechargeViewModel viewModel = vl();
            if (notice != null) {
                str3 = notice.id;
            }
            o.LJIIIZ(viewModel, "viewModel");
            BZI LIZIZ = C0N3.LIZIZ("livesdk_inapp_top_notice_show", "recharge_panel", "show_entrance");
            LIZIZ.LJIJJ(C77541Ubx.LJIIIIZZ(viewModel.uv0()), "scenario");
            LIZIZ.LJIJJ("white", "notice_type");
            LIZIZ.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZIZ, str3, "notice_id")).getCurrentUserId()), "user_id");
            LIZIZ.LJJIIJZLJL();
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.h4k);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 1) {
            if (vl().LLIILZL) {
                InterfaceC77611Ud5 interfaceC77611Ud5 = this.LJLJJLL;
                if (interfaceC77611Ud5 != null) {
                    interfaceC77611Ud5.dismiss();
                    vl().Gv0(mo49getActivity());
                    vl().LLIILZL = false;
                    return;
                }
                o.LJIJI("rechargeDialog");
                throw null;
            }
            if (vl().LLIIZ) {
                InterfaceC77611Ud5 interfaceC77611Ud52 = this.LJLJJLL;
                if (interfaceC77611Ud52 != null) {
                    interfaceC77611Ud52.dismiss();
                    vl().Hv0(mo49getActivity());
                    vl().LLIIZ = false;
                    return;
                }
                o.LJIJI("rechargeDialog");
                throw null;
            }
            if (vl().LLIL) {
                InterfaceC77611Ud5 interfaceC77611Ud53 = this.LJLJJLL;
                if (interfaceC77611Ud53 != null) {
                    interfaceC77611Ud53.dismiss();
                    vl().Bv0(mo49getActivity());
                    vl().LLIL = false;
                    return;
                }
                o.LJIJI("rechargeDialog");
                throw null;
            }
            if (!vl().LLILII) {
                return;
            }
            InterfaceC77611Ud5 interfaceC77611Ud54 = this.LJLJJLL;
            if (interfaceC77611Ud54 != null) {
                interfaceC77611Ud54.dismiss();
                RechargeViewModel vl = vl();
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                vl.Iv0(requireContext);
                vl().LLILII = false;
                return;
            }
            o.LJIJI("rechargeDialog");
            throw null;
        }
    }

    public final void onEvent(C77698UeU c77698UeU) {
        if (c77698UeU != null && c77698UeU.LIZIZ) {
            Diamond diamond = new Diamond();
            diamond.count = c77698UeU.LIZ;
            xl(diamond, null, false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.InterfaceC77595Ucp
    public final void j7(Diamond diamond, C77612Ud6 c77612Ud6) {
        xl(diamond, c77612Ud6, true);
    }

    @Override // X.InterfaceC77595Ucp
    public final void me(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        int sv0;
        ListResult.VoucherItem voucherItem;
        List<ListResult.VoucherItem> list;
        Map<String, String> map;
        boolean z;
        String str;
        boolean z2;
        View view;
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        View findViewById2;
        o.LJIIIZ(productList, "productList");
        InterfaceC77682UeE interfaceC77682UeE = this.LJLJI;
        int i = 0;
        if (interfaceC77682UeE != null) {
            interfaceC77682UeE.LIZIZ(2, 0, "api success");
        }
        if (productList.isEmpty()) {
            df(0, 0, new Exception("rechargeList is empty"));
            return;
        }
        RechargeViewModel vl = vl();
        if (vl.zv0() != 0 && ((sv0 = vl.sv0()) == 3 || sv0 == -3)) {
            ACListenerS33S0100000_13 aCListenerS33S0100000_13 = new ACListenerS33S0100000_13(this, 60);
            C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.m6c), true);
            C29306Beo.LJJLIIIJJI(_$_findCachedViewById(R.id.f2q), true);
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.m6c), aCListenerS33S0100000_13);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kfc);
        if (_$_findCachedViewById != null) {
            C87277YNd.LJJIIZ(_$_findCachedViewById);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g2q);
        if (_$_findCachedViewById2 != null) {
            C87277YNd.LJJIJ(_$_findCachedViewById2);
        }
        RechargeViewModel vl2 = vl();
        C77719Uep c77719Uep = this.LJLJL;
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.b9r);
        vl2.getClass();
        LinkedList linkedList = new LinkedList(productList);
        int sv02 = vl2.sv0();
        if (sv02 != 0) {
            Diamond diamond = new Diamond();
            diamond.LJLIL = sv02;
            linkedList.addFirst(diamond);
        }
        if (productList.isEmpty()) {
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setVisibility(8);
            }
            if (c77719Uep != null) {
                vl2.vv0();
                c77719Uep.LJJIII(linkedList);
            }
        } else {
            vl2.LLIILII = (Diamond) ListProtector.get(productList, 0);
            if (diamondPackageExtra != null && diamondPackageExtra.officialRecharge && !LiveWebRechargeAuditing.INSTANCE.getValue()) {
                Diamond diamond2 = new Diamond();
                diamond2.LJLIL = 2;
                linkedList.add(diamond2);
                DataChannel dataChannel = vl2.LJLLLLLL;
                C77591Ucl c77591Ucl = vl2.LJLLLL;
                if (c77591Ucl != null) {
                    map = c77591Ucl.LIZIZ;
                } else {
                    map = null;
                }
                Diamond diamond3 = vl2.LLIILII;
                if (diamond3 != null && C79146V4k.LJJJIL(diamond3)) {
                    z = true;
                } else {
                    z = false;
                }
                OSZ[] oszArr = new OSZ[6];
                oszArr[0] = new OSZ("pay_method", C77608Ud2.LIZ());
                oszArr[1] = new OSZ("charge_style", "window");
                oszArr[2] = new OSZ("charge_reason", vl2.tv0());
                oszArr[3] = new OSZ("request_page", vl2.yv0());
                oszArr[4] = new OSZ("panel_type", "normal");
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                oszArr[5] = new OSZ("is_selected_by_default", str);
                Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
                BZI LIZ = C28787BRn.LIZ("livesdk_recharge_lagersum_show");
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJJIFFI(LJJLIIIIJ);
                LIZ.LJJIFFI(map);
                LIZ.LJJIIJZLJL();
            }
            Diamond LIZJ = C77588Uci.LIZJ(linkedList, diamondPackageExtra, vl2.xv0(), vl2.LJLLLL);
            vl2.LLIIL = LIZJ;
            if (LIZJ == null) {
                if (!linkedList.isEmpty()) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        LIZJ = (Diamond) it.next();
                        if (LIZJ.LJLIL == 0) {
                            break;
                        }
                    }
                }
                LIZJ = null;
            }
            vl2.LLIILII = LIZJ;
            if (LIZJ != null) {
                vl2.LJZ.setValue(LIZJ);
            }
            c1 wv0 = vl2.wv0();
            if (wv0.LIZ.uv0() == 0) {
                wv0.LJ = diamondPackageExtra;
                if (diamondPackageExtra != null && (list = diamondPackageExtra.voucherList) != null) {
                    voucherItem = (ListResult.VoucherItem) ORZ.LJLLLL(list);
                } else {
                    voucherItem = null;
                }
                wv0.LJFF = voucherItem;
                wv0.LIZ();
                if (!wv0.LJI) {
                    wv0.LJI = true;
                    LifecycleOwner lifecycleOwner = wv0.LIZIZ;
                    if (lifecycleOwner != null) {
                        wv0.LIZ.LJZ.observe(lifecycleOwner, new AObserverS81S0100000_13(wv0, 55));
                    }
                }
            }
            if (vl2.wv0().LJFF != null) {
                Diamond diamond4 = new Diamond();
                diamond4.LJLIL = 4;
                linkedList.addLast(diamond4);
            }
            if (c77719Uep != null) {
                vl2.vv0();
                c77719Uep.LJJIII(linkedList);
            }
        }
        C77719Uep c77719Uep2 = this.LJLJL;
        if (c77719Uep2 != null) {
            c77719Uep2.notifyDataSetChanged();
        }
        if (vl().Cv0() && (view = getView()) != null && (findViewById = view.findViewById(R.id.g2q)) != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = C15380j0.LIZ(436.0f);
            View view2 = getView();
            if (view2 != null && (findViewById2 = view2.findViewById(R.id.g2q)) != null) {
                findViewById2.setLayoutParams(layoutParams);
            }
        }
        View view3 = getView();
        if (view3 != null) {
            view3.post(new ARunnableS32S0200000_13(this, productList, 29));
        }
        wl();
        C77591Ucl c77591Ucl2 = this.LJLJJI;
        if (c77591Ucl2 != null) {
            DataChannel dataChannel2 = this.LJLJJL;
            Diamond diamond5 = vl().LLIIL;
            DiamondPackageExtra diamondPackageExtra2 = vl().LJLJL;
            RechargeViewModel vl3 = vl();
            if (vl3.zv0() == -2 || vl3.zv0() == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C77541Ubx.LJIJJLI(c77591Ucl2, dataChannel2, diamond5, false, diamondPackageExtra2, z2, vl().rv0());
            Diamond diamond6 = vl().LLIILII;
            if (diamond6 != null) {
                i = diamond6.count;
            }
            DataChannel dataChannel3 = this.LJLJJL;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_show_recommond");
            LIZ2.LJIILLIIL(dataChannel3);
            LIZ2.LJIJJ(Integer.valueOf(i), "recommend_package");
            LIZ2.LJJIIJZLJL();
            C77630UdO.LJII(null);
            return;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C73411SrX c73411SrX;
        String str;
        int i;
        ImageView imageView;
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (vl().Cv0()) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.g2q);
            if (_$_findCachedViewById != null && (layoutParams2 = _$_findCachedViewById.getLayoutParams()) != null) {
                layoutParams2.height = -2;
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g2q);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setLayoutParams(layoutParams2);
                }
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams3.height = C15380j0.LJIIIZ(mo49getActivity());
            view.setLayoutParams(layoutParams3);
        }
        Drawable LJI = C15380j0.LJI(R.drawable.cub);
        int LIZ = C15380j0.LIZ(16.0f);
        if (LJI != null) {
            LJI.setBounds(0, 0, LIZ, LIZ);
        }
        if (CCJ.LIZ(getContext())) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.m5f);
            if (appCompatTextView != null) {
                appCompatTextView.setCompoundDrawables(null, null, LJI, null);
            }
        } else {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.m5f);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setCompoundDrawables(LJI, null, null, null);
            }
        }
        C77591Ucl c77591Ucl = this.LJLJJI;
        if (c77591Ucl != null) {
            View view2 = c77591Ucl.LIZ;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(view2, viewGroup);
                }
                ViewGroup viewGroup2 = (ViewGroup) _$_findCachedViewById(R.id.c8d);
                if (viewGroup2 != null) {
                    viewGroup2.addView(view2);
                }
            }
            if (((Boolean) vl().LLFII.getValue()).booleanValue()) {
                ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.bfh);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.bfh);
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS33S0100000_13(this, 216));
                }
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.title);
                if (_$_findCachedViewById3 != null) {
                    layoutParams = _$_findCachedViewById3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                    c018905p.endToEnd = -1;
                    c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                }
            }
            C41081jM c41081jM = (C41081jM) _$_findCachedViewById(R.id.d4u);
            if (c41081jM != null) {
                C16880lQ.LJJIIZI(c41081jM, new ACListenerS25S0100000_5(this, 460));
            }
            if (vl().isFirstRecharge() && !C15380j0.LJIILLIIL() && (imageView = (ImageView) _$_findCachedViewById(R.id.d4u)) != null) {
                imageView.setVisibility(8);
            }
            if (vl().isFirstRecharge()) {
                TextView textView = (TextView) _$_findCachedViewById(R.id.title);
                if (textView != null) {
                    textView.setText(C15380j0.LJIILJJIL(R.string.muj));
                }
                View _$_findCachedViewById4 = _$_findCachedViewById(R.id.dat);
                if (_$_findCachedViewById4 != null) {
                    _$_findCachedViewById4.setVisibility(0);
                }
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.dat);
                if (textView2 != null) {
                    textView2.setText(C15380j0.LJIILJJIL(R.string.mpc));
                }
            }
            if (o.LJ(vl().LJZL.getValue(), "other_recharge")) {
                ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.fp9);
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                }
                LiveIconView liveIconView = (LiveIconView) _$_findCachedViewById(R.id.fp9);
                if (liveIconView != null) {
                    C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 217));
                }
            }
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.b9r);
            if (_$_findCachedViewById5 != null) {
                _$_findCachedViewById5.setVisibility(0);
            }
            C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.b9r);
            if (c2a7 != null) {
                C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 218));
            }
            View findViewById = view.findViewById(R.id.nb6);
            if (findViewById != null) {
                findViewById.setOverScrollMode(2);
            }
            this.LJLJL = new C77719Uep(this.LJLLILLLL, vl());
            ViewPager viewPager = (ViewPager) view.findViewById(R.id.nb6);
            if (viewPager != null) {
                viewPager.setAdapter(this.LJLJL);
            }
            BEQ beq = (BEQ) view.findViewById(R.id.kf_);
            o.LJIIIIZZ(beq, "rootView.status_view");
            C77591Ucl c77591Ucl2 = this.LJLJJI;
            if (c77591Ucl2 != null) {
                C32357Cmv c32357Cmv = new C32357Cmv(beq, c77591Ucl2);
                this.LJLL = c32357Cmv;
                LayoutInflater layoutInflater = getLayoutInflater();
                o.LJIIIIZZ(layoutInflater, "layoutInflater");
                c32357Cmv.LIZIZ(layoutInflater, new C32360Cmy(this));
                C41081jM c41081jM2 = (C41081jM) _$_findCachedViewById(R.id.h4j);
                if (c41081jM2 != null) {
                    C16880lQ.LJJIIZI(c41081jM2, new ACListenerS33S0100000_13(this, 215));
                }
                View _$_findCachedViewById6 = _$_findCachedViewById(R.id.h4j);
                if (_$_findCachedViewById6 != null) {
                    View notification_close = _$_findCachedViewById6.findViewById(R.id.h4j);
                    o.LJIIIIZZ(notification_close, "notification_close");
                    C72259SXn.LIZIZ(notification_close, 5, 5, 5, 5);
                }
                vl().getClass();
                LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
                LiveRechargeAgreementConfig value = liveRoomRechargeAgreementConfigSetting.getValue();
                if (value == null) {
                    value = liveRoomRechargeAgreementConfigSetting.getDEFAULT();
                }
                boolean z = value.isShowRechargeLawInGlobal;
                TextView textView3 = (TextView) view.findViewById(R.id.lzg);
                C29306Beo.LJJLIIIJJI(textView3, z);
                if (z) {
                    String globalAgreementUrl = value.agreementForGlobal;
                    String hintAgreement = C15380j0.LJIILJJIL(R.string.ml7);
                    String lawName = C15380j0.LJIILJJIL(R.string.me0);
                    o.LJIIIIZZ(hintAgreement, "hintAgreement");
                    String LIZIZ = Q8U.LIZIZ(new Object[]{lawName}, 1, hintAgreement, "format(format, *args)");
                    SpannableString spannableString = new SpannableString(LIZIZ);
                    Context context = view.getContext();
                    if (context != null) {
                        o.LJIIIIZZ(globalAgreementUrl, "globalAgreementUrl");
                        BK7 bk7 = new BK7(globalAgreementUrl, context);
                        o.LJIIIIZZ(lawName, "lawName");
                        spannableString.setSpan(bk7, s.LJJLIIIJL(LIZIZ, lawName, 0, false, 6), lawName.length() + s.LJJLIIIJL(LIZIZ, lawName, 0, false, 6), 17);
                    }
                    textView3.setText(spannableString);
                    textView3.setHighlightColor(C15380j0.LIZIZ(R.color.cz));
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                }
                vl().getClass();
                LiveRechargeAgreementConfig value2 = liveRoomRechargeAgreementConfigSetting.getValue();
                if (value2 == null) {
                    value2 = liveRoomRechargeAgreementConfigSetting.getDEFAULT();
                }
                boolean z2 = value2.isShowRechargeLawInRegion;
                C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.m6t);
                C47121t6 c47121t62 = (C47121t6) view.findViewById(R.id.mj_);
                C29306Beo.LJJLIIIJJI(view.findViewById(R.id.zg), z2);
                if (z2) {
                    String str2 = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawUrl;
                    c47121t6.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawName);
                    C16880lQ.LJJIIZ(c47121t6, new ACListenerS44S1100000_5(view, str2, 7));
                    String str3 = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawUrl;
                    c47121t62.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawName);
                    C16880lQ.LJJIIZ(c47121t62, new ACListenerS44S1100000_5(view, str3, 8));
                }
                vl().LJZ.observe(getViewLifecycleOwner(), new AObserverS69S0300000_13(this, (C47121t6) view.findViewById(R.id.mph), view, 1));
                DataChannel dataChannel = this.LJLJJL;
                int zv0 = vl().zv0();
                int vv0 = vl().vv0();
                C77591Ucl c77591Ucl3 = this.LJLJJI;
                if (c77591Ucl3 != null) {
                    Map<String, String> map = c77591Ucl3.LIZIZ;
                    boolean LJIIJ = C29306Beo.LJIIJ(dataChannel);
                    ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
                    String str4 = "1";
                    int i2 = LJIIJ;
                    i2 = LJIIJ;
                    if (dataChannel == null && map != null) {
                        i2 = LJIIJ;
                        if (map.containsKey("is_anchor")) {
                            i2 = ujb.o.LJJJJIZL(map.get("is_anchor"), "1", false);
                        }
                    }
                    if (zv0 != 0) {
                        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_recharge_exchange_entrance_show", "live_detail", "request_page");
                        if (zv0 == -1) {
                            str = "ug_exchange";
                        } else {
                            str = "anchor_income";
                        }
                        LIZIZ2.LJIJJ(str, "charge_reason");
                        if (vv0 == 2) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        LIZIZ2.LJIJJ(Integer.valueOf(i), "could_exchange");
                        LIZIZ2.LJIJJ(Integer.valueOf(i2), "is_anchor");
                        if (!((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        LIZIZ2.LJIJJ(str4, "is_first_recharge");
                        LIZIZ2.LJIJJ("package", "first_recharge_exchange_entrance_page");
                        LIZIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
                        LIZIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
                        LIZIZ2.LJJIIJZLJL();
                    }
                    ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C77445UaP.class).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS65S0100000_13(this, 260));
                    ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(C77698UeU.class).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS65S0100000_13(this, 261));
                    vl().LLIIJLIL.observe(this, new AObserverS69S0200000_5((Object) this, (User) view, (InterfaceC88472Yns<? super User, C76800UCe>) 43));
                    vl().Kv0(this);
                    RechargeViewModel vl = vl();
                    if (vl.LLIIIL == null) {
                        vl.LLIIIL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new C77635UdT());
                    }
                    vl().Ev0();
                    RechargeViewModel vl2 = vl();
                    C73411SrX c73411SrX2 = vl2.LJLLI;
                    if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = vl2.LJLLI) != null) {
                        c73411SrX.dispose();
                    }
                    vl2.LJLLI = (C73411SrX) C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).getNotifications("recharge_panel")).LJJJLIIL(new AfS65S0100000_13(vl2, 257), BF3.LJLIL);
                    return;
                }
                o.LJIJI("rechargeDialogConfig");
                throw null;
            }
            o.LJIJI("rechargeDialogConfig");
            throw null;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    @Override // X.InterfaceC77595Ucp
    public final void s8(int i, long j) {
        Resources resources;
        C13E c13e;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && mo49getActivity.isFinishing()) {
            return;
        }
        String str = null;
        if (this.LJLJLLL == null) {
            Context context = getContext();
            if (context != null) {
                c13e = new C13E(context);
            } else {
                c13e = null;
            }
            this.LJLJLLL = c13e;
        }
        C13E c13e2 = this.LJLJLLL;
        if (c13e2 != null) {
            if (i == 0) {
                str = "";
            } else {
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    str = resources.getString(i);
                }
            }
            DialogC31813Ce9 dialogC31813Ce9 = c13e2.LIZ;
            dialogC31813Ce9.LJLILLLLZI = str;
            T4W t4w = dialogC31813Ce9.LJLJI;
            if (t4w != null) {
                t4w.setMessage(str);
            }
        }
        C13E c13e3 = this.LJLJLLL;
        if (c13e3 != null) {
            if (j > 0) {
                IDHandlerS13S0100000 iDHandlerS13S0100000 = c13e3.LIZIZ;
                Message obtain = Message.obtain();
                obtain.what = 10;
                iDHandlerS13S0100000.sendMessageDelayed(obtain, j);
                return;
            }
            C29306Beo.LJJJJIZL(c13e3.LIZ);
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void df(int i, int i2, Exception exception) {
        View view;
        ViewGroup viewGroup;
        Drawable drawable;
        String str;
        Boolean bool;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        BEQ beq;
        View _$_findCachedViewById;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(exception, "exception");
        InterfaceC77682UeE interfaceC77682UeE = this.LJLJI;
        if (interfaceC77682UeE != null) {
            String message = exception.getMessage();
            if (message == null) {
                message = "api exception";
            }
            interfaceC77682UeE.LIZIZ(0, i, message);
        }
        Boolean bool2 = null;
        if (vl().zv0() != 0 && !this.LJLLI) {
            this.LJLLI = true;
            ViewStub viewStub = (ViewStub) _$_findCachedViewById(R.id.d0y);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            this.LJLJLJ = viewGroup;
            if (viewGroup != null) {
                C16880lQ.LJIIL(viewGroup, new ACListenerS33S0100000_13(this, 213));
                long hv0 = vl().hv0();
                TextView textView = (TextView) _$_findCachedViewById(R.id.m5g);
                if (textView != null) {
                    textView.setText(String.valueOf(hv0));
                }
                vl().LLIIJLIL.observe(this, new AObserverS81S0100000_13(this, 77));
                Drawable LJI = C15380j0.LJI(R.drawable.cub);
                if (LJI != null) {
                    drawable = LJI.mutate();
                } else {
                    drawable = null;
                }
                int LIZ = C15380j0.LIZ(16.0f);
                if (drawable != null) {
                    drawable.setBounds(0, 0, LIZ, LIZ);
                }
                if (CCJ.LIZ(getContext())) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.m5g);
                    if (appCompatTextView != null) {
                        appCompatTextView.setCompoundDrawables(null, null, drawable, null);
                    }
                } else {
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(R.id.m5g);
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setCompoundDrawables(drawable, null, null, null);
                    }
                }
                WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
                InterfaceC11100c6.LIZ.getClass();
                InterfaceC77573UcT interfaceC77573UcT = (InterfaceC77573UcT) C11090c5.LIZ().LIZIZ(InterfaceC77573UcT.class);
                if (interfaceC77573UcT != null) {
                    str = interfaceC77573UcT.getTitle();
                } else {
                    str = null;
                }
                if (!C29306Beo.LJIJJLI(str)) {
                    RevenueExchange revenueExchange = walletStruct.revenue;
                    if (revenueExchange != null) {
                        bool = Boolean.valueOf(revenueExchange.isRevenue());
                    } else {
                        bool = null;
                    }
                    if (C29306Beo.LJJIFFI(bool)) {
                        if (walletStruct.isPeriodicPayout) {
                            str = C15380j0.LJIILJJIL(R.string.l1p);
                        } else {
                            str = C15380j0.LJIILJJIL(R.string.l48);
                        }
                    } else if (vl().zv0() == -1) {
                        str = C15380j0.LJIILJJIL(R.string.l4_);
                    } else if (walletStruct.isPeriodicPayout) {
                        str = C15380j0.LJIILJJIL(R.string.l2e);
                    } else {
                        str = C15380j0.LJIILJJIL(R.string.l49);
                    }
                }
                ((TextView) _$_findCachedViewById(R.id.cxz)).setText(str);
                if (vl().xv0() > 0 && !vl().Dv0()) {
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.m5i);
                    if (_$_findCachedViewById2 != null) {
                        _$_findCachedViewById2.setVisibility(0);
                    }
                    TextView textView2 = (TextView) _$_findCachedViewById(R.id.m5i);
                    if (textView2 != null) {
                        textView2.setText(getResources().getQuantityString(R.plurals.oj, (int) vl().xv0(), String.valueOf(vl().xv0())));
                    }
                }
                C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.cxr), new ACListenerS33S0100000_13(this, 214));
                C77681UeD c77681UeD = (C77681UeD) _$_findCachedViewById(R.id.cxq);
                if (c77681UeD != null) {
                    c77681UeD.post(new ARunnableS49S0100000_13(c77681UeD, 179));
                }
                ((C77681UeD) _$_findCachedViewById(R.id.cxq)).setOnScrollEndListener(new C77670Ue2(this));
                TextView textView3 = (TextView) _$_findCachedViewById(R.id.cxr);
                if (textView3 != null) {
                    textView3.setText(C77480Uay.LIZIZ(vl().zv0()));
                }
                TextView textView4 = (TextView) _$_findCachedViewById(R.id.cxz);
                if (textView4 != null) {
                    if (vl().vv0() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    textView4.setEnabled(z);
                }
                TextView textView5 = (TextView) _$_findCachedViewById(R.id.cxr);
                if (textView5 != null) {
                    if (vl().vv0() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    textView5.setEnabled(z2);
                }
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.cxk);
                if (_$_findCachedViewById3 != null) {
                    if (vl().vv0() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    _$_findCachedViewById3.setEnabled(z3);
                }
            }
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.g2q);
        if (_$_findCachedViewById4 != null) {
            C87277YNd.LJJIIZ(_$_findCachedViewById4);
        }
        if (vl().Cv0() && (_$_findCachedViewById = _$_findCachedViewById(R.id.kfc)) != null && (layoutParams = _$_findCachedViewById.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.kfc);
        if (_$_findCachedViewById5 != null) {
            C87277YNd.LJJIJ(_$_findCachedViewById5);
        }
        View view2 = getView();
        if (view2 != null && (beq = (BEQ) view2.findViewById(R.id.kf_)) != null) {
            beq.LIZJ();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.post(new ARunnableS16S0201000_13(i, this, exception, 0));
        }
        wl();
        C77591Ucl c77591Ucl = this.LJLJJI;
        if (c77591Ucl != null) {
            if (this.LJLL != null) {
                if (C32355Cmt.LIZ.LJLILLLLZI.isWebRechargeAllowed && LiveWalletWebAppGuideAvailable.INSTANCE.isPanelAvailable()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                bool2 = Boolean.valueOf(z4);
            }
            Map LJJL = C113554cx.LJJL(new OSZ("has_to_tiktok_com_option", String.valueOf(C29306Beo.LJJIFFI(bool2) ? 1 : 0)), new OSZ("request_page", c77591Ucl.LJIIJJI));
            BZI LIZ2 = C28787BRn.LIZ("livesdk_get_package_failed_page_show");
            LIZ2.LJJIFFI(LJJL);
            LIZ2.LJJIFFI(c77591Ucl.LIZIZ);
            LIZ2.LJJIIJZLJL();
            C77630UdO.LJII(exception);
            return;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (vl().Cv0()) {
            i = R.layout.d0c;
        } else {
            i = R.layout.d0b;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xl(com.bytedance.android.livesdk.wallet.Diamond r21, X.C77612Ud6 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeDialogNew.xl(com.bytedance.android.livesdk.wallet.Diamond, X.Ud6, boolean):void");
    }

    @Override // X.InterfaceC77595Ucp
    public final void B4(int i, int i2, int i3, C77518Uba c77518Uba) {
        int i4;
        InterfaceC77682UeE interfaceC77682UeE = this.LJLJI;
        if (interfaceC77682UeE != null) {
            interfaceC77682UeE.LIZ(c77518Uba.LIZ);
        }
        Map<String, Object> map = c77518Uba.LJFF;
        C77591Ucl c77591Ucl = this.LJLJJI;
        if (c77591Ucl != null) {
            map.put("request_page", c77591Ucl.LJIIJJI);
            Exception exc = c77518Uba.LIZ;
            String tv0 = vl().tv0();
            Diamond diamond = vl().LLIILII;
            if (diamond != null) {
                i4 = diamond.count;
            } else {
                i4 = 0;
            }
            UI8 ui8 = new UI8(i, i2, i3, exc, true, tv0, i4, false);
            ui8.LJIIJJI = vl().uv0();
            c77518Uba.LJ = ui8;
            if (i2 == 206 && i3 == 1) {
                Al(false);
            }
            HashMap hashMap = new HashMap();
            C77591Ucl c77591Ucl2 = this.LJLJJI;
            if (c77591Ucl2 != null) {
                hashMap.put("gift_enter_from", c77591Ucl2.LJIILIIL);
                UI8 ui82 = c77518Uba.LJ;
                if (ui82 != null) {
                    ui82.LJIIIIZZ = hashMap;
                }
                C77607Ud1.LIZ().LIZ(getContext(), "recharge_pay_fail", c77518Uba);
                return;
            }
            o.LJIJI("rechargeDialogConfig");
            throw null;
        }
        o.LJIJI("rechargeDialogConfig");
        throw null;
    }
}

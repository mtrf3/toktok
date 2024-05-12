package kotlin.jvm.internal;

import X.AML;
import X.ARI;
import X.AbstractC26082ALm;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.B1V;
import X.C113554cx;
import X.C163586bS;
import X.C16880lQ;
import X.C173936s9;
import X.C186997Vn;
import X.C19N;
import X.C1DD;
import X.C1XY;
import X.C2068389v;
import X.C212428Vi;
import X.C240719cZ;
import X.C246689mC;
import X.C246709mE;
import X.C246799mN;
import X.C26045AKb;
import X.C26192APs;
import X.C26197APx;
import X.C26227ARb;
import X.C26335AVf;
import X.C26566Abi;
import X.C26610AcQ;
import X.C26730AeM;
import X.C26804AfY;
import X.C27042AjO;
import X.C27111AkV;
import X.C27773AvB;
import X.C27777AvF;
import X.C27858AwY;
import X.C27901AxF;
import X.C27945Axx;
import X.C27946Axy;
import X.C27949Ay1;
import X.C32151Nz;
import X.C33381Ss;
import X.C34K;
import X.C36636EZk;
import X.C38306F1q;
import X.C38333F2r;
import X.C3AW;
import X.C43I;
import X.C45804HyK;
import X.C51655KPb;
import X.C57285Me1;
import X.C59367NRr;
import X.C63044Ooi;
import X.C70920RsS;
import X.C71096RvI;
import X.C72242sW;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C77125UOr;
import X.C78565UsT;
import X.C78946Uyc;
import X.C8HZ;
import X.C8W0;
import X.C9XF;
import X.C9XG;
import X.EnumC246719mF;
import X.EnumC26196APw;
import X.FMX;
import X.InterfaceC242099en;
import X.InterfaceC41201GEz;
import X.InterfaceC73150SnK;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.KPJ;
import X.MBB;
import X.ORZ;
import X.OSZ;
import X.OUP;
import X.SY4;
import X.UC0;
import X.X1D;
import X.XKX;
import X.Y01;
import Y.ARunnableS40S0100000_4;
import Y.IDAListenerS73S0100000_4;
import Y.IDCSpanS2S0200000_4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalMainOrderInfoVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSimilarSoundsAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem;
import com.ss.android.ugc.aweme.tag.assem.SelectedWidgetAssem;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarViewerEntranceComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class AqS167S0200000_4 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case 33:
                return invoke$33(this, obj, obj2);
            case 34:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case 36:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(AML selectSubscribe, C26566Abi c26566Abi) {
        boolean z;
        List<Announcement> announcement;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        BillInfoData billInfoData = ((OrderSubmitFragment) this.l0).getViewModel().LJZ;
        boolean z2 = false;
        if (billInfoData != null && (announcement = billInfoData.getAnnouncement()) != null && !announcement.isEmpty()) {
            Iterator<Announcement> it = announcement.iterator();
            while (it.hasNext()) {
                Integer materialType = it.next().getMaterialType();
                if (materialType != null && materialType.intValue() == 2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        BillInfoData billInfoData2 = ((OrderSubmitFragment) this.l0).getViewModel().LJZ;
        if (billInfoData2 != null && (o.LJ(billInfoData2.getVersion(), "3") || o.LJ(billInfoData2.getVersion(), "5") || o.LJ(billInfoData2.getVersion(), "7"))) {
            z2 = true;
        }
        if (!z2 || c26566Abi == null || !c26566Abi.LJI || z) {
            ((TextView) ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asx)).setText("");
            View brief_address_bar = ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asw);
            o.LJIIIIZZ(brief_address_bar, "brief_address_bar");
            brief_address_bar.setVisibility(8);
            return;
        }
        ((TextView) ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asx)).setText(((OrderSubmitFragment) this.l0).getViewModel().Rv0((Context) this.l1, c26566Abi));
        IOspFragmentStyle iOspFragmentStyle = (IOspFragmentStyle) UC0.LJIIJJI((OrderSubmitFragment) this.l0, "order_submit", null, null, null, 14);
        if (iOspFragmentStyle != null) {
            ((TuxTextView) ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asx)).setTuxFont(iOspFragmentStyle.getBriefAddrFont());
        }
        View brief_address_bar2 = ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asw);
        o.LJIIIIZZ(brief_address_bar2, "brief_address_bar");
        C16880lQ.LJIIJ(new Au2S14S0200000_4((OrderSubmitFragment) this.l0, c26566Abi, 4), brief_address_bar2);
        View brief_address_bar3 = ((OrderSubmitFragment) this.l0)._$_findCachedViewById(R.id.asw);
        o.LJIIIIZZ(brief_address_bar3, "brief_address_bar");
        C78946Uyc.LJJIIJZLJL(brief_address_bar3, new C70920RsS(), C27901AxF.LJLIL, C27858AwY.LJLIL);
    }

    public final void invoke$1(AML selectSubscribe, int i) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (i == 4) {
            C73305Spp c73305Spp = (C73305Spp) ((ActivityC45651qj) this.l0).findViewById(R.id.keh);
            o.LJIIIIZZ(c73305Spp, "activity.statusView");
            c73305Spp.setVisibility(8);
            View findViewById = ((ActivityC45651qj) this.l0).findViewById(R.id.dx5);
            o.LJIIIIZZ(findViewById, "activity.global_empty_address_list_view");
            findViewById.setVisibility(0);
            View findViewById2 = ((ActivityC45651qj) this.l0).findViewById(R.id.mv8);
            o.LJIIIIZZ(findViewById2, "activity.us_add_new_address_btn");
            C16880lQ.LJIIJ(new Au2S14S0200000_4((AddressListViewModel) this.l1, (ActivityC45651qj) this.l0, 23), findViewById2);
            return;
        }
        View findViewById3 = ((ActivityC45651qj) this.l0).findViewById(R.id.dx5);
        o.LJIIIIZZ(findViewById3, "activity.global_empty_address_list_view");
        findViewById3.setVisibility(8);
    }

    public final void invoke$2(AML selectSubscribe, int i) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (i == 4) {
            C73305Spp c73305Spp = (C73305Spp) ((ActivityC45651qj) this.l0).findViewById(R.id.keh);
            o.LJIIIIZZ(c73305Spp, "activity.statusView");
            c73305Spp.setVisibility(8);
            View findViewById = ((ActivityC45651qj) this.l0).findViewById(R.id.lt6);
            o.LJIIIIZZ(findViewById, "activity.tts_us_empty_address_list_view");
            findViewById.setVisibility(0);
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.bcw;
            ((ActivityC45651qj) this.l0).findViewById(R.id.ftz).setBackground(c33381Ss.LIZ((ActivityC45651qj) this.l0));
            ((ActivityC45651qj) this.l0).findViewById(R.id.lt5).getClass();
            View findViewById2 = ((ActivityC45651qj) this.l0).findViewById(R.id.lt5);
            o.LJIIIIZZ(findViewById2, "activity.tts_us_add_new_address_btn");
            C16880lQ.LJIIJ(new Au2S14S0200000_4((AddressListViewModel) this.l1, (ActivityC45651qj) this.l0, 58), findViewById2);
            return;
        }
        View findViewById3 = ((ActivityC45651qj) this.l0).findViewById(R.id.lt6);
        o.LJIIIIZZ(findViewById3, "activity.tts_us_empty_address_list_view");
        findViewById3.setVisibility(8);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS167S0200000_4(android.view.View r3, com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 10: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.<init>(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget, int):void");
    }

    public static final Object invoke$0(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        String str;
        LogisticDTO logisticDTO = (LogisticDTO) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C63044Ooi c63044Ooi = (C63044Ooi) ((View) aqS167S0200000_4.l0).findViewById(R.id.iln);
        if (logisticDTO != null) {
            str = logisticDTO.logisticsServiceId;
        } else {
            str = null;
        }
        c63044Ooi.setChecked(o.LJ(str, ((LogisticDTO) aqS167S0200000_4.l1).logisticsServiceId));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        ElementDTO elementDTO;
        List<ElementDTO> LJIIJ;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (paymentInfo != null) {
            View view = (View) aqS167S0200000_4.l0;
            PaymentInfoVH paymentInfoVH = (PaymentInfoVH) aqS167S0200000_4.l1;
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null && (LJIIJ = paymentMethod.LJIIJ()) != null) {
                elementDTO = (ElementDTO) ORZ.LJLLLL(LJIIJ);
            } else {
                elementDTO = null;
            }
            if (elementDTO != null) {
                View super_element = view.findViewById(R.id.ktz);
                o.LJIIIIZZ(super_element, "super_element");
                OUP.LJJLIIIJ(super_element);
                ((B1V) view.findViewById(R.id.ktz)).LIZ(elementDTO, paymentInfo);
                OrderSubmitViewModel L = paymentInfoVH.L();
                L.getClass();
                L.setState(new AqS9S0010000_4(false, 47));
            } else {
                View super_element2 = view.findViewById(R.id.ktz);
                o.LJIIIIZZ(super_element2, "super_element");
                OUP.LJIJJLI(super_element2);
                OrderSubmitViewModel L2 = paymentInfoVH.L();
                L2.getClass();
                L2.setState(new AqS9S0010000_4(true, 47));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        Announcement announcement = (Announcement) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (announcement != null) {
            View view = (View) aqS167S0200000_4.l0;
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) aqS167S0200000_4.l1;
            if (announcement.getText() != null && announcement.getLinkArguments() != null) {
                C45804HyK.LJJLL(view.findViewById(R.id.aqp));
                StringBuilder sb = new StringBuilder(announcement.getText());
                for (Map.Entry<String, LinkText> entry : announcement.getLinkArguments().entrySet()) {
                    String str = entry.getValue().text;
                    if (str != null) {
                        C26730AeM.LIZ(sb, entry.getKey(), str);
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
                for (Map.Entry<String, LinkText> entry2 : announcement.getLinkArguments().entrySet()) {
                    String str2 = entry2.getValue().text;
                    if (str2 != null) {
                        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
                        int length = str2.length() + LJJLIIIJL;
                        if (LJJLIIIJL >= 0 && length <= sb.length()) {
                            spannableStringBuilder.setSpan(new IDCSpanS2S0200000_4(entry2, view, 1), LJJLIIIJL, length, 17);
                            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, length, 17);
                            Context context = view.getContext();
                            o.LJIIIIZZ(context, "context");
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(orderSubmitBottomWidget.getBottomBarStyle().getCashBackTextColor(), context)), LJJLIIIJL, length, 17);
                        }
                    }
                }
                ((TextView) view.findViewById(R.id.aqp)).setText(spannableStringBuilder);
                view.findViewById(R.id.aqp).setClickable(true);
                ((TextView) view.findViewById(R.id.aqp)).setMovementMethod(LinkMovementMethod.getInstance());
                ((TextView) view.findViewById(R.id.aqp)).setHighlightColor(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        Integer num = (Integer) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (num != null) {
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) aqS167S0200000_4.l0;
            View view = (View) aqS167S0200000_4.l1;
            num.intValue();
            if (num.intValue() > 0 && ((orderSubmitBottomWidget.getBottomBarStyle().getForceShowItemCount() || orderSubmitBottomWidget.getViewModel().LJLJJLL != 0) && !C1XY.LJIL())) {
                SpannableString totalItemsText = orderSubmitBottomWidget.getTotalItemsText(num.intValue());
                TextView textView = (TextView) view.findViewById(R.id.lis);
                if (textView != null) {
                    textView.setText(totalItemsText);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        StarlingKeyValue placeOrderButtonText;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str = null;
        if (!OspAsyncInflateSettings.LIZIZ() && ((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getViewModel().LLJJLIIIJLLLLLLLZ) {
            ((TextView) ((View) aqS167S0200000_4.l1).findViewById(R.id.hqz)).setText((CharSequence) null);
            ((SY4) ((View) aqS167S0200000_4.l1).findViewById(R.id.hqz)).setLoading(true);
        } else {
            ((SY4) ((View) aqS167S0200000_4.l1).findViewById(R.id.hqz)).setLoading(false);
            TextView textView = (TextView) ((View) aqS167S0200000_4.l1).findViewById(R.id.hqz);
            BillInfoData billInfoData = ((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getViewModel().LJZ;
            if (billInfoData != null && (placeOrderButtonText = billInfoData.getPlaceOrderButtonText()) != null) {
                str = placeOrderButtonText.value;
            }
            textView.setText(str);
            if (!((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getBottomBarStyle().getCheckPlaceOrderEnableState()) {
                ((SY4) ((View) aqS167S0200000_4.l1).findViewById(R.id.hqz)).setEnabled(!o.LJ(obj, Boolean.TRUE));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue > 0 && ((((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getBottomBarStyle().getForceShowItemCount() || ((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getViewModel().LJLJJLL != 0) && !C1XY.LJIL())) {
            SpannableString totalItemsText = ((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getTotalItemsText(intValue);
            TextView textView = (TextView) ((View) aqS167S0200000_4.l1).findViewById(R.id.lis);
            if (textView != null) {
                textView.setText(totalItemsText);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        String str;
        String str2;
        String str3;
        String currency;
        final String str4;
        String str5;
        Summary summary;
        Price origin;
        Summary summary2;
        Price total;
        C27042AjO c27042AjO = (C27042AjO) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c27042AjO != null) {
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) aqS167S0200000_4.l0;
            final View view = (View) aqS167S0200000_4.l1;
            String str6 = "";
            if (o.LJ(orderSubmitBottomWidget.getViewModel().LLJJJJLIIL, Boolean.TRUE)) {
                BillInfoData billInfoData = orderSubmitBottomWidget.getViewModel().LJZ;
                if (billInfoData == null || (summary2 = billInfoData.getSummary()) == null || (total = summary2.getTotal()) == null || (str4 = total.getPriceStr()) == null) {
                    str4 = "";
                }
                BillInfoData billInfoData2 = orderSubmitBottomWidget.getViewModel().LJZ;
                if (billInfoData2 == null || (summary = billInfoData2.getSummary()) == null || (origin = summary.getOrigin()) == null || (str5 = origin.getPriceStr()) == null) {
                    str5 = "";
                }
                ((TextView) view.findViewById(R.id.lik)).setText(str5);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view.findViewById(R.id.lik), "translationY", 0.0f, C32151Nz.LJIIZILJ(4));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view.findViewById(R.id.lik), "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view.findViewById(R.id.lik), "translationY", C32151Nz.LJIIZILJ(-4), 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view.findViewById(R.id.lik), "alpha", 0.0f, 1.0f);
                AnimatorSet LIZ = C1DD.LIZ(375L);
                LIZ.playTogether(ofFloat, ofFloat2);
                AnimatorSet LIZ2 = C1DD.LIZ(250L);
                LIZ2.playTogether(ofFloat4, ofFloat3);
                LIZ.addListener(new IDAListenerS73S0100000_4(LIZ2, 13));
                LIZ2.addListener(new Animator.AnimatorListener() { // from class: X.93m
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        o.LJIIIZ(animator, "animator");
                        ((TextView) view.findViewById(R.id.lik)).setText(str4);
                    }
                });
                LIZ.start();
                orderSubmitBottomWidget.getViewModel().LLJJJJLIIL = Boolean.FALSE;
            } else {
                TextView textView = (TextView) view.findViewById(R.id.lik);
                Price price = c27042AjO.LIZIZ;
                if (price == null || (str = price.getPriceStr()) == null) {
                    str = "";
                }
                textView.setText(str);
            }
            if (!orderSubmitBottomWidget.totalTextShown) {
                orderSubmitBottomWidget.totalTextShown = true;
                C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
                HashMap<String, Object> fw0 = orderSubmitBottomWidget.getViewModel().fw0(false);
                Price price2 = c27042AjO.LIZIZ;
                if (price2 == null || (str2 = price2.getPriceVal()) == null) {
                    str2 = "";
                }
                fw0.put("total_payment", str2);
                Price price3 = c27042AjO.LIZJ;
                if (price3 == null || (str3 = price3.getPriceVal()) == null) {
                    str3 = "";
                }
                fw0.put("discount_amount", str3);
                Price price4 = c27042AjO.LIZIZ;
                if (price4 != null && (currency = price4.getCurrency()) != null) {
                    str6 = currency;
                }
                fw0.put("currency", str6);
                C27949Ay1.LJJIFFI(c27949Ay1, "total", fw0, null, null, null, null, null, 2044);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((OrderSubmitBottomWidget) aqS167S0200000_4.l0).hideSummaryPanel = booleanValue;
        ImageView title_toggle_icon = (ImageView) ((View) aqS167S0200000_4.l1).findViewById(R.id.lam);
        o.LJIIIIZZ(title_toggle_icon, "title_toggle_icon");
        title_toggle_icon.setVisibility(8);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        InterfaceC73150SnK selectSubscribe = (InterfaceC73150SnK) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.withState(((OrderSubmitBottomWidget) aqS167S0200000_4.l0).getViewModel(), new AqS47S0110000_4((View) aqS167S0200000_4.l1, booleanValue, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        InterfaceC88471Ynr<? super PhoneCredit, ? super Boolean, C76800UCe> interfaceC88471Ynr;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C27111AkV c27111AkV = (C27111AkV) ((View) aqS167S0200000_4.l0).findViewById(R.id.hnw);
            if (c27111AkV != null && (interfaceC88471Ynr = c27111AkV.LJLILLLLZI) != null) {
                interfaceC88471Ynr.invoke(c27111AkV.LJLIL, Boolean.FALSE);
            }
            OrderSubmitViewModel L = ((GlobalMainOrderInfoVH) aqS167S0200000_4.l1).L();
            L.getClass();
            L.setState(new AqS9S0010000_4(false, 46));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String id = (String) obj2;
        o.LJIIIZ(id, "id");
        ((GlobalMainOrderInfoVH) aqS167S0200000_4.l0).L().Jv0(((C27945Axx) aqS167S0200000_4.l1).LJLIL, intValue, id);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        View view;
        Window window;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        EditText input = ((C71096RvI) aqS167S0200000_4.l0).getInput();
        Context context = ((C71096RvI) aqS167S0200000_4.l0).getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
        if (LIZJ != null && (window = LIZJ.getWindow()) != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        if (o.LJ(input, view)) {
            int[] iArr = new int[2];
            ((C71096RvI) aqS167S0200000_4.l0).getLocationInWindow(iArr);
            if (booleanValue) {
                if (intValue < ((C71096RvI) aqS167S0200000_4.l0).getMeasuredHeight() + iArr[1]) {
                    OrderSubmitViewModel L = ((GlobalMainOrderInfoVH) aqS167S0200000_4.l1).L();
                    int measuredHeight = (((C71096RvI) aqS167S0200000_4.l0).getMeasuredHeight() + iArr[1]) - intValue;
                    L.getClass();
                    L.setState(new AqS29S0001000_4(measuredHeight, 17));
                }
            }
            OrderSubmitViewModel L2 = ((GlobalMainOrderInfoVH) aqS167S0200000_4.l1).L();
            L2.getClass();
            L2.setState(new AqS29S0001000_4(0, 17));
        }
        ((GlobalMainOrderInfoVH) aqS167S0200000_4.l1).L().LLIIII = booleanValue;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            ((B1V) ((View) aqS167S0200000_4.l0).findViewById(R.id.ktz)).LIZIZ();
            ((PaymentInfoVH) aqS167S0200000_4.l1).L().Ov0(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        C9XG updatedState = (C9XG) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(updatedState, "updatedState");
        int i = C9XF.LIZ[updatedState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).Ej();
                    BaseProfileSignatureAssem baseProfileSignatureAssem = (BaseProfileSignatureAssem) aqS167S0200000_4.l0;
                    InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = baseProfileSignatureAssem.LJLJJLL;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(baseProfileSignatureAssem.x3().getState().LJLJI);
                    }
                }
            } else {
                ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).LJJI();
            }
        } else {
            ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).K3();
            ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).Ej();
            BaseProfileSignatureAssem baseProfileSignatureAssem2 = (BaseProfileSignatureAssem) aqS167S0200000_4.l0;
            InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2 = baseProfileSignatureAssem2.LJLJJLL;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(baseProfileSignatureAssem2.x3().getState().LJLIL);
            }
            if (o.LJ(((BaseProfileSignatureAssem) aqS167S0200000_4.l0).x3().getState().LJLILLLLZI, Y01.LIZIZ.LJJIIZI())) {
                ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).M3((View) aqS167S0200000_4.l1);
            } else if (((BaseProfileSignatureAssem) aqS167S0200000_4.l0).LJLJL) {
                C26045AKb c26045AKb = new C26045AKb((View) aqS167S0200000_4.l1);
                c26045AKb.LJIIIIZZ(R.string.io);
                c26045AKb.LJIIJ();
                ((BaseProfileSignatureAssem) aqS167S0200000_4.l0).LJLJL = false;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        EnumC246719mF enumC246719mF;
        C8W0 selectSubscribe = (C8W0) obj;
        C43I c43i = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (enumC246719mF = (EnumC246719mF) c43i.LIZ) != null) {
            SelectedWidgetAssem selectedWidgetAssem = (SelectedWidgetAssem) aqS167S0200000_4.l0;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS167S0200000_4.l1;
            switch (C246709mE.LIZ[enumC246719mF.ordinal()]) {
                case 1:
                    selectedWidgetAssem.C3(false);
                    Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
                    if (LIZLLL != null) {
                        InterfaceC41201GEz interfaceC41201GEz = (InterfaceC41201GEz) C59367NRr.LIZIZ(InterfaceC41201GEz.class);
                        if (interfaceC41201GEz != null) {
                            interfaceC41201GEz.sr(LIZLLL);
                        }
                        VideoTagFriendsListViewModel A3 = selectedWidgetAssem.A3();
                        A3.getClass();
                        XKX.LIZLLL(A3.getAssemVMScope(), C36636EZk.LIZ, null, new C246799mN(A3, LIZLLL, null), 2);
                        break;
                    }
                    break;
                case 2:
                    selectedWidgetAssem.C3(true);
                    selectedWidgetAssem.A3().nv0();
                    break;
                case 3:
                    Context context = selectedWidgetAssem.getContext();
                    if (context != null) {
                        ARI ari = new ARI(context);
                        ari.LJ(R.string.s27, new AqS170S0100000_4(selectedWidgetAssem, 920));
                        ari.LJIIIIZZ(R.string.s25, new AqS170S0100000_4(selectedWidgetAssem, 921));
                        C26227ARb LIZ = C3AW.LIZ(context);
                        LIZ.LJ(R.string.s29);
                        LIZ.LIZ(R.string.s28);
                        LIZ.LJIIL = ari;
                        LIZ.LJII = false;
                        LIZ.LJI().LIZLLL();
                        break;
                    }
                    break;
                case 4:
                    if (C186997Vn.LIZJ()) {
                        selectedWidgetAssem.v3(true);
                        break;
                    } else {
                        selectedWidgetAssem.x3();
                        break;
                    }
                case 5:
                case 6:
                    selectedWidgetAssem.C3(false);
                    C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
                    c26045AKb.LJIIIIZZ(R.string.s2a);
                    c26045AKb.LJIIJ();
                    if (C186997Vn.LIZJ()) {
                        selectedWidgetAssem.v3(false);
                        break;
                    }
                    break;
                case 7:
                    selectedWidgetAssem.C3(false);
                    C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
                    c26227ARb.LIZ(R.string.s1i);
                    UC0.LIZJ(c26227ARb, C246689mC.LJLIL);
                    c26227ARb.LJI().LIZLLL();
                    break;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        String str;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (str = (String) c43i.LIZ) != null && (!TextUtils.isEmpty(str))) {
            SelectedWidgetAssem selectedWidgetAssem = (SelectedWidgetAssem) aqS167S0200000_4.l0;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS167S0200000_4.l1;
            selectedWidgetAssem.C3(false);
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$23(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        Object obj2;
        boolean z;
        C26192APs c26192APs;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHiddenChangedEvent is ");
        if (c43i != null) {
            obj2 = c43i.LIZ;
        } else {
            obj2 = null;
        }
        LIZ.append(obj2);
        X1D.LIZIZ(LIZ);
        NavBarViewerEntranceComponent navBarViewerEntranceComponent = (NavBarViewerEntranceComponent) aqS167S0200000_4.l0;
        if (c43i != null && !((Boolean) c43i.LIZ).booleanValue()) {
            if (C26197APx.LIZ()) {
                NavBarViewerEntranceComponent navBarViewerEntranceComponent2 = (NavBarViewerEntranceComponent) aqS167S0200000_4.l0;
                if (navBarViewerEntranceComponent2.pendingShowUserInfo != null) {
                    NavBarViewerEntranceComponent.tryShowViewerEntrance$default(navBarViewerEntranceComponent2, false, 1, null);
                }
            }
            NavBarViewerEntranceComponent navBarViewerEntranceComponent3 = (NavBarViewerEntranceComponent) aqS167S0200000_4.l0;
            if (!navBarViewerEntranceComponent3.onShowReported) {
                C26335AVf.LJIILLIIL(navBarViewerEntranceComponent3.getViewerHistorySettingMob(), ((NavBarViewerEntranceComponent) aqS167S0200000_4.l0).getUnReadViewerCount(), "show");
                ((NavBarViewerEntranceComponent) aqS167S0200000_4.l0).currentStyle = EnumC26196APw.NORMAL;
            }
            z = true;
        } else {
            ((C34K) aqS167S0200000_4.l1).element = false;
            z = false;
        }
        navBarViewerEntranceComponent.onShowReported = z;
        if (c43i != null && ((Boolean) c43i.LIZ).booleanValue() && C26197APx.LIZ() && (c26192APs = ((NavBarViewerEntranceComponent) aqS167S0200000_4.l0).entranceView) != null) {
            c26192APs.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        List<ITEM> list;
        C8HZ it = (C8HZ) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = (LinearLayout) aqS167S0200000_4.l0;
        LinearLayout linearLayout2 = (LinearLayout) aqS167S0200000_4.l1;
        if (C19N.LJ("creator_m10n_android_paid_content_anchor_awareness_enabled", false) && (list = it.LJLJJI) != 0 && list.size() == 1) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        Aweme aweme;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Iterator<Aweme> it = ((KPJ) aqS167S0200000_4.l0).LJIIIZ().getState().LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                if (o.LJ(aweme.getAid(), obj)) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            ((InterfaceC242099en) aqS167S0200000_4.l1).M0(aweme2);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        aqS167S0200000_4.invoke$1((AML) obj, ((Number) obj2).intValue());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r3 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$27(kotlin.jvm.internal.AqS167S0200000_4 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r16
            r3 = r17
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r5 = r0.getVm()
            java.lang.Object r1 = r15.l1
            android.view.View r1 = (android.view.View) r1
            r0 = 2131374760(0x7f0a32a8, float:1.8369649E38)
            android.view.View r6 = r1.findViewById(r0)
            java.lang.String r0 = "review_filter_group"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            java.lang.String r7 = "review_entrance"
            java.lang.String r8 = "impression_tag"
            r9 = 0
            r13 = 0
            if (r3 == 0) goto L54
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L56
            java.lang.String r12 = r0.toString()
        L38:
            java.lang.Integer r13 = r3.count
        L3a:
            r14 = 1
            r5.Lw0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r0.getVm()
            X.RkI r2 = r0.LLFII
            if (r2 == 0) goto L51
            int r1 = r4 + 1
            java.lang.String r0 = "review_entrance"
            r2.LJJIJIIJI(r1, r3, r0)
        L51:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L54:
            r10 = r9
            r11 = r9
        L56:
            r12 = r9
            if (r3 == 0) goto L3a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$27(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r3 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$28(kotlin.jvm.internal.AqS167S0200000_4 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r16
            r3 = r17
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r5 = r0.getVm()
            java.lang.Object r1 = r15.l1
            android.view.View r1 = (android.view.View) r1
            r0 = 2131374760(0x7f0a32a8, float:1.8369649E38)
            android.view.View r6 = r1.findViewById(r0)
            java.lang.String r0 = "review_filter_group"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            java.lang.String r7 = "shop_review_entrance"
            java.lang.String r8 = "impression_tag"
            r9 = 0
            r13 = 0
            if (r3 == 0) goto L54
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L56
            java.lang.String r12 = r0.toString()
        L38:
            java.lang.Integer r13 = r3.count
        L3a:
            r14 = 2
            r5.Lw0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r0.getVm()
            X.RkI r2 = r0.LLFII
            if (r2 == 0) goto L51
            int r1 = r4 + 1
            java.lang.String r0 = "shop_review_entrance"
            r2.LJJIJIIJI(r1, r3, r0)
        L51:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L54:
            r10 = r9
            r11 = r9
        L56:
            r12 = r9
            if (r3 == 0) goto L3a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$28(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$29(kotlin.jvm.internal.AqS167S0200000_4 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r0 = r16
            r3 = r17
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r5 = r0.getVm()
            java.lang.Object r1 = r15.l1
            android.view.View r1 = (android.view.View) r1
            r0 = 2131376603(0x7f0a39db, float:1.8373387E38)
            android.view.View r6 = r1.findViewById(r0)
            java.lang.String r0 = "star_review_filter_group"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            java.lang.String r7 = "shop_review_entrance"
            r13 = 0
            if (r3 == 0) goto L77
            java.lang.String r1 = r3.filterId
        L2b:
            java.lang.String r0 = "102"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L3f
            if (r3 == 0) goto L75
            java.lang.String r1 = r3.filterId
        L37:
            java.lang.String r0 = "101"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L72
        L3f:
            java.lang.String r8 = "keyword"
        L41:
            r9 = 0
            if (r3 == 0) goto L6c
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L6e
            java.lang.String r12 = r0.toString()
        L50:
            java.lang.Integer r13 = r3.count
        L52:
            r14 = 2
            r5.Lw0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r0.getVm()
            X.RkI r2 = r0.LLFII
            if (r2 == 0) goto L69
            int r1 = r4 + 1
            java.lang.String r0 = "shop_review_entrance"
            r2.LJJIJIIJI(r1, r3, r0)
        L69:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6c:
            r10 = r13
            r11 = r13
        L6e:
            r12 = r13
            if (r3 == 0) goto L52
            goto L50
        L72:
            java.lang.String r8 = "rate"
            goto L41
        L75:
            r1 = r13
            goto L37
        L77:
            r1 = r13
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$29(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        InterfaceC88471Ynr<? super PhoneCredit, ? super Boolean, C76800UCe> interfaceC88471Ynr;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C27111AkV c27111AkV = (C27111AkV) ((View) aqS167S0200000_4.l0).findViewById(R.id.hnw);
            if (c27111AkV != null && (interfaceC88471Ynr = c27111AkV.LJLILLLLZI) != null) {
                interfaceC88471Ynr.invoke(c27111AkV.LJLIL, Boolean.FALSE);
            }
            OrderSubmitViewModel L = ((MainOrderInfoVH) aqS167S0200000_4.l1).L();
            L.getClass();
            L.setState(new AqS9S0010000_4(false, 46));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        UserState execute = (UserState) obj;
        AbstractC26082ALm follow = (AbstractC26082ALm) obj2;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(follow, "follow");
        if (follow instanceof C173936s9) {
            User m150clone = execute.getUser().m150clone();
            m150clone.setFollowStatus(((FollowStatus) ((C173936s9) follow).LIZ).followStatus);
            return UserState.copy$default(execute, m150clone, false, follow, null, null, 26, null);
        }
        if (follow instanceof C163586bS) {
            Throwable th = ((C163586bS) follow).LIZ;
            if ((th instanceof C38333F2r) && ((C57285Me1) aqS167S0200000_4.l0).LIZJ == 0) {
                RuntimeBehaviorServiceImpl.LJ().event(((UserViewModel) aqS167S0200000_4.l1).LJLJL, String.valueOf(((C38306F1q) th).getErrorCode()));
            }
        }
        return UserState.copy$default(execute, null, false, follow, null, null, 27, null);
    }

    public static final Object invoke$31(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        FMX.LJIIL("similar_song_show", C113554cx.LJJL(new OSZ("music_id", ((C240719cZ) aqS167S0200000_4.l0).LJLIL.getMusicId()), new OSZ("song_number", String.valueOf(((C240719cZ) aqS167S0200000_4.l0).LJLILLLLZI.LJLJJI)), new OSZ("to_user_id", ((OriginMusicArg) ((MusicCellSimilarSoundsAssem) aqS167S0200000_4.l1).LLFII.getValue()).getUserId())));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        PhoneCredit phoneCredit = (PhoneCredit) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        OrderSubmitViewModel L = ((GlobalMainOrderInfoVH) aqS167S0200000_4.l0).L();
        L.LLJ = phoneCredit;
        L.LLJI = 1;
        if (booleanValue) {
            ((GlobalMainOrderInfoVH) aqS167S0200000_4.l0).L().setState(C27777AvF.LJLIL);
            ((C72242sW) aqS167S0200000_4.l1).element = System.currentTimeMillis();
            C27949Ay1.LJIL();
        } else {
            OrderSubmitViewModel L2 = ((GlobalMainOrderInfoVH) aqS167S0200000_4.l0).L();
            L2.getClass();
            C78565UsT.LJJIJ(L2, MBB.INSTANCE, new C27773AvB(phoneCredit, L2, null));
            if (((C72242sW) aqS167S0200000_4.l1).element != -1) {
                C27949Ay1.LJJ(System.currentTimeMillis() - ((C72242sW) aqS167S0200000_4.l1).element, new HashMap());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r2.contains(r5.LIZ) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$33(kotlin.jvm.internal.AqS167S0200000_4 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.AfW r5 = (X.C26802AfW) r5
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            if (r5 == 0) goto L38
            java.lang.Object r0 = r3.l0
            X.AfY r0 = (X.C26804AfY) r0
            java.util.List<X.Ai9> r1 = r0.LIZLLL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            X.Ai9 r0 = (X.C26965Ai9) r0
            java.lang.String r0 = r0.LJIILIIL
            r2.add(r0)
            goto L1e
        L30:
            java.lang.String r0 = r5.LIZ
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L57
        L38:
            java.lang.Object r1 = r3.l1
            android.view.View r1 = (android.view.View) r1
            r0 = 2131371321(0x7f0a2539, float:1.8362673E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 0
            if (r5 == 0) goto L52
            java.lang.String r0 = r5.LIZIZ
            if (r0 == 0) goto L52
            int r0 = r0.length()
            if (r0 != 0) goto L5a
        L52:
            java.lang.String r1 = ""
        L54:
            r2.setText(r1)
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            if (r5 == 0) goto L54
            java.lang.String r1 = r5.LIZIZ
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$33(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$34(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        FMX.LJIIL("similar_song_show", C113554cx.LJJL(new OSZ("music_id", ((C240719cZ) aqS167S0200000_4.l0).LJLIL.getMusicId()), new OSZ("song_number", String.valueOf(((C240719cZ) aqS167S0200000_4.l0).LJLILLLLZI.LJLJJI)), new OSZ("to_user_id", ((HighlightSelectMusicSimilarSoundsAssem) aqS167S0200000_4.l1).LLFII.getValue())));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        String str;
        ReachableAddress reachableAddress = (ReachableAddress) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        boolean z = false;
        if (reachableAddress != null) {
            CompoundButton compoundButton = (CompoundButton) ((C26610AcQ) aqS167S0200000_4.l0)._$_findCachedViewById(R.id.iln);
            Address address = reachableAddress.address;
            if (address != null) {
                str = address.id;
            } else {
                str = null;
            }
            if (o.LJ(str, ((Address) aqS167S0200000_4.l1).id) && o.LJ(reachableAddress.reachable, Boolean.TRUE)) {
                z = true;
            }
            compoundButton.setChecked(z);
        } else {
            ((CompoundButton) ((C26610AcQ) aqS167S0200000_4.l0)._$_findCachedViewById(R.id.iln)).setChecked(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        PhoneCredit phoneCredit = (PhoneCredit) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        OrderSubmitViewModel L = ((MainOrderInfoVH) aqS167S0200000_4.l0).L();
        L.LLJ = phoneCredit;
        L.LLJI = 1;
        if (booleanValue) {
            ((MainOrderInfoVH) aqS167S0200000_4.l0).L().setState(C27777AvF.LJLIL);
            ((C72242sW) aqS167S0200000_4.l1).element = System.currentTimeMillis();
            C27949Ay1.LJIL();
        } else {
            OrderSubmitViewModel L2 = ((MainOrderInfoVH) aqS167S0200000_4.l0).L();
            L2.getClass();
            C78565UsT.LJJIJ(L2, MBB.INSTANCE, new C27773AvB(phoneCredit, L2, null));
            if (((C72242sW) aqS167S0200000_4.l1).element != -1) {
                C27949Ay1.LJJ(System.currentTimeMillis() - ((C72242sW) aqS167S0200000_4.l1).element, new HashMap());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r2.contains(r5.LIZ) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$37(kotlin.jvm.internal.AqS167S0200000_4 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.AfW r5 = (X.C26802AfW) r5
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            if (r5 == 0) goto L38
            java.lang.Object r0 = r3.l0
            X.AfY r0 = (X.C26804AfY) r0
            java.util.List<X.Ai9> r1 = r0.LIZLLL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            X.Ai9 r0 = (X.C26965Ai9) r0
            java.lang.String r0 = r0.LJIILIIL
            r2.add(r0)
            goto L1e
        L30:
            java.lang.String r0 = r5.LIZ
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L57
        L38:
            java.lang.Object r1 = r3.l1
            android.view.View r1 = (android.view.View) r1
            r0 = 2131371321(0x7f0a2539, float:1.8362673E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 0
            if (r5 == 0) goto L52
            java.lang.String r0 = r5.LIZIZ
            if (r0 == 0) goto L52
            int r0 = r0.length()
            if (r0 != 0) goto L5a
        L52:
            java.lang.String r1 = ""
        L54:
            r2.setText(r1)
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            if (r5 == 0) goto L54
            java.lang.String r1 = r5.LIZIZ
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$37(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$38(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        aqS167S0200000_4.invoke$2((AML) obj, ((Number) obj2).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS167S0200000_4 aqS167S0200000_4, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue == 4) {
            C73305Spp c73305Spp = (C73305Spp) ((ActivityC45651qj) aqS167S0200000_4.l0).findViewById(R.id.keh);
            C73306Spq c73306Spq = new C73306Spq();
            String string = ((ActivityC45651qj) aqS167S0200000_4.l0).getString(R.string.r9k);
            o.LJIIIIZZ(string, "activity.getString(R.str…elivery_page_ship_notice)");
            c73306Spq.LJFF = string;
            String string2 = ((ActivityC45651qj) aqS167S0200000_4.l0).getString(R.string.r9i);
            o.LJIIIIZZ(string2, "activity.getString(R.str…ry_page_ship_description)");
            c73306Spq.LJI = string2;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_unavailable_region;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJII = new AqS135S0200000_4((ActivityC45651qj) aqS167S0200000_4.l0, (AddressListViewModel) aqS167S0200000_4.l1, 330);
            c73305Spp.setStatus(c73306Spq);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String id = (String) obj2;
        o.LJIIIZ(id, "id");
        ((MainOrderInfoVH) aqS167S0200000_4.l0).L().Jv0(((C27946Axy) aqS167S0200000_4.l1).LJLIL, intValue, id);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        View view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        EditText input = ((C71096RvI) aqS167S0200000_4.l0).getInput();
        Context context = ((C71096RvI) aqS167S0200000_4.l0).getContext();
        o.LJIIIIZZ(context, "context");
        Window window = C77125UOr.LIZJ(context).getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        if (o.LJ(input, view)) {
            int[] iArr = new int[2];
            ((C71096RvI) aqS167S0200000_4.l0).getLocationInWindow(iArr);
            if (booleanValue) {
                if (intValue < ((C71096RvI) aqS167S0200000_4.l0).getMeasuredHeight() + iArr[1]) {
                    OrderSubmitViewModel L = ((MainOrderInfoVH) aqS167S0200000_4.l1).L();
                    int measuredHeight = (((C71096RvI) aqS167S0200000_4.l0).getMeasuredHeight() + iArr[1]) - intValue;
                    L.getClass();
                    L.setState(new AqS29S0001000_4(measuredHeight, 17));
                }
            }
            OrderSubmitViewModel L2 = ((MainOrderInfoVH) aqS167S0200000_4.l1).L();
            L2.getClass();
            L2.setState(new AqS29S0001000_4(0, 17));
        }
        ((MainOrderInfoVH) aqS167S0200000_4.l1).L().LLIIII = booleanValue;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((OrderSubmitFragment) aqS167S0200000_4.l0).getViewModel().LLIILZL = true;
        if (booleanValue) {
            View _$_findCachedViewById = ((OrderSubmitFragment) aqS167S0200000_4.l0)._$_findCachedViewById(R.id.ap_);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
            }
        } else {
            ((View) aqS167S0200000_4.l1).post(new ARunnableS40S0100000_4((OrderSubmitFragment) aqS167S0200000_4.l0, 30));
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        aqS167S0200000_4.invoke$0((AML) obj, (C26566Abi) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS167S0200000_4 aqS167S0200000_4, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        if (booleanValue) {
            ((PaymentFragment) aqS167S0200000_4.l0)._$_findCachedViewById(R.id.aom).setVisibility(8);
        } else {
            PaymentViewModel viewModel = ((PaymentFragment) aqS167S0200000_4.l0).getViewModel();
            viewModel.getClass();
            viewModel.setState(new AqS9S0010000_4(false, 0));
            ((View) aqS167S0200000_4.l1).post(new ARunnableS40S0100000_4((PaymentFragment) aqS167S0200000_4.l0, 33));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AqS167S0200000_4 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS167S0200000_4.invoke$9(kotlin.jvm.internal.AqS167S0200000_4, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(ActivityC45651qj activityC45651qj, AddressListViewModel addressListViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = addressListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C240719cZ c240719cZ, MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c240719cZ;
        this.l1 = musicCellSimilarSoundsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C240719cZ c240719cZ, HighlightSelectMusicSimilarSoundsAssem highlightSelectMusicSimilarSoundsAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = c240719cZ;
        this.l1 = highlightSelectMusicSimilarSoundsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C26610AcQ c26610AcQ, Address address, int i) {
        super(2);
        this.$t = i;
        this.l0 = c26610AcQ;
        this.l1 = address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C26804AfY c26804AfY, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c26804AfY;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(KPJ kpj, C51655KPb c51655KPb, int i) {
        super(2);
        this.$t = i;
        this.l0 = kpj;
        this.l1 = c51655KPb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C57285Me1 c57285Me1, UserViewModel userViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c57285Me1;
        this.l1 = userViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C71096RvI c71096RvI, MainOrderInfoVH mainOrderInfoVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = c71096RvI;
        this.l1 = mainOrderInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(C71096RvI c71096RvI, GlobalMainOrderInfoVH globalMainOrderInfoVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = c71096RvI;
        this.l1 = globalMainOrderInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(View view, LogisticDTO logisticDTO, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(View view, PaymentInfoVH paymentInfoVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = paymentInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(View view, MainOrderInfoVH mainOrderInfoVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = mainOrderInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(View view, GlobalMainOrderInfoVH globalMainOrderInfoVH, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = globalMainOrderInfoVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        super(2);
        this.$t = i;
        this.l0 = linearLayout;
        this.l1 = linearLayout2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(MainOrderInfoVH mainOrderInfoVH, C72242sW c72242sW, int i) {
        super(2);
        this.$t = i;
        this.l0 = mainOrderInfoVH;
        this.l1 = c72242sW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(MainOrderInfoVH mainOrderInfoVH, C27946Axy c27946Axy, int i) {
        super(2);
        this.$t = i;
        this.l0 = mainOrderInfoVH;
        this.l1 = c27946Axy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(OrderSubmitFragment orderSubmitFragment, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(OrderSubmitFragment orderSubmitFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(PaymentFragment paymentFragment, Activity activity, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentFragment;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(PaymentFragment paymentFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(PdpReviewHeadViewHolder pdpReviewHeadViewHolder, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpReviewHeadViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(PdpShopReviewHeadViewHolder pdpShopReviewHeadViewHolder, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpShopReviewHeadViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(GlobalMainOrderInfoVH globalMainOrderInfoVH, C72242sW c72242sW, int i) {
        super(2);
        this.$t = i;
        this.l0 = globalMainOrderInfoVH;
        this.l1 = c72242sW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(GlobalMainOrderInfoVH globalMainOrderInfoVH, C27945Axx c27945Axx, int i) {
        super(2);
        this.$t = i;
        this.l0 = globalMainOrderInfoVH;
        this.l1 = c27945Axx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(BaseProfileSignatureAssem baseProfileSignatureAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseProfileSignatureAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(SelectedWidgetAssem selectedWidgetAssem, ActivityC45651qj activityC45651qj, int i) {
        super(2);
        this.$t = i;
        this.l0 = selectedWidgetAssem;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS167S0200000_4(NavBarViewerEntranceComponent navBarViewerEntranceComponent, C34K c34k, int i) {
        super(2);
        this.$t = i;
        this.l0 = navBarViewerEntranceComponent;
        this.l1 = c34k;
    }
}

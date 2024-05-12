package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC253779xd;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass899;
import X.B04;
import X.B1J;
import X.C117114ih;
import X.C16880lQ;
import X.C237559Tz;
import X.C253509xC;
import X.C253519xD;
import X.C26610AcQ;
import X.C26635Acp;
import X.C27162AlK;
import X.C27591AsF;
import X.C27593AsH;
import X.C28064Azs;
import X.C32151Nz;
import X.C34K;
import X.C45804HyK;
import X.C4LX;
import X.C57846Mn4;
import X.C61841OOv;
import X.C67964Qls;
import X.C71763SEl;
import X.C73306Spq;
import X.C76542zS;
import X.C76732zl;
import X.C76800UCe;
import X.C7EI;
import X.EnumC53719L6l;
import X.EnumC67961Qlp;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ORZ;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import ujb.s;

/* loaded from: classes5.dex */
public class AqS50S0400000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(PaymentState it) {
        C117114ih c117114ih;
        boolean z;
        List<ElementDTO> LJI;
        o.LJIIIZ(it, "it");
        boolean LIZIZ = C61841OOv.LIZIZ(((B1J) this.l0).LIZ, it.getCheckedPaymentMethod());
        Availability availability = ((B1J) this.l0).LIZ.availability;
        if (availability != null && o.LJ(Boolean.FALSE, availability.isAvailable)) {
            LIZIZ = false;
        }
        ((PaymentMethodView) this.l1).setChecked(LIZIZ);
        ((PaymentMethodView) this.l1).setPaymentViewModel(((PaymentMethodViewHolder) this.l2).getViewModel());
        IPaymentFragmentStyle iPaymentFragmentStyle = (IPaymentFragmentStyle) this.l3;
        if (iPaymentFragmentStyle == null || iPaymentFragmentStyle.getPaymentDividerShow()) {
            PaymentMethodViewHolder paymentMethodViewHolder = (PaymentMethodViewHolder) this.l2;
            if (paymentMethodViewHolder.adapter.LJZL(paymentMethodViewHolder.latestItemPositionInternal + 1, false) != null) {
                PaymentMethodViewHolder paymentMethodViewHolder2 = (PaymentMethodViewHolder) this.l2;
                if ((paymentMethodViewHolder2.adapter.LJZL(paymentMethodViewHolder2.latestItemPositionInternal + 1, false) instanceof B1J) && (!LIZIZ || (LJI = ((B1J) this.l0).LIZ.LJI()) == null || LJI.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                c117114ih = new C117114ih(0, 0, 0, 0, z, C45804HyK.LJJI(16), false, 319);
            } else {
                c117114ih = new C117114ih(C27162AlK.LJIIIIZZ, 0, 0, 0, false, C45804HyK.LJJI(16), true, 126);
            }
            View itemView = ((PaymentMethodViewHolder) this.l2).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            itemView.setTag(R.id.bn_, c117114ih);
        }
        View iconEdit = ((PaymentMethodView) this.l1)._$_findCachedViewById(R.id.ea4);
        o.LJIIIIZZ(iconEdit, "iconEdit");
        C16880lQ.LJIIJ(new Au2S10S0300000_4((PaymentMethodView) this.l1, (B1J) this.l0, (PaymentMethodViewHolder) this.l2, 1), iconEdit);
        View iconEditSEA = ((PaymentMethodView) this.l1)._$_findCachedViewById(R.id.ea6);
        o.LJIIIIZZ(iconEditSEA, "iconEditSEA");
        C16880lQ.LJIIJ(new Au2S14S0200000_4((PaymentMethodViewHolder) this.l2, (B1J) this.l0, 6), iconEditSEA);
    }

    public static final Object invoke$0(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "edit");
        UsAddressItemVH usAddressItemVH = (UsAddressItemVH) aqS50S0400000_4.l0;
        boolean z = ((C34K) aqS50S0400000_4.l1).element;
        boolean LJ = ((Address) aqS50S0400000_4.l2).LJ();
        int bindingAdapterPosition = ((UsAddressItemVH) aqS50S0400000_4.l0).getBindingAdapterPosition() - 1;
        C26635Acp c26635Acp = (C26635Acp) aqS50S0400000_4.l3;
        usAddressItemVH.M(logView, z, LJ, bindingAdapterPosition, c26635Acp.LIZIZ, c26635Acp.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("click_area", "other");
        UsAddressItemVH usAddressItemVH = (UsAddressItemVH) aqS50S0400000_4.l0;
        boolean z = ((C34K) aqS50S0400000_4.l1).element;
        boolean LJ = ((Address) aqS50S0400000_4.l2).LJ();
        int bindingAdapterPosition = ((UsAddressItemVH) aqS50S0400000_4.l0).getBindingAdapterPosition() - 1;
        C26635Acp c26635Acp = (C26635Acp) aqS50S0400000_4.l3;
        usAddressItemVH.M(logView, z, LJ, bindingAdapterPosition, c26635Acp.LIZIZ, c26635Acp.LIZJ);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        aqS50S0400000_4.invoke$0((PaymentState) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        C57846Mn4 configUI = (C57846Mn4) obj;
        o.LJIIIZ(configUI, "$this$configUI");
        configUI.LJIIJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        configUI.LIZLLL = 203;
        configUI.LIZ = 101;
        configUI.LJ = 502;
        AbstractC253779xd abstractC253779xd = (AbstractC253779xd) aqS50S0400000_4.l0;
        final ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS50S0400000_4.l1;
        final Bundle bundle = (Bundle) aqS50S0400000_4.l2;
        abstractC253779xd.getClass();
        String string = activityC45651qj.getString(R.string.gng);
        o.LJIIIIZZ(string, "context.getString(\n     …l_empty_invite,\n        )");
        String string2 = activityC45651qj.getString(R.string.gnf, string);
        o.LJIIIIZZ(string2, "context.getString(\n     …viteFriendText,\n        )");
        int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        spannableStringBuilder.setSpan(new AnonymousClass899() { // from class: X.9a4
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//friends/invite");
                buildRoute.withParam("enter_from", bundle.getString("enter_from", ""));
                buildRoute.open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setLinearText(false);
            }
        }, LJJLIIIJL, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, length, 33);
        String string3 = activityC45651qj.getString(R.string.gnh);
        o.LJIIIIZZ(string3, "context.getString(R.stri…access_modal_empty_title)");
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LJFF = string3;
        c73306Spq.LJI = spannableStringBuilder;
        configUI.LJIIL = c73306Spq;
        Integer valueOf = Integer.valueOf(((Bundle) aqS50S0400000_4.l3).getInt("loading_style_key", -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        configUI.LIZIZ = valueOf;
        configUI.LJIL = C7EI.LIZ(EnumC53719L6l.INBOX_SUGGESTED_ACCOUNT);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        DialogOption[] dialogOptionArr = (DialogOption[]) aqS50S0400000_4.l0;
        C253509xC c253509xC = (C253509xC) aqS50S0400000_4.l2;
        Activity activity = (Activity) aqS50S0400000_4.l3;
        for (DialogOption dialogOption : dialogOptionArr) {
            int i = C253519xD.LIZ[dialogOption.optionStyle.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        actionGroup.LJFF(dialogOption.optionContent, new AqS108S0300000_4(c253509xC, dialogOption, activity, 43));
                    }
                } else {
                    actionGroup.LJIIIZ(dialogOption.optionContent, new AqS108S0300000_4(c253509xC, dialogOption, activity, 42));
                }
            } else {
                actionGroup.LJII(dialogOption.optionContent, new AqS108S0300000_4(c253509xC, dialogOption, activity, 41));
            }
        }
        actionGroup.LJI = o.LJ(UriProtector.getQueryParameter((Uri) aqS50S0400000_4.l1, "vertical"), "1");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS50S0400000_4 aqS50S0400000_4, Object it) {
        o.LJIIIZ(it, "it");
        new C237559Tz().LJI("ttelite_ba_video_product_publish_pop_click_try", new OSZ<>("dialog_type", Integer.valueOf(((C76732zl) aqS50S0400000_4.l0).element)));
        BAAnchorServiceImpl bAAnchorServiceImpl = (BAAnchorServiceImpl) aqS50S0400000_4.l1;
        Context context = (Context) aqS50S0400000_4.l2;
        bAAnchorServiceImpl.getClass();
        BAAnchorServiceImpl.LJIIIZ(2, context);
        ((InterfaceC65784Pro) aqS50S0400000_4.l3).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        UsAddressItemVH usAddressItemVH = (UsAddressItemVH) aqS50S0400000_4.l0;
        boolean z = ((C34K) aqS50S0400000_4.l1).element;
        boolean LJ = ((Address) aqS50S0400000_4.l2).LJ();
        int bindingAdapterPosition = ((UsAddressItemVH) aqS50S0400000_4.l0).getBindingAdapterPosition() - 1;
        C26635Acp c26635Acp = (C26635Acp) aqS50S0400000_4.l3;
        usAddressItemVH.M(logWhenShow, z, LJ, bindingAdapterPosition, c26635Acp.LIZIZ, c26635Acp.LIZJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        long j;
        PaymentInfo LIZLLL;
        C67964Qls paymentResult = (C67964Qls) obj;
        o.LJIIIZ(paymentResult, "paymentResult");
        Map<String, Long> map = B04.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Long l = (Long) linkedHashMap.get("google_pay");
        if (l != null) {
            long longValue = l.longValue();
            map.remove("google_pay");
            j = SystemClock.elapsedRealtime() - longValue;
        } else {
            j = 0;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap<String, Object> linkedHashMap3 = B04.LIZIZ;
        linkedHashMap2.putAll(linkedHashMap3);
        linkedHashMap2.put("page_name", "google_pay");
        linkedHashMap2.put("stay_time", Long.valueOf(j));
        Object obj2 = linkedHashMap3.get("page_name");
        if (obj2 != null) {
            linkedHashMap2.put("previous_page", obj2);
        }
        linkedHashMap2.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap2);
        linkedHashMap.clear();
        linkedHashMap3.clear();
        C28064Azs c28064Azs = (C28064Azs) aqS50S0400000_4.l0;
        c28064Azs.getClass();
        EnumC67961Qlp enumC67961Qlp = paymentResult.LIZ;
        String str = null;
        if (enumC67961Qlp == EnumC67961Qlp.Success) {
            JSONArray jSONArray = paymentResult.LIZIZ;
            if (jSONArray != null && (LIZLLL = GooglePayProcess.LIZLLL((PaymentInfo) aqS50S0400000_4.l1, jSONArray)) != null) {
                ((C28064Azs) aqS50S0400000_4.l0).LIZ(LIZLLL, null, (Boolean) aqS50S0400000_4.l2, new AqS154S0100000_4((PaymentHalfFragment) aqS50S0400000_4.l3, 9));
            }
        } else if (GooglePayProcess.LJ.contains(enumC67961Qlp)) {
            Resources resources = c28064Azs.LIZ.getResources();
            if (resources != null) {
                str = resources.getString(R.string.f2_);
            }
            c28064Azs.LIZIZ(str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        boolean z;
        AddressListState it = (AddressListState) obj;
        o.LJIIIZ(it, "it");
        if (((AddressAdapter.AddressViewHolder) aqS50S0400000_4.l0).L().Nv0() || ((AddressAdapter.AddressViewHolder) aqS50S0400000_4.l0).L().LJLLILLLL) {
            CompoundButton compoundButton = (CompoundButton) ((C26610AcQ) aqS50S0400000_4.l1)._$_findCachedViewById(R.id.iln);
            if (((ReachableAddress) aqS50S0400000_4.l2).isSelect || o.LJ(it.getSelectAddressId(), ((Address) aqS50S0400000_4.l3).id)) {
                z = true;
            } else {
                z = false;
            }
            compoundButton.setChecked(z);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        Object obj2;
        int i;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("module_name", "address");
        Boolean bool = ((ReachableAddress) aqS50S0400000_4.l0).addressValid;
        if (bool != null) {
            obj2 = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            obj2 = null;
        }
        logWhenShow.plusAssign("is_valid", obj2);
        logWhenShow.plusAssign("is_address_deliverable", Integer.valueOf(((C26610AcQ) aqS50S0400000_4.l1).getReachable() ? 1 : 0));
        logWhenShow.plusAssign("is_default", Integer.valueOf(((Address) aqS50S0400000_4.l2).LJ() ? 1 : 0));
        if (((AddressAdapter.AddressViewHolder) aqS50S0400000_4.l3).L().LJLLILLLL) {
            i = ((AddressAdapter.AddressViewHolder) aqS50S0400000_4.l3).latestItemPositionInternal;
        } else {
            i = ((AddressAdapter.AddressViewHolder) aqS50S0400000_4.l3).latestItemPositionInternal - 1;
        }
        logWhenShow.plusAssign("rank", Integer.valueOf(i));
        logWhenShow.plusAssign("is_selected", Integer.valueOf(((ReachableAddress) aqS50S0400000_4.l0).isSelect ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        SubPaymentListFragment subPaymentListFragment = (SubPaymentListFragment) aqS50S0400000_4.l0;
        assemble.mv0(subPaymentListFragment, new AqS50S0400000_4(subPaymentListFragment, (PaymentMethod) aqS50S0400000_4.l1, (EnterParams) aqS50S0400000_4.l2, (C27593AsH) aqS50S0400000_4.l3, 7));
        assemble.wv0((SubPaymentListFragment) aqS50S0400000_4.l0, C27591AsF.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        AqS154S0100000_4 aqS154S0100000_4;
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        SubPaymentListFragment subPaymentListFragment = (SubPaymentListFragment) aqS50S0400000_4.l0;
        String str = subPaymentListFragment.LJLILLLLZI;
        PaymentMethod paymentMethod = (PaymentMethod) aqS50S0400000_4.l1;
        boolean z = subPaymentListFragment.LJLJI;
        EnterParams enterParams = (EnterParams) aqS50S0400000_4.l2;
        C27593AsH c27593AsH = (C27593AsH) aqS50S0400000_4.l3;
        OSPHalfDialogContainerFragment LJIJ = g0.LJIJ(subPaymentListFragment);
        if (LJIJ == null) {
            aqS154S0100000_4 = new AqS154S0100000_4(subPaymentListFragment, 1266);
        } else {
            aqS154S0100000_4 = new AqS154S0100000_4(LJIJ, 1267);
        }
        hierarchyData.LIZ = new C71763SEl(str, paymentMethod, z, enterParams, c27593AsH, aqS154S0100000_4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS50S0400000_4 aqS50S0400000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = "";
        if (ORZ.LJLLLL((List) aqS50S0400000_4.l0) != null) {
            String text = ((DialogButton) ORZ.LJLLJ((List) aqS50S0400000_4.l0)).getText();
            if (text == null) {
                text = "";
            }
            actionGroup.LJII(text, new AqS135S0200000_4((InterfaceC65784Pro) aqS50S0400000_4.l2, (InterfaceC65784Pro<C76800UCe>) aqS50S0400000_4.l3, (PaymentMethodView) 41));
        }
        if (ORZ.LJLLLLLL(1, (List) aqS50S0400000_4.l0) != null) {
            String text2 = ((DialogButton) ListProtector.get((List) aqS50S0400000_4.l0, 1)).getText();
            if (text2 == null) {
                text2 = "";
            }
            actionGroup.LJIIIZ(text2, new AqS170S0100000_4((PaymentMethodView) aqS50S0400000_4.l3, 282));
        }
        if (ORZ.LJLLLLLL(2, (List) aqS50S0400000_4.l0) != null) {
            String text3 = ((DialogButton) ListProtector.get((List) aqS50S0400000_4.l0, 2)).getText();
            if (text3 != null) {
                str = text3;
            }
            actionGroup.LJFF(str, null);
        }
        Integer buttonDirection = ((DialogContent) aqS50S0400000_4.l1).getButtonDirection();
        if (buttonDirection != null && buttonDirection.intValue() == 1) {
            actionGroup.LJI = true;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (X.C28098B1a.LIZIZ(r0) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AqS50S0400000_4 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS50S0400000_4.invoke$9(kotlin.jvm.internal.AqS50S0400000_4, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS50S0400000_4(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r3, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter.AddressViewHolder r4, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r5, X.C26610AcQ r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r3
            r1.l3 = r4
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r6
            r1.l2 = r5
            r1.l3 = r3
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS50S0400000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress, X.AcQ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS50S0400000_4(C76732zl c76732zl, C76732zl c76732zl2, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = bAAnchorServiceImpl;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(AbstractC253779xd abstractC253779xd, ActivityC45651qj activityC45651qj, Bundle bundle, Bundle bundle2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC253779xd;
        this.l1 = activityC45651qj;
        this.l2 = bundle;
        this.l3 = bundle2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(C28064Azs c28064Azs, PaymentInfo paymentInfo, Boolean bool, PaymentHalfFragment paymentHalfFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = c28064Azs;
        this.l1 = paymentInfo;
        this.l2 = bool;
        this.l3 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(B1J b1j, PaymentMethodView paymentMethodView, PaymentMethodViewHolder paymentMethodViewHolder, IPaymentFragmentStyle iPaymentFragmentStyle, int i) {
        super(1);
        this.$t = i;
        this.l0 = b1j;
        this.l1 = paymentMethodView;
        this.l2 = paymentMethodViewHolder;
        this.l3 = iPaymentFragmentStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(Address address, UsAddressItemVH usAddressItemVH, C26635Acp c26635Acp, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = usAddressItemVH;
        this.l1 = c34k;
        this.l2 = address;
        this.l3 = c26635Acp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(SubPaymentListFragment subPaymentListFragment, PaymentMethod paymentMethod, EnterParams enterParams, C27593AsH c27593AsH, int i) {
        super(1);
        this.$t = i;
        this.l0 = subPaymentListFragment;
        this.l1 = paymentMethod;
        this.l2 = enterParams;
        this.l3 = c27593AsH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS50S0400000_4(List list, List<DialogButton> list2, DialogContent dialogContent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, PaymentMethodView paymentMethodView) {
        super(1);
        this.$t = paymentMethodView;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = dialogContent;
        this.l3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S0400000_4(DialogOption[] dialogOptionArr, Uri uri, C253509xC c253509xC, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialogOptionArr;
        this.l1 = uri;
        this.l2 = c253509xC;
        this.l3 = activity;
    }
}

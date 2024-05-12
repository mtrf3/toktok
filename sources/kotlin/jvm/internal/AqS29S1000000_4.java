package kotlin.jvm.internal;

import X.A37;
import X.ARI;
import X.AbstractC65781Prl;
import X.C05040Hs;
import X.C16880lQ;
import X.C221018lt;
import X.C2304292o;
import X.C239839b9;
import X.C240199bj;
import X.C240949cw;
import X.C242289f6;
import X.C248269ok;
import X.C248629pK;
import X.C252449vU;
import X.C25532A0i;
import X.C25715A7j;
import X.C25859ACx;
import X.C26338AVi;
import X.C26804AfY;
import X.C26965Ai9;
import X.C27739Aud;
import X.C27822Avy;
import X.C27918AxW;
import X.C27919AxX;
import X.C27943Axv;
import X.C28143B2t;
import X.C32I;
import X.C43I;
import X.C57819Mmd;
import X.C61878OQg;
import X.C70437Rkf;
import X.C76800UCe;
import X.C82B;
import X.C99K;
import X.C9PM;
import X.C9PN;
import X.C9X7;
import X.C9X8;
import X.C9XG;
import X.EnumC72807Shn;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.W5F;
import X.W5U;
import X.X1D;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS29S1000000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

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
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S1000000_4(int i) {
        super(1);
        this.$t = i;
        this.s0 = "following_relation";
    }

    public final void invoke$0(ImageView view) {
        o.LJIIIZ(view, "view");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LJJIIJZLJL = view;
        C16880lQ.LLJJJ(LJIIIIZZ);
        view.setAlpha(0.34f);
    }

    public final void invoke$1(ImageView view) {
        o.LJIIIZ(view, "view");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LJJIIJZLJL = view;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    public final void invoke$2(ImageView view) {
        o.LJIIIZ(view, "view");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LJJIIJZLJL = view;
        C16880lQ.LLJJJ(LJIIIIZZ);
        view.setAlpha(0.34f);
    }

    public final void invoke$3(ImageView it) {
        o.LJIIIZ(it, "it");
        it.getLayoutParams().height = C05040Hs.LIZ(1, 150);
        float f = 16;
        C26338AVi.LJI(it, Integer.valueOf(C05040Hs.LIZ(1, f)), Integer.valueOf(C05040Hs.LIZ(1, 24)), Integer.valueOf(C05040Hs.LIZ(1, f)), null, false, 24);
        W5F LJFF = W5U.LJFF(UriProtector.parse(this.s0));
        LJFF.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJFF.LJJIIJZLJL = it;
        C16880lQ.LLJJJ(LJFF);
    }

    public final void invoke$4(ImageView it) {
        o.LJIIIZ(it, "it");
        W5F LJFF = W5U.LJFF(UriProtector.parse(this.s0));
        LJFF.LJJIIJZLJL = it;
        C16880lQ.LLJJJ(LJFF);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S1000000_4(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r2 != X.AJE.NEW) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS29S1000000_4 r9, java.lang.Object r10) {
        /*
            r3 = r10
            X.AJD r3 = (X.AJD) r3
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r4 = r9.s0
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            r1 = 0
            if (r0 == 0) goto L1b
            X.43I<X.AJE> r0 = r3.LJLJI
            if (r0 == 0) goto L33
            T r2 = r0.LIZ
        L17:
            X.AJE r0 = X.AJE.NEW
            if (r2 == r0) goto L25
        L1b:
            X.43I<X.AJE> r0 = r3.LJLJI
            if (r0 == 0) goto L21
            T r1 = r0.LIZ
        L21:
            X.AJE r0 = X.AJE.EDIT
            if (r1 != r0) goto L31
        L25:
            r5 = 1
        L26:
            r6 = 0
            r10 = 60
            r7 = r6
            r8 = r6
            r9 = r6
            X.AJD r0 = X.AJD.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L31:
            r5 = 0
            goto L26
        L33:
            r2 = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS29S1000000_4.invoke$0(kotlin.jvm.internal.AqS29S1000000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        Map sendLog = (Map) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str = aqS29S1000000_4.s0;
        if (str != null) {
            sendLog.put("payment_option", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        AddressListState setState = (AddressListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddressListState.copy$default(setState, 0, null, aqS29S1000000_4.s0, null, null, 27, null);
    }

    public static final Object invoke$11(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        AddressListState setState = (AddressListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddressListState.copy$default(setState, 0, null, aqS29S1000000_4.s0, null, null, 27, null);
    }

    public static final Object invoke$12(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("module_name", aqS29S1000000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C99K setState = (C99K) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C99K.LIZ(setState, false, new C43I(aqS29S1000000_4.s0), 1);
    }

    public static final Object invoke$14(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C240949cw setState = (C240949cw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C240949cw.LIZ(setState, false, null, new C43I(aqS29S1000000_4.s0), 3);
    }

    public static final Object invoke$15(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C25532A0i setState = (C25532A0i) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C25532A0i.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, new C43I(aqS29S1000000_4.s0), null, 6143);
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        aqS29S1000000_4.invoke$3((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        aqS29S1000000_4.invoke$4((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C9PN c9pn = (C9PN) obj;
        if (c9pn != null) {
            return C9PN.LIZ(c9pn, null, null, null, aqS29S1000000_4.s0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435447);
        }
        return null;
    }

    public static final Object invoke$19(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C9X8 setState = (C9X8) obj;
        o.LJIIIZ(setState, "$this$setState");
        String originalContent = aqS29S1000000_4.s0;
        if (originalContent == null) {
            originalContent = setState.LJLIL;
        }
        C9XG currentDisplayState = C9XG.ORIGINAL;
        o.LJIIIZ(originalContent, "originalContent");
        o.LJIIIZ(currentDisplayState, "currentDisplayState");
        return new C9X8(originalContent, "", null, currentDisplayState, true);
    }

    public static final Object invoke$2(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LJ(C28143B2t.LIZ);
        String str = aqS29S1000000_4.s0;
        if (str != null) {
            sendLog.LIZLLL("popup_name", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C252449vU setState = (C252449vU) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C252449vU.LIZ(setState, null, false, null, null, 0.0f, null, null, null, null, new C43I(aqS29S1000000_4.s0), null, null, null, 7679);
    }

    public static final Object invoke$21(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, null, false, null, aqS29S1000000_4.s0, false, false, null, false, false, false, false, 8388479);
    }

    public static final Object invoke$22(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS29S1000000_4.s0, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C239839b9 setState = (C239839b9) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C239839b9.LIZ(setState, null, null, aqS29S1000000_4.s0, null, null, 27);
    }

    public static final Object invoke$24(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        A37 setState = (A37) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A37.LIZ(setState, null, null, null, null, false, false, 0, aqS29S1000000_4.s0, 127);
    }

    public static final Object invoke$25(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        ProfileState setState = (ProfileState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ProfileState.copy$default(setState, null, null, null, null, null, 0, 0, false, null, null, null, false, aqS29S1000000_4.s0, null, null, null, null, null, false, null, false, false, null, false, null, null, null, null, null, null, null, null, null, -4097, 1, null);
    }

    public static final Object invoke$26(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C252449vU setState = (C252449vU) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C252449vU.LIZ(setState, null, false, null, null, 0.0f, null, null, null, null, null, new C43I(aqS29S1000000_4.s0), null, null, 7167);
    }

    public static final Object invoke$27(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C252449vU setState = (C252449vU) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C252449vU.LIZ(setState, null, false, null, aqS29S1000000_4.s0, 0.0f, null, null, null, null, null, null, null, null, 8183);
    }

    public static final Object invoke$28(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        TuxTextView setContent = (TuxTextView) obj;
        o.LJIIIZ(setContent, "$this$setContent");
        setContent.setText(aqS29S1000000_4.s0);
        setContent.setTextColorRes(R.attr.eb);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C9X7 setState = (C9X7) obj;
        o.LJIIIZ(setState, "$this$setState");
        String originalContent = aqS29S1000000_4.s0;
        if (originalContent == null) {
            originalContent = setState.LJLIL;
        }
        C9XG currentDisplayState = C9XG.ORIGINAL;
        o.LJIIIZ(originalContent, "originalContent");
        o.LJIIIZ(currentDisplayState, "currentDisplayState");
        return new C9X7(originalContent, "", null, currentDisplayState, true);
    }

    public static final Object invoke$3(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        PaymentState setState = (PaymentState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, false, null, null, new C27919AxX(aqS29S1000000_4.s0), null, 3071, null);
    }

    public static final Object invoke$30(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C240199bj setState = (C240199bj) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C240199bj.LIZ(setState, new OSZ(C61878OQg.INSTANCE, aqS29S1000000_4.s0), null, 2);
    }

    public static final Object invoke$31(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C242289f6 setState = (C242289f6) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C242289f6.LIZ(setState, null, null, null, null, new C43I(aqS29S1000000_4.s0), null, 47);
    }

    public static final Object invoke$32(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        FollowRelationState setState = (FollowRelationState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FollowRelationState.copy$default(setState, 0, 0, 0, false, aqS29S1000000_4.s0, false, false, 111, null);
    }

    public static final Object invoke$33(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C57819Mmd updateTrackerConfig = (C57819Mmd) obj;
        o.LJIIIZ(updateTrackerConfig, "$this$updateTrackerConfig");
        return C57819Mmd.LIZ(updateTrackerConfig, null, null, aqS29S1000000_4.s0, null, null, null, 7935);
    }

    public static final Object invoke$34(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C248269ok setState = (C248269ok) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248269ok.LIZ(setState, null, null, null, new C43I(aqS29S1000000_4.s0), 7);
    }

    public static final Object invoke$35(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        Map sendLog = (Map) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("is_coupon_available", -1);
        sendLog.put("coupon_zone", "actionsheet");
        HashMap<String, Object> LJII = C27739Aud.LJII(aqS29S1000000_4.s0);
        if (LJII != null) {
            C70437Rkf.LIZIZ(LJII, sendLog);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, new C27822Avy(aqS29S1000000_4.s0, false), false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -16777217, 67108863, null);
    }

    public static final Object invoke$37(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        return Boolean.valueOf(o.LJ(((PaymentMethod) obj).LJFF(), aqS29S1000000_4.s0));
    }

    public static final Object invoke$38(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Object> adapterList = setState.getAdapterList();
        String str = aqS29S1000000_4.s0;
        Iterator<Object> it = adapterList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C26804AfY) {
                    List<C26965Ai9> list = ((C26804AfY) next).LIZLLL;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<C26965Ai9> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LJIILIIL);
                    }
                    if (arrayList.contains(str)) {
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, new C27918AxW(i), false, null, false, -1, 62914559, null);
    }

    public static final Object invoke$39(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, new C27919AxX(aqS29S1000000_4.s0), null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -1, 67108351, null);
    }

    public static final Object invoke$4(AqS29S1000000_4 aqS29S1000000_4, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C2304292o(new C43I(aqS29S1000000_4.s0));
    }

    public static final Object invoke$40(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C57819Mmd updateTrackerConfig = (C57819Mmd) obj;
        o.LJIIIZ(updateTrackerConfig, "$this$updateTrackerConfig");
        return C57819Mmd.LIZ(updateTrackerConfig, aqS29S1000000_4.s0, null, null, null, null, null, 8190);
    }

    public static final Object invoke$41(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(aqS29S1000000_4.s0), null, null, null, null, null, null, 133169151);
    }

    public static final Object invoke$42(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C25532A0i setState = (C25532A0i) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C25532A0i.LIZ(setState, aqS29S1000000_4.s0, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
    }

    public static final Object invoke$43(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, null, null, false, false, null, null, null, null, null, null, null, aqS29S1000000_4.s0, null, false, null, null, null, null, null, null, null, null, null, null, -8193, 511);
    }

    public static final Object invoke$44(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, aqS29S1000000_4.s0, null, null, Integer.MAX_VALUE, 511);
    }

    public static final Object invoke$45(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        AuthInfoState setState = (AuthInfoState) obj;
        o.LJIIIZ(setState, "$this$setState");
        ListState listState = setState.getListState();
        List<Object> list = setState.getListState().getList();
        String str = aqS29S1000000_4.s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!o.LJ(((AuthorizedStruct) obj2).getClientKey(), str)) {
                arrayList.add(obj2);
            }
        }
        return setState.copy(ListState.copy$default(listState, null, arrayList, null, null, null, 29, null));
    }

    public static final Object invoke$5(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        C248629pK setState = (C248629pK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C248629pK.LIZ(setState, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, null, null, null, null, aqS29S1000000_4.s0, 1048575);
    }

    public static final Object invoke$6(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        String curUid = aqS29S1000000_4.s0;
        o.LJIIIIZZ(curUid, "curUid");
        ((Keva) C25715A7j.LIZ.getValue()).storeBoolean(curUid, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fixed ");
        LIZ.append(aqS29S1000000_4.s0);
        LIZ.append(" status!");
        C221018lt.LJFF("LinkStatusFixer", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        aqS29S1000000_4.invoke$0((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        aqS29S1000000_4.invoke$1((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AqS29S1000000_4 aqS29S1000000_4, Object obj) {
        aqS29S1000000_4.invoke$2((ImageView) obj);
        return C76800UCe.LIZ;
    }
}

package kotlin.jvm.internal;

import X.A7S;
import X.AEB;
import X.AEG;
import X.AEP;
import X.AG2;
import X.AQM;
import X.ARI;
import X.ASQ;
import X.AbstractC65781Prl;
import X.AnonymousClass991;
import X.AnonymousClass993;
import X.C16880lQ;
import X.C2320198r;
import X.C238899Zd;
import X.C238909Ze;
import X.C238999Zn;
import X.C25848ACm;
import X.C25859ACx;
import X.C25860ACy;
import X.C26244ARs;
import X.C26936Ahg;
import X.C27021Aj3;
import X.C27096AkG;
import X.C32I;
import X.C33X;
import X.C36671EaJ;
import X.C43I;
import X.C4LX;
import X.C70932Rse;
import X.C71850SHu;
import X.C73969T1h;
import X.C76800UCe;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C98Q;
import X.InterfaceC57760Mlg;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SY4;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.AfS43S0300000_4;
import Y.AfS53S0200000_4;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptCheckerFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS47S0110000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public final void invoke$0(SY4 it) {
        int i;
        o.LJIIIZ(it, "it");
        if (this.z1) {
            i = R.string.jh2;
        } else {
            i = R.string.jha;
        }
        it.setText(i);
        it.setButtonVariant(1);
        it.setButtonSize(3);
        it.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        C16880lQ.LJJIZ(it, new ACListenerS24S0100000_4((InterfaceC65784Pro) this.l0, 287));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(C25860ACy c25860ACy, int i) {
        super(1);
        this.$t = i;
        this.l0 = c25860ACy;
        this.z1 = false;
    }

    public static final Object invoke$0(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        A7S a7s = ((SearchPersonalizedPanelFragment) aqS47S0110000_4.l0).LJLIL;
        if (a7s != null) {
            a7s.LJ(booleanValue);
        }
        if (aqS47S0110000_4.z1) {
            ASQ.LJ((SearchPersonalizedPanelFragment) aqS47S0110000_4.l0, AQM.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        ((Boolean) obj).booleanValue();
        if (aqS47S0110000_4.z1) {
            ASQ.LJ((SearchPersonalizedPanelFragment) aqS47S0110000_4.l0, AQM.LIZ);
        }
        A7S a7s = ((SearchPersonalizedPanelFragment) aqS47S0110000_4.l0).LJLIL;
        if (a7s != null) {
            a7s.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(((C25860ACy) aqS47S0110000_4.l0).LJFF(), null, null, false, null, null, false, false, null, false, aqS47S0110000_4.z1, false, false, 8372223);
    }

    public static final Object invoke$11(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(((C25860ACy) aqS47S0110000_4.l0).LJFF(), null, null, false, null, null, aqS47S0110000_4.z1, false, null, false, false, false, false, 8388351);
    }

    public static final Object invoke$12(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEB.LIZJ(((AEG) aqS47S0110000_4.l0).LJFF(), null, aqS47S0110000_4.z1, false, false, 16379);
    }

    public static final Object invoke$13(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS47S0110000_4.l0).LJFF(), null, null, false, null, null, aqS47S0110000_4.z1, null, null, null, null, null, false, false, null, 8388351);
    }

    public static final Object invoke$14(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS47S0110000_4.l0).LJFF(), null, null, aqS47S0110000_4.z1, null, null, false, null, null, null, null, null, false, false, null, 8388591);
    }

    public static final Object invoke$15(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        InterfaceC57760Mlg interfaceC57760Mlg;
        C98Q vmState = (C98Q) obj;
        o.LJIIIZ(vmState, "vmState");
        boolean z = vmState.LJLJJI;
        boolean z2 = aqS47S0110000_4.z1;
        if (z != z2) {
            if (!z2 && (interfaceC57760Mlg = ((UserProfileUserCardVM) aqS47S0110000_4.l0).LJLIL) != null) {
                interfaceC57760Mlg.k0();
            }
            ((UserProfileUserCardVM) aqS47S0110000_4.l0).setState(new AqS9S0010000_4(aqS47S0110000_4.z1, 35));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        ClientConfig clientConfig;
        String str;
        ArrayList arrayList;
        Integer num;
        AddressEditState state = (AddressEditState) obj;
        o.LJIIIZ(state, "state");
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) aqS47S0110000_4.l0;
        addressEditViewModel.getClass();
        List<C27021Aj3> inputItemVOList = state.getInputItemVOList();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(inputItemVOList, 10));
        for (C27021Aj3 c27021Aj3 : inputItemVOList) {
            C27021Aj3 LIZ = C27021Aj3.LIZ(c27021Aj3, null, null, false, false, null, 127);
            if (!o.LJ(c27021Aj3.LIZ.key, "districts") || addressEditViewModel.LJLJLJ != null) {
                Object obj2 = LIZ.LIZIZ;
                if (!o.LJ(LIZ.LIZ.key, "zipcode") || !(obj2 instanceof String) || ujb.o.LJJJJJL((CharSequence) obj2)) {
                    addressEditViewModel.Aw0(LIZ);
                }
            }
            arrayList2.add(LIZ);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C27021Aj3 c27021Aj32 = (C27021Aj3) it.next();
            Integer num2 = c27021Aj32.LIZ.type;
            if ((num2 == null || num2.intValue() != -100) && ((num = c27021Aj32.LIZ.type) == null || num.intValue() != -101)) {
                if (!C78897Uxp.LJJIJL(c27021Aj32.LIZJ)) {
                    arrayList3.add(c27021Aj32);
                }
            } else {
                Object obj3 = c27021Aj32.LIZIZ;
                if ((obj3 instanceof ArrayList) && (arrayList = (ArrayList) obj3) != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C27021Aj3 c27021Aj33 = (C27021Aj3) it2.next();
                        if (!C78897Uxp.LJJIJL(c27021Aj33.LIZJ)) {
                            arrayList3.add(c27021Aj33);
                        }
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            addressEditViewModel.setState(new AqS170S0100000_4(arrayList2, (List<? extends Object>) 1337));
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C27021Aj3 c27021Aj34 = (C27021Aj3) it3.next();
                if (C78685UuP.LJJJZ(c27021Aj34.LIZ.key) && (str = c27021Aj34.LIZ.key) != null) {
                    arrayList4.add(str);
                }
            }
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70932Rse(), new AqS135S0200000_4(addressEditViewModel, (AddressEditViewModel) arrayList4, (List<String>) 254));
            }
        } else {
            AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) aqS47S0110000_4.l0;
            addressEditViewModel2.getClass();
            Address Nv0 = addressEditViewModel2.Nv0(state.getInputItemVOList(), false);
            if (Nv0 != null) {
                AddressEditViewModel addressEditViewModel3 = (AddressEditViewModel) aqS47S0110000_4.l0;
                boolean z = aqS47S0110000_4.z1;
                InputItemData inputItemData = addressEditViewModel3.LJZI;
                if (inputItemData != null && (clientConfig = inputItemData.config) != null && o.LJ(clientConfig.enableConcatenateAddressCheck, Boolean.TRUE) && !z) {
                    Integer valueOf = Integer.valueOf(addressEditViewModel3.Rv0());
                    AddressApi.LIZ.getClass();
                    addressEditViewModel3.disposeOnClear(C36671EaJ.LIZIZ(C27096AkG.LIZ(Nv0, valueOf), "shipping_address", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS43S0300000_4(addressEditViewModel3, Nv0, valueOf, 2), new AfS53S0200000_4(addressEditViewModel3, Nv0, 27)));
                } else {
                    addressEditViewModel3.fw0(Nv0);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        aqS47S0110000_4.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        C238909Ze.LIZIZ("automsg_welcome_content");
        C238909Ze.LJ(3);
        if (aqS47S0110000_4.z1) {
            BaWelcomeMessageEditActivity.LLFII((BaWelcomeMessageEditActivity) aqS47S0110000_4.l0);
        }
        C238909Ze.LIZJ("automsg_welcome_content");
        ((BaWelcomeMessageEditActivity) aqS47S0110000_4.l0).finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.eje, new AqS47S0110000_4(aqS47S0110000_4.z1, (BaWelcomeMessageEditActivity) aqS47S0110000_4.l0, 18));
        actionGroup.LJIIIIZZ(R.string.cgk, C238899Zd.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        Object obj2;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("page_name", "shipping_info");
        logView.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        logView.plusAssign("module_name", "address");
        Boolean bool = ((ReachableAddress) ((AddressAdapter.AddressViewHolder) aqS47S0110000_4.l0).getItem()).reachable;
        Object obj3 = null;
        if (bool != null) {
            obj2 = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            obj2 = null;
        }
        logView.plusAssign("is_address_deliverable", obj2);
        Boolean bool2 = ((ReachableAddress) ((AddressAdapter.AddressViewHolder) aqS47S0110000_4.l0).getItem()).addressValid;
        if (bool2 != null) {
            obj3 = Integer.valueOf(bool2.booleanValue() ? 1 : 0);
        }
        logView.plusAssign("is_valid", obj3);
        logView.plusAssign("is_default", Integer.valueOf(aqS47S0110000_4.z1 ? 1 : 0));
        logView.plusAssign("rank", Integer.valueOf(((AddressAdapter.AddressViewHolder) aqS47S0110000_4.l0).latestItemPositionInternal));
        logView.plusAssign("is_selected", Integer.valueOf(((ReachableAddress) ((AddressAdapter.AddressViewHolder) aqS47S0110000_4.l0).getItem()).isSelect ? 1 : 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        C238909Ze.LIZIZ("automsg_keyword_content");
        C238909Ze.LIZLLL(3);
        if (aqS47S0110000_4.z1) {
            BaAutoReplyEditActivity.LLFII((BaAutoReplyEditActivity) aqS47S0110000_4.l0);
        }
        ((BaAutoReplyEditActivity) aqS47S0110000_4.l0).finish();
        C238909Ze.LIZJ("automsg_keyword_content");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.eje, new AqS47S0110000_4(aqS47S0110000_4.z1, (BaAutoReplyEditActivity) aqS47S0110000_4.l0, 20));
        actionGroup.LJIIIIZZ(R.string.cgk, C238999Zn.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AqS47S0110000_4 r15, java.lang.Object r16) {
        /*
            r3 = r16
            com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState r3 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState) r3
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r2 = r15
            java.lang.Object r0 = r2.l0
            X.Ahg r0 = (X.C26936Ahg) r0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel r0 = r0.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData r0 = r0.LJLJLLL
            r1 = 1
            if (r0 == 0) goto Lb9
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r0.addresses
            if (r0 != 0) goto L1b
            X.OQg r0 = X.C61878OQg.INSTANCE
        L1b:
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto Lb9
            r14 = 1
        L24:
            boolean r0 = r3.getApply()
            if (r0 == 0) goto Lad
            java.lang.String r10 = "next"
        L2c:
            if (r14 == 0) goto Lab
            X.Afl r0 = r3.getSelectedShipToInfo()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r0 = r0.LIZ()
            if (r0 == 0) goto Lab
            r15 = 1
        L39:
            java.lang.Object r0 = r2.l0
            X.Ahg r0 = (X.C26936Ahg) r0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult r7 = r0.LJIIIZ(r3)
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r4 = r2.l0
            X.Ahg r4 = (X.C26936Ahg) r4
            long r0 = r4.LJLJJI
            long r5 = r5 - r0
            boolean r1 = r4.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = r3.getSelectedLogistic()
            r12 = 0
            if (r0 == 0) goto La9
            java.lang.Integer r9 = r0.deliveryOption
        L57:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = r3.getSelectedLogistic()
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.shippingFee
            if (r0 == 0) goto La7
            java.lang.String r0 = r0.getPriceVal()
            if (r0 == 0) goto La7
            java.lang.Float r8 = X.C38350F3i.LJJIJLIJ(r0)
        L6b:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = r3.getSelectedLogistic()
            if (r0 == 0) goto La5
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.shippingFee
            if (r0 == 0) goto La5
            java.lang.String r11 = r0.getCurrency()
        L79:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r0 = r3.getSelectedLogistic()
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO r0 = r0.logisticText
            if (r0 == 0) goto L85
            java.lang.String r12 = r0.thresholdTextEn
        L85:
            java.lang.Object r0 = r2.l0
            X.Ahg r0 = (X.C26936Ahg) r0
            r0.getClass()
            java.lang.Object r0 = r2.l0
            X.Ahg r0 = (X.C26936Ahg) r0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel r0 = r0.LJLILLLLZI
            java.lang.String r13 = r0.Ov0()
            X.Ai4 r4 = new X.Ai4
            r16 = r1
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "tiktokec_stay_page"
            X.C76542zS.LIZJ(r0, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La5:
            r11 = r12
            goto L79
        La7:
            r8 = r12
            goto L6b
        La9:
            r9 = r12
            goto L57
        Lab:
            r15 = 0
            goto L39
        Lad:
            boolean r0 = r2.z1
            if (r0 == 0) goto Lb5
            java.lang.String r10 = "close"
            goto L2c
        Lb5:
            java.lang.String r10 = "return"
            goto L2c
        Lb9:
            r14 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S0110000_4.invoke$22(kotlin.jvm.internal.AqS47S0110000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$23(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        C25848ACm it = (C25848ACm) obj;
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(it, aqS47S0110000_4.z1, null, new ACListenerS24S0100000_4((VideoGiftSettingActivity) aqS47S0110000_4.l0, 299), false, null, null, null, false, false, false, 65530);
    }

    public static final Object invoke$3(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C71850SHu(((Boolean) ((MessageCenterFragment) aqS47S0110000_4.l0).LJLILLLLZI.getValue()).booleanValue(), ((Boolean) ((MessageCenterFragment) aqS47S0110000_4.l0).LJLJJI.getValue()).booleanValue(), ((Boolean) ((MessageCenterFragment) aqS47S0110000_4.l0).LJLJJL.getValue()).booleanValue(), ((Boolean) ((MessageCenterFragment) aqS47S0110000_4.l0).LJLJJLL.getValue()).booleanValue(), (String) ((MessageCenterFragment) aqS47S0110000_4.l0).LJLJI.getValue(), aqS47S0110000_4.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        OrderSubmitState state = (OrderSubmitState) obj;
        o.LJIIIZ(state, "state");
        int i = 8;
        if (aqS47S0110000_4.z1) {
            ImageView title_toggle_icon = (ImageView) ((View) aqS47S0110000_4.l0).findViewById(R.id.lam);
            o.LJIIIIZZ(title_toggle_icon, "title_toggle_icon");
            if (!state.getHideSummaryPanel()) {
                i = 0;
            }
            title_toggle_icon.setVisibility(i);
            View total_title = ((View) aqS47S0110000_4.l0).findViewById(R.id.lis);
            o.LJIIIIZZ(total_title, "total_title");
            total_title.setVisibility(0);
            View total_price = ((View) aqS47S0110000_4.l0).findViewById(R.id.lik);
            o.LJIIIIZZ(total_price, "total_price");
            total_price.setVisibility(0);
            View place_order = ((View) aqS47S0110000_4.l0).findViewById(R.id.hqz);
            o.LJIIIIZZ(place_order, "place_order");
            place_order.setVisibility(0);
        } else {
            ImageView title_toggle_icon2 = (ImageView) ((View) aqS47S0110000_4.l0).findViewById(R.id.lam);
            o.LJIIIIZZ(title_toggle_icon2, "title_toggle_icon");
            title_toggle_icon2.setVisibility(8);
            View total_title2 = ((View) aqS47S0110000_4.l0).findViewById(R.id.lis);
            o.LJIIIIZZ(total_title2, "total_title");
            total_title2.setVisibility(8);
            View total_price2 = ((View) aqS47S0110000_4.l0).findViewById(R.id.lik);
            o.LJIIIIZZ(total_price2, "total_price");
            total_price2.setVisibility(8);
            View place_order2 = ((View) aqS47S0110000_4.l0).findViewById(R.id.hqz);
            o.LJIIIIZZ(place_order2, "place_order");
            place_order2.setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        String str = "panel";
        if (aqS47S0110000_4.z1) {
            PromptCheckerFragment promptCheckerFragment = (PromptCheckerFragment) aqS47S0110000_4.l0;
            FeedPromptViewModel feedPromptViewModel = promptCheckerFragment.LJLLI;
            if (feedPromptViewModel != null) {
                feedPromptViewModel.LJLJLLL = Boolean.TRUE;
            }
            ASQ.LJIIJ(promptCheckerFragment);
            PromptCheckerFragment promptCheckerFragment2 = (PromptCheckerFragment) aqS47S0110000_4.l0;
            String str2 = promptCheckerFragment2.LJLJJLL;
            if (str2 != null) {
                str = str2;
            }
            C26244ARs.LJI(str, promptCheckerFragment2.LJLJLJ, "reedit");
        } else {
            PromptCheckerFragment promptCheckerFragment3 = (PromptCheckerFragment) aqS47S0110000_4.l0;
            promptCheckerFragment3.Al(promptCheckerFragment3.LJLILLLLZI);
            PromptCheckerFragment promptCheckerFragment4 = (PromptCheckerFragment) aqS47S0110000_4.l0;
            String str3 = promptCheckerFragment4.LJLJJLL;
            if (str3 != null) {
                str = str3;
            }
            C26244ARs.LJI(str, promptCheckerFragment4.LJLJLJ, "retry");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        C98Q setState = (C98Q) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C98Q.LIZ(setState, false, -1, 0, false, C33X.LIZ, null, null, (User) aqS47S0110000_4.l0, aqS47S0110000_4.z1, false, 104);
    }

    public static final Object invoke$7(AqS47S0110000_4 aqS47S0110000_4, Object obj) {
        C43I c43i;
        C2320198r setState = (C2320198r) obj;
        o.LJIIIZ(setState, "$this$setState");
        AnonymousClass991 anonymousClass991 = AnonymousClass991.HIDE;
        if (aqS47S0110000_4.z1) {
            c43i = new C43I((AnonymousClass993) aqS47S0110000_4.l0);
        } else {
            c43i = null;
        }
        return C2320198r.LIZ(setState, anonymousClass991, null, c43i, null, 10);
    }

    public static final Object invoke$8(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(((C25860ACy) aqS47S0110000_4.l0).LJFF(), null, null, false, null, null, false, false, null, aqS47S0110000_4.z1, false, false, false, 8380415);
    }

    public static final Object invoke$9(AqS47S0110000_4 aqS47S0110000_4, Object it) {
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(((C25860ACy) aqS47S0110000_4.l0).LJFF(), null, null, aqS47S0110000_4.z1, null, null, false, false, null, false, false, false, false, 8388591);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S0110000_4(com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S0110000_4.<init>(com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.SearchPersonalizedPanelFragment, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(C25860ACy c25860ACy, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c25860ACy;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(AEG aeg, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = aeg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(AG2 ag2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = ag2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(C26936Ahg c26936Ahg, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c26936Ahg;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(View view, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(VideoGiftSettingActivity videoGiftSettingActivity, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = videoGiftSettingActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(AddressEditViewModel addressEditViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(AddressAdapter.AddressViewHolder addressViewHolder, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressViewHolder;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(MessageCenterFragment messageCenterFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = messageCenterFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(User user, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(AqS154S0100000_4 aqS154S0100000_4, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aqS154S0100000_4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(boolean z, AnonymousClass993 anonymousClass993, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = anonymousClass993;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(boolean z, BaAutoReplyEditActivity baAutoReplyEditActivity, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = baAutoReplyEditActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(boolean z, BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = baWelcomeMessageEditActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(boolean z, PromptCheckerFragment promptCheckerFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = promptCheckerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0110000_4(boolean z, UserProfileUserCardVM userProfileUserCardVM, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = userProfileUserCardVM;
    }
}

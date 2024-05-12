package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BZI;
import X.C04120Ee;
import X.C05200Ii;
import X.C0NB;
import X.C16880lQ;
import X.C28787BRn;
import X.C29135Bc3;
import X.C29136Bc4;
import X.C29306Beo;
import X.C30211BtP;
import X.C30224Btc;
import X.C30444BxA;
import X.C30450BxG;
import X.C30627C0h;
import X.C32014ChO;
import X.C48459J0d;
import X.C61099NyR;
import X.C74769TWb;
import X.C76732zl;
import X.C76800UCe;
import X.C76944UHs;
import X.C7MY;
import X.EnumC30204BtI;
import X.EnumC30226Bte;
import X.EnumC30410Bwc;
import X.EnumC30836C8i;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceViewOnClickListenerC30227Btf;
import X.UDB;
import X.UDE;
import X.X1D;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.dataChannel.ShowCustomPollToolBarAlert;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class AqS51S0400000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public final void invoke$1(C30450BxG it) {
        o.LJIIIZ(it, "it");
        if (it.LIZ == ((EnumC30410Bwc) this.l0) && C16880lQ.LLJJIJIL(((LifecycleOwner) this.l1).getLifecycle().getCurrentState(), Lifecycle.State.RESUMED) <= 0) {
            C30444BxA.LJ((EnumC30410Bwc) this.l0, (View) this.l2, (InterfaceC88472Yns) this.l3, it.LIZIZ);
        }
    }

    public static final void LIZ$0(C04120Ee c04120Ee, CustomPollCardWidget customPollCardWidget) {
        if (!c04120Ee.LIZLLL && c04120Ee.LIZIZ != 0) {
            customPollCardWidget.LLFII(c04120Ee);
            customPollCardWidget.show();
            if (C29306Beo.LJIIJ(customPollCardWidget.dataChannel)) {
                customPollCardWidget.LJLJLLL.postDelayed(customPollCardWidget.LJLL, 5000L);
            } else {
                customPollCardWidget.LJLJLLL.postDelayed(customPollCardWidget.LJLL, 10000L);
            }
        }
    }

    public static final Object invoke$0(AqS51S0400000_5 aqS51S0400000_5, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != 0) {
            LinkMicMultiGuestV3BackgroundFixSetting linkMicMultiGuestV3BackgroundFixSetting = LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE;
            if (!linkMicMultiGuestV3BackgroundFixSetting.getValue()) {
                StringBuilder LJ = C7MY.LJ("checkPluginInstall, multiLiveType: ", intValue, ", fixSetting: ");
                LJ.append(linkMicMultiGuestV3BackgroundFixSetting.getValue());
                C0NB.LJ("GameLinkPermissionManager", X1D.LIZIZ(LJ));
                Activity activity = (Activity) aqS51S0400000_5.l0;
                EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C29135Bc3(activity, intValue, (InterfaceC88472Yns) aqS51S0400000_5.l2, (InterfaceC65784Pro) aqS51S0400000_5.l3));
                return C76800UCe.LIZ;
            }
        }
        StringBuilder LJ2 = C7MY.LJ("checkBluetoothPermission, multiLiveType: ", intValue, ", fixSetting: ");
        LJ2.append(LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue());
        C0NB.LJ("GameLinkPermissionManager", X1D.LIZIZ(LJ2));
        Activity activity2 = (Activity) aqS51S0400000_5.l0;
        DataChannel dataChannel = (DataChannel) aqS51S0400000_5.l1;
        AqS36S0301000_5 aqS36S0301000_5 = new AqS36S0301000_5(activity2, intValue, (InterfaceC88472Yns) aqS51S0400000_5.l2, (InterfaceC65784Pro) aqS51S0400000_5.l3, 0);
        o.LJIIIZ(activity2, "activity");
        if (Build.VERSION.SDK_INT >= 31 && !C76944UHs.LIZIZ(activity2, "android.permission.BLUETOOTH_CONNECT")) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.L;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "BLUETOOTH_PERMISSION_HIN…IMES_IN_INTERCEPTOR.value");
            if (LIZJ.intValue() < 2) {
                boolean LIZJ2 = C76944UHs.LIZJ(activity2, "android.permission.BLUETOOTH_CONNECT");
                Boolean LIZJ3 = InterfaceC30442Bx8.K.LIZJ();
                o.LJIIIIZZ(LIZJ3, "FIRST_TIME_APPLY_BLUETOO…SION_IN_INTERCEPTOR.value");
                if (LIZJ3.booleanValue() || LIZJ2) {
                    c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
                    C61099NyR.LIZIZ.LIZIZ(activity2, TokenCert.Companion.with("bpea-live_studio_link_mic_bluetooth")).LIZ("android.permission.BLUETOOTH_CONNECT").LIZJ(new UDB(activity2, dataChannel, aqS36S0301000_5));
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_nearby_devices_popup_show");
                    LIZ.LJIILLIIL(dataChannel);
                    LIZ.LJIJJ("live_studio", "live_type");
                    LIZ.LJIJJ("multi_guest", "toast_type");
                    LIZ.LJJIIJZLJL();
                    return C76800UCe.LIZ;
                }
            }
        }
        aqS36S0301000_5.invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS51S0400000_5 aqS51S0400000_5, Object it) {
        DataChannel dataChannel;
        long j;
        Long valueOf;
        long j2;
        long j3;
        o.LJIIIZ(it, "it");
        C76732zl c76732zl = (C76732zl) aqS51S0400000_5.l0;
        int i = c76732zl.element;
        if (i <= 0) {
            c76732zl.element = i + 1;
            if (CustomPollCardWidget.LLFF(((CustomPollCardWidget) aqS51S0400000_5.l1).dataChannel)) {
                Long LIZJ = InterfaceC30442Bx8.Z.LIZJ();
                PollMessage pollMessage = ((C04120Ee) aqS51S0400000_5.l2).LJI;
                if (pollMessage != null) {
                    j3 = pollMessage.pollId;
                } else {
                    User LIZIZ = C05200Ii.LIZIZ();
                    if (LIZIZ != null) {
                        j2 = LIZIZ.getId();
                    } else {
                        j2 = 0;
                    }
                    j3 = j2 + 0;
                }
                if (LIZJ == null || LIZJ.longValue() != j3) {
                    if (C30627C0h.LJI(((Room) aqS51S0400000_5.l3).getId())) {
                        LIZ$0((C04120Ee) aqS51S0400000_5.l2, (CustomPollCardWidget) aqS51S0400000_5.l1);
                    } else {
                        DataChannel dataChannel2 = ((CustomPollCardWidget) aqS51S0400000_5.l1).dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.pv0(ShowCustomPollToolBarAlert.class);
                        }
                    }
                }
            } else if (C30627C0h.LJI(((Room) aqS51S0400000_5.l3).getId())) {
                LIZ$0((C04120Ee) aqS51S0400000_5.l2, (CustomPollCardWidget) aqS51S0400000_5.l1);
            } else if (!((C04120Ee) aqS51S0400000_5.l2).LIZLLL && (dataChannel = ((CustomPollCardWidget) aqS51S0400000_5.l1).dataChannel) != null) {
                dataChannel.pv0(ShowCustomPollToolBarAlert.class);
            }
            C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.Z;
            PollMessage pollMessage2 = ((C04120Ee) aqS51S0400000_5.l2).LJI;
            if (pollMessage2 != null) {
                valueOf = Long.valueOf(pollMessage2.pollId);
            } else {
                User LIZIZ2 = C05200Ii.LIZIZ();
                if (LIZIZ2 != null) {
                    j = LIZIZ2.getId();
                } else {
                    j = 0;
                }
                valueOf = Long.valueOf(j + 0);
            }
            c48459J0d.LIZ(valueOf);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS51S0400000_5 aqS51S0400000_5, Object obj) {
        aqS51S0400000_5.invoke$1((C30450BxG) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS51S0400000_5 aqS51S0400000_5, Object obj) {
        DataChannel dataChannel;
        View it = (View) obj;
        o.LJIIIZ(it, "it");
        String button = ((EnumC30204BtI) aqS51S0400000_5.l0).toString();
        o.LJIIIZ(button, "button");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C30211BtP.LIZ);
        linkedHashMap.put("button", button);
        C30211BtP.LIZIZ("button_clicked", linkedHashMap);
        ((InterfaceViewOnClickListenerC30227Btf) aqS51S0400000_5.l1).onClick(it);
        if (((EnumC30226Bte) aqS51S0400000_5.l2).isPopup() && ((InterfaceViewOnClickListenerC30227Btf) aqS51S0400000_5.l1).ud() && (dataChannel = ((C30224Btc) aqS51S0400000_5.l3).LIZ) != null) {
            dataChannel.pv0(DismissToolbarPopEvent.class);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS51S0400000_5 aqS51S0400000_5, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != 0) {
            LinkMicMultiGuestV3BackgroundFixSetting linkMicMultiGuestV3BackgroundFixSetting = LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE;
            if (!linkMicMultiGuestV3BackgroundFixSetting.getValue()) {
                String LJI = C74769TWb.LJI(198);
                StringBuilder LJ = C7MY.LJ("checkPluginInstall, multiLiveType: ", intValue, ", fixSetting: ");
                LJ.append(linkMicMultiGuestV3BackgroundFixSetting.getValue());
                C32014ChO.LIZJ(LJI, X1D.LIZIZ(LJ), null);
                Activity activity = (Activity) aqS51S0400000_5.l0;
                EnumC30836C8i.LiveResource.checkInstall(activity, "interact", new C29136Bc4(activity, intValue, (InterfaceC88472Yns) aqS51S0400000_5.l2, (InterfaceC65784Pro) aqS51S0400000_5.l3));
                return C76800UCe.LIZ;
            }
        }
        String LJI2 = C74769TWb.LJI(193);
        StringBuilder LJ2 = C7MY.LJ("checkBluetoothPermission, multiLiveType: ", intValue, ", fixSetting: ");
        LJ2.append(LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue());
        C32014ChO.LIZJ(LJI2, X1D.LIZIZ(LJ2), null);
        Activity activity2 = (Activity) aqS51S0400000_5.l0;
        UDE.LIZ(activity2, (DataChannel) aqS51S0400000_5.l1, new AqS36S0301000_5(activity2, intValue, (InterfaceC88472Yns) aqS51S0400000_5.l2, (InterfaceC65784Pro) aqS51S0400000_5.l3, 1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AqS51S0400000_5 r6, java.lang.Object r7) {
        /*
            X.Cor r7 = (X.C32477Cor) r7
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "listenProgressChange "
            r1.append(r0)
            X.CpT r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveGoalUtils"
            X.C0NB.LJIIIZ(r0, r1)
            X.CpT r5 = r7.LIZ
            if (r5 == 0) goto L2a
            java.lang.Object r0 = r6.l0
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r5.LJLIL
            if (r0 != 0) goto L45
        L2a:
            java.lang.Object r3 = r6.l2
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            java.lang.Object r2 = r6.l3
            X.Pro r2 = (X.InterfaceC65784Pro) r2
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            r1.getClass()
            java.lang.String r0 = "observerOwner"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r1.jv0(r3)
            r2.invoke()
        L42:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L45:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
            java.lang.Object r3 = r6.l1
            X.Ynr r3 = (X.InterfaceC88471Ynr) r3
            long r0 = r5.LJLILLLLZI
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r5.LJLJI
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.invoke(r2, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L42
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS51S0400000_5.invoke$5(kotlin.jvm.internal.AqS51S0400000_5, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0400000_5(Activity activity, DataChannel dataChannel, AqS100S0101000_13 aqS100S0101000_13, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = dataChannel;
        this.l2 = aqS100S0101000_13;
        this.l3 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0400000_5(C76732zl c76732zl, CustomPollCardWidget customPollCardWidget, C04120Ee c04120Ee, Room room, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = customPollCardWidget;
        this.l2 = c04120Ee;
        this.l3 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0400000_5(EnumC30204BtI enumC30204BtI, InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf, EnumC30226Bte enumC30226Bte, C30224Btc c30224Btc, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC30204BtI;
        this.l1 = interfaceViewOnClickListenerC30227Btf;
        this.l2 = enumC30226Bte;
        this.l3 = c30224Btc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS51S0400000_5(EnumC30410Bwc enumC30410Bwc, EnumC30410Bwc enumC30410Bwc2, LifecycleOwner lifecycleOwner, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = enumC30410Bwc;
        this.l1 = enumC30410Bwc2;
        this.l2 = lifecycleOwner;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS51S0400000_5(Activity activity, Activity activity2, DataChannel dataChannel, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = activity;
        this.l1 = activity2;
        this.l2 = dataChannel;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS51S0400000_5(Fragment fragment, Long l, AqS155S0100000_5 aqS155S0100000_5, AqS187S0100000_5 aqS187S0100000_5, int i) {
        super(1);
        this.$t = i;
        this.l0 = l;
        this.l1 = aqS187S0100000_5;
        this.l2 = fragment;
        this.l3 = aqS155S0100000_5;
    }
}

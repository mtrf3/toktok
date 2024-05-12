package Y;

import X.CN1;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidgetV2;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveTopShareWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.OrientationChangeWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAdaptMicRoomSwitchSetting;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceCollapseWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceExpandWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceLandscapeWidget;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.widget.LiveSlideUpGuideWidget;

/* loaded from: classes6.dex */
public class AObjectS22S0000000_5 implements InterfaceC65784Pro {
    public final int $t;

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.AObjectS22S0000000_5.invoke$4(Y.AObjectS22S0000000_5):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
        	... 1 more
        */
    @Override // X.InterfaceC65784Pro
    public final java.lang.Object invoke() {
        /*
            r1 = this;
            int r0 = r1.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto Lc;
                case 2: goto L11;
                case 3: goto L16;
                case 4: goto L1b;
                case 5: goto L20;
                case 6: goto L25;
                case 7: goto L2a;
                case 8: goto L2f;
                case 9: goto L34;
                case 10: goto L39;
                case 11: goto L3e;
                case 12: goto L43;
                case 13: goto L48;
                case 14: goto L4d;
                default: goto L5;
            }
        L5:
            r0 = 0
        L6:
            return r0
        L7:
            java.lang.Object r0 = invoke$0(r1)
            goto L6
        Lc:
            java.lang.Object r0 = invoke$1(r1)
            goto L6
        L11:
            java.lang.Object r0 = invoke$2(r1)
            goto L6
        L16:
            java.lang.Object r0 = invoke$3(r1)
            goto L6
        L1b:
            java.lang.Object r0 = invoke$4(r1)
            goto L6
        L20:
            java.lang.Object r0 = invoke$5(r1)
            goto L6
        L25:
            java.lang.Object r0 = invoke$6(r1)
            goto L6
        L2a:
            java.lang.Object r0 = invoke$7(r1)
            goto L6
        L2f:
            java.lang.Object r0 = invoke$8(r1)
            goto L6
        L34:
            java.lang.Object r0 = invoke$9(r1)
            goto L6
        L39:
            java.lang.Object r0 = invoke$10(r1)
            goto L6
        L3e:
            java.lang.Object r0 = invoke$11(r1)
            goto L6
        L43:
            java.lang.Object r0 = invoke$12(r1)
            goto L6
        L48:
            java.lang.Object r0 = invoke$13(r1)
            goto L6
        L4d:
            java.lang.Object r0 = invoke$14(r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS22S0000000_5.invoke():java.lang.Object");
    }

    public AObjectS22S0000000_5(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).xa0();
    }

    public static final Object invoke$1(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return ((IFansClubService) CN1.LIZ(IFansClubService.class)).mY();
    }

    public static final Object invoke$10(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new LiveSlideUpGuideWidget();
    }

    public static final Object invoke$11(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new ProgrammedLiveOnlineAudienceExpandWidget();
    }

    public static final Object invoke$12(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new ProgrammedLiveOnlineAudienceCollapseWidget();
    }

    public static final Object invoke$13(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new ProgrammedLiveOnlineAudienceLandscapeWidget();
    }

    public static final Object invoke$14(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        boolean z;
        if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt() && MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Nt();
    }

    public static final Object invoke$3(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new FullVideoButtonWidgetV2();
    }

    public static final Object invoke$4(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return AbsAudienceInteractionFragment.lambda$onBackPressed$30();
    }

    public static final Object invoke$5(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new LockScreenWidget();
    }

    public static final Object invoke$6(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new DefinitionSelectionWidget();
    }

    public static final Object invoke$7(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new LiveTopShareWidget();
    }

    public static final Object invoke$8(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new OrientationChangeWidget();
    }

    public static final Object invoke$9(AObjectS22S0000000_5 aObjectS22S0000000_5) {
        return new CloseWidget();
    }
}

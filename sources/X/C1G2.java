package X;

import Y.IDRunnableS85S0100000;
import Y.IDTListenerS110S0100000;
import Y.IDfS292S0100000;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.livecenter.MobileGameLiveCenterTipsDialog;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterEntranceShow;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterMaskSchema;
import com.bytedance.android.livesdk.livesetting.game.GameLiveCenterOptSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1G2 */
/* loaded from: classes.dex */
public final class C1G2 extends FrameLayout implements InterfaceC72822Si2 {
    public long LJLIL;
    public final boolean LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public final InterfaceC25300z0 LJLJLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLLL;
    public boolean LJLL;
    public EnumC30738C4o LJLLI;
    public String LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public InterfaceC30182Bsw LJLLL;
    public VelocityTracker LJLLLL;
    public String LJLLLLLL;
    public final FrameLayout LJLZ;
    public final boolean LJZ;
    public final View LJZI;
    public DataChannel LJZL;
    public EnumC30738C4o LL;

    public final void LIZJ() {
        if (this.LJLL || this.LJZ) {
            return;
        }
        boolean z = true;
        this.LJLL = true;
        if (GameLiveCenterOptSetting.INSTANCE.getValue() && this.LL == EnumC30738C4o.DISMISS) {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(OptLiveCenterMaskSchema.INSTANCE.getValue());
        LIZ.append("&should_refresh=");
        LIZ.append(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        Object value = C20930rx.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-hybridContainerService>(...)");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ2 = C05590Jv.LIZIZ((IHybridContainerService) value, context, LIZIZ, false, null, 12);
        this.LJLJLLL = LIZIZ2;
        FrameLayout frameLayout = this.LJLZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(LIZIZ2, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLJ.LIZ(C73943T0h.LIZ().LJ(CYQ.class).LJJJJZI(new IDfS292S0100000(this, 7)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC10970bt interfaceC10970bt;
        super.onDetachedFromWindow();
        this.LJLLILLLL = null;
        C72818Shy.LJII("anchor_center_request_room_info", this);
        C72818Shy.LJII("live_anchor_center_mask_close", this);
        InterfaceC25300z0 interfaceC25300z0 = this.LJLJLJ;
        if (interfaceC25300z0 != null) {
            ((C31239CNv) interfaceC25300z0).LIZJ();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLLJ.LIZLLL();
        VelocityTracker velocityTracker = this.LJLLLL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJLLLL = null;
        KeyEvent.Callback callback = this.LJZI;
        if ((callback instanceof InterfaceC10970bt) && (interfaceC10970bt = (InterfaceC10970bt) callback) != null) {
            interfaceC10970bt.onDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LJZL;
    }

    private final void setStatus(EnumC30738C4o enumC30738C4o) {
        this.LL = enumC30738C4o;
        DataChannel dataChannel = this.LJZL;
        if (dataChannel != null) {
            dataChannel.rv0(LiveCenterStatusChannel.class, enumC30738C4o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0 != 3) goto L160;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1G2.LIZLLL(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Boolean bool;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (o.LJ(c199097rd.LJLIL, "anchor_center_request_room_info")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            DataChannel dataChannel = this.LJZL;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            } else {
                bool = null;
            }
            jSONObject.put("gift_permission", bool);
            jSONObject.put("live_sub_only", C29232Bdc.LJIIL());
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "anchor_center_response_room_info");
            return;
        }
        if (!o.LJ(c199097rd.LJLIL, "live_anchor_center_mask_close")) {
            return;
        }
        LIZIZ(this, 3);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        InterfaceC10970bt interfaceC10970bt;
        this.LJZL = dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, LiveCenterShowEvent.class, new IDqS416S0100000(this, 42));
            dataChannel.lv0(dataChannel.LJLJJI, LiveCenterDismissEvent.class, new IDqS416S0100000(this, 43));
            dataChannel.lv0(dataChannel.LJLJJI, LinkStateForH5Event.class, new IDqS416S0100000(this, 44));
            dataChannel.ov0(dataChannel.LJLJJI, LiveCenterEntranceShow.class, new IDqS416S0100000(this, 45));
        }
        KeyEvent.Callback callback = this.LJZI;
        if ((callback instanceof InterfaceC10970bt) && (interfaceC10970bt = (InterfaceC10970bt) callback) != null) {
            interfaceC10970bt.LIZ(dataChannel);
        }
    }

    public final void setGestureDetectLayout(InterfaceC30182Bsw interfaceC30182Bsw) {
        this.LJLLL = interfaceC30182Bsw;
        if (interfaceC30182Bsw != null) {
            interfaceC30182Bsw.LJJJLL(new IDTListenerS110S0100000(this, 2));
            interfaceC30182Bsw.LJJJJLL(new IDTListenerS110S0100000(this, 3));
        }
    }

    public final void setRefreshData(boolean z) {
        if (this.LJZ) {
            DataChannel dataChannel = this.LJZL;
            if (dataChannel != null) {
                dataChannel.qv0(LiveCenterNativeShowEvent.class, Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (!GameLiveCenterOptSetting.INSTANCE.getValue() || !this.LJLL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("should_refresh", String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_refresh_data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1G2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int LJIIL;
        ViewGroup viewGroup;
        a1.LJFF(context, "context");
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        this.LJLILLLLZI = LJIIZILJ;
        if (LJIIZILJ) {
            LJIIL = -C15380j0.LJIIL();
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        this.LJLJI = LJIIL;
        Object value = C20930rx.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-browserService>(...)");
        this.LJLJLJ = ((IBrowserService) value).kF();
        EnumC30738C4o enumC30738C4o = EnumC30738C4o.DISMISS;
        this.LJLLI = enumC30738C4o;
        this.LJLLJ = new C73318Sq2();
        this.LJLLLLLL = "click";
        this.LJZ = LiveCenterNativeSetting.INSTANCE.useNative();
        View LJI = C20910rv.LJI(R.layout.dk8, this, false, 12);
        View liveCenterNativeView = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getLiveCenterNativeView(context);
        this.LJZI = liveCenterNativeView;
        if (liveCenterNativeView != null && (LJI instanceof ViewGroup) && (viewGroup = (ViewGroup) LJI) != null) {
            viewGroup.addView(liveCenterNativeView, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(LJI);
        post(new IDRunnableS85S0100000(this, 128));
        this.LJLZ = (FrameLayout) findViewById(R.id.fvl);
        C72818Shy.LIZLLL("anchor_center_request_room_info", this);
        C72818Shy.LIZLLL("live_anchor_center_mask_close", this);
        this.LJLLLL = VelocityTracker.obtain();
        setClickable(true);
        this.LL = enumC30738C4o;
    }

    public static /* synthetic */ void LIZIZ(C1G2 c1g2, int i) {
        boolean z;
        long j;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        c1g2.LIZ(j, z);
    }

    public final void LIZ(long j, boolean z) {
        EnumC30738C4o enumC30738C4o = this.LL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.DISMISS;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        setRefreshData(false);
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C1G2, Float>) View.TRANSLATION_X, this.LJLJI).setDuration(j).start();
        } else {
            setTranslationX(this.LJLJI);
        }
        setStatus(enumC30738C4o2);
        if (this.LJLLI != enumC30738C4o2) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_leave");
            LIZ.LJIILLIIL(this.LJZL);
            LIZ.LJIJJ(this.LJLLLLLL, "enter_type");
            C28289B8j.LIZJ(SystemClock.elapsedRealtime(), this.LJLIL, LIZ, "duration");
        }
        this.LJLLI = enumC30738C4o2;
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_disappear"));
        setAlpha(1.0f - (getTranslationX() / this.LJLJI));
        DataChannel dataChannel = this.LJZL;
        if (dataChannel != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel2 = this.LJZL;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PerceptionMessageChannel.class, new C30649C1d(Boolean.FALSE, -1, null));
        }
    }

    public static /* synthetic */ void LJFF(C1G2 c1g2, String str, int i) {
        boolean z;
        long j;
        if ((i & 1) != 0) {
            str = "click";
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        c1g2.LJ(j, str, z);
    }

    public final void LJ(long j, String str, boolean z) {
        FragmentManager fragmentManager;
        EnumC30738C4o enumC30738C4o = this.LL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.SHOWING;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        setStatus(enumC30738C4o2);
        LIZJ();
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C1G2, Float>) View.TRANSLATION_X, 0.0f).setDuration(j).start();
        } else {
            setTranslationX(0.0f);
        }
        this.LJLIL = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_appear");
        if (this.LJLLI != enumC30738C4o2) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_live_center_show"), this.LJZL, str, "enter_type");
        }
        InterfaceC30442Bx8.LLLLIL.LIZ(Boolean.FALSE);
        this.LJLLI = enumC30738C4o2;
        setAlpha(1.0f);
        DataChannel dataChannel = this.LJZL;
        if (dataChannel != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLLILI;
        if (!c48459J0d.LIZJ().booleanValue()) {
            MobileGameLiveCenterTipsDialog mobileGameLiveCenterTipsDialog = new MobileGameLiveCenterTipsDialog();
            DataChannel dataChannel2 = this.LJZL;
            if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) != null) {
                mobileGameLiveCenterTipsDialog.show(fragmentManager, "MobileGameLiveCenterTipsDialog");
            }
            c48459J0d.LIZ(Boolean.TRUE);
        }
    }
}

package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
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
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C50 extends FrameLayout implements InterfaceC72822Si2 {
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
    public DataChannel LJZI;
    public EnumC30738C4o LJZL;
    public final java.util.Map<Integer, View> LL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LL;
        Integer valueOf = Integer.valueOf(R.id.fvm);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.fvm);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LIZLLL() {
        if (this.LJLL || this.LJZ) {
            return;
        }
        this.LJLL = true;
        String value = OptLiveCenterMaskSchema.INSTANCE.getValue();
        IHybridContainerService LJIILIIL = C7N.LJIILIIL();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ(LJIILIIL, context, value, false, null, 12);
        this.LJLJLLL = LIZIZ;
        FrameLayout frameLayout = this.LJLZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(LIZIZ, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLJ.LIZ(C73943T0h.LIZ().LJ(CYQ.class).LJJJJZI(new AfS57S0100000_5(this, 43)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
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
        UEJ uej = (UEJ) LIZ(R.id.fvm);
        if (uej != null) {
            uej.onDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LJZI;
    }

    private final void setStatus(EnumC30738C4o enumC30738C4o) {
        this.LJZL = enumC30738C4o;
        DataChannel dataChannel = this.LJZI;
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
    public final boolean LJ(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50.LJ(android.view.MotionEvent):boolean");
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
            DataChannel dataChannel = this.LJZI;
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
        LIZJ(this, 3);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJZI = dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, LiveCenterShowEvent.class, new AqS171S0100000_5(this, 144));
            dataChannel.lv0(dataChannel.LJLJJI, LiveCenterDismissEvent.class, new AqS171S0100000_5(this, 145));
            dataChannel.lv0(dataChannel.LJLJJI, LinkStateForH5Event.class, new AqS171S0100000_5(this, 146));
            dataChannel.ov0(dataChannel.LJLJJI, LiveCenterEntranceShow.class, new AqS171S0100000_5(this, 147));
        }
        ((UEJ) LIZ(R.id.fvm)).LIZ(dataChannel);
    }

    public final void setGestureDetectLayout(InterfaceC30182Bsw interfaceC30182Bsw) {
        this.LJLLL = interfaceC30182Bsw;
        if (interfaceC30182Bsw != null) {
            interfaceC30182Bsw.LJJJLL(new IDTListenerS115S0100000_5(this, 2));
            interfaceC30182Bsw.LJJJJLL(new IDTListenerS115S0100000_5(this, 3));
        }
    }

    public final void setRefreshData(boolean z) {
        DataChannel dataChannel;
        if (this.LJZ && (dataChannel = this.LJZI) != null) {
            dataChannel.qv0(LiveCenterNativeShowEvent.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int LJIIL;
        this.LL = C62850Ola.LJFF(context, "context");
        boolean LJIIZILJ = C15380j0.LJIIZILJ();
        this.LJLILLLLZI = LJIIZILJ;
        if (LJIIZILJ) {
            LJIIL = -C15380j0.LJIIL();
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        this.LJLJI = LJIIL;
        this.LJLJLJ = C7N.LJFF().kF();
        EnumC30738C4o enumC30738C4o = EnumC30738C4o.DISMISS;
        this.LJLLI = enumC30738C4o;
        this.LJLLJ = new C73318Sq2();
        this.LJLLLLLL = "click";
        this.LJZ = LiveCenterNativeSetting.INSTANCE.useNative();
        addView(C20910rv.LJI(R.layout.dkp, this, false, 12));
        post(new ARunnableS41S0100000_5(this, 294));
        this.LJLZ = (FrameLayout) findViewById(R.id.fvl);
        C72818Shy.LIZLLL("anchor_center_request_room_info", this);
        C72818Shy.LIZLLL("live_anchor_center_mask_close", this);
        this.LJLLLL = VelocityTracker.obtain();
        setClickable(true);
        this.LJZL = enumC30738C4o;
    }

    public static /* synthetic */ void LIZJ(C50 c50, int i) {
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
        c50.LIZIZ(j, z);
    }

    public final void LIZIZ(long j, boolean z) {
        EnumC30738C4o enumC30738C4o = this.LJZL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.DISMISS;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        setRefreshData(false);
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C50, Float>) View.TRANSLATION_X, this.LJLJI).setDuration(j).start();
        } else {
            setTranslationX(this.LJLJI);
        }
        setStatus(enumC30738C4o2);
        if (this.LJLLI != enumC30738C4o2) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_leave");
            LIZ.LJIILLIIL(this.LJZI);
            LIZ.LJIJJ(this.LJLLLLLL, "enter_type");
            C28289B8j.LIZJ(SystemClock.elapsedRealtime(), this.LJLIL, LIZ, "duration");
        }
        this.LJLLI = enumC30738C4o2;
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_disappear"));
        setAlpha(1.0f - (getTranslationX() / this.LJLJI));
        DataChannel dataChannel = this.LJZI;
        if (dataChannel != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel2 = this.LJZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PerceptionMessageChannel.class, new C30649C1d(Boolean.FALSE, -1, null));
        }
    }

    public static /* synthetic */ void LJI(C50 c50, String str, int i) {
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
        c50.LJFF(j, str, z);
    }

    public final void LJFF(long j, String str, boolean z) {
        EnumC30738C4o enumC30738C4o = this.LJZL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.SHOWING;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        LIZLLL();
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C50, Float>) View.TRANSLATION_X, 0.0f).setDuration(j).start();
        } else {
            setTranslationX(0.0f);
        }
        setStatus(enumC30738C4o2);
        this.LJLIL = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_appear");
        if (this.LJLLI != enumC30738C4o2) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_live_center_show"), this.LJZI, str, "enter_type");
        }
        InterfaceC30442Bx8.LLLLIL.LIZ(Boolean.FALSE);
        this.LJLLI = enumC30738C4o2;
        setAlpha(1.0f);
        DataChannel dataChannel = this.LJZI;
        if (dataChannel != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
    }
}

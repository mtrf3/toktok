package X;

import Y.AfS57S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IsHandleEffectChannel;
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
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
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
public final class C51 extends FrameLayout implements InterfaceC72822Si2 {
    public long LJLIL;
    public final boolean LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final boolean LJLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLLI;
    public boolean LJLLILLLL;
    public EnumC30738C4o LJLLJ;
    public String LJLLL;
    public final C73318Sq2 LJLLLL;
    public InterfaceC30182Bsw LJLLLLLL;
    public VelocityTracker LJLZ;
    public String LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public EnumC30738C4o LL;
    public DataChannel LLD;
    public final java.util.Map<Integer, View> LLF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZLLL() {
        if (this.LJLLILLLL || this.LJLL) {
            return;
        }
        boolean z = true;
        this.LJLLILLLL = true;
        if (LiveCenterOptimizeSetting.INSTANCE.enable() && this.LL == EnumC30738C4o.DISMISS) {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(OptLiveCenterMaskSchema.INSTANCE.getValue());
        LIZ.append("&should_refresh=");
        LIZ.append(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        IHybridContainerService LJIILIIL = C7N.LJIILIIL();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLLI = C05590Jv.LIZIZ(LJIILIIL, context, LIZIZ, false, null, 12);
        ((ViewGroup) LIZ(R.id.fvl)).addView(this.LJLLI, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLLL.LIZ(C73943T0h.LIZ().LJ(CYQ.class).LJJJJZI(new AfS57S0100000_5(this, 38)));
        C72818Shy.LIZLLL("anchor_center_request_room_info", this);
        C72818Shy.LIZLLL("live_anchor_center_mask_close", this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLL = null;
        C72818Shy.LJII("anchor_center_request_room_info", this);
        C72818Shy.LJII("live_anchor_center_mask_close", this);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLLLL.LIZLLL();
        VelocityTracker velocityTracker = this.LJLZ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJLZ = null;
        UEJ uej = (UEJ) LIZ(R.id.fvm);
        if (uej != null) {
            uej.onDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLD;
    }

    private final void setStatus(EnumC30738C4o enumC30738C4o) {
        this.LL = enumC30738C4o;
        DataChannel dataChannel = this.LLD;
        if (dataChannel != null) {
            dataChannel.rv0(LiveCenterStatusChannel.class, enumC30738C4o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r1 != 3) goto L190;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51.LJ(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        Boolean bool = null;
        if (o.LJ(c199097rd.LJLIL, "anchor_center_request_room_info")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            DataChannel dataChannel = this.LLD;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            }
            jSONObject.put("gift_permission", bool);
            jSONObject.put("live_sub_only", C29232Bdc.LJIIL());
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "anchor_center_response_room_info");
            return;
        }
        if (!o.LJ(c199097rd.LJLIL, "live_anchor_center_mask_close")) {
            return;
        }
        LIZJ(this, null, 7);
    }

    public final void setBlockTouchEvent(boolean z) {
        this.LJZI = z;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        this.LLD = dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, LiveCenterShowEvent.class, new AqS171S0100000_5(this, 135));
            DataChannel dataChannel2 = this.LLD;
            LifecycleOwner lifecycleOwner4 = null;
            if (dataChannel2 != null) {
                lifecycleOwner = dataChannel2.LJLJJI;
            } else {
                lifecycleOwner = null;
            }
            dataChannel.lv0(lifecycleOwner, LiveCenterDismissEvent.class, new AqS171S0100000_5(this, 136));
            DataChannel dataChannel3 = this.LLD;
            if (dataChannel3 != null) {
                lifecycleOwner2 = dataChannel3.LJLJJI;
            } else {
                lifecycleOwner2 = null;
            }
            dataChannel.lv0(lifecycleOwner2, LinkStateForH5Event.class, new AqS171S0100000_5(this, 137));
            DataChannel dataChannel4 = this.LLD;
            if (dataChannel4 != null) {
                lifecycleOwner3 = dataChannel4.LJLJJI;
            } else {
                lifecycleOwner3 = null;
            }
            dataChannel.ov0(lifecycleOwner3, LiveCenterEntranceShow.class, new AqS171S0100000_5(this, 138));
            DataChannel dataChannel5 = this.LLD;
            if (dataChannel5 != null) {
                lifecycleOwner4 = dataChannel5.LJLJJI;
            }
            dataChannel.ov0(lifecycleOwner4, IsHandleEffectChannel.class, new AqS171S0100000_5(this, 139));
        }
        ((UEJ) LIZ(R.id.fvm)).LIZ(dataChannel);
    }

    public final void setGestureDetectLayout(InterfaceC30182Bsw interfaceC30182Bsw) {
        this.LJLLLLLL = interfaceC30182Bsw;
    }

    public final void setRefreshData(boolean z) {
        if (this.LJLL) {
            DataChannel dataChannel = this.LLD;
            if (dataChannel != null) {
                dataChannel.qv0(LiveCenterNativeShowEvent.class, Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (!LiveCenterOptimizeSetting.INSTANCE.enable() || !this.LJLLILLLL) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("should_refresh", String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_refresh_data");
    }

    public final void LIZIZ(long j, boolean z) {
        DataChannel dataChannel;
        EnumC30738C4o enumC30738C4o = this.LL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.DISMISS;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        setRefreshData(false);
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C51, Float>) View.TRANSLATION_X, this.LJLJI).setDuration(j).start();
        } else {
            setTranslationX(this.LJLJI);
        }
        setStatus(enumC30738C4o2);
        if (this.LJLLJ != enumC30738C4o2) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_center_leave");
            LIZ.LJIILLIIL(this.LLD);
            LIZ.LJIJJ(this.LJZ, "enter_type");
            C28289B8j.LIZJ(SystemClock.elapsedRealtime(), this.LJLIL, LIZ, "duration");
        }
        this.LJLLJ = enumC30738C4o2;
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_disappear"));
        setAlpha(1.0f - (getTranslationX() / this.LJLJI));
        if ((!LiveMemoryOptSetting.INSTANCE.enableMemoryOpt() || this.LJLJLLL) && (dataChannel = this.LLD) != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel2 = this.LLD;
        Boolean bool = null;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PerceptionMessageChannel.class, new C30649C1d(Boolean.FALSE, -1, null));
        }
        this.LJLJL = false;
        this.LJLJLJ = false;
        DataChannel dataChannel3 = this.LLD;
        if (dataChannel3 != null) {
            bool = (Boolean) dataChannel3.kv0(IsHandleEffectChannel.class);
        }
        this.LJZL = C29306Beo.LJJIFFI(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LLF = r0
            r2 = 0
            r3.<init>(r4, r5, r2)
            boolean r0 = X.C15380j0.LJIIZILJ()
            r3.LJLILLLLZI = r0
            if (r0 == 0) goto L5b
            int r0 = X.C15380j0.LJIIL()
            int r0 = -r0
        L1e:
            float r0 = (float) r0
            r3.LJLJI = r0
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting.INSTANCE
            boolean r0 = r0.useNative()
            r3.LJLL = r0
            X.C4o r1 = X.EnumC30738C4o.DISMISS
            r3.LJLLJ = r1
            X.Sq2 r0 = new X.Sq2
            r0.<init>()
            r3.LJLLLL = r0
            java.lang.String r0 = "click"
            r3.LJZ = r0
            r3.LL = r1
            r1 = 2131564212(0x7f0d16b4, float:1.8753903E38)
            r0 = 12
            android.view.View r0 = X.C20910rv.LJI(r1, r3, r2, r0)
            r3.addView(r0)
            Y.ARunnableS41S0100000_5 r1 = new Y.ARunnableS41S0100000_5
            r0 = 49
            r1.<init>(r3, r0)
            r3.post(r1)
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r3.LJLZ = r0
            r0 = 1
            r3.setClickable(r0)
            return
        L5b:
            int r0 = X.C15380j0.LJIIL()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static /* synthetic */ void LIZJ(C51 c51, String str, int i) {
        boolean z;
        long j;
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
        c51.LIZIZ(j, z);
    }

    public static /* synthetic */ void LJI(C51 c51, String str, int i) {
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
        c51.LJFF(j, str, z);
    }

    public final void LJFF(long j, String str, boolean z) {
        EnumC30738C4o enumC30738C4o = this.LL;
        EnumC30738C4o enumC30738C4o2 = EnumC30738C4o.SHOWING;
        if (enumC30738C4o == enumC30738C4o2) {
            return;
        }
        setStatus(enumC30738C4o2);
        LIZLLL();
        if (z) {
            ObjectAnimator.ofFloat(this, (Property<C51, Float>) View.TRANSLATION_X, 0.0f).setDuration(j).start();
        } else {
            setTranslationX(0.0f);
        }
        this.LJLIL = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_anchor_center_mask_will_appear");
        if (this.LJLLJ != enumC30738C4o2) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_live_center_show"), this.LLD, str, "enter_type");
        }
        InterfaceC30442Bx8.LLLLIL.LIZ(Boolean.FALSE);
        this.LJLLJ = enumC30738C4o2;
        setAlpha(1.0f);
        this.LJLJLLL = true;
        DataChannel dataChannel = this.LLD;
        if (dataChannel != null) {
            dataChannel.qv0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
    }
}

package com.bytedance.android.livesdk.programmedlive.ui;

import X.B4Q;
import X.BCW;
import X.BJM;
import X.BZI;
import X.C05590Jv;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A8;
import X.C30743C4t;
import X.C30744C4u;
import X.C47171tB;
import X.C73318Sq2;
import X.C73943T0h;
import X.CN1;
import X.EnumC30108Brk;
import X.InterfaceC06390Mx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ProgrammedLiveMenuWidget extends LiveRecyclableWidget {
    public C47171tB LJLIL;
    public FrameLayout LJLILLLLZI;
    public LinearLayout LJLJI;
    public C2A8 LJLJJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJL;
    public boolean LJLJJLL;
    public Room LJLJLJ;
    public final C73318Sq2 LJLJL = new C73318Sq2();
    public long LJLJLLL = -1;
    public long LJLL = -1;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (!this.LJLJJLL) {
            FrameLayout frameLayout = this.LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            this.LJLJJL = null;
            this.LJLJJLL = true;
        }
        this.LJLJLLL = -1L;
        this.LJLL = -1L;
        this.LJLJL.LIZLLL();
        this.LJLJJLL = false;
    }

    public final void onEvent(C30743C4t c30743C4t) {
        Long l;
        Long l2;
        Long l3;
        User owner;
        User owner2;
        TopFrameSummary topFrameSummary;
        String str;
        Long l4;
        User owner3;
        Long l5 = null;
        if (c30743C4t.LIZ) {
            Room room = this.LJLJLJ;
            if (room != null && (topFrameSummary = room.topFrameSummary) != null && (str = topFrameSummary.schema) != null) {
                InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
                o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("action_type", BJM.LIZLLL()).appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ()).build().toString();
                o.LJIIIIZZ(uri, "parse(schema)\n          …              .toString()");
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ((IHybridContainerService) LIZ, context, uri, false, new AqS171S0100000_5(this, 466), 4);
                this.LJLJJL = LIZIZ;
                FrameLayout frameLayout = this.LJLILLLLZI;
                if (frameLayout != null) {
                    frameLayout.addView(LIZIZ);
                }
                this.LJLJJLL = false;
                this.LJLJLLL = SystemClock.elapsedRealtime();
                if (c30743C4t.LIZIZ != null) {
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_program_live_list_show");
                    Room room2 = this.LJLJLJ;
                    if (room2 != null && (owner3 = room2.getOwner()) != null) {
                        l4 = Long.valueOf(owner3.getId());
                    } else {
                        l4 = null;
                    }
                    LIZ2.LJIJJ(l4, "anchor_id");
                    Room room3 = this.LJLJLJ;
                    if (room3 != null) {
                        l5 = Long.valueOf(room3.getId());
                    }
                    LIZ2.LJIJJ(l5, "room_id");
                    LIZ2.LJIJJ(BJM.LJFF(), "enter_from_merge");
                    LIZ2.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                    LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
                    LIZ2.LJJIIJZLJL();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LJLJJLL) {
            return;
        }
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLJJL = null;
        this.LJLJJLL = true;
        this.LJLL = SystemClock.elapsedRealtime();
        if (c30743C4t.LIZIZ == null) {
            return;
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_program_live_list_close");
        Room room4 = this.LJLJLJ;
        if (room4 != null && (owner2 = room4.getOwner()) != null) {
            l = Long.valueOf(owner2.getId());
        } else {
            l = null;
        }
        LIZ3.LJIJJ(l, "anchor_id");
        Room room5 = this.LJLJLJ;
        if (room5 != null) {
            l2 = Long.valueOf(room5.getId());
        } else {
            l2 = null;
        }
        LIZ3.LJIJJ(l2, "room_id");
        LIZ3.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ3.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ3.LJIJJ(BJM.LIZLLL(), "action_type");
        String valueOf = String.valueOf(c30743C4t.LIZIZ);
        Locale US = Locale.US;
        o.LJIIIIZZ(US, "US");
        String lowerCase = valueOf.toLowerCase(US);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        LIZ3.LJIJJ(lowerCase, "click_position");
        LIZ3.LJJIIJZLJL();
        if (this.LJLJLLL == -1 || this.LJLL == -1) {
            return;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_program_live_list_show_duration");
        Room room6 = this.LJLJLJ;
        if (room6 != null && (owner = room6.getOwner()) != null) {
            l3 = Long.valueOf(owner.getId());
        } else {
            l3 = null;
        }
        LIZ4.LJIJJ(l3, "anchor_id");
        Room room7 = this.LJLJLJ;
        if (room7 != null) {
            l5 = Long.valueOf(room7.getId());
        }
        LIZ4.LJIJJ(l5, "room_id");
        LIZ4.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ4.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ4.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ4.LJIJJ(Long.valueOf((this.LJLL - this.LJLJLLL) / 1000), "user_time");
        LIZ4.LJJIIJZLJL();
        this.LJLJLLL = -1L;
        this.LJLL = -1L;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (C47171tB) findViewById(R.id.af5);
        this.LJLILLLLZI = (FrameLayout) findViewById(R.id.ghb);
        this.LJLJI = (LinearLayout) findViewById(R.id.djj);
        findViewById(R.id.dji);
        this.LJLJJI = (C2A8) findViewById(R.id.djl);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LJLJLJ = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (o.LJ(this.dataChannel.kv0(BCW.class), Boolean.FALSE)) {
            C29306Beo.LJJLJLI(this.LJLIL);
            C29306Beo.LJI(this.LJLJI);
            View view = getView();
            if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
                layoutParams2.width = C15380j0.LIZ(56.0f) + C15380j0.LJIIJJI();
                layoutParams2.height = C15380j0.LJIIJJI();
            }
            View view2 = getView();
            if (view2 != null) {
                view2.requestLayout();
            }
        } else {
            C29306Beo.LJI(this.LJLIL);
            C29306Beo.LJJLJLI(this.LJLJI);
            View view3 = getView();
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.width = -1;
                layoutParams.height = 0;
            }
            View view4 = getView();
            if (view4 != null) {
                view4.requestLayout();
            }
        }
        C2A8 c2a8 = this.LJLJJI;
        if (c2a8 != null) {
            c2a8.setText(C15380j0.LJIILJJIL(R.string.nqe));
        }
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 236));
        }
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(C30743C4t.class).LJJJJZI(new AfS57S0100000_5(this, 155)));
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(B4Q.class).LJJJJZI(new AfS57S0100000_5(this, 156)));
    }

    public final void onEvent(B4Q b4q) {
        C30744C4u c30744C4u;
        if (b4q.LIZIZ && (c30744C4u = (C30744C4u) this.dataChannel.kv0(ProgrammedLiveMenuVisibilityChannel.class)) != null && c30744C4u.LIZ) {
            this.dataChannel.rv0(ProgrammedLiveMenuVisibilityChannel.class, new C30744C4u(false, EnumC30108Brk.OTHERS_SCENE));
        }
    }
}

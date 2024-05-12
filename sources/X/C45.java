package X;

import Y.IDCListenerS159S0100000_5;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C45 implements InterfaceViewOnClickListenerC30227Btf {
    public DataChannel LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 350));

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r2 == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r7 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LJLIL
            java.lang.String r6 = "normal"
            if (r1 == 0) goto L14
            java.lang.Class<com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event> r0 = com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event.class
            java.lang.Object r0 = r1.kv0(r0)
            X.CAs r0 = (X.C30898CAs) r0
            if (r0 == 0) goto L14
            java.lang.String r5 = r0.LIZ
            if (r5 != 0) goto L15
        L14:
            r5 = r6
        L15:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LJLIL
            if (r1 == 0) goto L21
            java.lang.Class<X.C1f> r0 = X.C30651C1f.class
            java.lang.Object r4 = r1.kv0(r0)
            if (r4 != 0) goto L23
        L21:
            X.TWk r4 = X.EnumC74778TWk.NORMAL
        L23:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LJLIL
            if (r1 == 0) goto L6d
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r1 = r1.kv0(r0)
        L2d:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_VOICE
            r3 = 0
            if (r1 != r0) goto L6b
            r2 = 1
        L33:
            X.TWk r0 = X.EnumC74778TWk.NORMAL
            if (r4 == r0) goto L3f
            X.TWk r0 = X.EnumC74778TWk.FLOATING
            if (r4 == r0) goto L3f
            X.TWk r0 = X.EnumC74778TWk.GRID
            if (r4 != r0) goto L69
        L3f:
            r1 = 1
        L40:
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r6)
            if (r0 == 0) goto L5d
            if (r1 == 0) goto L5d
            X.Ol8 r0 = X.C7N.LJJIJ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-micRoomService>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.live.microom.IMicRoomService r1 = (com.bytedance.android.live.microom.IMicRoomService) r1
            boolean r0 = r1.qt()
            if (r0 != 0) goto L5d
            if (r2 == 0) goto L5e
        L5d:
            r3 = 1
        L5e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.C47 r0 = X.C47.LJLIL
            boolean r0 = X.C29306Beo.LJJLIIIJLJLI(r1, r0)
            return r0
        L69:
            r1 = 0
            goto L40
        L6b:
            r2 = 0
            goto L33
        L6d:
            r1 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45.LIZ():boolean");
    }

    public final String LIZIZ() {
        if (((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            return "video_live";
        }
        return "screen_share";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Integer, O] */
    public final void LIZJ() {
        int i;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(PauseLiveChannel.class, Boolean.TRUE);
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null) {
            dataChannel2.rv0(GameBroadcastStateChannel.class, CWI.StatePause);
        }
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 != null) {
            Integer num = (Integer) dataChannel3.kv0(BD4.class);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            ((C32537Cpp) dataChannel3.gv0(BD4.class)).LIZ = Integer.valueOf(i + 1);
        }
        C7N.LJII().pauseBGM(Boolean.TRUE);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        int i;
        Integer num;
        o.LJIIIZ(v, "v");
        if (C29306Beo.LJJII(this.LJLIL)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_trymode_live_pause_click");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJJIIJZLJL();
            BPM bpm = new BPM();
            bpm.LJFF = this.LJLIL;
            bpm.LIZIZ = "pm_mt_liveTryMode_tryModePage_pauseToast";
            bpm.LIZJ = R.string.mdc;
            bpm.LIZLLL = true;
            C30868C9o.LJII(bpm);
            return;
        }
        if (LIZ()) {
            return;
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(BD4.class)) != null && num.intValue() >= 3) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_pause_click");
        LIZ2.LJIJJ(LIZIZ(), "live_type");
        LIZ2.LJIILLIIL(this.LJLIL);
        LIZ2.LJIJJ(Integer.valueOf(i), "is_max_pause_num");
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJJJLL;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "SHOW_PAUSE_LIVE_TIP.value");
        LIZ2.LJIJJ(Integer.valueOf(LIZJ.booleanValue() ? 1 : 0), "is_first");
        LIZ2.LJIJJ(1, "in_app");
        LIZ2.LJIJJ(0, "is_floating");
        LIZ2.LJJIIJZLJL();
        if (i != 0) {
            C30868C9o.LIZJ(R.string.k_x);
            return;
        }
        Boolean LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "SHOW_PAUSE_LIVE_TIP.value");
        if (LIZJ2.booleanValue()) {
            c48459J0d.LIZ(Boolean.FALSE);
            C77437UaH c77437UaH = new C77437UaH(v.getContext());
            c77437UaH.LJI(R.string.k_q);
            c77437UaH.LIZIZ(R.string.k_p);
            c77437UaH.LJ(R.string.k_n, new IDCListenerS159S0100000_5(this, 24), false);
            c77437UaH.LIZJ(R.string.k_o, C46.LJLIL, false);
            DialogC77438UaI LIZ3 = c77437UaH.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "825276809165628420")).LIZ) {
                LIZ3.show();
            }
            BZI LIZ4 = C28787BRn.LIZ("livesdk_live_anchor_pause_confirm_show");
            LIZ4.LJIJJ(LIZIZ(), "live_type");
            LIZ4.LJIILLIIL(this.LJLIL);
            LIZ4.LJJIIJZLJL();
            return;
        }
        LIZJ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        C77800Ug8.LJ("livesdk_live_pause_show", dataChannel);
    }
}

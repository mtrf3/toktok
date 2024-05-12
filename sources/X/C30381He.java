package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1He, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30381He implements InterfaceC04500Fq {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC06400My LIZJ;
    public String LIZLLL;
    public final ZAT LJ;
    public boolean LJFF;
    public boolean LJI;
    public final C62822Ol8 LJII;

    @Override // X.InterfaceC04500Fq
    public final void LIZJ() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LJI() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LJII() {
    }

    @Override // X.InterfaceC04500Fq
    public final void LJIIIIZZ(boolean z) {
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZ() {
        this.LJFF = C40210FqI.LJ(this.LIZ.mo49getActivity());
        EnumC30204BtI.MESSAGE_ALERT.load(this.LIZIZ, new InterfaceViewOnClickListenerC30227Btf() { // from class: X.1Hh
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

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C30381He c30381He = C30381He.this;
                int i = !C40210FqI.LJ(c30381He.LIZ.mo49getActivity()) ? 1 : 0;
                BZI LIZ = C28787BRn.LIZ("livesdk_float_window_red_dot_click");
                C78895Uxn.LIZIZ(LIZ, (String) c30381He.LJII.getValue(), "anchor_id", i, "is_red_dot");
                LIZ.LJIJJ("overlay_permission", "type");
                LIZ.LJJIIJZLJL();
                C30381He c30381He2 = C30381He.this;
                c30381He2.LIZLLL = "float_window_setting";
                C29306Beo.LJJIIJZLJL(c30381He2.LIZ, null, new C54242Ay(c30381He2, null), 3);
            }

            @Override // X.InterfaceViewOnClickListenerC30227Btf
            public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
                View LIZ = interfaceC30237Btp.LIZ(R.id.ldl);
                TextView textView = (TextView) interfaceC30237Btp.LIZ(R.id.ldn);
                boolean z = !C40210FqI.LJ(C30381He.this.LIZ.mo49getActivity());
                C29306Beo.LJJLIIIJJI(LIZ, z);
                if (z) {
                    C30381He c30381He = C30381He.this;
                    c30381He.getClass();
                    C06490Nh.LIZLLL(C28787BRn.LIZ("livesdk_float_window_red_dot_show"), (String) c30381He.LJII.getValue(), "anchor_id", "overlay_permission", "type");
                }
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lxq);
                if (textView == null) {
                    return;
                }
                textView.setText(LJIILJJIL);
            }
        });
    }

    @Override // X.InterfaceC04500Fq
    public final void LIZIZ() {
        InterfaceC30442Bx8.LJJIJ.LIZJ().booleanValue();
    }

    public final void LJIIIZ() {
        if (C40210FqI.LJ(this.LIZ.mo49getActivity())) {
            if (this.LJFF) {
                this.LIZJ.LJIIIIZZ();
                return;
            }
            if (!this.LJFF) {
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJIJIIJIL;
                Boolean bool = Boolean.TRUE;
                c48459J0d.LIZ(bool);
                InterfaceC30442Bx8.LJJIJIIJI.LIZ(bool);
                InterfaceC30442Bx8.LJJIZ.LIZ(bool);
                InterfaceC30442Bx8.LJJJ.LIZ(bool);
                InterfaceC30442Bx8.LJJJI.LIZ(bool);
                this.LIZJ.LJIIIIZZ();
            }
        } else if (this.LJFF) {
            this.LIZJ.LJI();
        }
        C73943T0h.LIZ().LIZIZ(this.LJ);
    }

    public final void LJIIJ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_overlay_permission_banner_show");
        LIZ.LJIJJ(this.LJII.getValue(), "anchor_id");
        C06490Nh.LIZLLL(LIZ, this.LIZLLL, "enter_from", "in_live", "scene_type");
    }

    @Override // X.InterfaceC04500Fq
    public final void onPause() {
        this.LJFF = C40210FqI.LJ(this.LIZ.mo49getActivity());
        this.LJI = false;
    }

    @Override // X.InterfaceC04500Fq
    public final void onResume() {
        LJIIIZ();
        this.LJI = true;
    }

    public C30381He(Fragment fragment, DataChannel dataChannel, InterfaceC06400My listener) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(listener, "listener");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = listener;
        this.LIZLLL = "float_window_setting";
        this.LJ = new ZAT();
        this.LJII = C221108m2.LIZIZ(C47751u7.LJLIL);
    }
}

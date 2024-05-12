package Y;

import X.ActivityC45651qj;
import X.BPQ;
import X.C29306Beo;
import X.C39144FXw;
import X.CUH;
import X.FYA;
import X.InterfaceC32212Cka;
import X.X1D;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS11S0110000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        CUH cuh = (CUH) this.l0;
        PINNED_MODEL pinned_model = cuh.LJLJL;
        if (pinned_model != 0) {
            pinned_model.LIZJ = cuh.V().LLIIJLIL;
        }
        if (((CUH) this.l0).V().getCanFold()) {
            if (this.z1 && ((CUH) this.l0).V().LLIIJLIL) {
                ((CUH) this.l0).V().LJJIZ();
            }
            C29306Beo.LJJLIIIJJI(((CUH) this.l0).LL, true);
            if (!((CUH) this.l0).V().LLIIJLIL) {
                ((Handler) ((CUH) this.l0).LJLLL.getValue()).postDelayed((Runnable) ((CUH) this.l0).LJLLJ.getValue(), 1800L);
                ((CUH) this.l0).LL.setImageResource(R.drawable.b2l);
                return;
            } else {
                ((CUH) this.l0).LL.setImageResource(R.drawable.b2k);
                return;
            }
        }
        C29306Beo.LJJLIIIJJI(((CUH) this.l0).LL, false);
    }

    public static final void run$0(ARunnableS11S0110000_5 aRunnableS11S0110000_5) {
        boolean LIZ;
        try {
            aRunnableS11S0110000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S0110000_5 aRunnableS11S0110000_5) {
        boolean LIZ;
        int i;
        try {
            FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aRunnableS11S0110000_5.l0;
            DataChannel dataChannel = frameL3SlotWidget.dataChannel;
            if (dataChannel != null) {
                if (aRunnableS11S0110000_5.z1) {
                    i = frameL3SlotWidget.LJLJJI.getHeight();
                } else {
                    i = 0;
                }
                dataChannel.rv0(FrameL3SlotHeightChannel.class, Integer.valueOf(i));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0110000_5 aRunnableS11S0110000_5) {
        boolean LIZ;
        try {
            ((RecommendSwipeNewWidget) aRunnableS11S0110000_5.l0).LLIIJI(aRunnableS11S0110000_5.z1, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS11S0110000_5 aRunnableS11S0110000_5) {
        boolean LIZ;
        try {
            LinkControlWidget linkControlWidget = (LinkControlWidget) aRunnableS11S0110000_5.l0;
            InterfaceC32212Cka interfaceC32212Cka = linkControlWidget.LJLLILLLL;
            if (interfaceC32212Cka != null && linkControlWidget.isViewValid()) {
                ((LinkControlWidget) aRunnableS11S0110000_5.l0).LJLJJLL = (CoHostLiveWidget) interfaceC32212Cka.LIZIZ(6, aRunnableS11S0110000_5.z1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS11S0110000_5 aRunnableS11S0110000_5) {
        ActivityC45651qj mo49getActivity;
        boolean z = aRunnableS11S0110000_5.z1;
        Fragment fragment = (Fragment) aRunnableS11S0110000_5.l0;
        long currentTimeMillis = System.currentTimeMillis();
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        if (z && (mo49getActivity = fragment.mo49getActivity()) != null && mo49getActivity.getSupportFragmentManager() != null && (mo49getActivity.getSupportFragmentManager() == null || (fragment = BPQ.LIZ(mo49getActivity.getSupportFragmentManager().LJJJJLI())) != null)) {
            LIZIZ.LIZ(fragment.mo49getActivity(), fragment);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentManagerLancet#setUserVisibleHint cost: ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    public ARunnableS11S0110000_5(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}

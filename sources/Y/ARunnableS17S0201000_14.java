package Y;

import X.BMW;
import X.C0A2;
import X.C2050382x;
import X.C2311095e;
import X.C62562cu;
import X.C72440Sbs;
import X.C79340VBw;
import X.C79646VNq;
import X.C79907VXr;
import X.C80143Vcp;
import X.C81434Vxe;
import X.C82172WMu;
import X.C83621Wrp;
import X.C84924XUq;
import X.EnumC79342VBy;
import X.EnumC84152X0y;
import X.FAT;
import X.FAU;
import X.FMS;
import X.FMU;
import X.InterfaceC47046IdG;
import X.InterfaceC67182QYg;
import X.InterfaceC79913VXx;
import X.InterfaceC82683Wch;
import X.NJO;
import X.Q4C;
import X.VEF;
import X.VJH;
import X.VNN;
import X.WMJ;
import X.XWQ;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS17S0201000_14 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        VNN vnn = new VNN(this.i2, "intersection", (JavaOnlyMap) this.l0);
        if (((C79646VNq) this.l1).LJIILLIIL.get().LJLJJL != null) {
            ((C79646VNq) this.l1).LJIILLIIL.get().LJLJJL.LIZIZ(vnn);
        }
    }

    public static final void run$0(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            WMJ.LJII.remove(((C82172WMu) aRunnableS17S0201000_14.l1).LIZ);
            ((View) aRunnableS17S0201000_14.l0).setVisibility(aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((SideSheetBehavior) aRunnableS17S0201000_14.l1).LIZ(aRunnableS17S0201000_14.i2, (View) aRunnableS17S0201000_14.l0, false);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        switch (aRunnableS17S0201000_14.i2) {
            case 0:
                C79340VBw c79340VBw = (C79340VBw) aRunnableS17S0201000_14.l0;
                Object obj = aRunnableS17S0201000_14.l1;
                c79340VBw.getClass();
                c79340VBw.LJJJLZIJ(EnumC79342VBy.INTERACT_SEI, obj);
                return;
            case 1:
                Map.Entry entry = (Map.Entry) aRunnableS17S0201000_14.l0;
                ((InterfaceC67182QYg) entry.getKey()).LIZ((C2311095e) aRunnableS17S0201000_14.l1);
                return;
            case 2:
                ((FMS) aRunnableS17S0201000_14.l0).LIZJ((FMU) aRunnableS17S0201000_14.l1);
                return;
            default:
                C84924XUq c84924XUq = (C84924XUq) aRunnableS17S0201000_14.l0;
                c84924XUq.LIZLLL.LJ.LLILZ((MusicModel) aRunnableS17S0201000_14.l1, false);
                return;
        }
    }

    public static final void run$11(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        switch (aRunnableS17S0201000_14.i2) {
            case 0:
                C79340VBw c79340VBw = (C79340VBw) aRunnableS17S0201000_14.l0;
                Object obj = aRunnableS17S0201000_14.l1;
                c79340VBw.getClass();
                c79340VBw.LJJJLZIJ(EnumC79342VBy.INTERACT_SEI, obj);
                return;
            case 1:
                C62562cu c62562cu = (C62562cu) aRunnableS17S0201000_14.l0;
                Object obj2 = aRunnableS17S0201000_14.l1;
                if (c62562cu == null || c62562cu.LIZ()) {
                    C2050382x.LIZ.execute(new ARunnableS18S0101000_14(0, obj2, 24));
                    return;
                }
                Iterator it = ((ArrayList) c62562cu.LIZ).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (C72440Sbs.LIZIZ(str)) {
                        C2050382x.LIZ.execute(new ARunnableS17S0201000_14(0, obj2, str, 15));
                        return;
                    }
                }
                C2050382x.LIZ.execute(new IDRunnableS6S0101000(1, obj2, 39));
                return;
            default:
                ((FMS) aRunnableS17S0201000_14.l0).LIZJ((FMU) aRunnableS17S0201000_14.l1);
                return;
        }
    }

    public static final void run$12(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            LLog.LIZLLL(2, "Lynx", "load font success");
            ((VEF) aRunnableS17S0201000_14.l0).LIZ((Typeface) aRunnableS17S0201000_14.l1, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            aRunnableS17S0201000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((PrivilegeBottomSheetBehavior) aRunnableS17S0201000_14.l1).settleToState((View) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        switch (aRunnableS17S0201000_14.i2) {
            case 0:
                ((InterfaceC47046IdG) aRunnableS17S0201000_14.l0).onResult(aRunnableS17S0201000_14.l1);
                return;
            case 1:
                BMW callback = (BMW) aRunnableS17S0201000_14.l0;
                Object this$0 = aRunnableS17S0201000_14.l1;
                o.LJIIIZ(callback, "$callback");
                o.LJIIIZ(this$0, "this$0");
                ((Q4C) callback).LIZIZ();
                return;
            case 2:
                C79907VXr this$02 = (C79907VXr) aRunnableS17S0201000_14.l0;
                Rect movingCursorRec = (Rect) aRunnableS17S0201000_14.l1;
                o.LJIIIZ(this$02, "this$0");
                o.LJIIIZ(movingCursorRec, "$movingCursorRec");
                NJO.LIZIZ.LIZIZ("CustomSelectTextView", "onCursorMoving");
                InterfaceC79913VXx interfaceC79913VXx = this$02.LLFF;
                if (interfaceC79913VXx != null) {
                    interfaceC79913VXx.LIZJ(movingCursorRec);
                    return;
                }
                return;
            default:
                FAU fau = (FAU) aRunnableS17S0201000_14.l0;
                Activity activity = (Activity) aRunnableS17S0201000_14.l1;
                fau.getClass();
                ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                viewTreeObserver.addOnDrawListener(new FAT(fau, activity, viewTreeObserver));
                return;
        }
    }

    public static final void run$16(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((ViewPagerBottomSheetBehavior) aRunnableS17S0201000_14.l1).LIZIZ(aRunnableS17S0201000_14.i2, (View) aRunnableS17S0201000_14.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            if (!((Activity) aRunnableS17S0201000_14.l0).isFinishing()) {
                ((InterfaceC82683Wch) aRunnableS17S0201000_14.l1).show();
                VJH vjh = C81434Vxe.LIZ;
                int i = aRunnableS17S0201000_14.i2 + 1;
                if (vjh.LIZIZ == null) {
                    vjh.LIZIZ = vjh.LIZ.edit();
                }
                vjh.LIZIZ.putInt("duet_layout_tool_bar_bubble_hint", i).apply();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        XWQ xwq = (XWQ) aRunnableS17S0201000_14.l0;
        int i = aRunnableS17S0201000_14.i2;
        MusicModel musicModel = (MusicModel) aRunnableS17S0201000_14.l1;
        xwq.getClass();
        C80143Vcp c80143Vcp = new C80143Vcp(xwq.LJ);
        c80143Vcp.LIZ = i;
        C0A2 layoutManager = xwq.LIZIZ.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.LLIIIILZ(c80143Vcp);
        }
        xwq.LIZIZ.post(new ARunnableS18S0201000_15(i, xwq, musicModel, 9));
    }

    public static final void run$2(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS17S0201000_14.l1).setISO((TECameraCapture) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS17S0201000_14.l1).switchFlashMode((TECameraCapture) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS17S0201000_14.l1).switchCameraMode((TECameraCapture) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS17S0201000_14.l1).changeCurrentControlCam((TECameraCapture) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS17S0201000_14.l1).changeRecorderState((TECameraCapture) aRunnableS17S0201000_14.l0, aRunnableS17S0201000_14.i2, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior) aRunnableS17S0201000_14.l1).LIZIZ(aRunnableS17S0201000_14.i2, (View) aRunnableS17S0201000_14.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        ((C83621Wrp) aRunnableS17S0201000_14.l0).r0((File) aRunnableS17S0201000_14.l1, aRunnableS17S0201000_14.i2);
    }

    public static final void run$9(ARunnableS17S0201000_14 aRunnableS17S0201000_14) {
        boolean LIZ;
        try {
            ((com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior) aRunnableS17S0201000_14.l1).LIZIZ(aRunnableS17S0201000_14.i2, (View) aRunnableS17S0201000_14.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S0201000_14(View view, SideSheetBehavior sideSheetBehavior, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = sideSheetBehavior;
        this.i2 = 3;
    }

    public ARunnableS17S0201000_14(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.$t = i;
        this.l1 = viewPagerBottomSheetBehavior;
        this.l0 = view;
        this.i2 = 4;
    }

    public ARunnableS17S0201000_14(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

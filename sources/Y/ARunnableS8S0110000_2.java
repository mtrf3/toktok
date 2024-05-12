package Y;

import X.ActivityC45651qj;
import X.C147295qH;
import X.C148395s3;
import X.C151325wm;
import X.C1548265u;
import X.C161516Vn;
import X.C5S1;
import X.C5V3;
import X.C60903NvH;
import X.C60B;
import X.C66I;
import X.C66T;
import X.C6N7;
import X.C6W7;
import X.C76857UEj;
import X.C78915Uy7;
import X.DialogC111064Xm;
import X.ExecutorC149205tM;
import X.GV9;
import X.H7R;
import X.InterfaceC151725xQ;
import X.InterfaceC76859UEl;
import X.ViewOnClickListenerC151455wz;
import android.app.Activity;
import android.widget.ImageView;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS8S0110000_2 implements Runnable {
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (this.z1) {
            GV9 LJIIJ = C60903NvH.LJIIJJI().LJIIJ();
            VideoPublishEditModel videoPublishEditModel = ((C147295qH) this.l0).LJLLJ;
            if (videoPublishEditModel != null) {
                LJIIJ.LJI(videoPublishEditModel, videoPublishEditModel.getCreationId(), 1, null);
                return;
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
        C60903NvH.LJIIJJI().LJIIJ().LJIILIIL();
    }

    public final void LIZ$1() {
        int i;
        int i2;
        if (this.z1) {
            ActivityC45651qj activityC45651qj = ((C60B) this.l0).LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            if (H7R.LJJJJL(((C60B) this.l0).LIZIZ)) {
                i2 = R.string.fj3;
            } else {
                i2 = R.string.fj1;
            }
            creativeToastBuilder.messageRes(i2);
            C78915Uy7.LJJIIZI(activityC45651qj, 3013, creativeToastBuilder);
            return;
        }
        ActivityC45651qj activityC45651qj2 = ((C60B) this.l0).LIZ;
        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
        if (H7R.LJJJJL(((C60B) this.l0).LIZIZ)) {
            i = R.string.fj2;
        } else {
            i = R.string.fj0;
        }
        creativeToastBuilder2.messageRes(i);
        C78915Uy7.LJJIIZI(activityC45651qj2, 3013, creativeToastBuilder2);
    }

    public static final void run$0(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            final C6N7 c6n7 = (C6N7) aRunnableS8S0110000_2.l0;
            final boolean z = aRunnableS8S0110000_2.z1;
            c6n7.getClass();
            if (!C60903NvH.LJIIJJI().getAccountService().isLogin()) {
                C76857UEj.LJFF(c6n7.LJIIIIZZ, "video_edit_page", new InterfaceC76859UEl() { // from class: X.6NC
                    @Override // X.InterfaceC76859UEl
                    public final void onSuccess() {
                        C6N7.this.LIZJ(z);
                    }
                });
            } else {
                c6n7.LIZJ(z);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            aRunnableS8S0110000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        int i;
        NewCutPlayerActivity this$0 = (NewCutPlayerActivity) aRunnableS8S0110000_2.l0;
        boolean z = aRunnableS8S0110000_2.z1;
        o.LJIIIZ(this$0, "this$0");
        this$0.LLIIII.getClass();
        ImageView imageView = (ImageView) this$0.findViewById(R.id.f8u);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        this$0.LLIIII.LIZ.getClass();
    }

    public static final void run$2(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            C147295qH c147295qH = (C147295qH) aRunnableS8S0110000_2.l0;
            c147295qH.LLLILZ(c147295qH.LJLLL, c147295qH.LJLLLL, new Runnable() { // from class: X.5tN
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, new ARunnableS8S0110000_2(c147295qH, aRunnableS8S0110000_2.z1, 1), false, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            ExecutorC149205tM.LJLILLLLZI.execute(new ARunnableS8S0110000_2((C147295qH) aRunnableS8S0110000_2.l0, aRunnableS8S0110000_2.z1, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            TEImageInterface tEImageInterface = ((C151325wm) aRunnableS8S0110000_2.l0).LJII;
            if (tEImageInterface != null) {
                tEImageInterface.renderLayerQueue(aRunnableS8S0110000_2.z1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            aRunnableS8S0110000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        int i;
        try {
            if (aRunnableS8S0110000_2.z1) {
                if (H7R.LJJJJL(((C148395s3) aRunnableS8S0110000_2.l0).LJIIIZ())) {
                    i = R.string.fj3;
                } else {
                    i = R.string.fj1;
                }
            } else if (H7R.LJJJJL(((C148395s3) aRunnableS8S0110000_2.l0).LJIIIZ())) {
                i = R.string.fj2;
            } else {
                i = R.string.fj0;
            }
            C148395s3 c148395s3 = (C148395s3) aRunnableS8S0110000_2.l0;
            Activity activity = (Activity) c148395s3.LJLJL.LIZ(c148395s3, C148395s3.LJLLJ[1]);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(i);
            C78915Uy7.LJJIIZI(activity, 3013, creativeToastBuilder);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        DialogC111064Xm dialogC111064Xm;
        DialogC111064Xm dialogC111064Xm2;
        C66I c66i = (C66I) aRunnableS8S0110000_2.l0;
        boolean z = aRunnableS8S0110000_2.z1;
        C66T c66t = c66i.LIZ.LLILLIZIL;
        if (c66t != null && (dialogC111064Xm = c66t.LJIIIZ) != null && dialogC111064Xm.isShowing() && (dialogC111064Xm2 = c66t.LJIIIZ) != null) {
            dialogC111064Xm2.dismiss();
        }
        c66i.LIZ.LJIJI(true);
        c66i.LIZ.LIZLLL();
        C1548265u c1548265u = c66i.LIZ.LJLJI;
        if (c1548265u != null) {
            c1548265u.invalidate();
            if (z) {
                C5S1 c5s1 = new C5S1(c66i.LIZ.LJLLJ.getContext());
                c5s1.LIZJ(R.string.g5e);
                c5s1.LJ();
            }
        }
    }

    public static final void run$8(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        boolean LIZ;
        try {
            ((ViewOnClickListenerC151455wz) aRunnableS8S0110000_2.l0).LLJJIJI(aRunnableS8S0110000_2.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS8S0110000_2 aRunnableS8S0110000_2) {
        C5V3 c5v3;
        C6W7 c6w7 = (C6W7) aRunnableS8S0110000_2.l0;
        boolean z = aRunnableS8S0110000_2.z1;
        C161516Vn c161516Vn = c6w7.LIZ.LLIILZL;
        C5V3 c5v32 = c161516Vn.LJIIIIZZ;
        if (c5v32 != null && c5v32.isShowing() && (c5v3 = c161516Vn.LJIIIIZZ) != null) {
            c5v3.dismiss();
        }
        c6w7.LIZ.LJIIJJI(true);
        c6w7.LIZ.LIZIZ();
        c6w7.LIZ.LJLJI.invalidate();
        if (z) {
            C5S1 c5s1 = new C5S1(c6w7.LIZ.LJLLILLLL.getContext());
            c5s1.LIZJ(R.string.g5e);
            c5s1.LJ();
        }
    }

    public ARunnableS8S0110000_2(C66I c66i, int i) {
        this.$t = i;
        this.l0 = c66i;
        this.z1 = true;
    }

    public ARunnableS8S0110000_2(C6W7 c6w7, int i) {
        this.$t = i;
        this.l0 = c6w7;
        this.z1 = true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS8S0110000_2(X.C147295qH r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0110000_2.<init>(X.5qH, boolean, int):void");
    }

    public ARunnableS8S0110000_2(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }

    public ARunnableS8S0110000_2(C151325wm c151325wm, boolean z, InterfaceC151725xQ interfaceC151725xQ, int i) {
        this.$t = i;
        this.l0 = c151325wm;
        this.z1 = z;
    }
}

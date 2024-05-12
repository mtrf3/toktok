package Y;

import X.C03880Dg;
import X.C138075bP;
import X.C1545864w;
import X.C170576mj;
import X.C39579Fg7;
import X.C47918IrK;
import X.C63D;
import X.C63E;
import X.C65300Pk0;
import X.C77903Uhn;
import X.C78688UuS;
import X.C78915Uy7;
import X.InterfaceC139045cy;
import X.InterfaceC153045zY;
import X.ProgressDialogC173706rm;
import X.ProgressDialogC43239Gy3;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import ujb.o;

/* loaded from: classes3.dex */
public class ARunnableS3S1100000_2 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
        ((EditAudioRecordScene) this.l1).clickable = false;
        EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) this.l1;
        editAudioRecordScene.mHandler.sendEmptyMessage(editAudioRecordScene.MSG_SHOWLOADING);
        if (!o.LJJJJ(this.s0, "wav", false)) {
            C39579Fg7.LJIL(this.s0);
        }
        EditAudioRecordScene editAudioRecordScene2 = (EditAudioRecordScene) this.l1;
        editAudioRecordScene2.mHandler.sendEmptyMessage(editAudioRecordScene2.MSG_CLOSE);
    }

    public final void LIZ$1() {
        ProgressDialogC43239Gy3 progressDialogC43239Gy3;
        if (((C138075bP) this.l1).LLJJIII) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        if (!C47918IrK.LIZ(C78688UuS.LJJIII((C138075bP) this.l1))) {
            creativeToastBuilder.messageRes(R.string.e45);
        } else {
            String str = this.s0;
            if (str == null || str.length() == 0) {
                creativeToastBuilder.messageRes(R.string.s6k);
            } else {
                String str2 = this.s0;
                if (str2 == null) {
                    str2 = "";
                }
                creativeToastBuilder.message(str2);
            }
        }
        C78915Uy7.LJJIIZI(C78688UuS.LJIJJ((C138075bP) this.l1), 3022, creativeToastBuilder);
        ((C138075bP) this.l1).LLJLIL().wZ(false);
        InterfaceC153045zY value = ((C138075bP) this.l1).LLJLIL().Kh().getValue();
        if (value != null) {
            value.LLJILJIL(true);
        }
        InterfaceC153045zY value2 = ((C138075bP) this.l1).LLJLIL().Kh().getValue();
        if (value2 != null) {
            value2.play();
        }
        C63D LLLFZ = ((C138075bP) this.l1).LLLFZ();
        if (LLLFZ != null) {
            LLLFZ.K3(false);
        }
        InterfaceC139045cy LLLI = ((C138075bP) this.l1).LLLI();
        if (LLLI != null) {
            LLLI.hj0(false);
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy32 = ((C138075bP) this.l1).LLJJIJIIJIL;
        if (progressDialogC43239Gy32 != null && progressDialogC43239Gy32.isShowing() && (progressDialogC43239Gy3 = ((C138075bP) this.l1).LLJJIJIIJIL) != null) {
            progressDialogC43239Gy3.dismiss();
        }
    }

    public final void LIZ$2() {
        ProgressDialogC173706rm progressDialogC173706rm = (ProgressDialogC173706rm) this.l1;
        String str = this.s0;
        if (!progressDialogC173706rm.LJLJLJ.isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/tools/mvtemplate/net/MvNetDialog", "show", progressDialogC173706rm, new Object[0], "void", new C65300Pk0(false, "()V", "3933364593277928825")).LIZ) {
            progressDialogC173706rm.show();
        }
        progressDialogC173706rm.setMessage(str);
        progressDialogC173706rm.LIZIZ();
        progressDialogC173706rm.LJLL.start();
    }

    public final void LIZ$3() {
        float LIZ;
        Integer num;
        float LIZIZ;
        float LIZ2;
        Integer num2;
        C77903Uhn c77903Uhn = new C77903Uhn(2);
        Activity activity = ((C1545864w) this.l1).mActivity;
        if (activity != null) {
            String stickerText = this.s0;
            kotlin.jvm.internal.o.LJIIIIZZ(stickerText, "stickerText");
            VideoPublishEditModel editModel = ((C1545864w) this.l1).getEditModel();
            kotlin.jvm.internal.o.LJIIIZ(editModel, "editModel");
            CreativeModel creativeModel = editModel.creativeModel;
            kotlin.jvm.internal.o.LJIIIIZZ(creativeModel, "editModel.creativeModel");
            boolean z = creativeModel.changeAvatarModel.isFromAiVatar;
            ArrayList arrayList = new ArrayList();
            String str = (String) c77903Uhn.LIZ;
            float f = 2;
            float LIZJ = C170576mj.LIZJ(activity) / f;
            if (z) {
                LIZ = ((C170576mj.LIZJ(activity) / f) + (C170576mj.LIZIZ(activity) / f)) - C170576mj.LIZ(activity, 58.0f);
            } else {
                LIZ = C170576mj.LIZ(activity, 123.0f) + (C170576mj.LIZIZ(activity) / f);
            }
            if (z) {
                num = 20;
            } else {
                num = null;
            }
            arrayList.add(C77903Uhn.LIZ(activity, str, LIZJ, LIZ, 1.0f, num));
            float LIZJ2 = C170576mj.LIZJ(activity) / f;
            if (z) {
                LIZIZ = (C170576mj.LIZIZ(activity) / f) - (C170576mj.LIZJ(activity) / f);
                LIZ2 = C170576mj.LIZ(activity, 28.0f);
            } else {
                LIZIZ = C170576mj.LIZIZ(activity) / f;
                LIZ2 = C170576mj.LIZ(activity, 220.0f);
            }
            float f2 = LIZIZ - LIZ2;
            if (z) {
                num2 = 24;
            } else {
                num2 = null;
            }
            arrayList.add(C77903Uhn.LIZ(activity, stickerText, LIZJ2, f2, 1.0f, num2));
            if (!z) {
                arrayList.add(C77903Uhn.LIZ(activity, (String) c77903Uhn.LIZIZ, C170576mj.LIZJ(activity) / f, C170576mj.LIZ(activity, 170.0f) + (C170576mj.LIZIZ(activity) / f), 0.5f, null));
            }
            C1545864w c1545864w = (C1545864w) this.l1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TextStickerData textStickerData = (TextStickerData) it.next();
                C63E c63e = c1545864w.LJLLLLLL;
                if (c63e != null) {
                    c63e.LIZIZ(textStickerData, true);
                } else {
                    kotlin.jvm.internal.o.LJIJI("textStickerController");
                    throw null;
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void run$0(ARunnableS3S1100000_2 aRunnableS3S1100000_2) {
        boolean LIZ;
        try {
            ((FTCEditAudioRecordScene) aRunnableS3S1100000_2.l1).clickable = false;
            ((FTCEditAudioRecordScene) aRunnableS3S1100000_2.l1).mHandler.sendEmptyMessage(1);
            if (!o.LJJJJ(aRunnableS3S1100000_2.s0, "wav", false)) {
                C39579Fg7.LJIL(aRunnableS3S1100000_2.s0);
            }
            ((FTCEditAudioRecordScene) aRunnableS3S1100000_2.l1).mHandler.sendEmptyMessage(4);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S1100000_2 aRunnableS3S1100000_2) {
        boolean LIZ;
        try {
            aRunnableS3S1100000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S1100000_2 aRunnableS3S1100000_2) {
        boolean LIZ;
        try {
            aRunnableS3S1100000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S1100000_2 aRunnableS3S1100000_2) {
        boolean LIZ;
        try {
            aRunnableS3S1100000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S1100000_2 aRunnableS3S1100000_2) {
        boolean LIZ;
        try {
            aRunnableS3S1100000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1100000_2(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

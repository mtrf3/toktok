package X;

import Y.IDTListenerS116S0100000_7;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GJj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41315GJj {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        Activity LIZ2 = C105574Cj.LIZ(rootView.getContext());
        if (LIZ2 == null) {
            return;
        }
        LJ(new IDTListenerS116S0100000_7(LIZ2, 2), rootView);
    }

    public static final boolean LIZIZ(VideoPublishEditModel model) {
        boolean z;
        boolean z2;
        o.LJIIIZ(model, "model");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("needShowPrompt: AddPromptForUploadHighQualityVideo.isEnable() = ");
        FFL.LJIIIZ().getClass();
        LIZ2.append(FFL.LJ(31744, "studio_enable_hd_upload_video_toast", true, false));
        LIZ2.append(", PublishSettingKevaKt.needShowPromptTimesForCurrentUser() = ");
        LIZ2.append(C78685UuP.LJJLIIIJ());
        LIZ2.append(", publishHighQualityVideo() = ");
        LIZ2.append(LIZJ(model, C78685UuP.LJJJJL(model.uploadSpeedInfo.getSpeed())));
        LIZ2.append(", PublishScheduler.getPublishTaskListSize() == 0: ");
        if (GUH.LJIIZILJ() == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append(", NeyWorkAvailable = ");
        EF7.LIZIZ();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z2 = false;
        }
        LIZ2.append(z2);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "studio_enable_hd_upload_video_toast", true, false) && C78685UuP.LJJLIIIJ() && LIZJ(model, C78685UuP.LJJJJL(model.uploadSpeedInfo.getSpeed())) && GUH.LJIIZILJ() == 0) {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    return true;
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public static final void LIZLLL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C44172HVg.LJIIJ.getClass();
        boolean z = true;
        if (model.isPrivate() != 1) {
            z = false;
        }
        SharePrefCache.inst().getIsAwemePrivate().LIZLLL(Boolean.valueOf(z));
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        int[] LJ = C44729Hgz.LJ(videoPublishEditModel, z);
        if (Math.min(LJ[0], LJ[1]) < 1080 && Math.max(LJ[0], LJ[1]) < 1920) {
            return false;
        }
        return true;
    }

    public static void LJ(IDTListenerS116S0100000_7 iDTListenerS116S0100000_7, View view) {
        if (view.getId() == R.id.a9d) {
            return;
        }
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(iDTListenerS116S0100000_7);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View innerView = viewGroup.getChildAt(i);
                o.LJIIIIZZ(innerView, "innerView");
                LJ(iDTListenerS116S0100000_7, innerView);
            }
        }
    }
}

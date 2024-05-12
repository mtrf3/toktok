package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.image.ui.ImageEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.GeV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42027GeV implements InterfaceC42390GkM {
    @Override // X.InterfaceC42390GkM
    public final LifecycleOwner LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LifecycleOwner targetLifecycleOwner = getTargetLifecycleOwner(activity);
        if (targetLifecycleOwner != null) {
            return targetLifecycleOwner;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC42390GkM
    public final Bundle LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        Bundle LIZLLL = LIZLLL(activity);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC42390GkM
    public final Bundle LIZLLL(Activity activity) {
        if (activity == null) {
            return null;
        }
        if (activity instanceof SAAActivity) {
            AbstractC42651GoZ LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            if (LLIIIILZ == null) {
                return null;
            }
            return LLIIIILZ.mArguments;
        }
        return C16880lQ.LLJJIJI(activity.getIntent());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0007 A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC42390GkM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class<? extends X.WMH> LJ(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case 845621112: goto L3a;
                case 946825695: goto L2e;
                case 1154195433: goto L22;
                case 1175440958: goto L16;
                case 1926778981: goto La;
                default: goto L7;
            }
        L7:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene> r0 = com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene.class
        L9:
            return r0
        La:
            java.lang.String r0 = "ImageEditRootScene"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L13
            goto L7
        L13:
            java.lang.Class<com.ss.android.ugc.aweme.image.ui.ImageEditRootScene> r0 = com.ss.android.ugc.aweme.image.ui.ImageEditRootScene.class
            goto L9
        L16:
            java.lang.String r0 = "ExteriorVideoRecordScene"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            goto L7
        L1f:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene> r0 = com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene.class
            goto L9
        L22:
            java.lang.String r0 = "SelectMaterialScene"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L7
        L2b:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene> r0 = com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene.class
            goto L9
        L2e:
            java.lang.String r0 = "VideoPublishContainerScene"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L37
            goto L7
        L37:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene> r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene.class
            goto L9
        L3a:
            java.lang.String r0 = "VideoRecordNewScene"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto L7
        L43:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene> r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene.class
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42027GeV.LJ(java.lang.String):java.lang.Class");
    }

    @Override // X.InterfaceC42390GkM
    public final WMH LJFF(String str) {
        WM7 LIZ = C65531Pnj.LIZ(null, LJ(str));
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        return (WMH) LIZ;
    }

    @Override // X.InterfaceC42390GkM
    public final AbstractC42651GoZ getCurrentScene(Activity activity) {
        if (activity instanceof SAAActivity) {
            return ((SAAActivity) activity).LLIIIILZ();
        }
        if (activity instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) activity).LJLJJI;
        }
        if (activity instanceof ImageEditActivity) {
            return ((ImageEditActivity) activity).LLILIL();
        }
        if (activity instanceof VideoPublishActivity) {
            return ((VideoPublishActivity) activity).LJLJJLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42390GkM
    public final LifecycleOwner getTargetLifecycleOwner(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof SAAActivity) {
            AbstractC42651GoZ LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            AbstractC42651GoZ abstractC42651GoZ = activity;
            if (LLIIIILZ != null) {
                abstractC42651GoZ = LLIIIILZ;
            }
            return abstractC42651GoZ;
        }
        if (activity instanceof LifecycleOwner) {
            return (LifecycleOwner) activity;
        }
        return null;
    }

    @Override // X.InterfaceC42390GkM
    public final void LIZIZ(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (activity instanceof SAAActivity) {
            ((SAAActivity) activity).LLIIJLIL(interfaceC65784Pro);
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}

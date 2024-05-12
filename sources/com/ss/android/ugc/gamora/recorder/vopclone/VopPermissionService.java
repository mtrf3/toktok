package com.ss.android.ugc.gamora.recorder.vopclone;

import X.ActivityC45651qj;
import X.C04330Ez;
import X.C26227ARb;
import X.C58096Mr6;
import X.C5L7;
import X.E2C;
import X.OHQ;
import X.ORZ;
import X.UC0;
import android.content.Context;
import com.ss.android.ugc.aweme.services.audio.IVopPermissionService;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VopPermissionService implements IVopPermissionService {
    public static IVopPermissionService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IVopPermissionService.class, false);
        if (LIZ != null) {
            return (IVopPermissionService) LIZ;
        }
        if (C58096Mr6.G8 == null) {
            synchronized (IVopPermissionService.class) {
                if (C58096Mr6.G8 == null) {
                    C58096Mr6.G8 = new VopPermissionService();
                }
            }
        }
        return C58096Mr6.G8;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkAllPermissionsGranted(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkPermissionGranted(String str) {
        o.LJIIIZ(str, OHQ.LIZ);
        return checkAllPermissionsGranted(new String[]{str});
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final int[] checkSelfPermissions(String[] strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        Context LIZ = C5L7.LIZ();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C04330Ez.LIZ(LIZ, str)));
        }
        return ORZ.LLJ(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final void showRequestAudioSettingDialog(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getString(R.string.rte));
        String string = activity.getString(R.string.rtr, E2C.LIZJ("android.permission.RECORD_AUDIO", activity.getString(R.string.rtp)).get(new String[]{"android.permission.RECORD_AUDIO"}[0]));
        o.LJIIIIZZ(string, "context.getString(R.stri…ons[0]]\n                )");
        c26227ARb.LIZIZ(string);
        UC0.LIZJ(c26227ARb, new AqS173S0100000_7(activity, 212));
        new AutoDismissPermissionDialog(activity, c26227ARb).LIZ();
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.ss.android.ugc.aweme.services.audio.IVopPermissionService
    public final boolean checkAllPermissionsGranted(String[] strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        return checkAllPermissionsGranted(checkSelfPermissions(strArr));
    }
}

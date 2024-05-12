package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.image.ui.ImageEditActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.6bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163786bm {
    public static void LIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (C163846bs.LIZ()) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI != null) {
                C139895eL.LIZIZ = true;
                C42662Gok.LIZLLL(context, LLJJIJI, "ImageEditRootScene", Integer.valueOf(LLJJIJI.getInt("extra_request_code", 1002)), 16);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C139895eL.LIZIZ = true;
        intent.setClass(context, ImageEditActivity.class);
        int intExtra = intent.getIntExtra("extra_request_code", 1002);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C42326GjK.LIZ.getClass();
            C42326GjK.LJFF(LJIJJ, intExtra, intent);
        }
    }
}

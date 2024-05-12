package com.bytedance.ugc.glue;

import X.ActivityC45651qj;
import X.VCB;
import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes15.dex */
public final class UGCViewUtils {
    public static Activity getActivity(View view) {
        VCB.LIZ().getClass();
        Activity activity = null;
        while (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    break;
                }
            } else {
                activity = null;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return activity;
    }

    public static String getDiggText(int i) {
        VCB.LIZ().getClass();
        return String.valueOf(String.valueOf(i));
    }

    public static String getDisplayNum(int i) {
        VCB LIZ = VCB.LIZ();
        String valueOf = String.valueOf(i);
        LIZ.getClass();
        return String.valueOf(valueOf);
    }

    public static ActivityC45651qj getFragmentActivity(View view) {
        Activity activity = getActivity(view);
        if (activity instanceof ActivityC45651qj) {
            return (ActivityC45651qj) activity;
        }
        return null;
    }

    public static Activity getActivity(Context context) {
        VCB.LIZ().getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static String getDisplayNum(String str) {
        VCB.LIZ().getClass();
        return String.valueOf(str);
    }
}

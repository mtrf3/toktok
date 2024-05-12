package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJ9 {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(UserVerify userVerify) {
        if (!TextUtils.isEmpty(userVerify.getCustomVerify()) || !TextUtils.isEmpty(userVerify.getEnterpriseVerifyReason())) {
            return true;
        }
        return false;
    }

    public static final int LIZ(Context context, Float f) {
        if (context == null || f == null) {
            return R.drawable.ax3;
        }
        int LJIILL = KL2.LJIILL(context, f.floatValue());
        if (LJIILL != 17) {
            if (LJIILL != 20) {
                switch (LJIILL) {
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 12:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 14:
                    case 15:
                        return R.drawable.ax3;
                }
            }
            return R.drawable.ax5;
        }
        return R.drawable.ax4;
    }

    public static final boolean LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(Context context, TextView txtUserName, boolean z) {
        Drawable LIZ2;
        float LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(txtUserName, "txtUserName");
        Float valueOf = Float.valueOf(txtUserName.getTextSize());
        if (valueOf == null) {
            LIZ2 = null;
        } else {
            int LJIILL = KL2.LJIILL(context, valueOf.floatValue());
            if (LJIILL != 17) {
                if (LJIILL != 20) {
                    switch (LJIILL) {
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        case 12:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        case 14:
                        case 15:
                            LIZ2 = C20110qd.LIZ(context, R.drawable.ax3);
                            break;
                        default:
                            LIZ2 = C20110qd.LIZ(context, R.drawable.ax5);
                            break;
                    }
                } else {
                    LIZ2 = C20110qd.LIZ(context, R.drawable.ax5);
                }
            } else {
                LIZ2 = C20110qd.LIZ(context, R.drawable.ax4);
            }
        }
        if (z && LIZ2 != null) {
            txtUserName.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ2, (Drawable) null);
            Float valueOf2 = Float.valueOf(txtUserName.getTextSize());
            if (valueOf2 == null) {
                LIZJ = KL2.LIZJ(context, 4.0f);
            } else {
                int LJIILL2 = KL2.LJIILL(context, valueOf2.floatValue());
                if (LJIILL2 != 17 && LJIILL2 != 20) {
                    switch (LJIILL2) {
                        case 12:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        case 14:
                        case 15:
                            LIZJ = KL2.LIZJ(context, 3.0f);
                            break;
                        default:
                            LIZJ = KL2.LIZJ(context, 4.0f);
                            break;
                    }
                } else {
                    LIZJ = KL2.LIZJ(context, 4.0f);
                }
            }
            txtUserName.setCompoundDrawablePadding((int) LIZJ);
            return;
        }
        txtUserName.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static void LJFF(Context context, TextView textView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textView.getText());
        if (z) {
            try {
                spannableStringBuilder.delete((spannableStringBuilder.length() - 2) - 3, spannableStringBuilder.length() - 3);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) " T");
        spannableStringBuilder.setSpan(new T59(context, LIZ(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
    }

    public static final void LJI(Context context, UserVerify userVerify, TextView textView) {
        if (context == null || textView == null || !LIZIZ(userVerify)) {
            return;
        }
        LJFF(context, textView, false);
    }

    public static final void LJ(Context context, String str, String str2, TextView textView) {
        if (context == null || textView == null) {
            return;
        }
        LIZLLL(context, textView, LIZJ(str, str2));
    }
}

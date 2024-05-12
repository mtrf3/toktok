package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.promote.PromoteProgramDialog;

/* renamed from: X.M4l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56215M4l {
    public static PromoteProgramDialog LIZ;
    public static SharedPreferences LIZIZ;

    public static SharedPreferences LIZ() {
        if (LIZIZ == null) {
            LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme-promote-dialog");
        }
        return LIZIZ;
    }
}

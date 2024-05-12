package X;

import android.content.SharedPreferences;

/* renamed from: X.BbZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29105BbZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        if (C15380j0.LIZLLL() != null) {
            SharedPreferences.Editor edit = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "broadcast_storage").edit();
            edit.putBoolean("saved_last_gift_feature", z);
            edit.commit();
        }
    }
}

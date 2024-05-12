package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.HashMap;

/* renamed from: X.5nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145385nC {
    public static C145355n9 LIZ(Boolean bool, String str, AVMusic aVMusic, String str2, HashMap hashMap, long j, long j2, int i) {
        boolean z;
        long j3 = j2;
        HashMap hashMap2 = hashMap;
        long j4 = j;
        if ((i & 16) != 0) {
            hashMap2 = null;
        }
        if ((i & 32) != 0) {
            j4 = -1;
        }
        if ((i & 64) != 0) {
            j3 = -1;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new C145355n9(z, str, aVMusic, str2, false, hashMap2, j4, j3, 16);
    }
}

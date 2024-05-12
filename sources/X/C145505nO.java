package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.5nO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145505nO {
    public static /* synthetic */ void LIZ(InterfaceC145495nN interfaceC145495nN, String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, boolean z5, int i) {
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z5;
        boolean z9 = z4;
        long j3 = j2;
        if ((i & 8) != 0) {
            z7 = false;
        }
        if ((i & 16) != 0) {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z9 = false;
        }
        if ((i & 128) != 0) {
            j3 = -1;
        }
        if ((i & 256) != 0) {
            z8 = false;
        }
        interfaceC145495nN.t3(str, aVMusic, z, z7, z6, z9, j3, z8, false);
    }
}

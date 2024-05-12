package X;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.09d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C028109d {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new InterfaceC028009c() { // from class: X.1BS
            @Override // X.InterfaceC028009c
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC028009c
            public final void LJ(int i, Object obj) {
            }
        };
    }

    public static void LIZ(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x0148. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r19, java.util.concurrent.Executor r20, X.InterfaceC028009c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C028109d.LIZIZ(android.content.Context, java.util.concurrent.Executor, X.09c, boolean):void");
    }
}

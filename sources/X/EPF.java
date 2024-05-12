package X;

import android.content.Context;
import com.bytedance.crash.AttachUserData;

/* loaded from: classes7.dex */
public final class EPF implements AttachUserData {
    public final /* synthetic */ Context LIZ;

    public EPF(Context context) {
        this.LIZ = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:2|3)|(18:8|(2:10|(5:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20|11))|24|25|(1:87)|29|(2:32|30)|33|34|35|36|(3:40|(6:42|(4:44|(1:54)(1:48)|(2:50|51)(1:53)|52)|55|56|(2:59|57)|60)(1:67)|(2:62|(2:65|63)))|68|69|(1:71)|(3:73|(2:76|74)|77)|79|80)|90|(0)|24|25|(1:27)|87|29|(1:30)|33|34|35|36|(4:38|40|(0)(0)|(0))|68|69|(0)|(0)|79|80) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|2|3|(18:8|(2:10|(5:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20|11))|24|25|(1:87)|29|(2:32|30)|33|34|35|36|(3:40|(6:42|(4:44|(1:54)(1:48)|(2:50|51)(1:53)|52)|55|56|(2:59|57)|60)(1:67)|(2:62|(2:65|63)))|68|69|(1:71)|(3:73|(2:76|74)|77)|79|80)|90|(0)|24|25|(1:27)|87|29|(1:30)|33|34|35|36|(4:38|40|(0)(0)|(0))|68|69|(0)|(0)|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ce, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01cf, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("error-morpheus : ");
        r1.append(r2.getMessage());
        r8.add(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("error-on-demand : ");
        r1.append(r2.getMessage());
        r8.add(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c0, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c1, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("error-install-time : ");
        r1.append(r2.getMessage());
        r8.add(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:3:0x0006, B:5:0x0022, B:10:0x002e, B:11:0x003d, B:13:0x0043, B:18:0x0054), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x00c0, LOOP:1: B:30:0x00a0->B:32:0x00a6, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:25:0x0080, B:27:0x0094, B:29:0x009c, B:30:0x00a0, B:32:0x00a6, B:87:0x009a), top: B:24:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:36:0x00d9, B:38:0x0103, B:40:0x0109, B:42:0x010f, B:44:0x0118, B:46:0x0120, B:50:0x0131, B:52:0x0134, B:56:0x0137, B:57:0x0146, B:59:0x014c, B:62:0x0162, B:63:0x0166, B:65:0x016c), top: B:35:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162 A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:36:0x00d9, B:38:0x0103, B:40:0x0109, B:42:0x010f, B:44:0x0118, B:46:0x0120, B:50:0x0131, B:52:0x0134, B:56:0x0137, B:57:0x0146, B:59:0x014c, B:62:0x0162, B:63:0x0166, B:65:0x016c), top: B:35:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4 A[Catch: all -> 0x01ce, TryCatch #3 {all -> 0x01ce, blocks: (B:69:0x019e, B:71:0x01a4, B:73:0x01aa, B:74:0x01ae, B:76:0x01b4), top: B:68:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa A[Catch: all -> 0x01ce, TryCatch #3 {all -> 0x01ce, blocks: (B:69:0x019e, B:71:0x01a4, B:73:0x01aa, B:74:0x01ae, B:76:0x01b4), top: B:68:0x019e }] */
    @Override // com.bytedance.crash.AttachUserData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<? extends java.lang.String, ? extends java.lang.String> getUserData(com.bytedance.crash.CrashType r15) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPF.getUserData(com.bytedance.crash.CrashType):java.util.Map");
    }
}

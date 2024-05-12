package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PyV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66199PyV implements InterfaceC64482PSk {
    public static final C66199PyV LIZJ = new C66199PyV();
    public static final CopyOnWriteArrayList<InterfaceC66203PyZ> LIZ = new CopyOnWriteArrayList<>();
    public static final java.util.Set<String> LIZIZ = C77275UUl.LJIIIIZZ("android.app.IActivityManager", "android.app.IActivityTaskManager", "android.content.IContentProvider");

    @Override // X.InterfaceC64482PSk
    public final java.util.Set<String> LIZIZ() {
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (X.C66074PwU.LIZ.LIZIZ == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r2 = r10.substring(ujb.s.LJJLIIIJLLLLLLLZ(r10, '.', 0, 6) + 1);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "(this as java.lang.String).substring(startIndex)");
        r1 = X.X1D.LIZ();
        r1.append("ActivityProcessor_");
        r1.append(r2);
        r1.append('_');
        r1.append(r11.getName());
        X.C66059PwF.LIZIZ(com.bytedance.helios.api.consumer.ApmEvent.LJ(java.lang.System.currentTimeMillis() - r4, X.X1D.LIZIZ(r1)));
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    @Override // X.InterfaceC64482PSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r10, java.lang.reflect.Method r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66199PyV.LIZ(java.lang.String, java.lang.reflect.Method, android.os.Parcel, android.os.Parcel):boolean");
    }
}

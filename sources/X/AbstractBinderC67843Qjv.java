package X;

/* renamed from: X.Qjv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC67843Qjv extends BinderC67896Qkm {
    public AbstractBinderC67843Qjv() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r0.zza >= r2.zza) goto L28;
     */
    @Override // X.BinderC67896Qkm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJLJI(int r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            r10 = this;
            r7 = 0
            r6 = 1
            if (r11 == r6) goto L68
            r0 = 2
            if (r11 == r0) goto L8c
            r0 = 3
            if (r11 == r0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r5 = r12.readInt()
            android.os.IBinder r4 = r12.readStrongBinder()
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzj> r0 = com.google.android.gms.common.internal.zzj.CREATOR
            android.os.Parcelable r9 = X.C67609Qg9.LIZ(r12, r0)
            com.google.android.gms.common.internal.zzj r9 = (com.google.android.gms.common.internal.zzj) r9
            r8 = r10
            X.QlD r8 = (X.BinderC67923QlD) r8
            X.QkF r1 = r8.LJLIL
            java.lang.String r0 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            X.QH7.LJIIIZ(r1, r0)
            X.QH7.LJIIIIZZ(r9)
            r1.LLI = r9
            boolean r0 = r1.LJJIJIIJIL()
            if (r0 == 0) goto L55
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r9.LJLJJI
            X.QlM r3 = X.C67932QlM.LIZ()
            if (r0 != 0) goto L3e
            r2 = r7
        L3a:
            monitor-enter(r3)
            if (r2 != 0) goto L44
            goto L41
        L3e:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r0.zza
            goto L3a
        L41:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = X.C67932QlM.LIZJ     // Catch: java.lang.Throwable -> L51
            goto L4e
        L44:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r3.LIZ     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4e
            int r1 = r0.zza     // Catch: java.lang.Throwable -> L51
            int r0 = r2.zza     // Catch: java.lang.Throwable -> L51
            if (r1 >= r0) goto L54
        L4e:
            r3.LIZ = r2     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L54:
            monitor-exit(r3)
        L55:
            android.os.Bundle r2 = r9.LJLIL
            X.QkF r1 = r8.LJLIL
            java.lang.String r0 = "onPostInitComplete can be called only once per call to getRemoteService"
            X.QH7.LJIIIZ(r1, r0)
            X.QkF r1 = r8.LJLIL
            int r0 = r8.LJLILLLLZI
            r1.LJJIJIIJI(r5, r4, r2, r0)
            r8.LJLIL = r7
            goto La0
        L68:
            int r5 = r12.readInt()
            android.os.IBinder r4 = r12.readStrongBinder()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = X.C67609Qg9.LIZ(r12, r0)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2 = r10
            X.QlD r2 = (X.BinderC67923QlD) r2
            X.QkF r1 = r2.LJLIL
            java.lang.String r0 = "onPostInitComplete can be called only once per call to getRemoteService"
            X.QH7.LJIIIZ(r1, r0)
            X.QkF r1 = r2.LJLIL
            int r0 = r2.LJLILLLLZI
            r1.LJJIJIIJI(r5, r4, r3, r0)
            r2.LJLIL = r7
            goto La0
        L8c:
            r12.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            X.C67609Qg9.LIZ(r12, r0)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r1, r0, r2)
        La0:
            r13.writeNoException()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractBinderC67843Qjv.LJLJI(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}

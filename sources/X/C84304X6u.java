package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.X6u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84304X6u extends C84306X6w {
    public final int LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x000b, B:26:0x0025, B:6:0x0031, B:8:0x003b, B:12:0x0046, B:14:0x0050, B:17:0x005b, B:19:0x006a, B:22:0x0075), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x000b, B:26:0x0025, B:6:0x0031, B:8:0x003b, B:12:0x0046, B:14:0x0050, B:17:0x005b, B:19:0x006a, B:22:0x0075), top: B:2:0x000b }] */
    @Override // X.X78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LJI() {
        /*
            r5 = this;
            java.io.File r0 = r5.LJII
            java.io.File r1 = r0.getCanonicalFile()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r4 = 2
            r2.writeByte(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Throwable -> L8e
            r2.writeString(r0)     // Catch: java.lang.Throwable -> L8e
            long r0 = r1.lastModified()     // Catch: java.lang.Throwable -> L8e
            r2.writeLong(r0)     // Catch: java.lang.Throwable -> L8e
            android.content.Context r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L8e
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            if (r3 == 0) goto L30
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8e
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r3, r0, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8e
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8e
            goto L31
        L30:
            r0 = 0
        L31:
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L8e
            int r0 = r5.LJIIIZ     // Catch: java.lang.Throwable -> L8e
            r3 = 1
            r0 = r0 & 1
            if (r0 != 0) goto L46
            r2.writeByte(r1)     // Catch: java.lang.Throwable -> L8e
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8e
            r2.recycle()
            return r0
        L46:
            android.content.Context r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L8e
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L5b
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L8e
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8e
            r2.recycle()
            return r0
        L5b:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            java.io.File r1 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L8e
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L75
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L8e
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8e
            r2.recycle()
            return r0
        L75:
            r2.writeByte(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Throwable -> L8e
            r2.writeString(r0)     // Catch: java.lang.Throwable -> L8e
            long r0 = r1.lastModified()     // Catch: java.lang.Throwable -> L8e
            r2.writeLong(r0)     // Catch: java.lang.Throwable -> L8e
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8e
            r2.recycle()
            return r0
        L8e:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84304X6u.LJI():byte[]");
    }

    @Override // X.X78
    public final X74 LJIIJ() {
        return new C84305X6v(this, this);
    }

    public C84304X6u(Context context, File file, String str) {
        super(context, str, file);
        this.LJIIIZ = 1;
    }
}

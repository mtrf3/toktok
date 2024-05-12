package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Bundle;
import com.bytedance.push.settings.storage.PushProvider;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FZa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39174FZa implements InterfaceC66858QLu {
    public final Context LIZ;
    public final String LIZIZ;
    public final java.util.Map<PTB, ContentObserver> LIZJ = new ConcurrentHashMap();

    public static Cursor LIZLLL(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-4630579668159938677"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    @Override // X.InterfaceC66858QLu
    public final void LIZ(Context context, String str, String str2) {
    }

    @Override // X.InterfaceC66858QLu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC66858QLu
    public final SharedPreferences.Editor edit() {
        return new FZY(this.LIZ, this.LIZIZ, new FZZ());
    }

    @Override // X.InterfaceC66858QLu
    public final float LIZJ(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // X.InterfaceC66858QLu
    public final boolean contains(String str) {
        try {
            android.net.Uri LJ = LJ(this.LIZ, null);
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            String str2 = this.LIZIZ;
            Bundle bundle = new Bundle();
            bundle.putString("_storage_key", str2);
            bundle.putString("_key", str);
            Bundle call = contentResolver.call(LJ, "_contains", (String) null, bundle);
            if (call == null) {
                return false;
            }
            return call.getBoolean("_result");
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC66858QLu
    public final boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // X.InterfaceC66858QLu
    public final int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // X.InterfaceC66858QLu
    public final long getLong(String str) {
        return getLong(str, 0L);
    }

    @Override // X.InterfaceC66858QLu
    public final String getString(String str) {
        return getString(str, null);
    }

    public C39174FZa(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    public static synchronized android.net.Uri LJ(Context context, C66859QLv c66859QLv) {
        android.net.Uri LIZ;
        synchronized (C39174FZa.class) {
            LIZ = PushProvider.LIZ(context, c66859QLv);
        }
        return LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:7|8)|(6:10|(1:12)|13|14|15|16)|20|13|14|15|16) */
    @Override // X.InterfaceC66858QLu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getBoolean(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.LIZ     // Catch: java.lang.Throwable -> L34
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L34
            android.content.Context r4 = r6.LIZ     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r6.LIZIZ     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "boolean"
            X.QLv r0 = new X.QLv     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3, r7, r2, r1)     // Catch: java.lang.Throwable -> L34
            android.net.Uri r0 = LJ(r4, r0)     // Catch: java.lang.Throwable -> L34
            android.database.Cursor r2 = LIZLLL(r5, r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L20
            goto L34
        L20:
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
            r1 = 0
            int r0 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 <= 0) goto L30
            r1 = 1
            goto L30
        L2f:
            r1 = r8
        L30:
            r2.close()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L34
        L33:
            r8 = r1
        L34:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39174FZa.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:7|8)|(5:10|11|12|13|14)|18|11|12|13|14) */
    @Override // X.InterfaceC66858QLu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getFloat(java.lang.String r7, float r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L31
            android.content.Context r4 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r6.LIZIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "float"
            X.QLv r0 = new X.QLv     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3, r7, r2, r1)     // Catch: java.lang.Throwable -> L31
            android.net.Uri r0 = LJ(r4, r0)     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r1 = LIZLLL(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            r0 = 0
            float r0 = r1.getFloat(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r0 = r8
        L2d:
            r1.close()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L31
        L30:
            r8 = r0
        L31:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39174FZa.getFloat(java.lang.String, float):float");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:7|8)|(5:10|11|12|13|14)|18|11|12|13|14) */
    @Override // X.InterfaceC66858QLu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getInt(java.lang.String r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L31
            android.content.Context r4 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r6.LIZIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "integer"
            X.QLv r0 = new X.QLv     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3, r7, r2, r1)     // Catch: java.lang.Throwable -> L31
            android.net.Uri r0 = LJ(r4, r0)     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r1 = LIZLLL(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r0 = r8
        L2d:
            r1.close()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L31
        L30:
            r8 = r0
        L31:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39174FZa.getInt(java.lang.String, int):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:7|8)|(5:10|11|12|13|14)|18|11|12|13|14) */
    @Override // X.InterfaceC66858QLu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getLong(java.lang.String r7, long r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L31
            android.content.Context r4 = r6.LIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r6.LIZIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "long"
            X.QLv r0 = new X.QLv     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3, r7, r2, r1)     // Catch: java.lang.Throwable -> L31
            android.net.Uri r0 = LJ(r4, r0)     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r2 = LIZLLL(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r0 = r8
        L2d:
            r2.close()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L31
        L30:
            r8 = r0
        L31:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39174FZa.getLong(java.lang.String, long):long");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:7|8)|(5:10|11|12|13|14)|18|11|12|13|14) */
    @Override // X.InterfaceC66858QLu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.LIZ     // Catch: java.lang.Throwable -> L2d
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r3 = r5.LIZ     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.LIZIZ     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "string"
            X.QLv r0 = new X.QLv     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2, r6, r7, r1)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r0 = LJ(r3, r0)     // Catch: java.lang.Throwable -> L2d
            android.database.Cursor r1 = LIZLLL(r4, r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L1c
            goto L2d
        L1c:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r0 = r7
        L29:
            r1.close()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2d
        L2c:
            r7 = r0
        L2d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39174FZa.getString(java.lang.String, java.lang.String):java.lang.String");
    }
}

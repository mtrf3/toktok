package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.ac;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    public Context AFInAppEventType;
    public KeyStore AFKeystoreWrapper;
    public final Object AFInAppEventParameterName = new Object();
    public String valueOf = "";
    public int values = 0;

    public final String AFInAppEventParameterName() {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            str = this.valueOf;
        }
        return str;
    }

    public final String AFInAppEventType() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventParameterName) {
            sb.append(this.valueOf);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.values);
        }
        return sb.toString();
    }

    public final int valueOf() {
        int i;
        synchronized (this.AFInAppEventParameterName) {
            i = this.values;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0020, code lost:
    
        r5 = r2.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r5.length != 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        com.appsflyer.AFLogger.valueOf("Found a matching AF key with alias:\n".concat(r2));
        r6 = true;
        r4 = r5[1].trim().split("=");
        r1 = r5[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.length != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r1.length != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r7.valueOf = r4[1].trim();
        r7.values = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean values() {
        /*
            r7 = this;
            java.lang.Object r3 = r7.AFInAppEventParameterName
            monitor-enter(r3)
            java.security.KeyStore r0 = r7.AFKeystoreWrapper     // Catch: java.lang.Throwable -> L84
            r6 = 0
            if (r0 == 0) goto L82
            java.util.Enumeration r1 = r0.aliases()     // Catch: java.lang.Throwable -> L68
        Lc:
            boolean r0 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L82
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto Lc
            boolean r0 = valueOf(r2)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto Lc
            java.lang.String r0 = ","
            java.lang.String[] r5 = r2.split(r0)     // Catch: java.lang.Throwable -> L68
            int r1 = r5.length     // Catch: java.lang.Throwable -> L68
            r0 = 3
            if (r1 != r0) goto L82
            java.lang.String r0 = "Found a matching AF key with alias:\n"
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L68
            com.appsflyer.AFLogger.valueOf(r0)     // Catch: java.lang.Throwable -> L68
            r6 = 1
            r0 = r5[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "="
            java.lang.String[] r4 = r1.split(r0)     // Catch: java.lang.Throwable -> L68
            r2 = 2
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "="
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L68
            int r0 = r4.length     // Catch: java.lang.Throwable -> L68
            if (r0 != r2) goto L82
            int r0 = r1.length     // Catch: java.lang.Throwable -> L68
            if (r0 != r2) goto L82
            r0 = r4[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L68
            r7.valueOf = r0     // Catch: java.lang.Throwable -> L68
            r0 = r1[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L68
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L68
            r7.values = r0     // Catch: java.lang.Throwable -> L68
            goto L82
        L68:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "Couldn't list KeyStore Aliases: "
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L84
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L84
            com.appsflyer.AFLogger.valueOf(r0, r2)     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            return r6
        L84:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.values():boolean");
    }

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventType = context;
        AFLogger.valueOf("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFKeystoreWrapper = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public static boolean valueOf(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final void AFKeystoreWrapper(String str) {
        AlgorithmParameterSpec algorithmParameterSpec;
        AFLogger.valueOf("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFInAppEventParameterName) {
                if (!this.AFKeystoreWrapper.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (!ac.AFInAppEventParameterName()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.AFInAppEventType).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    } else {
                        algorithmParameterSpec = null;
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.valueOf("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            AFLogger.valueOf("Exception " + th.getMessage() + " occurred", th);
        }
    }
}

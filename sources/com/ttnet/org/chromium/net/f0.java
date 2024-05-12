package com.ttnet.org.chromium.net;

import J.N;
import X.C0NY;
import X.C0ON;
import X.C78939UyV;
import X.O6T;
import X.X1D;
import X.YV7;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes17.dex */
public class f0 {
    public static CertificateFactory LIZ;
    public static X509TrustManagerExtensions LIZIZ;
    public static YV7 LIZJ;
    public static X509TrustManagerExtensions LIZLLL;
    public static KeyStore LJ;
    public static KeyStore LJFF;
    public static File LJI;
    public static Set<Pair<X500Principal, PublicKey>> LJII;
    public static boolean LJIIIIZZ;
    public static final Object LJIIIZ = new Object();
    public static final char[] LJIIJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void LIZJ() {
        synchronized (LJIIIZ) {
            LIZLLL();
        }
    }

    public static void LIZLLL() {
        if (LIZ == null) {
            LIZ = CertificateFactory.getInstance("X.509");
        }
        if (LIZIZ == null) {
            LIZIZ = LIZIZ(null);
        }
        if (!LJIIIIZZ) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                LJFF = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                LJI = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            LJIIIIZZ = true;
        }
        if (LJII == null) {
            LJII = new HashSet();
        }
        if (LJ == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            LJ = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (LIZLLL == null) {
            LIZLLL = LIZIZ(LJ);
        }
        if (LIZJ == null) {
            LIZJ = new YV7();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            O6T.LIZ(LIZJ, O6T.LIZ, intentFilter);
        }
    }

    public static void LJFF() {
        synchronized (LJIIIZ) {
            LIZIZ = null;
            LJII = null;
            LIZLLL();
        }
        N.MzV1TXLS();
    }

    public static X509Certificate LIZ(byte[] bArr) {
        LIZJ();
        return (X509Certificate) LIZ.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static X509TrustManagerExtensions LIZIZ(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        String name = trustManager.getClass().getName();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Error creating trust manager (");
                        LIZ2.append(name);
                        LIZ2.append("): ");
                        LIZ2.append(e);
                        C78939UyV.LJII(X1D.LIZIZ(LIZ2), new Object[0]);
                    }
                }
            }
            C78939UyV.LJII("Could not find suitable trust manager", new Object[0]);
            return null;
        } catch (RuntimeException e2) {
            C78939UyV.LJII("TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e2);
            throw new KeyStoreException(e2);
        }
    }

    public static boolean LJ(X509Certificate x509Certificate) {
        if (LJFF == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (((HashSet) LJII).contains(pair)) {
            return true;
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = LJIIJ;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
            i++;
        } while (i < 4);
        String str = new String(cArr);
        int i3 = 0;
        while (true) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append('.');
            LIZ2.append(i3);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (!new File(LJI, LIZIZ2).exists()) {
                return false;
            }
            KeyStore keyStore = LJFF;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("system:");
            LIZ3.append(LIZIZ2);
            Certificate certificate = keyStore.getCertificate(X1D.LIZIZ(LIZ3));
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    C78939UyV.LJII(C0ON.LIZJ("Anchor ", LIZIZ2, " not an X509Certificate: ", certificate.getClass().getName()), new Object[0]);
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        ((HashSet) LJII).add(pair);
                        return true;
                    }
                }
            }
            i3++;
        }
    }

    public static boolean LJI(X509Certificate x509Certificate) {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                return true;
            }
        }
        return false;
    }

    public static AndroidCertVerifyResult LJII(byte[][] bArr, String str, String str2) {
        List<X509Certificate> checkServerTrusted;
        if (bArr != null && bArr.length != 0) {
            boolean z = false;
            if (bArr[0] != null) {
                try {
                    LIZJ();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(LIZ(bArr[0]));
                        for (int i = 1; i < bArr.length; i++) {
                            try {
                                arrayList.add(LIZ(bArr[i]));
                            } catch (CertificateException unused) {
                                Object[] objArr = new Object[0];
                                C78939UyV.LJIILIIL(C0NY.LIZIZ("intermediate ", i, " failed parsing"), C78939UyV.LJJII(objArr), objArr);
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!LJI(x509CertificateArr[0])) {
                                return new AndroidCertVerifyResult(-6);
                            }
                            synchronized (LJIIIZ) {
                                X509TrustManagerExtensions x509TrustManagerExtensions = LIZIZ;
                                if (x509TrustManagerExtensions == null) {
                                    return new AndroidCertVerifyResult(-1);
                                }
                                try {
                                    try {
                                        checkServerTrusted = x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
                                    } catch (RuntimeException e) {
                                        C78939UyV.LJII("checkServerTrusted() unexpectedly threw: %s", e);
                                        throw new CertificateException(e);
                                    }
                                } catch (CertificateException e2) {
                                    try {
                                        try {
                                            checkServerTrusted = LIZLLL.checkServerTrusted(x509CertificateArr, str, str2);
                                        } catch (RuntimeException e3) {
                                            C78939UyV.LJII("checkServerTrusted() unexpectedly threw: %s", e3);
                                            throw new CertificateException(e3);
                                        }
                                    } catch (CertificateException unused2) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("Failed to validate the certificate chain, error: ");
                                        LIZ2.append(e2.getMessage());
                                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                                        Object[] objArr2 = new Object[0];
                                        C78939UyV.LJIILIIL(LIZIZ2, C78939UyV.LJJII(objArr2), objArr2);
                                        return new AndroidCertVerifyResult(-2);
                                    }
                                }
                                if (checkServerTrusted.size() > 0) {
                                    z = LJ(checkServerTrusted.get(checkServerTrusted.size() - 1));
                                }
                                return new AndroidCertVerifyResult(z, checkServerTrusted);
                            }
                        } catch (CertificateExpiredException unused3) {
                            return new AndroidCertVerifyResult(-3);
                        } catch (CertificateNotYetValidException unused4) {
                            return new AndroidCertVerifyResult(-4);
                        } catch (CertificateException unused5) {
                            return new AndroidCertVerifyResult(-1);
                        }
                    } catch (CertificateException unused6) {
                        return new AndroidCertVerifyResult(-5);
                    }
                } catch (CertificateException unused7) {
                    return new AndroidCertVerifyResult(-1);
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=");
        LIZ3.append(Arrays.deepToString(bArr));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }
}

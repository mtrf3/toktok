package com.ss.bduploader.util;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes17.dex */
public class X509Util {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static CertificateFactory sCertificateFactory;
    public static X509TrustManagerImplementation sDefaultTrustManager;
    public static boolean sDisableNativeCodeForTest;
    public static boolean sLoadedSystemKeyStore;
    public static File sSystemCertificateDirectory;
    public static KeyStore sSystemKeyStore;
    public static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    public static KeyStore sTestKeyStore;
    public static X509TrustManagerImplementation sTestTrustManager;
    public static TrustStorageListener sTrustStorageListener;
    public static final Object sLock = new Object();
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* loaded from: classes17.dex */
    public interface X509TrustManagerImplementation {
        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    public static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    public static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTestKeyStore == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            C16880lQ.LJJLIIIJILLIZJL(sTrustStorageListener, NetUtils.getApplicationContext(), intentFilter);
        }
    }

    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
    }

    public static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void clearTestRootCertificates() {
        ensureInitialized();
        synchronized (sLock) {
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class TrustStorageListener extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_bduploader_util_X509Util$TrustStorageListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public TrustStorageListener() {
        }

        public void com_ss_bduploader_util_X509Util$TrustStorageListener__onReceive$___twin___(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    return;
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            }
            try {
                X509Util.reloadDefaultTrustManager();
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            }
        }

        public static void com_ss_bduploader_util_X509Util$TrustStorageListener_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(TrustStorageListener trustStorageListener, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                trustStorageListener.com_ss_bduploader_util_X509Util$TrustStorageListener__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                trustStorageListener.com_ss_bduploader_util_X509Util$TrustStorageListener__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_bduploader_util_X509Util$TrustStorageListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(TrustStorageListener trustStorageListener, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_ss_bduploader_util_X509Util$TrustStorageListener_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(trustStorageListener, context, intent);
        }
    }

    /* loaded from: classes17.dex */
    public static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        public final X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        @Override // com.ss.bduploader.util.X509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    /* loaded from: classes17.dex */
    public static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        public final X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.ss.bduploader.util.X509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            KeyStore keyStore = sTestKeyStore;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("root_cert_");
            LIZ.append(Integer.toString(sTestKeyStore.size()));
            keyStore.setCertificateEntry(X1D.LIZIZ(LIZ), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                } catch (IllegalArgumentException unused) {
                    trustManager.getClass();
                }
            }
        }
        return null;
    }

    public static String hashPrincipal(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b = digest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
            i++;
        } while (i < 4);
        return new String(cArr);
    }

    public static boolean isKnownRoot(X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(hashPrincipal);
            LIZ.append('.');
            LIZ.append(i);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!new File(sSystemCertificateDirectory, LIZIZ).exists()) {
                return false;
            }
            KeyStore keyStore = sSystemKeyStore;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("system:");
            LIZ2.append(LIZIZ);
            Certificate certificate = keyStore.getCertificate(X1D.LIZIZ(LIZ2));
            if (certificate != null && (certificate instanceof X509Certificate)) {
                X509Certificate x509Certificate2 = (X509Certificate) certificate;
                if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                    sSystemTrustAnchorCache.add(pair);
                    return true;
                }
            }
            i++;
        }
    }

    public static void setDisableNativeCodeForTest(boolean z) {
        sDisableNativeCodeForTest = z;
    }

    public static boolean verifyKeyUsage(X509Certificate x509Certificate) {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        List<X509Certificate> checkServerTrusted;
        boolean z;
        if (bArr != null && bArr.length != 0 && bArr[0] != null) {
            try {
                ensureInitialized();
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(createCertificateFromBytes(bArr[0]));
                    for (int i = 1; i < bArr.length; i++) {
                        try {
                            arrayList.add(createCertificateFromBytes(bArr[i]));
                        } catch (CertificateException unused) {
                        }
                    }
                    X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    try {
                        x509CertificateArr[0].checkValidity();
                        if (!verifyKeyUsage(x509CertificateArr[0])) {
                            return new AndroidCertVerifyResult(-6);
                        }
                        synchronized (sLock) {
                            X509TrustManagerImplementation x509TrustManagerImplementation = sDefaultTrustManager;
                            if (x509TrustManagerImplementation == null) {
                                return new AndroidCertVerifyResult(-1);
                            }
                            try {
                                try {
                                    checkServerTrusted = x509TrustManagerImplementation.checkServerTrusted(x509CertificateArr, str, str2);
                                } catch (CertificateException unused2) {
                                    checkServerTrusted = sTestTrustManager.checkServerTrusted(x509CertificateArr, str, str2);
                                }
                                if (checkServerTrusted.size() > 0) {
                                    z = isKnownRoot(checkServerTrusted.get(checkServerTrusted.size() - 1));
                                } else {
                                    z = false;
                                }
                                return new AndroidCertVerifyResult(0, z, checkServerTrusted);
                            } catch (CertificateException unused3) {
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                    } catch (CertificateExpiredException unused4) {
                        return new AndroidCertVerifyResult(-3);
                    } catch (CertificateNotYetValidException unused5) {
                        return new AndroidCertVerifyResult(-4);
                    } catch (CertificateException unused6) {
                        return new AndroidCertVerifyResult(-1);
                    }
                } catch (CertificateException unused7) {
                    return new AndroidCertVerifyResult(-5);
                }
            } catch (CertificateException unused8) {
                return new AndroidCertVerifyResult(-1);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=");
        LIZ.append(Arrays.deepToString(bArr));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}

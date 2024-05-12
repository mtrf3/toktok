package com.ss.ttlivestreamer.core.transport;

import X.C012403c;
import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes17.dex */
public class AndroidNetworkLibrary {
    public static final Set<String> sAutoDohDotServers;
    public static final Set<InetAddress> sAutoDohServers;
    public static Boolean sHaveAccessNetworkState;
    public static Boolean sHaveAccessWifiState;

    /* loaded from: classes7.dex */
    public static class SetFileDescriptor {
        public static final Method sFileDescriptorSetInt;

        public static Object com_ss_ttlivestreamer_core_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2778680606777313499"));
            return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
        }

        static {
            try {
                sFileDescriptorSetInt = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        public static FileDescriptor createWithFd(int i) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                com_ss_ttlivestreamer_core_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(sFileDescriptorSetInt, fileDescriptor, new Object[]{Integer.valueOf(i)});
                return fileDescriptor;
            } catch (Throwable th) {
                AVLog.ioe("AndroidNetworkLibrary", "FileDescriptor.setInt$() failed", th);
                return null;
            }
        }
    }

    public static boolean haveOnlyLoopbackAddresses() {
        return false;
    }

    static {
        HashSet hashSet = new HashSet();
        sAutoDohServers = hashSet;
        HashSet hashSet2 = new HashSet();
        sAutoDohDotServers = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            C012403c.LJFF(hashSet2, "dns.google", "1dot1dot1dot1.cloudflare-dns.com", "cloudflare-dns.com", "dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("foo.");
        LIZ.append(str);
        return URLConnection.guessContentTypeFromName(X1D.LIZIZ(LIZ));
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        }
    }
}

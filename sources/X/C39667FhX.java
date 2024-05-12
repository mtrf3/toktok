package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.FhX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39667FhX {
    public final C39649FhF LIZ;
    public final Context LIZIZ;

    public C39667FhX(Context context, C39649FhF c39649FhF) {
        this.LIZ = c39649FhF;
        this.LIZIZ = context;
    }

    public final boolean LIZ() {
        String absolutePath;
        String sb;
        try {
            C39649FhF c39649FhF = this.LIZ;
            c39649FhF.getClass();
            File file = new File(c39649FhF.LJ(), "unverified-splits");
            C39649FhF.LJII(file);
            try {
                Signature[] signatureArr = C16880lQ.LLLLLLZ(this.LIZIZ.getPackageManager(), this.LIZIZ.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        try {
                            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                            if (generateCertificate != null) {
                                arrayList.add(generateCertificate);
                            }
                        } catch (CertificateException e) {
                            C16880lQ.LJJZZI("Cannot decode certificate.", e);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        File[] listFiles = file.listFiles();
                        Arrays.sort(listFiles);
                        int length = listFiles.length;
                        loop1: while (true) {
                            length--;
                            if (length >= 0) {
                                File file2 = listFiles[length];
                                try {
                                    absolutePath = file2.getAbsolutePath();
                                    try {
                                        X509Certificate[][] LIZJ = C64075PCt.LIZJ(absolutePath);
                                        if (LIZJ == null || LIZJ.length == 0 || LIZJ[0].length == 0) {
                                            break;
                                        }
                                        if (arrayList.isEmpty()) {
                                            sb = "No certificates found for app.";
                                            break;
                                        }
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            X509Certificate x509Certificate = (X509Certificate) it.next();
                                            for (X509Certificate[] x509CertificateArr : LIZJ) {
                                                if (!x509CertificateArr[0].equals(x509Certificate)) {
                                                }
                                            }
                                        }
                                        try {
                                            C39649FhF c39649FhF2 = this.LIZ;
                                            c39649FhF2.getClass();
                                            File file3 = new File(c39649FhF2.LJ(), "verified-splits");
                                            C39649FhF.LJII(file3);
                                            file2.renameTo(C39649FhF.LJI(file3, file2.getName()));
                                        } catch (IOException e2) {
                                            C16880lQ.LJJZZI("Cannot write verified split.", e2);
                                            return false;
                                        }
                                    } catch (Exception e3) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                                        sb2.append("Downloaded split ");
                                        sb2.append(absolutePath);
                                        sb2.append(" is not signed.");
                                        C16880lQ.LJJZZI(sb2.toString(), e3);
                                    }
                                } catch (Exception e4) {
                                    C16880lQ.LJJZZI("Split verification error.", e4);
                                    return false;
                                }
                            } else {
                                return true;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                        sb3.append("Downloaded split ");
                        sb3.append(absolutePath);
                        sb3.append(" is not signed.");
                        sb = sb3.toString();
                        C16880lQ.LJJZ(sb);
                        C16880lQ.LJJZ("Split verification failure.");
                        return false;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            C16880lQ.LJJZ("No app certificates found.");
            return false;
        } catch (IOException e5) {
            C16880lQ.LJJZZI("Cannot access directory for unverified splits.", e5);
            return false;
        }
    }
}

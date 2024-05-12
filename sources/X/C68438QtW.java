package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* renamed from: X.QtW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68438QtW {
    public static final BinderC68453Qtl LIZ;
    public static final BinderC68454Qtm LIZIZ;
    public static volatile InterfaceC68436QtU LIZJ;
    public static final Object LIZLLL;
    public static Context LJ;

    static {
        new BinderC68446Qte(AbstractBinderC68448Qtg.LLJI("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC68452Qtk(AbstractBinderC68448Qtg.LLJI("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        LIZ = new BinderC68453Qtl(AbstractBinderC68448Qtg.LLJI("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        LIZIZ = new BinderC68454Qtm(AbstractBinderC68448Qtg.LLJI("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        LIZLLL = new Object();
    }

    public static void LIZJ() {
        InterfaceC68436QtU c68437QtV;
        if (LIZJ != null) {
            return;
        }
        QH7.LJIIIIZZ(LJ);
        synchronized (LIZLLL) {
            if (LIZJ == null) {
                IBinder LIZJ2 = DynamiteModule.LIZLLL(LJ, DynamiteModule.LIZLLL, "com.google.android.gms.googlecertificates").LIZJ("com.google.android.gms.common.GoogleCertificatesImpl");
                if (LIZJ2 == null) {
                    c68437QtV = null;
                } else {
                    IInterface queryLocalInterface = LIZJ2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof InterfaceC68436QtU) {
                        c68437QtV = (InterfaceC68436QtU) queryLocalInterface;
                    } else {
                        c68437QtV = new C68437QtV(LIZJ2);
                    }
                }
                LIZJ = c68437QtV;
            }
        }
    }

    public static synchronized void LIZ(Context context) {
        synchronized (C68438QtW.class) {
            if (LJ == null) {
                if (context != null) {
                    LJ = C16880lQ.LLLLL(context);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.QtX] */
    public static C68445Qtd LIZIZ(final String str, final AbstractBinderC68448Qtg abstractBinderC68448Qtg, final boolean z, boolean z2) {
        try {
            LIZJ();
            QH7.LJIIIIZZ(LJ);
            try {
                if (LIZJ.LLJZ(new zzs(str, abstractBinderC68448Qtg, z, z2), new BinderC68153Qov(LJ.getPackageManager()))) {
                    return C68445Qtd.LIZIZ;
                }
                return new C68442Qta(new Callable() { // from class: X.QtX
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3;
                        String str2;
                        MessageDigest messageDigest;
                        boolean z4 = z;
                        String str3 = str;
                        AbstractBinderC68448Qtg abstractBinderC68448Qtg2 = abstractBinderC68448Qtg;
                        if (!z4 && C68438QtW.LIZIZ(str3, abstractBinderC68448Qtg2, true, false).LIZ) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (true != z3) {
                            str2 = "not allowed";
                        } else {
                            str2 = "debug cert rejected";
                        }
                        Object[] objArr = new Object[5];
                        objArr[0] = str2;
                        objArr[1] = str3;
                        int i = 0;
                        while (true) {
                            if (i < 2) {
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-1");
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                if (messageDigest != null) {
                                    break;
                                }
                                i++;
                            } else {
                                messageDigest = null;
                                break;
                            }
                        }
                        QH7.LJIIIIZZ(messageDigest);
                        byte[] digest = messageDigest.digest(abstractBinderC68448Qtg2.LLJJIII());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i2 = 0;
                        for (byte b : digest) {
                            int i3 = b & 255;
                            int i4 = i2 + 1;
                            char[] cArr2 = V2B.LJLJJL;
                            cArr[i2] = cArr2[i3 >>> 4];
                            i2 = i4 + 1;
                            cArr[i4] = cArr2[i3 & 15];
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z4);
                        objArr[4] = "12451000.false";
                        return C16880lQ.LLLZ("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e) {
                return new C68445Qtd(e, false);
            }
        } catch (C68460Qts e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "module init: ".concat(valueOf);
            }
            return new C68445Qtd(e2, false);
        }
    }
}

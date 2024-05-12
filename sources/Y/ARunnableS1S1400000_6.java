package Y;

import X.C16880lQ;
import X.C39981Fmb;
import X.C39982Fmc;
import X.C39984Fme;
import X.InterfaceC39980Fma;
import X.InterfaceC39983Fmd;
import X.X1D;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.tasm.LynxEnv;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class ARunnableS1S1400000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        File file;
        String str;
        if ((this.s0.startsWith("http://") || this.s0.startsWith("https://")) && this.s0.length() > 8) {
            C39981Fmb c39981Fmb = (C39981Fmb) this.l4;
            C39984Fme c39984Fme = (C39984Fme) this.l1;
            InterfaceC39983Fmd interfaceC39983Fmd = (InterfaceC39983Fmd) this.l2;
            c39981Fmb.getClass();
            InterfaceC39980Fma interfaceC39980Fma = LynxEnv.LJIIIZ().LIZJ;
            if (interfaceC39980Fma == null) {
                C39982Fmc c39982Fmc = new C39982Fmc();
                c39982Fmc.LIZIZ = "don't have ResProvider.Can't Get Resource.";
                interfaceC39983Fmd.LIZIZ(c39982Fmc);
                return;
            }
            interfaceC39980Fma.LIZ(c39984Fme, interfaceC39983Fmd);
            return;
        }
        Integer num = null;
        r6 = null;
        InputStream inputStream = null;
        num = null;
        num = null;
        try {
            if (this.s0.startsWith("asset:///") && this.s0.length() > 9) {
                C39981Fmb c39981Fmb2 = (C39981Fmb) this.l4;
                String str2 = this.s0;
                InterfaceC39983Fmd interfaceC39983Fmd2 = (InterfaceC39983Fmd) this.l2;
                c39981Fmb2.getClass();
                C39982Fmc c39982Fmc2 = new C39982Fmc();
                try {
                    try {
                        inputStream = LynxEnv.LJIIIZ().LIZ.getAssets().open(str2.substring(9));
                        StringBuilder sb = new StringBuilder(inputStream.available());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                sb.append(new String(bArr, 0, read));
                            }
                        }
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
                        c39982Fmc2.LIZJ = byteArrayInputStream;
                        interfaceC39983Fmd2.LIZ(c39982Fmc2);
                        byteArrayInputStream.close();
                    } catch (IOException e) {
                        c39982Fmc2.LIZIZ = e.toString();
                        interfaceC39983Fmd2.LIZIZ(c39982Fmc2);
                        if (inputStream == null) {
                            return;
                        }
                    }
                    inputStream.close();
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } else if (this.s0.startsWith("res:///") && this.s0.length() > 7) {
                C39981Fmb c39981Fmb3 = (C39981Fmb) this.l4;
                String str3 = this.s0;
                InterfaceC39983Fmd interfaceC39983Fmd3 = (InterfaceC39983Fmd) this.l2;
                c39981Fmb3.getClass();
                Application application = LynxEnv.LJIIIZ().LIZ;
                String substring = str3.substring(7);
                if (substring != null && !substring.isEmpty()) {
                    try {
                        num = Integer.valueOf(CastIntegerProtector.parseInt(substring));
                    } catch (NumberFormatException unused2) {
                        String replace = substring.toLowerCase().replace("-", "_");
                        Integer num2 = c39981Fmb3.LIZ.get(replace);
                        if (num2 != null) {
                            num = num2;
                        } else {
                            int indexOf = replace.indexOf(".");
                            if (indexOf > 0 && indexOf < replace.length()) {
                                str = replace.substring(0, indexOf);
                            } else {
                                str = num;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                synchronized (c39981Fmb3) {
                                    num = Integer.valueOf(application.getResources().getIdentifier(replace, str, application.getPackageName()));
                                    if (num.intValue() > 0) {
                                        c39981Fmb3.LIZ.put(replace, num);
                                    }
                                }
                            }
                        }
                    }
                }
                C39982Fmc c39982Fmc3 = new C39982Fmc();
                if (num != null) {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[]{num.byteValue()});
                    c39982Fmc3.LIZJ = byteArrayInputStream2;
                    interfaceC39983Fmd3.LIZ(c39982Fmc3);
                    byteArrayInputStream2.close();
                } else {
                    c39982Fmc3.LIZIZ = "resource not found!";
                    interfaceC39983Fmd3.LIZIZ(c39982Fmc3);
                }
            } else if (this.s0.startsWith("file://") && this.s0.length() > 7) {
                C39981Fmb c39981Fmb4 = (C39981Fmb) this.l4;
                String str4 = this.s0;
                InterfaceC39983Fmd interfaceC39983Fmd4 = (InterfaceC39983Fmd) this.l2;
                c39981Fmb4.getClass();
                String substring2 = str4.substring(7);
                if (substring2.startsWith("/")) {
                    file = new File(substring2);
                } else {
                    file = new File(C16880lQ.LLIIJLIL(LynxEnv.LJIIIZ().LIZ), substring2);
                }
                C39982Fmc c39982Fmc4 = new C39982Fmc();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    StringBuilder sb2 = new StringBuilder(fileInputStream.available());
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read2 = fileInputStream.read(bArr2);
                        if (read2 != -1) {
                            sb2.append(new String(bArr2, 0, read2));
                        } else {
                            c39982Fmc4.LIZJ = new ByteArrayInputStream(sb2.toString().getBytes());
                            interfaceC39983Fmd4.LIZ(c39982Fmc4);
                            fileInputStream.close();
                            return;
                        }
                    }
                } catch (FileNotFoundException unused3) {
                    c39982Fmc4.LIZIZ = "file not found!";
                    interfaceC39983Fmd4.LIZIZ(c39982Fmc4);
                } catch (IOException unused4) {
                    c39982Fmc4.LIZIZ = "IO failed";
                    interfaceC39983Fmd4.LIZIZ(c39982Fmc4);
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("illegal url:");
                LIZ.append(this.s0);
                new RuntimeException(X1D.LIZIZ(LIZ));
                C39982Fmc c39982Fmc5 = (C39982Fmc) this.l3;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("url is illegal:");
                LIZ2.append(this.s0);
                c39982Fmc5.LIZIZ = X1D.LIZIZ(LIZ2);
                ((InterfaceC39983Fmd) this.l2).LIZIZ((C39982Fmc) this.l3);
            }
        } catch (IOException unused5) {
        }
    }

    public static final void run$0(ARunnableS1S1400000_6 aRunnableS1S1400000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1400000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r6.isInstance(r3) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:3:0x0015, B:5:0x002a, B:7:0x0032, B:9:0x0054, B:11:0x0060, B:14:0x006e, B:16:0x0074, B:17:0x0077, B:19:0x0085, B:21:0x0091, B:24:0x009e, B:27:0x00a6, B:30:0x00b5, B:32:0x00c5, B:40:0x00f1, B:42:0x00ff, B:34:0x00e3, B:48:0x00d5, B:45:0x00c9), top: B:2:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS1S1400000_6 r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1400000_6.run$1(Y.ARunnableS1S1400000_6):void");
    }

    public ARunnableS1S1400000_6(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

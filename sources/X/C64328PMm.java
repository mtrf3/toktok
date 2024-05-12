package X;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.PMm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64328PMm implements TEV, L9I, OnActivityResultCallback, InterfaceC64335PMt, IIsTagNeedUpdatedListener {
    public static final C64328PMm LJLIL = new C64328PMm();
    public static final C64328PMm LJLILLLLZI = new C64328PMm();

    @Override // X.InterfaceC64335PMt
    public void LIZIZ() {
    }

    @Override // X.TEV
    public boolean LIZJ() {
        return false;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedNotUpdate() {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedUpdate() {
    }

    public boolean LIZLLL() {
        return DYB.LIZ();
    }

    @Override // X.L9I
    public void LIZ(Exception exc) {
        try {
            C36922EeM.LJFF(exc);
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parent is null");
            LIZ.append(": ");
            LIZ.append(android.util.Log.getStackTraceString(exc));
            printStream.println(X1D.LIZIZ(LIZ));
            PJZ.LIZ.getClass();
            PJY.LIZJ(null, "EnsureNotReachHere", null);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.L9I
    public void log(String msg) {
        o.LJIIIZ(msg, "msg");
        C36922EeM.LIZLLL(4, "hox-init", msg);
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hox-init");
        LIZ.append(": ");
        LIZ.append(msg);
        printStream.println(X1D.LIZIZ(LIZ));
    }

    public static String LJ(Context context, String str, StringBuilder sb) {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (!file.exists()) {
            C1DI.LIZIZ(sb, "file not exist.path:", str, "\r\n");
            return null;
        }
        if (file.length() == 0) {
            sb.append("file size is zore.");
            sb.append("\r\n");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[10240];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 10240);
                if (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    fileInputStream.close();
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    byteArrayOutputStream.close();
                    return encodeToString;
                }
            }
        } catch (Exception e2) {
            e = e2;
            C16880lQ.LLLLIIL(e);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            sb.append("gzip file is error.error:");
            sb.append(e.getMessage());
            return null;
        }
    }
}

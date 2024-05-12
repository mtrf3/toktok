package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* renamed from: X.EcY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36810EcY {
    public static String[] LIZIZ() {
        BufferedReader bufferedReader;
        String[] strArr = {"libttvebase.so", "libttvideoeditor.so", "libttvideorecorder.so", "libeffect.so", "libAGFX.so", "libaudioeffect.so", "libbytenn.so", "libx264.so", "libttffmpeg.so", "libttvesdk.so"};
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C36811EcZ.LIZ().getAbsolutePath());
        File file = new File(JBR.LJFF(LIZ, File.separator, "VEhookLibNames.ini", LIZ));
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        C16880lQ.LLLLIIL(e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                        }
                        return strArr;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                        throw th;
                    }
                }
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
                return strArr2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C36811EcZ.LIZ().getAbsolutePath());
        String LJFF = JBR.LJFF(LIZ, File.separator, "VEhookTempFiles", LIZ);
        File file = new File(LJFF);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }
        return LJFF;
    }
}

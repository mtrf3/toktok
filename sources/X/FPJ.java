package X;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FPJ {
    public final String LIZ;
    public final List<String> LIZIZ = new ArrayList();

    public final List<String> LIZ() {
        boolean z;
        BufferedReader bufferedReader;
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            return this.LIZIZ;
        }
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(FPH.LIZLLL(), this.LIZ)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } finally {
                }
            }
            bufferedReader.close();
            z = true;
        } catch (FileNotFoundException | IOException unused) {
            z = false;
        }
        if (!z) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(FPH.LIZ().getAssets().open(this.LIZ)));
                while (true) {
                    try {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        if (!readLine2.endsWith("*")) {
                            arrayList.add(readLine2);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                bufferedReader.close();
            } catch (FileNotFoundException | IOException unused2) {
            }
        }
        ((ArrayList) this.LIZIZ).addAll(arrayList);
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        if (!FPI.LIZ || !(!new File(FPH.LIZLLL(), this.LIZ).exists()) || !FPI.LIZ) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(FPH.LIZ().getAssets().open(this.LIZ)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        arrayList.add(readLine);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ClassList: process ");
            LIZ.append(this.LIZ);
            LIZ.append(" from assets");
            X1D.LIZIZ(LIZ);
            bufferedReader.close();
        } catch (FileNotFoundException | IOException unused) {
        }
        Iterator it = arrayList.iterator();
        List<String> list = null;
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.endsWith("*")) {
                if (list == null) {
                    list = FPH.LIZIZ();
                }
                String substring = str.substring(0, str.lastIndexOf(42));
                int i2 = 0;
                for (String str2 : list) {
                    if (str2.startsWith(substring)) {
                        ((ArrayList) this.LIZIZ).add(str2);
                        i++;
                        i2++;
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ClassList: process ");
                LIZ2.append(str);
                LIZ2.append(" match ");
                LIZ2.append(i2);
                X1D.LIZIZ(LIZ2);
            } else {
                ((ArrayList) this.LIZIZ).add(str);
            }
        }
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(FPH.LIZLLL(), this.LIZ), false));
                try {
                    Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                    while (it2.hasNext()) {
                        bufferedWriter.write((String) it2.next());
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                } finally {
                }
            } catch (IOException unused2) {
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ClassList: process ");
        LIZ3.append(arrayList.size());
        LIZ3.append(" line, found ");
        LIZ3.append(((ArrayList) this.LIZIZ).size());
        LIZ3.append("(");
        LIZ3.append(i);
        LIZ3.append("), took ");
        LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ3.append("ms, save to ");
        LIZ3.append(new File(FPH.LIZLLL(), this.LIZ).getAbsolutePath());
        X1D.LIZIZ(LIZ3);
    }

    public final C35824E4e LIZJ() {
        if (!FPI.LIZ) {
            return C35824E4e.LIZJ;
        }
        ArrayList arrayList = (ArrayList) LIZ();
        if (!arrayList.isEmpty()) {
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            for (String str : strArr) {
                try {
                    Class.forName(str, false, FPH.LIZ().getClassLoader());
                    i++;
                } catch (Throwable unused) {
                    i2++;
                    C1JX.LJIIIIZZ("LoadClasses: class not found ", str);
                }
            }
            StringBuilder LIZJ = C06460Ne.LIZJ("LoadClasses: load ", i, ", ", i2, " not found, took ");
            LIZJ.append(System.currentTimeMillis() - currentTimeMillis);
            X1D.LIZIZ(LIZJ);
            return new C35824E4e(i, i2);
        }
        return C35824E4e.LIZJ;
    }

    public FPJ(String str) {
        this.LIZ = str;
    }
}

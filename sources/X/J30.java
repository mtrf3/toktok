package X;

import android.text.TextUtils;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ml.process.bl.PreOPModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public class J30 {
    public int LIZ;
    public volatile boolean LIZIZ;
    public H2L LIZJ;
    public final J3D LIZLLL;
    public final H2L LJ;
    public MLConfigModel LJFF;
    public J3N LJI;
    public J33 LJII;
    public final String LJIIIIZZ;
    public final C48528J2u LJIIIZ;
    public String LJIIJ = "ml#evaluator";

    public final H2L LIZ() {
        H2L h2l = this.LJ;
        if (h2l != null && (h2l instanceof J36) && J3I.LIZ) {
            return h2l;
        }
        String modelType = this.LIZLLL.getModelType();
        if (C40507Fv5.LIZ) {
            C1JX.LJIIIIZZ("-----buildEngine modelType:", modelType);
        }
        if (TextUtils.isEmpty(modelType)) {
            return new J35(modelType);
        }
        if ("bytenn".equals(modelType)) {
            return new J36();
        }
        return new J31();
    }

    public final boolean LIZJ() {
        return this.LIZLLL.enable();
    }

    public final List<? extends J5M> LJ() {
        MLConfigModel mLConfigModel = this.LJFF;
        List<PreOPModel> list = mLConfigModel.intput;
        if (list == null) {
            return mLConfigModel.input;
        }
        return list;
    }

    public final boolean LIZLLL() {
        long j;
        if (C40508Fv6.LIZ().LIZ == null) {
            C44384HbQ.LJJ(this.LJIIJ, "should call Inference.init first before ensureMLEngineReady", null);
            return false;
        }
        synchronized (this) {
            if (this.LJII == null) {
                this.LJII = C40508Fv6.LIZ().LIZ;
            }
            if (this.LJI == null) {
                this.LJI = this.LJII.LIZLLL;
            }
            if (this.LIZJ == null) {
                H2L LIZ = LIZ();
                this.LIZJ = LIZ;
                ((J32) LIZ).LJII = this.LJIIIZ;
                ((J32) LIZ).getClass();
            }
        }
        if (LIZJ() && !((J32) this.LIZJ).LJI && !this.LIZIZ && this.LIZ <= 5) {
            this.LIZIZ = true;
            this.LIZ++;
            if (C40507Fv5.LIZ) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            RunnableC48533J2z runnableC48533J2z = new RunnableC48533J2z(this, j);
            J33 j33 = this.LJII;
            ExecutorService executorService = j33.LJI;
            if (executorService == null) {
                J3F j3f = j33.LJ;
                if (j3f != null) {
                    j33.LJI = j3f.LIZ();
                }
                executorService = j33.LJI;
            }
            executorService.submit(runnableC48533J2z);
        }
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ensureMLEngineReady enable: ");
            LIZ2.append(LIZJ());
            LIZ2.append(" hasInit: ");
            LIZ2.append(((J32) this.LIZJ).LJI);
            LIZ2.append(" modelLoading:");
            LIZ2.append(this.LIZIZ);
            LIZ2.append(" tryLoadModelCount: ");
            LIZ2.append(this.LIZ);
            LIZ2.append(" modelScene: ");
            LIZ2.append(this.LIZLLL.getModelDirName());
            LIZ2.append(" modelType: ");
            LIZ2.append(this.LIZLLL.getModelType());
            X1D.LIZIZ(LIZ2);
        }
        return ((J32) this.LIZJ).LJI;
    }

    public J30(J3D j3d) {
        this.LJIIIIZZ = "default";
        if (j3d != null) {
            this.LJ = null;
            this.LIZLLL = j3d;
            if (j3d.enable()) {
                this.LJIIIIZZ = j3d.getModelDirName();
            }
            String str = this.LJIIIIZZ;
            HashMap<String, C48528J2u> hashMap = C34901Dmr.LIZ;
            C48528J2u c48528J2u = hashMap.get(str);
            if (c48528J2u == null) {
                c48528J2u = new C48528J2u(str);
                hashMap.put(str, c48528J2u);
            }
            this.LJIIIZ = c48528J2u;
            c48528J2u.LJ.LIZ();
            c48528J2u.LJFF.LIZ();
            c48528J2u.LJI.LIZ();
            c48528J2u.LJII = false;
            c48528J2u.LJIIIIZZ = false;
            c48528J2u.LJIIIZ = false;
            c48528J2u.LIZ();
            if (C40507Fv5.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("-----MLModelComponent created.---!!! config:");
                LIZ.append(j3d);
                LIZ.append(" engine:");
                LIZ.append((Object) null);
                X1D.LIZIZ(LIZ);
                new Throwable("not crash, only for debug!!");
                return;
            }
            return;
        }
        throw new RuntimeException("MLModelConfig can not be null!");
    }

    public static void LIZIZ(String... strArr) {
        for (String str : strArr) {
            File file = new File(str);
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
        }
    }

    public final boolean LJFF(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                ((J32) this.LIZJ).LJII(fileInputStream2, this.LJFF);
                LJII(7, null);
                this.LJIIIZ.LIZJ(((J32) this.LIZJ).LJI);
                try {
                    fileInputStream2.close();
                    return true;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    C44384HbQ.LJJ(this.LJIIJ, "loadModel error: ", th);
                    LJII(8, th);
                    this.LJIIIZ.LIZJ(((J32) this.LIZJ).LJI);
                    if (fileInputStream == null) {
                        return false;
                    }
                    try {
                        fileInputStream.close();
                        return false;
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        return false;
                    }
                } catch (Throwable th2) {
                    this.LJIIIZ.LIZJ(((J32) this.LIZJ).LJI);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e3) {
                            C16880lQ.LLLLIIL(e3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean LJI(File file, File file2) {
        String str;
        try {
            C48528J2u c48528J2u = this.LJIIIZ;
            if (c48528J2u.LIZ && !c48528J2u.LIZLLL) {
                c48528J2u.LJI.LIZ = System.currentTimeMillis();
            }
            try {
            } catch (Exception e) {
                C44384HbQ.LJJ(this.LJIIJ, "decrypt config failed try no-encrypt config file", e);
                C40507Fv5.LIZIZ(new RuntimeException("decrypt config failed try no-encrypt config file"));
            }
        } catch (Throwable th) {
            C44384HbQ.LJJ(this.LJIIJ, "loadModelConfig error: ", th);
            LJII(6, th);
            return false;
        }
        if (file2.exists()) {
            this.LJII.getClass();
            throw null;
        }
        if (TextUtils.isEmpty(null)) {
            byte[] bArr = new byte[(int) file.length()];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    if (fileInputStream.read(bArr) != -1) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        str = new String(bArr);
                    } else {
                        throw new IOException("EOF reached while trying to read the whole file");
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (IOException e3) {
                        C16880lQ.LLLLIIL(e3);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            C44384HbQ.LJJ(this.LJIIJ, "loadModelConfig error: ", th);
            LJII(6, th);
            return false;
        }
        str = null;
        MLConfigModel mLConfigModel = (MLConfigModel) this.LJII.LIZJ.LIZ(str, MLConfigModel.class);
        this.LJFF = mLConfigModel;
        if (mLConfigModel == null) {
            LJII(6, null);
            return false;
        }
        LJII(5, null);
        return true;
    }

    public final void LJII(int i, Throwable th) {
        String str;
        J3N j3n = this.LJI;
        if (j3n == null) {
            return;
        }
        String modelUrl = this.LIZLLL.modelUrl();
        if (th != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(th.getMessage());
            LIZ.append(" ");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            LIZ.append(stringWriter.toString());
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "";
        }
        j3n.LIZ(modelUrl, str);
    }
}

package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import X.C1DI;
import X.C221108m2;
import X.C37692Eqm;
import X.C5H3;
import X.C61878OQg;
import X.OJD;
import X.ORZ;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class GPUUtils {
    public static final GPUUtils INSTANCE = new GPUUtils();
    public static final C5H3 gpuInfo$delegate;
    public static final SparseArray<float[]> sAdrenoGpuFreqMap;
    public static final Pattern sAdrenoSerialPattern;
    public static final HashMap<String, float[]> sMaliGpuFreqMap;

    private final GPUInfo getGpuInfo() {
        return (GPUInfo) gpuInfo$delegate.getValue();
    }

    /* loaded from: classes16.dex */
    public static final class GPUInfo {
        public int maxFreq;
        public int minFreq;
        public String renderer = "unknown";
        public String version = "unknown";
        public String vendor = "unknown";
        public int glVer = -1;
        public double alusOrThroughput = -1.0d;
        public String glExtension = "unknown";

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GPUInfo{renderer='");
            C1DI.LIZIZ(LIZ, this.renderer, "'", ", version='");
            C1DI.LIZIZ(LIZ, this.version, "'", ", vendor='");
            C1DI.LIZIZ(LIZ, this.vendor, "'", ", maxFreq=");
            LIZ.append(this.maxFreq);
            LIZ.append(", minFreq=");
            LIZ.append(this.minFreq);
            LIZ.append(", glVer=");
            LIZ.append(this.glVer);
            LIZ.append(", alusOrThroughput=");
            LIZ.append(this.alusOrThroughput);
            LIZ.append("}");
            return X1D.LIZIZ(LIZ);
        }

        public final double getAlusOrThroughput() {
            return this.alusOrThroughput;
        }

        public final String getGlExtension() {
            return this.glExtension;
        }

        public final int getGlVer() {
            return this.glVer;
        }

        public final int getMaxFreq() {
            return this.maxFreq;
        }

        public final int getMinFreq() {
            return this.minFreq;
        }

        public final String getRenderer() {
            return this.renderer;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public final String getVersion() {
            return this.version;
        }

        public final void setAlusOrThroughput(double d) {
            this.alusOrThroughput = d;
        }

        public final void setGlExtension(String str) {
            o.LJIIJ(str, "<set-?>");
            this.glExtension = str;
        }

        public final void setGlVer(int i) {
            this.glVer = i;
        }

        public final void setMaxFreq(int i) {
            this.maxFreq = i;
        }

        public final void setMinFreq(int i) {
            this.minFreq = i;
        }

        public final void setRenderer(String str) {
            o.LJIIJ(str, "<set-?>");
            this.renderer = str;
        }

        public final void setVendor(String str) {
            o.LJIIJ(str, "<set-?>");
            this.vendor = str;
        }

        public final void setVersion(String str) {
            o.LJIIJ(str, "<set-?>");
            this.version = str;
        }
    }

    static {
        HashMap<String, float[]> hashMap = new HashMap<>();
        sMaliGpuFreqMap = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        sAdrenoGpuFreqMap = sparseArray;
        sAdrenoSerialPattern = PatternProtector.compile("\\d+$");
        gpuInfo$delegate = C221108m2.LIZIZ(GPUUtils$gpuInfo$2.INSTANCE);
        hashMap.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        hashMap.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        hashMap.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        hashMap.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        hashMap.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        hashMap.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(200, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(203, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(205, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(420, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(505, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(506, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(508, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(510, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(512, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    public final GPUInfo generateGPUInfo() {
        List list;
        GPUInfo gPUInfo = new GPUInfo();
        try {
            EGLUtils eGLUtils = new EGLUtils();
            eGLUtils.eglInit(16, 16);
            GL10 gl10 = eGLUtils.getGl10();
            if (gl10 != null) {
                String glGetString = gl10.glGetString(7936);
                o.LJFF(glGetString, "it.glGetString(GL10.GL_VENDOR)");
                gPUInfo.setVendor(glGetString);
                String glGetString2 = gl10.glGetString(7938);
                o.LJFF(glGetString2, "it.glGetString(GL10.GL_VERSION)");
                gPUInfo.setVersion(glGetString2);
                String glGetString3 = gl10.glGetString(7937);
                o.LJFF(glGetString3, "it.glGetString(GL10.GL_RENDERER)");
                gPUInfo.setRenderer(glGetString3);
                String glGetString4 = gl10.glGetString(7939);
                o.LJFF(glGetString4, "it.glGetString(GL10.GL_EXTENSIONS)");
                gPUInfo.setGlExtension(glGetString4);
            }
            eGLUtils.destroy();
            String version = gPUInfo.getVersion();
            if (ujb.o.LJJJLIIL(version, "OpenGL ES", false)) {
                String substring = version.substring(9);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                version = s.LJZI(substring).toString();
                List<String> split = new OJD(" ").split(version, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = C61878OQg.INSTANCE;
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length != 0) {
                        version = strArr[0];
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            gPUInfo.setVersion(version);
            gPUInfo.setMaxFreq(getGpuMHz(gPUInfo.getRenderer(), "max"));
            gPUInfo.setMinFreq(getGpuMHz(gPUInfo.getRenderer(), "min"));
            gPUInfo.setAlusOrThroughput(getAlusOrThroughput(gPUInfo.getRenderer()));
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get gpu info error:");
            LIZ.append(th.getMessage());
            EPLog.e("GPUUtils", X1D.LIZIZ(LIZ));
        }
        return gPUInfo;
    }

    public final double getAlusOrThroughput() {
        return getGpuInfo().getAlusOrThroughput();
    }

    public final String getGlExtension() {
        return getGpuInfo().getGlExtension();
    }

    public final int getGlVer() {
        return getGpuInfo().getGlVer();
    }

    public final String getGpuInfoStr() {
        return getGpuInfo().toString();
    }

    public final int getMaxFreq() {
        return getGpuInfo().getMaxFreq();
    }

    public final int getMinFreq() {
        return getGpuInfo().getMinFreq();
    }

    public final String getRenderer() {
        return getGpuInfo().getRenderer();
    }

    public final String getVendor() {
        return getGpuInfo().getVendor();
    }

    public final String getVersion() {
        return getGpuInfo().getVersion();
    }

    private final int getAdrenoSerial(String str) {
        Matcher matcher = sAdrenoSerialPattern.matcher(str);
        if (matcher.find()) {
            String serial = matcher.group(0);
            o.LJFF(serial, "serial");
            if (serial.length() > 0) {
                return CastIntegerProtector.parseInt(serial);
            }
        }
        return -1;
    }

    public final double getAlusOrThroughput(String renderer) {
        float[] fArr;
        o.LJIIJ(renderer, "renderer");
        if (renderer.length() > 0) {
            String lowerCase = renderer.toLowerCase();
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (ujb.o.LJJJLIIL(lowerCase, "mali", false)) {
                fArr = sMaliGpuFreqMap.get(renderer);
            } else {
                String lowerCase2 = renderer.toLowerCase();
                o.LJFF(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (s.LJJJLZIJ(lowerCase2, "adreno", false)) {
                    fArr = sAdrenoGpuFreqMap.get(getAdrenoSerial(renderer));
                }
            }
            if (fArr != null) {
                return fArr[2];
            }
        }
        return -1;
    }

    public final int getGpuOpenGlVersion(Context context) {
        o.LJIIJ(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "activity");
        if (LLILL != null) {
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) LLILL).getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null) {
                return deviceConfigurationInfo.reqGlEsVersion;
            }
            return -1;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.ActivityManager");
    }

    private final int getAdrenoGpuFreq(String str, String str2) {
        BufferedReader bufferedReader;
        int i;
        boolean z;
        float[] fArr;
        int adrenoSerial = getAdrenoSerial(str);
        if (adrenoSerial > 0 && (fArr = sAdrenoGpuFreqMap.get(adrenoSerial)) != null) {
            return (int) fArr[1];
        }
        File[] listFiles = new File("/sys/class/devfreq/").listFiles(new FilenameFilter() { // from class: com.ss.android.ugc.effectmanager.common.utils.GPUUtils$getAdrenoGpuFreq$kgslPaths$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String s) {
                o.LJFF(file, "file");
                if (!file.isDirectory()) {
                    return false;
                }
                o.LJFF(s, "s");
                if (!s.LJJJLZIJ(s, "kgsl", false)) {
                    return false;
                }
                return true;
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return adrenoSerial + 200;
        }
        for (File file : listFiles) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(new File(file, i0.LJFF(str2, "_freq"))));
            } catch (Exception unused) {
                if (0 == 0) {
                }
            } catch (Throwable th) {
                throw th;
            }
            try {
                String freqStr = bufferedReader.readLine();
                o.LJFF(freqStr, "freqStr");
                int length = freqStr.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (freqStr.charAt(i) <= ' ') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else {
                        if (!z) {
                            break;
                        }
                        length--;
                    }
                }
                int parseInt = Integer.parseInt(freqStr.subSequence(i2, length + 1).toString()) / 1000000;
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                return parseInt;
            } catch (Exception unused3) {
                bufferedReader2 = bufferedReader;
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                    throw th2;
                } catch (IOException unused5) {
                    throw th2;
                }
            }
        }
        return -1;
    }

    private final int getGpuMHz(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase()");
        if (ujb.o.LJJJLIIL(lowerCase, "mali", false)) {
            return getMaliGpuFreq(str, str2);
        }
        String lowerCase2 = str.toLowerCase();
        o.LJFF(lowerCase2, "(this as java.lang.String).toLowerCase()");
        if (!ujb.o.LJJJLIIL(lowerCase2, "adreno", false)) {
            return -1;
        }
        return getAdrenoGpuFreq(str, str2);
    }

    private final int getMaliGpuFreq(String str, String str2) {
        float f;
        float[] fArr = sMaliGpuFreqMap.get(str);
        if (fArr != null) {
            if (o.LJ("min", str2)) {
                f = fArr[0];
            } else {
                f = fArr[1];
            }
            return (int) f;
        }
        return 850;
    }
}

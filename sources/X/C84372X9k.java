package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.X9k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84372X9k {
    public static final HashMap<String, float[]> LIZ;
    public static final SparseArray<float[]> LIZIZ;
    public static final Pattern LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        HashMap<String, float[]> hashMap = new HashMap<>();
        LIZ = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        LIZIZ = sparseArray;
        LIZJ = PatternProtector.compile("\\d+$");
        LIZLLL = C221108m2.LIZIZ(C84373X9l.LJLIL);
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

    public static int LIZ(String str) {
        Matcher matcher = LIZJ.matcher(str);
        if (matcher.find()) {
            String serial = matcher.group(0);
            o.LJFF(serial, "serial");
            if (serial.length() > 0) {
                return CastIntegerProtector.parseInt(serial);
            }
        }
        return -1;
    }

    public static double LIZIZ(String renderer) {
        float[] fArr;
        o.LJIIJ(renderer, "renderer");
        if (renderer.length() > 0) {
            String lowerCase = renderer.toLowerCase();
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (ujb.o.LJJJLIIL(lowerCase, "mali", false)) {
                fArr = LIZ.get(renderer);
            } else {
                String lowerCase2 = renderer.toLowerCase();
                o.LJFF(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (s.LJJJLZIJ(lowerCase2, "adreno", false)) {
                    fArr = LIZIZ.get(LIZ(renderer));
                }
            }
            if (fArr != null) {
                return fArr[2];
            }
        }
        return -1;
    }

    public static int LIZJ(String str, String str2) {
        boolean z;
        int i;
        boolean z2;
        float[] fArr;
        float f;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (z) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase()");
        if (ujb.o.LJJJLIIL(lowerCase, "mali", false)) {
            float[] fArr2 = LIZ.get(str);
            if (fArr2 != null) {
                if (o.LJ("min", str2)) {
                    f = fArr2[0];
                } else {
                    f = fArr2[1];
                }
            } else {
                return 850;
            }
        } else {
            String lowerCase2 = str.toLowerCase();
            o.LJFF(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (!ujb.o.LJJJLIIL(lowerCase2, "adreno", false)) {
                return -1;
            }
            int LIZ2 = LIZ(str);
            if (LIZ2 > 0 && (fArr = LIZIZ.get(LIZ2)) != null) {
                f = fArr[1];
            } else {
                File[] listFiles = new File("/sys/class/devfreq/").listFiles(C48227IwJ.LIZ);
                if (listFiles == null || listFiles.length == 0) {
                    return LIZ2 + 200;
                }
                for (File file : listFiles) {
                    BufferedReader bufferedReader = null;
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(file, i0.LJFF(str2, "_freq"))));
                        try {
                            String freqStr = bufferedReader2.readLine();
                            o.LJFF(freqStr, "freqStr");
                            int length = freqStr.length() - 1;
                            int i3 = 0;
                            boolean z3 = false;
                            while (i3 <= length) {
                                if (!z3) {
                                    i = i3;
                                } else {
                                    i = length;
                                }
                                if (freqStr.charAt(i) <= ' ') {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z3) {
                                    if (!z2) {
                                        z3 = true;
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    if (!z2) {
                                        break;
                                    }
                                    length--;
                                }
                            }
                            i2 = Integer.parseInt(freqStr.subSequence(i3, length + 1).toString()) / 1000000;
                            try {
                                bufferedReader2.close();
                                return i2;
                            } catch (IOException unused) {
                                return i2;
                            }
                        } catch (Exception unused2) {
                            bufferedReader = bufferedReader2;
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader2.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                    } catch (Exception unused5) {
                        if (0 == 0) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return i2;
            }
        }
        return (int) f;
    }
}

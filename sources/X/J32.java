package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.google.gson.internal.b;
import com.ss.android.ml.process.bl.AfOPModel;
import com.ss.android.ml.process.bl.MLConfigModel;
import defpackage.b0;
import defpackage.i0;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public abstract class J32 implements H2L {
    public MLConfigModel LIZ;
    public MappedByteBuffer LIZIZ;
    public float[][] LIZJ;
    public ByteBuffer LIZLLL;
    public int LJ = -1;
    public final ArrayList<Float> LJFF = new ArrayList<>();
    public boolean LJI = false;
    public C48528J2u LJII;

    public abstract boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel);

    public abstract void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel);

    public final void LJFF(HashMap hashMap, List list) {
        String LIZIZ;
        String str;
        float f;
        this.LJFF.clear();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object LJIILL = b.LJIILL(str2, hashMap);
            float f2 = 0.0f;
            if (LJIILL == null) {
                this.LJFF.add(Float.valueOf(0.0f));
                if (C40507Fv5.LIZ) {
                    str = "NULL";
                    LIZIZ = "0.0f, not in inputMap!!";
                }
                str = null;
                LIZIZ = null;
            } else if (LJIILL instanceof Number[]) {
                Number[] numberArr = (Number[]) LJIILL;
                for (Number number : numberArr) {
                    ArrayList<Float> arrayList = this.LJFF;
                    if (number != null) {
                        f = number.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    arrayList.add(Float.valueOf(f));
                }
                if (C40507Fv5.LIZ) {
                    if (numberArr.length > 32) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("[");
                        LIZ.append(numberArr[0]);
                        LIZ.append("], ");
                        LIZ.append(numberArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(Arrays.toString(numberArr));
                        LIZ2.append(", ");
                        LIZ2.append(numberArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ2);
                    }
                    str = "NumberArray";
                }
                str = null;
                LIZIZ = null;
            } else if (LJIILL instanceof float[]) {
                float[] fArr = (float[]) LJIILL;
                for (float f3 : fArr) {
                    this.LJFF.add(Float.valueOf(f3));
                }
                if (C40507Fv5.LIZ) {
                    str = "float array";
                    if (fArr.length > 32) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("[");
                        LIZ3.append(fArr[0]);
                        LIZ3.append("], ");
                        LIZ3.append(fArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ3);
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(Arrays.toString(fArr));
                        LIZ4.append(", ");
                        LIZ4.append(fArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ4);
                    }
                }
                str = null;
                LIZIZ = null;
            } else if (LJIILL instanceof int[]) {
                int[] iArr = (int[]) LJIILL;
                for (int i2 : iArr) {
                    this.LJFF.add(Float.valueOf(i2));
                }
                if (C40507Fv5.LIZ) {
                    str = "int array";
                    if (iArr.length > 32) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("[");
                        LIZ5.append(iArr[0]);
                        LIZ5.append("], ");
                        LIZ5.append(iArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ5);
                    } else {
                        StringBuilder LIZ6 = X1D.LIZ();
                        C0JT.LIZLLL(iArr, LIZ6, ", ");
                        LIZ6.append(iArr.length);
                        LIZIZ = X1D.LIZIZ(LIZ6);
                    }
                }
                str = null;
                LIZIZ = null;
            } else if (LJIILL instanceof Number) {
                Number number2 = (Number) LJIILL;
                this.LJFF.add(Float.valueOf(number2.floatValue()));
                if (C40507Fv5.LIZ) {
                    LIZIZ = number2.toString();
                    str = "Number";
                }
                str = null;
                LIZIZ = null;
            } else if (LJIILL instanceof String) {
                String str3 = (String) LJIILL;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        f2 = CastFloatProtector.parseFloat(str3);
                    } catch (Exception unused) {
                        if (TextUtils.equals(str3.toLowerCase(Locale.getDefault()), "true")) {
                            f2 = 1.0f;
                        }
                    }
                }
                this.LJFF.add(Float.valueOf(f2));
                if (C40507Fv5.LIZ) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(f2);
                    LIZ7.append(" origin:");
                    LIZ7.append(str3);
                    LIZIZ = X1D.LIZIZ(LIZ7);
                    str = "String";
                }
                str = null;
                LIZIZ = null;
            } else {
                this.LJFF.add(Float.valueOf(0.0f));
                if (C40507Fv5.LIZ) {
                    LIZIZ = b0.LIZIZ("0.0f  origin: ", LJIILL);
                    str = "UnKnow";
                }
                str = null;
                LIZIZ = null;
            }
            if (C40507Fv5.LIZ) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("model real input feature ", str, " index: ");
                LIZIZ2.append(i);
                LIZIZ2.append(" key: ");
                LIZIZ2.append(str2);
                LIZIZ2.append(" value: ");
                LIZIZ2.append(LIZIZ);
                X1D.LIZIZ(LIZIZ2);
                i++;
            }
        }
        int size = this.LJFF.size() * 4;
        if (this.LIZLLL == null || size != this.LJ) {
            this.LJ = size;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
            this.LIZLLL = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("fillMLInputBuffer inputFloatArray.size: ");
            LIZ8.append(this.LJFF.size());
            LIZ8.append(" byteBufferLength: ");
            LIZ8.append(size);
            X1D.LIZIZ(LIZ8);
        }
        this.LIZLLL.clear();
        Iterator<Float> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            this.LIZLLL.putFloat(it2.next().floatValue());
        }
    }

    public final void LJII(FileInputStream fileInputStream, MLConfigModel mLConfigModel) {
        int i;
        List<String> list;
        this.LIZ = mLConfigModel;
        FileChannel channel = fileInputStream.getChannel();
        this.LIZIZ = channel.map(FileChannel.MapMode.READ_ONLY, channel.position(), channel.size());
        AfOPModel afOPModel = mLConfigModel.output;
        if (afOPModel != null && (list = afOPModel.labels) != null) {
            i = list.size();
        } else {
            i = 1;
        }
        if (i == 2) {
            i = 1;
        }
        this.LIZJ = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 1, i);
        this.LJI = LIZLLL(this.LIZIZ, mLConfigModel);
    }

    public final void LJIIIIZZ(HashMap hashMap, List list) {
        List<String> list2;
        if (list == null || list.isEmpty()) {
            return;
        }
        C48528J2u c48528J2u = this.LJII;
        if (c48528J2u != null && c48528J2u.LIZ) {
            c48528J2u.LJIIJJI.LIZ = System.currentTimeMillis();
        }
        MLConfigModel mLConfigModel = this.LIZ;
        if (mLConfigModel != null) {
            list2 = mLConfigModel.feature_list;
        } else {
            list2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J5M j5m = (J5M) it.next();
            C48545J3l c48545J3l = new C48545J3l((HashMap<String, Object>) hashMap, j5m, list2);
            String operator = j5m.getOperator();
            J3L j3l = J5B.LIZIZ.LIZ.get(operator);
            if (j3l != null) {
                try {
                    j3l.LIZ(c48545J3l);
                } catch (Throwable th) {
                    C40507Fv5.LIZIZ(th);
                }
            } else {
                throw new RuntimeException(i0.LJFF(operator, " don't support now"));
            }
        }
        C48528J2u c48528J2u2 = this.LJII;
        if (c48528J2u2 == null || !c48528J2u2.LIZ) {
            return;
        }
        c48528J2u2.LJIIJJI.LIZIZ = System.currentTimeMillis();
    }

    public static void LJ(AfOPModel afOPModel, java.util.Map map, float[][] fArr) {
        if (afOPModel.getLabels() == null || afOPModel.getLabels().isEmpty()) {
            return;
        }
        List<String> labels = afOPModel.getLabels();
        int size = labels.size();
        if (size == 2) {
            map.put(ListProtector.get(labels, 0), Float.valueOf(1.0f - fArr[0][0]));
            map.put(ListProtector.get(labels, 1), Float.valueOf(fArr[0][0]));
        } else {
            if (size != fArr[0].length) {
                return;
            }
            Iterator<String> it = labels.iterator();
            int i = 0;
            while (it.hasNext()) {
                map.put(it.next(), Float.valueOf(fArr[0][i]));
                i++;
            }
        }
        if (!C40507Fv5.LIZ) {
            return;
        }
        map.toString();
    }

    public final void LIZ(AfOPModel afOPModel, List list, float[] fArr) {
        if (afOPModel == null) {
            return;
        }
        C48528J2u c48528J2u = this.LJII;
        if (c48528J2u != null && c48528J2u.LIZ) {
            c48528J2u.LJIILIIL.LIZ = System.currentTimeMillis();
        }
        C48545J3l c48545J3l = new C48545J3l(afOPModel, list, fArr);
        String operator = afOPModel.getOperator();
        J3L j3l = J5B.LIZIZ.LIZ.get(operator);
        if (j3l != null) {
            try {
                j3l.LIZ(c48545J3l);
            } catch (Throwable th) {
                C40507Fv5.LIZIZ(th);
            }
            C48528J2u c48528J2u2 = this.LJII;
            if (c48528J2u2 == null || !c48528J2u2.LIZ) {
                return;
            }
            c48528J2u2.LJIILIIL.LIZIZ = System.currentTimeMillis();
            return;
        }
        throw new RuntimeException(i0.LJFF(operator, " don't support now"));
    }

    public final float LIZIZ(java.util.Map<String, Object> map, List<? extends J5M> list, AfOPModel afOPModel, List<String> list2) {
        C48528J2u c48528J2u = this.LJII;
        if (c48528J2u != null && c48528J2u.LIZ) {
            c48528J2u.LJIIJ.LIZ = System.currentTimeMillis();
        }
        boolean z = false;
        try {
            this.LIZJ[0][0] = 0.0f;
            HashMap hashMap = new HashMap(map);
            LJIIIIZZ(hashMap, list);
            LJFF(hashMap, list2);
            C48528J2u c48528J2u2 = this.LJII;
            if (c48528J2u2 != null && c48528J2u2.LIZ) {
                c48528J2u2.LJIIL.LIZ = System.currentTimeMillis();
            }
            ByteBuffer byteBuffer = this.LIZLLL;
            if (byteBuffer != null) {
                LJI(byteBuffer, this.LIZJ, this.LIZ);
            }
            C48528J2u c48528J2u3 = this.LJII;
            if (c48528J2u3 != null && c48528J2u3.LIZ) {
                c48528J2u3.LJIIL.LIZIZ = System.currentTimeMillis();
            }
            LIZ(afOPModel, null, this.LIZJ[0]);
            try {
                float f = this.LIZJ[0][0];
                C48528J2u c48528J2u4 = this.LJII;
                if (c48528J2u4 != null && c48528J2u4.LIZ) {
                    c48528J2u4.LJIIJ.LIZIZ = System.currentTimeMillis();
                    c48528J2u4.LJIILJJIL = true;
                    c48528J2u4.LJIILLIIL = Float.valueOf(f);
                }
                return f;
            } catch (Throwable th) {
                th = th;
                z = true;
                C48528J2u c48528J2u5 = this.LJII;
                if (c48528J2u5 != null && c48528J2u5.LIZ) {
                    c48528J2u5.LJIIJ.LIZIZ = System.currentTimeMillis();
                    c48528J2u5.LJIILJJIL = z;
                    c48528J2u5.LJIILLIIL = Float.valueOf(0.0f);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final List<String> LIZJ(java.util.Map<String, Object> map, List<? extends J5M> list, AfOPModel afOPModel, List<String> list2, java.util.Map<String, Float> map2) {
        C48528J2u c48528J2u = this.LJII;
        if (c48528J2u != null && c48528J2u.LIZ) {
            c48528J2u.LJIIJ.LIZ = System.currentTimeMillis();
        }
        String str = "";
        boolean z = false;
        float f = -1.0f;
        try {
            this.LIZJ[0][0] = 0.0f;
            HashMap hashMap = new HashMap(map);
            LJIIIIZZ(hashMap, list);
            LJFF(hashMap, list2);
            C48528J2u c48528J2u2 = this.LJII;
            if (c48528J2u2 != null && c48528J2u2.LIZ) {
                c48528J2u2.LJIIL.LIZ = System.currentTimeMillis();
            }
            ByteBuffer byteBuffer = this.LIZLLL;
            if (byteBuffer != null) {
                LJI(byteBuffer, this.LIZJ, this.LIZ);
            }
            C48528J2u c48528J2u3 = this.LJII;
            if (c48528J2u3 != null && c48528J2u3.LIZ) {
                c48528J2u3.LJIIL.LIZIZ = System.currentTimeMillis();
            }
            ArrayList arrayList = new ArrayList();
            LIZ(afOPModel, arrayList, this.LIZJ[0]);
            LJ(afOPModel, map2, this.LIZJ);
            try {
                if (arrayList.size() > 0) {
                    String str2 = (String) arrayList.get(0);
                    try {
                        Float f2 = map2.get(str2);
                        if (f2 != null) {
                            f = f2.floatValue();
                        }
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        str = str2;
                        z = true;
                        C48528J2u c48528J2u4 = this.LJII;
                        if (c48528J2u4 != null && c48528J2u4.LIZ) {
                            c48528J2u4.LJIIJ.LIZIZ = System.currentTimeMillis();
                            c48528J2u4.LJIILJJIL = z;
                            c48528J2u4.LJIILL = str;
                            c48528J2u4.LJIILLIIL = Float.valueOf(f);
                        }
                        throw th;
                    }
                }
                C48528J2u c48528J2u5 = this.LJII;
                if (c48528J2u5 != null && c48528J2u5.LIZ) {
                    c48528J2u5.LJIIJ.LIZIZ = System.currentTimeMillis();
                    c48528J2u5.LJIILJJIL = true;
                    c48528J2u5.LJIILL = str;
                    c48528J2u5.LJIILLIIL = Float.valueOf(f);
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

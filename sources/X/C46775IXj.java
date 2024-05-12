package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IXj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46775IXj {
    public int LIZ;
    public Object LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public float LJFF;
    public String LJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessAudioUrlData{mediaType=");
        LIZ.append(this.LIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bitRate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", infoId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", loudness='");
        LIZ.append(this.LJ);
        LIZ.append('\'');
        LIZ.append(", peak='");
        LIZ.append(this.LJFF);
        LIZ.append('\'');
        LIZ.append(", fileKey='");
        LIZ.append(this.LJI);
        LIZ.append('\'');
        LIZ.append(", forceSoftwareDecode=");
        LIZ.append(false);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public static List<C46801IYj> LIZ(List<C46775IXj> list) {
        String obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C46775IXj c46775IXj : list) {
            if (c46775IXj != null) {
                IXB.LIZIZ("Ryan1", c46775IXj.toString());
                int i = c46775IXj.LIZ;
                Object obj2 = c46775IXj.LIZIZ;
                if (obj2 == null) {
                    obj = "";
                } else {
                    obj = obj2.toString();
                }
                arrayList.add(new C46801IYj(i, obj, Integer.valueOf(c46775IXj.LIZJ), c46775IXj.LIZLLL, Float.valueOf(c46775IXj.LJ), Float.valueOf(c46775IXj.LJFF), c46775IXj.LJI));
            }
        }
        return arrayList;
    }
}

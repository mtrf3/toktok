package X;

import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04370Fd {
    public static C0GY LIZ(JsonReader jsonReader) {
        char c;
        float LIZLLL = C06310Mp.LIZLLL();
        C0M5<C274816a> c0m5 = new C0M5<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        C0MB<C263611s> c0mb = new C0MB<>();
        C0GY c0gy = new C0GY();
        jsonReader.beginObject();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1408207997:
                    if (nextName.equals("assets")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    if (nextName.equals("layers")) {
                        c = 1;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 2;
                        break;
                    }
                    break;
                case 118:
                    if (nextName.equals("v")) {
                        c = 3;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3276:
                    if (nextName.equals("fr")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals(C63832P3k.LIZ)) {
                        c = 6;
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c = 7;
                        break;
                    }
                    break;
                case 94623709:
                    if (nextName.equals("chars")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 97615364:
                    if (nextName.equals("fonts")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        C0M5 c0m52 = new C0M5();
                        jsonReader.beginObject();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i3 = 0;
                        int i4 = 0;
                        boolean z = true;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -1109732030) {
                                if (hashCode != 104) {
                                    if (hashCode != 112) {
                                        if (hashCode != 117) {
                                            if (hashCode != 119) {
                                                if (hashCode != 3355) {
                                                    if (hashCode == 92909918 && nextName2.equals("alpha")) {
                                                        z = jsonReader.nextBoolean();
                                                    }
                                                    jsonReader.skipValue();
                                                } else if (!nextName2.equals("id")) {
                                                    jsonReader.skipValue();
                                                } else {
                                                    str = jsonReader.nextString();
                                                }
                                            } else if (!nextName2.equals("w")) {
                                                jsonReader.skipValue();
                                            } else {
                                                i3 = jsonReader.nextInt();
                                            }
                                        } else if (!nextName2.equals("u")) {
                                            jsonReader.skipValue();
                                        } else {
                                            str3 = jsonReader.nextString();
                                        }
                                    } else if (!nextName2.equals("p")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str2 = jsonReader.nextString();
                                    }
                                } else if (!nextName2.equals("h")) {
                                    jsonReader.skipValue();
                                } else {
                                    i4 = jsonReader.nextInt();
                                }
                            } else if (!nextName2.equals("layers")) {
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    C274816a LIZ = C04360Fc.LIZ(jsonReader, c0gy);
                                    c0m52.LJI(LIZ.LIZLLL, LIZ);
                                    arrayList2.add(LIZ);
                                }
                                jsonReader.endArray();
                            }
                        }
                        jsonReader.endObject();
                        if (str2 != null) {
                            hashMap2.put(str, new C04750Gp(i3, i4, str, str2, str3, z));
                        } else {
                            hashMap.put(str, arrayList2);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 1:
                    jsonReader.beginArray();
                    int i5 = 0;
                    while (jsonReader.hasNext()) {
                        C274816a LIZ2 = C04360Fc.LIZ(jsonReader, c0gy);
                        if (LIZ2.LJ == C16Y.Image) {
                            i5++;
                        }
                        arrayList.add(LIZ2);
                        c0m5.LJI(LIZ2.LIZLLL, LIZ2);
                        if (i5 > 4) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("You have ");
                            LIZ3.append(i5);
                            LIZ3.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            C0GR.LIZIZ(X1D.LIZIZ(LIZ3));
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    i2 = jsonReader.nextInt();
                    break;
                case 3:
                    String[] split = jsonReader.nextString().split("\\.");
                    int parseInt = CastIntegerProtector.parseInt(split[0]);
                    int parseInt2 = CastIntegerProtector.parseInt(split[1]);
                    int parseInt3 = CastIntegerProtector.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        c0gy.LIZ("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case '\b':
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        jsonReader.beginObject();
                        String str4 = null;
                        String str5 = null;
                        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        char c2 = 0;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.getClass();
                            switch (nextName3.hashCode()) {
                                case -1866931350:
                                    if (!nextName3.equals("fFamily")) {
                                        break;
                                    } else {
                                        str5 = jsonReader.nextString();
                                        break;
                                    }
                                case 119:
                                    if (!nextName3.equals("w")) {
                                        break;
                                    } else {
                                        d = jsonReader.nextDouble();
                                        break;
                                    }
                                case 3173:
                                    if (!nextName3.equals("ch")) {
                                        break;
                                    } else {
                                        c2 = jsonReader.nextString().charAt(0);
                                        break;
                                    }
                                case 3076010:
                                    if (!nextName3.equals("data")) {
                                        break;
                                    } else {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            if ("shapes".equals(jsonReader.nextName())) {
                                                jsonReader.beginArray();
                                                while (jsonReader.hasNext()) {
                                                    arrayList3.add(C0FX.LIZ(jsonReader, c0gy));
                                                }
                                                jsonReader.endArray();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                        jsonReader.endObject();
                                        break;
                                    }
                                case 3530753:
                                    if (!nextName3.equals("size")) {
                                        break;
                                    } else {
                                        jsonReader.nextDouble();
                                        break;
                                    }
                                case 109780401:
                                    if (!nextName3.equals("style")) {
                                        break;
                                    } else {
                                        str4 = jsonReader.nextString();
                                        break;
                                    }
                            }
                            jsonReader.skipValue();
                        }
                        jsonReader.endObject();
                        C263611s c263611s = new C263611s(arrayList3, c2, d, str4, str5);
                        c0mb.LJI(c263611s.hashCode(), c263611s);
                    }
                    jsonReader.endArray();
                    break;
                case '\t':
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        if (!nextName4.equals("list")) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1866931350:
                                            if (!nextName5.equals("fFamily")) {
                                                break;
                                            } else {
                                                str6 = jsonReader.nextString();
                                                break;
                                            }
                                        case -1408684838:
                                            if (!nextName5.equals("ascent")) {
                                                break;
                                            } else {
                                                jsonReader.nextDouble();
                                                break;
                                            }
                                        case -1294566165:
                                            if (!nextName5.equals("fStyle")) {
                                                break;
                                            } else {
                                                str8 = jsonReader.nextString();
                                                break;
                                            }
                                        case 96619537:
                                            if (!nextName5.equals("fName")) {
                                                break;
                                            } else {
                                                str7 = jsonReader.nextString();
                                                break;
                                            }
                                    }
                                    jsonReader.skipValue();
                                }
                                jsonReader.endObject();
                                hashMap3.put(str7, new C263511r(str6, str7, str8));
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        c0gy.LJIIIIZZ = new Rect(0, 0, (int) (i * LIZLLL), (int) (i2 * LIZLLL));
        c0gy.LJIIIZ = f;
        c0gy.LJIIJ = f2;
        c0gy.LJIIJJI = f3;
        c0gy.LJII = arrayList;
        c0gy.LJI = c0m5;
        c0gy.LIZJ = hashMap;
        c0gy.LIZLLL = hashMap2;
        c0gy.LJFF = c0mb;
        c0gy.LJ = hashMap3;
        return c0gy;
    }
}

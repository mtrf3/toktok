package X;

import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04360Fc {
    public static int LIZ;

    public static C274816a LIZIZ(C0GY c0gy) {
        Rect rect = c0gy.LJIIIIZZ;
        return new C274816a(Collections.emptyList(), c0gy, "__container", -1L, C16Y.PreComp, -1L, null, Collections.emptyList(), new C38511fD(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), C16Z.None, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [X.1ot] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public static C274816a LIZ(JsonReader jsonReader, C0GY c0gy) {
        char c;
        C16Z c16z = C16Z.None;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        String str = null;
        String str2 = null;
        String str3 = null;
        C16Y c16y = null;
        C38511fD c38511fD = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        C44511ot c44511ot = 0;
        C268813s c268813s = null;
        C44451on c44451on = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        c = 0;
                        break;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
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
                case 116:
                    if (nextName.equals("t")) {
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
                case 3177:
                    if (nextName.equals("cl")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3367:
                    if (nextName.equals(C63832P3k.LIZ)) {
                        c = 7;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = 15;
                        break;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        c = 16;
                        break;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        c = 18;
                        break;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        c = 19;
                        break;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        c = 20;
                        break;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        c = 21;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    j2 = jsonReader.nextInt();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC271214q LIZ2 = C0FX.LIZ(jsonReader, c0gy);
                        if (LIZ2 != null) {
                            arrayList2.add(LIZ2);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    i5 = (int) (C06310Mp.LIZLLL() * jsonReader.nextInt());
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("a")) {
                            if (!nextName2.equals("d")) {
                                jsonReader.skipValue();
                            } else {
                                final List LIZ3 = C04350Fb.LIZ(1.0f, jsonReader, c0gy, new InterfaceC04380Fe<C263411q>() { // from class: X.1EF
                                    @Override // X.InterfaceC04380Fe
                                    public final C263411q LIZ(JsonReader jsonReader2, float f5) {
                                        jsonReader2.beginObject();
                                        String str4 = null;
                                        String str5 = null;
                                        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                                        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                                        double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                                        int i6 = 0;
                                        int i7 = 0;
                                        int i8 = 0;
                                        int i9 = 0;
                                        int i10 = 0;
                                        boolean z = true;
                                        while (jsonReader2.hasNext()) {
                                            String nextName3 = jsonReader2.nextName();
                                            nextName3.getClass();
                                            switch (nextName3.hashCode()) {
                                                case 102:
                                                    if (!nextName3.equals("f")) {
                                                        break;
                                                    } else {
                                                        str5 = jsonReader2.nextString();
                                                        break;
                                                    }
                                                case 106:
                                                    if (!nextName3.equals("j")) {
                                                        break;
                                                    } else {
                                                        i6 = jsonReader2.nextInt();
                                                        break;
                                                    }
                                                case 115:
                                                    if (!nextName3.equals("s")) {
                                                        break;
                                                    } else {
                                                        d = jsonReader2.nextDouble();
                                                        break;
                                                    }
                                                case 116:
                                                    if (!nextName3.equals("t")) {
                                                        break;
                                                    } else {
                                                        str4 = jsonReader2.nextString();
                                                        break;
                                                    }
                                                case 3261:
                                                    if (!nextName3.equals("fc")) {
                                                        break;
                                                    } else {
                                                        i8 = C0FZ.LIZ(jsonReader2);
                                                        break;
                                                    }
                                                case 3452:
                                                    if (!nextName3.equals("lh")) {
                                                        break;
                                                    } else {
                                                        d2 = jsonReader2.nextDouble();
                                                        break;
                                                    }
                                                case 3463:
                                                    if (!nextName3.equals("ls")) {
                                                        break;
                                                    } else {
                                                        d3 = jsonReader2.nextDouble();
                                                        break;
                                                    }
                                                case 3543:
                                                    if (!nextName3.equals("of")) {
                                                        break;
                                                    } else {
                                                        z = jsonReader2.nextBoolean();
                                                        break;
                                                    }
                                                case 3664:
                                                    if (!nextName3.equals("sc")) {
                                                        break;
                                                    } else {
                                                        i9 = C0FZ.LIZ(jsonReader2);
                                                        break;
                                                    }
                                                case 3684:
                                                    if (!nextName3.equals("sw")) {
                                                        break;
                                                    } else {
                                                        i10 = jsonReader2.nextInt();
                                                        break;
                                                    }
                                                case 3710:
                                                    if (!nextName3.equals("tr")) {
                                                        break;
                                                    } else {
                                                        i7 = jsonReader2.nextInt();
                                                        break;
                                                    }
                                            }
                                            jsonReader2.skipValue();
                                        }
                                        jsonReader2.endObject();
                                        return new C263411q(str4, str5, d, i6, i7, d2, d3, i8, i9, i10, z);
                                    }
                                });
                                c44511ot = new AbstractC38521fE(LIZ3) { // from class: X.1ot
                                    @Override // X.InterfaceC268913t
                                    public final AbstractC22650uj LIZ() {
                                        return new C43811nl((List) this.LJLILLLLZI);
                                    }
                                };
                            }
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                c268813s = null;
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    nextName3.getClass();
                                    if (!nextName3.equals("a")) {
                                        jsonReader.skipValue();
                                    } else {
                                        jsonReader.beginObject();
                                        C44441om c44441om = null;
                                        C44441om c44441om2 = null;
                                        C44451on c44451on2 = null;
                                        C44451on c44451on3 = null;
                                        while (jsonReader.hasNext()) {
                                            String nextName4 = jsonReader.nextName();
                                            nextName4.getClass();
                                            int hashCode = nextName4.hashCode();
                                            if (hashCode != 116) {
                                                if (hashCode != 3261) {
                                                    if (hashCode != 3664) {
                                                        if (hashCode == 3684 && nextName4.equals("sw")) {
                                                            if (3 != 1) {
                                                                if (3 != 2) {
                                                                    if (3 == 3) {
                                                                        c44451on2 = C0FW.LIZ(jsonReader, c0gy, true);
                                                                    }
                                                                } else {
                                                                    c44441om2 = new C44441om(C04350Fb.LIZ(1.0f, jsonReader, c0gy, C1EE.LIZ));
                                                                }
                                                            } else {
                                                                c44441om = new C44441om(C04350Fb.LIZ(1.0f, jsonReader, c0gy, C1EE.LIZ));
                                                            }
                                                        }
                                                        jsonReader.skipValue();
                                                    } else if (!nextName4.equals("sc")) {
                                                        jsonReader.skipValue();
                                                    } else {
                                                        c44441om2 = new C44441om(C04350Fb.LIZ(1.0f, jsonReader, c0gy, C1EE.LIZ));
                                                    }
                                                } else if (!nextName4.equals("fc")) {
                                                    jsonReader.skipValue();
                                                } else {
                                                    c44441om = new C44441om(C04350Fb.LIZ(1.0f, jsonReader, c0gy, C1EE.LIZ));
                                                }
                                            } else if (!nextName4.equals("t")) {
                                                jsonReader.skipValue();
                                            } else {
                                                c44451on3 = C0FW.LIZ(jsonReader, c0gy, true);
                                            }
                                        }
                                        jsonReader.endObject();
                                        c268813s = new C268813s(c44441om, c44441om2, c44451on2, c44451on3);
                                    }
                                }
                                jsonReader.endObject();
                                if (c268813s == null) {
                                    c268813s = new C268813s(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
                                }
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    i4 = (int) (C06310Mp.LIZLLL() * jsonReader.nextInt());
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                case 6:
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName5 = jsonReader.nextName();
                            nextName5.getClass();
                            if (!nextName5.equals("nm")) {
                                jsonReader.skipValue();
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    LIZ4.append(arrayList3);
                    c0gy.LIZ(X1D.LIZIZ(LIZ4));
                    break;
                case 7:
                    f = (float) jsonReader.nextDouble();
                    break;
                case '\b':
                    c38511fD = C0FV.LIZ(jsonReader, c0gy);
                    break;
                case '\t':
                    str2 = jsonReader.nextString();
                    break;
                case '\n':
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i3 = ColorProtector.parseColor(jsonReader.nextString());
                    break;
                case '\f':
                    i2 = (int) (C06310Mp.LIZLLL() * jsonReader.nextInt());
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 14:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    i = (int) (C06310Mp.LIZLLL() * jsonReader.nextInt());
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    c44451on = C0FW.LIZ(jsonReader, c0gy, false);
                    break;
                case 17:
                    c16z = C16Z.values()[jsonReader.nextInt()];
                    break;
                case 18:
                    int nextInt = jsonReader.nextInt();
                    c16y = C16Y.Unknown;
                    if (nextInt >= c16y.ordinal()) {
                        break;
                    } else {
                        c16y = C16Y.values()[nextInt];
                        break;
                    }
                case 19:
                    j = jsonReader.nextInt();
                    break;
                case 20:
                    str3 = jsonReader.nextString();
                    break;
                case 21:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        EnumC271514t enumC271514t = null;
                        C44501os c44501os = null;
                        C44471op c44471op = null;
                        while (jsonReader.hasNext()) {
                            String nextName6 = jsonReader.nextName();
                            nextName6.getClass();
                            int hashCode2 = nextName6.hashCode();
                            if (hashCode2 != 111) {
                                if (hashCode2 != 3588) {
                                    if (hashCode2 == 3357091 && nextName6.equals("mode")) {
                                        String nextString = jsonReader.nextString();
                                        nextString.getClass();
                                        int hashCode3 = nextString.hashCode();
                                        if (hashCode3 != 97) {
                                            if (hashCode3 != 105) {
                                                if (hashCode3 == 115 && nextString.equals("s")) {
                                                    enumC271514t = EnumC271514t.MaskModeSubtract;
                                                }
                                                enumC271514t = EnumC271514t.MaskModeAdd;
                                            } else if (!nextString.equals("i")) {
                                                enumC271514t = EnumC271514t.MaskModeAdd;
                                            } else {
                                                c0gy.LIZ("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                enumC271514t = EnumC271514t.MaskModeIntersect;
                                            }
                                        } else if (!nextString.equals("a")) {
                                            enumC271514t = EnumC271514t.MaskModeAdd;
                                        } else {
                                            enumC271514t = EnumC271514t.MaskModeAdd;
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (!nextName6.equals("pt")) {
                                    jsonReader.skipValue();
                                } else {
                                    c44501os = new C44501os(C04350Fb.LIZ(C06310Mp.LIZLLL(), jsonReader, c0gy, C1EM.LIZ));
                                }
                            } else if (!nextName6.equals("o")) {
                                jsonReader.skipValue();
                            } else {
                                c44471op = C0FW.LIZIZ(jsonReader, c0gy);
                            }
                        }
                        jsonReader.endObject();
                        arrayList.add(new C271614u(enumC271514t, c44501os, c44471op));
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList4 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList4.add(new C06780Ok(c0gy, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        }
        if (f6 <= 0.0f) {
            f6 = c0gy.LJIIJ;
        }
        arrayList4.add(new C06780Ok(c0gy, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList4.add(new C06780Ok(c0gy, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str2 != null) {
            if (str2.endsWith(".ai") || "ai".equals(str)) {
                c0gy.LIZ("Convert your Illustrator layers to shape layers.");
            }
        } else {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("layer_");
            int i6 = LIZ;
            LIZ = i6 + 1;
            LIZ5.append(i6);
            LIZ5.append("_");
            LIZ5.append(str3);
            str2 = X1D.LIZIZ(LIZ5);
        }
        return new C274816a(arrayList2, c0gy, str2, j, c16y, j2, str3, arrayList, c38511fD, i, i2, i3, f3, f4, i4, i5, c44511ot, c268813s, arrayList4, c16z, c44451on);
    }
}

package com.ss.ugc.android.davinciresource;

import X.C141335gf;
import X.C37692Eqm;
import X.C3C5;
import X.C76800UCe;
import X.InterfaceC1039145z;
import X.InterfaceC59973NgH;
import X.OJ4;
import X.OJD;
import X.ORY;
import X.X1D;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class BuildInModelFinder extends IBuildInModelFinder {
    public static final Companion Companion = new Companion();
    public final Context applicationContext;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BuildInModelFinder(Context applicationContext) {
        o.LJIIJ(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    private final String getNameOfModel(String str) {
        int LJJLIIJ = s.LJJLIIJ(str, "/", 6);
        int lastIndexOfRegex = lastIndexOfRegex(str, "_v[0-9]");
        int i = LJJLIIJ + 1;
        if (substringSafetyCheck(str, i, lastIndexOfRegex)) {
            String substring = str.substring(i, lastIndexOfRegex);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        int lastIndexOfRegex2 = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        if (lastIndexOfRegex2 > 0 && lastIndexOfRegex2 > LJJLIIJ) {
            String substring2 = str.substring(i, lastIndexOfRegex2);
            o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        String substring3 = str.substring(i, str.length());
        o.LJFF(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring3;
    }

    private final int getSizeOfModel(String str) {
        int lastIndexOfRegex;
        if (!s.LJJJLZIJ(str, "size", false)) {
            return 0;
        }
        int LJJLIIJ = s.LJJLIIJ(str, "size", 6);
        if (s.LJJJLZIJ(str, "md5", false)) {
            lastIndexOfRegex = lastIndexOfRegex(str, "_md5");
        } else {
            lastIndexOfRegex = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        }
        if (LJJLIIJ >= lastIndexOfRegex) {
            return -1;
        }
        String substring = str.substring(LJJLIIJ + 4, lastIndexOfRegex);
        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return CastIntegerProtector.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    private final String getVersionOfModel(String str) {
        int lastIndexOfRegex = lastIndexOfRegex(str, "_v[0-9]");
        int lastIndexOfRegex2 = lastIndexOfRegex(str, "\\.model|_model|\\.dat");
        if (lastIndexOfRegex > 0) {
            int i = lastIndexOfRegex + 2;
            if (str != null) {
                String substring = str.substring(i, lastIndexOfRegex2);
                o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
        }
        return "1.0";
    }

    public final boolean exists(String fileName) {
        Object LIZ;
        o.LJIIJ(fileName, "fileName");
        try {
            AssetManager assets = this.applicationContext.getAssets();
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(BuildInModelFinderKt.joinFileSeperator("model"));
                LIZ2.append(fileName);
                LIZ = assets.open(X1D.LIZIZ(LIZ2), 2);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            InputStream inputStream = (InputStream) LIZ;
            if (inputStream != null) {
                try {
                    inputStream.close();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                    return true;
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder
    public String findModelUri(String str) {
        boolean z;
        Object LIZ;
        Object LIZ2;
        boolean z2 = true;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "asset://not_found";
        }
        try {
            LIZ = str.substring(0, s.LJJLIIJ(str, "/", 6));
            o.LJFF(LIZ, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str2 = "";
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = "";
        }
        String str3 = (String) LIZ;
        StringBuilder sb = new StringBuilder("model");
        if (str3.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            str2 = "/".concat(str3);
        }
        sb.append(str2);
        String sb2 = sb.toString();
        Object obj = null;
        try {
            String[] list = this.applicationContext.getAssets().list(sb2);
            if (list != null) {
                LIZ2 = ORY.LJJZZIII(list);
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        List<String> list2 = (List) obj;
        String nameOfModel = getNameOfModel(str);
        if (list2 != null) {
            for (String it : list2) {
                o.LJFF(it, "it");
                if (o.LJ(getNameOfModel(it), nameOfModel)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("asset://");
                    LIZ3.append(sb2);
                    LIZ3.append('/');
                    LIZ3.append(it);
                    return X1D.LIZIZ(LIZ3);
                }
            }
        }
        if (!exists("model/" + str)) {
            return "asset://not_found";
        }
        return "asset://model/" + str;
    }

    private final int lastIndexOfRegex(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        InterfaceC1039145z findAll$default = OJD.findAll$default(new OJD(str2), str, 0, 2, null);
        if (!findAll$default.iterator().hasNext()) {
            return -1;
        }
        return ((InterfaceC59973NgH) OJ4.LJJJJLI(findAll$default)).LIZIZ().LJLIL;
    }

    private final boolean substringSafetyCheck(String str, int i, int i2) {
        if (ujb.o.LJJJJJL(str) || i < 0 || i2 < 0 || i >= i2 || i >= str.length() || i2 > str.length()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IBuildInModelFinder
    public boolean isBuildInModel(String str, String str2, int i) {
        if (str == null || ujb.o.LJJJJJL(str) || !exists(str)) {
            return false;
        }
        if (str2 != null && !ujb.o.LJJJJJL(str2) && Float.compare(CastFloatProtector.parseFloat(getVersionOfModel(str)), CastFloatProtector.parseFloat(str2)) != 0) {
            return false;
        }
        if (i < 0 || getSizeOfModel(str) == i) {
            return true;
        }
        return false;
    }
}

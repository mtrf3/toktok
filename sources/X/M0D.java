package X;

import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M0D {
    public static final /* synthetic */ int LIZ = 0;

    public static Throwable LIZIZ(EnumC56107M0h error) {
        o.LJIIIZ(error, "error");
        m mVar = new m();
        mVar.LJJIIJ("error_code", Integer.valueOf(error.getCode()));
        mVar.LJJIIZ("error_message", error.getMsg());
        return new Throwable(mVar.toString());
    }

    public static TemplateData LIZLLL(EnumC56107M0h error) {
        o.LJIIIZ(error, "error");
        TemplateData LIZIZ = TemplateData.LIZIZ();
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIIJ(new OSZ("error_code", String.valueOf(error.getCode())), new OSZ("error_message", error.getMsg()))).entrySet()) {
            LIZIZ.LJI((String) entry.getKey(), entry.getValue());
        }
        return LIZIZ;
    }

    public static Throwable LIZ(int i, String str) {
        m mVar = new m();
        mVar.LJJIIJ("error_code", Integer.valueOf(i));
        mVar.LJJIIZ("error_message", str);
        return new Throwable(mVar.toString());
    }

    public static TemplateData LIZJ(int i, String str) {
        TemplateData LIZIZ = TemplateData.LIZIZ();
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("error_code", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("error_message", str);
        for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIIIIJ(oszArr)).entrySet()) {
            LIZIZ.LJI((String) entry.getKey(), entry.getValue());
        }
        return LIZIZ;
    }
}

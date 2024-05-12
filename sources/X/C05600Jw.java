package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.io.StringWriter;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05600Jw {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C47041sy.LJLIL);

    public static final Object LIZIZ(j jVar) {
        if (jVar instanceof l) {
            return null;
        }
        if (jVar instanceof m) {
            return LIZLLL((m) jVar);
        }
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            o.LJIIIZ(gVar, "<this>");
            return new C36301be(gVar);
        }
        if (jVar instanceof p) {
            p pVar = (p) jVar;
            Object obj = pVar.LJLIL;
            if (obj instanceof Number) {
                return pVar.LJIL();
            }
            if (obj instanceof String) {
                return pVar.LJJIFFI();
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(pVar.LJFF());
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unknown JsonPrimitive type: ");
            LIZ2.append(C16880lQ.LJLLILLLL(jVar.getClass()));
            throw new IllegalStateException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Unknown JsonElement type: ");
        LIZ3.append(C16880lQ.LJLLILLLL(jVar.getClass()));
        throw new IllegalStateException(X1D.LIZIZ(LIZ3));
    }

    public static final String LIZJ(m mVar) {
        StringWriter stringWriter = new StringWriter();
        C65403Plf c65403Plf = new C65403Plf(stringWriter);
        c65403Plf.LJLJJLL = true;
        ((TypeAdapter) LIZ.getValue()).write(c65403Plf, mVar);
        String stringWriter2 = stringWriter.toString();
        o.LJIIIIZZ(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    public static final C36321bg LIZLLL(m mVar) {
        o.LJIIIZ(mVar, "<this>");
        return new C36321bg(mVar);
    }

    public static final int LIZ(android.net.Uri uri, String str) {
        float parseFloat;
        int LJIIL;
        float f;
        o.LJIIIZ(uri, "uri");
        if (str == null) {
            return 0;
        }
        if (ujb.o.LJJJJ(str, "rpx", false)) {
            f = CastFloatProtector.parseFloat(s.LJJZZIII("rpx", str)) / 750;
            parseFloat = C15380j0.LJIIL();
        } else if (ujb.o.LJJJJ(str, "%", false)) {
            parseFloat = CastFloatProtector.parseFloat(s.LJJZZIII("%", str)) / 100.0f;
            if (s.LJJJLZIJ("variable_height", "width", false)) {
                LJIIL = C15380j0.LJIIL();
            } else if (s.LJJJLZIJ("variable_height", "height", false)) {
                LJIIL = C15380j0.LJIIJJI();
            } else {
                LJIIL = C15380j0.LJIIL();
            }
            f = LJIIL;
        } else {
            return C15380j0.LIZ(CastFloatProtector.parseFloat(str));
        }
        return (int) (f * parseFloat);
    }
}

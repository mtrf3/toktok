package X;

import java.util.List;
import java.util.ListIterator;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.X9l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84373X9l extends AbstractC65781Prl implements InterfaceC65784Pro<C84374X9m> {
    public static final C84373X9l LJLIL = new C84373X9l();

    public C84373X9l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C84374X9m invoke() {
        List list;
        C84374X9m c84374X9m = new C84374X9m();
        try {
            C88421Yn3 c88421Yn3 = new C88421Yn3();
            c88421Yn3.LIZJ();
            GL10 gl10 = c88421Yn3.LJFF;
            if (gl10 != null) {
                String glGetString = gl10.glGetString(7936);
                o.LJFF(glGetString, "it.glGetString(GL10.GL_VENDOR)");
                c84374X9m.LIZJ = glGetString;
                String glGetString2 = gl10.glGetString(7938);
                o.LJFF(glGetString2, "it.glGetString(GL10.GL_VERSION)");
                c84374X9m.LIZIZ = glGetString2;
                String glGetString3 = gl10.glGetString(7937);
                o.LJFF(glGetString3, "it.glGetString(GL10.GL_RENDERER)");
                c84374X9m.LIZ = glGetString3;
                String glGetString4 = gl10.glGetString(7939);
                o.LJFF(glGetString4, "it.glGetString(GL10.GL_EXTENSIONS)");
                c84374X9m.LJII = glGetString4;
            }
            c88421Yn3.LIZIZ();
            String str = c84374X9m.LIZIZ;
            if (ujb.o.LJJJLIIL(str, "OpenGL ES", false)) {
                String substring = str.substring(9);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                str = s.LJZI(substring).toString();
                List<String> split = new OJD(" ").split(str, 0);
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
                        str = strArr[0];
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            o.LJIIJ(str, "<set-?>");
            c84374X9m.LIZIZ = str;
            c84374X9m.LIZLLL = C84372X9k.LIZJ(c84374X9m.LIZ, "max");
            c84374X9m.LJ = C84372X9k.LIZJ(c84374X9m.LIZ, "min");
            c84374X9m.LJI = C84372X9k.LIZIZ(c84374X9m.LIZ);
        } catch (Throwable th) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get gpu info error:");
            LIZ.append(th.getMessage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("GPUUtils", LIZIZ, null);
        }
        return c84374X9m;
    }
}

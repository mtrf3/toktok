package X;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.w3c.dom.Document;

/* renamed from: X.NNt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59265NNt {
    public static final Document LIZ(String str) {
        o.LJIIIZ(str, "<this>");
        try {
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                AnonymousClass636.LJFF(byteArrayInputStream, null);
                return parse;
            } finally {
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            throw new J82(th);
        }
    }

    public static InterfaceC1039145z LIZIZ(C51652KOy c51652KOy, XPath xPath) {
        return OJ4.LJJJJ(OJ4.LJJJJLL(OJ4.LJJJJLL(c51652KOy, new AqS176S0100000_10(xPath, 111)), C60582Zi.LJLIL), C57172Mf.LJLIL);
    }

    public static final C51652KOy LIZJ(XPath xPath, Object item, InterfaceC1039145z interfaceC1039145z) {
        o.LJIIIZ(item, "item");
        return OJ4.LJJJJJL(interfaceC1039145z, new AqS141S0200000_10(xPath, item, 23));
    }

    public static final C51652KOy LIZLLL(XPath xPath, Object item, String... strArr) {
        o.LJIIIZ(item, "item");
        return LIZJ(xPath, item, ORY.LJJIIZ(strArr));
    }
}

package X;

import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.o;
import org.w3c.dom.Document;

/* renamed from: X.NNu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59266NNu implements InterfaceC59268NNw {
    public static final C59266NNu LIZ = new C59266NNu();

    @Override // X.InterfaceC59268NNw
    public final Document LIZ(String str) {
        try {
            String LIZ2 = RawURLGetter.LIZ(str);
            o.LJI(LIZ2);
            try {
                byte[] bytes = LIZ2.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                    AnonymousClass636.LJFF(byteArrayInputStream, null);
                    o.LJIIIIZZ(parse, "{\n                conten…          }\n            }");
                    return parse;
                } finally {
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                throw new J82(th);
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            throw new J81(str, e);
        }
    }
}

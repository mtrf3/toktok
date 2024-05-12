package X;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/* renamed from: X.NNv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59267NNv implements InterfaceC59268NNw {
    public static final C59267NNv LIZ = new C59267NNv();

    @Override // X.InterfaceC59268NNw
    public final Document LIZ(String str) {
        if (str != null) {
            try {
                return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
            } catch (SAXException e) {
                C78983UzD.LJIIZILJ(e);
                throw new J82(e);
            } catch (Throwable th) {
                throw new J81(str, th);
            }
        }
        return null;
    }
}

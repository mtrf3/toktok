package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.EhR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37113EhR implements Attributes {
    public final XmlPullParser LIZ;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.LIZ.getAttributeCount();
    }

    public C37113EhR(XmlPullParser xmlPullParser) {
        this.LIZ = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.LIZ.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        String attributeName = this.LIZ.getAttributeName(i);
        if (this.LIZ.getAttributePrefix(i) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.getAttributePrefix(i));
            LIZ.append(':');
            LIZ.append(attributeName);
            return X1D.LIZIZ(LIZ);
        }
        return attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.LIZ.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.LIZ.getAttributeValue(i);
    }
}

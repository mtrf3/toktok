package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.Phw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65172Phw extends C65445PmL {

    @InterfaceC65461Pmb("Accept")
    public List<String> accept;

    @InterfaceC65461Pmb("Accept-Encoding")
    public List<String> acceptEncoding;

    @InterfaceC65461Pmb("Age")
    public List<Long> age;

    @InterfaceC65461Pmb("WWW-Authenticate")
    public List<String> authenticate;

    @InterfaceC65461Pmb("Authorization")
    public List<String> authorization;

    @InterfaceC65461Pmb("Cache-Control")
    public List<String> cacheControl;

    @InterfaceC65461Pmb("Content-Encoding")
    public List<String> contentEncoding;

    @InterfaceC65461Pmb("Content-Length")
    public List<Long> contentLength;

    @InterfaceC65461Pmb("Content-MD5")
    public List<String> contentMD5;

    @InterfaceC65461Pmb("Content-Range")
    public List<String> contentRange;

    @InterfaceC65461Pmb("Content-Type")
    public List<String> contentType;

    @InterfaceC65461Pmb("Cookie")
    public List<String> cookie;

    @InterfaceC65461Pmb("Date")
    public List<String> date;

    @InterfaceC65461Pmb("ETag")
    public List<String> etag;

    @InterfaceC65461Pmb("Expires")
    public List<String> expires;

    @InterfaceC65461Pmb("If-Match")
    public List<String> ifMatch;

    @InterfaceC65461Pmb("If-Modified-Since")
    public List<String> ifModifiedSince;

    @InterfaceC65461Pmb("If-None-Match")
    public List<String> ifNoneMatch;

    @InterfaceC65461Pmb("If-Range")
    public List<String> ifRange;

    @InterfaceC65461Pmb("If-Unmodified-Since")
    public List<String> ifUnmodifiedSince;

    @InterfaceC65461Pmb("Last-Modified")
    public List<String> lastModified;

    @InterfaceC65461Pmb("Location")
    public List<String> location;

    @InterfaceC65461Pmb("MIME-Version")
    public List<String> mimeVersion;

    @InterfaceC65461Pmb("Range")
    public List<String> range;

    @InterfaceC65461Pmb("Retry-After")
    public List<String> retryAfter;

    @InterfaceC65461Pmb("User-Agent")
    public List<String> userAgent;

    public C65172Phw() {
        super(EnumSet.of(PO2.IGNORE_CASE));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    public final String LIZJ() {
        Object obj;
        List<String> list = this.userAgent;
        if (list == null) {
            obj = null;
        } else {
            obj = ListProtector.get(list, 0);
        }
        return (String) obj;
    }

    @Override // X.C65445PmL
    /* renamed from: LIZ */
    public final C65445PmL clone() {
        return super.clone();
    }

    @Override // X.C65445PmL, java.util.AbstractMap
    public final Object clone() {
        return super.clone();
    }

    public final void LIZLLL(String str) {
        ArrayList LIZIZ;
        if (str == null) {
            LIZIZ = null;
        } else {
            LIZIZ = C05040Hs.LIZIZ(str);
        }
        this.userAgent = LIZIZ;
    }

    @Override // X.C65445PmL
    public final void LIZIZ(Object obj, String str) {
        super.LIZIZ(obj, str);
    }
}

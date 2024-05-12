package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PNw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64364PNw extends C65445PmL {
    public static final C64366PNy LJLJLLL = new C64366PNy("=&-_.!~*'()@:$,;/?:", false);
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public List<String> LJLJL;
    public final String LJLJLJ;

    public final String LIZLLL() {
        StringBuilder sb = new StringBuilder();
        String str = this.LJLJI;
        str.getClass();
        sb.append(str);
        sb.append("://");
        String str2 = this.LJLJJL;
        if (str2 != null) {
            sb.append(C64365PNx.LIZIZ.LLLLZ(str2));
            sb.append('@');
        }
        String str3 = this.LJLJJI;
        str3.getClass();
        sb.append(str3);
        int i = this.LJLJJLL;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.LJLJL;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = (String) ListProtector.get(this.LJLJL, i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (str4.length() != 0) {
                    sb2.append(C64365PNx.LIZ.LLLLZ(str4));
                }
            }
        }
        Iterator<Map.Entry<String, Object>> it = new C65451PmR(this).iterator();
        boolean z = true;
        while (true) {
            C65456PmW c65456PmW = (C65456PmW) it;
            if (!c65456PmW.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = c65456PmW.next();
            Object value = next.getValue();
            if (value != null) {
                String LLLLZ = C64365PNx.LIZJ.LLLLZ(next.getKey());
                if (value instanceof Collection) {
                    Iterator it2 = ((Collection) value).iterator();
                    while (it2.hasNext()) {
                        z = LIZJ(z, sb2, LLLLZ, it2.next());
                    }
                } else {
                    z = LIZJ(z, sb2, LLLLZ, value);
                }
            }
        }
        String str5 = this.LJLJLJ;
        if (str5 != null) {
            sb2.append('#');
            sb2.append(LJLJLLL.LLLLZ(str5));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public C64364PNw() {
        this.LJLJJLL = -1;
    }

    @Override // X.C65445PmL, java.util.AbstractMap
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final C64364PNw clone() {
        C64364PNw c64364PNw = (C64364PNw) super.clone();
        if (this.LJLJL != null) {
            c64364PNw.LJLJL = new ArrayList(this.LJLJL);
        }
        return c64364PNw;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return LIZLLL().hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return LIZLLL();
    }

    public C64364PNw(int i) {
        ArrayList arrayList;
        String str;
        boolean z;
        String substring;
        try {
            java.net.URL url = new java.net.URL("https://accounts.google.com/o/oauth2/token");
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();
            String ref = url.getRef();
            String query = url.getQuery();
            String userInfo = url.getUserInfo();
            this.LJLJJLL = -1;
            this.LJLJI = protocol.toLowerCase();
            this.LJLJJI = host;
            this.LJLJJLL = port;
            if (path == null || path.length() == 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int i2 = 0;
                do {
                    int indexOf = path.indexOf(47, i2);
                    if (indexOf != -1) {
                        z = true;
                        substring = path.substring(i2, indexOf);
                    } else {
                        z = false;
                        substring = path.substring(i2);
                    }
                    arrayList.add(C64365PNx.LIZ(substring));
                    i2 = indexOf + 1;
                } while (z);
            }
            this.LJLJL = arrayList;
            if (ref != null) {
                str = C64365PNx.LIZ(ref);
            } else {
                str = null;
            }
            this.LJLJLJ = str;
            if (query != null) {
                try {
                    C65443PmJ.LIZ(new StringReader(query), this);
                } catch (IOException e) {
                    if (!Error.class.isInstance(e)) {
                        if (!RuntimeException.class.isInstance(e)) {
                            throw new RuntimeException(e);
                        }
                        throw ((Throwable) RuntimeException.class.cast(e));
                    }
                    throw ((Throwable) Error.class.cast(e));
                }
            }
            this.LJLJJL = userInfo != null ? C64365PNx.LIZ(userInfo) : null;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C64364PNw)) {
            return false;
        }
        return LIZLLL().equals(((C64364PNw) obj).LIZLLL());
    }

    @Override // X.C65445PmL
    public final void LIZIZ(Object obj, String str) {
        super.LIZIZ(obj, str);
    }

    public static boolean LIZJ(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            sb.append('?');
            z = false;
        } else {
            sb.append('&');
        }
        sb.append(str);
        String LLLLZ = C64365PNx.LIZJ.LLLLZ(obj.toString());
        if (LLLLZ.length() != 0) {
            sb.append('=');
            sb.append(LLLLZ);
        }
        return z;
    }
}

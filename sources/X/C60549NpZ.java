package X;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.NpZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60549NpZ extends AbstractC60548NpY {
    public String LIZ;
    public final android.net.Uri LIZIZ;

    @Override // X.AbstractC60548NpY
    public final String LIZ() {
        String uri = this.LIZIZ.toString();
        o.LJFF(uri, "uri.toString()");
        return uri;
    }

    @Override // X.AbstractC60548NpY
    public final String LIZIZ() {
        String path;
        String LJJJ;
        String authority = this.LIZIZ.getAuthority();
        if ((authority == null || authority.length() == 0) && (((path = this.LIZIZ.getPath()) == null || path.length() == 0) && LIZJ() == EnumC60551Npb.LYNX)) {
            LJJJ = C47261Igj.LJJJ(this.LIZIZ, "surl");
            if (LJJJ == null) {
                LJJJ = String.valueOf(this.LIZIZ);
            }
        } else {
            LJJJ = new Uri.Builder().scheme(this.LIZIZ.getScheme()).authority(this.LIZIZ.getAuthority()).path(this.LIZIZ.getPath()).build().toString();
            o.LJFF(LJJJ, "Uri.Builder()\n          …      .build().toString()");
        }
        if (TextUtils.isEmpty(LJJJ)) {
            String uri = this.LIZIZ.toString();
            o.LJFF(uri, "uri.toString()");
            return uri;
        }
        return LJJJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000f. Please report as an issue. */
    @Override // X.AbstractC60548NpY
    public final EnumC60551Npb LIZJ() {
        String scheme = this.LIZIZ.getScheme();
        if (scheme != null) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return EnumC60551Npb.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return EnumC60551Npb.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return EnumC60551Npb.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return EnumC60551Npb.RN;
                    }
                    break;
            }
        }
        return EnumC60551Npb.UNKNOWN;
    }

    public C60549NpZ(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        this.LIZIZ = uri;
        this.LIZ = "";
    }
}

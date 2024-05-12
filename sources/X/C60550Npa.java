package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Npa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60550Npa extends AbstractC60548NpY {
    public final android.net.Uri LIZ;

    public final android.net.Uri LIZLLL() {
        C3C4 LIZ;
        String LJJJ;
        try {
            LJJJ = C47261Igj.LJJJ(this.LIZ, "url");
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (LJJJ != null) {
            return UriProtector.parse(LJJJ);
        }
        C3C5.m7constructorimpl(null);
        LIZ = null;
        return (android.net.Uri) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
    }

    @Override // X.AbstractC60548NpY
    public final String LIZ() {
        String uri = this.LIZ.toString();
        o.LJFF(uri, "uri.toString()");
        return uri;
    }

    @Override // X.AbstractC60548NpY
    public final String LIZIZ() {
        String path;
        android.net.Uri LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            String authority = LIZLLL.getAuthority();
            if ((authority == null || authority.length() == 0) && (((path = LIZLLL.getPath()) == null || path.length() == 0) && LIZJ() == EnumC60551Npb.LYNX)) {
                String LJJJ = C47261Igj.LJJJ(LIZLLL, "surl");
                if (LJJJ != null) {
                    return LJJJ;
                }
                return String.valueOf(LIZLLL);
            }
            String uri = new Uri.Builder().scheme(LIZLLL.getScheme()).authority(LIZLLL.getAuthority()).path(LIZLLL.getPath()).build().toString();
            o.LJFF(uri, "Uri.Builder()\n          …      .build().toString()");
            return uri;
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    @Override // X.AbstractC60548NpY
    public final EnumC60551Npb LIZJ() {
        String scheme;
        android.net.Uri LIZLLL = LIZLLL();
        if (LIZLLL != null && (scheme = LIZLLL.getScheme()) != null) {
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

    public C60550Npa(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
        this.LIZ = uri;
    }
}

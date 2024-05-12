package X;

import android.graphics.Bitmap;
import java.util.UUID;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q3j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66379Q3j {
    public final UUID LIZ;
    public final Bitmap LIZIZ;
    public final android.net.Uri LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C66379Q3j(Bitmap bitmap, android.net.Uri uri, UUID callId) {
        String uuid;
        String LIZIZ;
        boolean z;
        o.LJIIIZ(callId, "callId");
        this.LIZ = callId;
        this.LIZIZ = bitmap;
        this.LIZJ = uri;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (ujb.o.LJJJJIZL("content", scheme, true)) {
                this.LJFF = true;
                String authority = uri.getAuthority();
                if (authority != null && !ujb.o.LJJJLIIL(authority, "media", false)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJI = z;
            } else if (ujb.o.LJJJJIZL("file", uri.getScheme(), true)) {
                this.LJI = true;
            } else if (!C66373Q3d.LJIJJLI(uri)) {
                throw new Q4W(o.LJIILLIIL(scheme, "Unsupported scheme for media Uri : "));
            }
        } else if (bitmap != null) {
            this.LJI = true;
        } else {
            throw new Q4W("Cannot share media without a bitmap or Uri set");
        }
        if (!this.LJI) {
            uuid = null;
        } else {
            uuid = UUID.randomUUID().toString();
        }
        this.LJ = uuid;
        if (!this.LJI) {
            LIZIZ = String.valueOf(uri);
        } else {
            LIZIZ = Q8U.LIZIZ(new Object[]{"content://com.facebook.app.FacebookContentProvider", u.LIZLLL(), callId.toString(), uuid}, 4, "%s%s/%s/%s", "java.lang.String.format(format, *args)");
        }
        this.LIZLLL = LIZIZ;
    }
}

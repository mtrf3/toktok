package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.OlQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62840OlQ implements InterfaceC80653En {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;

    public final int hashCode() {
        return this.LJLJL.hashCode() + ((C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31, 31), 31), 31) + this.LJLJJLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadGlobalConfigProperty(sourceId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJI);
        LIZ.append(", downloadMethod=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", detailTabName=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isLandScapeScreen=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", downloadID=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62840OlQ)) {
            return false;
        }
        C62840OlQ c62840OlQ = (C62840OlQ) obj;
        if (o.LJ(this.LJLIL, c62840OlQ.LJLIL) && o.LJ(this.LJLILLLLZI, c62840OlQ.LJLILLLLZI) && o.LJ(this.LJLJI, c62840OlQ.LJLJI) && o.LJ(this.LJLJJI, c62840OlQ.LJLJJI) && o.LJ(this.LJLJJL, c62840OlQ.LJLJJL) && this.LJLJJLL == c62840OlQ.LJLJJLL && o.LJ(this.LJLJL, c62840OlQ.LJLJL)) {
            return true;
        }
        return false;
    }

    public C62840OlQ(Aweme aweme, String str, String str2, String str3, int i, String str4) {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = uuid;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = i;
        this.LJLJL = str4;
    }
}

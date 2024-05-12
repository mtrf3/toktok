package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ptc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65896Ptc implements PYQ {
    public final C65901Pth LJLIL;
    public List<android.net.Uri> LJLILLLLZI;
    public final java.util.Map<android.net.Uri, java.util.Set<String>> LJLJI;
    public Throwable LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public transient Object LJLJLJ;

    public C65896Ptc() {
        this(null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65896Ptc)) {
            return false;
        }
        C65896Ptc c65896Ptc = (C65896Ptc) obj;
        return o.LJ(this.LJLIL, c65896Ptc.LJLIL) && o.LJ(this.LJLILLLLZI, c65896Ptc.LJLILLLLZI) && o.LJ(this.LJLJI, c65896Ptc.LJLJI) && o.LJ(this.LJLJJI, c65896Ptc.LJLJJI) && this.LJLJJL == c65896Ptc.LJLJJL && this.LJLJJLL == c65896Ptc.LJLJJLL && this.LJLJL == c65896Ptc.LJLJL && o.LJ(this.LJLJLJ, c65896Ptc.LJLJLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C65901Pth c65901Pth = this.LJLIL;
        int hashCode = (c65901Pth != null ? c65901Pth.hashCode() : 0) * 31;
        List<android.net.Uri> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        java.util.Map<android.net.Uri, java.util.Set<String>> map = this.LJLJI;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Throwable th = this.LJLJJI;
        int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.LJLJJLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJLJL ? 1 : 0)) * 31;
        Object obj = this.LJLJLJ;
        return i4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkStackEvent(id=");
        LIZ.append(this.LJLIL.LJLIL.LIZ);
        LIZ.append(", isReport=");
        LIZ.append(this.LJLIL.LJZI.LJLILLLLZI);
        LIZ.append(", reportParams=");
        LIZ.append(this.LJLIL.LJLLLL);
        LIZ.append(", uris=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", uriScenes=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isCollectInfo=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isCollectStack=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isFrequencyCollectStack=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.PYQ
    public final C65901Pth LJJJJL() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C65896Ptc(X.C65901Pth r10, int r11) {
        /*
            r9 = this;
            r1 = r10
            r0 = r11 & 1
            if (r0 == 0) goto La
            X.Pth r1 = new X.Pth
            r1.<init>()
        La:
            r0 = r11 & 2
            r3 = 0
            if (r0 == 0) goto L27
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L14:
            r0 = r11 & 4
            if (r0 == 0) goto L1d
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L1d:
            r4 = 0
            r5 = 0
            r0 = r9
            r6 = r5
            r7 = r5
            r8 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L27:
            r2 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65896Ptc.<init>(X.Pth, int):void");
    }

    public C65896Ptc(C65901Pth baseEvent, List<android.net.Uri> uris, java.util.Map<android.net.Uri, java.util.Set<String>> uriScenes, Throwable th, boolean z, boolean z2, boolean z3, Object obj) {
        o.LJIIIZ(baseEvent, "baseEvent");
        o.LJIIIZ(uris, "uris");
        o.LJIIIZ(uriScenes, "uriScenes");
        this.LJLIL = baseEvent;
        this.LJLILLLLZI = uris;
        this.LJLJI = uriScenes;
        this.LJLJJI = th;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = obj;
    }
}

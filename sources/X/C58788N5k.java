package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.N5k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58788N5k implements InterfaceC49504Jbo {
    public final C0M6<String, JMD> LIZ = new C0M6<>(10);
    public final C0M6<String, N7D> LIZIZ = new C0M6<>(10);
    public final C58786N5i LIZJ = new C58786N5i();

    @Override // X.InterfaceC49504Jbo
    public final C58786N5i LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC49504Jbo
    public final N6C LIZ(JPR jpr) {
        return new N6C(jpr);
    }

    @Override // X.InterfaceC49504Jbo
    public final N7D LIZJ(Aweme aweme) {
        N7D LIZ;
        Object obj = null;
        if (aweme == null) {
            return null;
        }
        try {
            C0M6<String, N7D> c0m6 = this.LIZIZ;
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "this.aid");
            LIZ = c0m6.LIZIZ(aid);
            if (LIZ == null) {
                LIZ = LJI(new C58789N5l(aweme));
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (N7D) obj;
    }

    @Override // X.InterfaceC49504Jbo
    public final JMD LIZLLL(Aweme aweme) {
        int i;
        if (aweme == null) {
            return null;
        }
        C0M6<String, JMD> c0m6 = this.LIZ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "this.aid");
        JMD LIZIZ = c0m6.LIZIZ(aid);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getItemModule: module = ");
        if (LIZIZ != null) {
            i = LIZIZ.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(" key = ");
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "this.aid");
        LIZ.append(aid2);
        LIZ.append(' ');
        N8M.LIZ(X1D.LIZIZ(LIZ));
        return LIZIZ;
    }

    @Override // X.InterfaceC49504Jbo
    public final void LJ(JMD jmd) {
        String str;
        String str2;
        C0M6<String, JMD> c0m6 = this.LIZ;
        Aweme aweme = jmd.L9().getAweme();
        if (aweme != null) {
            str = aweme.getAid();
            o.LJIIIIZZ(str, "this.aid");
        } else {
            str = "default";
        }
        c0m6.LIZJ(str, jmd);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addItemModule: module = ");
        LIZ.append(jmd.hashCode());
        LIZ.append(" aid = ");
        Aweme aweme2 = jmd.L9().getAweme();
        String str3 = null;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" requestId = ");
        Aweme aweme3 = jmd.L9().getAweme();
        if (aweme3 != null) {
            str3 = aweme3.getRequestId();
        }
        LIZ.append(str3);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC49504Jbo
    public final N6D LJFF(C49043JMp c49043JMp) {
        return new N6D(c49043JMp);
    }

    public final C58781N5d LJI(C58789N5l c58789N5l) {
        String str;
        String str2;
        C58781N5d c58781N5d = new C58781N5d(c58789N5l);
        Aweme aweme = c58789N5l.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
            o.LJIIIIZZ(str, "this.aid");
        } else {
            str = "default";
        }
        this.LIZIZ.LIZJ(str, c58781N5d);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createSearchDetailModule: module = ");
        LIZ.append(c58781N5d.hashCode());
        LIZ.append(" aid = ");
        Aweme aweme2 = c58789N5l.getAweme();
        String str3 = null;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" requestId = ");
        Aweme aweme3 = c58789N5l.getAweme();
        if (aweme3 != null) {
            str3 = aweme3.getRequestId();
        }
        LIZ.append(str3);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        return c58781N5d;
    }
}

package X;

import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class O7O {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI = true;

    public final String LIZIZ() {
        if (LIZ(this.LIZ)) {
            this.LIZ = C61359O6h.LJJJI.LLIFFJFJJ();
        }
        return this.LIZ;
    }

    public final String LIZJ() {
        if (LIZ(this.LIZIZ)) {
            this.LIZIZ = C61359O6h.LJJJI.LLII();
        }
        return this.LIZIZ;
    }

    public final String LIZLLL() {
        if (LIZ(this.LJFF)) {
            this.LJFF = C61359O6h.LJJJI.LLIIIZ();
        }
        return this.LJFF;
    }

    public final String LJ() {
        if (LIZ(this.LJIIIZ)) {
            this.LJIIIZ = C61359O6h.LJJJI.LLIIJI();
        }
        return this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(LIZLLL())) {
            sb.append("&channel=");
            sb.append(android.net.Uri.encode(LIZLLL()));
        }
        if (!TextUtils.isEmpty(LIZIZ())) {
            sb.append("&aid=");
            sb.append(android.net.Uri.encode(LIZIZ()));
        }
        if (LIZ(this.LJIILLIIL)) {
            C61359O6h.LJJJI.getClass();
            this.LJIILLIIL = "";
        }
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            sb.append("&gaid=");
            if (LIZ(this.LJIILLIIL)) {
                C61359O6h.LJJJI.getClass();
                this.LJIILLIIL = "";
            }
            sb.append(android.net.Uri.encode(this.LJIILLIIL));
        }
        if (!TextUtils.isEmpty(LIZJ())) {
            sb.append("&app_name=");
            sb.append(android.net.Uri.encode(LIZJ()));
        }
        if (LIZ(this.LJ)) {
            this.LJ = C61359O6h.LJJJI.LLJJIII();
        }
        if (!TextUtils.isEmpty(this.LJ)) {
            sb.append("&update_version_code=");
            if (LIZ(this.LJ)) {
                this.LJ = C61359O6h.LJJJI.LLJJIII();
            }
            sb.append(android.net.Uri.encode(this.LJ));
        }
        if (LIZ(this.LIZJ)) {
            C61359O6h.LJJJI.getClass();
            this.LIZJ = "";
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            sb.append("&version_code=");
            if (LIZ(this.LIZJ)) {
                C61359O6h.LJJJI.getClass();
                this.LIZJ = "";
            }
            sb.append(android.net.Uri.encode(this.LIZJ));
        }
        if (LIZ(this.LIZLLL)) {
            this.LIZLLL = C61359O6h.LJJJI.LLJJIJIL();
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            sb.append("&version_name=");
            if (LIZ(this.LIZLLL)) {
                this.LIZLLL = C61359O6h.LJJJI.LLJJIJIL();
            }
            sb.append(android.net.Uri.encode(this.LIZLLL));
        }
        if (LIZ(this.LJI)) {
            this.LJI = C61359O6h.LJJJI.LLILL();
        }
        if (!TextUtils.isEmpty(this.LJI)) {
            sb.append("&manifest_version_code=");
            if (LIZ(this.LJI)) {
                this.LJI = C61359O6h.LJJJI.LLILL();
            }
            sb.append(android.net.Uri.encode(this.LJI));
        }
        if (LIZ(this.LJII)) {
            C61359O6h.LJJJI.getClass();
            this.LJII = "";
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            sb.append("&language=");
            if (LIZ(this.LJII)) {
                C61359O6h.LJJJI.getClass();
                this.LJII = "";
            }
            sb.append(android.net.Uri.encode(this.LJII));
        } else if (!C61359O6h.LJII().LJI) {
            sb.append("&language=zh");
        }
        if (LIZ(this.LJIIIIZZ)) {
            this.LJIIIIZZ = C61359O6h.LJJJI.LLILII();
        }
        if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
            sb.append("&iid=");
            if (LIZ(this.LJIIIIZZ)) {
                this.LJIIIIZZ = C61359O6h.LJJJI.LLILII();
            }
            sb.append(android.net.Uri.encode(this.LJIIIIZZ));
        }
        if (!TextUtils.isEmpty(LJ())) {
            sb.append("&device_id=");
            sb.append(android.net.Uri.encode(LJ()));
        }
        if (LIZ(this.LJIIJJI)) {
            this.LJIIJJI = C61359O6h.LJJJI.LLILLJJLI();
        }
        if (!TextUtils.isEmpty(this.LJIIJJI)) {
            sb.append("&openudid=");
            if (LIZ(this.LJIIJJI)) {
                this.LJIIJJI = C61359O6h.LJJJI.LLILLJJLI();
            }
            sb.append(android.net.Uri.encode(this.LJIIJJI));
        }
        if (LIZ(this.LJIIJ)) {
            C61359O6h.LJJJI.getClass();
            this.LJIIJ = "";
        }
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            sb.append("&uuid=");
            if (LIZ(this.LJIIJ)) {
                C61359O6h.LJJJI.getClass();
                this.LJIIJ = "";
            }
            sb.append(android.net.Uri.encode(this.LJIIJ));
        }
        if (this.LJIJI) {
            if (LIZ(this.LJIIL)) {
                this.LJIIL = C61359O6h.LJJJI.LLFII();
            }
            if (!TextUtils.isEmpty(this.LJIIL)) {
                sb.append("&ab_version=");
                if (LIZ(this.LJIIL)) {
                    this.LJIIL = C61359O6h.LJJJI.LLFII();
                }
                sb.append(android.net.Uri.encode(this.LJIIL));
            }
            if (LIZ(this.LJIILIIL)) {
                C61359O6h.LJJJI.getClass();
                this.LJIILIIL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILIIL)) {
                sb.append("&ab_client=");
                if (LIZ(this.LJIILIIL)) {
                    C61359O6h.LJJJI.getClass();
                    this.LJIILIIL = "";
                }
                sb.append(android.net.Uri.encode(this.LJIILIIL));
            }
            if (LIZ(this.LJIILJJIL)) {
                C61359O6h.LJJJI.getClass();
                this.LJIILJJIL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILJJIL)) {
                sb.append("&ab_group=");
                if (LIZ(this.LJIILJJIL)) {
                    C61359O6h.LJJJI.getClass();
                    this.LJIILJJIL = "";
                }
                sb.append(android.net.Uri.encode(this.LJIILJJIL));
            }
            if (LIZ(this.LJIILL)) {
                C61359O6h.LJJJI.getClass();
                this.LJIILL = "";
            }
            if (!TextUtils.isEmpty(this.LJIILL)) {
                sb.append("&ab_feature=");
                if (LIZ(this.LJIILL)) {
                    C61359O6h.LJJJI.getClass();
                    this.LJIILL = "";
                }
                sb.append(android.net.Uri.encode(this.LJIILL));
            }
        }
        return sb.toString();
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str) && C61359O6h.LJJJI != null) {
            return true;
        }
        return false;
    }
}

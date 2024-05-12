package X;

import android.webkit.WebViewClient;

/* renamed from: X.NtG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60778NtG extends OM2 {
    public final /* synthetic */ C60776NtE LJLIL;

    @Override // X.OM2
    public final boolean LIZIZ() {
        if (this.LJLIL.LJLJLLL == null) {
            return super.LIZIZ();
        }
        if (super.LIZIZ() && this.LJLIL.LJLJLLL.canGoBack()) {
            return true;
        }
        return false;
    }

    @Override // X.OM2
    public final void LJIJJ() {
        if (this.LJLIL.LJLJLLL == null) {
            super.LJIJJ();
        } else {
            if (this.LJLIL.LJLJLLL.LIZ()) {
                return;
            }
            super.LJIJJ();
        }
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60778NtG(C60776NtE c60776NtE) {
        this.LJLIL = c60776NtE;
    }

    @Override // X.OM2
    public final void LJJIFFI(String str) {
        C60776NtE c60776NtE = this.LJLIL;
        if (c60776NtE.LJLJLJ == null) {
            super.LJJIFFI(str);
            return;
        }
        if (c60776NtE.LJLJLLL == null) {
            synchronized (C60776NtE.class) {
                if (this.LJLIL.LJLJLLL == null) {
                    this.LJLIL.LJLJLLL = new C37057EgX(getExtendable(), this.LJLIL.LJLJLJ);
                }
            }
        } else {
            this.LJLIL.LJLJLLL.LIZIZ = this.LJLIL.LJLJLJ;
        }
        this.LJLIL.LJLJLLL.LJII();
        super.LJJIFFI(this.LJLIL.LJLJLLL.LJI(str));
    }

    @Override // X.OM2
    public final void LJJLL(WebViewClient webViewClient) {
        super.LJJLL(webViewClient);
    }

    @Override // X.OM2
    public final void LJJII(String str, java.util.Map<String, String> map) {
        C60776NtE c60776NtE = this.LJLIL;
        if (c60776NtE.LJLJLJ == null) {
            super.LJJII(str, map);
            return;
        }
        if (c60776NtE.LJLJLLL == null) {
            synchronized (C60776NtE.class) {
                if (this.LJLIL.LJLJLLL == null) {
                    this.LJLIL.LJLJLLL = new C37057EgX(getExtendable(), this.LJLIL.LJLJLJ);
                }
            }
        } else {
            this.LJLIL.LJLJLLL.LIZIZ = this.LJLIL.LJLJLJ;
        }
        this.LJLIL.LJLJLLL.LJII();
        super.LJJII(this.LJLIL.LJLJLLL.LJI(str), map);
    }
}

package X;

import android.webkit.WebViewClient;

/* renamed from: X.NrF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60653NrF extends OM2 {
    public final /* synthetic */ C60649NrB LJLIL;

    @Override // X.OM2
    public final void LJIJJ() {
        if (this.LJLIL.LJLJLLL == null) {
            super.LJIJJ();
        } else {
            this.LJLIL.LJLJLLL.LJI = true;
            super.LJIJJ();
        }
    }

    @Override // X.OM2
    public final void LJJLI() {
        if (!this.LJLIL.LJI(getExtendable().getUrl())) {
            super.LJJLI();
        } else {
            this.LJLIL.LJLJLLL.LIZ(getExtendable().getUrl());
            super.LJJLI();
        }
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60653NrF(C60649NrB c60649NrB) {
        this.LJLIL = c60649NrB;
    }

    @Override // X.OM2
    public final void LJJIFFI(String str) {
        if (!this.LJLIL.LJI(str)) {
            super.LJJIFFI(str);
        } else {
            this.LJLIL.LJLJLLL.LIZ(str);
            super.LJJIFFI(str);
        }
    }

    @Override // X.OM2
    public final void LJJLL(WebViewClient webViewClient) {
        super.LJJLL(webViewClient);
    }

    @Override // X.OM2
    public final void LJJII(String str, java.util.Map<String, String> map) {
        if (!this.LJLIL.LJI(str)) {
            super.LJJII(str, map);
        } else {
            this.LJLIL.LJLJLLL.LIZ(str);
            super.LJJII(str, map);
        }
    }
}

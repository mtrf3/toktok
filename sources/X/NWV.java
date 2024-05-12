package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes11.dex */
public class NWV implements InterfaceC59561NZd {
    public final Activity LJLIL;
    public final NZC LJLILLLLZI;
    public final NZX LJLJI;
    public final C59314NPq LJLJJI;
    public final C59484NWe LJLJJL = new C59484NWe(this);

    @Override // X.InterfaceC59561NZd
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILL(CharSequence charSequence, boolean z) {
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILLIIL() {
    }

    @Override // X.F10
    public final void LJIIZILJ(String str) {
    }

    @Override // X.InterfaceC59561NZd
    public final String getTitle() {
        return null;
    }

    @Override // X.InterfaceC59488NWi
    public final boolean LJIIJ() {
        return this.LJLILLLLZI.LJIIJ();
    }

    @Override // X.InterfaceC59488NWi
    public final void refresh() {
        this.LJLILLLLZI.refresh();
    }

    @Override // X.InterfaceC59561NZd
    public final NZX LJII() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC59561NZd
    public final NZC LJIIJJI() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC59488NWi
    public final Context getContext() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC59488NWi
    public final NTL getCrossPlatformBusiness() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC59488NWi
    public final C59314NPq getCrossPlatformParams() {
        return this.LJLJJI;
    }

    public NWV(Activity activity, NZQ nzq, NZX nzx, C59314NPq c59314NPq) {
        this.LJLIL = activity;
        this.LJLILLLLZI = nzq;
        this.LJLJI = nzx;
        this.LJLJJI = c59314NPq;
    }
}

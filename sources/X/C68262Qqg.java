package X;

/* renamed from: X.Qqg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68262Qqg extends YIR implements YIK {
    public final void LJIILIIL() {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        ((C68263Qqh) this.LJLILLLLZI).zzg = C84682XLi.LJLJJI;
    }

    public final void LJIILJJIL() {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        ((C68263Qqh) this.LJLILLLLZI).zzf = C84686XLm.LJLJJI;
    }

    public final void LJIILL() {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        ((C68263Qqh) this.LJLILLLLZI).zzh = C84682XLi.LJLJJI;
    }

    public final void LJIILLIIL() {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        ((C68263Qqh) this.LJLILLLLZI).zze = C84686XLm.LJLJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C68262Qqg() {
        /*
            r1 = this;
            X.Qqh r0 = X.C68263Qqh.LJIJJ()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68262Qqg.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C68262Qqg(int r2) {
        /*
            r1 = this;
            X.Qqh r0 = X.C68263Qqh.LJIJJ()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68262Qqg.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(Iterable iterable) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68263Qqh c68263Qqh = (C68263Qqh) this.LJLILLLLZI;
        InterfaceC68330Qrm interfaceC68330Qrm = c68263Qqh.zzf;
        if (!((AbstractC84676XLc) interfaceC68330Qrm).LJLIL) {
            c68263Qqh.zzf = YIN.LJIILIIL(interfaceC68330Qrm);
        }
        YIP.LJI(iterable, c68263Qqh.zzf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(Iterable iterable) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68263Qqh c68263Qqh = (C68263Qqh) this.LJLILLLLZI;
        InterfaceC68330Qrm interfaceC68330Qrm = c68263Qqh.zze;
        if (!((AbstractC84676XLc) interfaceC68330Qrm).LJLIL) {
            c68263Qqh.zze = YIN.LJIILIIL(interfaceC68330Qrm);
        }
        YIP.LJI(iterable, c68263Qqh.zze);
    }

    public final void LJIIZILJ(int i) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68263Qqh c68263Qqh = (C68263Qqh) this.LJLILLLLZI;
        c68263Qqh.LJJ();
        c68263Qqh.zzg.remove(i);
    }

    public final void LJIJ(int i) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68263Qqh c68263Qqh = (C68263Qqh) this.LJLILLLLZI;
        XM7 xm7 = c68263Qqh.zzh;
        if (!xm7.LIZIZ()) {
            c68263Qqh.zzh = YIN.LJIILJJIL(xm7);
        }
        c68263Qqh.zzh.remove(i);
    }
}

package X;

/* loaded from: classes13.dex */
public final class T06<T> extends AbstractC73672Svk<T> {
    public final AbstractC73169Snd<T> LJLIL;
    public final int LJLILLLLZI = 1;
    public T08 LJLJI;

    public T06(C73697Sw9 c73697Sw9) {
        this.LJLIL = c73697Sw9;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T08 t08;
        boolean z;
        synchronized (this) {
            t08 = this.LJLJI;
            if (t08 == null) {
                t08 = new T08(this);
                this.LJLJI = t08;
            }
            long j = t08.LJLILLLLZI + 1;
            t08.LJLILLLLZI = j;
            if (!t08.LJLJI && j == this.LJLILLLLZI) {
                z = true;
                t08.LJLJI = true;
            } else {
                z = false;
            }
        }
        this.LJLIL.LIZ(new T07(interfaceC116954iR, this, t08));
        if (z) {
            this.LJLIL.LJJZ(t08);
        }
    }

    public final void LJJZ(T08 t08) {
        synchronized (this) {
            T08 t082 = this.LJLJI;
            if (t082 != null && t082 == t08) {
                this.LJLJI = null;
                t08.getClass();
            }
            long j = t08.LJLILLLLZI - 1;
            t08.LJLILLLLZI = j;
            if (j == 0) {
                AbstractC73169Snd<T> abstractC73169Snd = this.LJLIL;
                if (abstractC73169Snd instanceof InterfaceC92693kP) {
                    ((InterfaceC92693kP) abstractC73169Snd).dispose();
                } else if (abstractC73169Snd instanceof T09) {
                    ((T09) abstractC73169Snd).LIZIZ(t08.get());
                }
            }
        }
    }

    public final void LJJZZI(T08 t08) {
        synchronized (this) {
            if (t08.LJLILLLLZI == 0 && t08 == this.LJLJI) {
                this.LJLJI = null;
                InterfaceC92693kP interfaceC92693kP = t08.get();
                EnumC73418Sre.dispose(t08);
                AbstractC73169Snd<T> abstractC73169Snd = this.LJLIL;
                if (abstractC73169Snd instanceof InterfaceC92693kP) {
                    ((InterfaceC92693kP) abstractC73169Snd).dispose();
                } else if (abstractC73169Snd instanceof T09) {
                    if (interfaceC92693kP == null) {
                        t08.LJLJJI = true;
                    } else {
                        ((T09) abstractC73169Snd).LIZIZ(interfaceC92693kP);
                    }
                }
            }
        }
    }
}

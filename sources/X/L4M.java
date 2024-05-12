package X;

import kotlin.jvm.internal.AqS62S1100000_9;

/* loaded from: classes10.dex */
public final class L4M implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ L4L LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ EnumC53663L4h LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<java.util.Map<L4T, L4W>, C76800UCe> LJLJJL;

    public L4M(boolean z, L4L l4l, Object obj, EnumC53663L4h enumC53663L4h, AqS62S1100000_9 aqS62S1100000_9) {
        this.LJLIL = z;
        this.LJLILLLLZI = l4l;
        this.LJLJI = obj;
        this.LJLJJI = enumC53663L4h;
        this.LJLJJL = aqS62S1100000_9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL) {
                this.LJLILLLLZI.LIZLLL();
            }
            this.LJLILLLLZI.LIZIZ(this.LJLJI, !this.LJLIL, this.LJLJJI);
            this.LJLJJL.invoke(this.LJLILLLLZI.LJII);
        } finally {
            if (LIZ) {
            }
        }
    }
}

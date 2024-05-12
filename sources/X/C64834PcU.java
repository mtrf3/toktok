package X;

/* renamed from: X.PcU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64834PcU extends AbstractRunnableC64836PcW {
    public final Runnable LJLJJI;
    public final EnumC64807Pc3 LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJJI != null && !this.LJLIL.get()) {
                this.LJLJJI.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC64849Pcj
    public final int LIZJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC64849Pcj
    public final EnumC64807Pc3 getPriority() {
        return this.LJLJJL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC64849Pcj interfaceC64849Pcj) {
        InterfaceC64849Pcj interfaceC64849Pcj2 = interfaceC64849Pcj;
        EnumC64807Pc3 enumC64807Pc3 = this.LJLJJL;
        EnumC64807Pc3 priority = interfaceC64849Pcj2.getPriority();
        if (enumC64807Pc3 == null) {
            enumC64807Pc3 = EnumC64807Pc3.NORMAL;
        }
        if (priority == null) {
            priority = EnumC64807Pc3.NORMAL;
        }
        if (enumC64807Pc3 == priority) {
            return this.LJLJI - interfaceC64849Pcj2.LIZJ();
        }
        return priority.ordinal() - enumC64807Pc3.ordinal();
    }

    public C64834PcU(String str, EnumC64807Pc3 enumC64807Pc3, int i, Runnable runnable) {
        this.LJLJJL = enumC64807Pc3;
        if (C38354F3m.LJ(str)) {
            C16880lQ.LJLLJ(C64834PcU.class);
        }
        this.LJLILLLLZI = i;
        this.LJLJJI = runnable;
    }
}

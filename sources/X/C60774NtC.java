package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NtC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60774NtC extends AbstractC60787NtP {
    public final /* synthetic */ C59788NdI LIZ;

    public C60774NtC(C59788NdI c59788NdI) {
        this.LIZ = c59788NdI;
    }

    @Override // X.AbstractC60787NtP
    public final void LIZ(EnumC61423O8t entry_mode) {
        String str;
        o.LJIIIZ(entry_mode, "entry_mode");
        int i = C61422O8s.LIZ[entry_mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    str = "title";
                }
            } else {
                str = "url";
            }
        } else {
            str = "lock_icon";
        }
        InterfaceC60770Nt8 interfaceC60770Nt8 = (InterfaceC60770Nt8) this.LIZ.LIZ.LIZIZ(InterfaceC60770Nt8.class);
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.LJIILIIL(str);
        }
    }

    @Override // X.AbstractC60787NtP
    public final void LIZIZ(EnumC61424O8u exit_mode, long j) {
        String str;
        o.LJIIIZ(exit_mode, "exit_mode");
        int i = C61422O8s.LIZIZ[exit_mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "other_area";
            }
        } else {
            str = "exit_button";
        }
        InterfaceC60770Nt8 interfaceC60770Nt8 = (InterfaceC60770Nt8) this.LIZ.LIZ.LIZIZ(InterfaceC60770Nt8.class);
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.LJIIJJI(j, str);
        }
    }

    @Override // X.AbstractC60787NtP
    public final void LIZJ(EnumC60885Nuz type, String title, long j) {
        o.LJIIIZ(type, "type");
        String str = "title";
        o.LJIIIZ(title, "title");
        InterfaceC60770Nt8 interfaceC60770Nt8 = (InterfaceC60770Nt8) this.LIZ.LIZ.LIZIZ(InterfaceC60770Nt8.class);
        if (interfaceC60770Nt8 != null) {
            Long valueOf = Long.valueOf(j);
            if (type == EnumC60885Nuz.URL) {
                str = "url";
            }
            interfaceC60770Nt8.LJIIIIZZ(valueOf, str);
        }
    }
}

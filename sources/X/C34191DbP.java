package X;

/* renamed from: X.DbP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34191DbP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34191DbP LJLIL = new C34191DbP();

    public C34191DbP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!DPI.LIZ() ? (C34195DbT.LIZJ() & 1) != 1 : !C35478DwA.LIZIZ() || !DS1.LIZ()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

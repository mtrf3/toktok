package X;

/* renamed from: X.MwQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58426MwQ extends AbstractC65781Prl implements InterfaceC65784Pro<C58697N1x> {
    public static final C58426MwQ LJLIL = new C58426MwQ();

    public C58426MwQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C58697N1x invoke() {
        EnumC58694N1u enumC58694N1u;
        if (!((Boolean) C58424MwO.LJ.getValue()).booleanValue()) {
            return null;
        }
        int intValue = ((Number) C58424MwO.LIZLLL.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return null;
            }
            enumC58694N1u = EnumC58694N1u.OMIT_ON_DESTROY;
        } else {
            enumC58694N1u = EnumC58694N1u.ALL_EVENT;
        }
        if (enumC58694N1u == null) {
            return null;
        }
        return new C58697N1x(enumC58694N1u);
    }
}

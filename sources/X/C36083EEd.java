package X;

/* renamed from: X.EEd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36083EEd implements InterfaceC36085EEf {
    public final InterfaceC36085EEf LIZ;

    public C36083EEd(C36084EEe c36084EEe) {
        this.LIZ = c36084EEe;
    }

    @Override // X.InterfaceC36085EEf
    public final String LIZ(String str, EnumC43590H8w enumC43590H8w, EnumC43590H8w enumC43590H8w2) {
        if (str == null || str.length() <= 5000) {
            return this.LIZ.LIZ(str, enumC43590H8w, enumC43590H8w2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is ");
        LIZ.append(str.length());
        LIZ.append("!");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}

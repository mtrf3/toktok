package X;

/* renamed from: X.1fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38801fg implements InterfaceC271214q {
    public final String LIZ;
    public final EnumC271714v LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MergePaths{mode=");
        LIZ.append(this.LIZIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C38801fg(String str, EnumC271714v enumC271714v) {
        this.LIZ = str;
        this.LIZIZ = enumC271714v;
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        if (!c04740Go.LJLLJ) {
            C0GR.LIZIZ("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C43651nV(this);
    }
}

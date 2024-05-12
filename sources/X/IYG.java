package X;

/* loaded from: classes9.dex */
public class IYG implements IY4 {
    @Override // X.IY4
    public final boolean LIZ() {
        return false;
    }

    @Override // X.IY4
    public final String getName() {
        return "DefaultVideoUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        String[] strArr = iy5.LIZJ.LIZJ;
        if (strArr.length == 0) {
            return null;
        }
        return new IY0(strArr[0], this);
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        String[] strArr = iy5.LIZIZ.LIZJ;
        if (strArr.length == 0) {
            return null;
        }
        return new IY0(strArr[0], this);
    }
}

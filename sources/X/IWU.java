package X;

/* loaded from: classes9.dex */
public final class IWU implements InterfaceC197017oH {
    public final I90 LIZ;

    public final boolean LIZ() {
        I90 i90 = this.LIZ;
        if (i90 != null && ((C46751IWl) i90).LIZ.isPaused()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC197017oH
    public final boolean isPlaying() {
        I90 i90 = this.LIZ;
        if (i90 != null && ((C46751IWl) i90).LIZ()) {
            return true;
        }
        return false;
    }

    public IWU(I90 i90) {
        this.LIZ = i90;
    }
}

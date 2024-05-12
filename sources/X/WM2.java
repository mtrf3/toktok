package X;

/* loaded from: classes15.dex */
public final class WM2 implements InterfaceC133865Ne {
    public final /* synthetic */ ViewOnTouchListenerC82148WLw LIZ;

    public WM2(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw) {
        this.LIZ = viewOnTouchListenerC82148WLw;
    }

    @Override // X.InterfaceC133865Ne
    public final void LIZ(int i) {
        InterfaceC153045zY value;
        if (i == 0 && (value = this.LIZ.getEditPreviewApi().Kh().getValue()) != null) {
            value.play();
        }
    }
}

package X;

/* renamed from: X.YSi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87412YSi implements InterfaceC47896Iqy {
    public final /* synthetic */ YSI LJLIL;

    public C87412YSi(YSI ysi) {
        this.LJLIL = ysi;
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        YSR ysr = (YSR) this.LJLIL.LJLILLLLZI;
        if (ysr != null) {
            ysr.responseSeekComplete(z);
        }
    }
}

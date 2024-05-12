package X;

/* renamed from: X.Gon, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42665Gon implements InterfaceC42667Gop<WM7> {
    public int LIZ;

    public C42665Gon(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC42667Gop
    public final boolean LIZ(WM7 wm7) {
        int i = this.LIZ;
        if (i <= 0) {
            return false;
        }
        this.LIZ = i - 1;
        return true;
    }
}

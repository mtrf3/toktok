package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.NtD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60775NtD extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final C60779NtH LJLLI = new C60779NtH(this);
    public C37735ErT LJLLILLLL;

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        C60631Nqt.LIZ(((C60640Nr2) LIZ()).getExtendableWebViewClient(), new C60783NtL(this));
        C60631Nqt.LIZ(((C60640Nr2) LIZ()).getExtendableWebChromeClient(), new C60725NsP(this));
        LJ("loadUrl", this.LJLLI, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Nr9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60647Nr9 extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public final AtomicBoolean LJLJL = new AtomicBoolean(false);
    public final C60654NrG LJLJLJ = new C60654NrG(this);
    public final C60427Nnb LJLJLLL = new C60427Nnb(this);
    public final C60534NpK LJLL = new C60534NpK(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        this.LJLJI = "basic";
        LJ("loadUrl", this.LJLJLJ, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("reload", this.LJLJLJ, LiveCenterDelayLoadSetting.DEFAULT);
        C60640Nr2 extendable = (C60640Nr2) LIZ();
        o.LJFF(extendable, "extendable");
        C60631Nqt.LIZ(extendable.getExtendableWebViewClient(), this.LJLJLLL);
        C60640Nr2 extendable2 = (C60640Nr2) LIZ();
        o.LJFF(extendable2, "extendable");
        C60631Nqt.LIZ(extendable2.getExtendableWebChromeClient(), this.LJLL);
    }
}

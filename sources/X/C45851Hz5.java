package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Hz5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45851Hz5 implements InterfaceC45856HzA {
    public final /* synthetic */ C45849Hz3 LJLIL;

    public C45851Hz5(C45849Hz3 c45849Hz3) {
        this.LJLIL = c45849Hz3;
    }

    @Override // X.InterfaceC45856HzA
    public final void LLILLJJLI(WM7 wm7, WM7 wm72, boolean z) {
        if (z) {
            if (wm72 instanceof WKD) {
                C76917UGr.LJLIL = true;
                this.LJLIL.findViewById(R.id.irq).setVisibility(8);
                this.LJLIL.LJLJJI.setVisibility(8);
                C76917UGr.LJLIL = false;
                return;
            }
            return;
        }
        if (!(wm7 instanceof WKD)) {
            return;
        }
        C76917UGr.LJLIL = true;
        this.LJLIL.LJLJJI.setVisibility(0);
        this.LJLIL.findViewById(R.id.irq).setVisibility(0);
        C76917UGr.LJLIL = false;
    }
}

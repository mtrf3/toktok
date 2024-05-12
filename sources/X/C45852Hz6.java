package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Hz6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45852Hz6 implements InterfaceC45856HzA {
    public final /* synthetic */ C45848Hz2 LJLIL;

    public C45852Hz6(C45848Hz2 c45848Hz2) {
        this.LJLIL = c45848Hz2;
    }

    @Override // X.InterfaceC45856HzA
    public final void LLILLJJLI(WM7 wm7, WM7 wm72, boolean z) {
        if (z) {
            if (wm72 instanceof WKE) {
                C76917UGr.LJLIL = true;
                this.LJLIL.findViewById(R.id.irq).setVisibility(8);
                this.LJLIL.LJLJJL.setVisibility(8);
                C76917UGr.LJLIL = false;
                return;
            }
            return;
        }
        if (!(wm7 instanceof WKE)) {
            return;
        }
        C76917UGr.LJLIL = true;
        this.LJLIL.LJLJJL.setVisibility(0);
        this.LJLIL.findViewById(R.id.irq).setVisibility(0);
        C76917UGr.LJLIL = false;
    }
}

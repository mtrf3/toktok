package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.BPb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28723BPb implements InterfaceC28722BPa {
    public final /* synthetic */ C28724BPc LIZ;
    public final /* synthetic */ View LIZIZ;

    public C28723BPb(C28724BPc c28724BPc, View view) {
        this.LIZ = c28724BPc;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC28722BPa
    public final void LIZ(C28725BPd buttonView, boolean z) {
        o.LJIIIZ(buttonView, "buttonView");
        InterfaceC28722BPa onCheckChangeListener = this.LIZ.getOnCheckChangeListener();
        if (onCheckChangeListener != null) {
            onCheckChangeListener.LIZ(buttonView, z);
        }
        if (z) {
            C28725BPd lastCheckedButton = this.LIZ.getLastCheckedButton();
            if (lastCheckedButton != null) {
                lastCheckedButton.setChecked(false);
            }
            this.LIZ.setLastCheckedButton((C28725BPd) this.LIZIZ);
        }
    }
}

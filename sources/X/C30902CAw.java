package X;

import android.view.View;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;

/* renamed from: X.CAw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30902CAw extends C30891CAl {
    public final /* synthetic */ PopupContainerFragment LIZ;

    public C30902CAw(PopupContainerFragment popupContainerFragment) {
        this.LIZ = popupContainerFragment;
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            this.LIZ.dismissAllowingStateLoss();
        }
    }
}

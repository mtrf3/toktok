package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$behavior$1;
import kotlin.jvm.internal.o;

/* renamed from: X.NoJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60471NoJ extends AbstractC26257ASf {
    public final /* synthetic */ C60469NoH LIZ;
    public final /* synthetic */ AdBottomSheetContainer$behavior$1 LIZIZ;

    public C60471NoJ(C60469NoH c60469NoH, AdBottomSheetContainer$behavior$1 adBottomSheetContainer$behavior$1) {
        this.LIZ = c60469NoH;
        this.LIZIZ = adBottomSheetContainer$behavior$1;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        InterfaceC60473NoL callback = this.LIZ.getCallback();
        if (callback != null) {
            callback.LIZ();
        }
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        InterfaceC60473NoL callback;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i != 1) {
            if (i != 3) {
                if (i != 4 || (callback = this.LIZ.getCallback()) == null) {
                    return;
                }
                callback.LIZLLL();
                return;
            }
            InterfaceC60473NoL callback2 = this.LIZ.getCallback();
            if (callback2 == null) {
                return;
            }
            callback2.LIZIZ();
            return;
        }
        if (!this.LIZ.getHideable()) {
            setState(3);
        }
        InterfaceC60473NoL callback3 = this.LIZ.getCallback();
        if (callback3 == null) {
            return;
        }
        callback3.LIZJ();
    }
}

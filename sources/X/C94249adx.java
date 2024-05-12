package X;

import android.view.View;
import com.ugc.effectcreator.foundation.view.BottomDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.adx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94249adx extends AbstractC26257ASf {
    public final /* synthetic */ BottomDialog LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public C94249adx(BottomDialog bottomDialog) {
        this.LIZ = bottomDialog;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        this.LIZ.Al(i);
    }
}

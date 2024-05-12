package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.o;

/* renamed from: X.a8D, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92281a8D implements InterfaceC91780a08 {
    @Override // X.InterfaceC91780a08
    public final void LIZ(View view, ParcelableSnapshotMutableState parcelableSnapshotMutableState, String str, AbstractC92319a8p abstractC92319a8p, int i) {
        o.LJIIIZ(view, "view");
        ViewGroup LIZ = C92116a5Y.LIZ(view);
        Context context = LIZ.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(C1DJ.LJFF(new C92967aJH(parcelableSnapshotMutableState, str, LIZ, composeView), -985537931, true));
        LIZ.addView(composeView);
    }
}

package X;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3G5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G5 extends View {
    public final List<WeakReference<C3G4>> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3G5(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = new ArrayList();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Iterator<WeakReference<C3G4>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C3G4 c3g4 = it.next().get();
            if (c3g4 != null) {
                c3g4.LJIIIZ();
            }
        }
    }
}

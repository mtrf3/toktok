package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;

/* renamed from: X.96X, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C96X extends FrameLayout {
    public boolean LJLIL;

    @Override // android.view.View
    public final boolean isSelected() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96X(Context context) {
        super(context);
        new LinkedHashMap();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.LJLIL = z;
    }
}

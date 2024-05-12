package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.SbW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72418SbW extends RecyclerView implements C02Q {
    @Override // X.C02Q
    public final void LIZ(C281318n c281318n) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public C72418SbW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}

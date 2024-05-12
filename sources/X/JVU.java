package X;

import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class JVU extends C1AH {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final java.util.Map<Integer, View> getViewCache() {
        return (java.util.Map) this.LJLILLLLZI.getValue();
    }

    public final View LJ(int i) {
        View view = getViewCache().get(Integer.valueOf(i));
        if (view == null) {
            view = this.LJLIL.findViewById(i);
            if (view != null) {
                getViewCache().put(Integer.valueOf(i), view);
            } else {
                view = null;
            }
        }
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVU(Context context, View view) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = C221108m2.LIZIZ(C49269JVh.LJLIL);
    }
}

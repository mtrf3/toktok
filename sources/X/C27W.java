package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.27W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27W extends AbstractC65781Prl implements InterfaceC88472Yns<View, InterfaceC36571c5> {
    public static final C27W LJLIL = new C27W();

    public C27W() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1c5, java.lang.Object] */
    @Override // X.InterfaceC88472Yns
    public final InterfaceC36571c5 invoke(View view) {
        View view2 = view;
        o.LJIIIZ(view2, "view");
        ?? tag = view2.getTag(R.id.ncl);
        if (tag instanceof InterfaceC36571c5) {
            return tag;
        }
        return null;
    }
}

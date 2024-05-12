package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57821Mmf extends AbstractC65781Prl implements InterfaceC88471Ynr<Rect, View, TouchDelegate> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57821Mmf(int i) {
        super(2);
        this.LJLIL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final TouchDelegate invoke(Rect rect, View view) {
        Rect rect2 = rect;
        View view2 = view;
        o.LJIIIZ(rect2, "rect");
        o.LJIIIZ(view2, "view");
        int i = rect2.left;
        int i2 = this.LJLIL;
        rect2.left = i - i2;
        rect2.top -= i2;
        rect2.right += i2;
        rect2.bottom += i2;
        return new TouchDelegate(rect2, view2);
    }
}

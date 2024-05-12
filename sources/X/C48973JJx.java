package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.JJx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48973JJx extends FrameLayout implements InterfaceC78213Umn {
    public final Context LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48973JJx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = context;
    }

    @Override // X.InterfaceC78213Umn
    public final View LIZ(int i, int i2, InterfaceC48974JJy interfaceC48974JJy) {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getId() == i) {
                    return childAt;
                }
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        Context context = this.LJLIL;
        if (context != null) {
            View create = interfaceC48974JJy.create(context);
            create.setId(i);
            addView(create, i2, new FrameLayout.LayoutParams(-1, -1));
            return create;
        }
        o.LJIJI("mContext");
        throw null;
    }
}

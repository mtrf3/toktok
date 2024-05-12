package X;

import android.content.Context;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.74l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1799574l extends C74S<C1796273e> {
    public final C7EX LJLIL;
    public final WeakReference<InterfaceC1799774n> LJLILLLLZI;

    public C1799574l(C7EX c7ex, InterfaceC1799774n interfaceC1799774n) {
        super(c7ex);
        this.LJLIL = c7ex;
        this.LJLILLLLZI = new WeakReference<>(interfaceC1799774n);
    }

    @Override // X.C74S
    public final void L(Context context, C1796273e c1796273e) {
        CommentStruct commentStruct = c1796273e.LJ;
        if (commentStruct != null) {
            this.LJLIL.setData(commentStruct);
        }
        Rect rect = c1796273e.LJFF;
        C7EX view = this.LJLIL;
        o.LJIIIZ(view, "view");
        if (rect != null) {
            int i = rect.top;
            if (i < 0) {
                i = view.getPaddingTop();
            }
            int i2 = rect.bottom;
            if (i2 < 0) {
                i2 = view.getPaddingBottom();
            }
            int i3 = rect.left;
            if (i3 < 0) {
                i3 = view.getPaddingStart();
            }
            int i4 = rect.right;
            if (i4 < 0) {
                i4 = view.getPaddingEnd();
            }
            view.setPaddingRelative(i3, i, i4, i2);
        }
        if (this.LJLILLLLZI.get() != null) {
            this.LJLIL.setOnInternalEventListener(this.LJLILLLLZI.get());
        }
    }
}

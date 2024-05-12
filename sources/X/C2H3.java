package X;

import android.content.res.TypedArray;
import android.view.View;

/* renamed from: X.2H3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H3 extends AbstractC534928b<View> implements AnonymousClass132, AnonymousClass133 {
    public final C28I LJLILLLLZI;

    @Override // X.AnonymousClass133
    public final boolean LJII() {
        return this.LJLIL.isPressed();
    }

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return this.LJLILLLLZI.LLLLLLL();
    }

    @Override // X.AnonymousClass133
    public final int getHeight() {
        return this.LJLIL.getHeight();
    }

    @Override // X.AnonymousClass133
    public final int getWidth() {
        return this.LJLIL.getWidth();
    }

    @Override // X.AnonymousClass133
    public final void invalidate() {
        this.LJLIL.invalidate();
    }

    @Override // X.AnonymousClass133
    public final boolean isEnabled() {
        return this.LJLIL.isEnabled();
    }

    public C2H3(View view) {
        super(view);
        this.LJLILLLLZI = new C28I(this);
    }

    @Override // X.AbstractC534928b
    public final void LLLLZIL(TypedArray typedArray) {
        this.LJLILLLLZI.LLLLZ(this.LJLIL.getContext(), typedArray);
    }
}

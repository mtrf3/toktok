package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.28H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28H extends QXX implements AnonymousClass132, AnonymousClass133 {
    public static final int[] LJLJJL = {-16842910};
    public static final int[] LJLJJLL = {R.attr.state_pressed};
    public final Drawable LJLIL;
    public final C28I LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return this.LJLILLLLZI.LLLLLLL();
    }

    @Override // X.AnonymousClass133
    public final int getHeight() {
        return this.LJLIL.getBounds().height();
    }

    @Override // X.AnonymousClass133
    public final int getWidth() {
        return this.LJLIL.getBounds().width();
    }

    @Override // X.AnonymousClass133
    public final void invalidate() {
        this.LJLIL.invalidateSelf();
    }

    @Override // X.AnonymousClass133
    public final boolean LJII() {
        return this.LJLJJI;
    }

    @Override // X.AnonymousClass133
    public final boolean isEnabled() {
        return this.LJLJI;
    }

    public C28H(Drawable drawable) {
        super((Object) null);
        this.LJLJI = true;
        this.LJLIL = drawable;
        this.LJLILLLLZI = new C28I(this);
    }

    public final void LLLLZ(Context context, TypedArray typedArray) {
        this.LJLILLLLZI.LLLLZ(context, typedArray);
    }
}

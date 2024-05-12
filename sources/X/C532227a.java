package X;

import X.InterfaceC04540Fu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: X.27a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532227a<T extends Drawable & InterfaceC04540Fu> extends QXX implements InterfaceC36821cU, InterfaceC36811cT {
    public final C532327b LJLIL;
    public final T LJLILLLLZI;

    @Override // X.InterfaceC24200xE
    public final boolean LJJIJLIJ() {
        this.LJLILLLLZI.LIZ();
        return false;
    }

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return this.LJLIL.LLLLLLL();
    }

    @Override // X.InterfaceC24210xF
    public final int[] getGradientColors() {
        return this.LJLIL.getGradientColors();
    }

    @Override // X.InterfaceC24210xF
    public final float[] getGradientPositions() {
        return this.LJLIL.getGradientPositions();
    }

    @Override // X.InterfaceC36811cT
    public final int[] getState() {
        return this.LJLILLLLZI.getState();
    }

    @Override // X.InterfaceC24200xE
    public final void invalidate() {
        this.LJLILLLLZI.invalidateSelf();
    }

    public C532227a(T t) {
        super((Object) null);
        this.LJLILLLLZI = t;
        this.LJLIL = new C532327b(this);
    }

    @Override // X.InterfaceC24210xF
    public final void LJIJJLI(float[] fArr, int[] iArr) {
        this.LJLIL.LJIJJLI(fArr, iArr);
    }

    public final void LLLLZ(Context context, TypedArray typedArray) {
        this.LJLIL.LLLLZ(context, typedArray);
    }
}

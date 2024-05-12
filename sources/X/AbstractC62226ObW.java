package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.ObW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62226ObW extends AbstractC62223ObT {
    public final InterfaceC62225ObV LJLIL;

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public boolean LJIILJJIL() {
        return this.LJLIL.LJIILJJIL();
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final float LJIILLIIL() {
        return this.LJLIL.LJIILLIIL();
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return this.LJLIL.key();
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return this.LJLIL.label();
    }

    public AbstractC62226ObW(InterfaceC62225ObV interfaceC62225ObV) {
        this.LJLIL = interfaceC62225ObV;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        return this.LJLIL.LIZJ(context);
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return this.LJLIL.LIZLLL(context);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return this.LJLIL.LIZ(context, content);
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final void LJ(C119604mi imageView, boolean z) {
        o.LJIIIZ(imageView, "imageView");
        this.LJLIL.LJ(imageView, z);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return this.LJLIL.LJI(content, context, interfaceC62573Oh7);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return this.LJLIL.LJII(content, context, interfaceC62573Oh7);
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return this.LJLIL.LJIILIIL(content, context, interfaceC62573Oh7);
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return this.LJLIL.LJIJ(content, context, interfaceC62573Oh7);
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.VrB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81033VrB extends C80627Vkd implements InterfaceC81034VrC {
    public Drawable LJLJJL;
    public InterfaceC81035VrD LJLJJLL;

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    public C81033VrB(Drawable drawable) {
        super(drawable);
    }

    @Override // X.InterfaceC81034VrC
    public final void LJI(InterfaceC81035VrD interfaceC81035VrD) {
        this.LJLJJLL = interfaceC81035VrD;
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!isVisible()) {
            return;
        }
        InterfaceC81035VrD interfaceC81035VrD = this.LJLJJLL;
        if (interfaceC81035VrD != null) {
            C81250Vug c81250Vug = (C81250Vug) interfaceC81035VrD;
            if (!c81250Vug.LIZ) {
                W58.LJIIZILJ(C81249Vuf.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(c81250Vug)), Integer.valueOf(System.identityHashCode(c81250Vug.LJ)), c81250Vug.toString());
                c81250Vug.LIZIZ = true;
                c81250Vug.LIZJ = true;
                c81250Vug.LIZIZ();
            }
        }
        super.draw(canvas);
        Drawable drawable = this.LJLJJL;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.LJLJJL.draw(canvas);
        }
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        EnumC81251Vuh enumC81251Vuh;
        InterfaceC81035VrD interfaceC81035VrD = this.LJLJJLL;
        if (interfaceC81035VrD != null) {
            C81250Vug c81250Vug = (C81250Vug) interfaceC81035VrD;
            if (c81250Vug.LIZJ != z) {
                C81249Vuf c81249Vuf = c81250Vug.LJFF;
                if (z) {
                    enumC81251Vuh = EnumC81251Vuh.ON_DRAWABLE_SHOW;
                } else {
                    enumC81251Vuh = EnumC81251Vuh.ON_DRAWABLE_HIDE;
                }
                c81249Vuf.LIZ(enumC81251Vuh);
                c81250Vug.LIZJ = z;
                c81250Vug.LIZIZ();
            }
        }
        return super.setVisible(z, z2);
    }
}

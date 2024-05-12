package X;

import android.content.Context;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WGu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82016WGu {
    public final InterfaceC82018WGw LIZ;
    public final GestureDetectorOnDoubleTapListenerC82020WGy LIZIZ;
    public final C82019WGx LIZJ;
    public final GestureDetectorOnGestureListenerC82017WGv LIZLLL;
    public final C82021WGz LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    public C82016WGu(Context context, C82012WGq c82012WGq) {
        o.LJIIIZ(context, "context");
        this.LIZ = c82012WGq;
        this.LIZIZ = new GestureDetectorOnDoubleTapListenerC82020WGy(this);
        this.LIZJ = new C82019WGx(this);
        this.LIZLLL = new GestureDetectorOnGestureListenerC82017WGv(this);
        this.LJ = new C82021WGz(this);
        this.LJFF = C221108m2.LIZIZ(new AqS161S0200000_14(context, this, 78));
        this.LJI = C221108m2.LIZIZ(new AqS161S0200000_14(context, this, 79));
        this.LJII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 504));
    }
}

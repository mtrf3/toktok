package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160246Qq implements C6SE {
    public final Context LIZ;
    public final C159816Oz LIZIZ;
    public final LifecycleOwner LIZJ;
    public XKQ LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIIL() {
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public C160246Qq(Context context, C159816Oz stickerConfig, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stickerConfig;
        this.LIZJ = lifecycleOwner;
        this.LJ = C221108m2.LIZIZ(C160276Qt.LJLIL);
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 912));
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        C159636Oh c159636Oh;
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        this.LJFF.getValue();
        Iterator<C159636Oh> it = this.LIZIZ.LJLJJL.iterator();
        while (true) {
            if (it.hasNext()) {
                c159636Oh = it.next();
                if (c159636Oh.LJLIL == stickerType) {
                    break;
                }
            } else {
                c159636Oh = null;
                break;
            }
        }
        C159636Oh c159636Oh2 = c159636Oh;
        if (c159636Oh2 == null) {
            c159636Oh2 = new C159636Oh((EnumC157656Gr) null, 0, false, false, false, false, false, (List) null, false, (String) null, (OSZ) null, false, false, false, false, false, 131071);
        }
        if (c159636Oh2.LJLL.length() > 0) {
            ((C1NS) this.LJ.getValue()).LJ(new AqS168S0100000_2(c159636Oh2, 559));
        }
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LIZLLL = XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C160256Qr(this, null), 3);
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZLLL(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJJ(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }

    @Override // X.C6SE
    public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }
}

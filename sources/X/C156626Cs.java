package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156626Cs extends C156426By {
    public final C82622Wbi LLIIIZ;
    public final C156636Ct LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public InterfaceC156676Cx LLIIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    private final C63L getLocationStickerApi() {
        return (C63L) this.LLIIJLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6Cu] */
    @Override // X.C156426By
    public final C6DA LIZLLL() {
        return new C89458Z9a(this, new C6BP(this), new InterfaceC89459Z9b() { // from class: X.6Cu
            @Override // X.InterfaceC89459Z9b
            public final void LIZ() {
                C156626Cs.this.LLIIJI.LJJJJL(null);
                InterfaceC156676Cx interfaceC156676Cx = C156626Cs.this.LLIIL;
                if (interfaceC156676Cx != null) {
                    interfaceC156676Cx.LIZ();
                }
                C156626Cs c156626Cs = C156626Cs.this;
                Runnable runnable = c156626Cs.LJLZ;
                if (runnable != null) {
                    c156626Cs.LJLJJLL.removeCallbacks(runnable);
                }
                c156626Cs.LJLJJLL.postDelayed(c156626Cs.LJLZ, 3000L);
            }

            @Override // X.InterfaceC89459Z9b
            public final void LIZIZ() {
                InterfaceC156676Cx interfaceC156676Cx = C156626Cs.this.LLIIL;
                if (interfaceC156676Cx != null) {
                    interfaceC156676Cx.LIZIZ();
                }
            }
        });
    }

    @Override // X.C156426By
    public final boolean LJII() {
        if (this.LLIIJI.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C156426By
    public final void LJIILIIL() {
        if (this.LLIIJI.LJJJJ()) {
            post(new ARunnableS38S0100000_2(this, 200));
        }
    }

    @Override // X.C156426By
    public final void LJIILL() {
        this.LLIIJI.setVisibility(0);
    }

    @Override // X.C156426By
    public float getEndTime() {
        return this.LLIIJI.LJJJZ(0);
    }

    @Override // X.C156426By
    public float getStartTime() {
        return this.LLIIJI.LJJII(0);
    }

    public final int getStickerType$tools_camera_edit_release() {
        return this.LLIIJI.getStickerType$tools_camera_edit_release();
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        return getLocationStickerApi().LJIIIIZZ();
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIJI;
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ) {
            this.LLIIJI.setTouching$tools_camera_edit_release(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        LJIJJLI();
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        this.LLIIJI.setTouching$tools_camera_edit_release(false);
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LLIIJI.setAlpha(f);
    }

    public final void setController$tools_camera_edit_release(C156526Ci controller) {
        o.LJIIIZ(controller, "controller");
        this.LLIIJI.setStickerController(controller);
    }

    public final void setEditLocationListener$tools_camera_edit_release(InterfaceC156676Cx editLocationListener) {
        o.LJIIIZ(editLocationListener, "editLocationListener");
        this.LLIIL = editLocationListener;
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        this.LLIIJI.setPlayPosition(j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156626Cs(Context context, C82622Wbi c82622Wbi) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LLIIIZ = c82622Wbi;
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1037));
        this.LJLIL = context;
        C16880lQ.LLLZIIL(R.layout.ccg, C16880lQ.LLZIL(context), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
        View findViewById = findViewById(R.id.ceu);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.donation_sticker_view)");
        this.LLIIJI = (C156636Ct) findViewById;
        setVisibility(8);
        this.LLFF = 0.8f;
    }
}

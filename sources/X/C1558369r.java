package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.69r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1558369r extends C156426By {
    public final C1558469s LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public boolean LLIIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    private final EditNatureStickerViewModel getNatureStickerViewModel() {
        return (EditNatureStickerViewModel) this.LLIIJI.getValue();
    }

    private final AbstractC42651GoZ getRootScene() {
        return (AbstractC42651GoZ) this.LLIIJLIL.getValue();
    }

    @Override // X.C156426By
    public final C6DA LIZLLL() {
        return new Z9Z(this, new C6BP(this));
    }

    @Override // X.C156426By
    public final boolean LJII() {
        if (this.LLIIIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        if (!this.LLIIL) {
            return false;
        }
        return getNatureStickerViewModel().Hv0(getRootScene()).getInTimeEditView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (4 == r7.getVisibility()) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r9 = this;
            X.69s r7 = r9.LLIIIZ
            X.69u r0 = r7.LJLJJL
            r6 = 0
            if (r0 == 0) goto L4b
            X.69p r0 = r7.getStickerController()
            boolean r0 = r0.LJIL()
            if (r0 != 0) goto L4b
            boolean r0 = r7.LJLJI
            if (r0 != 0) goto L4b
            boolean r0 = r7.LIZ()
            r8 = 1
            r2 = r0 ^ 1
            X.69u r5 = r7.LJLJJL
            if (r5 == 0) goto L33
            if (r2 != 0) goto L32
            long r3 = r7.LJLIL
            int r0 = r5.LJLILLLLZI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4c
            int r0 = r5.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4c
        L32:
            r2 = 1
        L33:
            r1 = 4
            if (r2 == 0) goto L4d
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L4d
        L3c:
            X.C162696a1.LJ(r6, r7)
            if (r8 == 0) goto L4b
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 205(0xcd, float:2.87E-43)
            r1.<init>(r9, r0)
            r9.post(r1)
        L4b:
            return
        L4c:
            r2 = 0
        L4d:
            r8 = 0
            if (r2 == 0) goto L51
            goto L3c
        L51:
            r6 = 4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1558369r.LJIILIIL():void");
    }

    @Override // X.C156426By
    public final void LJIILL() {
        this.LLIIIZ.setVisibility(0);
    }

    @Override // X.C156426By
    public float getEndTime() {
        return this.LLIIIZ.LJJJZ(0);
    }

    @Override // X.C156426By
    public float getStartTime() {
        return this.LLIIIZ.LJJII(0);
    }

    @Override // X.C156426By, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIIL = true;
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558369r(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LLIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1063));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1064));
        this.LJLIL = context;
        C16880lQ.LLLZIIL(R.layout.ccj, C16880lQ.LLZIL(context), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
        View findViewById = findViewById(R.id.gwe);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.nature_sticker_view)");
        this.LLIIIZ = (C1558469s) findViewById;
        setVisibility(8);
        this.LLFF = 0.8f;
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ) {
            this.LLIIIZ.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        this.LLIIIZ.setTouching(false);
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LLIIIZ.setAlpha(f);
    }

    public final void setController(C1558169p controller) {
        o.LJIIIZ(controller, "controller");
        this.LLIIIZ.setStickerController(controller);
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        this.LLIIIZ.setPlayPosition(j);
    }
}

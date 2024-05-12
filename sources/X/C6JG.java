package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6JG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JG extends C156426By {
    public static final /* synthetic */ int LLIIL = 0;
    public C6JH LLIIIZ;
    public final C63R LLIIJI;
    public float LLIIJLIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.C156426By
    public final C1558669u LJ() {
        return this.LLIIIZ.LJIJ();
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
        return this.LLIIJI.LJIIIIZZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (4 == r7.getVisibility()) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r9 = this;
            X.6JH r7 = r9.LLIIIZ
            X.69u r8 = r7.LJLJI
            r6 = 0
            if (r8 == 0) goto L12
            X.6JF r0 = r7.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L13
            boolean r0 = r0.LJIL()
            if (r0 != r5) goto L13
        L12:
            return
        L13:
            boolean r0 = r7.LJLJJL
            if (r0 != 0) goto L12
            boolean r0 = r7.LJLJJLL
            if (r0 != 0) goto L12
            boolean r0 = r7.LIZLLL()
            if (r0 == 0) goto L31
            long r3 = r7.LJLJJI
            int r0 = r8.LJLILLLLZI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4b
            int r0 = r8.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
        L31:
            r2 = 1
            r1 = 4
            if (r5 == 0) goto L4c
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L4c
        L3b:
            X.C162696a1.LJ(r6, r7)
            if (r5 == 0) goto L12
            Y.ARunnableS14S0101000_10 r2 = new Y.ARunnableS14S0101000_10
            r1 = 6
            r0 = 0
            r2.<init>(r1, r9, r0)
            r9.post(r2)
            goto L12
        L4b:
            r2 = 0
        L4c:
            r5 = 0
            if (r2 == 0) goto L50
            goto L3b
        L50:
            r6 = 4
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JG.LJIILIIL():void");
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

    public C6JH getBaseView() {
        return this.LLIIIZ;
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
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

    public void setController(C6JF c6jf) {
        this.LLIIIZ.setController(c6jf);
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        this.LLIIIZ.setPlayPosition(j);
    }

    public void setPollStickerTimeEditData(C1558669u c1558669u) {
        this.LLIIIZ.setPollStickerTimeEditData(c1558669u);
    }

    public C6JG(Context context, C82622Wbi c82622Wbi) {
        super(context, null);
        this.LLIIIILZ = LIZLLL();
        this.LJLIL = context;
        KL2.LIZJ(context, 32.0f);
        KL2.LJIIJJI(context);
        KL2.LIZJ(context, 28.0f);
        KL2.LIZJ(context, 96.0f);
        this.LLIIJI = (C63R) c82622Wbi.LJ(C63R.class, null);
        C16880lQ.LLLZIIL(R.layout.bnb, C16880lQ.LLZIL(this.LJLIL), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
    }
}

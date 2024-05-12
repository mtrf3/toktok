package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JW extends C156426By {
    public C158326Jg LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public float LLIIJLIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    private final C63Q getEditLiveCDStickerApi() {
        return (C63Q) this.LLIIJI.getValue();
    }

    @Override // X.C156426By
    public final C1558669u LJ() {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg != null) {
            return c158326Jg.LJIJ();
        }
        return null;
    }

    @Override // X.C156426By
    public final boolean LJII() {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg == null || c158326Jg.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r2 == false) goto L28;
     */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r8 = this;
            X.6Jg r6 = r8.LLIIIZ
            if (r6 == 0) goto L13
            X.69u r7 = r6.LJZL
            r5 = 1
            if (r7 == 0) goto L13
            X.6JV r0 = r6.LJZI
            if (r0 == 0) goto L14
            boolean r0 = r0.LJIL()
            if (r0 != r5) goto L14
        L13:
            return
        L14:
            boolean r0 = r6.LLD
            if (r0 != 0) goto L13
            boolean r0 = r6.LLF
            if (r0 != 0) goto L13
            boolean r0 = r6.LJFF()
            if (r0 == 0) goto L32
            long r3 = r6.LL
            int r0 = r7.LJLILLLLZI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L52
            int r0 = r7.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L52
        L32:
            r2 = 1
        L33:
            r1 = 4
            if (r2 == 0) goto L4e
            int r0 = r6.getVisibility()
            if (r1 != r0) goto L4e
            r0 = 1
        L3d:
            r1 = 0
        L3e:
            X.C162696a1.LJ(r1, r6)
            if (r0 != r5) goto L13
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 190(0xbe, float:2.66E-43)
            r1.<init>(r8, r0)
            r8.post(r1)
            goto L13
        L4e:
            r0 = 0
            if (r2 == 0) goto L3e
            goto L3d
        L52:
            r2 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JW.LJIILIIL():void");
    }

    @Override // X.C156426By
    public final void LJIILL() {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg == null) {
            return;
        }
        c158326Jg.setVisibility(0);
    }

    @Override // X.C156426By
    public float getEndTime() {
        C158326Jg c158326Jg = this.LLIIIZ;
        int i = 0;
        if (c158326Jg != null) {
            i = c158326Jg.LJJJZ(0);
        }
        return i;
    }

    @Override // X.C156426By
    public float getStartTime() {
        C158326Jg c158326Jg = this.LLIIIZ;
        int i = 0;
        if (c158326Jg != null) {
            i = c158326Jg.LJJII(0);
        }
        return i;
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        return getEditLiveCDStickerApi().LJIIIIZZ();
    }

    public final C158326Jg getBaseView() {
        return this.LLIIIZ;
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    public final float getLastHeight() {
        return this.LLIIJLIL;
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        C158326Jg c158326Jg;
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ && (c158326Jg = this.LLIIIZ) != null) {
            c158326Jg.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg != null) {
            c158326Jg.setTouching(false);
        }
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg == null) {
            return;
        }
        c158326Jg.setAlpha(f);
    }

    public final void setController(C6JV c6jv) {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg != null) {
            c158326Jg.setController(c6jv);
        }
    }

    public final void setLastHeight(float f) {
        this.LLIIJLIL = f;
    }

    public final void setLiveCDStickerTimeEditData(C1558669u c1558669u) {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg != null) {
            c158326Jg.setLiveCDStickerTimeEditData(c1558669u);
        }
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        C158326Jg c158326Jg = this.LLIIIZ;
        if (c158326Jg != null) {
            c158326Jg.setPlayPosition(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6JW(Context context, C82622Wbi diContainer) {
        super(context, null, 0, diContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        new LinkedHashMap();
        this.LLIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1005));
        this.LJLIL = context;
        KL2.LIZJ(context, 32.0f);
        KL2.LJIIJJI(context);
        KL2.LIZJ(context, 28.0f);
        KL2.LIZJ(context, 96.0f);
        C16880lQ.LLLZIIL(R.layout.bn7, C16880lQ.LLZIL(this.LJLIL), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57446Mgc extends ConstraintLayout implements InterfaceC57449Mgf, InterfaceC57447Mgd {
    public final InterfaceC57447Mgd LJLIL;
    public final InterfaceC57449Mgf LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57446Mgc(Context context) {
        this(context, null, 14);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57446Mgc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJIIJZLJL(int i, AqS108S0101000_9 aqS108S0101000_9) {
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC57447Mgd
    public Context getCtx() {
        return this.LJLIL.getCtx();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88472Yns<EnumC57435MgR, C76800UCe> getDataChangeListener() {
        return this.LJLIL.getDataChangeListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> getFollowClickInterceptor() {
        return this.LJLIL.getFollowClickInterceptor();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88471Ynr<EnumC57435MgR, EnumC57435MgR, C76800UCe> getFollowClickListener() {
        return this.LJLIL.getFollowClickListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88471Ynr<EnumC57435MgR, Boolean, C76800UCe> getRequestListener() {
        return this.LJLIL.getRequestListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC65784Pro<C57430MgM> getTracker() {
        return this.LJLIL.getTracker();
    }

    @Override // X.InterfaceC57447Mgd
    public void setDataChangeListener(InterfaceC88472Yns<? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.setDataChangeListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setFollowClickInterceptor(InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLIL.setFollowClickInterceptor(interceptor);
    }

    @Override // X.InterfaceC57447Mgd
    public void setFollowClickListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.setFollowClickListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setRequestListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.setRequestListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setTracker(InterfaceC65784Pro<C57430MgM> tracker) {
        o.LJIIIZ(tracker, "tracker");
        this.LJLIL.setTracker(tracker);
    }

    @Override // X.InterfaceC57449Mgf
    public final void LIZIZ() {
        this.LJLILLLLZI.LIZIZ();
    }

    public final InterfaceC57447Mgd getListener() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJJJJL(C57438MgU c57438MgU) {
        this.LJLILLLLZI.LJJJJJL(c57438MgU);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57446Mgc(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r6 & 8
            if (r0 == 0) goto L14
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mgb r0 = r0.LIZ()
            X.Mge r1 = r0.LIZ(r4)
        L14:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.LJLIL = r1
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mgb r0 = r0.LIZ()
            X.MgN r0 = r0.LIZIZ(r3)
            r3.LJLILLLLZI = r0
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r4)
            r1 = 2131562474(0x7f0d0fea, float:1.8750378E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57446Mgc.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UIv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76973UIv extends ElementSpecImpl {
    public final C1O4 LJLIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public C75233Tfp LJLJJLL;
    public int LJLJL;

    public final void LIZ(ConstraintProperty constraintProperty) {
        int i = this.LJLJL;
        int i2 = this.LJLJJI;
        if (i == i2) {
            return;
        }
        this.LJLJL = i2;
        if (i2 == 0) {
            constraintProperty.visibility(8);
        } else {
            constraintProperty.visibility(0);
        }
        constraintProperty.margin(2, this.LJLJJI);
        constraintProperty.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3.LJLILLLLZI > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty r5) {
        /*
            r4 = this;
            r0 = 0
            r4.LJLJJI = r0
            X.Tfp r3 = r4.LJLJJLL
            r2 = 0
            if (r3 == 0) goto L36
            X.TWk r1 = r3.LJLIL
        La:
            X.TWk r0 = X.EnumC74778TWk.FLOATING_FIX
            if (r1 == r0) goto L1c
            if (r3 == 0) goto L34
            X.TWk r1 = r3.LJLIL
        L12:
            X.TWk r0 = X.EnumC74778TWk.FLOATING
            if (r1 != r0) goto L2d
            if (r3 == 0) goto L2d
            int r0 = r3.LJLILLLLZI
            if (r0 <= 0) goto L2d
        L1c:
            if (r3 == 0) goto L20
            X.TWk r2 = r3.LJLIL
        L20:
            X.TWk r0 = X.EnumC74778TWk.FLOATING
            if (r2 != r0) goto L31
            int r1 = r4.LJLJJL
            X.1O4 r0 = r4.LJLIL
            int r0 = r0.LIZLLL
            int r1 = r1 + r0
        L2b:
            r4.LJLJJI = r1
        L2d:
            r4.LIZ(r5)
            return
        L31:
            int r1 = r4.LJLJJL
            goto L2b
        L34:
            r1 = r2
            goto L12
        L36:
            r1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76973UIv.LIZIZ(com.bytedance.ies.sdk.widgets.ConstraintProperty):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76973UIv(C1O4 layeredElementContext, C76986UJi c76986UJi) {
        super(R.id.h3b);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        this.LJLILLLLZI = c76986UJi;
        layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.ad7);
        addSceneObserver(new C76974UIw(this));
        addSceneObserver(new C76968UIq(this));
        addSceneObserver(new C76969UIr(this));
        addSceneObserver(new C76972UIu(this));
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(this, 581));
    }
}

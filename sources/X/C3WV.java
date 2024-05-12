package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3WV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WV extends FrameLayout implements C3WZ {
    public final /* synthetic */ C85373Wr LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Activity LJLJJL;
    public C99033ud LJLJJLL;
    public IMUser LJLJL;
    public InterfaceC785236i LJLJLJ;
    public boolean LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3WV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C3WZ
    public final void LJIILIIL() {
        this.LJLIL.LJIILIIL();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    private final TuxTextView getContentTxt() {
        return (TuxTextView) this.LJLJJI.getValue();
    }

    private final View getDeleteBtn() {
        return (View) this.LJLILLLLZI.getValue();
    }

    private final View getUnblockBtn() {
        return (View) this.LJLJI.getValue();
    }

    public final void LIZ() {
        Object LIZ;
        if (getVisibility() == 8) {
            if (!this.LJLJLLL) {
                View.inflate(getContext(), R.layout.b0n, this);
                TuxTextView contentTxt = getContentTxt();
                try {
                    LIZ = C92123jU.LIZ(this.LJLJJL, this.LJLJL, this.LJLJJLL);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                CharSequence charSequence = (CharSequence) LIZ;
                if (charSequence == null) {
                    charSequence = "";
                }
                contentTxt.setText(charSequence);
                getContentTxt().setMovementMethod(LinkMovementMethod.getInstance());
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 136), getDeleteBtn());
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 137), getUnblockBtn());
                this.LJLJLLL = true;
            }
            setVisibility(0);
            LJIILIIL();
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("enter_from", "chat_list_page");
            onEventV3.LIZIZ("block_warning_show", c1hq);
        }
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LJLIL.LLJILLL(c3wr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3WV(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.3Wr r0 = new X.3Wr
            r0.<init>()
            r2.LJLIL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 450(0x1c2, float:6.3E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 451(0x1c3, float:6.32E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 449(0x1c1, float:6.29E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            android.app.Activity r0 = X.C78949Uyf.LJIILL(r3)
            if (r0 == 0) goto L4a
            r2.LJLJJL = r0
            r0 = 8
            r2.setVisibility(r0)
            return
        L4a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WV.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

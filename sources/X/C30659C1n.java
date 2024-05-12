package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.C1n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30659C1n extends FrameLayout implements InterfaceC12560eS {
    public boolean LJLIL;
    public final ImageView LJLILLLLZI;
    public final LiveIconView LJLJI;
    public final LiveIconView LJLJJI;
    public final C47121t6 LJLJJL;
    public final C2A7 LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30659C1n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZ(boolean z) {
        if (this.LJLIL == z) {
            return;
        }
        this.LJLIL = z;
        if (z) {
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            C29306Beo.LJJLJLI(this.LJLJI);
            C29306Beo.LJI(this.LJLJJI);
            C29306Beo.LJI(this.LJLJJL);
            C29306Beo.LJI(this.LJLJJLL);
            return;
        }
        C29306Beo.LJI(this.LJLILLLLZI);
        C29306Beo.LJI(this.LJLJI);
        C29306Beo.LJJLJLI(this.LJLJJI);
        C29306Beo.LJJLJLI(this.LJLJJL);
        C29306Beo.LJJLJLI(this.LJLJJLL);
    }

    @Override // X.InterfaceC12560eS
    public void setClickAction(InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            C29306Beo.LJJJLL(c2a7, 500L, new AqS171S0100000_5(action, (InterfaceC65784Pro<C76800UCe>) 149));
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            C29306Beo.LJJJLL(imageView, 500L, new AqS171S0100000_5(action, (InterfaceC65784Pro<C76800UCe>) 150));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30659C1n(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            r3 = 0
            if (r0 == 0) goto L6
            r6 = r3
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r5, r0)
            r0 = 0
            r4.<init>(r5, r6, r0)
            r0 = 2131563886(0x7f0d156e, float:1.8753242E38)
            android.widget.FrameLayout.inflate(r5, r0, r4)
            r0 = 2131371356(0x7f0a255c, float:1.8362744E38)
            android.view.View r1 = r4.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = (com.bytedance.android.live.design.view.icon.LiveIconView) r1
            r2 = 2130968611(0x7f040023, float:1.754588E38)
            if (r1 == 0) goto L6b
            android.content.Context r0 = r1.getContext()
            int r0 = X.C259910h.LIZIZ(r2, r0)
            r1.setIconTint(r0)
        L2e:
            r4.LJLJI = r1
            r0 = 2131371354(0x7f0a255a, float:1.836274E38)
            android.view.View r1 = r4.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = (com.bytedance.android.live.design.view.icon.LiveIconView) r1
            if (r1 == 0) goto L47
            android.content.Context r0 = r1.getContext()
            int r0 = X.C259910h.LIZIZ(r2, r0)
            r1.setIconTint(r0)
            r3 = r1
        L47:
            r4.LJLJJI = r3
            r0 = 2131371803(0x7f0a271b, float:1.8363651E38)
            android.view.View r0 = r4.findViewById(r0)
            X.1t6 r0 = (X.C47121t6) r0
            r4.LJLJJL = r0
            r0 = 2131379995(0x7f0a471b, float:1.8380266E38)
            android.view.View r0 = r4.findViewById(r0)
            X.2A7 r0 = (X.C2A7) r0
            r4.LJLJJLL = r0
            r0 = 2131368322(0x7f0a1982, float:1.835659E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.LJLILLLLZI = r0
            return
        L6b:
            r1 = r3
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30659C1n.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

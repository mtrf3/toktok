package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2X<T extends ViewGroup> extends S39<T, C71451S2l, InterfaceC71480S3o, InterfaceC71443S2d> {
    public static final /* synthetic */ int LJIIJ = 0;
    public final InterfaceC71445S2f<T> LJFF;
    public TuxTextView LJI;
    public TuxTextView LJII;
    public TuxTextView LJIIIIZZ;
    public C71451S2l LJIIIZ;

    @Override // X.S39
    public final InterfaceC71443S2d LIZLLL() {
        return new C71444S2e();
    }

    @Override // X.S39
    public final InterfaceC71443S2d LJ(InterfaceC71480S3o interfaceC71480S3o) {
        InterfaceC71480S3o style = interfaceC71480S3o;
        o.LJIIIZ(style, "style");
        return new C71481S3p(style);
    }

    public final boolean LJII(int i) {
        C71451S2l c71451S2l;
        TuxTextView tuxTextView = this.LJI;
        if (tuxTextView != null && (c71451S2l = this.LJIIIZ) != null) {
            return LJFF().LIZLLL(this.LIZJ, tuxTextView, c71451S2l.LIZLLL, c71451S2l.LIZJ, c71451S2l.LJFF, i);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C71451S2l r11) {
        /*
            r10 = this;
            r10.LJIIIZ = r11
            java.lang.String r7 = r11.LIZIZ
            if (r7 != 0) goto L8
            java.lang.String r7 = r11.LIZJ
        L8:
            boolean r0 = X.C78857UxB.LJJJIL(r7)
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L9e
            com.bytedance.tux.input.TuxTextView r5 = r10.LJI
            if (r5 == 0) goto L92
        L15:
            X.S3G r4 = r10.LJFF()
            X.S2d r4 = (X.InterfaceC71443S2d) r4
            java.lang.String r6 = r11.LIZLLL
            X.S32 r8 = r11.LJFF
            android.content.Context r9 = r5.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            r4.LIZ(r5, r6, r7, r8, r9)
            r5.setVisibility(r3)
        L2e:
            java.lang.String r4 = r11.LIZ
            boolean r0 = X.C78857UxB.LJJJIL(r4)
            if (r0 == 0) goto L89
            com.bytedance.tux.input.TuxTextView r0 = r10.LJII
            if (r0 == 0) goto L7c
        L3a:
            r0.setText(r4)
            r0.setVisibility(r3)
        L40:
            java.lang.String r4 = r11.LJ
            boolean r0 = X.C78857UxB.LJJJIL(r4)
            if (r0 == 0) goto L73
            com.bytedance.tux.input.TuxTextView r1 = r10.LJIIIIZZ
            if (r1 == 0) goto L66
        L4c:
            r1.setVisibility(r3)
            X.S3G r0 = r10.LJFF()
            X.S2d r0 = (X.InterfaceC71443S2d) r0
            r0.LJIIJ(r1, r4)
        L58:
            X.S3G r2 = r10.LJFF()
            X.S2d r2 = (X.InterfaceC71443S2d) r2
            com.bytedance.tux.input.TuxTextView r1 = r10.LJII
            com.bytedance.tux.input.TuxTextView r0 = r10.LJIIIIZZ
            r2.LJIILJJIL(r1, r0)
            return
        L66:
            X.S2f<T extends android.view.ViewGroup> r1 = r10.LJFF
            T extends android.view.View r0 = r10.LIZ
            com.bytedance.tux.input.TuxTextView r1 = r1.LIZJ(r0)
            r10.LJIIIIZZ = r1
            if (r1 == 0) goto L58
            goto L4c
        L73:
            com.bytedance.tux.input.TuxTextView r0 = r10.LJIIIIZZ
            if (r0 != 0) goto L78
            goto L58
        L78:
            r0.setVisibility(r2)
            goto L58
        L7c:
            X.S2f<T extends android.view.ViewGroup> r1 = r10.LJFF
            T extends android.view.View r0 = r10.LIZ
            com.bytedance.tux.input.TuxTextView r0 = r1.LIZIZ(r0)
            if (r0 == 0) goto L40
            r10.LJII = r0
            goto L3a
        L89:
            com.bytedance.tux.input.TuxTextView r0 = r10.LJII
            if (r0 != 0) goto L8e
            goto L40
        L8e:
            r0.setVisibility(r2)
            goto L40
        L92:
            X.S2f<T extends android.view.ViewGroup> r1 = r10.LJFF
            T extends android.view.View r0 = r10.LIZ
            com.bytedance.tux.input.TuxTextView r5 = r1.LIZ(r0)
            r10.LJI = r5
            goto L15
        L9e:
            com.bytedance.tux.input.TuxTextView r0 = r10.LJI
            if (r0 != 0) goto La3
            goto L2e
        La3:
            r0.setVisibility(r2)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2X.LJIIIIZZ(X.S2l):void");
    }

    public final void LJIIIZ(InterfaceC71480S3o style) {
        o.LJIIIZ(style, "style");
        LJI(style);
        this.LJFF.LIZLLL(style);
    }

    public final void LJIIJ(boolean z) {
        C71451S2l c71451S2l;
        TuxTextView tuxTextView = this.LJI;
        if (tuxTextView != null && (c71451S2l = this.LJIIIZ) != null) {
            LJFF().LJIIIIZZ(this.LIZJ, tuxTextView, c71451S2l.LIZLLL, c71451S2l.LIZJ, c71451S2l.LJFF, z);
        }
    }

    public S2X(T t, InterfaceC71445S2f<T> interfaceC71445S2f) {
        super(t);
        this.LJFF = interfaceC71445S2f;
    }
}

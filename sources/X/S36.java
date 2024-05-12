package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S36<T extends ViewGroup> extends S39<T, Object, S3B, S35> {
    public final S3A<T> LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public final C62822Ol8 LJIIJ;

    @Override // X.S39
    public final S35 LIZLLL() {
        return new S37();
    }

    public final void LJIIIIZZ() {
        this.LJI.getValue();
        ImageView imageView = (ImageView) this.LJII.getValue();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    @Override // X.S39
    public final S35 LJ(S3B s3b) {
        S3B style = s3b;
        o.LJIIIZ(style, "style");
        return new S38(style);
    }

    public final void LJIIJ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LJIIIIZZ;
        int i2 = 8;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
        }
        TuxTextView tuxTextView2 = this.LJIIIZ;
        if (tuxTextView2 == null) {
            return;
        }
        if (z && o.LJ(Boolean.TRUE, tuxTextView2.getTag())) {
            i2 = 0;
        }
        tuxTextView2.setVisibility(i2);
    }

    public final void LJIIJJI(S3B style) {
        o.LJIIIZ(style, "style");
        LJI(style);
        this.LJFF.LIZIZ(style);
        LJFF().LJFF((ViewGroup) this.LIZ);
    }

    public S36(T t, S3A<T> s3a) {
        super(t);
        this.LJFF = s3a;
        this.LJI = C221108m2.LIZIZ(new AqS159S0200000_12(this, (S36<int>) t, 108));
        this.LJII = C221108m2.LIZIZ(new AqS159S0200000_12(this, (S36<int>) t, 109));
        this.LJIIJ = C221108m2.LIZIZ(new AqS159S0200000_12(this, (S36<int>) t, 107));
    }

    public final void LJII(AbstractC72439Sbr abstractC72439Sbr, String url, String key) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(key, "key");
        SmartImageView smartImageView = (SmartImageView) this.LJI.getValue();
        W5F LJ = LJFF().LJ(this.LIZJ, url);
        LJ.LJJIIJ = smartImageView;
        LJ.LIZLLL(new C61842OOw(abstractC72439Sbr, key, url));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r7, java.lang.Integer r8, java.lang.String r9) {
        /*
            r6 = this;
            r5 = 8
            if (r7 != 0) goto L15
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L11
        L8:
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIIZ
            if (r0 != 0) goto Ld
        Lc:
            return
        Ld:
            r0.setVisibility(r5)
            goto Lc
        L11:
            r0.setVisibility(r5)
            goto L8
        L15:
            com.bytedance.tux.input.TuxTextView r3 = r6.LJIIIIZZ
            if (r3 == 0) goto L7e
        L19:
            r4 = 0
            if (r3 == 0) goto L31
            r3.setVisibility(r4)
            X.S3G r2 = r6.LJFF()
            X.S35 r2 = (X.S35) r2
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "this.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LJIIJJI(r1, r3, r7)
        L31:
            if (r8 == 0) goto L71
            r1 = 5
            int r0 = r8.intValue()
            if (r0 == r1) goto L71
            com.bytedance.tux.input.TuxTextView r1 = r6.LJIIIZ
            if (r1 == 0) goto L64
        L3e:
            r1.setVisibility(r4)
            r1.setText(r9)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setTag(r0)
        L49:
            com.bytedance.tux.input.TuxTextView r3 = r6.LJIIIIZZ
            if (r3 == 0) goto Lc
            X.S3G r2 = r6.LJFF()
            X.S35 r2 = (X.S35) r2
            android.content.Context r1 = r6.LIZJ
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIIZ
            if (r0 == 0) goto L60
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L60
            r4 = 1
        L60:
            r2.LIZIZ(r1, r3, r4)
            goto Lc
        L64:
            X.S3A<T extends android.view.ViewGroup> r1 = r6.LJFF
            T extends android.view.View r0 = r6.LIZ
            com.bytedance.tux.input.TuxTextView r1 = r1.LJIIIIZZ(r0)
            r6.LJIIIZ = r1
            if (r1 == 0) goto L49
            goto L3e
        L71:
            com.bytedance.tux.input.TuxTextView r1 = r6.LJIIIZ
            if (r1 == 0) goto L49
            r1.setVisibility(r5)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setTag(r0)
            goto L49
        L7e:
            X.S3A<T extends android.view.ViewGroup> r1 = r6.LJFF
            T extends android.view.View r0 = r6.LIZ
            com.bytedance.tux.input.TuxTextView r3 = r1.LIZLLL(r0)
            r6.LJIIIIZZ = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S36.LJIIIZ(int, java.lang.Integer, java.lang.String):void");
    }
}

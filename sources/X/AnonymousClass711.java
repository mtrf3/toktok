package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.711, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass711 extends FrameLayout implements InterfaceC176226vq {
    public ObjectAnimator LJLIL;
    public TuxTextView LJLILLLLZI;
    public ImageView LJLJI;
    public boolean LJLJJI;
    public AnonymousClass712 LJLJJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass711(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass711(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC176226vq
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC176226vq
    public final void LIZIZ() {
        Comment comment;
        String str;
        AnonymousClass712 anonymousClass712 = this.LJLJJL;
        if (anonymousClass712 != null && (comment = anonymousClass712.LIZ) != null) {
            if (C178216z3.LIZLLL(comment)) {
                setLoading(true);
                return;
            }
            if (comment.isTranslated()) {
                AnonymousClass712 anonymousClass7122 = this.LJLJJL;
                if (anonymousClass7122 != null) {
                    str = anonymousClass7122.LIZJ;
                }
                str = null;
            } else {
                AnonymousClass712 anonymousClass7123 = this.LJLJJL;
                if (anonymousClass7123 != null) {
                    str = anonymousClass7123.LIZIZ;
                }
                str = null;
            }
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
            } else {
                o.LJIJI("loadingTextView");
                throw null;
            }
        }
    }

    public final void LIZJ(AnonymousClass712 anonymousClass712) {
        this.LJLJJL = anonymousClass712;
        if (anonymousClass712.LIZ == null) {
            C78886Uxe.LJJLIIIJILLIZJL(this);
        } else {
            LIZIZ();
        }
    }

    @Override // X.InterfaceC176226vq
    public void setLoading(boolean z) {
        if (this.LJLJJI == z) {
            return;
        }
        if (z) {
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                C78886Uxe.LJJLIIIJJI(imageView);
                setLoadingText(R.string.dm9);
                ObjectAnimator objectAnimator = this.LJLIL;
                if (objectAnimator != null) {
                    objectAnimator.start();
                } else {
                    o.LJIJI("mInfiniteRotateAnimator");
                    throw null;
                }
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        } else {
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                C78886Uxe.LJJLIIIJILLIZJL(imageView2);
                ObjectAnimator objectAnimator2 = this.LJLIL;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                } else {
                    o.LJIJI("mInfiniteRotateAnimator");
                    throw null;
                }
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        this.LJLJJI = z;
    }

    public void setLoadingText(String text) {
        o.LJIIIZ(text, "text");
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(text);
        } else {
            o.LJIJI("loadingTextView");
            throw null;
        }
    }

    @Override // X.InterfaceC176226vq
    public void setViewVisibility(int i) {
        setVisibility(i);
    }

    public void setLoadingText(int i) {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        } else {
            o.LJIJI("loadingTextView");
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass711(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            r3 = 0
            if (r0 == 0) goto L7
            r7 = r3
        L7:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r0 = 0
            r5.<init>(r6, r7, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131558957(0x7f0d022d, float:1.8743244E38)
            android.widget.FrameLayout.inflate(r1, r0, r5)
            r0 = 2131370959(0x7f0a23cf, float:1.836194E38)
            android.view.View r1 = r5.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.loading_text)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r5.LJLILLLLZI = r1
            r0 = 2131370961(0x7f0a23d1, float:1.8361943E38)
            android.view.View r2 = r5.findViewById(r0)
            java.lang.String r0 = "findViewById(R.id.loading_view)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5.LJLJI = r2
            float[] r1 = new float[r4]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [0, 1135869952} // fill-array
            java.lang.String r0 = "rotation"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
            r0 = 800(0x320, double:3.953E-321)
            android.animation.ObjectAnimator r1 = r2.setDuration(r0)
            java.lang.String r0 = "ofFloat(\n            loa…       ).setDuration(800)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r5.LJLIL = r1
            X.C149985uc.LIZ(r1)
            android.animation.ObjectAnimator r2 = r5.LJLIL
            java.lang.String r1 = "mInfiniteRotateAnimator"
            if (r2 == 0) goto L9f
            r0 = -1
            r2.setRepeatCount(r0)
            android.animation.ObjectAnimator r2 = r5.LJLIL
            if (r2 == 0) goto L9b
            Y.ALAdapterS2S0100000_3 r1 = new Y.ALAdapterS2S0100000_3
            r0 = 0
            r1.<init>(r5, r0)
            r2.addListener(r1)
            android.widget.ImageView r0 = r5.LJLJI
            if (r0 == 0) goto L95
            X.C78886Uxe.LJJLIIIJILLIZJL(r0)
            com.bytedance.tux.input.TuxTextView r2 = r5.LJLILLLLZI
            if (r2 == 0) goto L8f
            X.712 r0 = r5.LJLJJL
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L83
        L7f:
            r2.setText(r0)
            return
        L83:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131826495(0x7f11173f, float:1.9285876E38)
            java.lang.String r0 = r1.getString(r0)
            goto L7f
        L8f:
            java.lang.String r0 = "loadingTextView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        L95:
            java.lang.String r0 = "loadingView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        L9b:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        L9f:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass711.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.64F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64F extends C64I {
    public C1543864c LJLJLLL;
    public C63G LJLL;
    public C1543764b LJLLI;
    public C63F LJLLILLLL;
    public C64H LJLLJ;
    public C64E LJLLL;

    public final C63F getFakeFeedInterceptor() {
        return this.LJLLILLLL;
    }

    public final C64H getStickerBubbleInterceptor() {
        return this.LJLLJ;
    }

    public final C1543864c getStickerDeleteInterceptor() {
        return this.LJLJLLL;
    }

    public final C64E getStickerExplainTextInterceptor() {
        return this.LJLLL;
    }

    public final C63G getStickerHelpBoxInterceptor() {
        return this.LJLL;
    }

    public final C1543764b getStickerSafeLineInterceptor() {
        return this.LJLLI;
    }

    public final void setFakeFeedInterceptor(C63F c63f) {
        this.LJLLILLLL = c63f;
    }

    public final void setStickerBubbleInterceptor(C64H c64h) {
        this.LJLLJ = c64h;
    }

    public final void setStickerDeleteInterceptor(C1543864c c1543864c) {
        this.LJLJLLL = c1543864c;
    }

    public final void setStickerExplainTextInterceptor(C64E c64e) {
        this.LJLLL = c64e;
    }

    public final void setStickerHelpBoxInterceptor(C63G c63g) {
        this.LJLL = c63g;
    }

    public final void setStickerSafeLineInterceptor(C1543764b c1543764b) {
        this.LJLLI = c1543764b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // X.C64I
    public final void LIZ(C64Y stickerManager, C64J c64j) {
        C64U c64u;
        C63G c63g;
        C64U c64u2;
        o.LJIIIZ(stickerManager, "stickerManager");
        super.LIZ(stickerManager, c64j);
        List<C64U> list = c64j.LIZ;
        C64U c64u3 = null;
        if (list != null) {
            c64u = (C64U) ListProtector.get(list, 5);
        } else {
            c64u = null;
        }
        if (c64u instanceof C63G) {
            c63g = (C63G) c64u;
        } else {
            c63g = null;
        }
        this.LJLL = c63g;
        List<C64U> list2 = c64j.LIZ;
        if (list2 != null) {
            c64u2 = (C64U) ListProtector.get(list2, 4);
        } else {
            c64u2 = null;
        }
        this.LJLLJ = (C64H) c64u2;
        List<C64U> list3 = c64j.LIZ;
        if (list3 != null) {
            c64u3 = (C64U) ListProtector.get(list3, 6);
        }
        o.LJII(c64u3, "null cannot be cast to non-null type com.tiktok.sticker.interceptor.StickerExplainTextInterceptor");
        this.LJLLL = (C64E) c64u3;
        C64H c64h = this.LJLLJ;
        if (c64h != null) {
            int containerTopMargin = getContainerTopMargin();
            getContainerBottomMargin();
            c64h.LJLJLJ = containerTopMargin;
        }
    }
}

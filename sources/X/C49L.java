package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.49L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49L extends C81929WDl {
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C81929WDl LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ W5F LJLLI;

    @Override // X.C81929WDl, X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        super.T1(uri, smartImageView);
        C81929WDl c81929WDl = this.LJLJLLL;
        if (c81929WDl != null) {
            c81929WDl.T1(uri, smartImageView);
        }
    }

    @Override // X.C81929WDl, X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        int i = this.LJLL;
        if (i > 0) {
            W5F w5f = this.LJLLI;
            String scene = this.LJLJLJ;
            C81929WDl c81929WDl = this.LJLJLLL;
            o.LJIIIZ(w5f, "<this>");
            o.LJIIIZ(scene, "scene");
            w5f.LIZLLL(new C49L(i - 1, w5f, c81929WDl, scene));
        } else {
            super.s2(uri, view, th);
        }
        C81929WDl c81929WDl2 = this.LJLJLLL;
        if (c81929WDl2 != null) {
            c81929WDl2.s2(uri, view, th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49L(int i, W5F w5f, C81929WDl c81929WDl, String str) {
        super(str, false, null, null, null, 62);
        this.LJLJLJ = str;
        this.LJLJLLL = c81929WDl;
        this.LJLL = i;
        this.LJLLI = w5f;
    }

    @Override // X.C81929WDl, X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        super.U0(uri, view, c2047581v, animatable);
        C81929WDl c81929WDl = this.LJLJLLL;
        if (c81929WDl != null) {
            c81929WDl.U0(uri, view, c2047581v, animatable);
        }
    }
}

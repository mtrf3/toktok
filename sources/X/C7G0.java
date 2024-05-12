package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7G0, reason: invalid class name */
/* loaded from: classes4.dex */
public class C7G0 extends FrameLayout {
    public final C7G6 LJLIL;
    public String LJLILLLLZI;

    public final String getMEventType() {
        return this.LJLILLLLZI;
    }

    public final void setMEventType(String str) {
        this.LJLILLLLZI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7G0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.p5, this);
        View findViewById = findViewById(R.id.bjw);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.comment_bubble_multi_tag_layout)");
        this.LJLIL = (C7G6) findViewById;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:10|(1:12)(1:50)|13|(1:(1:47))(1:(6:38|39|(1:41)(1:44)|42|43|31))|18|19|20|(3:22|23|(3:28|29|30))(1:34)|31|8) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, X.C1811278y r16) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7G0.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.78y):void");
    }
}

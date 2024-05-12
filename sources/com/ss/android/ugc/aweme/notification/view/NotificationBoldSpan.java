package com.ss.android.ugc.aweme.notification.view;

import X.T5S;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes4.dex */
public class NotificationBoldSpan extends ForegroundColorSpan {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NotificationBoldSpan() {
        /*
            r2 = this;
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            if (r0 == 0) goto L15
            android.app.Activity r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
        La:
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r2.<init>(r0)
            return
        L15:
            android.content.Context r1 = X.EF7.LIZIZ()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan.<init>():void");
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        textPaint.setTypeface(t5s.getTypeface());
    }
}

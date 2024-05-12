package X;

import android.text.TextWatcher;
import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog;

/* renamed from: X.UIa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76952UIa implements TextWatcher {
    public final /* synthetic */ LiveSubscribeEmojiInputDialog LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L15
            java.lang.String r0 = r4.toString()
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r2 = r4.toString()
            if (r2 != 0) goto L17
        L15:
            java.lang.String r2 = ""
        L17:
            com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog r0 = r3.LJLIL
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L24
            com.bytedance.android.livesdk.impl.revenue.subscription.emoji.LiveSubscribeEmojiInputDialog r0 = r3.LJLIL
            r0.F8(r1, r2)
        L24:
            android.view.View r1 = r3.LJLILLLLZI
            r0 = 2131368835(0x7f0a1b83, float:1.8357631E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76952UIa.afterTextChanged(android.text.Editable):void");
    }

    public C76952UIa(LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog, View view) {
        this.LJLIL = liveSubscribeEmojiInputDialog;
        this.LJLILLLLZI = view;
    }
}

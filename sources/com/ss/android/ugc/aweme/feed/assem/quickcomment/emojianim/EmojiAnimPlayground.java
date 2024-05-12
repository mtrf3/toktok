package com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim;

import X.C04560Fw;
import X.C79488VHo;
import X.C80972VqC;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EmojiAnimPlayground extends View {
    public List<C80972VqC> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiAnimPlayground(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        AqS161S0200000_14 aqS161S0200000_14 = new AqS161S0200000_14(this, canvas, 11);
        if (C79488VHo.LIZIZ()) {
            aqS161S0200000_14.invoke();
            return;
        }
        List<C80972VqC> list = this.LJLIL;
        if (list != null) {
            synchronized (list) {
                aqS161S0200000_14.invoke();
            }
        } else {
            o.LJIJI("emojiItemList");
            throw null;
        }
    }

    public final void setEmojiItemList(List<C80972VqC> emojiItemList) {
        o.LJIIIZ(emojiItemList, "emojiItemList");
        this.LJLIL = emojiItemList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiAnimPlayground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
    }
}

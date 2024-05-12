package X;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CSb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31349CSb extends C6L {
    public final /* synthetic */ InterfaceC88472Yns<EmoteModel, C76800UCe> LJLJJL;
    public final /* synthetic */ EmoteModel LJLJJLL;

    @Override // X.C8FQ
    public final void LIZ(View view) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // X.C6L
    public final void LIZIZ(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC88472Yns<EmoteModel, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        EmoteModel emoteModel = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(emoteModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31349CSb(Drawable drawable, InterfaceC88472Yns<? super EmoteModel, C76800UCe> interfaceC88472Yns, EmoteModel emoteModel) {
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = emoteModel;
    }
}

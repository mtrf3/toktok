package X;

import android.app.Activity;
import android.text.TextPaint;
import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.a7u, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92262a7u extends AbstractC188397aN {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Activity LJLJJLL;
    public final /* synthetic */ Map.Entry<String, String> LJLJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJJI.invoke(this.LJLJJL);
        Activity context = this.LJLJJLL;
        String url = this.LJLJL.getValue();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        C91657Zy9.LIZJ(context, url, false, false, false);
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92262a7u(int i, int i2, InterfaceC88472Yns interfaceC88472Yns, String str, ActivityC45651qj activityC45651qj, Map.Entry entry) {
        super(i, i2);
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = str;
        this.LJLJJLL = activityC45651qj;
        this.LJLJL = entry;
    }
}

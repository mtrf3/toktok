package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Luv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55785Luv extends ClickableSpan {
    public final /* synthetic */ C55783Lut LJLIL;
    public final /* synthetic */ User LJLILLLLZI;
    public final /* synthetic */ C26227ARb LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        C221128m4 LJFF = this.LJLIL.LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ("click_nickname");
        }
        this.LJLIL.LJIIIIZZ(this.LJLJI.LIZ, this.LJLILLLLZI, this.LJLJJI);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        T5S t5s = new T5S();
        t5s.LIZ(42);
        ds.setTypeface(t5s.getTypeface());
    }

    public C55785Luv(C55783Lut c55783Lut, User user, C26227ARb c26227ARb, String str) {
        this.LJLIL = c55783Lut;
        this.LJLILLLLZI = user;
        this.LJLJI = c26227ARb;
        this.LJLJJI = str;
    }
}

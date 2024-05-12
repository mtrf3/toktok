package X;

import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.SoS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73220SoS extends AnonymousClass899 {
    public final /* synthetic */ EffectProfileListFragment LJLIL;

    public C73220SoS(EffectProfileListFragment effectProfileListFragment) {
        this.LJLIL = effectProfileListFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLIL.Hl().refresh();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }
}

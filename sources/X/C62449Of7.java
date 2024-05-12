package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS98S0101000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Of7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62449Of7 extends ASB {
    public final C62822Ol8 LJLJJI;
    public int LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null) {
            return;
        }
        GZP gzp = (GZP) this.LJLJJI.getValue();
        Context context = v.getContext();
        o.LJIIIIZZ(context, "v.context");
        gzp.LJFF(new C41831GbL(context, aweme, this.LJLJI, null, null, 24));
        ((GZP) this.LJLJJI.getValue()).LJIIJ("share_to_story_click", aweme, new AqS176S0100000_10(this, 125));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62449Of7(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = C221108m2.LIZIZ(C62518OgE.LJLIL);
        this.LJLJJL = -1;
    }

    @Override // X.ASG
    public final void LIZJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            ((GZP) this.LJLJJI.getValue()).LJIIJ("share_to_story_show", aweme, new AqS98S0101000_10(this, i, 0));
        }
        this.LJLJJL = i;
    }
}

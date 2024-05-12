package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4S7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S7 extends FrameLayout {
    public final TextView LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final C71799SFv LJLJI;
    public final C77870UhG LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4S7(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        View inflate = FrameLayout.inflate(context, R.layout.b5f, this);
        View findViewById = inflate.findViewById(R.id.efl);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.im_quick_share_name)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.egy);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.image_container)");
        this.LJLILLLLZI = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.efk);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.im_quick_share_avatar)");
        this.LJLJI = (C71799SFv) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.efj);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.i…uick_share_animated_icon)");
        this.LJLJJI = (C77870UhG) findViewById4;
    }

    public final void setAvatar$im_base_release(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        C71799SFv.LJIIJ(this.LJLJI, C78939UyV.LJ(urlModel), null, false, new C81929WDl("QuickSharePanel", false, null, null, null, 62), 62);
    }

    public final void setIcon$im_base_release(Drawable drawable) {
        this.LJLJI.setImageDrawable(drawable);
    }

    public final void setRepostIcon$im_base_release(InterfaceC88471Ynr<? super View, ? super Boolean, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.LJLJI.setVisibility(8);
        this.LJLJJI.setVisibility(0);
        block.invoke(this.LJLILLLLZI, Boolean.FALSE);
    }

    public final void setUsername$im_base_release(String text) {
        o.LJIIIZ(text, "text");
        this.LJLIL.setText(text);
    }
}

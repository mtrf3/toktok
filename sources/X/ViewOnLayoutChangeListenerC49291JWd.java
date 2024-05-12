package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JWd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC49291JWd implements View.OnLayoutChangeListener {
    public final /* synthetic */ JWY LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ JWV LJLJJI;

    public ViewOnLayoutChangeListenerC49291JWd(JWY jwy, Aweme aweme, int i, JWV jwv) {
        this.LJLIL = jwy;
        this.LJLILLLLZI = aweme;
        this.LJLJI = i;
        this.LJLJJI = jwv;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.LJLIL.LIZJ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI);
    }
}

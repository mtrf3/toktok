package X;

import Y.ACListenerS44S0200000_9;
import android.os.Bundle;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHF extends AbstractC208678Gx {
    public final String LJLJLJ;
    public final MH9 LJLJLLL;

    @Override // X.MFR
    public final void LLZLLLL() {
    }

    @Override // X.AbstractC208678Gx
    public final void Y() {
    }

    public MHF(View view, String str, MH9 mh9) {
        super(view);
        this.LJLJLJ = str;
        this.LJLJLLL = mh9;
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.cover);
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(view, this, 26), view);
    }

    @Override // X.AbstractC208678Gx
    public final void X(Aweme aweme, int i, boolean z, Bundle arguments) {
        o.LJIIIZ(arguments, "arguments");
        this.LJLIL = aweme;
    }
}

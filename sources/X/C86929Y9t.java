package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Y9t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86929Y9t implements InterfaceC86931Y9v {
    public final /* synthetic */ C86926Y9q LIZ;

    public C86929Y9t(C86926Y9q c86926Y9q) {
        View findViewById;
        this.LIZ = c86926Y9q;
        View view = c86926Y9q.LJFF;
        if (view != null && (findViewById = view.findViewById(R.id.c7h)) != null) {
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(c86926Y9q, 257), findViewById);
        }
    }

    @Override // X.InterfaceC86931Y9v
    public final void LIZ(Aweme aweme) {
        this.LIZ.LIZLLL().LJLJI.setValue(null);
    }
}

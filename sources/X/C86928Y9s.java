package X;

import Y.ACListenerS35S0100000_15;
import Y.AObserverS78S0200000_15;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Y9s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86928Y9s implements InterfaceC86931Y9v {
    public final C2314896q LIZ;
    public final /* synthetic */ C86926Y9q LIZIZ;

    public C86928Y9s(C86926Y9q c86926Y9q) {
        C2314896q c2314896q;
        this.LIZIZ = c86926Y9q;
        View view = c86926Y9q.LJFF;
        if (view != null) {
            c2314896q = (C2314896q) view.findViewById(R.id.c7e);
        } else {
            c2314896q = null;
        }
        this.LIZ = c2314896q;
        if (c2314896q != null) {
            c2314896q.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(c86926Y9q, 259)));
        }
        c86926Y9q.LIZLLL().LJLIL.observe(c86926Y9q.LIZ, new AObserverS78S0200000_15(c86926Y9q, this, 1));
    }

    @Override // X.InterfaceC86931Y9v
    public final void LIZ(Aweme aweme) {
        this.LIZIZ.LIZLLL().LJLJJLL.setValue(null);
    }
}

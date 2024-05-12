package X;

import Y.ACListenerS35S0100000_15;
import Y.AObserverS78S0200000_15;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Y9r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86927Y9r implements InterfaceC86931Y9v {
    public final T5P LIZ;
    public final SY9 LIZIZ;
    public final SY9 LIZJ;
    public final /* synthetic */ C86926Y9q LIZLLL;

    public C86927Y9r(C86926Y9q c86926Y9q) {
        T5P t5p;
        this.LIZLLL = c86926Y9q;
        View view = c86926Y9q.LJFF;
        if (view != null) {
            t5p = (T5P) view.findViewById(R.id.c7i);
        } else {
            t5p = null;
        }
        this.LIZ = t5p;
        SY9 sy9 = new SY9(c86926Y9q.LIZ, R.raw.icon_3pt_bookmark_fill);
        sy9.LJFF(R.attr.c6, c86926Y9q.LIZ);
        this.LIZIZ = sy9;
        SY9 sy92 = new SY9(c86926Y9q.LIZ, R.raw.icon_3pt_bookmark);
        sy92.LJFF(R.attr.dk, c86926Y9q.LIZ);
        this.LIZJ = sy92;
        if (t5p != null) {
            C16880lQ.LJJJLIIL(t5p, new ACListenerS35S0100000_15(c86926Y9q, 260));
        }
        c86926Y9q.LIZLLL().LJLILLLLZI.observe(c86926Y9q.LIZ, new AObserverS78S0200000_15(c86926Y9q, this, 2));
    }

    @Override // X.InterfaceC86931Y9v
    public final void LIZ(Aweme aweme) {
        int i;
        T5P t5p = this.LIZ;
        if (t5p != null) {
            if (C203857zJ.LIZLLL(aweme)) {
                i = 0;
            } else {
                i = 8;
            }
            t5p.setVisibility(i);
        }
        this.LIZLLL.LIZLLL().LJLJL.setValue(null);
    }
}

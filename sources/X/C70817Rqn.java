package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Rqn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70817Rqn implements InterfaceC73307Spr {
    public final View LIZ;
    public final View LIZIZ;
    public final C223338pd LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        this.LIZ.setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        this.LIZ.setVisibility(0);
        if (this.LIZLLL) {
            this.LIZJ.setVisibility(0);
            this.LIZJ.LIZIZ();
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZJ.setVisibility(8);
            this.LIZJ.LIZJ();
            this.LIZIZ.setVisibility(0);
        }
    }

    public C70817Rqn(Context context) {
        View LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.a6r, null, false, "from(context).inflate(R.…oading_view, null, false)");
        this.LIZ = LIZLLL;
        this.LIZIZ = LIZLLL.findViewById(R.id.j19);
        this.LIZJ = (C223338pd) LIZLLL.findViewById(R.id.g85);
    }
}

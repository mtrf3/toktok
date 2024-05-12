package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;

/* renamed from: X.2Q0, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2Q0 implements Runnable {
    public final /* synthetic */ int LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                if (!TextUtils.isEmpty(IW7.LIZJ())) {
                    C47242IgQ.LIZ().createScene(J8V.LJLJL, IW7.LIZJ());
                } else {
                    C47242IgQ.LIZ().createScene(J8V.LJLJL, null);
                }
                C47242IgQ.LIZ().makeCurrentScene(J8V.LJLJL);
                IW7.LIZ();
                return;
            default:
                InitModules.LIZLLL();
                return;
        }
    }

    public /* synthetic */ C2Q0(int i) {
        this.LJLIL = i;
    }
}

package X;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;

/* loaded from: classes7.dex */
public final /* synthetic */ class FCI implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                C38646FEs c38646FEs = (C38646FEs) this.LJLJI;
                boolean z = this.LJLILLLLZI;
                c38646FEs.getClass();
                Application application = c38646FEs.LIZJ;
                C38995FSd.LIZIZ().execute(RunnableC35476Dw8.LJLIL);
                if (((Boolean) C88087Yhf.LJFF.getValue()).booleanValue() && Build.VERSION.SDK_INT > 21) {
                    C38995FSd.LIZLLL().execute(FCL.LJLIL);
                }
                if (Build.VERSION.SDK_INT < 23 || !Process.is64Bit()) {
                    C38995FSd.LIZLLL().execute(RunnableC38492F8u.LJLIL);
                }
                if (application != null && z && !C36152EGu.LJ()) {
                    C35823E4d.LIZ(application);
                }
                if (EU2.LIZ()) {
                    if (application != null) {
                        new PreloadWireFieldNoEnumClassTask().run(application);
                    }
                    new FCJ().run();
                    new FCK().run();
                }
                if (((Boolean) C87781Ycj.LIZJ.getValue()).booleanValue()) {
                    C38995FSd.LIZJ().execute(FCM.LJLIL);
                }
                if (((Boolean) DOI.LJII.getValue()).booleanValue() && !FCO.LIZJ) {
                    C38995FSd.LIZJ().execute(FBL.LJLIL);
                    return;
                }
                return;
            default:
                ((SearchStateViewModel) this.LJLJI).lambda$setIsResultRVScrolling$9(this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ FCI(Object obj, int i, boolean z) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = z;
    }
}

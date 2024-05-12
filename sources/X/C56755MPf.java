package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.MPf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56755MPf extends AbstractC65781Prl implements InterfaceC65784Pro<TutorialVideoViewModel> {
    public static final C56755MPf LJLIL = new C56755MPf();

    public C56755MPf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TutorialVideoViewModel invoke() {
        TutorialVideoViewModel tutorialVideoViewModel = new TutorialVideoViewModel();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            tutorialVideoViewModel.LJLIL = new WeakReference<>(LJIIIIZZ);
        }
        return tutorialVideoViewModel;
    }
}

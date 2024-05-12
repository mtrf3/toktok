package X;

import android.view.View;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86903Y8t extends C86898Y8o {
    public boolean LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86903Y8t(AwemePagerVM pagerVM) {
        super(pagerVM);
        o.LJIIIZ(pagerVM, "pagerVM");
    }

    @Override // X.C86898Y8o
    public final void LIZ(C79236V7w profileTabData, View view) {
        boolean z;
        o.LJIIIZ(profileTabData, "profileTabData");
        IProfileMusicTabService LJIJJLI = ProfileMusicTabService.LJIJJLI();
        if (LJIJJLI != null) {
            z = LJIJJLI.LJIILLIIL();
        } else {
            z = false;
        }
        this.LIZIZ = z;
        if (z) {
            C86898Y8o.LJII(view);
        } else {
            C86898Y8o.LIZIZ(view);
        }
    }

    @Override // X.C86898Y8o
    public final void LIZJ(C78856UxA c78856UxA, int i) {
        View view;
        if (i == 17 && this.LIZIZ) {
            if (c78856UxA != null) {
                view = c78856UxA.LJFF;
            } else {
                view = null;
            }
            if (view instanceof C55960Lxk) {
                this.LIZIZ = false;
                IProfileMusicTabService LJIJJLI = ProfileMusicTabService.LJIJJLI();
                if (LJIJJLI != null) {
                    LJIJJLI.LJIILJJIL();
                }
                View view2 = c78856UxA.LJFF;
                o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.tab.ProfileIconStyleRedDotTabView");
                ((C55960Lxk) view2).LIZ();
            }
        }
    }
}

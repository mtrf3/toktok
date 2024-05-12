package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.geofencing.GeofencingViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SNm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71998SNm extends SLJ {
    public final GeofencingViewModel LJLL;

    @Override // X.SLJ
    public final boolean LL() {
        Aweme aweme = this.LJLL.LJLIL;
        if (aweme != null) {
            if (C79146V4k.LJJJJI(aweme)) {
                Aweme aweme2 = this.LJLL.LJLIL;
                if (aweme2 != null) {
                    if (!C54838Lfe.LJJI(aweme2)) {
                        Z89 z89 = Z89.LIZIZ;
                        Aweme aweme3 = this.LJLL.LJLIL;
                        if (aweme3 != null) {
                            if (!z89.LIZIZ(aweme3)) {
                                return true;
                            }
                        } else {
                            o.LJIJI("aweme");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("aweme");
                    throw null;
                }
            }
            return false;
        }
        o.LJIJI("aweme");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71998SNm(GeofencingViewModel viewModel, Fragment fragment) {
        super(new C25600zU(fragment.getContext(), R.style.kp));
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = viewModel;
        LJLLLLLL(new C71917SKj(new C71997SNl(this, fragment)));
    }
}

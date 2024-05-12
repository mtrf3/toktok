package X;

import Y.AfS67S0100000_15;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.live.GoLiveActivity;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XrX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C86151XrX extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C86151XrX(GoLiveActivity goLiveActivity) {
        super(0, goLiveActivity, GoLiveActivity.class, "startCountdown", "startCountdown()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        View view;
        GoLiveActivity goLiveActivity = (GoLiveActivity) this.receiver;
        goLiveActivity.getClass();
        goLiveActivity.LLIIIJ(EnumC32529Cph.COUNTDOWN);
        Object obj = goLiveActivity.LJLJJI;
        if (obj != null && (view = ((Fragment) obj).getView()) != null) {
            view.setVisibility(4);
        }
        C29306Beo.LJJLJLI(goLiveActivity._$_findCachedViewById(R.id.bw5));
        goLiveActivity.LJLLI = true;
        goLiveActivity.LJLJL = (C73411SrX) C1EW.LIZ(AbstractC73672Svk.LJJIJIIJIL(0L, 4L, 0L, 1L, TimeUnit.SECONDS)).LJJJJZI(new AfS67S0100000_15(goLiveActivity, 67));
        return C76800UCe.LIZ;
    }
}

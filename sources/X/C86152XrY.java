package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.live.GoLiveActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XrY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C86152XrY extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C86152XrY(GoLiveActivity goLiveActivity) {
        super(0, goLiveActivity, GoLiveActivity.class, "stopCountdown", "stopCountdown()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        View view;
        GoLiveActivity goLiveActivity = (GoLiveActivity) this.receiver;
        Object obj = goLiveActivity.LJLJJI;
        if (obj != null) {
            view = ((Fragment) obj).getView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        C73411SrX c73411SrX = goLiveActivity.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        goLiveActivity.LLIIIJ(EnumC32529Cph.PREVIEW);
        C29306Beo.LJI(goLiveActivity._$_findCachedViewById(R.id.bw5));
        TextView textView = (TextView) goLiveActivity._$_findCachedViewById(R.id.bw5);
        if (textView != null) {
            textView.setText("3");
        }
        goLiveActivity.LJLLI = false;
        return C76800UCe.LIZ;
    }
}

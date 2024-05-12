package Y;

import X.ARI;
import X.AnonymousClass702;
import X.C226718v5;
import X.C26045AKb;
import X.C26227ARb;
import X.C38333F2r;
import X.C5S1;
import X.C64920Pds;
import X.C71Y;
import X.C7CZ;
import X.EF7;
import X.InterfaceC64592gB;
import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS35S0101000_3 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS35S0101000_3 afS35S0101000_3, Object obj) {
        String str;
        String str2;
        Throwable it = (Throwable) obj;
        int i = afS35S0101000_3.i1;
        if (i == 1 || i == 2) {
            CommentLikeViewModel commentLikeViewModel = (CommentLikeViewModel) afS35S0101000_3.l0;
            commentLikeViewModel.getClass();
            if (i == 1) {
                str = "like failed";
            } else {
                str = "unlike failed";
            }
            commentLikeViewModel.LJLILLLLZI.setValue(new AnonymousClass702(str, it));
            C71Y.LIZLLL("LikeAndHateView", "digg failed");
            commentLikeViewModel.hv0(i, false);
        } else if (i == 3 || i == 4) {
            CommentLikeViewModel commentLikeViewModel2 = (CommentLikeViewModel) afS35S0101000_3.l0;
            commentLikeViewModel2.getClass();
            if (i == 3) {
                str2 = "hate failed";
            } else {
                str2 = "unhate failed";
            }
            commentLikeViewModel2.LJLILLLLZI.setValue(new AnonymousClass702(str2, it));
            C71Y.LIZLLL("LikeAndHateView", "hate failed");
            commentLikeViewModel2.hv0(i, false);
        }
        CommentLikeViewModel commentLikeViewModel3 = (CommentLikeViewModel) afS35S0101000_3.l0;
        commentLikeViewModel3.LJLJI = false;
        o.LJIIIIZZ(it, "it");
        commentLikeViewModel3.LJLJLLL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    public static final void accept$1(AfS35S0101000_3 afS35S0101000_3, Object obj) {
        if (afS35S0101000_3.i1 == 1) {
            ((PowerPageSource) ((ProfileViewerViewModel) afS35S0101000_3.l0).LJLLL.getValue()).getOperator().refresh();
        } else {
            ((ProfileViewerViewModel) afS35S0101000_3.l0).hv0().postValue(new C226718v5(0, 3));
        }
    }

    public static final void accept$2(AfS35S0101000_3 afS35S0101000_3, Object obj) {
        switch (afS35S0101000_3.i1) {
            case 0:
                ((BaseFeedDataViewModel) afS35S0101000_3.l0).LL.setValue(obj);
                return;
            case 1:
                ((C7CZ) afS35S0101000_3.l0).onFailed();
                return;
            case 2:
                ((Application.ActivityLifecycleCallbacks) afS35S0101000_3.l0).onActivityDestroyed((Activity) obj);
                return;
            default:
                Activity activity = (Activity) afS35S0101000_3.l0;
                Throwable th = (Throwable) obj;
                activity.getClass();
                if (th instanceof C38333F2r) {
                    C38333F2r c38333F2r = (C38333F2r) th;
                    if (TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                        C26045AKb c26045AKb = new C26045AKb(activity);
                        c26045AKb.LJIIIIZZ(R.string.g5r);
                        c26045AKb.LJIIJ();
                        return;
                    } else {
                        ARI ari = new ARI(activity);
                        ari.LJI(R.string.sl_, null);
                        C26227ARb c26227ARb = new C26227ARb(activity);
                        c26227ARb.LIZIZ(c38333F2r.getErrorMsg());
                        c26227ARb.LJIIL = ari;
                        c26227ARb.LJI().LIZLLL();
                        return;
                    }
                }
                C5S1 c5s1 = new C5S1(activity);
                c5s1.LIZJ(R.string.imh);
                c5s1.LJ();
                return;
        }
    }

    public AfS35S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}

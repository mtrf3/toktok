package X;

import Y.AObserverS73S0100000_5;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZQ extends C08Z {
    public final /* synthetic */ CZR LIZ;

    public CZQ(CZR czr) {
        this.LIZ = czr;
    }

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        boolean z;
        IMessageManager iMessageManager;
        StarCommentViewModel starCommentViewModel;
        MutableLiveData<CVC> mutableLiveData;
        int i;
        long j;
        HashSet<String> hashSet;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDestroyed(fm, f);
        if (o.LJ(f, this.LIZ.LJLIL)) {
            CZR czr = this.LIZ;
            DataChannel dataChannel = czr.LJLILLLLZI;
            if (dataChannel != null) {
                StarCommentViewModel starCommentViewModel2 = czr.LJLJI;
                if (starCommentViewModel2 != null && (hashSet = starCommentViewModel2.LJLJLLL) != null) {
                    i = hashSet.size();
                } else {
                    i = 0;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_get_queue_request_all");
                CVJ.LIZLLL(LIZ, dataChannel);
                LIZ.LJIJJ(Integer.valueOf(CVJ.LIZ), "request_count");
                LIZ.LJIJJ(Integer.valueOf(CVJ.LIZIZ), "success_count");
                LIZ.LJIJJ(Integer.valueOf(CVJ.LIZJ), "msg_count");
                LIZ.LJIJJ(Integer.valueOf(i), "display_count");
                int i2 = CVJ.LIZ;
                if (i2 != 0) {
                    j = CVJ.LIZLLL / i2;
                } else {
                    j = 0;
                }
                LIZ.LJIJJ(Long.valueOf(j), "avg_duration");
                C28289B8j.LIZJ(SystemClock.elapsedRealtime(), CVJ.LJFF, LIZ, "live_duration");
                CVJ.LIZ = 0;
                CVJ.LIZIZ = 0;
                CVJ.LIZJ = 0;
                CVJ.LIZLLL = 0L;
                CVJ.LJ = 0L;
                CVJ.LJFF = 0L;
                CVJ.LJI.clear();
            }
            CZR czr2 = this.LIZ;
            DataChannel dataChannel2 = czr2.LJLILLLLZI;
            if (dataChannel2 != null) {
                Fragment observerOwner = czr2.LJLIL;
                o.LJIIIZ(observerOwner, "observerOwner");
                dataChannel2.jv0(observerOwner);
            }
            if (czr2.LJLLLLLL == 3) {
                z = true;
            } else {
                z = false;
            }
            C78855Ux9.LJLJLLL = z;
            czr2.LJLLI = null;
            czr2.LJLLILLLL = CZV.UNKNOWN;
            czr2.LJLLJ = false;
            czr2.LJLLL = 0;
            czr2.LJLJLLL.clear();
            czr2.LJLL.clear();
            CVE.LIZ = false;
            czr2.LJLLLL.removeMessages(1);
            AObserverS73S0100000_5 aObserverS73S0100000_5 = czr2.LJZI;
            if (aObserverS73S0100000_5 != null && (starCommentViewModel = czr2.LJLJI) != null && (mutableLiveData = starCommentViewModel.LJLILLLLZI) != null) {
                mutableLiveData.removeObserver(aObserverS73S0100000_5);
            }
            StarCommentViewModel starCommentViewModel3 = czr2.LJLJI;
            if (starCommentViewModel3 != null) {
                starCommentViewModel3.LJLLILLLL.removeMessages(1);
                starCommentViewModel3.LJLLILLLL.removeMessages(2);
            }
            IMessageManager iMessageManager2 = czr2.LJLJJLL;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(EnumC31509CYf.STAR_COMMENT_PUSH_MESSAGE.getIntType(), czr2);
            }
            IMessageManager iMessageManager3 = czr2.LJLJJLL;
            if (iMessageManager3 != null) {
                iMessageManager3.removeMessageListener(EnumC31509CYf.MEMBER.getIntType(), czr2);
            }
            if (czr2.LJLLLLLL == 1 && (iMessageManager = czr2.LJLJJLL) != null) {
                iMessageManager.removeMessageListener(EnumC31509CYf.STAR_COMMENT_NOTIFICATION_MESSAGE.getIntType(), czr2);
            }
            CZN czn = czr2.LJLZ;
            if (czn != null) {
                czn.LIZ.LJLILLLLZI.removeObserver(czn.LJIILIIL);
                czn.LIZ.LJLJJI.removeObserver(czn.LJIILJJIL);
                czn.LIZ.LJLIL.removeObserver(czn.LJIILL);
            }
            CZO czo = czr2.LJZ;
            if (czo != null) {
                czo.LIZ.LJLILLLLZI.removeObserver(czo.LJIIJ);
                czo.LIZ.LJLJJI.removeObserver(czo.LJIIJJI);
                czo.LIZ.LJLIL.removeObserver(czo.LJIIL);
            }
            this.LIZ.LJLIL.requireFragmentManager().LJLJJLL(this);
        }
    }
}

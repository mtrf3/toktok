package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;

/* loaded from: classes10.dex */
public final class MDG implements View.OnClickListener {
    public final /* synthetic */ C56818MRq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public MDG(C56818MRq c56818MRq, boolean z) {
        this.LJLIL = c56818MRq;
        this.LJLILLLLZI = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NoticeChannelInfo noticeChannelInfo;
        String str;
        C56818MRq c56818MRq = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        MusNotice musNotice = c56818MRq.LJLJJL;
        if (musNotice != null && (noticeChannelInfo = musNotice.channelInfo) != null) {
            int i = noticeChannelInfo.group;
            int i2 = musNotice.channelCategory;
            StringBuilder LIZJ = C06460Ne.LIZJ("onUnsubscribeItem group = ", i, ", category = ", i2, ", isUnsubscribe = ");
            HH1.LIZIZ(LIZJ, z, LIZJ, "NoticeCardAdapter");
            MD7.LIZIZ(i, i2, z, new MDF(c56818MRq), null, (C73318Sq2) c56818MRq.LJLJJI.getValue());
        }
        FragmentManager fragmentManager = this.LJLIL.LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            Fragment LJJJIL = fragmentManager.LJJJIL("NoticeCardAdapter");
            if (LJJJIL != null) {
                c1b3.LJJI(LJJJIL);
                c1b3.LJI();
            }
        }
        if (this.LJLILLLLZI) {
            str = "subscribed";
        } else {
            str = "unsubscribed";
        }
        this.LJLIL.LJLZ(str);
    }
}

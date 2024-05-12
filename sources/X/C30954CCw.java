package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.PerksPinPanel;
import webcast.api.sub.SubGoal;
import webcast.api.sub.SubscriberCountInfo;

/* renamed from: X.CCw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30954CCw {
    public final PerksPinPanel LIZ;
    public final webcast.api.sub.Tip LIZIZ;
    public final List<SubscriberCountInfo> LIZJ;
    public final SubGoal LIZLLL;
    public final LiveSubOnlyConfig LJ;
    public final TimerDetail LJFF;
    public final boolean LJI;
    public final SubGifInfo LJII;
    public final SubLiveBanner LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30954CCw)) {
            return false;
        }
        C30954CCw c30954CCw = (C30954CCw) obj;
        return o.LJ(this.LIZ, c30954CCw.LIZ) && o.LJ(this.LIZIZ, c30954CCw.LIZIZ) && o.LJ(this.LIZJ, c30954CCw.LIZJ) && o.LJ(this.LIZLLL, c30954CCw.LIZLLL) && o.LJ(this.LJ, c30954CCw.LJ) && o.LJ(this.LJFF, c30954CCw.LJFF) && this.LJI == c30954CCw.LJI && o.LJ(this.LJII, c30954CCw.LJII) && o.LJ(this.LJIIIIZZ, c30954CCw.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PerksPinPanel perksPinPanel = this.LIZ;
        int hashCode = (perksPinPanel == null ? 0 : perksPinPanel.hashCode()) * 31;
        webcast.api.sub.Tip tip = this.LIZIZ;
        int hashCode2 = (hashCode + (tip == null ? 0 : tip.hashCode())) * 31;
        List<SubscriberCountInfo> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SubGoal subGoal = this.LIZLLL;
        int hashCode4 = (hashCode3 + (subGoal == null ? 0 : subGoal.hashCode())) * 31;
        LiveSubOnlyConfig liveSubOnlyConfig = this.LJ;
        int hashCode5 = (hashCode4 + (liveSubOnlyConfig == null ? 0 : liveSubOnlyConfig.hashCode())) * 31;
        TimerDetail timerDetail = this.LJFF;
        int hashCode6 = (hashCode5 + (timerDetail == null ? 0 : timerDetail.hashCode())) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        SubGifInfo subGifInfo = this.LJII;
        int hashCode7 = (i2 + (subGifInfo == null ? 0 : subGifInfo.hashCode())) * 31;
        SubLiveBanner subLiveBanner = this.LJIIIIZZ;
        return hashCode7 + (subLiveBanner != null ? subLiveBanner.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscriptionCommunityData(perksPinPanel=");
        LIZ.append(this.LIZ);
        LIZ.append(", tip=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", countInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", subGoal=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", liveSubOnlyConfig=");
        LIZ.append(this.LJ);
        LIZ.append(", timerDetail=");
        LIZ.append(this.LJFF);
        LIZ.append(", enableSubWave=");
        LIZ.append(this.LJI);
        LIZ.append(", giftSub=");
        LIZ.append(this.LJII);
        LIZ.append(", banner=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C30954CCw(PerksPinPanel perksPinPanel, webcast.api.sub.Tip tip, List<SubscriberCountInfo> list, SubGoal subGoal, LiveSubOnlyConfig liveSubOnlyConfig, TimerDetail timerDetail, boolean z, SubGifInfo subGifInfo, SubLiveBanner subLiveBanner) {
        this.LIZ = perksPinPanel;
        this.LIZIZ = tip;
        this.LIZJ = list;
        this.LIZLLL = subGoal;
        this.LJ = liveSubOnlyConfig;
        this.LJFF = timerDetail;
        this.LJI = z;
        this.LJII = subGifInfo;
        this.LJIIIIZZ = subLiveBanner;
    }
}

package X;

import Y.ARunnableS16S0110000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.NLr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59211NLr implements Observer<C207668Da>, NQB {
    public FrameLayout LJLIL;
    public final C59214NLu LJLILLLLZI;
    public FeedAdLynxCard LJLJI;
    public DataCenter LJLJJI;
    public final Handler LJLJJL;
    public boolean LJLJJLL;
    public Aweme LJLJL;
    public Aweme LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;

    @Override // X.NQB
    public final void LIZIZ() {
        FeedAdLynxCard feedAdLynxCard = this.LJLJI;
        if (feedAdLynxCard != null && feedAdLynxCard.LJIIIIZZ()) {
            this.LJLJI = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    @Override // X.NQB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59211NLr.LIZJ():void");
    }

    @Override // X.NQB
    public final void LJI() {
        FeedAdLynxCard feedAdLynxCard = this.LJLJI;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJII();
        }
    }

    @Override // X.NQB
    public final void LJJJJLL() {
        C59214NLu c59214NLu = this.LJLILLLLZI;
        Aweme aweme = this.LJLJLJ;
        Context context = c59214NLu.LIZ().getContext();
        if (context == null || aweme == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c59214NLu.LIZ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.isMixAweme()) {
            marginLayoutParams.bottomMargin = C63081OpJ.LJIJJLI(context, 32.0f) + marginLayoutParams.bottomMargin;
        }
        c59214NLu.LIZ().setLayoutParams(marginLayoutParams);
    }

    @Override // X.NQB
    public final NSW LJIIIIZZ() {
        return this.LJLJI;
    }

    public C59211NLr(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LJLILLLLZI = new C59214NLu(rootView);
        this.LJLJJL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.NQB
    public final void LIZ(boolean z) {
        FrameLayout frameLayout;
        int i;
        if (!C63081OpJ.LLI(this.LJLJLJ)) {
            return;
        }
        this.LJLLI = z;
        if (!this.LJLJLLL || (frameLayout = this.LJLIL) == null) {
            return;
        }
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
    }

    @Override // X.NQB
    public final void LIZLLL(Aweme aweme) {
        String str;
        if (aweme != null) {
            if (aweme.isAd() || C63081OpJ.LLIFFJFJJ(aweme)) {
                if (!C63081OpJ.LLI(aweme) || C63081OpJ.LJJLI(aweme)) {
                    Aweme aweme2 = this.LJLJLJ;
                    if (aweme2 != null) {
                        this.LJLJL = aweme2;
                    }
                    this.LJLJLJ = null;
                    FeedAdLynxCard feedAdLynxCard = this.LJLILLLLZI.LIZIZ;
                    if (feedAdLynxCard != null) {
                        feedAdLynxCard.LIZIZ(null);
                        return;
                    }
                    return;
                }
                this.LJLJLJ = aweme;
                C59214NLu c59214NLu = this.LJLILLLLZI;
                if (aweme != null) {
                    aweme.getAwemeRawAd();
                }
                this.LJLIL = c59214NLu.LIZ();
                C59214NLu c59214NLu2 = this.LJLILLLLZI;
                FeedAdLynxCard feedAdLynxCard2 = c59214NLu2.LIZIZ;
                if (feedAdLynxCard2 != null) {
                    feedAdLynxCard2.LJIIIIZZ();
                }
                c59214NLu2.LIZIZ = null;
                C59214NLu c59214NLu3 = this.LJLILLLLZI;
                c59214NLu3.getClass();
                if (c59214NLu3.LIZIZ == null) {
                    FrameLayout LIZ = c59214NLu3.LIZ();
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    c59214NLu3.LIZIZ = new FeedAdLynxCard(this, LIZ, str);
                }
                FeedAdLynxCard feedAdLynxCard3 = c59214NLu3.LIZIZ;
                this.LJLJI = feedAdLynxCard3;
                if (feedAdLynxCard3 != null) {
                    feedAdLynxCard3.LIZIZ(aweme);
                }
                this.LJLL = false;
                this.LJLLILLLL = null;
                this.LJLJLLL = false;
                this.LJLILLLLZI.LIZ().setVisibility(8);
                this.LJLJJL.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // X.NQB
    public final void LJJIFFI(DataCenter dataCenter) {
        this.LJLJJI = dataCenter;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
            dataCenter.iv0("ad_comment_dialog_visible", this, false);
            dataCenter.iv0("ad_share_dialog_visible", this, false);
            dataCenter.iv0("ad_video_on_resume_play", this, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        String str2;
        FeedAdLynxCard feedAdLynxCard;
        Aweme aweme;
        Aweme aweme2;
        C207668Da c207668Da2 = c207668Da;
        String str3 = null;
        if (c207668Da2 != null) {
            C59213NLt c59213NLt = C59213NLt.LIZ;
            if (C59213NLt.LIZJ && o.LJ(c207668Da2.LIZ, "ad_feed_on_page_unselected")) {
                C59213NLt.LIZIZ = null;
                EventBus.LIZJ().LJIJ(c59213NLt);
                C59213NLt.LIZJ = false;
            }
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 == null || !C63081OpJ.LLI(aweme3)) {
            if (c207668Da2 != null) {
                str = c207668Da2.LIZ;
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, "ad_feed_on_page_unselected") || o.LJ(this.LJLJL, this.LJLJLJ)) {
                return;
            }
        }
        if (c207668Da2 == null || (str2 = c207668Da2.LIZ) == null) {
            return;
        }
        switch (str2.hashCode()) {
            case -2033402377:
                if (!str2.equals("ad_comment_dialog_visible")) {
                    return;
                }
                Object obj = c207668Da2.LIZIZ;
                if (obj == null) {
                    obj = null;
                }
                o.LJIIIIZZ(obj, "kvData.getData()");
                if (((Boolean) obj).booleanValue()) {
                    str3 = "comment_block";
                }
                this.LJLLILLLL = str3;
                return;
            case -1540531799:
                if (!str2.equals("ad_feed_on_page_unselected")) {
                    return;
                }
                Aweme aweme4 = this.LJLJLJ;
                if ((aweme4 == null || !C63081OpJ.LLI(aweme4)) && ((((aweme = this.LJLJLJ) != null && C63081OpJ.LLI(aweme)) || (aweme2 = this.LJLJL) == null || !C63081OpJ.LLI(aweme2)) && !C59406NTe.LJIILIIL(this.LJLJLJ))) {
                    return;
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10(this, 112), 200L);
                FeedAdLynxCard feedAdLynxCard2 = this.LJLJI;
                if (feedAdLynxCard2 != null) {
                    feedAdLynxCard2.LJIIL(8);
                }
                FeedAdLynxCard feedAdLynxCard3 = this.LJLJI;
                if (feedAdLynxCard3 != null) {
                    feedAdLynxCard3.LJ();
                }
                this.LJLL = false;
                this.LJLLILLLL = null;
                this.LJLJLLL = false;
                this.LJLILLLLZI.LIZ().setVisibility(8);
                this.LJLJJL.removeCallbacksAndMessages(null);
                return;
            case -1282907273:
                if (!str2.equals("ad_share_dialog_visible")) {
                    return;
                }
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 == null) {
                    obj2 = null;
                }
                o.LJIIIIZZ(obj2, "kvData.getData()");
                if (((Boolean) obj2).booleanValue()) {
                    str3 = "share_block";
                }
                this.LJLLILLLL = str3;
                return;
            case -1132409520:
                if (!str2.equals("ad_feed_on_page_selected")) {
                    return;
                }
                FeedAdLynxCard feedAdLynxCard4 = this.LJLJI;
                if (feedAdLynxCard4 != null) {
                    feedAdLynxCard4.LIZ();
                }
                this.LJLJL = this.LJLJLJ;
                return;
            case 1512987055:
                if (!str2.equals("ad_feed_video_params")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != 0) {
                    str3 = obj3;
                }
                o.LJIIIIZZ(str3, "kvData.getData()");
                return;
            case 2040441990:
                if (!str2.equals("ad_video_on_resume_play") || (feedAdLynxCard = this.LJLJI) == null) {
                    return;
                }
                feedAdLynxCard.LJI();
                return;
            default:
                return;
        }
    }

    @Override // X.NQB
    public final void LJ(long j, boolean z) {
        Aweme aweme;
        User author;
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && C63081OpJ.LLI(aweme2)) {
            Aweme aweme3 = this.LJLJLJ;
            if ((aweme3 != null && C63081OpJ.LJJLI(aweme3)) || this.LJLJLLL) {
                return;
            }
            Aweme aweme4 = this.LJLJLJ;
            if (aweme4 == null || !C63081OpJ.LLJJJJ(aweme4) || ((aweme = this.LJLJLJ) != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 0)) {
                this.LJLJJL.postDelayed(new ARunnableS16S0110000_10(this, z, 1), j);
            }
        }
    }

    @Override // X.NQB
    public final void LJFF(int i, int i2, int i3) {
        FeedAdLynxCard feedAdLynxCard = this.LJLJI;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJIIJJI(i, i2, i3);
        }
    }

    @Override // X.NQB
    public final void LJII(int i, int i2, String str) {
        FeedAdLynxCard feedAdLynxCard = this.LJLJI;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJIIJ(i, i2, str);
        }
    }
}

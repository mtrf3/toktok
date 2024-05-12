package X;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class LQ7 extends JHM {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public int LJIL;
    public int LJJ;
    public String LJJI;
    public boolean LJJIFFI;
    public String LJJII;
    public String LJJIII;

    @Override // X.JHM
    public final void LJII() {
        int i;
        String str = this.LJIILJJIL;
        C1798874e c1798874e = InterfaceC1798974f.LIZIZ;
        LJ("group_id", str, c1798874e);
        LJ("author_id", this.LJIILL, c1798874e);
        if (this.LIZ == "enter_homepage_follow") {
            LIZLLL("is_casting", Boolean.toString(this.LJJIFFI));
            LIZLLL("casting_session_id", this.LJJII);
        }
        if ((((Boolean) C35107DqB.LIZIZ.getValue()).booleanValue() && System.currentTimeMillis() - LQ9.LIZ <= 3000) || (!((Boolean) C35103Dq7.LIZIZ.getValue()).booleanValue() && ((!((Boolean) C35103Dq7.LIZJ.getValue()).booleanValue() || !C56662Kg.LIZ().LIZLLL) && (!((Boolean) C35103Dq7.LIZLLL.getValue()).booleanValue() || C56662Kg.LIZ().LIZLLL)))) {
            try {
                i = C16880lQ.LLJJL((ActivityManager) C16880lQ.LLILL(EF7.LIZIZ(), "activity"), new int[]{Process.myPid()})[0].getTotalPss();
            } catch (Throwable unused) {
                i = 0;
            }
            this.LJIJJ = String.valueOf(i / 1024);
        }
        LIZLLL("memory_usage", this.LJIJJ);
        LIZLLL("local_time_ms", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            LJ("enter_method", this.LJIILLIIL, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJ("previous_page", this.LJIIZILJ, InterfaceC1798974f.LIZ);
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            String str2 = this.LIZLLL;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1382453013:
                    if (str2.equals("NOTIFICATION")) {
                        this.LIZLLL = "notice";
                        break;
                    }
                    break;
                case 2614219:
                    if (str2.equals("USER")) {
                        this.LIZLLL = "profile";
                        break;
                    }
                    break;
                case 482617583:
                    if (str2.equals("PUBLISH")) {
                        this.LIZLLL = "shoot";
                        break;
                    }
                    break;
                case 1055811561:
                    if (str2.equals("DISCOVER")) {
                        this.LIZLLL = "discover";
                        break;
                    }
                    break;
            }
            LIZLLL("enter_from", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LIZLLL("music_id", this.LJIJ);
        }
        if (!TextUtils.isEmpty(this.LJJIII)) {
            LIZLLL("follow_status", this.LJJIII);
        }
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LIZLLL("notice_type", this.LJIJI);
        }
        if (!TextUtils.isEmpty(this.LJJI)) {
            LIZLLL("topic_tab_name", this.LJJI);
        }
        if ("enter_homepage_nearby".equals(this.LIZ)) {
            HashMap<String, String> LJIL = LQA.LIZIZ.LJIL();
            if (LJIL != null) {
                for (Map.Entry<String, String> entry : LJIL.entrySet()) {
                    LIZLLL(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, String> entry2 : LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave().entrySet()) {
                LIZLLL(entry2.getKey(), entry2.getValue());
            }
            LQA lqa = LQA.LIZIZ;
            lqa.LJIJJ(this.LIZIZ);
            lqa.LJIILL();
        }
        if ("enter_homepage_explore".equals(this.LIZ)) {
            C54047LJb.LIZIZ.LIZLLL(this.LIZLLL, this.LJIILLIIL, this.LIZIZ);
        }
        LIZLLL("from_inbox_page", this.LJIJJLI);
        int i2 = this.LJIL;
        if (i2 == 1) {
            LIZJ(i2, "live_notice_type");
        }
        int i3 = this.LJIL;
        if (i3 == 2) {
            LIZJ(i3, "live_notice_type");
            LIZJ(this.LJJ, "anchor_bubble_num");
        }
    }

    public LQ7(String str) {
        super(str);
        this.LJIJJ = "";
        this.LJIJJLI = "";
        this.LJIL = -1;
        this.LJJI = "";
        this.LJJII = "";
        this.LJI = true;
    }

    public final void LJIILLIIL(Aweme aweme) {
        if (aweme != null) {
            this.LJIILJJIL = aweme.getAid();
            this.LJIILL = aweme.getAuthorUid();
            this.LJJIII = C227768wm.LJIIIIZZ(aweme);
        }
    }

    public final void LJIILL(String str, Integer num, Integer num2, Integer num3) {
        if (C53295Kvr.LIZIZ()) {
            LIZLLL("is_top_tab", CardStruct.IStatusCode.DEFAULT);
        } else {
            LIZLLL("is_top_tab", "1");
        }
        if (str == null) {
            return;
        }
        LIZLLL("notice_type", str);
        LIZJ(num.intValue(), "number_cnt");
        LIZJ(num2.intValue(), "number_cnt_single");
        LIZJ(num3.intValue(), "number_cnt_mutual");
    }
}

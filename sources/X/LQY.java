package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class LQY implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ Fragment LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C68322mC<String> LJLJLJ;

    public LQY(boolean z, int i, int i2, int i3, Fragment fragment, String str, String str2, C68322mC<String> c68322mC) {
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = fragment;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = c68322mC;
    }

    public final void LIZ() {
        String str;
        String str2;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        HashMap LIZJ = C03660Ck.LIZJ("is_live", CardStruct.IStatusCode.DEFAULT);
        if (this.LJLIL && this.LJLILLLLZI > 0) {
            LIZJ.put("notice_type", "bubble");
            if (this.LJLJI > 0) {
                str3 = "1";
            }
            LIZJ.put("is_live", str3);
            LIZJ.put("show_cnt", String.valueOf(this.LJLILLLLZI));
        } else if (this.LJLILLLLZI > 0) {
            LIZJ.put("notice_type", "number_dot");
            LIZJ.put("show_cnt", String.valueOf(this.LJLILLLLZI));
        } else if (this.LJLJJI > 0) {
            LIZJ.put("notice_type", "yellow_dot");
            LIZJ.put("show_cnt", String.valueOf(this.LJLJJI));
            if (this.LJLJI > 0) {
                str3 = "1";
            }
            LIZJ.put("is_live", str3);
        } else {
            LIZJ.put("notice_type", "report_null");
            LIZJ.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
        }
        LIZJ.put("message_cnt", String.valueOf(C54362LVe.LJIILJJIL(99)));
        LIZJ.put("recommended_chat_cnt", String.valueOf(((IImInboxDmService) C54362LVe.LIZLLL.getValue()).getDMRecommendedChatCount()));
        Fragment fragment = this.LJLJJL;
        if ((fragment instanceof LQZ) || (fragment instanceof AX8)) {
            str = "chat";
        } else {
            str = "all";
        }
        LIZJ.put("tab_name", str);
        LIZJ.put("is_auth_show", this.LJLJJLL);
        LIZJ.put("enter_from", this.LJLJL);
        LIZJ.put("previous_page", this.LJLJL);
        LIZJ.put("to_inbox_page", this.LJLJLJ.element);
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        LIZJ.put("enter_method", c55888Lwa.LJJIJ());
        if (c55888Lwa.LJIIZILJ()) {
            if (c55888Lwa.LJJI(false)) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            LIZJ.put("creator_inbox_status", str2);
        }
        FMX.LJIIL("enter_homepage_message", LIZJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

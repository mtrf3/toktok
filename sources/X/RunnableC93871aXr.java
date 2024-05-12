package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aXr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93871aXr implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ C9A8 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC93871aXr(ActivityC45651qj activityC45651qj, C9A8 c9a8, String str, String str2) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = c9a8;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    public final void LIZ() {
        String str;
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(R.string.dtj);
        c26045AKb.LJIIJ();
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspPlatform dspPlatform = DspPlatform.AMAZON_MUSIC;
        Boolean bool = Boolean.FALSE;
        if (this.LJLILLLLZI == C9A8.ENTER_FROM_SETTINGS) {
            str = "link";
        } else {
            str = "";
        }
        C94302aeo.LJJIII(c94302aeo, CardStruct.IStatusCode.DEFAULT, "unknown_exception", dspPlatform, null, bool, true, str, this.LJLJI, this.LJLJJI);
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

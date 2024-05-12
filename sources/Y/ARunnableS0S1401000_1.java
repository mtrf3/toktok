package Y;

import X.C16880lQ;
import X.C188727au;
import X.C47497IkX;
import X.C68322mC;
import X.C76732zl;
import X.C769130d;
import X.FMX;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.PostModeServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes2.dex */
public class ARunnableS0S1401000_1 implements Runnable {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Aweme aweme;
        Context context;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c2c, C16880lQ.LLZIL(((View) this.l1).getContext()), null);
        Integer LJFF = ((PostModeServiceImpl) this.l2).LJFF();
        if (LJFF != null && (aweme = (Aweme) this.l3) != null && !aweme.isAd() && (context = ((View) this.l1).getContext()) != null) {
            ((TextView) LLLZIIL.findViewById(R.id.m_d)).setText(context.getString(LJFF.intValue()));
        }
        C16880lQ.LJIIJ(new ACListenerS41S1100000_1((Aweme) this.l3, this.s0, 0), LLLZIIL);
        View view = (View) this.l1;
        view.post(new ARunnableS2S0301000_1(view, this.i5, LLLZIIL, (InterfaceC88472Yns) this.l4, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        String str;
        Integer num;
        String str2;
        Integer num2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.s0);
        c188727au.LJ(C769130d.LIZ, "from_duration");
        Aweme aweme = (Aweme) ((C68322mC) this.l1).element;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = (Aweme) ((C68322mC) this.l1).element;
        if (aweme2 != null) {
            num = Integer.valueOf(aweme2.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "group_id_type");
        Aweme aweme3 = (Aweme) ((C68322mC) this.l2).element;
        if (aweme3 != null) {
            str2 = aweme3.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("from_group_id", str2);
        Aweme aweme4 = (Aweme) ((C68322mC) this.l2).element;
        if (aweme4 != null) {
            num2 = Integer.valueOf(aweme4.getAwemeType());
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "from_group_id_type");
        Context context = (Context) this.l3;
        if (context != null) {
            str3 = C16880lQ.LLJILLL(context);
        }
        c188727au.LJIIIZ("access_type", str3);
        c188727au.LIZLLL(C47497IkX.LIZJ(), "internet_speed");
        c188727au.LIZLLL(((C76732zl) this.l4).element, "unusual_vod_count");
        c188727au.LJIIIZ("os", "android");
        c188727au.LIZLLL(this.i5, "if_success");
        FMX.LJIIL("prf_feed_loading", c188727au.LIZ);
        C769130d.LIZ = -1L;
    }

    public static final void run$0(ARunnableS0S1401000_1 aRunnableS0S1401000_1) {
        boolean LIZ;
        try {
            aRunnableS0S1401000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1401000_1 aRunnableS0S1401000_1) {
        boolean LIZ;
        try {
            aRunnableS0S1401000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1401000_1(View view, PostModeServiceImpl postModeServiceImpl, Aweme aweme, String str, AqS169S0100000_3 aqS169S0100000_3, int i) {
        this.$t = i;
        this.l1 = view;
        this.l2 = postModeServiceImpl;
        this.l3 = aweme;
        this.s0 = str;
        this.i5 = R.id.n90;
        this.l4 = aqS169S0100000_3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S1401000_1(String str, String str2, C68322mC<Aweme> c68322mC, C68322mC<Aweme> c68322mC2, Context context, C76732zl c76732zl, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c68322mC;
        this.l3 = c68322mC2;
        this.l4 = context;
        this.i5 = c76732zl;
    }
}

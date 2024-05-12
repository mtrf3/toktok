package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C245749kg;
import X.C26045AKb;
import X.C26073ALd;
import X.C2U8;
import X.C76800UCe;
import X.InterfaceC26071ALb;
import X.InterfaceC88472Yns;
import X.Q8U;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class AqS0S4400000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ARN it) {
        o.LJIIIZ(it, "it");
        String string = ((Activity) this.l4).getString(R.string.cap);
        if (string == null) {
            string = "";
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{((User) this.l5).getUniqueId()}, 1, string, "format(format, *args)");
        C26045AKb c26045AKb = new C26045AKb((Activity) this.l4);
        c26045AKb.LJIIIZ(LIZIZ);
        c26045AKb.LJIIJ();
        String uid = ((User) this.l5).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String secUid = ((User) this.l5).getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        C2U8.LIZ(new C245749kg(uid, secUid));
        C26073ALd.LJ((Activity) this.l4, (User) this.l5, (InterfaceC26071ALb) this.l6, this.s0, this.s1, this.s2, this.s3, (AwemeRawAd) this.l7);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS0S4400000_4 aqS0S4400000_4, Object obj) {
        aqS0S4400000_4.invoke$0((ARN) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S4400000_4 aqS0S4400000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.j9q, new AqS0S4400000_4((Activity) aqS0S4400000_4.l4, (User) aqS0S4400000_4.l5, (InterfaceC26071ALb) aqS0S4400000_4.l6, aqS0S4400000_4.s0, aqS0S4400000_4.s1, aqS0S4400000_4.s2, aqS0S4400000_4.s3, (AwemeRawAd) aqS0S4400000_4.l7, 0));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S4400000_4(Activity activity, User user, InterfaceC26071ALb interfaceC26071ALb, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, int i) {
        super(1);
        this.$t = i;
        this.l4 = activity;
        this.l5 = user;
        this.l6 = interfaceC26071ALb;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l7 = awemeRawAd;
    }
}

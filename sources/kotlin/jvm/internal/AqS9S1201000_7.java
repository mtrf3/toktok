package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43882HKc;
import X.C43933HMb;
import X.C45500HtQ;
import X.C45501HtR;
import X.C45804HyK;
import X.C6BK;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;

/* loaded from: classes8.dex */
public class AqS9S1201000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S1201000_7 aqS9S1201000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        ChooseMediaExtensionKt.LIZIZ(info, (MediaModel) aqS9S1201000_7.l1);
        C45501HtR c45501HtR = (C45501HtR) aqS9S1201000_7.l2;
        c45501HtR.LLIL = false;
        MediaModel mediaModel = (MediaModel) aqS9S1201000_7.l1;
        String str = info.LJLILLLLZI;
        int i = info.LJLJJL;
        long j = info.LJLJI;
        String str2 = aqS9S1201000_7.s0;
        String str3 = info.LJLJJLL;
        int i2 = aqS9S1201000_7.i3;
        Activity activity = c45501HtR.mActivity;
        if (activity != null && c45501HtR.LJLIL) {
            C45804HyK.LJJLIIIJJI(activity, i, (int) c45501HtR.LLILII, i2, 16);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", String.valueOf(i));
            c6bk.LIZ.put("errorMsg", str3);
            C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
            C45501HtR.LLJLLIL(mediaModel, str, 1, i, j, str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S1201000_7 aqS9S1201000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        ChooseMediaExtensionKt.LIZIZ(info, (MediaModel) aqS9S1201000_7.l1);
        C45500HtQ c45500HtQ = (C45500HtQ) aqS9S1201000_7.l2;
        c45500HtQ.LLILIL = false;
        MediaModel mediaModel = (MediaModel) aqS9S1201000_7.l1;
        String str = info.LJLILLLLZI;
        int i = info.LJLJJL;
        long j = info.LJLJI;
        String str2 = aqS9S1201000_7.s0;
        String str3 = info.LJLJJLL;
        int i2 = aqS9S1201000_7.i3;
        Activity activity = c45500HtQ.mActivity;
        if (activity != null && c45500HtQ.LJLIL) {
            C45804HyK.LJJLIIIJJI(activity, i, (int) c45500HtQ.LLILLL, i2, 16);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("errorCode", String.valueOf(i));
            c6bk.LIZ.put("errorMsg", str3);
            C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
            C45500HtQ.LLJLLL(mediaModel, str, 1, i, j, str2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S1201000_7(MediaModel mediaModel, C45500HtQ c45500HtQ, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mediaModel;
        this.l2 = c45500HtQ;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S1201000_7(MediaModel mediaModel, C45501HtR c45501HtR, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mediaModel;
        this.l2 = c45501HtR;
        this.s0 = str;
        this.i3 = i;
    }
}

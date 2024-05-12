package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C25620zW;
import X.C51029K0z;
import X.C62675Oil;
import X.C62676Oim;
import X.C66482Q7i;
import X.C66491Q7r;
import X.C66493Q7t;
import X.C66532Q9g;
import X.C66604QCa;
import X.C68322mC;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.PZQ;
import X.Q7O;
import X.Q80;
import X.Q81;
import X.Q82;
import X.Q83;
import X.Q8F;
import X.Q96;
import X.Q97;
import X.QCY;
import X.QCZ;
import X.X1D;
import android.app.Activity;
import android.net.Uri;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class AqS71S0400000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS71S0400000_11 aqS71S0400000_11) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("URLConnectionModifier get request body, delegate:", "javaClass", " url:");
        LIZIZ.append(((PZQ) aqS71S0400000_11.l2).LJFF.getURL());
        LIZIZ.append(" body:");
        LIZIZ.append(((C68322mC) aqS71S0400000_11.l0).element.getClass().getName());
        LIZIZ.append(" sink:");
        LIZIZ.append(((C68322mC) aqS71S0400000_11.l1).element.getClass().getName());
        return X1D.LIZIZ(LIZIZ);
    }

    public static final Object invoke$1(AqS71S0400000_11 aqS71S0400000_11) {
        boolean z;
        Q83 q83 = new Q83();
        C62676Oim c62676Oim = (C62676Oim) aqS71S0400000_11.l0;
        q83.LIZ = c62676Oim.LIZ;
        q83.LJI = c62676Oim.LIZIZ;
        ShareLinkContent shareLinkContent = new ShareLinkContent(q83);
        Q7O q7o = new Q7O((Activity) aqS71S0400000_11.l1);
        C66493Q7t.LIZ(q7o, (Q97) aqS71S0400000_11.l2, (Q82) aqS71S0400000_11.l3);
        if (q7o.LIZ(shareLinkContent)) {
            q7o.LIZLLL(shareLinkContent);
            z = true;
        } else {
            z = false;
        }
        return C66532Q9g.LIZ(Boolean.valueOf(z));
    }

    public static final Object invoke$2(AqS71S0400000_11 aqS71S0400000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "shareLink";
        q96.LIZJ = C113554cx.LJJL(new OSZ("contentUrl", ((C62676Oim) aqS71S0400000_11.l0).LIZ), new OSZ("quote", ((C62676Oim) aqS71S0400000_11.l0).LIZIZ));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524610");
        return C85999Xp5.LJ(q96.LIZ(), QCY.LJLIL, new AqS71S0400000_11((C62676Oim) aqS71S0400000_11.l0, (C62676Oim) aqS71S0400000_11.l1, (Activity) aqS71S0400000_11.l2, (Q97) aqS71S0400000_11.l3, (Q82<Q8F>) 1));
    }

    public static final Object invoke$3(AqS71S0400000_11 aqS71S0400000_11) {
        boolean z;
        C66491Q7r c66491Q7r = new C66491Q7r();
        c66491Q7r.LIZLLL = (Uri) aqS71S0400000_11.l0;
        SharePhoto sharePhoto = new SharePhoto(c66491Q7r);
        C66482Q7i c66482Q7i = new C66482Q7i();
        List<SharePhoto> list = c66482Q7i.LJI;
        C66491Q7r c66491Q7r2 = new C66491Q7r();
        c66491Q7r2.LIZ(sharePhoto);
        ((ArrayList) list).add(new SharePhoto(c66491Q7r2));
        SharePhotoContent sharePhotoContent = new SharePhotoContent(c66482Q7i);
        Q7O q7o = new Q7O((Activity) aqS71S0400000_11.l1);
        C66493Q7t.LIZ(q7o, (Q97) aqS71S0400000_11.l2, (Q82) aqS71S0400000_11.l3);
        if (q7o.LIZ(sharePhotoContent)) {
            q7o.LIZLLL(sharePhotoContent);
            z = true;
        } else {
            z = false;
        }
        return C66532Q9g.LIZ(Boolean.valueOf(z));
    }

    public static final Object invoke$4(AqS71S0400000_11 aqS71S0400000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "sharePhoto";
        q96.LIZJ = C51029K0z.LJJIIZI(new OSZ("imageUri", (Uri) aqS71S0400000_11.l0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524612");
        return C85999Xp5.LJ(q96.LIZ(), QCZ.LJLIL, new AqS71S0400000_11((Uri) aqS71S0400000_11.l0, (Uri) aqS71S0400000_11.l1, (Activity) aqS71S0400000_11.l2, (Q97) aqS71S0400000_11.l3, (Q82<Q8F>) 3));
    }

    public static final Object invoke$5(AqS71S0400000_11 aqS71S0400000_11) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Uri uri : (List) aqS71S0400000_11.l0) {
            C66491Q7r c66491Q7r = new C66491Q7r();
            c66491Q7r.LIZLLL = uri;
            arrayList.add(new SharePhoto(c66491Q7r));
        }
        C66482Q7i c66482Q7i = new C66482Q7i();
        c66482Q7i.LIZ(arrayList);
        SharePhotoContent sharePhotoContent = new SharePhotoContent(c66482Q7i);
        Q7O q7o = new Q7O((Activity) aqS71S0400000_11.l1);
        C66493Q7t.LIZ(q7o, (Q97) aqS71S0400000_11.l2, (Q82) aqS71S0400000_11.l3);
        if (q7o.LIZ(sharePhotoContent)) {
            q7o.LIZLLL(sharePhotoContent);
            z = true;
        } else {
            z = false;
        }
        return C66532Q9g.LIZ(Boolean.valueOf(z));
    }

    public static final Object invoke$6(AqS71S0400000_11 aqS71S0400000_11) {
        boolean z;
        Q80 q80 = new Q80();
        q80.LIZJ = (Uri) aqS71S0400000_11.l0;
        ShareVideo shareVideo = new ShareVideo(q80);
        Q81 q81 = new Q81();
        Q80 q802 = new Q80();
        q802.LIZJ = shareVideo.localUrl;
        q81.LJI = new ShareVideo(q802);
        ShareVideoContent shareVideoContent = new ShareVideoContent(q81);
        Q7O q7o = new Q7O((Activity) aqS71S0400000_11.l1);
        C66493Q7t.LIZ(q7o, (Q97) aqS71S0400000_11.l2, (Q82) aqS71S0400000_11.l3);
        if (q7o.LIZ(shareVideoContent)) {
            q7o.LIZLLL(shareVideoContent);
            z = true;
        } else {
            z = false;
        }
        return C66532Q9g.LIZ(Boolean.valueOf(z));
    }

    public static final Object invoke$7(AqS71S0400000_11 aqS71S0400000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "shareVideo";
        q96.LIZJ = C51029K0z.LJJIIZI(new OSZ("videoLocalUri", (Uri) aqS71S0400000_11.l0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524611");
        return C85999Xp5.LJ(q96.LIZ(), C66604QCa.LJLIL, new AqS71S0400000_11((Uri) aqS71S0400000_11.l0, (Uri) aqS71S0400000_11.l1, (Activity) aqS71S0400000_11.l2, (Q97) aqS71S0400000_11.l3, (Q82<Q8F>) 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0400000_11(C68322mC c68322mC, C68322mC c68322mC2, PZQ pzq, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = pzq;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0400000_11(C62676Oim c62676Oim, Activity activity, Q97 q97, C62675Oil c62675Oil, int i) {
        super(0);
        this.$t = i;
        this.l0 = c62676Oim;
        this.l1 = activity;
        this.l2 = q97;
        this.l3 = c62675Oil;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS71S0400000_11(C62676Oim c62676Oim, C62676Oim c62676Oim2, Activity activity, Q97 q97, Q82<Q8F> q82) {
        super(0);
        this.$t = q82;
        this.l0 = c62676Oim;
        this.l1 = c62676Oim2;
        this.l2 = activity;
        this.l3 = q97;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0400000_11(Uri uri, Activity activity, Q97 q97, C62675Oil c62675Oil, int i) {
        super(0);
        this.$t = i;
        this.l0 = uri;
        this.l1 = activity;
        this.l2 = q97;
        this.l3 = c62675Oil;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS71S0400000_11(Uri uri, Uri uri2, Activity activity, Q97 q97, Q82<Q8F> q82) {
        super(0);
        this.$t = q82;
        this.l0 = uri;
        this.l1 = uri2;
        this.l2 = activity;
        this.l3 = q97;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS71S0400000_11(List list, List<? extends Uri> list2, Activity activity, Q97 q97, Q82<Q8F> q82) {
        super(0);
        this.$t = q82;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = activity;
        this.l3 = q97;
    }
}

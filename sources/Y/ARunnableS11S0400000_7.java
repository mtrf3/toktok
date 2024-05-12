package Y;

import X.AbstractC43973HNp;
import X.AlertDialogC45396Hrk;
import X.C2U8;
import X.C31811Ce7;
import X.C43693HCv;
import X.C44694HgQ;
import X.C44959Hkh;
import X.C45354Hr4;
import X.C45498HtO;
import X.C45628HvU;
import X.C45630HvW;
import X.C45635Hvb;
import X.C45644Hvk;
import X.C50420Jqa;
import X.C76732zl;
import X.HR5;
import X.HRJ;
import X.KL2;
import X.ORZ;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.detail.ui.PublishPreviewDetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS11S0400000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            String str = mediaModel.fileLocalUriPath;
            if (!TextUtils.isEmpty(str)) {
                C44694HgQ.LJIILIIL(str);
                String LJIILIIL = C44694HgQ.LJIILIIL(str);
                if (LJIILIIL == null) {
                    LJIILIIL = "";
                }
                if (!str.contains("amweme/") && !str.contains("hotsoon/") && LJIILIIL.endsWith("mp4")) {
                    ((ArrayList) this.l1).add(mediaModel);
                }
            }
        }
        HRJ.LIZ(new ARunnableS43S0100000_7(this, 1));
    }

    public final void LIZ$1() {
        C45635Hvb c45635Hvb;
        C45635Hvb c45635Hvb2;
        List<MyMediaModel> list;
        List<MyMediaModel> list2;
        MyMediaModel myMediaModel;
        C45644Hvk c45644Hvk = ((C45628HvU) this.l0).LJLJJL;
        if (c45644Hvk != null) {
            PagerAdapter adapter = c45644Hvk.getAdapter();
            if (adapter instanceof C45635Hvb) {
                c45635Hvb = (C45635Hvb) adapter;
            } else {
                c45635Hvb = null;
            }
            if (c45635Hvb != null && (list2 = c45635Hvb.LJLJLJ) != null && (myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(((C76732zl) this.l1).element, list2)) != null && o.LJ(((MyMediaModel) this.l2).fileLocalUriPath, myMediaModel.fileLocalUriPath)) {
                C45628HvU c45628HvU = (C45628HvU) this.l0;
                C76732zl c76732zl = (C76732zl) this.l1;
                AbstractC43973HNp abstractC43973HNp = (AbstractC43973HNp) this.l3;
                C45644Hvk c45644Hvk2 = c45628HvU.LJLJJL;
                if (c45644Hvk2 != null) {
                    int currentItem = c45644Hvk2.getCurrentItem();
                    int i = c76732zl.element;
                    if (currentItem == i) {
                        TextView textView = c45628HvU.LJLLL;
                        if (textView != null) {
                            textView.setText(String.valueOf(myMediaModel.selectIndex));
                        } else {
                            o.LJIJI("singleSelectIndicator");
                            throw null;
                        }
                    } else {
                        C45644Hvk c45644Hvk3 = c45628HvU.LJLJJL;
                        if (c45644Hvk3 != null) {
                            c45644Hvk3.setCurrentItem(i);
                        } else {
                            o.LJIJI("viewPager");
                            throw null;
                        }
                    }
                    abstractC43973HNp.LLIIII(myMediaModel.selectIndex - 1);
                    abstractC43973HNp.notifyDataSetChanged();
                    return;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            C45628HvU c45628HvU2 = (C45628HvU) this.l0;
            C45644Hvk c45644Hvk4 = c45628HvU2.LJLJJL;
            if (c45644Hvk4 != null) {
                PagerAdapter adapter2 = c45644Hvk4.getAdapter();
                if (!(adapter2 instanceof C45635Hvb) || (c45635Hvb2 = (C45635Hvb) adapter2) == null || (list = c45635Hvb2.LJLJLJ) == null) {
                    return;
                }
                C45644Hvk c45644Hvk5 = c45628HvU2.LJLJJL;
                if (c45644Hvk5 != null) {
                    MyMediaModel myMediaModel2 = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk5.getCurrentItem(), list);
                    if (myMediaModel2 == null) {
                        return;
                    }
                    TextView textView2 = c45628HvU2.LJLLL;
                    if (textView2 != null) {
                        textView2.setText(String.valueOf(myMediaModel2.selectIndex));
                        return;
                    } else {
                        o.LJIJI("singleSelectIndicator");
                        throw null;
                    }
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public static final void run$0(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        boolean LIZ;
        try {
            aRunnableS11S0400000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        boolean LIZ;
        try {
            aRunnableS11S0400000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        ((VideoRecordPermissionActivity) aRunnableS11S0400000_7.l0).LLIIIJ((String[]) aRunnableS11S0400000_7.l1, (HR5) aRunnableS11S0400000_7.l2, (TokenCert) aRunnableS11S0400000_7.l3);
    }

    public static final void run$3(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        Boolean bool;
        C43693HCv c43693HCv = (C43693HCv) aRunnableS11S0400000_7.l0;
        CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) aRunnableS11S0400000_7.l1;
        PublishModel publishModel = (PublishModel) aRunnableS11S0400000_7.l3;
        Activity LIZ = c43693HCv.LIZ();
        int i = createBaseAwemeResponse.shoutOutsType;
        if (i == 1 || i == 2 || !(createBaseAwemeResponse instanceof CreateAwemeResponse)) {
            return;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
        CreateAwemeResponse.ResponseMarker responseMarker = createAwemeResponse.responseMarker;
        if (responseMarker != null && (bool = responseMarker.addToPlaylistFail) != null && bool.booleanValue() && LIZ != null) {
            C31811Ce7.LIZIZ(LIZ, LIZ.getResources().getString(R.string.g8j));
        }
        C50420Jqa c50420Jqa = new C50420Jqa(15, createAwemeResponse.aweme);
        c50420Jqa.LJLLILLLL = createBaseAwemeResponse.creationId;
        c50420Jqa.LJZ = publishModel;
        if (ActivityStack.getTopActivity() instanceof PublishPreviewDetailActivity) {
            c50420Jqa.LJLLJ = Boolean.TRUE;
        }
        C2U8.LIZIZ(c50420Jqa);
    }

    public static final void run$4(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        C45498HtO c45498HtO = (C45498HtO) aRunnableS11S0400000_7.l0;
        boolean[] zArr = (boolean[]) aRunnableS11S0400000_7.l1;
        View view = (View) aRunnableS11S0400000_7.l2;
        MyMediaModel myMediaModel = (MyMediaModel) aRunnableS11S0400000_7.l3;
        c45498HtO.getClass();
        if (zArr[0]) {
            zArr[0] = false;
            c45498HtO.LJLL.LIZ(view, myMediaModel);
        }
    }

    public static final void run$5(ARunnableS11S0400000_7 aRunnableS11S0400000_7) {
        boolean LIZ;
        try {
            Context context = (Context) aRunnableS11S0400000_7.l0;
            Aweme aweme = (Aweme) aRunnableS11S0400000_7.l1;
            SharePackage sharePackage = (SharePackage) aRunnableS11S0400000_7.l2;
            AlertDialogC45396Hrk alertDialogC45396Hrk = (AlertDialogC45396Hrk) aRunnableS11S0400000_7.l3;
            if (alertDialogC45396Hrk != null && alertDialogC45396Hrk.isShowing()) {
                if (C45354Hr4.LIZ()) {
                    alertDialogC45396Hrk.LIZIZ();
                    alertDialogC45396Hrk.LJ((int) KL2.LIZJ(context, 240.0f), context);
                }
                alertDialogC45396Hrk.LJLL = new C44959Hkh(context, aweme, sharePackage, alertDialogC45396Hrk);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }

    public ARunnableS11S0400000_7(C43693HCv c43693HCv, CreateBaseAwemeResponse createBaseAwemeResponse, int i, Object obj, PublishModel publishModel, int i2) {
        this.$t = i2;
        this.l0 = c43693HCv;
        this.l1 = createBaseAwemeResponse;
        this.l2 = obj;
        this.l3 = publishModel;
    }

    public ARunnableS11S0400000_7(C45628HvU c45628HvU, C76732zl c76732zl, C45630HvW c45630HvW, MyMediaModel myMediaModel, AbstractC43973HNp abstractC43973HNp, int i) {
        this.$t = i;
        this.l0 = c45628HvU;
        this.l1 = c76732zl;
        this.l2 = myMediaModel;
        this.l3 = abstractC43973HNp;
    }
}

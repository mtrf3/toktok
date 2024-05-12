package X;

import android.app.Dialog;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class GVA {
    public static boolean LIZ;

    public static boolean LIZJ(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        if (!a.LJ().LJ(1) && !draft.LJIIJ() && ((Boolean) C41792Gai.LIZIZ.getValue()).booleanValue() && !draft.LJIIIZ()) {
            C268713r.LIZ();
            String LIZJ = draft.LIZJ();
            o.LJI(LIZJ);
            if (C41958GdO.LJIIJ(LIZJ)) {
                if (86400000 - (System.currentTimeMillis() - draft.lastEditTime) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ(ActivityC45651qj ctx, AwemeDraft draft) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(draft, "draft");
        try {
            if (!C2NU.LIZ.LIZIZ() || !LIZJ(draft)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Dialog LIZLLL(ActivityC45651qj activityC45651qj, C41474GPm c41474GPm) {
        String str;
        int i;
        String str2;
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        AwemeDraft awemeDraft = c41474GPm.LIZ;
        String str3 = ShoutOutsData.MODE_SEND;
        ShoutOutsData shoutOutsData = awemeDraft.LJJJJI.shoutOutsData;
        String str4 = null;
        if (shoutOutsData != null) {
            str = shoutOutsData.getShoutOutsMode();
        } else {
            str = null;
        }
        if (o.LJ(str3, str)) {
            i = R.string.rau;
        } else {
            i = R.string.tgx;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("enter_from", "homepage_hot");
        ShoutOutsData shoutOutsData2 = awemeDraft.LJJJJI.shoutOutsData;
        if (shoutOutsData2 != null && o.LJ(shoutOutsData2.getShoutOutsMode(), ShoutOutsData.MODE_SEND)) {
            ShoutOutsData shoutOutsData3 = awemeDraft.LJJJJI.shoutOutsData;
            if (shoutOutsData3 != null) {
                str2 = shoutOutsData3.getOrderId();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                ShoutOutsData shoutOutsData4 = awemeDraft.LJJJJI.shoutOutsData;
                if (shoutOutsData4 != null) {
                    str4 = shoutOutsData4.getOrderId();
                }
                c145995oB.LIZLLL("order_id", str4);
            }
        }
        FMX.LJIIL("show_upload_failed_pop_up", c145995oB.LIZ);
        c26227ARb.LJ(i);
        c26227ARb.LJII = false;
        c26227ARb.LIZ(R.string.tgv);
        UC0.LIZJ(c26227ARb, new AqS111S0300000_7(activityC45651qj, c41474GPm, awemeDraft, 11));
        return c26227ARb.LJI().LJ();
    }

    public static final GVB LIZ(ActivityC45651qj ctx, C41474GPm c41474GPm, boolean z) {
        GVB gwg;
        o.LJIIIZ(ctx, "ctx");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            C60903NvH.LJIIJJI().getPublishService().LJIL().LIZ();
        }
        AwemeDraft awemeDraft = c41474GPm.LIZ;
        boolean LJ = a.LJ().LJ(1);
        if (LIZ && LIZIZ(ctx, awemeDraft)) {
            new C268813s(ctx, awemeDraft).LIZ();
            gwg = null;
        } else if ((awemeDraft.LJIIJ() && awemeDraft.LJIIIZ()) || C78685UuP.LJJJZ(awemeDraft.LIZ.paidContentModel.getCollectionId()) || (e1.LIZ(31744, "tool_enable_upload_recover_panel_to_push", true, false) && !LJ)) {
            gwg = new C41642GVy(ctx, c41474GPm, z);
        } else {
            gwg = new GWG(ctx, c41474GPm, z, LIZ, new PublishFailMsg(0));
        }
        LIZ = false;
        return gwg;
    }
}

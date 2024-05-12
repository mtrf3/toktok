package Y;

import X.AKH;
import X.AXS;
import X.AbstractC73635Sv9;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C16880lQ;
import X.C188727au;
import X.C223338pd;
import X.C237559Tz;
import X.C34K;
import X.C47261Igj;
import X.C68322mC;
import X.C6ZT;
import X.C73423Srj;
import X.C73969T1h;
import X.CK3;
import X.EnumC26164AOq;
import X.FMX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.R9V;
import X.RBX;
import X.SY4;
import X.T16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.popup.SyncNicknameAndUsernamePopTask;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.EmailRequestBody;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS7S0500000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS7S0500000_4 aCListenerS7S0500000_4, View view) {
        if (((C34K) aCListenerS7S0500000_4.l0).element) {
            T t = ((C68322mC) aCListenerS7S0500000_4.l1).element;
            if (t != 0) {
                HashMap LIZJ = C03660Ck.LIZJ("login_name", (String) t);
                LIZJ.put("is_from_nickname", String.valueOf(true));
                AbstractC73635Sv9.LJ(new R9V("/passport/login_name/update/", LIZJ)).LJIIIZ(new AfS53S0200000_4((SyncNicknameAndUsernamePopTask) aCListenerS7S0500000_4.l2, (ActivityC45651qj) aCListenerS7S0500000_4.l4, 1)).LJIIIIZZ(new AfS53S0200000_4((SyncNicknameAndUsernamePopTask) aCListenerS7S0500000_4.l2, (ActivityC45651qj) aCListenerS7S0500000_4.l4, 2)).LJIILL();
            }
        } else {
            ((RBX) HG3.LJIILL()).updateNickName(((SyncNicknameAndUsernamePopTask) aCListenerS7S0500000_4.l2).handler, (String) ((C68322mC) aCListenerS7S0500000_4.l1).element, EnumC26164AOq.DEFAULT.getValue(), null);
        }
        ((AKH) aCListenerS7S0500000_4.l3).LIZ();
    }

    public static final void onClick$1(ACListenerS7S0500000_4 aCListenerS7S0500000_4, View view) {
        String str;
        BetaEmailRegisterPage betaEmailRegisterPage = (BetaEmailRegisterPage) aCListenerS7S0500000_4.l0;
        String obj = ((EditText) aCListenerS7S0500000_4.l1).getText().toString();
        if (!betaEmailRegisterPage.LJLJI.matches(obj) || obj.length() == 0) {
            ((View) aCListenerS7S0500000_4.l2).setVisibility(0);
            ((EditText) aCListenerS7S0500000_4.l1).setBackground((GradientDrawable) aCListenerS7S0500000_4.l3);
            return;
        }
        C188727au c188727au = new C188727au();
        Bundle arguments = ((BetaEmailRegisterPage) aCListenerS7S0500000_4.l0).getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("clicked_content", "submit");
        c188727au.LIZLLL(BetaAppExperiment.LJII ? 1 : 0, "has_join_beta");
        FMX.LJIIL("tiktok_beta_page_gp_email_click", c188727au.LIZ);
        C73423Srj LJIL = ((BetaEmailRegisterPage) aCListenerS7S0500000_4.l0).LJLJJI.email(new EmailRequestBody(((EditText) aCListenerS7S0500000_4.l1).getText().toString(), 0, null, null, null, 30, null)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIL(new AfS56S0100000_4((C223338pd) aCListenerS7S0500000_4.l4, 59));
        C223338pd c223338pd = (C223338pd) aCListenerS7S0500000_4.l4;
        LJIL.LJJJLIIL(new AfS53S0200000_4(c223338pd, (BetaEmailRegisterPage) aCListenerS7S0500000_4.l0, 14), new AfS56S0100000_4(c223338pd, 60));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(ACListenerS7S0500000_4 aCListenerS7S0500000_4, View view) {
        String str;
        String str2;
        String str3;
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        PaidContentDetailVideoListViewModel F3 = ((PaidContentCollectionDetailDescriptionAssem) aCListenerS7S0500000_4.l0).F3();
        PaidVideoItem paidVideoItem = (PaidVideoItem) aCListenerS7S0500000_4.l1;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        Integer num = null;
        F3.iv0(paidVideoItem, context, (CollectionDetailModel) aCListenerS7S0500000_4.l2, null);
        Intent intent = ((PaidContentCollectionDetailDescriptionAssem) aCListenerS7S0500000_4.l0).C3().LJLJJI;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
        } else {
            str = null;
        }
        CollectionDetailModel model = (CollectionDetailModel) aCListenerS7S0500000_4.l3;
        int i = 0;
        if (ujb.o.LJJJJIZL((String) ((C68322mC) aCListenerS7S0500000_4.l4).element, ((PaidContentCollectionDetailDescriptionAssem) aCListenerS7S0500000_4.l0).getContainerView().getContext().getString(R.string.qky), false)) {
            str2 = "Continue Watching";
        } else if (ujb.o.LJJJJIZL((String) ((C68322mC) aCListenerS7S0500000_4.l4).element, ((PaidContentCollectionDetailDescriptionAssem) aCListenerS7S0500000_4.l0).getContainerView().getContext().getString(R.string.qkz), false)) {
            str2 = "Next Video";
        } else if (ujb.o.LJJJJIZL((String) ((C68322mC) aCListenerS7S0500000_4.l4).element, ((PaidContentCollectionDetailDescriptionAssem) aCListenerS7S0500000_4.l0).getContainerView().getContext().getString(R.string.qkv), false)) {
            str2 = "Start Series";
        } else {
            str2 = (String) ((C68322mC) aCListenerS7S0500000_4.l4).element;
        }
        o.LJIIIZ(model, "model");
        C188727au LIZ = CK3.LIZ("enter_from", str);
        LIZ.LJ(model.getCollectionId(), "collection_id");
        User collectionCreator = model.getCollectionCreator();
        if (collectionCreator != null) {
            str3 = collectionCreator.getUid();
        } else {
            str3 = null;
        }
        LIZ.LJI("collection_user_id", str3);
        LIZ.LJI("collection_name", model.getCollectionName());
        List<PaidVideoItem> paidVideoList = model.getPaidVideoList();
        if (paidVideoList != null) {
            if (!paidVideoList.isEmpty()) {
                for (PaidVideoItem paidVideoItem2 : paidVideoList) {
                    if (paidVideoItem2 != null && (aweme = paidVideoItem2.getAweme()) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && ((paidVideoItem2 != null && paidVideoItem2.isReported()) || paidContentInfo.getPaidContentResumeTimestamp() > 0)) {
                        i++;
                        if (i < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
            }
            num = Integer.valueOf(i);
        }
        LIZ.LJFF(num, "collection_video_opened");
        LIZ.LJI("click_button_type", str2);
        FMX.LJIIL("click_collection_watch_series_header_CTA", LIZ.LIZ);
    }

    public static final void onClick$3(ACListenerS7S0500000_4 aCListenerS7S0500000_4, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        new C237559Tz().LJIIJ(1);
        ((SY4) aCListenerS7S0500000_4.l0).setEnabled(false);
        HG3.LJIIL();
        HG3.LJLJL.LJIIIIZZ().switchProAccount(0, null, null, 0, new AXS((InterfaceC65784Pro) aCListenerS7S0500000_4.l1, (BASwitchToPAorBAServiceImpl) aCListenerS7S0500000_4.l2, (TuxSheet) aCListenerS7S0500000_4.l3, (Activity) aCListenerS7S0500000_4.l4));
    }

    public ACListenerS7S0500000_4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}

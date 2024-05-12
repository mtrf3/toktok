package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MVn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56919MVn extends AbstractViewOnClickListenerC56920MVo {
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public MWI getTemplatePosition() {
        return MWI.Left;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final String LIZJ(View view) {
        NoticeUITemplate noticeUITemplate;
        GeneralTemplateNotice templateNotice;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate;
        List<User> list;
        GeneralTemplateNotice templateNotice2 = getTemplateNotice();
        if (templateNotice2 == null || (noticeUITemplate = templateNotice2.uiTemplate) == null) {
            return null;
        }
        if ((noticeUITemplate.avatarImageUrl == null && ((titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || list.size() <= 1)) || (templateNotice = getTemplateNotice()) == null || (noticeUITemplate2 = templateNotice.uiTemplate) == null) {
            return null;
        }
        return noticeUITemplate2.avatarSchemaUrl;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final boolean LIZLLL(View view) {
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        String str;
        GeneralTemplateNotice generalTemplateNotice;
        InterfaceC56930MVy mBridge;
        MW1 viewHolderConfig = getViewHolderConfig();
        if (viewHolderConfig != null && viewHolderConfig.LJIIIIZZ && (mBridge = getMBridge()) != null && mBridge.LLILII()) {
            return true;
        }
        String LIZJ = LIZJ(view);
        if (LIZJ != null) {
            LJ(LIZJ);
            return true;
        }
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        if (templateNotice == null || (noticeUITemplate = templateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || (user = (User) ORZ.LJLLLL(list)) == null) {
            return false;
        }
        if (user.getUid() != null && user.getSecUid() != null) {
            InterfaceC56930MVy mBridge2 = getMBridge();
            if (mBridge2 != null) {
                mBridge2.D();
            }
            UserProfilePreloadHelper.LJIIIIZZ().LIZJ(user);
            MusNotice mBaseNotice = getMBaseNotice();
            String str2 = null;
            if (mBaseNotice != null && (generalTemplateNotice = mBaseNotice.templateNotice) != null) {
                str = generalTemplateNotice.schemaUrl;
            } else {
                str = null;
            }
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 != null && mBaseNotice2.type == 225 && !TextUtils.isEmpty(str)) {
                String str3 = AX5.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                InterfaceC56930MVy mBridge3 = getMBridge();
                if (mBridge3 != null) {
                    MusNotice mBaseNotice3 = getMBaseNotice();
                    if (mBaseNotice3 != null) {
                        str2 = mBaseNotice3.getAccountType();
                    }
                    mBridge3.LLLJL(user, "click_head", str3, str2);
                }
                C61200O0e.LIZLLL().LJFF(str, C03660Ck.LIZJ("inbox_position", str3));
                return true;
            }
            InterfaceC56930MVy mBridge4 = getMBridge();
            if (mBridge4 != null) {
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                String secUid = user.getSecUid();
                o.LJIIIIZZ(secUid, "user.secUid");
                mBridge4.LLIILZL(uid, secUid, getMBaseNotice(), false, "");
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56919MVn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.th, this, true);
        ((AP9) LJFF(R.id.h4z)).setRequestImgSize(J7H.LIZ(101));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(((AP9) LJFF(R.id.h4z)).getAvatarImageView(), MVP.AVATAR, 0.0f);
            View notification_head_double = LJFF(R.id.h4w);
            o.LJIIIIZZ(notification_head_double, "notification_head_double");
            C119624mk notification_head_user1 = (C119624mk) LJFF(R.id.h50);
            o.LJIIIIZZ(notification_head_user1, "notification_head_user1");
            C119624mk notification_head_user2 = (C119624mk) LJFF(R.id.h51);
            o.LJIIIIZZ(notification_head_user2, "notification_head_user2");
            notification_head_double.setOnTouchListener(new MV8(notification_head_double, notification_head_user1, notification_head_user2));
            return;
        }
        C7FA.LIZIZ(LJFF(R.id.h4w));
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final void LIZ(MusNotice notice, InterfaceC56930MVy provider) {
        NoticeUITemplate noticeUITemplate;
        List list;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(provider, "provider");
        super.LIZ(notice, provider);
        C16880lQ.LJJJJJ((AP9) LJFF(R.id.h4z), this);
        C16880lQ.LJIL((ConstraintLayout) LJFF(R.id.h4w), this);
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        if (templateNotice != null && (noticeUITemplate = templateNotice.uiTemplate) != null) {
            LJFF(R.id.dfe).setVisibility(0);
            LJFF(R.id.h4z).setVisibility(0);
            LJFF(R.id.h4w).setVisibility(8);
            TitleTemplate titleTemplate = noticeUITemplate.titleTemplate;
            if (titleTemplate == null || (list = titleTemplate.fromUsers) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (b.LJJ(getTemplateNotice())) {
                LJFF(R.id.h4z).setVisibility(0);
                LJFF(R.id.h4w).setVisibility(8);
                AP9 ap9 = (AP9) LJFF(R.id.h4z);
                Activity activity = ActivityStack.getTopActivity();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_foot_print_circle;
                o.LJIIIIZZ(activity, "activity");
                ap9.setPlaceHolderImage(c2068389v.LIZ(activity));
            } else {
                UrlModel urlModel = noticeUITemplate.avatarImageUrl;
                if (urlModel != null) {
                    if (noticeUITemplate.avatarCoverUrl != null) {
                        LJFF(R.id.dfe).setVisibility(8);
                        LJFF(R.id.h4z).setVisibility(8);
                        LJFF(R.id.h4w).setVisibility(0);
                        C78765Uvh.LJFF((C62846OlW) LJFF(R.id.h50), noticeUITemplate.avatarCoverUrl);
                        C78765Uvh.LJFF((C62846OlW) LJFF(R.id.h51), noticeUITemplate.avatarImageUrl);
                    } else {
                        ((AP9) LJFF(R.id.h4z)).setUserData(new UserVerify(urlModel, null, null, null, 14, null));
                    }
                } else if (list.size() == 1 || C53357Kwr.LIZJ()) {
                    ((AP9) LJFF(R.id.h4z)).setUserData(new UserVerify(((User) ListProtector.get(list, 0)).getAvatarThumb(), ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) ListProtector.get(list, 0)).getVerificationType())));
                    ((AP9) LJFF(R.id.h4z)).LIZ();
                } else if (list.size() > 1) {
                    LJFF(R.id.h4z).setVisibility(8);
                    LJFF(R.id.h4w).setVisibility(0);
                    C78765Uvh.LJFF((C62846OlW) LJFF(R.id.h50), ((User) ListProtector.get(list, 0)).getAvatarThumb());
                    C78765Uvh.LJFF((C62846OlW) LJFF(R.id.h51), ((User) ListProtector.get(list, 1)).getAvatarThumb());
                } else {
                    ((AP9) LJFF(R.id.h4z)).setUserData(null);
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LJFF(R.id.h4z).setVisibility(0);
        LJFF(R.id.h4w).setVisibility(8);
        ((AP9) LJFF(R.id.h4z)).setUserData(null);
    }
}

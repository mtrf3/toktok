package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.ExtraActionTemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.LabelInfoTemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56912MVg extends AbstractViewOnClickListenerC56920MVo {
    public static final /* synthetic */ int LLFII = 0;
    public final View LJLJJLL;
    public final TuxTextView LJLJL;
    public final View LJLJLJ;
    public final AnonymousClass976 LJLJLLL;
    public final C57446Mgc LJLL;
    public List<? extends User> LJLLI;
    public InterfaceC56930MVy LJLLILLLL;
    public boolean LJLLJ;
    public User LJLLL;
    public final ViewStub LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public String LL;
    public int LLD;
    public TextPaint LLF;
    public int LLFF;
    public final java.util.Map<Integer, View> LLFFF;

    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LLFFF;
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

    private final View.OnClickListener getMAvatarClickListener() {
        return (View.OnClickListener) this.LJLLLLLL.getValue();
    }

    private final View.OnClickListener getMMoreClickListener() {
        return (View.OnClickListener) this.LJLZ.getValue();
    }

    private final Observer<FollowStatus> getMUserObserver() {
        return (Observer) this.LJZ.getValue();
    }

    public final Integer getNormalTextColor() {
        return (Integer) this.LJZI.getValue();
    }

    public final Integer getPressedTextColor() {
        return (Integer) this.LJZL.getValue();
    }

    public final float LJIIJ() {
        NoticeUITemplate noticeUITemplate;
        Integer valueOf;
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        if (templateNotice != null && (noticeUITemplate = templateNotice.uiTemplate) != null && (valueOf = Integer.valueOf(noticeUITemplate.rightType)) != null) {
            if (valueOf.intValue() == 10) {
                return 192.0f;
            }
            if (valueOf.intValue() == 11) {
                return 146.0f;
            }
            if (valueOf != null && (valueOf.intValue() == 12 || valueOf.intValue() == 13)) {
                return 132.0f;
            }
        }
        return 0.0f;
    }

    public final int getLastMaxLines() {
        return this.LLFF;
    }

    public final int getLastMeasuredWidth() {
        return this.LLD;
    }

    public final TextPaint getLastPaint() {
        return this.LLF;
    }

    public final String getLastText() {
        return this.LL;
    }

    public final List<User> getMListenedUserList() {
        return this.LJLLI;
    }

    public final C57446Mgc getNotificationNameAppendFollowOrInfo() {
        return this.LJLL;
    }

    public final TuxTextView getNotification_name() {
        return this.LJLJL;
    }

    public final View getNotification_name_append_follow_container() {
        return this.LJLJLJ;
    }

    public final AnonymousClass976 getNotification_name_append_info() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public MWI getTemplatePosition() {
        return MWI.Middle;
    }

    public final View getTitle_container() {
        return this.LJLJJLL;
    }

    private final void setNewAppendFollow(List<? extends User> list) {
        User user;
        boolean z;
        MWL mwl;
        if (list == null || (user = (User) ORZ.LJLLLL(list)) == null) {
            return;
        }
        this.LJLJLJ.setVisibility(8);
        MW1 viewHolderConfig = getViewHolderConfig();
        boolean z2 = false;
        if (viewHolderConfig != null && viewHolderConfig.LJII) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            C56923MVr c56923MVr = C56923MVr.LIZ;
            C57446Mgc notificationNameAppendFollowOrInfo = this.LJLL;
            o.LJIIIIZZ(notificationNameAppendFollowOrInfo, "notificationNameAppendFollowOrInfo");
            GeneralTemplateNotice templateNotice = getTemplateNotice();
            if (templateNotice != null) {
                str = templateNotice.messageExtra;
            }
            c56923MVr.LIZJ(notificationNameAppendFollowOrInfo, "", list, true, str);
        } else {
            C56923MVr c56923MVr2 = C56923MVr.LIZ;
            C57446Mgc notificationNameAppendFollowOrInfo2 = this.LJLL;
            o.LJIIIIZZ(notificationNameAppendFollowOrInfo2, "notificationNameAppendFollowOrInfo");
            GeneralTemplateNotice templateNotice2 = getTemplateNotice();
            if (templateNotice2 != null) {
                str = templateNotice2.messageExtra;
            }
            c56923MVr2.LIZJ(notificationNameAppendFollowOrInfo2, "", list, false, str);
        }
        if (C53752L7s.LIZJ() && o.LJ(user, this.LJLLL) && list.size() > 1) {
            return;
        }
        MW1 viewHolderConfig2 = getViewHolderConfig();
        if (viewHolderConfig2 != null && (mwl = viewHolderConfig2.LIZ) != null && mwl.LJLIL) {
            z2 = true;
        }
        C57446Mgc c57446Mgc = this.LJLL;
        C7YW c7yw = new C7YW();
        c7yw.LIZ = user;
        c7yw.LIZIZ(EnumC57119MbL.NORMAL);
        c7yw.LJ = z2;
        c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
        this.LJLL.setTracker(new AqS159S0100000_9(this, 477));
        this.LJLL.setDataChangeListener(new AqS140S0200000_9(this, (C56912MVg) list, (List<? extends User>) 19));
        C57434MgQ.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
        C57446Mgc notificationNameAppendFollowOrInfo3 = this.LJLL;
        o.LJIIIIZZ(notificationNameAppendFollowOrInfo3, "notificationNameAppendFollowOrInfo");
        C26338AVi.LJI(notificationNameAppendFollowOrInfo3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, null, false, 30);
        this.LJLLL = user;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final String LIZJ(View view) {
        Integer valueOf;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        NoticeUITemplate noticeUITemplate2;
        LabelInfoTemplate labelInfoTemplate;
        String str;
        NoticeUITemplate noticeUITemplate3;
        TitleTemplate titleTemplate2;
        String str2;
        NoticeUITemplate noticeUITemplate4;
        TitleTemplate titleTemplate3;
        NoticeUITemplate noticeUITemplate5;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return null;
        }
        if (valueOf.intValue() == R.id.h4n || valueOf.intValue() == R.id.h4l || valueOf.intValue() == R.id.h5l) {
            GeneralTemplateNotice templateNotice = getTemplateNotice();
            if (templateNotice == null || (noticeUITemplate5 = templateNotice.uiTemplate) == null) {
                return null;
            }
            return noticeUITemplate5.middleSchemaUrl;
        }
        if (valueOf.intValue() == R.id.h5f) {
            GeneralTemplateNotice templateNotice2 = getTemplateNotice();
            if (templateNotice2 == null || (noticeUITemplate4 = templateNotice2.uiTemplate) == null || (titleTemplate3 = noticeUITemplate4.titleTemplate) == null) {
                return null;
            }
            return titleTemplate3.extraSchemaUrl;
        }
        if (valueOf.intValue() == R.id.h5h) {
            GeneralTemplateNotice templateNotice3 = getTemplateNotice();
            if (templateNotice3 == null || (noticeUITemplate3 = templateNotice3.uiTemplate) == null || (titleTemplate2 = noticeUITemplate3.titleTemplate) == null) {
                return null;
            }
            ExtraActionTemplate extraActionTemplate = titleTemplate2.extraAction;
            if (extraActionTemplate != null && (str2 = extraActionTemplate.schema) != null) {
                return str2;
            }
            return titleTemplate2.extraSchemaUrl;
        }
        if (valueOf.intValue() != R.id.gv3) {
            return null;
        }
        GeneralTemplateNotice templateNotice4 = getTemplateNotice();
        if (templateNotice4 != null && (noticeUITemplate2 = templateNotice4.uiTemplate) != null && (labelInfoTemplate = noticeUITemplate2.labelInfo) != null && (str = labelInfoTemplate.schema) != null) {
            return str;
        }
        GeneralTemplateNotice templateNotice5 = getTemplateNotice();
        if (templateNotice5 == null || (noticeUITemplate = templateNotice5.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null) {
            return null;
        }
        return titleTemplate.extraSchemaUrl;
    }

    @Override // X.AbstractViewOnClickListenerC56920MVo
    public final boolean LIZLLL(View view) {
        String LIZJ = LIZJ(view);
        if (LIZJ != null) {
            LJ(LIZJ);
            return true;
        }
        return false;
    }

    public final MWE LJI(MWE mwe) {
        String str;
        NoticeUITemplate noticeUITemplate;
        NoticeUITemplate noticeUITemplate2;
        String str2;
        if (getMBaseNotice() == null) {
            return mwe;
        }
        LJFF(R.id.h4l).setVisibility(0);
        LIZIZ(this, LJFF(R.id.h4l));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        GeneralTemplateNotice generalTemplateNotice = mwe.LIZ;
        if (generalTemplateNotice == null || (noticeUITemplate2 = generalTemplateNotice.uiTemplate) == null || (str2 = noticeUITemplate2.content) == null || spannableStringBuilder.append((CharSequence) str2) == null) {
            GeneralTemplateNotice generalTemplateNotice2 = mwe.LIZ;
            if (generalTemplateNotice2 == null || (noticeUITemplate = generalTemplateNotice2.uiTemplate) == null || (str = noticeUITemplate.event) == null) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        TextView notification_content = (TextView) LJFF(R.id.h4l);
        o.LJIIIIZZ(notification_content, "notification_content");
        MusNotice mBaseNotice = getMBaseNotice();
        o.LJI(mBaseNotice);
        MXH.LIZIZ(notification_content, spannableStringBuilder, mBaseNotice, mwe.LIZIZ, KL2.LJIIJJI(getContext()) - ((int) KL2.LIZJ(getContext(), LJIIJ())));
        MW1 viewHolderConfig = getViewHolderConfig();
        if (viewHolderConfig != null && viewHolderConfig.LIZLLL) {
            C118824lS.LIZJ((TextView) LJFF(R.id.h4l), null);
        }
        return mwe;
    }

    public final void LJII(MWE mwe) {
        NoticeUITemplate noticeUITemplate;
        LabelInfoTemplate labelInfoTemplate;
        C188627ak c188627ak;
        User user;
        MW1 mw1;
        MWL mwl;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate;
        List<User> list;
        GeneralTemplateNotice generalTemplateNotice = mwe.LIZ;
        if (generalTemplateNotice == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (labelInfoTemplate = noticeUITemplate.labelInfo) == null || (c188627ak = (C188627ak) LJFF(R.id.gv3)) == null) {
            return;
        }
        GeneralTemplateNotice templateNotice = getTemplateNotice();
        if (templateNotice != null && (noticeUITemplate2 = templateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate2.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && list.size() == 1) {
            user = (User) ListProtector.get(list, 0);
        } else {
            user = null;
        }
        C56927MVv expandAbility = getExpandAbility();
        if (expandAbility != null && (mw1 = expandAbility.LIZIZ) != null && (mwl = mw1.LIZ) != null && mwl.LJLJJI) {
            SFS.LJJIL(c188627ak, labelInfoTemplate.matchedFriendStruct, labelInfoTemplate.viewType, user);
        } else {
            SFS.LJJIL(c188627ak, labelInfoTemplate.matchedFriendStruct, labelInfoTemplate.viewType, null);
        }
        String str = labelInfoTemplate.content;
        if (str != null && C78857UxB.LJJJIL(str)) {
            c188627ak.getTvDesc().setText(str);
            V1B.LJLZ(c188627ak);
        }
        if (labelInfoTemplate.actionType == 1) {
            c188627ak.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        } else {
            c188627ak.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        }
        if (labelInfoTemplate.matchedFriendStruct != null) {
            return;
        }
        SFS.LIZIZ(c188627ak, labelInfoTemplate.viewType, false);
    }

    public final void LJIIIZ(MWE mwe) {
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        ExtraActionTemplate extraActionTemplate;
        GeneralTemplateNotice generalTemplateNotice = mwe.LIZ;
        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (extraActionTemplate = titleTemplate.extraAction) != null) {
            this.LJLJLJ.setVisibility(0);
            this.LJLJLLL.setText(extraActionTemplate.content);
            int i = extraActionTemplate.viewType;
            if (i != 0) {
                if (i == 1) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    Integer LJI = C79045V0n.LJI(R.attr.e2, context);
                    if (LJI != null) {
                        this.LJLJLLL.setTextColor(LJI.intValue());
                    }
                }
            } else {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                Integer LJI2 = C79045V0n.LJI(R.attr.gv, context2);
                if (LJI2 != null) {
                    this.LJLJLLL.setTextColor(LJI2.intValue());
                }
            }
            int i2 = extraActionTemplate.actionType;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 || ORZ.LJLLLL(titleTemplate.fromUsers) == null || titleTemplate.extraAction == null) {
                        return;
                    }
                    setNewAppendFollow(titleTemplate.fromUsers);
                    return;
                }
                C16880lQ.LJJJLL(this.LJLJLLL, this);
                return;
            }
            C16880lQ.LJJJLL(this.LJLJLLL, null);
        }
    }

    public final void setLastMaxLines(int i) {
        this.LLFF = i;
    }

    public final void setLastMeasuredWidth(int i) {
        this.LLD = i;
    }

    public final void setLastPaint(TextPaint textPaint) {
        o.LJIIIZ(textPaint, "<set-?>");
        this.LLF = textPaint;
    }

    public final void setLastText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LL = str;
    }

    public final void setMListenedUserList(List<? extends User> list) {
        this.LJLLI = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56912MVg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLFFF = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ti, this, true);
        LJFF(R.id.h4n).setOnClickListener(new ViewOnClickListenerC13880ga(this));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(LJFF(R.id.h4n), MVP.AVATAR, C32151Nz.LJIIZILJ(2));
        }
        this.LJLJJLL = findViewById(R.id.l_j);
        this.LJLJL = (TuxTextView) findViewById(R.id.h5f);
        this.LJLJLJ = findViewById(R.id.h5i);
        this.LJLJLLL = (AnonymousClass976) findViewById(R.id.h5h);
        this.LJLL = (C57446Mgc) findViewById(R.id.h5j);
        View findViewById = findViewById(R.id.km3);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.stub_avatar_expand)");
        this.LJLLLL = (ViewStub) findViewById;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 853));
        this.LJLZ = C221108m2.LIZIZ(new AqS156S0200000_9(this, context, 75));
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 854));
        this.LJZI = C221108m2.LIZIZ(new AqS154S0100000_4(context, 1169));
        this.LJZL = C221108m2.LIZIZ(new AqS154S0100000_4(context, 1170));
        this.LL = "";
        this.LLD = -1;
        this.LLF = new TextPaint();
        this.LLFF = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x043b, code lost:
    
        if (r6 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0492, code lost:
    
        if (r6 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0498, code lost:
    
        if (r6 != null) goto L171;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, X.6yl] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, android.view.View] */
    @Override // X.AbstractViewOnClickListenerC56920MVo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r19, X.InterfaceC56930MVy r20) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56912MVg.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, X.MVy):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (this.LJLJJLL.getVisibility() != 0 || this.LJLJL.getVisibility() != 0) {
            return;
        }
        TextPaint paint = this.LJLJL.getPaint();
        int measuredWidth = this.LJLJL.getMeasuredWidth();
        int maxLines = this.LJLJL.getMaxLines();
        if (C53752L7s.LIZJ()) {
            String str2 = this.LL;
            CharSequence text = this.LJLJL.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && o.LJ(this.LLF, paint) && this.LLD == measuredWidth && this.LLFF == maxLines) {
                return;
            }
        }
        TuxTextView tuxTextView = this.LJLJL;
        CharSequence text2 = tuxTextView.getText();
        o.LJIIIIZZ(text2, "notification_name.text");
        o.LJIIIIZZ(paint, "paint");
        tuxTextView.setText(MXH.LIZJ(new SpannableStringBuilder(text2), paint, measuredWidth, maxLines, 0, 0));
        if (!C53752L7s.LIZJ()) {
            return;
        }
        this.LL = this.LJLJL.getText().toString();
        this.LLD = measuredWidth;
        this.LLF = paint;
        this.LLFF = maxLines;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C56912MVg r15, X.MWE r16, int r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56912MVg.LJIIIIZZ(X.MVg, X.MWE, int):void");
    }
}

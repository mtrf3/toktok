package X;

import Y.AObjectS147S0100000_9;
import Y.AObserverS60S0101000_5;
import Y.AObserverS77S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.AqS71S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MVV extends ViewOnClickListenerC56908MVc {
    public User bindedUser;
    public Context mContext;
    public List<User> mListenedUserList;
    public BaseNotice mMTBaseNotice;
    public String mTimelineTypeStr;
    public View mTvNameAppendContainer;
    public AnonymousClass976 mTvNameAppendFollow;
    public Observer<FollowStatus> mUserObserver;
    public C57446Mgc nameAppendFollowText;
    public final Observer<Boolean> refreshObserver;
    public static final int NEW_CONTENT_TITLE_SPACE = C17N.LJIILL(3.0d);
    public static final int NEW_LEFT_CONTAINER_TOP_SPACE = C17N.LJIILL(11.0d);
    public static final int LARGE_AVATAR_ADD_SPACE = C17N.LJIILL(4.0d);
    public static final int LARGE_TITLE_SIZE = C17N.LJIILL(16.0d);

    public void applyNewCover(int i) {
    }

    public void applyNewStyle(C96533qb c96533qb) {
    }

    public abstract int getRootId();

    @Override // X.ViewOnClickListenerC56908MVc
    public boolean needLongClick() {
        return true;
    }

    public void reportShowEvent() {
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public void onAttached() {
        HandlerC56918MVm LIZ;
        super.onAttached();
        reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv instanceof MOG) {
            ((MOG) interfaceC56771MPv).ml0().observe(C45804HyK.LJJIFFI(this.mContext), this.refreshObserver);
        }
        if (this.mMTBaseNotice != null && (LIZ = NoticeVideoManager.LIZ()) != null) {
            MS5.LJI(new AqS71S0201000_9(this.mMTBaseNotice, LIZ, getWrappedLayoutPosition(), 0));
        }
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public void onDetached() {
        super.onDetached();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv instanceof MOG) {
            ((MOG) interfaceC56771MPv).ml0().removeObserver(this.refreshObserver);
        }
        UserService.LIZ().LJFF().removeObserver(this.mUserObserver);
    }

    public void resetRootPadding() {
        View findViewById = findViewById(getRootId());
        if (findViewById == null || !((Boolean) L0M.LJFF.getValue()).booleanValue()) {
            return;
        }
        int i = LARGE_AVATAR_ADD_SPACE;
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop() + i, findViewById.getPaddingRight(), findViewById.getPaddingBottom() + i);
    }

    public void performShowEvent() {
        reportShowEvent();
    }

    public MVV(View view) {
        super(view);
        this.mUserObserver = new AObserverS77S0100000_9(this, 35);
        this.refreshObserver = new AObserverS60S0101000_5(1, this, 1);
        this.mContext = view.getContext();
        View findViewById = view.findViewById(getRootId());
        if (findViewById != null && needLongClick()) {
            findViewById.setOnLongClickListener(this);
        }
        this.mTvNameAppendFollow = (AnonymousClass976) view.findViewById(R.id.h5h);
        this.mTvNameAppendContainer = view.findViewById(R.id.h5i);
        C57446Mgc c57446Mgc = (C57446Mgc) view.findViewById(R.id.h5j);
        this.nameAppendFollowText = c57446Mgc;
        if (c57446Mgc != null) {
            c57446Mgc.setDataChangeListener(new AObjectS147S0100000_9(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Boolean bool) {
        reportShowEvent();
    }

    public void clearTypeIconFromAvatar(AP9 ap9) {
        View findViewById;
        if (!L0K.LIZIZ || ap9 == null || (findViewById = ap9.findViewById(R.id.acy)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public String getNoticeCreateTimeDesc(BaseNotice baseNotice) {
        return getNoticeCreateTimeDesc(baseNotice, this.mContext);
    }

    public void listenToUserChange(List<User> list) {
        Object obj;
        if (!(this.mContext instanceof ActivityC45651qj) || list == null || list.isEmpty()) {
            return;
        }
        List<User> list2 = this.mListenedUserList;
        if (list2 == null || list2.isEmpty()) {
            obj = null;
        } else {
            obj = ListProtector.get(this.mListenedUserList, 0);
        }
        Object obj2 = ListProtector.get(list, 0);
        LifecycleOwner requireLifeCycleOwner = requireLifeCycleOwner();
        if (obj == obj2) {
            UserService.LIZ().LJFF().removeObserver(this.mUserObserver);
        }
        this.mListenedUserList = list;
        UserService.LIZ().LJFF().observe(requireLifeCycleOwner, this.mUserObserver);
    }

    public void markHasRead(BaseNotice baseNotice) {
        if (!((Boolean) DXZ.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C7YG.LIZ(this.itemView);
        if (baseNotice != null) {
            baseNotice.hasRead = true;
        }
    }

    public void setAppendFollowTextMarginStart(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.nameAppendFollowText.getLayoutParams();
        marginLayoutParams.setMarginStart((int) KL2.LIZJ(this.mContext, f));
        this.nameAppendFollowText.setLayoutParams(marginLayoutParams);
    }

    public static String getNoticeCreateTimeDesc(long j, Context context) {
        String LIZIZ;
        String str;
        if (j != 0) {
            if (((Boolean) C52877Kp7.LIZ.getValue()).booleanValue()) {
                LIZIZ = C86036Xpg.LIZIZ(j * 1000);
            } else {
                long j2 = j * 1000;
                long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
                if (timeInMillis < 604800000) {
                    LIZIZ = C57105Mb7.LIZ(timeInMillis, context);
                } else {
                    LIZIZ = C57105Mb7.LIZIZ(j2);
                }
            }
            String replaceAll = LIZIZ.replaceAll("(.)", "$1\u2060");
            if (!C90193gN.LIZIZ(context)) {
                replaceAll = C78920UyC.LIZ((char) 8237, replaceAll, (char) 8237);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ");
            if (C90193gN.LIZIZ(context)) {
                str = "\u200f";
            } else {
                str = "\u200e";
            }
            return JBR.LJFF(LIZ, str, replaceAll, LIZ);
        }
        return "";
    }

    private void resetViewSize(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public String addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, long j) {
        int i;
        String noticeCreateTimeDesc = getNoticeCreateTimeDesc(j, this.mContext);
        if (noticeCreateTimeDesc.indexOf(8237) > -1) {
            i = 2;
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(noticeCreateTimeDesc)) {
            spannableStringBuilder.append((CharSequence) noticeCreateTimeDesc);
            Integer LJI = C79045V0n.LJI(R.attr.gp, this.mContext);
            if (LJI == null) {
                return "";
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(LJI.intValue()), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
        }
        return noticeCreateTimeDesc;
    }

    public void applyArrow(C96533qb c96533qb, View view) {
        Drawable drawable;
        if (c96533qb == null || (drawable = c96533qb.LJIILJJIL) == null || !(view instanceof TuxIconView)) {
            return;
        }
        ((TuxIconView) view).setImageDrawable(drawable);
    }

    public void applyContentColor(C96533qb c96533qb, TextView textView) {
        int i;
        if (c96533qb == null || (i = c96533qb.LJIIIIZZ) == -1 || !(textView instanceof TuxTextView)) {
            return;
        }
        textView.setTextColor(i);
    }

    public void applyCoverSize(int i, View view) {
        if (i <= 0) {
            return;
        }
        resetViewSize(view, i);
    }

    public void applyHead(C96533qb c96533qb, View view) {
        int i;
        if (c96533qb == null || (i = c96533qb.LIZIZ) == -1) {
            return;
        }
        resetViewSize(view, i);
    }

    public void applyHeadStoryRing(C96533qb c96533qb, View view) {
        int i;
        if (c96533qb == null || (i = c96533qb.LIZIZ) == -1) {
            return;
        }
        resetViewSize(view, (int) (TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()) + i));
    }

    public void applyTitleSize(C96533qb c96533qb, TextView textView) {
        int i;
        if (c96533qb == null || (i = c96533qb.LJFF) == -1 || !(textView instanceof TuxTextView)) {
            return;
        }
        ((TuxTextView) textView).LJJJ(i);
    }

    public void bindNotice(BaseNotice baseNotice, int i) {
        this.mMTBaseNotice = baseNotice;
        ((ViewOnClickListenerC56908MVc) this).mPosition = i;
        this.mTimelineTypeStr = MDT.LIZJ(baseNotice.timeLineType);
    }

    public int getViewTopMarginAddSpace(View view, int i) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i;
    }

    public void logNotificationClick(String str, int i) {
        logNotificationClick(str, i, null, null, "");
    }

    public void resetViewTopMargin(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
    }

    public static String getNoticeCreateTimeDesc(BaseNotice baseNotice, Context context) {
        return getNoticeCreateTimeDesc(baseNotice.createTime, context);
    }

    public void addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        addCreateTimeSpan(spannableStringBuilder, baseNotice, this.mContext);
    }

    public void addCreateTimeSpan(final TextView textView, final SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        final String noticeCreateTimeDesc = getNoticeCreateTimeDesc(baseNotice);
        if (!TextUtils.isEmpty(noticeCreateTimeDesc)) {
            spannableStringBuilder.append((CharSequence) noticeCreateTimeDesc);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, this.mContext)), spannableStringBuilder.length() - noticeCreateTimeDesc.length(), spannableStringBuilder.length(), 17);
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.7qF
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Layout layout;
                    textView.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (TextUtils.equals(textView.getText(), spannableStringBuilder) && (layout = textView.getLayout()) != null && layout.getEllipsisCount(textView.getLineCount() - 1) > 0) {
                        float width = ((textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) - textView.getPaint().measureText(noticeCreateTimeDesc);
                        int lineStart = textView.getLayout().getLineStart(textView.getLineCount() - 1);
                        if (lineStart >= 0 && spannableStringBuilder.length() - lineStart > 0) {
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder2.subSequence(lineStart, spannableStringBuilder2.length()), textView.getPaint(), width, TextUtils.TruncateAt.END);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
                            spannableStringBuilder3.append(ellipsize);
                            spannableStringBuilder3.append((CharSequence) noticeCreateTimeDesc);
                            spannableStringBuilder3.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, MVV.this.mContext)), spannableStringBuilder3.length() - noticeCreateTimeDesc.length(), spannableStringBuilder3.length(), 17);
                            textView.setText(spannableStringBuilder3);
                        }
                    }
                    return false;
                }
            });
        }
    }

    public void addTypeIconToAvatar(AP9 ap9, UrlModel urlModel, boolean z) {
        int i;
        if (!L0K.LIZIZ || ap9 == null) {
            return;
        }
        View findViewById = ap9.findViewById(R.id.acy);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.cl, ap9.getContext());
        Context context = this.mContext;
        o.LJIIIZ(context, "context");
        if (urlModel == null) {
            return;
        }
        SmartImageView smartImageView = (SmartImageView) ap9.findViewById(R.id.acy);
        if (smartImageView == null) {
            smartImageView = new C72434Sbm(context);
        }
        if (C53752L7s.LIZJ() && !z && smartImageView.getId() == R.id.acy) {
            smartImageView.setVisibility(0);
            return;
        }
        if (ap9.getLayoutParams().width == MVW.LIZIZ) {
            i = MVW.LIZJ;
        } else {
            i = MVW.LIZLLL;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388693;
        int i2 = MVW.LIZ;
        int i3 = -i2;
        layoutParams.setMarginEnd(i3);
        layoutParams.bottomMargin = i3;
        smartImageView.setPadding(i2, i2, i2, i2);
        Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.yk);
        if (LIZIZ != null) {
            LIZIZ.mutate().setTint(LJIIIIZZ);
            smartImageView.setBackground(LIZIZ);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIILIIL(J7H.LIZ(100));
        LJII.LIZIZ("TypeIconView");
        LJII.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJII);
        smartImageView.setVisibility(0);
        smartImageView.setId(R.id.acy);
        if (ap9.indexOfChild(smartImageView) != -1) {
            return;
        }
        ap9.addView(smartImageView, layoutParams);
    }

    public void logNotificationClick(String str, int i, User user) {
        logNotificationClick(str, i, null, user, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        if (r3 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void markUnreadIfNeed(boolean r10, android.view.View r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVV.markUnreadIfNeed(boolean, android.view.View, boolean):void");
    }

    public static String addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context) {
        int i;
        String noticeCreateTimeDesc = getNoticeCreateTimeDesc(baseNotice, context);
        if (noticeCreateTimeDesc.indexOf(8237) > -1) {
            i = 2;
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(noticeCreateTimeDesc)) {
            spannableStringBuilder.append((CharSequence) noticeCreateTimeDesc);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, context)), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
        }
        return noticeCreateTimeDesc;
    }

    public void logNotificationClick(String str, int i, String str2) {
        logNotificationClick(str, i, str2, null, "");
    }

    public void applyAggregatedHead(C96533qb c96533qb, View view, View view2, View view3) {
        int i;
        int i2;
        int i3;
        if (c96533qb == null || (i = c96533qb.LIZIZ) == -1 || (i2 = c96533qb.LIZJ) == -1 || (i3 = c96533qb.LIZLLL) == -1) {
            return;
        }
        resetViewSize(view, i);
        resetViewSize(view2, i2);
        resetViewSize(view3, i3);
    }

    public void resetContentTopMargin(TextView textView, View view, View view2, int i) {
        if (textView == null || view == null || i == 8 || textView.getVisibility() == 8 || textView.getTextSize() != LARGE_TITLE_SIZE || view.getVisibility() == 8) {
            return;
        }
        if (view2 == null || view2.getVisibility() == 8) {
            resetViewTopMargin(view, NEW_CONTENT_TITLE_SPACE);
        } else {
            resetViewTopMargin(view, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void logNotificationClick(String str, int i, String str2, User user, String str3) {
        String str4;
        long j;
        String str5;
        int i2;
        MWH Kg0;
        BaseNotice baseNotice = this.mMTBaseNotice;
        if (baseNotice != null) {
            j = baseNotice.createTime;
            str4 = baseNotice.templateId;
            str5 = baseNotice.nid;
            i2 = baseNotice.hasRead;
        } else {
            str4 = "";
            j = 0;
            str5 = "";
            i2 = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", str);
        c188727au.LJIIIZ("client_order", String.valueOf(i));
        c188727au.LJIIIZ("template_id", str4);
        c188727au.LJIIIZ("content_id", str5);
        c188727au.LJ(j, "message_time");
        c188727au.LIZLLL(i2, "is_read");
        if (!TextUtils.isEmpty(str3)) {
            c188727au.LJI("follow_source", str3);
        }
        if (user != null) {
            c188727au.LJI("follow_status_to_user", C56923MVr.LIZLLL(user));
        }
        if (!TextUtils.isEmpty(str2)) {
            c188727au.LJI("button_type", str2);
        } else if (user != null) {
            c188727au.LJI("button_type", C221658mv.LIZ(this.mContext, user));
        }
        if (!TextUtils.isEmpty(AX5.LIZ)) {
            c188727au.LJI("position", AX5.LIZ);
        }
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null && (Kg0 = interfaceC56771MPv.Kg0()) != null) {
            C78886Uxe.LIZIZ(c188727au, Kg0);
        }
        FMX.LJIIL("notification_message_inner_message", c188727au.LIZ);
    }

    public void logNotificationAction(String str, String str2, BaseNotice baseNotice, String str3, String str4, User user) {
        logNotificationAction(str, str2, baseNotice.clientOrder, baseNotice, true, "", str4, str3, baseNotice.hasRead ? 1 : 0, user);
    }
}

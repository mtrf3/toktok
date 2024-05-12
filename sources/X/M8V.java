package X;

import Y.ACListenerS29S0100000_9;
import Y.IDLListenerS196S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsg;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgHighlight;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class M8V extends PopupWindow {
    public static final /* synthetic */ int LJIIL = 0;
    public final Context LIZ;
    public final View LIZIZ;
    public final LinearLayout LIZJ;
    public final TextView LIZLLL;
    public int LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public SpannableStringBuilder LJIIIZ;
    public String LJIIJ;
    public List<SafeInfoNoticeMsgHighlight> LJIIJJI;

    public final void LIZIZ() {
        AbstractC225698tR abstractC225698tR;
        if (isShowing()) {
            return;
        }
        int[] iArr = new int[2];
        this.LIZIZ.getLocationOnScreen(iArr);
        getContentView().measure(0, 0);
        this.LJ = iArr[1] - getContentView().getMeasuredHeight();
        LNZ lnz = LNZ.LIZIZ;
        Context context = this.LIZ;
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LLQ Xm0 = lnz.getHomeTabViewModel((ActivityC45651qj) context).Xm0();
        if (Xm0 != null) {
            abstractC225698tR = Xm0.LIZ;
        } else {
            abstractC225698tR = null;
        }
        if (o.LJ(abstractC225698tR, C225708tS.LIZ)) {
            if (this.LIZIZ.getHeight() == 0) {
                this.LIZIZ.measure(0, 0);
                this.LJ = this.LIZIZ.getMeasuredHeight() + this.LJ;
            } else {
                this.LJ = this.LIZIZ.getHeight() + this.LJ;
            }
        }
        View view = this.LIZIZ;
        int i = this.LJ;
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(this));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                showAtLocation(view, 0, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
            } catch (Throwable unused) {
                showAtLocation(view, 0, 0, i);
            }
        } else {
            showAtLocation(view, 0, 0, i);
        }
        if (this.LJFF) {
            this.LJFF = false;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("aid", String.valueOf(EF7.LJIIIZ));
            c188727au.LJIIIZ("notice_id", this.LJIIIIZZ);
            c188727au.LJIIIZ("notice_type", this.LJI);
            c188727au.LJIIIZ("notice_model", this.LJII);
            FMX.LJIIL("security_alert_notify", c188727au.LIZ);
        }
    }

    public final void LIZ(String str) {
        Intent LJI;
        if (this.LJIIIIZZ != null) {
            SafeInfoNoticeApi.LIZ.getClass();
            SafeInfoNoticeApi LIZ = C55673Lt7.LIZ();
            String str2 = this.LJIIIIZZ;
            o.LJI(str2);
            String str3 = this.LJI;
            if (str3 == null) {
                str3 = "";
            }
            LIZ.safeInfoConfirm(str2, str3).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LJJII(new InterfaceC64592gB() { // from class: X.9E2
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.9Xe
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th != null) {
                        th.printStackTrace();
                    }
                }
            });
            Keva.getRepo("account_security_keva_name").storeBoolean(LRU.LIZ("safe_info_need_show_"), false);
            try {
                dismiss();
            } catch (Exception unused) {
            }
            this.LJFF = true;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (ujb.o.LJJJJIZL(this.LJI, "unbind_email", false)) {
            SmartRouter.buildRoute(LJIIIIZZ, str).open();
            return;
        }
        if (LJIIIIZZ == null || str == null) {
            return;
        }
        StringBuilder LIZJ = b1.LIZJ(str, "&notice_id=");
        LIZJ.append(this.LJIIIIZZ);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (!TextUtils.isEmpty(LIZIZ)) {
            StringBuilder sb = new StringBuilder();
            if (LIZIZ.startsWith("https://") || LIZIZ.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/");
                    sb.append("?url=");
                    sb.append(URLEncoder.encode(LIZIZ, "ISO-8859-1"));
                } catch (Exception unused2) {
                }
                LJI = AbstractC57425MgH.LJI(LJIIIIZZ, UriProtector.parse(sb.toString()));
                o.LJIIIIZZ(LJI, "getIntentWithHttpUrl(act…eme&notice_id=$noticeId\")");
                LJI.setClass(LJIIIIZZ, CrossPlatformActivity.class);
                LJI.putExtra("hide_nav_bar", true);
                C16880lQ.LIZIZ(LJIIIIZZ, LJI);
            }
        }
        LJI = null;
        o.LJIIIIZZ(LJI, "getIntentWithHttpUrl(act…eme&notice_id=$noticeId\")");
        LJI.setClass(LJIIIIZZ, CrossPlatformActivity.class);
        LJI.putExtra("hide_nav_bar", true);
        C16880lQ.LIZIZ(LJIIIIZZ, LJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8V(Context context, View anchorView) {
        super(context);
        int LJJLIIJ;
        o.LJIIIZ(anchorView, "anchorView");
        this.LIZ = context;
        this.LIZIZ = anchorView;
        this.LJFF = true;
        setContentView(C16880lQ.LLLZIIL(R.layout.c1h, C16880lQ.LLZIL(context), null));
        View findViewById = getContentView().findViewById(R.id.fjw);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.layout_notice)");
        this.LIZJ = (LinearLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.mce);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.tv_notice_content)");
        TextView textView = (TextView) findViewById2;
        this.LIZLLL = textView;
        View findViewById3 = getContentView().findViewById(R.id.f7w);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.iv_notice_handle)");
        TuxIconView tuxIconView = (TuxIconView) findViewById3;
        SafeInfoNoticeMsg safeInfoNoticeMsg = (SafeInfoNoticeMsg) GsonProtectorUtils.fromJson(new Gson(), Keva.getRepo("account_security_keva_name").getString(LRU.LIZ("safe_info_"), ""), SafeInfoNoticeMsg.class);
        if (safeInfoNoticeMsg != null) {
            this.LJII = safeInfoNoticeMsg.noticeModel;
            this.LJI = safeInfoNoticeMsg.noticeType;
            this.LJIIIIZZ = safeInfoNoticeMsg.noticeId;
            this.LJIIIZ = new SpannableStringBuilder(safeInfoNoticeMsg.notice);
            this.LJIIJ = safeInfoNoticeMsg.scheme;
            this.LJIIJJI = safeInfoNoticeMsg.highlight;
        }
        if (this.LJIIIZ != null) {
            if (TextUtils.equals(this.LJII, "can_not_cancel")) {
                tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
                C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 178));
            } else {
                tuxIconView.setIconRes(R.drawable.b1x);
                C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 179));
            }
            if (this.LJIIJJI != null && (!r0.isEmpty())) {
                List<SafeInfoNoticeMsgHighlight> list = this.LJIIJJI;
                o.LJI(list);
                for (SafeInfoNoticeMsgHighlight safeInfoNoticeMsgHighlight : list) {
                    String str = safeInfoNoticeMsgHighlight.content;
                    if (str != null && (LJJLIIJ = s.LJJLIIJ(String.valueOf(this.LJIIIZ), str, 6)) != -1) {
                        SpannableStringBuilder spannableStringBuilder = this.LJIIIZ;
                        o.LJI(spannableStringBuilder);
                        if (LJJLIIJ < spannableStringBuilder.length()) {
                            int length = str.length() + LJJLIIJ;
                            SpannableStringBuilder spannableStringBuilder2 = this.LJIIIZ;
                            o.LJI(spannableStringBuilder2);
                            if (length <= spannableStringBuilder2.length()) {
                                M8W m8w = new M8W(this, safeInfoNoticeMsgHighlight);
                                SpannableStringBuilder spannableStringBuilder3 = this.LJIIIZ;
                                o.LJI(spannableStringBuilder3);
                                spannableStringBuilder3.setSpan(m8w, LJJLIIJ, str.length() + LJJLIIJ, 33);
                            }
                        }
                    }
                }
                this.LIZLLL.setText(this.LJIIIZ);
                this.LIZLLL.setMovementMethod(LinkMovementMethod.getInstance());
                this.LIZLLL.setHighlightColor(0);
                List<SafeInfoNoticeMsgHighlight> list2 = this.LJIIJJI;
                o.LJI(list2);
                if (list2.size() == 1) {
                    C16880lQ.LJIJI(this.LIZLLL, new ACListenerS29S0100000_9(this, 180));
                }
            } else {
                textView.setText(this.LJIIIZ);
                C16880lQ.LJIJI(textView, new ACListenerS29S0100000_9(this, 181));
            }
            this.LIZLLL.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(this, 6));
        }
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}

package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BusinessAccountNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MV9 extends C56906MVa {
    public final NotificationDetailVM LJLIL;
    public BaseNotice LJLILLLLZI;
    public final View LJLJI;
    public final C119624mk LJLJJI;
    public final TextView LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LJLILLLLZI;
        this.LJLIL.vP(baseNotice, new AqS156S0200000_9(baseNotice, this, 103));
    }

    public final void M(BaseNotice baseNotice) {
        String str;
        BusinessAccountNotice businessAccountNotice;
        String str2;
        this.LJLILLLLZI = baseNotice;
        this.LJLJJI.setImageURI(C78964Uyu.LIZJ(R.drawable.za));
        this.LJLJJL.setText("");
        this.LJLJJLL.setVisibility(8);
        this.LJLJL.setVisibility(8);
        BusinessAccountNotice businessAccountNotice2 = baseNotice.businessAccountNotice;
        String str3 = null;
        if (businessAccountNotice2 != null) {
            str = businessAccountNotice2.title;
            str3 = businessAccountNotice2.content;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8296);
        }
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            if (!TextUtils.isEmpty(str3)) {
                spannableStringBuilder.append(": ");
            }
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder.append((CharSequence) str3);
        }
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8297);
        }
        BaseNotice baseNotice2 = this.LJLILLLLZI;
        if (baseNotice2 != null && (businessAccountNotice = baseNotice2.businessAccountNotice) != null && (str2 = businessAccountNotice.schemaUrl) != null && C78857UxB.LJJJIL(str2)) {
            MXH.LIZIZ(this.LJLJJL, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
            this.LJLJL.setVisibility(0);
        } else {
            addCreateTimeSpan(spannableStringBuilder, baseNotice);
            this.LJLJJL.setText(spannableStringBuilder);
            this.LJLJL.setVisibility(8);
        }
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        BusinessAccountNotice businessAccountNotice;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Long l2;
        BusinessAccountNotice businessAccountNotice2;
        BaseNotice baseNotice = this.LJLILLLLZI;
        int i = 1;
        if (baseNotice != null && (businessAccountNotice = baseNotice.businessAccountNotice) != null && (str = businessAccountNotice.schemaUrl) != null && C78857UxB.LJJJIL(str)) {
            EF7.LIZIZ();
            if (C2NU.LIZ.LIZIZ()) {
                if (C6ZT.LIZ(view)) {
                    return;
                }
                Context context = this.mContext;
                BaseNotice baseNotice2 = this.LJLILLLLZI;
                if (baseNotice2 == null || (businessAccountNotice2 = baseNotice2.businessAccountNotice) == null || (str2 = businessAccountNotice2.schemaUrl) == null) {
                    str2 = "";
                }
                SmartRouter.buildRoute(context, str2).open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "notification_page");
                c188727au.LJIIIZ("tab_name", "all");
                BaseNotice baseNotice3 = this.LJLILLLLZI;
                String str5 = null;
                if (baseNotice3 != null) {
                    str3 = baseNotice3.templateId;
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("template_id", str3);
                BaseNotice baseNotice4 = this.LJLILLLLZI;
                if (baseNotice4 == null || !baseNotice4.hasRead) {
                    i = 0;
                }
                c188727au.LIZLLL(i, "is_read");
                c188727au.LIZLLL(0, "is_together");
                BaseNotice baseNotice5 = this.LJLILLLLZI;
                if (baseNotice5 != null) {
                    l = Long.valueOf(baseNotice5.createTime);
                } else {
                    l = null;
                }
                c188727au.LJFF(l, "message_time");
                c188727au.LIZLLL(getLayoutPosition(), "client_order");
                c188727au.LJIIIZ("action_type", "click");
                BaseNotice baseNotice6 = this.LJLILLLLZI;
                if (baseNotice6 != null) {
                    str4 = baseNotice6.getAccountType();
                } else {
                    str4 = null;
                }
                c188727au.LJIIIZ("account_type", str4);
                BaseNotice baseNotice7 = this.LJLILLLLZI;
                if (baseNotice7 != null) {
                    l2 = Long.valueOf(baseNotice7.taskId);
                } else {
                    l2 = null;
                }
                c188727au.LJFF(l2, "task_id");
                BaseNotice baseNotice8 = this.LJLILLLLZI;
                if (baseNotice8 != null) {
                    str5 = baseNotice8.nid;
                }
                c188727au.LJIIIZ("content_id", str5);
                c188727au.LJIIIZ("position", AX5.LIZ);
                FMX.LJIIL("official_message_inner_message", c188727au.LIZ);
                return;
            }
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        }
    }

    public MV9(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        this.LJLIL = notificationDetailVM;
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLJI = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLJJI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f7y);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.LJLJJLL = findViewById4;
        View findViewById5 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJL = findViewById5;
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        C56812MRk.LIZ(findViewById);
        C7FA.LIZIZ(c119624mk);
    }
}

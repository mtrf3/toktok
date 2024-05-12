package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PromoteNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVA extends C56906MVa {
    public final NotificationDetailVM LJLIL;
    public final View LJLILLLLZI;
    public final C119624mk LJLJI;
    public final TextView LJLJJI;
    public final C62846OlW LJLJJL;
    public final SY4 LJLJJLL;
    public final TuxIconView LJLJL;
    public final TextView LJLJLJ;
    public final ImageView LJLJLLL;
    public PromoteNotice LJLL;
    public BaseNotice LJLLI;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LJLLI;
        if (baseNotice == null) {
            return;
        }
        this.LJLIL.vP(baseNotice, new AqS156S0200000_9(baseNotice, this, 105));
    }

    public final void M(BaseNotice baseNotice) {
        boolean z;
        this.LJLLI = baseNotice;
        if (baseNotice.promoteNotice == null) {
            return;
        }
        this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.z5));
        PromoteNotice promoteNotice = baseNotice.promoteNotice;
        this.LJLL = promoteNotice;
        if (promoteNotice != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(promoteNotice.title)) {
                spannableStringBuilder.append((CharSequence) promoteNotice.title);
                if (!TextUtils.isEmpty(promoteNotice.content)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(promoteNotice.content)) {
                spannableStringBuilder.append((CharSequence) promoteNotice.content);
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            if (promoteNotice.schemaUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                addCreateTimeSpan(spannableStringBuilder, baseNotice);
                this.LJLJJI.setText(spannableStringBuilder);
                this.LJLJL.setVisibility(8);
                this.LJLJJL.setVisibility(8);
                this.LJLJLJ.setVisibility(8);
                this.LJLJLLL.setVisibility(8);
                this.LJLJJLL.setVisibility(8);
                return;
            }
            try {
                UriProtector.parse(promoteNotice.schemaUrl);
                MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
                this.LJLJL.setVisibility(0);
                this.LJLJJL.setVisibility(8);
                this.LJLJLJ.setVisibility(8);
                this.LJLJLLL.setVisibility(8);
                this.LJLJJLL.setVisibility(8);
                UrlModel urlModel = promoteNotice.imageUrl;
                if (urlModel == null) {
                    return;
                }
                C78765Uvh.LJFF(this.LJLJJL, urlModel);
                this.LJLJJL.setVisibility(0);
                this.LJLJL.setVisibility(8);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        PromoteNotice promoteNotice;
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        BaseNotice baseNotice = this.LJLLI;
        int i = 1;
        if (baseNotice != null && (promoteNotice = baseNotice.promoteNotice) != null && (str = promoteNotice.schemaUrl) != null && C78857UxB.LJJJIL(str)) {
            EF7.LIZIZ();
            if (C2NU.LIZ.LIZIZ()) {
                if (C6ZT.LIZ(view)) {
                    return;
                }
                PromoteNotice promoteNotice2 = this.LJLL;
                if (promoteNotice2 != null) {
                    SmartRouter.buildRoute(this.mContext, promoteNotice2.schemaUrl).open();
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "notification_page");
                c188727au.LJIIIZ("tab_name", "all");
                BaseNotice baseNotice2 = this.LJLLI;
                Long l2 = null;
                if (baseNotice2 != null) {
                    str2 = baseNotice2.templateId;
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("template_id", str2);
                BaseNotice baseNotice3 = this.LJLLI;
                if (baseNotice3 == null || !baseNotice3.hasRead) {
                    i = 0;
                }
                c188727au.LIZLLL(i, "is_read");
                c188727au.LIZLLL(0, "is_together");
                BaseNotice baseNotice4 = this.LJLLI;
                if (baseNotice4 != null) {
                    l = Long.valueOf(baseNotice4.createTime);
                } else {
                    l = null;
                }
                c188727au.LJFF(l, "message_time");
                c188727au.LIZLLL(getLayoutPosition(), "client_order");
                c188727au.LJIIIZ("action_type", "click");
                BaseNotice baseNotice5 = this.LJLLI;
                if (baseNotice5 != null) {
                    str3 = baseNotice5.getAccountType();
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("account_type", str3);
                BaseNotice baseNotice6 = this.LJLLI;
                if (baseNotice6 != null) {
                    str4 = baseNotice6.nid;
                } else {
                    str4 = null;
                }
                c188727au.LJIIIZ("content_id", str4);
                BaseNotice baseNotice7 = this.LJLLI;
                if (baseNotice7 != null) {
                    l2 = Long.valueOf(baseNotice7.taskId);
                }
                c188727au.LJFF(l2, "task_id");
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

    public MVA(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        this.LJLIL = notificationDetailVM;
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLJI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.h4n);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_cover)");
        this.LJLJJL = (C62846OlW) findViewById4;
        View findViewById5 = view.findViewById(R.id.h4i);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.notification_button)");
        SY4 sy4 = (SY4) findViewById5;
        this.LJLJJLL = sy4;
        View findViewById6 = view.findViewById(R.id.h4d);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.notification_arrow)");
        this.LJLJL = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.kcu);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.start_duet_tv)");
        TextView textView = (TextView) findViewById7;
        this.LJLJLJ = textView;
        View findViewById8 = view.findViewById(R.id.kct);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        ImageView imageView = (ImageView) findViewById8;
        this.LJLJLLL = imageView;
        C56812MRk.LIZ(findViewById);
        C56812MRk.LIZ(textView);
        C56812MRk.LIZ(imageView);
        C7FA.LIZIZ(c119624mk);
        sy4.getLayoutParams().width = C56812MRk.LIZIZ(this.mContext);
        C16880lQ.LJJIZ(sy4, this);
        C16880lQ.LJIILLIIL(imageView, this);
        C16880lQ.LJIJI(textView, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        this.mIsRTL = C90193gN.LIZIZ(this.mContext);
    }
}

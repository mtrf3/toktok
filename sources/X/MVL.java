package X;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVL extends C56906MVa {
    public final NotificationDetailVM LJLIL;
    public final View LJLILLLLZI;
    public final C119624mk LJLJI;
    public final TextView LJLJJI;
    public final C62846OlW LJLJJL;
    public final SY4 LJLJJLL;
    public final TuxIconView LJLJL;
    public final TextView LJLJLJ;
    public final ImageView LJLJLLL;
    public AnnouncementNotice LJLL;
    public UserTextNotice LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;
    public BaseNotice LJLZ;
    public String LJZ;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LJLZ;
        if (baseNotice == null) {
            return;
        }
        this.LJLIL.vP(baseNotice, new AqS156S0200000_9(baseNotice, this, 104));
    }

    public static final void P(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", "tiktok_assistant");
        c188727au.LJIIIZ("prop_id", str);
        FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
    }

    public final void M(BaseNotice baseNotice) {
        boolean z;
        if (baseNotice.announcement == null && baseNotice.textNotice == null) {
            return;
        }
        this.LJLZ = baseNotice;
        this.LJLLILLLL = baseNotice.nid;
        this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.zf));
        AnnouncementNotice announcementNotice = baseNotice.announcement;
        this.LJLL = announcementNotice;
        if (announcementNotice != null) {
            if (announcementNotice.getChallenge() != null) {
                z = true;
            } else {
                z = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                spannableStringBuilder.append((CharSequence) announcementNotice.getTitle());
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                spannableStringBuilder.append((CharSequence) announcementNotice.getContent());
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            if (z) {
                C56812MRk.LIZ(this.LJLILLLLZI);
                MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 192.0f)));
                this.LJLJJLL.setVisibility(0);
                this.LJLJJL.setVisibility(8);
                this.LJLJL.setVisibility(8);
            } else if (announcementNotice.getImageUrl() != null) {
                C56812MRk.LIZ(this.LJLILLLLZI);
                MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 160.0f)));
                this.LJLJJLL.setVisibility(8);
                this.LJLJJL.setVisibility(0);
                this.LJLJL.setVisibility(8);
                C78765Uvh.LJFF(this.LJLJJL, announcementNotice.getImageUrl());
            } else {
                String schemaUrl = announcementNotice.getSchemaUrl();
                if (schemaUrl == null || schemaUrl.length() == 0) {
                    this.LJLILLLLZI.setOnTouchListener(null);
                    View view = this.LJLILLLLZI;
                    if (Build.VERSION.SDK_INT >= 23) {
                        view.setForeground(null);
                    } else {
                        C16880lQ.LJIIJ(null, view);
                    }
                    addCreateTimeSpan(spannableStringBuilder, baseNotice);
                    this.LJLJJI.setText(spannableStringBuilder);
                    this.LJLJJLL.setVisibility(8);
                    this.LJLJJL.setVisibility(8);
                    this.LJLJL.setVisibility(8);
                } else {
                    C56812MRk.LIZ(this.LJLILLLLZI);
                    MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
                    this.LJLJJLL.setVisibility(8);
                    this.LJLJJL.setVisibility(8);
                    this.LJLJL.setVisibility(0);
                }
            }
            String schemaUrl2 = announcementNotice.getSchemaUrl();
            String str = "";
            if (schemaUrl2 == null) {
                schemaUrl2 = "";
            }
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(schemaUrl2), "event_keyword");
            if (queryParameter != null) {
                str = queryParameter;
            }
            this.LJZ = str;
        }
        UserTextNotice userTextNotice = baseNotice.textNotice;
        this.LJLLI = userTextNotice;
        if (userTextNotice != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append(": ");
                }
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
            }
            if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                spannableStringBuilder2.append((CharSequence) userTextNotice.getContent());
            }
            String schemaUrl3 = userTextNotice.getSchemaUrl();
            if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                addCreateTimeSpan(spannableStringBuilder2, baseNotice);
                this.LJLJJI.setText(spannableStringBuilder2);
                this.LJLJL.setVisibility(8);
                this.LJLJJL.setVisibility(8);
                this.LJLJLJ.setVisibility(8);
                this.LJLJLLL.setVisibility(8);
                this.LJLJJLL.setVisibility(8);
                return;
            }
            try {
                android.net.Uri parse = UriProtector.parse(userTextNotice.getSchemaUrl());
                this.LJLLJ = parse.getBooleanQueryParameter("effects", false);
                this.LJLLL = parse.getBooleanQueryParameter("blur", false);
                this.LJLLLL = parse.getBooleanQueryParameter("duet", false);
                String queryParameter2 = UriProtector.getQueryParameter(parse, "aweme_id");
                this.LJLLLLLL = queryParameter2;
                if (this.LJLLLL && !TextUtils.isEmpty(queryParameter2)) {
                    MXH.LIZIZ(this.LJLJJI, spannableStringBuilder2, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 192.0f)));
                    this.LJLJL.setVisibility(8);
                    this.LJLJJL.setVisibility(0);
                    this.LJLJLJ.setVisibility(0);
                    this.LJLJLLL.setVisibility(0);
                    this.LJLJJLL.setVisibility(8);
                    C78765Uvh.LJFF(this.LJLJJL, userTextNotice.getImageUrl());
                } else {
                    MXH.LIZIZ(this.LJLJJI, spannableStringBuilder2, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
                    this.LJLJL.setVisibility(0);
                    this.LJLJJL.setVisibility(8);
                    this.LJLJLJ.setVisibility(8);
                    this.LJLJLLL.setVisibility(8);
                    this.LJLJJLL.setVisibility(8);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0180, code lost:
    
        if (r19.LIZ(r20, r25.LJLLL, r25.LJLLJ, r25.LJLLLL, r25.LJLLLLLL) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0286, code lost:
    
        if (ujb.o.LJJJLIIL(r10, "aweme://friend/find", r7) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fe  */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVL.onClick(android.view.View):void");
    }

    public MVL(View view, NotificationDetailVM notificationDetailVM) {
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
        this.LJLJLJ = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.kct);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.start_duet_iv)");
        this.LJLJLLL = (ImageView) findViewById8;
        sy4.getLayoutParams().width = C56812MRk.LIZIZ(this.mContext);
        C7FA.LIZIZ(c119624mk);
        C7FA.LIZIZ(sy4);
        C16880lQ.LJJIZ(sy4, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        this.mIsRTL = C90193gN.LIZIZ(this.mContext);
    }

    public final void N(String str, String str2) {
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", "tiktok_assistant");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("process_id", str2);
        BaseNotice baseNotice = this.LJLZ;
        if (baseNotice != null) {
            str3 = baseNotice.templateId;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("template_id", str3);
        FMX.LJIIL("enter_music_detail", c188727au.LIZ);
    }
}

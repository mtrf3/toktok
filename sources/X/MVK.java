package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class MVK extends C56906MVa {
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
    public BaseNotice LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LJLLILLLL;
        if (baseNotice == null) {
            return;
        }
        this.LJLIL.vP(baseNotice, new AqS156S0200000_9(this, baseNotice, 106));
    }

    public static final void P(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", "official_info");
        c188727au.LJIIIZ("prop_id", str);
        FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
    }

    public final void M(BaseNotice baseNotice) {
        boolean z;
        boolean z2;
        UserTextNotice userTextNotice;
        String schemaUrl;
        if (baseNotice.announcement == null && baseNotice.textNotice == null) {
            return;
        }
        this.LJLLILLLL = baseNotice;
        this.LJLZ = baseNotice.nid;
        if (baseNotice.type == 2 && (userTextNotice = baseNotice.textNotice) != null && (schemaUrl = userTextNotice.getSchemaUrl()) != null && s.LJJJLZIJ(schemaUrl, "contract_invitation=1", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LJZ = z;
        this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.z6));
        UserTextNotice userTextNotice2 = baseNotice.textNotice;
        this.LJLLI = userTextNotice2;
        if (userTextNotice2 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(userTextNotice2.getTitle())) {
                spannableStringBuilder.append((CharSequence) userTextNotice2.getTitle());
                if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                String content = userTextNotice2.getContent();
                o.LJIIIIZZ(content, "it.content");
                spannableStringBuilder.append((CharSequence) s.LJZI(content).toString());
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            String schemaUrl2 = userTextNotice2.getSchemaUrl();
            if (schemaUrl2 == null || schemaUrl2.length() == 0) {
                addCreateTimeSpan(spannableStringBuilder, baseNotice);
                this.LJLJJI.setText(spannableStringBuilder);
                this.LJLJL.setVisibility(8);
                this.LJLJJL.setVisibility(8);
                this.LJLJLJ.setVisibility(8);
                this.LJLJLLL.setVisibility(8);
                this.LJLJJLL.setVisibility(8);
            } else {
                try {
                    android.net.Uri parse = UriProtector.parse(userTextNotice2.getSchemaUrl());
                    this.LJLLJ = parse.getBooleanQueryParameter("effects", false);
                    this.LJLLL = parse.getBooleanQueryParameter("blur", false);
                    this.LJLLLL = parse.getBooleanQueryParameter("duet", false);
                    this.LJLLLLLL = UriProtector.getQueryParameter(parse, "aweme_id");
                    String queryParameter = UriProtector.getQueryParameter(parse, "show_image");
                    String queryParameter2 = UriProtector.getQueryParameter(parse, "channel");
                    if (this.LJLLLL && !TextUtils.isEmpty(this.LJLLLLLL)) {
                        MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 192.0f)));
                        this.LJLJL.setVisibility(8);
                        this.LJLJJL.setVisibility(0);
                        this.LJLJLJ.setVisibility(0);
                        this.LJLJLLL.setVisibility(0);
                        this.LJLJJLL.setVisibility(8);
                        C78765Uvh.LJFF(this.LJLJJL, userTextNotice2.getImageUrl());
                    } else if (TextUtils.equals(queryParameter, "1")) {
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            List LJJIJ = C47261Igj.LJJIJ(queryParameter2);
                            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                            if (LJJI != null) {
                                LJJI.LJI();
                                NHG.LIZ.LJIILL(null, C78886Uxe.LJJLIIIJL(LJJIJ));
                            }
                            MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 160.0f)));
                            this.LJLJJLL.setVisibility(8);
                            this.LJLJJL.setVisibility(0);
                            this.LJLJL.setVisibility(8);
                            this.LJLJLJ.setVisibility(8);
                            this.LJLJLLL.setVisibility(8);
                            C78765Uvh.LJFF(this.LJLJJL, userTextNotice2.getImageUrl());
                        }
                    } else {
                        MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
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
        AnnouncementNotice announcementNotice = baseNotice.announcement;
        this.LJLL = announcementNotice;
        if (announcementNotice != null) {
            if (announcementNotice.getChallenge() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                spannableStringBuilder2.append((CharSequence) announcementNotice.getTitle());
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append(": ");
                }
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
            }
            if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                spannableStringBuilder2.append((CharSequence) announcementNotice.getContent());
            }
            if (z2) {
                C56812MRk.LIZ(this.LJLILLLLZI);
                MXH.LIZIZ(this.LJLJJI, spannableStringBuilder2, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 192.0f)));
                this.LJLJJLL.setVisibility(0);
                this.LJLJJL.setVisibility(8);
                this.LJLJL.setVisibility(8);
                return;
            }
            if (announcementNotice.getImageUrl() != null) {
                C56812MRk.LIZ(this.LJLILLLLZI);
                MXH.LIZIZ(this.LJLJJI, spannableStringBuilder2, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 160.0f)));
                this.LJLJJLL.setVisibility(8);
                this.LJLJJL.setVisibility(0);
                this.LJLJL.setVisibility(8);
                C78765Uvh.LJFF(this.LJLJJL, announcementNotice.getImageUrl());
                return;
            }
            String schemaUrl3 = announcementNotice.getSchemaUrl();
            if (schemaUrl3 == null || schemaUrl3.length() == 0) {
                this.LJLILLLLZI.setOnTouchListener(null);
                View view = this.LJLILLLLZI;
                if (Build.VERSION.SDK_INT >= 23) {
                    view.setForeground(null);
                } else {
                    C16880lQ.LJIIJ(null, view);
                }
                addCreateTimeSpan(spannableStringBuilder2, baseNotice);
                this.LJLJJI.setText(spannableStringBuilder2);
                this.LJLJJLL.setVisibility(8);
                this.LJLJJL.setVisibility(8);
                this.LJLJL.setVisibility(8);
                return;
            }
            C56812MRk.LIZ(this.LJLILLLLZI);
            MXH.LIZIZ(this.LJLJJI, spannableStringBuilder2, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 132.0f)));
            this.LJLJJLL.setVisibility(8);
            this.LJLJJL.setVisibility(8);
            this.LJLJL.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r17.LIZ(r18, r23.LJLLL, r23.LJLLJ, r23.LJLLLL, r23.LJLLLLLL) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
    
        if (ujb.o.LJJJLIIL(r0, "aweme://friend/find", r10) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0281  */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVK.onClick(android.view.View):void");
    }

    public MVK(View view, NotificationDetailVM notificationDetailVM) {
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
        V92 hierarchy = c119624mk.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cj, context), 1);
        this.mIsRTL = C90193gN.LIZIZ(this.mContext);
    }

    public static final void N(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LJIIIZ("account_type", "official_info");
        c188727au.LJIIIZ("music_id", str);
        c188727au.LJIIIZ("process_id", str2);
        FMX.LJIIL("enter_music_detail", c188727au.LIZ);
    }
}

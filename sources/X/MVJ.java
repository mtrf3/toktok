package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.TcmNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVJ extends C56906MVa {
    public final NotificationDetailVM LJLIL;
    public final View LJLILLLLZI;
    public final C119624mk LJLJI;
    public final TextView LJLJJI;
    public final C62846OlW LJLJJL;
    public final SY4 LJLJJLL;
    public final TuxIconView LJLJL;
    public final TextView LJLJLJ;
    public final ImageView LJLJLLL;
    public final TextView LJLL;
    public TcmNotice LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public Long LJLZ;
    public BaseNotice LJZ;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LJZ;
        if (baseNotice == null) {
            return;
        }
        this.LJLIL.vP(baseNotice, new AqS156S0200000_9(this, baseNotice, 107));
    }

    public final void M(BaseNotice baseNotice) {
        if (baseNotice.tcmNotice == null) {
            return;
        }
        this.LJZ = baseNotice;
        this.LJLLLLLL = baseNotice.nid;
        this.LJLJI.setImageURI(C78964Uyu.LIZJ(R.drawable.z_));
        this.LJLLI = baseNotice.tcmNotice;
        this.LJLZ = Long.valueOf(baseNotice.createTime);
        TcmNotice tcmNotice = this.LJLLI;
        if (tcmNotice != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(tcmNotice.title)) {
                spannableStringBuilder.append((CharSequence) tcmNotice.title);
                if (!TextUtils.isEmpty(tcmNotice.content)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(tcmNotice.content)) {
                spannableStringBuilder.append((CharSequence) tcmNotice.content);
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            String str = tcmNotice.sourceName;
            boolean z = true;
            if (str != null && str.length() != 0) {
                this.LJLL.setText(this.mContext.getString(R.string.i7m, tcmNotice.sourceName));
                this.LJLL.setVisibility(0);
            }
            UrlModel urlModel = tcmNotice.sourceIcon;
            if (urlModel != null) {
                C78765Uvh.LJFF(this.LJLJI, urlModel);
            }
            if (tcmNotice.schemaUrl.length() != 0) {
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
                android.net.Uri parse = UriProtector.parse(tcmNotice.schemaUrl);
                this.LJLLILLLL = parse.getBooleanQueryParameter("effects", false);
                this.LJLLJ = parse.getBooleanQueryParameter("blur", false);
                this.LJLLL = parse.getBooleanQueryParameter("duet", false);
                String queryParameter = UriProtector.getQueryParameter(parse, "aweme_id");
                this.LJLLLL = queryParameter;
                if (this.LJLLL && !TextUtils.isEmpty(queryParameter)) {
                    MXH.LIZIZ(this.LJLJJI, spannableStringBuilder, baseNotice, 10, KL2.LJIIJJI(this.mContext) - ((int) KL2.LIZJ(this.mContext, 192.0f)));
                    this.LJLJL.setVisibility(8);
                    this.LJLJJL.setVisibility(0);
                    this.LJLJLJ.setVisibility(0);
                    this.LJLJLLL.setVisibility(0);
                    this.LJLJJLL.setVisibility(8);
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7.LIZ(r8, r13.LJLLJ, r13.LJLLILLLL, r13.LJLLL, r13.LJLLLL) == false) goto L23;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVJ.onClick(android.view.View):void");
    }

    public MVJ(View view, NotificationDetailVM notificationDetailVM) {
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
        View findViewById9 = view.findViewById(R.id.h5x);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.notification_tcm_from)");
        this.LJLL = (TextView) findViewById9;
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

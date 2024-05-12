package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AdHelperNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVF extends MVV {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final C62846OlW LJLJJI;
    public BaseNotice LJLJJL;
    public AdHelperNotice LJLJJLL;
    public final Context LJLJL;

    @Override // X.MVV
    public final int getRootId() {
        return R.id.h5p;
    }

    public final boolean N() {
        String str;
        HashMap hashMap = new HashMap();
        BaseNotice baseNotice = this.LJLJJL;
        String str2 = null;
        if (baseNotice != null) {
            str = baseNotice.nid;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        hashMap.put("aid", String.valueOf(MNR.LIZ));
        hashMap.put("channel", SchemaPageHelperImpl.LJ().getChannel());
        SchemaPageHelper LJ = SchemaPageHelperImpl.LJ();
        Context context = this.LJLJL;
        AdHelperNotice adHelperNotice = this.LJLJJLL;
        if (adHelperNotice != null) {
            str2 = adHelperNotice.webUrl;
        }
        String string = context.getString(R.string.h9c);
        if (string != null) {
            str3 = string;
        }
        return LJ.LIZLLL(context, str2, str3, hashMap);
    }

    public final void M(BaseNotice baseNotice) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AdHelperNotice adHelperNotice = baseNotice.adHelperNotice;
        if (adHelperNotice == null) {
            return;
        }
        this.LJLJJL = baseNotice;
        this.LJLJJLL = adHelperNotice;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8296);
        }
        AdHelperNotice adHelperNotice2 = this.LJLJJLL;
        UrlModel urlModel = null;
        if (adHelperNotice2 != null) {
            str = adHelperNotice2.title;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AdHelperNotice adHelperNotice3 = this.LJLJJLL;
            if (adHelperNotice3 != null) {
                str4 = adHelperNotice3.title;
            } else {
                str4 = null;
            }
            spannableStringBuilder.append((CharSequence) str4);
            AdHelperNotice adHelperNotice4 = this.LJLJJLL;
            if (adHelperNotice4 != null) {
                str5 = adHelperNotice4.content;
            } else {
                str5 = null;
            }
            if (!TextUtils.isEmpty(str5)) {
                spannableStringBuilder.append(": ");
            }
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        AdHelperNotice adHelperNotice5 = this.LJLJJLL;
        if (adHelperNotice5 != null) {
            str2 = adHelperNotice5.content;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            AdHelperNotice adHelperNotice6 = this.LJLJJLL;
            if (adHelperNotice6 != null) {
                str3 = adHelperNotice6.content;
            } else {
                str3 = null;
            }
            spannableStringBuilder.append((CharSequence) str3);
        }
        if (this.mIsRTL) {
            spannableStringBuilder.append((char) 8297);
        }
        this.LJLILLLLZI.setImageURI(C78964Uyu.LIZJ(R.drawable.zj));
        addCreateTimeSpan(spannableStringBuilder, baseNotice);
        this.LJLJI.setText(spannableStringBuilder);
        C62846OlW c62846OlW = this.LJLJJI;
        AdHelperNotice adHelperNotice7 = this.LJLJJLL;
        if (adHelperNotice7 != null) {
            urlModel = adHelperNotice7.imageUrl;
        }
        C78765Uvh.LJFF(c62846OlW, urlModel);
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (C2NU.LIZ.LIZIZ()) {
            if (view == null) {
                return;
            }
            int id = view.getId();
            String str2 = null;
            if (id == R.id.h5p || id == R.id.h4v) {
                C61200O0e LIZLLL = C61200O0e.LIZLLL();
                AdHelperNotice adHelperNotice = this.LJLJJLL;
                if (adHelperNotice != null) {
                    str = adHelperNotice.contentSchemaUrl;
                } else {
                    str = null;
                }
                if (!LIZLLL.LJII(str) && !N()) {
                    C61200O0e LIZLLL2 = C61200O0e.LIZLLL();
                    AdHelperNotice adHelperNotice2 = this.LJLJJLL;
                    if (adHelperNotice2 != null) {
                        str2 = adHelperNotice2.schemaUrl;
                    }
                    LIZLLL2.LJII(str2);
                    return;
                }
                return;
            }
            if (id != R.id.e9b) {
                return;
            }
            C61200O0e LIZLLL3 = C61200O0e.LIZLLL();
            AdHelperNotice adHelperNotice3 = this.LJLJJLL;
            if (adHelperNotice3 != null) {
                str2 = adHelperNotice3.schemaUrl;
            }
            if (LIZLLL3.LJII(str2)) {
                return;
            }
            N();
            return;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26045AKb c26045AKb = new C26045AKb(itemView);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    public MVF(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLILLLLZI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.e9b);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.ic_cover)");
        C62846OlW c62846OlW = (C62846OlW) findViewById4;
        this.LJLJJI = c62846OlW;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLJL = context;
        C56812MRk.LIZ(findViewById);
        C7FA.LIZIZ(c62846OlW);
        C7FA.LIZIZ(c119624mk);
        C16880lQ.LJJJJJL(c62846OlW, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        this.mIsRTL = C90193gN.LIZIZ(context);
    }
}

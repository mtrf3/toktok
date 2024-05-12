package Y;

import X.C141415gn;
import X.C2NO;
import X.C40343FsR;
import X.C62828OlE;
import X.C63104Opg;
import X.OKG;
import X.T5S;
import X.UPJ;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDCSpanS34S0100000_10 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public IDCSpanS34S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, View widget) {
        C2NO videoDownloadClickListener;
        o.LJIIIZ(widget, "widget");
        if (((C62828OlE) iDCSpanS34S0100000_10.l0).getDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C62828OlE) iDCSpanS34S0100000_10.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.LJLIIL(true);
        }
    }

    public static final void onClick$1(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, View widget) {
        C2NO videoDownloadClickListener;
        o.LJIIIZ(widget, "widget");
        if (((C62828OlE) iDCSpanS34S0100000_10.l0).getDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C62828OlE) iDCSpanS34S0100000_10.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.LJLIIL(false);
        }
    }

    public static final void onClick$2(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        Context context = ((C63104Opg) iDCSpanS34S0100000_10.l0).LJFF;
        if (context != null) {
            Uri.Builder authority = new Uri.Builder().scheme("sslocal").authority("webview_popup");
            String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
            String LJIILL = AccountService.LJIJ().LJIILL();
            if (LJIILL != null) {
                Locale locale = Locale.ROOT;
                str = C141415gn.LIZIZ(locale, "ROOT", LJIILL, locale, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            String uri = authority.appendQueryParameter("url", UPJ.LIZIZ("https://www.tiktok.com/in_app/redirect?region=", str, "&language=", appLanguage, "&projectKey=privacy-policy")).appendQueryParameter("height", "80%").appendQueryParameter("target_handler", "webcast").appendQueryParameter("show_title_bar", "1").appendQueryParameter("title", context.getString(R.string.p9w)).appendQueryParameter("show_title_close", "1").appendQueryParameter("show_title_share", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("container_bg_color", "FFFFFF").build().toString();
            o.LJIIIIZZ(uri, "Builder().scheme(\"ssloca…      .build().toString()");
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(uri);
            ((ILiveSparkService) ServiceManager.get().getService(ILiveSparkService.class)).Iu0(sparkContext);
            OKG.LIZLLL(C40343FsR.LJIILJJIL, context, sparkContext);
        }
    }

    public static final void updateDrawState$0(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        T5S t5s = new T5S();
        t5s.LIZ(83);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$1(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        T5S t5s = new T5S();
        t5s.LIZ(83);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$2(IDCSpanS34S0100000_10 iDCSpanS34S0100000_10, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}

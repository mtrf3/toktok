package Y;

import X.AnonymousClass636;
import X.C145995oB;
import X.C43198GxO;
import X.C59895Nf1;
import X.C78934UyQ;
import X.C79045V0n;
import X.FMX;
import X.GTF;
import X.GW6;
import X.InterfaceC43207GxX;
import X.T5S;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public class IDCSpanS32S0100000_7 extends ClickableSpan {
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
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
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
            case 3:
                updateDrawState$3(this, textPaint);
                return;
            case 4:
                updateDrawState$4(this, textPaint);
                return;
            case 5:
                updateDrawState$5(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public IDCSpanS32S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View view) {
        String str;
        LocalServiceImpl.LIZIZ().LIZ(((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).mActivity);
        SmartRoute buildRoute = SmartRouter.buildRoute(((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).LLII(), "aweme://webview");
        buildRoute.withParam("url", "https://www.tiktok.com/tns-inapp/pages/ai-generated-content?hide_nav_bar=1&enter_from=learn_more");
        buildRoute.open();
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).LLILZLL;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getCreationId();
        } else {
            str = "mModel is null";
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("content_type", ((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).LLLLIILLL());
        c145995oB.LJI("content_source", ((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).LLILZLL.getAvetParameter().getContentSource());
        FMX.LJIIL("click_aigc_toggle_learn_more", c145995oB.LIZ);
    }

    public static final void onClick$1(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View widget) {
        o.LJIIIZ(widget, "widget");
        a.LJ().jumpToAgsStatusPage(((GW6) iDCSpanS32S0100000_7.l0).LJLIL, "float_post");
        ((GW6) iDCSpanS32S0100000_7.l0).LJLJI.LIZJ(false, false);
    }

    public static final void onClick$2(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View view) {
        String str;
        o.LJIIIZ(view, "view");
        C78934UyQ.LJLIL.getCommerceService().getClass();
        BrandedContentToolSchema LIZ = GTF.LIZ();
        if (LIZ == null || (str = LIZ.brandedContentInfo) == null) {
            str = "https://support.tiktok.com/en/business-and-creator/creator-and-business-accounts/branded-content-on-tiktok";
        }
        C59895Nf1.LIZLLL((Context) iDCSpanS32S0100000_7.l0, "aweme://webview/", "url", str);
    }

    public static final void onClick$3(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View widget) {
        InterfaceC43207GxX videoDownloadClickListener;
        o.LJIIIZ(widget, "widget");
        if (((C43198GxO) iDCSpanS32S0100000_7.l0).getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C43198GxO) iDCSpanS32S0100000_7.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.p0();
        }
    }

    public static final void onClick$4(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View widget) {
        o.LJIIIZ(widget, "widget");
        ICommerceToolsService LIZ = CommerceToolsService.LIZ();
        Context requireContext = ((Fragment) iDCSpanS32S0100000_7.l0).requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        LIZ.openBrandedContentPage(requireContext);
    }

    public static final void onClick$5(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        BrandedContentToolSchema LIZ = GTF.LIZ();
        if (LIZ == null || (str = LIZ.brandedContentPolicy) == null) {
            str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) iDCSpanS32S0100000_7.l0, "aweme://webview/");
        buildRoute.withParam("url", UriProtector.parse(str).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", "general").build().toString());
        buildRoute.open();
    }

    public static final void updateDrawState$0(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, ((VideoPublishContainerScene) iDCSpanS32S0100000_7.l0).LLII()));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, (Context) iDCSpanS32S0100000_7.l0));
        ds.setUnderlineText(false);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$3(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        T5S t5s = new T5S();
        t5s.LIZ(83);
        ds.setTypeface(t5s.getTypeface());
    }

    public static final void updateDrawState$4(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint ds) {
        Integer LJI;
        o.LJIIIZ(ds, "ds");
        Context context = ((Fragment) iDCSpanS32S0100000_7.l0).getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.go, context)) != null) {
            ds.setColor(LJI.intValue());
        }
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$5(IDCSpanS32S0100000_7 iDCSpanS32S0100000_7, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, (Context) iDCSpanS32S0100000_7.l0));
        ds.setUnderlineText(false);
    }
}

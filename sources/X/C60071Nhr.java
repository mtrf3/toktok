package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60071Nhr extends AbstractC60117Nib {
    public static final List<String> LJLLJ = C47261Igj.LJJIJIIJI("tiktokv.com", "tiktokcdn.com", "byteoversea.com", "sgsnssdk.com", "isnssdk.com", "ibyteimg.com", "ibytedtos.com", "tiktok.com", "xzcs3zlph.com");
    public final C60072Nhs LJLIL;
    public C252709vu LJLILLLLZI;
    public String LJLJI;
    public final C62822Ol8 LJLJJI;
    public SparkContext LJLJJL;
    public SparkActivity LJLJJLL;
    public final Aweme LJLJL;
    public final Integer LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;

    @Override // X.InterfaceC60844NuK
    public final void LJIIJJI(View.OnClickListener onClickListener) {
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIL(int i) {
    }

    public final void LIZJ() {
        String str;
        SparkContext sparkContext = this.LJLJJL;
        Object obj = null;
        if (sparkContext != null) {
            WebKitView LJIIIZ = C79043V0l.LJIIIZ(sparkContext);
            if (LJIIIZ != null) {
                str = LJIIIZ.getUrl();
            } else {
                str = null;
            }
            SparkActivity sparkActivity = this.LJLJJLL;
            if (sparkActivity != null) {
                obj = C16880lQ.LLILLL(sparkActivity);
            }
            o.LJII(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData clipData = ClipData.newPlainText(str, str);
            OHS ohs = C252609vk.LIZ;
            o.LJIIIIZZ(clipData, "clipData");
            TokenCert with = TokenCert.Companion.with("bpea-article_3d_party_webpage");
            ohs.getClass();
            OHS.LIZIZ((ClipboardManager) obj, clipData, with);
            SparkActivity sparkActivity2 = this.LJLJJLL;
            if (sparkActivity2 != null) {
                C26045AKb c26045AKb = new C26045AKb(sparkActivity2);
                c26045AKb.LJIIIIZZ(R.string.dwb);
                c26045AKb.LJIIJ();
            }
            ArticleModeService.INSTANCE.getArticleLoggingService().logClickCopyLink();
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public final void LIZLLL() {
        String url;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        SparkContext sparkContext = this.LJLJJL;
        if (sparkContext != null) {
            WebKitView LJIIIZ = C79043V0l.LJIIIZ(sparkContext);
            if (LJIIIZ != null && (url = LJIIIZ.getUrl()) != null && url.length() != 0) {
                intent.setData(UriProtector.parse(url));
                Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(url));
                SparkActivity sparkActivity = this.LJLJJLL;
                if (sparkActivity != null) {
                    C78598Ut0.LJIJJ(intent2, sparkActivity);
                    sparkActivity.startActivity(intent2);
                }
            }
            this.LJLIL.LJLJJI.invoke();
            ArticleModeService.INSTANCE.getArticleLoggingService().logClickOpenOtherBrowser(this.LJLIL.LJLILLLLZI, this.LJLLILLLL);
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60071Nhr(C60072Nhs articleTitleBarInfo) {
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(articleTitleBarInfo, "articleTitleBarInfo");
        this.LJLIL = articleTitleBarInfo;
        this.LJLJJI = C221108m2.LIZIZ(C45808HyO.LJLIL);
        Aweme aweme = articleTitleBarInfo.LJLIL;
        this.LJLJL = aweme;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            num = Integer.valueOf(imageList.size());
        } else {
            num = null;
        }
        this.LJLJLJ = num;
        this.LJLJLLL = aweme.getRequestId();
        this.LJLL = C187677Yd.LIZ(aweme);
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        this.LJLLI = authorUid;
        this.LJLLILLLL = aweme.getAid();
    }

    @Override // X.AbstractC60117Nib
    public final void LIZIZ(SparkContext sparkContext) {
        SparkActivity sparkActivity;
        this.LJLJJL = sparkContext;
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL != null && (LJIILL instanceof SparkActivity)) {
            sparkActivity = (SparkActivity) LJIILL;
        } else {
            sparkActivity = null;
        }
        this.LJLJJLL = sparkActivity;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.hr, C16880lQ.LLZIL(context), null);
        LLLZIIL.setMinimumHeight((int) context.getResources().getDimension(R.dimen.a8q));
        this.LJLILLLLZI = (C252709vu) LLLZIIL.findViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ = "back_btn";
        LIZJ.LJI = false;
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZIZ = "close_all_btn";
        LIZJ2.LJI = false;
        c235119Kp.LIZLLL(LIZJ2);
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ3.LIZIZ = "more";
        LIZJ3.LJI = false;
        c235119Kp.LIZIZ(LIZJ3);
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
            c252709vu.LJIILJJIL(true);
        }
        return LLLZIIL;
    }

    @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        View view;
        o.LJIIIZ(subTitle, "subTitle");
        String str = this.LJLJI;
        if (str == null || str.length() == 0 || subTitle.length() == 0) {
            return;
        }
        String host = UriProtector.parse(subTitle).getHost();
        if (host != null && host.length() != 0) {
            for (String str2 : LJLLJ) {
                if (o.LJ(host, str2)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('.');
                LIZ.append(str2);
                if (ujb.o.LJJJJ(host, X1D.LIZIZ(LIZ), false)) {
                    return;
                }
            }
        }
        C9KF c9kf = (C9KF) this.LJLJJI.getValue();
        c9kf.getClass();
        c9kf.LIZLLL = subTitle;
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            c252709vu.LJIILLIIL(c9kf);
        }
        C252709vu c252709vu2 = this.LJLILLLLZI;
        if (c252709vu2 != null) {
            view = c252709vu2.LJI("more");
        } else {
            view = null;
        }
        KL2.LJIILLIIL(0, view);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
        View view;
        View LJI;
        o.LJIIIZ(navBtnType, "navBtnType");
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            view = c252709vu.LJI("more");
        } else {
            view = null;
        }
        KL2.LJIILLIIL(4, view);
        C252709vu c252709vu2 = this.LJLILLLLZI;
        if (c252709vu2 != null && (LJI = c252709vu2.LJI("more")) != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 134), LJI);
        }
    }

    @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
    public final void LJIJJ(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        KL2.LJIILLIIL(i, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        View LJI;
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null && (LJI = c252709vu.LJI("close_all_btn")) != null) {
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(aCListenerS30S0100000_10, this, 23), LJI);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        o.LJIIIZ(title, "title");
        this.LJLJI = title;
        C9KF c9kf = (C9KF) this.LJLJJI.getValue();
        c9kf.getClass();
        c9kf.LIZJ = title;
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            c252709vu.LJIILLIIL(c9kf);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJJ(boolean z) {
        int i;
        View view;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C252709vu c252709vu = this.LJLILLLLZI;
        if (c252709vu != null) {
            view = c252709vu.LJI("close_all_btn");
        } else {
            view = null;
        }
        KL2.LJIILLIIL(i, view);
    }
}

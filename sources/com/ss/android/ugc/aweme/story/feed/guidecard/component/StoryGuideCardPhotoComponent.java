package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C1DF;
import X.C2047581v;
import X.C2068389v;
import X.C62562cu;
import X.C79045V0n;
import X.C7MY;
import X.C8NC;
import X.C8NM;
import X.EnumC72807Shn;
import X.InterfaceC70769Rq1;
import X.KL0;
import X.ORZ;
import X.S3I;
import X.S3L;
import X.V92;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardPhotoComponent extends BaseCellContentComponent<StoryGuideCardPhotoComponent> implements InterfaceC70769Rq1 {
    public SmartImageView LL;

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(Uri uri, SmartImageView smartImageView) {
    }

    public StoryGuideCardPhotoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(null);
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            smartImageView2.setActualImageScaleType(EnumC72807Shn.CENTER_CROP);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        UrlModel LJII = C1DF.LJII(item.getAweme());
        if (LJII == null) {
            return;
        }
        List<String> urlList = LJII.getUrlList();
        if (urlList == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
            str = "";
        }
        C8NM.LIZLLL(str);
        W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(LJII.getUrlList()));
        LJIIIZ.LIZIZ("story_photo");
        LJIIIZ.LJIJI = Bitmap.Config.RGB_565;
        LJIIIZ.LJJI = KL0.HIGH;
        LJIIIZ.LJJIIJ = this.LL;
        LJIIIZ.LJIIL = 0;
        LJIIIZ.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SmartImageView smartImageView;
        V92 hierarchy;
        o.LJIIIZ(view, "view");
        Integer num = null;
        if (view instanceof SmartImageView) {
            smartImageView = (SmartImageView) view;
        } else {
            smartImageView = null;
        }
        this.LL = smartImageView;
        if (smartImageView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_tiktok_logo;
            c2068389v.LIZIZ = C7MY.LIZIZ(100);
            c2068389v.LIZJ = C7MY.LIZIZ(100);
            Context context = getContext();
            if (context != null) {
                num = C79045V0n.LJI(R.attr.dn, context);
            }
            c2068389v.LIZLLL = num;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            smartImageView.setPlaceholderImage(c2068389v.LIZ(context2));
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null && (hierarchy = smartImageView2.getHierarchy()) != null) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_color_tiktok_logo_light;
            c2068389v2.LIZIZ = C7MY.LIZIZ(100);
            c2068389v2.LIZJ = C7MY.LIZIZ(100);
            Context context3 = view.getContext();
            o.LJIIIIZZ(context3, "view.context");
            hierarchy.LJIILL(c2068389v2.LIZ(context3), 5);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(Uri uri, C2047581v c2047581v) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onIntermediateImageSet, uri: ");
        LIZ.append(uri);
        LIZ.append(", image info: ");
        if (c2047581v != null) {
            str = c2047581v.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(Uri uri, View view, Throwable th) {
        String str;
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        C8NM.LIZJ(str, th, false);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        String str;
        if (!this.LJLLL) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onComplete, uri: ");
        LIZ.append(uri);
        LIZ.append(", image info: ");
        String str2 = null;
        if (c2047581v != null) {
            str2 = c2047581v.toString();
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        C8NM.LJ(str, false);
        C8NC c8nc = new C8NC(EnumC72807Shn.CENTER_CROP, 0.0f, -1, -1, (int) 0.0f);
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = c8nc.LJLJI;
                marginLayoutParams.height = c8nc.LJLJJI;
                marginLayoutParams.topMargin = c8nc.LJLJJL;
                smartImageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            smartImageView2.setActualImageScaleType(c8nc.LJLIL);
        }
        SmartImageView smartImageView3 = this.LL;
        if (smartImageView3 != null) {
            S3I s3i = new S3I();
            s3i.LIZLLL = c8nc.LJLILLLLZI;
            smartImageView3.setCircleOptions(new S3L(s3i));
        }
    }
}

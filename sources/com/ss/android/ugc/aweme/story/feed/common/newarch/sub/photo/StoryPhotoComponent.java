package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo;

import X.C1DF;
import X.C2047581v;
import X.C2068389v;
import X.C221108m2;
import X.C32151Nz;
import X.C62562cu;
import X.C62822Ol8;
import X.C79045V0n;
import X.C8NM;
import X.EnumC72807Shn;
import X.InterfaceC70769Rq1;
import X.KL0;
import X.O6R;
import X.ORZ;
import X.V92;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPhotoComponent extends BaseCellSlotComponent<StoryPhotoComponent> implements InterfaceC70769Rq1 {
    public final C62822Ol8 LLFII;

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(Uri uri, SmartImageView smartImageView) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.coy;
    }

    public StoryPhotoComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 948));
    }

    public final SmartImageView q4() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-ivPhoto>(...)");
        return (SmartImageView) value;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJJJ() {
        q4().setImageBitmap(null);
        q4().setActualImageScaleType(EnumC72807Shn.CENTER_CROP);
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
        LJIIIZ.LJJIIJ = q4();
        LJIIIZ.LJIIL = 0;
        LJIIIZ.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer num;
        o.LJIIIZ(view, "view");
        SmartImageView q4 = q4();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_tiktok_logo;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
        Context context = getContext();
        if (context != null) {
            num = C79045V0n.LJI(R.attr.dn, context);
        } else {
            num = null;
        }
        c2068389v.LIZLLL = num;
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        q4.setPlaceholderImage(c2068389v.LIZ(context2));
        V92 hierarchy = q4().getHierarchy();
        if (hierarchy != null) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_color_tiktok_logo_light;
            c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
            c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(100));
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r9 > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r7 != X.EnumC72807Shn.FIT_CENTER) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r10 = r15.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r10 <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r7 != X.EnumC72807Shn.FIT_CENTER) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        r1 = (X.C63081OpJ.LJJJJJL(r6) - (X.C63081OpJ.LJJJJL(r6) / r2)) * 0.4f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r6 = new X.C8NC(r7, r8, r9, r10, (int) r1);
        r2 = q4();
        r1 = r2.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r1 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r1 = (android.view.ViewGroup.MarginLayoutParams) r1;
        r1.width = r6.LJLJI;
        r1.height = r6.LJLJJI;
        r1.topMargin = r6.LJLJJL;
        r2.setLayoutParams(r1);
        q4().setActualImageScaleType(r6.LJLIL);
        r2 = q4();
        r1 = new X.S3I();
        r1.LIZLLL = r6.LJLILLLLZI;
        r2.setCircleOptions(new X.S3L(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        if (r3 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r3 != false) goto L36;
     */
    @Override // X.InterfaceC70769Rq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(android.net.Uri r13, android.view.View r14, X.C2047581v r15, android.graphics.drawable.Animatable r16) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.newarch.sub.photo.StoryPhotoComponent.U0(android.net.Uri, android.view.View, X.81v, android.graphics.drawable.Animatable):void");
    }
}

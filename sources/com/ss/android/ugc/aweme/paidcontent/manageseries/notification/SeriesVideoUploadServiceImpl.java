package com.ss.android.ugc.aweme.paidcontent.manageseries.notification;

import X.C113554cx;
import X.C118664lC;
import X.C188727au;
import X.C32151Nz;
import X.C47261Igj;
import X.C51764KTg;
import X.C79045V0n;
import X.C86550Xxy;
import X.FMX;
import X.InterfaceC86486Xww;
import X.O6R;
import X.OSZ;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.service.ISeriesVideoUploadService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public final class SeriesVideoUploadServiceImpl implements ISeriesVideoUploadService {
    public static final /* synthetic */ int LIZIZ = 0;
    public C118664lC LIZ;

    @Override // com.ss.android.ugc.aweme.service.ISeriesVideoUploadService
    public final void LIZ(String str, String str2, String str3, String str4, Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        C118664lC c118664lC = null;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))));
        tuxIconView.setIconRes(R.raw.icon_x_mark);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        Integer LJI = C79045V0n.LJI(R.attr.gv, context);
        if (LJI != null) {
            tuxIconView.setTintColor(LJI.intValue());
        }
        tuxIconView.setVisibility(0);
        frameLayout.addView(tuxIconView);
        C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
        if (c86550Xxy.LJIIL(1007) == null) {
            C118664lC c118664lC2 = new C118664lC();
            c86550Xxy.LIZ.LJIIJJI(c118664lC2);
            c86550Xxy.LJIIIIZZ(c118664lC2, null);
            this.LIZ = c118664lC2;
        } else {
            InterfaceC86486Xww LJIIL = c86550Xxy.LJIIL(1007);
            if (LJIIL instanceof C118664lC) {
                c118664lC = (C118664lC) LJIIL;
            }
            this.LIZ = c118664lC;
        }
        C118664lC c118664lC3 = this.LIZ;
        if (c118664lC3 != null) {
            c118664lC3.LIZ = frameLayout;
        }
        new C51764KTg(1007, "click_push_series_publish_success", null, new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, C47261Igj.LJJIJ(str), null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, 0, 0, null, 1, null, 0, 0, context.getResources().getString(R.string.qs0), null, context.getResources().getString(R.string.qrz), null, 0, null, 1, null, null, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0, 0, 0, null, null, 0.0f, 0, null, null, null, 0, null, null, null, null, null, -339738753, 1048566, null), C113554cx.LJJLIIIIJ(new OSZ("business_tag", "creator_tool")), null, 156).LIZ();
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(1, "if_success");
        c188727au.LJIIIZ("entry_point", str3);
        c188727au.LJIIIZ("collection_id", str2);
        c188727au.LJIIIZ("item_id", str4);
        FMX.LJIIL("show_series_video_upload_status_toast", c188727au.LIZ);
    }
}

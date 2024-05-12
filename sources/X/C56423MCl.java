package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MCl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56423MCl extends C220538l7 {
    public final int LLFII;
    public final C72790ShW LLFZ;
    public final TuxTextView LLI;
    public final TuxTextView LLIFFJFJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56423MCl(View itemView, String eventLabel, MH9 awemeClickListener, int i) {
        super(itemView, eventLabel, awemeClickListener);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        this.LLFII = i;
        ViewStub viewStub = (ViewStub) itemView.findViewById(R.id.klz);
        viewStub.setLayoutResource(R.layout.cqu);
        View inflate = viewStub.inflate();
        View findViewById = inflate.findViewById(R.id.csp);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.effect_resource_image)");
        this.LLFZ = (C72790ShW) findViewById;
        View findViewById2 = inflate.findViewById(R.id.csj);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.effect_name)");
        this.LLI = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.n74);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.video_posted)");
        this.LLIFFJFJJ = (TuxTextView) findViewById3;
    }

    @Override // X.C220538l7
    public final void a0(Aweme aweme, int i, boolean z, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        String str4;
        UrlModel urlModel;
        List<String> urlList;
        String str5;
        super.a0(aweme, i, z, bundle);
        if (aweme != null) {
            NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
            if (stickerEntranceInfo != null && (urlModel = stickerEntranceInfo.iconUrl) != null && (urlList = urlModel.getUrlList()) != null && (str5 = (String) ORZ.LJLLLL(urlList)) != null) {
                C78764Uvg.LJIIIZ(this.LLFZ, str5, -1, -1);
            }
            NewFaceStickerBean stickerEntranceInfo2 = aweme.getStickerEntranceInfo();
            if (stickerEntranceInfo2 != null && (str4 = stickerEntranceInfo2.name) != null) {
                TuxTextView tuxTextView = this.LLI;
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZIZ(str4);
                tuxTextView.setText(c116724i4.LIZ);
            }
            NewFaceStickerBean stickerEntranceInfo3 = aweme.getStickerEntranceInfo();
            if (stickerEntranceInfo3 != null) {
                String number = C77123UOp.LJJIIJ(stickerEntranceInfo3.userCount);
                TuxTextView tuxTextView2 = this.LLIFFJFJJ;
                C116724i4 c116724i42 = new C116724i4();
                Resources resources = this.itemView.getContext().getResources();
                o.LJIIIIZZ(resources, "itemView.context.resources");
                o.LJIIIIZZ(number, "number");
                c116724i42.LIZ(resources, R.string.ij_, number);
                tuxTextView2.setText(c116724i42.LIZ);
            }
            C188727au c188727au = new C188727au();
            NewFaceStickerBean stickerEntranceInfo4 = aweme.getStickerEntranceInfo();
            if (stickerEntranceInfo4 != null) {
                str = stickerEntranceInfo4.id;
            } else {
                str = null;
            }
            String str6 = "";
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("prop_id", str);
            c188727au.LIZLLL(i + 1, "impr_position");
            c188727au.LJIIIZ("group_id", aweme.getAid());
            if (this.LLFII == 35) {
                c188727au.LJI("enter_from", "prop_page_discover");
            } else {
                c188727au.LJI("enter_from", "video_shoot_page");
                if (bundle == null || (str2 = bundle.getString("creation_id")) == null) {
                    str2 = "";
                }
                c188727au.LJI("creation_id", str2);
                if (bundle == null || (str3 = bundle.getString("shoot_way")) == null) {
                    str3 = "";
                }
                c188727au.LJI("shoot_way", str3);
                if (bundle != null && (string = bundle.getString("shoot_tab_name")) != null) {
                    str6 = string;
                }
                c188727au.LJI("shoot_tab_name", str6);
            }
            FMX.LJIIL("prop_discover_prop_show", c188727au.LIZ);
        }
    }
}

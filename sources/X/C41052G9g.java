package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.jvm.internal.o;

/* renamed from: X.G9g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41052G9g extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C41051G9f LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41052G9g(C41051G9f c41051G9f) {
        super(600, 2);
        this.LJLJJLL = c41051G9f;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        PostPageModel postPageModel;
        String str;
        String str2;
        String str3;
        AVETParameter avetParameter;
        String contentSource;
        AVETParameter avetParameter2;
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        PostPageModel postPageModel2;
        UrlModel urlModel;
        CreativeModel creativeModel3;
        EditPostModel editPostModel;
        o.LJIIIZ(v, "v");
        C41051G9f c41051G9f = this.LJLJJLL;
        String str4 = null;
        if (!c41051G9f.LLFF && !c41051G9f.LJZL) {
            C164096cH c164096cH = c41051G9f.LJLJLJ;
            if (c164096cH != null) {
                VideoPublishEditModel videoPublishEditModel = c41051G9f.LJZ;
                if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel3.editPostModel) != null) {
                    urlModel = editPostModel.getVideoCoverAddr();
                } else {
                    urlModel = null;
                }
                c41051G9f.LLJILJIL(c164096cH, urlModel);
            } else {
                o.LJIJI("videoThumbImageView");
                throw null;
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (postPageModel2 = creativeModel2.postPageModel) != null) {
            postPageModel2.clickCover = System.currentTimeMillis();
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null) {
            postPageModel = creativeModel.postPageModel;
        } else {
            postPageModel = null;
        }
        if (postPageModel != null) {
            postPageModel.coverEnterFrom = "edit_post_page";
        }
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel4 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel4 != null) {
            str = videoPublishEditModel4.getCreationId();
        } else {
            str = "mModel is null";
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("enter_from", "edit_post_page");
        VideoPublishEditModel videoPublishEditModel5 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel5 != null) {
            str4 = videoPublishEditModel5.mShootWay;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        c145995oB.LJI("shoot_way", str4);
        VideoPublishEditModel videoPublishEditModel6 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel6 == null || (avetParameter2 = videoPublishEditModel6.getAvetParameter()) == null || (str2 = avetParameter2.getStoryShootEntrance()) == null) {
            str2 = "";
        }
        c145995oB.LJI("shoot_entrance", str2);
        VideoPublishEditModel videoPublishEditModel7 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel7 == null || (str3 = H7R.LJIIIZ(videoPublishEditModel7)) == null) {
            str3 = "";
        }
        c145995oB.LJI("content_type", str3);
        VideoPublishEditModel videoPublishEditModel8 = this.LJLJJLL.LJZ;
        if (videoPublishEditModel8 != null && (avetParameter = videoPublishEditModel8.getAvetParameter()) != null && (contentSource = avetParameter.getContentSource()) != null) {
            str5 = contentSource;
        }
        c145995oB.LJI("content_source", str5);
        c145995oB.LJI("after_post", "1");
        G9Z.LIZ(c145995oB);
        FMX.LJIIL("click_cover_entrance", c145995oB.LIZ);
        C41051G9f c41051G9f2 = this.LJLJJLL;
        if (!c41051G9f2.LLIIJI) {
            c41051G9f2.LL = GBX.CLICK_SELECT_COVER;
            c41051G9f2.LLJLL();
            this.LJLJJLL.LLJLLIL();
            return;
        }
        c41051G9f2.LLJLILLLLZIIL();
    }
}

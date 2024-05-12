package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G9w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41068G9w extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ C41051G9f LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        A90 a90;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        A90 a902;
        A90 a903;
        if (bool.booleanValue() && (a902 = this.LJLIL.LLIILII) != null && a902.isShowing() && (a903 = this.LJLIL.LLIILII) != null) {
            a903.LIZLLL(100.0f);
        }
        I9A.LIZJ("EditPostPublishScene", "download success");
        String aid = this.LJLILLLLZI;
        o.LJIIIZ(aid, "aid");
        GMQ.LJI.storeBoolean(aid, true);
        if (C44687HgJ.LIZIZ(this.LJLJI)) {
            VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJZ;
            if (videoPublishEditModel != null) {
                EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ORZ.LJLLLL(videoList)) == null || editVideoSegment.getVideoPath().length() <= 0 || videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLIL.LJZ;
                    if (videoPublishEditModel2 != null) {
                        C44432HcC.LJII(videoPublishEditModel2, this.LJLJI);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                A90 a904 = this.LJLIL.LLIILII;
                if (a904 != null && a904.isShowing() && (a90 = this.LJLIL.LLIILII) != null) {
                    a90.dismiss();
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C41051G9f c41051G9f = this.LJLIL;
        c41051G9f.LLIIJI = true;
        GBX gbx = c41051G9f.LL;
        if (gbx == GBX.CLICK_PREVIEW) {
            C164096cH c164096cH = c41051G9f.LJLJLJ;
            if (c164096cH != null) {
                c41051G9f.LLJJLIIIJLLLLLLLZ(0, c164096cH);
            } else {
                o.LJIJI("videoThumbImageView");
                throw null;
            }
        } else if (gbx == GBX.CLICK_SELECT_COVER) {
            c41051G9f.LLJLILLLLZIIL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41068G9w(C41051G9f c41051G9f, String str, String str2) {
        super(1);
        this.LJLIL = c41051G9f;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}

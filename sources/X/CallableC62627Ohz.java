package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC62627Ohz<V> implements Callable {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    public CallableC62627Ohz(Aweme aweme, String str, String str2, int i) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        User author;
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        if (!((RBX) HG3.LJIILL()).isMe(this.LJLIL.getAuthorUid())) {
            C188727au c188727au = new C188727au();
            c188727au.LJFF(Boolean.FALSE, "is_author");
            c188727au.LJFF(Boolean.valueOf(C45441HsT.LIZ(this.LJLIL)), "is_friend");
            c188727au.LJI("click_btn", this.LJLILLLLZI);
            c188727au.LJI("gid", this.LJLIL.getAid());
            c188727au.LJI("download_addr", this.LJLJI);
            Aweme aweme = this.LJLIL;
            o.LJIIIZ(aweme, "aweme");
            StringBuilder sb = new StringBuilder();
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getReviewStatus() == 1) {
                sb.append("1,");
            }
            if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                sb.append("2,");
            }
            if (AV1.LJIIZILJ(aweme.getAuthor(), ((RBX) HG3.LJIILL()).isMe(aweme.getAuthorUid()))) {
                sb.append("3,");
            }
            AwemeStatus status2 = aweme.getStatus();
            if (status2 != null && status2.getReviewStatus() == 2) {
                sb.append("4,");
            }
            if (aweme.isPrivate()) {
                sb.append("5,");
            }
            AwemeStatus status3 = aweme.getStatus();
            if (status3 != null && status3.getPrivateStatus() == 2 && !C45441HsT.LIZ(aweme)) {
                sb.append("6,");
            }
            VideoControl videoControl = aweme.getVideoControl();
            if ((videoControl != null && videoControl.preventDownloadType == 3) || ((author = aweme.getAuthor()) != null && author.getDownloadSetting() == 3)) {
                sb.append("7,");
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "monitorType.toString()");
            if (sb.length() > 0) {
                sb2 = sb.substring(0, sb.length() - 1);
                o.LJIIIIZZ(sb2, "monitorType.substring(0, monitorType.length - 1)");
            }
            c188727au.LJI("monitor_type", sb2);
            c188727au.LJI("server_ctx", C75792yF.LIZJ(new AwemeACLStruct.ServerExtra().buildServerExtraJson(this.LJLIL)));
            if (C4LD.LIZIZ.LJIILLIIL(this.LJLIL)) {
                c188727au.LIZLLL(this.LJLIL.getAwemeType(), "aweme_type");
                PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    num = Integer.valueOf(imageList.size());
                } else {
                    num = null;
                }
                c188727au.LJFF(num, "pic_cnt");
                c188727au.LIZLLL(this.LJLJJI, "download_pic_cnt");
            }
            FMX.LJIIL("download_tns", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }
}

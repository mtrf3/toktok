package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.HrP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC45375HrP<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ Aweme LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    public CallableC45375HrP(String str, String str2, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, String str3, String str4, int i, Aweme aweme, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c68322mC;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = i;
        this.LJLJLJ = aweme;
        this.LJLJLLL = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLIL);
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("action_type", this.LJLJI.element);
        c188727au.LJIIIZ("platform", this.LJLJJI.element);
        c188727au.LJIIIZ("is_long", this.LJLJJL);
        c188727au.LJIIIZ("logo_name", this.LJLJJLL);
        c188727au.LIZLLL(this.LJLJL, "watermark_type");
        Aweme aweme = this.LJLJLJ;
        int i = this.LJLJLLL;
        if (C62340OdM.LJIIJJI(aweme)) {
            c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                num = Integer.valueOf(imageList.size());
            } else {
                num = null;
            }
            c188727au.LJFF(num, "pic_cnt");
            c188727au.LIZLLL(i, "download_pic_cnt");
        }
        FMX.LJIIL("watermark_share_download", c188727au.LIZ);
        return null;
    }
}

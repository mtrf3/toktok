package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.photodownload.PhotoModeDownloadFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44915Hjz extends AbstractC44912Hjw implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJL = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final C44917Hk1 LJLJJLL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_arrow_down_to_line_bold;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "save_photo";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LJLILLLLZI.awemeACLShareInfo;
        if (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    public final boolean LJIIJ() {
        Video video;
        VideoUrlModel playAddr;
        List<String> urlList;
        if (!AVExternalServiceImpl.LIZ().photoModeService().enableSaveSingleImageAsVideo()) {
            return false;
        }
        if (this.LJLILLLLZI.getMusic() == null && ((video = this.LJLILLLLZI.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || urlList.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        List<PhotoModeImageUrlModel> imageList;
        if (C44938HkM.LIZIZ() && C44938HkM.LIZ()) {
            return R.string.ge0;
        }
        PhotoModeImageInfo photoModeImageInfo = this.LJLILLLLZI.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 1 && LJIIJ()) {
            return R.string.q8h;
        }
        return R.string.tr7;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        LIZJ(this.LJLIL, context, this.LJLILLLLZI, (SharePackage) sharePackage, this.LJLJJI, this.LJLJI, this.LJLJJLL);
    }

    @Override // X.AbstractC44912Hjw
    public final void LJII(Context context, C44913Hjx downloadActionConfig) {
        boolean z;
        int i;
        String str;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadActionConfig, "downloadActionConfig");
        C62394OeE c62394OeE = new C62394OeE();
        SharePackage sharePackage = downloadActionConfig.LIZLLL;
        o.LJI(sharePackage);
        c62394OeE.LJIIZILJ = sharePackage;
        c62394OeE.LIZ(C4LD.LIZIZ.LJJIIZI());
        c62394OeE.LJIIIIZZ = C4LD.LIZIZ.LIZLLL();
        c62394OeE.LJJ = new C44916Hk0();
        C44905Hjp.LIZ(downloadActionConfig.LIZLLL);
        C43170Gww c43170Gww = new C43170Gww(new WeakReference(this.LJLIL), Integer.valueOf(downloadActionConfig.LJ));
        Activity activity = this.LJLIL;
        if ((activity instanceof ActivityC45651qj) && !C80Y.LIZ(activity)) {
            PhotoModeImageInfo photoModeImageInfo = this.LJLILLLLZI.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null && imageList2.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (LJIIJ()) {
                    C42594Gne c42594Gne = new C42594Gne();
                    ActivityC45651qj activity2 = (ActivityC45651qj) this.LJLIL;
                    Aweme aweme = this.LJLILLLLZI;
                    String downloadMethod = this.LJLJJI;
                    String enterFrom = this.LJLJI;
                    String fromPage = this.LJLJJL;
                    String str2 = downloadActionConfig.LIZJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    SharePackage sharePackage2 = downloadActionConfig.LIZLLL;
                    o.LJIIIZ(activity2, "activity");
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(downloadMethod, "downloadMethod");
                    o.LJIIIZ(enterFrom, "enterFrom");
                    o.LJIIIZ(fromPage, "fromPage");
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("group_id", aweme.getAid());
                    c188727au.LJFF(Integer.valueOf(aweme.getAwemeType()), "aweme_type");
                    PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                    if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                        i = imageList.size();
                    } else {
                        i = 0;
                    }
                    c188727au.LIZLLL(i, "pic_cnt");
                    c188727au.LJIIIZ("download_method", downloadMethod);
                    User author = aweme.getAuthor();
                    if (author != null) {
                        str = author.getRegion();
                    } else {
                        str = null;
                    }
                    c188727au.LJIIIZ("country_name", str);
                    FMX.LJIIL("download_popup_show", c188727au.LIZ);
                    C245319jz c245319jz = new C245319jz();
                    C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.ho0);
                    LIZIZ.LJ = new ACListenerS21S0100000_1(new C44900Hjk(c42594Gne, aweme, downloadMethod, fromPage, enterFrom, activity2, str2, sharePackage2), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.pyg);
                    LIZIZ2.LJ = new ACListenerS21S0100000_1(new C42597Gnh(c42594Gne, aweme, downloadMethod, c43170Gww, enterFrom, fromPage), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    c245319jz.LIZIZ(LIZIZ, LIZIZ2);
                    c245319jz.LIZ.LJLIL = new DialogInterfaceOnCancelListenerC42596Gng(c42594Gne, aweme, downloadMethod);
                    TuxActionSheet LIZJ = c245319jz.LIZJ();
                    FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                    LIZJ.show(supportFragmentManager, "single_image_mode_download");
                    return;
                }
                new C42594Gne().LIZ(c43170Gww, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
                return;
            }
            ActivityC45651qj activity3 = (ActivityC45651qj) this.LJLIL;
            Aweme aweme2 = this.LJLILLLLZI;
            C62387Oe7 c62387Oe7 = new C62387Oe7(c62394OeE);
            String enterFrom2 = this.LJLJI;
            String downloadMethod2 = this.LJLJJI;
            String fromPage2 = this.LJLJJL;
            o.LJIIIZ(activity3, "activity");
            o.LJIIIZ(aweme2, "aweme");
            o.LJIIIZ(enterFrom2, "enterFrom");
            o.LJIIIZ(downloadMethod2, "downloadMethod");
            o.LJIIIZ(fromPage2, "fromPage");
            PhotoModeDownloadFragment photoModeDownloadFragment = new PhotoModeDownloadFragment(aweme2, c62387Oe7, enterFrom2, downloadMethod2, c43170Gww, fromPage2);
            TuxSheet tuxSheet = C249109q6.LIZ(0).LIZ;
            tuxSheet.LJLLILLLL = photoModeDownloadFragment;
            tuxSheet.LJZI = false;
            tuxSheet.LJLILLLLZI = DialogInterfaceOnDismissListenerC29244Bdo.LJLIL;
            FragmentManager supportFragmentManager2 = activity3.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager2, "activity.supportFragmentManager");
            tuxSheet.show(supportFragmentManager2, "PhotoModeDownloadFragment");
            FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
            if (LJIIZILJ == null) {
                return;
            }
            LJIIZILJ.LJIILLIIL(true);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C44915Hjz(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str4;
        this.LJLJJLL = new C44917Hk1(this);
    }

    @Override // X.AbstractC44912Hjw
    public final void LIZJ(Activity activity, Context context, Aweme aweme, SharePackage sharePackage, String downloadMethod, String eventType, C7C5 getEnterFromListener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(getEnterFromListener, "getEnterFromListener");
        C44896Hjg.LJIJJLI = false;
        super.LIZJ(activity, context, aweme, sharePackage, downloadMethod, eventType, getEnterFromListener);
    }
}

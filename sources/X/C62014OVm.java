package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OVm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62014OVm implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJI = 0;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_live_wallpaper;
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
        return R.raw.icon_live_wallpaper_fill;
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
    public final int LJJII() {
        return R.string.tu5;
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
        return "live_photo";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        AwemeACLShare awemeACLShare;
        ACLCommonShare downloadGeneral;
        if (C62011OVj.LJ() || (awemeACLShare = this.LJLIL.awemeACLShareInfo) == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2 || !C62016OVo.LIZ().getBoolean("keva_key_device_support_wallpaper", true)) {
            return false;
        }
        return true;
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
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C62011OVj.LJ() || !C62016OVo.LIZ().getBoolean("keva_key_device_support_wallpaper", true)) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.tu7);
            c5s1.LJ();
            return;
        }
        AwemeACLShare awemeACLShare = this.LJLIL.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral2 = awemeACLShare.getDownloadGeneral()) != null && (toastMsg = downloadGeneral2.getToastMsg()) != null && toastMsg.length() != 0) {
            C30869C9p.LIZIZ(context, toastMsg);
        }
        AwemeACLShare awemeACLShare2 = this.LJLIL.awemeACLShareInfo;
        if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0) {
            String string = sharePackage.extras.getString("previousPage");
            if (string == null) {
                string = "";
            }
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null) {
                Aweme aweme = this.LJLIL;
                String str = this.LJLILLLLZI;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("group_id", aweme.getAid());
                c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                c188727au.LJIIIZ("request_id", aweme.getRequestId());
                c188727au.LJIIIZ("panel_source", str);
                c188727au.LJIIIZ("previous_page", string);
                c188727au.LJIIIZ("enter_from", "share");
                boolean LJI = C62011OVj.LJI();
                c188727au.LIZLLL(LJI ? 1 : 0, "need_plugin");
                if (LJI) {
                    boolean LJFF = FCD.LJFF(LJJLIIIJ, InterfaceC28729BPh.LIZ);
                    c188727au.LIZLLL(LJFF ? 1 : 0, "plugin_install");
                    if (LJFF) {
                        c188727au.LIZLLL(C62011OVj.LJIIL(LJJLIIIJ) ? 1 : 0, "install_type");
                    }
                }
                FMX.LJIIL("wall_paper_click", c188727au.LIZ);
                ShareDependService.LIZ.getClass();
                C44498HdG.LIZ().LJJIIJZLJL(LJJLIIIJ, this.LJLIL);
            }
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C62014OVm(String eventType, Aweme aweme, String enterMethod) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterMethod;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.OVz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62027OVz implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_gif;
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
        return R.raw.icon_gif_fill;
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
        return R.string.r3l;
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
        return "gif";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LJLIL.awemeACLShareInfo;
        if (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public final void LIZJ(Context context) {
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            Aweme aweme = this.LJLIL;
            String enterFrom = this.LJLILLLLZI;
            String panelSource = this.LJLJI;
            String LIZIZ = C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme));
            o.LJIIIIZZ(LIZIZ, "getInstance().getAwemeLo…tils.getRequestId(aweme))");
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(panelSource, "panelSource");
            C76W c76w = new C76W();
            c76w.LIZ("group_id", aweme.getAid());
            c76w.LIZ("author_id", aweme.getAuthorUid());
            c76w.LIZ("enter_from", enterFrom);
            c76w.LIZ("panel_source", panelSource);
            c76w.LIZ("log_pb", LIZIZ);
            FMX.LJIILJJIL("save_as_gif", c76w.LIZIZ());
            ShareDependService.LIZ.getClass();
            OW1 LJJ = C44498HdG.LIZ().LJJ();
            C61099NyR LIZIZ2 = C61099NyR.LIZIZ.LIZIZ(LJJLIIIJ, TokenCert.Companion.with("bpea-gif_share_page_request_permission"));
            if (Build.VERSION.SDK_INT >= 33) {
                LIZIZ2.LIZ("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
            } else {
                LIZIZ2.LIZ("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            LIZIZ2.LIZ.LIZJ(new OW0(LJJ, LJJLIIIJ, aweme, enterFrom, LIZIZ));
        }
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
        String str;
        ACLCommonShare downloadGeneral;
        int i;
        InteractionPermission allowCreateSticker;
        ACLCommonShare downloadGeneral2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        AwemeACLShare awemeACLShare = this.LJLIL.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral2 = awemeACLShare.getDownloadGeneral()) != null) {
            str = downloadGeneral2.getToastMsg();
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            C30869C9p.LIZIZ(context, str);
        }
        AwemeACLShare awemeACLShare2 = this.LJLIL.awemeACLShareInfo;
        if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0) {
            InteractPermission interactPermission = this.LJLIL.getInteractPermission();
            if (interactPermission != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null) {
                i = allowCreateSticker.getStatus();
            } else {
                i = 2;
            }
            if (!IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJII(context, i, EnumC91123hs.EDUCATION_SHEET_CREATE_AND_NOT_NOW.getValue(), this.LJLILLLLZI, new AqS132S0200000_1(this, context, 66))) {
                LIZJ(context);
            }
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C62027OVz(String enterFrom, Aweme aweme, String enterMethod) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = enterMethod;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public final void LJII(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        IMService.createIIMServicebyMonsterPlugin(false).getStickerStoreAnalytics().LJ(num, l, l2, l3, this.LJLILLLLZI, "share as gif", this.LJLIL.getAid(), str, str2);
    }
}

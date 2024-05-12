package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85143Vu implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_rectangle_smile_face_plus;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_sticker_plus_fill;
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
        return R.string.fvw;
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
        return "create_sticker";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        InteractionPermission allowCreateSticker;
        Integer valueOf;
        if ((this.LJLIL.isSubOnlyVideo() && !C78996UzQ.LJJIIZI(this.LJLIL)) || (allowCreateSticker = this.LJLIL.getInteractPermission().getAllowCreateSticker()) == null || (valueOf = Integer.valueOf(allowCreateSticker.getStatus())) == null || valueOf.intValue() != 0) {
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
        InteractPermission interactPermission;
        InteractionPermission allowCreateSticker;
        String toast;
        InteractionPermission allowCreateSticker2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
            C05L.LIZLLL(context, R.string.dtf);
            LIZJ("", 0L, 0L, 0L, Integer.valueOf(EnumC85133Vt.NETWORK_NOT_CONNECT.getStatus()), "");
            return;
        }
        C32U stickerStoreAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getStickerStoreAnalytics();
        String str2 = this.LJLILLLLZI;
        String str3 = this.LJLJI;
        String aid = this.LJLIL.getAid();
        String authorUid = this.LJLIL.getAuthorUid();
        boolean enable = enable();
        InteractPermission interactPermission2 = this.LJLIL.getInteractPermission();
        if (interactPermission2 == null || (allowCreateSticker2 = interactPermission2.getAllowCreateSticker()) == null || (str = allowCreateSticker2.getToast()) == null) {
            str = "";
        }
        stickerStoreAnalytics.LIZJ(str2, str3, aid, authorUid, str, enable);
        if (!enable()) {
            if ((!this.LJLIL.isSubOnlyVideo() || C78996UzQ.LJJIIZI(this.LJLIL)) && (interactPermission = this.LJLIL.getInteractPermission()) != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null && (toast = allowCreateSticker.getToast()) != null && C78685UuP.LJJJZ(toast)) {
                C30869C9p.LIZIZ(context, toast);
                return;
            }
            return;
        }
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ == null) {
            return;
        }
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(LJJLIIIJ);
        dialogC25756A8y.LIZIZ(R.string.rjz);
        dialogC25756A8y.LIZ(false);
        dialogC25756A8y.setCancelable(false);
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "3015770851003031528")).LIZ) {
            dialogC25756A8y.show();
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C72262sY(this, LJJLIIIJ, SystemClock.elapsedRealtime(), dialogC25756A8y, context, null), 3);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C85143Vu(String enterFrom, Aweme aweme, String enterMethod) {
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

    public final void LIZJ(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        IMService.createIIMServicebyMonsterPlugin(false).getStickerStoreAnalytics().LJ(num, l, l2, l3, this.LJLILLLLZI, this.LJLJI, this.LJLIL.getAid(), str, str2);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.HotWordGiftService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OKm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61728OKm implements InterfaceC62486Ofi {
    public final Activity LJLIL;
    public final C29930Bos LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_settings_stroke;
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
        return R.raw.icon_2pt_settings_stroke;
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
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "share_setting";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        C86393XvR LJJIJIL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            return LJJIJIL.LJJLJLI("share_setting");
        }
        return 0;
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

    public C61728OKm(Activity activity, C29930Bos params) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        this.LJLIL = activity;
        this.LJLILLLLZI = params;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        long j;
        int i;
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZ;
        String str;
        String str2;
        C86393XvR LJJIJIL2;
        InterfaceC05190Ih currentUser;
        C29800Bmm gr;
        User owner;
        C86393XvR LJJIJIL3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL3 = LJJJLL.LJJIJIL()) != null) {
            LJJIJIL3.LJJJLIIL(this.LJLIL, this.LJLILLLLZI);
        }
        Room room = this.LJLILLLLZI.LJJIII;
        long j2 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        IUserLevelService iUserLevelService = (IUserLevelService) ServiceManager.get().getService(IUserLevelService.class);
        if (iUserLevelService != null && (gr = iUserLevelService.gr()) != null) {
            i = gr.LIZ;
        } else {
            i = 0;
        }
        ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
        if (LJJJLL2 != null && (LJJIJIL2 = LJJJLL2.LJJIJIL()) != null && (currentUser = LJJIJIL2.getCurrentUser()) != null) {
            j2 = currentUser.getId();
        }
        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
        if (LJJJLL3 != null && (LJJIJIL = LJJJLL3.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_live_user_setting")) != null && (LIZ = LJJLIIJ.LIZ()) != null) {
            OSZ[] oszArr = new OSZ[2];
            if (sharePackage.LJIIJ()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            oszArr[0] = new OSZ("room_orientation", str);
            if (HotWordGiftService.LJLILLLLZI.isRemoteEnabled()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[1] = new OSZ("is_comment_suggested_gift_show", str2);
            LIZ.LJJIFFI(C113554cx.LJJL(oszArr));
            LIZ.LJJII(C113554cx.LJJL(new OSZ("anchor_id", Long.valueOf(j)), new OSZ("user_id", Long.valueOf(j2)), new OSZ("user_level", Long.valueOf(i))));
            LIZ.LJJIIJZLJL();
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
}

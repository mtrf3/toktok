package X;

import Y.IDComparatorS37S0000000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62386Oe6 {
    public static UrlModel LIZ(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(imageModel.getUri());
        urlModel.setUrlList(imageModel.getUrls());
        urlModel.setUrlKey(imageModel.getUri());
        urlModel.setWidth(imageModel.width);
        urlModel.setHeight(imageModel.height);
        return urlModel;
    }

    public static IMUser LIZIZ(User user) {
        String str;
        C86393XvR LJJIJIL;
        CharSequence LJIIJ;
        IMUser iMUser = new IMUser();
        iMUser.setUid(String.valueOf(user.getId()));
        iMUser.setSecUid(user.getSecUid());
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJIIJ = LJJIJIL.LJIIJ(user)) != null) {
            str = LJIIJ.toString();
        } else {
            str = null;
        }
        iMUser.setNickName(str);
        C62386Oe6 c62386Oe6 = LiveSharePackage.Companion;
        ImageModel avatarThumb = user.getAvatarThumb();
        c62386Oe6.getClass();
        iMUser.setAvatarThumb(LIZ(avatarThumb));
        boolean z = true;
        if (user.getSecret() != 1) {
            z = false;
        }
        iMUser.setSecret(z);
        return iMUser;
    }

    public static boolean LJFF(C29930Bos c29930Bos) {
        if (c29930Bos.LJJIJL && c29930Bos.LJJIJIIJIL != null) {
            return true;
        }
        return false;
    }

    public static List LIZLLL(final Activity activity, final C29930Bos c29930Bos) {
        OSZ<Boolean, Boolean> osz;
        boolean z;
        boolean z2;
        C86393XvR LJJIJIL;
        C86393XvR LJJIJIL2;
        C86393XvR LJJIJIL3;
        ILiveOuterService LJJJLL;
        C86393XvR LJJIJIL4;
        InterfaceC41329GJx l4;
        ILiveOuterService LJJJLL2;
        C86393XvR LJJIJIL5;
        InterfaceC41312GJg A4;
        C86393XvR LJJIJIL6;
        ArrayList arrayList = new ArrayList();
        if (c29930Bos.LIZJ != -1) {
            if (!o.LJ(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), String.valueOf(c29930Bos.LIZLLL))) {
                if (TextUtils.equals(c29930Bos.LJIJJLI, "live_links")) {
                    arrayList.add(new C53778L8s(new InterfaceC62486Ofi(activity, c29930Bos) { // from class: X.351
                        public final Activity LJLIL;
                        public final C29930Bos LJLILLLLZI;

                        @Override // X.InterfaceC62486Ofi
                        public final void LJ() {
                        }

                        @Override // X.InterfaceC62486Ofi
                        public final int LJFF() {
                            return R.raw.icon_2pt_flag;
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
                            return R.raw.icon_flag_fill;
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
                            return R.string.q2_;
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
                            return "report_live_links";
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

                        {
                            o.LJIIIZ(activity, "activity");
                            o.LJIIIZ(c29930Bos, "params");
                            this.LJLIL = activity;
                            this.LJLILLLLZI = c29930Bos;
                        }

                        @Override // X.InterfaceC62486Ofi
                        public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                            C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                        }

                        @Override // X.InterfaceC62486Ofi
                        public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                            o.LJIIIZ(context, "context");
                            o.LJIIIZ(sharePackage, "sharePackage");
                            SmartRouter.buildRoute(this.LJLIL, this.LJLILLLLZI.LJJIFFI).open();
                        }

                        @Override // X.InterfaceC62486Ofi
                        public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                            C62485Ofh.LIZJ(context, baseSharePackage, this);
                        }

                        @Override // X.InterfaceC62486Ofi
                        public final void LJIIZILJ(ImageView imageView, View view, int i) {
                            C62485Ofh.LIZLLL(imageView, view);
                        }
                    }, 10));
                } else if (LJFF(c29930Bos)) {
                    arrayList.add(new C53778L8s(new C61729OKn(activity, c29930Bos), 10));
                } else {
                    arrayList.add(new C53778L8s(new C35I(activity, c29930Bos), 10));
                }
            }
            arrayList.add(new C53778L8s(new C61727OKl(activity, c29930Bos), 20));
            if (!c29930Bos.LJIILJJIL) {
                arrayList.add(new C53778L8s(new InterfaceC62486Ofi(activity, c29930Bos) { // from class: X.353
                    public final Activity LJLIL;
                    public final C29930Bos LJLILLLLZI;

                    @Override // X.InterfaceC62486Ofi
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJFF() {
                        return R.raw.icon_2pt_background_player_stroke;
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
                        return R.raw.icon_2pt_background_player_stroke;
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
                        return "pip_switch";
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LIZ() {
                        return C62485Ofh.LIZIZ();
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJJII() {
                        C86393XvR LJJIJIL7;
                        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
                        if (LJJJLL3 != null && (LJJIJIL7 = LJJJLL3.LJJIJIL()) != null) {
                            return LJJIJIL7.LJJLJLI("pip_switch");
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

                    {
                        o.LJIIIZ(activity, "activity");
                        o.LJIIIZ(c29930Bos, "params");
                        this.LJLIL = activity;
                        this.LJLILLLLZI = c29930Bos;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                        C86393XvR LJJIJIL7;
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
                        if (LJJJLL3 != null && (LJJIJIL7 = LJJJLL3.LJJIJIL()) != null) {
                            LJJIJIL7.LJIILJJIL(this.LJLIL, this.LJLILLLLZI);
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
                }, 30));
            }
            boolean LJJIJLIJ = C78897Uxp.LJJIJLIJ(c29930Bos.LJJIII);
            ILiveOuterService LJJJLL3 = LiveOuterService.LJJJLL();
            if (LJJJLL3 == null || (LJJIJIL6 = LJJJLL3.LJJIJIL()) == null || (osz = LJJIJIL6.LJJIII(LJJIJLIJ)) == null) {
                Boolean bool = Boolean.FALSE;
                osz = new OSZ<>(bool, bool);
            }
            Boolean first = osz.getFirst();
            o.LJIIIIZZ(first, "canShowGameDropsWatch.first");
            if (first.booleanValue()) {
                Boolean second = osz.getSecond();
                o.LJIIIIZZ(second, "canShowGameDropsWatch.second");
                final boolean booleanValue = second.booleanValue();
                arrayList.add(new C53778L8s(new InterfaceC62486Ofi(activity, c29930Bos, booleanValue) { // from class: X.352
                    public final Activity LJLIL;
                    public final boolean LJLILLLLZI;

                    @Override // X.InterfaceC62486Ofi
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJFF() {
                        return R.raw.icon_2pt_game_drops;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final boolean LJIIJJI() {
                        return false;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJIJ() {
                        return R.raw.icon_2pt_game_drops;
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
                        return "live_game_drops_watch";
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LIZ() {
                        return C62485Ofh.LIZIZ();
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJJII() {
                        C86393XvR LJJIJIL7;
                        ILiveOuterService LJJJLL4 = LiveOuterService.LJJJLL();
                        if (LJJJLL4 != null && (LJJIJIL7 = LJJJLL4.LJJIJIL()) != null) {
                            return LJJIJIL7.LJJLJLI("live_game_drops_watch");
                        }
                        return 0;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final boolean LJI() {
                        return this.LJLILLLLZI;
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
                        C86393XvR LJJIJIL7;
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        ILiveOuterService LJJJLL4 = LiveOuterService.LJJJLL();
                        if (LJJJLL4 != null && (LJJIJIL7 = LJJJLL4.LJJIJIL()) != null) {
                            LJJIJIL7.LJLL(this.LJLIL, Boolean.valueOf(this.LJLILLLLZI));
                        }
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                        C62485Ofh.LIZJ(context, baseSharePackage, this);
                    }

                    {
                        o.LJIIIZ(activity, "activity");
                        o.LJIIIZ(c29930Bos, "params");
                        this.LJLIL = activity;
                        this.LJLILLLLZI = booleanValue;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final void LJIIZILJ(ImageView imageView, View view, int i) {
                        C62485Ofh.LIZLLL(imageView, view);
                    }
                }, 29));
            }
            if (!c29930Bos.LJIILJJIL && (LJJJLL2 = LiveOuterService.LJJJLL()) != null && (LJJIJIL5 = LJJJLL2.LJJIJIL()) != null && (A4 = LJJIJIL5.A4()) != null && A4.LIZIZ()) {
                arrayList.add(new C53778L8s(new C41311GJf(activity, c29930Bos), 31));
            }
            if (!c29930Bos.LJIILJJIL && (LJJJLL = LiveOuterService.LJJJLL()) != null && (LJJIJIL4 = LJJJLL.LJJIJIL()) != null && (l4 = LJJIJIL4.l4()) != null && l4.LIZIZ()) {
                arrayList.add(new C53778L8s(new C41328GJw(activity, c29930Bos), 32));
            }
            ILiveOuterService LJJJLL4 = LiveOuterService.LJJJLL();
            if (LJJJLL4 != null && (LJJIJIL3 = LJJJLL4.LJJIJIL()) != null) {
                z = LJJIJIL3.LJLZ();
            } else {
                z = false;
            }
            if (!c29930Bos.LJIILJJIL && z) {
                arrayList.add(new C53778L8s(new C61728OKm(activity, c29930Bos), 33));
            }
            if (c29930Bos.LJIILL) {
                arrayList.add(new C53778L8s(new InterfaceC62486Ofi(c29930Bos) { // from class: X.354
                    public final C29930Bos LJLIL;

                    @Override // X.InterfaceC62486Ofi
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJFF() {
                        return R.raw.icon_2pt_person_gear;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final boolean LJIIJJI() {
                        return false;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJIJ() {
                        return R.raw.icon_2pt_person_gear;
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
                        return "moderator_setting_action";
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final boolean LJI() {
                        return this.LJLIL.LJIILLIIL;
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LIZ() {
                        return C62485Ofh.LIZIZ();
                    }

                    @Override // X.InterfaceC62486Ofi
                    public final int LJJII() {
                        C86393XvR LJJIJIL7;
                        ILiveOuterService LJJJLL5 = LiveOuterService.LJJJLL();
                        if (LJJJLL5 != null && (LJJIJIL7 = LJJJLL5.LJJIJIL()) != null) {
                            return LJJIJIL7.LJJLJLI("moderator_setting_action");
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

                    {
                        o.LJIIIZ(c29930Bos, "params");
                        this.LJLIL = c29930Bos;
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
                        C86393XvR LJJIJIL7;
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        ILiveOuterService LJJJLL5 = LiveOuterService.LJJJLL();
                        if (LJJJLL5 != null && (LJJIJIL7 = LJJJLL5.LJJIJIL()) != null) {
                            LJJIJIL7.LJJJJZI();
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
                }, 40));
            }
            ILiveOuterService LJJJLL5 = LiveOuterService.LJJJLL();
            if (LJJJLL5 != null && (LJJIJIL2 = LJJJLL5.LJJIJIL()) != null) {
                z2 = LJJIJIL2.LJLJJLL();
            } else {
                z2 = false;
            }
            ILiveOuterService LJJJLL6 = LiveOuterService.LJJJLL();
            if (LJJJLL6 != null && (LJJIJIL = LJJJLL6.LJJIJIL()) != null && LJJIJIL.M(c29930Bos.LJIJJLI, c29930Bos.LJIL, LJFF(c29930Bos)) && z2) {
                if (LJFF(c29930Bos)) {
                    arrayList.add(new C53778L8s(new C62414OeY(c29930Bos), 15));
                } else {
                    arrayList.add(new C53778L8s(new C35M(c29930Bos), 15));
                }
            }
            LiveOuterService.LJJJLL().LJIIJJI();
            boolean LJIIIIZZ = C55661Lsv.LJIIIIZZ();
            if (!c29930Bos.LJIILJJIL && c29930Bos.LJJIL && LJIIIIZZ) {
                arrayList.add(new C53778L8s(new C55396Loe(), 50));
            }
        }
        return arrayList;
    }

    public static LiveSharePackage LJ(Context context, C29930Bos params) {
        UrlModel LIZ;
        String LJIIL;
        String str;
        String str2;
        List<String> list;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "live";
        if (params.LJJIIZ) {
            c62374Odu.LJ = Q8U.LIZIZ(new Object[]{String.valueOf(params.LJIIIZ)}, 1, C29822Bn8.LIZ(context, R.string.rty, "context.resources.getStr…_email_linkshare_subject)"), "format(format, *args)");
        } else {
            c62374Odu.LJ = C29822Bn8.LIZ(context, R.string.mhw, "context.resources.getStr…live_guide_share_url_tap)");
        }
        String LJJI = C78609UtB.LJJI(params.LJIIJ);
        if (LJJI != null) {
            if (params.LJJIIZ) {
                EZQ ezq = new EZQ(LJJI);
                ezq.LIZJ("sec_anchor_id", params.LJIJI);
                ezq.LIZ(1, "is_sub_only_live");
                LJJI = ezq.LIZLLL();
            }
        } else {
            LJJI = null;
        }
        String str3 = "";
        if (LJJI == null) {
            LJJI = "";
        }
        c62374Odu.LJFF = LJJI;
        String str4 = params.LJIIJJI;
        if (str4 == null) {
            str4 = "";
        }
        c62374Odu.LIZLLL = str4;
        c62374Odu.LIZJ(String.valueOf(params.LIZJ));
        LiveSharePackage liveSharePackage = new LiveSharePackage(c62374Odu);
        Bundle bundle = liveSharePackage.extras;
        if (!TextUtils.isEmpty(params.LJJIJIIJIL)) {
            bundle.putString("aid", params.LJJIJIIJIL);
        }
        if (params.LJJIIZ) {
            bundle.putBoolean("is_sub_only_live", true);
            bundle.putInt("share_im_limit_tip_type", 4);
        }
        C62386Oe6 c62386Oe6 = LiveSharePackage.Companion;
        ImageModel imageModel = params.LJFF;
        c62386Oe6.getClass();
        bundle.putSerializable("thumb_for_share", LIZ(imageModel));
        ImageModel imageModel2 = params.LJIIIIZZ;
        if (imageModel2 == null) {
            LIZ = LIZ(params.LJII);
        } else {
            LIZ = LIZ(imageModel2);
        }
        bundle.putSerializable("video_cover", LIZ);
        bundle.putString("author_name", params.LJIIIZ);
        String str5 = params.LJ;
        if (str5 == null) {
            bundle.putString("author_id", null);
        } else {
            bundle.putString("author_id", str5);
        }
        bundle.putString("author_user_name", params.LJIIIZ);
        bundle.putString("panel_source", "long_press");
        bundle.putString("enter_method", "long_press");
        bundle.putString("app_name", context.getString(R.string.bri));
        if (C30148BsO.LIZ) {
            String str6 = params.LJIILIIL;
            if (str6 == null || ujb.o.LJJJJJL(str6)) {
                ImageModel imageModel3 = params.LJI;
                if (imageModel3 == null || (list = imageModel3.mUrls) == null || (str2 = (String) ORZ.LJLLLL(list)) == null) {
                    str2 = "";
                }
                bundle.putString("thumb_url", str2);
            } else {
                bundle.putString("thumb_url", params.LJIILIIL);
            }
        } else {
            String str7 = params.LJIILIIL;
            if (str7 == null || ujb.o.LJJJJJL(str7)) {
                LJIIL = C78765Uvh.LJIIL(LIZ(params.LJI));
            } else {
                LJIIL = params.LJIILIIL;
            }
            bundle.putString("thumb_url", LJIIL);
        }
        bundle.putString("uid_for_share", String.valueOf(params.LIZLLL));
        bundle.putString("sec_user_id", params.LJIJI);
        bundle.putLong("group_id", params.LIZJ);
        String str8 = params.LJIJJLI;
        if (str8 == null) {
            str8 = "";
        }
        bundle.putString("enter_from", str8);
        String str9 = params.LJJJJJL;
        if (str9 == null) {
            str9 = "";
        }
        bundle.putString("share_live_intent", str9);
        bundle.putLong("item_id", params.LIZJ);
        bundle.putString("share_text", liveSharePackage.description);
        bundle.putString("live_id", String.valueOf(params.LIZLLL));
        bundle.putString("room_title", params.LJIIJJI);
        bundle.putString("request_id", params.LJIIZILJ);
        if (params.LJIILJJIL) {
            str = "anchor";
        } else {
            str = "user";
        }
        bundle.putString("user_type", str);
        bundle.putString("request_page", params.LJJ);
        bundle.putString("previous_page", "live");
        bundle.putBoolean("is_share_live", true);
        bundle.putBoolean("is_portrait", params.LJJIL);
        bundle.putBoolean("is_land_style_libra", params.LJJIZ);
        String str10 = params.LJIL;
        if (str10 != null) {
            str3 = str10;
        }
        bundle.putString("enter_method_live", str3);
        Bundle bundle2 = params.LJJJI;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return liveSharePackage;
    }

    public static C62387Oe7 LIZJ(Activity activity, C29930Bos shareParams, List list, InterfaceC62096OYq callback, LiveSharePackage liveSharePackage) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shareParams, "shareParams");
        o.LJIIIZ(callback, "callback");
        C62394OeE c62394OeE = new C62394OeE();
        boolean z = false;
        C4LD.LIZ.LJJJJ(c62394OeE, activity, false);
        c62394OeE.LJIJ = !shareParams.LJJJJLI;
        boolean z2 = shareParams.LJJJJLL;
        c62394OeE.LJFF = z2;
        if (!z2) {
            c62394OeE.LIZIZ(new CopyLinkChannel(false));
        }
        int i = shareParams.LJJJJZI;
        if (i != 0) {
            c62394OeE.LJIILIIL = i;
        }
        boolean z3 = shareParams.LJJJJZ;
        if (z3) {
            c62394OeE.LJJIJLIJ = z3;
            String privateAccountNotice = shareParams.LJJJLIIL;
            o.LJIIIIZZ(privateAccountNotice, "privateAccountNotice");
            c62394OeE.LJJIL = privateAccountNotice;
        }
        C107814Kz.LIZ.getClass();
        if (C107814Kz.LIZ()) {
            ShareDependService.LIZ.getClass();
            ImChannel LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI(liveSharePackage, "");
            if (LJJIJIIJI != null) {
                c62394OeE.LIZIZ(LJJIJIIJI);
            }
        }
        c62394OeE.LIZLLL("instagram");
        c62394OeE.LIZLLL("instagram_story");
        Bundle bundle = shareParams.LJJJI;
        if (bundle != null && bundle.getBoolean("show_cancel")) {
            z = true;
        }
        c62394OeE.LJJIIJ = z;
        List<AbstractC62607Ohf> list2 = shareParams.LJIJJ;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                AbstractC62607Ohf it2 = (AbstractC62607Ohf) it.next();
                o.LJIIIIZZ(it2, "it");
                ((ArrayList) list).add(new C53778L8s(new C62606Ohe(it2, shareParams), it2.LJI()));
            }
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = (ArrayList) list;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C53778L8s c53778L8s = (C53778L8s) it3.next();
            hashMap.put(c53778L8s.LJLIL.key(), Integer.valueOf(c53778L8s.LJLILLLLZI));
        }
        c62394OeE.LIZ(new C62429Oen(hashMap));
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(list, new IDComparatorS37S0000000_9(6));
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            c62394OeE.LIZJ(((C53778L8s) it4.next()).LJLIL);
        }
        if (!shareParams.LJJIL) {
            c62394OeE.LJIILJJIL = R.attr.go;
        }
        c62394OeE.LJIIZILJ = liveSharePackage;
        c62394OeE.LJJ = new C62094OYo(callback);
        c62394OeE.LJJI = new C62097OYr(callback);
        return new C62387Oe7(c62394OeE);
    }
}

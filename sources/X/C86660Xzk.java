package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.cla.et.newet.CaptionsAndTranslationEntranceShowEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ManageCaptionsShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86660Xzk implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
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
        return "captions";
    }

    public final C188727au LIZJ() {
        String str;
        String str2;
        Video video;
        C188727au c188727au = new C188727au();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        Object obj = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        c188727au.LIZLLL(0, "use_transl");
        c188727au.LJIIIZ("enter_method", EnumC86777Y3x.SHARE_PANEL.getValue());
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null && (video = aweme3.getVideo()) != null) {
            obj = Integer.valueOf(video.getDuration());
        }
        c188727au.LJFF(obj, "item_duration");
        c188727au.LJIIIZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        c188727au.LJIIIZ("subtitle_type", C86670Xzu.LJIIJJI(this.LJLILLLLZI));
        c188727au.LIZLLL(0, "subtitle_lang");
        c188727au.LIZLLL(0, "subtitle_source_lang");
        c188727au.LIZLLL(0, "has_subtitle");
        return c188727au;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
        String str;
        if (!this.LJLJJI) {
            if (!C41032G8m.LIZ()) {
                String str2 = "manage";
                if (C86670Xzu.LIZJ(this.LJLILLLLZI)) {
                    Aweme aweme = this.LJLILLLLZI;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    String str3 = this.LJLJI;
                    if (!LJII()) {
                        str2 = "";
                    }
                    C2U8.LIZ(new Y19(str, str3, EnumC86777Y3x.SHARE_PANEL, str2));
                } else {
                    if (!LJII()) {
                        str2 = "";
                    }
                    LJIIJ(EnumC86777Y3x.SHARE_PANEL, str2);
                }
            } else if (LJII()) {
                if (this.LJLILLLLZI != null) {
                    String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
                    String authorUid = this.LJLILLLLZI.getAuthorUid();
                    o.LJIIIIZZ(authorUid, "aweme.authorUid");
                    boolean LJ = o.LJ(curUid, authorUid);
                    ManageCaptionsShowEvent manageCaptionsShowEvent = new ManageCaptionsShowEvent();
                    String aid = this.LJLILLLLZI.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    o.LJIIIIZZ(curUid, "curUid");
                    String authorUid2 = this.LJLILLLLZI.getAuthorUid();
                    o.LJIIIIZZ(authorUid2, "aweme.authorUid");
                    manageCaptionsShowEvent.LIZ().add(new C75012wz(LJ ? 1 : 0, C79004UzY.LJJJIL(this.LJLIL, this.LJLILLLLZI), aid, curUid, authorUid2, this.LJLJI, String.valueOf(this.LJLILLLLZI.getVideo().getDuration()), TranslationServiceImpl.LJJIJ().LJJIIZI()));
                    manageCaptionsShowEvent.LJFF();
                }
            } else if (C41032G8m.LIZ()) {
                LJIILL(EnumC86662Xzm.PANEL);
            }
            this.LJLJJI = true;
        }
    }

    public final boolean LJIILJJIL() {
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && Z9N.LIZIZ.LLLLZLL(aweme)) {
            return true;
        }
        return false;
    }

    public final boolean LJIJI() {
        return C86670Xzu.LJJIJIIJI(this.LJLILLLLZI);
    }

    public final boolean LJIJJLI() {
        return C86670Xzu.LJJIJIIJIL(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        if (LJIJI() || LJIJJLI()) {
            return R.raw.icon_2pt_closed_caption_gear;
        }
        if (C41032G8m.LIZ()) {
            if (C79004UzY.LJJIJIIJI(this.LJLIL)) {
                return R.raw.icon_2pt_closed_captions;
            }
            return R.raw.icon_closed_captions_fill;
        }
        if (LJIILJJIL()) {
            return R.raw.icon_2pt_closed_caption_fill;
        }
        return C62622Ohu.LIZIZ(this.LJLIL);
    }

    public final boolean LJII() {
        if (LJIJI() || LJIJJLI()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        if (LJIJI() || LJIJJLI()) {
            return R.raw.icon_closed_caption_gear_fill;
        }
        if (C41032G8m.LIZ()) {
            return R.raw.icon_closed_captions_fill;
        }
        if (LJIILJJIL()) {
            return R.raw.icon_closed_caption_x_fill;
        }
        return C62622Ohu.LIZ(this.LJLIL);
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (LJIJJLI() || LJIJI()) {
            return R.string.fis;
        }
        if (C41032G8m.LIZ()) {
            return R.string.dah;
        }
        if (LJIILJJIL() || (!C86670Xzu.LJJIIZI() && (!C79004UzY.LJJIJIIJI(this.LJLIL) || !AK4.LIZ().LJI()))) {
            return R.string.fiv;
        }
        return R.string.fiw;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        if (!C52263KfD.LIZ() || !VIT.LIZ().LJ() || C86670Xzu.LJJIJ() || LJIJJLI() || LJIJI() || C41032G8m.LIZ()) {
            return true;
        }
        return false;
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

    public final void LJIILL(EnumC86662Xzm enumC86662Xzm) {
        int i;
        if (this.LJLILLLLZI == null) {
            return;
        }
        String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
        String authorUid = this.LJLILLLLZI.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        boolean LJ = o.LJ(curUid, authorUid);
        CaptionsAndTranslationEntranceShowEvent captionsAndTranslationEntranceShowEvent = new CaptionsAndTranslationEntranceShowEvent();
        String aid = this.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        o.LJIIIIZZ(curUid, "curUid");
        String authorUid2 = this.LJLILLLLZI.getAuthorUid();
        o.LJIIIIZZ(authorUid2, "aweme.authorUid");
        String str = this.LJLJI;
        String valueOf = String.valueOf(this.LJLILLLLZI.getVideo().getDuration());
        String LJJIIZI = TranslationServiceImpl.LJJIJ().LJJIIZI();
        captionsAndTranslationEntranceShowEvent.LIZ().add(new C75012wz(LJ ? 1 : 0, C79004UzY.LJJJIL(this.LJLIL, this.LJLILLLLZI), aid, curUid, authorUid2, str, valueOf, LJJIIZI));
        int ordinal = enumC86662Xzm.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    throw new C162476Zf();
                }
            }
        } else {
            i = 0;
        }
        captionsAndTranslationEntranceShowEvent.LIZLLL(Integer.valueOf(i), "is_edit_available");
        AD0 enterMethod = AD0.SHARE_PANEL;
        o.LJIIIZ(enterMethod, "enterMethod");
        captionsAndTranslationEntranceShowEvent.LIZLLL(enterMethod, "enter_method");
        captionsAndTranslationEntranceShowEvent.LJFF();
    }

    public final void LJIL(int i) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    public final void LJJIIJ(Context context) {
        boolean z;
        String str;
        if ((AK4.LIZ().LJJI() || LJIILJJIL()) && (!C79004UzY.LJJIJIIJI(context) || !AK4.LIZ().LJI())) {
            z = true;
            AK4.LIZ().LJJIIJZLJL();
        } else {
            z = false;
        }
        boolean z2 = !z;
        AK4.LIZ().LJIL(z2);
        if (!z) {
            AK4.LIZ().LJJIII(false);
        }
        if (AGD.LIZ() && !C86670Xzu.LIZJ(this.LJLILLLLZI)) {
            if (z) {
                LJIL(R.string.gih);
                LJIIL(context, true);
            } else {
                LJIL(R.string.dcl);
                LJIIL(context, false);
            }
        }
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C2U8.LIZ(new C86645XzV(z2, str, EnumC86777Y3x.SHARE_PANEL, true));
        Z9N.LIZIZ.LLFZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    @Override // X.InterfaceC62486Ofi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r17, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r18) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86660Xzk.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    public final void LJIIJ(EnumC86777Y3x enumC86777Y3x, String str) {
        ITranslationService LJJIJ = TranslationServiceImpl.LJJIJ();
        C188727au LIZJ = LIZJ();
        LIZJ.LJIIIZ("target_lang", LJJIJ.LJJIIZI());
        LIZJ.LIZLLL(0, "is_to_turn_on");
        LIZJ.LJIIIZ("enter_method", enumC86777Y3x.getValue());
        LIZJ.LJI("author_options", str);
        FMX.LJIIL("show_subtitle_options", LIZJ.LIZ);
    }

    public final void LJIIL(Context context, boolean z) {
        String str;
        ITranslationService LJJIJ = TranslationServiceImpl.LJJIJ();
        C188727au LIZJ = LIZJ();
        LIZJ.LIZLLL(LJJIJ.LJIILJJIL(this.LJLILLLLZI, LJJIJ.LJJIIZI()) ? 1 : 0, "have_transl");
        LIZJ.LIZLLL(0, "have_tts");
        LIZJ.LIZLLL(0, "use_tts");
        LIZJ.LIZLLL(C79004UzY.LJJJIL(context, this.LJLILLLLZI), "is_landscape_screen");
        LIZJ.LIZLLL(0, "cla_subtitle_type");
        LIZJ.LJI("subtitle_type", C86670Xzu.LJIIJJI(this.LJLILLLLZI));
        if (z) {
            str = "hide_subtitle";
        } else {
            str = "expand_subtitle";
        }
        FMX.LJIIL(str, LIZJ.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C86660Xzk(Activity activity, Aweme aweme, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = enterFrom;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}

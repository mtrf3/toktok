package com.ss.android.ugc.aweme.autocaption;

import X.ACW;
import X.AK4;
import X.ASL;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C2S6;
import X.C33Q;
import X.C36922EeM;
import X.C41032G8m;
import X.C46290IEs;
import X.C52263KfD;
import X.C52280KfU;
import X.C53379KxD;
import X.C62822Ol8;
import X.C69596RTc;
import X.C76800UCe;
import X.C79004UzY;
import X.C84763XOl;
import X.C86661Xzl;
import X.C86669Xzt;
import X.C86670Xzu;
import X.C86701Y0z;
import X.ELN;
import X.EnumC86688Y0m;
import X.EnumC86689Y0n;
import X.EnumC86730Y2c;
import X.EnumC86777Y3x;
import X.FMX;
import X.HG3;
import X.IQV;
import X.IWF;
import X.InterfaceC232729Bk;
import X.InterfaceC65784Pro;
import X.InterfaceC86658Xzi;
import X.LBM;
import X.LBQ;
import X.OSZ;
import X.Q8U;
import X.RBX;
import X.RVC;
import X.SQS;
import X.TBB;
import X.VIT;
import X.X1D;
import X.Y01;
import X.Y04;
import X.Y0Y;
import X.Y18;
import X.Y1L;
import X.Y1Y;
import X.Z9N;
import Y.ACListenerS30S0300000_4;
import Y.ACListenerS35S0100000_15;
import Y.IDCSpanS1S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes16.dex */
public final class VideoCLACaptionViewModel extends FeedBaseViewModel<RVC> {
    public IQV LJLJLLL;
    public boolean LJLL;
    public boolean LJLLJ;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public boolean LLF;
    public Boolean LLFF;
    public Y1Y LLFFF;
    public Integer LLI;
    public Float LLIFFJFJJ;
    public InterfaceC65784Pro<C76800UCe> LLII;
    public boolean LLIIII;
    public double LLIIIILZ;
    public long LJLLI = -1;
    public boolean LJLLILLLL = true;
    public boolean LJLLL = AK4.LIZ().LJI();
    public long LJZI = -1;
    public boolean LJZL = true;
    public long LL = -1;
    public long LLD = -1;
    public List<String> LLFII = new ArrayList();
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 225));
    public final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 57));
    public String LLIIIL = "<";
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(Y1L.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new RVC(0);
    }

    public final String mv0() {
        IQV iqv = this.LJLJLLL;
        if (iqv != null) {
            return iqv.LIZ;
        }
        return null;
    }

    public final C86661Xzl nv0() {
        return (C86661Xzl) this.LLIIIJ.getValue();
    }

    public final boolean ov0() {
        CaptionModel captionModel;
        Long l;
        Aweme aweme;
        Video video;
        if (!this.LJLLILLLL) {
            return true;
        }
        VideoItemParams gv0 = gv0();
        CaptionItemModel captionItemModel = null;
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (video = aweme.getVideo()) != null) {
            captionModel = video.getCaptionModel();
        } else {
            captionModel = null;
        }
        if (captionModel == null) {
            return false;
        }
        CaptionLanguage originalCaptionLanguage = captionModel.getOriginalCaptionLanguage();
        if (originalCaptionLanguage != null) {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        } else {
            l = null;
        }
        List<CaptionItemModel> captionList = captionModel.getCaptionList();
        if (captionList == null) {
            return false;
        }
        Iterator<CaptionItemModel> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CaptionItemModel next = it.next();
            long languageId = next.getLanguageId();
            if (l != null && languageId == l.longValue()) {
                captionItemModel = next;
                break;
            }
        }
        CaptionItemModel captionItemModel2 = captionItemModel;
        if (captionItemModel2 == null) {
            return false;
        }
        return captionItemModel2.isAutoGenerated();
    }

    public final void sv0() {
        Aweme aweme;
        VideoItemParams gv0;
        if (this.LJLL) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme = gv02.getAweme();
            } else {
                aweme = null;
            }
            if (C86670Xzu.LJIIJ(aweme) != null && (gv0 = gv0()) != null) {
                InterfaceC86658Xzi LJ = TranslationServiceImpl.LJJIJ().LJ();
                Aweme aweme2 = gv0.getAweme();
                o.LJIIIIZZ(aweme2, "aweme");
                LJ.LIZ(aweme2, TBB.CLA_REALTIME_STATUS_LEAVE);
            }
        }
    }

    public final EnumC86689Y0n LLZLL() {
        Fragment fragment;
        Context context;
        EnumC86689Y0n enumC86689Y0n;
        Aweme aweme;
        IQV iqv;
        Aweme aweme2;
        Aweme aweme3 = null;
        if (C41032G8m.LIZ() && (iqv = this.LJLJLLL) != null && iqv.LIZJ && !(iqv.LIZLLL instanceof Y0Y)) {
            Y01 y01 = Y01.LIZIZ;
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme2 = gv0.getAweme();
            } else {
                aweme2 = null;
            }
            if (y01.LJJIIJZLJL(aweme2) && !(this.LLFFF instanceof Y0Y)) {
                return EnumC86689Y0n.HIDDEN;
            }
        }
        if (!wv0()) {
            return EnumC86689Y0n.HIDDEN;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme = gv02.getAweme()) != null && Z9N.LIZIZ.LLLLZLL(aweme)) {
            return EnumC86689Y0n.EXPANDED;
        }
        if (C41032G8m.LIZ()) {
            if (AK4.LIZ().LJJIJIIJIL(lv0())) {
                return EnumC86689Y0n.HIDDEN;
            }
            VideoItemParams gv03 = gv0();
            if (gv03 != null) {
                aweme3 = gv03.getAweme();
            }
            if (o.LJ(C86670Xzu.LIZ(aweme3), Boolean.TRUE)) {
                if (AK4.LIZ().LJJIFFI()) {
                    return EnumC86689Y0n.EXPANDED;
                }
                return EnumC86689Y0n.HIDDEN;
            }
            if (AK4.LIZ().LIZIZ()) {
                return EnumC86689Y0n.EXPANDED;
            }
            return EnumC86689Y0n.HIDDEN;
        }
        EnumC86688Y0m LJJI = ((ITranslationService) this.LLIIIZ.getValue()).LJJI();
        if (ACW.LIZIZ()) {
            int i = C86701Y0z.LIZ[LJJI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            enumC86689Y0n = EnumC86689Y0n.HIDDEN;
                        }
                    } else {
                        enumC86689Y0n = EnumC86689Y0n.HIDDEN;
                    }
                } else {
                    enumC86689Y0n = EnumC86689Y0n.COLLAPSED;
                }
            } else {
                enumC86689Y0n = EnumC86689Y0n.EXPANDED;
            }
            if (enumC86689Y0n != null) {
                return enumC86689Y0n;
            }
        }
        if (!yv0() || ((fragment = this.LJLJJLL) != null && (context = fragment.getContext()) != null && C79004UzY.LJJIJIIJI(context))) {
            if (C53379KxD.LIZ()) {
                if (AK4.LIZ().LJJIJIIJIL(lv0())) {
                    return EnumC86689Y0n.HIDDEN;
                }
                if (!AK4.LIZ().LJJI()) {
                    return EnumC86689Y0n.HIDDEN;
                }
                if (this.LJLLL) {
                    return EnumC86689Y0n.COLLAPSED;
                }
                return EnumC86689Y0n.EXPANDED;
            }
            if (this.LJLLL || AK4.LIZ().LJJIJIIJIL(lv0())) {
                return EnumC86689Y0n.COLLAPSED;
            }
            return EnumC86689Y0n.EXPANDED;
        }
        return EnumC86689Y0n.EXPANDED;
    }

    public final String lv0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            return aweme.getAid();
        }
        return null;
    }

    public final boolean pv0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return C86670Xzu.LJJIIJ(aweme);
    }

    public final boolean wv0() {
        Aweme aweme;
        ICLACaptionService LJIILIIL = CaptionServiceImpl.LJIILIIL();
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        return LJIILIIL.LJIIIIZZ(aweme);
    }

    public final boolean xv0() {
        String str;
        Aweme aweme;
        Aweme aweme2;
        VideoItemParams gv0 = gv0();
        Aweme aweme3 = null;
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null) {
            str = aweme2.getAuthorUid();
        } else {
            str = null;
        }
        if (!ujb.o.LJJJJIZL(str, ((RBX) HG3.LJIILL()).getCurUserId(), false)) {
            return false;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null) {
            aweme = gv02.getAweme();
        } else {
            aweme = null;
        }
        if (!C86670Xzu.LJJ(aweme)) {
            return false;
        }
        VideoItemParams gv03 = gv0();
        if (gv03 != null) {
            aweme3 = gv03.getAweme();
        }
        if (!C86670Xzu.LJJI(aweme3)) {
            return false;
        }
        return true;
    }

    public final boolean yv0() {
        if (C52263KfD.LIZ() && !this.LJLLILLLL) {
            return true;
        }
        return false;
    }

    public final void kv0(EnumC86730Y2c triggerMethod) {
        Aweme aweme;
        CaptionItemModel LJIIIIZZ;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionItemModel captionItemModel;
        o.LJIIIZ(triggerMethod, "triggerMethod");
        this.LL = SystemClock.elapsedRealtime();
        IWF.LJJLIIIIJ().LJJIJIL().LJIIJ();
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme)) == null) {
            return;
        }
        if (this.LJLLILLLL) {
            captionItemModel = LJIIIIZZ;
        } else {
            Video video = aweme.getVideo();
            CaptionItemModel captionItemModel2 = null;
            if (video == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null) {
                return;
            }
            Iterator<CaptionItemModel> it = captionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CaptionItemModel next = it.next();
                if (next.getSubId() != LJIIIIZZ.getSubId()) {
                    captionItemModel2 = next;
                    break;
                }
            }
            captionItemModel = captionItemModel2;
            if (captionItemModel == null) {
                return;
            }
        }
        ICLAPerfETService LIZ = C46290IEs.LIZ();
        String valueOf = String.valueOf(captionItemModel.getClaSubtitleId());
        String languageCode = captionItemModel.getLanguageCode();
        if (languageCode == null) {
            languageCode = "";
        }
        LIZ.LIZJ(valueOf, languageCode, LJIIIIZZ.getLanguageCode(), ELN.OFFLINE, triggerMethod);
    }

    public final boolean tv0(Context context) {
        VideoItemParams gv0;
        Aweme aweme;
        String str;
        ActivityC45651qj activityC45651qj;
        Aweme aweme2;
        ActivityC45651qj activityC45651qj2;
        nv0().LJIILL(context, this.LJLLILLLL);
        if (pv0()) {
            if (C53379KxD.LIZ() || AK4.LIZ().LJIIIIZZ() || AK4.LIZ().LJFF() != 0) {
                return false;
            }
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj2 = (ActivityC45651qj) LJIIIIZZ) != null) {
                LBM lbm = new LBM(activityC45651qj2);
                TuxSheet tuxSheet = new ASL().LIZ;
                tuxSheet.LJLLI = lbm;
                C16880lQ.LJJIZ(lbm.getBtnDismiss(), new ACListenerS35S0100000_15(tuxSheet, 89));
                C16880lQ.LJIILLIIL(lbm.getIvClose(), new ACListenerS35S0100000_15(tuxSheet, 90));
                FragmentManager supportFragmentManager = activityC45651qj2.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                tuxSheet.show(supportFragmentManager, "ManageAutoGeneratedCaptionsIntroView");
                AK4.LIZ().LJIJJLI();
            }
            return true;
        }
        Keva keva = SQS.LIZ;
        if (!keva.getBoolean("has_tap_translated_caption", false) && (gv0 = gv0()) != null && (aweme = gv0.getAweme()) != null && aweme.getAuthorUid() != null) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null && (aweme2 = gv02.getAweme()) != null) {
                str = aweme2.getAuthorUid();
            } else {
                str = null;
            }
            if (!o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId())) {
                Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                if ((LJIIIIZZ2 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ2) != null) {
                    C86661Xzl nv0 = nv0();
                    boolean z = this.LJLLILLLL;
                    nv0.getClass();
                    C188727au c188727au = new C188727au();
                    nv0.LJII(c188727au, null);
                    nv0.LJIILJJIL(c188727au);
                    c188727au.LIZLLL(nv0.LJI(c188727au) ? 1 : 0, "have_transl");
                    nv0.LJIILIIL(c188727au);
                    nv0.LJIIJJI(c188727au, z);
                    c188727au.LIZLLL(0, "have_tts");
                    c188727au.LIZLLL(0, "use_tts");
                    nv0.LJIIIIZZ(c188727au, z);
                    FMX.LJIIL("subtitle_intro_show", c188727au.LIZ);
                    keva.storeBoolean("has_tap_translated_caption", true);
                    LBQ lbq = new LBQ(activityC45651qj);
                    TuxSheet tuxSheet2 = new ASL().LIZ;
                    tuxSheet2.LJLLI = lbq;
                    C16880lQ.LJJIZ(lbq.getBtnDismiss(), new ACListenerS35S0100000_15(tuxSheet2, 183));
                    C16880lQ.LJIILLIIL(lbq.getIvClose(), new ACListenerS35S0100000_15(tuxSheet2, 184));
                    ACListenerS30S0300000_4 aCListenerS30S0300000_4 = new ACListenerS30S0300000_4(this, activityC45651qj, tuxSheet2, 10);
                    C16880lQ.LJJJJI(lbq.getTvGoSetting(), aCListenerS30S0300000_4);
                    lbq.LJLJJL.setText(lbq.getContext().getString(R.string.tr1));
                    String string = lbq.getContext().getString(R.string.tr_);
                    o.LJIIIIZZ(string, "context.getString(if (is…ewer_translate_modal_dec)");
                    String string2 = lbq.getContext().getString(R.string.tr0);
                    o.LJIIIIZZ(string2, "context.getString(R.stri…ewer_captions_modal_link)");
                    SpannableString spannableString = new SpannableString(Q8U.LIZIZ(new Object[]{string2}, 1, string, "format(format, *args)"));
                    int LJJLIIIJL = s.LJJLIIIJL(spannableString, string2, 0, false, 6);
                    spannableString.setSpan(new IDCSpanS1S0200000_3(aCListenerS30S0300000_4, lbq, 1), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
                    lbq.LJLILLLLZI.setHighlightColor(C04330Ez.LIZIZ(lbq.getContext(), R.color.cz));
                    lbq.LJLILLLLZI.setMovementMethod(LinkMovementMethod.getInstance());
                    lbq.LJLILLLLZI.setText(spannableString);
                    FragmentManager supportFragmentManager2 = activityC45651qj.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager2, "activity.supportFragmentManager");
                    tuxSheet2.show(supportFragmentManager2, "feed_caption_intro");
                    return true;
                }
            }
        }
        return false;
    }

    public final void uv0(Context context) {
        String str;
        boolean z;
        Aweme aweme;
        CaptionItemModel LIZLLL;
        C2S6.LIZ(context).getPageType();
        ITranslationKevaService LIZ = VIT.LIZ();
        VideoItemParams gv0 = gv0();
        Aweme aweme2 = null;
        if (gv0 != null) {
            aweme2 = gv0.getAweme();
        }
        boolean LIZJ = LIZ.LIZJ(aweme2);
        VideoItemParams gv02 = gv0();
        if (gv02 == null || (aweme = gv02.getAweme()) == null || (LIZLLL = Y04.LIZLLL(aweme)) == null || (str = LIZLLL.getLanguageName()) == null) {
            str = "";
        }
        boolean z2 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!LIZJ || !z) {
            z2 = true;
        }
        this.LJLLILLLL = z2;
    }

    public final void vv0(String value) {
        o.LJIIIZ(value, "value");
        this.LLIIIL = value;
        ((Y18) this.LLFZ.getValue()).LIZ();
    }

    public final void rv0(EnumC86777Y3x enterMethod, Context context) {
        Aweme aweme;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (wv0()) {
            C86661Xzl nv0 = nv0();
            boolean z = this.LJLLILLLL;
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            nv0.LJIILLIIL(z, enterMethod, C79004UzY.LJJJIL(context, aweme), this.LLI, this.LLIFFJFJJ);
        }
    }

    public final void qv0(EnumC86777Y3x enterMethod, Context context, boolean z) {
        Aweme aweme;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (wv0()) {
            C86661Xzl nv0 = nv0();
            boolean z2 = this.LJLLILLLL;
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            int LJJJIL = C79004UzY.LJJJIL(context, aweme);
            Float f = this.LLIFFJFJJ;
            Integer num = this.LLI;
            double d = this.LLIIIILZ;
            nv0.getClass();
            C188727au c188727au = new C188727au();
            nv0.LJII(c188727au, null);
            C86669Xzt.LIZ(c188727au, enterMethod);
            nv0.LJIILJJIL(c188727au);
            nv0.LJIILIIL(c188727au);
            c188727au.LIZLLL(nv0.LJI(c188727au) ? 1 : 0, "have_transl");
            nv0.LJIIJJI(c188727au, z2);
            nv0.LJIIL(c188727au);
            c188727au.LIZLLL(0, "have_tts");
            c188727au.LIZLLL(0, "use_tts");
            nv0.LJIIIIZZ(c188727au, z2);
            nv0.LIZLLL(c188727au);
            c188727au.LIZLLL(LJJJIL, "is_landscape_screen");
            C86669Xzt.LJFF(c188727au);
            nv0.LJIIIZ(c188727au);
            C86661Xzl.LJIIJ(c188727au);
            if (num != null) {
                c188727au.LIZLLL(num.intValue(), "subtitle_index");
            }
            if (f != null) {
                c188727au.LIZIZ(f.floatValue(), "subtitle_position");
            }
            nv0.LJIILJJIL(c188727au);
            if (z) {
                c188727au.LIZLLL(1, "is_captions_intro_show");
                c188727au.LIZJ("launch_volume_pct", d);
            }
            FMX.LJIIL("expand_subtitle", c188727au.LIZ);
        }
    }

    public static final void Av0(VideoCLACaptionViewModel videoCLACaptionViewModel, boolean z, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str2;
        String str3;
        Aweme aweme;
        videoCLACaptionViewModel.LJZI = SystemClock.elapsedRealtime();
        videoCLACaptionViewModel.LJLLLLLL = true;
        if (z) {
            ICaptionKevaService LIZ = AK4.LIZ();
            VideoItemParams gv0 = videoCLACaptionViewModel.gv0();
            if (gv0 == null || (aweme = gv0.getAweme()) == null || (str3 = aweme.getAid()) == null) {
                str3 = "";
            }
            LIZ.LJJII(str3);
        }
        videoCLACaptionViewModel.LJLLLL = false;
        videoCLACaptionViewModel.LJLLILLLL = z;
        if (z) {
            str = null;
        }
        videoCLACaptionViewModel.LJLZ = str;
        videoCLACaptionViewModel.LJLLJ = true;
        if (C52280KfU.LIZ() && !z) {
            videoCLACaptionViewModel.setState(C69596RTc.LJLIL);
        }
        interfaceC65784Pro.invoke();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("switch caption language of awemeID: ");
        LIZ2.append(videoCLACaptionViewModel.lv0());
        LIZ2.append(" to ");
        if (z) {
            str2 = "original";
        } else {
            str2 = "translation";
        }
        LIZ2.append(str2);
        LIZ2.append(" caption ");
        C36922EeM.LIZLLL(4, "VideoCLACaptionVM", X1D.LIZIZ(LIZ2));
    }

    public final void zv0(InterfaceC232729Bk interfaceC232729Bk, boolean z, OSZ osz, String languageCode, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z2;
        String str;
        Aweme aweme;
        o.LJIIIZ(languageCode, "languageCode");
        CharSequence charSequence = (CharSequence) osz.getSecond();
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        if (this.LJLLJ && z == this.LJLLILLLL && ((z || o.LJ(languageCode, this.LJLZ)) && !z3)) {
            return;
        }
        if (this.LJLL && interfaceC232729Bk != null) {
            interfaceC232729Bk.L60();
        }
        lv0();
        int intValue = ((Number) osz.getFirst()).intValue();
        boolean contains = ((ArrayList) this.LLFII).contains(languageCode);
        if (z3 && !contains) {
            Object second = osz.getSecond();
            if (second != null) {
                JSONObject jSONObject = new JSONObject();
                VideoItemParams gv0 = gv0();
                if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                jSONObject.put("id", str);
                jSONObject.put("language", languageCode);
                jSONObject.put("url", second);
                jSONObject.put("sub_id", intValue);
                jSONObject.put("expire", System.currentTimeMillis() + 259200000);
                jSONObject.put("language_id", 1);
                jSONObject.put("format", "webvtt");
                jSONObject.put("source", "MU");
                jSONObject.put("version", "");
                ((ArrayList) this.LLFII).add(languageCode);
                IWF.LJJLIIIIJ().LJJIJIL().LJJLIIIJ(intValue, jSONObject);
                Av0(this, z, languageCode, interfaceC65784Pro);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            IWF.LJJLIIIIJ().LJJIJIL().LJJLIIIJLLLLLLLZ(intValue);
            Av0(this, z, languageCode, interfaceC65784Pro);
        }
        CharSequence charSequence2 = (CharSequence) osz.getSecond();
        if (charSequence2 == null || charSequence2.length() == 0) {
            if (!z) {
                this.LLFF = Boolean.FALSE;
                return;
            } else {
                this.LLFF = null;
                return;
            }
        }
        this.LLFF = Boolean.TRUE;
    }
}

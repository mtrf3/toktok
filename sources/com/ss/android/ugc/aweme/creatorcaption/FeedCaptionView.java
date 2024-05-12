package com.ss.android.ugc.aweme.creatorcaption;

import X.ACR;
import X.ACW;
import X.AK6;
import X.ASL;
import X.AbstractC224038ql;
import X.AbstractC73638SvC;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.AnonymousClass840;
import X.C09900aA;
import X.C10K;
import X.C141335gf;
import X.C15890jp;
import X.C16310kV;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C221108m2;
import X.C223728qG;
import X.C223778qL;
import X.C224048qm;
import X.C245649kW;
import X.C25620zW;
import X.C25840ACe;
import X.C25845ACj;
import X.C26045AKb;
import X.C26338AVi;
import X.C2IP;
import X.C2U8;
import X.C2Y1;
import X.C32151Nz;
import X.C34070DYs;
import X.C36871EdX;
import X.C36922EeM;
import X.C37246Eja;
import X.C37247Ejb;
import X.C3C5;
import X.C41032G8m;
import X.C42374Gk6;
import X.C45804HyK;
import X.C46262IDq;
import X.C47261Igj;
import X.C47636Imm;
import X.C52263KfD;
import X.C52280KfU;
import X.C53280Kvc;
import X.C53379KxD;
import X.C55048Lj2;
import X.C55323LnT;
import X.C60996Nwm;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C69M;
import X.C6DJ;
import X.C73969T1h;
import X.C76732zl;
import X.C78496UrM;
import X.C78983UzD;
import X.C79004UzY;
import X.C7GV;
import X.C7MY;
import X.C82682Wcg;
import X.C84763XOl;
import X.C86645XzV;
import X.C86646XzW;
import X.C86647XzX;
import X.C86648XzY;
import X.C86650Xza;
import X.C86652Xzc;
import X.C86655Xzf;
import X.C86657Xzh;
import X.C86669Xzt;
import X.C86670Xzu;
import X.C87026YDm;
import X.C8LG;
import X.C90193gN;
import X.C91L;
import X.EF7;
import X.EnumC1551166x;
import X.EnumC232679Bf;
import X.EnumC79546VJu;
import X.EnumC86689Y0n;
import X.EnumC86777Y3x;
import X.FMX;
import X.GMW;
import X.H7B;
import X.HG3;
import X.IQD;
import X.InterfaceC221818nB;
import X.InterfaceC232729Bk;
import X.InterfaceC54035LIp;
import X.InterfaceC55235Lm3;
import X.InterfaceC60152Xr;
import X.InterfaceC82683Wch;
import X.KL2;
import X.L2D;
import X.LBP;
import X.LFH;
import X.O6R;
import X.OB2;
import X.ORZ;
import X.QD3;
import X.RBX;
import X.T16;
import X.TBB;
import X.WHL;
import X.X1D;
import X.Y04;
import X.Y1A;
import X.Y2G;
import X.YE1;
import Y.ACListenerS35S0100000_15;
import Y.ACallableS2S2101000_7;
import Y.ACallableS4S2000000_6;
import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS10S0102000_15;
import Y.AUListenerS15S0310000_15;
import Y.AfS56S0200000_7;
import Y.IDComparatorS32S0000000_4;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.s;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowEvent;
import com.ss.android.ugc.aweme.experiment.TTLingoGeckoLowStorageConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.service.IFeedCaptionView;
import com.ss.android.ugc.aweme.services.sticker.ICaptionService;
import com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class FeedCaptionView extends AbstractC224038ql implements IFeedCaptionView {
    public static final String LLILIL;
    public static final C62822Ol8 LLILL;
    public static final int LLILLIZIL;
    public static final int LLILLJJLI;
    public static final int LLILLL;
    public static final int LLILZ;
    public static final int LLILZIL;
    public static final int LLILZLL;
    public final Aweme LJLLI;
    public final InterfaceC55235Lm3 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public int LJLLL;
    public ValueAnimator LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public volatile int LJZ;
    public volatile String LJZI;
    public String LJZL;
    public C69M LL;
    public int LLD;
    public InterfaceC82683Wch LLF;
    public final C62822Ol8 LLFF;
    public int LLFFF;
    public boolean LLFII;
    public final C62822Ol8 LLFZ;
    public final IDDListenerS58S0100000_7 LLI;
    public TuxTextView LLIFFJFJJ;
    public FrameLayout LLII;
    public TuxIconView LLIIII;
    public FrameLayout LLIIIILZ;
    public View LLIIIJ;
    public LinearLayout LLIIIL;
    public ImageView LLIIIZ;
    public TuxIconView LLIIJI;
    public boolean LLIIJLIL;
    public double LLIIL;
    public ObjectAnimator LLIILII;
    public final long LLIILZL;
    public final long LLIIZ;
    public final float LLIL;
    public final C62822Ol8 LLILII;

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    public final void LJJIIZI() {
        this.LJLLLLLL = 4;
        TuxIconView tuxIconView = this.LLIIII;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        FrameLayout frameLayout = this.LLIIIILZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final void LJJJI() {
        this.LJLLLLLL = 2;
        if (C52280KfU.LIZ()) {
            LJJI();
        }
        TuxIconView tuxIconView = this.LLIIII;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
            tuxTextView.setAlpha(1.0f);
            tuxTextView.setScaleX(1.0f);
            tuxTextView.setScaleY(1.0f);
        }
        FrameLayout frameLayout = this.LLIIIILZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (this.LJLZ == 2) {
            LJJIJ();
        }
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 11;
    }

    static {
        ICaptionService LIZ;
        String captionCacheDir;
        if (C34070DYs.LIZ || (LIZ = CaptionServiceImpl.LIZ()) == null) {
            captionCacheDir = null;
        } else {
            captionCacheDir = LIZ.getCaptionCacheDir();
        }
        LLILIL = captionCacheDir;
        LLILL = C221108m2.LIZIZ(GMW.LJLIL);
        KL2.LIZJ(EF7.LIZIZ(), 200.0f);
        LLILLIZIL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
        LLILLJJLI = C63081OpJ.LJJJJLI(EF7.LIZIZ()) + ((int) KL2.LIZJ(EF7.LIZIZ(), 58.0f));
        int LIZJ = (int) KL2.LIZJ(EF7.LIZIZ(), 16.0f);
        LLILLL = LIZJ;
        int LIZJ2 = (int) KL2.LIZJ(EF7.LIZIZ(), 56.0f);
        LLILZ = LIZJ2;
        LLILZIL = Math.min((int) KL2.LIZJ(EF7.LIZIZ(), 320.0f), (C60996Nwm.LJII() - LIZJ) - LIZJ2);
        LLILZLL = (int) KL2.LIZJ(EF7.LIZIZ(), 32.0f);
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void LIZJ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LLF;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    public final void LJJI() {
        LinearLayout linearLayout = this.LLIIIL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.LLIIJLIL = false;
    }

    public final ICaptionKevaService LJJIFFI() {
        return (ICaptionKevaService) this.LLFF.getValue();
    }

    public final C86650Xza LJJIIJ() {
        return (C86650Xza) this.LLFZ.getValue();
    }

    public final void LJJIJ() {
        CaptionStruct captionStruct;
        List<Utterance> utterances;
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && captionStruct.getUtterances() != null && (utterances = captionStruct.getUtterances()) != null) {
            ORZ.LLILII(new IDComparatorS32S0000000_4(0), utterances);
            this.LL = new C69M(utterances);
        }
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    /* renamed from: LJJIZ, reason: merged with bridge method [inline-methods] */
    public final C86657Xzh t() {
        int i;
        Aweme aweme;
        String LJIILJJIL = C86670Xzu.LJIILJJIL(this.LJLLI);
        if (o.LJ(LJIILJJIL, EnumC79546VJu.REALTIME.getValue()) && IQD.LIZ().LJIIIIZZ(this.LJLLI) && (aweme = this.LJLLI) != null) {
            ((ITranslationService) this.LLILII.getValue()).LJ().LIZ(aweme, TBB.CLA_REALTIME_STATUS_SHOWN_CAPTION);
        }
        boolean LJJIFFI = C86670Xzu.LJJIFFI(this.LJLLI);
        String LJIIJJI = C86670Xzu.LJIIJJI(this.LJLLI);
        String captionShowType = LLZLL().getCaptionShowType();
        String LJIILL = C86670Xzu.LJIILL(this.LJLLI);
        Aweme aweme2 = this.LJLLI;
        if ((aweme2 != null && Y04.LIZLLL(aweme2) != null) || ((ITranslationService) this.LLILII.getValue()).LJIILJJIL(this.LJLLI, ((ITranslationService) this.LLILII.getValue()).LJJIIZI())) {
            i = 1;
        } else {
            i = 0;
        }
        return new C86657Xzh(LJJIFFI ? 1 : 0, 0, i, C86670Xzu.LJIJI(this.LJLLI), LJIIJJI, captionShowType, LJIILL, LJIILJJIL, C86670Xzu.LJIILL(this.LJLLI));
    }

    public final void LJJJ() {
        if (this.LJZ == 0) {
            return;
        }
        Downloader downloader = Downloader.getInstance(this.LJLILLLLZI);
        downloader.removeMainThreadListener(this.LJZ, this.LLI);
        downloader.cancel(this.LJZ, true);
        this.LJZ = 0;
        this.LJZI = null;
    }

    public final void LJJJJ() {
        CaptionStruct captionStruct;
        List<Utterance> utterances;
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && (utterances = captionStruct.getUtterances()) != null && !utterances.isEmpty()) {
            InterfaceC232729Bk interfaceC232729Bk = (InterfaceC232729Bk) this.LJLLJ.getValue();
            if (interfaceC232729Bk != null) {
                interfaceC232729Bk.Lj(EnumC232679Bf.CREATOR);
            }
            InterfaceC232729Bk interfaceC232729Bk2 = (InterfaceC232729Bk) this.LJLLJ.getValue();
            if (interfaceC232729Bk2 != null) {
                interfaceC232729Bk2.bd0(ORZ.LLJI(utterances));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final EnumC86689Y0n LLZLL() {
        int i = this.LJLLLLLL;
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                return EnumC86689Y0n.HIDDEN;
            }
            return EnumC86689Y0n.EXPANDED;
        }
        return EnumC86689Y0n.COLLAPSED;
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        if (d2(C86657Xzh.class)) {
            return t();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final int getVisibility() {
        FrameLayout frameLayout = this.LLII;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    @Override // X.Y1I
    public final void LJJII() {
        String aid;
        Aweme aweme;
        CaptionStruct captionStruct;
        LJJJJ();
        this.LLFII = true;
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        String str = "";
        String str2 = null;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HandleOnPageSelected. Aweme ");
            Aweme aweme2 = this.LJLLI;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            LIZ.append(str2);
            LIZ.append(" contains creator caption data from InteractStickerStruct;original: ");
            String selectLang = captionStruct.getSelectLang();
            if (selectLang == null) {
                selectLang = "";
            }
            LIZ.append(selectLang);
            LIZ.append("; CaptionDisplayState: ");
            LIZ.append(this.LJLLLLLL);
            C36922EeM.LIZLLL(4, "FeedCaptionView", X1D.LIZIZ(LIZ));
        }
        this.LLIIL = C47636Imm.LJII(2);
        if (C52280KfU.LIZ() && (aweme = this.LJLLI) != null && C86670Xzu.LJII(aweme) != null && LLZLL() != EnumC86689Y0n.EXPANDED && C86655Xzf.LIZ(this.LJLLI, this.LLIIJLIL, C79004UzY.LJJIJIIJI(this.LJLILLLLZI), false)) {
            this.LLIIJLIL = true;
            LinearLayout linearLayout = this.LLIIIL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (C41032G8m.LIZ()) {
                ImageView imageView = this.LLIIIZ;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                TuxIconView tuxIconView = this.LLIIJI;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                }
            } else {
                ImageView imageView2 = this.LLIIIZ;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                TuxIconView tuxIconView2 = this.LLIIJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
            }
            LinearLayout linearLayout2 = this.LLIIIL;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(1.0f);
            }
            TuxIconView tuxIconView3 = this.LLIIII;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
            }
            C7GV.LIZ(20, this.LLIIIL);
            LJJIFFI().LJII(LJJIFFI().LJIIL() + 1);
            LJJIFFI().LJIJJ(System.currentTimeMillis());
        }
        LJJJJIZL();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        if (this.LJLLLLLL == 2) {
            Aweme aweme3 = this.LJLLI;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                str = aid;
            }
            OB2.LIZ(str);
        }
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
        LJJJ();
        this.LLFII = false;
        EventBus.LIZJ().LJIJ(this);
        this.LLF = null;
        if (z0()) {
            LJJI();
        }
    }

    public final void LJJIJIIJIL() {
        C86650Xza LJJIIJ = LJJIIJ();
        LJJIIJ.getClass();
        C188727au c188727au = new C188727au();
        LJJIIJ.LJII(c188727au);
        LJJIIJ.LJIIJJI(c188727au);
        LJJIIJ.LJIIIZ(c188727au);
        LJJIIJ.LJIIJ(c188727au);
        c188727au.LIZLLL(0, "have_transl");
        c188727au.LIZLLL(0, "use_transl");
        LJJIIJ.LJIIIIZZ(c188727au);
        LJJIIJ.LIZLLL(c188727au);
        c188727au.LIZLLL(0, "use_transl");
        FMX.LJIIL("click_subtitle", c188727au.LIZ);
    }

    public final boolean LJJJIL() {
        CaptionStruct captionStruct;
        String str;
        CaptionStruct captionStruct2;
        CaptionStruct captionStruct3;
        if (C52263KfD.LIZ() && this.LJZL != null) {
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            String str2 = null;
            if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && captionStruct.getSelectLang() != null) {
                InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
                if (interactStickerStruct2 != null && (captionStruct3 = interactStickerStruct2.getCaptionStruct()) != null) {
                    str = captionStruct3.getSelectLang();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "null")) {
                    String str3 = this.LJZL;
                    InteractStickerStruct interactStickerStruct3 = this.LJLJLLL;
                    if (interactStickerStruct3 != null && (captionStruct2 = interactStickerStruct3.getCaptionStruct()) != null) {
                        str2 = captionStruct2.getSelectLang();
                    }
                    if (!o.LJ(str3, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void LJJJJIZL() {
        TuxIconView tuxIconView;
        if (!C52280KfU.LIZ() || !this.LLIIJLIL || (LJJIFFI().LJJI() && !LJJIFFI().LJI())) {
            if (C41032G8m.LIZ()) {
                if (o.LJ(C86670Xzu.LIZIZ(this.LJLLI), Boolean.TRUE)) {
                    if (LJJIFFI().LJJIFFI()) {
                        LJJJI();
                        return;
                    } else {
                        LJJIIZI();
                        return;
                    }
                }
                if (!o.LJ(C86670Xzu.LIZIZ(this.LJLLI), Boolean.FALSE)) {
                    return;
                }
                if (LJJIFFI().LIZIZ()) {
                    LJJJI();
                    return;
                } else {
                    LJJIIZI();
                    return;
                }
            }
            float f = 1.0f;
            if (LJJJIL() || ((!C53379KxD.LIZ() && !LJJIFFI().LJI()) || (C53379KxD.LIZ() && LJJIFFI().LJJI() && !LJJIFFI().LJI()))) {
                this.LJLLLLLL = 2;
                if (C52280KfU.LIZ()) {
                    LJJI();
                }
                TuxIconView tuxIconView2 = this.LLIIII;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
                TuxTextView tuxTextView = this.LLIFFJFJJ;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                    tuxTextView.setAlpha(1.0f);
                    tuxTextView.setScaleX(1.0f);
                    tuxTextView.setScaleY(1.0f);
                }
                FrameLayout frameLayout = this.LLIIIILZ;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                if (this.LJLZ == 2) {
                    LJJIJ();
                    return;
                }
                return;
            }
            if (C53379KxD.LIZ() && !LJJIFFI().LJJI()) {
                this.LJLLLLLL = 4;
                TuxIconView tuxIconView3 = this.LLIIII;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(8);
                }
            } else {
                this.LJLLLLLL = 0;
                TuxIconView tuxIconView4 = this.LLIIII;
                if (tuxIconView4 != null) {
                    tuxIconView4.setVisibility(0);
                }
            }
            TuxTextView tuxTextView2 = this.LLIFFJFJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            if (!z0() && (tuxIconView = this.LLIIII) != null) {
                if (C53379KxD.LIZ() && this.LLIILII == null) {
                    f = this.LLIL;
                }
                tuxIconView.setAlpha(f);
            }
            FrameLayout frameLayout2 = this.LLIIIILZ;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final boolean z0() {
        if (C52280KfU.LIZ() && this.LLIIJLIL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final double LLLLZI() {
        return this.LLIIL;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final void C0(EnumC86777Y3x enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        LJJIIJ().LJIIL(enterMethod);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Y1I
    public final View LIZ(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        CaptionStruct LJIIL;
        int LJIIIIZZ;
        int i2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        CaptionStruct captionStruct;
        AutocaptionType autocaptionType;
        String language;
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLILLLLZI);
        View view = this.LJLJI;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dst, (ViewGroup) view, false);
        C16310kV.LJIIIZ(LLLLIILL, C90193gN.LIZ() ? 1 : 0);
        this.LLIFFJFJJ = (TuxTextView) LLLLIILL.findViewById(R.id.m1n);
        this.LLII = (FrameLayout) LLLLIILL.findViewById(R.id.dcs);
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.ezs);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_closed_caption;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(23));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(23));
        tuxIconView.setTuxIcon(c2068389v);
        this.LLIIII = tuxIconView;
        this.LLIIIILZ = (FrameLayout) LLLLIILL.findViewById(R.id.dfj);
        this.LLIIIL = (LinearLayout) LLLLIILL.findViewById(R.id.f4_);
        this.LLIIIZ = (ImageView) LLLLIILL.findViewById(R.id.f49);
        this.LLIIJI = (TuxIconView) LLLLIILL.findViewById(R.id.f48);
        ((ProgressBar) LLLLIILL.findViewById(R.id.hjo)).getIndeterminateDrawable().setColorFilter(AnonymousClass636.LJIIIIZZ(R.attr.dm, this.LJLILLLLZI), PorterDuff.Mode.SRC_IN);
        this.LJLLL = 0;
        Aweme aweme = this.LJLLI;
        ViewGroup.LayoutParams layoutParams5 = null;
        if (aweme != null && (LJIIL = C86670Xzu.LJIIL(aweme)) != null) {
            C245649kW c245649kW = this.LJLJJI;
            if (c245649kW != null) {
                LJIIIIZZ = (int) c245649kW.LIZ;
            } else {
                LJIIIIZZ = C60996Nwm.LJIIIIZZ(this.LJLILLLLZI);
            }
            TuxTextView tuxTextView = this.LLIFFJFJJ;
            if (tuxTextView != null) {
                tuxTextView.setMaxWidth(LLILZIL);
            }
            ViewParent parent = this.LJLJI.getParent().getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int width = ((View) parent).getWidth();
            if (width == 0) {
                width = C60996Nwm.LJIIIIZZ(this.LJLILLLLZI);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedCaptionView getView videoWidth ");
            LIZ.append(LJIIIIZZ);
            LIZ.append(" screenWidth ");
            LIZ.append(width);
            H7B.LJ(X1D.LIZIZ(LIZ));
            AnonymousClass840 LJIJI = LFH.LIZIZ.LIZLLL().LJIILLIIL().LJIJI();
            int i3 = LLILLL;
            int LJ = LJIJI.LJ(((LJIIIIZZ - width) / 2) + i3);
            if (!C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
                InteractStickerStruct interactStickerStruct = this.LJLJLLL;
                if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && captionStruct.getLocation() == EnumC1551166x.LEFT_TOP.getValue()) {
                    i2 = 48;
                } else {
                    i2 = 80;
                }
                FrameLayout frameLayout = this.LLII;
                if (frameLayout != null) {
                    layoutParams3 = frameLayout.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams4.gravity = i2 | 8388611;
                    layoutParams4.setMarginStart(LJ);
                    layoutParams4.setMarginEnd((LLILZ - i3) + LJ);
                }
            }
            List<Utterance> utterances = LJIIL.getUtterances();
            if (utterances == null || utterances.isEmpty()) {
                this.LJLZ = 0;
                List<AutocaptionType> autoCaptions = LJIIL.getAutoCaptions();
                if (autoCaptions != null && (autocaptionType = (AutocaptionType) ORZ.LJLLLLLL(0, autoCaptions)) != null && (language = autocaptionType.getLanguage()) != null) {
                    this.LJLZ = 1;
                    LJJJJI(language);
                }
            } else {
                this.LJLZ = 2;
                List<Utterance> utterances2 = LJIIL.getUtterances();
                if (utterances2 != null) {
                    this.LL = new C69M(utterances2);
                }
            }
        }
        if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
            TuxTextView tuxTextView2 = this.LLIFFJFJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(52);
                tuxTextView2.setMaxWidth(C86652Xzc.LJLJLLL);
                tuxTextView2.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), C7MY.LIZIZ(4), C7MY.LIZIZ(24), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                tuxTextView2.setGravity(17);
            }
            FrameLayout frameLayout2 = this.LLII;
            if (frameLayout2 != null) {
                ViewGroup.LayoutParams layoutParams6 = frameLayout2.getLayoutParams();
                o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams6).gravity = 81;
                if (!C87026YDm.LIZIZ()) {
                    frameLayout2.setBackgroundResource(R.drawable.a3n);
                } else {
                    C7GV.LIZ(2, frameLayout2);
                }
                C26338AVi.LJI(frameLayout2, 0, 0, 0, AnonymousClass391.LIZJ(96), false, 16);
            }
        } else if (C53379KxD.LIZ()) {
            TuxTextView tuxTextView3 = this.LLIFFJFJJ;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(52);
                tuxTextView3.setPaddingRelative((int) KL2.LIZJ(tuxTextView3.getContext(), 6.0f), (int) KL2.LIZJ(tuxTextView3.getContext(), 4.0f), (int) KL2.LIZJ(tuxTextView3.getContext(), 4.0f), (int) KL2.LIZJ(tuxTextView3.getContext(), 4.0f));
            }
            if (!C87026YDm.LIZIZ()) {
                FrameLayout frameLayout3 = this.LLIIIILZ;
                if (frameLayout3 != null) {
                    frameLayout3.setBackgroundResource(R.drawable.ai9);
                }
                TuxTextView tuxTextView4 = this.LLIFFJFJJ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setBackgroundResource(R.drawable.ai9);
                }
                TuxIconView tuxIconView2 = this.LLIIII;
                if (tuxIconView2 != null) {
                    tuxIconView2.setBackgroundResource(R.drawable.ai9);
                }
            } else {
                C7GV.LIZ(4, this.LLIIIILZ);
                C7GV.LIZ(4, this.LLIFFJFJJ);
                C7GV.LIZ(4, this.LLIIII);
            }
            TuxIconView tuxIconView3 = this.LLIIII;
            if (tuxIconView3 != null) {
                layoutParams5 = tuxIconView3.getLayoutParams();
            }
            if (layoutParams5 != null) {
                layoutParams5.width = (int) KL2.LIZJ(this.LJLILLLLZI, 28.0f);
            }
            TuxIconView tuxIconView4 = this.LLIIII;
            if (tuxIconView4 != null && (layoutParams2 = tuxIconView4.getLayoutParams()) != null) {
                layoutParams2.height = (int) KL2.LIZJ(this.LJLILLLLZI, 28.0f);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLIFFJFJJ;
            if (tuxTextView5 != null) {
                tuxTextView5.setTuxFont(52);
                tuxTextView5.setPaddingRelative((int) KL2.LIZJ(tuxTextView5.getContext(), 8.0f), (int) KL2.LIZJ(tuxTextView5.getContext(), 8.0f), (int) KL2.LIZJ(tuxTextView5.getContext(), 8.0f), (int) KL2.LIZJ(tuxTextView5.getContext(), 8.0f));
            }
            if (!C87026YDm.LIZIZ()) {
                FrameLayout frameLayout4 = this.LLIIIILZ;
                if (frameLayout4 != null) {
                    frameLayout4.setBackgroundResource(R.drawable.a3n);
                }
                TuxTextView tuxTextView6 = this.LLIFFJFJJ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setBackgroundResource(R.drawable.a3n);
                }
                TuxIconView tuxIconView5 = this.LLIIII;
                if (tuxIconView5 != null) {
                    tuxIconView5.setBackgroundResource(R.drawable.a3n);
                }
            } else {
                C7GV.LIZ(2, this.LLIIIILZ);
                C7GV.LIZ(2, this.LLIFFJFJJ);
                C7GV.LIZ(2, this.LLIIII);
            }
            TuxIconView tuxIconView6 = this.LLIIII;
            if (tuxIconView6 != null) {
                layoutParams5 = tuxIconView6.getLayoutParams();
            }
            if (layoutParams5 != null) {
                layoutParams5.width = (int) KL2.LIZJ(this.LJLILLLLZI, 32.0f);
            }
            TuxIconView tuxIconView7 = this.LLIIII;
            if (tuxIconView7 != null && (layoutParams = tuxIconView7.getLayoutParams()) != null) {
                layoutParams.height = (int) KL2.LIZJ(this.LJLILLLLZI, 32.0f);
            }
        }
        LJJJJIZL();
        if (C8LG.LIZ()) {
            TuxTextView tuxTextView7 = this.LLIFFJFJJ;
            if (tuxTextView7 != null) {
                tuxTextView7.setBackgroundColor(-16711681);
            }
            FrameLayout frameLayout5 = this.LLII;
            if (frameLayout5 != null) {
                frameLayout5.setBackgroundColor(-16711681);
            }
            TuxIconView tuxIconView8 = this.LLIIII;
            if (tuxIconView8 != null) {
                tuxIconView8.setBackgroundColor(-16711681);
            }
            FrameLayout frameLayout6 = this.LLIIIILZ;
            if (frameLayout6 != null) {
                frameLayout6.setBackgroundColor(-16711681);
            }
        }
        return LLLLIILL;
    }

    @Override // X.AbstractC224038ql, X.Y1E
    public final void LIZLLL(InteractStickerStruct interactStickerStruct) {
        this.LJLJLLL = interactStickerStruct;
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void LJIIIIZZ(int i) {
        super.LJIIIIZZ(i);
        LJJJ();
        EventBus.LIZJ().LJIJ(this);
        ValueAnimator valueAnimator = this.LJLLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    public final void LJJ(boolean z) {
        TuxTextView tuxTextView;
        String str;
        TuxTextView tuxTextView2;
        CaptionStruct captionStruct;
        TuxTextView tuxTextView3;
        CaptionStruct captionStruct2;
        TuxTextView tuxTextView4;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        ofInt.setDuration(200L);
        this.LJLLLL = ofInt;
        if (!C90193gN.LIZ() && (tuxTextView4 = this.LLIFFJFJJ) != null) {
            tuxTextView4.setPivotX(0.0f);
        }
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct2 = interactStickerStruct.getCaptionStruct()) != null && captionStruct2.getLocation() == EnumC1551166x.LEFT_BOTTOM.getValue()) {
            TuxTextView tuxTextView5 = this.LLIFFJFJJ;
            if (tuxTextView5 != null) {
                tuxTextView5.setPivotY(tuxTextView5.getHeight());
            }
        } else {
            TuxTextView tuxTextView6 = this.LLIFFJFJJ;
            if (tuxTextView6 != null) {
                tuxTextView6.setPivotY(0.0f);
            }
        }
        if (z) {
            this.LJLLLLLL = 3;
            TuxTextView tuxTextView7 = this.LLIFFJFJJ;
            if (tuxTextView7 != null) {
                tuxTextView7.setScaleX(1.0f);
            }
            TuxTextView tuxTextView8 = this.LLIFFJFJJ;
            if (tuxTextView8 != null) {
                tuxTextView8.setScaleY(1.0f);
            }
            C69M c69m = this.LL;
            if (c69m != null) {
                str = c69m.LIZ(this.LLD);
            } else {
                str = null;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            C76732zl c76732zl = new C76732zl();
            int i = LLILZIL;
            c76732zl.element = i;
            C76732zl c76732zl2 = new C76732zl();
            c76732zl2.element = LLILZLL;
            if (isEmpty) {
                TuxTextView tuxTextView9 = this.LLIFFJFJJ;
                if (tuxTextView9 != null) {
                    tuxTextView9.setAlpha(1.0f);
                }
                TuxTextView tuxTextView10 = this.LLIFFJFJJ;
                if (tuxTextView10 != null) {
                    tuxTextView10.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView11 = this.LLIFFJFJJ;
                if (tuxTextView11 != null) {
                    tuxTextView11.setVisibility(0);
                }
                TuxTextView tuxTextView12 = this.LLIFFJFJJ;
                if (tuxTextView12 != null) {
                    tuxTextView12.setAlpha(0.0f);
                }
                TuxTextView tuxTextView13 = this.LLIFFJFJJ;
                if (tuxTextView13 != null) {
                    tuxTextView13.setText(str);
                }
                TuxTextView tuxTextView14 = this.LLIFFJFJJ;
                if (tuxTextView14 != null) {
                    tuxTextView14.measure(View.MeasureSpec.makeMeasureSpec(i, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                TuxTextView tuxTextView15 = this.LLIFFJFJJ;
                o.LJI(tuxTextView15);
                c76732zl.element = tuxTextView15.getMeasuredWidth();
                TuxTextView tuxTextView16 = this.LLIFFJFJJ;
                o.LJI(tuxTextView16);
                c76732zl2.element = tuxTextView16.getMeasuredHeight();
                InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
                if (interactStickerStruct2 != null && (captionStruct = interactStickerStruct2.getCaptionStruct()) != null && captionStruct.getLocation() == EnumC1551166x.LEFT_BOTTOM.getValue() && (tuxTextView3 = this.LLIFFJFJJ) != null) {
                    tuxTextView3.setPivotY(c76732zl2.element);
                }
                if (C90193gN.LIZ() && (tuxTextView2 = this.LLIFFJFJJ) != null) {
                    tuxTextView2.setPivotX(c76732zl.element);
                }
            }
            ofInt.addUpdateListener(new AUListenerS15S0310000_15(this, isEmpty, c76732zl, c76732zl2, 0));
            ofInt.addListener(new ALAdapterS12S0100000_15(this, 5));
        } else {
            this.LJLLLLLL = 1;
            TuxTextView tuxTextView17 = this.LLIFFJFJJ;
            o.LJI(tuxTextView17);
            int width = tuxTextView17.getWidth();
            TuxTextView tuxTextView18 = this.LLIFFJFJJ;
            o.LJI(tuxTextView18);
            int height = tuxTextView18.getHeight();
            if (C90193gN.LIZ() && (tuxTextView = this.LLIFFJFJJ) != null) {
                tuxTextView.setPivotX(width);
            }
            TuxIconView tuxIconView = this.LLIIII;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            TuxIconView tuxIconView2 = this.LLIIII;
            if (tuxIconView2 != null) {
                tuxIconView2.setAlpha(0.0f);
            }
            ofInt.addUpdateListener(new AUListenerS10S0102000_15(this, width, height, 0));
            ofInt.addListener(new ALAdapterS12S0100000_15(this, 6));
        }
        ofInt.start();
    }

    public final void LJJIIJZLJL(Exception exc) {
        String str;
        CaptionStruct captionStruct;
        this.LJLZ = 3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedCaptionView download captions failed aid ");
        Aweme aweme = this.LJLLI;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" lang ");
        LIZ.append(this.LJZL);
        LIZ.append(" url ");
        LIZ.append(this.LJZI);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        H7B.LIZLLL(exc);
        C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
        c26045AKb.LJIIIIZZ(R.string.chj);
        c26045AKb.LJIIJ();
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null) {
            str2 = captionStruct.getSelectLang();
        }
        this.LJZL = str2;
        LJJJ();
    }

    public final void LJJIJIIJI(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        CaptionStruct captionStruct;
        CaptionStruct captionStruct2;
        List<Utterance> list;
        long LIZ = C78496UrM.LIZ(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FeedCaptionView load caption aid ");
        Aweme aweme = this.LJLLI;
        Object obj = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append(" lang ");
        LIZ2.append(this.LJZL);
        LIZ2.append(" downloadId ");
        LIZ2.append(this.LJZ);
        LIZ2.append(" url ");
        YE1.LIZLLL(LIZ2, this.LJZI, " file ", str, " fileSize ");
        LIZ2.append(LIZ);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        String str7 = "";
        if (str != null) {
            C37247Ejb.LIZIZ.getClass();
            if (C37246Eja.LJFF(str)) {
                try {
                    InteractStickerStruct interactStickerStruct = this.LJLJLLL;
                    if (interactStickerStruct != null && (captionStruct2 = interactStickerStruct.getCaptionStruct()) != null) {
                        CaptionStruct captionStruct3 = (CaptionStruct) new Gson().LJ(new FileReader(str), CaptionStruct.class);
                        if (captionStruct3 != null) {
                            list = captionStruct3.getUtterances();
                        } else {
                            list = null;
                        }
                        captionStruct2.setUtterances(list);
                    }
                    if (this.LLFII) {
                        LJJJJ();
                    }
                    Aweme aweme2 = this.LJLLI;
                    if (aweme2 == null || (str6 = aweme2.getAid()) == null) {
                        str6 = "";
                    }
                    String str8 = this.LJZI;
                    if (str8 != null) {
                        str7 = str8;
                    }
                    LJJIJLIJ(this, 0, str6, str7, LIZ, null, null, 48);
                    this.LJLZ = 2;
                    InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
                    if (interactStickerStruct2 != null && (captionStruct = interactStickerStruct2.getCaptionStruct()) != null) {
                        captionStruct.setSelectLang(this.LJZL);
                    }
                    LJJJ();
                    LJJIJ();
                    if (this.LJLLL == 1) {
                        this.LLIIIJ = this.LLIIIILZ;
                        LJJ(true);
                        this.LJLLL = 0;
                        return;
                    }
                    return;
                } catch (Exception e) {
                    if ((e instanceof k) || (e instanceof s)) {
                        if (this.LLFFF < 3) {
                            String str9 = this.LJZI;
                            if (str9 != null) {
                                str7 = str9;
                            }
                            LJJJ();
                            H7B.LJFF("FeedCaptionView retry downloading captions because parse failed");
                            C10K.LIZJ(new ACallableS2S2101000_7(1, this, str7, this.LJZL, 1));
                            this.LLFFF++;
                            return;
                        }
                        try {
                            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                            File file = new File(str);
                            c37246Eja.getClass();
                            try {
                                obj = C36871EdX.LIZJ(new FileInputStream(file));
                            } catch (FileNotFoundException unused) {
                            }
                            C3C5.m7constructorimpl(obj);
                        } catch (Throwable th) {
                            obj = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(obj);
                        }
                        if (C3C5.m12isFailureimpl(obj)) {
                            obj = "";
                        }
                        String str10 = (String) obj;
                        if (str10 == null) {
                            str10 = "";
                        }
                        Aweme aweme3 = this.LJLLI;
                        if (aweme3 == null || (str5 = aweme3.getAid()) == null) {
                            str5 = "";
                        }
                        String str11 = this.LJZI;
                        if (str11 == null) {
                            str11 = "";
                        }
                        LJJIJLIJ(this, 2, str5, str11, LIZ, str10, null, 32);
                        LJJIL(str, this.LJZI, e);
                        return;
                    }
                    Aweme aweme4 = this.LJLLI;
                    if (aweme4 == null || (str4 = aweme4.getAid()) == null) {
                        str4 = "";
                    }
                    String str12 = this.LJZI;
                    if (str12 != null) {
                        str7 = str12;
                    }
                    LJJIJLIJ(this, 4, str4, str7, LIZ, null, null, 48);
                    LJJIIJZLJL(e);
                    return;
                }
            }
        }
        C78983UzD.LJIILL("caption file not exists");
        Aweme aweme5 = this.LJLLI;
        if (aweme5 == null || (str3 = aweme5.getAid()) == null) {
            str3 = "";
        }
        String str13 = this.LJZI;
        if (str13 != null) {
            str7 = str13;
        }
        LJJIJLIJ(this, 3, str3, str7, LIZ, null, null, 48);
    }

    public final void LJJIJL(EnumC86777Y3x enterMethod) {
        C86650Xza LJJIIJ = LJJIIJ();
        int LJJJIL = C79004UzY.LJJJIL(this.LJLILLLLZI, this.LJLLI);
        LJJIIJ.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        LJJIIJ.LJII(c188727au);
        LJJIIJ.LJIIJJI(c188727au);
        LJJIIJ.LJIIIZ(c188727au);
        LJJIIJ.LJIIJ(c188727au);
        C86669Xzt.LIZ(c188727au, enterMethod);
        c188727au.LIZLLL(0, "use_transl");
        c188727au.LIZLLL(0, "have_transl");
        LJJIIJ.LIZLLL(c188727au);
        c188727au.LIZLLL(LJJJIL, "is_landscape_screen");
        C86669Xzt.LJFF(c188727au);
        LJJIIJ.LJIIIIZZ(c188727au);
        c188727au.LIZLLL(0, "use_transl");
        FMX.LJIIL("hide_subtitle", c188727au.LIZ);
    }

    public final void LJJJJI(String str) {
        String str2;
        CaptionStruct captionStruct;
        String LJJIII;
        CaptionStruct captionStruct2;
        CaptionStruct captionStruct3;
        StringBuilder LIZIZ = C25620zW.LIZIZ("FeedCaptionView switchCaptionLang trySelectLang ", str, " toSelectLang ");
        LIZIZ.append(this.LJZL);
        LIZIZ.append(" aweme curSelectLang ");
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct3 = interactStickerStruct.getCaptionStruct()) != null) {
            str2 = captionStruct3.getSelectLang();
        } else {
            str2 = null;
        }
        LIZIZ.append(str2);
        H7B.LJ(X1D.LIZIZ(LIZIZ));
        if (str.length() == 0) {
            H7B.LJ("FeedCaptionView selectLang has not initialized");
            return;
        }
        if (o.LJ(str, this.LJZL)) {
            return;
        }
        if (C52263KfD.LIZ()) {
            if (LJJIII(this.LJLJLLL, str) != null) {
                String LJJIII2 = LJJIII(this.LJLJLLL, str);
                if (LJJIII2 != null && LJJIII2.length() == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.LJZL = str;
        this.LLFFF = 0;
        LJJJ();
        TuxTextView tuxTextView = this.LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        if (interactStickerStruct2 != null) {
            captionStruct = interactStickerStruct2.getCaptionStruct();
        } else {
            captionStruct = null;
        }
        if (captionStruct != null) {
            captionStruct.setSelectLang("null");
        }
        InteractStickerStruct interactStickerStruct3 = this.LJLJLLL;
        if (interactStickerStruct3 != null && (captionStruct2 = interactStickerStruct3.getCaptionStruct()) != null) {
            captionStruct2.setUtterances(null);
        }
        this.LL = null;
        if (o.LJ("null", str) || (LJJIII = LJJIII(this.LJLJLLL, this.LJZL)) == null || LJJIII.length() == 0) {
            return;
        }
        if (ujb.o.LJJJLIIL(LJJIII, "http", false)) {
            C10K.LIZJ(new ACallableS2S2101000_7(3, this, LJJIII, this.LJZL, 1));
        } else {
            LJJIJIIJI(LJJIII);
        }
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
        Aweme aweme;
        o.LJIIIZ(clazz, "clazz");
        if (!o.LJ(clazz, C86657Xzh.class) || (aweme = this.LJLLI) == null || C86670Xzu.LJII(aweme) == null || C86670Xzu.LJIJJLI(aweme) || C86670Xzu.LJIL(aweme)) {
            return false;
        }
        return true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAlwaysShowCaptionEvent(C86646XzW event) {
        String str;
        o.LJIIIZ(event, "event");
        if (o.LJ(this, event.LJLILLLLZI)) {
            return;
        }
        if (event.LJLIL) {
            if (this.LJLLLLLL == 2) {
                return;
            }
        } else {
            int i = this.LJLLLLLL;
            if (i == 0 || i == 4) {
                return;
            }
        }
        LJJJJIZL();
        if (this.LJLLLLLL == 2) {
            Aweme aweme = this.LJLLI;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            OB2.LIZ(str);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAutoGeneratedCaptionTempEvent(ACR event) {
        o.LJIIIZ(event, "event");
        LJJJJIZL();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAutogeneratedCaptionToggleEvent(C86645XzV event) {
        String aid;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme ");
        String str = event.LJLILLLLZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" trigger caption toggle from ");
        LIZ.append(event.LJLJI);
        LIZ.append("; isShown: ");
        LIZ.append(event.LJLIL);
        C36922EeM.LIZLLL(4, "ToggleCaption", X1D.LIZIZ(LIZ));
        if (C53379KxD.LIZ()) {
            String str3 = event.LJLILLLLZI;
            Aweme aweme2 = this.LJLLI;
            String str4 = null;
            if (aweme2 != null) {
                str4 = aweme2.getAid();
            }
            if (o.LJ(str3, str4) && (aweme = this.LJLLI) != null && C86670Xzu.LJII(aweme) != null) {
                EnumC86777Y3x enumC86777Y3x = event.LJLJI;
                ICaptionKevaService LJJIFFI = LJJIFFI();
                if (LJJIFFI != null) {
                    if (LJJIFFI.LJJI()) {
                        if (enumC86777Y3x == EnumC86777Y3x.SHARE_PANEL) {
                            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                            c26045AKb.LJIIIIZZ(R.string.gii);
                            c26045AKb.LJIIJ();
                        } else {
                            C26045AKb c26045AKb2 = new C26045AKb(this.LJLJI);
                            c26045AKb2.LJIIIIZZ(R.string.gig);
                            c26045AKb2.LJIIJ();
                        }
                    } else if (enumC86777Y3x == EnumC86777Y3x.SHARE_PANEL) {
                        C26045AKb c26045AKb3 = new C26045AKb(this.LJLJI);
                        c26045AKb3.LJIIIIZZ(R.string.gih);
                        c26045AKb3.LJIIJ();
                    } else {
                        C26045AKb c26045AKb4 = new C26045AKb(this.LJLJI);
                        c26045AKb4.LJIIIIZZ(R.string.gie);
                        c26045AKb4.LJIIJ();
                    }
                }
                if (event.LJLJJI) {
                    if (event.LJLIL) {
                        LJJIJIL(event.LJLJI, false);
                    } else {
                        LJJIJL(event.LJLJI);
                    }
                }
                if (z0()) {
                    LJJI();
                }
            }
            LJJJJIZL();
            if (this.LJLLLLLL == 2) {
                Aweme aweme3 = this.LJLLI;
                if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                    str2 = aid;
                }
                OB2.LIZ(str2);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCaptionHiddenStateEvent(C86647XzX event) {
        String str;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            if (this.LJLLLLLL == 2) {
                return;
            }
        } else {
            int i = this.LJLLLLLL;
            if (i == 0 || i == 4) {
                return;
            }
        }
        LJJJJIZL();
        if (this.LJLLLLLL == 2) {
            Aweme aweme = this.LJLLI;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            OB2.LIZ(str);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDetailVideoCleanModeChange(C55323LnT event) {
        o.LJIIIZ(event, "event");
        if (!C91L.LIZ()) {
            return;
        }
        if (event.LJLIL) {
            FrameLayout frameLayout = this.LLII;
            if (frameLayout == null) {
                return;
            }
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout2 = this.LLII;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.setVisibility(0);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFullVideoCleanModeChange(C55048Lj2 event) {
        o.LJIIIZ(event, "event");
        if (C91L.LIZ() && event.LJLJI == 1) {
            if (event.LJLIL) {
                FrameLayout frameLayout = this.LLII;
                if (frameLayout == null) {
                    return;
                }
                frameLayout.setVisibility(8);
                return;
            }
            FrameLayout frameLayout2 = this.LLII;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setVisibility(0);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onVideoPositionChangeEvent(C46262IDq event) {
        String str;
        String str2;
        int i;
        int i2;
        o.LJIIIZ(event, "event");
        Aweme aweme = this.LJLLI;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = event.LJLIL;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        Long l = event.LJLILLLLZI;
        if (l != null) {
            i = (int) l.longValue();
        } else {
            i = 0;
        }
        this.LLD = i;
        if (this.LJLLLLLL == 2) {
            InterfaceC82683Wch interfaceC82683Wch = this.LLF;
            if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
                return;
            }
            C69M c69m = this.LL;
            if (c69m != null) {
                Long l2 = event.LJLILLLLZI;
                if (l2 != null) {
                    i2 = (int) l2.longValue();
                } else {
                    i2 = 0;
                }
                str3 = c69m.LIZ(i2);
            }
            if (TextUtils.isEmpty(str3)) {
                TuxTextView tuxTextView = this.LLIFFJFJJ;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setVisibility(8);
                return;
            }
            TuxTextView tuxTextView2 = this.LLIFFJFJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            TuxTextView tuxTextView3 = this.LLIFFJFJJ;
            if (tuxTextView3 == null) {
                return;
            }
            tuxTextView3.setText(str3);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedCaptionView
    public final void p0(boolean z) {
        int i;
        FrameLayout frameLayout = this.LLII;
        if (frameLayout == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    public static String LJJIII(InteractStickerStruct interactStickerStruct, String str) {
        CaptionStruct captionStruct;
        List<String> urlList;
        String str2;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null) {
            List<AutocaptionType> autoCaptions = captionStruct.getAutoCaptions();
            if (autoCaptions == null) {
                autoCaptions = C61878OQg.INSTANCE;
            }
            for (AutocaptionType autocaptionType : autoCaptions) {
                if (o.LJ(autocaptionType.getLanguage(), str)) {
                    UrlModel url = autocaptionType.getUrl();
                    if (url == null || (urlList = url.getUrlList()) == null || (str2 = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
                        return "";
                    }
                    return str2;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.AbstractC224038ql, X.Y1E
    public final void LJI(int i, int i2) {
        int value;
        String str;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        Object obj;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        FrameLayout.LayoutParams layoutParams6;
        FrameLayout.LayoutParams layoutParams7;
        Object obj2;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9;
        FrameLayout.LayoutParams layoutParams10;
        FrameLayout.LayoutParams layoutParams11;
        FrameLayout.LayoutParams layoutParams12;
        CaptionStruct captionStruct;
        List<Utterance> utterances;
        Utterance utterance;
        CaptionStruct captionStruct2;
        if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
            FrameLayout frameLayout = this.LLII;
            if (frameLayout != null) {
                C26338AVi.LJI(frameLayout, 0, 0, 0, Integer.valueOf(i), false, 16);
                return;
            }
            return;
        }
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null && (captionStruct2 = interactStickerStruct.getCaptionStruct()) != null) {
            value = captionStruct2.getLocation();
        } else {
            value = EnumC1551166x.LEFT_BOTTOM.getValue();
        }
        Object parent = this.LJLJI.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = (View) parent;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("contentView parent height ");
        C15890jp.LIZIZ(LIZ, view.getLayoutParams().height, " rootView height ", i2, " y ");
        LIZ.append(i);
        LIZ.append(" utterance ");
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        ViewGroup.LayoutParams layoutParams13 = null;
        if (interactStickerStruct2 != null && (captionStruct = interactStickerStruct2.getCaptionStruct()) != null && (utterances = captionStruct.getUtterances()) != null && (utterance = (Utterance) ORZ.LJLLLLLL(0, utterances)) != null) {
            str = utterance.getText();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        FrameLayout frameLayout2 = this.LLII;
        if (frameLayout2 != null) {
            layoutParams = frameLayout2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) == null) {
            return;
        }
        if (value == EnumC1551166x.LEFT_BOTTOM.getValue()) {
            Object parent2 = this.LJLJI.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup.LayoutParams layoutParams14 = ((View) parent2).getLayoutParams();
            ViewParent parent3 = this.LJLJI.getParent();
            if (parent3 != null) {
                obj2 = parent3.getParent();
            } else {
                obj2 = null;
            }
            o.LJII(obj2, "null cannot be cast to non-null type android.view.ViewGroup");
            layoutParams14.height = ((View) obj2).getHeight();
            layoutParams2.gravity = 8388691;
            TuxTextView tuxTextView = this.LLIFFJFJJ;
            if (tuxTextView != null) {
                layoutParams8 = tuxTextView.getLayoutParams();
            } else {
                layoutParams8 = null;
            }
            if ((layoutParams8 instanceof FrameLayout.LayoutParams) && (layoutParams12 = (FrameLayout.LayoutParams) layoutParams8) != null) {
                layoutParams12.gravity = 8388691;
            }
            TuxIconView tuxIconView = this.LLIIII;
            if (tuxIconView != null) {
                layoutParams9 = tuxIconView.getLayoutParams();
            } else {
                layoutParams9 = null;
            }
            if ((layoutParams9 instanceof FrameLayout.LayoutParams) && (layoutParams11 = (FrameLayout.LayoutParams) layoutParams9) != null) {
                layoutParams11.gravity = 8388691;
            }
            if (C52280KfU.LIZ()) {
                LinearLayout linearLayout = this.LLIIIL;
                if (linearLayout != null) {
                    layoutParams13 = linearLayout.getLayoutParams();
                }
                if ((layoutParams13 instanceof FrameLayout.LayoutParams) && (layoutParams10 = (FrameLayout.LayoutParams) layoutParams13) != null) {
                    layoutParams10.gravity = 8388691;
                }
            }
            layoutParams2.bottomMargin = (((view.getLayoutParams().height + i2) / 2) - i) + LLILLIZIL;
            layoutParams2.topMargin = 0;
            FrameLayout frameLayout3 = this.LLII;
            if (frameLayout3 != null) {
                frameLayout3.setLayoutParams(layoutParams2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("FeedCaptionView caption location: start_bottom bottomMargin: ");
            LIZ2.append(layoutParams2.bottomMargin);
            H7B.LJ(X1D.LIZIZ(LIZ2));
            return;
        }
        if (value != EnumC1551166x.LEFT_TOP.getValue()) {
            return;
        }
        Object parent4 = this.LJLJI.getParent();
        o.LJII(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup.LayoutParams layoutParams15 = ((View) parent4).getLayoutParams();
        ViewParent parent5 = this.LJLJI.getParent();
        if (parent5 != null) {
            obj = parent5.getParent();
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        layoutParams15.height = ((View) obj).getHeight();
        layoutParams2.gravity = 8388659;
        TuxTextView tuxTextView2 = this.LLIFFJFJJ;
        if (tuxTextView2 != null) {
            layoutParams3 = tuxTextView2.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams7 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            layoutParams7.gravity = 8388659;
        }
        TuxIconView tuxIconView2 = this.LLIIII;
        if (tuxIconView2 != null) {
            layoutParams4 = tuxIconView2.getLayoutParams();
        } else {
            layoutParams4 = null;
        }
        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams6 = (FrameLayout.LayoutParams) layoutParams4) != null) {
            layoutParams6.gravity = 8388659;
        }
        if (C52280KfU.LIZ()) {
            LinearLayout linearLayout2 = this.LLIIIL;
            if (linearLayout2 != null) {
                layoutParams13 = linearLayout2.getLayoutParams();
            }
            if ((layoutParams13 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams13) != null) {
                layoutParams5.gravity = 8388659;
            }
        }
        layoutParams2.topMargin = ((view.getLayoutParams().height - i2) / 2) + LLILLJJLI;
        FrameLayout frameLayout4 = this.LLII;
        if (frameLayout4 != null) {
            frameLayout4.setLayoutParams(layoutParams2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("FeedCaptionView caption location: start_top topMargin: ");
        LIZ3.append(layoutParams2.topMargin);
        H7B.LJ(X1D.LIZIZ(LIZ3));
    }

    @Override // X.AbstractC224038ql
    public final boolean LJIJJLI(float f, float f2) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        boolean z;
        int LIZJ;
        CaptionStruct captionStruct;
        CaptionStruct captionStruct2;
        C2U8.LIZ(new C223728qG(hashCode()));
        if ((!LJJJIL() || !C53379KxD.LIZ()) && this.LLIFFJFJJ != null) {
            if (this.LLF == null) {
                InteractStickerStruct interactStickerStruct = this.LJLJLLL;
                if (interactStickerStruct != null && (captionStruct2 = interactStickerStruct.getCaptionStruct()) != null && captionStruct2.getLocation() == EnumC1551166x.LEFT_BOTTOM.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LIZJ = -((int) KL2.LIZJ(this.LJLILLLLZI, 8.0f));
                } else {
                    LIZJ = (int) KL2.LIZJ(this.LJLILLLLZI, 8.0f);
                }
                C6DJ c6dj = new C6DJ(this.LJLILLLLZI);
                TuxTextView tuxTextView = this.LLIFFJFJJ;
                o.LJI(tuxTextView);
                c6dj.LIZ.LIZIZ = tuxTextView;
                c6dj.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, this.LJLILLLLZI));
                C82682Wcg c82682Wcg = c6dj.LIZ;
                c82682Wcg.LJII = -1001L;
                c82682Wcg.LJIIJ = 0L;
                c6dj.LJIIJJI(new AqS181S0100000_15(this, 253));
                C82682Wcg c82682Wcg2 = c6dj.LIZ;
                c82682Wcg2.LJFF = LIZJ;
                c82682Wcg2.LJIJJLI = false;
                c82682Wcg2.LJIIIIZZ = LLILLL;
                InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
                if (interactStickerStruct2 != null && (captionStruct = interactStickerStruct2.getCaptionStruct()) != null && captionStruct.getLocation() == EnumC1551166x.LEFT_BOTTOM.getValue()) {
                    c6dj.LJI(WHL.TOP);
                } else {
                    c6dj.LJI(WHL.BOTTOM);
                }
                this.LLF = c6dj.LIZJ();
            }
            if (L2D.LIZ() && (interfaceC55235Lm3 = this.LJLLILLLL) != null) {
                Y2G.LIZIZ(interfaceC55235Lm3, SeeTranslationShowEvent.class, C47261Igj.LJJIJ(new C2Y1(1)), true);
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LLF;
            o.LJI(interfaceC82683Wch);
            interfaceC82683Wch.show();
            LJJIIJ().LJIIL(EnumC86777Y3x.CLICK_SUBTITLE);
        }
        return true;
    }

    public final void LJJIJIL(EnumC86777Y3x enterMethod, boolean z) {
        C86650Xza LJJIIJ = LJJIIJ();
        int LJJJIL = C79004UzY.LJJJIL(this.LJLILLLLZI, this.LJLLI);
        double d = this.LLIIL;
        LJJIIJ.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        LJJIIJ.LJII(c188727au);
        C86669Xzt.LIZ(c188727au, enterMethod);
        c188727au.LIZLLL(0, "use_transl");
        LJJIIJ.LJIIJJI(c188727au);
        c188727au.LIZLLL(0, "have_transl");
        LJJIIJ.LJIIIZ(c188727au);
        LJJIIJ.LJIIJ(c188727au);
        LJJIIJ.LIZLLL(c188727au);
        c188727au.LIZLLL(LJJJIL, "is_landscape_screen");
        C86669Xzt.LJFF(c188727au);
        LJJIIJ.LJIIIIZZ(c188727au);
        c188727au.LIZLLL(0, "use_transl");
        if (z) {
            c188727au.LIZLLL(1, "is_captions_intro_show");
            c188727au.LIZJ("launch_volume_pct", d);
        }
        FMX.LJIIL("expand_subtitle", c188727au.LIZ);
    }

    public final void LJJIL(String str, String str2, Exception exc) {
        if (str2 == null || str == null) {
            LJJIIJZLJL(exc);
        } else {
            AbstractC73638SvC.LJIILLIIL(new ACallableS4S2000000_6(str, str2, 0)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0200000_7(this, exc, 2), C42374Gk6.LJLIL);
        }
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        InterfaceC82683Wch interfaceC82683Wch = this.LLF;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            return true;
        }
        FrameLayout frameLayout = this.LLII;
        if (frameLayout == null || frameLayout.getX() > f || frameLayout.getX() + frameLayout.getWidth() < f || frameLayout.getY() > f2 || frameLayout.getY() + frameLayout.getHeight() < f2) {
            return false;
        }
        return true;
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        boolean z;
        boolean z2;
        AutocaptionType LJII;
        String language;
        String str;
        ActivityC45651qj activityC45651qj;
        String str2;
        C223778qL c223778qL;
        String str3;
        C223778qL c223778qL2;
        o.LJIIIZ(popListener, "popListener");
        H7B.LJ("FeedCaptionView click captionview");
        if (!LJIIJJI(j, f, f2, i)) {
            return false;
        }
        int i2 = this.LJLLLLLL;
        String str4 = null;
        if (i2 == 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedCaptionView click caption isFirst: ");
            Keva keva = C53280Kvc.LIZ;
            LIZ.append(!keva.getBoolean("has_tap_feed_caption", false));
            H7B.LJ(X1D.LIZIZ(LIZ));
            boolean z3 = C25840ACe.LIZ;
            boolean LIZJ = ACW.LIZJ();
            Aweme aweme = this.LJLLI;
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            boolean LJ = o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId());
            boolean LJJIJIIJI = C79004UzY.LJJIJIIJI(this.LJLILLLLZI);
            boolean isEnable = TTLingoGeckoLowStorageConfig.isEnable();
            C25845ACj.LIZ(LJJIIJ().LIZLLL, LJJIIJ().LIZ, LJJIJIIJI, LJ, LIZJ, false, z3, isEnable);
            if (z3 && isEnable && LIZJ && !LJ && !LJJIJIIJI) {
                C25845ACj.LIZ(LJJIIJ().LIZLLL, LJJIIJ().LIZ, false, false, LIZJ, true, z3, isEnable);
                Aweme aweme2 = this.LJLLI;
                if (aweme2 != null) {
                    str3 = aweme2.getAid();
                } else {
                    str3 = null;
                }
                C245649kW c245649kW = this.LJLJJI;
                if (c245649kW != null && (c223778qL2 = c245649kW.LJIIZILJ) != null) {
                    str4 = c223778qL2.LIZ;
                }
                C2U8.LIZ(new Y1A(str3, str4, EnumC86777Y3x.CLICK_SUBTITLE, System.identityHashCode(C45804HyK.LJIJJ(this.LJLILLLLZI)), new AqS181S0100000_15(this, 252)));
                LJJIJIIJIL();
            } else if (C41032G8m.LIZ()) {
                if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
                    return false;
                }
                Aweme aweme3 = this.LJLLI;
                if (aweme3 != null) {
                    str2 = aweme3.getAid();
                } else {
                    str2 = null;
                }
                C245649kW c245649kW2 = this.LJLJJI;
                if (c245649kW2 != null && (c223778qL = c245649kW2.LJIIZILJ) != null) {
                    str4 = c223778qL.LIZ;
                }
                C2U8.LIZ(new Y1A(str2, str4, EnumC86777Y3x.CLICK_SUBTITLE, System.identityHashCode(C45804HyK.LJIJJ(this.LJLILLLLZI)), null));
                LJJIJIIJIL();
            } else if (!keva.getBoolean("has_tap_feed_caption", false) && !C53379KxD.LIZ()) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
                    keva.storeBoolean("has_tap_feed_caption", true);
                    LBP lbp = new LBP(this.LJLILLLLZI);
                    TuxSheet tuxSheet = new ASL().LIZ;
                    tuxSheet.LJLLI = lbp;
                    tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.9RG
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C2U8.LIZ(new C2IP(false, false));
                        }
                    };
                    C16880lQ.LJJIZ(lbp.getBtnDismiss(), new ACListenerS35S0100000_15(tuxSheet, 221));
                    C16880lQ.LJIILLIIL(lbp.getIvClose(), new ACListenerS35S0100000_15(tuxSheet, 222));
                    FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                    tuxSheet.show(supportFragmentManager, "feed_caption_intro");
                    C2U8.LIZ(new C2IP(true, false));
                }
                LJJIJIIJIL();
                C86650Xza LJJIIJ = LJJIIJ();
                LJJIIJ.getClass();
                C188727au c188727au = new C188727au();
                LJJIIJ.LJII(c188727au);
                c188727au.LIZLLL(0, "use_transl");
                c188727au.LIZLLL(0, "have_transl");
                LJJIIJ.LJIIJJI(c188727au);
                LJJIIJ.LJIIIZ(c188727au);
                FMX.LJIIL("subtitle_intro_show", c188727au.LIZ);
            } else {
                InterfaceC82683Wch interfaceC82683Wch = this.LLF;
                if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
                    LIZJ();
                } else {
                    LJIJJLI(f, f2);
                    LJJIJIIJIL();
                }
            }
        } else if (i2 == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("FeedCaptionView flPb isVisibility ");
            FrameLayout frameLayout = this.LLIIIILZ;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            LIZ2.append(z);
            LIZ2.append(" curDownloadStatus ");
            LIZ2.append(this.LJLZ);
            H7B.LJ(X1D.LIZIZ(LIZ2));
            FrameLayout frameLayout2 = this.LLIIIILZ;
            if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
                return true;
            }
            if (C53379KxD.LIZ()) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                c26045AKb.LJIIIIZZ(R.string.gig);
                c26045AKb.LJIIJ();
            }
            if (z0()) {
                LJJIFFI().LJIILL(true);
                LJJI();
                z2 = true;
            } else {
                z2 = false;
            }
            LJJIFFI().LJJIII(false);
            LJJIJIL(EnumC86777Y3x.CLICK_ICON, z2);
            C2U8.LIZ(new C86646XzW(true, this));
            int i3 = this.LJLZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    Aweme aweme4 = this.LJLLI;
                    if (aweme4 != null && (LJII = C86670Xzu.LJII(aweme4)) != null && (language = LJII.getLanguage()) != null) {
                        this.LJLLL = 1;
                        this.LJLZ = 1;
                        LJJJJI(language);
                        TuxIconView tuxIconView = this.LLIIII;
                        if (tuxIconView != null) {
                            tuxIconView.setVisibility(8);
                        }
                        FrameLayout frameLayout3 = this.LLIIIILZ;
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                        }
                        this.LLIIIJ = this.LLIIIILZ;
                    }
                } else {
                    this.LLIIIJ = this.LLIIII;
                    LJJ(true);
                }
            } else {
                this.LJLLL = 1;
                TuxIconView tuxIconView2 = this.LLIIII;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
                FrameLayout frameLayout4 = this.LLIIIILZ;
                if (frameLayout4 != null) {
                    frameLayout4.setVisibility(0);
                }
                this.LLIIIJ = this.LLIIIILZ;
            }
        } else if (i2 == 4 && z0()) {
            LJJIFFI().LJIILL(true);
            LJJI();
            LJJIFFI().LJIL(true);
            LJJIFFI().LJJIII(false);
            Aweme aweme5 = this.LJLLI;
            if (aweme5 != null) {
                str4 = aweme5.getAid();
            }
            C2U8.LIZ(new C86645XzV(true, str4, EnumC86777Y3x.CLICK_SUBTITLE, false));
            LJJIJIL(EnumC86777Y3x.CLICK_ICON, true);
        }
        return true;
    }

    public FeedCaptionView(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, Aweme aweme, InterfaceC55235Lm3 interfaceC55235Lm3) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = aweme;
        this.LJLLILLLL = interfaceC55235Lm3;
        this.LJLLJ = C221108m2.LIZIZ(new AqS154S0100000_4(c224048qm, 1144));
        this.LJLLLLLL = 2;
        this.LLFF = C221108m2.LIZIZ(AK6.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(new AqS104S0300000_15(this, c245649kW, context, 11));
        this.LLI = new IDDListenerS58S0100000_7(this, 5);
        this.LLIILZL = 1500L;
        this.LLIIZ = 3000L;
        this.LLIL = 0.3f;
        this.LLILII = C221108m2.LIZIZ(C86648XzY.LJLIL);
    }

    public static void LJJIJLIJ(FeedCaptionView feedCaptionView, int i, String str, String str2, long j, String str3, BaseException baseException, int i2) {
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            baseException = null;
        }
        feedCaptionView.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aweme_id", str);
        jSONObject.put("url", str2);
        jSONObject.put("file_size", j);
        if (i == 2) {
            jSONObject.put("content", str3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedCaptionView parse failed content:");
            LIZ.append(str3);
            H7B.LIZJ(X1D.LIZIZ(LIZ));
        }
        if (baseException != null) {
            jSONObject.put("error_code", baseException.getErrorCode());
            jSONObject.put("error_msg", baseException.getErrorMessage());
        }
        C09900aA.LJIIJJI("load_captions", i, jSONObject);
    }
}

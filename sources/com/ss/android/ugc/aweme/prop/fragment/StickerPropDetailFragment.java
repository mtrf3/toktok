package com.ss.android.ugc.aweme.prop.fragment;

import X.AJ9;
import X.AP9;
import X.AV1;
import X.ActivityC45651qj;
import X.C00F;
import X.C025908h;
import X.C09970aH;
import X.C0H1;
import X.C0RN;
import X.C107794Kx;
import X.C15280iq;
import X.C16880lQ;
import X.C1804676k;
import X.C188727au;
import X.C200757uJ;
import X.C2068389v;
import X.C208138Ev;
import X.C227768wm;
import X.C252569vg;
import X.C26045AKb;
import X.C28791BRr;
import X.C2U8;
import X.C36922EeM;
import X.C39061g6;
import X.C3A5;
import X.C43416H2e;
import X.C44384HbQ;
import X.C48841JEv;
import X.C4LD;
import X.C51544KKu;
import X.C51935KZv;
import X.C52228Kee;
import X.C53096Kse;
import X.C53378KxC;
import X.C56492MFc;
import X.C57349Mf3;
import X.C61200O0e;
import X.C62822Ol8;
import X.C62846OlW;
import X.C6ZT;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C74186T9q;
import X.C76P;
import X.C77123UOp;
import X.C78613UtF;
import X.C78764Uvg;
import X.C78765Uvh;
import X.C78983UzD;
import X.C7MY;
import X.C7U8;
import X.C80896Voy;
import X.C81705W4v;
import X.C84915XUh;
import X.C84942XVi;
import X.C86V;
import X.EF7;
import X.ES4;
import X.ESA;
import X.EnumC72807Shn;
import X.FMX;
import X.FRW;
import X.FWZ;
import X.HG3;
import X.HT5;
import X.InterfaceC65784Pro;
import X.InterfaceC74147T8d;
import X.InterfaceC74183T9n;
import X.J9P;
import X.KL2;
import X.MHD;
import X.MHZ;
import X.MIP;
import X.MIV;
import X.MIW;
import X.OM6;
import X.QD3;
import X.R3A;
import X.RBX;
import X.S3I;
import X.S3L;
import X.SY4;
import X.SY9;
import X.T54;
import X.T5P;
import X.T6F;
import X.T6X;
import X.T6Y;
import X.T9I;
import X.T9K;
import X.T9M;
import X.T9R;
import X.T9V;
import X.T9W;
import X.T9Z;
import X.TAE;
import X.V2B;
import X.W5F;
import X.W5G;
import X.W5I;
import X.W5U;
import X.X1D;
import X.XKX;
import X.XV2;
import X.Z9N;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS24S0201000_7;
import Y.ACListenerS29S0101000_12;
import Y.ACListenerS46S0200000_12;
import Y.AObjectS52S0101000_7;
import Y.AObjectS53S0101000_8;
import Y.AObjectS56S0101000_13;
import Y.AObserverS77S0100000_9;
import Y.IDAListenerS236S0100000_12;
import Y.IDgS351S0100000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceLockStickerService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.experiment.PropDetailTwoNetworkCallConcurrent;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.ProgressBarDialog;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.EffectAnchor;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.Au2S18S0100000_9;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import v82.IDdS500S0100000_1;
import v82.IDdS503S0100000_12;

/* loaded from: classes13.dex */
public class StickerPropDetailFragment extends AbstractDetailFragment implements MIW, MHZ {
    public static final int LLLLLIL = (int) KL2.LIZJ(EF7.LIZIZ(), 350.0f);
    public C1804676k LJLIL;
    public String LJLILLLLZI;
    public MIV LJLJI;
    public String LJLJJI;
    public NewFaceStickerListBean LJLJJL;
    public TuxSheet LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public ViewGroup LJLLI;
    public C62846OlW LJLLILLLL;
    public C62846OlW LJLLJ;
    public C62846OlW LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public TextView LJLZ;
    public View LJZ;
    public View LJZI;
    public C73305Spp LJZL;
    public ViewGroup LL;
    public RelativeLayout LLD;
    public ViewGroup LLF;
    public ViewStub LLFF;
    public ViewStub LLFFF;
    public View LLFII;
    public ImageView LLFZ;
    public ViewStub LLI;
    public View LLIFFJFJJ;
    public C62846OlW LLII;
    public View LLIIII;
    public RelativeLayout LLIIIILZ;
    public TuxTextView LLIIIJ;
    public TuxIconView LLIIIL;
    public GridView LLIIIZ;
    public View LLIIJI;
    public T5P LLIIJLIL;
    public TextView LLIIL;
    public ImageView LLIILII;
    public FrameLayout LLIILZL;
    public SmartImageView LLIIZ;
    public TuxTextView LLIL;
    public SY4 LLILII;
    public ImageView LLILIL;
    public NewFaceStickerBean LLILL;
    public View LLILLIZIL;
    public T5P LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public ViewGroup LLILZIL;
    public ViewStub LLILZLL;
    public ViewStub LLIZ;
    public ViewStub LLIZLLLIL;
    public ViewStub LLJ;
    public ViewStub LLJI;
    public ViewStub LLJIJIL;
    public ViewStub LLJILJIL;
    public C80896Voy LLJILJILJ;
    public ViewGroup LLJILLL;
    public LinearLayout LLJJ;
    public C62846OlW LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public T9I LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public C84942XVi LLJL;
    public NewFaceStickerBean LLJLIL;
    public Aweme LLJLILLLLZIIL;
    public String LLJLL;
    public int LLJLLIL;
    public Boolean LLJLLL;
    public UrlModel LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public EditEffectAnchorManager LLLFF;
    public Serializable LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public int LLLII;
    public int LLLIIII;
    public String LLLIIIIL;
    public boolean LLLIIIL;
    public final SafeHandler LLLIIL = new SafeHandler(this);
    public final IAVEffectService LLLIILIL;
    public C28791BRr LLLIL;
    public InterfaceC74147T8d LLLILZ;
    public MHD LLLILZJ;
    public List<String> LLLILZLLLI;
    public boolean LLLIZZ;
    public T9K LLLJ;
    public ProgressBarDialog LLLJIL;
    public String LLLJL;
    public String LLLL;
    public XV2 LLLLII;
    public final ICommerceLockStickerService LLLLIIIILLL;
    public T54 LLLLIIL;
    public RelativeLayout LLLLIILL;
    public final Au2S18S0100000_9 LLLLIILLL;
    public final AObserverS77S0100000_9 LLLLIL;
    public final AObserverS77S0100000_9 LLLLILI;
    public boolean LLLLJ;
    public long LLLLJI;
    public boolean LLLLL;

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void addDividerForTabs() {
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "prop_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.axd;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getTabViewResId() {
        return R.layout.at_;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initData() {
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final boolean mobStayTimeOnPause() {
        return false;
    }

    public final void Jl() {
        String str;
        if (this.LLJLIL == null) {
            return;
        }
        String str2 = "prop_page";
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(mo49getActivity(), "prop_page", "click_favorite_prop", null, new IDgS351S0100000_12(this, 6));
            return;
        }
        if (this.LLJLIL.isFavorite) {
            str = "cancel_favorite_prop";
        } else {
            str = "favourite_prop";
        }
        C188727au c188727au = new C188727au();
        EditEffectAnchorManager editEffectAnchorManager = this.LLLFF;
        if (editEffectAnchorManager != null && editEffectAnchorManager.isEditProp()) {
            str2 = "editing_prop_page";
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("prop_id", this.LLJLIL.id);
        c188727au.LJIIIZ("page_model", "detail");
        c188727au.LJIIIZ("last_group_id", C78983UzD.LJLJJI);
        FMX.LJIIL(str, c188727au.LIZ);
        MIV miv = this.LJLJI;
        ActivityC45651qj context = mo49getActivity();
        NewFaceStickerBean newFaceStickerBean = this.LLJLIL;
        miv.getClass();
        newFaceStickerBean.isFavorite = !newFaceStickerBean.isFavorite;
        IAVEffectService.EffectPlatformLoader effectPlatformLoader = miv.LJLJJI;
        MIW view = (MIW) miv.LJLILLLLZI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(effectPlatformLoader, "effectPlatformLoader");
        o.LJIIIZ(view, "view");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C57349Mf3(effectPlatformLoader, newFaceStickerBean, view, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        NewFaceStickerBean newFaceStickerBean = this.LLJLIL;
        if (newFaceStickerBean != null) {
            return newFaceStickerBean.id;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1BC, X.76k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.prop.fragment.StickerDetailAwemeListFramgent, com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment] */
    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1BC getFragmentPagerAdapter() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment.getFragmentPagerAdapter():X.1BC");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        NewFaceStickerBean newFaceStickerBean = this.LLJLIL;
        if (newFaceStickerBean == null) {
            str = "";
        } else {
            str = newFaceStickerBean.id;
        }
        this.mStartTime = -1L;
        super.onStop();
        mobStayTime();
        if (this.LLLLJI != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LLLLJI;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("prop_id", str);
            c188727au.LJIIIZ("enter_from", "prop_page");
            StringBuilder LIZ = X1D.LIZ();
            c188727au.LJIIIZ("duration", C0H1.LIZJ(LIZ, currentTimeMillis, "", LIZ));
            c188727au.LJIIIZ("group_id", this.LLL);
            c188727au.LJIIIZ("log_pb", this.LLJZIJLIL);
            FMX.LJIIL("stay_time", c188727au.LIZ);
            this.LLLLJI = -1L;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final boolean showTabLayout() {
        List<? extends NewFaceStickerBean> list;
        NewFaceStickerListBean newFaceStickerListBean = this.LJLJJL;
        if (newFaceStickerListBean == null || (list = newFaceStickerListBean.mStickers) == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    public StickerPropDetailFragment() {
        IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
        this.LLLIILIL = effectService;
        this.LLLIZZ = false;
        this.LLLJIL = null;
        this.LLLJL = "";
        this.LLLL = "";
        this.LLLLII = new XV2(effectService);
        this.LLLLIIIILLL = CommerceLockStickerServiceImpl.LIZJ();
        this.LLLLIIL = null;
        this.LLLLIILLL = new Au2S18S0100000_9(this, 2);
        this.LLLLIL = new AObserverS77S0100000_9(this, 42);
        this.LLLLILI = new AObserverS77S0100000_9(this, 43);
        this.LLLLJ = false;
        this.LLLLJI = -1L;
        this.LLLLL = false;
    }

    public static boolean Ll() {
        if (!C52228Kee.LIZ() && !C52228Kee.LIZIZ()) {
            return false;
        }
        ESA.LIZ.getClass();
        if (!ESA.LIZ() || !ES4.LIZ() || AV1.LJIIJJI() || !((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        return true;
    }

    public final boolean Kl() {
        NewFaceStickerListBean newFaceStickerListBean;
        if (!T9R.LIZ() || (newFaceStickerListBean = this.LJLJJL) == null || newFaceStickerListBean.mStickers.size() <= 0 || !AV1.LJIJI(((NewFaceStickerBean) ListProtector.get(this.LJLJJL.mStickers, 0)).ownerId) || ((NewFaceStickerBean) ListProtector.get(this.LJLJJL.mStickers, 0)).effectSource == 1) {
            return false;
        }
        return true;
    }

    public final boolean Ml() {
        boolean z;
        boolean z2;
        if (C53378KxC.LIZIZ() && C53378KxC.LIZ(this.LLJLL) && this.LLJLLL.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = this.LLLILZLLLI;
        if (list != null && list.size() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!PropDetailTwoNetworkCallConcurrent.LIZIZ || !z2 || z) {
            return false;
        }
        return true;
    }

    public final void Pl() {
        boolean z;
        String packageName;
        boolean z2;
        if ((C51935KZv.LIZ() == 1 || C51935KZv.LIZ() == 3) && ((Keva) T9W.LIZ.getValue()).getInt("click_status", 0) == 0 && this.LJLJJL.mStickers.size() > 0 && ((NewFaceStickerBean) ListProtector.get(this.LJLJJL.mStickers, 0)).commerceSticker == null) {
            ViewParent parent = this.LLFFF.getParent();
            if (this.LLILZ == null && parent != null && (parent instanceof ViewGroup)) {
                this.LLILZ = this.LLFFF.inflate();
            }
            this.LLILZ.setVisibility(0);
            View view = this.LLILZ;
            View view2 = view.findViewById(R.id.byt);
            TuxIconView bannerIcon = (TuxIconView) view.findViewById(R.id.cs8);
            TextView bannerText = (TextView) view.findViewById(R.id.cs9);
            T9M.LIZ.getClass();
            String str = T9M.LIZ().largeBannerBackgroundImageUrl;
            String str2 = T9M.LIZ().bannerIcon;
            String text = T9M.LIZ().longStarlingTextKey;
            Context context = getContext();
            o.LJIIIZ(context, "context");
            o.LJIIIZ(view2, "view");
            if (str != null && str.length() != 0) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.drawable.c90;
                SY9 LIZJ = C025908h.LIZJ(view2, "view.context", c2068389v);
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LJIILIIL = LIZJ;
                LJIIIIZZ.LJIILLIIL = LIZJ;
                LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                LJIIIIZZ.LJIIIZ(new IDdS500S0100000_1(view2, 3));
            }
            o.LJIIIZ(bannerIcon, "bannerIcon");
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_effect_house;
                Context context2 = bannerIcon.getContext();
                o.LJIIIIZZ(context2, "bannerIcon.context");
                SY9 LIZ = c2068389v2.LIZ(context2);
                W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str2);
                LJIIIIZZ2.LJIILIIL = LIZ;
                LJIIIIZZ2.LJIILLIIL = LIZ;
                LJIIIIZZ2.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                LJIIIIZZ2.LJIIIZ(new IDdS503S0100000_12(bannerIcon, 4));
            } else {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZJ = C7MY.LIZIZ(20);
                c2068389v3.LIZIZ = C7MY.LIZIZ(20);
                c2068389v3.LIZ = R.raw.icon_effect_house;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                bannerIcon.setTuxIcon(c2068389v3);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(40), C7MY.LIZIZ(40));
                layoutParams.gravity = 17;
                bannerIcon.setLayoutParams(layoutParams);
            }
            o.LJIIIZ(bannerText, "bannerText");
            o.LJIIIZ(text, "text");
            if (text.length() != 0) {
                Resources LJ = C86V.LJ();
                try {
                    Resources LJ2 = C86V.LJ();
                    Context context3 = C09970aH.LIZ;
                    if (context3 == null) {
                        packageName = "";
                    } else {
                        packageName = context3.getPackageName();
                    }
                    String string = LJ.getString(LJ2.getIdentifier(text, "string", packageName));
                    o.LJIIIIZZ(string, "textRes.getString(textString)");
                    char[] charArray = string.toCharArray();
                    o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
                    if (charArray.length <= 35) {
                        bannerText.setText(string);
                    } else {
                        bannerText.setText(bannerText.getContext().getString(R.string.fr7));
                    }
                } catch (Resources.NotFoundException unused) {
                    bannerText.setText(bannerText.getContext().getString(R.string.fr7));
                }
            }
            T9M.LIZ.getClass();
            if (T9M.LIZ().textColor.length() != 0) {
                bannerText.setTextColor(ColorProtector.parseColor(T9M.LIZ().textColor));
            }
            if (T9M.LIZ().textSize.length() != 0) {
                bannerText.setTextSize(CastFloatProtector.parseFloat(T9M.LIZ().textSize));
            }
            if (!T9M.LIZ().showLargeIcon) {
                bannerIcon.setVisibility(8);
            } else {
                bannerIcon.setVisibility(0);
            }
            TuxIconView closeIcon = (TuxIconView) this.LLILZ.findViewById(R.id.cs5);
            String str3 = T9M.LIZ().crossIcon;
            o.LJIIIZ(closeIcon, "closeIcon");
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C2068389v c2068389v4 = new C2068389v();
                c2068389v4.LIZ = R.raw.icon_x_mark_small;
                Context context4 = closeIcon.getContext();
                o.LJIIIIZZ(context4, "closeIcon.context");
                SY9 LIZ2 = c2068389v4.LIZ(context4);
                W5F LJIIIIZZ3 = W5U.LJIIIIZZ(str3);
                LJIIIIZZ3.LJIILIIL = LIZ2;
                LJIIIIZZ3.LJIILLIIL = LIZ2;
                LJIIIIZZ3.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                LJIIIIZZ3.LJIIIZ(new IDdS500S0100000_1(closeIcon, 2));
            } else {
                C2068389v c2068389v5 = new C2068389v();
                c2068389v5.LIZJ = C7MY.LIZIZ(18);
                c2068389v5.LIZIZ = C7MY.LIZIZ(18);
                c2068389v5.LIZ = R.raw.icon_x_mark_small;
                c2068389v5.LJ = Integer.valueOf(R.attr.dj);
                closeIcon.setTuxIcon(c2068389v5);
            }
            C16880lQ.LJJJ(closeIcon, new ACListenerS29S0101000_12(0, this, 3));
            C16880lQ.LJIIJ(new ACListenerS29S0101000_12(1, this, 0), this.LLILZ);
            return;
        }
        this.LLFFF.setVisibility(8);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLLLII = null;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C84915XUh c84915XUh;
        super.onDestroyView();
        C84942XVi c84942XVi = this.LLJL;
        if (c84942XVi != null && (c84915XUh = c84942XVi.LJJIJIL) != null) {
            c84915XUh.LIZJ();
        }
        UserService.LIZ().LJFF().removeObserver(this.LLLLILI);
        MIV miv = this.LJLJI;
        if (miv != null) {
            miv.LJLJJL.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        NewFaceStickerBean newFaceStickerBean;
        super.onResume();
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "onResume");
        this.LLLLJI = System.currentTimeMillis();
        if (this.LLLLL) {
            C84942XVi c84942XVi = this.LLJL;
            Effect effect = c84942XVi.LJJIIZ;
            if (effect != null) {
                c84942XVi.LJI(effect, UUID.randomUUID().toString(), false);
            }
            this.LLLLL = false;
            this.LLLLJ = false;
        }
        Wl(this.LLLLJ);
        MIV miv = this.LJLJI;
        if (miv != null && (newFaceStickerBean = this.LLILL) != null) {
            miv.LJJIII(newFaceStickerBean.ownerId, newFaceStickerBean.mSecUid);
        }
        C84942XVi c84942XVi2 = this.LLJL;
        if (c84942XVi2 != null && c84942XVi2.LIZ && c84942XVi2.LJJJJI) {
            c84942XVi2.LJIIIIZZ(new ArrayList(this.LLLILZLLLI), "prop_page", this.LJLILLLLZI, true, this.LLLIIII, false);
        }
    }

    public static String Hl(Boolean bool) {
        String LIZ = SharePrefCache.inst().getStickerArtlistUrl().LIZ();
        if (bool.booleanValue()) {
            if (C52228Kee.LIZ()) {
                return "ame_editor";
            }
            if (!C52228Kee.LIZIZ()) {
                return LIZ;
            }
            return "create_tab";
        }
        return LIZ;
    }

    @Override // X.MHZ
    public final void F0(View view) {
        if (this.LLJLIL != null) {
            Ql(view, true, false, false);
            return;
        }
        throw new NullPointerException("isFriendVideoPresent");
    }

    public final void Gl(String str) {
        String str2;
        if (Ll()) {
            Sl(Boolean.TRUE, str);
            if (C52228Kee.LIZ()) {
                C188727au LIZJ = C0RN.LIZJ(0, "is_pro_template", 1, "is_h5_entry");
                LIZJ.LIZLLL(1, "is_ame_data");
                LIZJ.LJIIIZ("enter_from", "prop_page");
                FMX.LJIIL("advanced_mobile_editor_open", LIZJ.LIZ);
                EffectCreatorServiceImpl.LJIIJ().LJIIIIZZ("effect_detail_page", "prop_page", "h5_banner", C44384HbQ.LJJJJIZL(), requireActivity());
                return;
            }
            if (!C52228Kee.LIZIZ()) {
                return;
            }
            Il(null, "create");
            return;
        }
        Sl(Boolean.FALSE, str);
        Context context = getContext();
        T9M.LIZ.getClass();
        if (T9M.LIZ().promoUrl.length() == 0) {
            str2 = SharePrefCache.inst().getStickerArtlistUrl().LIZ();
        } else {
            str2 = T9M.LIZ().promoUrl;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        intent.setData(UriProtector.parse(str2));
        intent.putExtra("use_webview_title", true);
        C16880lQ.LIZJ(context, intent);
    }

    public final void Nl(boolean z) {
        C73305Spp c73305Spp;
        DetailAwemeListFragment detailAwemeListFragment;
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            if (!this.LLLIZZ) {
                Ol(null);
            }
            if (this.LLLJ == null) {
                this.LLLJ = new T9K(new AObjectS52S0101000_7(0, this, 24), new AObjectS53S0101000_8(1, this, 0), mo49getActivity(), this.LLJILJILJ, this.LLLIIL, "StickerPropDetail", 0);
            }
            T9K t9k = this.LLLJ;
            t9k.LIZIZ = new AObjectS56S0101000_13(2, this, 2);
            t9k.LJIIIZ = System.currentTimeMillis();
            C73305Spp c73305Spp2 = this.LJZL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                this.LJZL.LJFF();
            }
            this.LJLJI.LJIILL(this.LJLJJI, 0);
            if (z) {
                this.LJZL.setVisibility(8);
                List<T6F> list = this.mFragments;
                if (list != null && (detailAwemeListFragment = (DetailAwemeListFragment) ListProtector.get(list, this.LLJJJJLIIL.LJLJI)) != null) {
                    detailAwemeListFragment.refresh();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLLIZZ && (c73305Spp = this.LJZL) != null) {
            c73305Spp.LJFF();
            this.LJZL.setVisibility(0);
        }
        MIV miv = this.LJLJI;
        if (miv != null) {
            miv.LJIILL(this.LJLJJI, 0);
        }
        if (!z) {
            return;
        }
        C73305Spp c73305Spp3 = this.LJZL;
        if (c73305Spp3 != null) {
            c73305Spp3.setVisibility(8);
        }
        List<T6F> list2 = this.mFragments;
        if (list2 != null) {
            T9I t9i = this.LLJJJJLIIL;
            if (t9i != null) {
                ListProtector.get(list2, t9i.LJLJI);
            }
            C80896Voy c80896Voy = this.LLJILJILJ;
            if (c80896Voy == null) {
                return;
            }
            c80896Voy.setRefreshing(false);
            return;
        }
        C80896Voy c80896Voy2 = this.LLJILJILJ;
        if (c80896Voy2 == null) {
            return;
        }
        c80896Voy2.setRefreshing(false);
    }

    public final void Ol(Throwable th) {
        C252569vg.LIZ(this.LJZL, "StickerPropDetail", th, new AObjectS52S0101000_7(2, this, 1));
        C73305Spp c73305Spp = this.LJZL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
    }

    public final void Rl(String str) {
        NewFaceStickerBean newFaceStickerBean = this.LLJLIL;
        if (newFaceStickerBean != null && !TextUtils.isEmpty(newFaceStickerBean.ownerId) && !TextUtils.isEmpty(this.LLJLIL.ownerName)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("prop_id", this.LLJLIL.id);
            c188727au.LJIIIZ("to_user_id", this.LLJLIL.ownerId);
            c188727au.LJIIIZ("enter_from", "prop_page");
            c188727au.LJIIIZ("enter_method", str);
            FMX.LJIIL("enter_personal_detail", c188727au.LIZ);
            C61200O0e LIZLLL = C61200O0e.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://user/profile/");
            LIZ.append(this.LLJLIL.ownerId);
            C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
            c39061g6.LIZIZ("sec_user_id", this.LLJLIL.mSecUid);
            c39061g6.LIZIZ("enter_from", "prop_page");
            c39061g6.LIZ(3, "from_scene");
            LIZLLL.LJII(c39061g6.LIZJ());
        }
    }

    public final void Tl(NewFaceStickerBean newFaceStickerBean) {
        T5P t5p;
        int i;
        int i2;
        View view;
        if (newFaceStickerBean == null || this.LLIIL == null || (t5p = this.LLIIJLIL) == null) {
            return;
        }
        boolean z = newFaceStickerBean.isFavorite;
        int i3 = R.drawable.bod;
        if (z) {
            i = R.drawable.bod;
        } else {
            i = R.drawable.boe;
        }
        t5p.setImageResource(i);
        if (this.LLILLJJLI != null && (view = this.LLILLIZIL) != null && view.getVisibility() == 8) {
            T5P t5p2 = this.LLILLJJLI;
            if (!newFaceStickerBean.isFavorite) {
                i3 = R.drawable.boe;
            }
            t5p2.setImageResource(i3);
        }
        TextView textView = this.LLIIL;
        if (newFaceStickerBean.isFavorite) {
            i2 = R.string.ig4;
        } else {
            i2 = R.string.bg3;
        }
        textView.setText(i2);
        HT5.LIZJ(newFaceStickerBean.isFavorite);
    }

    public final void Vl(final NewFaceStickerBean newFaceStickerBean) {
        NewFaceStickerListBean newFaceStickerListBean;
        ArrayList arrayList;
        List<? extends NewFaceStickerBean> list;
        boolean z;
        Boolean valueOf;
        if (newFaceStickerBean == null) {
            return;
        }
        MHD mhd = this.LLLILZJ;
        if (mhd != null) {
            mhd.setFaceStickerBean(newFaceStickerBean);
        } else {
            this.LLJJIJIL.setVisibility(8);
            this.LLJJJIL = 0;
        }
        MIP.LJLJLJ = this.LLJJJIL;
        this.LJLLJ.setVisibility(8);
        if (newFaceStickerBean.mobileEffectTemplate != null && C00F.LIZ(31744, 0, "unify_met_detail_page", true) == 1 && !TextUtils.equals(this.LJLILLLLZI, "from_sticker_master_profile")) {
            MobileEffectTemplateInfo mobileEffectTemplateInfo = newFaceStickerBean.mobileEffectTemplate;
            C78765Uvh.LJIIIZ(this.LJLLL, mobileEffectTemplateInfo.getTemplateIcon(), -1, -1);
            this.LJLLLL.setText(mobileEffectTemplateInfo.getTemplateName());
            this.LJLZ.setVisibility(4);
        } else {
            C78765Uvh.LJFF(this.LJLLL, newFaceStickerBean.iconUrl);
            this.LJLLLL.setText(newFaceStickerBean.name);
        }
        if (!C43416H2e.LIZ() || newFaceStickerBean.mobileEffectTemplate == null) {
            this.LLI.setVisibility(8);
        } else {
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = this.LLI.inflate();
            }
            C78764Uvg.LJIIIZ((W5G) this.LLIFFJFJJ.findViewById(R.id.csp), newFaceStickerBean.mobileEffectTemplate.getTemplateIcon(), -1, -1);
            ((TextView) this.LLIFFJFJJ.findViewById(R.id.csw)).setText(newFaceStickerBean.mobileEffectTemplate.getTemplateName());
            C16880lQ.LJIIJ(new ACListenerS24S0201000_7(0, this, newFaceStickerBean, 8), this.LLIFFJFJJ);
        }
        CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
        if (commerceSticker != null) {
            T54 t54 = this.LLLLIIL;
            if (t54 != null) {
                t54.LIZ(commerceSticker);
            }
        } else {
            this.LLIZ.setVisibility(8);
            this.LLIZLLLIL.setVisibility(8);
            this.LLILZLL.setVisibility(8);
            this.LLJ.setVisibility(8);
            this.LLJI.setVisibility(8);
            this.LLJIJIL.setVisibility(8);
        }
        if (!TextUtils.isEmpty(newFaceStickerBean.ownerName) && newFaceStickerBean.commerceSticker == null) {
            this.LJLLLLLL.setText(newFaceStickerBean.ownerName);
            if (newFaceStickerBean.effectSource == 1) {
                if (!e1.LIZ(31744, "studio_no_name_follow_designers", true, false)) {
                    this.LL.setVisibility(0);
                } else {
                    this.LL.setVisibility(8);
                }
            }
            if (TextUtils.isEmpty(newFaceStickerBean.ownerId)) {
                this.LLFZ.setVisibility(8);
            } else {
                this.LLFZ.setVisibility(0);
            }
            if (newFaceStickerBean.mobileEffectTemplate != null) {
                valueOf = Boolean.FALSE;
            } else if (newFaceStickerBean.effectType == 1 && C00F.LIZ(31744, 0, "link_to_effect_ops_account", true) == 2) {
                valueOf = Boolean.FALSE;
            } else if (!TextUtils.equals(newFaceStickerBean.ownerId, "96972139640") && !TextUtils.isEmpty(newFaceStickerBean.ownerId)) {
                valueOf = Boolean.TRUE;
            } else {
                if (newFaceStickerBean.effectType == 1 && C53096Kse.LIZ()) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            if (valueOf.booleanValue()) {
                if (this.LLF == null) {
                    this.LLF = (ViewGroup) this.LLFF.inflate();
                }
                ViewGroup.LayoutParams layoutParams = this.LLF.getLayoutParams();
                layoutParams.height = (int) KL2.LIZJ(getContext(), 64.0f);
                this.LLILL = newFaceStickerBean;
                this.LLF.setLayoutParams(layoutParams);
                this.LLF.setOnTouchListener(new OM6(this));
                AP9 ap9 = (AP9) this.LLF.findViewById(R.id.f4d);
                ap9.setPlaceHolder(R.color.al);
                ap9.setUserData(new UserVerify(newFaceStickerBean.avatarThumb, null, null, 1));
                ap9.LIZ();
                TextView textView = (TextView) this.LLF.findViewById(R.id.m04);
                textView.setText(newFaceStickerBean.ownerName);
                if (newFaceStickerBean.ownerVerifiedType != 0) {
                    AJ9.LJ(getContext(), String.valueOf(3), "", textView);
                }
                this.LLILIL = (ImageView) this.LLF.findViewById(R.id.f70);
                SY4 sy4 = (SY4) this.LLF.findViewById(R.id.dk_);
                this.LLILII = sy4;
                sy4.setVisibility(8);
                this.LJLJI.LJJIII(newFaceStickerBean.ownerId, newFaceStickerBean.mSecUid);
                this.LLF.setVisibility(0);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("prop_id", newFaceStickerBean.id);
                c188727au.LJIIIZ("enter_from", "prop_page");
                c188727au.LJIIIZ("author_id", newFaceStickerBean.ownerId);
                FMX.LJIIL("prop_creator_show", c188727au.LIZ);
            } else {
                ViewGroup viewGroup = this.LLF;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            }
        } else {
            this.LL.setVisibility(8);
        }
        TextView textView2 = this.LJLZ;
        Resources resources = mo49getActivity().getBaseContext().getResources();
        long j = newFaceStickerBean.userCount;
        textView2.setText(resources.getQuantityString(R.plurals.cc, (int) j, C77123UOp.LJJIIJ(j)));
        this.mTitle.setText(newFaceStickerBean.name);
        this.LLJLIL = newFaceStickerBean;
        this.mViewPager.setCurrentItem(this.LLJJJJLIIL.LJLJI);
        DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) ListProtector.get(this.mFragments, this.LLJJJJLIIL.LJLJI);
        List<EffectAnchor> list2 = newFaceStickerBean.linkedAnchors;
        if (list2 != null && !list2.isEmpty()) {
            EffectAnchor effectAnchor = (EffectAnchor) ListProtector.get(newFaceStickerBean.linkedAnchors, 0);
            if (effectAnchor != null) {
                this.LLJJ.setVisibility(0);
                if (effectAnchor.getIcon() != null && !effectAnchor.getIcon().getUrlList().isEmpty()) {
                    C78765Uvh.LJIIIZ(this.LLJJI, (String) ListProtector.get(effectAnchor.getIcon().getUrlList(), 0), -1, -1);
                }
                if (!TextUtils.isEmpty(effectAnchor.getTitle())) {
                    this.LLJJIII.setText(effectAnchor.getTitle());
                }
                if (!TextUtils.isEmpty(effectAnchor.getDesc())) {
                    this.LLJJIJIIJIL.setText(effectAnchor.getDesc());
                    this.LLJJIJIIJIL.setVisibility(0);
                } else {
                    this.LLJJIJIIJIL.setVisibility(8);
                }
                if (!TextUtils.isEmpty(effectAnchor.getSubtitle())) {
                    this.LLJJIJI.setText(effectAnchor.getSubtitle());
                }
                if (!TextUtils.isEmpty(newFaceStickerBean.id) && !TextUtils.isEmpty(effectAnchor.getExtra())) {
                    try {
                        JSONObject jSONObject = new JSONObject(effectAnchor.getExtra());
                        final int optInt = jSONObject.optInt("ngo_id", -1);
                        final String optString = jSONObject.optString("organization_id", "");
                        final String optString2 = jSONObject.optString("organization_type", "");
                        if (optInt >= 0) {
                            C188727au c188727au2 = new C188727au();
                            try {
                                c188727au2.LJIIIZ("link", effectAnchor.getUrl());
                                c188727au2.LJIIIZ("link_type", "nonprofit");
                                c188727au2.LJIIIZ("enter_from", "prop_page");
                                c188727au2.LJIIIZ("enter_method", "click");
                                c188727au2.LJIIIZ("log_pb", this.LLJZIJLIL);
                                c188727au2.LJIIIZ("ngo_name", jSONObject.optString("ngo_name", ""));
                                c188727au2.LJIIIZ("anchor_type", "donation_effect");
                                final Map<String, String> map = c188727au2.LIZ;
                                FMX.LJIIL("donation_effect_banner_show", map);
                                final Bundle bundle = new Bundle();
                                bundle.putString("enter_from", "prop_page");
                                bundle.putString("enter_method", "click");
                                bundle.putString("ngo_name", jSONObject.optString("ngo_name", ""));
                                bundle.putBoolean("should_dim_bg", true);
                                C16880lQ.LJIIZILJ(this.LLJJ, new View.OnClickListener() { // from class: X.9TD
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        StickerPropDetailFragment stickerPropDetailFragment = StickerPropDetailFragment.this;
                                        java.util.Map map2 = map;
                                        int i = optInt;
                                        String str = optString;
                                        String str2 = optString2;
                                        NewFaceStickerBean newFaceStickerBean2 = newFaceStickerBean;
                                        Bundle bundle2 = bundle;
                                        stickerPropDetailFragment.getClass();
                                        FMX.LJIIL("donation_effect_banner_click", map2);
                                        DonationServiceImpl.LJI().LJ(i, bundle2, str, str2, newFaceStickerBean2.id).show(stickerPropDetailFragment.getChildFragmentManager(), "DonationDialogFragment");
                                    }
                                });
                            } catch (Exception e) {
                                e = e;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("invalid json format for effect donation banner ");
                                LIZ.append(e.getMessage());
                                C15280iq.LIZJ("StickerPropDetail", X1D.LIZIZ(LIZ));
                                detailAwemeListFragment.refresh();
                                newFaceStickerListBean = this.LJLJJL;
                                if (newFaceStickerListBean != null) {
                                }
                                arrayList = null;
                                detailAwemeListFragment.LLIIII = arrayList;
                                detailAwemeListFragment.LLIIIILZ = this.LLL;
                                detailAwemeListFragment.LLIIIJ = this.LLLF;
                                Tl(newFaceStickerBean);
                                C188727au c188727au3 = new C188727au();
                                c188727au3.LJIIIZ("prop_id", newFaceStickerBean.id);
                                c188727au3.LJIIIZ("enter_from", "prop_page");
                                FMX.LJIIL("prop_select", c188727au3.LIZ);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJZI, "alpha", 0.0f, 1.0f);
                                ofFloat.setDuration(500L);
                                ofFloat.setInterpolator(new LinearInterpolator());
                                ofFloat.start();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            }
        } else {
            this.LLJJ.setVisibility(8);
        }
        detailAwemeListFragment.refresh();
        newFaceStickerListBean = this.LJLJJL;
        if (newFaceStickerListBean != null || (list = newFaceStickerListBean.mStickers) == null || list.size() == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.LJLJJL.mStickers.size());
            for (NewFaceStickerBean newFaceStickerBean2 : this.LJLJJL.mStickers) {
                if (!newFaceStickerBean2.mIsSelect) {
                    arrayList.add(newFaceStickerBean2);
                } else {
                    ListProtector.add(arrayList, 0, newFaceStickerBean2);
                }
            }
        }
        detailAwemeListFragment.LLIIII = arrayList;
        detailAwemeListFragment.LLIIIILZ = this.LLL;
        detailAwemeListFragment.LLIIIJ = this.LLLF;
        Tl(newFaceStickerBean);
        C188727au c188727au32 = new C188727au();
        c188727au32.LJIIIZ("prop_id", newFaceStickerBean.id);
        c188727au32.LJIIIZ("enter_from", "prop_page");
        FMX.LJIIL("prop_select", c188727au32.LIZ);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJZI, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.start();
    }

    public final void Wl(boolean z) {
        int i;
        RelativeLayout relativeLayout;
        int i2 = R.drawable.c71;
        if (z && (relativeLayout = this.LLLLIILL) != null) {
            this.LLLILZ.LIZJ(relativeLayout);
            C208138Ev c208138Ev = new C208138Ev(getContext(), R.drawable.c71);
            this.LLLILZ = c208138Ev;
            c208138Ev.LIZIZ(this.LLLLIILL);
            C16880lQ.LJIIJ(this.LLLLIILLL, this.LLLLIILL.findViewById(R.id.kdb));
        }
        View view = this.LLIIJI;
        if (view != null) {
            view.setEnabled(!z);
            if (z) {
                this.LLIIJI.setAlpha(0.34f);
            } else {
                this.LLIIJI.setAlpha(1.0f);
            }
        }
        C62846OlW c62846OlW = this.LJLLJ;
        if (c62846OlW != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c62846OlW.setVisibility(i);
        }
        C62846OlW c62846OlW2 = this.LJLLILLLL;
        if (c62846OlW2 != null) {
            if (!z) {
                i2 = R.drawable.a9t;
            }
            C78765Uvh.LIZ(c62846OlW2, i2);
        }
    }

    @Override // X.MIW
    public final void XK(final Exception exc) {
        C36922EeM.LJFF(exc);
        if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            C80896Voy c80896Voy = this.LLJILJILJ;
            if (c80896Voy != null) {
                c80896Voy.setRefreshing(false);
            }
        } else {
            T9K t9k = this.LLLJ;
            if (t9k != null) {
                t9k.LIZIZ = new InterfaceC65784Pro() { // from class: X.T9S
                    @Override // X.InterfaceC65784Pro
                    public final Object invoke() {
                        StickerPropDetailFragment.this.Ol(exc);
                        return null;
                    }
                };
                t9k.LIZ(exc);
            }
        }
        if (isViewValid()) {
            if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                if (this.LLLIZZ) {
                    this.LJZL.setVisibility(8);
                } else {
                    C73305Spp c73305Spp = this.LJZL;
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJI(c73306Spq, new AObjectS52S0101000_7(1, this, 21));
                    c73305Spp.setStatus(c73306Spq);
                    this.LJZL.setVisibility(0);
                }
            }
            ImageView imageView = this.LLIILII;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        C15280iq.LIZIZ("zyq", "PROPDetail request return：");
        Wl(this.LLLLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MIW
    public final void aj(NewFaceStickerListBean newFaceStickerListBean) {
        List<? extends NewFaceStickerBean> list;
        String packageName;
        boolean z;
        List<String> list2;
        C73305Spp c73305Spp;
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "Sticker Prop Detail Success");
        if (this.LLJILJILJ != null) {
            if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                this.LLJILJILJ.setVisibility(0);
                T9K t9k = this.LLLJ;
                if (t9k != null) {
                    t9k.LIZIZ();
                }
            }
            this.LLJILJILJ.setRefreshing(false);
        }
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable() && (c73305Spp = this.LJZL) != null) {
            c73305Spp.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.LLLLIILL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (!isViewValid()) {
            return;
        }
        if (newFaceStickerListBean == null || (list = newFaceStickerListBean.mStickers) == null || list.size() == 0) {
            this.LLLIZZ = false;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_effect;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            C73305Spp c73305Spp2 = this.LJZL;
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LIZJ(getString(R.string.fyh));
            c73306Spq.LIZIZ(getString(R.string.fyg));
            c73305Spp2.setStatus(c73306Spq);
            ViewGroup viewGroup = this.LLJILLL;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.LJZL.setVisibility(0);
            this.LJLJL.setVisibility(8);
            return;
        }
        this.LJLJJL = newFaceStickerListBean;
        if (!this.LLJJJJ) {
            super.initData();
        }
        ListProtector.get(this.mFragments, this.LLJJJJLIIL.LJLJI);
        T9M.LIZ.getClass();
        String str = T9M.LIZ().middleBannerBackgroundImageUrl;
        Context context = getContext();
        View view = this.LLIIII;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        if (str != null && str.length() != 0) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.drawable.c90;
            SY9 LIZJ = C025908h.LIZJ(view, "view.context", c2068389v2);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJIILIIL = LIZJ;
            LJIIIIZZ.LJIILLIIL = LIZJ;
            LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
            LJIIIIZZ.LJIIIZ(new IDdS500S0100000_1(view, 4));
        }
        String text = T9M.LIZ().shortStarlingTextKey;
        TuxTextView bannerText = this.LLIIIJ;
        o.LJIIIZ(bannerText, "bannerText");
        o.LJIIIZ(text, "text");
        if (text.length() != 0) {
            Resources LJ = C86V.LJ();
            try {
                Context context2 = C09970aH.LIZ;
                if (context2 == null) {
                    packageName = "";
                } else {
                    packageName = context2.getPackageName();
                }
                String string = LJ.getString(LJ.getIdentifier(text, "string", packageName));
                o.LJIIIIZZ(string, "textRes.getString(textString)");
                bannerText.setText(string);
            } catch (Resources.NotFoundException unused) {
                bannerText.setText(bannerText.getContext().getString(R.string.fr7));
            }
        }
        T9M.LIZ.getClass();
        if (T9M.LIZ().textColor.length() != 0) {
            bannerText.setTextColor(ColorProtector.parseColor(T9M.LIZ().textColor));
        }
        if (T9M.LIZ().textSize.length() != 0) {
            bannerText.setTextSize(CastFloatProtector.parseFloat(T9M.LIZ().textSize));
        }
        String str2 = T9M.LIZ().bannerIcon;
        TuxIconView bannerIcon = this.LLIIIL;
        o.LJIIIZ(bannerIcon, "bannerIcon");
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_effect_house;
            Context context3 = bannerIcon.getContext();
            o.LJIIIIZZ(context3, "bannerIcon.context");
            SY9 LIZ = c2068389v3.LIZ(context3);
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str2);
            LJIIIIZZ2.LJIILIIL = LIZ;
            LJIIIIZZ2.LJIILLIIL = LIZ;
            LJIIIIZZ2.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
            LJIIIIZZ2.LJIIIZ(new IDdS503S0100000_12(bannerIcon, 5));
        } else {
            C2068389v c2068389v4 = new C2068389v();
            c2068389v4.LIZJ = C7MY.LIZIZ(20);
            c2068389v4.LIZIZ = C7MY.LIZIZ(20);
            c2068389v4.LIZ = R.raw.icon_effect_house;
            c2068389v4.LJ = Integer.valueOf(R.attr.dj);
            bannerIcon.setTuxIcon(c2068389v4);
        }
        if (!T9M.LIZ().showMiddleIcon) {
            this.LLIIIL.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLIIIJ.getLayoutParams();
            marginLayoutParams.setMarginStart(30);
            this.LLIIIJ.setLayoutParams(marginLayoutParams);
        } else {
            this.LLIIIL.setVisibility(0);
        }
        Pl();
        if (!Kl()) {
            if (C51935KZv.LIZ() == 0) {
                String LIZ2 = SharePrefCache.inst().getStickerArtlistUrl().LIZ();
                boolean booleanValue = SharePrefCache.inst().getStickerArtEntry().LIZ().booleanValue();
                String stickerArtistIconUrl = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getStickerArtistIconUrl();
                if (!TextUtils.isEmpty(LIZ2) && !TextUtils.isEmpty(stickerArtistIconUrl) && booleanValue) {
                    Boolean valueOf = Boolean.valueOf(Ll());
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("prop_id", getCurId());
                    c188727au.LJIIIZ("enter_from", "prop_page");
                    c188727au.LJIIIZ("h5_entry_page", "effect_detail_page");
                    c188727au.LIZLLL(valueOf.booleanValue() ? 1 : 0, "is_create_effect_jump");
                    c188727au.LJIIIZ("h5_target_link", Hl(valueOf));
                    FMX.LJIIL("show_h5_entrance", c188727au.LIZ);
                    this.LLII.setVisibility(0);
                    C81705W4v LIZJ2 = W5I.LIZJ();
                    LIZJ2.LJIIL = this.LLII.getController();
                    LIZJ2.LJII = new C51544KKu(this);
                    LIZJ2.LJI(UriProtector.parse(stickerArtistIconUrl));
                    this.LLII.setController(LIZJ2.LIZ());
                    C16880lQ.LJJJJJL(this.LLII, new ACListenerS24S0101000_5(3, this, 14));
                }
            } else if (C51935KZv.LIZ() == 2 || ((C51935KZv.LIZ() == 1 || C51935KZv.LIZ() == 3) && ((Keva) T9W.LIZ.getValue()).getInt("click_status", 0) == 2 && this.LJLJJL.mStickers.size() > 0 && ((NewFaceStickerBean) ListProtector.get(this.LJLJJL.mStickers, 0)).commerceSticker == null)) {
                this.LLIIIILZ.setVisibility(0);
                C16880lQ.LJIJ(this.LLIIIILZ, new ACListenerS24S0101000_5(3, this, 11));
            }
        }
        this.LLJJJJ = true;
        Vl((NewFaceStickerBean) ListProtector.get(newFaceStickerListBean.mStickers, 0));
        ((NewFaceStickerBean) ListProtector.get(newFaceStickerListBean.mStickers, 0)).mIsSelect = true;
        if (newFaceStickerListBean.mStickers.size() == 1) {
            this.LLIIIZ.setVisibility(8);
            this.LLFII.setVisibility(8);
            ViewGroup viewGroup2 = this.LLILZIL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        } else {
            ViewGroup viewGroup3 = this.LLILZIL;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            this.LLIIIZ.setVisibility(0);
            this.LLFII.setVisibility(0);
            T9I t9i = this.LLJJJJLIIL;
            List<? extends NewFaceStickerBean> list3 = newFaceStickerListBean.mStickers;
            t9i.getClass();
            if (list3 != null && list3.size() != 0) {
                ((ArrayList) t9i.LJLIL).clear();
                ((ArrayList) t9i.LJLIL).addAll(list3);
                t9i.notifyDataSetChanged();
                AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "Videos Displayed");
            }
            this.LLIIIZ.setNumColumns(newFaceStickerListBean.mStickers.size());
            int LIZJ3 = (int) KL2.LIZJ(mo49getActivity(), 42.0f);
            int LIZJ4 = (int) KL2.LIZJ(mo49getActivity(), 16.0f);
            int size = newFaceStickerListBean.mStickers.size();
            this.LLIIIZ.setLayoutParams(new LinearLayout.LayoutParams((LIZJ4 * 2) + ((size - 1) * LIZJ4) + (LIZJ3 * size), -2));
        }
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "PreLoad Sticker trigger start");
        Boolean bool = Boolean.FALSE;
        Dl(true, "", false, bool, bool, bool);
        this.LLLIZZ = true;
        this.LJZL.setVisibility(8);
        ImageView imageView = this.LLIILII;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (this.LLILLIZIL != null && this.LLJLIL != null && Kl()) {
            this.LLILLIZIL.setVisibility(0);
            C16880lQ.LJIIJ(new Au2S18S0100000_9(this, 1), this.LLILLIZIL);
            NewFaceStickerBean newFaceStickerBean = this.LLJLIL;
            o.LJIIIZ(newFaceStickerBean, "<this>");
            FMX.LJIIL("show_mobile_effect_edit_entrance", C74186T9q.LIZJ(new MobileEffectData(TAE.EDIT, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, newFaceStickerBean, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 238)).LIZ);
        }
        C15280iq.LIZIZ("zyq", "PROPDetail request return：");
        if (this.LLLLIIIILLL.LIZ((NewFaceStickerBean) ListProtector.get(newFaceStickerListBean.mStickers, 0))) {
            this.LLLLJ = true;
        }
        Wl(this.LLLLJ);
        NewFaceStickerBean newFaceStickerBean2 = (NewFaceStickerBean) ListProtector.get(newFaceStickerListBean.mStickers, 0);
        if (R3A.LJII()) {
            FestivalEntity LJI = R3A.LJI();
            if (LJI != null && LJI.mBannerDetail != null && (list2 = LJI.stickerList) != null && list2.contains(newFaceStickerBean2.id)) {
                if (!TextUtils.isEmpty(LJI.detailPageInfo)) {
                    this.LLIL.setVisibility(0);
                    this.LLIILZL.setVisibility(0);
                    this.LLIL.setText(LJI.detailPageInfo);
                } else {
                    this.LLIL.setVisibility(8);
                }
                this.LLIIZ.setVisibility(0);
                W5F LJIIIIZZ3 = W5U.LJIIIIZZ(LJI.mBannerDetail.bannerResource);
                LJIIIIZZ3.LIZIZ("StickerPropDetailFragment");
                Context context4 = getContext();
                S3I s3i = new S3I();
                s3i.LIZLLL = V2B.LJI(context4, 2.0f);
                s3i.LIZIZ = V2B.LJI(context4, 0.0f);
                LJIIIIZZ3.LJIJJLI = new S3L(s3i);
                LJIIIIZZ3.LJJIIJ = this.LLIIZ;
                C16880lQ.LLJJJ(LJIIIIZZ3);
                C16880lQ.LJIILJJIL(this.LLIILZL, new ACListenerS46S0200000_12(LJI, this, 62));
                this.LLIILZL.setVisibility(0);
            }
        } else {
            this.LLIILZL.setVisibility(8);
        }
        FRW.LIZJ("sd_start_activity_to_show_header_duration");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final T6Y createAnimator(ViewGroup viewGroup) {
        return this.LLLILZ.LIZ(viewGroup);
    }

    public final void findView(View view) {
        this.LJLJL = view.findViewById(R.id.kdb);
        this.LJLJLJ = view.findViewById(R.id.d5x);
        this.LJLLI = (ViewGroup) view.findViewById(R.id.fip);
        this.LJLLILLLL = (C62846OlW) view.findViewById(R.id.kdh);
        this.LJLLJ = (C62846OlW) view.findViewById(R.id.kiw);
        this.LJLLL = (C62846OlW) view.findViewById(R.id.kiv);
        this.LJLLLL = (TextView) view.findViewById(R.id.kix);
        this.LJLLLLLL = (TextView) view.findViewById(R.id.mc3);
        this.LLIZLLLIL = (ViewStub) view.findViewById(R.id.ud);
        this.LJLZ = (TextView) view.findViewById(R.id.mxt);
        this.LJZ = view.findViewById(R.id.e3_);
        this.LJZI = view.findViewById(R.id.emi);
        this.LJZL = (C73305Spp) view.findViewById(R.id.kf_);
        this.LJLJLLL = view.findViewById(R.id.kej);
        view.findViewById(R.id.aj5);
        this.LL = (ViewGroup) view.findViewById(R.id.fmf);
        this.LLFF = (ViewStub) view.findViewById(R.id.nfh);
        this.LLFII = view.findViewById(R.id.lfk);
        this.LLFZ = (ImageView) view.findViewById(R.id.a7u);
        view.findViewById(R.id.fai);
        this.LLII = (C62846OlW) view.findViewById(R.id.faj);
        this.LLIIII = view.findViewById(R.id.fak);
        this.LLIIIILZ = (RelativeLayout) view.findViewById(R.id.fal);
        this.LLIIIJ = (TuxTextView) view.findViewById(R.id.fam);
        this.LLIIIL = (TuxIconView) view.findViewById(R.id.k5h);
        this.LLI = (ViewStub) view.findViewById(R.id.gkw);
        this.LLD = (RelativeLayout) view.findViewById(R.id.la4);
        this.LLFFF = (ViewStub) view.findViewById(R.id.fi5);
        this.LLIIIZ = (GridView) view.findViewById(R.id.khp);
        this.LLIIJI = view.findViewById(R.id.kit);
        this.LLIIJLIL = (T5P) view.findViewById(R.id.kiu);
        this.LLIIL = (TextView) view.findViewById(R.id.mlc);
        this.LLIILII = (ImageView) view.findViewById(R.id.jsu);
        this.LLIILZL = (FrameLayout) view.findViewById(R.id.p8);
        this.LLIIZ = (SmartImageView) view.findViewById(R.id.p9);
        this.LLIL = (TuxTextView) view.findViewById(R.id.c9a);
        this.LLILLJJLI = (T5P) view.findViewById(R.id.d57);
        this.LLILLIZIL = view.findViewById(R.id.jr9);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.cs_);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.dym);
        this.LLILZLL = (ViewStub) view.findViewById(R.id.fmu);
        this.LLIZ = (ViewStub) view.findViewById(R.id.t_);
        this.LLJ = (ViewStub) view.findViewById(R.id.nf3);
        this.LLJI = (ViewStub) view.findViewById(R.id.fjh);
        this.LLJIJIL = (ViewStub) view.findViewById(R.id.fmd);
        this.LLJILJILJ = (C80896Voy) view.findViewById(R.id.itq);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.jcm);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.crw);
        this.LLJJI = (C62846OlW) view.findViewById(R.id.cep);
        this.LLJJIII = (TextView) view.findViewById(R.id.cew);
        this.LLJJIJI = (TextView) view.findViewById(R.id.cev);
        this.LLJJIJIIJIL = (TextView) view.findViewById(R.id.cem);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.n6v);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.mo6);
        this.mBackBtn = (ImageView) view.findViewById(R.id.aej);
        this.LLJILJIL = (ViewStub) view.findViewById(R.id.d64);
        C62822Ol8 c62822Ol8 = T9W.LIZ;
        if (((Keva) c62822Ol8.getValue()).getInt("click_status", 0) == 1) {
            ((Keva) c62822Ol8.getValue()).storeInt("click_status", 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.LLL = bundle.getString("aweme_id");
        this.LLJZIJLIL = bundle.getString("extra_log_pb");
        bundle.getString("extra_music_from");
        this.LJLILLLLZI = bundle.getString("extra_sticker_from");
        bundle.getSerializable("sticker_music");
        this.LLLFFI = bundle.getSerializable("music_model");
        this.LLLILZLLLI = bundle.getStringArrayList("extra_stickers");
        bundle.getInt("media_type", 0);
        this.LLJJJIL = 0;
        this.LLLIIII = bundle.getInt("EXTRA_VIDEO_LENGTH", 0);
        this.LLLIIIIL = bundle.getString("extra_previous_page", "");
        this.LLLFZ = bundle.getString("shoot_enter_from");
        this.LLLI = bundle.getString("from_banner_id");
        this.LLLII = bundle.getInt("is_bundled", 0);
        this.LLLIIIL = bundle.getBoolean("enter_record_from_feed", false);
        this.LLJLILLLLZIIL = (Aweme) bundle.getSerializable("extra_related_item");
        this.LLJLL = bundle.getString("extra_owner_id", "");
        this.LLJLLIL = bundle.getInt("featured_video_source", 2);
        this.LLJLLL = Boolean.valueOf(bundle.getBoolean("extra_open_from_profile_page", false));
        this.LLJZ = (UrlModel) bundle.getSerializable("extra_url_icon");
        this.LLLF = bundle.getString("extra_edit_effect_uid", "");
        this.LLLJL = bundle.getString("prop_page_enter_from", "");
        this.LLLL = bundle.getString("prop_page_enter_method", "");
        StringBuilder sb = new StringBuilder();
        List<String> list = this.LLLILZLLLI;
        if (list != null && list.size() > 0) {
            ListProtector.get(this.LLLILZLLLI, 0);
            for (String str : this.LLLILZLLLI) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(",");
                sb.append(X1D.LIZIZ(LIZ));
            }
        }
        if (sb.toString().endsWith(",")) {
            this.LJLJJI = sb.toString().substring(0, sb.toString().length() - 1);
        }
        this.mStickerIds = bundle.getString("sticker_id");
        MIP.LJLJLJ = this.LLJJJIL;
        this.mHasRecordHideAnim = false;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initView(View view) {
        super.initView(view);
        T9V.LJJIFFI.getClass();
        this.LLLIL = new C28791BRr();
        UserService.LIZ().LJFF().observe(this, this.LLLLILI);
        AVExternalServiceImpl.LIZ().getCurrentUserData().observe(this, this.LLLLIL);
        if (this.LLLLJ) {
            this.LLLILZ = new C208138Ev(requireContext(), R.drawable.a9t);
        } else {
            final Context requireContext = requireContext();
            final LayoutInflater layoutInflater = getLayoutInflater();
            this.LLLILZ = new InterfaceC74147T8d(requireContext, layoutInflater) { // from class: X.7W5
                public final Context LIZ;
                public final LayoutInflater LIZIZ;
                public final int LIZJ;
                public final boolean LIZLLL;
                public View LJ;
                public YAX LJFF;

                @Override // X.InterfaceC74147T8d
                public final void LIZLLL() {
                    YAX yax = this.LJFF;
                    if (yax != null) {
                        yax.LJIIIIZZ = true;
                        ViewGroup viewGroup = yax.LJ;
                        if (viewGroup == null) {
                            return;
                        }
                        viewGroup.setVisibility(8);
                        return;
                    }
                    o.LJIJI("animator");
                    throw null;
                }

                @Override // X.InterfaceC74147T8d
                public final T6Y LIZ(ViewGroup viewGroup) {
                    o.LJIIIZ(viewGroup, "viewGroup");
                    YAX yax = new YAX(this.LIZ, viewGroup, this.LIZLLL);
                    this.LJFF = yax;
                    return yax;
                }

                @Override // X.InterfaceC74147T8d
                public final void LIZIZ(RelativeLayout rootView) {
                    TextView textView;
                    o.LJIIIZ(rootView, "rootView");
                    View LLLLIILL = C16880lQ.LLLLIILL(this.LIZIZ, R.layout.biy, rootView, false);
                    this.LJ = LLLLIILL;
                    View view2 = null;
                    if (LLLLIILL != null && (textView = (TextView) LLLLIILL.findViewById(R.id.kdj)) != null) {
                        textView.setText(this.LIZ.getString(this.LIZJ));
                    }
                    View view3 = this.LJ;
                    if (view3 != null) {
                        view2 = view3.findViewById(R.id.kdb);
                    }
                    int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LIZ);
                    C89V c89v = new C89V(KL2.LIZJ(this.LIZ, 4.0f), BlurMaskFilter.Blur.NORMAL, KL2.LIZJ(this.LIZ, 2.0f), AnonymousClass636.LJIIIIZZ(R.attr.d5, this.LIZ));
                    if (view2 != null) {
                        view2.setBackground(new C8BK(LJIIIIZZ, c89v));
                    }
                    rootView.addView(this.LJ);
                }

                @Override // X.InterfaceC74147T8d
                public final void LIZJ(RelativeLayout rootView) {
                    o.LJIIIZ(rootView, "rootView");
                    View view2 = this.LJ;
                    if (view2 != null) {
                        C16880lQ.LJLLLLLL(view2, rootView);
                    }
                }

                {
                    o.LJIIIZ(requireContext, "context");
                    o.LJIIIZ(layoutInflater, "layoutInflater");
                    this.LIZ = requireContext;
                    this.LIZIZ = layoutInflater;
                    this.LIZJ = R.string.ejn;
                    this.LIZLLL = true;
                }
            };
        }
        AnimationUtils.loadAnimation(getContext(), R.anim.ce).setAnimationListener(new IDAListenerS236S0100000_12(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            boolean r0 = r14.Ml()
            if (r0 == 0) goto Laa
            java.util.ArrayList r4 = new java.util.ArrayList
            r3 = 1
            r4.<init>(r3)
            r14.mFragments = r4
            java.util.List<java.lang.String> r0 = r14.LLLILZLLLI
            r2 = 0
            java.lang.Object r11 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.lang.String r11 = (java.lang.String) r11
            com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager r0 = r14.LLLFF
            if (r0 == 0) goto Lb7
            boolean r0 = r0.isEditEffect()
            if (r0 == 0) goto Lab
            java.lang.String r13 = "editing_effect_page"
        L26:
            X.MHD r9 = new X.MHD
            X.MGv r1 = new X.MGv
            java.lang.String r0 = r14.LLLIIIIL
            r6 = 15
            r1.<init>(r6, r0, r11)
            r9.<init>(r1)
            r14.LLLILZJ = r9
            java.lang.String r12 = r14.LLLFZ
            java.lang.String r10 = r14.LLLIIIIL
            java.lang.String r8 = r14.LLL
            java.lang.String r7 = r14.LJLILLLLZI
            java.lang.String r0 = "id"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "previousPage"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.ss.android.ugc.aweme.prop.fragment.EarlyLoadStickerDetailAwemeListFramgent r5 = new com.ss.android.ugc.aweme.prop.fragment.EarlyLoadStickerDetailAwemeListFramgent
            r5.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "detail_aweme_list_type"
            r1.putInt(r0, r6)
            java.lang.String r0 = "event_label"
            r1.putString(r0, r13)
            java.lang.String r0 = "detail_id"
            r1.putString(r0, r11)
            java.lang.String r0 = "shoot_enter_from"
            r1.putString(r0, r12)
            java.lang.String r0 = "detail_aweme_from"
            r1.putString(r0, r10)
            java.lang.String r0 = "detail_aweme_from_aid"
            r1.putString(r0, r8)
            java.lang.String r0 = "extra_sticker_from"
            r1.putString(r0, r7)
            r5.setArguments(r1)
            r5.LLILLIZIL = r9
            android.util.SparseArray<X.K1b> r0 = r5.LLIIL
            java.lang.Object r0 = r0.get(r6)
            X.K1b r0 = (X.C51031K1b) r0
            r5.LJLJJL = r0
            if (r0 != 0) goto L9e
            X.MGV r1 = r5.LLILLIZIL
            X.1qj r0 = r5.mo49getActivity()
            X.K1b r0 = r1.getPresenter(r6, r0)
            r5.LJLJJL = r0
            if (r0 == 0) goto L9e
            r0.LJJIII(r5)
            android.util.SparseArray<X.K1b> r1 = r5.LLIIL
            X.K1b<X.K1g> r0 = r5.LJLJJL
            r1.put(r6, r0)
        L9e:
            int r0 = r14.mCurPos
            if (r0 != 0) goto La3
            r2 = 1
        La3:
            r5.LLIIJI = r2
            r5.LLIIJLIL = r3
            r4.add(r5)
        Laa:
            return
        Lab:
            com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager r0 = r14.LLLFF
            boolean r0 = r0.isEditProp()
            if (r0 == 0) goto Lb7
            java.lang.String r13 = "editing_prop_page"
            goto L26
        Lb7:
            java.lang.String r13 = "sticker_prop_detail"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment.onCreate(android.os.Bundle):void");
    }

    @QD3
    public void onEvent(C107794Kx c107794Kx) {
        if (isViewValid() && TextUtils.equals("sticker", c107794Kx.LJLJJI)) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJZ, c107794Kx);
        }
    }

    @QD3
    public void receiveJumpMessage(T9Z t9z) {
        this.LLLLL = true;
    }

    public static void Al(StickerPropDetailFragment stickerPropDetailFragment, View view) {
        String str;
        T6F t6f;
        List list;
        C56492MFc c56492MFc;
        if (stickerPropDetailFragment.LLJLIL == null || C6ZT.LIZ(view)) {
            return;
        }
        String str2 = stickerPropDetailFragment.LLJLIL.id;
        EditEffectAnchorManager editEffectAnchorManager = stickerPropDetailFragment.LLLFF;
        String str3 = "";
        if (editEffectAnchorManager != null) {
            if (editEffectAnchorManager.isEditProp()) {
                str = "editing_prop_page";
            } else if (stickerPropDetailFragment.LLLFF.isEditEffect()) {
                str = "editing_effect_page";
                str2 = "";
                str3 = stickerPropDetailFragment.LLJLIL.id;
            }
            C200757uJ c200757uJ = new C200757uJ();
            c200757uJ.LIZLLL = str;
            c200757uJ.LJJLIIJ = "prop_page";
            c200757uJ.LJJLIIIJL = str3;
            c200757uJ.LJJLIIIJJIZ = str2;
            c200757uJ.LJJLIIIJLLLLLLLZ = C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(0, stickerPropDetailFragment.LLL));
            c200757uJ.LJJL = stickerPropDetailFragment.LLL;
            c200757uJ.LJJLIIIJLJLI = 1009;
            c200757uJ.LJIILIIL();
            SecApiImpl.LIZ().reportData(FWZ.STICKER_SHARE.getReportName());
            ShareService shareService = C4LD.LIZ;
            ActivityC45651qj mo49getActivity = stickerPropDetailFragment.mo49getActivity();
            NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLJLIL;
            String str4 = stickerPropDetailFragment.LLL;
            t6f = (T6F) ListProtector.get(stickerPropDetailFragment.mFragments, stickerPropDetailFragment.mCurPos);
            list = null;
            if ((t6f instanceof DetailAwemeListFragment) && (c56492MFc = ((DetailAwemeListFragment) t6f).LLD) != null) {
                list = c56492MFc.mmItems;
            }
            shareService.LJJJLIIL(mo49getActivity, newFaceStickerBean, str4, list, stickerPropDetailFragment.LLJZIJLIL);
        }
        str = "prop_page";
        C200757uJ c200757uJ2 = new C200757uJ();
        c200757uJ2.LIZLLL = str;
        c200757uJ2.LJJLIIJ = "prop_page";
        c200757uJ2.LJJLIIIJL = str3;
        c200757uJ2.LJJLIIIJJIZ = str2;
        c200757uJ2.LJJLIIIJLLLLLLLZ = C3A5.LIZ.LIZIZ(C227768wm.LJIILLIIL(0, stickerPropDetailFragment.LLL));
        c200757uJ2.LJJL = stickerPropDetailFragment.LLL;
        c200757uJ2.LJJLIIIJLJLI = 1009;
        c200757uJ2.LJIILIIL();
        SecApiImpl.LIZ().reportData(FWZ.STICKER_SHARE.getReportName());
        ShareService shareService2 = C4LD.LIZ;
        ActivityC45651qj mo49getActivity2 = stickerPropDetailFragment.mo49getActivity();
        NewFaceStickerBean newFaceStickerBean2 = stickerPropDetailFragment.LLJLIL;
        String str42 = stickerPropDetailFragment.LLL;
        t6f = (T6F) ListProtector.get(stickerPropDetailFragment.mFragments, stickerPropDetailFragment.mCurPos);
        list = null;
        if (t6f instanceof DetailAwemeListFragment) {
            list = c56492MFc.mmItems;
        }
        shareService2.LJJJLIIL(mo49getActivity2, newFaceStickerBean2, str42, list, stickerPropDetailFragment.LLJZIJLIL);
    }

    public final void Il(String str, String str2) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && !mo49getActivity.isFinishing()) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("snssdk1233").authority("openRecord").appendQueryParameter("enter_from", "prop_page");
            if (str2.equals("create")) {
                appendQueryParameter.appendQueryParameter("recordParam", "mobileStickTemplate");
            } else {
                appendQueryParameter.appendQueryParameter("recordParam", "sticker");
            }
            if (str != null) {
                appendQueryParameter.appendQueryParameter("id", str);
            }
            C16880lQ.LIZIZ(mo49getActivity, new Intent("android.intent.action.VIEW", appendQueryParameter.build()));
        }
    }

    public final void Sl(Boolean bool, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("prop_id", getCurId());
        c188727au.LJIIIZ("enter_from", "prop_page");
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("h5_entry_page", "effect_detail_page");
        c188727au.LIZLLL(bool.booleanValue() ? 1 : 0, "is_create_effect_jump");
        c188727au.LJIIIZ("h5_target_link", Hl(bool));
        FMX.LJIIL("click_h5_page_entrance", c188727au.LIZ);
    }

    @Override // X.MIW
    public final void kC(NewFaceStickerBean newFaceStickerBean, boolean z) {
        if (!z) {
            C2U8.LIZ(new C76P(newFaceStickerBean));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
        boolean z;
        EditEffectAnchorManager editEffectAnchorManager;
        EditEffectAnchorManager editEffectAnchorManager2;
        super.onScroll(i, i2);
        float f = 0.0f;
        if (this.LLJJLIIIJLLLLLLLZ == 0.0f) {
            if (this.LL.getVisibility() == 0) {
                this.LLJJLIIIJLLLLLLLZ = this.LL.getBottom() - this.mTitleColorCtrl.getBottom();
            } else if (this.LJLLLL.getVisibility() == 0) {
                this.LLJJLIIIJLLLLLLLZ = this.LJLLLL.getBottom() - this.mTitleColorCtrl.getBottom();
            }
        }
        if (this.LLJJL == 0.0f) {
            this.LLJJL = this.LJZ.getBottom() - this.mTitleColorCtrl.getBottom();
        }
        float f2 = i;
        float f3 = this.LLJJLIIIJLLLLLLLZ;
        float f4 = (f2 - f3) / (this.LLJJL - f3);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.mTitleColorCtrl.setAlpha(f4);
        float f5 = this.LLJJL;
        float f6 = LLLLLIL;
        if (f5 >= f6) {
            f2 -= f5 - f6;
            f5 = f6;
        }
        float f7 = f2 / f5;
        if (f7 >= 0.0f) {
            f = f7;
            if (f7 > 1.0f) {
                f = 1.0f;
            }
        }
        this.mTitle.setAlpha(f);
        this.LJZ.setAlpha(1.0f - f);
        if (C51935KZv.LIZ() == 0) {
            this.LLII.setAlpha(1.0f - f4);
            if (this.LLILLJJLI != null && !Kl() && ((editEffectAnchorManager2 = this.LLLFF) == null || editEffectAnchorManager2.isEditProp())) {
                this.LLILLJJLI.setVisibility(0);
            }
        } else {
            boolean z2 = true;
            if (((Keva) T9W.LIZ.getValue()).getInt("click_status", 0) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (C51935KZv.LIZ() == 2 || (z && (C51935KZv.LIZ() == 1 || C51935KZv.LIZ() == 3))) {
                this.LLIIIILZ.setAlpha(1.0f - f4);
            }
            if (this.LLILLL != null && this.LLIIIILZ.getAlpha() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                T9M.LIZ.getClass();
                String str = T9M.LIZ().smallBannerBackgroundImageUrl;
                TuxIconView bannerIcon = this.LLILLL;
                o.LJIIIZ(bannerIcon, "bannerIcon");
                if (str != null && str.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_effect_house;
                    Context context = bannerIcon.getContext();
                    o.LJIIIIZZ(context, "bannerIcon.context");
                    SY9 LIZ = c2068389v.LIZ(context);
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJIILIIL = LIZ;
                    LJIIIIZZ.LJIILLIIL = LIZ;
                    LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                    LJIIIIZZ.LJIIIZ(new IDdS500S0100000_1(bannerIcon, 5));
                } else {
                    bannerIcon.setBackgroundResource(R.drawable.c91);
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZJ = C7MY.LIZIZ(14);
                    c2068389v2.LIZIZ = C7MY.LIZIZ(14);
                    c2068389v2.LIZ = R.raw.icon_effect_house;
                    c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                    bannerIcon.setTuxIcon(c2068389v2);
                }
                this.LLILLL.setVisibility(0);
                T5P t5p = this.LLILLJJLI;
                if (t5p != null) {
                    t5p.setVisibility(8);
                }
            }
            if (this.LLIIIILZ.getAlpha() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                this.LLILLL.setVisibility(8);
                if (this.LLILLJJLI != null && !Kl() && ((editEffectAnchorManager = this.LLLFF) == null || editEffectAnchorManager.isEditProp())) {
                    this.LLILLJJLI.setVisibility(0);
                }
            }
        }
        this.LLJJJJJIL = T6X.LIZ(f4, this.LLJJJJJIL, this);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        this.LLJJJJJIL = T6X.LIZIZ(f, f2, this.LLJJJJJIL, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0089, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0230  */
    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.MIW
    public final void wf(NewFaceStickerBean newFaceStickerBean, ExceptionResult exceptionResult) {
        if (mo49getActivity() == null) {
            return;
        }
        Tl(newFaceStickerBean);
        if (exceptionResult == null) {
            return;
        }
        int errorCode = exceptionResult.getErrorCode();
        if (errorCode == 2004 || errorCode == 2002) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(getResources().getString(R.string.g87));
            c26045AKb.LJIIJ();
        }
    }

    public final void Ql(View view, boolean z, boolean z2, boolean z3) {
        if (mo49getActivity() != null && MSAdaptionService.LJIIL().LJI(mo49getActivity())) {
            C16880lQ.LLZILL(Toast.makeText(mo49getActivity(), getString(R.string.f1i), 0));
            return;
        }
        String uuid = UUID.randomUUID().toString();
        if (!this.LLLLIIIILLL.LIZIZ(view.getContext(), this.LLJLIL, "prop_collection")) {
            Boolean valueOf = Boolean.valueOf(z);
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.LIZ().configService().avsettingsConfig();
            if (avsettingsConfig != null && avsettingsConfig.needLoginBeforeRecord()) {
                J9P.LIZIZ(mo49getActivity(), "prop_page", "prop_reuse_icon", null, null);
            } else {
                Dl(false, uuid, AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), valueOf, Boolean.valueOf(z2), Boolean.valueOf(z3));
            }
        }
    }

    public final void Dl(boolean z, String str, boolean z2, final Boolean bool, final Boolean bool2, final Boolean bool3) {
        ArrayList arrayList;
        List<? extends NewFaceStickerBean> list;
        String str2;
        if (this.LLJL == null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            EditEffectAnchorManager editEffectAnchorManager = this.LLLFF;
            if (editEffectAnchorManager == null) {
                str2 = "prop_page";
            } else if (editEffectAnchorManager.isEditProp()) {
                str2 = "editing_prop_page";
            } else {
                str2 = "editing_effect_page";
            }
            C84942XVi c84942XVi = new C84942XVi(mo49getActivity, str2);
            this.LLJL = c84942XVi;
            c84942XVi.LJFF.setShootEnterFrom(this.LLLFZ);
            this.LLJL.LJFF.setFromBannerId(this.LLLI);
            this.LLJL.LJFF.setBundled(Integer.valueOf(this.LLLII));
            C84942XVi c84942XVi2 = this.LLJL;
            c84942XVi2.LJIILJJIL = "prop_auto";
            c84942XVi2.LJIJJLI = this.LLLF;
            c84942XVi2.LJIIJJI = str;
            c84942XVi2.LJJIJLIJ = this.LLLIIII;
            c84942XVi2.LJJJIL = this.LLLIIIL;
            c84942XVi2.LJIILLIIL = "prop_page";
            c84942XVi2.LJIIZILJ = "click_prop_publish";
            c84942XVi2.LJJJJ = 16;
        }
        if (this.LLLJL != null) {
            Z9N.LIZIZ.LJFF().LJI(this.LLLJL);
        } else {
            Z9N.LIZIZ.LJFF().LJI("");
        }
        if (this.LLLL != null) {
            Z9N.LIZIZ.LJFF().LJ(this.LLLL);
        } else {
            Z9N.LIZIZ.LJFF().LJ("");
        }
        this.LLJL.LJJ = new InterfaceC74183T9n() { // from class: X.HaD
            public final /* synthetic */ int LJ = 0;

            @Override // X.InterfaceC74183T9n
            public final void LIZ(Effect effect, String str3) {
                String str4;
                StickerPropDetailFragment stickerPropDetailFragment = StickerPropDetailFragment.this;
                Boolean bool4 = bool;
                Boolean bool5 = bool2;
                Boolean bool6 = bool3;
                int i = this.LJ;
                stickerPropDetailFragment.getClass();
                if (str3.isEmpty()) {
                    return;
                }
                IAVMobService aVMobService = AVExternalServiceImpl.LIZ().getAVMobService();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("creation_id", str3);
                c188727au.LJIIIZ("prop_id", effect.getEffectId());
                c188727au.LJIIIZ("group_id", stickerPropDetailFragment.LLL);
                c188727au.LJIIIZ("log_pb", stickerPropDetailFragment.LLJZIJLIL);
                String str5 = "prop_page";
                c188727au.LJIIIZ("enter_from", "prop_page");
                c188727au.LJIIIZ("enter_method", "click_prop_publish");
                c188727au.LJ(AVExternalServiceImpl.LIZ().infoService().getDurationSinceAppForeground(str3), "time_elapsed_since_launch_app");
                c188727au.LJFF(Boolean.FALSE, "is_ui_shoot");
                c188727au.LJIIIZ("shoot_enter_from", stickerPropDetailFragment.LLLFZ);
                c188727au.LIZLLL(stickerPropDetailFragment.LLLII, "is_bundled");
                c188727au.LJIIIZ("prop_page_enter_from", stickerPropDetailFragment.LLLJL);
                c188727au.LJIIIZ("prop_page_enter_method", stickerPropDetailFragment.LLLL);
                c188727au.LJIIIZ("page_model", "detail");
                if (!TextUtils.isEmpty(stickerPropDetailFragment.LLLI)) {
                    c188727au.LJI("from_banner_id", stickerPropDetailFragment.LLLI);
                }
                Z9N z9n = Z9N.LIZIZ;
                z9n.LJFF().LJII(bool4.booleanValue());
                if (!bool4.booleanValue()) {
                    EditEffectAnchorManager editEffectAnchorManager2 = stickerPropDetailFragment.LLLFF;
                    if (editEffectAnchorManager2 != null) {
                        if (editEffectAnchorManager2.isEditProp()) {
                            str5 = "editing_prop_page";
                        } else {
                            str5 = "editing_effect_page";
                        }
                    }
                    c188727au.LJI("shoot_way", str5);
                } else {
                    c188727au.LJI("shoot_way", "prop_featured_video");
                }
                C50321Joz fetchCurrentFragmentData = C50652JuK.fetchCurrentFragmentData();
                if (fetchCurrentFragmentData != null) {
                    c188727au.LJI("search_id", fetchCurrentFragmentData.getSearchId());
                }
                z9n.LJFF().LJIIZILJ(effect.getEffectId());
                C50653JuL.LJLILLLLZI.getClass();
                C78983UzD.LJII(c188727au, C50654JuM.LIZIZ());
                z9n.LJFF().LJIL(bool5.booleanValue());
                z9n.LJFF().LJIILIIL(bool6.booleanValue());
                String str6 = "1";
                if (bool5.booleanValue()) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJI("is_friend_tag", str4);
                if (!bool6.booleanValue()) {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJI("is_following_tag ", str6);
                c188727au.LIZLLL(i, "after_consumption ");
                aVMobService.onEventV3("shoot", c188727au.LIZ);
            }
        };
        NewFaceStickerListBean newFaceStickerListBean = this.LJLJJL;
        if (newFaceStickerListBean == null || (list = newFaceStickerListBean.mStickers) == null || list.size() == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.LJLJJL.mStickers.size());
            for (NewFaceStickerBean newFaceStickerBean : this.LJLJJL.mStickers) {
                if (!newFaceStickerBean.mIsSelect) {
                    arrayList.add(newFaceStickerBean.id);
                } else {
                    ListProtector.add(arrayList, 0, newFaceStickerBean.id);
                }
            }
        }
        if (C7U8.LIZ() && arrayList == null) {
            arrayList = new ArrayList(this.LLLILZLLLI);
        }
        if (arrayList != null && arrayList.size() != 0) {
            Serializable serializable = this.LLLFFI;
            if (serializable instanceof Music) {
                this.LLJL.LJIIJ((Music) serializable);
            }
            C84942XVi c84942XVi3 = this.LLJL;
            c84942XVi3.LJIJ = this.LLLIIIIL;
            c84942XVi3.LJIIIIZZ(arrayList, "prop_page", this.LJLILLLLZI, z, this.LLLIIII, z2);
        }
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "PreLoad Sticker end");
    }
}

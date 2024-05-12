package Y;

import X.AbstractC76019TsV;
import X.AnonymousClass671;
import X.B4U;
import X.BPP;
import X.C0WE;
import X.C0WF;
import X.C119994nL;
import X.C15380j0;
import X.C15620jO;
import X.C161416Vd;
import X.C1DH;
import X.C1O4;
import X.C2050382x;
import X.C29306Beo;
import X.C31014CFe;
import X.C31413CUn;
import X.C32287Cln;
import X.C32420Cnw;
import X.C37477EnJ;
import X.C38819FLj;
import X.C44298Ha2;
import X.C47061t0;
import X.C5S1;
import X.C6PB;
import X.C72440Sbs;
import X.C74957TbN;
import X.C75981Trt;
import X.C77316UWa;
import X.C77317UWb;
import X.C77608Ud2;
import X.C78391Upf;
import X.C78880UxY;
import X.C81184Vtc;
import X.C82547WaV;
import X.CCJ;
import X.CJ2;
import X.DZ2;
import X.EnumC46491IMl;
import X.FSM;
import X.HG3;
import X.IGM;
import X.IWL;
import X.InterfaceC150675vj;
import X.InterfaceC21020s6;
import X.InterfaceC47046IdG;
import X.InterfaceC65829PsX;
import X.InterfaceC76622U5i;
import X.OKG;
import X.OSZ;
import X.PU0;
import X.TV3;
import X.U65;
import X.U7F;
import X.U8H;
import X.UI6;
import X.UI8;
import X.UJP;
import X.UYG;
import X.V3N;
import X.V86;
import X.VA9;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListUpgradeFragment;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUpdatePushParamStoreIdSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.vesdk.VESize;
import com.ss.texturerender.VideoSurface;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import o53.IDdS198S0200000_13;

/* loaded from: classes14.dex */
public class ARunnableS16S0201000_13 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        if (this.i2 == 302) {
            ((RechargeDialogNew) this.l0).vl().getClass();
            if (!C77608Ud2.LIZIZ()) {
                Context context = ((RechargeDialogNew) this.l0).getContext();
                if (context != null) {
                    RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) this.l0;
                    String string = context.getString(R.string.ot6);
                    String LIZIZ = OKG.LIZIZ(string, "it.getString(R.string.pm…e1_android_payment_error)", context, R.string.ot7, "it.getString(R.string.pm…ndroid_payment_error_sub)");
                    String tv0 = rechargeDialogNew.vl().tv0();
                    Diamond diamond = rechargeDialogNew.vl().LLIILII;
                    if (diamond != null) {
                        i = diamond.count;
                    } else {
                        i = 0;
                    }
                    UI6.LIZ(context, string, LIZIZ, "context", "package", 302, new UI8(i, tv0));
                    return;
                }
                return;
            }
        }
        Exception exc = (Exception) this.l1;
        if (exc == null) {
            return;
        }
        BPP.LIZJ(C15380j0.LIZLLL(), exc);
    }

    public final void LIZ$1() {
        String str;
        String str2;
        String layoutId;
        int i;
        int i2 = this.i2;
        Boolean bool = null;
        String str3 = "";
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            RtcUserInfo rtcUserInfo = (RtcUserInfo) this.l0;
            if (rtcUserInfo != null) {
                bool = Boolean.valueOf(LinkCoreModelKt.isAnchor(rtcUserInfo));
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                B4U.LIZ().LJLIL = true;
            }
            C31014CFe.LJIILL();
            RtcUserInfo rtcUserInfo2 = (RtcUserInfo) this.l0;
            if (rtcUserInfo2 == null || (str = Long.valueOf(rtcUserInfo2.getChannelId()).toString()) == null) {
                str = "";
            }
            C31014CFe.LIZLLL(str);
            RtcUserInfo rtcUserInfo3 = (RtcUserInfo) this.l0;
            if (rtcUserInfo3 == null || (str2 = rtcUserInfo3.getLinkMicId()) == null) {
                str2 = "";
            }
            C31014CFe.LJIIJJI(str2);
            Layout LIZJ = ((U65) this.l1).LJFF().LJIJJ().LIZJ(false);
            if (LIZJ != null && (layoutId = LIZJ.getLayoutId()) != null) {
                str3 = layoutId;
            }
            C31014CFe.LIZLLL.put("layout_id", str3);
            B4U.LIZ().LJJI("link_mic_multiguest");
            return;
        }
        if (LinkMicUpdatePushParamStoreIdSetting.INSTANCE.getValue() && ((i = this.i2) == 6 || i == 0)) {
            C31014CFe.LIZLLL("");
            C31014CFe.LJIIJJI("");
        }
        RtcUserInfo rtcUserInfo4 = (RtcUserInfo) this.l0;
        if (rtcUserInfo4 != null) {
            bool = Boolean.valueOf(LinkCoreModelKt.isAnchor(rtcUserInfo4));
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        B4U.LIZ().LJLIL = false;
    }

    public final void LIZ$2() {
        ((U8H) this.l0).LJIJI = new OSZ<>(Integer.valueOf(((ViewGroup) this.l1).getWidth()), Integer.valueOf(((ViewGroup) this.l1).getHeight() + this.i2));
        Layout LIZJ = ((U8H) this.l0).LJIJJ().LIZJ(false);
        if (LIZJ == null) {
            return;
        }
        U8H.LJJLIIIJJIZ((U8H) this.l0, LIZJ, true, false, null, 24);
    }

    public final void LIZ$3() {
        UJP ujp = (UJP) this.l0;
        if (ujp.LJZL && ujp.LJLL.LIZLLL) {
            ujp.LJIIIIZZ(ujp.LL, true);
        } else if (ujp.LJLL.LIZLLL) {
            ujp.LJIIIIZZ((((C1O4) this.l1).getContainer().getHeight() - ((UJP) this.l0).LJLL.LJII) - ((C1O4) this.l1).LJIIJJI, true);
        } else {
            ujp.LJIIIIZZ((((C1O4) this.l1).getContainer().getHeight() - this.i2) - ((C1O4) this.l1).LJIIJJI, false);
        }
    }

    public final void LIZ$4() {
        CJ2 cj2;
        CJ2 cj22;
        MultiCoHostInviteListFragment multiCoHostInviteListFragment = (MultiCoHostInviteListFragment) this.l0;
        if (multiCoHostInviteListFragment.mStatusViewValid) {
            AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) multiCoHostInviteListFragment.LJLILLLLZI;
            if (abstractC76019TsV != null && (cj22 = abstractC76019TsV.LJLLILLLL) != null) {
                cj22.add(this.i2, (C75981Trt) this.l1);
            }
            MultiCoHostInviteListFragment multiCoHostInviteListFragment2 = (MultiCoHostInviteListFragment) this.l0;
            C31413CUn c31413CUn = multiCoHostInviteListFragment2.LJLLILLLL;
            AbstractC76019TsV abstractC76019TsV2 = (AbstractC76019TsV) multiCoHostInviteListFragment2.LJLILLLLZI;
            if (abstractC76019TsV2 == null || (cj2 = abstractC76019TsV2.LJLLILLLL) == null) {
                cj2 = new CJ2();
            }
            c31413CUn.LJLIL = cj2;
            ((MultiCoHostInviteListFragment) this.l0).LJLLILLLL.notifyItemInserted(this.i2);
        }
    }

    public final void LIZ$5() {
        CJ2 cj2;
        CJ2 cj22;
        MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment = (MultiHostInviteListUpgradeFragment) this.l0;
        if (multiHostInviteListUpgradeFragment.mStatusViewValid) {
            AbstractC76019TsV abstractC76019TsV = (AbstractC76019TsV) multiHostInviteListUpgradeFragment.LJLILLLLZI;
            if (abstractC76019TsV != null && (cj22 = abstractC76019TsV.LJLLILLLL) != null) {
                cj22.add(this.i2, (C75981Trt) this.l1);
            }
            MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment2 = (MultiHostInviteListUpgradeFragment) this.l0;
            C31413CUn c31413CUn = multiHostInviteListUpgradeFragment2.LJLLILLLL;
            AbstractC76019TsV abstractC76019TsV2 = (AbstractC76019TsV) multiHostInviteListUpgradeFragment2.LJLILLLLZI;
            if (abstractC76019TsV2 == null || (cj2 = abstractC76019TsV2.LJLLILLLL) == null) {
                cj2 = new CJ2();
            }
            c31413CUn.LJLIL = cj2;
            ((MultiHostInviteListUpgradeFragment) this.l0).LJLLILLLL.notifyItemInserted(this.i2);
        }
    }

    public static final void run$0(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS16S0201000_13.l0;
                livePlayFragment.LLILLL.getHierarchy().LJIILL((Drawable) aRunnableS16S0201000_13.l1, 1);
                if (CCJ.LIZ(C15380j0.LIZLLL())) {
                    float scaleX = livePlayFragment.LLILLL.getScaleX();
                    if (scaleX > 0.0f) {
                        livePlayFragment.LLILLL.setScaleX(-scaleX);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C77316UWa c77316UWa = (C77316UWa) aRunnableS16S0201000_13.l0;
                Boolean bool = (Boolean) aRunnableS16S0201000_13.l1;
                Activity activity = c77316UWa.LJLIL.LIZ;
                if (activity == null || activity.isFinishing() || c77316UWa.LJLIL.LIZIZ == null) {
                    return;
                }
                if (bool.booleanValue()) {
                    if (DZ2.LIZ) {
                        C5S1 c5s1 = new C5S1(c77316UWa.LJLIL.LIZ);
                        c5s1.LIZJ(R.string.cph);
                        c5s1.LJ();
                        return;
                    }
                    C77317UWb c77317UWb = c77316UWa.LJLIL;
                    if (c77317UWb.LIZJ == null) {
                        c77317UWb.LIZJ = new C119994nL(c77316UWa.LJLIL.LIZ);
                        C77317UWb c77317UWb2 = c77316UWa.LJLIL;
                        View view = c77317UWb2.LIZIZ;
                        if (view instanceof FrameLayout) {
                            ((ViewGroup) view).addView(c77317UWb2.LIZJ);
                        }
                    }
                    C119994nL c119994nL = c77316UWa.LJLIL.LIZJ;
                    if (c119994nL == null || !C1DH.LJIL()) {
                        return;
                    }
                    c119994nL.LJLILLLLZI.setVisibility(0);
                    return;
                }
                C119994nL c119994nL2 = c77316UWa.LJLIL.LIZJ;
                if (c119994nL2 == null) {
                    return;
                }
                c119994nL2.LJLILLLLZI.setVisibility(8);
                return;
            case 2:
                IDdS198S0200000_13 iDdS198S0200000_13 = (IDdS198S0200000_13) aRunnableS16S0201000_13.l0;
                Animatable animatable = (Animatable) aRunnableS16S0201000_13.l1;
                iDdS198S0200000_13.getClass();
                if (animatable.isRunning()) {
                    animatable.stop();
                    UYG uyg = (UYG) iDdS198S0200000_13.l1;
                    if (uyg.LJLJLJ) {
                        uyg.LJLJJL.post(uyg.LJLLILLLL);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TTVideoEngineImpl tTVideoEngineImpl = (TTVideoEngineImpl) aRunnableS16S0201000_13.l0;
                Looper looper = (Looper) aRunnableS16S0201000_13.l1;
                tTVideoEngineImpl.LLZL();
                VideoSurface videoSurface = tTVideoEngineImpl.O0;
                if (videoSurface != null) {
                    videoSurface.LJJI(looper);
                }
                TTVideoEngineLog.d("TTVideoEngine", "[SRLog]setupTextureRender in child thread");
                return;
            default:
                PU0 pu0 = (PU0) aRunnableS16S0201000_13.l0;
                C32420Cnw c32420Cnw = (C32420Cnw) aRunnableS16S0201000_13.l1;
                pu0.getClass();
                c32420Cnw.LIZIZ();
                C32287Cln c32287Cln = pu0.LIZIZ;
                c32287Cln.LIZIZ.LIZIZ(c32420Cnw, c32287Cln).LIZLLL(c32420Cnw, pu0);
                return;
        }
    }

    public static final void run$10(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            super/*android.widget.ImageView*/.onVisibilityChanged((View) aRunnableS16S0201000_13.l0, aRunnableS16S0201000_13.i2);
            ((VA9) aRunnableS16S0201000_13.l1).maybeOverrideVisibilityHandling();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aRunnableS16S0201000_13.l0;
                Bundle bundle = (Bundle) ((Cloneable) aRunnableS16S0201000_13.l1);
                i18nSettingManageMyAccountActivity.LJLJI = true;
                i18nSettingManageMyAccountActivity.LJIJ();
                bundle.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementEmail.getValue());
                HG3.LJFF().changeUnverifiedEmail(i18nSettingManageMyAccountActivity, EnumC46491IMl.MANAGE_MY_ACCOUNT.getValue(), bundle);
                return;
            default:
                C44298Ha2 c44298Ha2 = (C44298Ha2) aRunnableS16S0201000_13.l0;
                Cloneable cloneable = (Cloneable) aRunnableS16S0201000_13.l1;
                c44298Ha2.getClass();
                c44298Ha2.LJII(GsonProtectorUtils.toJson(C78880UxY.LJJIJLIJ(), cloneable));
                return;
        }
    }

    public static final void run$13(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                C37477EnJ c37477EnJ = (C37477EnJ) aRunnableS16S0201000_13.l0;
                ViewGroup viewGroup = (ViewGroup) aRunnableS16S0201000_13.l1;
                c37477EnJ.getClass();
                c37477EnJ.LJ = new WeakReference<>(viewGroup);
                return;
            default:
                C82547WaV c82547WaV = (C82547WaV) aRunnableS16S0201000_13.l0;
                ViewGroup viewGroup2 = (ViewGroup) aRunnableS16S0201000_13.l1;
                if (viewGroup2 != null) {
                    int LJ = (C81184Vtc.LJ(c82547WaV.LJLJL.getContext()) - c82547WaV.LJLJL.getMeasuredWidth()) / 2;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams.leftMargin = LJ;
                    layoutParams.rightMargin = LJ;
                    viewGroup2.setLayoutParams(layoutParams);
                    return;
                }
                c82547WaV.getClass();
                return;
        }
    }

    public static final void run$2(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        LiveCore liveCore;
        LiveCore.Builder builder;
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aRunnableS16S0201000_13.l0;
                C0WF c0wf = (C0WF) aRunnableS16S0201000_13.l1;
                if (guestMediaManageFragment.LLF != null) {
                    View view = (View) guestMediaManageFragment.LJLJJI;
                    TV3.LJIIJJI(view);
                    ((View) guestMediaManageFragment.LJLJJI).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    guestMediaManageFragment.LLF.addView(view);
                    InterfaceC21020s6 liveStream = guestMediaManageFragment.LJLJJI.getLiveStream();
                    if (liveStream != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
                        c0wf.LJJ(C0WE.LIZJ(guestMediaManageFragment.LLF.getWidth(), guestMediaManageFragment.LLF.getHeight(), Integer.valueOf(builder.getVideoWidth()), Integer.valueOf(builder.getVideoHeight()), true));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C2050382x.LIZ.execute(new ARunnableS14S0110000_8((InterfaceC47046IdG) aRunnableS16S0201000_13.l1, C72440Sbs.LIZIZ((String) aRunnableS16S0201000_13.l0), 10));
                return;
            case 2:
                ((InterfaceC65829PsX) aRunnableS16S0201000_13.l0).onSuccess();
                return;
            case 3:
                IWL this$0 = (IWL) aRunnableS16S0201000_13.l0;
                IGM igm = (IGM) aRunnableS16S0201000_13.l1;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZIZ = igm;
                this$0.LIZLLL.LJ(igm);
                return;
            default:
                FSM fsm = (FSM) aRunnableS16S0201000_13.l0;
                fsm.LIZJ.get();
                fsm.LIZIZ = 2;
                return;
        }
    }

    public static final void run$3(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) aRunnableS16S0201000_13.l0;
                LiveStreamBuilder liveStreamBuilder = (LiveStreamBuilder) aRunnableS16S0201000_13.l1;
                multiGuestPreviewFragment.getClass();
                C74957TbN.LIZ().LJJ(C0WE.LIZJ(multiGuestPreviewFragment.LLII.getWidth(), multiGuestPreviewFragment.LLII.getHeight(), Integer.valueOf(liveStreamBuilder.getVideoWidth()), Integer.valueOf(liveStreamBuilder.getVideoHeight()), true));
                return;
            case 1:
                C38819FLj c38819FLj = (C38819FLj) aRunnableS16S0201000_13.l0;
                c38819FLj.LJLIL.change((IESSettingsProxy) aRunnableS16S0201000_13.l1);
                return;
            default:
                ((AwemeListFragmentImpl) aRunnableS16S0201000_13.l0).Nm((Aweme) aRunnableS16S0201000_13.l1);
                return;
        }
    }

    public static final void run$4(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        int i;
        switch (aRunnableS16S0201000_13.i2) {
            case 0:
                C15620jO.LIZIZ((ImageModel) aRunnableS16S0201000_13.l1, (C47061t0) aRunnableS16S0201000_13.l0);
                return;
            case 1:
                ((C78391Upf) aRunnableS16S0201000_13.l0).LIZLLL((OrderInfo) aRunnableS16S0201000_13.l1);
                return;
            case 2:
                C161416Vd c161416Vd = (C161416Vd) aRunnableS16S0201000_13.l0;
                ViewGroup viewGroup = (ViewGroup) aRunnableS16S0201000_13.l1;
                VESize LLILZ = c161416Vd.LJLZ.LLILZ();
                int i2 = LLILZ.width;
                if (i2 == 0 || (i = LLILZ.height) == 0) {
                    return;
                }
                c161416Vd.LLIIII = V3N.LJJIJLIJ(i2, i, viewGroup)[0];
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                int i3 = layoutParams.topMargin;
                new Rect(0, i3, layoutParams.width, layoutParams.height + i3);
                InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
                if (interfaceC150675vj == null) {
                    return;
                }
                AnonymousClass671 LIZLLL = interfaceC150675vj.LIZLLL(c161416Vd.LLIIII, c161416Vd.LJLIL);
                c161416Vd.LLIIIJ = LIZLLL;
                viewGroup.addView(LIZLLL.getContentView());
                return;
            default:
                LiveOuterService.LJJJLL().getLivePreloadService().LIZJ((String) aRunnableS16S0201000_13.l0, (String) aRunnableS16S0201000_13.l1, null);
                return;
        }
    }

    public static final void run$5(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            U7F u7f = (U7F) aRunnableS16S0201000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
            int i = aRunnableS16S0201000_13.i2;
            AbnormalDisconnectReason abnormalDisconnectReason = (AbnormalDisconnectReason) aRunnableS16S0201000_13.l1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJIIZ(u7f, i, null, abnormalDisconnectReason);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS16S0201000_13 aRunnableS16S0201000_13) {
        boolean LIZ;
        try {
            aRunnableS16S0201000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS16S0201000_13(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import X.AbstractC73672Svk;
import X.AbstractC74908Taa;
import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BU9;
import X.C018905p;
import X.C03880Dg;
import X.C05170If;
import X.C06460Ne;
import X.C0NB;
import X.C0NE;
import X.C0TY;
import X.C0WD;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15510jD;
import X.C15580jK;
import X.C15650jR;
import X.C16880lQ;
import X.C19680pw;
import X.C19N;
import X.C1B3;
import X.C1B6;
import X.C23010vJ;
import X.C278617m;
import X.C28733BPl;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29556Biq;
import X.C29701Eo;
import X.C29S;
import X.C2A4;
import X.C2A7;
import X.C30784C6i;
import X.C30868C9o;
import X.C31014CFe;
import X.C31457CWf;
import X.C31665Cbl;
import X.C31778Cda;
import X.C32014ChO;
import X.C3C5;
import X.C44384HbQ;
import X.C47061t0;
import X.C47121t6;
import X.C51029K0z;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73933Szx;
import X.C73969T1h;
import X.C74614TQc;
import X.C74631TQt;
import X.C74632TQu;
import X.C74736TUu;
import X.C74740TUy;
import X.C74749TVh;
import X.C74751TVj;
import X.C74824TYe;
import X.C74838TYs;
import X.C74911Tad;
import X.C74915Tah;
import X.C74925Tar;
import X.C74926Tas;
import X.C74928Tau;
import X.C74947TbD;
import X.C74951TbH;
import X.C74983Tbn;
import X.C75209TfR;
import X.C75211TfT;
import X.C75425Tiv;
import X.C75460TjU;
import X.C75559Tl5;
import X.C76104Tts;
import X.C76535U1z;
import X.C76800UCe;
import X.C76923UGx;
import X.C77437UaH;
import X.C78720Uuy;
import X.C78739UvH;
import X.C78857UxB;
import X.C78862UxG;
import X.C78866UxK;
import X.C88207Yjb;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.CN1;
import X.DialogC77438UaI;
import X.EnumC74914Tag;
import X.InterfaceC08120To;
import X.InterfaceC08130Tp;
import X.InterfaceC17140lq;
import X.InterfaceC21020s6;
import X.InterfaceC24140x8;
import X.InterfaceC29205BdB;
import X.InterfaceC31971Nh;
import X.InterfaceC31981Ni;
import X.InterfaceC65784Pro;
import X.InterfaceC74605TPt;
import X.InterfaceC75138TeI;
import X.InterfaceC75179Tex;
import X.InterfaceC75441TjB;
import X.InterfaceC75787Tol;
import X.T16;
import X.TQ8;
import X.TQH;
import X.TQM;
import X.TR6;
import X.TR8;
import X.TV3;
import X.TXF;
import X.TY2;
import X.U44;
import X.X1D;
import Y.AObjectS143S0100000_13;
import Y.AObjectS33S0000000_13;
import Y.AObjectS45S0101000_13;
import Y.AObjectS51S0101000_6;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS14S0101000_10;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS17S1000000_13;
import Y.AfS36S0101000_5;
import Y.IDCListenerS10S0101000;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MultiGuestStickerImageSelectedEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestUpdateGuestCameraStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.ApplyTypeChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewCloseCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewHasPermissionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPreviewCountDownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPreviewFragmentMuteFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPreviewPanelDefaultVideoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestPreviewPanelEffectOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixPreviewLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestPreviewBugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautyFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestPreviewCameraMemorySettings;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class MultiGuestPreviewFragment extends PreviewFragment implements View.OnClickListener, InterfaceC08120To, SeekBar.OnSeekBarChangeListener, TY2 {
    public static final String LLJZ = C16880lQ.LJLLJ(MultiGuestPreviewFragment.class);
    public ViewGroup LJLJI;
    public C47061t0 LJLJJI;
    public InterfaceC24140x8 LJLJJL;
    public View LJLJJLL;
    public C29701Eo LJLJL;
    public C2A4 LJLJLJ;
    public ImageView LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public FrameLayout LJLLJ;
    public MultiGuestEffectSwitchFragment LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public View LJLZ;
    public C31778Cda LJZ;
    public RecyclerView LJZI;
    public C47121t6 LJZL;
    public View LL;
    public C2A7 LLD;
    public C76104Tts LLFF;
    public ViewGroup LLFFF;
    public C47121t6 LLFII;
    public C47121t6 LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public FrameLayout LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public ImageView LLIIIJ;
    public C76923UGx LLIIIL;
    public ConstraintLayout LLIIIZ;
    public FrameLayout LLIIJI;
    public FrameLayout LLIIJLIL;
    public FrameLayout LLIIL;
    public ViewGroup LLIILII;
    public Space LLIILZL;
    public TextView LLIIZ;
    public LiveDialogFragment LLILIL;
    public AbstractC74908Taa LLILL;
    public InterfaceC08130Tp LLILLIZIL;
    public C76535U1z LLILLJJLI;
    public boolean LLILLL;
    public DataChannel LLILZ;
    public C73411SrX LLILZLL;
    public DialogC77438UaI LLIZLLLIL;
    public WeakReference<TQM> LLJIJIL;
    public C75211TfT LLJILJILJ;
    public ViewGroup.LayoutParams LLJJ;
    public ViewGroup LLJJI;
    public InterfaceC74605TPt LLJJIII;
    public TXF LLJLIL;
    public C75425Tiv LLJLILLLLZIIL;

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mLinkDataHolder;

    @InterfaceC75138TeI(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public TQ8 mUserManager;
    public Boolean LLF = Boolean.FALSE;
    public boolean LLIL = true;
    public boolean LLILII = true;
    public final C73318Sq2 LLILZIL = new C73318Sq2();
    public final Handler LLIZ = new Handler(C16880lQ.LLJJJJ());
    public final int LLJ = LinkMicMultiGuestPreviewCountDownTimeSetting.INSTANCE.getValue();
    public boolean LLJI = false;
    public boolean LLJILJIL = false;
    public boolean LLJILLL = false;
    public boolean LLJJIJI = false;
    public boolean LLJJIJIIJIL = false;
    public boolean LLJJIJIL = false;
    public String LLJJJ = "outside";
    public String LLJJJIL = "is_cancel";
    public final long LLJJJJ = System.currentTimeMillis();
    public C74749TVh LLJJJJJIL = null;
    public String LLJJJJLIIL = "invite";
    public String LLJJL = "";
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public boolean LLJL = true;
    public final C74928Tau LLJLL = new C74928Tau(this);
    public final C74915Tah LLJLLIL = new C74915Tah(this);
    public final C74926Tas LLJLLL = new C74926Tas(this);

    @Override // X.TY2
    public final /* synthetic */ void LLILIL() {
    }

    @Override // X.TY2
    public final /* synthetic */ void LLLLIL() {
    }

    @Override // X.TY2
    public final /* synthetic */ void LLLLLLLZIL(Throwable th) {
    }

    @Override // X.TY2
    public final /* synthetic */ void LLLLZLLLI(Throwable th) {
    }

    @Override // X.TY2
    public final /* synthetic */ void a() {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // X.TY2
    public final /* synthetic */ void sc(Throwable th) {
    }

    public final void Dl() {
        if (this.mLinkDataHolder != null && this.LJLJJL != null) {
            C74951TbH.LIZJ(this.LLILZ, this.LLF.booleanValue(), this.mLinkDataHolder.LJ, this.LJLJJL.getAttachedComposerManager());
        }
    }

    public final void Gl() {
        LiveDialogFragment liveDialogFragment = this.LLILIL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
        }
    }

    public final void Hl() {
        if (!this.LLILZIL.LJLILLLLZI) {
            this.LLILZIL.dispose();
        }
        C29306Beo.LJJJJI(this.LLILZLL);
    }

    public final boolean Nl() {
        String str = this.LLJJJJLIIL;
        if (str != null && str.equals("invite")) {
            return true;
        }
        return false;
    }

    public final boolean Ol() {
        String str = this.LLJJJJLIIL;
        if (str != null && str.equals("permit")) {
            return true;
        }
        return false;
    }

    public final boolean Ql() {
        if (("invite".equals(this.LLJJJJLIIL) || "permit".equals(this.LLJJJJLIIL)) && !this.LLJJIJIL && LinkMicMultiGuestPreviewPanelEffectOptSetting.INSTANCE.getValue() == 1 && !MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable()) {
            return true;
        }
        return false;
    }

    public final boolean Rl() {
        if (this.LLJLIL == TXF.GO_LIVE) {
            return true;
        }
        return false;
    }

    public final String Tl() {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(U44.BIZ.getValue());
            LIZ.append("_");
            LIZ.append(LLJZ);
            LIZ.append("_");
            LIZ.append(LJ.getLineNumber());
            return X1D.LIZIZ(LIZ);
        }
        return LLJZ;
    }

    @Override // X.InterfaceC08120To
    public final void Wj() {
        Ml(new ArrayList());
    }

    public final void Xl() {
        this.LLJJJJLIIL = "permit";
        this.LLJLIL = TXF.GO_LIVE;
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIJIIJI = false;
        } else {
            C32014ChO.LJIIIZ(Tl(), "setUseExistedSurfaceView(false) failed for mLinkDataHolder is null");
        }
        ym();
        this.LLJJIJIL = true;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LJLLL;
        if (multiGuestEffectSwitchFragment != null) {
            String Jl = Jl();
            multiGuestEffectSwitchFragment.getClass();
            multiGuestEffectSwitchFragment.LJLLJ = Jl;
        }
    }

    public final void cm() {
        Object obj = this.LLJJIII;
        if (obj instanceof SurfaceView) {
            View view = (View) obj;
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                this.LLJJI = viewGroup;
                this.LLJJ = view.getLayoutParams();
                C16880lQ.LJLLL(view, viewGroup);
                sm(viewGroup, true);
            }
        }
    }

    public final void dm() {
        Object obj = this.LLJJIII;
        if (obj instanceof SurfaceView) {
            View view = (View) obj;
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                this.LLJJI = viewGroup;
                MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
                if (multiGuestDataHolder != null) {
                    if (multiGuestDataHolder.LJJJJ == null) {
                        multiGuestDataHolder.LJJJJ = view.getLayoutParams();
                    }
                } else {
                    C32014ChO.LJIIIZ(Tl(), "getLinkViewLayoutParams failed for mLinkDataHolder is null");
                }
                this.LLJJ = view.getLayoutParams();
                C16880lQ.LJLLL(view, viewGroup);
                vm(viewGroup, true);
            }
        }
    }

    public final void em() {
        TQH tqh;
        boolean z;
        if (this.LLJLIL != TXF.GO_LIVE) {
            return;
        }
        int i = C74838TYs.LJ().LJJ;
        C29556Biq.LIZ().getClass();
        if (i >= C74983Tbn.LJIIIIZZ()) {
            TQ8 tq8 = this.mUserManager;
            if (tq8 != null) {
                Iterator it = tq8.LIZ().LJJI().iterator();
                while (it.hasNext()) {
                    if (((LinkListUser) it.next()).user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId()) {
                    }
                }
            }
            C30868C9o.LIZJ(R.string.mij);
            Gl();
            WeakReference<TQM> weakReference = this.LLJIJIL;
            if (weakReference != null && weakReference.get() != null) {
                this.LLJIJIL.get().exitInteractInNormalWay("leave_source_reply_pos_limit", false, 10012);
                return;
            }
            return;
        }
        if (B5G.LIZIZ().LJ() != 2) {
            C30868C9o.LIZJ(R.string.mhi);
            Gl();
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            int i2 = multiGuestDataHolder.LJJIJLIJ;
            if ((i2 == 0 || i2 == 2 || i2 == -1) && multiGuestDataHolder.LJJIJL == 1) {
                om("business_mute_close_preview_panel");
                C30868C9o.LIZJ(R.string.nep);
            }
        } else {
            C32014ChO.LJIIIZ(Tl(), "mLinkDataHolder is null in replyGoLiveInPreviewAhead()");
        }
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "replyAnchor");
        qm();
        C74838TYs.LJ().LJIIIZ(true);
        MultiGuestDataHolder multiGuestDataHolder2 = this.mLinkDataHolder;
        if (multiGuestDataHolder2 != null) {
            AbstractC74908Taa abstractC74908Taa = this.LLILL;
            if (abstractC74908Taa != null) {
                if (abstractC74908Taa.LJII() != 2) {
                    z = true;
                } else {
                    z = false;
                }
                multiGuestDataHolder2.LJ = z;
            }
            this.mLinkDataHolder.LJJIJIIJIL = true;
        } else {
            C32014ChO.LJIIIZ(Tl(), "mLinkDataHolder is null in replyGoLiveInPreviewAhead()");
        }
        this.LLF = Boolean.TRUE;
        if (C19N.LIZLLL()) {
            InterfaceC31981Ni composerManagerB = ((IEffectService) CN1.LIZ(IEffectService.class)).composerManagerB();
            if (MultiGuestBeautyFixSetting.enableBugfix()) {
                if (!composerManagerB.LJIIIIZZ("liveguestbeauty").isEmpty()) {
                    composerManagerB.LJIJI("guest_linkmic", false);
                }
            } else {
                composerManagerB.LJIJI("guest_linkmic", false);
            }
        }
        TR8.LIZ = true;
        TR8.LIZLLL(new TR6(true));
        TR8.LIZLLL(new ARunnableS17S1000000_13("guestGoLive", 0));
        if (Ol()) {
            C74749TVh c74749TVh = this.LLJJJJJIL;
            if (c74749TVh != null && c74749TVh.LIZJ()) {
                DataChannel dataChannel = this.LLILZ;
                if (dataChannel != null) {
                    dataChannel.pv0(GuestJoinChannelWhenAnchorPermitEvent.class);
                }
            } else {
                DataChannel dataChannel2 = this.LLILZ;
                if (dataChannel2 != null) {
                    dataChannel2.pv0(AnchorPermitGuestEvent.class);
                }
            }
        } else if (Nl()) {
            C74749TVh c74749TVh2 = this.LLJJJJJIL;
            if (c74749TVh2 != null && c74749TVh2.LJFF != null && c74749TVh2.LIZ() && c74749TVh2.LJI && (tqh = this.LLJJJJJIL.LJFF) != null && this.mLinkDataHolder != null) {
                tqh.LJIIL(new AObjectS51S0101000_6(0, this, 1));
            } else {
                DataChannel dataChannel3 = this.LLILZ;
                if (dataChannel3 != null) {
                    dataChannel3.pv0(GuestReplyAnchorEvent.class);
                }
            }
        }
        Hl();
    }

    public final void fm() {
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            C74824TYe.LIZ.LJJJJZ(multiGuestDataHolder.LJJJJI, C74740TUy.LIZLLL().LJFF, C74740TUy.LIZLLL().LJ, !r1.LIZLLL, !r1.LJ, this.mLinkDataHolder.LJIIIIZZ, this.LLJJJ, this.LLJJJIL, System.currentTimeMillis() - this.LLJJJJ);
        }
    }

    public final void hm() {
        String str;
        if (!this.LLJL) {
            return;
        }
        this.LLJL = false;
        if (C74740TUy.LIZLLL().LJ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C74824TYe.LIZ.LJJJJLL(C74824TYe.LJFF(), str);
    }

    public final void qm() {
        InterfaceC24140x8 interfaceC24140x8;
        if (this.LLJJIII != null) {
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if ((multiGuestDataHolder != null && multiGuestDataHolder.LJJIJIL != null) || (interfaceC24140x8 = this.LJLJJL) == null) {
            return;
        }
        ((InterfaceC74605TPt) interfaceC24140x8).release(C78857UxB.LJJIIJ(1476788483, "bpea-1228"));
    }

    public final void xl() {
        FrameLayout frameLayout;
        LiveCore liveCore;
        LiveCore.Builder builder;
        View view = (View) this.LJLJJL;
        if (view != null && view.getParent() != null) {
            TV3.LJIIJJI(view);
        }
        Object obj = this.LJLJJL;
        if (obj != null && (frameLayout = this.LLII) != null) {
            frameLayout.addView((View) obj);
            InterfaceC21020s6 liveStream = this.LJLJJL.getLiveStream();
            if (liveStream != null && (liveCore = liveStream.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null) {
                this.LLII.post(new ARunnableS16S0201000_13(0, this, builder, 3));
            }
        }
    }

    public MultiGuestPreviewFragment() {
        C75559Tl5.LIZIZ.LJ(this);
    }

    public final void Al() {
        if (Rl()) {
            return;
        }
        if (LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
            Dl();
        }
        this.LLJJJIL = "is_cancel";
        this.LLJJJ = "return";
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            this.LLJILJIL = true;
            EnumC74914Tag enumC74914Tag = EnumC74914Tag.GUEST_USER_INFO;
            enumC74914Tag.setGoNextPage(false);
            LJIILIIL.rv0(DialogPageChannel.class, enumC74914Tag);
        }
    }

    public final void Il() {
        String Tl = Tl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnterFrontAndEngineOn: ");
        LIZ.append(false);
        C32014ChO.LIZIZ(Tl, X1D.LIZIZ(LIZ));
        if (!Pl() && !this.LLJILJIL && !this.LLJJIJIL && this.mLinkDataHolder != null) {
            wl(false, C78857UxB.LJJIIJ(1476788484, "bpea-1226"), "business_mute_pause_preview_panel");
            this.LLJJIJI = true;
        }
    }

    public final String Jl() {
        if (Ol()) {
            return "guest_apply_anchor";
        }
        if (Nl()) {
            return "anchor_invite_guest";
        }
        return "preview_page";
    }

    public final String Kl() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" isFromInvite=");
        LIZ.append(Nl());
        LIZ.append(" isFromPermit");
        LIZ.append(Ol());
        LIZ.append(" isGuestOnline");
        LIZ.append(Pl());
        return X1D.LIZIZ(LIZ);
    }

    public final boolean Pl() {
        if (C74740TUy.LIZLLL().LJ() && this.LLJJIII != null && !Nl() && !Ol()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        Al();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C74749TVh c74749TVh;
        super.onDestroy();
        C74838TYs.LJ().LJIJJ = false;
        C75211TfT c75211TfT = this.LLJILJILJ;
        if (c75211TfT != null) {
            c75211TfT.LIZ(false);
        }
        this.LJLJL.cancelAnimation();
        this.LJLJLJ.LJ();
        this.LLILLIZIL.onDestroy();
        this.LJLLJ = null;
        this.LJLLL = null;
        this.LLJI = false;
        this.LLILZIL.LIZLLL();
        this.LLIZ.removeCallbacksAndMessages(null);
        Hl();
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.pv0(MultiGuestUpdateGuestCameraStatusEvent.class);
            this.LLILZ.qv0(ApplyTypeChangeEvent.class, TXF.SEND_REQUEST);
        }
        if (C74740TUy.LIZLLL().LJFF != null) {
            C19680pw c19680pw = new C19680pw(C74740TUy.LIZLLL().LJFF, "liveinteract", "", false);
            DataChannel dataChannel2 = this.LLILZ;
            if (dataChannel2 != null) {
                dataChannel2.qv0(MultiGuestSelectedStickerEvent.class, c19680pw);
            }
        }
        if (this.mLinkDataHolder != null && !Pl()) {
            MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
            if (!multiGuestDataHolder.LJJIJIIJIL) {
                multiGuestDataHolder.LJJIJIL = null;
            }
        }
        boolean z = true;
        if (C19N.LIZLLL()) {
            if (!this.LLJILLL || !Rl()) {
                Object obj = this.LLJJIII;
                if (obj instanceof SurfaceView) {
                    View view = (View) obj;
                    ViewGroup viewGroup = this.LLJJI;
                    if (viewGroup == null || viewGroup.getChildCount() == 0) {
                        DataChannel dataChannel3 = this.LLILZ;
                        if (dataChannel3 != null) {
                            dataChannel3.pv0(RealGoLivePreviewDestroyEvent.class);
                        }
                    } else {
                        FrameLayout frameLayout = this.LLII;
                        if (frameLayout != null) {
                            C16880lQ.LJLLLL(view, frameLayout);
                        }
                        if (view.getParent() == null && (view.getTag() instanceof FrameLayout.LayoutParams)) {
                            view.setLayoutParams((ViewGroup.LayoutParams) view.getTag());
                            this.LLJJI.addView(view, 1);
                            vm(this.LLJJI, false);
                        }
                        MultiGuestDataHolder multiGuestDataHolder2 = this.mLinkDataHolder;
                        if (multiGuestDataHolder2 != null) {
                            multiGuestDataHolder2.LJJJJ = null;
                        } else {
                            C32014ChO.LJIIIZ(Tl(), "setLinkViewLayoutParams(null) failed for mLinkDataHolder is null");
                        }
                        this.LLJJI = null;
                    }
                }
                if (!Ol() || (c74749TVh = this.LLJJJJJIL) == null || !c74749TVh.LIZJ()) {
                    FrameLayout frameLayout2 = this.LLII;
                    if (frameLayout2 != null) {
                        C16880lQ.LJLLLL((View) this.LJLJJL, frameLayout2);
                    }
                    if (this.LLILZ != null && this.LLF.booleanValue()) {
                        this.LLILZ.pv0(RealGoLivePreviewDestroyEvent.class);
                    }
                }
            }
        } else {
            Object obj2 = this.LLJJIII;
            if (obj2 instanceof SurfaceView) {
                View view2 = (View) obj2;
                ViewGroup viewGroup2 = this.LLJJI;
                if (viewGroup2 != null && viewGroup2.getChildCount() != 0) {
                    FrameLayout frameLayout3 = this.LLII;
                    if (frameLayout3 != null) {
                        C16880lQ.LJLLLL(view2, frameLayout3);
                    }
                    if (view2.getParent() == null) {
                        view2.setLayoutParams(this.LLJJ);
                        this.LLJJI.addView(view2, 1);
                        sm(this.LLJJI, false);
                    }
                    this.LLJJI = null;
                }
            }
        }
        if (C74740TUy.LIZLLL().LJIIJJI != 1) {
            z = false;
        }
        this.LLIL = z;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        fm();
        C88207Yjb.LJIJI("multi_guest_guest_preview_page");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C32014ChO.LIZIZ(Tl(), "onPause");
        if (!LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C32014ChO.LIZIZ(Tl(), "doPauseActionFromOnPause");
            Il();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC75441TjB R6;
        super.onResume();
        this.LLJILJIL = false;
        C74736TUu.LIZ.LJIL(0, "camera_preview_view_show", new JSONObject(), false);
        boolean z = true;
        if (this.mLinkDataHolder != null) {
            if (Pl()) {
                String str = LLJZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setUpAudioStateWhenOnResume enable=");
                LIZ.append(this.mLinkDataHolder.LIZLLL);
                LIZ.append(" ");
                LIZ.append(Kl());
                C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
                if (this.mLinkDataHolder.LIZLLL) {
                    mm("business_mute_open_preview_panel");
                } else {
                    lm("business_mute_open_preview_panel");
                }
            } else {
                boolean z2 = this.mLinkDataHolder.LIZLLL;
                this.LLILII = z2;
                Vl("business_mute_open_preview_panel", !z2);
                if (!LinkMicMultiGuestPreviewFragmentMuteFixSetting.INSTANCE.getValue() && (R6 = C8E.LJ().R6()) != null) {
                    R6.LIZLLL().LIZIZ(Boolean.TRUE, "LiveCore.setAudioMute", "business_mute_open_preview_panel", "just for fake audio capture");
                }
            }
        }
        this.LLJILJIL = false;
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            if (multiGuestDataHolder.LJJIJL == 2) {
                z = false;
            }
        } else {
            C32014ChO.LJIIIZ(Tl(), "getPreviewSettingState() failed for mLinkDataHolder is null");
        }
        wl(z, C78857UxB.LJJIIJ(1476788234, "bpea-1225"), "business_mute_resume_preview_panel");
        if (C74740TUy.LIZLLL().LJ() && this.LLJJIJI && this.LLJJIJIIJIL) {
            this.LLJJIJI = false;
            this.LLJJIJIIJIL = false;
            Hl();
            em();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C32014ChO.LIZIZ(Tl(), "onStop");
        if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
            C32014ChO.LIZIZ(Tl(), "doPauseActionFromOnStop");
            Il();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ym() {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment.ym():void");
    }

    @Override // X.TY2
    public final LiveDialogFragment getDialog() {
        return this.LLILIL;
    }

    public static /* synthetic */ C76800UCe vl(MultiGuestPreviewFragment multiGuestPreviewFragment) {
        AbstractC74908Taa abstractC74908Taa;
        boolean z;
        multiGuestPreviewFragment.qm();
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "replyAnchor");
        C74838TYs.LJ().LJIIIZ(true);
        MultiGuestDataHolder multiGuestDataHolder = multiGuestPreviewFragment.mLinkDataHolder;
        if (multiGuestDataHolder != null && (abstractC74908Taa = multiGuestPreviewFragment.LLILL) != null) {
            if (abstractC74908Taa.LJII() != 2) {
                z = true;
            } else {
                z = false;
            }
            multiGuestDataHolder.LJ = z;
        } else {
            C32014ChO.LJIIIZ(multiGuestPreviewFragment.Tl(), "setVideoEnable failed for mLinkDataHolder is null");
        }
        C74740TUy.LIZLLL().LJI(1);
        multiGuestPreviewFragment.LLJJIJIIJIL = true;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC08120To
    public final void L0(EffectChannelResponse effectChannelResponse) {
        ((IEffectService) CN1.LIZ(IEffectService.class)).composerManager().LJIIJ(effectChannelResponse);
        ((InterfaceC29205BdB) AbstractC73672Svk.LJJIIZ(effectChannelResponse.getAllCategoryEffects()).LJJIJL(new C278617m(1)).LJJLIL().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZLLL(C73933Szx.LIZJ(this.LJZI))).LIZJ(new AfS36S0101000_5(0, this, 32), new AfS36S0101000_5(0, this, 33));
    }

    public final void Ml(List<LiveEffect> list) {
        if (list.isEmpty()) {
            list.add(new LiveEffect());
            return;
        }
        ListProtector.add(list, 0, new LiveEffect());
        this.LLILLJJLI = new C76535U1z(getContext(), list, new C74911Tad(this), false, this.LLILZ);
        RecyclerView recyclerView = this.LJZI;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            this.LJZI.setAdapter(this.LLILLJJLI);
            this.LLFF = new C76104Tts(0, this.LJZI, new AObjectS143S0100000_13(this, 6));
        }
    }

    public final void Sl(String str) {
        C74751TVj.LJII(str, this.LLJJL);
    }

    public final void Yl(int i) {
        AbstractC74908Taa abstractC74908Taa = this.LLILL;
        if (abstractC74908Taa != null) {
            abstractC74908Taa.LJIIL(i);
        }
        this.LJLJJL.LJIIIZ(i);
        if (i != C74740TUy.LIZLLL().LJ) {
            this.LLJI = true;
        }
        C74740TUy.LIZLLL().LJ = i;
        Sl("select_pattern");
    }

    public final void Zl(LiveEffect liveEffect) {
        AbstractC74908Taa abstractC74908Taa = this.LLILL;
        if (abstractC74908Taa == null || !TextUtils.equals(liveEffect.realId, abstractC74908Taa.LJFF())) {
            this.LLILL.LJIILL(liveEffect.realId);
            InterfaceC31971Nh composerManager = ((IEffectService) CN1.LIZ(IEffectService.class)).composerManager();
            String str = C0TY.LIZJ;
            composerManager.LIZLLL(str);
            if (TextUtils.equals(liveEffect.realId, "")) {
                this.LLILL.LJIILIIL(null);
            } else {
                ((IEffectService) CN1.LIZ(IEffectService.class)).composerManager().LIZIZ(liveEffect, str);
                this.LLILL.LJIILIIL(liveEffect);
            }
        }
        Sl("select_pattern");
        InterfaceC17140lq interfaceC17140lq = (InterfaceC17140lq) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_REVIEW_MANAGER");
        if (interfaceC17140lq != null) {
            if (liveEffect.getResourceId().equals("")) {
                interfaceC17140lq.LIZJ();
            } else {
                interfaceC17140lq.LJIIIIZZ(liveEffect);
            }
        }
    }

    public final void lm(String str) {
        DataChannel dataChannel;
        this.LLILII = false;
        Vl(str, true);
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LIZLLL = this.LLILII;
            if (Pl() && (dataChannel = this.LLILZ) != null) {
                dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.mLinkDataHolder.LIZLLL, str));
                return;
            }
            return;
        }
        C0NB.LJIIIZ(LLJZ, "mLinkDataHolder == null when switchAudio2Mute");
    }

    public final void mm(String str) {
        DataChannel dataChannel;
        this.LLILII = true;
        Vl(str, false);
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LIZLLL = this.LLILII;
            if (Pl() && (dataChannel = this.LLILZ) != null) {
                dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(this.mLinkDataHolder.LIZLLL, str));
            }
        }
    }

    public final void om(String str) {
        String str2;
        DataChannel dataChannel;
        if (this.mLinkDataHolder == null) {
            return;
        }
        C75425Tiv c75425Tiv = this.LLJLILLLLZIIL;
        if (c75425Tiv != null) {
            c75425Tiv.LJIIJJI = false;
        }
        C74951TbH.LJFF(1, "business_mute_click_preview_panel".equals(str));
        this.LLJJL = "audio";
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        multiGuestDataHolder.LJJIJL = 2;
        multiGuestDataHolder.LJ = false;
        multiGuestDataHolder.LJIILJJIL(C74838TYs.LJ().LIZLLL(), true);
        this.LLIL = false;
        nm(false, C78857UxB.LJJIIJ(1476788483, "bpea-1229"), str);
        if (!C30784C6i.LIZJ() && !Ql()) {
            if (C19N.LIZLLL() && this.LJLLJ != null && this.LJLLL != null) {
                if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                    km(8, this.LJLLJ);
                } else {
                    km(4, this.LJLLJ);
                }
                km(8, this.LLIIIZ);
                km(8, this.LLIIJI);
                DataChannel dataChannel2 = this.LJLLL.LJLLILLLL;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(MultiGuestPreviewCameraOpenEvent.class, Boolean.FALSE);
                }
            } else {
                C76104Tts c76104Tts = this.LLFF;
                if (c76104Tts != null) {
                    c76104Tts.LIZIZ();
                }
                km(8, this.LLIIIZ);
                km(8, this.LJLLJ);
                km(8, this.LLIIJI);
            }
        }
        km(0, this.LJZL);
        if (this.LJZL != null) {
            if ((LinkMicMultiGuestPreviewPanelEffectOptSetting.INSTANCE.getValue() == 1 || !LinkMicMultiGuestPreviewPanelDefaultVideoSetting.INSTANCE.isControlGroup()) && this.mLinkDataHolder.LJJIJLIJ != 2) {
                this.LJZL.setText(R.string.nfd);
            } else {
                this.LJZL.setText(R.string.n9_);
            }
        }
        if (!C30784C6i.LIZJ()) {
            if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                km(8, this.LJLLILLLL);
            } else {
                km(4, this.LJLLILLLL);
            }
            km(8, this.LJZ);
            km(8, this.LJZI);
        } else {
            C47121t6 c47121t6 = this.LJZL;
            if (c47121t6 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c47121t6.getLayoutParams();
                marginLayoutParams.topMargin = C15380j0.LIZ(16.0f);
                this.LJZL.setLayoutParams(marginLayoutParams);
            }
        }
        km(4, this.LL);
        if (Pl() && (dataChannel = this.LLILZ) != null) {
            dataChannel.qv0(MultiLiveGuestMuteVideoEvent.class, new C74632TQu(this.LLIL, str));
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (C19N.LIZLLL() && this.LLILZ != null && R6 != null && R6.LIZIZ() == 5 && !Rl() && (str2 = this.mLinkDataHolder.LJJJJI) != null) {
            C74824TYe.LIZ.LJJJLL(str2, "guest_icon", "", C74740TUy.LIZLLL().LJFF, C74740TUy.LIZLLL().LJ, !r1.LIZLLL, !r1.LJ, this.mLinkDataHolder.LJIIIIZZ, false, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2;
        String str;
        MultiGuestDataHolder multiGuestDataHolder;
        String str2;
        final String str3;
        C74749TVh c74749TVh;
        MultiGuestDataHolder multiGuestDataHolder2;
        User user;
        String LJIILL;
        int id = view.getId();
        if (id != R.id.dxe) {
            if (Rl() && (c74749TVh = this.LLJJJJJIL) != null && c74749TVh.LJI && ((multiGuestDataHolder2 = this.mLinkDataHolder) == null || multiGuestDataHolder2.LJJIJLIJ != 2 || id == R.id.fhw)) {
                C29306Beo.LJJJJI(this.LLILZLL);
                this.LLD.setText(R.string.nah);
                Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.LLILZ);
                if (LJJIJLIJ != null) {
                    user = LJJIJLIJ.getOwner();
                } else {
                    user = null;
                }
                String LIZ = C05170If.LIZ(user);
                if (!LIZ.isEmpty() && (LJIILL = C15380j0.LJIILL(R.string.n9e, LIZ)) != null && !LJIILL.isEmpty()) {
                    this.LLFII.setText(Ll(LIZ, LJIILL));
                }
            }
            if (id == R.id.fgr) {
                Al();
                return;
            }
            if (id == R.id.fhw) {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null && room.getOwner() != null) {
                    MultiGuestDataHolder multiGuestDataHolder3 = this.mLinkDataHolder;
                    if (multiGuestDataHolder3 != null && !multiGuestDataHolder3.LJ) {
                        str3 = "voice";
                    } else {
                        str3 = "video";
                    }
                    C77437UaH c77437UaH = new C77437UaH(getContext());
                    c77437UaH.LJI(R.string.n8v);
                    c77437UaH.LIZIZ(R.string.n8t);
                    c77437UaH.LIZJ(R.string.n8s, new DialogInterface.OnClickListener() { // from class: X.TVl
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            String str4 = str3;
                            dialogInterface.dismiss();
                            C74751TVj.LIZIZ(str4, "click", "cancel");
                        }
                    }, false);
                    c77437UaH.LJ(R.string.n8u, new DialogInterface.OnClickListener() { // from class: X.CeO
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            TQH tqh;
                            TQG tqg;
                            MultiGuestPreviewFragment multiGuestPreviewFragment = MultiGuestPreviewFragment.this;
                            String str4 = str3;
                            multiGuestPreviewFragment.getClass();
                            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveStickerLogManager();
                            C32041No.LJIL();
                            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveStickerLogManager();
                            C32041No.LJIIJ();
                            dialogInterface.dismiss();
                            C74749TVh c74749TVh2 = multiGuestPreviewFragment.LLJJJJJIL;
                            if (c74749TVh2 != null) {
                                if (c74749TVh2.LIZIZ() && (tqg = multiGuestPreviewFragment.LLJJJJJIL.LJ) != null) {
                                    tqg.LIZIZ(10043, "leave_source_user_click_cancel_in_preview");
                                    multiGuestPreviewFragment.qm();
                                } else if (multiGuestPreviewFragment.LLJJJJJIL.LIZ() && (tqh = multiGuestPreviewFragment.LLJJJJJIL.LJFF) != null) {
                                    tqh.LIZIZ(10044, "leave_source_user_click_cancel_in_preview");
                                    multiGuestPreviewFragment.qm();
                                }
                                multiGuestPreviewFragment.LLJILLL = true;
                                multiGuestPreviewFragment.Hl();
                            }
                            C74751TVj.LIZIZ(str4, "click", "end_now");
                            multiGuestPreviewFragment.Gl();
                        }
                    }, false);
                    this.LLIZLLLIL = c77437UaH.LIZ();
                    C74751TVj.LIZIZ(str3, "show", CardStruct.IStatusCode.DEFAULT);
                    if (C19N.LIZLLL()) {
                        C78866UxK.LJIJI(this.LLIZLLLIL, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
                    }
                    DialogC77438UaI dialogC77438UaI = this.LLIZLLLIL;
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "7821847150860265132")).LIZ) {
                        dialogC77438UaI.show();
                    }
                }
                Sl("cancel_link");
                return;
            }
        }
        if (id == R.id.b3h) {
            if (!this.LLIL) {
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder4 = this.mLinkDataHolder;
            if (multiGuestDataHolder4 == null) {
                C32014ChO.LJIIIZ(Tl(), "camera switch failed for mLinkDataHolder is null");
                return;
            }
            boolean z = !multiGuestDataHolder4.LJIIIIZZ;
            multiGuestDataHolder4.LJIIIIZZ = z;
            if (z) {
                C31014CFe.LJJIIJZLJL = 2;
            } else {
                C31014CFe.LJJIIJZLJL = 1;
            }
            InterfaceC24140x8 interfaceC24140x8 = this.LJLJJL;
            if (interfaceC24140x8 == null) {
                return;
            }
            interfaceC24140x8.LIZIZ(C78857UxB.LJJIIJ(1476788234, "bpea-1224"));
            return;
        }
        if (id == R.id.ahz) {
            pm("business_mute_click_preview_panel");
            Sl("switch_tab");
            return;
        }
        if (id == R.id.kka) {
            this.LLIL = true;
            this.LLJJL = "props";
            nm(true, C78857UxB.LJJIIJ(1476788234, "bpea-1230"), "business_mute_click_preview_panel");
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (C19N.LIZLLL() && this.LLILZ != null && R6 != null && R6.LIZIZ() == 5 && !Rl() && (multiGuestDataHolder = this.mLinkDataHolder) != null && (str2 = multiGuestDataHolder.LJJJJI) != null) {
                C74824TYe.LIZ.LJJJLL(str2, "guest_icon", "props", C74740TUy.LIZLLL().LJFF, C74740TUy.LIZLLL().LJ, !r1.LIZLLL, !r1.LJ, this.mLinkDataHolder.LJIIIIZZ, false, 0);
            }
            Sl("switch_tab");
            return;
        }
        if (id == R.id.n8p) {
            this.LLIL = !this.LLIL;
            if (this.mLinkDataHolder != null) {
                if (!this.LLJJJJLIIL.equals("guest_click_entrance_icon")) {
                    str = this.mLinkDataHolder.LJJJJI;
                } else {
                    str = "others";
                }
                C74824TYe.LIZ.LJJJJ("preview_page", str, this.LLIL, this.mLinkDataHolder.LJIIIIZZ);
            }
            if (this.LLIL) {
                MultiGuestDataHolder multiGuestDataHolder5 = this.mLinkDataHolder;
                if (multiGuestDataHolder5 != null) {
                    if (multiGuestDataHolder5.LJJIJLIJ == 2) {
                        C30868C9o.LIZJ(R.string.nep);
                        this.LLIL = !this.LLIL;
                    }
                } else {
                    C32014ChO.LJIIIZ(Tl(), "getGuestLinkMicPermission() failed for mLinkDataHolder is null");
                }
                pm("business_mute_click_preview_panel");
                C75425Tiv c75425Tiv = this.LLJLILLLLZIIL;
                if (c75425Tiv != null && (multiGuestEffectSwitchFragment2 = this.LJLLL) != null) {
                    c75425Tiv.LJIILIIL(multiGuestEffectSwitchFragment2.xl(), this.LJLLL.wl());
                }
            } else {
                om("business_mute_click_preview_panel");
                C75425Tiv c75425Tiv2 = this.LLJLILLLLZIIL;
                if (c75425Tiv2 != null && (multiGuestEffectSwitchFragment = this.LJLLL) != null) {
                    c75425Tiv2.LJIILJJIL(multiGuestEffectSwitchFragment.xl(), this.LJLLL.wl());
                }
            }
            Sl("switch_camera");
            return;
        }
        if (id == R.id.dxe) {
            this.LLJJJIL = "connection";
            this.LLJJJ = "confirm_icon";
            em();
            Sl("go_live");
            return;
        }
        if (id != R.id.f6y) {
            return;
        }
        String str4 = LLJZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onClickMicBtn#isAudioSwitchOn ");
        LIZ2.append(this.LLILII);
        LIZ2.append(" to ");
        LIZ2.append(!this.LLILII);
        LIZ2.append(Kl());
        C0NB.LJIIIZ(str4, X1D.LIZIZ(LIZ2));
        if (this.LLILII) {
            lm("business_mute_click_preview_panel");
        } else {
            mm("business_mute_click_preview_panel");
        }
        MultiGuestDataHolder multiGuestDataHolder6 = this.mLinkDataHolder;
        if (multiGuestDataHolder6 != null) {
            C74824TYe.LIZ.LJJ(multiGuestDataHolder6.LJJIJ, multiGuestDataHolder6.LJJJJI, "preview_page", !multiGuestDataHolder6.LIZLLL);
        }
        Sl("switch_mute_setting");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7821847150860265132");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/previewv1/MultiGuestPreviewFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/previewv1/MultiGuestPreviewFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        C0NB.LIZIZ(LLJZ, "onHiddenChanged hidden:" + z);
        if (!z) {
            this.LLJJLIIIJLLLLLLLZ = true;
            hm();
        } else {
            this.LLJL = true;
            fm();
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/previewv1/MultiGuestPreviewFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.LLJI) {
            C75460TjU.LIZLLL(C74740TUy.LIZLLL().LJ, "video_anchor_connect_page");
            this.LLJI = false;
        }
    }

    public final void pm(String str) {
        String str2;
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment;
        if (this.mLinkDataHolder == null) {
            return;
        }
        C74838TYs.LJ().LJIJ = true;
        C75425Tiv c75425Tiv = this.LLJLILLLLZIIL;
        if (c75425Tiv != null) {
            c75425Tiv.LJIIJJI = true;
        }
        C74951TbH.LJFF(2, "business_mute_click_preview_panel".equals(str));
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        multiGuestDataHolder.LJJIJL = 1;
        multiGuestDataHolder.LJ = true;
        if (!C30784C6i.LIZJ() && !Ql()) {
            if (C19N.LIZLLL() && this.LJLLJ != null && (multiGuestEffectSwitchFragment = this.LJLLL) != null) {
                multiGuestEffectSwitchFragment.Gl();
                km(0, this.LJLLJ);
                if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                    km(8, this.LJLLILLLL);
                } else {
                    km(4, this.LJLLILLLL);
                }
                if (this.LJLLL.xl()) {
                    km(0, this.LLIIIZ);
                }
                if (this.LJLLL.wl()) {
                    km(0, this.LLIIJI);
                }
            } else {
                C76104Tts c76104Tts = this.LLFF;
                if (c76104Tts != null) {
                    c76104Tts.LIZJ(true);
                }
                km(8, this.LLIIIZ);
                km(8, this.LLIIJI);
                km(8, this.LJLLJ);
            }
        }
        this.mLinkDataHolder.LJIILJJIL(C74838TYs.LJ().LIZLLL(), false);
        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788234, "bpea-1231");
        this.LLIL = true;
        InterfaceC74605TPt interfaceC74605TPt = this.LLJJIII;
        if (interfaceC74605TPt != null) {
            interfaceC74605TPt.LJII();
        }
        this.LLJJL = "enhance";
        nm(true, LJJIIJ, str);
        km(8, this.LJZL);
        km(0, this.LL);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (C19N.LIZLLL() && this.LLILZ != null && R6 != null && R6.LIZIZ() == 5 && !Rl() && (str2 = this.mLinkDataHolder.LJJJJI) != null) {
            C74824TYe.LIZ.LJJJLL(str2, "guest_icon", "enhance", C74740TUy.LIZLLL().LJFF, C74740TUy.LIZLLL().LJ, !r1.LIZLLL, !r1.LJ, this.mLinkDataHolder.LJIIIIZZ, false, 0);
        }
    }

    public final void xm(int i) {
        User user;
        String LJIILL;
        if (this.LLFII != null && this.LLILZ != null && Rl()) {
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.LLILZ);
            if (LJJIJLIJ != null) {
                user = LJJIJLIJ.getOwner();
            } else {
                user = null;
            }
            String LIZ = C05170If.LIZ(user);
            if (LIZ.isEmpty() || (LJIILL = C15380j0.LJIILL(i, LIZ)) == null || LJIILL.isEmpty()) {
                return;
            }
            SpannableString Ll = Ll(LIZ, LJIILL);
            km(0, this.LLFII);
            this.LLFII.setEllipsize(TextUtils.TruncateAt.END);
            if (this.LLJJJJJIL != null && (this.LLFII.getLayoutParams() instanceof C018905p)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLFII.getLayoutParams();
                if (this.LLJJJJJIL.LIZLLL) {
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(48.0f));
                } else {
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(16.0f));
                }
                this.LLFII.setLayoutParams(marginLayoutParams);
            }
            this.LLFII.setText(Ll);
            this.LLFII.setMaxLines(3);
        }
    }

    public static void sm(ViewGroup viewGroup, boolean z) {
        View childAt;
        if (viewGroup.getChildCount() <= 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount >= 0) {
                childAt = viewGroup.getChildAt(childCount);
            } else {
                return;
            }
        } while (childAt.getVisibility() != 0);
        if (z) {
            childAt.setBackgroundColor(C15380j0.LIZIZ(R.color.a8n));
        } else {
            childAt.setBackgroundColor(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vm(ViewGroup viewGroup, boolean z) {
        if (viewGroup.getChildCount() <= 0 || !(viewGroup instanceof InterfaceC75787Tol)) {
            return;
        }
        List<InterfaceC75179Tex> allLayoutWindows = ((InterfaceC75787Tol) viewGroup).getAllLayoutWindows();
        if (allLayoutWindows.isEmpty()) {
            return;
        }
        for (InterfaceC75179Tex interfaceC75179Tex : allLayoutWindows) {
            if (interfaceC75179Tex.LJLJJLL() instanceof InterfaceC24140x8) {
                if (z) {
                    interfaceC75179Tex.LJJIJIL().setBackgroundColor(C15380j0.LIZIZ(R.color.a8n));
                    return;
                } else {
                    interfaceC75179Tex.LJJIJIL().setBackgroundColor(0);
                    return;
                }
            }
        }
    }

    public final SpannableString Ll(String str, String str2) {
        SpannableString spannableString = new SpannableString(str2);
        int indexOf = str2.indexOf(str);
        if (indexOf == -1) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            String str3 = LLJZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateTitleText error. anchorName=");
            LIZ.append(str);
            LIZ.append(" titleText= ");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LIZ(str3, LIZIZ);
        }
        int length = str.length() + indexOf;
        try {
            C23010vJ.LIZJ(getContext(), spannableString, indexOf, length, 33, 4, 600);
        } catch (Exception unused) {
            C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
            String str4 = LLJZ;
            StringBuilder LIZJ = C06460Ne.LIZJ("updateTitleText error. start=", indexOf, " end=", length, " string=");
            LIZJ.append((Object) spannableString);
            String LIZIZ2 = X1D.LIZIZ(LIZJ);
            LJIILIIL2.getClass();
            C0NE.LIZ(str4, LIZIZ2);
        }
        if (indexOf > 0 && indexOf < str2.length()) {
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.abd)), 0, indexOf, 33);
        }
        if (length < str2.length() && length > 0) {
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.abd)), length, str2.length(), 33);
        }
        return spannableString;
    }

    public final void Vl(String str, boolean z) {
        if (z) {
            ImageView imageView = this.LLIIIJ;
            if (imageView != null) {
                imageView.setBackground(C15380j0.LJI(R.drawable.cxj));
            }
        } else {
            ImageView imageView2 = this.LLIIIJ;
            if (imageView2 != null) {
                imageView2.setBackground(C15380j0.LJI(R.drawable.cxi));
            }
        }
        if (Pl() && this.LJLJJL != null) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null) {
                R6.LIZLLL().LIZIZ(Boolean.valueOf(z), "LiveCore.setAudioMute", str, "just for fake audio capture");
            }
            ((InterfaceC74605TPt) this.LJLJJL).LJFF(z, C78857UxB.LJJIIJ(1476788483, "bpea-801"));
        }
    }

    public final void km(int i, View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
            ViewGroup.LayoutParams layoutParams = this.LLII.getLayoutParams();
            if (layoutParams instanceof C018905p) {
                C018905p c018905p = new C018905p(C15380j0.LIZ(200.0f), C15380j0.LIZ(260.0f));
                c018905p.leftToLeft = 0;
                c018905p.rightToRight = 0;
                c018905p.topToBottom = this.LLFFF.getId();
                c018905p.bottomToTop = this.LLIILII.getId();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = marginLayoutParams.bottomMargin;
                this.LLII.setLayoutParams(c018905p);
            }
        }
        InterfaceC08130Tp interfaceC08130Tp = this.LLILLIZIL;
        ym();
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJI("apply");
            int i = this.mLinkDataHolder.LJJIJL;
            if (C74740TUy.LIZLLL().LJ()) {
                if (this.mLinkDataHolder.LJ) {
                    i = 1;
                } else {
                    i = 2;
                }
            }
            if (!MultiGuestPreviewCameraMemorySettings.INSTANCE.getValue()) {
                this.mLinkDataHolder.LJIIIIZZ = false;
                C31014CFe.LJJIIJZLJL = 1;
            }
            MultiGuestDataHolder multiGuestDataHolder2 = this.mLinkDataHolder;
            if (multiGuestDataHolder2.LJJIJLIJ == 2) {
                multiGuestDataHolder2.LJJIJL = 2;
                i = 2;
            }
            if (i != 1) {
                if (i == 2) {
                    this.LLIL = false;
                    om("business_mute_open_preview_panel");
                }
            } else {
                pm("business_mute_open_preview_panel");
            }
        }
        C31778Cda c31778Cda = this.LJZ;
        if (c31778Cda != null) {
            c31778Cda.setCurrentProgress(C74740TUy.LIZLLL().LJ);
        }
        TextView textView = this.LJLLLL;
        if (textView != null) {
            textView.setText(C44384HbQ.LJJJZ());
        }
        C75211TfT c75211TfT = new C75211TfT(this.LLIIZ, this.LJLJJL, this, new C0WD() { // from class: X.Taz
            @Override // X.C0WD
            public final void Z00(LiveEffect liveEffect, String str, boolean z) {
                if (z) {
                    C74740TUy.LIZLLL().LJFF = liveEffect;
                } else {
                    C74740TUy.LIZLLL().LJFF = new LiveEffect();
                }
            }
        }, this.LLJLILLLLZIIL);
        this.LLJILJILJ = c75211TfT;
        c75211TfT.LIZ(true);
        try {
            requireActivity().getOnBackPressedDispatcher().LIZ(this, new C74925Tar(this));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        hm();
        C74614TQc.LIZ().LIZJ(view);
    }

    public final void nm(boolean z, C78862UxG c78862UxG, String str) {
        int i;
        String LIZLLL;
        DataChannel dataChannel;
        if (this.mLinkDataHolder == null) {
            return;
        }
        wl(z, c78862UxG, str);
        this.mLinkDataHolder.LJ = z;
        C74740TUy LIZLLL2 = C74740TUy.LIZLLL();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        LIZLLL2.LJIIJJI = i;
        MultiGuestDataHolder mDataHolder = this.mLinkDataHolder;
        o.LJIIIZ(mDataHolder, "mDataHolder");
        if (C74740TUy.LIZLLL().LJIIJJI == 2) {
            String LIZLLL3 = C74838TYs.LJ().LIZLLL();
            if (LIZLLL3 != null) {
                mDataHolder.LJIILJJIL(LIZLLL3, true);
            }
        } else if (C74740TUy.LIZLLL().LJIIJJI == 1 && (LIZLLL = C74838TYs.LJ().LIZLLL()) != null) {
            mDataHolder.LJIILJJIL(LIZLLL, false);
        }
        if (Pl() && (dataChannel = this.LLILZ) != null) {
            dataChannel.qv0(MultiLiveGuestMuteVideoEvent.class, new C74632TQu(this.mLinkDataHolder.LJ, str));
        }
        if (z) {
            this.LJLL.setBackground(C15380j0.LJI(R.drawable.d10));
            this.LJLLI.setBackground(C15380j0.LJI(R.drawable.d00));
            this.LJLLI.setEnabled(true);
            this.LJLJJI.setVisibility(4);
            this.LJLJLJ.setVisibility(4);
            this.LJLJLJ.LJ();
            this.LJLJLLL.setVisibility(4);
            this.LLILL.LJIILLIIL(1);
            return;
        }
        this.LJLL.setBackground(C15380j0.LJI(R.drawable.d0y));
        this.LJLLI.setBackground(C15380j0.LJI(R.drawable.czy));
        this.LJLLI.setEnabled(false);
        this.LJLJJI.setVisibility(0);
        this.LJLJLJ.setVisibility(0);
        this.LJLJLJ.LJII();
        if (!this.LLILLL) {
            ImageModel LJI = this.LLILL.LJI();
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(LJI.getUrls());
                LIZ.LIZIZ(0.74698794f);
                LIZ.LJIIJJI(this.LJLJJI);
                C78720Uuy LIZ2 = C15650jR.LIZ().LIZ(LJI.getUrls());
                int width = this.LJLJLLL.getWidth();
                int height = this.LJLJLLL.getHeight();
                LIZ2.LJ = width;
                LIZ2.LJFF = height;
                LIZ2.LJIIIIZZ = R.drawable.cuk;
                LIZ2.LJIIJJI(this.LJLJLLL);
            } else {
                C31665Cbl.LJFF(this.LJLJJI, LJI, new C78739UvH(0.74698794f));
                ImageView imageView = this.LJLJLLL;
                C31665Cbl.LJIIJ(imageView, LJI, imageView.getWidth(), this.LJLJLLL.getHeight(), R.drawable.cuk);
            }
            this.LLILLL = true;
        }
        this.LJLJLLL.setVisibility(0);
        this.LLILL.LJIILLIIL(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC24140x8 interfaceC24140x8;
        Object obj;
        InterfaceC31981Ni interfaceC31981Ni;
        FrameLayout frameLayout;
        View view;
        o.LJIIIZ(inflater, "inflater");
        C74614TQc.LIZ().LJ();
        C88207Yjb.LJIILIIL("multi_guest_guest_preview_page");
        int i = 1;
        C74838TYs.LJ().LJIJJ = true;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d51, viewGroup, false);
        C74614TQc.LIZ().LIZLLL();
        this.LJLJI = (ViewGroup) LLLLIILL.findViewById(R.id.i2w);
        this.LLII = (FrameLayout) LLLLIILL.findViewById(R.id.i2k);
        this.LLIIII = LLLLIILL.findViewById(R.id.i2y);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.i1z);
        this.LJLJJI = (C47061t0) LLLLIILL.findViewById(R.id.abo);
        this.LJLJL = (C29701Eo) LLLLIILL.findViewById(R.id.a_4);
        this.LJLJLJ = (C2A4) LLLLIILL.findViewById(R.id.a_5);
        this.LJLJLLL = (ImageView) LLLLIILL.findViewById(R.id.abh);
        this.LJLL = LLLLIILL.findViewById(R.id.n8p);
        this.LJLLI = LLLLIILL.findViewById(R.id.b3h);
        this.LJLLILLLL = LLLLIILL.findViewById(R.id.hfh);
        this.LJLLJ = (FrameLayout) LLLLIILL.findViewById(R.id.csl);
        this.LJLLLL = (TextView) LLLLIILL.findViewById(R.id.ahz);
        this.LJLLLLLL = (TextView) LLLLIILL.findViewById(R.id.kka);
        this.LJLZ = LLLLIILL.findViewById(R.id.el4);
        this.LJZ = (C31778Cda) LLLLIILL.findViewById(R.id.ahy);
        this.LJZI = (RecyclerView) LLLLIILL.findViewById(R.id.kj2);
        this.LJZL = (C47121t6) LLLLIILL.findViewById(R.id.a_6);
        this.LLD = (C2A7) LLLLIILL.findViewById(R.id.dxe);
        this.LL = LLLLIILL.findViewById(R.id.n99);
        this.LLFFF = (ViewGroup) LLLLIILL.findViewById(R.id.fn0);
        this.LLFZ = (C47121t6) LLLLIILL.findViewById(R.id.mo6);
        this.LLI = LLLLIILL.findViewById(R.id.fgr);
        this.LLIFFJFJJ = LLLLIILL.findViewById(R.id.fhw);
        this.LLIIIILZ = LLLLIILL.findViewById(R.id.cdz);
        this.LLFII = (C47121t6) LLLLIILL.findViewById(R.id.moe);
        this.LLIIIJ = (ImageView) LLLLIILL.findViewById(R.id.f6y);
        this.LLIIIL = (C76923UGx) LLLLIILL.findViewById(R.id.k5p);
        this.LLIIIZ = (ConstraintLayout) LLLLIILL.findViewById(R.id.jkm);
        this.LLIIJI = (FrameLayout) LLLLIILL.findViewById(R.id.kgh);
        this.LLIIL = (FrameLayout) LLLLIILL.findViewById(R.id.kim);
        this.LLIIZ = (TextView) LLLLIILL.findViewById(R.id.kk_);
        this.LLIIJLIL = (FrameLayout) LLLLIILL.findViewById(R.id.kgi);
        this.LLIILII = (ViewGroup) LLLLIILL.findViewById(R.id.ap_);
        this.LLIILZL = (Space) LLLLIILL.findViewById(R.id.gjg);
        View findViewById = LLLLIILL.findViewById(R.id.hej);
        if (findViewById != null) {
            if (!MultiGuestV3GuestPreviewBugSetting.INSTANCE.isEnable() || !Rl()) {
                findViewById.setVisibility(0);
                C16880lQ.LJIIJ(new IDCListenerS10S0101000(1, this, 4), findViewById);
            } else {
                findViewById.setVisibility(8);
            }
        }
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LLII);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJJLL);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJJI);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LL);
        if (this.LLJIJIL.get() != null) {
            this.LLJJIII = this.LLJIJIL.get().getLiveVideoClient();
        }
        if (C19N.LIZLLL() && !C30784C6i.LIZJ() && !Ql()) {
            ConstraintLayout constraintLayout = this.LLIIIZ;
            FrameLayout frameLayout2 = this.LLIIJI;
            FrameLayout frameLayout3 = this.LLIIJLIL;
            if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                view = this.LLIIII;
            } else {
                view = this.LLII;
            }
            C75425Tiv c75425Tiv = new C75425Tiv(constraintLayout, frameLayout2, frameLayout3, view, (View) this.LJLJJL, this.LJLJI, this.LLIILZL, this.LLFFF, this.LJLLJ, this.LLIILII, new InterfaceC65784Pro() { // from class: X.Tb3
                @Override // X.InterfaceC65784Pro
                public final Object invoke() {
                    MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = MultiGuestPreviewFragment.this.LJLLL;
                    if (multiGuestEffectSwitchFragment != null) {
                        return Integer.valueOf(multiGuestEffectSwitchFragment.LJZL);
                    }
                    return 0;
                }
            });
            this.LLJLILLLLZIIL = c75425Tiv;
            c75425Tiv.LJIJ();
        }
        MultiGuestDataHolder multiGuestDataHolder = this.mLinkDataHolder;
        C29S c29s = null;
        if (multiGuestDataHolder == null) {
            Gl();
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            String str = LLJZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createAndAddSurfaceView fail. LinkInjector size is:");
            LIZ.append(C75559Tl5.LIZIZ.LIZJ().size());
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LIZ(str, LIZIZ);
            interfaceC24140x8 = null;
        } else {
            if (this.LLJJIII != null) {
                if (Pl()) {
                    if (C19N.LIZLLL()) {
                        dm();
                    } else {
                        cm();
                    }
                }
                this.mLinkDataHolder.LJJIJIIJI = true;
                this.LJLJJL = (InterfaceC24140x8) this.LLJJIII;
            } else {
                InterfaceC74605TPt createLinkVideoView = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLinkVideoView(getContext(), C74947TbD.LJII(multiGuestDataHolder, true, true, !multiGuestDataHolder.LJIIIIZZ ? 1 : 0), (InterfaceC17140lq) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_REVIEW_MANAGER"), this.LLILZ);
                MultiGuestDataHolder multiGuestDataHolder2 = this.mLinkDataHolder;
                multiGuestDataHolder2.LJJIJIIJI = false;
                multiGuestDataHolder2.LJJIJIL = createLinkVideoView;
                this.LJLJJL = (InterfaceC24140x8) createLinkVideoView;
            }
            InterfaceC74605TPt interfaceC74605TPt = this.LLJJIII;
            if ((interfaceC74605TPt instanceof SurfaceView) && ((View) interfaceC74605TPt).getParent() != null) {
                if (C19N.LIZLLL()) {
                    dm();
                } else {
                    cm();
                }
            }
            if (C19N.LIZLLL()) {
                FrameLayout frameLayout4 = this.LLII;
                if (frameLayout4 != null) {
                    frameLayout4.post(new ARunnableS14S0101000_10(0, this, 2));
                }
            } else {
                xl();
            }
            interfaceC24140x8 = this.LJLJJL;
        }
        if (LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting.INSTANCE.getValue()) {
            InterfaceC24140x8 interfaceC24140x82 = this.LJLJJL;
            if (interfaceC24140x82 != null) {
                obj = interfaceC24140x82.getAttachedComposerManager();
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC31981Ni) {
                interfaceC31981Ni = (InterfaceC31981Ni) obj;
            } else {
                interfaceC31981Ni = null;
            }
            if (Ql() && interfaceC31981Ni != null) {
                ((IEffectService) CN1.LIZ(IEffectService.class)).restoreMultiGuestEffectToLiveCoreForGuest(LifecycleOwnerKt.getLifecycleScope(this), interfaceC31981Ni);
            }
        }
        if (C30784C6i.LIZJ() || Ql()) {
            km(8, this.LLIIIZ);
            km(8, this.LLIIJI);
            km(8, this.LLIIJLIL);
            km(8, this.LJLLJ);
            km(8, this.LLIIL);
            km(8, this.LJLLILLLL);
            ViewGroup viewGroup2 = this.LLIILII;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, C15380j0.LIZ(66.0f), 0, 0);
            }
        } else if (C19N.LIZLLL() && this.LJLLL == null && (frameLayout = this.LJLLJ) != null) {
            km(0, frameLayout);
            if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                km(8, this.LJLLILLLL);
            } else {
                km(4, this.LJLLILLLL);
            }
            C74928Tau c74928Tau = this.LLJLL;
            C74915Tah c74915Tah = this.LLJLLIL;
            FrameLayout frameLayout5 = this.LLIIJI;
            FrameLayout frameLayout6 = this.LLIIJLIL;
            Integer valueOf = Integer.valueOf(R.id.kim);
            C75425Tiv c75425Tiv2 = this.LLJLILLLLZIIL;
            String Jl = Jl();
            LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
            boolean Rl = Rl();
            MultiGuestEffectSwitchFragment.LLI.getClass();
            this.LJLLL = C75209TfR.LIZ(interfaceC24140x8, c74928Tau, false, c74915Tah, frameLayout5, frameLayout6, valueOf, c75425Tiv2, 1, Jl, liveEffect, Rl);
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ2.LJIIJ(this.LJLLL, null, R.id.csl);
            LIZ2.LJII();
        } else {
            km(0, this.LJLLILLLL);
            km(8, this.LLIIIL);
            km(8, this.LJLLJ);
            if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                BU9.LIZ(Jl());
            } else {
                BU9.LJ = new AObjectS52S0101000_7(0, this, 14);
            }
        }
        this.LLILL.LIZ(this);
        C16880lQ.LJIIL(this.LJLJI, this);
        C16880lQ.LJIIJ(this, this.LLI);
        C16880lQ.LJIIJ(this, this.LLIFFJFJJ);
        C16880lQ.LJJIII(this.LLD, this);
        C16880lQ.LJIIJ(this, this.LJLL);
        C16880lQ.LJIIJ(this, this.LJLLI);
        C16880lQ.LJIJI(this.LJLLLL, this);
        C16880lQ.LJIJI(this.LJLLLLLL, this);
        this.LJZ.setSeekbarListener(this);
        C16880lQ.LJIILLIIL(this.LLIIIJ, this);
        this.LJLJL.setVisibility(8);
        this.LJLJLJ.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp"));
        this.LLILLIZIL = ((IEffectService) CN1.LIZ(IEffectService.class)).stickerPresenter();
        this.LLILL.LJIILL(C74740TUy.LIZLLL().LJIIIIZZ);
        this.LLILLL = false;
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.lv0(this, PreviewCloseCameraEvent.class, new AObjectS45S0101000_13(1, this, 6));
            dataChannel.lv0(this, PreviewHasPermissionEvent.class, new C31457CWf(i, this));
            dataChannel.lv0(this, MultiGuestStickerImageSelectedEvent.class, new AObjectS33S0000000_13(0));
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i < 0 || i > seekBar.getMax() || !z) {
            return;
        }
        Yl(i);
    }

    public final void wl(boolean z, C78862UxG c78862UxG, String str) {
        if (this.LJLJJL == null) {
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LIZLLL().LIZ(Boolean.valueOf(!z), str, "just for fake capture");
        }
        if (MultiGuestPreviewCameraMemorySettings.INSTANCE.getValue()) {
            this.LJLJJL.LIZ(this.mLinkDataHolder.LJIIIIZZ);
        }
        this.LJLJJL.LJIIJJI(c78862UxG, z);
    }

    public static MultiGuestPreviewFragment Wl(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog, DataChannel dataChannel, AbstractC74908Taa abstractC74908Taa, TXF txf, WeakReference weakReference, String str, C74749TVh c74749TVh) {
        MultiGuestPreviewFragment multiGuestPreviewFragment = new MultiGuestPreviewFragment();
        multiGuestPreviewFragment.LLILIL = multiLiveGuestUserInfoDialog;
        multiGuestPreviewFragment.LLILZ = dataChannel;
        multiGuestPreviewFragment.LLILL = abstractC74908Taa;
        multiGuestPreviewFragment.LLJLIL = txf;
        multiGuestPreviewFragment.LLJJJJLIIL = str;
        multiGuestPreviewFragment.LLJIJIL = weakReference;
        multiGuestPreviewFragment.LLJJJJJIL = c74749TVh;
        return multiGuestPreviewFragment;
    }
}

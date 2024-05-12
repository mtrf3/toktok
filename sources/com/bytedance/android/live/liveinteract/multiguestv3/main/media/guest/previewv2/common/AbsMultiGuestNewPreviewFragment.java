package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common;

import X.B83;
import X.C0NB;
import X.C15380j0;
import X.C15400j2;
import X.C15510jD;
import X.C15580jK;
import X.C15650jR;
import X.C16880lQ;
import X.C17280m4;
import X.C1B3;
import X.C24130x7;
import X.C28507BGt;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A4;
import X.C2A7;
import X.C30784C6i;
import X.C30868C9o;
import X.C31657Cbd;
import X.C31665Cbl;
import X.C32536Cpo;
import X.C47061t0;
import X.C47121t6;
import X.C58410MwA;
import X.C5H3;
import X.C65352Pkq;
import X.C74740TUy;
import X.C74824TYe;
import X.C74956TbM;
import X.C74958TbO;
import X.C74959TbP;
import X.C74961TbR;
import X.C74962TbS;
import X.C74964TbU;
import X.C75209TfR;
import X.C75211TfT;
import X.C75422Tis;
import X.C76633U5t;
import X.C76923UGx;
import X.C78720Uuy;
import X.C78739UvH;
import X.C78857UxB;
import X.C78862UxG;
import X.C78886Uxe;
import X.C78996UzQ;
import X.C87277YNd;
import X.C8E;
import X.CFX;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC24140x8;
import X.InterfaceC31981Ni;
import X.InterfaceC74236TBo;
import X.InterfaceC74605TPt;
import X.InterfaceC74965TbV;
import X.TBT;
import X.TQA;
import X.TV3;
import X.U35;
import X.X1D;
import Y.ARunnableS16S0400000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MultiGuestStickerImageSelectedEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public abstract class AbsMultiGuestNewPreviewFragment extends LiveDialogFragment implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIL;
    public View LJLIL;
    public FrameLayout LJLILLLLZI;
    public ConstraintLayout LJLJI;
    public View LJLJJI;
    public C47061t0 LJLJJL;
    public C47061t0 LJLJJLL;
    public C2A4 LJLJL;
    public View LJLJLJ;
    public ImageView LJLJLLL;
    public ImageView LJLL;
    public C76633U5t LJLLI;
    public ConstraintLayout LJLLILLLL;
    public C76923UGx LJLLJ;
    public ViewGroup LJLLL;
    public ViewGroup LJLLLL;
    public FrameLayout LJLLLLLL;
    public FrameLayout LJLZ;
    public FrameLayout LJZ;
    public C47121t6 LJZI;
    public View LJZL;
    public C47121t6 LL;
    public C2A7 LLD;
    public ViewGroup LLF;
    public InterfaceC74605TPt LLFF;
    public MultiGuestEffectSwitchFragment LLFFF;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public C75211TfT LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C31657Cbd LLFII = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public final C5H3 LLIIIJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 93));
    public final C74958TbO LLIIIL = new C74958TbO(this);
    public final C74956TbM LLIIIZ = new C74956TbM(this);
    public final C74959TbP LLIIJI = new C74959TbP(this);

    static {
        TBT tbt = new TBT(AbsMultiGuestNewPreviewFragment.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIL = new InterfaceC74236TBo[]{tbt};
    }

    public abstract String Dl();

    public abstract LiveEffect Gl();

    public abstract String Il();

    public abstract AbsMultiGuestNewPreviewViewModel Kl();

    public void Ml() {
        this.LLI = false;
    }

    public abstract void Nl();

    public abstract boolean Ol();

    public abstract void Rl();

    public abstract void Yl();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final MultiGuestDataHolder Al() {
        return (MultiGuestDataHolder) this.LLFII.LIZ(this, LLIIL[0]);
    }

    public final InterfaceC24140x8 Hl() {
        InterfaceC74605TPt interfaceC74605TPt = this.LLFF;
        if (interfaceC74605TPt instanceof InterfaceC24140x8) {
            return (InterfaceC24140x8) interfaceC74605TPt;
        }
        return null;
    }

    public final C75422Tis Jl() {
        return (C75422Tis) this.LLIIIJ.getValue();
    }

    public final void Vl() {
        C47061t0 c47061t0 = this.LJLJJL;
        if (c47061t0 != null) {
            C87277YNd.LJJIJ(c47061t0);
        }
        C47061t0 c47061t02 = this.LJLJJLL;
        if (c47061t02 != null) {
            C87277YNd.LJJIJ(c47061t02);
        }
        C2A4 c2a4 = this.LJLJL;
        if (c2a4 != null) {
            C87277YNd.LJJIJ(c2a4);
        }
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(this.LLFZ))) {
            ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
            o.LJIIIIZZ(avatarThumb, "getInstance().user().currentUser.avatarThumb");
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(avatarThumb.getUrls());
                LIZ.LIZIZ(0.74698794f);
                LIZ.LJIIJJI(this.LJLJJL);
                C47061t0 c47061t03 = this.LJLJJLL;
                if (c47061t03 != null) {
                    C78720Uuy LIZ2 = C15650jR.LIZ().LIZ(avatarThumb.getUrls());
                    int width = c47061t03.getWidth();
                    int height = c47061t03.getHeight();
                    LIZ2.LJ = width;
                    LIZ2.LJFF = height;
                    LIZ2.LJIIIIZZ = R.drawable.cuk;
                    LIZ2.LJIIJJI(this.LJLJJLL);
                }
            } else {
                C31665Cbl.LJFF(this.LJLJJL, avatarThumb, new C78739UvH(0.74698794f));
                C47061t0 c47061t04 = this.LJLJJLL;
                if (c47061t04 != null) {
                    C31665Cbl.LJIIJ(c47061t04, avatarThumb, c47061t04.getWidth(), c47061t04.getHeight(), R.drawable.cuk);
                }
            }
            this.LLFZ = true;
        }
        C2A4 c2a42 = this.LJLJL;
        if (c2a42 != null) {
            c2a42.LJII();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.bq9);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.7f;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        return c28507BGt;
    }

    public void initView() {
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC74605TPt interfaceC74605TPt;
        View view;
        Integer num;
        Integer num2;
        View view2;
        LiveCore.Builder builder;
        LiveCore.Builder builder2;
        int i;
        LiveEffect liveEffect;
        boolean z;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        if (getContext() == null || this.dataChannel == null) {
            return;
        }
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        boolean z2 = true;
        boolean z3 = false;
        if (Kl != null) {
            Context context = getContext();
            DataChannel dataChannel = this.dataChannel;
            InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            InterfaceC31981Ni createComposerManagerB = ((IEffectService) LIZ).createComposerManagerB();
            o.LJIIIIZZ(createComposerManagerB, "{\n                servic…rManagerB()\n            }");
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IBroadcastService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            IBroadcastService iBroadcastService = (IBroadcastService) LIZ2;
            C24130x7 c24130x7 = new C24130x7();
            C74961TbR c74961TbR = Kl.iv0().LIZ;
            if (c74961TbR != null) {
                i = c74961TbR.LIZLLL;
            } else {
                i = 2;
            }
            c24130x7.LIZ = i;
            C74961TbR c74961TbR2 = Kl.iv0().LIZ;
            if (c74961TbR2 != null) {
                liveEffect = c74961TbR2.LJ;
            } else {
                liveEffect = null;
            }
            c24130x7.LIZIZ = liveEffect;
            C74961TbR c74961TbR3 = Kl.iv0().LIZ;
            if (c74961TbR3 == null || (mutableLiveData = c74961TbR3.LIZ) == null || (value = mutableLiveData.getValue()) == null) {
                z = false;
            } else {
                z = value.booleanValue();
            }
            c24130x7.LJFF = z;
            c24130x7.LIZJ = C74740TUy.LIZLLL().LJI;
            c24130x7.LIZLLL = C74740TUy.LIZLLL().LJII;
            C74961TbR c74961TbR4 = Kl.iv0().LIZ;
            if (c74961TbR4 != null && c74961TbR4.LIZJ) {
                c24130x7.LJ = 0;
            } else {
                c24130x7.LJ = 1;
            }
            InterfaceC74605TPt createLinkMicPreviewViewV2 = iBroadcastService.createLinkMicPreviewViewV2(context, c24130x7, dataChannel, createComposerManagerB);
            if (createLinkMicPreviewViewV2 instanceof InterfaceC24140x8) {
                interfaceC24140x8 = (InterfaceC24140x8) createLinkMicPreviewViewV2;
            } else {
                interfaceC24140x8 = null;
            }
            Kl.LJLJI = interfaceC24140x8;
        } else {
            interfaceC24140x8 = null;
        }
        if (interfaceC24140x8 instanceof InterfaceC74605TPt) {
            interfaceC74605TPt = (InterfaceC74605TPt) interfaceC24140x8;
        } else {
            interfaceC74605TPt = null;
        }
        this.LLFF = interfaceC74605TPt;
        if (interfaceC24140x8 != null) {
            interfaceC24140x8.setStreamCallback(this.LLIIJI);
            FrameLayout frameLayout = this.LJLILLLLZI;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                LiveCore liveCore = interfaceC24140x8.getLiveStream().getLiveCore();
                if (liveCore != null && (builder2 = liveCore.getBuilder()) != null) {
                    num = Integer.valueOf(builder2.getVideoWidth());
                } else {
                    num = null;
                }
                LiveCore liveCore2 = interfaceC24140x8.getLiveStream().getLiveCore();
                if (liveCore2 != null && (builder = liveCore2.getBuilder()) != null) {
                    num2 = Integer.valueOf(builder.getVideoHeight());
                } else {
                    num2 = null;
                }
                interfaceC24140x8.setCurrentLayoutParam(layoutParams);
                if ((interfaceC24140x8 instanceof View) && (view2 = (View) interfaceC24140x8) != null) {
                    TV3.LJIIJJI(view2);
                    frameLayout.addView(view2);
                    view2.post(new ARunnableS16S0400000_13(view2, num, num2, this, 1));
                }
            }
            if (C30784C6i.LIZJ()) {
                C76923UGx c76923UGx = this.LJLLJ;
                if (c76923UGx != null) {
                    C87277YNd.LJJIIZ(c76923UGx);
                }
                FrameLayout frameLayout2 = this.LJLZ;
                if (frameLayout2 != null) {
                    C87277YNd.LJJIIZ(frameLayout2);
                }
                FrameLayout frameLayout3 = this.LJZ;
                if (frameLayout3 != null) {
                    C87277YNd.LJJIIZ(frameLayout3);
                }
                ViewGroup viewGroup = this.LJLLLL;
                if (viewGroup != null) {
                    C87277YNd.LJJIIZ(viewGroup);
                }
                FrameLayout frameLayout4 = this.LJLLLLLL;
                if (frameLayout4 != null) {
                    C87277YNd.LJJIIZ(frameLayout4);
                }
                ConstraintLayout constraintLayout = this.LJLLILLLL;
                if (constraintLayout != null) {
                    C87277YNd.LJJIIZ(constraintLayout);
                }
                View view3 = this.LJZL;
                if (view3 != null) {
                    view3.setPadding(0, C15380j0.LIZ(16.0f), 0, 0);
                }
            } else {
                ViewGroup viewGroup2 = this.LJLLLL;
                if (viewGroup2 != null) {
                    C87277YNd.LJJIJ(viewGroup2);
                    C75209TfR c75209TfR = MultiGuestEffectSwitchFragment.LLI;
                    C74958TbO c74958TbO = this.LLIIIL;
                    boolean Ol = Ol();
                    C74956TbM c74956TbM = this.LLIIIZ;
                    FrameLayout frameLayout5 = this.LJLZ;
                    FrameLayout frameLayout6 = this.LJZ;
                    Integer valueOf = Integer.valueOf(R.id.kim);
                    C75422Tis Jl = Jl();
                    String Dl = Dl();
                    LiveEffect Gl = Gl();
                    boolean z4 = this.LLIIIILZ;
                    c75209TfR.getClass();
                    MultiGuestEffectSwitchFragment LIZ3 = C75209TfR.LIZ(interfaceC24140x8, c74958TbO, Ol, c74956TbM, frameLayout5, frameLayout6, valueOf, Jl, 2, Dl, Gl, z4);
                    this.LLFFF = LIZ3;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    C1B3 c1b3 = new C1B3(childFragmentManager);
                    c1b3.LJIIJ(LIZ3, null, R.id.csl);
                    c1b3.LJII();
                }
            }
            interfaceC24140x8.setReleaseMode(false);
        }
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLILLLLZI);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJJI);
        C15580jK.LIZIZ(C15380j0.LIZ(8.0f), this.LJLJJL);
        C15580jK.LIZ(C15380j0.LIZ(8.0f), 2, this.LJLJLJ);
        Object Hl = Hl();
        if ((Hl instanceof View) && (view = (View) Hl) != null) {
            C15580jK.LIZIZ(C15380j0.LIZ(8.0f), view);
        }
        View view4 = this.LJLIL;
        if (view4 != null) {
            C29306Beo.LJJJLZIJ(view4, this);
        }
        ConstraintLayout constraintLayout2 = this.LJLLILLLL;
        if (constraintLayout2 != null) {
            C29306Beo.LJJJLZIJ(constraintLayout2, this);
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            C29306Beo.LJJJLZIJ(imageView, this);
        }
        ImageView imageView2 = this.LJLL;
        if (imageView2 != null) {
            C29306Beo.LJJJLZIJ(imageView2, this);
        }
        C76633U5t c76633U5t = this.LJLLI;
        if (c76633U5t != null) {
            C29306Beo.LJJJLZIJ(c76633U5t, this);
        }
        C76633U5t c76633U5t2 = this.LJLLI;
        if (c76633U5t2 != null) {
            MultiGuestDataHolder Al = Al();
            if (Al != null) {
                z3 = Al.LIZLLL;
            }
            c76633U5t2.setAudioEnabled(z3);
        }
        C76633U5t c76633U5t3 = this.LJLLI;
        if (c76633U5t3 != null) {
            MultiGuestDataHolder Al2 = Al();
            if (Al2 != null) {
                z2 = Al2.LJIL;
            }
            c76633U5t3.setAudioClickable(z2);
        }
        ViewGroup viewGroup3 = this.LJLLL;
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, this);
        }
        FrameLayout frameLayout7 = this.LJLILLLLZI;
        if (frameLayout7 != null) {
            C16880lQ.LJIILJJIL(frameLayout7, this);
        }
        C2A7 c2a7 = this.LLD;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, this);
        }
        C2A4 c2a4 = this.LJLJL;
        if (c2a4 != null) {
            c2a4.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "audio_interact_effect.webp"));
        }
    }

    public void Ll() {
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null) {
            Kl.hv0().observe(this, new AqS179S0100000_13(this, 160), true);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, MultiGuestStickerImageSelectedEvent.class, new AqS179S0100000_13(this, 161));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, MicClickableEvent.class, new AqS179S0100000_13(this, 162));
        }
    }

    public boolean Pl() {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        C32536Cpo<C74961TbR> iv02;
        C74961TbR c74961TbR2;
        MultiGuestDataHolder Al = Al();
        if (Al != null && C78857UxB.LJJJ(Al.LJJIJLIJ)) {
            C30868C9o.LIZJ(R.string.nep);
            return false;
        }
        InterfaceC24140x8 Hl = Hl();
        if (Hl != null) {
            Hl.LIZIZ(C78857UxB.LJJIIJ(1476788234, "bpea-multiguest_new_preview_camera_switch"));
        }
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            boolean z = c74961TbR.LIZJ;
            AbsMultiGuestNewPreviewViewModel Kl2 = Kl();
            if (Kl2 != null && (iv02 = Kl2.iv0()) != null && (c74961TbR2 = iv02.LIZ) != null) {
                c74961TbR2.LIZJ = !z;
            }
        }
        return true;
    }

    public boolean Sl() {
        String str;
        boolean z;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean bool;
        U35 LIZ;
        ShowContent content;
        ShowConfig showConfig;
        ShowListUser showListUser;
        Long valueOf;
        MultiGuestDataHolder Al;
        MultiGuestDataHolder Al2;
        boolean z2 = false;
        if (Al() == null) {
            return false;
        }
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            str = C17280m4.LIZ(room);
        } else {
            str = null;
        }
        if (iInteractService.gt(str)) {
            return false;
        }
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied() && (Al2 = Al()) != null && !Al2.LJIL) {
            if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
                C30868C9o.LIZJ(R.string.n0d);
                C74824TYe.LJJJIL("pm_mic_occupy_during_live_toast", "guest_connection");
            } else {
                C30868C9o.LIZJ(R.string.n0c);
                C74824TYe.LJJJIL("pm_mic_occupy_before_live_guest_toast", "guest_connection_preview_pannel");
            }
            return false;
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (LIZ = TQA.LIZ()) != null && (content = LIZ.getContent()) != null && (showConfig = content.showConfig) != null && !showConfig.allowOpenMicFreely) {
            Iterator<ShowListUser> it = content.showingAndReadyList.iterator();
            while (true) {
                if (it.hasNext()) {
                    showListUser = it.next();
                    if (showListUser.status == 2) {
                        break;
                    }
                } else {
                    showListUser = null;
                    break;
                }
            }
            ShowListUser showListUser2 = showListUser;
            if (showListUser2 != null && (valueOf = Long.valueOf(showListUser2.userId)) != null) {
                if (valueOf.longValue() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && (Al = Al()) != null && !Al.LIZLLL) {
                    C30868C9o.LIZJ(R.string.ndl);
                    return false;
                }
            }
        }
        MultiGuestDataHolder Al3 = Al();
        if (Al3 != null) {
            if (Al() != null && (!r0.LIZLLL)) {
                z = true;
            } else {
                z = false;
            }
            Al3.LIZLLL = z;
        }
        C76633U5t c76633U5t = this.LJLLI;
        if (c76633U5t != null) {
            MultiGuestDataHolder Al4 = Al();
            if (Al4 != null) {
                z2 = Al4.LIZLLL;
            }
            c76633U5t.setAudioEnabled(z2);
        }
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null && (mutableLiveData = c74961TbR.LIZIZ) != null) {
            MultiGuestDataHolder Al5 = Al();
            if (Al5 != null) {
                bool = Boolean.valueOf(Al5.LIZLLL);
            } else {
                bool = Boolean.FALSE;
            }
            mutableLiveData.setValue(bool);
        }
        return true;
    }

    public boolean Tl() {
        Channel<Integer> hv0;
        Channel<Integer> hv02;
        Channel<Integer> hv03;
        MultiGuestDataHolder Al = Al();
        if (Al != null && C78857UxB.LJJJ(Al.LJJIJLIJ)) {
            C30868C9o.LIZJ(R.string.nep);
            return false;
        }
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        Integer num = null;
        if (Kl != null && (hv03 = Kl.hv0()) != null) {
            num = hv03.getValue();
        }
        this.LLI = true;
        if (num == null || num.intValue() != 2) {
            AbsMultiGuestNewPreviewViewModel Kl2 = Kl();
            if (Kl2 != null && (hv02 = Kl2.hv0()) != null) {
                hv02.setValue(2);
            }
        } else {
            AbsMultiGuestNewPreviewViewModel Kl3 = Kl();
            if (Kl3 != null && (hv0 = Kl3.hv0()) != null) {
                hv0.setValue(1);
            }
        }
        return true;
    }

    public void Zl() {
        AbsMultiGuestNewPreviewViewModel Kl;
        Channel<Integer> hv0;
        Integer value;
        if (C30784C6i.LIZJ()) {
            return;
        }
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LLFFF;
        if (multiGuestEffectSwitchFragment != null) {
            int i = multiGuestEffectSwitchFragment.LJZL;
            InterfaceC74965TbV.LIZLLL.getClass();
            if (C74964TbU.LIZ(i) && (Kl = Kl()) != null && (hv0 = Kl.hv0()) != null && (value = hv0.getValue()) != null && value.intValue() == 2) {
                ConstraintLayout constraintLayout = this.LJLLILLLL;
                if (constraintLayout == null) {
                    return;
                }
                C87277YNd.LJJIJ(constraintLayout);
                return;
            }
        }
        ConstraintLayout constraintLayout2 = this.LJLLILLLL;
        if (constraintLayout2 != null) {
            C87277YNd.LJJIIZ(constraintLayout2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.LLIIII = false;
        C2A4 c2a4 = this.LJLJL;
        if (c2a4 != null) {
            c2a4.LJ();
        }
        C75211TfT c75211TfT = this.LLII;
        if (c75211TfT != null) {
            c75211TfT.LIZ(false);
        }
    }

    public final String xl() {
        Channel<Integer> hv0;
        Integer value;
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null && (hv0 = Kl.hv0()) != null && (value = hv0.getValue()) != null) {
            if (value.intValue() == 2) {
                MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LLFFF;
                if (multiGuestEffectSwitchFragment != null) {
                    return C58410MwA.LIZ(multiGuestEffectSwitchFragment.LJZL);
                }
            } else {
                value.intValue();
            }
        }
        return "audio";
    }

    public void Ql() {
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public void Wl(boolean z) {
        boolean z2;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        MutableLiveData<Boolean> mutableLiveData;
        View view;
        View view2;
        DataChannel dataChannel;
        if (!C30784C6i.LIZJ()) {
            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LLFFF;
            if (multiGuestEffectSwitchFragment != null && (dataChannel = multiGuestEffectSwitchFragment.LJLLILLLL) != null) {
                dataChannel.qv0(MultiGuestPreviewCameraOpenEvent.class, Boolean.FALSE);
            }
            ViewGroup viewGroup = this.LJLLLL;
            if (viewGroup != null) {
                C87277YNd.LJJIIZI(viewGroup);
            }
            C47121t6 c47121t6 = this.LL;
            if (c47121t6 != null) {
                C87277YNd.LJJIJ(c47121t6);
            }
        }
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            C87277YNd.LJJIIZ(view3);
        }
        C47121t6 c47121t62 = this.LJZI;
        if (c47121t62 != null) {
            C29306Beo.LJIIIZ(c47121t62);
        }
        Object Hl = Hl();
        if ((Hl instanceof SurfaceView) && (view2 = (View) Hl) != null) {
            C87277YNd.LJJIIZI(view2);
        }
        Object Hl2 = Hl();
        if ((Hl2 instanceof TextureView) && (view = (View) Hl2) != null) {
            C87277YNd.LJJIIZI(view);
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            imageView.setBackground(C15400j2.LIZ(R.drawable.d0y));
        }
        ImageView imageView2 = this.LJLL;
        if (imageView2 != null) {
            imageView2.setBackground(C15400j2.LIZ(R.drawable.czy));
        }
        ImageView imageView3 = this.LJLL;
        boolean z3 = false;
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        Vl();
        vl(C78857UxB.LJJIIJ(1476788483, "bpea-multiguest_preview_new_panel_audio_mode"), false);
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null && (mutableLiveData = c74961TbR.LIZ) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        if (!C30784C6i.LIZJ()) {
            if (z) {
                C75422Tis Jl = Jl();
                MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = this.LLFFF;
                if (multiGuestEffectSwitchFragment2 != null && multiGuestEffectSwitchFragment2.xl()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment3 = this.LLFFF;
                if (multiGuestEffectSwitchFragment3 != null && multiGuestEffectSwitchFragment3.wl()) {
                    z3 = true;
                }
                Jl.LJIILJJIL(z2, z3);
                return;
            }
            ConstraintLayout constraintLayout = this.LJLLILLLL;
            if (constraintLayout == null) {
                return;
            }
            C87277YNd.LJJIIZ(constraintLayout);
        }
    }

    public void Xl(boolean z) {
        boolean z2;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        MutableLiveData<Boolean> mutableLiveData;
        if (!C30784C6i.LIZJ()) {
            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LLFFF;
            if (multiGuestEffectSwitchFragment != null) {
                multiGuestEffectSwitchFragment.Gl();
            }
            ViewGroup viewGroup = this.LJLLLL;
            if (viewGroup != null) {
                C87277YNd.LJJIJ(viewGroup);
            }
            C47121t6 c47121t6 = this.LL;
            if (c47121t6 != null) {
                C87277YNd.LJJIIZ(c47121t6);
            }
        }
        View view = this.LJLJLJ;
        if (view != null) {
            C87277YNd.LJJIJ(view);
        }
        C47121t6 c47121t62 = this.LJZI;
        if (c47121t62 != null) {
            C87277YNd.LJJIJ(c47121t62);
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            imageView.setBackground(C15400j2.LIZ(R.drawable.d10));
        }
        ImageView imageView2 = this.LJLL;
        if (imageView2 != null) {
            imageView2.setBackground(C15400j2.LIZ(R.drawable.d00));
        }
        ImageView imageView3 = this.LJLL;
        boolean z3 = true;
        if (imageView3 != null) {
            imageView3.setEnabled(true);
        }
        Vl();
        vl(C78857UxB.LJJIIJ(1476788234, "bpea-multiguest_new_preview_open_camera"), true);
        AbsMultiGuestNewPreviewViewModel Kl = Kl();
        if (Kl != null && (iv0 = Kl.iv0()) != null && (c74961TbR = iv0.LIZ) != null && (mutableLiveData = c74961TbR.LIZ) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        Jl().LJIIJJI = true;
        if (!C30784C6i.LIZJ() && z) {
            C75422Tis Jl = Jl();
            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = this.LLFFF;
            if (multiGuestEffectSwitchFragment2 != null && multiGuestEffectSwitchFragment2.xl()) {
                z2 = true;
            } else {
                z2 = false;
            }
            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment3 = this.LLFFF;
            if (multiGuestEffectSwitchFragment3 == null || !multiGuestEffectSwitchFragment3.wl()) {
                z3 = false;
            }
            Jl.LJIILIIL(z2, z3);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClick ");
        LIZ.append(view);
        LIZ.append(' ');
        LIZ.append(view);
        LIZ.append(".id");
        C0NB.LIZIZ("AbsMultiGuestNewPreviewFragment", X1D.LIZIZ(LIZ));
        int id = view.getId();
        if (id == R.id.cc0) {
            Ql();
            return;
        }
        if (id == R.id.b3h) {
            Pl();
            return;
        }
        if (id == R.id.n8p) {
            Tl();
        } else if (id == R.id.giw) {
            Sl();
        } else {
            if (id != R.id.d14) {
                return;
            }
            Rl();
        }
    }

    public void wl(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LJLIL = rootView.findViewById(R.id.cc0);
        this.LJLILLLLZI = (FrameLayout) rootView.findViewById(R.id.i2k);
        this.LJLJI = (ConstraintLayout) rootView.findViewById(R.id.i3u);
        this.LJLJJI = rootView.findViewById(R.id.i1z);
        this.LJLJJL = (C47061t0) rootView.findViewById(R.id.abo);
        this.LJLJL = (C2A4) rootView.findViewById(R.id.a_5);
        this.LJLJJLL = (C47061t0) rootView.findViewById(R.id.abh);
        this.LJLJLJ = rootView.findViewById(R.id.n4j);
        this.LJLJLLL = (ImageView) rootView.findViewById(R.id.n8p);
        this.LJLL = (ImageView) rootView.findViewById(R.id.b3h);
        this.LJLLI = (C76633U5t) rootView.findViewById(R.id.giw);
        this.LJLLILLLL = (ConstraintLayout) rootView.findViewById(R.id.jkm);
        this.LJLLJ = (C76923UGx) rootView.findViewById(R.id.k5p);
        this.LJLLL = (ViewGroup) rootView.findViewById(R.id.ap_);
        this.LJZL = ((ViewStub) rootView.findViewById(R.id.ap1)).inflate();
        this.LL = (C47121t6) rootView.findViewById(R.id.a_6);
        this.LJLLLL = (ViewGroup) rootView.findViewById(R.id.csl);
        this.LLD = (C2A7) rootView.findViewById(R.id.d14);
        this.LLF = (ViewGroup) rootView.findViewById(R.id.hho);
        this.LJLLLLLL = (FrameLayout) rootView.findViewById(R.id.kim);
        this.LJLZ = (FrameLayout) rootView.findViewById(R.id.kgh);
        this.LJZ = (FrameLayout) rootView.findViewById(R.id.kgi);
        this.LJZI = (C47121t6) rootView.findViewById(R.id.kk_);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Nl();
        Ml();
        Yl();
        wl(view);
        initView();
        Ll();
        Zl();
        C75211TfT c75211TfT = new C75211TfT(this.LJZI, Hl(), this, new C74962TbS(this), Jl());
        this.LLII = c75211TfT;
        c75211TfT.LIZ(true);
    }

    public final void vl(C78862UxG c78862UxG, boolean z) {
        InterfaceC24140x8 Hl = Hl();
        if (Hl != null) {
            Hl.LJIIJJI(c78862UxG, z);
        }
    }
}

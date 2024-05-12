package com.ss.android.ugc.aweme.feed.assem.desc;

import X.AnonymousClass840;
import X.AnonymousClass845;
import X.AnonymousClass846;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C1DH;
import X.C2051083e;
import X.C2051883m;
import X.C2051983n;
import X.C2052083o;
import X.C2052183p;
import X.C2052283q;
import X.C2052383r;
import X.C2052483s;
import X.C2052583t;
import X.C2052683u;
import X.C2052783v;
import X.C2053083y;
import X.C2054084i;
import X.C2055284u;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C2K0;
import X.C38891fp;
import X.C3C8;
import X.C42625Go9;
import X.C48236IwS;
import X.C51029K0z;
import X.C53256KvE;
import X.C55096Ljo;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C85C;
import X.C8MM;
import X.C8T7;
import X.C8VR;
import X.C8YN;
import X.FMX;
import X.G27;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.LFH;
import X.LJK;
import X.QD3;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.GetRemainingWordCountWithoutHashtagAbility;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class VideoDescAssem extends BaseCellSlotComponent implements G27, InteractInfoDescAbility, ComponentPriorityProtocol, GetRemainingWordCountWithoutHashtagAbility, VideoDescProviderAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILIL;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final InterfaceC115514g7 LLIIII;
    public final C5H3 LLIIIILZ;
    public final InterfaceC115514g7 LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final InterfaceC115514g7 LLIIJI;
    public Integer LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public C2054084i LLIL;
    public C85C LLILII;

    static {
        TBT tbt = new TBT(VideoDescAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoDescAssem.class, "translationViewModel", "getTranslationViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(VideoDescAssem.class, "videoDiggVM", "getVideoDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoDescAssem.class, "videoFavoriteVM", "getVideoFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoDescAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad7;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_description";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1354300871 || hashCode == -78363505 || hashCode == -16814679) {
            return this;
        }
        return null;
    }

    public final void u4() {
        InterfaceC115514g7 interfaceC115514g7 = this.LLIIII;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLILIL;
        C8YN.LJII(this, (AssemViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[1]), new TBT() { // from class: X.83x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLIL;
            }
        }, null, C2052083o.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.LIZ(this, interfaceC74236TBoArr[1]), new TBT() { // from class: X.83w
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((Y24) obj).LJLILLLLZI;
            }
        }, null, C2052183p.LJLIL, 6);
    }

    public VideoDescAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 314));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2052783v.LJLIL);
        this.LLFZ = LIZIZ;
        this.LLI = C221108m2.LIZIZ(AnonymousClass846.LJLIL);
        this.LLIFFJFJJ = C221108m2.LIZIZ(C2052683u.LJLIL);
        this.LLII = C38891fp.LJJIZ(this);
        this.LLIIII = ((ITranslationService) LIZIZ.getValue()).LIZJ(this);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C2052483s.INSTANCE);
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDiggVM.class);
        this.LLIIIJ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 316), null, C2052283q.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoFavoriteVM.class);
        this.LLIIIL = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 317), null, C2052383r.INSTANCE, null, null);
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 310));
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLIIJI = C214348b8.LIZ(this, LIZ3, c241249dQ, new AqS153S0100000_3(LIZ3, 318), null, C2052583t.INSTANCE, null, null);
        this.LLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 312));
        this.LLIILII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 315));
        this.LLIILZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 311));
        this.LLIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 313));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.VideoDescProviderAbility
    public final void Di() {
        if (this.LLFFF == 0) {
            Y3().setVisibility(0);
        }
    }

    public final FrameLayout q4() {
        Object value = this.LLIIZ.getValue();
        o.LJIIIIZZ(value, "<get-flDescContainer>(...)");
        return (FrameLayout) value;
    }

    public final VideoDescVM r4() {
        return (VideoDescVM) this.LLII.LIZ(this, LLILIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        if (!C53256KvE.LIZ()) {
            u4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        r4().LJLJLLL.LIZIZ(VideoDescVM.LLIIIL[0], null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.GetRemainingWordCountWithoutHashtagAbility
    public final int VA() {
        return r4().LJZI;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VR.LIZ(this, new AqS169S0100000_3(this, 193));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C42625Go9.LIZJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        final boolean z;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        final String str = item.mEventType;
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getDesc() == null) {
            z = 0;
        } else {
            z = 1;
        }
        boolean LJIIL = C48236IwS.LJIIL(item.getAweme().getAid());
        if (AnonymousClass845.LIZ) {
            final int i = LJIIL ? 1 : 0;
            C10K.LIZIZ(new Callable() { // from class: X.2Xc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", str);
                    c188727au.LIZLLL(i, "cache");
                    c188727au.LIZLLL(!z ? 1 : 0, "status");
                    FMX.LJIIL("desc_show", c188727au.LIZ);
                    return C76800UCe.LIZ;
                }
            }, FMX.LIZIZ(), null);
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(LJIIL ? 1 : 0, "cache");
        c188727au.LIZLLL(!z, "status");
        FMX.LJIIL("desc_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final void TD(String str) {
        C2054084i c2054084i = this.LLIL;
        if (c2054084i != null) {
            c2054084i.LJIIJJI(false, str, PostModeEntranceMechanism.SEE_MORE_BTN);
        } else {
            o.LJIJI("videoDescDelegate");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS169S0100000_3(this, 192));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @QD3
    public final void onFeedRefreshEvent(LJK ljk) {
        if (ljk == null) {
            return;
        }
        TD("others");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        VideoDescVM r4 = r4();
        InterfaceC115514g7 interfaceC115514g7 = this.LLIIIJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLILIL;
        VideoDiggVM videoDiggVM = (VideoDiggVM) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[2]);
        VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) this.LLIIIL.LIZ(this, interfaceC74236TBoArr[3]);
        ConstraintSizeVM constraintSizeVM = (ConstraintSizeVM) this.LLIIJI.LIZ(this, interfaceC74236TBoArr[4]);
        VideoViewModel videoViewModel = (VideoViewModel) this.LLIIIILZ.getValue();
        TuxTextView descToggleView = (TuxTextView) this.LLIIL.getValue();
        o.LJIIIIZZ(descToggleView, "descToggleView");
        FrameLayout q4 = q4();
        View toggleMarginView = (View) this.LLIILZL.getValue();
        o.LJIIIIZZ(toggleMarginView, "toggleMarginView");
        C2054084i c2054084i = new C2054084i(this, r4, videoDiggVM, videoFavoriteVM, constraintSizeVM, videoViewModel, descToggleView, q4, toggleMarginView);
        this.LLIL = c2054084i;
        c2054084i.LIZ(view);
        C2054084i c2054084i2 = this.LLIL;
        if (c2054084i2 != null) {
            c2054084i2.LJII();
            C8VR.LIZ(this, new AqS134S0200000_3(this, view, 81));
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 63), (View) this.LLIILZL.getValue());
            TuxTextView tuxTextView = (TuxTextView) this.LLIIL.getValue();
            boolean isAd = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().isAd();
            if (tuxTextView != null) {
                C2055284u.LIZLLL(tuxTextView, 3, 42, isAd);
            }
            C16880lQ.LJJJJI((TuxTextView) this.LLIIL.getValue(), new ACListenerS23S0100000_3(this, 64));
            C16880lQ.LJIIZILJ((LinearLayout) this.LLIILII.getValue(), new ACListenerS23S0100000_3(this, 65));
            ((View) this.LLIILII.getValue()).setOnTouchListener(new IDTListenerS113S0100000_3(this, 4));
            C8YN.LJII(this, r4(), new TBT() { // from class: X.83a
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83X) obj).LJLJL;
                }
            }, C213688a4.LIZLLL(), C2051083e.LJLIL, 4);
            if (C53256KvE.LIZ()) {
                u4();
            }
            C8YN.LJII(this, r4(), new TBT() { // from class: X.83b
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83X) obj).LJLJI;
                }
            }, C213688a4.LIZJ(), C2051883m.LJLIL, 4);
            C8YN.LJII(this, r4(), new TBT() { // from class: X.83c
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83X) obj).LJLJJLL;
                }
            }, null, C2051983n.LJLIL, 6);
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 61));
            return;
        }
        o.LJIJI("videoDescDelegate");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoDescVM r4 = r4();
        r4.LJLJLLL.LIZIZ(VideoDescVM.LLIIIL[0], getContext());
        this.LLILII = item.videoCellDescAbility;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility
    public final void NY(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            return;
        }
        ConstraintSizeVM constraintSizeVM = (ConstraintSizeVM) this.LLIIJI.LIZ(this, LLILIL[4]);
        constraintSizeVM.getClass();
        if (z) {
            View findViewById = viewGroup.findViewById(R.id.adr);
            if (findViewById != null) {
                findViewById.setPaddingRelative(constraintSizeVM.mv0(), findViewById.getPaddingTop(), findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
                findViewById.setPaddingRelative(findViewById.getPaddingStart(), findViewById.getPaddingTop(), constraintSizeVM.mv0(), findViewById.getPaddingBottom());
                return;
            }
            return;
        }
        constraintSizeVM.kv0(viewGroup);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        AnonymousClass840 LJIJI = LFH.LIZIZ.LIZLLL().LJIILLIIL().LJIJI();
        ViewGroup llDescContainer = (ViewGroup) this.LLIILII.getValue();
        o.LJIIIIZZ(llDescContainer, "llDescContainer");
        LJIJI.LJIJJ(newConfig, llDescContainer, new AqS169S0100000_3(this, 946));
    }
}

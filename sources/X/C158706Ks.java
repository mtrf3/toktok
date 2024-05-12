package X;

import Y.AObserverS66S0200000_2;
import Y.IDCListenerS295S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158706Ks extends AbstractC56012Ht<C6L7, C158726Ku> implements C6KQ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final VideoPublishEditModel LJLIL;
    public final InterfaceC135455Th LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public AudioRecorderParam LJLJJL;
    public boolean LJLJJLL;
    public C5T9 LJLJL;
    public volatile boolean LJLJLJ;
    public C73305Spp LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public FrameLayout LJLLILLLL;
    public ViewOnTouchListenerC141755hL LJLLJ;
    public View LJLLL;
    public C6KO LJLLLL;
    public ViewGroup LJLLLLLL;
    public C6LO LJLZ;
    public TextView LJZ;
    public View LJZI;
    public View LJZL;
    public TextView LL;
    public C29701Eo LLD;
    public CheckBox LLF;
    public View LLFF;
    public View LLFFF;
    public boolean LLFII;
    public final IDlS62S0100000_2 LLFZ;

    static {
        TBT tbt = new TBT(C158706Ks.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    public final void LLJILJIL() {
        this.LLFII = false;
        C73305Spp c73305Spp = this.LJLJLLL;
        if (c73305Spp != null) {
            if (c73305Spp.getVisibility() == 0) {
                View view = this.LJLL;
                if (view != null) {
                    if (view.getVisibility() == 0) {
                        C73305Spp c73305Spp2 = this.LJLJLLL;
                        if (c73305Spp2 != null) {
                            c73305Spp2.setVisibility(8);
                            View view2 = this.LJLL;
                            if (view2 != null) {
                                view2.setVisibility(8);
                                C42303Gix.LIZ(1103, GGO.DISMISS, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
                                return;
                            } else {
                                o.LJIJI("loadingStatusViewLayout");
                                throw null;
                            }
                        }
                        o.LJIJI("loadingStatusView");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("loadingStatusViewLayout");
                throw null;
            }
            return;
        }
        o.LJIJI("loadingStatusView");
        throw null;
    }

    public final void LLJILJILJ() {
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        if (videoPublishEditModel.realHasOriginalSound() || videoPublishEditModel.isFastImport || (videoPublishEditModel.isCurrentAutoCutMode() && HRX.LIZLLL())) {
            View view = this.LLFF;
            if (view != null) {
                view.setVisibility(0);
            } else {
                o.LJIJI("checkBoxLayout");
                throw null;
            }
        }
        if (videoPublishEditModel.editMusicSyncMode || videoPublishEditModel.isDuet() || C44384HbQ.LJZL(videoPublishEditModel) || videoPublishEditModel.isStickPointMode || (videoPublishEditModel.isCurrentAutoCutMode() && !HRX.LIZLLL())) {
            View view2 = this.LLFF;
            if (view2 != null) {
                view2.setVisibility(8);
            } else {
                o.LJIJI("checkBoxLayout");
                throw null;
            }
        }
    }

    public final void LLJJ() {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C6KO c6ko = new C6KO((ActivityC45651qj) activity, this);
        int LIZJ = (int) KL2.LIZJ(c6ko.getContext(), 16.0f);
        int LIZJ2 = (int) KL2.LIZJ(c6ko.getContext(), 6.0f);
        int LIZJ3 = (int) KL2.LIZJ(c6ko.getContext(), 4.0f);
        C5T9 c5t9 = this.LJLJL;
        c6ko.LJFF(LIZJ, LIZJ2, LIZJ3, c5t9.LJ, c5t9.LJIIJJI);
        C5T9 c5t92 = this.LJLJL;
        c5t92.getClass();
        c5t92.LJIIIZ = c6ko;
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout != null) {
            frameLayout.addView(c6ko, new FrameLayout.LayoutParams(-1, -1));
            this.LJLLLL = c6ko;
            C5T9 c5t93 = this.LJLJL;
            C5TE c5te = new C5TE() { // from class: X.6Kv
                @Override // X.C5TE
                public final void LIZ(boolean z) {
                    if (z) {
                        View view = C158706Ks.this.LJLLI;
                        if (view != null) {
                            view.setVisibility(0);
                        } else {
                            o.LJIJI("playView");
                            throw null;
                        }
                    } else {
                        View view2 = C158706Ks.this.LJLLI;
                        if (view2 != null) {
                            view2.setVisibility(4);
                        } else {
                            o.LJIJI("playView");
                            throw null;
                        }
                    }
                    C158706Ks.this.getUiActions().LJIIJJI.invoke(2);
                }
            };
            c5t93.getClass();
            c5t93.LJIIIIZZ = c5te;
            C5T9 c5t94 = this.LJLJL;
            Activity activity2 = this.mActivity;
            o.LJI(activity2);
            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = this.LJLLJ;
            if (viewOnTouchListenerC141755hL != null) {
                VideoPublishEditModel mVideoPublishEditModel = this.LJLIL;
                c5t94.getClass();
                o.LJIIIZ(mVideoPublishEditModel, "mVideoPublishEditModel");
                InterfaceC153045zY interfaceC153045zY = c5t94.LIZLLL;
                if (interfaceC153045zY != null) {
                    viewOnTouchListenerC141755hL.LIZLLL();
                    viewOnTouchListenerC141755hL.setLayoutManager(new WrapLinearLayoutManager(0));
                    int frameHeight = viewOnTouchListenerC141755hL.getFrameHeight();
                    int frameWidth = viewOnTouchListenerC141755hL.getFrameWidth();
                    int ceil = (int) Math.ceil((KL2.LJIIJJI(activity2) - (O6R.LJJIIZ(KL2.LIZJ(activity2, 16.0f)) * 2)) / (frameWidth * 1.0f));
                    viewOnTouchListenerC141755hL.setCoverSize(ceil);
                    if (C6WA.LIZ()) {
                        get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                    } else {
                        get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                    }
                    WFB wfb = new WFB(new VEVideoCoverGeneratorImpl(interfaceC153045zY, C78840Uwu.LJJIJIIJIL(viewOnTouchListenerC141755hL), viewOnTouchListenerC141755hL.getCoverSize(), get_frames_flags, "ai_music"), frameWidth, frameHeight, ceil);
                    if (mVideoPublishEditModel.isMvThemeVideoType()) {
                        final C113584d0 c113584d0 = new C113584d0(frameWidth, frameHeight);
                        viewOnTouchListenerC141755hL.setAdapter(c113584d0);
                        C6YX c6yx = new C6YX();
                        c6yx.LIZIZ = C45804HyK.LJLIL;
                        c6yx.LJIIL = c5t94.LIZ.x7();
                        c6yx.LJIIJJI = c5t94.LIZ.C0();
                        c6yx.LJIILJJIL = frameWidth;
                        if (activity2 instanceof SAAActivity) {
                            ((SAAActivity) activity2).LLIIJI("getIntent", new AqS7S0401000_2(c6yx, activity2, c5t94, ceil, c113584d0, 0));
                        } else {
                            c6yx.LIZ(activity2, c5t94.LIZLLL, ceil, new C5UO() { // from class: X.6LD
                                @Override // X.C5UO
                                public final void LIZ(List<Bitmap> list) {
                                    C113584d0.this.LJLLLLLL(list);
                                }
                            });
                        }
                        viewOnTouchListenerC141755hL.setAdapter(c113584d0);
                    } else {
                        viewOnTouchListenerC141755hL.setAdapter(new C162626Zu(wfb, frameWidth, frameHeight));
                    }
                }
                C5T9 c5t95 = this.LJLJL;
                AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 106);
                c5t95.getClass();
                c5t95.LIZIZ().observe(this, new AObserverS66S0200000_2(c5t95, aqS168S0100000_2, 0));
                this.LJLJL.LIZLLL(new AqS152S0100000_2(this, 173), new AqS152S0100000_2(this, 174), new AqS149S0200000_2(this, c6ko, 18), new AqS168S0100000_2(this, 107));
                return;
            }
            o.LJIJI("mChooseVideoCoverView");
            throw null;
        }
        o.LJIJI("seekLayout");
        throw null;
    }

    public final void LLJJI() {
        View view = this.LJLL;
        if (view != null) {
            view.setVisibility(0);
            C73305Spp c73305Spp = this.LJLJLLL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(0);
                C73305Spp c73305Spp2 = this.LJLJLLL;
                if (c73305Spp2 != null) {
                    c73305Spp2.LJFF();
                    C42303Gix.LIZ(1103, GGO.SHOW, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
                    return;
                } else {
                    o.LJIJI("loadingStatusView");
                    throw null;
                }
            }
            o.LJIJI("loadingStatusView");
            throw null;
        }
        o.LJIJI("loadingStatusViewLayout");
        throw null;
    }

    public final void LLJJIII() {
        int i;
        if (C149965ua.LIZ(this.LJLIL, this.LJLJJL).LIZ) {
            i = R.string.z_;
        } else {
            i = R.string.e41;
        }
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(i);
        } else {
            o.LJIJI("tvMsg");
            throw null;
        }
    }

    @Override // X.C6KQ
    public final boolean isSceneRecording() {
        return this.LJLILLLLZI.isRecording();
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        this.LJLILLLLZI.dT(false);
        super.onResume();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJL.LIZ();
    }

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        if (this.LJLILLLLZI.isRecording()) {
            getUiActions().LIZJ.invoke(Boolean.FALSE, -1, C78857UxB.LJJIIJ(1476788484, "bpea-pause_when_on_activity_pause"));
        }
        this.LJLILLLLZI.dT(true);
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        super.onShow();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.f8p);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.iv_play)");
        this.LJLLI = requireViewById;
        View requireViewById2 = requireViewById(R.id.jkj);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.seek_layout)");
        this.LJLLILLLL = (FrameLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.n9k);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.videolayout)");
        this.LJLLL = requireViewById3;
        View requireViewById4 = requireViewById(R.id.btt);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.content_layout)");
        this.LJLLLLLL = (ViewGroup) requireViewById4;
        View requireViewById5 = requireViewById(R.id.kdd);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.start_record_btn)");
        this.LJLZ = (C6LO) requireViewById5;
        View requireViewById6 = requireViewById(R.id.m19);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.tv_button_state)");
        this.LJZ = (TextView) requireViewById6;
        View requireViewById7 = requireViewById(R.id.af2);
        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.back_view)");
        this.LJZI = requireViewById7;
        View requireViewById8 = requireViewById(R.id.a9x);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.audio_edit_split_line)");
        this.LJZL = requireViewById8;
        View requireViewById9 = requireViewById(R.id.mbf);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.tv_msg)");
        this.LL = (TextView) requireViewById9;
        View requireViewById10 = requireViewById(R.id.a9y);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.audio_edit_tab_cb)");
        this.LLF = (CheckBox) requireViewById10;
        View requireViewById11 = requireViewById(R.id.a9w);
        o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.audio_edit_cb_layout)");
        this.LLFF = requireViewById11;
        View requireViewById12 = requireViewById(R.id.a9z);
        o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.audio_edit_tab_cb_tv)");
        this.LLFFF = requireViewById12;
        LLJILJILJ();
        View requireViewById13 = requireViewById(R.id.g8y);
        o.LJIIIIZZ(requireViewById13, "requireViewById(R.id.loading_status)");
        this.LJLJLLL = (C73305Spp) requireViewById13;
        View requireViewById14 = requireViewById(R.id.g90);
        o.LJIIIIZZ(requireViewById14, "requireViewById(R.id.loading_status_layout)");
        this.LJLL = requireViewById14;
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.6LN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, requireViewById14);
        View requireViewById15 = requireViewById(R.id.ga_);
        o.LJIIIIZZ(requireViewById15, "requireViewById(R.id.lottie_view)");
        C29701Eo c29701Eo = (C29701Eo) requireViewById15;
        this.LLD = c29701Eo;
        c29701Eo.setAnimation("tool_recording_dark_lottie.json");
        C29701Eo c29701Eo2 = this.LLD;
        if (c29701Eo2 != null) {
            c29701Eo2.setRepeatCount(-1);
            View requireViewById16 = requireViewById(R.id.bbc);
            o.LJIIIIZZ(requireViewById16, "requireViewById(R.id.choose_video_cover_view)");
            this.LJLLJ = (ViewOnTouchListenerC141755hL) requireViewById16;
            LLJJIII();
            LLJJ();
            View view = this.LLFF;
            if (view != null) {
                C16880lQ.LJIIJ(this.LLFZ, view);
                View view2 = this.LJLLI;
                if (view2 != null) {
                    C16880lQ.LJIIJ(this.LLFZ, view2);
                    View view3 = this.LJLLL;
                    if (view3 != null) {
                        C16880lQ.LJIIJ(this.LLFZ, view3);
                        View view4 = this.LJZI;
                        if (view4 != null) {
                            C16880lQ.LJIIJ(this.LLFZ, view4);
                            C6LO c6lo = this.LJLZ;
                            if (c6lo != null) {
                                c6lo.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 12)));
                                C6LO c6lo2 = this.LJLZ;
                                if (c6lo2 != null) {
                                    c6lo2.setOnLongClickListener(new IDCListenerS295S0100000_2(this, 1));
                                    C6LO c6lo3 = this.LJLZ;
                                    if (c6lo3 != null) {
                                        c6lo3.setOnTouchListener(new IDTListenerS112S0100000_2(this, 5));
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6L6
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLJJL);
                                            }
                                        }, null, new AqS168S0100000_2(this, 111), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LI
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLJI);
                                            }
                                        }, null, new AqS168S0100000_2(this, 112), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LJ
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLJJI);
                                            }
                                        }, null, new AqS168S0100000_2(this, 113), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LK
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Integer.valueOf(((C6L7) obj).LJLIL);
                                            }
                                        }, null, new AqS168S0100000_2(this, 114), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LL
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLILLLLZI);
                                            }
                                        }, null, new AqS168S0100000_2(this, 108), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LG
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLJL);
                                            }
                                        }, null, new AqS168S0100000_2(this, 109), 2, null);
                                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6LH
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return Boolean.valueOf(((C6L7) obj).LJLJJLL);
                                            }
                                        }, null, new AqS168S0100000_2(this, 110), 2, null);
                                        return;
                                    }
                                    o.LJIJI("audioRecordStartButton");
                                    throw null;
                                }
                                o.LJIJI("audioRecordStartButton");
                                throw null;
                            }
                            o.LJIJI("audioRecordStartButton");
                            throw null;
                        }
                        o.LJIJI("backView");
                        throw null;
                    }
                    o.LJIJI("videoLayout");
                    throw null;
                }
                o.LJIJI("playView");
                throw null;
            }
            o.LJIJI("checkBoxLayout");
            throw null;
        }
        o.LJIJI("lottieAnimationView");
        throw null;
    }

    public C158706Ks(VideoPublishEditModel videoPublishEditModel, InterfaceC135455Th vOApiComponent, C82622Wbi diContainer) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        o.LJIIIZ(vOApiComponent, "vOApiComponent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = vOApiComponent;
        this.LJLJI = diContainer;
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC142515iZ.class, null);
        this.LJLJJL = new AudioRecorderParam();
        this.LJLJL = new C5T9(vOApiComponent.Ll0());
        this.LJLJLJ = true;
        this.LLFII = true;
        this.LLFZ = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 11);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc8, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}

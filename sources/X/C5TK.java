package X;

import Y.AObserverS66S0200000_2;
import Y.IDCListenerS295S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5TK */
/* loaded from: classes3.dex */
public final class C5TK extends AbstractC56012Ht<C5TX, C5TL> {
    public final VideoPublishEditModel LJLIL;
    public final InterfaceC143655kP LJLILLLLZI;
    public final C5T9 LJLJI;
    public final InterfaceC139655dx LJLJJI;
    public C6LO LJLJJL;
    public boolean LJLJJLL;
    public C5FN LJLJL;
    public TuxIconView LJLJLJ;
    public LinearLayout LJLJLLL;
    public boolean LJLL;
    public View LJLLI;
    public C5FJ LJLLILLLL;
    public boolean LJLLJ;

    public final void LLJILJIL() {
        int i;
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            if (this.LJLJI.LIZJ().isEmpty() || this.LJLJJLL) {
                i = 8;
            } else {
                i = 0;
            }
            tuxIconView.setVisibility(i);
            return;
        }
        o.LJIJI("backRecordView");
        throw null;
    }

    public final void LLJILJILJ() {
        View requireViewById = requireViewById(R.id.a9w);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.audio_edit_cb_layout)");
        this.LJLJLLL = (LinearLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.a9y);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.audio_edit_tab_cb)");
        C71897SJp c71897SJp = (C71897SJp) requireViewById2;
        View requireViewById3 = requireViewById(R.id.a9z);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.audio_edit_tab_cb_tv)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById3;
        LinearLayout linearLayout = this.LJLJLLL;
        if (linearLayout != null) {
            C146035oF.LIZJ(linearLayout, new AqS149S0200000_2(this, c71897SJp, 20));
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5TT
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C5TX) obj).LJLJJLL;
                }
            }, null, new AqS168S0100000_2(c71897SJp, 125), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5TU
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C5TX) obj).LJLJJL;
                }
            }, null, new AqS106S0300000_2(c71897SJp, tuxTextView, this, 4), 2, null);
            VideoPublishEditModel videoPublishEditModel = this.LJLIL;
            if (C44384HbQ.LJLJJI(videoPublishEditModel)) {
                LinearLayout linearLayout2 = this.LJLJLLL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                } else {
                    o.LJIJI("checkBoxLayout");
                    throw null;
                }
            } else {
                LinearLayout linearLayout3 = this.LJLJLLL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                } else {
                    o.LJIJI("checkBoxLayout");
                    throw null;
                }
            }
            if (videoPublishEditModel.isDuet() || C44384HbQ.LJLLLL(videoPublishEditModel) || videoPublishEditModel.isPhotoMvMode || videoPublishEditModel.editMusicSyncMode || C44384HbQ.LJZL(videoPublishEditModel) || videoPublishEditModel.isStickPointMode || ((videoPublishEditModel.isCurrentAutoCutMode() && !HRX.LIZLLL()) || videoPublishEditModel.isMuted)) {
                LinearLayout linearLayout4 = this.LJLJLLL;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("checkBoxLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("checkBoxLayout");
        throw null;
    }

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        this.LJLLJ = true;
        if (this.LJLJJLL) {
            LLJJI(this, "", false, 6);
        }
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        super.onResume();
        this.LJLLJ = false;
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        long j;
        super.onShow();
        C5FN c5fn = this.LJLJL;
        if (c5fn != null) {
            InterfaceC153045zY value = this.LJLILLLLZI.Kh().getValue();
            if (value != null) {
                j = value.getDuration();
            } else {
                j = 0;
            }
            c5fn.LJLJJLL = j;
            long j2 = 1000;
            if (j >= 1000) {
                long j3 = 1000;
                j2 = j3 * (j / j3);
            }
            c5fn.LJLJL = (int) (((float) j2) * c5fn.LJLJLJ);
            LLJILJILJ();
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
            return;
        }
        o.LJIJI("audioRecordWaveGroup");
        throw null;
    }

    public final void LLJJIII(String str) {
        long j;
        if (this.LJLLILLLL != C5FJ.IDLE) {
            return;
        }
        this.LJLJJLL = true;
        C5FN c5fn = this.LJLJL;
        if (c5fn != null) {
            InterfaceC153045zY value = this.LJLILLLLZI.Kh().getValue();
            if (value != null) {
                j = value.LJZL();
            } else {
                j = 0;
            }
            C131735Ez c131735Ez = c5fn.LJLLILLLL;
            if (c131735Ez != null) {
                c131735Ez.setStartRecordTime(j);
                getUiActions().LJLILLLLZI.invoke(null, str);
                C6LO c6lo = this.LJLJJL;
                if (c6lo != null) {
                    c6lo.setBgColorDrawable(null);
                    C6LO c6lo2 = this.LJLJJL;
                    if (c6lo2 != null) {
                        InterfaceC135405Tc interfaceC135405Tc = c6lo2.LJLILLLLZI;
                        if (interfaceC135405Tc != null) {
                            interfaceC135405Tc.LIZIZ();
                        }
                        C6LO c6lo3 = this.LJLJJL;
                        if (c6lo3 != null) {
                            c6lo3.setStopTintColorRes(R.attr.eb);
                            C6LO c6lo4 = this.LJLJJL;
                            if (c6lo4 != null) {
                                int LIZIZ = C7MY.LIZIZ(24);
                                int LIZIZ2 = C7MY.LIZIZ(24);
                                InterfaceC135405Tc interfaceC135405Tc2 = c6lo4.LJLILLLLZI;
                                if (interfaceC135405Tc2 != null) {
                                    interfaceC135405Tc2.LIZ(LIZIZ, LIZIZ2);
                                }
                                C5FN c5fn2 = this.LJLJL;
                                if (c5fn2 != null) {
                                    c5fn2.setRecording(true);
                                    View view = this.LJLLI;
                                    if (view != null) {
                                        view.setVisibility(0);
                                        LLJILJIL();
                                        return;
                                    } else {
                                        o.LJIJI("disableScrollMaskView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("audioRecordWaveGroup");
                                throw null;
                            }
                            o.LJIJI("recordBtn");
                            throw null;
                        }
                        o.LJIJI("recordBtn");
                        throw null;
                    }
                    o.LJIJI("recordBtn");
                    throw null;
                }
                o.LJIJI("recordBtn");
                throw null;
            }
            o.LJIJI("recordAudioWaveLayout");
            throw null;
        }
        o.LJIJI("audioRecordWaveGroup");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        int duration;
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cb);
        c110614Vt.LJIIIIZZ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        c110614Vt.LJIIIZ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        view.setBackground(c110614Vt.LIZ(requireSceneContext));
        View requireViewById = requireViewById(R.id.a_a);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.aud…record_wave_group_layout)");
        C5FN c5fn = (C5FN) requireViewById;
        this.LJLJL = c5fn;
        Activity activity = this.mActivity;
        if (activity != null) {
            InterfaceC143655kP editPreviewApi = this.LJLILLLLZI;
            VideoPublishEditModel mVideoPublishEditModel = this.LJLIL;
            o.LJIIIZ(editPreviewApi, "editPreviewApi");
            o.LJIIIZ(mVideoPublishEditModel, "mVideoPublishEditModel");
            InterfaceC153045zY value = editPreviewApi.Kh().getValue();
            if (value != null) {
                C5OV c5ov = new C5OV(editPreviewApi);
                c5fn.LJLLLLLL = c5ov;
                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = c5fn.LJLL;
                if (viewOnTouchListenerC141755hL != null) {
                    viewOnTouchListenerC141755hL.LIZLLL();
                    viewOnTouchListenerC141755hL.setLayoutManager(new WrapLinearLayoutManager(0));
                    int frameHeight = viewOnTouchListenerC141755hL.getFrameHeight();
                    int frameWidth = viewOnTouchListenerC141755hL.getFrameWidth();
                    if (value.getDuration() < 1000) {
                        duration = 1;
                    } else {
                        duration = value.getDuration() / 1000;
                    }
                    viewOnTouchListenerC141755hL.setCoverSize(duration);
                    if (C6WA.LIZ()) {
                        get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                    } else {
                        get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                    }
                    c5ov.LIZIZ = new WFB(new VEVideoCoverGeneratorImpl(value, C78840Uwu.LJJIJIIJIL(viewOnTouchListenerC141755hL), viewOnTouchListenerC141755hL.getCoverSize(), get_frames_flags, "record_page"), frameWidth, frameHeight, duration);
                    if (mVideoPublishEditModel.isMvThemeVideoType()) {
                        final C113584d0 c113584d0 = new C113584d0(frameWidth, frameHeight);
                        viewOnTouchListenerC141755hL.setAdapter(c113584d0);
                        C6YX c6yx = new C6YX();
                        c6yx.LIZIZ = OJY.LJLIL;
                        c6yx.LJIIL = editPreviewApi.x7();
                        c6yx.LJIIJJI = editPreviewApi.C0();
                        c6yx.LJIILJJIL = frameWidth;
                        if (!e1.LIZ(31744, "audio_editing_show_loading_at_recording", true, true)) {
                            c6yx.LJIILIIL = true;
                        }
                        if (activity instanceof SAAActivity) {
                            ((SAAActivity) activity).LLIIJI("getIntent", new AqS7S0401000_2(c6yx, activity, value, duration, c113584d0, 2));
                        } else {
                            c6yx.LIZ(activity, value, duration, new C5UO() { // from class: X.5TS
                                @Override // X.C5UO
                                public final void LIZ(List<Bitmap> list) {
                                    C113584d0.this.LJLLLLLL(list);
                                }
                            });
                        }
                        viewOnTouchListenerC141755hL.setAdapter(c113584d0);
                    } else {
                        viewOnTouchListenerC141755hL.setAdapter(new C162626Zu(c5ov.LIZIZ, frameWidth, frameHeight));
                    }
                } else {
                    o.LJIJI("coverView");
                    throw null;
                }
            }
        }
        C5T9 c5t9 = this.LJLJI;
        C5FN c5fn2 = this.LJLJL;
        if (c5fn2 != null) {
            c5t9.LJIIIZ = c5fn2;
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Ta
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C5TX) obj).LJLIL;
                }
            }, null, new AqS168S0100000_2(this, 126), 2, null);
            C5FN c5fn3 = this.LJLJL;
            if (c5fn3 != null) {
                c5fn3.setScrollListener(new AqS184S0100000_2(this, 21));
                C5FN c5fn4 = this.LJLJL;
                if (c5fn4 != null) {
                    c5fn4.setOnScrollStateChanged(new IDqS427S0100000_2(this, 1));
                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5TY
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C5TX) obj).LJLJL;
                        }
                    }, null, new AqS168S0100000_2(this, LiveTryModeCountDownThresholdSetting.DEFAULT), 2, null);
                    View requireViewById2 = requireViewById(R.id.ir2);
                    o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.record_back_view)");
                    TuxIconView tuxIconView = (TuxIconView) requireViewById2;
                    this.LJLJLJ = tuxIconView;
                    C146035oF.LIZJ(tuxIconView, new AqS152S0100000_2(this, 191));
                    LLJILJIL();
                    View requireViewById3 = requireViewById(R.id.ca6);
                    o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.disable_mask_view)");
                    this.LJLLI = requireViewById3;
                    View requireViewById4 = requireViewById(R.id.kdd);
                    o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.start_record_btn)");
                    C6LO c6lo = (C6LO) requireViewById4;
                    this.LJLJJL = c6lo;
                    C146035oF.LIZJ(c6lo, new AqS152S0100000_2(this, 194));
                    C6LO c6lo2 = this.LJLJJL;
                    if (c6lo2 != null) {
                        c6lo2.setOnLongClickListener(new IDCListenerS295S0100000_2(this, 2));
                        C6LO c6lo3 = this.LJLJJL;
                        if (c6lo3 != null) {
                            c6lo3.setOnTouchListener(new IDTListenerS112S0100000_2(this, 6));
                            View requireViewById5 = requireViewById(R.id.m5o);
                            o.LJIIIIZZ(requireViewById5, "requireViewById<View>(R.id.tv_done)");
                            C146035oF.LIZJ(requireViewById5, new AqS152S0100000_2(this, 195));
                            View requireViewById6 = requireViewById(R.id.ir4);
                            o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.record_btn_border)");
                            C5T9 c5t92 = this.LJLJI;
                            AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, requireViewById6, 39);
                            c5t92.getClass();
                            c5t92.LIZIZ().observe(this, new AObserverS66S0200000_2(c5t92, aqS133S0200000_2, 0));
                            C6LO c6lo4 = this.LJLJJL;
                            if (c6lo4 != null) {
                                int LIZIZ = C7MY.LIZIZ(24);
                                int LIZIZ2 = C7MY.LIZIZ(24);
                                InterfaceC135405Tc interfaceC135405Tc = c6lo4.LJLILLLLZI;
                                if (interfaceC135405Tc != null) {
                                    interfaceC135405Tc.LIZ(LIZIZ, LIZIZ2);
                                }
                                C6LO c6lo5 = this.LJLJJL;
                                if (c6lo5 != null) {
                                    c6lo5.setRecordingTintRes(R.raw.icon_mic_fill);
                                    LLJILJILJ();
                                    this.LJLJI.LIZLLL(new AqS152S0100000_2(this, 192), new AqS152S0100000_2(this, 193), C135425Te.LJLIL, new AqS168S0100000_2(this, 123));
                                    AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5TZ
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((C5TX) obj).LJLJJI;
                                        }
                                    }, null, new AqS168S0100000_2(this, 124), 2, null);
                                    return;
                                }
                                o.LJIJI("recordBtn");
                                throw null;
                            }
                            o.LJIJI("recordBtn");
                            throw null;
                        }
                        o.LJIJI("recordBtn");
                        throw null;
                    }
                    o.LJIJI("recordBtn");
                    throw null;
                }
                o.LJIJI("audioRecordWaveGroup");
                throw null;
            }
            o.LJIJI("audioRecordWaveGroup");
            throw null;
        }
        o.LJIJI("audioRecordWaveGroup");
        throw null;
    }

    public final void LLJJ(int i, String str, boolean z) {
        int i2;
        if (this.LJLJJLL) {
            C6LO c6lo = this.LJLJJL;
            if (c6lo != null) {
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                Integer LJI = C79045V0n.LJI(R.attr.eb, requireSceneContext);
                if (LJI != null) {
                    i2 = LJI.intValue();
                } else {
                    i2 = 0;
                }
                c6lo.setBgColorRes(i2);
                C6LO c6lo2 = this.LJLJJL;
                if (c6lo2 != null) {
                    InterfaceC135405Tc interfaceC135405Tc = c6lo2.LJLILLLLZI;
                    if (interfaceC135405Tc != null) {
                        interfaceC135405Tc.LIZJ();
                    }
                    C6LO c6lo3 = this.LJLJJL;
                    if (c6lo3 != null) {
                        int LIZIZ = C7MY.LIZIZ(24);
                        int LIZIZ2 = C7MY.LIZIZ(24);
                        InterfaceC135405Tc interfaceC135405Tc2 = c6lo3.LJLILLLLZI;
                        if (interfaceC135405Tc2 != null) {
                            interfaceC135405Tc2.LIZ(LIZIZ, LIZIZ2);
                        }
                    } else {
                        o.LJIJI("recordBtn");
                        throw null;
                    }
                } else {
                    o.LJIJI("recordBtn");
                    throw null;
                }
            } else {
                o.LJIJI("recordBtn");
                throw null;
            }
        }
        this.LJLJJLL = false;
        getUiActions().LJLJI.invoke(Boolean.valueOf(z), Integer.valueOf(i), null, str);
        this.LJLJI.LIZ();
        C5FN c5fn = this.LJLJL;
        if (c5fn != null) {
            c5fn.setRecording(false);
            LLJILJIL();
            View view = this.LJLLI;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("disableScrollMaskView");
                throw null;
            }
        }
        o.LJIJI("audioRecordWaveGroup");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc1, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C5TK(VideoPublishEditModel publishEditModel, InterfaceC142545ic editPreviewApi, C5T9 editProgressHelper, InterfaceC139655dx interfaceC139655dx) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(editProgressHelper, "editProgressHelper");
        this.LJLIL = publishEditModel;
        this.LJLILLLLZI = editPreviewApi;
        this.LJLJI = editProgressHelper;
        this.LJLJJI = interfaceC139655dx;
        this.LJLLILLLL = C5FJ.IDLE;
    }

    public static /* synthetic */ void LLJJI(C5TK c5tk, String str, boolean z, int i) {
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = -1;
        }
        c5tk.LLJJ(i2, str, z);
    }
}

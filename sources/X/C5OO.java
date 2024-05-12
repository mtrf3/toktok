package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5OO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OO extends AbstractC56012Ht<C5M1, C133335Ld> {
    public final VideoPublishEditModel LJLIL;
    public final C164926dc LJLILLLLZI;
    public final InterfaceC165006dk LJLJI;
    public final C5OB LJLJJI;
    public final C5OE LJLJJL;
    public final InterfaceC153045zY LJLJJLL;
    public final C126844yO LJLJL;
    public RelativeLayout LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public LinearLayout LJLLI;
    public FrameLayout LJLLILLLL;
    public ViewOnTouchListenerC141755hL LJLLJ;
    public LinearLayout LJLLL;
    public ImageView LJLLLL;
    public C223338pd LJLLLLLL;
    public TuxIconView LJLZ;
    public TuxIconView LJZ;
    public TuxIconView LJZI;
    public TuxIconView LJZL;
    public LinearLayout LL;
    public TuxTextView LLD;
    public W5G LLF;
    public final HashMap<String, InterfaceC45930I0w> LLFF;
    public boolean LLFFF;
    public C164916db LLFII;
    public C5O8 LLFZ;
    public WFB LLI;

    public final void LLJILJIL() {
        TuxIconView tuxIconView = this.LJZ;
        if (tuxIconView != null) {
            LLJJ(tuxIconView, false);
            C5O8 c5o8 = this.LLFZ;
            if (c5o8 != null) {
                c5o8.LJIIIIZZ();
                C164916db c164916db = this.LLFII;
                if (c164916db != null) {
                    c164916db.LJLIIIL(null);
                    this.LJLJI.LJIIIIZZ();
                    return;
                } else {
                    o.LJIJI("panelView");
                    throw null;
                }
            }
            o.LJIJI("singleTrackView");
            throw null;
        }
        o.LJIJI("ivDelete");
        throw null;
    }

    public final void LLJILJILJ() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            W5G w5g = this.LLF;
            if (w5g != null) {
                w5g.setVisibility(8);
                TuxTextView tuxTextView = this.LLD;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("designerNameView");
                    throw null;
                }
            }
            o.LJIJI("designerAvatarView");
            throw null;
        }
        o.LJIJI("designerInfoLayout");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        C162626Zu c162626Zu;
        super.onActivityCreated(bundle);
        AbstractViewOnClickListenerC81978WFi abstractViewOnClickListenerC81978WFi = new AbstractViewOnClickListenerC81978WFi() { // from class: X.5Le
            {
                super(0, 3);
            }

            @Override // X.AbstractViewOnClickListenerC81978WFi
            public final void LIZ(View v) {
                o.LJIIIZ(v, "v");
                C5OO c5oo = C5OO.this;
                c5oo.getClass();
                int id = v.getId();
                if (id == R.id.n6e) {
                    c5oo.getUiActions().LJLILLLLZI.invoke();
                    return;
                }
                if (id == R.id.i33) {
                    c5oo.getUiActions().LJLJLJ.invoke();
                    return;
                }
                if (id == R.id.f8p) {
                    c5oo.getUiActions().LJLILLLLZI.invoke();
                    return;
                }
                if (id == R.id.mij) {
                    c5oo.getUiActions().LJLIL.invoke(Boolean.TRUE);
                    return;
                }
                if (id == R.id.m1c) {
                    c5oo.getUiActions().LJLIL.invoke(Boolean.FALSE);
                    return;
                }
                if (id == R.id.f1j) {
                    C08630Vn<NLETrackSlot> c08630Vn = c5oo.getUiStates().LJ.LJIIJ;
                    if (c08630Vn == null) {
                        return;
                    }
                    c5oo.getUiActions().LJLJJL.invoke(c08630Vn.LIZIZ);
                    return;
                }
                if (id == R.id.fc1) {
                    c5oo.getUiActions().LJLJI.invoke(Boolean.TRUE);
                } else {
                    if (id != R.id.f9o) {
                        return;
                    }
                    c5oo.getUiActions().LJLJI.invoke(Boolean.FALSE);
                }
            }
        };
        View requireViewById = requireViewById(R.id.j7n);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.root_layout)");
        this.LJLJLJ = (RelativeLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.aq7);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.bottom_layout)");
        this.LJLLI = (LinearLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.m4x);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tv_designer_name)");
        this.LLD = (TuxTextView) requireViewById3;
        View requireViewById4 = requireViewById(R.id.m4w);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.tv_designer_icon)");
        this.LLF = (W5G) requireViewById4;
        View requireViewById5 = requireViewById(R.id.fm0);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.layout_sticker_designer_info)");
        this.LL = (LinearLayout) requireViewById5;
        int LJIIIZ = (int) (KL2.LJIIIZ(requireSceneContext()) * this.LJLILLLLZI.LJJ);
        View requireViewById6 = requireViewById(R.id.i33);
        o.LJIIIIZZ(requireViewById6, "requireViewById<View>(R.id.preview_layout)");
        C16880lQ.LJIIJ(abstractViewOnClickListenerC81978WFi, requireViewById6);
        ViewGroup.LayoutParams layoutParams = requireViewById6.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = this.LJLJJI.LJLLL + LJIIIZ;
        this.LJLJLLL = requireViewById6;
        View requireViewById7 = requireViewById(R.id.n6e);
        o.LJIIIIZZ(requireViewById7, "requireViewById<View>(R.id.video_layout)");
        C16880lQ.LJIIJ(abstractViewOnClickListenerC81978WFi, requireViewById7);
        this.LJLL = requireViewById7;
        View requireViewById8 = requireViewById(R.id.lj5);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.track_layout)");
        FrameLayout frameLayout = (FrameLayout) requireViewById8;
        this.LJLLILLLL = frameLayout;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).height = this.LJLJJI.LJLLL;
        View requireViewById9 = requireViewById(R.id.hht);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.panel_layout)");
        LinearLayout linearLayout = (LinearLayout) requireViewById9;
        this.LJLLL = linearLayout;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams3).height = LJIIIZ;
        View requireViewById10 = requireViewById(R.id.g94);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.loading_view)");
        this.LJLLLLLL = (C223338pd) requireViewById10;
        View requireViewById11 = requireViewById(R.id.m1c);
        o.LJIIIIZZ(requireViewById11, "requireViewById<TuxTextView>(R.id.tv_cancel)");
        C16880lQ.LJJJJI((TuxTextView) requireViewById11, abstractViewOnClickListenerC81978WFi);
        View requireViewById12 = requireViewById(R.id.mij);
        o.LJIIIIZZ(requireViewById12, "requireViewById<TuxTextView>(R.id.tv_save)");
        C16880lQ.LJJJJI((TuxTextView) requireViewById12, abstractViewOnClickListenerC81978WFi);
        View requireViewById13 = requireViewById(R.id.f8p);
        o.LJIIIIZZ(requireViewById13, "requireViewById<TuxIconView>(R.id.iv_play)");
        TuxIconView tuxIconView = (TuxIconView) requireViewById13;
        C16880lQ.LJJJ(tuxIconView, abstractViewOnClickListenerC81978WFi);
        this.LJLZ = tuxIconView;
        View requireViewById14 = requireViewById(R.id.f1j);
        o.LJIIIIZZ(requireViewById14, "requireViewById<TuxIconView>(R.id.iv_delete)");
        TuxIconView tuxIconView2 = (TuxIconView) requireViewById14;
        C134235Op.LIZIZ(tuxIconView2, 0.5f);
        C16880lQ.LJJJ(tuxIconView2, abstractViewOnClickListenerC81978WFi);
        this.LJZ = tuxIconView2;
        View requireViewById15 = requireViewById(R.id.fc1);
        o.LJIIIIZZ(requireViewById15, "requireViewById<TuxIconView>(R.id.iv_undo)");
        TuxIconView tuxIconView3 = (TuxIconView) requireViewById15;
        C134235Op.LIZIZ(tuxIconView3, 0.5f);
        C16880lQ.LJJJ(tuxIconView3, abstractViewOnClickListenerC81978WFi);
        this.LJZI = tuxIconView3;
        View requireViewById16 = requireViewById(R.id.f9o);
        o.LJIIIIZZ(requireViewById16, "requireViewById<TuxIconView>(R.id.iv_redo)");
        TuxIconView tuxIconView4 = (TuxIconView) requireViewById16;
        C134235Op.LIZIZ(tuxIconView4, 0.5f);
        C16880lQ.LJJJ(tuxIconView4, abstractViewOnClickListenerC81978WFi);
        this.LJZL = tuxIconView4;
        View requireViewById17 = requireViewById(R.id.bbc);
        o.LJIIIIZZ(requireViewById17, "requireViewById(R.id.choose_video_cover_view)");
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = (ViewOnTouchListenerC141755hL) requireViewById17;
        this.LJLLJ = viewOnTouchListenerC141755hL;
        ViewGroup.LayoutParams layoutParams4 = viewOnTouchListenerC141755hL.getLayoutParams();
        o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i = this.LJLJJI.LJLLJ;
        ((ViewGroup.MarginLayoutParams) layoutParams4).setMargins(i, 0, i, 0);
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (this.LJLJJLL != null) {
            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = this.LJLLJ;
            if (viewOnTouchListenerC141755hL2 != null) {
                viewOnTouchListenerC141755hL2.LIZLLL();
                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL3 = this.LJLLJ;
                if (viewOnTouchListenerC141755hL3 != null) {
                    viewOnTouchListenerC141755hL3.setLayoutManager(new WrapLinearLayoutManager(0));
                    ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL4 = this.LJLLJ;
                    if (viewOnTouchListenerC141755hL4 != null) {
                        int frameHeight = viewOnTouchListenerC141755hL4.getFrameHeight();
                        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL5 = this.LJLLJ;
                        if (viewOnTouchListenerC141755hL5 != null) {
                            int frameWidth = viewOnTouchListenerC141755hL5.getFrameWidth();
                            int ceil = (int) Math.ceil((KL2.LJIIJJI(requireActivity) - (this.LJLJJI.LJLLJ * 2)) / frameWidth);
                            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL6 = this.LJLLJ;
                            if (viewOnTouchListenerC141755hL6 != null) {
                                viewOnTouchListenerC141755hL6.setCoverSize(ceil);
                                if (this.LJLIL.isMvThemeVideoType()) {
                                    final C113584d0 c113584d0 = new C113584d0(frameWidth, frameHeight);
                                    C6YX c6yx = new C6YX();
                                    c6yx.LIZIZ = C78924UyG.LJLIL;
                                    c6yx.LJIILJJIL = frameWidth;
                                    if (requireActivity instanceof SAAActivity) {
                                        ((SAAActivity) requireActivity).LLIIJI("getIntent", new AqS7S0401000_2(c6yx, requireActivity, this, ceil, c113584d0, 5));
                                        c162626Zu = c113584d0;
                                    } else {
                                        c6yx.LIZ(requireActivity, this.LJLJJLL, ceil, new C5UO() { // from class: X.5OS
                                            @Override // X.C5UO
                                            public final void LIZ(List<Bitmap> list) {
                                                C113584d0.this.LJLLLLLL(list);
                                            }
                                        });
                                        c162626Zu = c113584d0;
                                    }
                                } else {
                                    InterfaceC153045zY interfaceC153045zY = this.LJLJJLL;
                                    ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL7 = this.LJLLJ;
                                    if (viewOnTouchListenerC141755hL7 != null) {
                                        int coverSize = viewOnTouchListenerC141755hL7.getCoverSize();
                                        if (C6WA.LIZ()) {
                                            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                                        } else {
                                            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                                        }
                                        this.LLI = new WFB(new VEVideoCoverGeneratorImpl(interfaceC153045zY, this, coverSize, get_frames_flags, "ai_music"), frameWidth, frameHeight, ceil);
                                        c162626Zu = new C162626Zu(this.LLI, frameWidth, frameHeight);
                                    } else {
                                        o.LJIJI("chooseVideoCoverView");
                                        throw null;
                                    }
                                }
                                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL8 = this.LJLLJ;
                                if (viewOnTouchListenerC141755hL8 != null) {
                                    viewOnTouchListenerC141755hL8.setAdapter(c162626Zu);
                                } else {
                                    o.LJIJI("chooseVideoCoverView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("chooseVideoCoverView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("chooseVideoCoverView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("chooseVideoCoverView");
                        throw null;
                    }
                } else {
                    o.LJIJI("chooseVideoCoverView");
                    throw null;
                }
            } else {
                o.LJIJI("chooseVideoCoverView");
                throw null;
            }
        }
        View requireViewById18 = requireViewById(R.id.f1d);
        o.LJIIIIZZ(requireViewById18, "requireViewById<ImageView>(R.id.iv_cursor)");
        ImageView imageView = (ImageView) requireViewById18;
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: X.5OW
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
        o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(this.LJLJJI.LJLLJ - (imageView.getLayoutParams().width / 2));
        this.LJLLLL = imageView;
        C5OB c5ob = this.LJLJJI;
        C5OE c5oe = this.LJLJJL;
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C5O8 c5o8 = new C5O8(c5ob, c5oe, requireSceneContext, this.LJLJL);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 16;
        c5o8.setLayoutParams(layoutParams6);
        ImageView imageView2 = this.LJLLLL;
        if (imageView2 != null) {
            c5o8.setCursor$tools_camera_edit_release(imageView2);
            ImageView imageView3 = this.LJLLLL;
            if (imageView3 != null) {
                c5o8.setOnTouchListener(new C5O9(c5o8, imageView3));
                this.LLFZ = c5o8;
                FrameLayout frameLayout2 = this.LJLLILLLL;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c5o8, 1);
                    VideoPublishEditModel videoPublishEditModel = this.LJLIL;
                    AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
                    Context requireSceneContext2 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    C164916db c164916db = new C164916db(videoPublishEditModel, LJJIJIIJIL, requireSceneContext2, this.LJLILLLLZI, this.LJLJI, this.LJLJJLL, C60903NvH.LJIIJJI().getAccountService());
                    this.LLFII = c164916db;
                    LinearLayout linearLayout2 = this.LJLLL;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(c164916db);
                        observe(getUiStates(), new TBT() { // from class: X.5MD
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LIZ;
                            }
                        }, Lifecycle.State.CREATED, new AqS168S0100000_2(this, 153));
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5OU
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJFF;
                            }
                        }, null, new AqS168S0100000_2(this, 185), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5ME
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LIZLLL;
                            }
                        }, null, new AqS168S0100000_2(this, 187), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5M5
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C5M1) obj).LIZIZ);
                            }
                        }, null, new AqS168S0100000_2(this, 190), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5M3
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LIZJ;
                            }
                        }, null, new AqS168S0100000_2(this, 158), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5M4
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C5M1) obj).LJ);
                            }
                        }, null, new AqS168S0100000_2(this, 177), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5OQ
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C5M1) obj).LJIIIIZZ);
                            }
                        }, null, new AqS168S0100000_2(this, 180), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Lz
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIJ;
                            }
                        }, null, new C5M0(this), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5ON
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C5M1) obj).LJIJI);
                            }
                        }, null, new AqS168S0100000_2(this, 183), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5MC
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIILL;
                            }
                        }, null, new C133185Ko(this), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5MF
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIILLIIL;
                            }
                        }, null, new AqS168S0100000_2(this, 191), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5M6
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIILIIL;
                            }
                        }, null, new AqS168S0100000_2(this, 147), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5M7
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIIL;
                            }
                        }, null, new AqS168S0100000_2(this, 149), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5M8
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIILJJIL;
                            }
                        }, null, new AqS168S0100000_2(this, 151), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5M9
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIIJ;
                            }
                        }, null, new AqS168S0100000_2(this, 154), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5MA
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIIJJI;
                            }
                        }, null, new AqS168S0100000_2(this, 157), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5OP
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C5M1) obj).LJI);
                            }
                        }, null, new AqS168S0100000_2(this, 176), 2, null);
                        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Lp
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJII;
                            }
                        }, null, new AqS168S0100000_2(this, 178), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5OT
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIIIZ;
                            }
                        }, null, new AqS168S0100000_2(this, 181), 2, null);
                        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5MB
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C5M1) obj).LJIJJ;
                            }
                        }, null, new AqS168S0100000_2(this, 184), 2, null);
                        return;
                    }
                    o.LJIJI("panelLayout");
                    throw null;
                }
                o.LJIJI("trackLayout");
                throw null;
            }
            o.LJIJI("ivCursor");
            throw null;
        }
        o.LJIJI("ivCursor");
        throw null;
    }

    public static void LLJJ(TuxIconView tuxIconView, boolean z) {
        int i;
        tuxIconView.setEnabled(z);
        if (z) {
            i = R.attr.dj;
        } else {
            i = R.attr.dn;
        }
        tuxIconView.setTintColorRes(i);
    }

    public final void LLJJI(String str, UrlModel urlModel) {
        W5G w5g = this.LLF;
        if (w5g != null) {
            w5g.setVisibility(0);
            TuxTextView tuxTextView = this.LLD;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = this.LLD;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str);
                    W5G w5g2 = this.LLF;
                    if (w5g2 != null) {
                        C78764Uvg.LJFF(w5g2, urlModel);
                        return;
                    } else {
                        o.LJIJI("designerAvatarView");
                        throw null;
                    }
                }
                o.LJIJI("designerNameView");
                throw null;
            }
            o.LJIJI("designerNameView");
            throw null;
        }
        o.LJIJI("designerAvatarView");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.arm, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C5OO(VideoPublishEditModel editModel, C164926dc c164926dc, C5LO panelListener, C5OB trackConfig, C5LP trackActionListener, InterfaceC153045zY interfaceC153045zY, C126844yO effectNLEHandler) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(panelListener, "panelListener");
        o.LJIIIZ(trackConfig, "trackConfig");
        o.LJIIIZ(trackActionListener, "trackActionListener");
        o.LJIIIZ(effectNLEHandler, "effectNLEHandler");
        this.LJLIL = editModel;
        this.LJLILLLLZI = c164926dc;
        this.LJLJI = panelListener;
        this.LJLJJI = trackConfig;
        this.LJLJJL = trackActionListener;
        this.LJLJJLL = interfaceC153045zY;
        this.LJLJL = effectNLEHandler;
        this.LLFF = new HashMap<>();
        this.LLFFF = true;
    }
}

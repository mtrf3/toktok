package X;

import X.C160316Qx;
import X.C48841JEv;
import X.C64962gm;
import X.C6R7;
import Y.ACListenerS22S0100000_2;
import Y.IDCListenerS252S0100000_2;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS92S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160316Qx implements C6SE, AnonymousClass667 {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C160056Px LIZLLL;
    public final InterfaceC159886Pg LJ;
    public final C62822Ol8 LJFF;
    public final List<C6QO> LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C6RA LJIIIZ;
    public C6R0 LJIIJ;
    public final java.util.Map<Integer, OSZ<Float, Float>> LJIIJJI;
    public C64962gm LJIIL;
    public InterfaceC65784Pro<C76800UCe> LJIILIIL;
    public InterfaceC65784Pro<C76800UCe> LJIILJJIL;
    public InterfaceC65784Pro<C76800UCe> LJIILL;
    public InterfaceC65784Pro<C76800UCe> LJIILLIIL;
    public final java.util.Map<Integer, C159636Oh> LJIIZILJ;

    @Override // X.C6SE
    public final void LIZ(int i, boolean z) {
    }

    @Override // X.C6SE
    public final void LIZIZ(int i) {
    }

    @Override // X.C6SE
    public final void LIZLLL() {
    }

    @Override // X.C6SE
    public final void LJIIJ(int i) {
    }

    @Override // X.C6SE
    public final void LJIIJJI(int i) {
    }

    @Override // X.C6SE
    public final void LJIIL() {
    }

    @Override // X.C6SE
    public final void LJJI(int i) {
    }

    public final C1NS<C6R1> LJIJ() {
        return (C1NS) this.LJIIIIZZ.getValue();
    }

    public final List<InterfaceC160026Pu> LJIJJ() {
        return (List) this.LJFF.getValue();
    }

    public final void LJJIFFI() {
        this.LJIILLIIL.invoke();
        ((C160226Qo) this.LJII.getValue()).LJLIL.invoke(Boolean.TRUE);
        LJIILJJIL(LJIJ().LJ.LIZ, false);
        LJIJ().LJ(C6R9.LJLIL);
        LJIJ().LJ(C6RC.LJLIL);
        C64962gm c64962gm = this.LJIIL;
        if (c64962gm != null) {
            C48841JEv.LIZJ(c64962gm, null);
        }
        ((LinkedHashMap) this.LJIIJJI).clear();
    }

    public final void LJJIII() {
        int LLIZLLLIL = this.LJ.LIZIZ().LLIZLLLIL();
        C6R0 c6r0 = this.LJIIJ;
        if (c6r0 != null) {
            ViewOnTouchListenerC82857WfV videoEditView = c6r0.getVideoEditView();
            videoEditView.setMinVideoLength(100L);
            videoEditView.setMaxVideoLength(LLIZLLLIL);
            videoEditView.LJJI(LLIZLLLIL);
            videoEditView.LJJIJL();
            C6R0 c6r02 = this.LJIIJ;
            if (c6r02 != null) {
                c6r02.getMultiVideoVideoModel().LJLLJ = LLIZLLLIL;
                C6R0 c6r03 = this.LJIIJ;
                if (c6r03 != null) {
                    c6r03.LIZIZ((int) LJIJ().LJ.LJ);
                    C6R0 c6r04 = this.LJIIJ;
                    if (c6r04 != null) {
                        ViewOnTouchListenerC82857WfV videoEditView2 = c6r04.getVideoEditView();
                        if (C16330kX.LIZJ(videoEditView2) && !videoEditView2.isLayoutRequested()) {
                            C6R0 c6r05 = this.LJIIJ;
                            if (c6r05 != null) {
                                c6r05.getVideoEditView().LJJIJLIJ((int) LJIJ().LJ.LJ, (int) LJIJ().LJ.LJFF, false);
                                C6R0 c6r06 = this.LJIIJ;
                                if (c6r06 != null) {
                                    c6r06.getMultiVideoVideoModel().LJLJI.setValue(Long.valueOf(LJIJ().LJ.LJ));
                                    return;
                                } else {
                                    o.LJIJI("stickerDurationEditView");
                                    throw null;
                                }
                            }
                            o.LJIJI("stickerDurationEditView");
                            throw null;
                        }
                        videoEditView2.addOnLayoutChangeListener(new IDCListenerS252S0100000_2(this, 5));
                        return;
                    }
                    o.LJIJI("stickerDurationEditView");
                    throw null;
                }
                o.LJIJI("stickerDurationEditView");
                throw null;
            }
            o.LJIJI("stickerDurationEditView");
            throw null;
        }
        o.LJIJI("stickerDurationEditView");
        throw null;
    }

    @Override // X.AnonymousClass667
    public final C1NS<C6R1> LJI() {
        return LJIJ();
    }

    public final void LJIJJLI(C6QO c6qo) {
        if (!C78880UxY.LJJLIIIIJ(c6qo.LJIJJ())) {
            int LJJLIIIJLJLI = c6qo.LJJLIIIJLJLI();
            float duration = this.LJ.LIZIZ().getDuration();
            C6QO LJJJ = C30581Hy.LJJJ(LJJLIIIJLJLI, this.LJI);
            if (LJJJ != null) {
                LJJJ.LJIIZILJ(0.0f, duration);
            }
            Iterator<InterfaceC160026Pu> it = LJIJJ().iterator();
            while (it.hasNext()) {
                it.next().LJIILJJIL(LJIJ().LJ.LIZ);
            }
        }
    }

    public final void LJJII(C6QO c6qo) {
        boolean z;
        boolean z2;
        WFB wfb;
        LJIJJLI(c6qo);
        LJIJ().LJ(new AqS168S0100000_2(c6qo, 656));
        LJIILJJIL(c6qo.LJJLIIIJLJLI(), true);
        ((C160226Qo) this.LJII.getValue()).LJLIL.invoke(Boolean.FALSE);
        if (this.LJIIJ != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LJIIJ = new C6R0(this.LIZ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            FrameLayout frameLayout = this.LIZIZ;
            C6R0 c6r0 = this.LJIIJ;
            if (c6r0 != null) {
                frameLayout.addView(c6r0, layoutParams);
                C6R0 c6r02 = this.LJIIJ;
                if (c6r02 != null) {
                    C1NS<C6R1> container = LJIJ();
                    LifecycleOwner owner = this.LIZJ;
                    InterfaceC159886Pg service = this.LJ;
                    C6RA uiActions = this.LJIIIZ;
                    o.LJIIIZ(container, "container");
                    o.LJIIIZ(owner, "owner");
                    o.LJIIIZ(service, "service");
                    o.LJIIIZ(uiActions, "uiActions");
                    c6r02.LJLIL = container;
                    c6r02.LJLILLLLZI = owner;
                    c6r02.LJLJI = service;
                    c6r02.LJLJJI = uiActions;
                    C16880lQ.LLLZIIL(R.layout.cnu, C16880lQ.LLZIL(c6r02.getContext()), c6r02);
                    View findViewById = c6r02.findViewById(R.id.l54);
                    o.LJIIIIZZ(findViewById, "findViewById(R.id.text_selected)");
                    c6r02.LJLJJL = (TuxTextView) findViewById;
                    View findViewById2 = c6r02.findViewById(R.id.axw);
                    o.LJIIIIZZ(findViewById2, "findViewById(R.id.btn_play)");
                    c6r02.setPlayButton((TuxIconView) findViewById2);
                    View findViewById3 = c6r02.findViewById(R.id.jag);
                    o.LJIIIIZZ(findViewById3, "findViewById(R.id.save)");
                    c6r02.setSaveButton((ImageView) findViewById3);
                    View findViewById4 = c6r02.findViewById(R.id.b3n);
                    o.LJIIIIZZ(findViewById4, "findViewById(R.id.cancel)");
                    c6r02.setCancelButton((ImageView) findViewById4);
                    if (c6r02.LJLJJLL == null) {
                        View findViewById5 = c6r02.findViewById(R.id.n5k);
                        o.LJIIIIZZ(findViewById5, "findViewById(R.id.video_edit_view)");
                        c6r02.setVideoEditView((ViewOnTouchListenerC82857WfV) findViewById5);
                        LifecycleOwner lifecycleOwner = c6r02.LJLILLLLZI;
                        if (lifecycleOwner != null) {
                            c6r02.setMultiVideoVideoModel((CutMultiVideoViewModel) C165706es.LJIIIIZZ((WM7) lifecycleOwner, null, null, 6).get(CutMultiVideoViewModel.class));
                            c6r02.getVideoEditView().setCanEdit(false);
                            c6r02.getVideoEditView().setMinVideoLength(100L);
                            c6r02.getVideoEditView().setUseCustomMaxVideoLengthDirectly(true);
                            InterfaceC159886Pg interfaceC159886Pg = c6r02.LJLJI;
                            if (interfaceC159886Pg != null) {
                                int LLIZLLLIL = interfaceC159886Pg.LIZIZ().LLIZLLLIL();
                                c6r02.getVideoEditView().setMaxVideoLength(LLIZLLLIL);
                                CutMultiVideoViewModel multiVideoVideoModel = c6r02.getMultiVideoVideoModel();
                                InterfaceC159886Pg interfaceC159886Pg2 = c6r02.LJLJI;
                                if (interfaceC159886Pg2 != null) {
                                    C6OE LJFF = interfaceC159886Pg2.LJFF();
                                    if (LJFF != null) {
                                        z2 = LJFF.LIZLLL();
                                    } else {
                                        z2 = false;
                                    }
                                    multiVideoVideoModel.LJLLILLLL = z2;
                                    c6r02.getMultiVideoVideoModel().LJLLJ = LLIZLLLIL;
                                    ViewOnTouchListenerC82857WfV videoEditView = c6r02.getVideoEditView();
                                    InterfaceC159886Pg interfaceC159886Pg3 = c6r02.LJLJI;
                                    if (interfaceC159886Pg3 != null) {
                                        videoEditView.setVeEditor(interfaceC159886Pg3.LIZIZ());
                                        ViewOnTouchListenerC82857WfV videoEditView2 = c6r02.getVideoEditView();
                                        int frameWidth = videoEditView2.getFrameWidth();
                                        int frameHeight = videoEditView2.getFrameHeight();
                                        int ceil = (int) Math.ceil((KL2.LJIIJJI(c6r02.getContext()) - (videoEditView2.getLeftRightMargin() * 2)) / (frameWidth * 1.0f));
                                        VEEditor.GET_FRAMES_FLAGS get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                                        InterfaceC159886Pg interfaceC159886Pg4 = c6r02.LJLJI;
                                        if (interfaceC159886Pg4 != null) {
                                            if (interfaceC159886Pg4.LJII()) {
                                                InterfaceC159886Pg interfaceC159886Pg5 = c6r02.LJLJI;
                                                if (interfaceC159886Pg5 != null) {
                                                    int duration = interfaceC159886Pg5.LIZIZ().getDuration();
                                                    InterfaceC159886Pg interfaceC159886Pg6 = c6r02.LJLJI;
                                                    if (interfaceC159886Pg6 != null) {
                                                        int LJIIL = interfaceC159886Pg6.LJIIL();
                                                        InterfaceC159886Pg interfaceC159886Pg7 = c6r02.LJLJI;
                                                        if (interfaceC159886Pg7 != null) {
                                                            InterfaceC153045zY LIZIZ = interfaceC159886Pg7.LIZIZ();
                                                            LifecycleOwner lifecycleOwner2 = c6r02.LJLILLLLZI;
                                                            if (lifecycleOwner2 != null) {
                                                                wfb = new WFB(new VEMultiEditVideoCoverGeneratorImpl(LIZIZ, lifecycleOwner2, ceil, duration, LJIIL, get_frames_flags), frameWidth, frameHeight, ceil);
                                                            } else {
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("editService");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("editService");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("editService");
                                                    throw null;
                                                }
                                            } else {
                                                InterfaceC159886Pg interfaceC159886Pg8 = c6r02.LJLJI;
                                                if (interfaceC159886Pg8 != null) {
                                                    InterfaceC153045zY LIZIZ2 = interfaceC159886Pg8.LIZIZ();
                                                    LifecycleOwner lifecycleOwner3 = c6r02.LJLILLLLZI;
                                                    if (lifecycleOwner3 != null) {
                                                        wfb = new WFB(new VEVideoCoverGeneratorImpl(LIZIZ2, lifecycleOwner3, ceil, get_frames_flags, "sticker_select_time"), frameWidth, frameHeight, ceil);
                                                    } else {
                                                        o.LJIJI("lifecycleOwner");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("editService");
                                                    throw null;
                                                }
                                            }
                                            c6r02.LJLLI = wfb;
                                            ViewOnTouchListenerC82857WfV videoEditView3 = c6r02.getVideoEditView();
                                            LifecycleOwner lifecycleOwner4 = c6r02.LJLILLLLZI;
                                            if (lifecycleOwner4 != null) {
                                                WM7 wm7 = (WM7) lifecycleOwner4;
                                                ViewModelProvider LJIIIIZZ = C165706es.LJIIIIZZ(wm7, null, null, 6);
                                                CutMultiVideoViewModel multiVideoVideoModel2 = c6r02.getMultiVideoVideoModel();
                                                WFB wfb2 = c6r02.LJLLI;
                                                if (wfb2 != null) {
                                                    InterfaceC159886Pg interfaceC159886Pg9 = c6r02.LJLJI;
                                                    if (interfaceC159886Pg9 != null) {
                                                        List<MediaModel> LIZJ = interfaceC159886Pg9.LIZJ();
                                                        videoEditView3.LLIILZL = wfb2;
                                                        videoEditView3.LLIIZ = false;
                                                        videoEditView3.LJI(wm7, LJIIIIZZ, multiVideoVideoModel2, LIZJ);
                                                        c6r02.getVideoEditView().setEnableBoundaryText(true);
                                                        c6r02.getVideoEditView().setPointerType(2);
                                                    } else {
                                                        o.LJIJI("editService");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("videoCoverDataSource");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("editService");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("editService");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("editService");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("editService");
                                throw null;
                            }
                        } else {
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                    }
                    ViewOnTouchListenerC82857WfV videoEditView4 = c6r02.getVideoEditView();
                    if (C16330kX.LIZJ(videoEditView4) && !videoEditView4.isLayoutRequested()) {
                        c6r02.LIZ();
                    } else {
                        videoEditView4.addOnLayoutChangeListener(new IDCListenerS252S0100000_2(c6r02, 6));
                    }
                    C6R0 c6r03 = this.LJIIJ;
                    if (c6r03 != null) {
                        C16880lQ.LJIILLIIL(c6r03.getSaveButton(), new ACListenerS22S0100000_2(this, 168));
                        C6R0 c6r04 = this.LJIIJ;
                        if (c6r04 != null) {
                            C16880lQ.LJIILLIIL(c6r04.getCancelButton(), new View.OnClickListener() { // from class: X.6Qz
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i = C160316Qx.this.LJIJ().LJ.LIZ;
                                    C160316Qx c160316Qx = C160316Qx.this;
                                    for (Map.Entry entry : ((LinkedHashMap) c160316Qx.LJIIJJI).entrySet()) {
                                        int intValue = ((Number) entry.getKey()).intValue();
                                        OSZ osz = (OSZ) entry.getValue();
                                        float floatValue = ((Number) osz.getFirst()).floatValue();
                                        float floatValue2 = ((Number) osz.getSecond()).floatValue();
                                        C6QO LJJJ = C30581Hy.LJJJ(intValue, c160316Qx.LJI);
                                        if (LJJJ != null) {
                                            LJJJ.LJIIZILJ(floatValue, floatValue2);
                                        }
                                        Iterator<InterfaceC160026Pu> it = c160316Qx.LJIJJ().iterator();
                                        while (it.hasNext()) {
                                            it.next().LJIILJJIL(intValue);
                                        }
                                    }
                                    C160316Qx.this.LJ.LJ(true);
                                    C160316Qx.this.LJIILIIL.invoke();
                                    C160316Qx.this.LJJIFFI();
                                    Iterator<InterfaceC160026Pu> it2 = C160316Qx.this.LJIJJ().iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LJIJJLI(i);
                                    }
                                }
                            });
                            C6R0 c6r05 = this.LJIIJ;
                            if (c6r05 != null) {
                                C16880lQ.LJJJ(c6r05.getPlayButton(), new ACListenerS22S0100000_2(this, 169));
                                this.LIZJ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationEdit$initObserver$1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                                        C64962gm c64962gm;
                                        o.LJIIIZ(source, "source");
                                        o.LJIIIZ(event, "event");
                                        if (C6R7.LIZ[event.ordinal()] == 1 && (c64962gm = C160316Qx.this.LJIIL) != null) {
                                            C48841JEv.LIZLLL(c64962gm, "");
                                        }
                                    }
                                });
                                LJIJ().LIZ(new TBT() { // from class: X.6RK
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Integer.valueOf(((C6R1) obj).LIZ);
                                    }
                                }).LJIIIIZZ(this.LIZJ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 659));
                                LJIJ().LIZ(new TBT() { // from class: X.6RP
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C6R1) obj).LIZLLL;
                                    }
                                }).LJIIIIZZ(this.LIZJ, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 660));
                            } else {
                                o.LJIJI("stickerDurationEditView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("stickerDurationEditView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("stickerDurationEditView");
                        throw null;
                    }
                } else {
                    o.LJIJI("stickerDurationEditView");
                    throw null;
                }
            } else {
                o.LJIJI("stickerDurationEditView");
                throw null;
            }
        }
        C6R0 c6r06 = this.LJIIJ;
        if (c6r06 != null) {
            InterfaceC159886Pg interfaceC159886Pg10 = c6r06.LJLJI;
            if (interfaceC159886Pg10 != null) {
                List<MediaModel> LIZ = interfaceC159886Pg10.LIZ();
                WFB wfb3 = c6r06.LJLLI;
                if (wfb3 != null) {
                    wfb3.LIZIZ();
                    c6r06.getVideoEditView().LIZ(null, C43547H7f.LIZ(LIZ, true, null, 12));
                    this.LJ.LJ(false);
                    if (c6qo.LJJLIIIJLJLI() >= 0) {
                        this.LJIILL.invoke();
                    }
                    LJJIII();
                    c6qo.LJIIIZ(true, c6qo.LJIJJ());
                    return;
                }
                o.LJIJI("videoCoverDataSource");
                throw null;
            }
            o.LJIJI("editService");
            throw null;
        }
        o.LJIJI("stickerDurationEditView");
        throw null;
    }

    @Override // X.AnonymousClass667
    public final void LIZJ(float f, float f2) {
        LJJII(LJIIZILJ(f, f2));
    }

    @Override // X.AnonymousClass667
    public final void LJII(float f, float f2) {
        C159706Oo LJIIZILJ = LJIIZILJ(f, f2);
        LJIILJJIL(LJIIZILJ.LJJLIIIJLJLI(), true);
        LJIJ().LJ(new AqS92S0101000_2(LJIIZILJ, LJIIZILJ.LJJLIIIJLJLI(), 7));
        LJJIII();
    }

    @Override // X.C6SE
    public final void LJIILIIL(int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public final void LJIILJJIL(int i, boolean z) {
        if (z) {
            if (this.LJIIZILJ.isEmpty()) {
                java.util.Map<Integer, C159636Oh> map = this.LJIIZILJ;
                List<C6QO> list = this.LJI;
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (C6QO c6qo : list) {
                    OSZ osz = new OSZ(Integer.valueOf(c6qo.LJJLIIIJLJLI()), c6qo.LJIIL());
                    linkedHashMap.put(osz.getFirst(), osz.getSecond());
                }
                map.putAll(linkedHashMap);
            }
            for (C6QO c6qo2 : this.LJI) {
                c6qo2.LJII(false);
                c6qo2.LJIJ(false);
                c6qo2.LIZIZ(false);
                c6qo2.LJIILJJIL(false);
                c6qo2.LJIIJJI(true);
                if (c6qo2.LJJLIIIJLJLI() == i) {
                    c6qo2.setAlpha(c6qo2.LIZLLL());
                    Integer LJIILL = c6qo2.LJIILL();
                    if (LJIILL != null) {
                        LJIJ().LJ(C6RL.LJLIL);
                        LJIJ().LJ(new AqS168S0100000_2(LJIILL, 658));
                        LJIJ().LJ(C6RM.LJLIL);
                    } else {
                        LJIJ().LJ(C6RN.LJLIL);
                    }
                } else {
                    c6qo2.setAlpha(0.3137255f);
                }
            }
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIZILJ).entrySet()) {
            C6QO LJJJ = C30581Hy.LJJJ(((Number) entry.getKey()).intValue(), this.LJI);
            if (LJJJ != null) {
                LJJJ.LJII(((C159636Oh) entry.getValue()).LJLJI);
                LJJJ.LJIJ(((C159636Oh) entry.getValue()).LJLJJI);
                LJJJ.LIZIZ(((C159636Oh) entry.getValue()).LJLJL);
                LJJJ.LJIILJJIL(((C159636Oh) entry.getValue()).LJLJJL);
                LJJJ.LJIIJJI(((C159636Oh) entry.getValue()).LJLLILLLL);
            }
        }
        ((LinkedHashMap) this.LJIIZILJ).clear();
        Iterator<C6QO> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
        LJIJ().LJ(C6RO.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.6Oo] */
    public final C159706Oo LJIIZILJ(float f, float f2) {
        final Context context = this.LIZ;
        float f3 = 0.0f;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        final BaseStickerModel baseStickerModel = new BaseStickerModel(-1, 0, null, objArr, objArr2, f3, f3, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, 0 == true ? 1 : 0, f3, f3, f3, f3, f3, f3, f3, f3, f, f2, objArr12, f3, f3, objArr13, f3, -100663298, 0 == true ? 1 : 0);
        final C159636Oh c159636Oh = new C159636Oh((EnumC157656Gr) null, 0, false, false, false, false, false, (List) null, false, (String) null, (OSZ) null, false, false, false, false, false, 131071);
        final LifecycleOwner lifecycleOwner = this.LIZJ;
        final C160056Px c160056Px = this.LIZLLL;
        return new C6OX(context, baseStickerModel, c159636Oh, lifecycleOwner, c160056Px) { // from class: X.6Oo
            @Override // X.C6OX, X.C6QO
            public final float LIZLLL() {
                return 1.0f;
            }

            @Override // X.C6OX
            public final void LJJIJIIJIL(BaseStickerModel baseState) {
                o.LJIIIZ(baseState, "baseState");
            }

            @Override // X.C6QO
            public final void setAlpha(float f4) {
            }

            @Override // X.C6OX, X.C6QO
            public final void setVisible(boolean z) {
            }

            @Override // X.C6QO
            public final StickerModel LIZ() {
                return new TextStickerModel(null, null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262143, null);
            }

            @Override // X.C6OX, X.C6QO
            public final C159636Oh LJIIL() {
                return new C159636Oh((EnumC157656Gr) null, 0, false, false, false, false, false, (List) null, false, (String) null, (OSZ) null, false, false, false, false, false, 131071);
            }

            @Override // X.C6OX
            public final View LJJIJIL() {
                return new View(C160316Qx.this.LIZ);
            }
        };
    }

    @Override // X.C6SE
    public final void LJIILL(float f, int i, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    public C160316Qx(Context context, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = stickerHigherContainer;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = stickerObjectContainer;
        this.LJ = (InterfaceC159886Pg) stickerObjectContainer.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1077));
        this.LJI = C38891fp.LJIIZILJ(stickerObjectContainer);
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1076));
        this.LJIIIIZZ = C221108m2.LIZIZ(C6R3.LJLIL);
        this.LJIIIZ = new C6RA(new AqS168S0100000_2(this, 657), new AqS152S0100000_2(this, 1078));
        this.LJIIJJI = new LinkedHashMap();
        this.LJIILIIL = C6RR.LJLIL;
        this.LJIILJJIL = C6RU.LJLIL;
        this.LJIILL = C6RT.LJLIL;
        this.LJIILLIIL = C6RS.LJLIL;
        this.LJIIZILJ = new LinkedHashMap();
    }

    @Override // X.C6SE
    public final void LJ(int i, float f, float f2, RectF visibleRect) {
        o.LJIIIZ(visibleRect, "visibleRect");
    }

    @Override // X.AnonymousClass667
    public final void LJIIIIZZ(C66C c66c, C66A c66a, AqS149S0200000_2 aqS149S0200000_2, AqS152S0100000_2 aqS152S0100000_2) {
        this.LJIILJJIL = c66c;
        this.LJIILIIL = c66a;
        this.LJIILL = aqS149S0200000_2;
        this.LJIILLIIL = aqS152S0100000_2;
    }

    @Override // X.C6SE
    public final void LJFF(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LJFF(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZJ(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZLLL(enumC157656Gr, rectF);
    }

    @Override // X.C6SE
    public final void LJJ(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(visibleRect, "visibleRect");
        if (LJIJ().LJ.LIZIZ) {
            if (i != LJIJ().LJ.LIZ) {
                C6QO LJJJ = C30581Hy.LJJJ(i, this.LJI);
                if (LJJJ == null) {
                    return;
                }
                LJIILJJIL(i, true);
                this.LJIILL.invoke();
                LJJJ.LJIIIZ(true, LJJJ.LJIJJ());
                LJIJJLI(LJJJ);
                LJIJ().LJ(new AqS92S0101000_2(LJJJ, i, 8));
                LJJIII();
                Iterator<InterfaceC160026Pu> it = LJIJJ().iterator();
                while (it.hasNext()) {
                    it.next().LJIL(i);
                }
                return;
            }
            if (o.LJ(LJIJ().LJ.LIZLLL, Boolean.TRUE)) {
                LJIJ().LJ(C6R4.LJLIL);
                LJJIII();
            }
        }
    }

    @Override // X.C6SE
    public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }

    @Override // X.C6SE
    public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
        C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
    }
}

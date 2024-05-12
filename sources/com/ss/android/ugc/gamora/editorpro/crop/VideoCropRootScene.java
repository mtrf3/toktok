package com.ss.android.ugc.gamora.editorpro.crop;

import X.AbstractC42651GoZ;
import X.C124574uj;
import X.C124994vP;
import X.C126404xg;
import X.C127834zz;
import X.C1280450u;
import X.C132805Jc;
import X.C16880lQ;
import X.C44384HbQ;
import X.C5JS;
import X.C5JU;
import X.C5PL;
import X.C5PM;
import X.C5PU;
import X.C5PX;
import X.C5PZ;
import X.C5QW;
import X.C6D8;
import X.C78688UuS;
import X.C78923UyF;
import X.C79057V0z;
import X.C82622Wbi;
import X.GHB;
import X.InterfaceC126684y8;
import X.InterfaceC1278950f;
import X.InterfaceC134345Pa;
import X.InterfaceC134365Pc;
import X.InterfaceC134575Px;
import X.InterfaceC152665yw;
import X.WM7;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.crop.VideoCropRootScene;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoCropRootScene extends AbstractC42651GoZ {
    public C5JU LJLJJL;
    public C5PM LJLJJLL;
    public InterfaceC134345Pa LJLJL;
    public C5PZ LJLJLJ;
    public C5PX LJLJLLL;
    public InterfaceC134365Pc LJLL;
    public boolean LJLLI;
    public final C5PU LJLLILLLL = new C5JS() { // from class: X.5PU
        @Override // X.C5JS
        public final void LIZIZ(C52X playState) {
            o.LJIIIZ(playState, "playState");
            InterfaceC134345Pa interfaceC134345Pa = VideoCropRootScene.this.LJLJL;
            if (interfaceC134345Pa != null) {
                interfaceC134345Pa.E6(playState);
            }
        }

        @Override // X.C5JS
        public final void LIZ(long j, boolean z) {
            C5PZ c5pz;
            InterfaceC134345Pa interfaceC134345Pa = VideoCropRootScene.this.LJLJL;
            if (interfaceC134345Pa != null) {
                interfaceC134345Pa.LLLLLLLLL(j);
            }
            if (!z && (c5pz = VideoCropRootScene.this.LJLJLJ) != null) {
                c5pz.LLLLLLLLL(j);
            }
        }
    };

    public final void LLLF() {
        ViewGroup viewGroup;
        EditorProContext.Companion.getClass();
        EditorProContext LIZ = C124994vP.LIZ();
        InterfaceC126684y8 nleSession = LIZ.getNleSession();
        nleSession.V8().LJJI();
        SurfaceView LLL = LLL();
        if (LLL != null) {
            LLL.setVisibility(8);
            ViewParent parent = LLL.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(LLL, viewGroup);
            }
            nleSession.V8().LJFF(LLL);
        }
        LIZ.getPlayer().V9();
        nleSession.T8(C79057V0z.LJJ(LIZ));
        nleSession.R8(C79057V0z.LJJI(LIZ));
        nleSession.V8().prepare();
    }

    public final SurfaceView LLL() {
        InterfaceC1278950f previewPanel;
        IPreviewService LIZIZ = C127834zz.LIZIZ();
        if (LIZIZ != null && (previewPanel = LIZIZ.getPreviewPanel()) != null) {
            return previewPanel.Jq();
        }
        return null;
    }

    @Override // X.AbstractC42651GoZ
    public final boolean onBackPressed() {
        WM7 wm7;
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
        if (LJIIJJI != null) {
            wm7 = LJIIJJI.LLJJIII();
        } else {
            wm7 = null;
        }
        if (wm7 instanceof VideoCropRootScene) {
            LLJZIJLIL(true);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onPause() {
        super.onPause();
        C5JU c5ju = this.LJLJJL;
        if (c5ju != null) {
            c5ju.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (r0.LIZ() == true) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.5PL] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJZIJLIL(boolean r28) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.crop.VideoCropRootScene.LLJZIJLIL(boolean):void");
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        String string;
        Bundle bundle3;
        NLEEditor Pm0;
        NLEModel LJ;
        NLETrackSlot LJIILIIL;
        int ordinal;
        NLEEditor Pm02;
        NavigationScene LJIIJJI;
        super.onActivityCreated(bundle);
        if (!(this.mActivity instanceof SAAActivity) && (LJIIJJI = C78923UyF.LJIIJJI(this)) != null) {
            LJIIJJI.LLJILJILJ(this, new GHB() { // from class: X.5PY
                @Override // X.GHB
                public final boolean onBackPressed() {
                    return VideoCropRootScene.this.onBackPressed();
                }
            });
        }
        if (C1280450u.LIZ()) {
            C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 653));
            C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 654));
            C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
            if (c82622Wbi != null) {
                this.LJLJJL = (C5JU) c82622Wbi.LJIIIIZZ(null, C5JU.class);
                this.LJLJJLL = (C5PM) c82622Wbi.LJIIIIZZ(null, C5PM.class);
                this.LJLJL = (InterfaceC134345Pa) c82622Wbi.LJIIIIZZ(null, InterfaceC134345Pa.class);
                this.LJLJLJ = (C5PZ) c82622Wbi.LJIIIIZZ(null, C5PZ.class);
                this.LJLJLLL = (C5PX) c82622Wbi.LJIIIIZZ(null, C5PX.class);
                this.LJLL = (InterfaceC134365Pc) c82622Wbi.LJIIIIZZ(null, InterfaceC134365Pc.class);
                C5JU c5ju = this.LJLJJL;
                if (c5ju != null && (Pm02 = c5ju.Pm0()) != null) {
                    Pm02.addConsumer(new NLEEditorListener() { // from class: X.5PN
                        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                        public final void onChanged() {
                            NLEEditor Pm03;
                            NLEModel LJ2;
                            C5PM c5pm;
                            C5JU c5ju2 = VideoCropRootScene.this.LJLJJL;
                            if (c5ju2 != null && (Pm03 = c5ju2.Pm0()) != null && (LJ2 = Pm03.LJ()) != null && (c5pm = VideoCropRootScene.this.LJLJJLL) != null) {
                                c5pm.LJZ(LJ2);
                            }
                        }
                    });
                }
                SurfaceView LLL = LLL();
                if (LLL == null || (bundle2 = this.mArguments) == null || (string = bundle2.getString("extra_editor_pro_crop_nle_model")) == null || (bundle3 = this.mArguments) == null) {
                    return;
                }
                long j = bundle3.getLong("extra_editor_pro_crop_seek_position");
                C5JU c5ju2 = this.LJLJJL;
                if (c5ju2 != null) {
                    EditorProContext.Companion.getClass();
                    c5ju2.t90(LLL, C124994vP.LIZ().getNleSession(), string, j);
                }
                C5JU c5ju3 = this.LJLJJL;
                if (c5ju3 == null || (Pm0 = c5ju3.Pm0()) == null || (LJ = Pm0.LJ()) == null || (LJIILIIL = LJ.getMainTrack().LJIILIIL(0)) == null) {
                    return;
                }
                C5PM c5pm = this.LJLJJLL;
                if (c5pm != null) {
                    c5pm.aJ("VideoCropMaterial", new C126404xg(c82622Wbi));
                    c5pm.k6("VideoCropMaterial");
                    NLETrack mainTrack = LJ.getMainTrack();
                    o.LJIIIIZZ(mainTrack, "nleModel.mainTrack");
                    c5pm.G6(mainTrack, LJIILIIL);
                }
                C5JU c5ju4 = this.LJLJJL;
                if (c5ju4 != null) {
                    c5ju4.y20(this.LJLLILLLL);
                }
                long measuredEndTime = (LJIILIIL.getMeasuredEndTime() - LJIILIIL.getMeasuredStartTime()) / 1000;
                InterfaceC134345Pa interfaceC134345Pa = this.LJLJL;
                if (interfaceC134345Pa != null) {
                    interfaceC134345Pa.LLIZLLLIL(measuredEndTime);
                    interfaceC134345Pa.LLLLLLLLL(j);
                }
                C5PZ c5pz = this.LJLJLJ;
                if (c5pz != null) {
                    c5pz.LLIZLLLIL(measuredEndTime);
                    c5pz.yd0(LJIILIIL);
                    c5pz.LLLLLLLLL(j);
                }
                C5PX c5px = this.LJLJLLL;
                if (c5px != null) {
                    c5px.k10(new InterfaceC134575Px() { // from class: X.5PJ
                        @Override // X.InterfaceC134575Px
                        public final boolean LIZ(final C5PL cropMode, boolean z) {
                            C126404xg c126404xg;
                            final Rect rect;
                            C134385Pe c134385Pe;
                            o.LJIIIZ(cropMode, "cropMode");
                            C5JU c5ju5 = VideoCropRootScene.this.LJLJJL;
                            if (c5ju5 != null) {
                                c5ju5.pause();
                            }
                            C5PM c5pm2 = VideoCropRootScene.this.LJLJJLL;
                            if (c5pm2 != null && (c126404xg = (C126404xg) c5pm2.s0("VideoCropMaterial")) != null) {
                                final C5PQ c5pq = c126404xg.LJLJLLL;
                                c5pq.getClass();
                                if (c5pq.LJZL == cropMode || cropMode == C5PL.FREE) {
                                    c5pq.LJZL = cropMode;
                                    C134385Pe c134385Pe2 = c5pq.LJLLI;
                                    if (c134385Pe2 != null) {
                                        c134385Pe2.setCropMode(cropMode);
                                    }
                                } else {
                                    c5pq.LJIJJ(false);
                                    C134385Pe c134385Pe3 = c5pq.LJLLI;
                                    if (c134385Pe3 != null && (rect = c134385Pe3.getRect()) != null && (c134385Pe = c5pq.LJLLI) != null) {
                                        final Rect LIZIZ = c134385Pe.LIZIZ(cropMode);
                                        final NLETrackSlot nLETrackSlot = c5pq.LJLJLLL;
                                        if (nLETrackSlot != null) {
                                            final NLETrackSlot LIZ = NLETrackSlot.LIZ(nLETrackSlot.deepClone(true));
                                            final NLETrackSlot finalSlot = NLETrackSlot.LIZ(nLETrackSlot.deepClone(true));
                                            o.LJIIIIZZ(finalSlot, "finalSlot");
                                            float scale = finalSlot.getScale();
                                            EnumC124724uy commitLevel = EnumC124724uy.NONE;
                                            o.LJIIIZ(commitLevel, "commitLevel");
                                            finalSlot.setTransformX(0.0f);
                                            finalSlot.setTransformY(0.0f);
                                            finalSlot.setScale(scale);
                                            commitLevel.ordinal();
                                            if (c5pq.LJIIIIZZ(finalSlot) != null) {
                                                float width = LIZIZ.width() / r5.width();
                                                float height = LIZIZ.height() / r5.height();
                                                if (r5.height() * width >= LIZIZ.height()) {
                                                    C132865Ji.LIZJ(finalSlot, 0.0f, 0.0f, width);
                                                } else {
                                                    C132865Ji.LIZJ(finalSlot, 0.0f, 0.0f, height);
                                                }
                                                ValueAnimator valueAnimator = c5pq.LLF;
                                                if (valueAnimator != null) {
                                                    valueAnimator.cancel();
                                                }
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                c5pq.LLF = ofFloat;
                                                if (ofFloat != null) {
                                                    ofFloat.setDuration(300L);
                                                }
                                                ValueAnimator valueAnimator2 = c5pq.LLF;
                                                if (valueAnimator2 != null) {
                                                    valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5PS
                                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                                        public final void onAnimationUpdate(ValueAnimator it) {
                                                            o.LJIIIZ(it, "it");
                                                            float animatedFraction = it.getAnimatedFraction();
                                                            int i = LIZIZ.left;
                                                            Rect rect2 = rect;
                                                            int i2 = (int) ((i - rect2.left) * animatedFraction);
                                                            int i3 = (int) ((r4.top - rect2.top) * animatedFraction);
                                                            int i4 = (int) ((r4.right - rect2.right) * animatedFraction);
                                                            int i5 = (int) ((r4.bottom - rect2.bottom) * animatedFraction);
                                                            C134385Pe c134385Pe4 = c5pq.LJLLI;
                                                            if (c134385Pe4 != null) {
                                                                Rect rect3 = rect;
                                                                c134385Pe4.setRect(new Rect(rect3.left + i2, rect3.top + i3, rect3.right + i4, rect3.bottom + i5));
                                                            }
                                                            float scale2 = ((finalSlot.getScale() - LIZ.getScale()) * animatedFraction) + LIZ.getScale();
                                                            float transformX = ((finalSlot.getTransformX() - LIZ.getTransformX()) * animatedFraction) + LIZ.getTransformX();
                                                            float transformY = ((finalSlot.getTransformY() - LIZ.getTransformY()) * animatedFraction) + LIZ.getTransformY();
                                                            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                                                            C132865Ji.LIZJ(nLETrackSlot2, transformX - nLETrackSlot2.getTransformX(), transformY - nLETrackSlot.getTransformY(), scale2 / nLETrackSlot.getScale());
                                                            NLEEditor nLEEditor = c5pq.LJLJJLL;
                                                            if (nLEEditor != null) {
                                                                nLEEditor.LIZIZ();
                                                            }
                                                            if (animatedFraction >= 1.0f) {
                                                                C5PQ c5pq2 = c5pq;
                                                                C5PL c5pl = cropMode;
                                                                c5pq2.LJZL = c5pl;
                                                                C134385Pe c134385Pe5 = c5pq2.LJLLI;
                                                                if (c134385Pe5 != null) {
                                                                    c134385Pe5.setCropMode(c5pl);
                                                                }
                                                                c5pq.LJLLILLLL = nLETrackSlot.getScale();
                                                                C5PQ c5pq3 = c5pq;
                                                                c5pq3.LJLLJ = 0.0f;
                                                                c5pq3.LJLLL = 0.0f;
                                                                c5pq3.LJIJJ(true);
                                                                c5pq.LJJII();
                                                                NLEEditor nLEEditor2 = c5pq.LJLJJLL;
                                                                if (nLEEditor2 != null) {
                                                                    nLEEditor2.LIZJ();
                                                                }
                                                            }
                                                        }
                                                    });
                                                }
                                                ValueAnimator valueAnimator3 = c5pq.LLF;
                                                if (valueAnimator3 != null) {
                                                    valueAnimator3.start();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (z) {
                                VideoCropRootScene.this.getClass();
                                VideoPublishEditModel LIZIZ2 = C132805Jc.LIZIZ(EditModelProvider.Companion);
                                if (LIZIZ2 != null) {
                                    VideoCropRootScene.this.getClass();
                                    EditorProContext.Companion.getClass();
                                    C5QW.LJJI(cropMode, LIZIZ2, C124994vP.LIZ());
                                }
                            }
                            return true;
                        }
                    });
                    C5PL[] values = C5PL.values();
                    Integer LJIILLIIL = C124574uj.LJIILLIIL(LJIILIIL);
                    if (LJIILLIIL != null) {
                        ordinal = LJIILLIIL.intValue();
                    } else {
                        ordinal = C5PL.FREE.ordinal();
                    }
                    C5PL c5pl = values[ordinal];
                    c5px.Ee0(c5pl);
                    VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
                    if (LIZIZ != null) {
                        EditorProContext.Companion.getClass();
                        C5QW.LJJI(c5pl, LIZIZ, C124994vP.LIZ());
                    }
                }
                InterfaceC134365Pc interfaceC134365Pc = this.LJLL;
                if (interfaceC134365Pc == null) {
                    return;
                }
                interfaceC134365Pc.B50(new InterfaceC152665yw() { // from class: X.5Pb
                    @Override // X.InterfaceC152665yw
                    public final void LJFF() {
                        VideoCropRootScene.this.LLJZIJLIL(false);
                    }

                    @Override // X.InterfaceC152665yw
                    public final void onCancel() {
                        VideoCropRootScene.this.LLJZIJLIL(true);
                    }
                });
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        NavigationScene LJIIJJI2 = C78923UyF.LJIIJJI(this);
        if (LJIIJJI2 == null) {
            return;
        }
        LJIIJJI2.LLJJIJIL();
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.asf, viewGroup, false, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        SurfaceView LLL = LLL();
        if (LLL != null) {
            ViewParent parent = LLL.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(LLL, viewGroup2);
            }
            LLL.setVisibility(0);
            ((ViewGroup) viewGroup3.findViewById(R.id.kur)).addView(LLL, 0, new FrameLayout.LayoutParams(-1, -1));
            viewGroup3.setOnTouchListener(new View.OnTouchListener() { // from class: X.5PW
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        return viewGroup3;
    }
}

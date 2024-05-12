package com.ss.android.ugc.gamora.editorpro.sticker.text;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C119464mU;
import X.C130965Ca;
import X.C132005Ga;
import X.C132805Jc;
import X.C132965Js;
import X.C133255Kv;
import X.C141335gf;
import X.C1551667c;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C55953Lxd;
import X.C5IY;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78857UxB;
import X.C79057V0z;
import X.C90903hW;
import X.GHB;
import X.H7R;
import X.OSZ;
import Y.IDAListenerS144S0200000_2;
import Y.IDTListenerS112S0100000_2;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ColorPickerFragment extends Fragment {
    public static boolean LJZ;
    public final C132005Ga LJLIL;
    public View LJLILLLLZI;
    public C130965Ca LJLJI;
    public C119464mU LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public Bitmap LJLLI;
    public Bitmap LJLLILLLL;
    public RectF LJLLJ;
    public final C62822Ol8 LJLLL;
    public Integer LJLLLL;
    public final C132965Js LJLLLLLL;
    public final Map<Integer, View> LJLZ;

    public ColorPickerFragment() {
        this(null);
    }

    public final ColorPickerViewModel wl() {
        return (ColorPickerViewModel) this.LJLJLLL.getValue();
    }

    public final float xl() {
        return ((Number) this.LJLLL.getValue()).floatValue();
    }

    public final void Al() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        PreviewPanelViewModel previewPanelViewModel = (PreviewPanelViewModel) ViewModelProviders.of(mo49getActivity).get(PreviewPanelViewModel.class);
        View view = this.LJLJL;
        if (view != null) {
            this.LJLJJL = view.getWidth();
            View view2 = this.LJLJL;
            if (view2 != null) {
                this.LJLJJLL = view2.getHeight();
                View view3 = this.LJLJL;
                if (view3 != null) {
                    OSZ<Float, Float> jv0 = previewPanelViewModel.jv0(view3);
                    float floatValue = jv0.getFirst().floatValue();
                    float floatValue2 = jv0.getSecond().floatValue();
                    RectF rectF = new RectF();
                    o.LJIIIIZZ(requireContext(), "requireContext()");
                    float LJJJJL = (C63081OpJ.LJJJJL(r0) - floatValue) / 2;
                    rectF.left = LJJJJL;
                    rectF.right = LJJJJL + floatValue;
                    View view4 = this.LJLJLJ;
                    if (view4 != null) {
                        float height = view4.getHeight();
                        o.LJIIIIZZ(requireContext(), "requireContext()");
                        float LJJJJLI = height + C63081OpJ.LJJJJLI(r0);
                        rectF.top = LJJJJLI;
                        rectF.bottom = LJJJJLI + floatValue2;
                        this.LJLLJ = rectF;
                        return;
                    }
                    o.LJIJI("actionBar");
                    throw null;
                }
                o.LJIJI("gestureLayout");
                throw null;
            }
            o.LJIJI("gestureLayout");
            throw null;
        }
        o.LJIJI("gestureLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r0.getHeight() != r4.LJLJJLL) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            r4 = this;
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto Lf
            com.bytedance.scene.navigation.NavigationScene r1 = X.C78857UxB.LJJJJZI(r0)
            X.5Js r0 = r4.LJLLLLLL
            r1.LLJILJILJ(r4, r0)
        Lf:
            android.view.View r0 = r4.LJLJL
            r3 = 0
            java.lang.String r2 = "gestureLayout"
            if (r0 == 0) goto L78
            int r1 = r0.getWidth()
            int r0 = r4.LJLJJL
            if (r1 != r0) goto L2a
            android.view.View r0 = r4.LJLJL
            if (r0 == 0) goto L74
            int r1 = r0.getHeight()
            int r0 = r4.LJLJJLL
            if (r1 == r0) goto L2d
        L2a:
            r4.Al()
        L2d:
            r0 = 1
            com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment.LJZ = r0
            r4.LJLLLL = r3
            X.Ol8 r0 = r4.LJLL
            java.lang.Object r0 = r0.getValue()
            com.ss.ugc.android.editor.core.EditorProContext r0 = (com.ss.ugc.android.editor.core.EditorProContext) r0
            if (r0 == 0) goto L4d
            X.4y8 r0 = r0.getNleSession()
            if (r0 == 0) goto L4d
            X.5Mv r1 = r0.P8()
            if (r1 == 0) goto L4d
            r0 = -1
            android.graphics.Bitmap r3 = r1.LJII(r0)
        L4d:
            r4.LJLLILLLL = r3
            X.1qj r1 = r4.requireActivity()
            r0 = 2131377651(0x7f0a3df3, float:1.8375512E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L73
            X.1qj r0 = r4.requireActivity()
            android.view.Window r2 = r0.getWindow()
            java.lang.String r0 = "requireActivity().window"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            kotlin.jvm.internal.AqS184S0100000_2 r1 = new kotlin.jvm.internal.AqS184S0100000_2
            r0 = 61
            r1.<init>(r4, r0)
            X.C61660OHw.LIZ(r2, r3, r1)
        L73:
            return
        L74:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        L78:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment.show():void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.5Js] */
    public ColorPickerFragment(C132005Ga c132005Ga) {
        this.LJLZ = new LinkedHashMap();
        this.LJLIL = c132005Ga;
        this.LJLJLLL = C221108m2.LIZIZ(C5IY.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 600));
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 601));
        this.LJLLLLLL = new GHB() { // from class: X.5Js
            @Override // X.GHB
            public final boolean onBackPressed() {
                ColorPickerFragment colorPickerFragment = ColorPickerFragment.this;
                RectF rectF = colorPickerFragment.LJLLJ;
                if (rectF != null) {
                    float centerX = rectF.centerX();
                    RectF rectF2 = ColorPickerFragment.this.LJLLJ;
                    if (rectF2 != null) {
                        float f = centerX + rectF2.left;
                        float centerY = rectF2.centerY();
                        RectF rectF3 = ColorPickerFragment.this.LJLLJ;
                        if (rectF3 != null) {
                            colorPickerFragment.Hl(f, centerY + rectF3.top);
                            return true;
                        }
                        o.LJIJI("videoArea");
                        throw null;
                    }
                    o.LJIJI("videoArea");
                    throw null;
                }
                o.LJIJI("videoArea");
                throw null;
            }
        };
    }

    public final void Gl(int i) {
        this.LJLLLL = Integer.valueOf(i);
        C130965Ca c130965Ca = this.LJLJI;
        if (c130965Ca != null) {
            c130965Ca.setFillColor(i);
            C119464mU c119464mU = this.LJLJJI;
            if (c119464mU != null) {
                c119464mU.setColor(i);
                C132005Ga c132005Ga = this.LJLIL;
                if (c132005Ga != null) {
                    String slotId = wl().LJLIL;
                    o.LJIIIZ(slotId, "slotId");
                    C1551667c c1551667c = (C1551667c) ((ArrayMap) c132005Ga.LJLL).get(slotId);
                    if (c1551667c != null) {
                        c1551667c.LJIIIIZZ(c1551667c.getBgColorMode(), i);
                        c1551667c.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("circleView");
            throw null;
        }
        o.LJIJI("dropView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ColorPickerViewModel wl = wl();
            String string = arguments.getString("slotId");
            o.LJII(string, "null cannot be cast to non-null type kotlin.String");
            wl.getClass();
            wl.LJLIL = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7780979051435851909");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/gamora/editorpro/sticker/text/ColorPickerFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/gamora/editorpro/sticker/text/ColorPickerFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            View view = getView();
            if (view != null) {
                C78857UxB.LJJJJZI(view).LLJJL(this.LJLLLLLL);
            }
            LJZ = false;
            C119464mU c119464mU = this.LJLJJI;
            if (c119464mU != null) {
                c119464mU.setVisibility(4);
                C130965Ca c130965Ca = this.LJLJI;
                if (c130965Ca != null) {
                    c130965Ca.setVisibility(4);
                } else {
                    o.LJIJI("dropView");
                    throw null;
                }
            } else {
                o.LJIJI("circleView");
                throw null;
            }
        } else {
            show();
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/gamora/editorpro/sticker/text/ColorPickerFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    public final OSZ<Float, Float> vl(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        RectF rectF = this.LJLLJ;
        if (rectF != null) {
            float f = rectF.left;
            if (x >= f) {
                float x2 = motionEvent.getX();
                RectF rectF2 = this.LJLLJ;
                if (rectF2 != null) {
                    f = rectF2.right;
                    if (x2 <= f) {
                        f = motionEvent.getX();
                    }
                } else {
                    o.LJIJI("videoArea");
                    throw null;
                }
            }
            float y = motionEvent.getY();
            RectF rectF3 = this.LJLLJ;
            if (rectF3 != null) {
                float f2 = rectF3.top;
                if (y >= f2) {
                    float y2 = motionEvent.getY();
                    RectF rectF4 = this.LJLLJ;
                    if (rectF4 != null) {
                        f2 = rectF4.bottom;
                        if (y2 <= f2) {
                            f2 = motionEvent.getY();
                        }
                    } else {
                        o.LJIJI("videoArea");
                        throw null;
                    }
                }
                return new OSZ<>(Float.valueOf(f), Float.valueOf(f2));
            }
            o.LJIJI("videoArea");
            throw null;
        }
        o.LJIJI("videoArea");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dl(float r13, float r14) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.sticker.text.ColorPickerFragment.Dl(float, float):void");
    }

    public final void Hl(float f, float f2) {
        NLETrack nLETrack;
        C132005Ga c132005Ga;
        float f3 = f2;
        NLETrackSlot nLETrackSlot = null;
        if (f3 < 0.0f) {
            RectF rectF = this.LJLLJ;
            if (rectF != null) {
                if (f3 > rectF.bottom) {
                    float centerY = rectF.centerY();
                    RectF rectF2 = this.LJLLJ;
                    if (rectF2 != null) {
                        f3 = rectF2.top + centerY;
                    } else {
                        o.LJIJI("videoArea");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("videoArea");
                throw null;
            }
        }
        Il(this, f3, 1.0f, 0.0f, null, new AqS152S0100000_2(this, 698), 16);
        Integer num = this.LJLLLL;
        if (num != null) {
            int intValue = num.intValue();
            if (wl().LJLIL.length() == 0) {
                C132005Ga c132005Ga2 = this.LJLIL;
                if (c132005Ga2 != null) {
                    AqS168S0100000_2 aqS168S0100000_2 = c132005Ga2.LJLLJ;
                    if (aqS168S0100000_2 != null) {
                        aqS168S0100000_2.invoke(Integer.valueOf(intValue));
                    }
                    c132005Ga2.LJLLL = true;
                    PreviewPanelViewModel previewPanelViewModel = c132005Ga2.LJLJI;
                    if (previewPanelViewModel != null) {
                        previewPanelViewModel.lv0();
                    }
                }
            } else {
                EditorProContext editorProContext = (EditorProContext) this.LJLL.getValue();
                if (editorProContext != null) {
                    NLEModel LJJI = C79057V0z.LJJI(editorProContext);
                    String slotId = wl().LJLIL;
                    o.LJIIIZ(slotId, "slotId");
                    VecNLETrackSPtr tracks = LJJI.getTracks();
                    o.LJIIIIZZ(tracks, "tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            nLETrack = it.next();
                            Iterator<NLETrackSlot> it2 = nLETrack.LJIILL().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    NLETrackSlot next = it2.next();
                                    if (o.LJ(next.getUUID(), slotId)) {
                                        if (next != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            nLETrack = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = nLETrack;
                    if (nLETrack2 != null) {
                        Iterator<NLETrackSlot> it3 = nLETrack2.LJIILL().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            NLETrackSlot next2 = it3.next();
                            if (o.LJ(next2.getUUID(), slotId)) {
                                nLETrackSlot = next2;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                        if (nLETrackSlot2 != null && (c132005Ga = this.LJLIL) != null) {
                            c132005Ga.LJJII(nLETrackSlot2, Integer.valueOf(intValue));
                        }
                    }
                }
            }
            VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
            if (LIZIZ != null) {
                String LJIIIIZZ = H7R.LJIIIIZZ(LIZIZ);
                String creationId = LIZIZ.getCreationId();
                o.LJIIIIZZ(creationId, "model.creationId");
                C133255Kv.LIZ(LJIIIIZZ, creationId, LIZIZ.mShootWay, H7R.LJIIIZ(LIZIZ), LIZIZ.getEnterFrom());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.root)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.chm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.dropView)");
        this.LJLJI = (C130965Ca) findViewById2;
        View findViewById3 = view.findViewById(R.id.bbj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.circleView)");
        this.LJLJJI = (C119464mU) findViewById3;
        View findViewById4 = requireActivity().findViewById(R.id.dro);
        o.LJIIIIZZ(findViewById4, "requireActivity().findVi…d.gesture_layout_preview)");
        this.LJLJL = findViewById4;
        View findViewById5 = requireActivity().findViewById(R.id.cji);
        o.LJIIIIZZ(findViewById5, "requireActivity().findViewById(R.id.dyActionBar)");
        this.LJLJLJ = findViewById5;
        Al();
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.setOnTouchListener(new IDTListenerS112S0100000_2(this, 12));
            show();
        } else {
            o.LJIJI("root");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.jx, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public static void Il(ColorPickerFragment colorPickerFragment, float f, float f2, float f3, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22, int i) {
        float height;
        float width;
        AqS152S0100000_2 aqS152S0100000_23 = aqS152S0100000_2;
        AqS152S0100000_2 aqS152S0100000_24 = aqS152S0100000_22;
        if ((i & 16) != 0) {
            aqS152S0100000_23 = null;
        }
        if ((i & 32) != 0) {
            aqS152S0100000_24 = null;
        }
        RectF rectF = colorPickerFragment.LJLLJ;
        if (rectF != null) {
            float f4 = 5;
            float height2 = rectF.height() / f4;
            RectF rectF2 = colorPickerFragment.LJLLJ;
            if (rectF2 != null) {
                if (f < height2 + rectF2.top) {
                    if (colorPickerFragment.LJLJI != null) {
                        float xl = colorPickerFragment.xl() + r0.getHeight();
                        if (colorPickerFragment.LJLJJI != null) {
                            float height3 = (xl + r0.getHeight()) / 2;
                            if (colorPickerFragment.LJLJJI != null) {
                                height = (height3 - r0.getWidth()) - colorPickerFragment.xl();
                            } else {
                                o.LJIJI("circleView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("circleView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("dropView");
                        throw null;
                    }
                } else {
                    if (colorPickerFragment.LJLJI != null) {
                        float xl2 = colorPickerFragment.xl() + r0.getHeight();
                        if (colorPickerFragment.LJLJJI != null) {
                            height = (xl2 + r0.getHeight()) / 2;
                        } else {
                            o.LJIJI("circleView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("dropView");
                        throw null;
                    }
                }
                if (colorPickerFragment.LJLJI != null) {
                    float f5 = 2;
                    ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, r0.getWidth() / f5, height);
                    scaleAnimation.setInterpolator(C55953Lxd.LJIIIIZZ());
                    scaleAnimation.setDuration(200L);
                    scaleAnimation.setAnimationListener(new IDAListenerS144S0200000_2(aqS152S0100000_23, aqS152S0100000_24, 2));
                    C130965Ca c130965Ca = colorPickerFragment.LJLJI;
                    if (c130965Ca != null) {
                        c130965Ca.startAnimation(scaleAnimation);
                        RectF rectF3 = colorPickerFragment.LJLLJ;
                        if (rectF3 != null) {
                            float height4 = rectF3.height() / f4;
                            RectF rectF4 = colorPickerFragment.LJLLJ;
                            if (rectF4 != null) {
                                if (f < height4 + rectF4.top) {
                                    if (colorPickerFragment.LJLJI != null) {
                                        float xl3 = colorPickerFragment.xl() + r0.getHeight();
                                        if (colorPickerFragment.LJLJJI != null) {
                                            width = (xl3 + r0.getHeight()) / f5;
                                        } else {
                                            o.LJIJI("circleView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("dropView");
                                        throw null;
                                    }
                                } else {
                                    float f6 = -height;
                                    if (colorPickerFragment.LJLJJI != null) {
                                        width = (r0.getWidth() / 2) + f6;
                                    } else {
                                        o.LJIJI("circleView");
                                        throw null;
                                    }
                                }
                                if (colorPickerFragment.LJLJJI != null) {
                                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(f2, f3, f2, f3, r0.getWidth() / f5, width);
                                    scaleAnimation2.setInterpolator(C55953Lxd.LJIIIIZZ());
                                    scaleAnimation2.setDuration(200L);
                                    C119464mU c119464mU = colorPickerFragment.LJLJJI;
                                    if (c119464mU != null) {
                                        c119464mU.startAnimation(scaleAnimation2);
                                        return;
                                    } else {
                                        o.LJIJI("circleView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("circleView");
                                throw null;
                            }
                            o.LJIJI("videoArea");
                            throw null;
                        }
                        o.LJIJI("videoArea");
                        throw null;
                    }
                    o.LJIJI("dropView");
                    throw null;
                }
                o.LJIJI("dropView");
                throw null;
            }
            o.LJIJI("videoArea");
            throw null;
        }
        o.LJIJI("videoArea");
        throw null;
    }
}

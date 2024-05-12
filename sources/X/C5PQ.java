package X;

import Y.ARunnableS0S0500000_2;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS36S1300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5PQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PQ implements C5HN, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public final C82631Wbr LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82631Wbr LJLJJI;
    public final C82631Wbr LJLJJL;
    public final NLEEditor LJLJJLL;
    public FrameLayout LJLJL;
    public InterfaceC132925Jo LJLJLJ;
    public NLETrackSlot LJLJLLL;
    public OSZ<Integer, Integer> LJLL;
    public C134385Pe LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public boolean LJLLLL;
    public final Matrix LJLLLLLL;
    public final Rect LJLZ;
    public float LJZ;
    public float LJZI;
    public C5PL LJZL;
    public float LL;
    public OSZ<Float, Float> LLD;
    public ValueAnimator LLF;

    static {
        TBT tbt = new TBT(C5PQ.class, "previewApiComponent", "getPreviewApiComponent()Lcom/ss/android/ugc/gamora/editorpro/crop/preview/CropPreviewApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5PQ.class, "nleCropApiComponent", "getNleCropApiComponent()Lcom/ss/android/ugc/gamora/editorpro/crop/nle/NLECropApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5PQ.class, "bottomApiComponent", "getBottomApiComponent()Lcom/ss/android/ugc/gamora/editorpro/crop/bottom/BottomApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5PQ.class, "cropPanelApiComponent", "getCropPanelApiComponent()Lcom/ss/android/ugc/gamora/editorpro/crop/croppanel/CropPanelApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.C5HN
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    @Override // X.C5HN
    public final void LIZIZ(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
    }

    @Override // X.C5HN
    public final void LIZJ() {
    }

    @Override // X.C5HN
    public final void LIZLLL(long j) {
    }

    @Override // X.C5HO
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        return true;
    }

    public final C5JU LJIJJLI() {
        return (C5JU) this.LJLJI.LIZ(this, LLFF[1]);
    }

    public final void LJJIFFI() {
        C134385Pe c134385Pe;
        Rect rect;
        NLETrackSlot nLETrackSlot = this.LJLJLLL;
        if (nLETrackSlot == null || (c134385Pe = this.LJLLI) == null || (rect = c134385Pe.getRect()) == null) {
            return;
        }
        if (this.LJLZ.width() < rect.width() || this.LJLZ.height() < rect.height()) {
            C132865Ji.LIZJ(nLETrackSlot, 0.0f, 0.0f, Math.max(rect.width() / this.LJLZ.width(), rect.height() / this.LJLZ.height()));
        }
        LJJII();
        if (this.LJLZ.left > rect.left) {
            C132865Ji.LIZLLL(nLETrackSlot, (r0 - r1) / this.LJLL.getFirst().intValue(), 0.0f);
        }
        if (this.LJLZ.right < rect.right) {
            C132865Ji.LIZLLL(nLETrackSlot, (r0 - r1) / this.LJLL.getFirst().intValue(), 0.0f);
        }
        if (this.LJLZ.top > rect.top) {
            C132865Ji.LIZLLL(nLETrackSlot, 0.0f, (r0 - r1) / this.LJLL.getSecond().intValue());
        }
        if (this.LJLZ.bottom >= rect.bottom) {
            return;
        }
        C132865Ji.LIZLLL(nLETrackSlot, 0.0f, (r0 - r1) / this.LJLL.getSecond().intValue());
    }

    public final void LJJII() {
        Rect LJIIIIZZ = LJIIIIZZ(this.LJLJLLL);
        if (LJIIIIZZ != null) {
            this.LJLZ.set(LJIIIIZZ.left, LJIIIIZZ.top, LJIIIIZZ.right, LJIIIIZZ.bottom);
        }
    }

    public final boolean LJIIJJI() {
        Rect rect;
        LJJII();
        C134385Pe c134385Pe = this.LJLLI;
        if (c134385Pe != null && (rect = c134385Pe.getRect()) != null) {
            return this.LJLZ.contains(rect);
        }
        return false;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C5PQ(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = UCI.LJII(c82622Wbi, C5PM.class, null);
        this.LJLJI = UCI.LJII(c82622Wbi, C5JU.class, null);
        this.LJLJJI = UCI.LJII(c82622Wbi, InterfaceC134365Pc.class, null);
        this.LJLJJL = UCI.LJII(c82622Wbi, C5PX.class, null);
        C5JU LJIJJLI = LJIJJLI();
        this.LJLJJLL = LJIJJLI != null ? LJIJJLI.Pm0() : null;
        this.LJLL = new OSZ<>(0, 0);
        this.LJLLILLLL = 1.0f;
        this.LJLLLLLL = new Matrix();
        this.LJLZ = new Rect();
        this.LJZL = C5PL.FREE;
        this.LL = 1.0f;
        this.LLD = new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public final Rect LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        Integer num;
        Integer num2;
        InterfaceC132925Jo interfaceC132925Jo = this.LJLJLJ;
        if (interfaceC132925Jo == null) {
            return null;
        }
        float intValue = this.LJLL.getFirst().intValue();
        float intValue2 = this.LJLL.getSecond().intValue();
        Float valueOf = Float.valueOf(intValue / intValue2);
        OSZ osz = new OSZ(Float.valueOf(intValue), Float.valueOf(intValue2));
        FrameLayout frameLayout = this.LJLJL;
        if (frameLayout != null) {
            num = Integer.valueOf(frameLayout.getMeasuredWidth());
        } else {
            num = null;
        }
        FrameLayout frameLayout2 = this.LJLJL;
        if (frameLayout2 != null) {
            num2 = Integer.valueOf(frameLayout2.getMeasuredHeight());
        } else {
            num2 = null;
        }
        C5PT LIZIZ = C132865Ji.LIZIZ(interfaceC132925Jo, nLETrackSlot, valueOf, osz, num, num2);
        if (LIZIZ == null) {
            return null;
        }
        float f = LIZIZ.LJLJI;
        float f2 = LIZIZ.LJLIL;
        float f3 = 2;
        float f4 = (f2 / f3) + f;
        float f5 = LIZIZ.LJLJJI;
        float f6 = LIZIZ.LJLILLLLZI;
        float f7 = (f6 / f3) + f5;
        return new Rect((int) (f4 - f2), (int) (f7 - f6), (int) f4, (int) f7);
    }

    public final void LJIJJ(boolean z) {
        C82631Wbr c82631Wbr = this.LJLILLLLZI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLFF;
        C5PM c5pm = (C5PM) c82631Wbr.LIZ(this, interfaceC74236TBoArr[0]);
        if (c5pm != null) {
            c5pm.LJLJLLL(z);
        }
        InterfaceC134365Pc interfaceC134365Pc = (InterfaceC134365Pc) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[2]);
        if (interfaceC134365Pc != null) {
            interfaceC134365Pc.LJLJLLL(z);
        }
        C5PX c5px = (C5PX) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[3]);
        if (c5px != null) {
            c5px.LJLJLLL(z);
        }
    }

    @Override // X.C5HO
    public final boolean LJJJJ(MotionEvent event) {
        float f;
        OSZ<Float, Float> osz;
        o.LJIIIZ(event, "event");
        int pointerCount = event.getPointerCount();
        float f2 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        float f3 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f2 += event.getX(i);
            f3 += event.getY(i);
        }
        float f4 = pointerCount;
        this.LJZ = f2 / f4;
        this.LJZI = f3 / f4;
        if (event.getAction() == 0) {
            NLETrackSlot nLETrackSlot = this.LJLJLLL;
            if (nLETrackSlot != null) {
                f = nLETrackSlot.getScale();
            } else {
                f = 1.0f;
            }
            this.LL = f;
            NLETrackSlot nLETrackSlot2 = this.LJLJLLL;
            if (nLETrackSlot2 != null) {
                osz = new OSZ<>(Float.valueOf(nLETrackSlot2.getTransformX()), Float.valueOf(nLETrackSlot2.getTransformY()));
            } else {
                osz = new OSZ<>(valueOf, valueOf);
            }
            this.LLD = osz;
        }
        return false;
    }

    public static void LJJI(C5PL cropMode, List list) {
        String str;
        EditorProContext.Companion.getClass();
        EditorProContext LIZ = C124994vP.LIZ();
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ == null) {
            return;
        }
        o.LJIIIZ(cropMode, "cropMode");
        int i = C5PK.LIZJ[cropMode.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            str = "free";
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "4:3";
                }
            } else {
                str = "16:9";
            }
        } else {
            str = "9:16";
        }
        C43045Guv.LIZIZ(new AqS36S1300000_2(LIZIZ, (VideoPublishEditModel) LIZ, (EditorProContext) str, (String) list, (List<String>) 1));
    }

    @Override // X.C5HN
    public final void LJIILIIL(FrameLayout frameLayout, InterfaceC132925Jo material) {
        o.LJIIIZ(material, "material");
        this.LJLJL = null;
        this.LJLJLJ = null;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(this.LJLLI, frameLayout);
        }
    }

    @Override // X.C5HN
    public final void LJFF(ActivityC45651qj activityC45651qj, FrameLayout frameLayout, InterfaceC132925Jo material) {
        NLEModel LJ;
        o.LJIIIZ(material, "material");
        this.LJLJL = frameLayout;
        this.LJLJLJ = material;
        NLEEditor nLEEditor = this.LJLJJLL;
        if (nLEEditor != null && (LJ = nLEEditor.LJ()) != null) {
            if (Math.abs((frameLayout.getWidth() / LJ.getCanvasRatio()) - frameLayout.getHeight()) > 1.0f) {
                NLEModel LJ2 = this.LJLJJLL.LJ();
                if (LJ2 != null) {
                    LJ2.setCanvasRatio(frameLayout.getWidth() / frameLayout.getHeight());
                }
                this.LJLJJLL.LIZIZ();
            }
        }
        final C134385Pe c134385Pe = new C134385Pe(frameLayout.getContext());
        c134385Pe.setVisibility(4);
        c134385Pe.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c134385Pe.setCropListener(new InterfaceC134405Pg() { // from class: X.5PR
            public Rect LIZ = new Rect();

            @Override // X.InterfaceC134405Pg
            public final void LIZIZ() {
                C5PQ.this.LJLLLL = true;
                this.LIZ = c134385Pe.getRect();
                C5PQ.LJJI(C5PQ.this.LJZL, C47261Igj.LJJIJ("adjust_white_window"));
            }

            @Override // X.InterfaceC134405Pg
            public final void LJ() {
                C5PQ.this.LJIJJ(true);
            }

            public final void LJFF() {
                Rect rect = c134385Pe.getRect();
                float min = Math.min(rect.width() / this.LIZ.width(), rect.height() / this.LIZ.height());
                C5PQ c5pq = C5PQ.this;
                float f = c5pq.LJLLILLLL;
                if (f * min > 3.0f) {
                    min = 3.0f / f;
                }
                c5pq.LJLLLLLL.reset();
                C5PQ c5pq2 = C5PQ.this;
                float floatValue = (c5pq2.LJLL.getFirst().floatValue() * c5pq2.LJLLJ) + (C5PQ.this.LJLL.getFirst().intValue() / 2);
                C5PQ c5pq3 = C5PQ.this;
                C5PQ.this.LJLLLLLL.setScale(min, min, floatValue, (c5pq3.LJLL.getSecond().floatValue() * c5pq3.LJLLL) + (C5PQ.this.LJLL.getSecond().intValue() / 2));
                float[] fArr = {this.LIZ.exactCenterX(), this.LIZ.exactCenterY()};
                float[] fArr2 = new float[2];
                C5PQ.this.LJLLLLLL.mapPoints(fArr2, fArr);
                C5PQ c5pq4 = C5PQ.this;
                NLETrackSlot nLETrackSlot = c5pq4.LJLJLLL;
                if (nLETrackSlot == null) {
                    return;
                }
                C132865Ji.LIZJ(nLETrackSlot, ((((rect.exactCenterX() + (fArr[0] - fArr2[0])) - this.LIZ.exactCenterX()) / C5PQ.this.LJLL.getFirst().floatValue()) + c5pq4.LJLLJ) - nLETrackSlot.getTransformX(), ((((rect.exactCenterY() + (fArr[1] - fArr2[1])) - this.LIZ.exactCenterY()) / C5PQ.this.LJLL.getSecond().floatValue()) + C5PQ.this.LJLLL) - nLETrackSlot.getTransformY(), (min * C5PQ.this.LJLLILLLL) / nLETrackSlot.getScale());
                if (!C5PQ.this.LJIIJJI()) {
                    C5PQ.this.LJJIFFI();
                }
                NLEEditor nLEEditor2 = C5PQ.this.LJLJJLL;
                if (nLEEditor2 != null) {
                    nLEEditor2.LIZIZ();
                }
            }

            @Override // X.InterfaceC134405Pg
            public final void LIZLLL() {
                LJFF();
                NLEEditor nLEEditor2 = C5PQ.this.LJLJJLL;
                if (nLEEditor2 != null) {
                    nLEEditor2.LIZJ();
                }
                C5PQ.this.LJIJJ(true);
                C5PQ c5pq = C5PQ.this;
                NLETrackSlot nLETrackSlot = c5pq.LJLJLLL;
                if (nLETrackSlot == null) {
                    return;
                }
                c5pq.LJLLJ = nLETrackSlot.getTransformX();
                C5PQ.this.LJLLL = nLETrackSlot.getTransformY();
                C5PQ.this.LJLLILLLL = nLETrackSlot.getScale();
                C5PQ.this.LJLLLL = false;
            }

            @Override // X.InterfaceC134405Pg
            public final void LIZJ() {
                LJFF();
            }

            @Override // X.InterfaceC134405Pg
            public final void LIZ(Rect curRect, boolean z) {
                o.LJIIIZ(curRect, "curRect");
                if (z) {
                    C5PQ.this.LJIJJ(false);
                    C5JU LJIJJLI = C5PQ.this.LJIJJLI();
                    if (LJIJJLI != null) {
                        LJIJJLI.pause();
                    }
                    C5PQ.this.LJJII();
                    c134385Pe.setLimitRect(C5PQ.this.LJLZ);
                }
            }
        });
        this.LJLLI = c134385Pe;
        frameLayout.addView(c134385Pe);
    }

    @Override // X.C5HO
    public final boolean LJIILLIIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C5HN
    public final void LJIJ(NLETrack track, NLETrackSlot slot, C5PT c5pt) {
        int ordinal;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        this.LJLJLLL = slot;
        C134385Pe c134385Pe = this.LJLLI;
        if (c134385Pe == null) {
            return;
        }
        C5PL[] values = C5PL.values();
        Integer LJIILLIIL = C124574uj.LJIILLIIL(slot);
        if (LJIILLIIL != null) {
            ordinal = LJIILLIIL.intValue();
        } else {
            ordinal = C5PL.FREE.ordinal();
        }
        C5PL c5pl = values[ordinal];
        this.LJZL = c5pl;
        Float LJIILL = C124574uj.LJIILL(slot, "ep_crop_ratio", null);
        this.LJLLILLLL = slot.getScale();
        this.LJLLJ = slot.getTransformX();
        this.LJLLL = slot.getTransformY();
        c134385Pe.post(new ARunnableS0S0500000_2(c134385Pe, this, c5pt, c5pl, LJIILL, 2));
    }

    @Override // X.C5HO
    public final boolean LJIL(NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C5HO
    public final boolean LJJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        C134385Pe c134385Pe;
        if (this.LJLLILLLL * f > 3.0f || this.LJLLLL || (c134385Pe = this.LJLLI) == null) {
            return true;
        }
        C5JU LJIJJLI = LJIJJLI();
        if (LJIJJLI != null) {
            LJIJJLI.pause();
        }
        this.LJLLLLLL.reset();
        this.LJLLLLLL.setScale(f, f, (this.LJLL.getFirst().floatValue() * this.LJLLJ) + (this.LJLL.getFirst().intValue() / 2), (this.LJLL.getSecond().floatValue() * this.LJLLL) + (this.LJLL.getSecond().intValue() / 2));
        float[] fArr = {this.LJZ, this.LJZI};
        float[] fArr2 = new float[2];
        this.LJLLLLLL.mapPoints(fArr2, fArr);
        float f2 = fArr[0] - fArr2[0];
        float f3 = fArr[1] - fArr2[1];
        C132865Ji.LIZJ(nLETrackSlot, f2 / this.LJLL.getFirst().floatValue(), f3 / this.LJLL.getSecond().floatValue(), f);
        if (!LJIIJJI()) {
            if (this.LJLZ.width() < c134385Pe.getRect().width() || this.LJLZ.height() < c134385Pe.getRect().height()) {
                C132865Ji.LIZJ(nLETrackSlot, (-f2) / this.LJLL.getFirst().floatValue(), (-f3) / this.LJLL.getSecond().floatValue(), 1.0f);
            }
            LJJIFFI();
        }
        NLEEditor nLEEditor = this.LJLJJLL;
        if (nLEEditor != null) {
            nLEEditor.LIZIZ();
        }
        this.LJLLJ = nLETrackSlot.getTransformX();
        this.LJLLL = nLETrackSlot.getTransformY();
        this.LJLLILLLL = nLETrackSlot.getScale();
        return true;
    }

    @Override // X.C5HO
    public final boolean LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        if (z3 && Math.abs(this.LLD.getFirst().floatValue() - this.LJLLJ) > 0.001d && Math.abs(this.LLD.getSecond().floatValue() - this.LJLLL) > 0.001d) {
            arrayList.add("move");
            NLEEditor nLEEditor = this.LJLJJLL;
            if (nLEEditor != null) {
                nLEEditor.LIZJ();
            }
        }
        if (Math.abs(this.LL - this.LJLLILLLL) <= 5.0E-4d) {
            LJJI(this.LJZL, arrayList);
            return true;
        }
        if (z4) {
            if (this.LL <= this.LJLLILLLL) {
                arrayList.add("zoom in");
                NLEEditor nLEEditor2 = this.LJLJJLL;
                if (nLEEditor2 != null) {
                    nLEEditor2.LIZJ();
                }
            }
            if (this.LL > this.LJLLILLLL) {
                arrayList.add("zoom out");
                NLEEditor nLEEditor3 = this.LJLJJLL;
                if (nLEEditor3 != null) {
                    nLEEditor3.LIZJ();
                }
            }
        }
        LJJI(this.LJZL, arrayList);
        return true;
    }

    @Override // X.C5HO
    public final boolean LJIIJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        if (i > 1) {
            return false;
        }
        if (this.LJLLLL) {
            return true;
        }
        C5JU LJIJJLI = LJIJJLI();
        if (LJIJJLI != null) {
            LJIJJLI.pause();
        }
        C5PV c5pv = new C5PV(f, f2, f3, f4);
        C132865Ji.LIZLLL(nLETrackSlot, c5pv.LJLJI, c5pv.LJLJJI);
        if (!LJIIJJI()) {
            LJJIFFI();
        }
        NLEEditor nLEEditor = this.LJLJJLL;
        if (nLEEditor != null) {
            nLEEditor.LIZIZ();
        }
        this.LJLLJ = nLETrackSlot.getTransformX();
        this.LJLLL = nLETrackSlot.getTransformY();
        this.LJLLILLLL = nLETrackSlot.getScale();
        return true;
    }
}

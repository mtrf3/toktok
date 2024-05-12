package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1303759t {
    public static float LJJIL = C134845Qy.LIZ(2.0f);
    public static float LJJIZ = C134845Qy.LIZ(1.0f);
    public static int LJJJ = C134845Qy.LIZ(16.0f);
    public final C1303859u LIZ;
    public final InterfaceC65784Pro<C59G> LIZIZ;
    public final C1302859k LIZJ;
    public final boolean LIZLLL;
    public final Drawable LJ;
    public final Drawable LJFF;
    public final Rect LJI;
    public final int LJII;
    public final C62822Ol8 LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final int LJIILLIIL;
    public final Paint LJIIZILJ;
    public final int LJIJ;
    public final Path LJIJI;
    public final Paint LJIJJ;
    public C5AE LJIJJLI;
    public final ValueAnimator LJIL;
    public final C62822Ol8 LJJ;
    public EnumC127354zD LJJI;
    public C5AX LJJIFFI;
    public final RectF LJJII;
    public final RectF LJJIII;
    public C5AE LJJIIJ;
    public float LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public OSZ<? extends NLETrackSlot, C1301058s> LJJIJL;
    public float LJJIJLIJ;

    public final C59G LIZIZ() {
        return this.LIZIZ.invoke();
    }

    public final float LIZLLL() {
        return C1300758p.LIZIZ() * ((float) this.LIZ.getClipMinDuration$editor_trackpanel_release());
    }

    public final EditorProContext LJ() {
        return (EditorProContext) this.LJIIIIZZ.getValue();
    }

    public final void LJI() {
        float floor;
        float LIZIZ;
        float f;
        float timelineScale;
        EditorProContext LJ;
        InterfaceC127784zu player;
        EditorProContext LJ2;
        InterfaceC127784zu player2;
        if (!this.LJJIJIL) {
            return;
        }
        if (this.LIZLLL) {
            if (this.LJJIIJ == C5AE.START) {
                floor = C1303859u.LLJJI - ((int) Math.ceil(this.LJJII.left - LJJIZ));
                LIZIZ = C1300758p.LIZIZ();
            } else {
                floor = C1303859u.LLJJI - ((int) Math.floor((this.LJJIII.right + LJJIZ) + 2));
                LIZIZ = C1300758p.LIZIZ();
            }
        } else if (this.LJJIIJ == C5AE.START) {
            floor = ((int) Math.ceil(this.LJJII.right + LJJIZ)) - C1303859u.LLJJI;
            LIZIZ = C1300758p.LIZIZ();
        } else {
            floor = ((int) Math.floor((this.LJJIII.left - LJJIZ) - 2)) - C1303859u.LLJJI;
            LIZIZ = C1300758p.LIZIZ();
        }
        float f2 = floor / LIZIZ;
        EditorProContext LJ3 = LJ();
        if (LJ3 != null && LJ3.getHasInitialized() && (LJ = LJ()) != null && (player = LJ.getPlayer()) != null && player.isPrepared() && (LJ2 = LJ()) != null && (player2 = LJ2.getPlayer()) != null) {
            player2.seek(f2);
        }
        if (this.LIZLLL) {
            f = (this.LJJII.left - this.LJJIII.right) - (2 * LJJIZ);
            timelineScale = this.LIZ.getTimelineScale();
        } else {
            f = (this.LJJIII.left - this.LJJII.right) - (2 * LJJIZ);
            timelineScale = this.LIZ.getTimelineScale();
        }
        long j = f / timelineScale;
        C5AX c5ax = this.LJJIFFI;
        if (c5ax != null) {
            long j2 = f2;
            InterfaceC1304259y interfaceC1304259y = c5ax.LIZ.LLILLIZIL;
            if (interfaceC1304259y != null) {
                interfaceC1304259y.onClip(j, j2);
            }
        }
    }

    public final float LIZJ(float f) {
        float LIZLLL;
        EnumC123874tb enumC123874tb;
        float min;
        float f2;
        NLETrackSlot first;
        NLESegment LJI;
        if (this.LIZLLL) {
            LIZLLL = (this.LJJII.left - LJJIZ) - LIZLLL();
        } else {
            LIZLLL = this.LJJII.right + LJJIZ + LIZLLL();
        }
        if (!this.LIZLLL ? f < LIZLLL : f > LIZLLL) {
            f = LIZLLL;
        }
        OSZ<? extends NLETrackSlot, C1301058s> osz = this.LJJIJL;
        if (osz == null || (first = osz.getFirst()) == null || (LJI = first.LJI()) == null || (enumC123874tb = LJI.LIZJ()) == null) {
            enumC123874tb = EnumC123874tb.NONE;
        }
        float f3 = this.LJJIIZI;
        if (f3 == 0.0f || (enumC123874tb != EnumC123874tb.AUDIO && enumC123874tb != EnumC123874tb.ALGORITHM_AUDIO)) {
            min = this.LJJIIZ;
        } else {
            min = Math.min(this.LJJIIZ, f3);
        }
        if (this.LIZLLL) {
            float f4 = this.LJJII.left;
            float f5 = LJJIZ;
            if ((f4 + f5) - f > min) {
                f = (f4 - min) + f5;
            }
            f2 = this.LJJIJIIJI;
            if (f >= f2) {
                return f;
            }
        } else {
            float f6 = this.LJJII.right;
            float f7 = LJJIZ;
            if ((f - f6) - f7 > min) {
                f = min + f6 + f7;
            }
            f2 = this.LJJIJIIJI;
            if (f <= f2) {
                return f;
            }
        }
        return f2;
    }

    public final float LJFF(float f) {
        float LIZLLL;
        EnumC123874tb enumC123874tb;
        float min;
        float f2;
        NLETrackSlot first;
        NLESegment LJI;
        if (this.LIZLLL) {
            LIZLLL = LIZLLL() + this.LJJIII.right + LJJIZ;
        } else {
            LIZLLL = (this.LJJIII.left - LJJIZ) - LIZLLL();
        }
        if (!this.LIZLLL ? f > LIZLLL : f < LIZLLL) {
            f = LIZLLL;
        }
        OSZ<? extends NLETrackSlot, C1301058s> osz = this.LJJIJL;
        if (osz == null || (first = osz.getFirst()) == null || (LJI = first.LJI()) == null || (enumC123874tb = LJI.LIZJ()) == null) {
            enumC123874tb = EnumC123874tb.NONE;
        }
        float f3 = this.LJJIIZI;
        if (f3 == 0.0f || (enumC123874tb != EnumC123874tb.AUDIO && enumC123874tb != EnumC123874tb.ALGORITHM_AUDIO)) {
            min = this.LJJIIJZLJL;
        } else {
            min = Math.min(this.LJJIIJZLJL, f3);
        }
        if (this.LIZLLL) {
            float f4 = this.LJJIII.right;
            float f5 = LJJIZ;
            if (f - (f4 + f5) > min) {
                f = min + f4 + f5;
            }
            f2 = this.LJJIJ;
            if (f <= f2) {
                return f;
            }
        } else {
            float f6 = this.LJJIII.left;
            float f7 = LJJIZ;
            if ((f6 - f7) - f > min) {
                f = (f6 - f7) - min;
            }
            f2 = this.LJJIJ;
            if (f >= f2) {
                return f;
            }
        }
        return f2;
    }

    public final void LJIIJJI(C5AE c5ae) {
        NLETrackSlot first;
        C59G LIZIZ;
        if (this.LJIJJLI == c5ae) {
            return;
        }
        this.LJIJJLI = c5ae;
        if (C1303659s.LIZ[c5ae.ordinal()] == 1) {
            this.LJIL.cancel();
            OSZ<? extends NLETrackSlot, C1301058s> osz = this.LJJIJL;
            if (osz != null && (first = osz.getFirst()) != null && (LIZIZ = LIZIZ()) != null) {
                LIZIZ.LJIIJJI(first);
                return;
            }
            return;
        }
        C59G LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LJI();
        }
        this.LJIL.start();
    }

    public final void LJIIL(OSZ<? extends NLETrackSlot, C1301058s> osz) {
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlot2;
        C5A5 c5a5;
        C1301058s second;
        C5A5 c5a52;
        C1301058s second2;
        C5A5 c5a53;
        C1301058s second3;
        C5A5 c5a54;
        C1301058s second4;
        C1301058s second5;
        C1301058s second6;
        C5A5 c5a55;
        if (o.LJ(this.LJJIJL, osz)) {
            OSZ<? extends NLETrackSlot, C1301058s> osz2 = this.LJJIJL;
            if (osz2 != null && (second6 = osz2.getSecond()) != null && (c5a55 = second6.LJLILLLLZI) != null) {
                c5a55.setItemSelected(true);
                return;
            }
            return;
        }
        OSZ<? extends NLETrackSlot, C1301058s> osz3 = this.LJJIJL;
        C5A5 c5a56 = null;
        if (osz3 != null) {
            nLETrackSlot = osz3.getFirst();
        } else {
            nLETrackSlot = null;
        }
        if (osz != null) {
            nLETrackSlot2 = osz.getFirst();
        } else {
            nLETrackSlot2 = null;
        }
        if (o.LJ(nLETrackSlot, nLETrackSlot2)) {
            InterfaceC1304259y interfaceC1304259y = this.LIZ.LLILLIZIL;
            if (interfaceC1304259y != null) {
                interfaceC1304259y.LJFF(osz, true);
            }
        } else {
            InterfaceC1304259y interfaceC1304259y2 = this.LIZ.LLILLIZIL;
            if (interfaceC1304259y2 != null) {
                interfaceC1304259y2.LJFF(osz, false);
            }
        }
        OSZ<? extends NLETrackSlot, C1301058s> osz4 = this.LJJIJL;
        if (osz4 != null && (second5 = osz4.getSecond()) != null) {
            c5a5 = second5.LJLILLLLZI;
        } else {
            c5a5 = null;
        }
        if (osz != null && (second4 = osz.getSecond()) != null) {
            c5a56 = second4.LJLILLLLZI;
        }
        if (!o.LJ(c5a5, c5a56)) {
            OSZ<? extends NLETrackSlot, C1301058s> osz5 = this.LJJIJL;
            if (osz5 != null && (second3 = osz5.getSecond()) != null && (c5a54 = second3.LJLILLLLZI) != null) {
                c5a54.setItemSelected(false);
            }
            if (osz != null && (second2 = osz.getSecond()) != null && (c5a53 = second2.LJLILLLLZI) != null) {
                c5a53.setItemSelected(true);
            }
        } else if (osz != null && (second = osz.getSecond()) != null && (c5a52 = second.LJLILLLLZI) != null) {
            c5a52.setItemSelected(true);
        }
        this.LJJIJL = osz;
    }

    public static void LJIIIZ(C5A5 c5a5, C5A5 c5a52) {
        if (o.LJ(c5a5, c5a52)) {
            if (c5a5 != null) {
                c5a5.setDrawDivider(false);
            }
        } else {
            if (c5a52 != null) {
                c5a52.setDrawDivider(true);
            }
            if (c5a5 == null) {
                return;
            }
            c5a5.setDrawDivider(false);
        }
    }

    public final void LJII(float f, boolean z) {
        float f2;
        float f3;
        float timelineScale;
        float f4;
        float timelineScale2;
        Long LIZJ;
        float floatValue;
        float LIZJ2 = LIZJ(f);
        boolean z2 = this.LIZLLL;
        float f5 = this.LJJIIZ + LJJIZ;
        RectF rectF = this.LJJII;
        if (z2) {
            f2 = rectF.left;
        } else {
            f2 = rectF.right;
        }
        if (LIZJ2 != f5 + f2) {
            if (z2) {
                f3 = C1303859u.LLJJI - LIZJ2;
                timelineScale = this.LIZ.getTimelineScale();
            } else {
                f3 = LIZJ2 - C1303859u.LLJJI;
                timelineScale = this.LIZ.getTimelineScale();
            }
            float f6 = f3 / timelineScale;
            if (this.LIZLLL) {
                f4 = C1303859u.LLJJI - this.LJJIII.right;
                timelineScale2 = this.LIZ.getTimelineScale();
            } else {
                f4 = this.LJJIII.left - C1303859u.LLJJI;
                timelineScale2 = this.LIZ.getTimelineScale();
            }
            float f7 = f4 / timelineScale2;
            C59G LIZIZ = LIZIZ();
            if (LIZIZ != null && (LIZJ = LIZIZ.LIZJ(f6, f7)) != null) {
                Float valueOf = Float.valueOf(this.LIZ.getTimelineScale() * ((float) LIZJ.longValue()));
                if (valueOf != null) {
                    if (this.LIZLLL) {
                        floatValue = (this.LJJIII.right + LJJIZ) - valueOf.floatValue();
                    } else {
                        floatValue = (this.LJJIII.left - LJJIZ) + valueOf.floatValue();
                    }
                    LIZJ2 = LIZJ(floatValue);
                    if (!o.LIZJ(valueOf, 0.0f) && floatValue == LIZJ2) {
                        ((InterfaceC1283852c) this.LJJ.getValue()).LIZ(this.LIZ, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                    }
                }
            }
        }
        if (this.LIZLLL) {
            RectF rectF2 = this.LJJIII;
            float f8 = rectF2.right;
            float f9 = LJJIZ;
            float f10 = LIZJ2 - f9;
            rectF2.right = f10;
            rectF2.left = f10 - LJJJ;
            LIZ(LIZJ2, f8 + f9, z);
            return;
        }
        RectF rectF3 = this.LJJIII;
        float f11 = rectF3.left;
        float f12 = LJJIZ;
        float f13 = f11 - f12;
        float f14 = f12 + LIZJ2;
        rectF3.left = f14;
        rectF3.right = f14 + LJJJ;
        LIZ(LIZJ2, f13, z);
    }

    public final void LJIIIIZZ(float f, boolean z) {
        float f2;
        float f3;
        float timelineScale;
        float f4;
        float timelineScale2;
        Long LIZJ;
        float floatValue;
        float LJFF = LJFF(f);
        boolean z2 = this.LIZLLL;
        RectF rectF = this.LJJIII;
        if (z2) {
            f2 = rectF.right + LJJIZ + this.LJJIIJZLJL;
        } else {
            f2 = (rectF.left - LJJIZ) - this.LJJIIJZLJL;
        }
        if (LJFF != f2) {
            if (z2) {
                f3 = C1303859u.LLJJI - LJFF;
                timelineScale = this.LIZ.getTimelineScale();
            } else {
                f3 = LJFF - C1303859u.LLJJI;
                timelineScale = this.LIZ.getTimelineScale();
            }
            float f5 = f3 / timelineScale;
            if (this.LIZLLL) {
                f4 = C1303859u.LLJJI - this.LJJII.left;
                timelineScale2 = this.LIZ.getTimelineScale();
            } else {
                f4 = this.LJJII.right - C1303859u.LLJJI;
                timelineScale2 = this.LIZ.getTimelineScale();
            }
            float f6 = f4 / timelineScale2;
            C59G LIZIZ = LIZIZ();
            if (LIZIZ != null && (LIZJ = LIZIZ.LIZJ(f5, f6)) != null) {
                Float valueOf = Float.valueOf(this.LIZ.getTimelineScale() * ((float) LIZJ.longValue()));
                if (valueOf != null) {
                    if (this.LIZLLL) {
                        floatValue = (this.LJJII.left - LJJIZ) - valueOf.floatValue();
                    } else {
                        floatValue = this.LJJII.right + LJJIZ + valueOf.floatValue();
                    }
                    LJFF = LJFF(floatValue);
                    if (!o.LIZJ(valueOf, 0.0f) && floatValue == LJFF) {
                        ((InterfaceC1283852c) this.LJJ.getValue()).LIZ(this.LIZ, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                    }
                }
            }
        }
        if (this.LIZLLL) {
            RectF rectF2 = this.LJJII;
            float f7 = rectF2.left;
            float f8 = LJJIZ;
            float f9 = f7 - f8;
            float f10 = f8 + LJFF;
            rectF2.right = LJJJ + f10;
            rectF2.left = f10;
            LIZ(LJFF, f9, z);
            return;
        }
        RectF rectF3 = this.LJJII;
        float f11 = rectF3.right;
        float f12 = LJJIZ;
        float f13 = LJFF - f12;
        rectF3.left = f13 - LJJJ;
        rectF3.right = f13;
        LIZ(LJFF, f11 + f12, z);
    }

    public final void LJIIJ(C5A5 tappedItem, java.util.Map<NLETrackSlot, C1301058s> trackParamsMap) {
        o.LJIIIZ(tappedItem, "tappedItem");
        o.LJIIIZ(trackParamsMap, "trackParamsMap");
        for (Map.Entry<NLETrackSlot, C1301058s> entry : trackParamsMap.entrySet()) {
            NLETrackSlot nleTrackSlot = entry.getKey();
            if (entry.getValue().LJLILLLLZI == tappedItem) {
                C1303859u c1303859u = this.LIZ;
                c1303859u.getClass();
                o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
                c1303859u.LJIIL(c1303859u.LJI(nleTrackSlot));
                C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
                if (trackGroupActionListener != null) {
                    C59C.LIZ(trackGroupActionListener, nleTrackSlot, EnumC127354zD.CLIP, true, false, 8);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0274, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0200, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0257, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.util.Map<com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C1301058s> r23, X.OSZ<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C1301058s> r24) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303759t.LJIILIIL(java.util.Map, X.OSZ):void");
    }

    public C1303759t(Context context, C1303859u trackGroup, AqS152S0100000_2 aqS152S0100000_2) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(trackGroup, "trackGroup");
        this.LIZ = trackGroup;
        this.LIZIZ = aqS152S0100000_2;
        C1302859k c1302859k = C1291054w.LJ().LIZ;
        this.LIZJ = c1302859k;
        boolean LIZ = C68E.LIZ(trackGroup.getContext());
        this.LIZLLL = LIZ;
        C58G LJ = C1291054w.LJ();
        if (LIZ) {
            drawable = LJ.LIZLLL;
        } else {
            drawable = LJ.LIZJ;
        }
        this.LJ = drawable;
        if (LIZ) {
            drawable2 = C1291054w.LJ().LIZJ;
        } else {
            drawable2 = C1291054w.LJ().LIZLLL;
        }
        this.LJFF = drawable2;
        this.LJI = new Rect(0, 0, 0, 0);
        this.LJII = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJIIIIZZ = C221108m2.LIZIZ(C123634tD.LJLIL);
        this.LJIILL = true;
        this.LJIILLIIL = C134845Qy.LIZJ(context);
        Paint paint = new Paint();
        this.LJIIZILJ = paint;
        Integer num = c1302859k.LIZJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.LJIJ = i;
        this.LJIJI = new Path();
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(LJJIL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(i);
        this.LJIJJ = paint2;
        C5AE c5ae = C5AE.NULL;
        this.LJIJJLI = c5ae;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIL = ofFloat;
        this.LJJ = C221108m2.LIZIZ(C1294056a.LJLIL);
        this.LJJI = EnumC127354zD.NONE;
        LJJIL = c1302859k.LJI;
        LJJIZ = c1302859k.LJII;
        LJJJ = C1291054w.LJ().LJ;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(LJJIL);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 42));
        this.LJJII = new RectF();
        this.LJJIII = new RectF();
        this.LJJIIJ = c5ae;
        this.LJJIJ = C1303859u.LLJJI;
        this.LJJIJIIJI = 2.1474836E9f;
        this.LJJIJLIJ = 1.0f;
    }

    public final void LIZ(float f, float f2, boolean z) {
        int i;
        int i2;
        boolean z2 = false;
        if (z && f == f2) {
            LJIIJJI(C5AE.NULL);
            return;
        }
        if (this.LIZLLL) {
            i = C1303859u.LLJJI - ((int) f2);
            i2 = C1303859u.LLJJI - ((int) f);
        } else {
            i = ((int) f2) - C1303859u.LLJJI;
            i2 = ((int) f) - C1303859u.LLJJI;
        }
        C59G LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            if (i2 == i) {
                this.LJJIJIL = false;
            } else {
                this.LJJIJIIJIL = true;
                this.LJJIJIL = true;
                LIZIZ.LIZIZ();
                int i3 = i2 - i;
                if (z) {
                    C1303859u c1303859u = this.LIZ;
                    boolean z3 = this.LIZLLL;
                    if (z3) {
                        i3 = -i3;
                    }
                    LIZIZ.LJIILIIL(c1303859u, i3, 0, false, z3);
                }
            }
        }
        if (this.LJIILJJIL) {
            float f3 = this.LJIIL;
            float f4 = this.LJIILLIIL - f3;
            float f5 = C1300758p.LJIIIIZZ;
            if (f4 <= f5 || f3 <= f5) {
                z2 = true;
            }
            this.LJIILJJIL = z2;
        }
        this.LJJIJLIJ = C1300758p.LIZ(this.LJIIL, this.LJIILLIIL);
        C5AE c5ae = C5AE.NULL;
        float f6 = this.LJIILLIIL;
        float f7 = this.LJIIL;
        float f8 = f6 - f7;
        float f9 = C1300758p.LJIIIIZZ;
        if (f8 <= f9 && (!this.LJIILJJIL || f7 - this.LJIIJJI > 0.0f)) {
            c5ae = this.LIZLLL ? C5AE.START : C5AE.END;
        } else if (f7 <= f9 && (!this.LJIILJJIL || f7 - this.LJIIJJI < 0.0f)) {
            c5ae = this.LIZLLL ? C5AE.END : C5AE.START;
        }
        LJIIJJI(c5ae);
    }
}

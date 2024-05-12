package X;

import Y.ACListenerS22S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59L extends RelativeLayout {
    public static final int LLJILJIL = C134845Qy.LIZ(10.0f);
    public static final long LLJILJILJ = ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC65784Pro<Boolean> LJLJI;
    public EnumC127354zD LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public NLETrackSlot LJLLILLLL;
    public int LJLLJ;
    public C59O LJLLL;
    public C59S LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public int LL;
    public int LLD;
    public float LLF;
    public float LLFF;
    public boolean LLFFF;
    public float LLFII;
    public int LLFZ;
    public int LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final long LLIIII;
    public final int LLIIIILZ;
    public final ValueAnimator LLIIIJ;
    public final RelativeLayout.LayoutParams LLIIIL;
    public final C59M LLIIIZ;
    public final C130655Av LLIIJI;
    public ImageView LLIIJLIL;
    public View LLIIL;
    public long LLIILII;
    public long LLIILZL;
    public boolean LLIIZ;
    public final C1302859k LLIL;
    public final int LLILII;
    public final int LLILIL;
    public final C62822Ol8 LLILL;
    public final C62822Ol8 LLILLIZIL;
    public C5AE LLILLJJLI;
    public int LLILLL;
    public C5AE LLILZ;
    public C59H LLILZIL;
    public float LLILZLL;
    public C5AE LLIZ;
    public final C62822Ol8 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final java.util.Map<Integer, View> LLJIJIL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLJIJIL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJIIJ() {
        int[] iArr = new int[2];
        LIZ(R.id.b_o).getLocationOnScreen(iArr);
        int i = iArr[0];
        this.LLFZ = this.LLILIL + this.LLILII + i;
        this.LLI = ((LIZ(R.id.b_o).getWidth() + i) - this.LLILIL) - this.LLILII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leftPosition is ");
        LIZ.append(this.LLFZ);
        LIZ.append(" right position is ");
        LIZ.append(this.LLI);
        C131935Ft.LIZIZ("ItemTrackLayout", X1D.LIZIZ(LIZ));
    }

    public final void setCoverMode(boolean z) {
    }

    private final FrameCacheViewModel getFrameCacheViewModel() {
        return (FrameCacheViewModel) this.LLIZLLLIL.getValue();
    }

    public final void LIZIZ() {
        setTrackWidth(C1300758p.LIZJ);
        C59V c59v = (C59V) LIZ(R.id.et1);
        c59v.LJLL = true;
        c59v.invalidate();
    }

    public final void LJ() {
        ImageView imageView = this.LLIIJLIL;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ((C1302559h) LIZ(R.id.b_o)).setHandlerGone(true);
        RelativeLayout.LayoutParams layoutParams = this.LLIIIL;
        C1302859k c1302859k = this.LLIL;
        layoutParams.setMarginStart(c1302859k.LJI + c1302859k.LJII);
        RelativeLayout.LayoutParams layoutParams2 = this.LLIIIL;
        C1302859k c1302859k2 = this.LLIL;
        layoutParams2.setMarginEnd(c1302859k2.LJI + c1302859k2.LJII);
        C59M c59m = this.LLIIIZ;
        ImageView imageView2 = c59m.LIZIZ;
        if (imageView2 != null) {
            c59m.LJIIL.width = c59m.LJIJ;
            C16880lQ.LJZI(c59m.LJIIIIZZ, imageView2);
            c59m.LIZJ();
        }
        this.LLIIIZ.LIZIZ();
        C59M c59m2 = this.LLIIIZ;
        TextView textView = c59m2.LJI;
        if (textView != null) {
            c59m2.LJIIL.width = c59m2.LJIJ;
            C16880lQ.LJZI(c59m2.LJIIIIZZ, textView);
            c59m2.LIZJ();
        }
        C59M c59m3 = this.LLIIIZ;
        TextView textView2 = c59m3.LJII;
        if (textView2 != null) {
            c59m3.LJIIL.width = c59m3.LJIJ;
            C16880lQ.LJZI(c59m3.LJIIIIZZ, textView2);
            c59m3.LIZJ();
        }
    }

    public final boolean LJFF() {
        return ((Boolean) this.LLILL.getValue()).booleanValue();
    }

    public final void LJII() {
        boolean z;
        boolean z2;
        NLETrackSlot nLETrackSlot = this.LJLLILLLL;
        int i = 1;
        if (nLETrackSlot != null) {
            Iterator<NLETrackSlot> it = nLETrackSlot.LJFF().iterator();
            while (it.hasNext()) {
                NLESegment LJI = it.next().LJI();
                o.LJIIIIZZ(LJI, "it.mainSegment");
                if (C124574uj.LJJIIZI(LJI) != 0.0f) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        NLETrackSlot nLETrackSlot2 = this.LJLLILLLL;
        if (nLETrackSlot2 != null) {
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot2.LJI());
            if (LIZLLL != null) {
                if (LIZLLL.LJIILJJIL() == 0.0f && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setMuteIcon(z2);
            }
            setAudioFilter(nLETrackSlot2);
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
            C59N c59n = new C59N(null);
            LJJ.getClass();
            if (new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getSegCurveSpeedPoints(LJJ.LIZJ, LJJ)).isEmpty() && LJJ.LJI().isEmpty()) {
                i = 0;
            }
            c59n.LIZJ = i;
            c59n.LIZ = LJJ.getAbsSpeed();
            c59n.LJ = (float) LJJ.LJFF();
            String extra = LJJ.getExtra("curve_speed_name");
            o.LJIIIIZZ(extra, "nLESegmentVideo.getExtra(CURVE_SPEED_NAME)");
            c59n.LIZLLL = extra;
            setSpeed(c59n);
        }
    }

    public final void LJIILIIL() {
        boolean z;
        float f;
        float LIZIZ;
        float LIZIZ2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z2 = this.LLIFFJFJJ;
        if (z2 && !this.LLII) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 2;
            LIZIZ = C1300758p.LIZJ;
        } else if (z2) {
            f = ((float) 2000) / this.LJLL;
            LIZIZ = C1300758p.LIZIZ();
        } else {
            f = ((float) this.LJLJLLL) / this.LJLL;
            LIZIZ = C1300758p.LIZIZ();
        }
        this.LLFF = f * LIZIZ;
        this.LJZ = C1300758p.LIZIZ() * (((float) this.LJLJL) / this.LJLL);
        if (this.LLIFFJFJJ) {
            boolean z3 = this.LLII;
            LIZIZ2 = 0.0f;
        } else {
            LIZIZ2 = (((float) ((this.LJLJLLL - this.LJLJLJ) - this.LJLJL)) / this.LJLL) * C1300758p.LIZIZ();
        }
        this.LJZI = LIZIZ2;
        float f2 = this.LJZ;
        this.LJLLLLLL = f2;
        this.LJLZ = LIZIZ2;
        float f3 = (this.LLFF - f2) - LIZIZ2;
        this.LLFII = f3;
        this.LLIIIL.width = Math.round(f3);
        LIZ(R.id.dn9).setLayoutParams(this.LLIIIL);
        ((C59V) LIZ(R.id.et1)).LIZLLL(this.LLFF);
        float f4 = 2;
        int round = Math.round(this.LLFII) - O6R.LJJIIZ((C1300758p.LIZIZ() * ((float) this.LLIILII)) / f4);
        if (round <= 0) {
            this.LLIIIZ.LJIIIIZZ.setVisibility(8);
        } else {
            this.LLIIIZ.LJIIIIZZ.setVisibility(0);
        }
        C59M c59m = this.LLIIIZ;
        c59m.LJIJ = round;
        RelativeLayout.LayoutParams layoutParams = c59m.LJIIL;
        layoutParams.width = round;
        c59m.LJIIIIZZ.setLayoutParams(layoutParams);
        View framesLayout = LIZ(R.id.dn9);
        o.LJIIIIZZ(framesLayout, "framesLayout");
        V2B.LJIIJ(framesLayout);
        View framesLayout2 = LIZ(R.id.dn9);
        o.LJIIIIZZ(framesLayout2, "framesLayout");
        V2B.LJIILL(framesLayout2, -Math.round(this.LJZ), 0, 0, 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init left is ");
        LIZ.append(this.LJZ);
        LIZ.append(" init right is ");
        LIZ.append(this.LJZI);
        LIZ.append(" max length is ");
        LIZ.append(this.LLFF);
        C131935Ft.LIZIZ("ItemTrackLayout", X1D.LIZIZ(LIZ));
        long j = this.LLIILII;
        if (j != 0) {
            this.LLIIIZ.LJIIL.setMarginStart(Math.round((C1300758p.LIZIZ() * ((float) j)) / f4));
        } else {
            this.LLIIIZ.LJIIL.setMarginStart(0);
        }
        ViewGroup.LayoutParams layoutParams2 = LIZ(R.id.b_o).getLayoutParams();
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
        }
        LJIILLIIL();
    }

    public final InterfaceC1283852c getHapticFeedback() {
        return (InterfaceC1283852c) this.LLILLIZIL.getValue();
    }

    public final float getTransitionWidth() {
        String str;
        NLETrackSlot nLETrackSlot;
        NLESegmentTransition LIZLLL;
        NLESegmentTransition LIZLLL2;
        NLESegmentTransition LIZLLL3;
        NLEResourceNode LIZLLL4;
        NLETrackSlot nLETrackSlot2 = this.LJLLILLLL;
        if (nLETrackSlot2 == null || (LIZLLL3 = nLETrackSlot2.LIZLLL()) == null || (LIZLLL4 = LIZLLL3.LIZLLL()) == null || (str = LIZLLL4.LIZJ()) == null) {
            str = "";
        }
        long j = 0;
        if ((!ujb.o.LJJJJJL(str)) && (nLETrackSlot = this.LJLLILLLL) != null && (LIZLLL = nLETrackSlot.LIZLLL()) != null && LIZLLL.LJ()) {
            NLETrackSlot nLETrackSlot3 = this.LJLLILLLL;
            if (nLETrackSlot3 != null && (LIZLLL2 = nLETrackSlot3.LIZLLL()) != null) {
                j = LIZLLL2.LJFF();
            }
            j /= 1000;
        }
        return C1300758p.LIZIZ() * ((float) j);
    }

    public final void LJIIJJI() {
        bringToFront();
        ((C59V) LIZ(R.id.et1)).setRound(this.LLIL.LJIIIIZZ);
        C1302559h checkbox = (C1302559h) LIZ(R.id.b_o);
        o.LJIIIIZZ(checkbox, "checkbox");
        EnumC127354zD enumC127354zD = EnumC127354zD.LINE;
        checkbox.LIZ(enumC127354zD, false);
        this.LJLJJI = enumC127354zD;
        setDurationIcon(this.LJLJLJ);
        ((C59V) LIZ(R.id.et1)).setTrackStyle(this.LJLJJI);
        this.LLIIJI.LIZIZ();
    }

    public final void LJIIL() {
        ((C59V) LIZ(R.id.et1)).setRound(this.LLIL.LJIIIIZZ);
        C1302559h checkbox = (C1302559h) LIZ(R.id.b_o);
        o.LJIIIIZZ(checkbox, "checkbox");
        EnumC127354zD enumC127354zD = EnumC127354zD.NONE;
        checkbox.LIZ(enumC127354zD, false);
        this.LJLJJI = enumC127354zD;
        setDurationIcon(this.LJLJLJ);
        ((C59V) LIZ(R.id.et1)).setTrackStyle(this.LJLJJI);
        this.LLIIJI.LIZIZ();
    }

    public final void LJIILLIIL() {
        View LIZ = LIZ(R.id.b_o);
        RelativeLayout.LayoutParams layoutParams = this.LLIIIL;
        int marginEnd = this.LLIIIL.getMarginEnd() + layoutParams.getMarginStart() + layoutParams.width;
        ViewGroup.LayoutParams layoutParams2 = LIZ.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = marginEnd;
            LIZ.setLayoutParams(layoutParams2);
        }
    }

    public final void LJIIZILJ() {
        LIZ(R.id.et1).invalidate();
    }

    public final long getDuration() {
        return this.LJLJLJ;
    }

    public final boolean getEnableDragMode() {
        return this.LJLIL;
    }

    public final boolean getEnable_Long_click() {
        return this.LJLILLLLZI;
    }

    public final int getIndex() {
        return this.LJLLJ;
    }

    public final EnumC127354zD getStyle() {
        return this.LJLJJI;
    }

    public final ImageView getTransition() {
        return this.LLIIJLIL;
    }

    public final View getTransitionHighlight() {
        return this.LLIIL;
    }

    public C59L(Context context) {
        super(context, null, 0);
        this.LJLIL = true;
        this.LJLILLLLZI = true;
        this.LJLJJI = EnumC127354zD.NONE;
        this.LJLL = 1.0f;
        this.LLF = 1.0f;
        this.LLIIII = LLJILJILJ;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LLIIIILZ = C134845Qy.LIZJ(context2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLIIIJ = ofFloat;
        C1302859k c1302859k = C1291054w.LJ().LIZ;
        this.LLIL = c1302859k;
        this.LLILII = c1302859k.LJII;
        this.LLILIL = c1302859k.LJFF;
        this.LLILL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 46));
        this.LLILLIZIL = C221108m2.LIZIZ(C52L.LJLIL);
        C5AE c5ae = C5AE.NULL;
        this.LLILLJJLI = c5ae;
        this.LLILZ = c5ae;
        this.LLIZ = c5ae;
        this.LLIZLLLIL = C221108m2.LIZIZ(C1278750d.LJLIL);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.boi, this, true);
        ViewGroup framesLayout = (ViewGroup) LIZ(R.id.dn9);
        o.LJIIIIZZ(framesLayout, "framesLayout");
        this.LLIIIZ = new C59M(this, framesLayout);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.dn9).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        this.LLIIIL = layoutParams2;
        int i = c1302859k.LJFF + c1302859k.LJII;
        layoutParams2.setMarginStart(i);
        layoutParams2.setMarginEnd(i);
        View findViewById = findViewById(R.id.dmx);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.frameView)");
        C130655Av c130655Av = (C130655Av) findViewById;
        this.LLIIJI = c130655Av;
        ViewGroup.LayoutParams layoutParams3 = c130655Av.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        View itemFrameView = LIZ(R.id.et1);
        o.LJIIIIZZ(itemFrameView, "itemFrameView");
        C58G LJ = C1291054w.LJ();
        Integer num = LJ.LJIJJLI;
        if (num != null) {
            itemFrameView.getLayoutParams().width = C134855Qz.LIZ(num.intValue());
        }
        Integer num2 = LJ.LJIJJ;
        if (num2 != null) {
            itemFrameView.getLayoutParams().height = C134855Qz.LIZ(num2.intValue());
        }
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 4));
        this.LLJI = true;
    }

    private final void setAudioFilter(NLETrackSlot nLETrackSlot) {
        String effectName;
        if (!this.LLJI) {
            return;
        }
        if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
            effectName = nLETrackSlot.getExtra("extra_voice_change_effect_name");
        } else {
            effectName = "";
        }
        o.LJIIIIZZ(effectName, "effectName");
        if (effectName.length() == 0) {
            C59M c59m = this.LLIIIZ;
            TextView textView = c59m.LJII;
            if (textView != null) {
                c59m.LJIIL.width = c59m.LJIJ;
                C16880lQ.LJZI(c59m.LJIIIIZZ, textView);
                c59m.LIZJ();
                return;
            }
            return;
        }
        C59M c59m2 = this.LLIIIZ;
        c59m2.getClass();
        if (c59m2.LJII == null) {
            TextView textView2 = new TextView(c59m2.LIZ.getContext());
            c59m2.LJII = textView2;
            Integer num = C1291054w.LJ().LJJIIJZLJL;
            if (num != null) {
                textView2.setTextColor(num.intValue());
            }
            textView2.setBackground(c59m2.LIZ());
            textView2.setTextSize(1, c59m2.LJIIIZ);
            textView2.setGravity(17);
            V2B.LJIILL(textView2, C134845Qy.LIZ(4.0f), 0, C134845Qy.LIZ(4.0f), 0);
            textView2.setSingleLine(true);
            textView2.setTypeface(c59m2.LJIIJ);
            textView2.requestLayout();
        }
        TextView textView3 = c59m2.LJII;
        if (textView3 != null) {
            Drawable drawable = c59m2.LJ;
            if (drawable != null) {
                textView3.setCompoundDrawablePadding(c59m2.LJIIJJI);
                if (C68E.LIZ(textView3.getContext())) {
                    textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                } else {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            c59m2.LJIIL.width = c59m2.LJIJ;
            C16880lQ.LJZI(c59m2.LJIIIIZZ, textView3);
            LinearLayout linearLayout = c59m2.LJIIIIZZ;
            linearLayout.addView(textView3, linearLayout.getChildCount(), c59m2.LJIILJJIL);
            c59m2.LIZJ();
        }
        TextView textView4 = c59m2.LJII;
        if (textView4 == null) {
            return;
        }
        textView4.setText(effectName);
    }

    private final void setDurationIcon(long j) {
        TextPaint textPaint;
        float LIZ;
        int i;
        if (this.LLIFFJFJJ || this.LJLJJI != EnumC127354zD.CLIP) {
            C59M c59m = this.LLIIIZ;
            TextView textView = c59m.LJI;
            if (textView != null) {
                c59m.LJIIL.width = c59m.LJIJ;
                C16880lQ.LJZI(c59m.LJIIIIZZ, textView);
                c59m.LIZJ();
            }
        } else {
            String LIZ2 = C1298557t.LIZ(((float) j) / this.LJLL);
            C59M c59m2 = this.LLIIIZ;
            c59m2.getClass();
            int i2 = 0;
            if (c59m2.LJI == null) {
                TextView textView2 = new TextView(c59m2.LIZ.getContext());
                c59m2.LJI = textView2;
                textView2.setTextColor(textView2.getResources().getColor(R.color.bd));
                textView2.setBackground(c59m2.LIZ());
                textView2.setTextSize(1, c59m2.LJIIIZ);
                textView2.setGravity(17);
                V2B.LJIILL(textView2, C134845Qy.LIZ(4.0f), 0, C134845Qy.LIZ(4.0f), 0);
                textView2.setMaxLines(1);
                textView2.setTypeface(c59m2.LJIIJ);
                textView2.requestLayout();
            }
            TextView textView3 = c59m2.LJI;
            if (textView3 != null) {
                c59m2.LJIIL.width = c59m2.LJIJ;
                C16880lQ.LJZI(c59m2.LJIIIIZZ, textView3);
                c59m2.LJIIIIZZ.addView(textView3, 0, c59m2.LJIILLIIL);
                c59m2.LIZJ();
            }
            TextView textView4 = c59m2.LJI;
            if (textView4 != null) {
                textView4.setText(LIZ2);
            }
            LinearLayout.LayoutParams layoutParams = c59m2.LJIILLIIL;
            TextView textView5 = c59m2.LJI;
            if (textView5 != null) {
                textPaint = textView5.getPaint();
            } else {
                textPaint = null;
            }
            int length = LIZ2.length();
            if (textPaint != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(ujb.o.LJJJJLI(length - 3, CardStruct.IStatusCode.DEFAULT));
                LIZ3.append(".00");
                LIZ = textPaint.measureText(X1D.LIZIZ(LIZ3));
            } else {
                LIZ = C134845Qy.LIZ(29.0f);
            }
            TextView textView6 = c59m2.LJI;
            if (textView6 != null) {
                i = V2B.LJIIJ(textView6);
            } else {
                i = 0;
            }
            float f = LIZ + i;
            TextView textView7 = c59m2.LJI;
            if (textView7 != null) {
                i2 = V2B.LJIIIZ(textView7);
            }
            layoutParams.width = (int) (f + i2);
            TextView textView8 = c59m2.LJI;
            if (textView8 != null) {
                textView8.setLayoutParams(c59m2.LJIILLIIL);
            }
        }
        LJIJ(this.LLILLL);
    }

    private final void setTrackWidth(int i) {
        this.LLIIIL.width = i;
        LIZ(R.id.dn9).setLayoutParams(this.LLIIIL);
        LJIILLIIL();
    }

    public final void LIZLLL(float f) {
        float f2;
        if (this.LLILLJJLI == C5AE.NULL) {
            this.LJZL += f;
            if (LJFF()) {
                f2 = this.LLD - this.LJZL;
            } else {
                f2 = this.LLD + this.LJZL;
            }
            int i = C1300758p.LJIIIZ / 2;
            if (Math.abs(i - f2) < LLJILJIL) {
                if (LJFF()) {
                    f = this.LLFZ - i;
                } else {
                    f = i - this.LLI;
                }
                if (f != 0.0f) {
                    getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                }
            } else if (this.LLJ) {
                getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
            }
        }
        this.LJLZ -= f;
        LJIIIIZZ(f, false);
        C59O c59o = this.LJLLL;
        if (c59o != null) {
            c59o.LJ(this.LJLLI, this.LJLLJ, (int) f, 1);
        }
    }

    public final void LJI(boolean z) {
        boolean z2;
        if (!this.LLIIZ || this.LJLJJI != EnumC127354zD.LINE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && ((!this.LLIFFJFJJ || this.LLII) && z2)) {
            ImageView imageView = this.LLIIJLIL;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.LLIIJLIL;
            if (imageView2 != null) {
                imageView2.bringToFront();
                return;
            }
            return;
        }
        ImageView imageView3 = this.LLIIJLIL;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    public final void LJIILJJIL(boolean z) {
        if (z) {
            View view = this.LLIIL;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.LLIIL;
            if (view2 != null) {
                view2.bringToFront();
            }
            ImageView imageView = this.LLIIJLIL;
            if (imageView != null) {
                imageView.bringToFront();
                return;
            }
            return;
        }
        View view3 = this.LLIIL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(int r10) {
        /*
            r9 = this;
            r9.LLILLL = r10
            X.4zD r1 = r9.LJLJJI
            X.4zD r0 = X.EnumC127354zD.CLIP
            if (r1 == r0) goto Lc
            X.4zD r0 = X.EnumC127354zD.LINE
            if (r1 != r0) goto Lb6
        Lc:
            boolean r0 = r9.LJFF()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto Lae
            int r0 = r9.LLIIIILZ
            int r0 = -r0
            float r3 = (float) r0
            float r3 = r3 / r1
            float r0 = (float) r10
            float r3 = r3 - r0
        L1b:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r9.LJLLILLLL
            r1 = 0
            if (r0 == 0) goto Laa
            long r6 = r0.getMeasuredEndTime()
        L25:
            r8 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r8
            long r6 = r6 / r4
            float r0 = (float) r6
            float r5 = X.C1300758p.LIZIZ()
            float r5 = r5 * r0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r9.LJLLILLLL
            if (r0 == 0) goto L37
            long r1 = r0.getStartTime()
        L37:
            float r0 = (float) r1
            float r4 = X.C1300758p.LIZIZ()
            float r4 = r4 * r0
            float r0 = (float) r8
            float r4 = r4 / r0
            X.59M r0 = r9.LLIIIZ
            android.widget.RelativeLayout$LayoutParams r0 = r0.LJIIL
            int r0 = r0.getMarginStart()
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            X.59M r2 = r9.LLIIIZ
            int r0 = r2.LJIIZILJ
            float r1 = (float) r0
            float r0 = r1 + r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto La6
            float r3 = r3 - r4
            android.widget.RelativeLayout$LayoutParams r0 = r2.LJIIL
            int r0 = r0.getMarginStart()
            float r0 = (float) r0
            float r3 = r3 - r0
        L61:
            X.59M r2 = r9.LLIIIZ
            boolean r0 = r9.LJFF()
            if (r0 == 0) goto L6a
            float r3 = -r3
        L6a:
            r2.getClass()
            X.4zQ r1 = X.EnumC127484zQ.ENABLE_TRACK_LABEL_SCROLLABLE
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r0 = X.C5BA.LIZ(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            android.widget.LinearLayout r0 = r2.LJIIIIZZ
            r0.setTranslationX(r3)
        L82:
            boolean r0 = r9.LLIFFJFJJ
            if (r0 != 0) goto La1
            r0 = 2131368996(0x7f0a1c24, float:1.8357958E38)
            android.view.View r2 = r9.LIZ(r0)
            r2.getClass()
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto La2
            r2.invalidate()
        La1:
            return
        La2:
            r2.postInvalidate()
            goto La1
        La6:
            float r5 = r5 - r4
            float r3 = r5 - r1
            goto L61
        Laa:
            r6 = 0
            goto L25
        Lae:
            float r3 = (float) r10
            int r0 = r9.LLIIIILZ
            float r0 = (float) r0
            float r0 = r0 / r1
            float r3 = r3 - r0
            goto L1b
        Lb6:
            r3 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59L.LJIJ(int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x = motionEvent.getX();
            long j = this.LLIILII;
            if (j != 0) {
                if (x <= (C1300758p.LIZIZ() * ((float) j)) / 2) {
                    if (this.LJLJJI == EnumC127354zD.CLIP) {
                        return false;
                    }
                    return true;
                }
            }
            if (this.LLIILZL != 0) {
                if (x >= getWidth() - ((C1300758p.LIZIZ() * ((float) this.LLIILZL)) / 2)) {
                    if (this.LJLJJI == EnumC127354zD.CLIP) {
                        return false;
                    }
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setClipState(C5AE c5ae) {
        if (this.LLILZ != c5ae) {
            this.LLILZ = c5ae;
        }
    }

    public final void setClipType(boolean z) {
        bringToFront();
        ((C59V) LIZ(R.id.et1)).setRound(0);
        C1302559h c1302559h = (C1302559h) LIZ(R.id.b_o);
        EnumC127354zD enumC127354zD = EnumC127354zD.CLIP;
        c1302559h.LIZ(enumC127354zD, z);
        this.LJLJJI = enumC127354zD;
        if (!this.LLIFFJFJJ) {
            ((C1302559h) LIZ(R.id.b_o)).getLeftHandler().LJ = true;
            ((C1302559h) LIZ(R.id.b_o)).getRightHandler().LJ = true;
        }
        setDurationIcon(this.LJLJLJ);
        ((C59V) LIZ(R.id.et1)).setTrackStyle(this.LJLJJI);
        this.LLIIJI.LIZIZ();
    }

    public final void setDockerTopLevel(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLJI = interfaceC65784Pro;
    }

    public final void setDrawMyTransitionOverlap(boolean z) {
        ((C59V) LIZ(R.id.et1)).setDrawMyTransitionOverlap(z);
    }

    public final void setDrawPreTransitionOverlap(boolean z) {
        ((C59V) LIZ(R.id.et1)).setDrawPreTransitionOverlap(z);
    }

    public final void setDuration(long j) {
        this.LJLJLJ = j;
    }

    public final void setEnableDragMode(boolean z) {
        this.LJLIL = z;
    }

    public final void setEnable_Long_click(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setEndDivider(boolean z) {
        ((C59V) LIZ(R.id.et1)).setEndDivider(z);
    }

    public final void setEpilogueEnable(boolean z) {
        this.LLII = z;
        if (z) {
            LIZ(R.id.ea7).setVisibility(0);
            LIZ(R.id.e_y).setVisibility(8);
        } else {
            LIZ(R.id.e_y).setVisibility(0);
            LIZ(R.id.ea7).setVisibility(8);
        }
        LJIILIIL();
    }

    public final void setFilterIcon(String str) {
        if (!this.LLJI || this.LLIFFJFJJ) {
            return;
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            this.LLIIIZ.LIZIZ();
            return;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return;
        }
        this.LLIIIZ.LJ(R.drawable.b00, str);
    }

    public final void setFooterType(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setFrameSelectChangeListener(InterfaceC130925Bw listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIJI.setFrameSelectChangeChangeListener(listener);
    }

    public final void setFrameViewCallback(InterfaceC130895Bt callback) {
        o.LJIIIZ(callback, "callback");
        this.LLIIJI.setFrameViewCallback(callback);
    }

    public final void setIndex(int i) {
        this.LJLLJ = i;
    }

    public final void setItemTrackCallback(C59O callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLLL = callback;
        ((C59V) LIZ(R.id.et1)).setFrameFetcher(new C59K(callback));
        ((C59V) LIZ(R.id.et1)).setDragThumbMask(callback.LIZLLL());
    }

    public final void setMuteIcon(boolean z) {
        int i;
        if (this.LLJI && !this.LLIFFJFJJ) {
            NLETrackSlot nLETrackSlot = this.LJLLILLLL;
            if (nLETrackSlot != null && !C124574uj.LJJIJIIJI(nLETrackSlot)) {
                return;
            }
            if (z) {
                C59M c59m = this.LLIIIZ;
                if (c59m.LIZIZ == null) {
                    ImageView imageView = new ImageView(c59m.LIZ.getContext());
                    imageView.setBackground(c59m.LIZ());
                    imageView.setImageDrawable(c59m.LIZJ);
                    int LIZ = (c59m.LJIJI - C134845Qy.LIZ(C1291054w.LJ().LJJIJIL)) / 2;
                    V2B.LJIILL(imageView, C134845Qy.LIZ(3.0f), LIZ, C134845Qy.LIZ(3.0f), LIZ);
                    imageView.requestLayout();
                    c59m.LIZIZ = imageView;
                }
                TextView textView = c59m.LJII;
                if (textView != null) {
                    i = c59m.LJIIIIZZ.indexOfChild(textView);
                } else {
                    i = -1;
                }
                ImageView imageView2 = c59m.LIZIZ;
                if (imageView2 == null) {
                    return;
                }
                c59m.LJIIL.width = c59m.LJIJ;
                C16880lQ.LJZI(c59m.LJIIIIZZ, imageView2);
                c59m.LJIIIIZZ.addView(imageView2, i, c59m.LJIILIIL);
                c59m.LIZJ();
                return;
            }
            C59M c59m2 = this.LLIIIZ;
            ImageView imageView3 = c59m2.LIZIZ;
            if (imageView3 == null) {
                return;
            }
            c59m2.LJIIL.width = c59m2.LJIJ;
            C16880lQ.LJZI(c59m2.LJIIIIZZ, imageView3);
            c59m2.LIZJ();
        }
    }

    public final void setOnDragListener(C59S c59s) {
        this.LJLLLL = c59s;
    }

    public final void setOnEpilogueEnableListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIJI((TextView) LIZ(R.id.e_y), new ACListenerS22S0100000_2(listener, 20));
    }

    public final void setScrollHandler(C59H c59h) {
        this.LLILZIL = c59h;
    }

    public final void setScrollState(C5AE c5ae) {
        int i;
        int i2;
        if (this.LLILLJJLI == c5ae) {
            return;
        }
        this.LLILLJJLI = c5ae;
        if (C59R.LIZ[c5ae.ordinal()] == 1) {
            if (LJFF()) {
                i = this.LLI;
            } else {
                i = this.LLFZ;
            }
            this.LL = i;
            if (LJFF()) {
                i2 = this.LLFZ;
            } else {
                i2 = this.LLI;
            }
            this.LLD = i2;
            this.LJZL = 0.0f;
            this.LLIIIJ.cancel();
            return;
        }
        this.LLIIIJ.start();
    }

    public final void setShowTips(boolean z) {
        this.LLJI = z;
    }

    public final void setSpeed(C59N c59n) {
        Context context;
        TextView textView;
        if (!this.LLJI) {
            return;
        }
        NLETrackSlot nLETrackSlot = this.LJLLILLLL;
        if ((nLETrackSlot == null || !C124574uj.LJJJJ(nLETrackSlot)) && c59n != null) {
            if (c59n.LIZJ == 0) {
                float f = c59n.LIZ - 1.0f;
                if (f >= 0.0f && f < 0.1f) {
                    this.LLIIIZ.LIZIZ();
                    return;
                }
                String LIZIZ = C63144OqK.LIZIZ(new Object[]{Float.valueOf(((int) (this.LJLL * 10)) / 10.0f)}, 1, Locale.ENGLISH, "%.1fx", "format(locale, format, *args)");
                C59M c59m = this.LLIIIZ;
                c59m.getClass();
                c59m.LIZLLL();
                if (!TextUtils.isEmpty(LIZIZ) && (textView = c59m.LJFF) != null) {
                    textView.setText(LIZIZ);
                }
                Drawable drawable = c59m.LIZLLL;
                if (drawable == null) {
                    return;
                }
                TextView textView2 = c59m.LJFF;
                if (textView2 != null) {
                    textView2.setCompoundDrawablePadding(c59m.LJIIJJI);
                }
                TextView textView3 = c59m.LJFF;
                if (textView3 != null) {
                    context = textView3.getContext();
                } else {
                    context = null;
                }
                if (C68E.LIZ(context)) {
                    TextView textView4 = c59m.LJFF;
                    if (textView4 == null) {
                        return;
                    }
                    textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                TextView textView5 = c59m.LJFF;
                if (textView5 == null) {
                    return;
                }
                textView5.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            this.LLIIIZ.LJ(R.drawable.b44, c59n.LIZLLL);
        }
    }

    public final void setStartDivider(boolean z) {
        ((C59V) LIZ(R.id.et1)).setStartDivider(z);
    }

    public final void setTransition(ImageView imageView) {
        this.LLIIJLIL = imageView;
    }

    public final void setTransitionHighlight(View view) {
        this.LLIIL = view;
    }

    public final void setTransitionHighlightView(View view) {
        o.LJIIIZ(view, "view");
        this.LLIIL = view;
    }

    public final void setTransitionIcon(int i) {
        ImageView imageView;
        if (this.LLJI && (imageView = this.LLIIJLIL) != null) {
            if (C1291054w.LJ().LIZIZ.LIZJ != null) {
                C1298057o c1298057o = C1291054w.LJ().LIZIZ;
                if (c1298057o != null) {
                    imageView.setImageDrawable(c1298057o.LIZJ);
                    return;
                }
                return;
            }
            imageView.setImageResource(i);
        }
    }

    public final void setVideoAnimMask(NLEVideoAnimation nLEVideoAnimation) {
        C59V c59v = (C59V) LIZ(R.id.et1);
        c59v.LJLJI = nLEVideoAnimation;
        c59v.postInvalidate();
    }

    private final void setScrollState(float f) {
        C5AE c5ae;
        int i = this.LLIIIILZ;
        int i2 = C1300758p.LJIIIIZZ;
        if (f >= i - i2) {
            if (LJFF()) {
                c5ae = C5AE.START;
            } else {
                c5ae = C5AE.END;
            }
        } else if (f <= i2) {
            if (LJFF()) {
                c5ae = C5AE.END;
            } else {
                c5ae = C5AE.START;
            }
        } else {
            c5ae = C5AE.NULL;
        }
        setScrollState(c5ae);
    }

    public final void LJIIIIZZ(float f, boolean z) {
        float f2 = this.LLFII + f;
        this.LLFII = f2;
        this.LLIIIL.width = Math.round(f2);
        LIZ(R.id.dn9).setLayoutParams(this.LLIIIL);
        LJIILLIIL();
        if (this.LLFFF && this.LLFII > LIZ(R.id.et1).getLayoutParams().width) {
            ((C59V) LIZ(R.id.et1)).LIZLLL(this.LLIIIL.width);
        }
        View framesLayout = LIZ(R.id.dn9);
        o.LJIIIIZZ(framesLayout, "framesLayout");
        this.LJLJJL = V2B.LJIIJ(framesLayout);
        this.LJLJL = (Math.abs(r0) / C1300758p.LIZIZ()) * this.LJLL;
        float f3 = this.LLFII;
        this.LJLJJLL = f3;
        long round = Math.round((f3 / C1300758p.LIZIZ()) * this.LJLL);
        this.LJLJLJ = round;
        setDurationIcon(round);
        int round2 = Math.round(this.LLFII) - O6R.LJJIIZ((C1300758p.LIZIZ() * ((float) this.LLIILII)) / 2);
        C59M c59m = this.LLIIIZ;
        c59m.LJIJ = round2;
        if (round2 <= 0) {
            c59m.LJIIIIZZ.setVisibility(8);
        } else {
            c59m.LJIIIIZZ.setVisibility(0);
        }
        C59M c59m2 = this.LLIIIZ;
        RelativeLayout.LayoutParams layoutParams = c59m2.LJIIL;
        layoutParams.width = round2;
        c59m2.LJIIIIZZ.setLayoutParams(layoutParams);
        if (!z) {
            float f4 = this.LJLLI + f;
            this.LJLLI = f4;
            C59O c59o = this.LJLLL;
            if (c59o != null) {
                c59o.LJIIIZ(f4, 1, this.LJLLJ, this.LJLJL, this.LJLJLJ);
            }
            C59V c59v = (C59V) LIZ(R.id.et1);
            c59v.LJLJLLL = this.LJLLI;
            c59v.invalidate();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recycle layoutParams.width is ");
        LIZ.append(this.LLIIIL.width);
        C131935Ft.LIZIZ("ItemTrackLayout", X1D.LIZIZ(LIZ));
    }

    public final void LJIILL(float f, boolean z) {
        float f2 = this.LLFII - f;
        this.LLFII = f2;
        this.LLIIIL.width = Math.round(f2);
        LIZ(R.id.dn9).setLayoutParams(this.LLIIIL);
        LJIILLIIL();
        this.LJLJJLL = this.LLFII;
        if (!this.LLFFF) {
            View framesLayout = LIZ(R.id.dn9);
            o.LJIIIIZZ(framesLayout, "framesLayout");
            int LJIIJ = V2B.LJIIJ(framesLayout);
            View framesLayout2 = LIZ(R.id.dn9);
            o.LJIIIIZZ(framesLayout2, "framesLayout");
            V2B.LJIILL(framesLayout2, Math.round(LJIIJ - f), 0, 0, 0);
        }
        View framesLayout3 = LIZ(R.id.dn9);
        o.LJIIIIZZ(framesLayout3, "framesLayout");
        this.LJLJJL = V2B.LJIIJ(framesLayout3);
        this.LJLJL = (Math.abs(r0) / C1300758p.LIZIZ()) * this.LJLL;
        long round = Math.round((this.LJLJJLL / C1300758p.LIZIZ()) * this.LJLL);
        this.LJLJLJ = round;
        setDurationIcon(round);
        int round2 = Math.round(this.LLFII) - O6R.LJJIIZ((C1300758p.LIZIZ() * ((float) this.LLIILII)) / 2);
        C59M c59m = this.LLIIIZ;
        c59m.LJIJ = round2;
        if (round2 <= 0) {
            c59m.LJIIIIZZ.setVisibility(8);
        } else {
            c59m.LJIIIIZZ.setVisibility(0);
        }
        C59M c59m2 = this.LLIIIZ;
        RelativeLayout.LayoutParams layoutParams = c59m2.LJIIL;
        layoutParams.width = round2;
        c59m2.LJIIIIZZ.setLayoutParams(layoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recycle layoutParams.width is ");
        LIZ.append(this.LLIIIL.width);
        C131935Ft.LIZIZ("ItemTrackLayout", X1D.LIZIZ(LIZ));
        if (!z) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + ((int) f));
            float f3 = this.LJLLI - f;
            this.LJLLI = f3;
            C59O c59o = this.LJLLL;
            if (c59o != null) {
                c59o.LJIIIZ(f3, 0, this.LJLLJ, this.LJLJL, this.LJLJLJ);
            }
            C59V c59v = (C59V) LIZ(R.id.et1);
            c59v.LJLJLJ = -this.LJLLI;
            c59v.invalidate();
            return;
        }
        this.LJLLI = 0.0f;
    }

    public final void LIZJ(C5AE c5ae, float f, float f2) {
        float f3;
        float f4;
        float f5;
        C5AE c5ae2 = C5AE.START;
        boolean z = true;
        if (c5ae == c5ae2) {
            if (LJFF()) {
                if (f2 < this.LLI && f <= 0.0f) {
                    return;
                }
                if (f2 > r1 + this.LLILIL + this.LLILII && f >= 0.0f) {
                    return;
                }
            } else {
                int i = this.LLFZ;
                if (f2 < (i - this.LLILIL) - this.LLILII && f >= 0.0f) {
                    return;
                }
                if (f2 > i && f <= 0.0f) {
                    return;
                }
            }
            int i2 = (int) f;
            if (i2 == 0) {
                return;
            }
            float f6 = i2;
            float f7 = this.LJLLLLLL;
            if (f7 + f6 <= 0.0f) {
                f4 = -f7;
                if (f7 != 0.0f) {
                    getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                }
            } else {
                f4 = f6;
            }
            if (f4 == 0.0f) {
                setScrollState(C5AE.NULL);
                return;
            }
            C5AE c5ae3 = this.LLILLJJLI;
            C5AE c5ae4 = C5AE.NULL;
            if (c5ae3 == c5ae4) {
                this.LJZL += f6;
                if (LJFF()) {
                    f5 = this.LL - this.LJZL;
                } else {
                    f5 = this.LL + this.LJZL;
                }
                int i3 = C1300758p.LJIIIZ / 2;
                if (Math.abs(i3 - f5) < LLJILJIL) {
                    if (LJFF()) {
                        f4 = this.LLI - i3;
                    } else {
                        f4 = i3 - this.LLFZ;
                    }
                    if (f4 != 0.0f) {
                        getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                    }
                }
            }
            if (((this.LLFF - this.LJLLLLLL) - this.LJLZ) - f4 >= C1300758p.LIZIZ() * ((float) this.LLIIII)) {
                z = false;
            }
            if (this.LJLLLLLL + f4 < 0.0f || z) {
                setScrollState(c5ae4);
                if (z) {
                    C59O c59o = this.LJLLL;
                    if (c59o == null) {
                        return;
                    }
                    c59o.onClipMainToMinDuration();
                    return;
                }
                f4 = -this.LJLLLLLL;
            }
            this.LJLLLLLL += f4;
            LJIILL(f4, false);
            C59O c59o2 = this.LJLLL;
            if (c59o2 != null) {
                c59o2.LJ(this.LJLLI, this.LJLLJ, (int) f4, 0);
            }
            setScrollState(f2);
            C130655Av c130655Av = this.LLIIJI;
            c130655Av.LJLIL.LJ = (int) f4;
            c130655Av.invalidate();
            return;
        }
        C5AE c5ae5 = C5AE.END;
        if (c5ae != c5ae5) {
            return;
        }
        if (LJFF()) {
            int i4 = this.LLFZ;
            if (f2 < (i4 - this.LLILIL) - this.LLILII && f <= 0.0f) {
                return;
            }
            if (f2 > i4 && f >= 0.0f) {
                return;
            }
        } else {
            if (f2 < this.LLI && f >= 0.0f) {
                return;
            }
            if (f2 > r1 + this.LLILIL + this.LLILII && f <= 0.0f) {
                return;
            }
        }
        if (((int) f) == 0) {
            return;
        }
        float LIZIZ = C1300758p.LIZIZ() * ((float) this.LLIIII);
        float f8 = this.LLFF;
        this.LLJ = false;
        if (this.LLFFF) {
            if (f <= 0.0f) {
                float f9 = this.LJLLLLLL;
                float f10 = this.LJLZ;
                if (((f8 - f9) - f10) + f < LIZIZ) {
                    f = (LIZIZ - f8) + f9 + f10;
                    C59O c59o3 = this.LJLLL;
                    if (c59o3 != null) {
                        c59o3.onClipMainToMinDuration();
                    }
                }
            }
        } else {
            float f11 = this.LJLZ;
            if (f11 - f < 0.0f) {
                this.LLJ = true;
                f = f11;
            }
            float f12 = this.LJLLLLLL;
            if (((f8 - f12) - f11) + f < LIZIZ) {
                f = (LIZIZ - f8) + f12 + f11;
                C59O c59o4 = this.LJLLL;
                if (c59o4 != null) {
                    c59o4.onClipMainToMinDuration();
                }
            }
        }
        if (f == 0.0f) {
            setScrollState(C5AE.NULL);
            return;
        }
        if (f > 0.0f) {
            c5ae2 = c5ae5;
        }
        if (c5ae2 != this.LLIZ) {
            if (Math.abs(this.LLILZLL) > Math.abs(f)) {
                this.LLILZLL += f;
                return;
            } else {
                this.LLIZ = c5ae2;
                f += this.LLILZLL;
                this.LLILZLL = 0.0f;
            }
        }
        float f13 = this.LLILZLL;
        if (f13 == 0.0f) {
            if (this.LLILLJJLI == C5AE.NULL) {
                long LIZIZ2 = (this.LLIIIL.width + f) / C1300758p.LIZIZ();
                C59O c59o5 = this.LJLLL;
                if (c59o5 != null) {
                    f3 = c59o5.LJI(this.LJLLJ, LIZIZ2, this.LLIZ);
                    if (f3 != 0.0f) {
                        getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                    }
                    LIZLLL(f + f3);
                    this.LLILZLL = f3;
                }
            }
            f3 = 0.0f;
            LIZLLL(f + f3);
            this.LLILZLL = f3;
        } else if (Math.abs(f13) > Math.abs(f)) {
            this.LLILZLL -= f;
        } else {
            LIZLLL(f - this.LLILZLL);
            this.LLILZLL = 0.0f;
        }
        setScrollState(f2);
        C130665Aw c130665Aw = this.LLIIJI.LJLIL;
        c130665Aw.LJ = 0;
        c130665Aw.LJFF = 0.0f;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [X.59P] */
    public final void LJIIIZ(NLETrackSlot nleTrackSlot, int i, long j, boolean z) {
        long duration;
        long j2;
        boolean z2;
        float f;
        float LIZIZ;
        float LIZIZ2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nleTrackSlot.LJI());
        if (LJJ != null) {
            long j3 = 1000;
            this.LJLJL = LJJ.LJIILIIL() / j3;
            this.LJLJLJ = C124574uj.LIZ(LJJ) * ((float) (nleTrackSlot.getDuration() / j3));
            if (C124614un.LJIILIIL(nleTrackSlot)) {
                NLEResourceAV LJIIIIZZ = C124614un.LJIIIIZZ(nleTrackSlot);
                if (LJIIIIZZ != null) {
                    j2 = LJIIIIZZ.getDuration() / j3;
                }
                j2 = 0;
            } else {
                if (C124574uj.LJJJJ(nleTrackSlot)) {
                    duration = nleTrackSlot.getEndTime() - nleTrackSlot.getStartTime();
                } else {
                    NLEResourceNode LIZIZ3 = LJJ.LIZIZ();
                    if (LIZIZ3 != null) {
                        duration = LIZIZ3.getDuration();
                    }
                    j2 = 0;
                }
                j2 = duration / j3;
            }
            this.LJLJLLL = j2;
            this.LJLL = C124574uj.LIZ(LJJ);
            this.LJLLILLLL = nleTrackSlot;
            this.LLIILII = j;
            this.LLIIZ = z;
            this.LLFFF = C124574uj.LJJJJ(nleTrackSlot);
            NLESegmentTransition LIZLLL = nleTrackSlot.LIZLLL();
            if (LIZLLL != null && LIZLLL.LJ()) {
                this.LLIILZL = LIZLLL.LJFF() / j3;
            }
            this.LLIIJI.setSlot(nleTrackSlot);
            if (getFrameCacheViewModel() != null) {
                C59V c59v = (C59V) LIZ(R.id.et1);
                c59v.LLIIZ = null;
                c59v.LLIL = null;
            }
            ((C59V) LIZ(R.id.et1)).LIZJ(j, nleTrackSlot);
            EnumC127354zD enumC127354zD = EnumC127354zD.NONE;
            this.LJLJJI = enumC127354zD;
            C1302559h checkbox = (C1302559h) LIZ(R.id.b_o);
            o.LJIIIIZZ(checkbox, "checkbox");
            checkbox.LIZ(enumC127354zD, false);
            LJII();
            if (this.LLIFFJFJJ) {
                ((C1302559h) LIZ(R.id.b_o)).getLeftHandler().LJ = false;
                ((C1302559h) LIZ(R.id.b_o)).getRightHandler().LJ = false;
            }
            ((C1302559h) LIZ(R.id.b_o)).getLeftHandler().LIZIZ = new AqS184S0100000_2(this, 12);
            ((C1302559h) LIZ(R.id.b_o)).getRightHandler().LIZIZ = new AqS184S0100000_2(this, 13);
            ((C1302559h) LIZ(R.id.b_o)).getLeftHandler().LIZLLL = new AqS168S0100000_2(this, 27);
            ((C1302559h) LIZ(R.id.b_o)).getRightHandler().LIZLLL = new AqS168S0100000_2(this, 28);
            ((C1302559h) LIZ(R.id.b_o)).getLeftHandler().LIZJ = new AqS168S0100000_2(this, 29);
            ((C1302559h) LIZ(R.id.b_o)).getRightHandler().LIZJ = new AqS168S0100000_2(this, 30);
            LIZ(R.id.dn9).setOnTouchListener(new ViewOnTouchListenerC1304159x(new AqS152S0100000_2(this, 48), new C59S() { // from class: X.59P
                @Override // X.C59S
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.C59S
                public final void LIZ() {
                    if (!C59L.this.getEnableDragMode()) {
                        return;
                    }
                    C59L c59l = C59L.this;
                    if (c59l.LLIFFJFJJ) {
                        return;
                    }
                    c59l.requestDisallowInterceptTouchEvent(false);
                    C59S c59s = C59L.this.LJLLLL;
                    if (c59s != null) {
                        c59s.LIZ();
                    }
                }

                @Override // X.C59S
                public final boolean LIZJ(float f2, float f3) {
                    if (!C59L.this.getEnableDragMode() || !C59L.this.getEnable_Long_click()) {
                        return false;
                    }
                    C59S c59s = C59L.this.LJLLLL;
                    if (c59s != null && !c59s.LIZIZ()) {
                        return false;
                    }
                    C59L c59l = C59L.this;
                    if (!c59l.LLIFFJFJJ) {
                        c59l.getHapticFeedback().LIZ(C59L.this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                        C59L.this.requestDisallowInterceptTouchEvent(true);
                        C59S c59s2 = C59L.this.LJLLLL;
                        if (c59s2 == null) {
                            return false;
                        }
                        return c59s2.LIZJ(f2, f3);
                    }
                    return false;
                }

                @Override // X.C59S
                public final void LIZLLL(float f2, float f3, boolean z3, boolean z4) {
                    C59S c59s;
                    if (!C59L.this.getEnableDragMode()) {
                        return;
                    }
                    C59L c59l = C59L.this;
                    if (!c59l.LLIFFJFJJ && (c59s = c59l.LJLLLL) != null) {
                        c59s.LIZLLL(f2, f3, z3, z4);
                    }
                }
            }));
            boolean z3 = this.LLIFFJFJJ;
            if (z3 && !this.LLII) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = 2;
                LIZIZ = C1300758p.LIZJ;
            } else if (z3) {
                f = ((float) 2000) / this.LJLL;
                LIZIZ = C1300758p.LIZIZ();
            } else {
                f = ((float) this.LJLJLLL) / this.LJLL;
                LIZIZ = C1300758p.LIZIZ();
            }
            this.LLFF = f * LIZIZ;
            this.LJZ = C1300758p.LIZIZ() * (((float) this.LJLJL) / this.LJLL);
            if (this.LLIFFJFJJ) {
                boolean z4 = this.LLII;
                LIZIZ2 = 0.0f;
            } else {
                LIZIZ2 = C1300758p.LIZIZ() * (((float) ((this.LJLJLLL - this.LJLJLJ) - this.LJLJL)) / this.LJLL);
            }
            this.LJZI = LIZIZ2;
            C59M c59m = this.LLIIIZ;
            int i2 = (int) this.LLFF;
            c59m.LJIJ = i2;
            this.LJLLLLLL = this.LJZ;
            this.LJLZ = LIZIZ2;
            this.LLIIIL.width = i2;
            LIZ(R.id.dn9).setLayoutParams(this.LLIIIL);
            this.LLFII = this.LLFF;
            View framesLayout = LIZ(R.id.dn9);
            o.LJIIIIZZ(framesLayout, "framesLayout");
            V2B.LJIILL(framesLayout, 0, 0, 0, 0);
            LJIILL(this.LJZ, true);
            LJIIIIZZ(-this.LJZI, true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init left is ");
            LIZ.append(this.LJZ);
            LIZ.append(" init right is ");
            LIZ.append(this.LJZI);
            LIZ.append(" max length is ");
            LIZ.append(this.LLFF);
            C131935Ft.LIZIZ("ItemTrackLayout", X1D.LIZIZ(LIZ));
            setDurationIcon(LJJ.getDuration());
            if (j != 0) {
                this.LLIIIZ.LJIIL.setMarginStart(C134845Qy.LIZ(2.0f) + Math.round((C1300758p.LIZIZ() * ((float) this.LLIILII)) / 2));
            } else {
                this.LLIIIZ.LJIIL.setMarginStart(0);
            }
            ViewGroup.LayoutParams layoutParams = LIZ(R.id.b_o).getLayoutParams();
            if ((layoutParams instanceof RelativeLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
            }
        }
    }
}

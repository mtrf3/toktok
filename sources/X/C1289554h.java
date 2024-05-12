package X;

import android.animation.ValueAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.gamora.editorpro.views.InterceptConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1289554h {
    public final C5B0 LIZ;
    public final String LIZIZ;
    public final ConstraintLayout LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final ValueAnimator LJIIIZ;

    public final void LIZJ() {
        this.LJI = false;
        if (this.LIZ.getVisibility() == 0) {
            this.LIZ.setVisibility(8);
        }
    }

    static {
        Keva.getRepo("bottom_bar_guide_repo");
    }

    public final OSZ<String, Integer> LIZ() {
        String str = this.LIZIZ;
        if (o.LJ(str, EnumC1289754j.EDIT.getType())) {
            return new OSZ<>("bottom_item_root_edit", null);
        }
        if (o.LJ(str, EnumC1289754j.SOUND.getType())) {
            return new OSZ<>("bottom_item_root_sound", null);
        }
        if (o.LJ(str, EnumC1289754j.SOUND_EFFECT.getType())) {
            return new OSZ<>("bottom_item_sound_sound_effect", null);
        }
        if (o.LJ(str, EnumC1289754j.VOICE_OVER.getType())) {
            return new OSZ<>("bottom_item_sound_voiceover", null);
        }
        if (o.LJ(str, EnumC1289754j.TEXT.getType())) {
            return new OSZ<>("bottom_item_root_text", null);
        }
        if (o.LJ(str, EnumC1289754j.CAPTION.getType())) {
            return new OSZ<>("bottom_item_text_captions", Integer.valueOf(R.string.fif));
        }
        if (o.LJ(str, EnumC1289754j.EFFECT.getType())) {
            return new OSZ<>("bottom_item_root_effects", Integer.valueOf(R.string.fle));
        }
        if (o.LJ(str, EnumC1289754j.TRANSITION.getType())) {
            return new OSZ<>("bottom_item_video_transition", null);
        }
        if (o.LJ(str, EnumC1289754j.PIP.getType())) {
            return new OSZ<>("bottom_item_root_overlay", null);
        }
        return new OSZ<>(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r3 == (-1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<X.AnonymousClass523, java.lang.Integer> LIZIZ() {
        /*
            r8 = this;
            X.Ol8 r0 = r8.LJIIIIZZ
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r7 = 0
            if (r2 != 0) goto Lc
            return r7
        Lc:
            X.Ol8 r0 = r8.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.50Q r0 = (X.C50Q) r0
            if (r0 == 0) goto L60
            X.525 r1 = r0.LJI()
            if (r1 == 0) goto L60
            X.526 r0 = r1.LIZIZ
            X.523 r6 = r0.LIZ(r2)
            if (r6 == 0) goto L60
            X.526 r0 = r1.LIZIZ
            X.523 r5 = r0.LIZIZ(r6)
            if (r5 == 0) goto L60
            java.util.ArrayList r0 = r5.LIZIZ()
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L35:
            boolean r0 = r4.hasNext()
            r2 = -1
            if (r0 == 0) goto L64
            java.lang.Object r0 = r4.next()
            X.523 r0 = (X.AnonymousClass523) r0
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = r6.LJ
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L61
            if (r3 != r2) goto L52
        L4e:
            int r0 = r6.LJIIJ
            if (r0 == r2) goto L60
        L52:
            int r0 = r6.LJIIJ
            if (r0 == 0) goto L57
            r3 = r0
        L57:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.OSZ r7 = new X.OSZ
            r7.<init>(r5, r0)
        L60:
            return r7
        L61:
            int r3 = r3 + 1
            goto L35
        L64:
            r3 = -1
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1289554h.LIZIZ():X.OSZ");
    }

    public C1289554h(C29S activity, C5B0 c5b0, String str, InterceptConstraintLayout interceptConstraintLayout) {
        final String str2;
        o.LJIIIZ(activity, "activity");
        this.LIZ = c5b0;
        this.LIZIZ = str;
        this.LIZJ = interceptConstraintLayout;
        this.LIZLLL = C221108m2.LIZIZ(AnonymousClass521.LJLIL);
        this.LJ = C221108m2.LIZIZ(C53B.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 818));
        final ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        ofInt.setDuration(1000L);
        ofInt.setRepeatCount(-1);
        Integer second = LIZ().getSecond();
        if (second != null) {
            str2 = activity.getString(second.intValue());
        } else {
            str2 = null;
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.57e
            /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[ADDED_TO_REGION, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onAnimationUpdate(android.animation.ValueAnimator r22) {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1297057e.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        });
        this.LJIIIZ = ofInt;
    }
}

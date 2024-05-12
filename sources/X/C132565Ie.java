package X;

import Y.ALAdapterS1S0100000_2;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132565Ie implements C5DC {
    public static final Keva LJJIII = Keva.getRepo("EDITOR_PRO_GUIDANCE");
    public final ViewGroup LIZ;
    public final LifecycleOwner LIZIZ;
    public final C132585Ig LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public boolean LJII;
    public final Context LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final TuxTextView LJIIJJI;
    public final TuxTextView LJIIL;
    public final TuxTextView LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;

    @Override // X.C5DC
    public final void LJIIIZ() {
        this.LJII = true;
    }

    public final void LJIILLIIL() {
        this.LJIJJ = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LJIJJLI = false;
        this.LJJI = false;
        this.LJJIFFI = false;
        ((Handler) this.LJIILLIIL.getValue()).removeCallbacks((Runnable) this.LJIIZILJ.getValue());
        if (LJIILIIL().isAnimating()) {
            LJIILIIL().pauseAnimation();
        }
        if (o.LJ(LJIIL().getParent(), this.LIZ)) {
            LJIILJJIL().animate().setDuration(150L).alpha(0.0f);
            LJIIL().animate().setDuration(150L).alpha(0.0f).setListener(new ALAdapterS1S0100000_2(this, 22));
        }
        if (o.LJ(this.LJIIL.getParent(), this.LIZ)) {
            this.LJIIL.animate().setDuration(150L).alpha(0.0f).setListener(new ALAdapterS1S0100000_2(this, 23));
        }
    }

    @Override // X.C5DC
    public final void LIZLLL() {
        LJIIJJI("TRIM_TEXT_SLOT");
    }

    public final LinearLayout LJIIL() {
        return (LinearLayout) this.LJIILJJIL.getValue();
    }

    public final C29701Eo LJIILIIL() {
        return (C29701Eo) this.LJIIIZ.getValue();
    }

    public final FrameLayout LJIILJJIL() {
        return (FrameLayout) this.LJIILL.getValue();
    }

    public final View LJIILL() {
        return (View) this.LJIJ.getValue();
    }

    @Override // X.C5DC
    public final void LIZIZ() {
        LJIILLIIL();
    }

    @Override // X.C5DC
    public final boolean LJII() {
        return this.LJJII;
    }

    public static boolean LJIIJJI(String str) {
        Keva keva = LJJIII;
        if (keva.getBoolean(str, false)) {
            return true;
        }
        keva.storeBoolean(str, true);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5DC
    public final void LIZ(boolean z) {
        boolean z2;
        if (z) {
            if (this.LJJII || !C132575If.LIZ() || !this.LIZJ.LIZIZ) {
                return;
            }
            EditorProContext editorProContext = (EditorProContext) this.LJFF.getValue();
            Boolean bool = Boolean.FALSE;
            if (((Boolean) C79057V0z.LJJIII(editorProContext, "event_user_guide_intercepted", bool)).booleanValue() || ((Boolean) C79057V0z.LJJIII((EditorProContext) this.LJFF.getValue(), "has_shown_bottom_menu_anim_guide", bool)).booleanValue()) {
                return;
            }
            Iterator it = C47261Igj.LJJIJIIJI(C5DG.BOTTOM_BAR, C5DG.SELECT_SLOT, C5DG.VIDEO_TRANSITION, C5DG.TRIM_VIDEO, C5DG.MAGIC).iterator();
            while (it.hasNext()) {
                if (LJI((C5DG) it.next())) {
                    return;
                }
            }
            if (LJIIJJI("PINCH_GUIDE") || LJIIJJI("PINCH_TEXT_SLOT")) {
                return;
            }
            this.LJIL = true;
            this.LJJII = true;
            TuxTextView tuxTextView = this.LJIIJJI;
            tuxTextView.setLayoutParams(new C018905p(-2, -2));
            tuxTextView.setGravity(1);
            tuxTextView.setTuxFont(62);
            tuxTextView.setLines(2);
            tuxTextView.setMaxLines(3);
            tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(160.0f))));
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(34.0f))));
            tuxTextView.setMaxWidth(this.LIZ.getWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(160)));
            tuxTextView.setMaxHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(51)));
            tuxTextView.setText(R.string.bgj);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setShadowLayer(4.0f, 0.0f, 0.0f, R.attr.ef);
            tuxTextView.setVisibility(0);
            FrameLayout LJIILJJIL = LJIILJJIL();
            C018905p c018905p = new C018905p(C278817o.LIZ(380.0f), C278817o.LIZ(380.0f));
            int[] iArr = new int[2];
            ((View) this.LJIJI.getValue()).getLocationOnScreen(iArr);
            c018905p.startToStart = this.LIZ.getId();
            c018905p.endToEnd = this.LIZ.getId();
            c018905p.topToTop = this.LIZ.getId();
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = iArr[1];
            LJIILJJIL.setLayoutParams(c018905p);
            C71899SJr c71899SJr = new C71899SJr();
            c71899SJr.LIZ = C278817o.LIZ(380.0f);
            c71899SJr.LIZIZ = C278817o.LIZ(380.0f);
            c71899SJr.LIZLLL = Integer.valueOf(R.attr.ca);
            c71899SJr.LJ = Float.valueOf(1.0f);
            c71899SJr.LJFF = Float.valueOf(0.0f);
            c71899SJr.LJI = EnumC71803SFz.RADIAL;
            Context context = LJIILJJIL.getContext();
            o.LJIIIIZZ(context, "context");
            LJIILJJIL.setBackground(c71899SJr.LIZ(context));
            LJIIJ(C47261Igj.LJJIJ(LJIILJJIL()), this.LIZ);
            C62822Ol8 c62822Ol8 = C132605Ii.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LinearLayout LJIIL = LJIIL();
                if ((LJIIL instanceof LinearLayout) && LJIIL != null) {
                    C018905p c018905p2 = new C018905p(-2, -2);
                    c018905p2.topToTop = this.LIZ.getId();
                    c018905p2.startToStart = this.LIZ.getId();
                    c018905p2.endToEnd = this.LIZ.getId();
                    LJIIL.setLayoutParams(c018905p2);
                    int[] iArr2 = new int[2];
                    LJIILL().getLocationOnScreen(iArr2);
                    C26338AVi.LJI(LJIIL, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(110.0f)))), Integer.valueOf(C278817o.LIZ(62.0f) + iArr2[1]), C65429Pm5.LIZIZ(110.0f), 0, false, 16);
                    LJIIL.setVisibility(0);
                    LJIIL.setOrientation(1);
                    LJIIL.setGravity(1);
                }
                ImageView imageView = (ImageView) this.LJIIJ.getValue();
                imageView.setLayoutParams(new ViewGroup.LayoutParams(C278817o.LIZ(110.0f), C278817o.LIZ(110.0f)));
                imageView.setImageResource(R.drawable.ar2);
                imageView.setVisibility(0);
                LJIIJ(C47261Igj.LJJIJIIJI(this.LJIIJ.getValue(), this.LJIIJJI), LJIIL());
                LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
                ((Handler) this.LJIILLIIL.getValue()).postDelayed((Runnable) this.LJIIZILJ.getValue(), 3000L);
                return;
            }
            if (((Number) c62822Ol8.getValue()).intValue() != 1) {
                return;
            }
            C29701Eo LJIILIIL = LJIILIIL();
            LJIILIIL.setLayoutParams(new RelativeLayout.LayoutParams(C278817o.LIZ(110.0f), C278817o.LIZ(110.0f)));
            LJIILIIL.setAnimation("editor_pro_guide_pinch_in_gif.json");
            LJIILIIL.setRepeatCount(5);
            LJIILIIL.setRepeatMode(2);
            LJIILIIL.setVisibility(0);
            LJIILIIL.addAnimatorListener(new ALAdapterS1S0100000_2(this, 25));
            LinearLayout LJIIL2 = LJIIL();
            C018905p c018905p3 = new C018905p(-2, -2);
            c018905p3.topToTop = this.LIZ.getId();
            c018905p3.startToStart = this.LIZ.getId();
            c018905p3.endToEnd = this.LIZ.getId();
            LJIIL2.setLayoutParams(c018905p3);
            int[] iArr3 = new int[2];
            LJIILL().getLocationOnScreen(iArr3);
            C26338AVi.LJI(LJIIL2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(110.0f)))), Integer.valueOf(C278817o.LIZ(62.0f) + iArr3[1]), C65429Pm5.LIZIZ(110.0f), 0, false, 16);
            LJIIL2.setOrientation(1);
            LJIIL2.setGravity(1);
            LJIIL2.setVisibility(0);
            LJIIJ(C47261Igj.LJJIJIIJI(LJIILIIL(), this.LJIIJJI), LJIIL());
            LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
            LJIILIIL().playAnimation();
            return;
        }
        LJIILLIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5DC
    public final void LJ(boolean z) {
        boolean z2;
        if (z) {
            if (this.LJJII || this.LJII || !C132575If.LIZ() || !this.LIZJ.LIZ || ((Boolean) C79057V0z.LJJIII((EditorProContext) this.LJFF.getValue(), "event_user_guide_intercepted", Boolean.FALSE)).booleanValue() || C135125Sa.LIZ().getBoolean("func_bar_transition_anim_show", false)) {
                return;
            }
            Iterator it = C47261Igj.LJJIJIIJI(C5DG.BOTTOM_BAR, C5DG.SELECT_SLOT, C5DG.VIDEO_TRANSITION, C5DG.PINCH_TIMELINE, C5DG.MAGIC).iterator();
            while (it.hasNext()) {
                if (LJI((C5DG) it.next())) {
                    return;
                }
            }
            if (LJIIJJI("TRIM_GUIDE") || LJIIJJI("TRIM_TEXT_SLOT")) {
                return;
            }
            this.LJIJJ = true;
            this.LJJII = true;
            TuxTextView tuxTextView = this.LJIIJJI;
            tuxTextView.setLayoutParams(new C018905p(-2, -2));
            tuxTextView.setGravity(1);
            tuxTextView.setTuxFont(62);
            tuxTextView.setLines(2);
            tuxTextView.setMaxLines(3);
            tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(160.0f))));
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(34.0f))));
            tuxTextView.setMaxWidth(this.LIZ.getWidth() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(160)));
            tuxTextView.setMaxHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(51)));
            tuxTextView.setText(R.string.bgl);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setVisibility(0);
            LinearLayout LJIIL = LJIIL();
            if ((LJIIL instanceof LinearLayout) && LJIIL != null) {
                C018905p c018905p = new C018905p(-2, -2);
                c018905p.topToTop = this.LIZ.getId();
                c018905p.startToStart = this.LIZ.getId();
                c018905p.endToEnd = this.LIZ.getId();
                LJIIL.setLayoutParams(c018905p);
                int[] iArr = new int[2];
                LJIILL().getLocationOnScreen(iArr);
                C26338AVi.LJI(LJIIL, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(172.0f)))), Integer.valueOf(C278817o.LIZ(62.0f) + iArr[1]), C65429Pm5.LIZIZ(172.0f), 0, false, 16);
                LJIIL.setVisibility(0);
                LJIIL.setOrientation(1);
                LJIIL.setGravity(1);
            }
            FrameLayout LJIILJJIL = LJIILJJIL();
            C018905p c018905p2 = new C018905p(C278817o.LIZ(504.0f), C278817o.LIZ(361.0f));
            int[] iArr2 = new int[2];
            ((View) this.LJIJI.getValue()).getLocationOnScreen(iArr2);
            c018905p2.startToStart = this.LIZ.getId();
            c018905p2.endToEnd = this.LIZ.getId();
            c018905p2.topToTop = this.LIZ.getId();
            ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = C7MY.LIZIZ(80) + iArr2[1];
            LJIILJJIL.setLayoutParams(c018905p2);
            C71899SJr c71899SJr = new C71899SJr();
            c71899SJr.LIZ = C278817o.LIZ(504.0f);
            c71899SJr.LIZIZ = C278817o.LIZ(361.0f);
            c71899SJr.LIZLLL = Integer.valueOf(R.attr.ca);
            c71899SJr.LJ = Float.valueOf(1.0f);
            c71899SJr.LJFF = Float.valueOf(0.0f);
            c71899SJr.LJI = EnumC71803SFz.RADIAL;
            Context context = LJIILJJIL.getContext();
            o.LJIIIIZZ(context, "context");
            LJIILJJIL.setBackground(c71899SJr.LIZ(context));
            LJIIJ(C47261Igj.LJJIJ(LJIILJJIL()), this.LIZ);
            C62822Ol8 c62822Ol8 = C132605Ii.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ImageView imageView = (ImageView) this.LJIIJ.getValue();
                imageView.setLayoutParams(new ViewGroup.LayoutParams(C278817o.LIZ(110.0f), C278817o.LIZ(110.0f)));
                imageView.setImageResource(R.drawable.ar3);
                imageView.setVisibility(0);
                LJIIJ(C47261Igj.LJJIJIIJI(this.LJIIJ.getValue(), this.LJIIJJI), LJIIL());
                LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
                ((Handler) this.LJIILLIIL.getValue()).postDelayed((Runnable) this.LJIIZILJ.getValue(), 3000L);
                return;
            }
            if (((Number) c62822Ol8.getValue()).intValue() != 1) {
                return;
            }
            C29701Eo LJIILIIL = LJIILIIL();
            LJIILIIL.setLayoutParams(new ViewGroup.LayoutParams(C278817o.LIZ(110.0f), C278817o.LIZ(110.0f)));
            LJIILIIL.setAnimation("editor_pro_guide_trim_video_gif.json");
            LJIILIIL.setRepeatCount(2);
            LJIILIIL.setVisibility(0);
            LJIILIIL.addAnimatorListener(new ALAdapterS1S0100000_2(this, 26));
            LJIIJ(C47261Igj.LJJIJIIJI(LJIILIIL(), this.LJIIJJI), LJIIL());
            LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
            LJIILIIL().playAnimation();
            return;
        }
        LJIILLIIL();
    }

    @Override // X.C5DC
    public final void LJFF(boolean z) {
        if (z) {
            if (this.LJJII || !this.LIZJ.LIZLLL) {
                return;
            }
            Iterator it = C47261Igj.LJJIJIIJI(C5DG.BOTTOM_BAR, C5DG.VIDEO_TRANSITION, C5DG.TRIM_VIDEO, C5DG.PINCH_TIMELINE).iterator();
            while (it.hasNext()) {
                if (LJI((C5DG) it.next())) {
                    return;
                }
            }
            if (LJIIJJI("PINCH_GUIDE") || LJIIJJI("PINCH_TEXT_SLOT")) {
                return;
            }
            this.LJJI = true;
            this.LJJII = true;
            TuxTextView tuxTextView = this.LJIILIIL;
            tuxTextView.setLayoutParams(new C018905p(C7MY.LIZIZ(160), -2));
            tuxTextView.setGravity(1);
            tuxTextView.setTuxFont(62);
            tuxTextView.setLines(2);
            tuxTextView.setMaxLines(3);
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(34.0f))));
            tuxTextView.setMaxHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(51)));
            tuxTextView.setText(R.string.fib);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setShadowLayer(4.0f, 0.0f, 0.0f, R.attr.ef);
            tuxTextView.setVisibility(0);
            FrameLayout LJIILJJIL = LJIILJJIL();
            C018905p c018905p = new C018905p(C278817o.LIZ(504.0f), C278817o.LIZ(361.0f));
            int[] iArr = new int[2];
            ((View) this.LJIJI.getValue()).getLocationOnScreen(iArr);
            c018905p.startToStart = this.LIZ.getId();
            c018905p.endToEnd = this.LIZ.getId();
            c018905p.topToTop = this.LIZ.getId();
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C7MY.LIZIZ(80) + iArr[1];
            LJIILJJIL.setLayoutParams(c018905p);
            C71899SJr c71899SJr = new C71899SJr();
            c71899SJr.LIZ = C278817o.LIZ(504.0f);
            c71899SJr.LIZIZ = C278817o.LIZ(361.0f);
            c71899SJr.LIZLLL = Integer.valueOf(R.attr.ca);
            c71899SJr.LJ = Float.valueOf(1.0f);
            c71899SJr.LJFF = Float.valueOf(0.0f);
            c71899SJr.LJI = EnumC71803SFz.RADIAL;
            Context context = LJIILJJIL.getContext();
            o.LJIIIIZZ(context, "context");
            LJIILJJIL.setBackground(c71899SJr.LIZ(context));
            LJIIJ(C47261Igj.LJJIJ(LJIILJJIL()), this.LIZ);
            C29701Eo LJIILIIL = LJIILIIL();
            LJIILIIL.setLayoutParams(new RelativeLayout.LayoutParams(C278817o.LIZ(110.0f), C278817o.LIZ(110.0f)));
            LJIILIIL.setAnimation("editor_pro_guide_pinch_in_gif.json");
            LJIILIIL.setRepeatCount(5);
            LJIILIIL.setRepeatMode(2);
            LJIILIIL.setVisibility(0);
            LJIILIIL.addAnimatorListener(new ALAdapterS1S0100000_2(this, 24));
            LinearLayout LJIIL = LJIIL();
            C018905p c018905p2 = new C018905p(-2, -2);
            c018905p2.topToTop = this.LIZ.getId();
            c018905p2.startToStart = this.LIZ.getId();
            c018905p2.endToEnd = this.LIZ.getId();
            LJIIL.setLayoutParams(c018905p2);
            int[] iArr2 = new int[2];
            LJIILL().getLocationOnScreen(iArr2);
            C26338AVi.LJI(LJIIL, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(110.0f)))), Integer.valueOf(C278817o.LIZ(106.0f) + iArr2[1]), C65429Pm5.LIZIZ(110.0f), 0, false, 16);
            LJIIL.setOrientation(1);
            LJIIL.setGravity(1);
            LJIIL.setVisibility(0);
            LJIIJ(C47261Igj.LJJIJIIJI(LJIILIIL(), this.LJIILIIL), LJIIL());
            LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
            LJIILIIL().playAnimation();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJI.getValue();
            if (videoPublishEditModel != null) {
                FMX.LJIIL("pinch_out_gesture_guidance_show", C5QW.LJII(videoPublishEditModel).LIZ);
                return;
            }
            return;
        }
        LJIILLIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN, SYNTHETIC] */
    @Override // X.C5DC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C5DG r4) {
        /*
            r3 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int[] r1 = X.C5DI.LIZ
            int r0 = r4.ordinal()
            r0 = r1[r0]
            r2 = 0
            r1 = 1
            switch(r0) {
                case 1: goto L5b;
                case 2: goto L58;
                case 3: goto L55;
                case 4: goto L52;
                case 5: goto L4f;
                case 6: goto L4c;
                case 7: goto L3c;
                case 8: goto L2d;
                case 9: goto L18;
                default: goto L12;
            }
        L12:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L18:
            X.4yI r0 = com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider.Companion
            r0.getClass()
            com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider r0 = X.C126784yI.LIZ()
            X.585 r0 = r0.getMagicItemController$tools_camera_edit_release()
            if (r0 == 0) goto L2c
            boolean r0 = r0.LJLJLJ
            if (r0 != r1) goto L2c
            r2 = 1
        L2c:
            return r2
        L2d:
            X.Ol8 r0 = r3.LJ
            java.lang.Object r0 = r0.getValue()
            X.54h r0 = (X.C1289554h) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.LJFF
            if (r0 != r1) goto L5d
            goto L4a
        L3c:
            X.Ol8 r0 = r3.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.57f r0 = (X.C1297157f) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.LJLJLLL
            if (r0 != r1) goto L5d
        L4a:
            r2 = 1
            goto L5d
        L4c:
            boolean r2 = r3.LJJI
            goto L5d
        L4f:
            boolean r2 = r3.LJJIFFI
            goto L5d
        L52:
            boolean r2 = r3.LJIL
            goto L5d
        L55:
            boolean r2 = r3.LJJ
            goto L5d
        L58:
            boolean r2 = r3.LJIJJLI
            goto L5d
        L5b:
            boolean r2 = r3.LJIJJ
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132565Ie.LJI(X.5DG):boolean");
    }

    public static void LJIIJ(List list, ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            View view = (View) obj;
            if (view.getParent() == null && viewGroup.indexOfChild(view) == -1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            viewGroup.addView((View) it.next());
        }
    }

    @Override // X.C5DC
    public final void LIZJ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        Rect rect;
        boolean z2;
        int i;
        int i2;
        int LJJIIZ;
        if (z) {
            if (this.LJJII || !this.LIZJ.LJ) {
                return;
            }
            Iterator it = C47261Igj.LJJIJIIJI(C5DG.BOTTOM_BAR, C5DG.VIDEO_TRANSITION, C5DG.TRIM_VIDEO, C5DG.PINCH_TIMELINE, C5DG.MAGIC).iterator();
            while (it.hasNext()) {
                if (LJI((C5DG) it.next())) {
                    return;
                }
            }
            if (LJIIJJI("TRIM_GUIDE") || LJIIJJI("TRIM_TEXT_SLOT")) {
                return;
            }
            this.LJJIFFI = true;
            this.LJJII = true;
            TuxTextView tuxTextView = this.LJIILIIL;
            tuxTextView.setLayoutParams(new C018905p(C278817o.LIZ(160.0f), -2));
            tuxTextView.setGravity(1);
            tuxTextView.setTuxFont(62);
            tuxTextView.setLines(2);
            tuxTextView.setMaxLines(3);
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(34.0f))));
            tuxTextView.setText(R.string.fic);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setShadowLayer(4.0f, 0.0f, 0.0f, R.attr.ef);
            tuxTextView.setVisibility(0);
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(tuxTextView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tuxTextView.getHeight(), 0));
            if (interfaceC65784Pro == null || (rect = (Rect) interfaceC65784Pro.invoke()) == null) {
                rect = new Rect(0, 0, 0, 0);
            }
            int LIZ = C278817o.LIZ(110.0f);
            int LIZ2 = C278817o.LIZ(160.0f);
            int measuredHeight = this.LJIILIIL.getMeasuredHeight() + LIZ;
            if (rect.bottom + measuredHeight > C143205jg.LIZLLL()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C29701Eo LJIILIIL = LJIILIIL();
            LJIILIIL.setLayoutParams(new RelativeLayout.LayoutParams(LIZ, LIZ));
            LJIILIIL.setAnimation("editor_pro_guide_trim_video_gif.json");
            LJIILIIL.setRepeatCount(5);
            LJIILIIL.setRepeatMode(2);
            LJIILIIL.setVisibility(0);
            LJIILIIL.addAnimatorListener(new ALAdapterS1S0100000_2(this, 27));
            if (z2) {
                LJIILIIL.setRotation(180.0f);
            }
            LinearLayout LJIIL = LJIIL();
            C018905p c018905p = new C018905p(-2, -2);
            c018905p.topToTop = this.LIZ.getId();
            c018905p.startToStart = this.LIZ.getId();
            LJIIL.setLayoutParams(c018905p);
            Context context = LJIIL.getContext();
            if (context != null && C26338AVi.LIZJ(context)) {
                i = C143205jg.LJ() - rect.right;
            } else {
                i = rect.left;
            }
            int i3 = i - (LIZ2 / 2);
            if (z2) {
                C26338AVi.LJI(LJIIL, Integer.valueOf(i3), Integer.valueOf((LIZ / 4) + (rect.top - measuredHeight)), 0, 0, false, 16);
            } else {
                C26338AVi.LJI(LJIIL, Integer.valueOf(i3), Integer.valueOf(rect.bottom - (LIZ / 6)), 0, 0, false, 16);
            }
            LJIIL.setOrientation(1);
            LJIIL.setGravity(1);
            LJIIL.setVisibility(0);
            FrameLayout LJIILJJIL = LJIILJJIL();
            C018905p c018905p2 = new C018905p(C278817o.LIZ(504.0f), C278817o.LIZ(361.0f));
            c018905p2.topToTop = this.LIZ.getId();
            c018905p2.startToStart = this.LIZ.getId();
            c018905p2.endToEnd = this.LIZ.getId();
            ViewGroup.LayoutParams layoutParams = LJIIL().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.topMargin;
            } else {
                i2 = 0;
            }
            int LJJIIZ2 = i2 - ((O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(361.0f))) - measuredHeight) / 2);
            if (z2) {
                LJJIIZ = LJJIIZ2 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
            } else {
                LJJIIZ = LJJIIZ2 + O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
            }
            ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = LJJIIZ;
            LJIILJJIL.setLayoutParams(c018905p2);
            C71899SJr c71899SJr = new C71899SJr();
            c71899SJr.LIZ = C278817o.LIZ(504.0f);
            c71899SJr.LIZIZ = C278817o.LIZ(361.0f);
            c71899SJr.LIZLLL = Integer.valueOf(R.attr.ca);
            c71899SJr.LJ = Float.valueOf(1.0f);
            c71899SJr.LJFF = Float.valueOf(0.0f);
            c71899SJr.LJI = EnumC71803SFz.RADIAL;
            Context context2 = LJIILJJIL.getContext();
            o.LJIIIIZZ(context2, "context");
            LJIILJJIL.setBackground(c71899SJr.LIZ(context2));
            LJIIJ(C47261Igj.LJJIJ(LJIILJJIL()), this.LIZ);
            if (z2) {
                LJIIJ(C47261Igj.LJJIJIIJI(this.LJIILIIL, LJIILIIL()), LJIIL());
            } else {
                LJIIJ(C47261Igj.LJJIJIIJI(LJIILIIL(), this.LJIILIIL), LJIIL());
            }
            LJIIJ(C47261Igj.LJJIJ(LJIIL()), this.LIZ);
            LJIILIIL().playAnimation();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJI.getValue();
            if (videoPublishEditModel != null) {
                FMX.LJIIL("move_handles_gesture_guidance_show", C5QW.LJII(videoPublishEditModel).LIZ);
                return;
            }
            return;
        }
        LJIILLIIL();
    }

    public C132565Ie(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C132585Ig c132585Ig) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = viewGroup;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c132585Ig;
        this.LIZLLL = C221108m2.LIZIZ(C1292355j.LJLIL);
        this.LJ = C221108m2.LIZIZ(C1292255i.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C1292555l.LJLIL);
        this.LJI = C221108m2.LIZIZ(C1292455k.LJLIL);
        Context context = viewGroup.getContext();
        this.LJIIIIZZ = context;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 822));
        this.LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 825));
        o.LJIIIIZZ(context, "context");
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        this.LJIIJJI = new TuxTextView(context, attributeSet, i, i2);
        new TuxTextView(context, attributeSet, i, i2);
        this.LJIIL = new TuxTextView(context, attributeSet, i, i2);
        this.LJIILIIL = new TuxTextView(context, attributeSet, i, i2);
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 821));
        this.LJIILL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 823));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 824));
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 819));
        this.LJIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 826));
        this.LJIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 820));
    }

    @Override // X.C5DC
    public final void LJIIIIZZ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z) {
        Integer num;
        Rect rect;
        if (z) {
            if (!C132575If.LIZ() || !this.LIZJ.LIZJ || LJIIJJI("TEXT_GUIDE")) {
                return;
            }
            this.LJJ = true;
            TuxTextView tuxTextView = this.LJIIL;
            C018905p c018905p = new C018905p(-2, -2);
            c018905p.startToStart = this.LIZ.getId();
            c018905p.endToEnd = this.LIZ.getId();
            c018905p.topToTop = this.LIZ.getId();
            if (interfaceC65784Pro != null && (rect = (Rect) interfaceC65784Pro.invoke()) != null) {
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(12.0f))) + rect.bottom;
            }
            tuxTextView.setLayoutParams(c018905p);
            tuxTextView.setGravity(1);
            tuxTextView.setTuxFont(42);
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(18.0f))));
            if (interfaceC65784Pro2 != null && (num = (Integer) interfaceC65784Pro2.invoke()) != null) {
                tuxTextView.setMaxWidth(num.intValue() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            }
            tuxTextView.setMaxHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
            tuxTextView.setText(R.string.bgk);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setVisibility(0);
            LJIIJ(C47261Igj.LJJIJ(this.LJIIL), this.LIZ);
            ((Handler) this.LJIILLIIL.getValue()).postDelayed((Runnable) this.LJIIZILJ.getValue(), 3000L);
            return;
        }
        LJIILLIIL();
    }
}

package X;

import Y.ARunnableS31S0200000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS489S0100000_12;

/* renamed from: X.Slc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73044Slc extends FrameLayout implements IQB {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLIL;
    public ARunnableS48S0100000_12 LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC73050Sli LJLJJI;
    public IQ9 LJLJJL;
    public C73043Slb LJLJJLL;
    public int LJLJL;
    public Bitmap LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public EnumC63858P4k LJLL;
    public boolean LJLLI;
    public final C73043Slb LJLLILLLL;
    public int LJLLJ;
    public final java.util.Map<Integer, View> LJLLL;

    public final View LJ(int i) {
        java.util.Map<Integer, View> map = this.LJLLL;
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

    @Override // X.IPR
    public final void LJJJI() {
    }

    public final void LJI() {
        IPW ipw;
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            ipw = iq9.LJIILL;
        } else {
            ipw = null;
        }
        if (ipw != IPW.PLAYER_IDLE) {
            if (iq9 != null) {
                IPW ipw2 = IPW.PLAYER_PAUSE;
                o.LJIIIZ(ipw2, "<set-?>");
                iq9.LJIILL = ipw2;
            }
            C73046Sle c73046Sle = (C73046Sle) LJ(R.id.hso);
            if (c73046Sle.LJLJJL == EnumC63858P4k.FULL_SCREEN) {
                c73046Sle.LIZ(R.id.nk).setVisibility(0);
                c73046Sle.LIZJ();
            }
        } else {
            C73046Sle c73046Sle2 = (C73046Sle) LJ(R.id.hso);
            c73046Sle2.LIZ(R.id.nk).setVisibility(8);
            c73046Sle2.LIZJ();
        }
        ((SK0) LJ(R.id.hs3)).LIZ();
        ((SK0) LJ(R.id.hro)).LIZ();
        ((C73046Sle) LJ(R.id.hso)).LIZLLL();
        LJIIIZ(false);
        if (this.LJLL == EnumC63858P4k.PREVIEW) {
            ((ImageView) LJ(R.id.cover)).setVisibility(0);
            LJ(R.id.n8n).setVisibility(8);
            if (this.LJLLJ != 0) {
                ((ImageView) LJ(R.id.hro)).setVisibility(0);
            }
        }
        if (this.LJLLI) {
            ((ImageView) LJ(R.id.hro)).setVisibility(8);
        }
    }

    public final void LJII() {
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            IPW ipw = IPW.PLAYER_START;
            o.LJIIIZ(ipw, "<set-?>");
            iq9.LJIILL = ipw;
        }
        ((SK0) LJ(R.id.hs3)).LIZIZ();
        ((SK0) LJ(R.id.hro)).LIZIZ();
        C73046Sle c73046Sle = (C73046Sle) LJ(R.id.hso);
        if (c73046Sle.LJLJJL == EnumC63858P4k.FULL_SCREEN) {
            c73046Sle.LIZ(R.id.nk).setVisibility(0);
            c73046Sle.LIZJ();
        }
        ((C73046Sle) LJ(R.id.hso)).LIZIZ(3000L);
        ((C73046Sle) LJ(R.id.hso)).LJI();
        ((ImageView) LJ(R.id.cover)).setVisibility(8);
        LJ(R.id.n8n).setVisibility(0);
    }

    public final void LJIIJ() {
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            if (iq9.LJFF()) {
                LJII();
            } else {
                LJI();
            }
            if (iq9.isMute()) {
                ((SK0) LJ(R.id.k4s)).LIZIZ();
            } else {
                ((SK0) LJ(R.id.k4s)).LIZ();
            }
            float f = iq9.LJII / 100;
            if (!this.LJLIL) {
                int i = (int) (f * 10000);
                ((C81239VuV) LJ(R.id.k4q)).setProgress(i);
                ((ProgressBar) LJ(R.id.k4r)).setProgress(i);
            }
        }
        if (this.LJLL == EnumC63858P4k.FULL_SCREEN) {
            IQ9 iq92 = this.LJLJJL;
            IPW ipw = null;
            if (iq92 != null) {
                ipw = iq92.LJIILL;
            }
            if (ipw != IPW.PLAYER_START && this.LJLJI && iq92 != null && iq92.LIZ != null) {
                ((ImageView) LJ(R.id.cover)).setVisibility(0);
                LJ(R.id.n8n).setVisibility(8);
            }
        }
        this.LJLJI = false;
    }

    public final Handler getMainHandler() {
        return (Handler) this.LJLJLLL.getValue();
    }

    @Override // X.IPR
    public final void LIZ() {
        long j;
        LJII();
        ((ImageView) LJ(R.id.cover)).setVisibility(8);
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            IWF iwf = iq9.LJFF;
            if (iwf != null) {
                j = iwf.getDuration();
            } else {
                j = 0;
            }
            setVideoLength((int) (j / 1000));
        }
    }

    public final ImageView getCoverView() {
        ImageView cover = (ImageView) LJ(R.id.cover);
        o.LJIIIIZZ(cover, "cover");
        return cover;
    }

    public final TextureView getVideoView() {
        TextureView video_surface = (TextureView) LJ(R.id.n8n);
        o.LJIIIIZZ(video_surface, "video_surface");
        return video_surface;
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        LJI();
    }

    public final Bitmap getCoverImage() {
        return this.LJLJLJ;
    }

    public final boolean getForceHideCenterControl() {
        return this.LJLLI;
    }

    public final IQ9 getPlayer() {
        return this.LJLJJL;
    }

    public final InterfaceC73050Sli getPlayerLogListener() {
        return this.LJLJJI;
    }

    public final int getVideoIndex() {
        return this.LJLLJ;
    }

    public final int getVideoLength() {
        return this.LJLJL;
    }

    public final C73043Slb getVideoSize() {
        return this.LJLJJLL;
    }

    private final void setDisplayMode(EnumC63858P4k enumC63858P4k) {
        this.LJLL = enumC63858P4k;
        ((C73046Sle) LJ(R.id.hso)).setDisplayMode(enumC63858P4k);
    }

    @Override // X.IPR
    public final void LIZIZ(int i) {
        ((C81239VuV) LJ(R.id.k4q)).setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
        ((C1AH) ((C73046Sle) LJ(R.id.hso)).LIZ(R.id.n5m)).setVisibility(0);
    }

    @Override // X.IQB
    public final void LIZLLL(boolean z) {
        if (z) {
            ((SK0) LJ(R.id.k4s)).LIZIZ();
        } else {
            ((SK0) LJ(R.id.k4s)).LIZ();
        }
        if (this.LJLLI) {
            ((ImageView) LJ(R.id.hro)).setVisibility(8);
        }
    }

    public final void LJFF(boolean z) {
        getMainHandler().removeCallbacksAndMessages(null);
        this.LJLILLLLZI = null;
        C73046Sle c73046Sle = (C73046Sle) LJ(R.id.hso);
        c73046Sle.getClass();
        C243149gU.LIZ().removeCallbacksAndMessages(null);
        C243149gU.LIZIZ = null;
        c73046Sle.LJLILLLLZI = false;
        c73046Sle.LJLJI = false;
        c73046Sle.LJLJJI = false;
        if (z) {
            c73046Sle.LJLIL = null;
            IQ9 iq9 = this.LJLJJL;
            if (iq9 != null) {
                iq9.release();
            }
            IQ9 iq92 = this.LJLJJL;
            if (iq92 != null) {
                IPW ipw = IPW.PLAYER_IDLE;
                o.LJIIIZ(ipw, "<set-?>");
                iq92.LJIILL = ipw;
            }
        }
        this.LJLIL = false;
    }

    public final void LJIIIIZZ(float f) {
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            int i = (int) (this.LJLJL * f);
            if (iq9.LJIILL == IPW.PLAYER_IDLE) {
                iq9.start(i);
            } else {
                if (iq9.LJIILL == IPW.PLAYER_PAUSE) {
                    if (f > 0.0f) {
                        iq9.LJJIIJ(f * 100);
                    }
                    iq9.resume();
                    return;
                }
                iq9.LJJIIJ(f * 100);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r1 == X.IPW.PLAYER_IDLE) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r7) {
        /*
            r6 = this;
            r0 = 2131373093(0x7f0a2c25, float:1.8366267E38)
            android.view.View r5 = r6.LJ(r0)
            X.Sle r5 = (X.C73046Sle) r5
            r4 = 0
            r5.LJLJI = r4
            r0 = 2131373067(0x7f0a2c0b, float:1.8366215E38)
            android.view.View r1 = r5.LIZ(r0)
            X.1AH r1 = (X.C1AH) r1
            r0 = 8
            r1.setVisibility(r0)
            X.P4k r1 = r5.LJLJJL
            X.P4k r0 = X.EnumC63858P4k.FULL_SCREEN
            r3 = 0
            if (r1 == r0) goto L2b
            X.IQ9 r0 = r5.LJLJJLL
            if (r0 == 0) goto L52
            X.IPW r1 = r0.LJIILL
        L27:
            X.IPW r0 = X.IPW.PLAYER_IDLE
            if (r1 != r0) goto L40
        L2b:
            if (r7 == 0) goto L3d
            r0 = 2131373056(0x7f0a2c00, float:1.8366192E38)
            android.view.View r0 = r5.LIZ(r0)
            X.SK0 r0 = (X.SK0) r0
            r0.LIZIZ()
            X.IQ9 r2 = r5.LJLJJLL
            if (r2 != 0) goto L48
        L3d:
            r5.LJ(r4)
        L40:
            android.os.Handler r0 = r6.getMainHandler()
            r0.removeCallbacksAndMessages(r3)
            return
        L48:
            X.IPW r1 = X.IPW.PLAYER_START
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LJIILL = r1
            goto L3d
        L52:
            r1 = r3
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73044Slc.LJIIIZ(boolean):void");
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
        ((C1AH) ((C73046Sle) LJ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(0);
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
        if (z) {
            ((C73046Sle) LJ(R.id.hso)).LJFF();
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS48S0100000_12 aRunnableS48S0100000_12 = new ARunnableS48S0100000_12(this, 99);
            this.LJLILLLLZI = aRunnableS48S0100000_12;
            getMainHandler().postDelayed(aRunnableS48S0100000_12, 1000L);
            return;
        }
        LJIIIZ(true);
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        IQ9 iq9 = this.LJLJJL;
        if (iq9 != null) {
            IPW ipw = IPW.PLAYER_IDLE;
            o.LJIIIZ(ipw, "<set-?>");
            iq9.LJIILL = ipw;
        }
        IQ9 iq92 = this.LJLJJL;
        if (iq92 != null) {
            iq92.LJJIIJ(0.0f);
        }
        IQ9 iq93 = this.LJLJJL;
        if (iq93 != null) {
            iq93.pause();
        }
        ((TextView) LJ(R.id.hs6)).setText(C73074Sm6.LIZ(0));
        ((C81239VuV) LJ(R.id.k4q)).setProgress(0);
        ((ProgressBar) LJ(R.id.k4r)).setProgress(0);
        ((ImageView) LJ(R.id.cover)).setVisibility(0);
        LJ(R.id.n8n).setVisibility(8);
        ((C73046Sle) LJ(R.id.hso)).LJI();
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
        if (((C73046Sle) LJ(R.id.hso)).LJLILLLLZI) {
            return;
        }
        float f2 = f / 100;
        ((TextView) LJ(R.id.hs6)).setText(C73074Sm6.LIZIZ(f2, this.LJLJL));
        if (!this.LJLIL) {
            int i = (int) (f2 * 10000);
            ((C81239VuV) LJ(R.id.k4q)).setProgress(i);
            ((ProgressBar) LJ(R.id.k4r)).setProgress(i);
        }
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
        LJII();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.LJLJLJ = bitmap;
        if (bitmap != null) {
            ((ImageView) LJ(R.id.cover)).setImageBitmap(bitmap);
        }
    }

    public final void setForceHideCenterControl(boolean z) {
        int i;
        if (this.LJLLI != z) {
            ImageView imageView = (ImageView) LJ(R.id.hro);
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        this.LJLLI = z;
    }

    public final void setPlayer(IQ9 iq9) {
        this.LJLJJL = iq9;
        ((C73046Sle) LJ(R.id.hso)).setPlayer(iq9);
    }

    public final void setPlayerLogListener(InterfaceC73050Sli interfaceC73050Sli) {
        this.LJLJJI = interfaceC73050Sli;
    }

    public final void setVideoIndex(int i) {
        this.LJLLJ = i;
    }

    public final void setVideoLength(int i) {
        this.LJLJL = i;
        String LIZ = C73074Sm6.LIZ(i);
        ((TextView) LJ(R.id.n5j)).setText(LIZ);
        ((TextView) LJ(R.id.lii)).setText(LIZ);
    }

    public final void setVideoSize(C73043Slb c73043Slb) {
        this.LJLJJLL = c73043Slb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73044Slc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ka);
        EnumC63858P4k enumC63858P4k;
        this.LJLLL = C62850Ola.LJFF(context, "context");
        this.LJLJI = true;
        this.LJLJLLL = C221108m2.LIZIZ(C35883E6l.INSTANCE);
        EnumC63858P4k enumC63858P4k2 = EnumC63858P4k.PREVIEW;
        this.LJLL = enumC63858P4k2;
        this.LJLLILLLL = new C73043Slb(0, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a30, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_8}, R.attr.ka, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, 0,\n        )");
        int i = obtainStyledAttributes.getInt(0, 0);
        if (i == 0 || i != 1) {
            enumC63858P4k = enumC63858P4k2;
        } else {
            enumC63858P4k = EnumC63858P4k.FULL_SCREEN;
        }
        setDisplayMode(enumC63858P4k);
        obtainStyledAttributes.recycle();
        View exit = LJ(R.id.d12);
        o.LJIIIIZZ(exit, "exit");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 7), exit);
        View play_center = LJ(R.id.hro);
        o.LJIIIIZZ(play_center, "play_center");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 8), play_center);
        ((C73046Sle) LJ(R.id.hso)).setOnPlayerActionBarListener(new C73045Sld(this));
        if (this.LJLL == enumC63858P4k2) {
            LJ(R.id.nk).setVisibility(8);
        }
        if (this.LJLL == EnumC63858P4k.FULL_SCREEN) {
            LJ(R.id.k4r).setVisibility(8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLILLLL.LIZ = View.MeasureSpec.getSize(i);
        this.LJLLILLLL.LIZIZ = View.MeasureSpec.getSize(i2);
        C73043Slb c73043Slb = this.LJLJJLL;
        if (c73043Slb != null) {
            post(new ARunnableS31S0200000_12(c73043Slb, this, 15));
        }
    }
}

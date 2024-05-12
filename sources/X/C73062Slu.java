package X;

import Y.ARunnableS14S0101000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS489S0100000_12;

/* renamed from: X.Slu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73062Slu extends FrameLayout implements IPR {
    public static final /* synthetic */ int LJLLLL = 0;
    public C27606AsU LJLIL;
    public boolean LJLILLLLZI;
    public ARunnableS14S0101000_10 LJLJI;
    public boolean LJLJJI;
    public InterfaceC73050Sli LJLJJL;
    public InterfaceC73068Sm0 LJLJJLL;
    public ViewGroup LJLJL;
    public Window LJLJLJ;
    public C73043Slb LJLJLLL;
    public int LJLL;
    public Bitmap LJLLI;
    public C27609AsX LJLLILLLL;
    public final C62822Ol8 LJLLJ;
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

    @Override // X.IPR
    public final void LJJJJZI() {
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
    }

    private final Handler getMainHandler() {
        return (Handler) this.LJLLJ.getValue();
    }

    public final void LJII() {
        InterfaceC73068Sm0 interfaceC73068Sm0 = this.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            interfaceC73068Sm0.pause();
            LJIIJ();
        }
    }

    public final void LJIIIIZZ() {
        InterfaceC73068Sm0 interfaceC73068Sm0;
        if (!this.LJLJJI && IPZ.LIZ == IPX.PLAYER_PAUSE && (interfaceC73068Sm0 = this.LJLJJLL) != null) {
            this.LJLJJI = false;
            interfaceC73068Sm0.resume();
            LJIIJJI();
        }
    }

    public final void LJIIJ() {
        if (IPZ.LIZ != IPX.PLAYER_IDLE) {
            IPZ.LIZ(IPX.PLAYER_PAUSE);
            C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
            c73063Slv.LIZ(R.id.nk).setVisibility(0);
            c73063Slv.LIZJ();
        } else {
            C73063Slv c73063Slv2 = (C73063Slv) LJ(R.id.hso);
            c73063Slv2.LIZ(R.id.nk).setVisibility(8);
            c73063Slv2.LIZJ();
        }
        ((SK0) LJ(R.id.hs3)).LIZ();
        ((SK0) LJ(R.id.hro)).LIZ();
        ((C73063Slv) LJ(R.id.hso)).LJ();
        LJIILJJIL(false);
    }

    public final void LJIIJJI() {
        IPZ.LIZ(IPX.PLAYER_START);
        ((SK0) LJ(R.id.hs3)).LIZIZ();
        ((SK0) LJ(R.id.hro)).LIZIZ();
        C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
        c73063Slv.LIZ(R.id.nk).setVisibility(0);
        c73063Slv.LIZJ();
        ((C73063Slv) LJ(R.id.hso)).LIZIZ(3000L);
        ((C73063Slv) LJ(R.id.hso)).LJII();
    }

    public final void LJIIL() {
        InterfaceC73068Sm0 interfaceC73068Sm0 = this.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            this.LJLJJI = true;
            interfaceC73068Sm0.pause();
            LJIIJ();
        }
    }

    public final void LJIILLIIL() {
        int i = C73070Sm2.LIZ[IPZ.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((ImageView) LJ(R.id.d12)).setVisibility(0);
                ((ImageView) LJ(R.id.dp9)).setVisibility(8);
                ((ImageView) LJ(R.id.hs3)).setVisibility(8);
                LJ(R.id.hro).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aip);
                LJ(R.id.hro).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aip);
                ViewGroup.LayoutParams layoutParams = LJ(R.id.hs6).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) getResources().getDimension(R.dimen.aiu);
                ViewGroup.LayoutParams layoutParams2 = LJ(R.id.n5j).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) getResources().getDimension(R.dimen.aiu);
                LJ(R.id.hs4).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aio);
                LJ(R.id.hs4).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aio);
                ViewGroup.LayoutParams layoutParams3 = LJ(R.id.hs4).getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) getResources().getDimension(R.dimen.ain);
                LJ(R.id.k4q).setPadding((int) getResources().getDimension(R.dimen.aiv), 0, (int) getResources().getDimension(R.dimen.aiv), 0);
                ((AppCompatTextView) LJ(R.id.c0t)).setTextSize(0, getResources().getDimension(R.dimen.air));
                ((AppCompatTextView) LJ(R.id.lii)).setTextSize(0, getResources().getDimension(R.dimen.air));
                ((AppCompatTextView) LJ(R.id.c6p)).setTextSize(0, getResources().getDimension(R.dimen.aiq));
                ViewGroup.LayoutParams layoutParams4 = LJ(R.id.d12).getLayoutParams();
                o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.leftMargin = (int) getResources().getDimension(R.dimen.ais);
                marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.ait);
                return;
            }
            ((ImageView) LJ(R.id.d12)).setVisibility(0);
            ((ImageView) LJ(R.id.dp9)).setVisibility(8);
            ((ImageView) LJ(R.id.hs3)).setVisibility(8);
            LJ(R.id.hro).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aip);
            LJ(R.id.hro).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aip);
            ViewGroup.LayoutParams layoutParams5 = LJ(R.id.hs6).getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) getResources().getDimension(R.dimen.aiz);
            ViewGroup.LayoutParams layoutParams6 = LJ(R.id.n5j).getLayoutParams();
            o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) getResources().getDimension(R.dimen.aiz);
            LJ(R.id.hs4).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aio);
            LJ(R.id.hs4).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aio);
            ViewGroup.LayoutParams layoutParams7 = LJ(R.id.hs4).getLayoutParams();
            o.LJII(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) getResources().getDimension(R.dimen.ain);
            LJ(R.id.k4q).setPadding((int) getResources().getDimension(R.dimen.aj0), 0, (int) getResources().getDimension(R.dimen.aj0), 0);
            ((AppCompatTextView) LJ(R.id.c0t)).setTextSize(0, getResources().getDimension(R.dimen.air));
            ((AppCompatTextView) LJ(R.id.lii)).setTextSize(0, getResources().getDimension(R.dimen.air));
            ((AppCompatTextView) LJ(R.id.c6p)).setTextSize(0, getResources().getDimension(R.dimen.aiq));
            ViewGroup.LayoutParams layoutParams8 = LJ(R.id.d12).getLayoutParams();
            o.LJII(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams8;
            marginLayoutParams2.leftMargin = (int) getResources().getDimension(R.dimen.aix);
            marginLayoutParams2.topMargin = (int) getResources().getDimension(R.dimen.aiy);
            return;
        }
        ((ImageView) LJ(R.id.d12)).setVisibility(8);
        ((ImageView) LJ(R.id.dp9)).setVisibility(0);
        ((ImageView) LJ(R.id.hs3)).setVisibility(0);
        LJ(R.id.hro).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aj2);
        LJ(R.id.hro).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aj2);
        LJ(R.id.hs4).getLayoutParams().width = (int) getResources().getDimension(R.dimen.aj5);
        LJ(R.id.hs4).getLayoutParams().height = (int) getResources().getDimension(R.dimen.aj5);
        ViewGroup.LayoutParams layoutParams9 = LJ(R.id.hs4).getLayoutParams();
        o.LJII(layoutParams9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) getResources().getDimension(R.dimen.aj4);
        ViewGroup.LayoutParams layoutParams10 = LJ(R.id.hs6).getLayoutParams();
        o.LJII(layoutParams10, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams10).leftMargin = (int) getResources().getDimension(R.dimen.aj1);
        ViewGroup.LayoutParams layoutParams11 = LJ(R.id.n5j).getLayoutParams();
        o.LJII(layoutParams11, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams11).rightMargin = (int) getResources().getDimension(R.dimen.aj1);
        LJ(R.id.k4q).setPadding((int) getResources().getDimension(R.dimen.aj7), 0, (int) getResources().getDimension(R.dimen.aj7), 0);
        ((AppCompatTextView) LJ(R.id.c0t)).setTextSize(0, getResources().getDimension(R.dimen.aj6));
        ((AppCompatTextView) LJ(R.id.lii)).setTextSize(0, getResources().getDimension(R.dimen.aj6));
        ((AppCompatTextView) LJ(R.id.c6p)).setTextSize(0, getResources().getDimension(R.dimen.aj3));
    }

    @Override // X.IPR
    public final void LIZ() {
        ((ImageView) LJ(R.id.cover)).setVisibility(8);
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

    public final Bitmap getCoverImage$player_release() {
        return this.LJLLI;
    }

    public final ViewGroup getFullScreenContainerView$player_release() {
        return this.LJLJL;
    }

    public final C27609AsX getMiddleAction$player_release() {
        return this.LJLLILLLL;
    }

    public final C27606AsU getParams() {
        return this.LJLIL;
    }

    public final InterfaceC73068Sm0 getPlayer$player_release() {
        return this.LJLJJLL;
    }

    public final InterfaceC73050Sli getPlayerLogListener$player_release() {
        return this.LJLJJL;
    }

    public final int getVideoLength$player_release() {
        return this.LJLL;
    }

    public final C73043Slb getVideoSize$player_release() {
        return this.LJLJLLL;
    }

    public final Window getWindow$player_release() {
        return this.LJLJLJ;
    }

    public static void LJI(C73062Slu this$0) {
        int i;
        o.LJIIIZ(this$0, "this$0");
        C73063Slv c73063Slv = (C73063Slv) this$0.LJ(R.id.hso);
        c73063Slv.LJLJI = true;
        if (!c73063Slv.LJLILLLLZI) {
            c73063Slv.LJFF(2);
        }
        ((ImageView) c73063Slv.LIZ(R.id.hro)).setVisibility(8);
        InterfaceC73068Sm0 interfaceC73068Sm0 = this$0.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            i = interfaceC73068Sm0.getNetworkSpeed();
        } else {
            i = 0;
        }
        ((C73063Slv) this$0.LJ(R.id.hso)).setNetSpeed(i);
        ARunnableS14S0101000_10 aRunnableS14S0101000_10 = this$0.LJLJI;
        if (aRunnableS14S0101000_10 != null) {
            this$0.getMainHandler().postDelayed(aRunnableS14S0101000_10, 1000L);
        }
    }

    @Override // X.IPR
    public final void LIZIZ(int i) {
        ((C81239VuV) LJ(R.id.k4q)).setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
        ((C1AH) ((C73063Slv) LJ(R.id.hso)).LIZ(R.id.n5m)).setVisibility(0);
    }

    public final void LJFF(boolean z) {
        getMainHandler().removeCallbacksAndMessages(null);
        this.LJLJI = null;
        C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
        c73063Slv.getClass();
        C243149gU.LIZ().removeCallbacksAndMessages(null);
        C243149gU.LIZIZ = null;
        c73063Slv.LJLILLLLZI = false;
        c73063Slv.LJLJI = false;
        c73063Slv.LJLJJI = false;
        if (z) {
            c73063Slv.LJLIL = null;
            InterfaceC73068Sm0 interfaceC73068Sm0 = this.LJLJJLL;
            if (interfaceC73068Sm0 != null) {
                interfaceC73068Sm0.release();
            }
        }
        this.LJLILLLLZI = false;
        this.LJLJJI = true;
        IPZ.LIZ(IPX.PLAYER_IDLE);
        EnumC73069Sm1 enumC73069Sm1 = EnumC73069Sm1.PREVIEW;
        o.LJIIIZ(enumC73069Sm1, "<set-?>");
        IPZ.LIZIZ = enumC73069Sm1;
    }

    public final void LJIIIZ(EnumC73069Sm1 currentOrientation) {
        o.LJIIIZ(currentOrientation, "currentOrientation");
        IPZ.LIZIZ = currentOrientation;
        if (currentOrientation != EnumC73069Sm1.PREVIEW) {
            if (this.LJLJJLL != null && IPZ.LIZ == IPX.PLAYER_START) {
                C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
                c73063Slv.LJLJJI = false;
                c73063Slv.LIZ(R.id.bs8).setAlpha(0.0f);
                c73063Slv.LIZJ();
            }
        } else if (this.LJLJJLL != null) {
            if (IPZ.LIZ == IPX.PLAYER_START) {
                ((C73063Slv) LJ(R.id.hso)).LJI();
            } else {
                ((C73063Slv) LJ(R.id.hso)).LJ();
            }
        }
        ((C73063Slv) LJ(R.id.hso)).LJII();
        LJIILLIIL();
    }

    public final void LJIILIIL(float f) {
        InterfaceC73068Sm0 interfaceC73068Sm0 = this.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            this.LJLJJI = false;
            int i = (int) (this.LJLL * f);
            if (IPZ.LIZ == IPX.PLAYER_IDLE) {
                interfaceC73068Sm0.start(i);
            } else if (IPZ.LIZ == IPX.PLAYER_PAUSE) {
                if (f > 0.0f) {
                    interfaceC73068Sm0.LJJIIJ(f * 100);
                }
                interfaceC73068Sm0.resume();
            } else {
                interfaceC73068Sm0.LJJIIJ(f * 100);
            }
            LJIIJJI();
        }
    }

    public final void LJIILJJIL(boolean z) {
        C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
        c73063Slv.LJLJI = false;
        ((C1AH) c73063Slv.LIZ(R.id.hrz)).setVisibility(8);
        if (IPZ.LIZIZ != EnumC73069Sm1.PREVIEW || IPZ.LIZ == IPX.PLAYER_IDLE) {
            if (z && c73063Slv.LJLJJLL) {
                ((SK0) c73063Slv.LIZ(R.id.hro)).LIZIZ();
                IPZ.LIZ(IPX.PLAYER_START);
            }
            c73063Slv.LJFF(0);
        }
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
        ((C1AH) ((C73063Slv) LJ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(0);
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
        if (z) {
            C27606AsU c27606AsU = this.LJLIL;
            if (c27606AsU != null && !c27606AsU.LJIIIIZZ) {
                ((C73063Slv) LJ(R.id.hso)).LJI();
            }
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS14S0101000_10 aRunnableS14S0101000_10 = new ARunnableS14S0101000_10(1, this, 8);
            this.LJLJI = aRunnableS14S0101000_10;
            getMainHandler().postDelayed(aRunnableS14S0101000_10, 1000L);
            return;
        }
        LJIILJJIL(true);
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        IPZ.LIZ(IPX.PLAYER_IDLE);
        InterfaceC73068Sm0 interfaceC73068Sm0 = this.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            interfaceC73068Sm0.LJJIIJ(0.0f);
        }
        LJIIL();
        ((TextView) LJ(R.id.hs6)).setText(C73074Sm6.LIZ(0));
        ((C81239VuV) LJ(R.id.k4q)).setProgress(0);
        ((ImageView) LJ(R.id.cover)).setVisibility(0);
        ((C73063Slv) LJ(R.id.hso)).LJII();
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
        if (((C73063Slv) LJ(R.id.hso)).LJLILLLLZI) {
            return;
        }
        float f2 = f / 100;
        ((TextView) LJ(R.id.hs6)).setText(C73074Sm6.LIZIZ(f2, this.LJLL));
        if (!this.LJLILLLLZI) {
            ((C81239VuV) LJ(R.id.k4q)).setProgress((int) (f2 * 10000));
        }
    }

    public final void setCoverImage$player_release(Bitmap bitmap) {
        this.LJLLI = bitmap;
        ((C48843JEx) LJ(R.id.n9f)).setCoverImage(bitmap);
    }

    public final void setFullScreenContainerView$player_release(ViewGroup viewGroup) {
        this.LJLJL = viewGroup;
    }

    public final void setMiddleAction$player_release(C27609AsX c27609AsX) {
        this.LJLLILLLL = c27609AsX;
        ((C73063Slv) LJ(R.id.hso)).setMiddleAction(this.LJLLILLLL);
    }

    public final void setParams(C27606AsU c27606AsU) {
        int i;
        InterfaceC73068Sm0 interfaceC73068Sm0;
        ViewGroup viewGroup;
        Window window;
        C73043Slb c73043Slb;
        Bitmap bitmap;
        InterfaceC73050Sli interfaceC73050Sli;
        Integer num;
        this.LJLIL = c27606AsU;
        boolean z = false;
        if (c27606AsU != null && (num = c27606AsU.LJ) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        setVideoLength$player_release(i);
        C27606AsU c27606AsU2 = this.LJLIL;
        C27609AsX c27609AsX = null;
        if (c27606AsU2 != null) {
            interfaceC73068Sm0 = c27606AsU2.LIZ;
        } else {
            interfaceC73068Sm0 = null;
        }
        this.LJLJJLL = interfaceC73068Sm0;
        if (c27606AsU2 != null) {
            viewGroup = c27606AsU2.LIZIZ;
        } else {
            viewGroup = null;
        }
        this.LJLJL = viewGroup;
        if (c27606AsU2 != null) {
            window = c27606AsU2.LIZJ;
        } else {
            window = null;
        }
        this.LJLJLJ = window;
        if (c27606AsU2 != null) {
            c73043Slb = c27606AsU2.LIZLLL;
        } else {
            c73043Slb = null;
        }
        this.LJLJLLL = c73043Slb;
        if (c27606AsU2 != null) {
            bitmap = c27606AsU2.LJFF;
        } else {
            bitmap = null;
        }
        setCoverImage$player_release(bitmap);
        C27606AsU c27606AsU3 = this.LJLIL;
        if (c27606AsU3 != null) {
            interfaceC73050Sli = c27606AsU3.LJI;
        } else {
            interfaceC73050Sli = null;
        }
        this.LJLJJL = interfaceC73050Sli;
        if (c27606AsU3 != null) {
            c27609AsX = c27606AsU3.LJII;
        }
        setMiddleAction$player_release(c27609AsX);
        C73063Slv c73063Slv = (C73063Slv) LJ(R.id.hso);
        C27606AsU c27606AsU4 = this.LJLIL;
        if (c27606AsU4 != null) {
            z = c27606AsU4.LJIIIIZZ;
        }
        c73063Slv.setInFeedScene(z);
    }

    public final void setPlayer$player_release(InterfaceC73068Sm0 interfaceC73068Sm0) {
        this.LJLJJLL = interfaceC73068Sm0;
    }

    public final void setPlayerLogListener$player_release(InterfaceC73050Sli interfaceC73050Sli) {
        this.LJLJJL = interfaceC73050Sli;
    }

    public final void setVideoLength$player_release(int i) {
        this.LJLL = i;
        String LIZ = C73074Sm6.LIZ(i);
        ((TextView) LJ(R.id.n5j)).setText(LIZ);
        ((TextView) LJ(R.id.lii)).setText(LIZ);
    }

    public final void setVideoSize$player_release(C73043Slb c73043Slb) {
        this.LJLJLLL = c73043Slb;
    }

    public final void setWindow$player_release(Window window) {
        this.LJLJLJ = window;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73062Slu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ka);
        this.LJLLL = C62850Ola.LJFF(context, "context");
        this.LJLJJI = true;
        this.LJLLJ = C221108m2.LIZIZ(C35882E6k.INSTANCE);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dt3, this, true);
        LJIILLIIL();
        View exit = LJ(R.id.d12);
        o.LJIIIIZZ(exit, "exit");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 12), exit);
        View play_center = LJ(R.id.hro);
        o.LJIIIIZZ(play_center, "play_center");
        C16880lQ.LJIIJ(new IDaS489S0100000_12(this, 13), play_center);
        ((C73063Slv) LJ(R.id.hso)).setOnPlayerActionBarListener(new C73064Slw(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C73043Slb c73043Slb = new C73043Slb(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        C73043Slb c73043Slb2 = this.LJLJLLL;
        if (c73043Slb2 != null) {
            post(new RunnableC67238QaA(1, this, c73043Slb2, c73043Slb));
        }
    }
}

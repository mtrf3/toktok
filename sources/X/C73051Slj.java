package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Slj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73051Slj extends FrameLayout implements KRL {
    public static final /* synthetic */ int LJLLL = 0;
    public InterfaceC65784Pro<Float> LJLIL;
    public float LJLILLLLZI;
    public C72989Skj LJLJI;
    public ARunnableS48S0100000_12 LJLJJI;
    public boolean LJLJJL;
    public InterfaceC73054Slm LJLJJLL;
    public Window LJLJL;
    public Size LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public String LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
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

    @Override // X.KRL
    public final void LJIIIIZZ(float f, int i) {
    }

    @Override // X.KRL
    public final void onPausePlay(String str) {
    }

    @Override // X.KRL
    public final void onPreparePlay(String str) {
    }

    @Override // X.KRL
    public final void onResumePlay(String str) {
    }

    public final void LIZLLL() {
        InterfaceC73054Slm interfaceC73054Slm = this.LJLJJLL;
        if (interfaceC73054Slm != null) {
            interfaceC73054Slm.pause();
            LJFF();
        }
    }

    public final void LJ() {
        InterfaceC73054Slm interfaceC73054Slm;
        if (!this.LJLJJL && C73059Slr.LIZ == IPY.PLAYER_PAUSE && (interfaceC73054Slm = this.LJLJJLL) != null) {
            this.LJLJJL = false;
            interfaceC73054Slm.resume();
            LJI();
        }
    }

    public final void LJFF() {
        if (C73059Slr.LIZ != IPY.PLAYER_IDLE) {
            IPY ipy = IPY.PLAYER_PAUSE;
            o.LJIIIZ(ipy, "<set-?>");
            C73059Slr.LIZ = ipy;
        }
        C116454hd c116454hd = (C116454hd) LIZ(R.id.hro);
        c116454hd.setImageDrawable(c116454hd.LJLIL);
        C72989Skj c72989Skj = this.LJLJI;
        if (c72989Skj != null && c72989Skj.LJFF) {
            LIZ(R.id.hro).setAlpha(1.0f);
        }
        ((SK0) LIZ(R.id.hs3)).LIZ();
        ((C73053Sll) LIZ(R.id.hso)).LJ();
        LJIIIZ(false);
    }

    public final Handler getMainHandler() {
        return (Handler) this.LJLLI.getValue();
    }

    public final void LIZIZ() {
        getMainHandler().removeCallbacksAndMessages(null);
        this.LJLJJI = null;
        C73053Sll c73053Sll = (C73053Sll) LIZ(R.id.hso);
        c73053Sll.getClass();
        C73057Slp.LIZ().removeCallbacksAndMessages(null);
        C73057Slp.LIZIZ = null;
        c73053Sll.LJLILLLLZI = false;
        c73053Sll.LJLJI = false;
        c73053Sll.LJLJJI = false;
        c73053Sll.LJLIL = null;
        InterfaceC73054Slm interfaceC73054Slm = this.LJLJJLL;
        if (interfaceC73054Slm != null) {
            interfaceC73054Slm.release();
        }
        this.LJLJJL = true;
        IPY ipy = IPY.PLAYER_IDLE;
        o.LJIIIZ(ipy, "<set-?>");
        C73059Slr.LIZ = ipy;
    }

    public final void LJI() {
        ((ImageView) LIZ(R.id.faa)).setVisibility(4);
        boolean z = false;
        LIZ(R.id.n9f).setVisibility(0);
        LIZ(R.id.hso).setVisibility(0);
        IPY ipy = IPY.PLAYER_START;
        o.LJIIIZ(ipy, "<set-?>");
        C73059Slr.LIZ = ipy;
        C72989Skj c72989Skj = this.LJLJI;
        if (c72989Skj != null && c72989Skj.LJFF) {
            z = true;
        }
        if (z) {
            LIZ(R.id.hro).setAlpha(0.0f);
        }
        C116454hd c116454hd = (C116454hd) LIZ(R.id.hro);
        c116454hd.setImageDrawable(c116454hd.LJLILLLLZI);
        ((SK0) LIZ(R.id.hs3)).LIZIZ();
        ((C73053Sll) LIZ(R.id.hso)).LIZIZ(3000L);
        LIZ(R.id.hso).getClass();
    }

    public final TextureView getVideoView() {
        TextureView video_surface = (TextureView) LIZ(R.id.n8n);
        o.LJIIIIZZ(video_surface, "video_surface");
        return video_surface;
    }

    public final InterfaceC65784Pro<Float> getCurrentPercentage() {
        return this.LJLIL;
    }

    public final float getCurrentProgress() {
        return this.LJLILLLLZI;
    }

    public final C72989Skj getParams() {
        return this.LJLJI;
    }

    public final InterfaceC73054Slm getPlayer$live_release() {
        return this.LJLJJLL;
    }

    public final long getVideoLength$live_release() {
        return this.LJLJLLL;
    }

    public final Size getVideoSize$live_release() {
        return this.LJLJLJ;
    }

    public final Window getWindow$live_release() {
        return this.LJLJL;
    }

    @Override // X.KRL
    public final void LIZJ(String str) {
        ((C1AH) ((C73053Sll) LIZ(R.id.hso)).LIZ(R.id.n5m)).setVisibility(0);
    }

    public final void LJIIIZ(boolean z) {
        C73053Sll c73053Sll = (C73053Sll) LIZ(R.id.hso);
        c73053Sll.LJLJI = false;
        ((C1AH) c73053Sll.LIZ(R.id.hrz)).setVisibility(8);
        if (z) {
            C116454hd c116454hd = (C116454hd) c73053Sll.LIZ(R.id.hro);
            c116454hd.setImageDrawable(c116454hd.LJLILLLLZI);
            IPY ipy = IPY.PLAYER_START;
            o.LJIIIZ(ipy, "<set-?>");
            C73059Slr.LIZ = ipy;
        }
        c73053Sll.LJFF(0);
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // X.KRL
    public final void LJIILL(String str) {
        ((C1AH) ((C73053Sll) LIZ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(0);
    }

    @Override // X.KRL
    public final void onBuffering(boolean z) {
        if (z) {
            ((C73053Sll) LIZ(R.id.hso)).LJ();
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS48S0100000_12 aRunnableS48S0100000_12 = new ARunnableS48S0100000_12(this, 92);
            this.LJLJJI = aRunnableS48S0100000_12;
            getMainHandler().postDelayed(aRunnableS48S0100000_12, 1000L);
            return;
        }
        LJIIIZ(true);
    }

    @Override // X.KRL
    public final void onPlayCompleted(String str) {
        ((ImageView) LIZ(R.id.cover)).setVisibility(0);
        ((C81239VuV) LIZ(R.id.k4q)).setProgress(0);
        LIZ(R.id.hso).getClass();
    }

    @Override // X.KRL
    public final void onPlayProgressChange(float f) {
        if (((C73053Sll) LIZ(R.id.hso)).LJLILLLLZI) {
            return;
        }
        float f2 = f / 100;
        ((TextView) LIZ(R.id.hs6)).setText(C73074Sm6.LIZIZ(f2, (int) (this.LJLJLLL / 1000)));
        if (!this.LJLL) {
            ((C81239VuV) LIZ(R.id.k4q)).setProgress((int) (f2 * 10000));
        }
    }

    public final void setCurrentPercentage(InterfaceC65784Pro<Float> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLIL = interfaceC65784Pro;
    }

    public final void setCurrentProgress(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setParams(C72989Skj c72989Skj) {
        long j;
        InterfaceC73054Slm interfaceC73054Slm;
        Window window;
        boolean z;
        Long l;
        this.LJLJI = c72989Skj;
        if (c72989Skj != null && (l = c72989Skj.LIZJ) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        setVideoLength$live_release(j);
        C72989Skj c72989Skj2 = this.LJLJI;
        if (c72989Skj2 != null) {
            interfaceC73054Slm = c72989Skj2.LIZ;
        } else {
            interfaceC73054Slm = null;
        }
        this.LJLJJLL = interfaceC73054Slm;
        if (c72989Skj2 != null) {
            window = c72989Skj2.LIZIZ;
        } else {
            window = null;
        }
        this.LJLJL = window;
        this.LJLJLJ = null;
        C73053Sll c73053Sll = (C73053Sll) LIZ(R.id.hso);
        boolean z2 = true;
        if (c73053Sll != null) {
            c73053Sll.setNeedAnimation(true);
        }
        C73053Sll c73053Sll2 = (C73053Sll) LIZ(R.id.hso);
        if (c73053Sll2 != null) {
            C72989Skj c72989Skj3 = this.LJLJI;
            if (c72989Skj3 != null) {
                z = c72989Skj3.LIZLLL;
            } else {
                z = true;
            }
            c73053Sll2.setNeedHide(z);
        }
        C72989Skj c72989Skj4 = this.LJLJI;
        if (c72989Skj4 == null || !c72989Skj4.LJ) {
            z2 = false;
        }
        if (z2) {
            C73053Sll c73053Sll3 = (C73053Sll) LIZ(R.id.hso);
            if (c73053Sll3 != null) {
                c73053Sll3.LIZ(R.id.nk).setVisibility(0);
                c73053Sll3.LIZLLL();
                return;
            }
            return;
        }
        C73053Sll c73053Sll4 = (C73053Sll) LIZ(R.id.hso);
        if (c73053Sll4 == null) {
            return;
        }
        c73053Sll4.LIZ(R.id.nk).setVisibility(8);
        c73053Sll4.LIZLLL();
    }

    public final void setPlayer$live_release(InterfaceC73054Slm interfaceC73054Slm) {
        this.LJLJJLL = interfaceC73054Slm;
    }

    public final void setSliding$live_release(boolean z) {
        this.LJLL = z;
    }

    public final void setVideoLength$live_release(long j) {
        this.LJLJLLL = j;
        String LIZ = C73074Sm6.LIZ((int) (j / 1000));
        ((TextView) LIZ(R.id.n5j)).setText(LIZ);
        ((C73053Sll) LIZ(R.id.hso)).setTotalDuration(LIZ);
    }

    public final void setVideoSize$live_release(Size size) {
        this.LJLJLJ = size;
    }

    public final void setWindow$live_release(Window window) {
        this.LJLJL = window;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73051Slj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        this.LJLIL = new AqS162S0100000_12(this, 1125);
        this.LJLJJL = true;
        this.LJLLI = C221108m2.LIZIZ(C35889E6r.INSTANCE);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bqh, this, true);
        View play_center = LIZ(R.id.hro);
        o.LJIIIIZZ(play_center, "play_center");
        C29306Beo.LJJJLL(play_center, 500L, new AqS178S0100000_12(this, 497));
        ((C73053Sll) LIZ(R.id.hso)).setOnPlayerActionBarListener(new C73052Slk(this));
        this.LJLLILLLL = "";
    }

    public final void LJII(float f, boolean z) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        InterfaceC73054Slm interfaceC73054Slm = this.LJLJJLL;
        if (interfaceC73054Slm != null) {
            this.LJLJJL = false;
            float f2 = ((float) this.LJLJLLL) * f;
            if (C73059Slr.LIZ == IPY.PLAYER_IDLE || z) {
                interfaceC73054Slm.start((int) f2);
            } else if (C73059Slr.LIZ == IPY.PLAYER_PAUSE) {
                if (f >= 0.0f) {
                    interfaceC73054Slm.LJJIIJ(f * 100);
                }
                interfaceC73054Slm.resume();
            } else {
                interfaceC73054Slm.LJJIIJ(f * 100);
            }
            LJI();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            Size size3 = this.LJLJLJ;
            if (size3 != null) {
                post(new RunnableC73041SlZ(this, size3, size, size2));
            }
        }
    }

    @Override // X.KRL
    public final void LJLIIL(int i, int i2, long j) {
        ((ImageView) LIZ(R.id.cover)).setVisibility(8);
        ((C1AH) ((C73053Sll) LIZ(R.id.hso)).LIZ(R.id.n5m)).setVisibility(8);
    }

    @Override // X.KRL
    public final void onBufferedPercent(String str, long j, int i) {
        ((C81239VuV) LIZ(R.id.k4q)).setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }
}

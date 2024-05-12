package X;

import Y.ARunnableS51S0100000_15;
import Y.IDAListenerS82S0100000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayExpSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Y4j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86789Y4j extends FrameLayout {
    public final ILiveGiftDelegatePlayerService LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final long LJLJJI;
    public final FrameLayout LJLJJL;
    public final View LJLJJLL;
    public int LJLJL;
    public InterfaceC78213Umn LJLJLJ;
    public InterfaceC86792Y4m LJLJLLL;
    public final ARunnableS51S0100000_15 LJLL;

    public final void LIZIZ() {
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getCorner()) {
            View view = this.LJLJJLL;
            if (view != null && C29306Beo.LJJIIJ(view)) {
                View view2 = this.LJLJJLL;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat.setDuration(this.LJLJJI);
                    ofFloat.addListener(new IDAListenerS82S0100000_15(view2, 6));
                    ofFloat.start();
                }
            } else {
                View view3 = this.LJLJJLL;
                if (view3 != null) {
                    C29306Beo.LJI(view3);
                }
            }
        }
        InterfaceC86792Y4m interfaceC86792Y4m = this.LJLJLLL;
        if (interfaceC86792Y4m != null) {
            interfaceC86792Y4m.onSuccess();
        }
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.LJLL);
        }
    }

    public final InterfaceC86792Y4m getCb() {
        return this.LJLJLLL;
    }

    public final InterfaceC78213Umn getRenderView() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86789Y4j(Context context) {
        super(context, null, 0);
        Object obj;
        int i;
        int i2;
        new LinkedHashMap();
        ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = (ILiveGiftDelegatePlayerService) CN1.LIZ(ILiveGiftDelegatePlayerService.class);
        this.LJLIL = iLiveGiftDelegatePlayerService;
        this.LJLJJI = 250L;
        InterfaceC15840jk c86790Y4k = new C86790Y4k(this);
        View.inflate(context, R.layout.dk_, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bs8);
        this.LJLJJL = frameLayout;
        View findViewById = findViewById(R.id.i43);
        this.LJLJJLL = findViewById;
        this.LJLJLJ = (InterfaceC78213Umn) findViewById(R.id.ivo);
        if (iLiveGiftDelegatePlayerService != null) {
            obj = iLiveGiftDelegatePlayerService.buildDelegateGiftPlayListener(c86790Y4k);
        } else {
            obj = null;
        }
        this.LJLJI = obj;
        Object createLiveGiftPlayController = iLiveGiftDelegatePlayerService != null ? iLiveGiftDelegatePlayerService.createLiveGiftPlayController(context, C32257ClJ.LIZ(context), obj, frameLayout) : null;
        this.LJLILLLLZI = createLiveGiftPlayController;
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getFull()) {
            if (frameLayout != null) {
                C26338AVi.LJIIIZ(frameLayout, 0, 0, 0, 0, 16);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            if (findViewById != null) {
                C29306Beo.LJI(findViewById);
            }
        } else {
            int i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
            int i4 = Resources.getSystem().getDisplayMetrics().widthPixels;
            if (i3 != 0 && i4 != 0) {
                if (i3 > i4) {
                    i = (int) (i4 * 0.31d);
                    i2 = (int) ((i3 / i4) * i);
                } else {
                    i = (int) (i3 * 0.31d);
                    i2 = (int) ((i4 / i3) * i);
                }
                int i5 = (int) (i / 5.3f);
                if (findViewById != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i5);
                    layoutParams.gravity = 80;
                    findViewById.setLayoutParams(layoutParams);
                    findViewById.setScaleX(5.3f);
                }
                if (frameLayout != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
                    layoutParams2.gravity = 8388693;
                    frameLayout.setLayoutParams(layoutParams2);
                }
                int LJIIJJI = C87277YNd.LJIIJJI(12);
                if (frameLayout != null) {
                    C26338AVi.LJIIIZ(frameLayout, 0, 0, Integer.valueOf(LJIIJJI), Integer.valueOf(LJIIJJI), 16);
                }
            }
            if (iLiveGiftDelegatePlayerService != null) {
                iLiveGiftDelegatePlayerService.setMute(createLiveGiftPlayController, true);
                iLiveGiftDelegatePlayerService.setTransparentType(createLiveGiftPlayController, 4);
            }
        }
        this.LJLL = new ARunnableS51S0100000_15(this, 113);
    }

    public final void LIZ(int i) {
        View view = this.LJLJJLL;
        if (view != null) {
            C29306Beo.LJI(view);
        }
        InterfaceC86792Y4m interfaceC86792Y4m = this.LJLJLLL;
        if (interfaceC86792Y4m != null) {
            interfaceC86792Y4m.onFail(i);
        }
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.LJLL);
        }
    }

    public final void setCb(InterfaceC86792Y4m interfaceC86792Y4m) {
        this.LJLJLLL = interfaceC86792Y4m;
    }

    public final void setRenderView(InterfaceC78213Umn interfaceC78213Umn) {
        this.LJLJLJ = interfaceC78213Umn;
    }
}

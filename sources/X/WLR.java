package X;

import Y.AObjectS89S0100000_14;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bef.effectsdk.view.BEFView$Builder;
import com.bef.effectsdk.view.BEFView$FitMode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class WLR extends AbstractC29891Fh<WLS> implements WLS, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public C1FM LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public final C5H3 LJLJJLL;

    static {
        TBT tbt = new TBT(WLR.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WLR.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    public WLS LJJLIIIJILLIZJL() {
        return this;
    }

    private final FrameLayout LJJLIIIJJI() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-stickerSupport>(...)");
        return (FrameLayout) value;
    }

    private final void LJJLIIJ() {
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.onPause();
            C16880lQ.LJLLLL(c1fm, LJJLIIIJJI());
            c1fm.onDestroy();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.WLS
    public I0N O8() {
        return (I0N) this.LJLJJI.LIZ(this, LJLJL[1]);
    }

    @Override // X.WLS
    public InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.LJLJI.LIZ(this, LJLJL[0]);
    }

    public final void LJJLJLI() {
        long VL = getCameraApi().VL();
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.attachEffect(VL);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApi().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 374));
        O8().LLLLL().LJIIIIZZ().LJIILL().observe(this, new AObjectS89S0100000_14(this, 375));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.onPause();
            C16880lQ.LJLLLL(c1fm, LJJLIIIJJI());
            c1fm.onDestroy();
        }
        this.LJLILLLLZI = null;
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.onPause();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.onResume();
        }
        LJJLJLI();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WLS getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public WLR(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLJJL = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 235));
    }

    private final void LJJLI(JSONObject jSONObject) {
        LJJLIIIJLLLLLLLZ(this.LJLJJL, jSONObject);
        LJJLIIIJJI().addView(this.LJLILLLLZI);
        AnonymousClass668.LIZIZ().LJII(576, 1024, this.LJLILLLLZI);
    }

    private final BEFView$FitMode LJJLIIIIJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BEFView$FitMode.NO_CLIP;
                    }
                    return BEFView$FitMode.FIT_WIDTH_BOTTOM;
                }
                return BEFView$FitMode.FILL_SCREEN;
            }
            return BEFView$FitMode.FIT_HEIGHT;
        }
        return BEFView$FitMode.FIT_WIDTH;
    }

    private final void LJJLJ(Effect effect) {
        C1FM c1fm = this.LJLILLLLZI;
        if (c1fm != null) {
            c1fm.setStickerPath("");
        }
        LJJLIIJ();
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(effect.getSdkExtra());
            String optString = jSONObject.optString("befViewResRoot");
            if (!TextUtils.isEmpty(optString)) {
                LJJLI(jSONObject);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(effect.getUnzipPath());
                LIZ.append(File.separator);
                LIZ.append(optString);
                String LIZIZ = X1D.LIZIZ(LIZ);
                C1FM c1fm2 = this.LJLILLLLZI;
                if (c1fm2 != null) {
                    c1fm2.setStickerPath(LIZIZ);
                }
            }
        } catch (Exception e) {
            H78.LIZJ("fail to get sticker support resource path from sticker.sdkExtra");
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJLIIIJJIZ(Effect effect) {
        LJJLJ(effect);
    }

    private final void LJJLIIIJLLLLLLLZ(Context context, JSONObject jSONObject) {
        int[] iArr;
        double optDouble = jSONObject.optDouble("befViewRenderFPS");
        int optInt = jSONObject.optInt("befViewFitMode", -1);
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        if (LJIIIZ != null) {
            iArr = C143205jg.LIZIZ(LJIIIZ);
        } else {
            iArr = null;
        }
        BEFView$Builder obtain = BEFView$Builder.obtain();
        if (iArr != null && iArr.length >= 2) {
            obtain.setRenderSize(iArr[0], iArr[1]);
        }
        if (!Double.isNaN(optDouble)) {
            obtain.setFPS(optDouble);
        }
        if (LJJLIIIIJ(optInt) != null) {
            obtain.setFitMode(LJJLIIIIJ(optInt));
        }
        C1FM build = obtain.build(context);
        this.LJLILLLLZI = build;
        if (build != null) {
            build.setOpaque(false);
        }
        LJJLJLI();
    }
}

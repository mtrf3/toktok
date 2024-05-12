package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS0S0000002_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151995xr extends AbstractC48231ut<InterfaceC152145y6, C1547665o, C152015xt, C152065xy> implements InterfaceC152145y6, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC65784Pro<C152015xt> LJLLILLLL;
    public final InterfaceC65784Pro<C152065xy> LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public C6V4 LJZI;
    public Bitmap LJZL;
    public Bitmap LL;
    public final C5H3 LLD;
    public C67P LLF;
    public final GHB LLFF;

    static {
        TBT tbt = new TBT(C151995xr.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C151995xr.class, "imageIsolateClipEditApi", "getImageIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0, c65351Pkp), C61845OOz.LIZJ(C151995xr.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C151995xr.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C151995xr.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0, c65351Pkp)};
    }

    private final InterfaceC152085y0 LLILL() {
        return (InterfaceC152085y0) this.LJZ.LIZ(this, LLFFF[4]);
    }

    private final InterfaceC151215wb LLILZIL() {
        return (InterfaceC151215wb) this.LJLLLL.LIZ(this, LLFFF[1]);
    }

    private final VideoPublishEditModel LLILZLL() {
        return (VideoPublishEditModel) this.LJLZ.LIZ(this, LLFFF[3]);
    }

    private final C63D LLJ() {
        return (C63D) this.LJLLLLLL.LIZ(this, LLFFF[2]);
    }

    private final Rect LLJI() {
        return (Rect) this.LLD.getValue();
    }

    public final InterfaceC143655kP LLIIZ() {
        return (InterfaceC143655kP) this.LJLLL.LIZ(this, LLFFF[0]);
    }

    private final void LLIZ() {
        Bitmap bitmap;
        View findViewById;
        if (H7R.LJJJJL(LLILZLL())) {
            InterfaceC151215wb LLILZIL = LLILZIL();
            if (LLILZIL != null) {
                LLILZIL.YV(null);
            }
            C151525x6.LJI(LLILZLL().getImageAlbumData().getSurfaceData());
            InterfaceC151215wb LLILZIL2 = LLILZIL();
            if (LLILZIL2 != null) {
                SingleImageData bJ = LLILZIL2.bJ();
                ImageAlbumData imageAlbumData = LLILZLL().getImageAlbumData();
                o.LJIIIIZZ(imageAlbumData, "model.imageAlbumData");
                bitmap = new RunnableC151315wl(bJ, imageAlbumData, null, new C151385ws(2), null, null, 52).LIZIZ();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            InterfaceC153045zY value = LLIIZ().Kh().getValue();
            if (value != null) {
                bitmap = value.LLJL();
            } else {
                bitmap = null;
            }
        }
        this.LL = bitmap;
        this.LJZL = null;
        if (H7R.LJJJJL(LLILZLL())) {
            InterfaceC151215wb LLILZIL3 = LLILZIL();
            if (LLILZIL3 == null || (findViewById = LLILZIL3.gc()) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            findViewById = C78688UuS.LJIJJ(this).findViewById(R.id.cpo);
            o.LJIIIIZZ(findViewById, "{\n                activi…_container)\n            }");
        }
        Window window = C78688UuS.LJIJJ(this).getWindow();
        o.LJIIIIZZ(window, "activity.window");
        C61660OHw.LIZ(window, findViewById, new AqS184S0100000_2(this, 32));
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        InterfaceC152085y0 LLILL = LLILL();
        C6V4 c6v4 = this.LJZI;
        if (c6v4 != null) {
            LLILL.LIZ(c6v4);
            C78897Uxp.LJJJJ(this.LJLL).LLJJL(this.LLFF);
            C63D LLJ = LLJ();
            if (LLJ == null) {
                return;
            }
            LLJ.uY(false);
            return;
        }
        o.LJIJI("gestureItem");
        throw null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C152015xt> LJJLIIIJJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C152065xy> LJJLIIIJJIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    private final OSZ<Boolean, Integer> LLIFFJFJJ(PointF pointF) {
        Bitmap bitmap = this.LL;
        if (bitmap == null) {
            return new OSZ<>(Boolean.FALSE, 0);
        }
        if (H7R.LJJJJL(LLILZLL())) {
            return LLFFF(pointF, bitmap);
        }
        return LLIIIL(pointF, bitmap);
    }

    private final OSZ<Boolean, Integer> LLIILZL(PointF pointF) {
        Bitmap bitmap = this.LJZL;
        boolean z = false;
        if (bitmap == null) {
            return new OSZ<>(Boolean.FALSE, 0);
        }
        int LIZIZ = C61660OHw.LIZIZ(O6R.LJJIIZ(pointF.x), O6R.LJJIIZ(pointF.y), bitmap);
        if (((LIZIZ >> 24) & 255) != 255) {
            z = true;
        }
        return new OSZ<>(Boolean.valueOf(!z), Integer.valueOf(LIZIZ));
    }

    private final void LLJJ(int i) {
        LJJZZI(new AqS27S0001000_2(i, 16));
        C67P c67p = this.LLF;
        if (c67p != null) {
            c67p.LJJI(c67p.getCurMode(), i, c67p.getCurAlignTxt(), c67p.getCurFontType());
        }
    }

    public final void LLJJI(PointF pointF) {
        OSZ<Boolean, Integer> LLIILZL = LLIILZL(pointF);
        boolean booleanValue = LLIILZL.getFirst().booleanValue();
        int intValue = LLIILZL.getSecond().intValue();
        if (booleanValue) {
            LLJJ(intValue);
            return;
        }
        OSZ<Boolean, Integer> LLIFFJFJJ = LLIFFJFJJ(pointF);
        boolean booleanValue2 = LLIFFJFJJ.getFirst().booleanValue();
        int intValue2 = LLIFFJFJJ.getSecond().intValue();
        if (booleanValue2) {
            LLJJ(intValue2);
        }
    }

    public final void LLJJIII(C6V2 c6v2) {
        this.LJZI = new C6V4(10000, c6v2);
    }

    @Override // X.InterfaceC152145y6
    public void Xu(C67P c67p) {
        super.show();
        this.LLF = c67p;
        C78897Uxp.LJJJJ(this.LJLL).LLJILJILJ(this, this.LLFF);
        LLIIZ().U2(false, false, false);
        InterfaceC152085y0 LLILL = LLILL();
        C6V4 c6v4 = this.LJZI;
        if (c6v4 != null) {
            LLILL.LIZIZ(c6v4);
            LLIZ();
        } else {
            o.LJIJI("gestureItem");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151995xr(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = C152035xv.LJLIL;
        this.LJLLJ = new AqS152S0100000_2(this, 338);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC151215wb.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), C63D.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 339));
        if (H7R.LJJJJL(LLILZLL()) && LLILZLL().getImageAlbumData() != null) {
            int maxImageHeight = LLILZLL().getImageAlbumData().getMaxImageHeight();
            int maxImageWidth = LLILZLL().getImageAlbumData().getMaxImageWidth();
            C151345wo.LIZIZ = maxImageHeight;
            C151345wo.LIZJ = maxImageWidth;
        }
        this.LLFF = new GHB() { // from class: X.5xu
            @Override // X.GHB
            public final boolean onBackPressed() {
                C151995xr.this.LLF(-1.0f, -1.0f);
                return true;
            }
        };
    }

    private final boolean LJLZ(int i, int i2) {
        C151085wO h20;
        Rect editRect;
        InterfaceC151215wb LLILZIL = LLILZIL();
        if (LLILZIL != null && (h20 = LLILZIL.h20()) != null && (editRect = h20.getEditRect()) != null) {
            return editRect.contains(i, i2);
        }
        return false;
    }

    private final boolean LJZI(int i, int i2) {
        return LLJI().contains(i, i2);
    }

    private final OSZ<Boolean, Integer> LLFFF(PointF pointF, Bitmap bitmap) {
        int i;
        C151085wO h20;
        Rect editRect;
        if (LJLZ(O6R.LJJIIZ(pointF.x), O6R.LJJIIZ(pointF.y))) {
            InterfaceC151215wb LLILZIL = LLILZIL();
            if (LLILZIL == null || (h20 = LLILZIL.h20()) == null || (editRect = h20.getEditRect()) == null) {
                return new OSZ<>(Boolean.FALSE, 0);
            }
            int i2 = editRect.top;
            float width = bitmap.getWidth() / editRect.width();
            i = C61660OHw.LIZIZ(O6R.LJJIIZ((pointF.x - editRect.left) * width), O6R.LJJIIZ((pointF.y - i2) * width), bitmap);
        } else {
            i = -16777216;
        }
        return new OSZ<>(Boolean.TRUE, Integer.valueOf(i));
    }

    private final OSZ<Boolean, Integer> LLIIIL(PointF pointF, Bitmap bitmap) {
        int i;
        if (LJZI(O6R.LJJIIZ(pointF.x), O6R.LJJIIZ(pointF.y))) {
            int i2 = LLIIZ().cd().topMargin;
            float width = bitmap.getWidth() / LLIIZ().lU();
            i = C61660OHw.LIZIZ(O6R.LJJIIZ((pointF.x - LLIIZ().cd().getMarginStart()) * width), O6R.LJJIIZ((pointF.y - i2) * width), bitmap);
        } else {
            i = -16777216;
        }
        return new OSZ<>(Boolean.TRUE, Integer.valueOf(i));
    }

    public final void LLF(float f, float f2) {
        LJJZZI(new AqS0S0000002_2(f, f2, 0));
        C67P c67p = this.LLF;
        if (c67p != null) {
            Integer num = LJJLJ().LIZLLL;
            InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
            if (interfaceC1552467k != null) {
                interfaceC1552467k.LIZLLL(c67p, true, num);
            }
        } else {
            C63D LLJ = LLJ();
            if (LLJ != null) {
                LLJ.aR(null, LJJLJ().LIZLLL);
            }
        }
        String LJIIIIZZ = H7R.LJIIIIZZ(LLILZLL());
        String creationId = LLILZLL().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        C133255Kv.LIZ(LJIIIIZZ, creationId, LLILZLL().mShootWay, H7R.LJIIIZ(LLILZLL()), LLILZLL().getEnterFrom());
        this.LLF = null;
    }
}

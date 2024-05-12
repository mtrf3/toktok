package X;

import Y.ARunnableS11S0100100_2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.5if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142575if extends C139875eJ implements InterfaceC142595ih {
    public static final C142605ii LLZLLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLZZ;
    public final View LLLZIIL;
    public final ViewGroup LLLZIL;
    public final VEPreviewParams LLLZL;
    public final MutableLiveData<Bitmap> LLLZLL;
    public final InterfaceC115514g7 LLLZLZ;
    public final InterfaceC115514g7 LLLZZ;
    public final InterfaceC115514g7 LLLZZIL;
    public ImageView LLZ;
    public C1547165j LLZIL;
    public final int LLZILL;
    public final int LLZL;
    public int LLZLI;
    public int LLZLL;
    public final int LLZLLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.5ii] */
    static {
        TBT tbt = new TBT(C142575if.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLZZ = new InterfaceC74236TBo[]{tbt, new TBT(C142575if.class, "nowsShootModel", "getNowsShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0), new TBT(C142575if.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLZLLLL = new Object() { // from class: X.5ii
        };
    }

    private final void y0() {
        if (!o0().nowsExtra.isDualCamera || o0().type == 3) {
            return;
        }
        Bitmap bitmap = C142625ik.LIZ;
        C142625ik.LIZ = null;
        if (bitmap == null) {
            return;
        }
        if (bitmap.isRecycled()) {
            getActivity().finish();
            return;
        }
        o0().frontBitmap = bitmap;
        int LJ = C81184Vtc.LJ(C78688UuS.LJJIII(this));
        ImageView imageView = this.LLZ;
        if (imageView != null) {
            float f = LJ;
            float f2 = H7I.LIZ;
            w0(this, imageView, f * f2, this.LLZLL, this.LLZL, 0, 0.0f, 32, null);
            C1547165j c1547165j = this.LLZIL;
            if (c1547165j != null) {
                w0(this, c1547165j, f * f2, this.LLZLI, this.LLZILL, this.LLZLLIL, 0.0f, 32, null);
                ImageView imageView2 = this.LLZ;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(bitmap);
                    o0().frontBitmap = bitmap;
                    return;
                } else {
                    o.LJIJI("frontImage");
                    throw null;
                }
            }
            o.LJIJI("innerBorder");
            throw null;
        }
        o.LJIJI("frontImage");
        throw null;
    }

    @Override // X.InterfaceC142595ih
    public void FO() {
        ImageView imageView = this.LLZ;
        if (imageView != null) {
            C6IA.LIZIZ(imageView, 200L, new AqS152S0100000_2(this, 111));
            C1547165j c1547165j = this.LLZIL;
            if (c1547165j != null) {
                C6IA.LIZIZ(c1547165j, 200L, new AqS152S0100000_2(this, 112));
                return;
            } else {
                o.LJIJI("innerBorder");
                throw null;
            }
        }
        o.LJIJI("frontImage");
        throw null;
    }

    private final InterfaceC142515iZ LLLLZI() {
        return (InterfaceC142515iZ) this.LLLZLZ.LIZ(this, LLZZ[0]);
    }

    private final VideoPublishEditModel QY() {
        return (VideoPublishEditModel) this.LLLZZIL.LIZ(this, LLZZ[2]);
    }

    private final void k0() {
        float f = H7I.LIZ;
        String str = o0().frontImagePath;
        if (str == null) {
            return;
        }
        C121594pv c121594pv = new C121594pv(0);
        c121594pv.LJIIL = str;
        c121594pv.LJIILIIL = f;
        c121594pv.LJIILJJIL = f;
        c121594pv.LJ = 0.042f;
        c121594pv.LJFF = 0.042f;
        InterfaceC153045zY LJLIIL = LJLIIL();
        if (LJLIIL != null) {
            c121594pv.LIZLLL = LJLIIL.getDuration();
            C122034qd LJJI = C17N.LJJI(LJLIIL);
            if (LJJI != null) {
                LJJI.LJIIIIZZ().LJJJJIZL(c121594pv);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    private final NowsShootModel o0() {
        return (NowsShootModel) this.LLLZZ.LIZ(this, LLZZ[1]);
    }

    private final void u0() {
        View findViewById = this.LLLZIL.findViewById(R.id.f3e);
        o.LJIIIIZZ(findViewById, "imageContainer.findViewById(R.id.iv_front)");
        this.LLZ = (ImageView) findViewById;
        View findViewById2 = this.LLLZIL.findViewById(R.id.emo);
        o.LJIIIIZZ(findViewById2, "imageContainer.findViewById(R.id.inner_border)");
        this.LLZIL = (C1547165j) findViewById2;
        int LIZJ = C6IA.LIZJ(C78688UuS.LJJIII(this));
        this.LLZLI = LIZJ;
        this.LLZLL = LIZJ + ((int) C74275TDb.LIZ(2.0f));
    }

    private final C5XM LLLZLL() {
        C0IB<C5XM> Rq0;
        InterfaceC142515iZ LLLLZI = LLLLZI();
        if (LLLLZI != null && (Rq0 = LLLLZI.Rq0()) != null) {
            return Rq0.LIZ();
        }
        return null;
    }

    @Override // X.C139875eJ, X.C143265jm
    public C5MG LJJLIIIJJIZ() {
        if (QY().getVideoEditorType() != 11) {
            QY().setVideoEditorType(10);
        }
        final C5MG LIZ = C5K2.LIZ(QY().getVideoEditorType(), this.LJLJI.LJFF);
        LIZ.LJIL = new InterfaceC134025Nu() { // from class: X.5ig
            @Override // X.InterfaceC134025Nu
            public final void LIZ() {
                long currentTimeMillis = System.currentTimeMillis();
                C142575if.this.r0(LIZ.LJJ());
                C38995FSd.LIZJ().submit(new ARunnableS11S0100100_2(C142575if.this, currentTimeMillis, 1));
            }
        };
        return LIZ;
    }

    @Override // X.C139875eJ, X.C143265jm
    public int LLJJIJI() {
        CanvasBackground background;
        List<String> sourceInfo;
        String str;
        if (o0().type == 0 && H7R.LJJJLL(QY())) {
            ArrayList arrayList = new ArrayList();
            CanvasVideoData canvasVideoData = QY().canvasVideoData;
            if (canvasVideoData != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && (str = (String) ORZ.LJLLLL(sourceInfo)) != null) {
                arrayList.add(str);
                arrayList.add(C65282hI.LIZIZ(str));
            }
            C65282hI.LJ(arrayList);
            CanvasVideoData canvasVideoData2 = QY().canvasVideoData;
            if (canvasVideoData2 != null && (background = canvasVideoData2.getBackground()) != null) {
                OSZ LIZJ = C65282hI.LIZJ((String) ORZ.LJLLJ(arrayList));
                background.setStartColor(((Number) LIZJ.getFirst()).intValue());
                background.setEndColor(((Number) LIZJ.getSecond()).intValue());
            }
        }
        return super.LLJJIJI();
    }

    @Override // X.C139875eJ, X.C143265jm, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        u0();
        y0();
    }

    @Override // X.InterfaceC142595ih
    public /* bridge */ /* synthetic */ LiveData Dt0() {
        return this.LLLZLL;
    }

    @Override // X.C139875eJ
    public View e() {
        return this.LLLZIIL;
    }

    public final void r0(InterfaceC153045zY interfaceC153045zY) {
        VEPreviewParams vEPreviewParams = this.LLLZL;
        interfaceC153045zY.LLLII(new int[]{0}, vEPreviewParams.mPreviewWidth, vEPreviewParams.mPreviewHeight, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT, new InterfaceC134015Nt() { // from class: X.5gp
            @Override // X.InterfaceC134015Nt
            public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
                if (bArr != null) {
                    C142575if c142575if = C142575if.this;
                    VEPreviewParams vEPreviewParams2 = c142575if.LLLZL;
                    Bitmap createBitmap = Bitmap.createBitmap(vEPreviewParams2.mPreviewWidth, vEPreviewParams2.mPreviewHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                    c142575if.LLLZLL.postValue(createBitmap);
                    return 0;
                }
                return 0;
            }
        });
        o0().videoDuration = interfaceC153045zY.getDuration();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142575if(C82622Wbi diContainer, View surfaceContainer, ViewGroup imageContainer, VEPreviewParams previewParams, InterfaceC88472Yns<? super C140815fp, C76800UCe> interfaceC88472Yns) {
        super(diContainer, previewParams, null, interfaceC88472Yns);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(surfaceContainer, "surfaceContainer");
        o.LJIIIZ(imageContainer, "imageContainer");
        o.LJIIIZ(previewParams, "previewParams");
        this.LLLZIIL = surfaceContainer;
        this.LLLZIL = imageContainer;
        this.LLLZL = previewParams;
        this.LLLZLL = new MutableLiveData<>();
        this.LLLZLZ = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LLLZZ = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LLLZZIL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        int LIZ = (int) C74275TDb.LIZ(16.0f);
        this.LLZILL = LIZ;
        this.LLZL = LIZ + ((int) C74275TDb.LIZ(2.0f));
        this.LLZLI = -1;
        this.LLZLL = -1;
        this.LLZLLIL = (int) C74275TDb.LIZ(4.0f);
    }

    private final void v0(View view, float f, int i, int i2, int i3, float f2) {
        C6IA.LJIIIIZZ(getActivity(), view, f, i, i2, i3, f2);
    }

    public /* synthetic */ C142575if(C82622Wbi c82622Wbi, View view, ViewGroup viewGroup, VEPreviewParams vEPreviewParams, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, view, viewGroup, vEPreviewParams, (i & 16) != 0 ? null : interfaceC88472Yns);
    }

    public static /* synthetic */ void w0(C142575if c142575if, View view, float f, int i, int i2, int i3, float f2, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        if ((i4 & 32) != 0) {
            f2 = C74275TDb.LIZ(18.0f);
        }
        c142575if.v0(view, f, i, i2, i3, f2);
    }
}

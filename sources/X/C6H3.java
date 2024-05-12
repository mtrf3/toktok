package X;

import Y.AObjectS84S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6H3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6H3 extends AbstractC29891Fh<InterfaceC139535dl> implements InterfaceC139535dl, InterfaceC135635Tz {
    public static final C6HB LLF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public final WM7 LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final FrameLayout LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public FrameLayout LJLJLLL;
    public final C5H3 LJLL;
    public final java.util.Map<EnumC157656Gr, InterfaceC88472Yns<StickerModel, C76800UCe>> LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public C6H7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final C5H3 LJLZ;
    public final CopyOnWriteArrayList<Runnable> LJZ;
    public boolean LJZI;
    public final C29901Fi<Boolean> LJZL;
    public final LiveEvent<Boolean> LL;
    public C6V4 LLD;

    public InterfaceC139535dl LJJLIIIJJIZ() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6HB] */
    static {
        TBT tbt = new TBT(C6H3.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, new TBT(C6H3.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(C6H3.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C6H3.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new TBT(C6H3.class, "addYoursStickerApi", "getAddYoursStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0), new TBT(C6H3.class, "editTextStickerNewApi", "getEditTextStickerNewApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextStickerNewApi;", 0), new TBT(C6H3.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C6H3.class, "newToolbarApiComponent", "getNewToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/optimize/EditToolbarApiComponent;", 0)};
        LLF = new Object() { // from class: X.6HB
        };
    }

    private final List<C159636Oh> LJJLI() {
        C159636Oh nm;
        ArrayList arrayList = new ArrayList();
        C159636Oh c159636Oh = new C159636Oh(EnumC157656Gr.ADD_YOURS, 0, true, false, false, true, false, (List) null, false, (String) null, new OSZ(Float.valueOf(0.6f), Float.valueOf(1.2f)), false, false, false, false, false, 127874);
        C159636Oh c159636Oh2 = new C159636Oh(EnumC157656Gr.AI_CAPTION_TAG, 0, false, false, false, false, false, (List) null, false, (String) null, (OSZ) null, false, false, true, false, false, 122818);
        arrayList.add(c159636Oh);
        arrayList.add(c159636Oh2);
        InterfaceC139045cy LJJLJ = LJJLJ();
        if (LJJLJ != null && (nm = LJJLJ.nm()) != null) {
            arrayList.add(nm);
        } else if (C42000Ge4.LJIILIIL(LLLLIL())) {
            arrayList.add(new C159636Oh(EnumC157656Gr.TEXT, 0, true, true, true, true, true, (List) C47261Igj.LJII(4, 3, 2), false, (String) null, new OSZ(Float.valueOf(0.2f), Float.valueOf(10.0f)), true, ((Boolean) C6HC.LIZ.getValue()).booleanValue(), true, true, true, 770));
        }
        return arrayList;
    }

    private final InterfaceC159886Pg LJJLIIIJLLLLLLLZ() {
        return (InterfaceC159886Pg) this.LJLL.getValue();
    }

    private final InterfaceC152085y0 LJJLJLI() {
        return (InterfaceC152085y0) this.LJLJLJ.LIZ(this, LLFF[3]);
    }

    private final C6MS LJJLL() {
        return (C6MS) this.LJLLLLLL.LIZ(this, LLFF[7]);
    }

    private final InterfaceC160026Pu LJJZZIII() {
        return new InterfaceC160026Pu() { // from class: X.6H5
            @Override // X.InterfaceC160026Pu
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILJJIL(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJJ() {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZIZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZLLL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H3.this.xQ(stickerModel);
                C6H6.LIZJ(C6H3.this.LLLLIL(), null, stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJ(int i) {
                C6H7 c6h7 = C6H3.this.LJLLL;
                if (c6h7 != null) {
                    C6H6.LIZIZ(C6H3.this.LLLLIL(), c6h7.P4(i), "click");
                } else {
                    o.LJIJI("stickerService");
                    throw null;
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LJFF(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H3.this.xQ(stickerModel);
                C6H6.LIZJ(C6H3.this.LLLLIL(), null, stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJI(int i) {
                C139545dm.LIZ(C6H3.this, null, null, 3);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJII(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H3.this.xQ(stickerModel);
                C6H6.LIZJ(C6H3.this.LLLLIL(), null, stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIIIZZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIIZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIJJI(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H3.this.LJZL.LJI(Boolean.TRUE);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIZILJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = C6H3.this.LJLLI.get(stickerModel.getStickerType());
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(stickerModel);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJI(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIL(int i) {
                C6H7 c6h7 = C6H3.this.LJLLL;
                if (c6h7 != null) {
                    C6H6.LIZIZ(C6H3.this.LLLLIL(), c6h7.P4(i), "change");
                } else {
                    o.LJIJI("stickerService");
                    throw null;
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZ(StickerModel stickerModel, boolean z) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H3.this.xQ(stickerModel);
                C6H3.this.LJZL.LJI(Boolean.TRUE);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILLIIL(StickerModel stickerModel, String str) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H6.LIZLLL(C6H3.this.LLLLIL(), null, stickerModel);
                C6H4.LIZIZ(C6H3.this.LLLLIL().creativeModel.stickerModel, stickerModel);
                C6H3.this.LJZL.LJI(Boolean.FALSE);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJ(StickerModel stickerModel, int i) {
                o.LJIIIZ(stickerModel, "stickerModel");
                if (i == 3) {
                    C6H3.this.LJJLIIJ().N4().setValue(Boolean.TRUE);
                }
            }
        };
    }

    private final InterfaceC153275zv LJLIIL() {
        return (InterfaceC153275zv) this.LJLLLL.LIZ(this, LLFF[6]);
    }

    private final InterfaceC153045zY LJLJJL() {
        return (InterfaceC153045zY) this.LJLZ.getValue();
    }

    private final void LJLLL() {
        this.LJLJLLL = new FrameLayout(C78688UuS.LJJIII(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.LJLJI;
        FrameLayout frameLayout2 = this.LJLJLLL;
        if (frameLayout2 != null) {
            frameLayout.addView(frameLayout2, layoutParams);
        } else {
            o.LJIJI("stickerContainer");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public List<StickerModel> BS() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 == null) {
            return C61878OQg.INSTANCE;
        }
        return c6h7.LIZJ();
    }

    @Override // X.InterfaceC139535dl
    public InterfaceC152865zG I00() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LJ().LIZLLL();
        }
        return null;
    }

    @Override // X.InterfaceC139535dl
    public InterfaceC147435qV LIZ() {
        return new InterfaceC147435qV() { // from class: X.6H8
            @Override // X.InterfaceC147435qV
            public final boolean Rc(RectF rectF) {
                List<StickerModel> LIZJ;
                C6H7 c6h7 = C6H3.this.LJLLL;
                if (c6h7 == null || (LIZJ = c6h7.LIZJ()) == null || LIZJ.isEmpty()) {
                    return false;
                }
                for (StickerModel stickerModel : LIZJ) {
                    RectF visibleRectWithoutRotationInContainer = stickerModel.getBaseSticker().getVisibleRectWithoutRotationInContainer();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(stickerModel.getBaseSticker().getRotation(), visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
                    matrix.mapRect(visibleRectWithoutRotationInContainer);
                    if (visibleRectWithoutRotationInContainer.top < rectF.top || visibleRectWithoutRotationInContainer.bottom > rectF.bottom) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public final AnonymousClass643 LJJLIIIJJI() {
        return (AnonymousClass643) this.LJLLILLLL.LIZ(this, LLFF[4]);
    }

    public final InterfaceC147865rC LJJLIIJ() {
        return (InterfaceC147865rC) this.LJLJJLL.LIZ(this, LLFF[1]);
    }

    public final InterfaceC139045cy LJJLJ() {
        return (InterfaceC139045cy) this.LJLLJ.LIZ(this, LLFF[5]);
    }

    public final InterfaceC159886Pg LJLJLJ() {
        return new InterfaceC159886Pg() { // from class: X.6Gj
            @Override // X.InterfaceC159886Pg
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZ() {
                if (C6H3.this.LLLLIL().isCurrentAutoCutMode() && (C6H3.this.LJJZZI() instanceof C133765Mu)) {
                    InterfaceC153045zY LJJZZI = C6H3.this.LJJZZI();
                    o.LJII(LJJZZI, "null cannot be cast to non-null type com.ss.android.ugc.asve.editor.ASNLEEditor");
                    return C44701HgX.LJIIJ((C133765Mu) LJJZZI);
                }
                List<MediaModel> mediaModelList = C6H3.this.LLLLIL().getMediaModelList();
                o.LJIIIIZZ(mediaModelList, "{\n                    pu…delList\n                }");
                return mediaModelList;
            }

            @Override // X.InterfaceC159886Pg
            public final InterfaceC153045zY LIZIZ() {
                InterfaceC153045zY LJJZZI = C6H3.this.LJJZZI();
                if (LJJZZI != null) {
                    return LJJZZI;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZJ() {
                List<MediaModel> mediaModelList = C6H3.this.LLLLIL().getMediaModelList();
                o.LJIIIIZZ(mediaModelList, "publishEditModel.mediaModelList");
                return mediaModelList;
            }

            @Override // X.InterfaceC159886Pg
            public final float LIZLLL() {
                if (C6H3.this.LJJZZI() != null) {
                    return r0.getDuration();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC159886Pg
            public final C6OE LJFF() {
                InterfaceC139045cy LJJLJ = C6H3.this.LJJLJ();
                if (LJJLJ != null) {
                    return LJJLJ.LLLLLLZ();
                }
                return null;
            }

            @Override // X.InterfaceC159886Pg
            public final RTY LJI() {
                return C6H3.this.LJLLILLLL();
            }

            @Override // X.InterfaceC159886Pg
            public final boolean LJII() {
                return C6H3.this.LLLLIL().isMultiVideoEdit();
            }

            @Override // X.InterfaceC159886Pg
            public final C6O5 LJIIIIZZ() {
                return new C152885zI(C78688UuS.LJJIII(C6H3.this));
            }

            @Override // X.InterfaceC159886Pg
            public final C6SL LJIIJ() {
                AnonymousClass643 LJJLIIIJJI = C6H3.this.LJJLIIIJJI();
                if (LJJLIIIJJI != null) {
                    return LJJLIIIJJI.LLLLLLZ();
                }
                return null;
            }

            @Override // X.InterfaceC159886Pg
            public final int LJIIL() {
                return (int) C6H3.this.LLLLIL().getMultiEditVideoStartTime();
            }

            @Override // X.InterfaceC159886Pg
            public final void LJ(boolean z) {
                C6H3.this.LJJLIIIIJ(z);
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILIIL(int i) {
                C6H3.this.Ll0().U2(false, false, false);
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILJJIL(int i) {
                C6H3.this.Ll0().U2(true, false, true);
            }
        };
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LLFF[2]);
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJJL.LIZ(this, LLFF[0]);
    }

    @Override // X.InterfaceC139535dl
    public void M9() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.M9();
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public boolean Xi() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LJ().LJ();
        }
        o.LJIJI("stickerService");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public InterfaceC139415dZ Xj0() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LJ().LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC139535dl
    public View Xs() {
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public OSZ<Integer, Integer> Y0() {
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            Integer valueOf = Integer.valueOf(frameLayout.getLayoutParams().width);
            FrameLayout frameLayout2 = this.LJLJLLL;
            if (frameLayout2 != null) {
                return new OSZ<>(valueOf, Integer.valueOf(frameLayout2.getLayoutParams().height));
            }
            o.LJIJI("stickerContainer");
            throw null;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public void hide() {
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.LJLJJI.setVisibility(8);
        } else {
            o.LJIJI("stickerContainer");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public AnonymousClass667 lT() {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LJ().LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC139535dl
    public void show() {
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.LJLJJI.setVisibility(0);
        } else {
            o.LJIJI("stickerContainer");
            throw null;
        }
    }

    private final void LJJLIIIJILLIZJL() {
        InterfaceC153045zY LJJZZI = LJJZZI();
        if (LJJZZI != null) {
            int duration = LJJZZI.getDuration();
            for (StickerModel stickerModel : C6H4.LJ(LLLLIL().creativeModel.stickerModel)) {
                float f = duration;
                if (Math.abs(stickerModel.getBaseSticker().getEndTime() - f) < 20.0f) {
                    stickerModel.getBaseSticker().setEndTime(f);
                }
            }
        }
    }

    private final int LJLJJLL() {
        return (C47135Ieh.LIZ(218, C63081OpJ.LJJJJJL(C78688UuS.LJJIII(this))) - C63081OpJ.LJJJJLI(C78688UuS.LJJIII(this))) - C81184Vtc.LIZJ(C78688UuS.LJIJJ(this));
    }

    private final C6H7 LJLZ() {
        InterfaceC88472Yns<StickerModel, C76800UCe> Db;
        List<C159636Oh> LJJLI = LJJLI();
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = LLLLIL().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        C159816Oz c159816Oz = new C159816Oz(C43073GvN.LIZLLL(LJ, creativeInfo, EnumC43649HBd.INFO_STICKER, null, false, 12), LJJLI, 11);
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            FrameLayout frameLayout2 = this.LJLJJI;
            InterfaceC159886Pg LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            WM7 wm7 = this.LJLILLLLZI;
            o.LJII(wm7, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            C6PV c6pv = new C6PV(LJIJJ, frameLayout, frameLayout2, wm7, LJJLIIIJLLLLLLLZ, c159816Oz);
            this.LJLLI.put(EnumC157656Gr.ADD_YOURS, new AqS168S0100000_2(this, 267));
            InterfaceC139045cy LJJLJ = LJJLJ();
            if (LJJLJ != null && (Db = LJJLJ.Db()) != null) {
                this.LJLLI.put(EnumC157656Gr.TEXT, Db);
            }
            c6pv.LLLILZJ(LJJZZIII());
            C6V4 c6v4 = new C6V4(550, c6pv.LJIIJJI());
            this.LLD = c6v4;
            LJJLJLI().LIZIZ(c6v4);
            c6pv.initService();
            return c6pv;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    public final InterfaceC153045zY LJJZZI() {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return LJLJJL();
        }
        return value;
    }

    public final RTY LJLLILLLL() {
        UrlModel urlModel;
        String LIZIZ;
        float f;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            urlModel = LJ.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (C6DX.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            C44423Hc3 LJ2 = C73098SmU.LJ();
            Resources resources = C78688UuS.LJJIII(this).getResources();
            o.LJIIIIZZ(resources, "context.resources");
            LIZ.append(C41532GRs.LIZIZ(LJ2, resources));
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            C44423Hc3 LJ3 = C73098SmU.LJ();
            Resources resources2 = C78688UuS.LJJIII(this).getResources();
            o.LJIIIIZZ(resources2, "context.resources");
            LIZIZ = C41532GRs.LIZIZ(LJ3, resources2);
        }
        if (C6DX.LIZIZ()) {
            f = 17.0f;
        } else {
            f = 15.0f;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(C41532GRs.LIZ(C78688UuS.LJJIII(this), C60903NvH.LJIIJJI().getAccountService().getCurrentUser()));
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        float LIZ3 = C6DY.LIZ();
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        return new RTY(LIZ3, urlModel, LIZIZ, f, LIZIZ2, 7);
    }

    @Override // X.InterfaceC139535dl
    public void Ms0() {
        VESize vESize;
        InterfaceC153045zY LJJZZI = LJJZZI();
        if (LJJZZI == null || (vESize = LJJZZI.LLILZ()) == null) {
            vESize = new VESize(720, 1080);
        }
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            V3N.LJJIJLIJ(vESize.width, vESize.height, frameLayout);
            if (H7R.LJJJJI(LLLLIL())) {
                FrameLayout frameLayout2 = this.LJLJLLL;
                if (frameLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    layoutParams.width = vESize.width;
                    layoutParams.height = vESize.height;
                    return;
                }
                o.LJIJI("stickerContainer");
                throw null;
            }
            return;
        }
        o.LJIJI("stickerContainer");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public void T10() {
        LJJLIIIJILLIZJL();
        for (AddYoursStickerModel addYoursStickerModel : LLLLIL().creativeModel.stickerModel.addYoursStickerModels) {
            C6H7 c6h7 = this.LJLLL;
            if (c6h7 != null) {
                c6h7.Q7(addYoursStickerModel, addYoursStickerModel.getStickerType(), false);
            } else {
                o.LJIJI("stickerService");
                throw null;
            }
        }
        for (TextStickerModel textStickerModel : C42000Ge4.LJII(LLLLIL())) {
            C6H7 c6h72 = this.LJLLL;
            if (c6h72 != null) {
                c6h72.Q7(textStickerModel, textStickerModel.getStickerType(), false);
            } else {
                o.LJIJI("stickerService");
                throw null;
            }
        }
        Ms0();
        this.LJZI = true;
        Iterator<Runnable> it = this.LJZ.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.LJZ.clear();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        LiveData<C6MP> T20;
        super.onCreate();
        LJLLL();
        this.LJLLL = LJLZ();
        LJLIIL().qa().observe(this, new AObjectS84S0100000_2(this, 177));
        C6MS LJJLL = LJJLL();
        if (LJJLL != null && (T20 = LJJLL.T20()) != null) {
            T20.observe(this, new AObjectS84S0100000_2(this, 178));
        }
    }

    @Override // X.InterfaceC139535dl
    public LiveEvent<Boolean> Ej() {
        return this.LL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC139535dl getApiComponent() {
        LJJLIIIJJIZ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC139535dl
    public void B4(boolean z) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.B4(z);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public void G70(boolean z) {
        if (z) {
            if (this.LLD != null) {
                return;
            }
            C6H7 c6h7 = this.LJLLL;
            if (c6h7 != null) {
                C6V4 c6v4 = new C6V4(550, c6h7.LJI());
                this.LLD = c6v4;
                LJJLJLI().LIZIZ(c6v4);
                return;
            }
            o.LJIJI("stickerService");
            throw null;
        }
        C6V4 c6v42 = this.LLD;
        if (c6v42 != null) {
            LJJLJLI().LIZ(c6v42);
            this.LLD = null;
        }
    }

    public final void LJJLIIIIJ(boolean z) {
        if (z) {
            Ll0().U2(true, false, true);
            InterfaceC142545ic Ll0 = Ll0();
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, C78688UuS.LJJIII(this));
            int LJJJJLI = C63081OpJ.LJJJJLI(C78688UuS.LJJIII(this)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(218));
            int LJLJJLL = LJLJJLL();
            AnonymousClass668.LIZIZ().LIZ();
            Ll0.oF(C140345f4.LIZ(LJIIIIZZ, LJJJJLI, LJJIIZ, LJLJJLL));
            return;
        }
        Ll0().U2(false, false, false);
        InterfaceC142545ic Ll02 = Ll0();
        int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
        int LJJJJLI2 = C63081OpJ.LJJJJLI(C78688UuS.LJJIII(this)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(218));
        int LJLJJLL2 = LJLJJLL();
        AnonymousClass668.LIZIZ().LIZ();
        Ll02.oF(C140345f4.LIZIZ(LIZIZ, LJJJJLI2, LJJIIZ2, LJLJJLL2, false, false, 960));
        InterfaceC153045zY LJJZZI = LJJZZI();
        if (LJJZZI == null) {
            return;
        }
        LJJZZI.LLJILJIL(true);
    }

    @Override // X.InterfaceC139535dl
    public List<C6QO> LLIIJLIL(EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LLIIJLIL(stickerType);
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC139535dl
    public void LLLILZJ(InterfaceC160026Pu listener) {
        o.LJIIIZ(listener, "listener");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LLLILZJ(listener);
        }
    }

    @Override // X.InterfaceC139535dl
    public void N8(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.N8(stickerModel);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public StickerModel P4(int i) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.P4(i);
        }
        o.LJIJI("stickerService");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public <T> T T9(EnumC157656Gr type) {
        o.LJIIIZ(type, "type");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 == null) {
            return null;
        }
        return (T) c6h7.T9(type);
    }

    @Override // X.InterfaceC139535dl
    public void Zp(int i) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LIZ(i, null);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public void e40(InterfaceC65784Pro<C76800UCe> cb) {
        o.LJIIIZ(cb, "cb");
        if (this.LJZI) {
            cb.invoke();
        } else {
            this.LJZ.add(new ARunnableS38S0100000_2(cb, (InterfaceC65784Pro<C76800UCe>) 108));
        }
    }

    @Override // X.InterfaceC139535dl
    public void g0(int i) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.g0(i);
            C139545dm.LIZ(this, null, null, 3);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public void gs(float f) {
        this.LJLJI.setAlpha(f);
    }

    @Override // X.InterfaceC139535dl
    public void mt(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LJFF(stickerModel.getId());
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public List<StickerModel> sk0(EnumC157656Gr type) {
        o.LJIIIZ(type, "type");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.LIZLLL(type);
        }
        o.LJIJI("stickerService");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public void xQ(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        if (this.LJLLL == null) {
            return;
        }
        if (stickerModel.isNotEmptyModel()) {
            C6H4.LIZ(LLLLIL().creativeModel.stickerModel, stickerModel);
        } else {
            C6H4.LIZIZ(LLLLIL().creativeModel.stickerModel, stickerModel);
        }
    }

    @Override // X.InterfaceC139535dl
    public void Mc(OSZ<Integer, Integer> osz, EnumC157656Gr enumC157656Gr) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 == null) {
            return;
        }
        List<StickerModel> LIZJ = c6h7.LIZJ();
        if (enumC157656Gr == null) {
            C6H4.LIZLLL(LLLLIL().creativeModel.stickerModel);
        } else {
            ArrayList arrayList = new ArrayList();
            for (StickerModel stickerModel : LIZJ) {
                if (stickerModel.getStickerType() == enumC157656Gr) {
                    arrayList.add(stickerModel);
                }
            }
            C6H4.LIZJ(LLLLIL().creativeModel.stickerModel, enumC157656Gr);
            LIZJ = arrayList;
        }
        for (StickerModel stickerModel2 : LIZJ) {
            if (osz != null) {
                stickerModel2 = stickerModel2.updateMediaSize(osz);
            }
            C6H4.LIZ(LLLLIL().creativeModel.stickerModel, stickerModel2);
        }
    }

    @Override // X.InterfaceC139535dl
    public void Zt(int i, List<? extends InterfaceC88472Yns<? super StickerModel, C76800UCe>> list) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LJII(i);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public StickerModel hG(StickerModel stickerModel, EnumC157656Gr type) {
        o.LJIIIZ(stickerModel, "stickerModel");
        o.LJIIIZ(type, "type");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            return c6h7.Q7(stickerModel, type, false);
        }
        o.LJIJI("stickerService");
        throw null;
    }

    @Override // X.InterfaceC139535dl
    public void pK(int i, int i2) {
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LJ().LIZ(i, i2);
        }
    }

    public C6H3(C82622Wbi diContainer, WM7 wm7, FrameLayout stickerRoot, FrameLayout stickerHigherContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerRoot, "stickerRoot");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = wm7;
        this.LJLJI = stickerRoot;
        this.LJLJJI = stickerHigherContainer;
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 471));
        this.LJLLI = new LinkedHashMap();
        this.LJLLILLLL = UCI.LJII(getDiContainer(), AnonymousClass643.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC139045cy.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), C6MS.class, null);
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 472));
        this.LJZ = new CopyOnWriteArrayList<>();
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LJZL = c29901Fi;
        this.LL = c29901Fi;
    }

    @Override // X.InterfaceC139535dl
    public void BZ(EnumC157656Gr type, C6QO c6qo, String createEditEnterMethod, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
        o.LJIIIZ(editDone, "editDone");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LJIIIIZZ(type, c6qo, createEditEnterMethod, editDone);
        } else {
            o.LJIJI("stickerService");
            throw null;
        }
    }

    @Override // X.InterfaceC139535dl
    public void Fp(boolean z, String guideText, int i, EnumC159956Pn pos, Integer num, Integer num2, Integer num3) {
        o.LJIIIZ(guideText, "guideText");
        o.LJIIIZ(pos, "pos");
        C6H7 c6h7 = this.LJLLL;
        if (c6h7 != null) {
            c6h7.LJ().LJFF(z, guideText, i, pos, num, num2, num3);
        }
    }
}

package X;

import Y.AObjectS84S0100000_2;
import Y.IDiS266S0100000_2;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.image.preview.ImageEditPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.5sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148785sg extends C143265jm<InterfaceC150615vd> implements InterfaceC150615vd {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLLLJLJLL;
    public final WMH LLLFZ;
    public final C152175y9 LLLI;
    public final FrameLayout LLLII;
    public final InterfaceC65784Pro<C76800UCe> LLLIIII;
    public final InterfaceC65784Pro<ImageEditPreviewViewModel> LLLIIIIL;
    public final InterfaceC115514g7 LLLIIIL;
    public final C5H3 LLLIIL;
    public final C5H3 LLLIILIL;
    public J9K LLLIL;
    public final InterfaceC115514g7 LLLILZ;
    public final InterfaceC115514g7 LLLILZJ;
    public final InterfaceC115514g7 LLLILZLLLI;
    public final InterfaceC115514g7 LLLIZZ;
    public final InterfaceC115514g7 LLLJ;
    public final InterfaceC115514g7 LLLJIL;
    public final InterfaceC115514g7 LLLJL;
    public final InterfaceC115514g7 LLLL;
    public C149095tB LLLLII;
    public InterfaceC151165wW LLLLIIIILLL;
    public int LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public long LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public final MutableLiveData<Boolean> LLLLL;
    public final InterfaceC115514g7 LLLLLIL;
    public final MutableLiveData<Runnable> LLLLLILLIL;
    public final MutableLiveData<C76800UCe> LLLLLJIL;

    private final void c() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("creation_id", LLLZIIL().getCreationId());
        c145995oB.LJI("shoot_way", LLLZIIL().mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLZIIL()));
        GXR.LIZ("click_filter_apply_all", c145995oB.LIZ);
    }

    private final void v() {
        C162496Zh.LIZ = true;
        C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
        C43005GuH.LIZIZ(LLLZIIL());
        if (!C41930Gcw.LJI()) {
            C43004GuG.LIZLLL(LLLZIIL());
        }
    }

    @Override // X.C143265jm
    public C5MG LJJLIIIJJIZ() {
        return null;
    }

    @Override // X.InterfaceC150615vd
    public void UL() {
        this.LLLLILI = false;
    }

    public final void e() {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        if (this.LLLLIILL) {
            str = "manual_click";
        } else {
            str = "auto";
        }
        c145995oB.LJI("enter_method", str);
        c145995oB.LJI("shoot_way", LLLZIIL().mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(LLLZIIL()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLZIIL()));
        c145995oB.LJI("creation_id", LLLZIIL().getCreationId());
        c145995oB.LIZ(LLLLZIL().getImageList().size(), "pic_cnt");
        c145995oB.LIZ(this.LLLLIIL + 1, "pic_location");
        GXR.LIZ("camera_multi_photo_swipe", c145995oB.LIZ);
    }

    static {
        TBT tbt = new TBT(C148785sg.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLLLLJLJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148785sg.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerScene;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/image/model/ImageAlbumData;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C148785sg.class, "autoCutAsyncRenderService", "getAutoCutAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0, c65351Pkp)};
    }

    private final Y50 LLLLLIL() {
        return (Y50) this.LLLLLIL.LIZ(this, LLLLLJLJLL[9]);
    }

    private final InterfaceC148865so LLLLLJIL() {
        return (InterfaceC148865so) this.LLLIZZ.LIZ(this, LLLLLJLJLL[4]);
    }

    private final InterfaceC146235oZ LLLLLJLJLL() {
        return (InterfaceC146235oZ) this.LLLILZ.LIZ(this, LLLLLJLJLL[1]);
    }

    private final VideoPublishEditModel LLLLLL() {
        return (VideoPublishEditModel) this.LLLILZLLLI.LIZ(this, LLLLLJLJLL[3]);
    }

    private final C63C LLLLLLIL() {
        return (C63C) this.LLLILZJ.LIZ(this, LLLLLJLJLL[2]);
    }

    private final C5XM LLLLLZIL() {
        return (C5XM) this.LLLJIL.LIZ(this, LLLLLJLJLL[6]);
    }

    private final ImageAlbumData LLLLZIL() {
        return (ImageAlbumData) this.LLLJ.LIZ(this, LLLLLJLJLL[5]);
    }

    private final InterfaceC148975sz LLLLZLL() {
        return (InterfaceC148975sz) this.LLLIILIL.getValue();
    }

    private final C151065wM LLLLZLLIL() {
        return (C151065wM) this.LLLJL.LIZ(this, LLLLLJLJLL[7]);
    }

    private final void LLZLL() {
        Context requireSceneContext = this.LLLFZ.requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "parentScene.requireSceneContext()");
        u(new J9K(requireSceneContext));
        if (LLLZIIL().isMusic() == 1) {
            J9K LLLZLL = LLLZLL();
            String mMusicPath = LLLZIIL().getMMusicPath();
            o.LJIIIIZZ(mMusicPath, "mModel.mMusicPath");
            LLLZLL.LIZJ(LLLZIIL().musicVolume / 2, mMusicPath);
        }
    }

    private final void LLZZJLIL() {
        final int maxImageHeight = LLLLZIL().getMaxImageHeight();
        final int maxImageWidth = LLLLZIL().getMaxImageWidth();
        final CreativeInfo creativeInfo = LLLZIIL().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
        this.LLLLIIIILLL = new InterfaceC151165wW(maxImageHeight, maxImageWidth, creativeInfo) { // from class: X.5wn
            public final LinkedList<C151225wc> LIZ;
            public final ArrayList<C151325wm> LIZIZ;
            public InterfaceC151265wg LIZJ;

            @Override // X.InterfaceC151165wW
            public final void release() {
                SurfaceHolder holder;
                this.LIZJ = null;
                Iterator<C151325wm> it = this.LIZIZ.iterator();
                while (it.hasNext()) {
                    C151325wm next = it.next();
                    TEImageInterface tEImageInterface = next.LJII;
                    if (tEImageInterface != null) {
                        tEImageInterface.destoryVEImage();
                    }
                    SurfaceView surfaceView = next.LIZ;
                    if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                        holder.removeCallback(next.LIZIZ);
                    }
                    next.LIZ = null;
                    next.LJII = null;
                    C151365wq.LIZIZ(next);
                }
            }

            @Override // X.InterfaceC151165wW
            public final void LIZ(C151225wc c151225wc) {
                InterfaceC151265wg interfaceC151265wg = this.LIZJ;
                if (interfaceC151265wg != null) {
                    interfaceC151265wg.LIZ(c151225wc);
                    this.LIZJ = null;
                } else {
                    this.LIZ.offer(c151225wc);
                }
            }

            @Override // X.InterfaceC151165wW
            public final void LIZIZ(C151075wN c151075wN) {
                C151225wc poll = this.LIZ.poll();
                if (poll == null) {
                    this.LIZJ = c151075wN;
                } else {
                    c151075wN.LIZ(poll);
                }
            }

            @Override // X.InterfaceC151165wW
            public final void LIZJ(List<SrcImageInfo> list) {
                if (((ArrayList) list).isEmpty()) {
                    return;
                }
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C151375wr(list, null), 2);
            }

            {
                EnumC151395wt enumC151395wt;
                EnumC151395wt enumC151395wt2;
                LinkedList<C151225wc> linkedList = new LinkedList<>();
                this.LIZ = linkedList;
                ArrayList<C151325wm> arrayList = new ArrayList<>();
                this.LIZIZ = arrayList;
                if (C151435wx.LIZIZ().getEnableVEImageCacheManager()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C62850Ola.LJ().LJIIIZ(creativeInfo, EnumC43649HBd.PHOTO_MODE, "ve_cache", true).getPath());
                    LIZ.append(File.separator);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    boolean enableVEPreDecode = C151435wx.LIZIZ().getEnableVEPreDecode();
                    boolean enableVEOptPreDecodeDir = C151435wx.LIZIZ().getEnableVEOptPreDecodeDir();
                    int veLeftCacheLen = C151435wx.LIZIZ().getVeLeftCacheLen();
                    int veRightCacheLen = C151435wx.LIZIZ().getVeRightCacheLen();
                    int veCacheType0 = C151435wx.LIZIZ().getVeCacheType0();
                    if (veCacheType0 != 1) {
                        if (veCacheType0 != 2) {
                            if (veCacheType0 != 3) {
                                enumC151395wt = EnumC151395wt.NoCache;
                            } else {
                                enumC151395wt = EnumC151395wt.DiskCache;
                            }
                        } else {
                            enumC151395wt = EnumC151395wt.CPUCache;
                        }
                    } else {
                        enumC151395wt = EnumC151395wt.GPUCache;
                    }
                    int veCacheType1 = C151435wx.LIZIZ().getVeCacheType1();
                    if (veCacheType1 != 1) {
                        if (veCacheType1 != 2) {
                            if (veCacheType1 != 3) {
                                enumC151395wt2 = EnumC151395wt.NoCache;
                            } else {
                                enumC151395wt2 = EnumC151395wt.DiskCache;
                            }
                        } else {
                            enumC151395wt2 = EnumC151395wt.CPUCache;
                        }
                    } else {
                        enumC151395wt2 = EnumC151395wt.GPUCache;
                    }
                    C151365wq.LIZ = new C151595xD(LIZIZ, enableVEPreDecode, enableVEOptPreDecodeDir, veLeftCacheLen, veRightCacheLen, enumC151395wt, enumC151395wt2);
                }
                C151325wm c151325wm = new C151325wm(0);
                TEImageInterface.nativeEnableOpenGL3(true);
                C151325wm.LJII(c151325wm, maxImageWidth, maxImageHeight, C151365wq.LIZ(c151325wm));
                TEImageInterface tEImageInterface = c151325wm.LJII;
                if (tEImageInterface != null) {
                    tEImageInterface.enableMmap(true);
                }
                TEImageInterface tEImageInterface2 = c151325wm.LJII;
                if (tEImageInterface2 != null) {
                    tEImageInterface2.enableRenderAutomation(false);
                }
                arrayList.add(c151325wm);
                linkedList.offer(new C151225wc(c151325wm));
            }
        };
        if (C151435wx.LIZIZ().getEnableVEImageCacheManager()) {
            InterfaceC151165wW interfaceC151165wW = this.LLLLIIIILLL;
            if (interfaceC151165wW != null) {
                List<SingleImageData> imageList = LLLLZIL().getImageList();
                ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
                Iterator<SingleImageData> it = imageList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSrcImageInfo());
                }
                interfaceC151165wW.LIZJ(arrayList);
            } else {
                o.LJIJI("veImageManager");
                throw null;
            }
        }
        List<StickerItemModel> LLZLLIL = LLZLLIL();
        CreativeInfo creativeInfo2 = LLLZIIL().creativeInfo;
        o.LJIIIIZZ(creativeInfo2, "mModel.creativeInfo");
        ImageAlbumData LLLLZIL = LLLLZIL();
        WMH wmh = this.LLLFZ;
        InterfaceC151165wW interfaceC151165wW2 = this.LLLLIIIILLL;
        if (interfaceC151165wW2 != null) {
            C149095tB c149095tB = new C149095tB(creativeInfo2, LLLLZIL, wmh, interfaceC151165wW2, this.LLLIIII, getDiContainer(), LLZLLIL);
            this.LLLLII = c149095tB;
            this.LLLI.setAdapter(c149095tB);
            this.LLLI.setOffscreenPageLimit(1);
            this.LLLI.setOnViewPagerClickListener(new AqS168S0100000_2(this, 72));
            this.LLLI.LJFF(new IDiS266S0100000_2(this, 1));
            return;
        }
        o.LJIJI("veImageManager");
        throw null;
    }

    @Override // X.InterfaceC150615vd
    public void L() {
        this.LLLLLJIL.setValue(C76800UCe.LIZ);
    }

    public final C6XL LLLZ() {
        return (C6XL) this.LLLIIL.getValue();
    }

    public final VideoPublishEditModel LLLZIIL() {
        return (VideoPublishEditModel) this.LLLIIIL.LIZ(this, LLLLLJLJLL[0]);
    }

    public final J9K LLLZLL() {
        J9K j9k = this.LLLIL;
        if (j9k != null) {
            return j9k;
        }
        o.LJIJI("musicPlayer");
        throw null;
    }

    public final AbstractC42651GoZ LLLZLZ() {
        return (AbstractC42651GoZ) this.LLLL.LIZ(this, LLLLLJLJLL[8]);
    }

    @Override // X.InterfaceC150615vd
    public void aa() {
        C149095tB c149095tB = this.LLLLII;
        if (c149095tB != null) {
            c149095tB.LJJIII(false);
        } else {
            o.LJIJI("adapter");
            throw null;
        }
    }

    @Override // X.InterfaceC150615vd
    public void j1() {
        C149095tB c149095tB = this.LLLLII;
        if (c149095tB != null) {
            c149095tB.LJJIII(true);
        } else {
            o.LJIJI("adapter");
            throw null;
        }
    }

    private final void LLLZZ() {
        LLZZJLIL();
        LLZLL();
        LLZ();
        v();
    }

    private final void LLZ() {
        DM().removeObservers(this);
        DM().observe(this, new AObjectS84S0100000_2(this, 16));
        Lo0().observe(this, new AObjectS84S0100000_2(this, 17));
        tZ().observe(this, new AObjectS84S0100000_2(this, 18));
        ul().observe(this, new AObjectS84S0100000_2(this, 19));
    }

    private final List<StickerItemModel> LLZLLIL() {
        if (LLLLLL().creativeModel.onThisDayData.isFromOnThisDay() && !LLLLLL().creativeModel.onThisDayData.getLoadedSticker()) {
            LLLLLL().creativeModel.onThisDayData.setLoadedSticker(true);
            List<TextStickerData> LIZIZ = new AnonymousClass658(LLLLLL().creativeModel.onThisDayData.getCreateTime(), getActivity(), this).LIZIZ();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
            int i = 0;
            for (TextStickerData textStickerData : LIZIZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(C151525x6.LJFF(textStickerData, i));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.C143265jm
    public int LLJJIJI() {
        C5J1 c5j1;
        C122034qd LJJI;
        InterfaceC126684y8 interfaceC126684y8;
        int LLJJIJI = super.LLJJIJI();
        if (C5MK.LJIIIIZZ) {
            Y50 LLLLLIL = LLLLLIL();
            InterfaceC153045zY LJLIIL = LJLIIL();
            if (LJLIIL != null && (LJJI = C17N.LJJI(LJLIIL)) != null && (interfaceC126684y8 = LJJI.LJIIJJI) != null) {
                c5j1 = interfaceC126684y8.V8();
            } else {
                c5j1 = null;
            }
            LLLLLIL.LIZIZ(c5j1);
        }
        return LLJJIJI;
    }

    public final void g() {
        C151065wM LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL != null) {
            boolean autoEnhanceOn = LLLLZIL().getAutoEnhanceOn();
            C151325wm LIZIZ = LLLLZLLIL.LIZ.LIZIZ();
            if (LIZIZ != null) {
                TEImageInterface tEImageInterface = LIZIZ.LJII;
                if (tEImageInterface != null) {
                    tEImageInterface.enableLensHdr(autoEnhanceOn);
                }
                LIZIZ.LJ(null, true);
            }
        }
        C151055wL item = getItem(this.LLLLIIL - 1);
        if (item != null) {
            item.LLJJIJIIJIL(LLLLZIL().getAutoEnhanceOn());
        }
        C151055wL item2 = getItem(this.LLLLIIL + 1);
        if (item2 != null) {
            item2.LLJJIJIIJIL(LLLLZIL().getAutoEnhanceOn());
        }
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLLZZ();
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LLLZLL().LIZLLL();
        InterfaceC151165wW interfaceC151165wW = this.LLLLIIIILLL;
        if (interfaceC151165wW != null) {
            interfaceC151165wW.release();
        } else {
            o.LJIJI("veImageManager");
            throw null;
        }
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        LLLZLL().LIZIZ();
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (!LLLLZLL().LLIIIJ()) {
            DM().setValue(C5MM.LIZ());
        }
        this.LLLLIL = System.currentTimeMillis();
        this.LLLLILI = true;
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        LLLZLL().LIZIZ();
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public void x8() {
        SingleImageData singleImageData;
        ImageFilterInfo filterInfo;
        int i;
        FilterBean filterBean;
        FilterBean filterBean2;
        c();
        C151065wM LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL == null || (singleImageData = LLLLZLLIL.LIZIZ) == null || (filterInfo = singleImageData.getFilterInfo()) == null) {
            return;
        }
        if (ujb.o.LJJJJJL(filterInfo.getFilterId())) {
            i = R.string.jl3;
        } else {
            i = R.string.jkx;
        }
        C78920UyC.LIZLLL(i, getActivity(), 1028);
        for (SingleImageData singleImageData2 : LLLLZIL().getImageList()) {
            if (!singleImageData2.getFilterInfo().isSameFilter(filterInfo)) {
                ImageFilterInfo filterInfo2 = singleImageData2.getFilterInfo();
                filterInfo2.copy(filterInfo);
                C151065wM LLLLZLLIL2 = LLLLZLLIL();
                if (LLLLZLLIL2 != null) {
                    filterBean = LLLLZLLIL2.LJ;
                } else {
                    filterBean = null;
                }
                boolean isComposer = filterInfo2.isComposer();
                String id = singleImageData2.getId();
                if (id == null) {
                    id = singleImageData2.getSrcImageInfo().getPath();
                }
                filterInfo2.setCompareKey(C148805si.LIZ(filterBean, isComposer, id));
                singleImageData2.getFilterInfo().setNeedRender(true);
                C151065wM LLLLZLLIL3 = LLLLZLLIL();
                if (LLLLZLLIL3 != null && (filterBean2 = LLLLZLLIL3.LJ) != null) {
                    filterBean2.setCompareKey(singleImageData2.getFilterInfo().getCompareKey());
                    setFilterIntensity(filterBean2, filterInfo.getFilterIntensityRatio());
                }
            }
        }
        m(this.LLLLIIL);
    }

    @Override // X.InterfaceC150615vd
    public MutableLiveData<Runnable> L80() {
        return this.LLLLLILLIL;
    }

    @Override // X.InterfaceC150615vd
    public LiveData<C76800UCe> N() {
        return this.LLLLLJIL;
    }

    @Override // X.InterfaceC150615vd
    public int eo() {
        return this.LLLLIIL;
    }

    @Override // X.InterfaceC150615vd
    public FrameLayout pi0() {
        return this.LLLII;
    }

    @Override // X.InterfaceC150615vd
    public MutableLiveData<Boolean> ul() {
        return this.LLLLL;
    }

    private final float LLLLZI(FilterBean filterBean) {
        if (this.LJLJI.LIZ.invoke().booleanValue()) {
            if (Nm().getValue() != null && v50().getValue() != null) {
                InterfaceC148845sm value = Nm().getValue();
                o.LJI(value);
                InterfaceC122704ri value2 = v50().getValue();
                o.LJI(value2);
                float LIZJ = TML.LIZJ(filterBean, value, value2);
                if (LIZJ != -1.0f) {
                    return LIZJ;
                }
            }
            return 0.8f;
        }
        return 1.0f;
    }

    private final boolean LLZZLLIL(MotionEvent motionEvent) {
        RectF LJIIZILJ = C1JI.LJIIZILJ(this.LLLI);
        LJIIZILJ.top += C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
        LJIIZILJ.bottom -= C7MY.LIZIZ(58);
        if (C90193gN.LIZ()) {
            LJIIZILJ.left += O6R.LJJIIZ(C32151Nz.LJIIZILJ(110));
        } else {
            LJIIZILJ.right -= O6R.LJJIIZ(C32151Nz.LJIIZILJ(110));
        }
        return LJIIZILJ.contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    private final void m(int i) {
        C151055wL item = getItem(i - 1);
        if (item != null) {
            item.LLJJIJIL();
        }
        C151055wL item2 = getItem(i + 1);
        if (item2 != null) {
            item2.LLJJIJIL();
        }
    }

    @Override // X.C143265jm
    public void LJJLIIIIJ(C140415fB c140415fB) {
        FilterBean filterBean;
        boolean z;
        if (c140415fB == null || (filterBean = c140415fB.LJLILLLLZI) == null) {
            return;
        }
        if (C44659Hfr.LJ(filterBean)) {
            z = true;
        } else {
            z = false;
        }
        FilterBean filterBean2 = c140415fB.LJLILLLLZI;
        if (filterBean2 != null) {
            String id = ((SingleImageData) ListProtector.get(LLLLZIL().getImageList(), this.LLLLIIL)).getId();
            if (id == null) {
                id = ((SingleImageData) ListProtector.get(LLLLZIL().getImageList(), this.LLLLIIL)).getSrcImageInfo().getPath();
            }
            filterBean2.setCompareKey(C148805si.LIZ(filterBean2, z, id));
        }
        if (z) {
            LJJLI(c140415fB.LJLILLLLZI, c140415fB.LJLJJI);
        } else {
            C151065wM LLLLZLLIL = LLLLZLLIL();
            if (LLLLZLLIL != null) {
                FilterBean filterBean3 = c140415fB.LJLILLLLZI;
                o.LJI(filterBean3);
                FilterBean filterBean4 = c140415fB.LJLILLLLZI;
                o.LJI(filterBean4);
                LLLLZLLIL.LIZIZ(LLLLZI(filterBean4), filterBean3, true);
            }
        }
        C151065wM LLLLZLLIL2 = LLLLZLLIL();
        if (LLLLZLLIL2 == null) {
            return;
        }
        LLLLZLLIL2.LJFF = true;
    }

    @Override // X.C143265jm
    public float LJJLJLI(String filterPath) {
        TEImageInterface tEImageInterface;
        Float valueOf;
        o.LJIIIZ(filterPath, "filterPath");
        C151065wM LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL == null) {
            return 0.0f;
        }
        C151035wJ c151035wJ = LLLLZLLIL.LIZ;
        c151035wJ.getClass();
        C151325wm LIZIZ = c151035wJ.LIZIZ();
        if (LIZIZ == null || (tEImageInterface = LIZIZ.LJII) == null || (valueOf = Float.valueOf(tEImageInterface.getColorFilterIntensity(filterPath))) == null) {
            return 0.0f;
        }
        return valueOf.floatValue();
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public void N6(boolean z) {
        C151065wM LLLLZLLIL = LLLLZLLIL();
        if (LLLLZLLIL != null) {
            C151065wM.LIZLLL(LLLLZLLIL, true, 1);
        }
    }

    @Override // X.InterfaceC150615vd
    public C151055wL getItem(int i) {
        if (i >= 0) {
            if (this.LLLLII != null) {
                if (i <= r0.getCount() - 1) {
                    C149095tB c149095tB = this.LLLLII;
                    if (c149095tB != null) {
                        WMH wmh = (WMH) ((LinkedHashMap) c149095tB.LJLLILLLL).get(Integer.valueOf(i));
                        if (!(wmh instanceof C151055wL)) {
                            return null;
                        }
                        return (C151055wL) wmh;
                    }
                    o.LJIJI("adapter");
                    throw null;
                }
            } else {
                o.LJIJI("adapter");
                throw null;
            }
        }
        return null;
    }

    public final boolean n(MotionEvent motionEvent) {
        InterfaceC148865so LLLLLJIL;
        if (qF()) {
            LLLLLJLJLL().wU(false);
            return true;
        }
        C63C LLLLLLIL = LLLLLLIL();
        if ((LLLLLLIL != null && LLLLLLIL.LLLI()) || !C44384HbQ.LJJIJLIJ(LLLZIIL()) || (LLLLLJIL = LLLLLJIL()) == null || LLLLLJIL.jw() || !LLZZLLIL(motionEvent)) {
            return false;
        }
        C63C LLLLLLIL2 = LLLLLLIL();
        if (LLLLLLIL2 != null) {
            LLLLLLIL2.LLLL();
        }
        H8F.LJJIIZI(LLLZIIL(), "tap_anywhere", 0, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        return true;
    }

    public final void u(J9K j9k) {
        o.LJIIIZ(j9k, "<set-?>");
        this.LLLIL = j9k;
    }

    @Override // X.C143265jm, X.InterfaceC143655kP
    public boolean x70(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        if (C78685UuP.LJJJZ(params.mPath)) {
            J9K LLLZLL = LLLZLL();
            String str = params.mPath;
            o.LJIIIIZZ(str, "params.mPath");
            LLLZLL.LIZJ(params.mVolume / 2, str);
        } else {
            LLLZLL().LIZLLL();
        }
        C5XM LLLLLZIL = LLLLLZIL();
        if (LLLLLZIL != null) {
            LLLLLZIL.U70(C78685UuP.LJJJZ(params.mPath));
            return true;
        }
        return true;
    }

    private final void setFilterIntensity(FilterBean setStoreIntensity, float f) {
        InterfaceC148845sm value;
        InterfaceC122704ri value2;
        if (!this.LJLJI.LIZ.invoke().booleanValue() || (value = Nm().getValue()) == null || (value2 = v50().getValue()) == null) {
            return;
        }
        o.LJIIIZ(setStoreIntensity, "$this$setStoreIntensity");
        value.LIZIZ(setStoreIntensity, TML.LIZLLL(setStoreIntensity, f, value2));
    }

    @Override // X.C143265jm
    public String LJJLI(FilterBean filterBean, String str) {
        C151065wM LLLLZLLIL;
        if (filterBean != null && (LLLLZLLIL = LLLLZLLIL()) != null) {
            LLLLZLLIL.LIZ(LLLLZI(filterBean), filterBean, true);
        }
        return null;
    }

    @Override // X.InterfaceC150615vd
    public void om(List<SingleImageData> newImageList, List<Integer> changeIndexList) {
        o.LJIIIZ(newImageList, "newImageList");
        o.LJIIIZ(changeIndexList, "changeIndexList");
        Iterator<Integer> it = changeIndexList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            ArrayList LIZ = C125694wX.LIZ(LLLLZIL().getImageList());
            if (LIZ == null) {
                LIZ = new ArrayList(LLLLZIL().getImageList());
            }
            ListProtector.set(LIZ, intValue, ListProtector.get(newImageList, intValue));
            LLLLZIL().setImageList(LIZ);
        }
        C149095tB c149095tB = this.LLLLII;
        if (c149095tB != null) {
            List<SingleImageData> newData = LLLLZIL().getImageList();
            o.LJIIIZ(newData, "newData");
            c149095tB.LJLL = newData;
            c149095tB.LJLLI = changeIndexList;
            c149095tB.notifyDataSetChanged();
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C148785sg(WMH parentScene, C82622Wbi diContainer, VEPreviewParams previewParams, InterfaceC88472Yns<? super C140815fp, C76800UCe> interfaceC88472Yns, C152175y9 viewPager, FrameLayout frameLayout, InterfaceC65784Pro<C76800UCe> onImageClickListener) {
        super(diContainer, previewParams, interfaceC88472Yns, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(previewParams, "previewParams");
        o.LJIIIZ(viewPager, "viewPager");
        o.LJIIIZ(onImageClickListener, "onImageClickListener");
        this.LLLFZ = parentScene;
        this.LLLI = viewPager;
        this.LLLII = frameLayout;
        this.LLLIIII = onImageClickListener;
        this.LLLIIIIL = C148795sh.LJLIL;
        this.LLLIIIL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLLIIL = C269113v.LIZ(this, C6XL.class);
        this.LLLIILIL = C269113v.LIZ(this, InterfaceC148975sz.class);
        this.LLLILZ = UCI.LJI(getDiContainer(), InterfaceC146235oZ.class, null);
        this.LLLILZJ = new C148765se(this);
        this.LLLILZLLLI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLLIZZ = UCI.LJII(getDiContainer(), InterfaceC148865so.class, null);
        this.LLLJ = UCI.LJI(getDiContainer(), ImageAlbumData.class, null);
        this.LLLJIL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LLLJL = new InterfaceC115514g7() { // from class: X.5p6
            @Override // X.InterfaceC115514g7
            public final T LIZ(Object obj, InterfaceC74236TBo<?> interfaceC74236TBo) {
                o.LJIIIZ(obj, "<anonymous parameter 0>");
                o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
                InterfaceC151215wb interfaceC151215wb = (InterfaceC151215wb) InterfaceC135635Tz.this.getDiContainer().LJIIIIZZ(null, InterfaceC151215wb.class);
                if (interfaceC151215wb == null) {
                    return null;
                }
                return (T) interfaceC151215wb.br0(C151065wM.class);
            }
        };
        this.LLLL = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LLLLILI = true;
        this.LLLLL = new MutableLiveData<>();
        this.LLLLLIL = UCI.LJI(getDiContainer(), Y50.class, null);
        this.LLLLLILLIL = new MutableLiveData<>();
        this.LLLLLJIL = new MutableLiveData<>();
    }

    public /* synthetic */ C148785sg(WMH wmh, C82622Wbi c82622Wbi, VEPreviewParams vEPreviewParams, InterfaceC88472Yns interfaceC88472Yns, C152175y9 c152175y9, FrameLayout frameLayout, InterfaceC65784Pro interfaceC65784Pro, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, vEPreviewParams, (i & 8) != 0 ? null : interfaceC88472Yns, c152175y9, frameLayout, interfaceC65784Pro);
    }
}

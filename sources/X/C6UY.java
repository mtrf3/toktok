package X;

import Y.AObjectS84S0100000_2;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6UY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UY extends AbstractC29891Fh<InterfaceC161186Ug> implements InterfaceC161186Ug, InterfaceC135635Tz {
    public static final C161196Uh LJLLJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.6Uh] */
    static {
        TBT tbt = new TBT(C6UY.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, new TBT(C6UY.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0), new TBT(C6UY.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new TBT(C6UY.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new TBT(C6UY.class, "albumDockerBarApi", "getAlbumDockerBarApi()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0), new TBT(C6UY.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0), new TBT(C6UY.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
        LJLLJ = new Object() { // from class: X.6Uh
        };
    }

    public InterfaceC161186Ug LJJLIIIJJI() {
        return this;
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJLJ.LIZ(this, LJLLL[6]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLJJL.LIZ(this, LJLLL[3]);
    }

    public final AddYoursStickerTopicRepo LJJLIIIIJ() {
        return (AddYoursStickerTopicRepo) this.LJLJLLL.getValue();
    }

    public final InterfaceC45889Hzh LJJLIIIJILLIZJL() {
        return (InterfaceC45889Hzh) this.LJLJJLL.LIZ(this, LJLLL[4]);
    }

    public final Keva LJJLIIIJLLLLLLLZ() {
        return (Keva) this.LJLL.getValue();
    }

    public final InterfaceC45979I2t LJJLIIJ() {
        return (InterfaceC45979I2t) this.LJLJJI.LIZ(this, LJLLL[2]);
    }

    @Override // X.InterfaceC161186Ug
    public C6SL LLLLLLZ() {
        return new C6SL() { // from class: X.6US
            @Override // X.C6SL
            public final boolean LIZLLL() {
                return V16.LJJIJ(C6UY.this.getShortVideoContext());
            }

            @Override // X.C6SL
            public final AddYoursStickerTopicRepo LJ() {
                return C6UY.this.LJJLIIIIJ();
            }

            @Override // X.C6SL
            public final int LJI() {
                if (V16.LJJIJ(C6UY.this.getShortVideoContext())) {
                    return R.string.hiw;
                }
                int LIZLLL = C226388uY.LIZLLL();
                if (LIZLLL == C6UU.ADD_YOURS.getValue() || LIZLLL != C6UU.POST_YOURS.getValue()) {
                    return R.string.bcp;
                }
                return R.string.bd4;
            }

            @Override // X.C6SL
            public final OSZ<Long, UrlModel> LIZ() {
                C44423Hc3 LJ = C73098SmU.LJ();
                if (LJ != null) {
                    String uid = LJ.getUid();
                    if (C78685UuP.LJJJZ(uid)) {
                        return new OSZ<>(Long.valueOf(CastLongProtector.parseLong(uid)), LJ.getAvatarThumb());
                    }
                }
                return null;
            }

            @Override // X.C6SL
            public final C6U1 LJFF() {
                return C6U2.LIZ(C226388uY.LIZIZ());
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            
                if (r1 == null) goto L9;
             */
            @Override // X.C6SL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r5, java.lang.String r6, boolean r7) {
                /*
                    r4 = this;
                    X.6UY r1 = X.C6UY.this
                    boolean r0 = r1.LJLLI
                    if (r0 == 0) goto L1f
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.ORZ.LJLLLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L19
                    return
                L19:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L21
                L1f:
                    java.lang.String r1 = "video_shoot_page"
                L21:
                    X.7au r2 = new X.7au
                    r2.<init>()
                    X.6UY r3 = X.C6UY.this
                    java.lang.String r0 = "enter_from"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.LJI()
                    java.lang.String r0 = "creation_id"
                    r2.LJI(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJI(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJI(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJI(r0, r6)
                    java.lang.String r0 = "from_title"
                    r2.LJI(r0, r5)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZLLL(r7, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZLLL(r1, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "enter_add_yours_edit_page"
                    X.GXR.LIZ(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6US.LIZIZ(java.lang.String, java.lang.String, boolean):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
            
                if (r1 == null) goto L9;
             */
            @Override // X.C6SL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(int r5, java.lang.String r6, boolean r7, java.lang.String r8, java.lang.String r9) {
                /*
                    r4 = this;
                    java.lang.String r0 = "inputMode"
                    kotlin.jvm.internal.o.LJIIIZ(r8, r0)
                    X.6UY r2 = X.C6UY.this
                    boolean r1 = r2.LJLLI
                    r0 = 0
                    if (r1 == 0) goto L27
                    r2.LJLLI = r0
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.ORZ.LJLLLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L21
                    return
                L21:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L29
                L27:
                    java.lang.String r1 = "video_shoot_page"
                L29:
                    boolean r0 = ujb.o.LJJJJJL(r6)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L99
                    int r0 = r6.length()
                    if (r0 <= 0) goto L99
                L38:
                    X.7au r2 = new X.7au
                    r2.<init>()
                    X.6UY r3 = X.C6UY.this
                    java.lang.String r0 = "enter_from"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.LJI()
                    java.lang.String r0 = "creation_id"
                    r2.LJI(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJI(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJI(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJI(r0, r9)
                    java.lang.String r0 = "save_title"
                    r2.LJI(r0, r6)
                    java.lang.String r0 = "input_mode"
                    r2.LJI(r0, r8)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZLLL(r7, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZLLL(r1, r0)
                    java.lang.String r0 = "is_operation_set"
                    r2.LIZLLL(r5, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "complete_add_yours_edit_page"
                    X.GXR.LIZ(r0, r1)
                L99:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6US.LIZJ(int, java.lang.String, boolean, java.lang.String, java.lang.String):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
            
                if (r1 == null) goto L9;
             */
            @Override // X.C6SL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
                /*
                    r4 = this;
                    java.lang.String r0 = "toTitle"
                    kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                    java.lang.String r0 = "clickMethod"
                    kotlin.jvm.internal.o.LJIIIZ(r8, r0)
                    X.6UY r1 = X.C6UY.this
                    boolean r0 = r1.LJLLI
                    if (r0 == 0) goto L29
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
                    java.util.List<com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras> r0 = r0.addYoursStickerExtras
                    java.lang.Object r0 = X.ORZ.LJLLLL(r0)
                    com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras r0 = (com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras) r0
                    if (r0 != 0) goto L23
                    return
                L23:
                    java.lang.String r1 = r0.getEnterFrom()
                    if (r1 != 0) goto L2b
                L29:
                    java.lang.String r1 = "video_shoot_page"
                L2b:
                    X.7au r2 = new X.7au
                    r2.<init>()
                    X.6UY r3 = X.C6UY.this
                    java.lang.String r0 = "enter_from"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.shootWay
                    java.lang.String r0 = "shoot_way"
                    r2.LJI(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    java.lang.String r1 = r0.LJI()
                    java.lang.String r0 = "creation_id"
                    r2.LJI(r0, r1)
                    java.lang.String r1 = "content_type"
                    java.lang.String r0 = "video"
                    r2.LJI(r1, r0)
                    java.lang.String r1 = "content_source"
                    java.lang.String r0 = "shoot"
                    r2.LJI(r1, r0)
                    java.lang.String r0 = "add_yours_enter_method"
                    r2.LJI(r0, r9)
                    java.lang.String r0 = "from_title"
                    r2.LJI(r0, r6)
                    java.lang.String r0 = "to_title"
                    r2.LJI(r0, r7)
                    java.lang.String r0 = "click_method"
                    r2.LJI(r0, r8)
                    java.lang.String r0 = "is_first_enter"
                    r2.LIZLLL(r10, r0)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
                    boolean r1 = r0.isDraft
                    java.lang.String r0 = "is_draft"
                    r2.LIZLLL(r1, r0)
                    java.lang.String r0 = "is_operation_set"
                    r2.LIZLLL(r5, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "click_add_yours_edit_page_icon"
                    X.GXR.LIZ(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6US.LJII(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
            }
        };
    }

    public final C6UV getInfiniStickerApi() {
        return (C6UV) this.LJLJI.LIZ(this, LJLLL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLILLLLZI.LIZ(this, LJLLL[0]);
    }

    public final InterfaceC82062WIo getToolbarApi() {
        return (InterfaceC82062WIo) this.LJLJL.LIZ(this, LJLLL[5]);
    }

    public final boolean LJJLIIIJJIZ() {
        if (getShortVideoContext().shootMode == 16) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC161186Ug
    public boolean bN() {
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) ORZ.LJLLLL(getShortVideoContext().creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras != null) {
            if (addYoursStickerExtras.getAutoEnterAlbum() || addYoursStickerExtras.getAutoEnterStickerEdit()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return;
        }
        if (getDiContainer().LIZIZ(C6UV.class)) {
            whenReadyOrThrowInternal(getDiContainer(), C6UV.class, new AqS168S0100000_2(this, 43));
        }
        if (!LJJLIIIJLLLLLLLZ().getBoolean("hasShownIcon", false) && getDiContainer().LIZIZ(InterfaceC82062WIo.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC82062WIo.class, new AqS168S0100000_2(this, 44));
        }
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS84S0100000_2(this, 2));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS84S0100000_2(this, 3));
        getRecordControlApi().Vh().LIZIZ(this, new AObjectS84S0100000_2(this, 4));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLI(false);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        boolean z;
        super.onResume();
        if (!getShortVideoContext().cameraComponentModel.isRetakeMode && this.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        cO(z);
    }

    @Override // X.InterfaceC161186Ug
    public void sp() {
        String str;
        List<C6QO> LLIIJLIL;
        C6QO c6qo;
        C6UV infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi == null || (LLIIJLIL = infiniStickerApi.LLIIJLIL(EnumC157656Gr.ADD_YOURS)) == null || (c6qo = (C6QO) ORZ.LJLLLL(LLIIJLIL)) == null) {
            AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) ORZ.LJLLLL(getShortVideoContext().creativeModel.stickerModel.addYoursStickerExtras);
            if (addYoursStickerExtras == null || (str = addYoursStickerExtras.getAddYoursEnterMethod()) == null) {
                str = "shoot_page_entrance";
            }
            C6UV infiniStickerApi2 = getInfiniStickerApi();
            if (infiniStickerApi2 != null) {
                infiniStickerApi2.xq0(EnumC157656Gr.ADD_YOURS, str, C161176Uf.LJLIL);
                return;
            }
            return;
        }
        cO(false);
        C6UV infiniStickerApi3 = getInfiniStickerApi();
        if (infiniStickerApi3 == null) {
            return;
        }
        infiniStickerApi3.Kn0(EnumC157656Gr.ADD_YOURS, c6qo.LJJLIIIJLJLI());
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC161186Ug getApiComponent() {
        LJJLIIIJJI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C6UY(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJI = UCI.LJII(getDiContainer(), C6UV.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), I3K.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC45889Hzh.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC82062WIo.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJLLL = C221108m2.LIZIZ(C6UO.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C161166Ue.LJLIL);
        this.LJLLILLLL = true;
    }

    public final void LJJLI(boolean z) {
        C78555UsJ.LJJJJIZL(getShortVideoContext());
        if (z) {
            C42315Gj9.LIZIZ("tool_performance_add_yours_record", C52467KiV.LIZIZ(), -1L);
        } else {
            C42315Gj9.LIZJ("tool_performance_add_yours_record");
        }
    }

    @Override // X.InterfaceC161186Ug
    public void Q(StickerModel model) {
        o.LJIIIZ(model, "model");
        C219208iy c219208iy = C219208iy.LIZIZ;
        c219208iy.LIZJ(C78688UuS.LJIJJ(this), c219208iy.LIZ(), new AqS133S0200000_2(model, this, 25));
    }

    @Override // X.InterfaceC161186Ug
    public void cO(boolean z) {
        C6UV infiniStickerApi;
        List<C6QO> LLIIJLIL;
        if ((z && getShortVideoContext().cameraComponentModel.isRetakeMode) || (infiniStickerApi = getInfiniStickerApi()) == null || (LLIIJLIL = infiniStickerApi.LLIIJLIL(EnumC157656Gr.ADD_YOURS)) == null || !(!LLIIJLIL.isEmpty())) {
            return;
        }
        ((C6QO) ListProtector.get(LLIIJLIL, 0)).setVisible(z);
    }
}

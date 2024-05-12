package X;

import Y.AObjectS84S0100000_2;
import Y.ARunnableS13S0300000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS2S0310000_2;
import Y.ARunnableS38S0100000_2;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6RZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RZ extends AbstractC48231ut<C6UV, C160406Rg, C160386Re, C160366Rc> implements C6UV, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC65784Pro<C160386Re> LJLLILLLL;
    public final InterfaceC65784Pro<C160366Rc> LJLLJ;
    public final CopyOnWriteArrayList<Runnable> LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public C6H7 LLFII;
    public final java.util.Map<EnumC157656Gr, InterfaceC88472Yns<StickerModel, C76800UCe>> LLFZ;
    public boolean LLI;

    public C6UV LJZI() {
        return this;
    }

    static {
        TBT tbt = new TBT(C6RZ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6RZ.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "recordAddYoursStickerApi", "getRecordAddYoursStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6RZ.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp)};
    }

    private final List<C159636Oh> LJLZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C159636Oh(EnumC157656Gr.ADD_YOURS, 0, true, false, false, true, false, (List) null, false, (String) null, new OSZ(Float.valueOf(0.6f), Float.valueOf(1.2f)), false, false, false, false, false, 127874));
        return arrayList;
    }

    private final InterfaceC45995I3j LLF() {
        return (InterfaceC45995I3j) this.LLD.LIZ(this, LLIFFJFJJ[7]);
    }

    private final HXE LLFFF() {
        return (HXE) this.LLF.LIZ(this, LLIFFJFJJ[8]);
    }

    private final InterfaceC160026Pu LLIIIL() {
        return new InterfaceC160026Pu() { // from class: X.6HE
            @Override // X.InterfaceC160026Pu
            public final void LJ(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJI(int i) {
            }

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
            public final void LJIL(int i) {
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
                C6H6.LIZJ(null, C6RZ.this.getShortVideoContext(), stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJFF(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H6.LIZJ(null, C6RZ.this.getShortVideoContext(), stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJII(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H6.LIZJ(null, C6RZ.this.getShortVideoContext(), stickerModel);
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
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIZILJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = C6RZ.this.LLFZ.get(stickerModel.getStickerType());
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(stickerModel);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJI(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZ(StickerModel stickerModel, boolean z) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILLIIL(StickerModel stickerModel, String str) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6H6.LIZLLL(null, C6RZ.this.getShortVideoContext(), stickerModel);
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJ(StickerModel stickerModel, int i) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }
        };
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLFF.LIZ(this, LLIFFJFJJ[9]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLLL.LIZ(this, LLIFFJFJJ[0]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLZ.LIZ(this, LLIFFJFJJ[2]);
    }

    private final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLLLLLL.LIZ(this, LLIFFJFJJ[1]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLFFF.LIZ(this, LLIFFJFJJ[10]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LL.LIZ(this, LLIFFJFJJ[6]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJZI.LIZ(this, LLIFFJFJJ[4]);
    }

    public final InterfaceC161186Ug LLIFFJFJJ() {
        return (InterfaceC161186Ug) this.LJZL.LIZ(this, LLIFFJFJJ[5]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJZ.LIZ(this, LLIFFJFJJ[3]);
    }

    @Override // X.C6UV
    public void yc() {
        if (this.LLFII == null || getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return;
        }
        C6H4.LIZLLL(getShortVideoContext().creativeModel.stickerModel);
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            Iterator<StickerModel> it = c6h7.LIZJ().iterator();
            while (it.hasNext()) {
                C6H4.LIZ(getShortVideoContext().creativeModel.stickerModel, it.next());
            }
            return;
        }
        o.LJIJI("stickerService");
        throw null;
    }

    private final void LLIIZ() {
        LiveEvent<C76800UCe> ES;
        getRecordControlApi().fb0().LIZLLL(this, new AObjectS84S0100000_2(this, 26));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS84S0100000_2(this, 27));
        getPlanCUIApiComponent().Sy().LIZLLL(this, new AObjectS84S0100000_2(this, 28));
        getPlanCUIApiComponent().Rd(new C160356Rb(this));
        InterfaceC45995I3j LLF = LLF();
        if (LLF != null && (ES = LLF.ES()) != null) {
            ES.LIZLLL(this, new AObjectS84S0100000_2(this, 29));
        }
        getPlanCUIApiComponent().pL().LIZLLL(this, new AObjectS84S0100000_2(this, 30));
        LLFFF().e2().LIZLLL(this, new AObjectS84S0100000_2(this, 31));
        C0IB<WS0> bottomTabIndexChangeEvent = getBottomTabApiComponent().getBottomTabIndexChangeEvent();
        if (bottomTabIndexChangeEvent != null) {
            bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS84S0100000_2(this, 32));
        }
    }

    public final RTY LLIILZL() {
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
            Resources resources = C78688UuS.LJIJJ(this).getResources();
            o.LJIIIIZZ(resources, "activity.resources");
            LIZ.append(C41532GRs.LIZIZ(LJ2, resources));
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            C44423Hc3 LJ3 = C73098SmU.LJ();
            Resources resources2 = C78688UuS.LJIJJ(this).getResources();
            o.LJIIIIZZ(resources2, "activity.resources");
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

    @Override // X.C6UV
    public void ai() {
        C6H4.LIZLLL(getShortVideoContext().creativeModel.stickerModel);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().bk0(this);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLL.clear();
        getRecordAdapterApi().bk0(null);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C160386Re> LJJLIIIJJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C160366Rc> LJJLIIIJJIZ() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LJZI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    private final void Ef0(WXA wxa) {
        getGestureApiComponent().ID(wxa, 6, 50);
    }

    @Override // X.C6UV
    public List<C6QO> LLIIJLIL(EnumC157656Gr stickerType) {
        o.LJIIIZ(stickerType, "stickerType");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            return c6h7.LLIIJLIL(stickerType);
        }
        return C61878OQg.INSTANCE;
    }

    public final void LLILZIL(boolean z) {
        C78928UyK.LIZIZ(z, false, false, getCameraApiComponent());
        getStickerApiComponent().lw(z);
        getPlanCUIApiComponent().kY(z, false);
    }

    @Override // X.C6UV
    public void LLLILZJ(InterfaceC160026Pu listener) {
        o.LJIIIZ(listener, "listener");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.LLLILZJ(listener);
        } else {
            this.LJLLL.add(new ARunnableS21S0200000_2(listener, this, 9));
        }
    }

    @Override // X.C6UV
    public void Ww(InterfaceC65784Pro<C76800UCe> cb) {
        o.LJIIIZ(cb, "cb");
        if (this.LLI) {
            cb.invoke();
        } else {
            this.LJLLL.add(new ARunnableS38S0100000_2(cb, (InterfaceC65784Pro<C76800UCe>) 36));
        }
    }

    @Override // X.C6UV
    public void show(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6RZ(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = C160376Rd.LJLIL;
        this.LJLLJ = new AqS152S0100000_2(this, 107);
        this.LJLLL = new CopyOnWriteArrayList<>();
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), InterfaceC161186Ug.class, null);
        this.LL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLD = UCI.LJII(getDiContainer(), InterfaceC45995I3j.class, null);
        this.LLF = UCI.LJI(getDiContainer(), HXE.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLFFF = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLFZ = new LinkedHashMap();
    }

    @Override // X.C6UV
    public void Id0(EnumC157656Gr type, InterfaceC88472Yns<? super StickerModel, C76800UCe> listener) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(listener, "listener");
        this.LLFZ.put(type, listener);
    }

    @Override // X.C6UV
    public void Kn0(EnumC157656Gr type, int i) {
        o.LJIIIZ(type, "type");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.LJFF(i);
        }
    }

    public final void LLILL(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.LLFII = new C6PV(C78688UuS.LJIJJ(this), frameLayout, frameLayout2, this, new InterfaceC159886Pg() { // from class: X.6P7
            @Override // X.InterfaceC159886Pg
            public final void LJ(boolean z) {
            }

            @Override // X.InterfaceC159886Pg
            public final C6OE LJFF() {
                return null;
            }

            @Override // X.InterfaceC159886Pg
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC159886Pg
            public final int LJIIL() {
                return 0;
            }

            @Override // X.InterfaceC159886Pg
            public final InterfaceC153045zY LIZIZ() {
                C135235Sl c135235Sl = new C135235Sl();
                ScheduledExecutorService LJ = C38995FSd.LJ();
                o.LJIIIIZZ(LJ, "getScheduledExecutor()");
                return new C5KX(c135235Sl, LJ).LJJ();
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZJ() {
                return new ArrayList();
            }

            @Override // X.InterfaceC159886Pg
            public final RTY LJI() {
                return C6RZ.this.LLIILZL();
            }

            @Override // X.InterfaceC159886Pg
            public final C6O5 LJIIIIZZ() {
                final C6RZ c6rz = C6RZ.this;
                return new C6O5() { // from class: X.6P8
                    @Override // X.C6O5
                    public final void LIZIZ(String fileName) {
                        o.LJIIIZ(fileName, "fileName");
                    }

                    @Override // X.C6O5
                    public final void LIZJ(C139595dr c139595dr) {
                    }

                    @Override // X.C6O5
                    public final void LJFF() {
                    }

                    @Override // X.C6O5
                    public final void LJI() {
                    }

                    @Override // X.C6O5
                    public final View LJ() {
                        return new View(C78688UuS.LJIL(C6RZ.this));
                    }

                    @Override // X.C6O5
                    public final Typeface LIZ(String fileName) {
                        o.LJIIIZ(fileName, "fileName");
                        Typeface DEFAULT = Typeface.DEFAULT;
                        o.LJIIIIZZ(DEFAULT, "DEFAULT");
                        return DEFAULT;
                    }

                    @Override // X.C6O5
                    public final void LIZLLL(String fileName) {
                        o.LJIIIZ(fileName, "fileName");
                    }
                };
            }

            @Override // X.InterfaceC159886Pg
            public final C6SL LJIIJ() {
                return C6RZ.this.LLIFFJFJJ().LLLLLLZ();
            }

            @Override // X.InterfaceC159886Pg
            public final float LIZLLL() {
                return LIZIZ().getDuration();
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZ() {
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILIIL(int i) {
                C6RZ.this.LLILZIL(false);
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILJJIL(int i) {
                C6RZ.this.LLILZIL(true);
            }
        }, new C159816Oz(null, LJLZ(), 15));
        Ef0(new WXA() { // from class: X.6P5
            @Override // X.WXB, X.WXG
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJJIIZI(motionEvent);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LJJIZ(float f) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJJIZ(f);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LJJJ(MotionEvent motionEvent) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJJJ(motionEvent);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LJLI(C82537WaL c82537WaL) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJLI(c82537WaL);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LJLJI(float f) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJLJI(f);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final void LJLJJI(C82537WaL c82537WaL) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    c6h7.LJI().LJLJJI(c82537WaL);
                } else {
                    o.LJIJI("stickerService");
                    throw null;
                }
            }

            @Override // X.WXB, X.WXG
            public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LLLLLLLZIL(c82536WaK);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LLLLLLZ(float f) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LLLLLLZ(f);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onDown(MotionEvent motionEvent) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onDown(motionEvent);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onScale(scaleGestureDetector);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onScaleBegin(scaleGestureDetector);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onSingleTapConfirmed(motionEvent);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().LJJLIL(c82537WaL, f, f2);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onFling(motionEvent, motionEvent2, f, f);
                }
                o.LJIJI("stickerService");
                throw null;
            }

            @Override // X.WXB, X.WXG
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C6H7 c6h7 = C6RZ.this.LLFII;
                if (c6h7 != null) {
                    return c6h7.LJI().onScroll(motionEvent, motionEvent2, f, f);
                }
                o.LJIJI("stickerService");
                throw null;
            }
        });
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.initService();
            LLLILZJ(LLIIIL());
            Iterator<Runnable> it = this.LJLLL.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.LJLLL.clear();
            this.LLI = true;
            LLIIZ();
            return;
        }
        o.LJIJI("stickerService");
        throw null;
    }

    @Override // X.C6UV
    public void P7(EnumC157656Gr stickerType, C6SE listener) {
        o.LJIIIZ(stickerType, "stickerType");
        o.LJIIIZ(listener, "listener");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.P7(stickerType, listener);
        } else {
            this.LJLLL.add(new ARunnableS13S0300000_2(this, stickerType, listener, 6));
        }
    }

    @Override // X.C6UV
    public void Q7(StickerModel stickerModel, EnumC157656Gr type, boolean z) {
        o.LJIIIZ(stickerModel, "stickerModel");
        o.LJIIIZ(type, "type");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.Q7(stickerModel, type, z);
        } else {
            this.LJLLL.add(new ARunnableS2S0310000_2(this, stickerModel, type, z, 0));
        }
    }

    @Override // X.C6UV
    public void cP(boolean z, String guideText, C6QO sticker) {
        o.LJIIIZ(guideText, "guideText");
        o.LJIIIZ(sticker, "sticker");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.LJ().LJFF(z, guideText, sticker.LJJLIIIJLJLI(), EnumC159956Pn.BOTTOM, null, null, null);
        }
    }

    @Override // X.C6UV
    public void o00(EnumC157656Gr type, C6QO sticker, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(editDone, "editDone");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.LJIIIIZZ(type, sticker, "", editDone);
        }
    }

    @Override // X.C6UV
    public void xq0(EnumC157656Gr type, String createEditEnterMethod, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
        o.LJIIIZ(editDone, "editDone");
        C6H7 c6h7 = this.LLFII;
        if (c6h7 != null) {
            c6h7.LJIIIIZZ(type, null, createEditEnterMethod, editDone);
        }
    }
}

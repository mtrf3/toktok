package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS89S0100000_14;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.shortvideo.LibraryContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS72S0000000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.WJz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82099WJz extends AbstractC29891Fh<InterfaceC82062WIo> implements InterfaceC82062WIo, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final List<C81975WFf> LJLJJI;
    public final C81975WFf LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final WK0 LJLJL;
    public C82068WIu LJLJLJ;
    public final InterfaceC45999I3n LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC82086WJm LJLLJ;
    public final ShortVideoContext LJLLL;
    public final InterfaceC45979I2t LJLLLL;
    public final I3X LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final ActivityC45651qj LLD;
    public final InterfaceC115514g7 LLF;
    public final boolean LLFF;
    public final InterfaceC82062WIo LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final InterfaceC29911Fj<Boolean> LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public final InterfaceC65784Pro<C76800UCe> LLIIIZ;
    public final InterfaceC65784Pro<Boolean> LLIIJI;

    @Override // X.InterfaceC82062WIo
    public void Js(boolean z) {
    }

    @Override // X.InterfaceC82062WIo
    public void M0(int i) {
    }

    public final void registerObservers() {
        C0IB<C08630Vn<Boolean>> fs;
        C29901Fi<T4S> c29901Fi;
        if (L2L.LIZIZ(getDiContainer())) {
            Float LIZ = this.LJLJLLL.Ht().LIZ();
            o.LJIIIIZZ(LIZ, "planCUIApiComponent.delayUIAlpha.value");
            if (LIZ.floatValue() < 1.0f) {
                View view = LLFFF().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                this.LJLJLLL.gC().LIZLLL(this, new AObjectS89S0100000_14(this, 386));
            }
            this.LJLJLLL.Ht().LIZIZ(this, new AObjectS89S0100000_14(this, 387));
        }
        if (C53557L0f.LIZ()) {
            if (this.LLFF) {
                WK2 LJLZ = LJLZ();
                InterfaceC65784Pro<C76800UCe> onUpCallback = this.LLIIIZ;
                InterfaceC65784Pro<Boolean> itemEnable = this.LLIIJI;
                LJLZ.getClass();
                o.LJIIIZ(onUpCallback, "onUpCallback");
                o.LJIIIZ(itemEnable, "itemEnable");
                GestureDetector gestureDetector = new GestureDetector(LJLZ.getSceneContext(), new WK6(LJLZ));
                RecyclerView recyclerView = LJLZ.LJLJL;
                if (recyclerView != null) {
                    recyclerView.setClickable(true);
                    RecyclerView recyclerView2 = LJLZ.LJLJL;
                    if (recyclerView2 != null) {
                        recyclerView2.LJIIJ(new WK1(itemEnable, LJLZ, gestureDetector, onUpCallback));
                    } else {
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            } else {
                WK3 LLFFF = LLFFF();
                InterfaceC65784Pro<C76800UCe> onUpCallback2 = this.LLIIIZ;
                InterfaceC65784Pro<Boolean> itemEnable2 = this.LLIIJI;
                LLFFF.getClass();
                o.LJIIIZ(onUpCallback2, "onUpCallback");
                o.LJIIIZ(itemEnable2, "itemEnable");
                GestureDetector gestureDetector2 = new GestureDetector(LLFFF.getSceneContext(), new WK5(LLFFF));
                RecyclerView recyclerView3 = LLFFF.LJLJJL;
                if (recyclerView3 != null) {
                    recyclerView3.setClickable(true);
                    RecyclerView recyclerView4 = LLFFF.LJLJJL;
                    if (recyclerView4 != null) {
                        recyclerView4.LJIIJ(new WK4(itemEnable2, LLFFF, gestureDetector2, onUpCallback2));
                    } else {
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            }
        }
        this.LJLJLLL.Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 388));
        this.LJLJLLL.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 389));
        this.LJLJLLL.Ie().LIZIZ(this, new AObjectS89S0100000_14(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        LJJZZIII().Hg0().LIZLLL(this, new AObjectS89S0100000_14(this, 391));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(I27.class, new AqS180S0100000_14(this, 248));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, I27.class);
            if (c0i6 != null) {
                I27 i27 = (I27) c0i6;
                i27.getMusicAdded().LIZLLL(this, new AObjectS89S0100000_14(this, 392));
                i27.getMusicCleared().LIZLLL(this, new AObjectS89S0100000_14(this, 376));
            }
        }
        C46193IAz LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL != null && (c29901Fi = LJLLILLLL.LLIFFJFJJ) != null) {
            c29901Fi.LIZLLL(this, new AObjectS89S0100000_14(this, 377));
        }
        if (!C45940I1g.LIZIZ() || I1S.LIZ()) {
            HJN.LJ.LIZLLL(this, this.LLI);
        }
        if (C45940I1g.LIZ() == 1 || I1S.LIZ()) {
            if (C53564L0m.LIZIZ()) {
                if (getDiContainer().LIZIZ(InterfaceC81454Vxy.class)) {
                    whenReadyOrThrowInternal(getDiContainer(), InterfaceC81454Vxy.class, new AqS72S0000000_14(1));
                }
            } else {
                C82622Wbi diContainer2 = getDiContainer();
                if (L2L.LIZ(diContainer2)) {
                    ((C1EP) diContainer2.LJ(C1EP.class, null)).m3(InterfaceC81454Vxy.class, new AqS72S0000000_14(0));
                } else {
                    C0I6 c0i62 = (C0I6) diContainer2.LJIIIIZZ(null, InterfaceC81454Vxy.class);
                    if (c0i62 != null) {
                        ((InterfaceC81454Vxy) c0i62).tU();
                    }
                }
            }
        }
        if (C45940I1g.LIZ() == 2 || C45940I1g.LIZ() == 3) {
            LJJZZI(new AqS164S0100000_14(this, 246));
        }
        I8W recordPermissionApi = getRecordPermissionApi();
        if (recordPermissionApi != null && (fs = recordPermissionApi.fs()) != null) {
            fs.LIZIZ(this, new AObjectS89S0100000_14(this, 380));
        }
        C82622Wbi diContainer3 = getDiContainer();
        if (L2L.LIZ(diContainer3)) {
            ((C1EP) diContainer3.LJ(C1EP.class, null)).m3(InterfaceC82199WNv.class, new AqS180S0100000_14(this, 249));
        } else {
            C0I6 c0i63 = (C0I6) diContainer3.LJIIIIZZ(null, InterfaceC82199WNv.class);
            if (c0i63 != null) {
                ((InterfaceC82199WNv) c0i63).lD().LIZLLL(this, new AObjectS89S0100000_14(this, 381));
            }
        }
        LJLJLJ().LJLJL.LIZLLL(this, new AObjectS89S0100000_14(this, 382));
        this.LJLLLL.getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 383));
        this.LJLLLLLL.Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 384));
        this.LJLLLLLL.aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 385));
    }

    static {
        TBT tbt = new TBT(C82099WJz.class, "recordModeLogicComponent", "getRecordModeLogicComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeLogicComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82099WJz.class, "recordStickerLogicComponent", "getRecordStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/RecordStickerLogicComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "recordCommentAndQuestionPanelApi", "getRecordCommentAndQuestionPanelApi()Lcom/ss/android/ugc/aweme/panel/CommentAndQuestionStickerPanelApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82099WJz.class, "recordAddYoursStickerApi", "getRecordAddYoursStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0, c65351Pkp)};
    }

    private final I37 LJJZZIII() {
        return (I37) this.LJLZ.LIZ(this, LLIIJLIL[3]);
    }

    private final InterfaceC161186Ug LJLJJL() {
        return (InterfaceC161186Ug) this.LLF.LIZ(this, LLIIJLIL[8]);
    }

    private final C45313HqP LJLJLJ() {
        return (C45313HqP) this.LJLL.LIZ(this, LLIIJLIL[0]);
    }

    private final WKE LJZI() {
        return (WKE) this.LLIIII.getValue();
    }

    private final boolean LLIIIL() {
        C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
        if (LJIIIZ == null || !LJIIIZ.LJLJJLL) {
            return false;
        }
        return true;
    }

    private final boolean LLIILZL() {
        Iterator<C81975WFf> it = this.LJLJL.getItems().iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next(), this.LJLJL.LJIIIZ())) {
                return false;
            }
        }
        return true;
    }

    private final boolean LLIIZ() {
        Iterator<C81975WFf> it = this.LJLJL.getItems().iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next(), this.LJLJL.LJFF())) {
                return false;
            }
        }
        return true;
    }

    private final void LLILL() {
        if (this.LLFF) {
            WK2 LJLZ = LJLZ();
            LJLZ.getClass();
            try {
                RecyclerView recyclerView = LJLZ.LJLJL;
                if (recyclerView != null) {
                    C0A2 layoutManager = recyclerView.getLayoutManager();
                    o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
                    RecyclerView recyclerView2 = LJLZ.LJLJL;
                    if (recyclerView2 != null) {
                        C0A2 layoutManager2 = recyclerView2.getLayoutManager();
                        o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int LLILLJJLI = ((LinearLayoutManager) layoutManager2).LLILLJJLI();
                        if (LLILL > LLILLJJLI) {
                            return;
                        }
                        while (true) {
                            RecyclerView recyclerView3 = LJLZ.LJLJL;
                            if (recyclerView3 != null) {
                                C0A2 layoutManager3 = recyclerView3.getLayoutManager();
                                o.LJII(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                View LJJIJIL = layoutManager3.LJJIJIL(LLILL);
                                if (LJJIJIL != null) {
                                    Rect rect = new Rect();
                                    if (LJJIJIL.getGlobalVisibleRect(rect) && rect.bottom - rect.top >= LJJIJIL.getHeight() && LLILL < LJLZ.LJLJI.getItems().size()) {
                                        C82098WJy.LIZIZ(LJLZ.LJLJJL, (C81975WFf) ListProtector.get(LJLZ.LJLJI.getItems(), LLILL));
                                    }
                                }
                                if (LLILL != LLILLJJLI) {
                                    LLILL++;
                                } else {
                                    return;
                                }
                            } else {
                                o.LJIJI("toolbarRecyclerView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            WK3 LLFFF = LLFFF();
            LLFFF.getClass();
            try {
                RecyclerView recyclerView4 = LLFFF.LJLJJL;
                if (recyclerView4 != null) {
                    C0A2 layoutManager4 = recyclerView4.getLayoutManager();
                    o.LJII(layoutManager4, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int LLILL2 = ((LinearLayoutManager) layoutManager4).LLILL();
                    RecyclerView recyclerView5 = LLFFF.LJLJJL;
                    if (recyclerView5 != null) {
                        C0A2 layoutManager5 = recyclerView5.getLayoutManager();
                        o.LJII(layoutManager5, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int LLILLJJLI2 = ((LinearLayoutManager) layoutManager5).LLILLJJLI();
                        if (LLILL2 > LLILLJJLI2) {
                            return;
                        }
                        while (true) {
                            RecyclerView recyclerView6 = LLFFF.LJLJJL;
                            if (recyclerView6 != null) {
                                C0A2 layoutManager6 = recyclerView6.getLayoutManager();
                                o.LJII(layoutManager6, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                View LJJIJIL2 = layoutManager6.LJJIJIL(LLILL2);
                                if (LJJIJIL2 != null) {
                                    Rect rect2 = new Rect();
                                    if (LJJIJIL2.getGlobalVisibleRect(rect2) && rect2.bottom - rect2.top >= LJJIJIL2.getHeight() && LLILL2 < LLFFF.LJLIL.getItems().size()) {
                                        C82098WJy.LIZIZ(LLFFF.LJLJI, (C81975WFf) ListProtector.get(LLFFF.LJLIL.getItems(), LLILL2));
                                    }
                                }
                                if (LLILL2 != LLILLJJLI2) {
                                    LLILL2++;
                                } else {
                                    return;
                                }
                            } else {
                                o.LJIJI("toolbarRecyclerView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("toolbarRecyclerView");
                        throw null;
                    }
                }
            } catch (IndexOutOfBoundsException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJZL.LIZ(this, LLIIJLIL[6]);
    }

    @Override // X.InterfaceC82062WIo
    public void A40() {
        WK0 wk0 = this.LJLJL;
        ActivityC45651qj activityC45651qj = this.LLD;
        ShortVideoContext shortVideoContext = this.LJLLL;
        C82068WIu c82068WIu = this.LJLJLJ;
        uK();
        wk0.LJLLLL(WJZ.LIZLLL(activityC45651qj, shortVideoContext, c82068WIu, getItemCount()));
    }

    public final void LJJLI() {
        C81975WFf LJIIIZ;
        C81975WFf LJII;
        C81975WFf LJIIIZ2;
        ShortVideoContext shortVideoContext = this.LJLLL;
        if (!shortVideoContext.isDuetMode && !shortVideoContext.LJJJI()) {
            C81975WFf LJII2 = this.LJLJL.LJII();
            if (LJII2 != null) {
                LLFF(LJII2);
            }
            if (!V16.LJJLIIIJILLIZJL(this.LJLLL) && ((!C78685UuP.LJJJZ(this.LJLLL.creativeModel.musicBuzModel.musicPath) || !this.LJLLL.cameraComponentModel.isRetakeMode || !WJR.LIZ().enableMicButton) && (LJIIIZ2 = this.LJLJL.LJIIIZ()) != null)) {
                LLFF(LJIIIZ2);
            }
        }
        ShortVideoContext shortVideoContext2 = this.LJLLL;
        if (shortVideoContext2.isDuetMode && shortVideoContext2.LJJJI()) {
            if (!HWY.LIZ() && (LJII = this.LJLJL.LJII()) != null) {
                LJLLJ(LJII);
            }
            C81975WFf LJIIIZ3 = this.LJLJL.LJIIIZ();
            if (LJIIIZ3 != null) {
                LJLLJ(LJIIIZ3);
            }
        }
        if (C53210KuU.LIZ() && !C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && this.LJLLL.creativeModel.initialModel.recordPageOptionalConfig == null && (LJIIIZ = this.LJLJL.LJIIIZ()) != null) {
            LJLLJ(LJIIIZ);
        }
        A40();
    }

    public final void LJJLIIIIJ() {
        if (V16.LJJJIL(this.LJLLL) && LLIILZL()) {
            ShortVideoContext shortVideoContext = this.LJLLL;
            if (shortVideoContext.cameraComponentModel.isRetakeMode && shortVideoContext.LJIILL() != null && this.LJLLL.LJIILL().disableBGM) {
                C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
                if (LJIIIZ != null) {
                    LLFF(LJIIIZ);
                }
                this.LJLLL.cameraComponentModel.isMuted = false;
                HB4.LJIIIIZZ(false);
                return;
            }
            if (!LLIIIL()) {
                LJJLJLI(this.LLIIIJ);
                C81975WFf LJIIIZ2 = this.LJLJL.LJIIIZ();
                if (LJIIIZ2 != null) {
                    LJLLJ(LJIIIZ2);
                }
            } else {
                C05L.LIZJ(2, this.LJLLJ);
                C81975WFf LJIIIZ3 = this.LJLJL.LJIIIZ();
                if (LJIIIZ3 != null) {
                    LJLLJ(LJIIIZ3);
                }
            }
        }
        A40();
    }

    public final void LJJLIIIJJI() {
        C81975WFf c81975WFf;
        Iterator<C81975WFf> it = this.LJLJL.getItems().iterator();
        while (true) {
            if (it.hasNext()) {
                c81975WFf = it.next();
                if (c81975WFf.LJLIL == 3) {
                    break;
                }
            } else {
                c81975WFf = null;
                break;
            }
        }
        C81975WFf c81975WFf2 = c81975WFf;
        if ((c81975WFf2 == null || !c81975WFf2.LJLJLLL) && WJR.LIZ().enableMicButton) {
            C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
            if (LJIIIZ != null) {
                LLFF(LJIIIZ);
            }
            this.LJLLL.cameraComponentModel.isMuted = false;
            HB4.LJIIIIZZ(false);
            A40();
        }
    }

    public final void LJJLIIIJJIZ() {
        int i;
        ((ArrayList) C82098WJy.LIZ).clear();
        if (V16.LJJJIL(this.LJLLL) && this.LJLLL.LJIILL() != null && C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            ShortVideoContext shortVideoContext = this.LJLLL;
            MicDataModel micDataModel = shortVideoContext.creativeModel.micDataModel;
            if (micDataModel.micStateBeforeRetake == -1) {
                if (shortVideoContext.cameraComponentModel.isMuted) {
                    i = 2;
                } else {
                    i = 1;
                }
                micDataModel.micStateBeforeRetake = i;
            }
            if (!shortVideoContext.LJIILL().disableBGM) {
                LJJLJLI(this.LJLLL.creativeModel.micDataModel.micStateBeforeRetake);
                C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
                if (LJIIIZ != null) {
                    LJLLJ(LJIIIZ);
                }
            } else {
                C81975WFf LJIIIZ2 = this.LJLJL.LJIIIZ();
                if (LJIIIZ2 != null) {
                    LLFF(LJIIIZ2);
                }
                this.LJLLL.cameraComponentModel.isMuted = false;
                HB4.LJIIIIZZ(false);
            }
        }
        A40();
        LLILL();
    }

    public final void LJJLIIJ() {
        int i;
        if (V16.LJJJIL(this.LJLLL)) {
            if (this.LJLLL.cameraComponentModel.isMuted) {
                i = 2;
            } else {
                i = 1;
            }
            this.LLIIIJ = i;
            if (!LLIIIL()) {
                LJJLJLI(2);
                C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
                if (LJIIIZ != null) {
                    LLFF(LJIIIZ);
                }
            } else {
                C81975WFf LJIIIZ2 = this.LJLJL.LJIIIZ();
                if (LJIIIZ2 != null) {
                    LLFF(LJIIIZ2);
                }
                C05L.LIZJ(2, this.LJLLJ);
            }
        }
        A40();
    }

    public final void LJJLJ() {
        C81975WFf LJFF;
        if (!C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && C53210KuU.LIZ() && (LJFF = this.LJLJL.LJFF()) != null) {
            LLFF(LJFF);
        }
    }

    public final MutableLiveData<Boolean> LJLIIL() {
        return (MutableLiveData) this.LLFZ.getValue();
    }

    public final InterfaceC81454Vxy LJLJJLL() {
        return (InterfaceC81454Vxy) this.LJLLILLLL.LIZ(this, LLIIJLIL[2]);
    }

    @Override // X.InterfaceC82062WIo
    public int LJLLI() {
        return this.LJLJL.LJLLI();
    }

    public final C46193IAz LJLLILLLL() {
        return (C46193IAz) this.LJLLI.LIZ(this, LLIIJLIL[1]);
    }

    public final WIF LJLLL() {
        return (WIF) this.LJZ.LIZ(this, LLIIJLIL[4]);
    }

    public final WK2 LJLZ() {
        return (WK2) this.LLII.getValue();
    }

    public final WM7 LLF() {
        if (this.LLFF) {
            return LJLZ();
        }
        return LLFFF();
    }

    public final WK3 LLFFF() {
        return (WK3) this.LLIFFJFJJ.getValue();
    }

    public final C29901Fi<Boolean> LLIFFJFJJ() {
        return (C29901Fi) this.LLFII.getValue();
    }

    public final void LLILZIL() {
        boolean z;
        C81975WFf LIZLLL = this.LJLJL.LIZLLL();
        if (LIZLLL != null) {
            if (this.LJLLL.LJIILIIL() - this.LJLLL.LJIIIIZZ() < 500 || this.LJLLL.libraryContext.libraryMaterialCount >= 10) {
                z = true;
            } else {
                z = false;
            }
            LIZLLL.LJLJL = z;
            LibraryContext libraryContext = this.LJLLL.libraryContext;
            if (libraryContext.libraryMaterialCount > 0) {
                LIZLLL.LJLJI = R.raw.icon_camera_library_fill;
                LIZLLL.LJLLLLLL = R.string.px2;
                LIZLLL.LJLJJL = null;
                LIZLLL.LJLJLJ = false;
                LibraryMaterialInfoSv libraryMaterialInfoSv = libraryContext.libraryMaterialInfo;
                if (libraryMaterialInfoSv != null) {
                    libraryMaterialInfoSv.setLibraryMaterialConsumed(true);
                }
            }
            this.LJLJL.LL(LIZLLL);
        }
    }

    @Override // X.InterfaceC82062WIo
    public void cn0() {
        if (this.LLFF) {
            WK2 LJLZ = LJLZ();
            View LLJJ = LJLZ.LLJJ(19);
            if (LLJJ != null) {
                Rect rect = new Rect();
                if (LLJJ.getGlobalVisibleRect(rect) && rect.bottom - rect.top >= LLJJ.getHeight()) {
                    return;
                }
                RecyclerView recyclerView = LJLZ.LJLJL;
                if (recyclerView != null) {
                    recyclerView.LJLI(RecyclerView.LJJJJJ(LLJJ));
                    return;
                } else {
                    o.LJIJI("toolbarRecyclerView");
                    throw null;
                }
            }
            return;
        }
        WK3 LLFFF = LLFFF();
        View LLJILJILJ = LLFFF.LLJILJILJ(19);
        if (LLJILJILJ == null) {
            return;
        }
        Rect rect2 = new Rect();
        if (LLJILJILJ.getGlobalVisibleRect(rect2) && rect2.bottom - rect2.top >= LLJILJILJ.getHeight()) {
            return;
        }
        RecyclerView recyclerView2 = LLFFF.LJLJJL;
        if (recyclerView2 != null) {
            recyclerView2.LJLI(RecyclerView.LJJJJJ(LLJILJILJ));
        } else {
            o.LJIJI("toolbarRecyclerView");
            throw null;
        }
    }

    @Override // X.InterfaceC82062WIo
    public int getItemCount() {
        return this.LJLJL.getItems().size();
    }

    public final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJZI.LIZ(this, LLIIJLIL[5]);
    }

    public final I8W getRecordPermissionApi() {
        return (I8W) this.LL.LIZ(this, LLIIJLIL[7]);
    }

    @Override // X.InterfaceC82062WIo
    public void C10() {
        WM7 LLF = LLF();
        if (LLF.isVisible()) {
            this.LJLIL.hide(LLF);
        }
    }

    public final void LJJLIIIJILLIZJL() {
        Effect effect;
        boolean z;
        C46193IAz LJLLILLLL = LJLLILLLL();
        if (LJLLILLLL != null) {
            effect = C82398WVm.LIZJ(LJLLILLLL);
        } else {
            effect = null;
        }
        boolean z2 = true;
        if (!ID0.LJFF(effect) && ID0.LJI(effect)) {
            z = true;
        } else {
            z = false;
        }
        boolean LJIIJ = ID0.LJIIJ(effect);
        if (z || LJIIJ) {
            z2 = false;
        }
        if (V16.LJJJIL(this.LJLLL)) {
            if (z2) {
                if (LLIILZL()) {
                    C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
                    if (LJIIIZ != null) {
                        LJLLJ(LJIIIZ);
                    }
                    C05L.LIZJ(2, this.LJLLJ);
                }
            } else {
                C05L.LIZJ(2, this.LJLLJ);
            }
            A40();
        }
    }

    public final void LJJLIIIJLLLLLLLZ() {
        if (WJR.LIZ().enableMicButton) {
            ShortVideoContext shortVideoContext = this.LJLLL;
            if (shortVideoContext.creativeModel.micDataModel.micStateBeforeRetake != -1) {
                if (V16.LJJJIL(shortVideoContext)) {
                    C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
                    if (LJIIIZ != null) {
                        LJLLJ(LJIIIZ);
                    }
                    LJJLJLI(this.LJLLL.creativeModel.micDataModel.micStateBeforeRetake);
                } else {
                    C81975WFf LJIIIZ2 = this.LJLJL.LJIIIZ();
                    if (LJIIIZ2 != null) {
                        LLFF(LJIIIZ2);
                    }
                    this.LJLLL.cameraComponentModel.isMuted = false;
                    HB4.LJIIIIZZ(false);
                }
                this.LJLLL.creativeModel.micDataModel.micStateBeforeRetake = -1;
                A40();
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().Mh0(this);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLJL.LJLILLLLZI(this.LJLJJI);
        this.LJLJL.LIZIZ(this.LJLJJL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolbarLogicComponent before add scene ");
        LIZ.append(this.LJLIL.mState);
        LIZ.append(' ');
        LIZ.append(LLF().mState);
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (this.LLFF) {
            LJLZ().LJLLL.LIZLLL(this, new AObjectS89S0100000_14(this, 379));
            this.LJLIL.add(this.LJLJI, LJLZ(), "ToolbarScene");
        } else {
            this.LJLIL.add(this.LJLJI, LLFFF(), "ToolbarScene");
            registerObservers();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ToolbarLogicComponent after add scene ");
        LIZ2.append(this.LJLIL.mState);
        LIZ2.append(' ');
        LIZ2.append(LLF().mState);
        H78.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        C81975WFf LJFF;
        super.onResume();
        if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && C53210KuU.LIZ()) {
            C81975WFf LJIIIZ = this.LJLJL.LJIIIZ();
            int i = 1;
            if (LJIIIZ != null && LJIIIZ.LJLJLLL) {
                if (!LLIILZL()) {
                    if (V16.LJJLIIIJILLIZJL(this.LJLLL)) {
                        if (this.LJLLL.cameraComponentModel.mDurings.size() > 0 || this.LJLLL.cameraComponentModel.isMuted) {
                            i = 2;
                        }
                        C05L.LIZJ(i, this.LJLLJ);
                    } else {
                        WK0 wk0 = this.LJLJL;
                        C81975WFf LJIIIZ2 = wk0.LJIIIZ();
                        if (LJIIIZ2 != null) {
                            wk0.LLFF(LJIIIZ2);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
                if (LLIIZ() && V16.LJJLIIIJJI(this.LJLLL) && (LJFF = this.LJLJL.LJFF()) != null) {
                    this.LJLJL.LJLLJ(LJFF);
                }
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82062WIo getApiComponent() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC82062WIo
    public boolean uK() {
        return this.LLIIIILZ;
    }

    private final void LJJLJLI(int i) {
        C05L.LIZJ(3, this.LJLLJ);
        C05L.LIZJ(i, this.LJLLJ);
        C05L.LIZJ(4, this.LJLLJ);
    }

    private final void LJJZZI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LJLIIL().observe(this, new AObjectS119S0200000_14(interfaceC65784Pro, this, 3));
    }

    @Override // X.InterfaceC82062WIo
    public void Ak(int i) {
        C81975WFf c81975WFf;
        InterfaceC81972WFc interfaceC81972WFc;
        Iterator<C81975WFf> it = this.LJLJL.getItems().iterator();
        while (true) {
            if (it.hasNext()) {
                c81975WFf = it.next();
                if (c81975WFf.LJLIL == i) {
                    break;
                }
            } else {
                c81975WFf = null;
                break;
            }
        }
        C81975WFf c81975WFf2 = c81975WFf;
        if (c81975WFf2 != null && (interfaceC81972WFc = c81975WFf2.LJLLI) != null) {
            interfaceC81972WFc.LIZIZ(c81975WFf2);
        }
    }

    public final InterfaceC88472Yns<C81975WFf, C76800UCe> LJJLL(boolean z) {
        if (z) {
            return new WKG(this);
        }
        return new WKF(this);
    }

    @Override // X.InterfaceC82062WIo
    public void LJLILLLLZI(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        this.LJLJL.LJLILLLLZI(items);
    }

    @Override // X.InterfaceC82062WIo
    public void LJLLJ(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LJLLJ(item);
    }

    @Override // X.InterfaceC82062WIo
    public void LJLLLL(int i) {
        this.LJLJL.LJLLLL(i);
    }

    @Override // X.InterfaceC82062WIo
    public void LL(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LL(item);
    }

    @Override // X.InterfaceC82062WIo
    public void LLFF(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJLJL.LLFF(item);
    }

    @Override // X.InterfaceC82062WIo
    public View R3(int i) {
        if (this.LLFF) {
            return LJLZ().LLJJ(i);
        }
        return LLFFF().LLJILJILJ(i);
    }

    @Override // X.InterfaceC82062WIo
    public void a8(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LJLJL.getItems());
        arrayList.addAll(items);
        this.LJLJL.LJLILLLLZI(arrayList);
    }

    @Override // X.InterfaceC82062WIo
    public C81975WFf d7(int i) {
        if (this.LLFF) {
            return LJLZ().LLJILJILJ(i);
        }
        return LLFFF().LLJILJIL(i);
    }

    @Override // X.InterfaceC82062WIo
    public void e4(boolean z) {
        C0IB<Boolean> iz;
        if (C78897Uxp.LJIL(this.LJLIL) != null) {
            I8W recordPermissionApi = getRecordPermissionApi();
            if (recordPermissionApi != null && (iz = recordPermissionApi.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE)) {
                return;
            }
            NavigationScene LJIL = C78897Uxp.LJIL(this.LJLIL);
            o.LJI(LJIL);
            WM7 LLF = LLF();
            if (z) {
                if (LLF.isVisible()) {
                    this.LJLIL.hide(LLF);
                }
                if (C79057V0z.LJIILLIIL(LJIL, LJZI())) {
                    return;
                }
                WKE LJZI = LJZI();
                C42663Gol c42663Gol = new C42663Gol();
                c42663Gol.LIZ = true;
                c42663Gol.LIZJ = new C81014Vqs();
                LJIL.LLJJJJ(LJZI, c42663Gol.LIZ());
                return;
            }
            if (LLF.isVisible()) {
                return;
            }
            this.LJLIL.show(LLF);
        }
    }

    @Override // X.InterfaceC82062WIo
    public void t1(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LJLJL.getItems());
        Iterator<? extends C81975WFf> it = items.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.LJLJL.LJLILLLLZI(arrayList);
    }

    @Override // X.InterfaceC82062WIo
    public void zD(C6MP iconType, String path, OSZ<String, String> kevaPair) {
        o.LJIIIZ(iconType, "iconType");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(kevaPair, "kevaPair");
    }

    public C82099WJz(WMH parentScene, C82622Wbi diContainer, int i, List<C81975WFf> items, C81975WFf c81975WFf, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i2, WK0 toolbarManager, C82068WIu toolbarState) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(items, "items");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        o.LJIIIZ(toolbarState, "toolbarState");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = items;
        this.LJLJJL = c81975WFf;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = toolbarManager;
        this.LJLJLJ = toolbarState;
        this.LJLJLLL = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), C45313HqP.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), C46193IAz.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC81454Vxy.class, null);
        this.LJLLJ = (InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null);
        this.LJLLL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLLLL = (InterfaceC45979I2t) getDiContainer().LJ(InterfaceC45979I2t.class, null);
        this.LJLLLLLL = (I3X) getDiContainer().LJ(I3X.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), WIF.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LL = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLD = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LLF = UCI.LJII(getDiContainer(), InterfaceC161186Ug.class, null);
        this.LLFF = e1.LIZ(31744, "creative_tools_toolbar_async_layout_inflater_scene_enabled", true, false);
        this.LLFFF = this;
        this.LLFII = C221108m2.LIZIZ(C82081WJh.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(C82080WJg.LJLIL);
        this.LLI = new AObjectS89S0100000_14(this, 378);
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 243));
        this.LLII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 241));
        this.LLIIII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 242));
        this.LLIIIILZ = true;
        this.LLIIIJ = 2;
        this.LLIIIL = -1;
        this.LLIIIZ = new AqS164S0100000_14(this, 245);
        this.LLIIJI = new AqS164S0100000_14(this, 244);
        toolbarManager.LJLLLL(i2);
    }

    public /* synthetic */ C82099WJz(WMH wmh, C82622Wbi c82622Wbi, int i, List list, C81975WFf c81975WFf, InterfaceC65784Pro interfaceC65784Pro, int i2, WK0 wk0, C82068WIu c82068WIu, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, i, list, (i3 & 16) != 0 ? null : c81975WFf, (i3 & 32) != 0 ? null : interfaceC65784Pro, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 & 128) != 0 ? new C82074WJa(null, null, null, null, null, null, null) : wk0, (i3 & 256) != 0 ? new C82068WIu() : c82068WIu);
    }
}

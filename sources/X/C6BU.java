package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.AgS120S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6BU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BU<T> extends WM7 implements InterfaceC135635Tz, InterfaceC1547265k {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public final C6BV LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C1548866a LJLJJL;
    public final AbstractC156286Bk<T> LJLJJLL;
    public final C82632Wbs LJLJL;
    public EditCommentStickerViewModel LJLJLJ;
    public EditDonationStickerViewModel LJLJLLL;
    public EditNatureStickerViewModel LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public InterfaceC152085y0 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    static {
        TBT tbt = new TBT(C6BU.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6BU.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C6BU.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6BU.class, "editPollStickerApi", "getEditPollStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/poll/EditPollStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6BU.class, "editLiveCDStickerApi", "getEditLiveCDStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/livecd/EditLiveCDStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6BU.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6BU.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp)};
    }

    public abstract void LLJILJIL();

    public abstract AbstractC156286Bk<T> LLJJ();

    public abstract int LLJJIII();

    public final InterfaceC147905rG LLJJI() {
        return (InterfaceC147905rG) this.LJLLILLLL.LIZ(this, LJLZ[6]);
    }

    public final VideoPublishEditModel LLJJIJI() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLZ[1]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLZ[0]);
    }

    public final void LLJJIJIIJIL() {
        LLJJI().LIZLLL();
        ((InterfaceC139655dx) this.LJLJL.LIZ(this, LJLZ[2])).LIZLLL();
        EditCommentStickerViewModel editCommentStickerViewModel = this.LJLJLJ;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.setState(AnonymousClass669.LJLIL);
            WM7 wm7 = this.mParentScene;
            o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
            if (c63r != null) {
                c63r.LIZLLL();
            }
            WM7 wm72 = this.mParentScene;
            o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C63Q c63q = (C63Q) C44384HbQ.LJJJI((WMH) wm72).LJ(C63Q.class);
            if (c63q != null) {
                c63q.LIZLLL();
            }
            EditDonationStickerViewModel editDonationStickerViewModel = this.LJLJLLL;
            if (editDonationStickerViewModel != null) {
                editDonationStickerViewModel.setState(C1546765f.LJLIL);
                EditNatureStickerViewModel editNatureStickerViewModel = this.LJLL;
                if (editNatureStickerViewModel != null) {
                    editNatureStickerViewModel.setState(C1546665e.LJLIL);
                    return;
                } else {
                    o.LJIJI("editNatureStickerViewModel");
                    throw null;
                }
            }
            o.LJIJI("editDonationStickerViewModel");
            throw null;
        }
        o.LJIJI("editCommentStickerViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C83547Wqd c83547Wqd = this.LJLJJLL.LLIIIILZ;
        if (c83547Wqd != null) {
            c83547Wqd.LIZ();
        }
        InterfaceC152085y0 interfaceC152085y0 = this.LJLLJ;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJLLL.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ((Handler) this.LJLLLL.getValue()).removeCallbacks((ARunnableS6S0101000_2) this.LJLLLLLL.getValue());
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ((Handler) this.LJLLLL.getValue()).postDelayed((ARunnableS6S0101000_2) this.LJLLLLLL.getValue(), 200L);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditCommentStickerViewModel.class);
        o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLJLJ = (EditCommentStickerViewModel) LIZ;
        JediViewModel LIZ2 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditDonationStickerViewModel.class);
        o.LJIIIIZZ(LIZ2, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLJLLL = (EditDonationStickerViewModel) LIZ2;
        JediViewModel LIZ3 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(EditNatureStickerViewModel.class);
        o.LJIIIIZZ(LIZ3, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLL = (EditNatureStickerViewModel) LIZ3;
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 75));
        C82632Wbs c82632Wbs = this.LJLLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLZ;
        ((InterfaceC147865rC) c82632Wbs.LIZ(this, interfaceC74236TBoArr[5])).Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 100));
        ((InterfaceC147865rC) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5])).N4().observe(this, new AObserverS70S0100000_2(this, 80));
        this.LJLILLLLZI.LJIIL(((InterfaceC147865rC) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5])).N4());
        AbstractC156286Bk<T> abstractC156286Bk = this.LJLJJLL;
        abstractC156286Bk.LJLLILLLL = new C6BO(this) { // from class: X.6Bj
            public final /* synthetic */ C6BU<Object> LIZ;

            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final void LJI() {
            }

            @Override // X.C6BO
            public final void LIZ() {
                if (!H7R.LJJLIIIJJIZ(this.LIZ.LLJJIJI()) || !o.LJ(this.LIZ.LJLJJLL.LLII, "search_hashtag")) {
                    this.LIZ.getEditPreviewApi().U2(true, true, true);
                }
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                List<StickerItemModel> list;
                if (!H7R.LJJLIIIJJIZ(this.LIZ.LLJJIJI()) || this.LIZ.LLJJIJI().infoStickerModel == null || (list = this.LIZ.LLJJIJI().infoStickerModel.stickers) == null || list.isEmpty()) {
                    return;
                }
                Iterator<StickerItemModel> it = this.LIZ.LLJJIJI().infoStickerModel.stickers.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next().stickerId, this.LIZ.LJLJJLL.LLII)) {
                        it.remove();
                    }
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C156306Bm c156306Bm;
                C156396Bv c156396Bv;
                C156396Bv c156396Bv2;
                this.LIZ.getEditPreviewApi().m70(false);
                this.LIZ.getEditPreviewApi().U2(false, true, false);
                this.LIZ.LLJILJIL();
                AbstractC156286Bk<Object> abstractC156286Bk2 = this.LIZ.LJLJJLL;
                Context context = abstractC156286Bk2.LJZL;
                AbstractC156406Bw<Object> abstractC156406Bw = null;
                if ((context instanceof ActivityC45651qj) && context != null) {
                    ((InterfaceC143655kP) abstractC156286Bk2.LLIFFJFJJ.LJ(InterfaceC143655kP.class, null)).U2(false, false, false);
                }
                AbstractC156316Bn<Object> abstractC156316Bn = abstractC156286Bk2.LLIIII;
                if (abstractC156316Bn != null) {
                    float height = abstractC156286Bk2.LJLIL.getHeight();
                    float top = abstractC156286Bk2.LJLIL.getTop();
                    PointF pointF = abstractC156316Bn.LJLJLLL;
                    pointF.x = height;
                    pointF.y = top;
                }
                abstractC156286Bk2.LJIIZILJ();
                C156426By c156426By = abstractC156286Bk2.LJLL;
                if ((c156426By instanceof C156396Bv) && (c156396Bv2 = (C156396Bv) c156426By) != null) {
                    abstractC156406Bw = c156396Bv2.getBaseView();
                }
                C156426By c156426By2 = abstractC156286Bk2.LJLL;
                if (!(c156426By2 instanceof C156396Bv) || (c156396Bv = (C156396Bv) c156426By2) == null || abstractC156406Bw == null) {
                    c156306Bm = new C156306Bm(0);
                } else {
                    c156396Bv.LLIIJI = c156396Bv.LJLJL.getMeasuredHeight();
                    c156306Bm = new C156306Bm(0);
                    c156306Bm.LJLJI = C6BL.LJIILJJIL(c156396Bv.getRotateAngle());
                    c156306Bm.LJLIL = c156396Bv.getContentView().getScaleX();
                    c156306Bm.LJLILLLLZI = c156396Bv.getContentView().getScaleY();
                    c156306Bm.LJLJJI = abstractC156286Bk2.LJLIL.getX() + c156396Bv.getContentView().getX();
                    c156306Bm.LJLJJL = abstractC156286Bk2.LJLIL.getY() + c156396Bv.getContentView().getY();
                }
                AbstractC156316Bn<Object> abstractC156316Bn2 = abstractC156286Bk2.LLIIII;
                if (abstractC156316Bn2 != null) {
                    abstractC156316Bn2.LJIIIIZZ(abstractC156406Bw, c156306Bm);
                }
                C6BU<Object> c6bu = this.LIZ;
                c6bu.LJLJJL.LIZJ(c6bu.LLJJIII());
            }

            @Override // X.C6BO
            public final void LJII() {
                this.LIZ.getEditPreviewApi().U2(true, false, true);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            {
                this.LIZ = this;
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                this.LIZ.LLJJIJIIJIL();
                if (z && !this.LIZ.LJLJJLL.LJIJJLI()) {
                    this.LIZ.getEditPreviewApi().U2(true, true, true);
                } else {
                    this.LIZ.getEditPreviewApi().U2(false, true, false);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                String str;
                C156376Bt c156376Bt;
                List<String> challengeNames;
                if (z) {
                    this.LIZ.LLJJIJIIJIL();
                    Mission mission = this.LIZ.LLJJIJI().creativeModel.commerceModel.getMission();
                    String str2 = null;
                    if (mission == null) {
                        mission = null;
                    }
                    if (mission != null && (challengeNames = mission.getChallengeNames()) != null) {
                        str = (String) ListProtector.get(challengeNames, 0);
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str) || mission == null) {
                        return;
                    }
                    AbstractC156286Bk<Object> abstractC156286Bk2 = this.LIZ.LJLJJLL;
                    if (abstractC156286Bk2 instanceof C156346Bq) {
                        o.LJII(abstractC156286Bk2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerController");
                        C156426By c156426By = abstractC156286Bk2.LJLL;
                        if (!(c156426By instanceof C156376Bt) || (c156376Bt = (C156376Bt) c156426By) == null) {
                            return;
                        }
                        String hashtagName = c156376Bt.getHashTagStruct().getHashtagName();
                        List<String> challengeNames2 = mission.getChallengeNames();
                        if (challengeNames2 != null) {
                            str2 = (String) ListProtector.get(challengeNames2, 0);
                        }
                        if (!TextUtils.equals(hashtagName, str2)) {
                            return;
                        }
                        new H9C().LJIIL(mission, 1, 0);
                        abstractC156286Bk2.LLI.creativeModel.commerceModel.setMission(mission);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                InterfaceC1549166d<?> interfaceC1549166d;
                o.LJIIIZ(view, "view");
                this.LIZ.LJLILLLLZI.LJIILIIL(true);
                AbstractC156286Bk<Object> abstractC156286Bk2 = this.LIZ.LJLJJLL;
                abstractC156286Bk2.LJJJI(abstractC156286Bk2.getInteractStickerStruct());
                if ((view instanceof InterfaceC1549166d) && (interfaceC1549166d = (InterfaceC1549166d) view) != null) {
                    this.LIZ.LLJJI().K2(interfaceC1549166d);
                }
                C6BU<Object> c6bu = this.LIZ;
                c6bu.LJLJJL.LJFF(c6bu.LLJJIII());
            }
        };
        abstractC156286Bk.LLFII = new C6BQ(this) { // from class: X.6BY
            public final /* synthetic */ C6BU<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C6BQ
            public final void LIZ(C156426By c156426By, C156426By c156426By2) {
                int LLJJIII = this.LIZ.LLJJIII();
                AbstractC156406Bw abstractC156406Bw = null;
                if (LLJJIII != 8) {
                    if (LLJJIII != 9 || !this.LIZ.LJLJJLL.LJIJJLI() || !(c156426By2 instanceof C156376Bt)) {
                        return;
                    }
                    InterfaceC147905rG LLJJI = this.LIZ.LLJJI();
                    View drawView = c156426By2.getDrawView();
                    if (drawView instanceof C6CH) {
                        abstractC156406Bw = (AbstractC156406Bw) drawView;
                    }
                    LLJJI.I9(abstractC156406Bw);
                    this.LIZ.LLJJI().k();
                    return;
                }
                if (!this.LIZ.LJLJJLL.LJIJJLI() || !(c156426By2 instanceof C156366Bs)) {
                    return;
                }
                InterfaceC147905rG LLJJI2 = this.LIZ.LLJJI();
                View drawView2 = c156426By2.getDrawView();
                if (drawView2 instanceof C6CI) {
                    abstractC156406Bw = (AbstractC156406Bw) drawView2;
                }
                LLJJI2.I9(abstractC156406Bw);
                this.LIZ.LLJJI().k();
            }
        };
    }

    public C6BU(C82622Wbi diContainer, C6BV baseSocialStickerApi) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(baseSocialStickerApi, "baseSocialStickerApi");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = baseSocialStickerApi;
        this.LJLJI = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        C1548866a c1548866a = new C1548866a(LLJJIJI());
        this.LJLJJL = c1548866a;
        AbstractC156286Bk<T> LLJJ = LLJJ();
        AnonymousClass674 anonymousClass674 = new AnonymousClass674(LLJJ);
        anonymousClass674.LIZ = c1548866a;
        LLJJ.LLFFF = anonymousClass674;
        this.LJLJJLL = LLJJ;
        this.LJLJL = UCI.LJI(diContainer, InterfaceC139655dx.class, null);
        UCI.LJI(diContainer, C63R.class, null);
        UCI.LJI(diContainer, C63Q.class, null);
        this.LJLLI = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        this.LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2((C6BU) this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2((C6BU) this, 392));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2((C6BU) this, 391));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        this.LJLJJLL.getClass();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            this.LJLJJLL.LJLLLLLL = value.LLILZ();
            this.LJLJJLL.LJIJ(this.mActivity, frameLayout);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLLJ;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJLLL.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        return new View(requireSceneContext());
    }

    public final C10K LLJILJILJ(int i, int i2, int i3, int i4, String draftDir) {
        o.LJIIIZ(draftDir, "draftDir");
        AbstractC156286Bk<T> abstractC156286Bk = this.LJLJJLL;
        abstractC156286Bk.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) abstractC156286Bk.LJLLI).iterator();
        while (it.hasNext()) {
            ((C156426By) it.next()).LJIILL();
        }
        Iterator it2 = ((ArrayList) abstractC156286Bk.LJLLI).iterator();
        while (it2.hasNext()) {
            C156426By c156426By = (C156426By) it2.next();
            C10K LJIILL = abstractC156286Bk.LJLLL.LIZ(c156426By, abstractC156286Bk.LJLIL, draftDir, i, i2, i3, i4).LJIILL(new AgS120S0100000_2(c156426By, 3));
            o.LJIIIIZZ(LJIILL, "view in mStickerViewList…      }\n                }");
            arrayList.add(LJIILL);
        }
        C10K LJIJJLI = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
        return LJIJJLI;
    }
}

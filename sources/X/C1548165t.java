package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.play.core.assetpacks.z;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.65t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548165t extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82632Wbs LJLJJI;
    public InterfaceC152085y0 LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public FrameLayout LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82631Wbr LJLL;
    public final C82631Wbr LJLLI;
    public EditCommentStickerViewModel LJLLILLLL;
    public final C82632Wbs LJLLJ;
    public final C82631Wbr LJLLL;
    public EditDonationStickerViewModel LJLLLL;
    public EditNatureStickerViewModel LJLLLLLL;
    public final C82632Wbs LJLZ;
    public final C82632Wbs LJZ;
    public C66F LJZI;
    public boolean LJZL;
    public XKQ LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;

    public static final float LLJJI(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    static {
        TBT tbt = new TBT(C1548165t.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C1548165t.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "imageModel", "getImageModel()Lcom/ss/android/ugc/aweme/image/base/ImageEditTempModel;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editInfoStickerApi", "getEditInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "pollStickerApi", "getPollStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/poll/EditPollStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "qaStickerApi", "getQaStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/qa/EditPageQaStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "liveCDStickerApi", "getLiveCDStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/livecd/EditLiveCDStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "textStickerAdapterApi", "getTextStickerAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editMentionStickerApi", "getEditMentionStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditMentionStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1548165t.class, "editHashTagStickerApi", "getEditHashTagStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/hashtag/EditHashTagStickerApi;", 0, c65351Pkp)};
    }

    public final C63H LLJJIII() {
        return (C63H) this.LJZ.LIZ(this, LLFII[15]);
    }

    public final InterfaceC147905rG LLJJIJI() {
        return (InterfaceC147905rG) this.LJLJL.LIZ(this, LLFII[5]);
    }

    public final C63I LLJJIJIIJIL() {
        return (C63I) this.LJLZ.LIZ(this, LLFII[14]);
    }

    public final InterfaceC147865rC LLJJIJIL() {
        return (InterfaceC147865rC) this.LJLJLLL.LIZ(this, LLFII[9]);
    }

    public final InterfaceC139535dl LLJJJ() {
        return (InterfaceC139535dl) this.LJLL.LIZ(this, LLFII[10]);
    }

    public final VideoPublishEditModel LLJJJIL() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LLFII[0]);
    }

    public final C66Y LLJJJJ() {
        return (C66Y) this.LLFFF.getValue();
    }

    public final InterfaceC139655dx LLJJL() {
        return (InterfaceC139655dx) this.LJLLJ.LIZ(this, LLFII[12]);
    }

    public final void LLJLILLLLZIIL() {
        EditCommentStickerViewModel editCommentStickerViewModel = this.LJLLILLLL;
        if (editCommentStickerViewModel != null) {
            MutableLiveData<Boolean> mutableLiveData = editCommentStickerViewModel.LJLJL;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.setValue(bool);
            EditDonationStickerViewModel editDonationStickerViewModel = this.LJLLLL;
            if (editDonationStickerViewModel != null) {
                editDonationStickerViewModel.LJLJLJ.setValue(bool);
                EditNatureStickerViewModel editNatureStickerViewModel = this.LJLLLLLL;
                if (editNatureStickerViewModel != null) {
                    editNatureStickerViewModel.LJLJL.setValue(bool);
                    WM7 wm7 = this.mParentScene;
                    o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
                    if (c63r != null) {
                        c63r.LJJI(true);
                    }
                    WM7 wm72 = this.mParentScene;
                    o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63Q c63q = (C63Q) C44384HbQ.LJJJI((WMH) wm72).LJ(C63Q.class);
                    if (c63q != null) {
                        c63q.LJJI(true);
                    }
                    WM7 wm73 = this.mParentScene;
                    o.LJII(wm73, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63L c63l = (C63L) C44384HbQ.LJJJI((WMH) wm73).LJ(C63L.class);
                    if (c63l != null) {
                        c63l.LJJI(true);
                    }
                    LLJJIII().LJJI(true);
                    LLJJIJIIJIL().LJJI(true);
                    return;
                }
                o.LJIJI("natureStickerViewModel");
                throw null;
            }
            o.LJIJI("donationStickerViewModel");
            throw null;
        }
        o.LJIJI("commentStickerViewModel");
        throw null;
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LLFII[4]);
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        XKQ xkq = this.LL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLJJL;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LLF.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        AnonymousClass655 anonymousClass655 = LLJJJJ().LLIFFJFJJ;
        if (anonymousClass655 != null) {
            anonymousClass655.hide();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C1548165t(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        UCI.LJII(diContainer, C151065wM.class, null);
        this.LJLJI = UCI.LJII(diContainer, C151155wV.class, null);
        this.LJLJJI = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC147905rG.class, null);
        UCI.LJI(diContainer, C63R.class, null);
        UCI.LJI(diContainer, C63K.class, null);
        UCI.LJI(diContainer, C63Q.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLL = UCI.LJII(diContainer, InterfaceC139535dl.class, null);
        this.LJLLI = UCI.LJII(diContainer, InterfaceC148865so.class, null);
        this.LJLLJ = UCI.LJI(diContainer, InterfaceC139655dx.class, null);
        this.LJLLL = UCI.LJII(diContainer, InterfaceC139535dl.class, null);
        this.LJLZ = UCI.LJI(diContainer, C63I.class, null);
        this.LJZ = UCI.LJI(diContainer, C63H.class, null);
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 478));
        this.LLF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 479));
        this.LLFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 481));
        this.LLFFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 480));
    }

    public final void LLJJ(boolean z) {
        C153065za c153065za;
        C1548265u c1548265u = LLJJJJ().LJLJI;
        if (c1548265u == null || (c153065za = c1548265u.LJLJLJ) == null || C32151Nz.LJJIIJZLJL(c153065za.LIZ)) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator it = ((ArrayList) c153065za.LIZ).iterator();
        while (it.hasNext()) {
            C153075zb c153075zb = (C153075zb) it.next();
            if (c153065za.LJFF.LJLILLLLZI == null) {
                C122034qd LJJI = C17N.LJJI(c153065za.LJ);
                long duration = LJJI.LJIIJJI.V8().getDuration();
                LJJI.LJIIIIZZ().LJIL(c153075zb.LJLJI.uuid);
                if (duration != LJJI.LJIIJJI.V8().getDuration()) {
                    atomicBoolean.set(true);
                }
            }
            it.remove();
            InterfaceC153125zg interfaceC153125zg = c153065za.LJI;
            if (interfaceC153125zg != null && z) {
                interfaceC153125zg.LIZ(c153075zb.LJLJI, atomicBoolean.get());
            }
        }
        c153065za.LIZIZ = null;
    }

    public final void LLJJLIIIJLLLLLLLZ(InfoStickerModel model) {
        o.LJIIIZ(model, "model");
        H78.LJI("restore info stickers");
        C1548265u c1548265u = LLJJJJ().LJLJI;
        if (c1548265u != null) {
            c1548265u.LJI(model, true);
        }
    }

    public final void LLJLIL(float f) {
        EditCommentStickerViewModel editCommentStickerViewModel = this.LJLLILLLL;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.LJIL(f);
            EditDonationStickerViewModel editDonationStickerViewModel = this.LJLLLL;
            if (editDonationStickerViewModel != null) {
                ((LiveData) editDonationStickerViewModel.LJLJL.getValue()).setValue(Float.valueOf(f));
                EditNatureStickerViewModel editNatureStickerViewModel = this.LJLLLLLL;
                if (editNatureStickerViewModel != null) {
                    ((LiveData) editNatureStickerViewModel.LJLJJLL.getValue()).setValue(Float.valueOf(f));
                    WM7 wm7 = this.mParentScene;
                    o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
                    if (c63r != null) {
                        c63r.LJIL(f);
                    }
                    WM7 wm72 = this.mParentScene;
                    o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63Q c63q = (C63Q) C44384HbQ.LJJJI((WMH) wm72).LJ(C63Q.class);
                    if (c63q != null) {
                        c63q.LJIL(f);
                    }
                    WM7 wm73 = this.mParentScene;
                    o.LJII(wm73, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63L c63l = (C63L) C44384HbQ.LJJJI((WMH) wm73).LJ(C63L.class);
                    if (c63l != null) {
                        c63l.LJIL(f);
                    }
                    LLJJIII().LJIL(f);
                    LLJJIJIIJIL().LJIL(f);
                    LLJJIJIL().Wd0(f);
                    return;
                }
                o.LJIJI("natureStickerViewModel");
                throw null;
            }
            o.LJIJI("donationStickerViewModel");
            throw null;
        }
        o.LJIJI("commentStickerViewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0401, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0727, code lost:
    
        if (X.H7R.LJJJJI(r0) != false) goto L81;
     */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.65v] */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1548165t.onActivityCreated(android.os.Bundle):void");
    }

    public final void LLJILJILJ(Effect effect, String str) {
        String[] strArr;
        int i;
        o.LJIIIZ(effect, "effect");
        C66Y LLJJJJ = LLJJJJ();
        C1548265u c1548265u = LLJJJJ.LJLJI;
        if (c1548265u != null) {
            if (c1548265u.getStickNumber() >= LLJJJJ.LJZ) {
                C5S1 c5s1 = new C5S1(LLJJJJ.LJLJI.getContext());
                c5s1.LIZJ(R.string.hhd);
                c5s1.LJ();
                return;
            }
            C1548265u c1548265u2 = LLJJJJ.LJLJI;
            C153065za c153065za = c1548265u2.LJLJLJ;
            if (c153065za == null) {
                return;
            }
            C153075zb c153075zb = c153065za.LIZIZ;
            if (c153075zb != null && c153075zb.LJLJJL) {
                c153075zb.LJLJJL = false;
            }
            String unzipPath = effect.getUnzipPath();
            String effectId = effect.getEffectId();
            int effectType = effect.getEffectType();
            z zVar = c153065za.LJFF;
            if (zVar.LJLILLLLZI != null) {
                c153065za.LIZLLL(effectType, zVar.LIZIZ(unzipPath, str, true), effectId, unzipPath, str, null);
            } else {
                C121514pn c121514pn = new C121514pn();
                c121514pn.LJIIJJI = unzipPath;
                c121514pn.LJIILJJIL = effectId;
                if (TextUtils.isEmpty(str)) {
                    strArr = null;
                } else {
                    strArr = new String[]{str};
                }
                c121514pn.LJIIL = strArr;
                c121514pn.LIZLLL = c153065za.LJ.getDuration();
                if (effect.getEffectType() != 10) {
                    c121514pn.LJIILLIIL = effect.getResource_id();
                    c121514pn.LJIILL = "infostickerv2";
                }
                if (c153065za.LJIIJJI) {
                    i = C153105ze.LIZ();
                    c121514pn.LIZIZ = i;
                } else {
                    i = 0;
                }
                C17N.LJJI(c153065za.LJ).LJIIIIZZ().LJIJI(c121514pn);
                C153075zb LIZLLL = c153065za.LIZLLL(effectType, 1, effectId, unzipPath, str, c121514pn.LIZ);
                StickerItemModel stickerItemModel = LIZLLL.LJLJI;
                if (stickerItemModel != null) {
                    stickerItemModel.challengeIdLoki = ID0.LIZ(effect);
                    LIZLLL.LJLJI.updateLayerWeight(i);
                }
            }
            c1548265u2.invalidate();
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.bka, viewGroup, false, "inflater.inflate(R.layou…ticker, container, false)");
    }

    public final void LLJILJIL(String stickerId, String path, int i, int i2, boolean z) {
        int[] iArr;
        C153075zb LJ;
        float f;
        float f2;
        o.LJIIIZ(stickerId, "stickerId");
        o.LJIIIZ(path, "path");
        C66Y LLJJJJ = LLJJJJ();
        C1548265u c1548265u = LLJJJJ.LJLJI;
        if (c1548265u != null) {
            if (c1548265u.getStickNumber() >= LLJJJJ.LJZ) {
                C5S1 c5s1 = new C5S1(LLJJJJ.LJLJI.getContext());
                c5s1.LIZJ(R.string.hhd);
                c5s1.LJ();
                return;
            }
            C1548265u c1548265u2 = LLJJJJ.LJLJI;
            C153065za c153065za = c1548265u2.LJLJLJ;
            if (c153065za == null) {
                return;
            }
            float[] fArr = new float[2];
            if (i > i2) {
                fArr[0] = 280.0f;
                fArr[1] = (i2 * 280.0f) / i;
            } else {
                fArr[0] = (i * 280.0f) / i2;
                fArr[1] = 280.0f;
            }
            z zVar = c153065za.LJFF;
            C1548265u infoStickerEditView = c153065za.LIZJ;
            zVar.getClass();
            o.LJIIIZ(infoStickerEditView, "infoStickerEditView");
            C151065wM c151065wM = (C151065wM) zVar.LJLILLLLZI;
            if (c151065wM != null) {
                iArr = new int[2];
                float width = c151065wM.LIZIZ.getSrcImageInfo().getWidth();
                Float initializeScaleValue = c151065wM.LIZIZ.getEditImageInfo().getInitializeScaleValue();
                if (initializeScaleValue != null) {
                    f = initializeScaleValue.floatValue();
                } else {
                    f = 1.0f;
                }
                iArr[0] = (int) (width * f);
                float height = c151065wM.LIZIZ.getSrcImageInfo().getHeight();
                Float initializeScaleValue2 = c151065wM.LIZIZ.getEditImageInfo().getInitializeScaleValue();
                if (initializeScaleValue2 != null) {
                    f2 = initializeScaleValue2.floatValue();
                } else {
                    f2 = 1.0f;
                }
                iArr[1] = (int) (height * f2);
            } else {
                iArr = new int[]{infoStickerEditView.LJLJI, infoStickerEditView.LJLJJI};
            }
            float f3 = fArr[0] / iArr[0];
            float f4 = fArr[1] / iArr[1];
            float f5 = (1.0f - f3) / 2.0f;
            float f6 = (1.0f - f4) / 2.0f;
            z zVar2 = c153065za.LJFF;
            if (zVar2.LJLILLLLZI != null) {
                LJ = c153065za.LJ(stickerId, path, null, 11, zVar2.LIZ(path, f5, f6, f3, f4, true), null, f5, f6, f3, f4, z);
            } else {
                C121594pv c121594pv = new C121594pv();
                c121594pv.LJIIL = path;
                c121594pv.LJIILIIL = f3;
                c121594pv.LJIILJJIL = f4;
                c121594pv.LIZLLL = c153065za.LJ.getDuration();
                C17N.LJJI(c153065za.LJ).LJIIIIZZ().LJJJJIZL(c121594pv);
                LJ = c153065za.LJ(stickerId, path, null, 11, 1, c121594pv.LIZ, 0.0f, 0.0f, 1.0f, 1.0f, z);
            }
            if (LJ != null) {
                LJ.LJLLJ = true;
            }
            c1548265u2.invalidate();
        }
    }
}

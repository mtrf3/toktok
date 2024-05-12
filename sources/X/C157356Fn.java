package X;

import Y.ARunnableS38S0100000_2;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157356Fn extends AbstractC29891Fh<C63K> implements InterfaceC135635Tz, C63K {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final C157436Fv LJLJJL;
    public C157376Fp LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final C29901Fi<Boolean> LJLJLLL;
    public MutableLiveData<Boolean> LJLL;
    public C6G0 LJLLI;

    static {
        TBT tbt = new TBT(C157356Fn.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C157356Fn.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public C63K LJJLI() {
        return this;
    }

    @Override // X.C63K
    public boolean LLLLLLL() {
        return false;
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLJL.LIZ(this, LJLLILLLL[0]);
    }

    private final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLLILLLL[1]);
    }

    @Override // X.C63K
    public void C00() {
        C145995oB LIZ = this.LJLJJL.LIZ();
        LIZ.LJI("user_id", C77339UWx.LIZJ());
        LIZ.LJI("enter_method", "click_main_panel");
        FMX.LJIIL("click_ask_sticker", LIZ.LIZ);
    }

    @Override // X.C63K
    public void Fw() {
        VideoPublishEditModel videoPublishEditModel = this.LJLJJL.LIZ;
        if (videoPublishEditModel != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "video_edit_page");
            c188727au.LJIIIZ("creation_id", videoPublishEditModel.getCreationId());
            c188727au.LJIIIZ("shoot_way", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            FMX.LJIIL("text_to_question_show", c188727au.LIZ);
        }
    }

    @Override // X.C63K
    public InterfaceC147435qV LIZ() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LLJJIII();
        }
        return null;
    }

    @Override // X.C63K
    public void LIZLLL() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LJIIZILJ();
        }
    }

    @Override // X.C63K
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C63K
    public boolean LJIILL() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LLJJIII().LJIL();
        }
        return false;
    }

    @Override // X.C63K
    public boolean LJIJJLI() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LJIJJLI();
        }
        return false;
    }

    @Override // X.C63K
    public void LJJIII() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            if (c157376Fp.LJIJJLI()) {
                c157376Fp.LJLLL = true;
            }
            c157376Fp.LLJJIII().LJJII();
        }
    }

    @Override // X.C63K
    public String LJJLIIIJLJLI() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LLJJIII().LLIIIL;
        }
        return null;
    }

    @Override // X.C63K
    public InteractStickerStruct getInteractStickerStruct() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LLJJIII().getInteractStickerStruct();
        }
        return null;
    }

    @Override // X.C63K
    public void ii0() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            C157426Fu LLJJIII = c157376Fp.LLJJIII();
            if (LLJJIII.LLIIIILZ != null) {
                LLJJIII.LJJIZ();
                return;
            }
            LLJJIII.LLI.U2(false, false, false);
            C6G0 c6g0 = LLJJIII.LLIIIJ;
            if (c6g0 == null) {
                return;
            }
            c6g0.post(new ARunnableS38S0100000_2(LLJJIII, 3));
        }
    }

    @Override // X.C63K
    public void j00() {
        this.LJLJLLL.LJII(Boolean.TRUE);
    }

    @Override // X.C63K
    public void jA() {
        C157436Fv c157436Fv = this.LJLJJL;
        if (c157436Fv.LIZ != null) {
            FMX.LJIIL("click_question_to_text", c157436Fv.LIZ().LIZ);
        }
    }

    @Override // X.C63K
    public void sd() {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp == null || c157376Fp.getEditModel().qaStruct == null) {
            return;
        }
        QaStruct qaStruct = c157376Fp.getEditModel().qaStruct;
        o.LJIIIIZZ(qaStruct, "editModel.qaStruct");
        c157376Fp.LLJILJIL(qaStruct);
    }

    @Override // X.C63K
    public void show() {
        if (this.LJLLI == null) {
            View inflate = ((ViewStub) this.LJLILLLLZI.requireViewById(this.LJLJJI)).inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout");
            C6G0 c6g0 = (C6G0) inflate;
            this.LJLLI = c6g0;
            c6g0.setMobHelper(this.LJLJJL);
        }
        if (this.LJLJJLL == null) {
            C6G0 c6g02 = this.LJLLI;
            if (c6g02 != null) {
                C157376Fp c157376Fp = new C157376Fp(c6g02, getDiContainer(), this.LJLJJL);
                c157376Fp.LLJJIII().LJLJJI = (AnonymousClass655) getDiContainer().LJ(AnonymousClass655.class, null);
                if (!this.LJLILLLLZI.isAdded(c157376Fp)) {
                    this.LJLILLLLZI.add(this.LJLJI, c157376Fp, "EditPageQaStickerScene");
                }
                this.LJLJJLL = c157376Fp;
                return;
            }
            o.LJIJI("editQaStickerLayout");
            throw null;
        }
    }

    @Override // X.C63K
    public void LJJ() {
        InteractStickerStruct interactStickerStruct;
        List<InteractStickerStruct> LJI = C164826dS.LJI(LJJLIIIJILLIZJL().getMainBusinessContext(), 12, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI == null || LJI.isEmpty()) {
            return;
        }
        show();
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp == null) {
            return;
        }
        c157376Fp.LLJJIII().LJJIJIIJI(c157376Fp.getEditPreviewApi().Kh().getValue(), c157376Fp.getEditPreviewApi());
        if (LJI == null || (interactStickerStruct = (InteractStickerStruct) ORZ.LJLLLLLL(0, LJI)) == null || interactStickerStruct.getQaStruct() == null) {
            return;
        }
        c157376Fp.getEditModel().hasQaSticker = Boolean.TRUE;
        c157376Fp.LLJILJILJ().j00();
        c157376Fp.LLJJIII().LJJIFFI(interactStickerStruct);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC142515iZ LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.Pa0(this);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        InterfaceC142515iZ LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.Pa0(null);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C63K getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C63K
    public /* bridge */ /* synthetic */ LiveEvent pZ() {
        return this.LJLJLLL;
    }

    @Override // X.C63K
    public void I4(QaStruct qsStruct) {
        C157376Fp c157376Fp;
        o.LJIIIZ(qsStruct, "qsStruct");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && (c157376Fp = this.LJLJJLL) != null) {
            c157376Fp.LLJILJIL(qsStruct);
        }
    }

    @Override // X.C63K
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLL = liveData;
    }

    @Override // X.C63K
    public void LJIILIIL(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.LJLL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C63K
    public void LJIILLIIL(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LLIIIL = effectId;
        }
    }

    @Override // X.C63K
    public void LJIJJ(boolean z) {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LLFF = z;
        }
    }

    @Override // X.C63K
    public void LJIL(float f) {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LJJIIJ(f);
        }
    }

    @Override // X.C63K
    public void LJJI(boolean z) {
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LJLILLLLZI = z;
        }
    }

    @Override // X.C63K
    public void LJJII(VESize size) {
        o.LJIIIZ(size, "size");
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LJLLLLLL = size;
        }
    }

    @Override // X.C63K
    public void LLLLLZL(String tabId) {
        o.LJIIIZ(tabId, "tabId");
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            c157376Fp.LLJJIII().LLIIIZ = tabId;
        }
    }

    @Override // X.C63K
    public void Vj0(String questionId) {
        o.LJIIIZ(questionId, "questionId");
        C157436Fv c157436Fv = this.LJLJJL;
        c157436Fv.getClass();
        C145995oB LIZ = c157436Fv.LIZ();
        LIZ.LJI("user_id", C77339UWx.LIZJ());
        LIZ.LJI("question_id", questionId);
        FMX.LJIIL("prop_more_click", LIZ.LIZ);
    }

    @Override // X.C63K
    public void Vm0(int i) {
        VideoPublishEditModel videoPublishEditModel = this.LJLJJL.LIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LIZ(i, "type");
            FMX.LJIIL("replace_question_show", c145995oB.LIZ);
        }
    }

    @Override // X.C63K
    public void C(String choice, int i) {
        o.LJIIIZ(choice, "choice");
        C157436Fv c157436Fv = this.LJLJJL;
        c157436Fv.getClass();
        VideoPublishEditModel videoPublishEditModel = c157436Fv.LIZ;
        if (videoPublishEditModel != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("target", choice);
            c145995oB.LIZ(i, "type");
            FMX.LJIIL("replace_question_confirm", c145995oB.LIZ);
        }
    }

    @Override // X.C63K
    public C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        C157376Fp c157376Fp = this.LJLJJLL;
        if (c157376Fp != null) {
            return c157376Fp.LJJIJIL(editor, compileCallback, interfaceC88471Ynr);
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        return LJIIIZ;
    }

    public C157356Fn(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = new C157436Fv((VideoPublishEditModel) getDiContainer().LJ(VideoPublishEditModel.class, null));
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLLL = new C29901Fi<>();
    }
}

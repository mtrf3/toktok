package X;

import Y.ACallableS105S0100000_2;
import Y.AObjectS84S0100000_2;
import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import Y.AfS54S0100000_2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148915st extends AbstractC29891Fh<InterfaceC150685vk> implements InterfaceC150685vk, InterfaceC135635Tz {
    public static final C148955sx LJZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public volatile boolean LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final java.util.Map<C67P, StickerItemModel> LJLLI;
    public final List<StickerItemModel> LJLLILLLL;
    public final C73893SzJ<C76800UCe> LJLLJ;
    public InterfaceC92693kP LJLLL;
    public AwemeDraft LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;

    public InterfaceC150685vk LJJLIIIJILLIZJL() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.5sx] */
    static {
        TBT tbt = new TBT(C148915st.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, new TBT(C148915st.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new TBT(C148915st.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(C148915st.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(C148915st.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new TBT(C148915st.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new TBT(C148915st.class, "videoSizeProvider", "getVideoSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0), new TBT(C148915st.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};
        LJZ = new Object() { // from class: X.5sx
        };
    }

    private final void LJJLIIIIJ() {
        InterfaceC92693kP interfaceC92693kP = this.LJLLL;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
    }

    private final InterfaceC142515iZ LJJLIIIJJI() {
        return (InterfaceC142515iZ) this.LJLJJI.LIZ(this, LJZI[1]);
    }

    private final InterfaceC140255ev LJJLIIIJJIZ() {
        return (InterfaceC140255ev) this.LJLJLJ.LIZ(this, LJZI[5]);
    }

    private final InterfaceC143855kj LJJLJ() {
        return (InterfaceC143855kj) this.LJLL.LIZ(this, LJZI[7]);
    }

    private final InterfaceC136115Vv LJJLJLI() {
        return (InterfaceC136115Vv) this.LJLJL.LIZ(this, LJZI[4]);
    }

    private final InterfaceC147355qN LJJZZI() {
        return (InterfaceC147355qN) this.LJLJLLL.LIZ(this, LJZI[6]);
    }

    private final boolean LJLIIL() {
        return ((Boolean) this.LJLLLLLL.getValue()).booleanValue();
    }

    public final InterfaceC143655kP LJJLIIIJLLLLLLLZ() {
        return (InterfaceC143655kP) this.LJLJJL.LIZ(this, LJZI[2]);
    }

    public final InterfaceC147865rC LJJLIIJ() {
        return (InterfaceC147865rC) this.LJLJJLL.LIZ(this, LJZI[3]);
    }

    public final C148945sw LJJLL() {
        return (C148945sw) this.LJLZ.getValue();
    }

    public final void LLIFFJFJJ() {
        for (Map.Entry<C67P, StickerItemModel> entry : this.LJLLI.entrySet()) {
            entry.getValue().extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), entry.getKey().LJ());
        }
        LLFFF();
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJZI[0]);
    }

    @Override // X.InterfaceC150685vk
    public void Pr() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLLJ.onNext(C76800UCe.LIZ);
    }

    public final void yi0() {
        Iterator<StickerItemModel> it = this.LJLLILLLL.iterator();
        while (it.hasNext()) {
            LLLLIL().infoStickerModel.removeSticker(it.next());
        }
        this.LJLLILLLL.clear();
    }

    private final void LJJLI() {
        ArrayList<StickerItemModel> arrayList;
        InlineCaptionModel inlineCaptionModel = LLLLIL().creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null) {
            if (!LLLLIL().hasInfoStickers()) {
                LLLLIL().infoStickerModel = new InfoStickerModel(C5YW.LIZIZ().LJJLIIIJJI(LLLLIL()));
            }
            Iterator<StickerItemModel> it = arrayList.iterator();
            while (it.hasNext()) {
                StickerItemModel itemModel = it.next();
                List<StickerItemModel> list = this.LJLLILLLL;
                o.LJIIIIZZ(itemModel, "itemModel");
                list.add(itemModel);
                LLLLIL().infoStickerModel.addSticker(0, itemModel);
            }
        }
    }

    private final void LJJZZIII() {
        if (LJLIIL()) {
            return;
        }
        C10K.LIZIZ(new ACallableS105S0100000_2(this, 16), GUL.LIZ, null);
    }

    private final void LJLJJLL() {
        C29901Fi<C76800UCe> em0;
        InterfaceC136115Vv LJJLJLI = LJJLJLI();
        if (LJJLJLI != null && (em0 = LJJLJLI.em0()) != null) {
            em0.LIZLLL(this, new AObjectS84S0100000_2(this, 93));
        }
    }

    private final void LJLJLJ() {
        LJJLIIJ().kJ().observe(this, new AObserverS70S0100000_2(this, 76));
        LJJLIIIJJI().oi0().LIZIZ(this, new AObjectS84S0100000_2(this, 94));
    }

    private final void LJLLILLLL() {
        LiveData<C76800UCe> ga0;
        LJJLIIIJJI().vF().LIZIZ(this, new AObjectS84S0100000_2(this, 95));
        InterfaceC143855kj LJJLJ = LJJLJ();
        if (LJJLJ != null && (ga0 = LJJLJ.ga0()) != null) {
            ga0.observe(this, new AObserverS70S0100000_2(this, 77));
        }
    }

    private final void LJLZ() {
        LJJLIIIJJI().PI().LIZIZ(this, new AObjectS84S0100000_2(this, 97));
    }

    private final void LJZI() {
        if (LLLLIL().isFromRestoreRecover && H7R.LIZLLL(LLLLIL(), C60903NvH.LJIIJJI().LJIILL().LJI()).getId() == 0) {
            MutableLiveData LIZJ = C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL().LIZJ();
            LIZJ.observe(this, new AObserverS66S0200000_2(this, LIZJ, 10));
        }
    }

    public final void By() {
        yi0();
        LJJLI();
        Pr();
    }

    @Override // X.InterfaceC150685vk
    public void JZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoSaveDraftComponent recoverDraft ");
        LIZ.append(this.LJLLLL);
        H78.LJI(X1D.LIZIZ(LIZ));
        LJJLIIIIJ();
        AwemeDraft awemeDraft = this.LJLLLL;
        if (awemeDraft != null) {
            C10K.LIZIZ(new ACallableS105S0100000_2(awemeDraft, 17), GUL.LIZ, null);
        }
    }

    public final void LLFFF() {
        InterfaceC142545ic interfaceC142545ic;
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditAutoSaveDraftComponent saveDraftInternal ");
            LIZ.append(getLifecycle().getCurrentState());
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLILLLLZI = true;
        InterfaceC143655kP LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if ((LJJLIIIJLLLLLLLZ instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) LJJLIIIJLLLLLLLZ) != null) {
            interfaceC142545ic.Iq0();
        }
        if (LJLIIL()) {
            boolean kN = LJJLIIIJJIZ().kN();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditAutoSaveDraftComponent saveDraftInternal check point ");
            LIZ2.append(kN);
            H78.LJI(X1D.LIZIZ(LIZ2));
            if (!kN) {
                this.LJLILLLLZI = false;
                return;
            } else {
                C60903NvH.LJIIJJI().LJIIJ().LJI(LLLLIL(), LLLLIL().getCreationId(), 1, new AqS168S0100000_2(this, 231));
                return;
            }
        }
        H78.LJI("EditAutoSaveDraftComponent saveDraftInternal save draft");
        DraftInfoModel draftInfoModel = LLLLIL().creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "silence";
        XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZ), null, null, new C148925su(this, null), 3);
    }

    public final void LLIIIL() {
        if (LJLIIL()) {
            LJJZZI().LIZJ(false, false);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        H78.LJI("EditAutoSaveDraftComponent onCreate");
        LJJZZIII();
        LJLJLJ();
        if (C42000Ge4.LJIILIIL(LLLLIL())) {
            LJLLILLLL();
        } else {
            LJLZ();
        }
        LJLJJLL();
        LJZI();
        this.LJLLL = this.LJLLJ.LJIIJJI(((Number) C150285v6.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 3));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        LJJLIIIIJ();
        super.onDestroy();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150685vk getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C148915st(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC140255ev.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC147355qN.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLI = new LinkedHashMap();
        this.LJLLILLLL = new ArrayList();
        this.LJLLJ = new C73893SzJ<>();
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 352));
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 353));
    }

    public final void LJLJJL(C63D c63d) {
        if (C44384HbQ.LLJILJIL(LLLLIL()) && c63d != null) {
            c63d.U60(new C68G() { // from class: X.5sv
                @Override // X.C68G
                public final void LIZ() {
                    C148915st.this.By();
                }

                @Override // X.C68G
                public final void LIZIZ() {
                    C148915st.this.yi0();
                    C148915st.this.Pr();
                }

                @Override // X.C68G
                public final void LIZJ() {
                    C148915st.this.By();
                }
            });
        }
    }

    public final void LJLLL(C63D c63d) {
        LiveEvent<C67P> W6;
        if (c63d != null && (W6 = c63d.W6()) != null) {
            W6.LIZLLL(this, new AObjectS84S0100000_2(this, 96));
        }
    }

    public final void LLF(C142535ib c142535ib) {
        this.LJLILLLLZI = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoSaveDraftComponent saveDraftInternal save draft done ");
        LIZ.append(c142535ib.LJLIL.isSuc());
        H78.LJI(X1D.LIZIZ(LIZ));
    }
}

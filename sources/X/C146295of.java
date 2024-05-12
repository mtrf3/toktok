package X;

import Y.IDComparatorS30S0000000_2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146295of extends AbstractC29891Fh<InterfaceC143855kj> implements InterfaceC143855kj, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJI;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C5K1 LJLJJI;
    public final C5H3 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final C40871j1<List<CaptionUtterance>> LJLLI;
    public final C0IB<List<CaptionUtterance>> LJLLILLLL;
    public final C29901Fi<Long> LJLLJ;
    public final LiveEvent<Long> LJLLL;
    public final C29901Fi<C76800UCe> LJLLLL;
    public final LiveEvent<C76800UCe> LJLLLLLL;
    public XS5 LJLZ;
    public final MutableLiveData<Integer> LJZ;
    public final MutableLiveData<Integer> LJZI;
    public final MutableLiveData<Integer> LJZL;
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData<OSZ<String, Integer>> LLD;
    public final MutableLiveData<OSZ<String, Integer>> LLF;
    public final MutableLiveData<Integer> LLFF;
    public final MutableLiveData<Integer> LLFFF;
    public final MutableLiveData<C76800UCe> LLFII;
    public final LiveData<C76800UCe> LLFZ;
    public final MutableLiveData<C76800UCe> LLI;
    public final LiveData<C76800UCe> LLIFFJFJJ;
    public final C29901Fi<List<TextStickerData>> LLII;
    public final LiveEvent<List<TextStickerData>> LLIIII;
    public final C29901Fi<C76800UCe> LLIIIILZ;
    public final LiveEvent<C76800UCe> LLIIIJ;
    public final MutableLiveData<C5K1> LLIIIL;
    public final LiveData<C5K1> LLIIIZ;

    static {
        TBT tbt = new TBT(C146295of.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C146295of.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C146295of.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C146295of.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    public InterfaceC143855kj LJJLI() {
        return this;
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLJL.LIZ(this, LLIIJI[1]);
    }

    private final EditCaptionScene LJJLIIIJLLLLLLLZ() {
        return (EditCaptionScene) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC143855kj
    public void LE() {
        XS5 xs5 = this.LJLZ;
        if (xs5 != null) {
            xs5.LJIIJJI();
        }
    }

    public final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LLIIJI[0]);
    }

    public final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJLJ.LIZ(this, LLIIJI[2]);
    }

    public final InterfaceC153275zv LJJLIIIJJIZ() {
        return (InterfaceC153275zv) this.LJLJLLL.LIZ(this, LLIIJI[3]);
    }

    @Override // X.InterfaceC143855kj
    public boolean Xg() {
        XS5 xs5 = this.LJLZ;
        if (xs5 == null || !xs5.LJI()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC143855kj
    public void hide() {
        this.LJLILLLLZI.hide(LJJLIIIJLLLLLLLZ());
        LJJLIIIJLLLLLLLZ().LLLJIL(false);
    }

    @Override // X.InterfaceC143855kj
    public void rf0() {
        this.LJLLLL.LJII(null);
    }

    @Override // X.InterfaceC143855kj
    public void sc0() {
        this.LLFII.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143855kj
    public void show() {
        if (this.LJLILLLLZI.isAdded(LJJLIIIJLLLLLLLZ())) {
            this.LJLILLLLZI.show(LJJLIIIJLLLLLLLZ());
        }
        LJJLIIIJLLLLLLLZ();
        LJJLIIIJLLLLLLLZ().LLLJIL(true);
    }

    @Override // X.InterfaceC143855kj
    public void xc() {
        this.LLI.setValue(C76800UCe.LIZ);
    }

    private final InterfaceC139655dx LJJLIIJ() {
        return LJJLIIIIJ().mu().LIZ();
    }

    @Override // X.InterfaceC143855kj
    public void Ba() {
        ArrayList<TextStickerData> arrayList;
        ArrayList<StickerItemModel> arrayList2;
        ArrayList<StickerItemModel> arrayList3;
        if (!C44384HbQ.LLJILJIL(LJJLIIIJILLIZJL()) || LJJLIIIJILLIZJL().creativeModel.inlineCaptionModel == null) {
            return;
        }
        InterfaceC139655dx LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null) {
            arrayList = LJJLIIJ.sK();
            if (arrayList != null) {
                ORZ.LLILII(new IDComparatorS30S0000000_2(14), arrayList);
            }
        } else {
            arrayList = null;
        }
        sa0(arrayList);
        if (arrayList != null) {
            if (!C42000Ge4.LJIILIIL(LJJLIIIJILLIZJL())) {
                InlineCaptionModel inlineCaptionModel = LJJLIIIJILLIZJL().creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null && (arrayList3 = inlineCaptionModel.utterances) != null) {
                    arrayList3.clear();
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InlineCaptionModel inlineCaptionModel2 = LJJLIIIJILLIZJL().creativeModel.inlineCaptionModel;
                    if (inlineCaptionModel2 != null && (arrayList2 = inlineCaptionModel2.utterances) != null) {
                        Object obj = ListProtector.get(arrayList, i);
                        o.LJIIIIZZ(obj, "captionList[i]");
                        arrayList2.add(C151525x6.LJFF((TextStickerData) obj, i));
                    }
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LJJLIIIJILLIZJL().creativeModel.inlineCaptionModel = null;
    }

    @Override // X.InterfaceC143855kj
    public void notifyMusicChange() {
        String musicId;
        if (!LJJLIIIJILLIZJL().hasMusic()) {
            InterfaceC153275zv LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null) {
                LJJLIIIJJIZ.refresh();
            }
            this.LLIIIILZ.LJII(null);
            return;
        }
        if (!C133195Kp.LIZ() || (musicId = LJJLIIIJILLIZJL().getMusicId()) == null || musicId.length() == 0) {
            return;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJLIIIJILLIZJL().creativeModel.musicBuzModel);
        if (extractAVMusic != null && extractAVMusic.isLocalMusic()) {
            return;
        }
        String musicId2 = LJJLIIIJILLIZJL().getMusicId();
        o.LJIIIIZZ(musicId2, "editModel.musicId");
        C138615cH.LIZIZ(musicId2, new AqS168S0100000_2(this, 303));
    }

    @Override // X.InterfaceC143855kj
    public void oR() {
        if (!LJJLIIIJILLIZJL().isFromCrash() || LJJLIIIJILLIZJL().isFromRestoreRecover || !LJJLIIIJILLIZJL().mIsFromDraft || !C44384HbQ.LJJIIJ(LJJLIIIJILLIZJL()) || LJJLIIIJILLIZJL().captionStruct == null) {
            return;
        }
        CaptionQueryInfo captionQueryInfo = new CaptionQueryInfo(LJJLIIIJILLIZJL().captionStruct.getAudioUri(), LJJLIIIJILLIZJL().captionStruct.getTaskId());
        ArrayList<CaptionUtterance> LJIILIIL = C78841Uwv.LJIILIIL(LJJLIIIJILLIZJL());
        C5K1 c5k1 = this.LJLJJI;
        String srcLanguage = LJJLIIIJILLIZJL().captionStruct.getSrcLanguage();
        if (srcLanguage != null) {
            if (LJIILIIL != null) {
                c5k1.LIZLLL(srcLanguage, LJIILIIL, captionQueryInfo);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC143855kj
    public MutableLiveData<Integer> E0() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC143855kj
    public XS5 Fr() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC143855kj
    public LiveData<C76800UCe> Ht0() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC143855kj
    public MutableLiveData<Integer> J9() {
        return this.LJZI;
    }

    @Override // X.InterfaceC143855kj
    public LiveEvent<List<TextStickerData>> Ms() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC143855kj
    public LiveEvent<Long> OM() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC143855kj
    public LiveEvent<C76800UCe> So0() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC143855kj
    public C0IB<List<CaptionUtterance>> Wh() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC143855kj
    public LiveEvent<C76800UCe> Yf() {
        return this.LLIIIJ;
    }

    @Override // X.InterfaceC143855kj
    public LiveData<C76800UCe> ga0() {
        return this.LLFZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC143855kj getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC143855kj
    public LiveData<C5K1> lf() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC143855kj
    public MutableLiveData<OSZ<String, Integer>> p3() {
        return this.LLF;
    }

    @Override // X.InterfaceC143855kj
    public LiveData<Boolean> wt() {
        return this.LJLL;
    }

    @Override // X.InterfaceC143855kj
    public MutableLiveData<Integer> z1() {
        return this.LL;
    }

    @Override // X.InterfaceC143855kj
    public void D0(int i) {
        this.LLFF.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143855kj
    public void Jp(NLEModel nLEModel) {
        XS5 xs5 = this.LJLZ;
        if (xs5 != null) {
            xs5.LJII(nLEModel);
        }
    }

    @Override // X.InterfaceC143855kj
    public void Kw(long j) {
        this.LJLLJ.LJII(Long.valueOf(j));
    }

    @Override // X.InterfaceC143855kj
    public void So(boolean z) {
        this.LJLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC143855kj
    public void X30(List<CaptionUtterance> list) {
        this.LJLLI.LJI(list);
    }

    @Override // X.InterfaceC143855kj
    public void bi(C5K1 caches) {
        o.LJIIIZ(caches, "caches");
        this.LLIIIL.setValue(caches);
    }

    @Override // X.InterfaceC143855kj
    public void ml(OSZ<String, Integer> type) {
        o.LJIIIZ(type, "type");
        this.LLD.setValue(type);
    }

    @Override // X.InterfaceC143855kj
    public void sa0(ArrayList<TextStickerData> arrayList) {
        String str;
        C5K1 c5k1 = this.LJLJJI;
        InlineCaptionModel inlineCaptionModel = LJJLIIIJILLIZJL().creativeModel.inlineCaptionModel;
        if (inlineCaptionModel == null || (str = inlineCaptionModel.selectLanguage) == null) {
            str = "";
        }
        c5k1.LJ(str, arrayList, null);
    }

    @Override // X.InterfaceC143855kj
    public void u8(int i) {
        this.LJZL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143855kj
    public void v2(int i) {
        this.LJZ.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143855kj
    public void xn0(ArrayList<TextStickerData> list) {
        o.LJIIIZ(list, "list");
        this.LLII.LJII(list);
    }

    @Override // X.InterfaceC143855kj
    public void MP(VideoPublishEditModel model, InterfaceC143655kP interfaceC143655kP) {
        InterfaceC153045zY interfaceC153045zY;
        C133765Mu c133765Mu;
        C5MG WS;
        o.LJIIIZ(model, "model");
        NLEModel nLEModel = null;
        if (model.isCurrentAutoCutMode()) {
            if (interfaceC143655kP != null && (WS = interfaceC143655kP.WS()) != null) {
                interfaceC153045zY = WS.LJJ();
            } else {
                interfaceC153045zY = null;
            }
            if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                nLEModel = c133765Mu.LJFF();
            }
        }
        this.LJLZ = new XS7(nLEModel, model);
    }

    public C146295of(C82622Wbi diContainer, WMH parentScene, int i, C5K1 mInlineCaptionCaches) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(mInlineCaptionCaches, "mInlineCaptionCaches");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = mInlineCaptionCaches;
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 520));
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLL = new MutableLiveData<>();
        C40871j1<List<CaptionUtterance>> c40871j1 = new C40871j1<>(null);
        this.LJLLI = c40871j1;
        this.LJLLILLLL = c40871j1;
        C29901Fi<Long> c29901Fi = new C29901Fi<>();
        this.LJLLJ = c29901Fi;
        this.LJLLL = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLLLL = c29901Fi2;
        this.LJLLLLLL = c29901Fi2;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LJZ = mutableLiveData;
        this.LJZI = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LJZL = mutableLiveData2;
        this.LL = mutableLiveData2;
        MutableLiveData<OSZ<String, Integer>> mutableLiveData3 = new MutableLiveData<>();
        this.LLD = mutableLiveData3;
        this.LLF = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.LLFF = mutableLiveData4;
        this.LLFFF = mutableLiveData4;
        MutableLiveData<C76800UCe> mutableLiveData5 = new MutableLiveData<>();
        this.LLFII = mutableLiveData5;
        this.LLFZ = mutableLiveData5;
        MutableLiveData<C76800UCe> mutableLiveData6 = new MutableLiveData<>();
        this.LLI = mutableLiveData6;
        this.LLIFFJFJJ = mutableLiveData6;
        C29901Fi<List<TextStickerData>> c29901Fi3 = new C29901Fi<>();
        this.LLII = c29901Fi3;
        this.LLIIII = c29901Fi3;
        C29901Fi<C76800UCe> c29901Fi4 = new C29901Fi<>();
        this.LLIIIILZ = c29901Fi4;
        this.LLIIIJ = c29901Fi4;
        MutableLiveData<C5K1> mutableLiveData7 = new MutableLiveData<>();
        this.LLIIIL = mutableLiveData7;
        this.LLIIIZ = mutableLiveData7;
    }
}

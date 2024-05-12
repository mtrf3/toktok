package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44722Hgs extends AbstractC29891Fh<InterfaceC45081Hmf> implements InterfaceC45081Hmf, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC45081Hmf LJLILLLLZI;
    public final VideoPublishEditModel LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public C44716Hgm LJLJLLL;
    public List<AutoCutMediaModel> LJLL;
    public boolean LJLLI;

    static {
        TBT tbt = new TBT(C44722Hgs.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C44722Hgs.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C44722Hgs.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0, c65351Pkp), C61845OOz.LIZJ(C44722Hgs.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0, c65351Pkp), C61845OOz.LIZJ(C44722Hgs.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    private final InterfaceC140255ev LJJLIIIJILLIZJL() {
        return (InterfaceC140255ev) this.LJLJL.LIZ(this, LJLLILLLL[3]);
    }

    private final void LJJLJ() {
        LiveData<Void> wf0;
        MutableLiveData<Boolean> ul;
        LiveEvent<NLEModel> z60;
        if (C44701HgX.LIZJ(this.LJLJI)) {
            ((C1EP) getDiContainer().LJ(C1EP.class, null)).m3(InterfaceC146755pP.class, new AqS173S0100000_7(this, 92));
            InterfaceC140255ev LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL != null && (z60 = LJJLIIIJILLIZJL.z60()) != null) {
                z60.LIZLLL(this, new AObjectS86S0100000_7(this, 42));
            }
        }
        if (C44701HgX.LJIIJJI(this.LJLJI.creativeModel)) {
            if (H7R.LJJJJLL(this.LJLJI)) {
                InterfaceC150615vd interfaceC150615vd = (InterfaceC150615vd) getDiContainer().LJIIIIZZ(null, InterfaceC150615vd.class);
                if (interfaceC150615vd != null && (ul = interfaceC150615vd.ul()) != null) {
                    ul.observe(this, new AObjectS86S0100000_7(this, 43));
                    return;
                }
                return;
            }
            InterfaceC143655kP LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI == null || (wf0 = LJJLIIIJJI.wf0()) == null) {
                return;
            }
            wf0.observe(this, new AObserverS75S0100000_7(this, 21));
        }
    }

    private final void initData() {
        C63A c63a;
        InterfaceC153045zY interfaceC153045zY;
        C133765Mu c133765Mu;
        C5MG WS;
        InterfaceC153045zY interfaceC153045zY2;
        C133765Mu c133765Mu2;
        C5MG WS2;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        List<AutoCutThemeData> list = videoPublishEditModel.creativeModel.autoCutModel.templateList;
        if (videoPublishEditModel.mIsFromDraft && (!list.isEmpty())) {
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(list);
            NLEModel nLEModel = null;
            if (autoCutThemeData != null) {
                c63a = autoCutThemeData.LIZ();
            } else {
                c63a = null;
            }
            C63A c63a2 = C63A.SOUND_SYNC;
            if (c63a == c63a2) {
                if (AnonymousClass636.LJJ(this.LJLJI.creativeModel.autoCutModel.curSource) == c63a2) {
                    int value = EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue();
                    AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLJI.creativeModel.musicBuzModel);
                    String mMusicPath = this.LJLJI.getMMusicPath();
                    long LJIIJJI = C45087Hml.LJIIJJI(LJJLIIIJJI());
                    InterfaceC143655kP LJJLIIIJJI = LJJLIIIJJI();
                    if (LJJLIIIJJI != null && (WS2 = LJJLIIIJJI.WS()) != null) {
                        interfaceC153045zY2 = WS2.LJJ();
                    } else {
                        interfaceC153045zY2 = null;
                    }
                    if ((interfaceC153045zY2 instanceof C133765Mu) && (c133765Mu2 = (C133765Mu) interfaceC153045zY2) != null) {
                        nLEModel = c133765Mu2.LLIIIL();
                    }
                    this.LJLJLLL = new C44716Hgm(c63a2, 0, value, null, extractAVMusic, mMusicPath, LJIIJJI, nLEModel, null, null, null, 7944);
                    return;
                }
                NLEModel LJJLIIJ = LJJLIIJ(this.LJLJI);
                int value2 = EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue();
                long LJIIJJI2 = C45087Hml.LJIIJJI(LJJLIIIJJI());
                if (LJJLIIJ == null) {
                    InterfaceC143655kP LJJLIIIJJI2 = LJJLIIIJJI();
                    if (LJJLIIIJJI2 != null && (WS = LJJLIIIJJI2.WS()) != null) {
                        interfaceC153045zY = WS.LJJ();
                    } else {
                        interfaceC153045zY = null;
                    }
                    if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                        nLEModel = c133765Mu.LLIIIL();
                    }
                } else {
                    nLEModel = LJJLIIJ;
                }
                this.LJLJLLL = new C44716Hgm(c63a2, 0, value2, null, null, "", LJIIJJI2, nLEModel, null, null, null, 7944);
            }
        }
    }

    public final void LJJLI() {
        List<AutoCutMediaModel> LJFF;
        InterfaceC44718Hgo interfaceC44718Hgo;
        if (C44701HgX.LIZJ(this.LJLJI)) {
            VideoPublishEditModel videoPublishEditModel = this.LJLJI;
            if (videoPublishEditModel.mIsFromDraft || C44701HgX.LJIIIIZZ(videoPublishEditModel.creativeModel.autoCutModel) || (LJFF = C44701HgX.LJFF(C78688UuS.LJIJJ(this), this.LJLJI, getDiContainer(), true)) == null || !(!((ArrayList) LJFF).isEmpty()) || (interfaceC44718Hgo = (InterfaceC44718Hgo) getDiContainer().LJIIIIZZ(null, InterfaceC44718Hgo.class)) == null) {
                return;
            }
            int LJIJJ = C45087Hml.LJIJJ();
            boolean LIZ = CommerceMediaServiceImpl.LIZJ().LIZ();
            CreativeInfo creativeInfo = this.LJLJI.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "creativeInfo");
            interfaceC44718Hgo.Zl(LJFF, null, LJIJJ, LIZ, creativeInfo, new AqS189S0100000_7(this, 12));
        }
    }

    public final InterfaceC44717Hgn LJJLIIIIJ() {
        return (InterfaceC44717Hgn) this.LJLJJLL.LIZ(this, LJLLILLLL[2]);
    }

    public final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLLILLLL[0]);
    }

    public final InterfaceC153275zv LJJLIIIJJIZ() {
        return (InterfaceC153275zv) this.LJLJJL.LIZ(this, LJLLILLLL[1]);
    }

    public final AbstractC42651GoZ LJJLIIIJLLLLLLLZ() {
        return (AbstractC42651GoZ) this.LJLJLJ.LIZ(this, LJLLILLLL[4]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        initData();
        LJJLJ();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45081Hmf getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC45081Hmf
    public C44716Hgm jH() {
        return this.LJLJLLL;
    }

    public C44722Hgs(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = (VideoPublishEditModel) getDiContainer().LJ(VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC44717Hgn.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC140255ev.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
    }

    private final NLEModel LJJLIIJ(VideoPublishEditModel videoPublishEditModel) {
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        String str = videoPublishEditModel.creativeModel.autoCutModel.soundSyncModel.soundSyncNleData;
        if (str == null || str.length() == 0) {
            return null;
        }
        nLEEditor.LJI(videoPublishEditModel.creativeModel.autoCutModel.soundSyncModel.soundSyncNleData);
        return NLEModel.dynamicCast(nLEEditor.LJ().deepClone());
    }

    public final void LJJLJLI(boolean z) {
        InterfaceC153045zY interfaceC153045zY;
        NLEModel nLEModel;
        C133765Mu c133765Mu;
        C5MG WS;
        if (z) {
            VideoPublishEditModel videoPublishEditModel = this.LJLJI;
            if (videoPublishEditModel.editMusicSyncMode) {
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                    List<AutoCutThemeData> list = this.LJLJI.creativeModel.autoCutModel.templateList;
                    ORS.LJJLIL(C44723Hgt.LJLIL, list);
                    C44727Hgx c44727Hgx = AutoCutThemeData.Companion;
                    C63A c63a = C63A.SOUND_SYNC;
                    EnumC43998HOo enumC43998HOo = EnumC43998HOo.SOUND_SYNC_TEMPLATE;
                    int value = enumC43998HOo.getValue();
                    c44727Hgx.getClass();
                    ListProtector.add(list, 0, C44727Hgx.LIZ(LJJIJIL, c63a, value, "", null, false));
                    AnonymousClass636.LJIJJLI(this.LJLJI.creativeModel.autoCutModel, 0, c63a, enumC43998HOo.getValue(), null, null);
                    InterfaceC143655kP LJJLIIIJJI = LJJLIIIJJI();
                    if (LJJLIIIJJI != null && (WS = LJJLIIIJJI.WS()) != null) {
                        interfaceC153045zY = WS.LJJ();
                    } else {
                        interfaceC153045zY = null;
                    }
                    if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                        nLEModel = c133765Mu.LJFF();
                    } else {
                        nLEModel = null;
                    }
                    String LJJIL = C45087Hml.LJJIL(nLEModel);
                    CreativeModel creativeModel = this.LJLJI.creativeModel;
                    creativeModel.autoCutModel.soundSyncModel.soundSyncNleData = LJJIL;
                    creativeModel.autoCutAnchorModel.nleData = LJJIL;
                } else {
                    return;
                }
            }
        } else {
            ORS.LJJLIL(C44724Hgu.LJLIL, this.LJLJI.creativeModel.autoCutModel.templateList);
            AnonymousClass636.LJIJJLI(this.LJLJI.creativeModel.autoCutModel, -1, null, -1, null, null);
            CreativeModel creativeModel2 = this.LJLJI.creativeModel;
            creativeModel2.autoCutAnchorModel.nleData = null;
            creativeModel2.autoCutModel.soundSyncModel.soundSyncNleData = null;
        }
        this.LJLJI.creativeModel.autoCutModel.curRecommendTitleList = null;
    }

    @Override // X.InterfaceC45081Hmf
    public void uQ(C44716Hgm c44716Hgm) {
        if (c44716Hgm == null) {
            return;
        }
        this.LJLJLLL = c44716Hgm.LIZ();
        c44716Hgm.LIZJ = EnumC43998HOo.SOUND_SYNC_TEMPLATE.getValue();
    }
}

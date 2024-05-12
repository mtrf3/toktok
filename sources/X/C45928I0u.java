package X;

import Y.AObjectS86S0100000_7;
import Y.IDCListenerS283S0100000_7;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.panel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I0u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45928I0u extends I1J {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJI;
    public final WMH LLILZIL;
    public final int LLILZLL;
    public final ShortVideoContext LLIZ;
    public final InterfaceC115514g7 LLIZLLLIL;
    public final InterfaceC115514g7 LLJ;
    public final InterfaceC115514g7 LLJI;
    public final InterfaceC115514g7 LLJIJIL;
    public boolean LLJILJIL;
    public final C5H3 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    static {
        TBT tbt = new TBT(C45928I0u.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45928I0u.class, "recordQaStickerApi", "getRecordQaStickerApi()Lcom/ss/android/ugc/aweme/qa_sticker/RecordQaStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C45928I0u.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C45928I0u.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp)};
    }

    public static void LJLJJL(ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "-6920468815382671575")).LIZ) {
            return;
        }
        progressDialogC43239Gy3.show();
    }

    private final java.util.Map<String, String> LJLJJLL() {
        return new I15(getDiContainer(), this.LLIZ, getStickerApiComponent()).LIZLLL();
    }

    private final InterfaceC45979I2t LJLLILLLL() {
        return (InterfaceC45979I2t) this.LLIZLLLIL.LIZ(this, LLJJI[0]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LLJIJIL.LIZ(this, LLJJI[3]);
    }

    public final ProgressDialogC43239Gy3 LJLJLJ() {
        return (ProgressDialogC43239Gy3) this.LLJILJILJ.getValue();
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void W9() {
        Integer LIZ;
        if (!this.LLJJ && !I20.LIZ()) {
            x00(C45933I0z.LJLIL);
            this.LLJJ = true;
        }
        getCameraApiComponent().PY(new V8S(false, false, false));
        getStickerApiComponent().lw(false);
        C40871j1<Integer> complexTabVisibility = LJLLILLLL().getComplexTabVisibility();
        if (complexTabVisibility != null && (LIZ = complexTabVisibility.LIZ()) != null && LIZ.intValue() == 0) {
            LJLLILLLL().showComplexTab(8, null);
            this.LLJILJIL = true;
        }
        super.W9();
    }

    public final InterfaceC45932I0y getRecordQaStickerApi() {
        return (InterfaceC45932I0y) this.LLJ.LIZ(this, LLJJI[1]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLJI.LIZ(this, LLJJI[2]);
    }

    @Override // X.I1J, X.AbstractC29891Fh
    public void onDestroy() {
        ((ArrayList) HJN.LIZIZ).clear();
        ((ArrayList) HJN.LIZJ).clear();
        HJN.LIZLLL = false;
        HJN.LJ.LJII(Boolean.FALSE);
        HJN.LIZ = new CommentStickerPanelRequestApi();
        super.onDestroy();
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void s2() {
        if (!this.LLJJ && I20.LIZ()) {
            x00(C45933I0z.LJLIL);
            this.LLIIL.setValue(Boolean.TRUE);
            this.LLJJ = true;
        }
    }

    private final void LJLZ() {
        if (!C78688UuS.LJIJJ(this).isFinishing()) {
            ProgressDialogC43239Gy3 LJLJLJ = LJLJLJ();
            LJLJLJ.setCancelable(false);
            LJLJLJ.setOnCancelListener(new IDCListenerS283S0100000_7(this, 3));
            LJLJJL(LJLJLJ);
            this.LLJILLL = false;
            C44462Hcg c44462Hcg = new C44462Hcg(getStickerApiComponent());
            EoyHighlightConfig eoyHighlightConfig = C44016HPg.LIZ;
            o.LJI(eoyHighlightConfig);
            String effectId = eoyHighlightConfig.getEffectId();
            o.LJI(effectId);
            C82398WVm.LIZIZ(c44462Hcg.LIZ, C47261Igj.LJJIJ(effectId), LJLJJLL(), new C44461Hcf(c44462Hcg, new C44450HcU(this)));
        }
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void ah() {
        LJJLIIIJILLIZJL(LJLLL(C73098SmU.LJ()));
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void hidePanel() {
        getCameraApiComponent().PY(new V8S(true, false, false));
        getStickerApiComponent().lw(true);
        if (this.LLJILJIL) {
            LJLLILLLL().showComplexTab(0, null);
            this.LLJILJIL = false;
        }
        super.hidePanel();
    }

    @Override // X.I1J, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIJ().LJLLLLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 161));
        ee().LIZLLL(this, new AObjectS86S0100000_7(this, 162));
        gk0().LIZLLL(this, new AObjectS86S0100000_7(this, 163));
    }

    @Override // X.I1J
    public int LJJLJLI() {
        return this.LLILZLL;
    }

    private final QaStruct LJLLL(InterfaceC45930I0w interfaceC45930I0w) {
        long j;
        UrlModel urlModel;
        String str;
        String uid;
        if (interfaceC45930I0w != null && (uid = interfaceC45930I0w.getUid()) != null) {
            j = CastLongProtector.parseLong(uid);
        } else {
            j = 0;
        }
        String str2 = null;
        if (interfaceC45930I0w != null) {
            urlModel = interfaceC45930I0w.getAvatarThumb();
            str = interfaceC45930I0w.LJ();
        } else {
            urlModel = null;
            str = null;
        }
        if (interfaceC45930I0w != null) {
            str2 = interfaceC45930I0w.getSecUid();
        }
        return new QaStruct(0L, j, 0L, urlModel, str, "", str2, null, EnumC81462Vy6.ReplyPanel, null, null, null, null, null, 0, null, null, 130688, null);
    }

    @Override // X.I1J
    public void LJJLIIIIJ(CommentVideoModel selectedStickerModel) {
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
        InterfaceC45932I0y recordQaStickerApi = getRecordQaStickerApi();
        if (recordQaStickerApi != null && recordQaStickerApi.eN()) {
            i50(selectedStickerModel, L10().getTabName());
            C26227ARb c26227ARb = new C26227ARb(C78688UuS.LJJIII(this));
            c26227ARb.LJFF(C78688UuS.LJJIII(this).getString(R.string.pqn));
            c26227ARb.LIZIZ(C78688UuS.LJJIII(this).getString(R.string.pqm));
            UC0.LIZJ(c26227ARb, new AqS138S0200000_7(this, selectedStickerModel, 42));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        super.LJJLIIIIJ(selectedStickerModel);
    }

    @Override // X.I1J
    public void LJJLIIIJILLIZJL(QaStruct selectedStickerModel) {
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
        ShortVideoContext shortVideoContext = this.LLIZ;
        if (shortVideoContext.qaStruct != null) {
            C26227ARb LIZ = C3AW.LIZ(C78688UuS.LJJIII(this));
            LIZ.LJFF(C78688UuS.LJJIII(this).getResources().getString(R.string.pqn));
            LIZ.LIZ(R.string.pqi);
            UC0.LIZJ(LIZ, new AqS138S0200000_7(this, selectedStickerModel, 43));
            LIZ.LJI().LIZLLL();
            return;
        }
        if (shortVideoContext.commentVideoModel != null) {
            C26227ARb LIZ2 = C3AW.LIZ(C78688UuS.LJJIII(this));
            LIZ2.LJFF(C78688UuS.LJJIII(this).getResources().getString(R.string.pqn));
            LIZ2.LIZ(R.string.pmk);
            UC0.LIZJ(LIZ2, new AqS138S0200000_7(this, selectedStickerModel, 44));
            LIZ2.LJI().LIZLLL();
            return;
        }
        InterfaceC45932I0y recordQaStickerApi = getRecordQaStickerApi();
        if (recordQaStickerApi != null) {
            recordQaStickerApi.I4(selectedStickerModel);
        }
        hidePanel();
        LJZI(selectedStickerModel);
    }

    public final void LJZI(QaStruct qaStruct) {
        boolean z;
        String str;
        EoyHighlightConfig eoyHighlightConfig;
        String effectId;
        if (qaStruct != null) {
            z = C44011HPb.LIZ(qaStruct.getQuestionContent());
        } else {
            z = false;
        }
        if (z) {
            if (C82398WVm.LIZJ(getStickerApiComponent()) == null && (eoyHighlightConfig = C44016HPg.LIZ) != null && (effectId = eoyHighlightConfig.getEffectId()) != null && C78685UuP.LJJJZ(effectId)) {
                LJLZ();
                return;
            }
            return;
        }
        FaceStickerBean Z5 = getStickerApiComponent().Z5();
        if (Z5 != null) {
            str = Z5.getPropSource();
        } else {
            str = null;
        }
        if (!o.LJ(str, "qa_prop")) {
            return;
        }
        getStickerApiComponent().Sl(false, true);
        C82398WVm.LJI(getStickerApiComponent(), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45928I0u(WMH parentScene, C82622Wbi objectContainer, int i, ShortVideoContext mShortVideoContext) {
        super(objectContainer, parentScene, i, mShortVideoContext.commentVideoModel, C6IE.RECORD_PAGE_PANEL, new I1L(mShortVideoContext, null, true, 2));
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(objectContainer, "objectContainer");
        o.LJIIIZ(mShortVideoContext, "mShortVideoContext");
        this.LLILZIL = parentScene;
        this.LLILZLL = i;
        this.LLIZ = mShortVideoContext;
        this.LLIZLLLIL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLJ = UCI.LJII(getDiContainer(), InterfaceC45932I0y.class, null);
        this.LLJI = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LLJIJIL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LLJILJILJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 368));
        mShortVideoContext.LJI();
    }

    public static /* synthetic */ void LLF(C45928I0u c45928I0u, QaStruct qaStruct, int i, Object obj) {
        if ((i & 1) != 0) {
            qaStruct = null;
        }
        c45928I0u.LJZI(qaStruct);
    }
}

package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.AgS120S0100000_2;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150345vC extends AbstractC29891Fh<C0I6> implements InterfaceC135635Tz, C0I6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public final C0I6 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public boolean LJLL;

    static {
        TBT tbt = new TBT(C150345vC.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C150345vC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150345vC.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150345vC.class, "switchModeApi", "getSwitchModeApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150345vC.class, "iEditStickerScene", "getIEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/IEditStickerScene;", 0, c65351Pkp), C61845OOz.LIZJ(C150345vC.class, "iEditCompileCallback", "getIEditCompileCallback()Lcom/ss/android/ugc/gamora/editor/IEditCompileCallback;", 0, c65351Pkp), C61845OOz.LIZJ(C150345vC.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    private final InterfaceC147865rC LJJLI() {
        return (InterfaceC147865rC) this.LJLJLLL.LIZ(this, LJLLI[6]);
    }

    private final InterfaceC139655dx LJJLIIIIJ() {
        return (InterfaceC139655dx) this.LJLJJL.LIZ(this, LJLLI[2]);
    }

    private final InterfaceC137115Zr LJJLIIIJJI() {
        return (InterfaceC137115Zr) this.LJLJLJ.LIZ(this, LJLLI[5]);
    }

    private final InterfaceC150315v9 LJJLIIIJJIZ() {
        return (InterfaceC150315v9) this.LJLJL.LIZ(this, LJLLI[4]);
    }

    private final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJJI.LIZ(this, LJLLI[1]);
    }

    public final VideoPublishEditModel LJJLIIIJLLLLLLLZ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLLI[0]);
    }

    public final InterfaceC150355vD LJJLIIJ() {
        return (InterfaceC150355vD) this.LJLJJLL.LIZ(this, LJLLI[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLJ() {
        String str;
        List<StickerItemModel> list;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        if (!C42000Ge4.LJIILIIL(LJJLIIIJLLLLLLLZ())) {
            List<TextStickerData> RW = LJJLIIIIJ().RW();
            ArrayList arrayList = new ArrayList(C32I.LJJL(RW, 10));
            int i = 0;
            for (TextStickerData textStickerData : RW) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(C151525x6.LJFF(textStickerData, i));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c61878OQg = arrayList;
            if (LJJLIIIJLLLLLLLZ().infoStickerModel == null) {
                boolean z = !arrayList.isEmpty();
                c61878OQg = arrayList;
                if (z) {
                    LJJLIIIJLLLLLLLZ().infoStickerModel = new InfoStickerModel(LJJLIIIJLLLLLLLZ().draftDir());
                    c61878OQg = arrayList;
                }
            }
        }
        InfoStickerModel infoStickerModel = LJJLIIIJLLLLLLLZ().infoStickerModel;
        if (infoStickerModel != null) {
            infoStickerModel.clearTextStickers();
        }
        VideoPublishEditModel LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        InterfaceC153045zY LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            str = LJJLIIIJILLIZJL.LLJJL();
        } else {
            str = null;
        }
        LJJLIIIJLLLLLLLZ.nleData = str;
        InfoStickerModel infoStickerModel2 = LJJLIIIJLLLLLLLZ().infoStickerModel;
        if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
            list.addAll(c61878OQg);
        }
        InterfaceC150315v9 LJJLIIIJJIZ = LJJLIIIJJIZ();
        InterfaceC153045zY LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
        o.LJI(LJJLIIIJILLIZJL2);
        C10K<C76800UCe> LLIIJLIL = LJJLIIIJJIZ.LLIIJLIL(LJJLIIIJILLIZJL2, LJJLIIIJJI(), null);
        if (LLIIJLIL.LJIILIIL()) {
            LJJLJLI();
            LJJLIIJ().dG();
        } else {
            C10K.LJIJJ(C47261Igj.LJJIJ(LLIIJLIL)).LJ(new AgS120S0100000_2(this, 9), C10K.LJIIIIZZ, null);
        }
    }

    private final InterfaceC153045zY LJJLIIIJILLIZJL() {
        return Ll0().Kh().getValue();
    }

    public final void LJJLJLI() {
        LJJLIIIJJIZ().LJI();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        InterfaceC139535dl fB;
        LiveEvent<Boolean> Ej;
        C29901Fi<C76800UCe> c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2;
        super.onCreate();
        Ll0().bq0().observe(this, new AObserverS70S0100000_2(this, 33));
        LJJLIIJ().yI().observe(this, new AObserverS70S0100000_2(this, 34));
        C45054HmE c45054HmE = (C45054HmE) getDiContainer().LJIIIIZZ(null, C45054HmE.class);
        if (c45054HmE != null && (c29901Fi2 = c45054HmE.LJLLILLLL) != null) {
            c29901Fi2.LIZLLL(this, new AObjectS84S0100000_2(this, 21));
        }
        C45054HmE c45054HmE2 = (C45054HmE) getDiContainer().LJIIIIZZ(null, C45054HmE.class);
        if (c45054HmE2 != null && (c29901Fi = c45054HmE2.LJLLJ) != null) {
            c29901Fi.LIZLLL(this, new AObjectS84S0100000_2(this, 22));
        }
        InterfaceC147865rC LJJLI = LJJLI();
        if (LJJLI != null && (fB = LJJLI.fB()) != null && (Ej = fB.Ej()) != null) {
            Ej.LIZLLL(this, new AObjectS84S0100000_2(this, 23));
        }
        Ll0().qv().observe(this, new AObserverS70S0100000_2(this, 35));
    }

    @Override // X.AbstractC29891Fh
    public C0I6 getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C150345vC(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC139655dx.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC150355vD.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC150315v9.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC137115Zr.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
    }
}

package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5Zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137025Zi extends AbstractC29891Fh<InterfaceC136985Ze> implements InterfaceC136985Ze, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    static {
        TBT tbt = new TBT(C137025Zi.class, "autoCutControlApi", "getAutoCutControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C137025Zi.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C137025Zi.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C137025Zi.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C137025Zi.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp)};
    }

    public InterfaceC136985Ze LJJLI() {
        return this;
    }

    private final InterfaceC137035Zj LJJLIIIIJ() {
        return (InterfaceC137035Zj) this.LJLILLLLZI.LIZ(this, LJLJLLL[0]);
    }

    private final InterfaceC142515iZ LJJLIIIJILLIZJL() {
        return (InterfaceC142515iZ) this.LJLJJLL.LIZ(this, LJLJLLL[4]);
    }

    private final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLJLLL[2]);
    }

    private final InterfaceC147865rC LJJLIIIJJIZ() {
        return (InterfaceC147865rC) this.LJLJJL.LIZ(this, LJLJLLL[3]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.InterfaceC136985Ze
    public void i20() {
        if (!this.LJLJLJ) {
            LJJLIIIIJ().Q70();
            InterfaceC147865rC LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null) {
                LJJLIIIJJIZ.WW(true);
            }
            InterfaceC139655dx LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ != null) {
                LJJLIIIJLLLLLLLZ.M6();
            }
            this.LJLJLJ = true;
        }
        this.LJLJL = true;
    }

    @Override // X.InterfaceC136985Ze
    public void ja0() {
        String str;
        if (this.LJLJL) {
            LJJLIIIIJ().P60(true);
            this.LJLJL = false;
            AutoCutAnchorModel autoCutAnchorModel = LLLLIL().creativeModel.autoCutAnchorModel;
            InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
            if (value != null) {
                str = value.LLJJL();
            } else {
                str = null;
            }
            autoCutAnchorModel.nleData = str;
        }
    }

    private final InterfaceC139655dx LJJLIIIJLLLLLLLZ() {
        return LJJLIIIJILLIZJL().mu().LIZ();
    }

    @Override // X.InterfaceC136985Ze
    public void nW() {
        if (!Bz()) {
            return;
        }
        LJJLIIIIJ().Pq(true);
        this.LJLJL = false;
        this.LJLJLJ = false;
    }

    @Override // X.InterfaceC136985Ze
    public void uA() {
        LJJLIIIIJ().Nj();
        this.LJLJL = true;
        this.LJLJLJ = false;
    }

    @Override // X.InterfaceC136985Ze
    public boolean Bz() {
        return this.LJLJL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC136985Ze getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C137025Zi(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC137035Zj.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
    }
}

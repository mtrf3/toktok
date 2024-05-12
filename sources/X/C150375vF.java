package X;

import Y.AObjectS84S0100000_2;
import android.app.Activity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150375vF extends AbstractC29891Fh<C0I6> implements C0I6, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final C0I6 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;

    static {
        TBT tbt = new TBT(C150375vF.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C150375vF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150375vF.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150375vF.class, "iStickerSelectListener", "getIStickerSelectListener()Lcom/ss/android/ugc/aweme/infoSticker/IStickerSelectListener;", 0, c65351Pkp), C61845OOz.LIZJ(C150375vF.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150375vF.class, "streamEditComponent", "getStreamEditComponent()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/streamedit/StreamEditApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150375vF.class, "editStickerPanelCompatibleAdapter", "getEditStickerPanelCompatibleAdapter()Lcom/ss/android/ugc/gamora/editor/EditStickerPanelCompatibleAdapter;", 0, c65351Pkp)};
    }

    private final Activity LJJLIIIIJ() {
        return (Activity) this.LJLJI.LIZ(this, LJLL[0]);
    }

    private final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLL[1]);
    }

    private final C147265qE LJJLIIIJJIZ() {
        return (C147265qE) this.LJLJLLL.LIZ(this, LJLL[6]);
    }

    private final InterfaceC153275zv LJJLIIIJLLLLLLLZ() {
        return (InterfaceC153275zv) this.LJLJL.LIZ(this, LJLL[4]);
    }

    public final InterfaceC164126cK LJJLIIIJJI() {
        return (InterfaceC164126cK) this.LJLJJL.LIZ(this, LJLL[2]);
    }

    public final InterfaceC150395vH LJJLIIJ() {
        return (InterfaceC150395vH) this.LJLJJLL.LIZ(this, LJLL[3]);
    }

    public final InterfaceC163116ah LJJLJ() {
        return (InterfaceC163116ah) this.LJLJLJ.LIZ(this, LJLL[5]);
    }

    private final void LJJLL() {
        LJJLIIIJJI().Zx();
        LJJLIIIJJI().R80(new InterfaceC150395vH() { // from class: X.5vG
            @Override // X.InterfaceC150395vH
            public final void W3() {
                C150375vF.this.LJJLIIJ().W3();
            }

            @Override // X.InterfaceC150395vH
            public final void s1() {
                C150375vF.this.LJJLIIJ().s1();
            }

            @Override // X.InterfaceC150395vH
            public final void O9(Effect effect, String str) {
                o.LJIIIZ(effect, "effect");
                C150375vF.this.LJJLIIJ().O9(effect, str);
            }
        });
    }

    public final void LJJLI() {
        C164116cJ.LIZ(LJJLIIIJJI(), true, 0L, 6);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJILLIZJL().wf0().observe(this, new AObjectS84S0100000_2(this, 129));
        LJJLIIIJJIZ().LIZJ.LIZIZ(this, new AObjectS84S0100000_2(this, 130));
        LJJLIIIJLLLLLLLZ().qa().observe(this, new AObjectS84S0100000_2(this, 131));
        LJJLIIIJJIZ().LIZIZ.LIZLLL(this, new AObjectS84S0100000_2(this, 132));
        LJJLIIIJJIZ().LIZ.LIZLLL(this, new AObjectS84S0100000_2(this, 133));
    }

    public final void LJJLJLI() {
        LJJLL();
    }

    @Override // X.AbstractC29891Fh
    public C0I6 getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C150375vF(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), Activity.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC164126cK.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC150395vH.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC163116ah.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), C147265qE.class, null);
    }
}

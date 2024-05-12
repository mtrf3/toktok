package X;

import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142495iX extends AbstractC29891Fh<InterfaceC140255ev> implements InterfaceC140255ev, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public boolean LJLJJLL;
    public C29901Fi<NLEModel> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final LiveEvent<C76800UCe> LJLJLLL;
    public final InterfaceC115514g7 LJLL;

    static {
        TBT tbt = new TBT(C142495iX.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C142495iX.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C142495iX.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C142495iX.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C142495iX.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp)};
    }

    public InterfaceC140255ev LJJLI() {
        return this;
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLL.LIZ(this, LJLLI[4]);
    }

    private final AbstractC42651GoZ LJJLIIIJJIZ() {
        return (AbstractC42651GoZ) this.LJLILLLLZI.LIZ(this, LJLLI[0]);
    }

    public final InterfaceC137035Zj LJJLIIIJILLIZJL() {
        return (InterfaceC137035Zj) this.LJLJJL.LIZ(this, LJLLI[3]);
    }

    public final VideoPublishEditModel LJJLIIIJJI() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLLI[1]);
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJJI.LIZ(this, LJLLI[2]);
    }

    private final boolean LJJLJLI() {
        if (!H7R.LJIIL(LJJLIIIJJI())) {
            return false;
        }
        if (C41647GWd.LIZ() && LJJLIIIJJI().isFromRestoreRecover) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        String str;
        super.onCreate();
        LJJLIIIIJ().rN(this);
        if (!H7R.LJJLIIIJL(LJJLIIIJJI()) && !LJJLJLI()) {
            Bundle bundle = LJJLIIIJJIZ().mArguments;
            if (bundle != null) {
                str = bundle.getString("editor_pro_anchor_type");
            } else {
                str = null;
            }
            if (!C78685UuP.LJJJZ(str)) {
                if (LJJLIIIJJI().getEditorProModel().getFromEditorProEntranceInAlbum() && !H7R.LJJJI(LJJLIIIJJI())) {
                    return;
                }
                if (!e1.LIZ(31744, "editor_lazy_save_check_point", true, false)) {
                    j70(null);
                } else {
                    Ll0().wf0().observe(this, new AObserverS70S0100000_2(this, 78));
                }
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIIJ().rN(null);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC140255ev getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC140255ev
    public LiveEvent<C76800UCe> jq() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC140255ev
    public boolean kN() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC140255ev
    public LiveEvent<NLEModel> z60() {
        return this.LJLJL;
    }

    public C142495iX(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC137035Zj.class, null);
        this.LJLJL = new C29901Fi<>();
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJLJ = c29901Fi;
        this.LJLJLLL = c29901Fi;
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
    }

    private final void LJJLIIJ(C142535ib c142535ib) {
        if (c142535ib.LJLIL.getErrorCode() == 0 && (!c142535ib.LJLILLLLZI.LJIJI.isEmpty())) {
            C43045Guv.LIZLLL(new AqS149S0200000_2(this, c142535ib, 33), 0L);
        }
    }

    @Override // X.InterfaceC140255ev
    public void Nd0(InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns) {
        if (!kN()) {
            j70(interfaceC88472Yns);
        }
    }

    @Override // X.InterfaceC140255ev
    public void j70(InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns) {
        String str;
        if (C6KD.LIZIZ(LJJLIIIJJI()) != null) {
            return;
        }
        Bundle bundle = LJJLIIIJJIZ().mArguments;
        if (bundle != null) {
            str = bundle.getString("file_path");
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            if (!LJJLIIIJJI().creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene() && !C44384HbQ.LJLLLLLL(LJJLIIIJJI()) && !H7R.LJJLIIIJJIZ(LJJLIIIJJI())) {
                this.LJLJJLL = true;
                Ll0().Iq0();
                C60903NvH.LJIIJJI().LJIIJ().LJI(LJJLIIIJJI(), LJJLIIIJJI().getCreationId(), 1, new AqS133S0200000_2(this, (C142495iX) interfaceC88472Yns, (InterfaceC88472Yns<? super C142535ib, C76800UCe>) 49));
                return;
            }
            return;
        }
        C6KC.LIZ(str, new AqS133S0200000_2(this, (C142495iX) interfaceC88472Yns, (InterfaceC88472Yns<? super C142535ib, C76800UCe>) 48));
    }

    private final void LJJLIIIJLLLLLLLZ(VideoPublishEditModel videoPublishEditModel, C142535ib c142535ib) {
        if (c142535ib.LJLIL.getErrorCode() == 0 && (!c142535ib.LJLILLLLZI.LJIJI.isEmpty())) {
            C43045Guv.LIZLLL(new AqS149S0200000_2(videoPublishEditModel, c142535ib, 32), 0L);
        }
    }

    public static final void LJJLJ(C142495iX c142495iX, InterfaceC88472Yns<? super C142535ib, C76800UCe> interfaceC88472Yns, C142535ib c142535ib) {
        c142495iX.LJJLIIIJLLLLLLLZ(c142495iX.LJJLIIIJJI(), c142535ib);
        c142495iX.LJJLIIJ(c142535ib);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c142535ib);
        }
        c142495iX.LJLJLJ.LJII(C76800UCe.LIZ);
    }
}

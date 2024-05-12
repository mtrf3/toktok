package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.66t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1550766t extends WM7 implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public final C82631Wbr LJLILLLLZI;
    public InterfaceC152085y0 LJLJI;
    public List<Utterance> LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 518));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 519));

    static {
        TBT tbt = new TBT(C1550766t.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C1550766t.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1550766t.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1550766t.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C1550766t.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp)};
    }

    public final VideoPublishEditModel LLJILJIL() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LJLLI[3]);
    }

    public final C1551366z LLJILJILJ() {
        return (C1551366z) this.LJLL.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LJLLI[2]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLJI;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJLJLLL.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
    }

    public C1550766t(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = UCI.LJII(c82622Wbi, InterfaceC143855kj.class, null);
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC147865rC.class, null);
        this.LJLJJLL = UCI.LJI(c82622Wbi, InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, InterfaceC147905rG.class, null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        C0IB<List<CaptionUtterance>> Wh;
        super.onActivityCreated(bundle);
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 125));
        C82631Wbr c82631Wbr = this.LJLILLLLZI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
        InterfaceC143855kj interfaceC143855kj = (InterfaceC143855kj) c82631Wbr.LIZ(this, interfaceC74236TBoArr[0]);
        if (interfaceC143855kj != null && (Wh = interfaceC143855kj.Wh()) != null) {
            Wh.LIZIZ(this, new AObjectS84S0100000_2(this, 211));
        }
        ((InterfaceC147865rC) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[1])).Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 212));
        LLJILJILJ().LJLLILLLL = new C6BO() { // from class: X.66s
            @Override // X.C6BO
            public final void LIZ() {
            }

            @Override // X.C6BO
            public final void LIZIZ() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                o.LJIIIZ(view, "view");
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
            }

            @Override // X.C6BO
            public final void LIZJ() {
                H8F.LJJIIJZLJL(0, C1550766t.this.LLJILJIL(), "menu", null);
                C1550766t c1550766t = C1550766t.this;
                InterfaceC143855kj interfaceC143855kj2 = (InterfaceC143855kj) c1550766t.LJLILLLLZI.LIZ(c1550766t, C1550766t.LJLLI[0]);
                if (interfaceC143855kj2 != null) {
                    interfaceC143855kj2.show();
                }
            }

            @Override // X.C6BO
            public final void LIZLLL() {
                C1550766t c1550766t = C1550766t.this;
                InterfaceC143855kj interfaceC143855kj2 = (InterfaceC143855kj) c1550766t.LJLILLLLZI.LIZ(c1550766t, C1550766t.LJLLI[0]);
                if (interfaceC143855kj2 != null) {
                    interfaceC143855kj2.X30(null);
                }
                C1550766t.this.LLJILJILJ().LJJII();
                C1550766t.this.LLJILJIL().captionStruct = null;
                H8F.LJJJJIZL(C1550766t.this.LLJILJIL(), "click_menu", 1, 0, "", null, 0, null);
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C1550766t c1550766t = C1550766t.this;
                ((InterfaceC147905rG) c1550766t.LJLJLJ.LIZ(c1550766t, C1550766t.LJLLI[4])).LIZLLL();
                if (z) {
                    C1550766t.this.getEditPreviewApi().U2(true, true, true);
                } else {
                    C1550766t.this.getEditPreviewApi().U2(false, true, false);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C1550766t c1550766t = C1550766t.this;
                    ((InterfaceC147865rC) c1550766t.LJLJJL.LIZ(c1550766t, C1550766t.LJLLI[1])).R10(5);
                }
            }
        };
        C1551366z LLJILJILJ = LLJILJILJ();
        AnonymousClass672 anonymousClass672 = new AnonymousClass672() { // from class: X.66u
            @Override // X.AnonymousClass672
            public final void LIZ(int i) {
                CaptionStruct captionStruct = C1550766t.this.LLJILJIL().captionStruct;
                if (captionStruct != null) {
                    captionStruct.setLocation(i);
                }
            }
        };
        LLJILJILJ.getClass();
        C156436Bz c156436Bz = LLJILJILJ.LLII;
        if (c156436Bz != null) {
            c156436Bz.setOnCaptionStickerListener(anonymousClass672);
        }
        LLJILJILJ.LLIIIJ = anonymousClass672;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (getEditPreviewApi().Kh().getValue() != null) {
            LLJILJILJ().LJIJJ(this.mActivity, (FrameLayout) container);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLJI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJLJLLL.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        LLJILJILJ().LLIIIILZ = LLJILJIL();
        LLJILJILJ().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        LLJILJILJ().getClass();
        return new View(requireSceneContext());
    }
}

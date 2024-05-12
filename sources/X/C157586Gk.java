package X;

import android.app.Activity;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157586Gk extends AbstractC29891Fh<InterfaceC150885w4> implements InterfaceC150885w4, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final C82622Wbi LJLIL;
    public final ViewStub LJLILLLLZI;
    public final ViewStub LJLJI;
    public final CreativeInfo LJLJJI;
    public final ImageAlbumData LJLJJL;
    public final SparseArray<C157616Gn> LJLJJLL;
    public C6PV LJLJL;
    public FrameLayout LJLJLJ;
    public InterfaceC150615vd LJLJLLL;
    public final C5H3 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C6XL LJLLJ;

    static {
        TBT tbt = new TBT(C157586Gk.class, "editItemStickerApi", "getEditItemStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC150885w4 LJJLI() {
        return this;
    }

    private final InterfaceC150895w5 LJJLIIIIJ() {
        return (InterfaceC150895w5) this.LJLLI.LIZ(this, LJLLL[0]);
    }

    private final InterfaceC159886Pg LJJLIIIJILLIZJL() {
        return (InterfaceC159886Pg) this.LJLL.getValue();
    }

    private final InterfaceC160026Pu LJJLIIIJJI() {
        return new InterfaceC160026Pu() { // from class: X.6Gm
            @Override // X.InterfaceC160026Pu
            public final void LJ(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJI(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIIIZZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILJJIL(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJ(StickerModel stickerModel, int i) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJJ() {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIL(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZIZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC150615vd interfaceC150615vd = C157586Gk.this.LJLJLLL;
                if (interfaceC150615vd != null) {
                    interfaceC150615vd.U2(false, true, false);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZLLL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC150615vd interfaceC150615vd = C157586Gk.this.LJLJLLL;
                if (interfaceC150615vd != null) {
                    interfaceC150615vd.U2(true, true, true);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LJFF(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJII(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIIZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIJJI(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIZILJ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIJI(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZ(StickerModel stickerModel, boolean z) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILLIIL(StickerModel stickerModel, String str) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }
        };
    }

    private final C6H7 LJJLIIIJJIZ() {
        return (C6H7) this.LJLLILLLL.getValue();
    }

    public final InterfaceC159886Pg LJJLIIIJLLLLLLLZ() {
        return new InterfaceC159886Pg() { // from class: X.6Gl
            @Override // X.InterfaceC159886Pg
            public final void LJ(boolean z) {
            }

            @Override // X.InterfaceC159886Pg
            public final C6OE LJFF() {
                return null;
            }

            @Override // X.InterfaceC159886Pg
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC159886Pg
            public final C6SL LJIIJ() {
                return null;
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC159886Pg
            public final int LJIIL() {
                return 0;
            }

            @Override // X.InterfaceC159886Pg
            public final InterfaceC153045zY LIZIZ() {
                C135235Sl c135235Sl = new C135235Sl();
                ScheduledExecutorService LJ = C38995FSd.LJ();
                o.LJIIIIZZ(LJ, "getScheduledExecutor()");
                return new C5KX(c135235Sl, LJ).LJJ();
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZJ() {
                return new ArrayList();
            }

            @Override // X.InterfaceC159886Pg
            public final RTY LJI() {
                return C157586Gk.this.LJJLIIJ();
            }

            @Override // X.InterfaceC159886Pg
            public final C6O5 LJIIIIZZ() {
                return new C152885zI(C78688UuS.LJJIII(C157586Gk.this));
            }

            @Override // X.InterfaceC159886Pg
            public final float LIZLLL() {
                return LIZIZ().getDuration();
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZ() {
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILIIL(int i) {
                InterfaceC150615vd interfaceC150615vd;
                if (i == 2 && (interfaceC150615vd = C157586Gk.this.LJLJLLL) != null) {
                    interfaceC150615vd.U2(false, true, false);
                }
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILJJIL(int i) {
                InterfaceC150615vd interfaceC150615vd;
                if (i == 2 && (interfaceC150615vd = C157586Gk.this.LJLJLLL) != null) {
                    interfaceC150615vd.U2(true, true, true);
                }
            }
        };
    }

    public final C6H7 LJJLJ() {
        C159816Oz c159816Oz = new C159816Oz(C43073GvN.LIZLLL(C62850Ola.LJ(), this.LJLJJI, EnumC43649HBd.IMAGE_STICKER, null, false, 12), C47261Igj.LJII(new C159636Oh(EnumC157656Gr.PICTURE_HASHTAG_GLOBAL, 35, true, true, true, true, true, (List) C47261Igj.LJII(2), false, (String) null, (OSZ) null, false, false, false, false, false, 130816)), 11);
        this.LJLILLLLZI.setLayoutResource(R.layout.cnr);
        View inflate = this.LJLILLLLZI.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLJLJ = (FrameLayout) inflate;
        this.LJLJI.setLayoutResource(R.layout.cnr);
        View inflate2 = this.LJLJI.inflate();
        o.LJII(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate2;
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        FrameLayout frameLayout2 = this.LJLJLJ;
        if (frameLayout2 != null) {
            C6PV c6pv = new C6PV(LJIJJ, frameLayout2, frameLayout, this, LJJLIIIJILLIZJL(), c159816Oz);
            this.LJLJL = c6pv;
            c6pv.LLLILZJ(LJJLIIIJJI());
            int size = this.LJLJJLL.size();
            for (int i = 0; i < size; i++) {
                C157616Gn c157616Gn = this.LJLJJLL.get(this.LJLJJLL.keyAt(i));
                if (c157616Gn.LIZIZ == null) {
                    C6PV c6pv2 = this.LJLJL;
                    if (c6pv2 != null) {
                        C6V4 c6v4 = new C6V4(410, c6pv2.LJIIJJI());
                        c157616Gn.LIZIZ = c6v4;
                        c157616Gn.LIZ.LIZIZ(c6v4);
                    } else {
                        o.LJIJI("stickerManager");
                        throw null;
                    }
                }
            }
            C6PV c6pv3 = this.LJLJL;
            if (c6pv3 != null) {
                c6pv3.initService();
                C6PV c6pv4 = this.LJLJL;
                if (c6pv4 != null) {
                    return c6pv4;
                }
                o.LJIJI("stickerManager");
                throw null;
            }
            o.LJIJI("stickerManager");
            throw null;
        }
        o.LJIJI("stickerViewParent");
        throw null;
    }

    @Override // X.InterfaceC150885w4
    public void ja() {
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : LJJLIIIJJIZ().LIZJ()) {
            if (stickerModel instanceof GlobalHashTagStickerModel) {
                arrayList.add(stickerModel);
            }
        }
        this.LJLJJL.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(arrayList, null, null, 6, null));
    }

    public final RTY LJJLIIJ() {
        UrlModel urlModel;
        String LIZIZ;
        float f;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            urlModel = LJ.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (C6DX.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            C44423Hc3 LJ2 = C73098SmU.LJ();
            Resources resources = C78688UuS.LJJIII(this).getResources();
            o.LJIIIIZZ(resources, "context.resources");
            LIZ.append(C41532GRs.LIZIZ(LJ2, resources));
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            C44423Hc3 LJ3 = C73098SmU.LJ();
            Resources resources2 = C78688UuS.LJJIII(this).getResources();
            o.LJIIIIZZ(resources2, "context.resources");
            LIZIZ = C41532GRs.LIZIZ(LJ3, resources2);
        }
        if (C6DX.LIZIZ()) {
            f = 17.0f;
        } else {
            f = 15.0f;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(C41532GRs.LIZ(C78688UuS.LJJIII(this), C60903NvH.LJIIJJI().getAccountService().getCurrentUser()));
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        float LIZ3 = C6DY.LIZ();
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        return new RTY(LIZ3, urlModel, LIZIZ, f, LIZIZ2, 7);
    }

    @Override // X.InterfaceC150885w4
    public void Ot0() {
        C157706Gw.LIZIZ(LJJLIIIJJIZ(), EnumC157656Gr.PICTURE_HASHTAG_GLOBAL, null, C157626Go.LJLIL, 6);
    }

    @Override // X.InterfaceC150885w4
    public List<StickerModel> d8() {
        return LJJLIIIJJIZ().LIZJ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        ImageStickerInfoNewEngine stickerInfoNewEngine = this.LJLJJL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null) {
            Iterator<GlobalHashTagStickerModel> it = stickerInfoNewEngine.getHashStickersGlobal().iterator();
            while (it.hasNext()) {
                C157706Gw.LIZ(LJJLIIIJJIZ(), it.next(), EnumC157656Gr.PICTURE_HASHTAG_GLOBAL);
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150885w4 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC150885w4
    public void Bj(int i) {
        C6V4 c6v4;
        C157616Gn c157616Gn = this.LJLJJLL.get(i);
        if (c157616Gn != null && (c6v4 = c157616Gn.LIZIZ) != null) {
            c157616Gn.LIZ.LIZ(c6v4);
        }
        this.LJLJJLL.remove(i);
    }

    @Override // X.InterfaceC150885w4
    public void LLFII(boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            frameLayout.setVisibility(i);
        }
    }

    @Override // X.InterfaceC150885w4
    public void pt(int i, InterfaceC152085y0 gestureService) {
        o.LJIIIZ(gestureService, "gestureService");
        C6PV c6pv = this.LJLJL;
        if (c6pv == null) {
            this.LJLJJLL.put(i, new C157616Gn(gestureService, null));
            return;
        }
        C6V4 c6v4 = new C6V4(410, c6pv.LJIIJJI());
        gestureService.LIZIZ(c6v4);
        this.LJLJJLL.put(i, new C157616Gn(gestureService, c6v4));
    }

    public C157586Gk(C82622Wbi diContainer, ViewStub stickerViewStub, ViewStub stickerHigherViewStub, CreativeInfo creativeInfo, ImageAlbumData albumData) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerViewStub, "stickerViewStub");
        o.LJIIIZ(stickerHigherViewStub, "stickerHigherViewStub");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(albumData, "albumData");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = stickerViewStub;
        this.LJLJI = stickerHigherViewStub;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = albumData;
        this.LJLJJLL = new SparseArray<>();
        this.LJLJLLL = (InterfaceC150615vd) getDiContainer().LJIIIIZZ(null, InterfaceC150615vd.class);
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 92));
        this.LJLLI = new InterfaceC115514g7() { // from class: X.5p2
            @Override // X.InterfaceC115514g7
            public final T LIZ(Object obj, InterfaceC74236TBo<?> interfaceC74236TBo) {
                o.LJIIIZ(obj, "<anonymous parameter 0>");
                o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
                InterfaceC151215wb interfaceC151215wb = (InterfaceC151215wb) InterfaceC135635Tz.this.getDiContainer().LJIIIIZZ(null, InterfaceC151215wb.class);
                if (interfaceC151215wb == null) {
                    return null;
                }
                return (T) interfaceC151215wb.br0(InterfaceC150895w5.class);
            }
        };
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 93));
        this.LJLLJ = (C6XL) getDiContainer().LJ(C6XL.class, null);
    }
}

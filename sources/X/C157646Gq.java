package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157646Gq extends AbstractC29891Fh<InterfaceC150895w5> implements InterfaceC150895w5, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final ViewStub LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final CreativeInfo LJLJJI;
    public final SingleImageData LJLJJL;
    public final int LJLJJLL;
    public InterfaceC150615vd LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public FrameLayout LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;

    static {
        TBT tbt = new TBT(C157646Gq.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC150895w5 LJJLI() {
        return this;
    }

    @Override // X.InterfaceC150895w5
    public void yu() {
    }

    private final InterfaceC159886Pg LJJLIIIIJ() {
        return (InterfaceC159886Pg) this.LJLL.getValue();
    }

    private final InterfaceC152085y0 LJJLIIIJILLIZJL() {
        return (InterfaceC152085y0) this.LJLJLJ.LIZ(this, LJLLILLLL[0]);
    }

    private final InterfaceC160026Pu LJJLIIIJJI() {
        return new InterfaceC160026Pu() { // from class: X.6Gv
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
                InterfaceC150615vd interfaceC150615vd = C157646Gq.this.LJLJL;
                if (interfaceC150615vd != null) {
                    interfaceC150615vd.U2(false, true, false);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZLLL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC150615vd interfaceC150615vd = C157646Gq.this.LJLJL;
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
        return (C6H7) this.LJLLI.getValue();
    }

    public final InterfaceC159886Pg LJJLIIIJLLLLLLLZ() {
        return new InterfaceC159886Pg() { // from class: X.6Gp
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
                return C157646Gq.this.LJJLIIJ();
            }

            @Override // X.InterfaceC159886Pg
            public final C6O5 LJIIIIZZ() {
                return new C152885zI(C78688UuS.LJJIII(C157646Gq.this));
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
                if (i == 2 && (interfaceC150615vd = C157646Gq.this.LJLJL) != null) {
                    interfaceC150615vd.U2(false, true, false);
                }
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILJJIL(int i) {
                InterfaceC150615vd interfaceC150615vd;
                if (i == 2 && (interfaceC150615vd = C157646Gq.this.LJLJL) != null) {
                    interfaceC150615vd.U2(true, true, true);
                }
            }
        };
    }

    public final C6H7 LJJLJ() {
        C159816Oz c159816Oz = new C159816Oz(C43073GvN.LIZLLL(C62850Ola.LJ(), this.LJLJJI, EnumC43649HBd.IMAGE_STICKER, null, false, 12), C47261Igj.LJII(new C159636Oh(EnumC157656Gr.PICTURE_HASHTAG_SINGLE, 35, true, true, true, true, true, (List) C47261Igj.LJII(2), false, (String) null, (OSZ) null, false, false, false, false, false, 130816), new C159636Oh(EnumC157656Gr.PICTURE_HASHTAG_EMBED, 35, true, true, true, false, true, (List) C47261Igj.LJII(2), false, (String) null, (OSZ) null, false, false, false, false, false, 130816)), 11);
        this.LJLILLLLZI.setLayoutResource(R.layout.cnr);
        View inflate = this.LJLILLLLZI.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLJLLL = (FrameLayout) inflate;
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            C6PV c6pv = new C6PV(LJIJJ, frameLayout, this.LJLJI, this, LJJLIIIIJ(), c159816Oz);
            c6pv.LLLILZJ(LJJLIIIJJI());
            LJJLIIIJILLIZJL().LIZIZ(new C6V4(LiveCoverMinSizeSetting.DEFAULT, c6pv.LJIIJJI()));
            c6pv.initService();
            return c6pv;
        }
        o.LJIJI("stickerViewParent");
        throw null;
    }

    @Override // X.InterfaceC150895w5
    public void ja() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StickerModel stickerModel : LJJLIIIJJIZ().LIZJ()) {
            float containerWidth = stickerModel.getBaseSticker().getContainerWidth() / this.LJLJJL.getEditImageInfo().getRatio();
            if (stickerModel instanceof SingleHashTagStickerModel) {
                SingleHashTagStickerModel singleHashTagStickerModel = (SingleHashTagStickerModel) stickerModel;
                arrayList.add(SingleHashTagStickerModel.copy$default(singleHashTagStickerModel, BaseStickerModel.copy$default(singleHashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, (int) containerWidth, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -16385, null), 0L, null, false, false, false, 62, null));
            }
            if (stickerModel instanceof EmbedHashTagStickerModel) {
                EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel;
                arrayList2.add(EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel, BaseStickerModel.copy$default(embedHashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, (int) containerWidth, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -16385, null), 0L, null, false, false, false, 62, null));
            }
        }
        this.LJLJJL.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(null, arrayList, arrayList2, 1, null));
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

    @Override // X.InterfaceC150895w5
    public void Sx() {
        C157706Gw.LIZIZ(LJJLIIIJJIZ(), EnumC157656Gr.PICTURE_HASHTAG_SINGLE, null, C157726Gy.LJLIL, 6);
    }

    @Override // X.InterfaceC150895w5
    public List<StickerModel> d8() {
        return LJJLIIIJJIZ().LIZJ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        ImageStickerInfoNewEngine stickerInfoNewEngine = this.LJLJJL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null) {
            Iterator<SingleHashTagStickerModel> it = stickerInfoNewEngine.getHashStickersSingle().iterator();
            while (it.hasNext()) {
                C157706Gw.LIZ(LJJLIIIJJIZ(), it.next(), EnumC157656Gr.PICTURE_HASHTAG_SINGLE);
            }
            Iterator<EmbedHashTagStickerModel> it2 = stickerInfoNewEngine.getHashStickersEmbed().iterator();
            while (it2.hasNext()) {
                C157706Gw.LIZ(LJJLIIIJJIZ(), it2.next(), EnumC157656Gr.PICTURE_HASHTAG_EMBED);
            }
        }
    }

    @Override // X.InterfaceC150895w5
    public void wq0() {
        C157706Gw.LIZIZ(LJJLIIIJJIZ(), EnumC157656Gr.PICTURE_HASHTAG_EMBED, null, C157716Gx.LJLIL, 6);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150895w5 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC150895w5
    public void LLFII(boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            frameLayout.setVisibility(i);
        }
    }

    public C157646Gq(C82622Wbi diContainer, ViewStub stickerViewStub, FrameLayout stickerHigherView, CreativeInfo creativeInfo, SingleImageData imageData, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerViewStub, "stickerViewStub");
        o.LJIIIZ(stickerHigherView, "stickerHigherView");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(imageData, "imageData");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = stickerViewStub;
        this.LJLJI = stickerHigherView;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = imageData;
        this.LJLJJLL = i;
        this.LJLJL = (InterfaceC150615vd) getDiContainer().LJIIIIZZ(null, InterfaceC150615vd.class);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 94));
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 95));
    }
}

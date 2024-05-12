package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157546Gg extends AbstractC29891Fh<InterfaceC136385Ww> implements InterfaceC136385Ww, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final InterfaceC115514g7 LJLLI;

    static {
        TBT tbt = new TBT(C157546Gg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C157546Gg.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C157546Gg.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0, c65351Pkp), C61845OOz.LIZJ(C157546Gg.class, "videoControlApi", "getVideoControlApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/videocontroll/Video2StickerControllerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C157546Gg.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C157546Gg.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0, c65351Pkp)};
    }

    public InterfaceC136385Ww LJJLI() {
        return this;
    }

    private final InterfaceC159886Pg LJJLIIIJILLIZJL() {
        return (InterfaceC159886Pg) this.LJLJLLL.getValue();
    }

    private final InterfaceC152085y0 LJJLIIIJJI() {
        return (InterfaceC152085y0) this.LJLJJLL.LIZ(this, LJLLILLLL[2]);
    }

    private final AbstractC42651GoZ LJJLIIIJJIZ() {
        return (AbstractC42651GoZ) this.LJLJLJ.LIZ(this, LJLLILLLL[4]);
    }

    private final InterfaceC160026Pu LJJLIIIJLLLLLLLZ() {
        return new InterfaceC160026Pu() { // from class: X.6GL
            @Override // X.InterfaceC160026Pu
            public final void LJ(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJI(int i) {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILJJIL(int i) {
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
                C157546Gg.this.LJJLJLI().LK(new C6HV(2, false));
            }

            @Override // X.InterfaceC160026Pu
            public final void LIZLLL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C157546Gg.this.LJJLJLI().LK(new C6HV(1, false));
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
            public final void LJIIIIZZ(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                if (stickerModel instanceof TextStickerModel) {
                    C6GK.LIZJ(C157546Gg.this.LJJLJ().originVideoInfo.awemeId, C157546Gg.this.LJJLJ().originVideoInfo.userId, ((TextStickerModel) stickerModel).getFontModel().fontName);
                }
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
            public final void LJIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                if (stickerModel instanceof TextStickerModel) {
                    C6GK.LIZJ(C157546Gg.this.LJJLJ().originVideoInfo.awemeId, C157546Gg.this.LJJLJ().originVideoInfo.userId, ((TextStickerModel) stickerModel).getFontModel().fontName);
                }
            }

            @Override // X.InterfaceC160026Pu
            public final void LJIILIIL(StickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6GK.LIZLLL("double_click", C157546Gg.this.LJJLJ().originVideoInfo.awemeId, C157546Gg.this.LJJLJ().originVideoInfo.userId);
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

            @Override // X.InterfaceC160026Pu
            public final void LJIJ(StickerModel stickerModel, int i) {
                o.LJIIIZ(stickerModel, "stickerModel");
                C6GK.LIZLLL("edit_bubble", C157546Gg.this.LJJLJ().originVideoInfo.awemeId, C157546Gg.this.LJJLJ().originVideoInfo.userId);
            }
        };
    }

    private final C6H7 LJJLIIJ() {
        return (C6H7) this.LJLL.getValue();
    }

    public final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLLILLLL[0]);
    }

    public final Video2StickerModel LJJLJ() {
        return (Video2StickerModel) this.LJLLI.LIZ(this, LJLLILLLL[5]);
    }

    public final InterfaceC144005ky LJJLJLI() {
        return (InterfaceC144005ky) this.LJLJL.LIZ(this, LJLLILLLL[3]);
    }

    public final InterfaceC159886Pg LJJLL() {
        return new InterfaceC159886Pg() { // from class: X.6Gh
            @Override // X.InterfaceC159886Pg
            public final void LJ(boolean z) {
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
            public final InterfaceC153045zY LIZIZ() {
                InterfaceC153045zY value = C157546Gg.this.LJJLIIIIJ().Kh().getValue();
                if (value != null) {
                    return value;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.InterfaceC159886Pg
            public final List<MediaModel> LIZJ() {
                List<MediaModel> mediaModelList = C157546Gg.this.LLLLIL().getMediaModelList();
                o.LJIIIIZZ(mediaModelList, "publishEditModel.mediaModelList");
                return mediaModelList;
            }

            @Override // X.InterfaceC159886Pg
            public final C6OE LJFF() {
                return C157546Gg.this.LLLLLLZ();
            }

            @Override // X.InterfaceC159886Pg
            public final RTY LJI() {
                return C157546Gg.this.LJJZZI();
            }

            @Override // X.InterfaceC159886Pg
            public final boolean LJII() {
                return C157546Gg.this.LLLLIL().isMultiVideoEdit();
            }

            @Override // X.InterfaceC159886Pg
            public final C6O5 LJIIIIZZ() {
                return new C152885zI(C78688UuS.LJJIII(C157546Gg.this));
            }

            @Override // X.InterfaceC159886Pg
            public final int LJIIL() {
                return (int) C157546Gg.this.LLLLIL().getMultiEditVideoStartTime();
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
                if (i == 2) {
                    C157546Gg.this.LJJLIIIIJ().U2(false, false, false);
                }
            }

            @Override // X.InterfaceC159886Pg
            public final void LJIILJJIL(int i) {
                if (i == 2) {
                    C157546Gg.this.LJJLIIIIJ().U2(true, false, false);
                }
            }
        };
    }

    public final C6H7 LJJZZIII() {
        EnumC157656Gr enumC157656Gr = EnumC157656Gr.TEXT;
        C157566Gi.LIZ().getClass();
        SettingsManager.LIZLLL().getClass();
        ArrayList LJII = C47261Igj.LJII(new C159636Oh(enumC157656Gr, SettingsManager.LJ("text_sticker_max_count", 0), false, true, true, false, true, (List) C47261Igj.LJII(2, 1), false, (String) null, (OSZ) null, false, false, false, true, true, 32512));
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = LLLLIL().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        C6PV c6pv = new C6PV(C78688UuS.LJIJJ(this), this.LJLILLLLZI, this.LJLJI, LJJLIIIJJIZ(), LJJLIIIJILLIZJL(), new C159816Oz(C43073GvN.LIZLLL(LJ, creativeInfo, EnumC43649HBd.TEXT_STICKER, null, false, 12), LJII, 11));
        c6pv.LLLILZJ(LJJLIIIJLLLLLLLZ());
        LJJLIIIJJI().LIZIZ(new C6V4(LiveCoverMinSizeSetting.DEFAULT, c6pv.LJIIJJI()));
        c6pv.initService();
        return c6pv;
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLILLLL[1]);
    }

    public final C6OE LLLLLLZ() {
        return new C6OE() { // from class: X.6Gf
            @Override // X.C6OE
            public final void LIZ() {
            }

            @Override // X.C6OE
            public final void LIZIZ() {
            }

            @Override // X.C6OE
            public final void LIZJ(Context context) {
            }

            @Override // X.C6OE
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C6OE
            public final boolean LJFF() {
                return true;
            }

            @Override // X.C6OE
            public final TTSVoiceModel LJII() {
                return null;
            }

            @Override // X.C6OE
            public final TextWatcher LJIIIZ() {
                return null;
            }

            @Override // X.C6OE
            public final AnonymousClass635 LJIIIIZZ() {
                return new AnonymousClass635(0);
            }

            @Override // X.C6OE
            public final int LJ(TextStickerModel textStickerModel) {
                o.LJIIIZ(textStickerModel, "textStickerModel");
                return 0;
            }

            @Override // X.C6OE
            public final void LJI(TextStickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }

            @Override // X.C6OE
            public final void LJIIJ(TextStickerModel textStickerModel) {
                o.LJIIIZ(textStickerModel, "textStickerModel");
            }

            @Override // X.C6OE
            public final void LJIIJJI(TextStickerModel stickerModel) {
                o.LJIIIZ(stickerModel, "stickerModel");
            }
        };
    }

    @Override // X.InterfaceC136385Ww
    public void hide() {
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJI.setVisibility(8);
    }

    @Override // X.InterfaceC136385Ww
    public void show() {
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJI.setVisibility(0);
    }

    @Override // X.InterfaceC136385Ww
    public boolean Ag0() {
        C6H7 LJJLIIJ = LJJLIIJ();
        EnumC157656Gr enumC157656Gr = EnumC157656Gr.TEXT;
        int size = LJJLIIJ.LIZLLL(enumC157656Gr).size();
        C157566Gi.LIZ().getClass();
        SettingsManager.LIZLLL().getClass();
        if (size >= SettingsManager.LJ("text_sticker_max_count", 0)) {
            Activity LJIJJ = C78688UuS.LJIJJ(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = C78688UuS.LJIJJ(this).getResources().getString(R.string.hhd);
            o.LJIIIIZZ(string, "activity.resources.getSt…cker_maxsize_limit_toast)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(LJIJJ, 1035, creativeToastBuilder);
            return false;
        }
        LJJLIIJ().LJIIIIZZ(enumC157656Gr, null, "", new AqS168S0100000_2(this, 214));
        return true;
    }

    public final RTY LJJZZI() {
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

    @Override // X.InterfaceC136385Ww
    public List<TextStickerModel> W50() {
        List<StickerModel> LIZLLL = LJJLIIJ().LIZLLL(EnumC157656Gr.TEXT);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        for (StickerModel stickerModel : LIZLLL) {
            o.LJII(stickerModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
            arrayList.add(stickerModel);
        }
        return arrayList;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC136385Ww getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC136385Ww
    public void Bp(List<TextStickerModel> modelList) {
        o.LJIIIZ(modelList, "modelList");
        if (!modelList.isEmpty()) {
            for (TextStickerModel textStickerModel : modelList) {
                C157706Gw.LIZ(LJJLIIJ(), textStickerModel, textStickerModel.getStickerType());
            }
        }
    }

    @Override // X.InterfaceC136385Ww
    public void KS(InterfaceC88472Yns<? super java.util.Map<Integer, String>, C76800UCe> compileDone) {
        o.LJIIIZ(compileDone, "compileDone");
        LJJLIIJ().LIZIZ(new AqS168S0100000_2(compileDone, 213));
    }

    public C157546Gg(C82622Wbi diContainer, FrameLayout stickerContainer, FrameLayout stickerHigherContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = stickerContainer;
        this.LJLJI = stickerHigherContainer;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC152085y0.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC144005ky.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 305));
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 306));
        this.LJLLI = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
    }
}

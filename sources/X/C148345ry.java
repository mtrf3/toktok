package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C148345ry extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLJI;
    public final C148195rj LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    static {
        TBT tbt = new TBT(C148345ry.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148345ry.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148345ry.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148345ry.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLL[3]);
        return new WI1(videoPublishEditModel) { // from class: X.5s2
            public final int LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final int LJ() {
                return R.raw.icon_camera_sticker_round_fill;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.rnc;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, this.LJIIIZ, false, 5);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJ;
            }

            {
                o.LJIIIZ(videoPublishEditModel, "model");
                C151975xp.LIZ(videoPublishEditModel);
                this.LJIIIZ = 10;
                this.LJIIJ = C6MP.EDIT_STICKER;
            }
        };
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return C151965xo.LIZJ((VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLL[3]));
    }

    public InterfaceC143655kP LJIIIZ() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LJLL[2]);
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC143655kP LJIIIZ;
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_sticker_entrance");
        if (C148705sY.LIZ() && ((VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLL[3])).videoFps(true) < 30 && (LJIIIZ = LJIIIZ()) != null && (Kh = LJIIIZ.Kh()) != null && (value = Kh.getValue()) != null) {
            value.LLJJ();
        }
        C82632Wbs c82632Wbs = this.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLL;
        ((InterfaceC153275zv) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])).b2(4, false);
        if (this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1]) != null) {
            InterfaceC164126cK interfaceC164126cK = (InterfaceC164126cK) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1]);
            if (interfaceC164126cK != null) {
                C164116cJ.LIZ(interfaceC164126cK, true, 0L, 6);
            }
        } else {
            C82622Wbi c82622Wbi = C44384HbQ.LJJJ((WMH) this.LJLJLLL.getValue()).LJLLL;
            if (c82622Wbi != null) {
                InterfaceC164126cK interfaceC164126cK2 = (InterfaceC164126cK) c82622Wbi.LJIIIIZZ(null, InterfaceC164126cK.class);
                if (interfaceC164126cK2 != null) {
                    C164116cJ.LIZ(interfaceC164126cK2, true, System.currentTimeMillis(), 2);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC143655kP LJIIIZ2 = LJIIIZ();
        if (LJIIIZ2 != null) {
            LJIIIZ2.U2(false, false, false);
        }
        C1536161d.LIZ("sticker");
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public C148345ry(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = diContainer;
        this.LJLJJI = config;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC164126cK.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 688));
    }
}

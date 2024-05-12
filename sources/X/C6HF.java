package X;

import Y.AObjectS84S0100000_2;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6HF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HF extends AbstractC29891Fh<AnonymousClass643> implements AnonymousClass643, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C5H3 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;

    static {
        TBT tbt = new TBT(C6HF.class, "editorInfiniStickerApi", "getEditorInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6HF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C6HF.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0, c65351Pkp)};
    }

    public AnonymousClass643 LJJLIIIJILLIZJL() {
        return this;
    }

    private final InterfaceC139535dl Sj() {
        return (InterfaceC139535dl) this.LJLILLLLZI.LIZ(this, LJLJJLL[0]);
    }

    public final AddYoursStickerTopicRepo LJJLIIIIJ() {
        return (AddYoursStickerTopicRepo) this.LJLJJI.getValue();
    }

    public final InterfaceC139535dl LJJLIIIJJI() {
        return (InterfaceC139535dl) this.LJLJJL.LIZ(this, LJLJJLL[2]);
    }

    public final VideoPublishEditModel LJJLIIIJJIZ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJJLL[1]);
    }

    @Override // X.AnonymousClass643
    public C6SL LLLLLLZ() {
        return new C6SL() { // from class: X.6UR
            @Override // X.C6SL
            public final boolean LIZLLL() {
                return C44384HbQ.LJLLI(C6HF.this.LJJLIIIJJIZ());
            }

            @Override // X.C6SL
            public final AddYoursStickerTopicRepo LJ() {
                return C6HF.this.LJJLIIIIJ();
            }

            @Override // X.C6SL
            public final int LJI() {
                if (C44384HbQ.LJLLI(C6HF.this.LJJLIIIJJIZ())) {
                    return R.string.hiw;
                }
                int LIZLLL = C226388uY.LIZLLL();
                if (LIZLLL == C6UU.ADD_YOURS.getValue() || LIZLLL != C6UU.POST_YOURS.getValue()) {
                    return R.string.bcp;
                }
                return R.string.bd4;
            }

            @Override // X.C6SL
            public final OSZ<Long, UrlModel> LIZ() {
                C44423Hc3 LJ = C73098SmU.LJ();
                if (LJ != null) {
                    String uid = LJ.getUid();
                    if (C78685UuP.LJJJZ(uid)) {
                        return new OSZ<>(Long.valueOf(CastLongProtector.parseLong(uid)), LJ.getAvatarThumb());
                    }
                }
                return null;
            }

            @Override // X.C6SL
            public final C6U1 LJFF() {
                return C6U2.LIZ(C226388uY.LIZIZ());
            }

            @Override // X.C6SL
            public final void LIZIZ(String str, String str2, boolean z) {
                C188727au c188727au = new C188727au();
                C6HF c6hf = C6HF.this;
                c188727au.LJI("enter_from", "video_edit_page");
                c188727au.LJI("shoot_way", c6hf.LJJLIIIJJIZ().mShootWay);
                c188727au.LJI("creation_id", c6hf.LJJLIIIJJIZ().getCreationId());
                c188727au.LJI("content_type", "video");
                c188727au.LJI("content_source", "shoot");
                c188727au.LJI("add_yours_enter_method", str2);
                c188727au.LJI("from_title", str);
                c188727au.LIZLLL(z ? 1 : 0, "is_first_enter");
                c188727au.LIZLLL(c6hf.LJJLIIIJJIZ().creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
                GXR.LIZ("enter_add_yours_edit_page", c188727au.LIZ);
            }

            @Override // X.C6SL
            public final void LIZJ(int i, String str, boolean z, String inputMode, String str2) {
                o.LJIIIZ(inputMode, "inputMode");
                if ((!ujb.o.LJJJJJL(str)) && str.length() > 0) {
                    C188727au c188727au = new C188727au();
                    C6HF c6hf = C6HF.this;
                    c188727au.LJI("enter_from", "video_edit_page");
                    c188727au.LJI("shoot_way", c6hf.LJJLIIIJJIZ().mShootWay);
                    c188727au.LJI("creation_id", c6hf.LJJLIIIJJIZ().getCreationId());
                    c188727au.LJI("content_type", "video");
                    c188727au.LJI("content_source", "shoot");
                    c188727au.LJI("add_yours_enter_method", str2);
                    c188727au.LJI("save_title", str);
                    c188727au.LJI("input_mode", inputMode);
                    c188727au.LIZLLL(z ? 1 : 0, "is_first_enter");
                    c188727au.LIZLLL(c6hf.LJJLIIIJJIZ().creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
                    c188727au.LIZLLL(i, "is_operation_set");
                    GXR.LIZ("complete_add_yours_edit_page", c188727au.LIZ);
                }
            }

            @Override // X.C6SL
            public final void LJII(int i, String str, String toTitle, String clickMethod, String str2, boolean z) {
                o.LJIIIZ(toTitle, "toTitle");
                o.LJIIIZ(clickMethod, "clickMethod");
                C188727au c188727au = new C188727au();
                C6HF c6hf = C6HF.this;
                c188727au.LJI("enter_from", "video_edit_page");
                c188727au.LJI("shoot_way", c6hf.LJJLIIIJJIZ().mShootWay);
                c188727au.LJI("creation_id", c6hf.LJJLIIIJJIZ().getCreationId());
                c188727au.LJI("content_type", "video");
                c188727au.LJI("content_source", "shoot");
                c188727au.LJI("add_yours_enter_method", str2);
                c188727au.LJI("from_title", str);
                c188727au.LJI("to_title", toTitle);
                c188727au.LJI("click_method", clickMethod);
                c188727au.LIZLLL(z ? 1 : 0, "is_first_enter");
                c188727au.LIZLLL(c6hf.LJJLIIIJJIZ().creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
                c188727au.LIZLLL(i, "is_operation_set");
                GXR.LIZ("click_add_yours_edit_page_icon", c188727au.LIZ);
            }
        };
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<Boolean> Ej;
        InterfaceC139535dl LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && (Ej = LJJLIIIJJI.Ej()) != null) {
            Ej.LIZLLL(this, new AObjectS84S0100000_2(this, 149));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLI(false);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ AnonymousClass643 getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C6HF(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJII(getDiContainer(), InterfaceC139535dl.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = C221108m2.LIZIZ(C6HH.LJLIL);
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC139535dl.class, null);
    }

    public final void LJJLI(boolean z) {
        C78555UsJ.LJJJJJ(LJJLIIIJJIZ());
        if (z) {
            C42315Gj9.LIZIZ("tool_performance_add_yours_edit", C52467KiV.LIZIZ(), -1L);
        } else {
            C42315Gj9.LIZJ("tool_performance_add_yours_edit");
        }
    }

    @Override // X.AnonymousClass643
    public void Q(StickerModel stickerModel) {
        List<StickerModel> sk0;
        if (stickerModel == null) {
            InterfaceC139535dl LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null && (sk0 = LJJLIIIJJI.sk0(EnumC157656Gr.ADD_YOURS)) != null) {
                stickerModel = (StickerModel) ORZ.LJLLLL(sk0);
            } else {
                stickerModel = null;
            }
        }
        C219208iy c219208iy = C219208iy.LIZIZ;
        c219208iy.LIZJ(C78688UuS.LJIJJ(this), c219208iy.LIZ(), new AqS133S0200000_2(stickerModel, this, 68));
    }

    @Override // X.AnonymousClass643
    public void ft0(String enterFrom) {
        List<StickerModel> sk0;
        StickerModel stickerModel;
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC139535dl Sj = Sj();
        if (Sj == null || (sk0 = Sj.sk0(EnumC157656Gr.ADD_YOURS)) == null || (stickerModel = (StickerModel) ORZ.LJLLLL(sk0)) == null) {
            InterfaceC139535dl LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null) {
                LJJLIIIJJI.BZ(EnumC157656Gr.ADD_YOURS, null, enterFrom, C6HG.LJLIL);
                return;
            }
            return;
        }
        InterfaceC139535dl Sj2 = Sj();
        if (Sj2 == null) {
            return;
        }
        Sj2.mt(stickerModel);
    }
}

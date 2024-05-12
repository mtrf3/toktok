package X;

import Y.AObjectS84S0100000_2;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5WD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WD extends AbstractC29891Fh<InterfaceC150955wB> implements InterfaceC150955wB, InterfaceC135635Tz {
    public static final C5WF LJLJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.5WF] */
    static {
        TBT tbt = new TBT(C5WD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, new TBT(C5WD.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C5WD.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new TBT(C5WD.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new TBT(C5WD.class, "context", "getContext()Landroid/content/Context;", 0)};
        LJLJLLL = new Object() { // from class: X.5WF
        };
    }

    public InterfaceC150955wB LJJLIIIJJIZ() {
        return this;
    }

    public final void LJJLJLI() {
        int i;
        List<StickerItemModel> list;
        int i2;
        List<StickerItemModel> list2;
        List<StickerItemModel> list3;
        this.LJLJLJ = true;
        InfoStickerModel infoStickerModel = LJJLJ().infoStickerModel;
        if (infoStickerModel == null || (list3 = infoStickerModel.stickers) == null || list3.isEmpty()) {
            i = 0;
        } else {
            Iterator<StickerItemModel> it = list3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().type == 2 && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        this.LJLJL = i;
        InfoStickerModel infoStickerModel2 = LJJLJ().infoStickerModel;
        if (infoStickerModel2 != null && (list2 = infoStickerModel2.stickers) != null) {
            for (StickerItemModel stickerItemModel : list2) {
                int i3 = stickerItemModel.type;
                if (i3 != 0) {
                    if (i3 == 2) {
                        LJJLIIIJJI(stickerItemModel);
                    }
                } else {
                    LJJLIIIJILLIZJL(stickerItemModel);
                }
            }
        }
        LJJLIIIIJ();
        LJJLL();
        if (C42000Ge4.LJIILIIL(LJJLJ())) {
            i2 = C42000Ge4.LJII(LJJLJ()).size();
        } else {
            InfoStickerModel infoStickerModel3 = LJJLJ().infoStickerModel;
            if (infoStickerModel3 != null && (list = infoStickerModel3.stickers) != null && !list.isEmpty()) {
                Iterator<StickerItemModel> it2 = list.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (it2.next().type == 2 && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            LJJLIIJ().j70(null);
        }
        if (i2 != 0) {
            return;
        }
        LJJLIIJ().j70(null);
    }

    private final Context getContext() {
        return (Context) this.LJLJJLL.LIZ(this, LJLL[4]);
    }

    public final InterfaceC142515iZ LJJLIIIJLLLLLLLZ() {
        return (InterfaceC142515iZ) this.LJLJJL.LIZ(this, LJLL[3]);
    }

    public final InterfaceC140255ev LJJLIIJ() {
        return (InterfaceC140255ev) this.LJLJJI.LIZ(this, LJLL[2]);
    }

    public final VideoPublishEditModel LJJLJ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLL[1]);
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLILLLLZI.LIZ(this, LJLL[0]);
    }

    private final void LJJLIIIIJ() {
        NLEModel r9 = r9();
        if (r9 != null) {
            if (C124574uj.LJIJI(r9).isEmpty() && ((ArrayList) C124574uj.LJJ(r9)).isEmpty()) {
                return;
            }
            EditorProModel editorProModel = LJJLJ().getEditorProModel();
            o.LJIIIIZZ(editorProModel, "model.editorProModel");
            C132385Hm.LIZLLL(editorProModel, r9);
            C132385Hm.LJ(LJJLJ().creativeModel.magicCombineEffectModel, r9);
            EditorProModel editorProModel2 = LJJLJ().getEditorProModel();
            editorProModel2.setAdvancedEditDraft(true);
            editorProModel2.setRealOrigin((Integer) C124934vJ.LIZIZ(r9, LJJLJ().mOrigin).getSecond());
        }
    }

    private final void LJJLL() {
        NLEModel LJJ;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null) {
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.LJII(LJJ);
            g0.LJIIJJI(nLEEditor, false, false, 3);
            String LJIIIIZZ = nLEEditor.LJIIIIZZ();
            String absolutePath = V16.LJIIL(LJJLJ(), EnumC43649HBd.UGC_TEMPLATE, "original_nle_data.json", false).getAbsolutePath();
            C39579Fg7.LJJI(absolutePath, LJIIIIZZ);
            LJJLJ().creativeModel.ugcTemplateData.originalNormalizedNLEPath = absolutePath;
        }
    }

    private final NLEModel r9() {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null) {
            return C17N.LJJ(value);
        }
        return null;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        Ll0().wf0().observe(this, new AObjectS84S0100000_2(this, 218));
    }

    @Override // X.InterfaceC150955wB
    public boolean Pl0() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150955wB getApiComponent() {
        LJJLIIIJJIZ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C5WD(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC140255ev.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), Context.class, null);
    }

    private final void LJJLIIIJILLIZJL(StickerItemModel stickerItemModel) {
        C122034qd LJJI;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null) {
            return;
        }
        InterfaceC153095zd LIZ = LJJI.LJIIIIZZ().LIZ();
        String str = stickerItemModel.uuid;
        o.LJIIIIZZ(str, "itemModel.uuid");
        float[] LJFF = LIZ.LJFF(str);
        stickerItemModel.currentOffsetX = LJFF[0];
        stickerItemModel.currentOffsetY = LJFF[1];
        InterfaceC153095zd LIZ2 = LJJI.LJIIIIZZ().LIZ();
        String str2 = stickerItemModel.uuid;
        o.LJIIIIZZ(str2, "itemModel.uuid");
        float[] LJIIIZ = LIZ2.LJIIIZ(str2);
        VESize LLILZ = value.LLILZ();
        float f = stickerItemModel.scale;
        if (f == 0.0f) {
            f = 1.0f;
        }
        stickerItemModel.scale = f;
        stickerItemModel.initWidth = ((LJIIIZ[2] - LJIIIZ[0]) * LLILZ.width) / f;
        stickerItemModel.initHeight = ((LJIIIZ[1] - LJIIIZ[3]) * LLILZ.height) / f;
    }

    private final void LJJLIIIJJI(StickerItemModel stickerItemModel) {
        TextStickerData textStickerData;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null || (textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class)) == null || o.LJ(textStickerData.getType(), "type_inline_caption")) {
            return;
        }
        int i = value.LLILZ().width;
        int i2 = value.LLILZ().height;
        textStickerData.setX(textStickerData.getX() * i);
        textStickerData.setY(textStickerData.getY() * i2);
        if (C42000Ge4.LJIILIIL(LJJLJ())) {
            this.LJLJLJ = false;
            InterfaceC139045cy LIZ = LJJLIIIJLLLLLLLZ().vF().LIZ();
            if (LIZ != null) {
                C139055cz.LIZ(LIZ, textStickerData, false, null, 6);
            }
            int i3 = this.LJLJL - 1;
            this.LJLJL = i3;
            if (i3 == 0) {
                List<StickerItemModel> list = LJJLJ().infoStickerModel.stickers;
                o.LJIIIIZZ(list, "model.infoStickerModel.stickers");
                C6H4.LJII(C5WE.LJLIL, list);
                LJJLIIJ().j70(new AqS168S0100000_2(this, 354));
                return;
            }
            return;
        }
        stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
        LJJLI(stickerItemModel, textStickerData);
    }

    private final void LJJLI(StickerItemModel stickerItemModel, TextStickerData textStickerData) {
        textStickerData.setFontSize(28);
        C137045Zk.LJ(getContext(), Ll0(), "EditUgcTemplateComponent", textStickerData, new AqS106S0300000_2(stickerItemModel, textStickerData, this, 9));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditUgcTemplateComponent addToProcessSplitTextTask fontType: ");
        LIZ.append(textStickerData.getFontType());
        LIZ.append(" text ");
        LIZ.append(textStickerData.getTextStr());
        H78.LJI(X1D.LIZIZ(LIZ));
        this.LJLJLJ = false;
    }
}

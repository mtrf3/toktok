package Y;

import X.AnonymousClass679;
import X.C10I;
import X.C10K;
import X.C132205Gu;
import X.C140585fS;
import X.C150795vv;
import X.C150965wC;
import X.C151055wL;
import X.C151285wi;
import X.C16880lQ;
import X.C169946li;
import X.C42299Git;
import X.C44687HgJ;
import X.C5OO;
import X.C60903NvH;
import X.C67A;
import X.C6LR;
import X.C6LT;
import X.C6P9;
import X.C6PA;
import X.C76732zl;
import X.C76800UCe;
import X.DialogC254029y2;
import X.H7B;
import X.I9Q;
import X.InterfaceC137115Zr;
import X.InterfaceC149485to;
import X.InterfaceC153045zY;
import X.InterfaceC45930I0w;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.JBR;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS107S0200000_2 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) agS107S0200000_2.l0;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        interfaceC88471Ynr.invoke(LJIIJJI, Integer.valueOf(((C76732zl) agS107S0200000_2.l1).element));
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        ((C151055wL) agS107S0200000_2.l0).LL.LJFF = false;
        ((InterfaceC65784Pro) agS107S0200000_2.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object then$10(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        String LJFF;
        Bitmap bitmap = (Bitmap) c10k.LJIIJJI();
        String str = ((C6PA) agS107S0200000_2.l0).LIZ;
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(str, separator, false)) {
            LJFF = ((C6PA) agS107S0200000_2.l0).LIZ;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LJFF = JBR.LJFF(LIZ, ((C6PA) agS107S0200000_2.l0).LIZ, separator, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJFF);
        LIZ2.append(((BaseStickerModel) agS107S0200000_2.l1).getId());
        LIZ2.append(".png");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        File file = new File(LIZIZ);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C44687HgJ.LJIILIIL(LIZIZ);
                } else {
                    C16880lQ.LLLZZIL(file);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C44687HgJ.LJFF(LIZIZ, true);
        boolean LJFF2 = C42299Git.LJFF(bitmap, new File(LIZIZ), 100, Bitmap.CompressFormat.PNG);
        C42299Git.LJ(bitmap);
        return new C6P9(LIZIZ, LJFF2);
    }

    public static final Object then$11(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        int i;
        int duration;
        for (TextStickerCompileResult textStickerCompileResult : (List) c10k.LJIIJJI()) {
            TextStickerData textStickerData = textStickerCompileResult.textStickerData;
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
            if (textStickerData.hasTimeData()) {
                i = textStickerData.getStartTime();
            } else {
                i = 0;
            }
            if (textStickerData.hasTimeData()) {
                duration = textStickerData.getEndTime();
            } else {
                duration = ((InterfaceC153045zY) agS107S0200000_2.l0).getDuration();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("text_sticker_");
            LIZ.append(textStickerCompileResult.index);
            StickerItemModel stickerItemModel = new StickerItemModel(X1D.LIZIZ(LIZ), textStickerCompileResult.stickerPath, json, textStickerCompileResult.index, false, i, duration, 2);
            stickerItemModel.isImageStickerLayer = true;
            stickerItemModel.viewHash = textStickerCompileResult.viewHash;
            ((InterfaceC137115Zr) agS107S0200000_2.l1).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        boolean LIZJ;
        C151285wi c151285wi = (C151285wi) agS107S0200000_2.l0;
        if (!c151285wi.LJIIIIZZ && c151285wi.LIZ.getVisibility() == 0 && c10k.LJIIJJI() != null) {
            ((C151285wi) agS107S0200000_2.l0).LIZ.setVisibility(8);
            ((C151285wi) agS107S0200000_2.l0).LIZ.setImageURI(null);
            C151285wi c151285wi2 = (C151285wi) agS107S0200000_2.l0;
            Bitmap bitmap = (Bitmap) c10k.LJIIJJI();
            Boolean bool = (Boolean) agS107S0200000_2.l1;
            if (bool != null) {
                LIZJ = bool.booleanValue();
            } else {
                LIZJ = ((C151285wi) agS107S0200000_2.l0).LIZJ();
            }
            Bitmap bitmap2 = c151285wi2.LJFF;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            c151285wi2.LJFF = bitmap;
            c151285wi2.LJI = LIZJ;
            c151285wi2.LJIIJ = true;
            ((C151285wi) agS107S0200000_2.l0).LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS107S0200000_2 agS107S0200000_2, C10K task) {
        InterfaceC45930I0w interfaceC45930I0w;
        o.LJIIIZ(task, "task");
        if (task.LJIIL() || task.LJIILJJIL()) {
            interfaceC45930I0w = ((C5OO) agS107S0200000_2.l0).LLFF.get(((C132205Gu) agS107S0200000_2.l1).LJLIL);
        } else {
            interfaceC45930I0w = (InterfaceC45930I0w) task.LJIIJJI();
        }
        if (interfaceC45930I0w == null) {
            LinearLayout linearLayout = ((C5OO) agS107S0200000_2.l0).LL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                o.LJIJI("designerInfoLayout");
                throw null;
            }
        } else {
            ((C5OO) agS107S0200000_2.l0).LLJJI(interfaceC45930I0w.getNickname(), interfaceC45930I0w.getAvatarThumb());
            ((C5OO) agS107S0200000_2.l0).LLFF.put(((C132205Gu) agS107S0200000_2.l1).LJLIL, interfaceC45930I0w);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        CommentVideoModel commentVideoModel;
        int i;
        AnonymousClass679 anonymousClass679 = (AnonymousClass679) c10k.LJIIJJI();
        if (anonymousClass679 != null) {
            C67A c67a = anonymousClass679.LIZ;
            if (c67a != null) {
                commentVideoModel = c67a.LJLIL;
            } else {
                commentVideoModel = null;
            }
            int duration = ((InterfaceC153045zY) agS107S0200000_2.l0).getDuration();
            if (commentVideoModel != null && commentVideoModel.hasTimeData()) {
                i = commentVideoModel.getStartTime();
                duration = commentVideoModel.getEndTime();
            } else {
                i = 0;
            }
            StickerItemModel stickerItemModel = new StickerItemModel("comment", anonymousClass679.stickerPath, "", anonymousClass679.index, false, i, duration, 4);
            stickerItemModel.isImageStickerLayer = true;
            ((InterfaceC137115Zr) agS107S0200000_2.l1).LJII(stickerItemModel);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS107S0200000_2 agS107S0200000_2, C10K task) {
        InterfaceC45930I0w interfaceC45930I0w;
        o.LJIIIZ(task, "task");
        if (task.LJIIL() || task.LJIILJJIL()) {
            interfaceC45930I0w = ((EditorProScene) agS107S0200000_2.l0).userCache.get(((C132205Gu) agS107S0200000_2.l1).LJLIL);
        } else {
            interfaceC45930I0w = (InterfaceC45930I0w) task.LJIIJJI();
        }
        if (interfaceC45930I0w == null) {
            LinearLayout linearLayout = ((EditorProScene) agS107S0200000_2.l0).effectDesignerInfoLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                o.LJIJI("effectDesignerInfoLayout");
                throw null;
            }
        } else {
            ((EditorProScene) agS107S0200000_2.l0).updateEHDesignerTitle(interfaceC45930I0w);
            ((EditorProScene) agS107S0200000_2.l0).userCache.put(((C132205Gu) agS107S0200000_2.l1).LJLIL, interfaceC45930I0w);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) agS107S0200000_2.l0;
        SurfaceTexture surfaceTexture = (SurfaceTexture) agS107S0200000_2.l1;
        mediaPlayerModule.getClass();
        if (c10k.LJIILJJIL() || c10k.LJIIL() || ((Integer) c10k.LJIIJJI()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        ((C169946li) mediaPlayerModule.LJLILLLLZI).LIZ.play();
        surface.release();
        return Boolean.TRUE;
    }

    public static final Object then$7(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        if (((C6LR) agS107S0200000_2.l0).LIZ != null) {
            boolean z = false;
            if (c10k.LJIIJJI() != null) {
                MusicModel convertToMusicModel = ((Music) c10k.LJIIJJI()).convertToMusicModel();
                if (MusicBeanUtilKt.extractAVMusic(((InterfaceC149485to) agS107S0200000_2.l1).LIZIZ()) == null) {
                    z = true;
                }
                if (convertToMusicModel != null) {
                    convertToMusicModel.setMvThemeMusic(true);
                    if (z) {
                        new I9Q();
                        AVMusic LIZ = I9Q.LIZ(convertToMusicModel);
                        if (LIZ != null) {
                            ((InterfaceC149485to) agS107S0200000_2.l1).LIZ(LIZ);
                        }
                    }
                }
                C6LT c6lt = ((C6LR) agS107S0200000_2.l0).LIZ;
                if (c6lt != null) {
                    c6lt.LIZ(convertToMusicModel, z);
                }
            } else {
                C6LT c6lt2 = ((C6LR) agS107S0200000_2.l0).LIZ;
                if (c6lt2 != null) {
                    c6lt2.LIZ(null, false);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$8(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        DialogC254029y2 dialogC254029y2 = ((ImageEditRootScene) agS107S0200000_2.l0).LLD;
        if (dialogC254029y2 != null) {
            dialogC254029y2.dismiss();
        }
        ((ImageEditRootScene) agS107S0200000_2.l0).getClass();
        ImageEditRootScene.LLLL(1104, false);
        ((InterfaceC65784Pro) agS107S0200000_2.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object then$9(AgS107S0200000_2 agS107S0200000_2, C10K c10k) {
        int canvasWidth = ((TextStickerData) agS107S0200000_2.l0).getCanvasWidth();
        int canvasHeight = ((TextStickerData) agS107S0200000_2.l0).getCanvasHeight();
        if (C150965wC.LIZ() > 0 && Math.min(canvasWidth, canvasHeight) < C150965wC.LIZ()) {
            int LIZ = C150965wC.LIZ();
            if (canvasWidth > canvasHeight) {
                canvasWidth = (canvasWidth * LIZ) / canvasHeight;
                canvasHeight = LIZ;
            } else {
                canvasHeight = (canvasHeight * LIZ) / canvasWidth;
                canvasWidth = LIZ;
            }
        }
        Bitmap LIZ2 = C140585fS.LIZ((Bitmap) c10k.LJIIJJI(), canvasWidth, canvasHeight, ((TextStickerData) agS107S0200000_2.l0).getVideoWidth(), ((TextStickerData) agS107S0200000_2.l0).getVideoHeight());
        File file = new File(((StickerItemModel) agS107S0200000_2.l1).path);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C44687HgJ.LJIILIIL(((StickerItemModel) agS107S0200000_2.l1).path);
                } else {
                    C16880lQ.LLLZZIL(file);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C44687HgJ.LJFF(((StickerItemModel) agS107S0200000_2.l1).path, true);
        boolean LJFF = C42299Git.LJFF(LIZ2, new File(((StickerItemModel) agS107S0200000_2.l1).path), 100, Bitmap.CompressFormat.PNG);
        H7B.LJ("compile sticker " + LJFF + ", " + ((StickerItemModel) agS107S0200000_2.l1).path + '}');
        C42299Git.LJ((Bitmap) c10k.LJIIJJI());
        C42299Git.LJ(LIZ2);
        String str = ((StickerItemModel) agS107S0200000_2.l1).path;
        o.LJIIIIZZ(str, "sticker.path");
        return new C150795vv(str, LJFF);
    }

    public AgS107S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

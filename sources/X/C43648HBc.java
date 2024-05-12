package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HBc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43648HBc implements InterfaceC171126nc {
    public static final C43648HBc LIZ = new C43648HBc();

    @Override // X.InterfaceC171126nc
    public final String LJIIL() {
        String LJIILJJIL;
        LJIILJJIL = C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.SAVE_PHOTO_STICKER_WATERMARK, "");
        return LJIILJJIL;
    }

    @Override // X.InterfaceC171126nc
    public final String LJIILL() {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), HB7.LIZ, EnumC43650HBe.AI_CHOOSE_MUSIC, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIIZILJ() {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), HB7.LIZ, EnumC43650HBe.VIDEO_TO_GIF_VE_WORKSPACE, String.valueOf(System.currentTimeMillis()), 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIJI() {
        StringBuilder LIZ2 = X1D.LIZ();
        return JBR.LJFF(LIZ2, C43075GvP.LIZ, "upload-config-dir", LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJIIJI() {
        return C43073GvN.LJ(C62850Ola.LJ(), HB7.LIZ, EnumC43652HBg.END_WATERMARK_WORKSPACE, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJIIJIL() {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), HB7.LIZ, EnumC43650HBe.VIDEO_FRAME_CACHE, C78966Uyw.LJIJJLI(String.valueOf(System.currentTimeMillis())), 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJJL() {
        String LJIILJJIL;
        LJIILJJIL = C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.STITCH_ORIGIN_VIDEO, "");
        return LJIILJJIL;
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJLL() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILIIL();
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJZ() {
        return C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.FILTERS, "");
    }

    @Override // X.InterfaceC171126nc
    public final String LIZIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.COVER, C43077GvR.LIZ("_cover.png"), false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LIZJ(CreativeInfo creativeInfo) {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), creativeInfo, EnumC43650HBe.UGC_TEMPLATE_PREVIEW_VIDEO, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LIZLLL(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        String absolutePath = new File(H8J.LIZ(), "font").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(creativeToolsFileRo…r(), \"font\").absolutePath");
        LIZ2.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ2.append(subPath);
        return X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJI(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        String absolutePath = H8J.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "creativeToolsFileRootDir().absolutePath");
        LIZ2.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ2.append("mvtheme");
        String str = File.separator;
        YE1.LIZLLL(LIZ2, str, "mvres", str, subPath);
        return X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJII(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.MV_PHOTO, "", false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIIIIZZ(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        return JBR.LJFF(LIZ2, C43075GvP.LJIILIIL, subPath, LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIIIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        EnumC43650HBe enumC43650HBe = EnumC43650HBe.SAVE_TO_LOCAL;
        String LIZ2 = C43075GvP.LIZ(".mp4");
        o.LJIIIIZZ(LIZ2, "getRandomFileName(MP4_SUFFIX)");
        return C43073GvN.LIZIZ(pathService, creativeInfo, enumC43650HBe, LIZ2, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIIJ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.UPLOAD_PIC_STICKER, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIILJJIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.VIDEO_IMAGE_MIXED, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIILLIIL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        String absolutePath = C43073GvN.LIZ(pathService, creativeInfo, EnumC43650HBe.COMPILE_PROBE_VE_WORKSPACE, null, 12).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getAPI().storageService.…E_WORKSPACE).absolutePath");
        return C78966Uyw.LJIJJLI(absolutePath);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIJJ(CreativeInfo creativeInfo) {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), creativeInfo, EnumC43650HBe.SHARED_AR, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIJJLI(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILJJIL(EnumC43651HBf.LOCAL_AUDIO_EFFECT, subPath);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.CUT, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJI(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LJ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), HB7.LIZ, EnumC43652HBg.SHARE, subPath, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIFFI(CreativeInfo creativeInfo) {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), creativeInfo, EnumC43650HBe.DUET_VE_WORKSPACE, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZIZ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43650HBe.WATERMARK, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIIZI(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.SHOUT_OUT, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJ(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        String absolutePath = H8J.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "creativeToolsFileRootDir().absolutePath");
        LIZ2.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ2.append("effect");
        return JBR.LJFF(LIZ2, File.separator, subPath, LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.EFFECT_CAPTURE_PHOTO, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJL(CreativeInfo creativeInfo) {
        String absolutePath = C43073GvN.LIZJ(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.SVC_VOICE_CHANGE_CACHE, null, 12).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getAPI().storageService.…HANGE_CACHE).absolutePath");
        return absolutePath;
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.CONCAT, "", false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.PHOTO, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJI(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.VE_PREVIEW_WORKSPACE, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJIZL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.CANVAS, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJLI(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILJJIL(EnumC43651HBf.DUET_ORIGIN_VIDEO, subPath);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJZI(CreativeInfo creativeInfo) {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), creativeInfo, EnumC43650HBe.COVER, C43077GvR.LIZ("_cover.png"), 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJLIIL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.COVER, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJLL(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIILJJIL(EnumC43651HBf.LOCAL_DUET_LAYOUT, subPath);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJL(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        String absolutePath = H8J.LIZ().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "creativeToolsFileRootDir().absolutePath");
        LIZ2.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ2.append("effectmodel");
        return JBR.LJFF(LIZ2, File.separator, subPath, LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIIJ(String subPath) {
        o.LJIIIZ(subPath, "subPath");
        StringBuilder LIZ2 = X1D.LIZ();
        return JBR.LJFF(LIZ2, C43075GvP.LJIIJJI, subPath, LIZ2);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJILLIZJL(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return C43073GvN.LIZIZ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43650HBe.CUT_VE_WORKSPACE, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJJI(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.INFO_STICKER, null, false, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return pathService.LIZIZ(creativeInfo);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJLLLLLLLZ(String str) {
        return C43073GvN.LIZIZ(C62850Ola.LJ(), HB7.LIZ, EnumC43650HBe.WATERMARK_VE_WORKSPACE, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LIZ(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.BACKGROUND_VIDEO, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJ(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.AUDIO_RECORD, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIIJJI(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.COVER_TEXT, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIILIIL(VideoPublishEditModel videoPublishEditModel, String subPath) {
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.COVER_TEXT, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIL(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZIZ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43650HBe.CAPTION, subPath, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJII(VideoPublishEditModel videoPublishEditModel, String subPath) {
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZIZ(pathService, creativeInfo, EnumC43650HBe.EXTRACT_ORIGIN_SOUND_WORKSPACE, null, 12);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIII(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.DIY_PROP_VIDEO, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIIJ(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.TEXT_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIIJZLJL(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.DUET, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIJLIJ(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.QA_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIL(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.TEXT_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJIZ(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZIZ(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43650HBe.ALBUM_PREVIEW_VIDEO, subPath, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJI(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.VOICE_CONVERSION, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJ(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.CUSTOM_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJL(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.DONATION_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJLZIJ(VideoPublishEditModel videoPublishEditModel, String subPath) {
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LJ(pathService, creativeInfo, EnumC43652HBg.ORIGIN_SOUND, subPath, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJZ(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.BACKGROUND_VIDEO, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLI(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.LOCATION_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJ(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.STICKER_PIN, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJJIZ(VideoPublishEditModel model, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.COMMENT_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJLIIIJLJLI(CreativeInfo creativeInfo, String subPath) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.COVER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJFF(VideoPublishEditModel model, String str, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.HASHTAG_STICKER, subPath, false, 8);
    }

    @Override // X.InterfaceC171126nc
    public final String LJIJ(CreativeInfo creativeInfo, String subPath, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(subPath, "subPath");
        return C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIIIIZZ(creativeInfo, EnumC43649HBd.RECORD, subPath, z);
    }

    @Override // X.InterfaceC171126nc
    public final String LJJJJJ(VideoPublishEditModel model, String str, String subPath) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return C43073GvN.LIZLLL(pathService, creativeInfo, EnumC43649HBd.MENTION_STICKER, subPath, false, 8);
    }
}

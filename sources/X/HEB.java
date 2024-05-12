package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.library.library.ILibraryCameraService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import com.ss.android.ugc.aweme.shortvideo.library.service.LibraryCameraServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEB extends AbstractC29891Fh<InterfaceC147635qp> implements InterfaceC147635qp, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC147635qp LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;

    static {
        TBT tbt = new TBT(HEB.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(HEB.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0, c65351Pkp)};
    }

    private final InterfaceC146755pP LJJLIIIIJ() {
        return (InterfaceC146755pP) this.LJLJJLL.LIZ(this, LJLJL[1]);
    }

    private final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJL[0]);
    }

    @Override // X.InterfaceC147635qp
    public void j6() {
        LibraryCameraServiceImpl.LIZLLL().LIZ();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147635qp getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC147635qp
    public void Lf(LibraryMaterialInfoSv libraryMaterialInfo) {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        String id;
        o.LJIIIZ(libraryMaterialInfo, "libraryMaterialInfo");
        if (LJJLIIIJILLIZJL().libraryMaterialInfo == null || (libraryMaterialInfoSv = LJJLIIIJILLIZJL().libraryMaterialInfo) == null || (id = libraryMaterialInfoSv.getId()) == null || id.length() == 0) {
            return;
        }
        ILibraryCameraService LIZLLL = LibraryCameraServiceImpl.LIZLLL();
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        VideoPublishEditModel LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = LJJLIIIJILLIZJL().libraryMaterialInfo;
        o.LJIIIIZZ(libraryMaterialInfoSv2, "model.libraryMaterialInfo");
        LIZLLL.LIZIZ(LJIJJ, LJJLIIIJILLIZJL, libraryMaterialInfoSv2);
    }

    @Override // X.InterfaceC147635qp
    public void RY(LibraryMaterialInfoSv libraryMaterialInfoSv) {
        LibraryCameraServiceImpl.LIZLLL().LIZJ(getDiContainer(), LJJLIIIJILLIZJL(), this.LJLILLLLZI, this.LJLJI, libraryMaterialInfoSv);
    }

    private final VideoSegment LJJLI(LibraryParams libraryParams, LibraryMaterialInfoSv libraryMaterialInfoSv) {
        C152235yF c152235yF = C152235yF.LJFF;
        String rawFilePath = libraryMaterialInfoSv.getRawFilePath();
        if (rawFilePath == null) {
            rawFilePath = "";
        }
        OSZ<Integer, Integer> LIZIZ = c152235yF.LIZIZ(rawFilePath);
        VideoSegment videoSegment = new VideoSegment(libraryMaterialInfoSv.getRawFilePath(), LIZIZ.getFirst().intValue(), LIZIZ.getSecond().intValue(), (int) (libraryParams.getSpeed() * ((float) libraryParams.getDuration())));
        videoSegment.LJIIL(libraryMaterialInfoSv.getRawFilePath());
        videoSegment.LJIILIIL(libraryParams.getSpeed());
        videoSegment.rotate = libraryParams.getRotation();
        long startTime = libraryParams.getStartTime();
        if (videoSegment.LJIIJ()) {
            videoSegment.stickPointVideoSegment.setVideoStart(startTime);
        } else {
            videoSegment.start = startTime;
        }
        videoSegment.LJIIJJI(libraryParams.getEndTime());
        videoSegment.isDeleted = false;
        videoSegment.videoIndex = 0;
        videoSegment.thumbnail = null;
        String concatAudioPath = libraryParams.getConcatAudioPath();
        String concatVideoPath = libraryParams.getConcatVideoPath();
        videoSegment.libraryVideoSegment = new LibraryVideo(libraryMaterialInfoSv.getId(), concatVideoPath, concatAudioPath, null, null, null, libraryMaterialInfoSv.getRawFilePath(), libraryMaterialInfoSv.getMaterialProvider(), libraryMaterialInfoSv.getMaterialType(), 56, null);
        return videoSegment;
    }

    @Override // X.InterfaceC147635qp
    public void pB(LibraryParams params, LibraryMaterialInfoSv libraryMaterialInfo) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(libraryMaterialInfo, "libraryMaterialInfo");
        VideoSegment LJJLI = LJJLI(params, libraryMaterialInfo);
        InterfaceC146755pP LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.dp();
        }
        InterfaceC146755pP LJJLIIIIJ2 = LJJLIIIIJ();
        if (LJJLIIIIJ2 != null) {
            LJJLIIIIJ2.Az(C47261Igj.LJJIJ(LJJLI));
        }
        LJJLIIIJILLIZJL().libraryMaterialInfo = libraryMaterialInfo;
        LibraryMaterialInfoSv libraryMaterialInfoSv = LJJLIIIJILLIZJL().libraryMaterialInfo;
        if (libraryMaterialInfoSv == null) {
            return;
        }
        libraryMaterialInfoSv.setLibraryMaterialConsumed(true);
    }

    public HEB(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = this;
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC146755pP.class, null);
    }
}

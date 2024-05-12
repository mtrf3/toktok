package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.ForwardStreamEditSettingConfig;
import defpackage.b1;
import defpackage.e1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.GYx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41719GYx {
    public static OSZ LIZIZ(ForwardVideo video) {
        o.LJIIIZ(video, "video");
        String absolutePath = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), EnumC43651HBf.STREAM_EDIT_VIDEO, null, 6).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getAPI().storageService.…_EDIT_VIDEO).absolutePath");
        String LJIJJLI = C78966Uyw.LJIJJLI(absolutePath);
        StringBuilder LIZ = X1D.LIZ();
        String str = (String) ORZ.LJLLLL(video.getPlayAddressList());
        if (str == null) {
            str = "";
        }
        return new OSZ(LJIJJLI, b1.LIZIZ(str, LIZ, ".mp4", LIZ));
    }

    public static ForwardMediaDownloader.DownloadConfig LIZ(ForwardVideo video, boolean z) {
        boolean z2;
        o.LJIIIZ(video, "video");
        C62822Ol8 c62822Ol8 = C41720GYy.LIZIZ;
        boolean z3 = ((ForwardStreamEditSettingConfig) c62822Ol8.getValue()).enableStreamEdit;
        OSZ LIZIZ = LIZIZ(video);
        String str = (String) LIZIZ.getFirst();
        String str2 = (String) LIZIZ.getSecond();
        String LJFF = i0.LJFF(str, str2);
        if (z3 && ((ForwardStreamEditSettingConfig) c62822Ol8.getValue()).enableReusePlayerPartialCache) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new ForwardMediaDownloader.DownloadConfig(str, str2, LJFF, z3, z2, e1.LIZ(31744, "creation_force_2_use_stream_downloader", true, false), z);
    }
}

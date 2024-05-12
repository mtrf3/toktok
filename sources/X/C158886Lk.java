package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158886Lk extends C166286fo {
    public static final /* synthetic */ int LJIIL = 0;
    public final Context LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final PreCheckResult LJ;
    public final NLEModel LJFF;
    public final long LJI;
    public C166036fP LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public UrlModel LJIIJ;
    public String LJIIJJI;

    public static String LIZ(C158886Lk c158886Lk) {
        c158886Lk.getClass();
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = c158886Lk.LIZLLL.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return pathService.LJ(creativeInfo, EnumC43650HBe.AUDIO_COPYRIGHT_REPLACE, "newOriginalAudio.wav", true);
    }

    public C158886Lk(Context context, VideoPublishEditModel videoPublishEditModel, PreCheckResult preCheckResult, NLEModel nLEModel, long j) {
        o.LJIIIZ(preCheckResult, "preCheckResult");
        this.LIZJ = context;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = preCheckResult;
        this.LJFF = nLEModel;
        this.LJI = j;
    }
}

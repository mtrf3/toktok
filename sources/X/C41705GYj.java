package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImageCanvasPrepareTaskFlow$3", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GYj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41705GYj extends AbstractC65782Prm implements InterfaceC88473Ynt<OSZ<? extends GYE, ? extends CanvasVideoData>, C163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>>, Object> {
    public /* synthetic */ OSZ LJLIL;
    public /* synthetic */ C163166am LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;
    public final /* synthetic */ ForwardConfig LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41705GYj(Context context, CreativeInfo creativeInfo, ForwardConfig forwardConfig, ForwardMedia forwardMedia, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = forwardMedia;
        this.LJLJJL = forwardConfig;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        OSZ osz = this.LJLIL;
        C163166am c163166am = this.LJLILLLLZI;
        GYE LIZ = GYE.LIZ((GYE) osz.getFirst(), ((CanvasVideoData) osz.getSecond()).getBackground());
        String path = ((GYE) osz.getFirst()).LIZ;
        C41702GYg c41702GYg = new C41702GYg(this.LJLJI, this.LJLJJI, this.LJLJJL, LIZ, c163166am, C161986Xi.LIZ(this.LJLJJLL), 0, 192);
        o.LJIIIZ(path, "path");
        Bitmap decodeFile = BitmapFactory.decodeFile(path);
        List LJJIJIL = C47261Igj.LJJIJIL(c41702GYg.LIZLLL.LIZ);
        CanvasBackground canvasBackground = c41702GYg.LIZLLL.LIZIZ;
        OSZ LIZ2 = C41708GYm.LIZ(c41702GYg.LJFF, new OSZ(Integer.valueOf(decodeFile.getWidth()), Integer.valueOf(decodeFile.getHeight())));
        int intValue = ((Number) LIZ2.getFirst()).intValue();
        int intValue2 = ((Number) LIZ2.getSecond()).intValue();
        int sourceDuration = c41702GYg.LIZIZ.getVideo().getSourceDuration();
        CanvasGestureConfig canvasGestureConfig = new CanvasGestureConfig(false, false, false, false, 1, true, 7, null);
        String sourceMeta = c41702GYg.LIZIZ.getVideo().getSourceMeta();
        int awemeType = c41702GYg.LIZIZ.getAwemeType();
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            str = LJ.getUid();
        } else {
            str = null;
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(LJJIJIL, null, canvasBackground, new CanvasExtra(0, intValue, intValue2, sourceDuration, 0.4f, 0.8f, true, canvasGestureConfig, new ForwardCanvasExtra(2, sourceMeta, awemeType, o.LJ(str, c41702GYg.LIZIZ.getAuthor().getUid()), c41702GYg.LIZJ.getVideoShareInfoStruct(), c41702GYg.LIZIZ.getForwardMusic(), c41702GYg.LIZIZ.getTargetVolumeLoud(), c41702GYg.LIZIZ.getVideo(), c41702GYg.LJII), c41702GYg.LIZLLL.LIZJ, 0.0f, 0L, 0, 7169, null), 0, null, 0, 96, null);
        canvasVideoData.putTransform(C41708GYm.LIZJ(c41702GYg.LJ, 0.0f, -0.065f, 0.7f));
        return new OSZ(c41702GYg, canvasVideoData);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(OSZ<? extends GYE, ? extends CanvasVideoData> osz, C163166am c163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>> interfaceC67352kd) {
        CreativeInfo creativeInfo = this.LJLJI;
        ForwardMedia forwardMedia = this.LJLJJI;
        ForwardConfig forwardConfig = this.LJLJJL;
        C41705GYj c41705GYj = new C41705GYj(this.LJLJJLL, creativeInfo, forwardConfig, forwardMedia, interfaceC67352kd);
        c41705GYj.LJLIL = osz;
        c41705GYj.LJLILLLLZI = c163166am;
        return c41705GYj.invokeSuspend(C76800UCe.LIZ);
    }
}

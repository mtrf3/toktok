package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createCanvasPrepareTaskFlow$3", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GYl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41707GYl extends AbstractC65782Prm implements InterfaceC88473Ynt<GYE, C163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>>, Object> {
    public /* synthetic */ GYE LJLIL;
    public /* synthetic */ C163166am LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;
    public final /* synthetic */ ForwardConfig LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41707GYl(Context context, CreativeInfo creativeInfo, ForwardConfig forwardConfig, ForwardMedia forwardMedia, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = forwardMedia;
        this.LJLJJL = forwardConfig;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C41702GYg c41702GYg = new C41702GYg(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLIL, this.LJLILLLLZI, C161986Xi.LIZ(this.LJLJJLL), 0, 192);
        CanvasVideoData canvasVideoData = new CanvasVideoData(C47261Igj.LJJIJIL(c41702GYg.LIZLLL.LIZ), null, c41702GYg.LIZLLL.LIZIZ, C41708GYm.LIZIZ(c41702GYg, 2), 1, null, 0, 96, null);
        canvasVideoData.putTransform(C41708GYm.LIZJ(c41702GYg.LJ, 0.0f, -0.065f, 0.7f));
        return new OSZ(c41702GYg, canvasVideoData);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(GYE gye, C163166am c163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>> interfaceC67352kd) {
        CreativeInfo creativeInfo = this.LJLJI;
        ForwardMedia forwardMedia = this.LJLJJI;
        ForwardConfig forwardConfig = this.LJLJJL;
        C41707GYl c41707GYl = new C41707GYl(this.LJLJJLL, creativeInfo, forwardConfig, forwardMedia, interfaceC67352kd);
        c41707GYl.LJLIL = gye;
        c41707GYl.LJLILLLLZI = c163166am;
        return c41707GYl.invokeSuspend(C76800UCe.LIZ);
    }
}

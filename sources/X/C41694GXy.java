package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImagePrepareTaskFlow$3", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GXy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41694GXy extends AbstractC65782Prm implements InterfaceC88473Ynt<OSZ<? extends GYE, ? extends CanvasVideoData>, C163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>>, Object> {
    public /* synthetic */ OSZ LJLIL;
    public /* synthetic */ C163166am LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;
    public final /* synthetic */ ForwardConfig LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41694GXy(Context context, CreativeInfo creativeInfo, ForwardConfig forwardConfig, ForwardMedia forwardMedia, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = forwardMedia;
        this.LJLJJL = forwardConfig;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        OSZ osz = this.LJLIL;
        return new OSZ(new C41702GYg(this.LJLJI, this.LJLJJI, this.LJLJJL, (GYE) osz.getFirst(), this.LJLILLLLZI, C161986Xi.LIZ(this.LJLJJLL), 0, 192), osz.getSecond());
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(OSZ<? extends GYE, ? extends CanvasVideoData> osz, C163166am c163166am, InterfaceC67352kd<? super OSZ<? extends C41702GYg, ? extends CanvasVideoData>> interfaceC67352kd) {
        CreativeInfo creativeInfo = this.LJLJI;
        ForwardMedia forwardMedia = this.LJLJJI;
        ForwardConfig forwardConfig = this.LJLJJL;
        C41694GXy c41694GXy = new C41694GXy(this.LJLJJLL, creativeInfo, forwardConfig, forwardMedia, interfaceC67352kd);
        c41694GXy.LJLIL = osz;
        c41694GXy.LJLILLLLZI = c163166am;
        return c41694GXy.invokeSuspend(C76800UCe.LIZ);
    }
}

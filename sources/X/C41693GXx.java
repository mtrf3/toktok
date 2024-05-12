package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$4", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GXx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41693GXx extends AbstractC65782Prm implements InterfaceC88473Ynt<GYE, C163166am, InterfaceC67352kd<? super C41702GYg>, Object> {
    public /* synthetic */ GYE LJLIL;
    public /* synthetic */ C163166am LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;
    public final /* synthetic */ ForwardMedia LJLJJI;
    public final /* synthetic */ ForwardConfig LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41693GXx(Context context, CreativeInfo creativeInfo, ForwardConfig forwardConfig, ForwardMedia forwardMedia, InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = creativeInfo;
        this.LJLJJI = forwardMedia;
        this.LJLJJL = forwardConfig;
        this.LJLJJLL = context;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return new C41702GYg(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLIL, this.LJLILLLLZI, C161986Xi.LIZ(this.LJLJJLL), this.LJLJJI.getOriginVideoAIGCLabelType(), 128);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(GYE gye, C163166am c163166am, InterfaceC67352kd<? super C41702GYg> interfaceC67352kd) {
        CreativeInfo creativeInfo = this.LJLJI;
        ForwardMedia forwardMedia = this.LJLJJI;
        ForwardConfig forwardConfig = this.LJLJJL;
        C41693GXx c41693GXx = new C41693GXx(this.LJLJJLL, creativeInfo, forwardConfig, forwardMedia, interfaceC67352kd);
        c41693GXx.LJLIL = gye;
        c41693GXx.LJLILLLLZI = c163166am;
        return c41693GXx.invokeSuspend(C76800UCe.LIZ);
    }
}

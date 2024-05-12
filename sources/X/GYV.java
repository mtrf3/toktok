package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;

/* loaded from: classes8.dex */
public final class GYV implements InterfaceC65462ha<C41701GYf> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ CreativeInfo LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ ForwardConfig LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super C41701GYf> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new GYW(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public GYV(C79793Bf c79793Bf, CreativeInfo creativeInfo, ForwardMedia forwardMedia, ForwardConfig forwardConfig, Context context) {
        this.LJLIL = c79793Bf;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = forwardMedia;
        this.LJLJJI = forwardConfig;
        this.LJLJJL = context;
    }
}

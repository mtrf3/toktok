package X;

import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Won, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83433Won implements InterfaceC83472WpQ {
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "remove_music";
    }

    public C83433Won(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(C83432Wom.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 371));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 372));
    }

    @Override // X.InterfaceC83472WpQ
    public final Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJJI.getValue();
        if (videoPublishEditModel != null && videoPublishEditModel.hasMusic()) {
            InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LJLJI.getValue();
            if (interfaceC145495nN != null) {
                interfaceC145495nN.clearMusic();
            }
            C83429Woj c83429Woj = new C83429Woj(this.LJLILLLLZI.getValue(), null, null, false, null, EnumC45236HpA.SUCCESS, null, null, 218);
            C3C5.m7constructorimpl(c83429Woj);
            return c83429Woj;
        }
        C83429Woj c83429Woj2 = new C83429Woj(this.LJLILLLLZI.getValue(), null, null, false, null, EnumC45236HpA.SUCCESS, null, null, 218);
        C3C5.m7constructorimpl(c83429Woj2);
        return c83429Woj2;
    }
}

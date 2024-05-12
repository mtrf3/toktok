package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider", f = "ModelResourceProvider.kt", l = {34, 37}, m = "getFaceModel")
/* renamed from: X.aik, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94546aik extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ModelResourceProvider LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94546aik(ModelResourceProvider modelResourceProvider, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = modelResourceProvider;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.getFaceModel(this);
    }
}

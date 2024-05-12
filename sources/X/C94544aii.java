package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel", f = "PrefabViewModel.kt", l = {93, 95}, m = "initFeature")
/* renamed from: X.aii, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94544aii extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PrefabViewModel LJLJI;
    public Object LJLJJI;
    public boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94544aii(PrefabViewModel prefabViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = prefabViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.kv0(false, this);
    }
}

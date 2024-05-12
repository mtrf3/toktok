package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew$updateDataWhenLynxReady$1$1$1", f = "DynamicSingleIntermediateFragmentNew.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JwB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50767JwB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50767JwB(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j, String str, boolean z, DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, InterfaceC67352kd<? super C50767JwB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = dynamicSingleIntermediateFragmentNew;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50767JwB(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke();
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.LJLILLLLZI);
        C50793Jwb c50793Jwb = new C50793Jwb();
        String scene = this.LJLJI;
        o.LJIIIZ(scene, "scene");
        c50793Jwb.LIZLLL(WM7.SCENE_SERVICE, scene);
        c50793Jwb.LJFF("is_count_down_latch_time_out", !this.LJLJJI);
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        c50793Jwb.LIZJ(currentTimeMillis, "wait_duration");
        c50793Jwb.LJIILIIL();
        DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = this.LJLJJL;
        boolean z = this.LJLJJI;
        dynamicSingleIntermediateFragmentNew.getClass();
        if (!z) {
            C50799Jwh c50799Jwh = dynamicSingleIntermediateFragmentNew.LLFFF;
            if (c50799Jwh != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = c50799Jwh.LJIIJJI;
                o.LJIIIZ(sparkView, "sparkView");
                ((ConcurrentHashMap) C50783JwR.LIZ.getValue()).put(Integer.valueOf(sparkView.hashCode()), Boolean.TRUE);
            } else {
                o.LJIJI("dynamicViewsContainer");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchSingleEffect$1$1", f = "LiveEffectDataProvider.kt", l = {632}, m = "invokeSuspend")
/* renamed from: X.2Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54332Bh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BgEffectViewModel LJLJI;
    public final /* synthetic */ C0WQ LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54332Bh(BgEffectViewModel bgEffectViewModel, C0WQ c0wq, String str, InterfaceC67352kd<? super C54332Bh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = bgEffectViewModel;
        this.LJLJJI = c0wq;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54332Bh c54332Bh = new C54332Bh(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c54332Bh.LJLILLLLZI = obj;
        return c54332Bh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            BgEffectViewModel bgEffectViewModel = this.LJLJI;
            bgEffectViewModel.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), C78613UtF.LIZJ, null, new C54902Dm(bgEffectViewModel, null), 2);
            XLL xll = this.LJLJI.LJLJI;
            final C0WQ c0wq = this.LJLJJI;
            final String str = this.LJLJJL;
            InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>> interfaceC64672gJ = new InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>>() { // from class: X.1KI
                @Override // X.InterfaceC64672gJ
                public final Object emit(AbstractC261010s<? extends LiveEffect> abstractC261010s, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    Object obj2;
                    AbstractC261010s<? extends LiveEffect> abstractC261010s2 = abstractC261010s;
                    if (abstractC261010s2 instanceof C37001cm) {
                        C37001cm c37001cm = (C37001cm) abstractC261010s2;
                        if (o.LJ(c37001cm.LIZ, "multi")) {
                            Iterator it = c37001cm.LIZIZ.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (o.LJ(((LiveEffect) obj2).getResourceId(), str)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            LiveEffect liveEffect = (LiveEffect) obj2;
                            if (liveEffect == null) {
                                C0WQ.this.onFail();
                            } else {
                                C0WQ.this.LIZ(liveEffect);
                            }
                            C48841JEv.LIZJ(interfaceC70422pa, null);
                        }
                    } else if ((abstractC261010s2 instanceof C37031cp) && o.LJ(((C37031cp) abstractC261010s2).LIZ, "multi")) {
                        C0WQ.this.onFail();
                        C48841JEv.LIZJ(interfaceC70422pa, null);
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (xll.collect(interfaceC64672gJ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

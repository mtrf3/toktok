package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.composer.LiveEcEffectHelper$queryStickerEffect$1$1", f = "LiveEcEffectExternalHelper.kt", l = {102, 346}, m = "invokeSuspend")
/* renamed from: X.2E6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2E6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<LiveEffect, C76800UCe> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2E6(StickerEffectViewModel stickerEffectViewModel, String str, InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns, String str2, InterfaceC67352kd<? super C2E6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
        this.LJLJI = str;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2E6(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            XK4 xk4 = this.LJLILLLLZI.LJLILLLLZI;
            C36901cc c36901cc = C36901cc.LIZ;
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c36901cc, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        final C34K c34k = new C34K();
        XLL xll = this.LJLILLLLZI.LJLJI;
        final String str = this.LJLJI;
        final InterfaceC88472Yns<LiveEffect, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        final String str2 = this.LJLJJL;
        InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>> interfaceC64672gJ = new InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>>() { // from class: X.1R7
            @Override // X.InterfaceC64672gJ
            public final Object emit(AbstractC261010s<? extends LiveEffect> abstractC261010s, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                AbstractC261010s<? extends LiveEffect> abstractC261010s2 = abstractC261010s;
                Object obj2 = null;
                if (abstractC261010s2 instanceof C37161d2) {
                    if (!C34K.this.element) {
                        List list = ((C37161d2) abstractC261010s2).LIZ;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ORS.LJJLIIIJILLIZJL(((C1QC) it.next()).LJLILLLLZI, arrayList);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (o.LJ(((LiveEffect) next).getResourceId(), str2)) {
                                obj2 = next;
                                break;
                            }
                        }
                        LiveEffect liveEffect = (LiveEffect) obj2;
                        C0NB.LIZIZ("LiveEcEffectHelper", "query sticker effect and filter the target effect is " + liveEffect);
                        if (liveEffect != null) {
                            liveEffect.effectPanelKey = str;
                        }
                        interfaceC88472Yns.invoke(liveEffect);
                        C34K.this.element = true;
                    }
                } else if (abstractC261010s2 instanceof C37001cm) {
                    C37001cm c37001cm = (C37001cm) abstractC261010s2;
                    if (o.LJ(c37001cm.LIZ, str) && !C34K.this.element) {
                        Iterator it3 = c37001cm.LIZIZ.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (o.LJ(((LiveEffect) next2).getResourceId(), str2)) {
                                obj2 = next2;
                                break;
                            }
                        }
                        LiveEffect liveEffect2 = (LiveEffect) obj2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("query sticker effect with category ");
                        LIZ.append(str);
                        LIZ.append(" and filter the target effect is ");
                        LIZ.append(liveEffect2);
                        C0NB.LIZIZ("LiveEcEffectHelper", X1D.LIZIZ(LIZ));
                        if (liveEffect2 != null) {
                            liveEffect2.effectPanelKey = str;
                        }
                        interfaceC88472Yns.invoke(liveEffect2);
                        C34K.this.element = true;
                    }
                } else if (abstractC261010s2 instanceof C37041cq) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("query sticker effect and got error: ");
                    C37041cq c37041cq = (C37041cq) abstractC261010s2;
                    LIZ2.append(c37041cq.LIZIZ);
                    LIZ2.append(" noAvailableData=");
                    LIZ2.append(c37041cq.LIZ);
                    C0NB.LJ("LiveEcEffectHelper", X1D.LIZIZ(LIZ2));
                    if (!C34K.this.element) {
                        interfaceC88472Yns.invoke(null);
                        Throwable th = new Throwable();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append('[');
                        InterfaceC06390Mx LIZ4 = CN1.LIZ(IHostUser.class);
                        o.LJIIIIZZ(LIZ4, "getService(T::class.java)");
                        LIZ3.append(((IHostUser) LIZ4).getCurrentRegionCode());
                        LIZ3.append("] query sticker effect");
                        LIZ3.append(str2);
                        LIZ3.append(" and got error: ");
                        LIZ3.append(c37041cq.LIZIZ);
                        LIZ3.append(" noAvailableData=");
                        LIZ3.append(c37041cq.LIZ);
                        LIZ3.append(' ');
                        C0K2.LIZ(X1D.LIZIZ(LIZ3), th);
                    }
                }
                return C76800UCe.LIZ;
            }
        };
        this.LJLIL = 2;
        if (xll.collect(interfaceC64672gJ, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

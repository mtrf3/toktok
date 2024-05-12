package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS14S1201000_2;
import kotlin.jvm.internal.AqS19S1101000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFilterVoiceChange$1$1", f = "VoiceChanger.kt", l = {190}, m = "invokeSuspend")
/* renamed from: X.6f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165856f7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C165866f8 LJLILLLLZI;
    public final /* synthetic */ InterfaceC166046fQ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165856f7(C165866f8 c165866f8, InterfaceC166046fQ interfaceC166046fQ, String str, int i, InterfaceC67352kd<? super C165856f7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c165866f8;
        this.LJLJI = interfaceC166046fQ;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165856f7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C165876f9 c165876f9 = (C165876f9) this.LJLILLLLZI.LJI.getValue();
            final InterfaceC166046fQ interfaceC166046fQ = this.LJLJI;
            final String str = this.LJLJJI;
            final int i2 = this.LJLJJL;
            final C165866f8 c165866f8 = this.LJLILLLLZI;
            InterfaceC166346fu<C165906fC> interfaceC166346fu = new InterfaceC166346fu<C165906fC>() { // from class: X.6fA
                @Override // X.InterfaceC166346fu
                public final void LIZ(C166276fn executeResult, C165906fC c165906fC) {
                    C165906fC c165906fC2 = c165906fC;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (executeResult.LIZ == 2 && o.LJ(c165866f8.LJ.get(str), Boolean.TRUE)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("curHandlerName", executeResult.LIZIZ);
                        linkedHashMap.put("curHandlerId", String.valueOf(executeResult.LIZJ));
                        C2VQ.LIZIZ(new AqS14S1201000_2(InterfaceC166046fQ.this, str, i2, new C59722Wa(linkedHashMap, 100, c165906fC2.LIZLLL), 0), 0L);
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZIZ(C166276fn executeResult, C165906fC c165906fC) {
                    List<? extends Effect> list;
                    C165906fC allData = c165906fC;
                    o.LJIIIZ(executeResult, "executeResult");
                    o.LJIIIZ(allData, "allData");
                    if (executeResult.LIZ == 1 && executeResult.LIZJ == 20 && (list = allData.LJ) != null && (!((ArrayList) list).isEmpty())) {
                        C2VQ.LIZIZ(new AqS19S1101000_2(InterfaceC166046fQ.this, str, i2, 0), 0L);
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZJ(C166276fn executeResult, C165906fC c165906fC) {
                    List<C166116fX> list;
                    C165906fC c165906fC2 = c165906fC;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (executeResult.LIZ == 2 && o.LJ(c165866f8.LJ.get(str), Boolean.TRUE) && (list = c165906fC2.LIZLLL) != null) {
                        C2VQ.LIZIZ(new AqS14S1201000_2(i2, InterfaceC166046fQ.this, str, list, 1), 0L);
                    }
                }
            };
            this.LJLIL = 1;
            if (c165876f9.LIZIZ(c165876f9.LIZLLL(), interfaceC166346fu, this) == enumC58928NAu) {
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

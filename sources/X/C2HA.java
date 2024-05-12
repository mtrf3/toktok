package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$saveSoundEffectOrder$1", f = "SoundEffectViewModel.kt", l = {233, 234}, m = "invokeSuspend")
/* renamed from: X.2HA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SoundEffectViewModel LJLILLLLZI;
    public final /* synthetic */ List<SoundEffect> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HA(SoundEffectViewModel soundEffectViewModel, List<SoundEffect> list, InterfaceC67352kd<? super C2HA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = soundEffectViewModel;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2HA(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C37931eH c37931eH = this.LJLILLLLZI.LJLJJI;
            List<SoundEffect> list = this.LJLJI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<SoundEffect> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(it.next().id));
            }
            c37931eH.LIZJ(0, arrayList);
            C37931eH c37931eH2 = this.LJLILLLLZI.LJLJJI;
            this.LJLIL = 1;
            c37931eH2.getClass();
            obj = C47261Igj.LJJIJ(new C1QC("sound_effect", "sound_effect", c37931eH2.LIZIZ(), null, 56));
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XLL xll = this.LJLILLLLZI.LJLJI;
        C37161d2 c37161d2 = new C37161d2((List) obj);
        this.LJLIL = 2;
        if (xll.emit(c37161d2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

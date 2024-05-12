package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$fetchData$1$2", f = "SoundEffectViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2H6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ SoundEffectViewModel LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2H6(SoundEffectViewModel soundEffectViewModel, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = soundEffectViewModel;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2H6(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C37931eH c37931eH = this.LJLIL.LJLJJI;
        c37931eH.getClass();
        List<SoundEffect> all = SoundEffectDatabase.LJIIL.LJIJ().getAll();
        if (!all.isEmpty()) {
            c37931eH.LIZIZ().clear();
            c37931eH.LIZIZ().addAll(all);
        }
        List LJJIJ = C47261Igj.LJJIJ(new C1QC("sound_effect", "sound_effect", all, null, 56));
        if ((!LJJIJ.isEmpty()) && !LJJIJ.isEmpty()) {
            Iterator it = LJJIJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((C1QC) it.next()).LJLILLLLZI.isEmpty()) {
                    this.LJLILLLLZI.addAll(LJJIJ);
                    break;
                }
            }
        }
        return Boolean.valueOf(this.LJLILLLLZI.addAll(LJJIJ));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}

package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileState;
import kotlin.jvm.internal.o;

/* renamed from: X.Rr8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70838Rr8 extends AbstractC65781Prl implements InterfaceC88472Yns<EffectProfileState, EffectProfileState> {
    public static final C70838Rr8 LJLIL = new C70838Rr8();

    public C70838Rr8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EffectProfileState invoke(EffectProfileState effectProfileState) {
        EffectProfileState setState = effectProfileState;
        o.LJIIIZ(setState, "$this$setState");
        return EffectProfileState.copy$default(setState, null, new ListState(new C70839Rr9(false, 0), C61878OQg.INSTANCE, null, null, null, 28, null), 1, null);
    }
}

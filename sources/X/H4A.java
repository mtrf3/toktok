package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import ujb.s;

/* loaded from: classes8.dex */
public final class H4A extends AbstractC65781Prl implements InterfaceC65784Pro<HashSet<String>> {
    public static final H4A LJLIL = new H4A();

    public H4A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashSet<String> invoke() {
        List LJLJJI = s.LJLJJI(C31461Li.LIZJ("studio_viral_effect_ids", "", "getInstance().getStringV…ctIdsSetting::class.java)"), new char[]{','}, false, 6);
        HashSet<String> hashSet = new HashSet<>();
        ORZ.LLILZLL(LJLJJI, hashSet);
        C1I0.LIZIZ().LJFF("effect-watermark", new AqS151S0100000_1(hashSet, (HashSet<String>) 930));
        return hashSet;
    }
}

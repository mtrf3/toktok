package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GfZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42093GfZ extends F9E implements InterfaceC42095Gfb {
    public final String LJLIL;
    public final List<String> LJLILLLLZI;
    public final List<String> LJLJI;
    public final List<String> LJLJJI;

    public C42093GfZ() {
        this(null, null, null, null, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C42093GfZ(String bringInChallenge, List missionChallenges, List effectChallenges, List allChallenges, int i) {
        bringInChallenge = (i & 1) != 0 ? "" : bringInChallenge;
        missionChallenges = (i & 2) != 0 ? C61878OQg.INSTANCE : missionChallenges;
        effectChallenges = (i & 4) != 0 ? C61878OQg.INSTANCE : effectChallenges;
        allChallenges = (i & 8) != 0 ? C61878OQg.INSTANCE : allChallenges;
        o.LJIIIZ(bringInChallenge, "bringInChallenge");
        o.LJIIIZ(missionChallenges, "missionChallenges");
        o.LJIIIZ(effectChallenges, "effectChallenges");
        o.LJIIIZ(allChallenges, "allChallenges");
        this.LJLIL = bringInChallenge;
        this.LJLILLLLZI = missionChallenges;
        this.LJLJI = effectChallenges;
        this.LJLJJI = allChallenges;
    }
}

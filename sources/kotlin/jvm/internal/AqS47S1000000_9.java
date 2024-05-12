package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73638SvC;
import X.C16880lQ;
import X.C221018lt;
import X.C52802Knu;
import X.C53046Krq;
import X.C54941LhJ;
import X.C54943LhL;
import X.C57126MbS;
import X.C62822Ol8;
import X.C74385THh;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.T16;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes10.dex */
public class AqS47S1000000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        String LLLZ = C16880lQ.LLLZ("repo_maf_follow_back_notice_%s", Arrays.copyOf(new Object[]{this.s0}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        long currentTimeMillis = System.currentTimeMillis();
        long j = repo.getLong("key_maf_follow_back_notice", 0L);
        long j2 = currentTimeMillis - j;
        C62822Ol8 c62822Ol8 = C52802Knu.LIZ;
        if (j2 < ((Number) c62822Ol8.getValue()).intValue() * 86400000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("filter by frequency name = key_maf_follow_back_notice, interval = ");
            LIZ.append(((Number) c62822Ol8.getValue()).intValue());
            LIZ.append(", currentTime = ");
            LIZ.append(currentTimeMillis);
            LIZ.append(", lastTime = ");
            LIZ.append(j);
            C221018lt.LJFF("MafFollowBackBootRequest", X1D.LIZIZ(LIZ));
            return;
        }
        repo.storeLong("key_maf_follow_back_notice", currentTimeMillis);
        C221018lt.LJFF("MafFollowBackBootRequest", "report to server");
        FriendApi.LIZ.getClass();
        AbstractC73638SvC.LJIIZILJ(C57126MbS.LIZ().reportMafFollowBackBoot(1)).LJJIIJ(T16.LIZ()).LJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1000000_9(int i) {
        super(0);
        this.$t = i;
        this.s0 = "default";
    }

    public static final Object invoke$0(AqS47S1000000_9 aqS47S1000000_9) {
        Set<String> set = C54941LhJ.LIZIZ;
        int size = set.size();
        C54943LhL.LIZ.getClass();
        if (size < C54943LhL.LIZ().vvCount + 1) {
            set.add(aqS47S1000000_9.s0);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS47S1000000_9 aqS47S1000000_9) {
        aqS47S1000000_9.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS47S1000000_9 aqS47S1000000_9) {
        return new C74385THh(aqS47S1000000_9.s0, false, false, ((Number) C53046Krq.LIZ.getValue()).intValue(), null, null, 131052);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S1000000_9(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}

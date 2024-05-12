package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.P1k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63780P1k extends F9E implements C33Q {
    public final FindFriendsPageArg LJLIL;
    public final AbstractC72932td<C9U5> LJLILLLLZI;
    public final AbstractC72932td<List<User>> LJLJI;
    public final InterfaceC65350Pko<? extends Fragment> LJLJJI;
    public final C57571Mid LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C63780P1k() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C63780P1k(X.C65776Prg r14, X.C57571Mid r15, int r16) {
        /*
            r13 = this;
            r11 = r14
            r12 = r15
            r0 = r16 & 1
            r4 = 0
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg r1 = new com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg
            r2 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r3 = r2
            r5 = r4
            r6 = r4
            r7 = r2
            r8 = r2
            r10 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L15:
            r0 = r16 & 2
            if (r0 == 0) goto L3e
            X.33X r9 = X.C33X.LIZ
        L1b:
            r0 = r16 & 4
            if (r0 == 0) goto L3c
            X.33X r10 = X.C33X.LIZ
        L21:
            r0 = r16 & 8
            if (r0 == 0) goto L2b
            java.lang.Class<com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment> r0 = com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment.class
            X.Prg r11 = X.C65352Pkq.LIZ(r0)
        L2b:
            r0 = r16 & 16
            if (r0 == 0) goto L36
            X.Mid r12 = new X.Mid
            r0 = 15
            r12.<init>(r4, r4, r4, r0)
        L36:
            r7 = r13
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            return
        L3c:
            r10 = r4
            goto L21
        L3e:
            r9 = r4
            goto L1b
        L40:
            r1 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63780P1k.<init>(X.Prg, X.Mid, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C63780P1k(FindFriendsPageArg pageNavArg, AbstractC72932td<C9U5> syncContactState, AbstractC72932td<? extends List<? extends User>> syncFacebookState, InterfaceC65350Pko<? extends Fragment> fullFragment, C57571Mid trackInfo) {
        o.LJIIIZ(pageNavArg, "pageNavArg");
        o.LJIIIZ(syncContactState, "syncContactState");
        o.LJIIIZ(syncFacebookState, "syncFacebookState");
        o.LJIIIZ(fullFragment, "fullFragment");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL = pageNavArg;
        this.LJLILLLLZI = syncContactState;
        this.LJLJI = syncFacebookState;
        this.LJLJJI = fullFragment;
        this.LJLJJL = trackInfo;
    }

    public static C63780P1k L(C63780P1k c63780P1k, FindFriendsPageArg findFriendsPageArg, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, InterfaceC65350Pko interfaceC65350Pko, int i) {
        C57571Mid trackInfo;
        InterfaceC65350Pko fullFragment = interfaceC65350Pko;
        AbstractC72932td syncFacebookState = abstractC72932td2;
        FindFriendsPageArg pageNavArg = findFriendsPageArg;
        AbstractC72932td syncContactState = abstractC72932td;
        if ((i & 1) != 0) {
            pageNavArg = c63780P1k.LJLIL;
        }
        if ((i & 2) != 0) {
            syncContactState = c63780P1k.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            syncFacebookState = c63780P1k.LJLJI;
        }
        if ((i & 8) != 0) {
            fullFragment = c63780P1k.LJLJJI;
        }
        if ((i & 16) != 0) {
            trackInfo = c63780P1k.LJLJJL;
        } else {
            trackInfo = null;
        }
        c63780P1k.getClass();
        o.LJIIIZ(pageNavArg, "pageNavArg");
        o.LJIIIZ(syncContactState, "syncContactState");
        o.LJIIIZ(syncFacebookState, "syncFacebookState");
        o.LJIIIZ(fullFragment, "fullFragment");
        o.LJIIIZ(trackInfo, "trackInfo");
        return new C63780P1k(pageNavArg, syncContactState, syncFacebookState, fullFragment, trackInfo);
    }
}

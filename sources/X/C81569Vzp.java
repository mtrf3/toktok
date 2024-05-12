package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81569Vzp implements InterfaceC43847HIt {
    public final /* synthetic */ C81570Vzq LIZ;

    public C81569Vzp(C81570Vzq c81570Vzq) {
        this.LIZ = c81570Vzq;
    }

    @Override // X.InterfaceC43847HIt
    public final boolean LIZ(C46156I9o event) {
        o.LJIIIZ(event, "event");
        if (!this.LIZ.LJLLLL.isDuetGreenSrceen) {
            return false;
        }
        Keva repo = Keva.getRepo("duet_keva_object");
        o.LJIIIIZZ(repo, "getRepo(DuetKeva.REPO_NAME)");
        if (repo.getBoolean("duet_green_screen", true)) {
            repo.storeBoolean("duet_green_screen", false);
            C81570Vzq c81570Vzq = this.LIZ;
            c81570Vzq.LJJLIIJ(new AqS164S0100000_14(c81570Vzq, 513));
            return true;
        }
        if (this.LIZ.LL || o.LJ("duet", event.LIZ)) {
            return false;
        }
        int i = 0;
        for (Integer it : this.LIZ.LJZI) {
            o.LJIIIIZZ(it, "it");
            i += it.intValue();
        }
        InterfaceC45921I0n.LJJZZI.getClass();
        if (i >= C45911I0d.LIZIZ) {
            return false;
        }
        C81570Vzq c81570Vzq2 = this.LIZ;
        c81570Vzq2.LJJLIIJ(new AqS164S0100000_14(c81570Vzq2, 514));
        return true;
    }
}

package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81568Vzo implements InterfaceC43847HIt {
    public final /* synthetic */ C81567Vzn LIZ;

    public C81568Vzo(C81567Vzn c81567Vzn) {
        this.LIZ = c81567Vzn;
    }

    @Override // X.InterfaceC43847HIt
    public final boolean LIZ(C46156I9o event) {
        o.LJIIIZ(event, "event");
        if (!this.LIZ.getShortVideoContext().isDuetGreenSrceen) {
            return false;
        }
        Keva repo = Keva.getRepo("duet_keva_object");
        o.LJIIIIZZ(repo, "getRepo(DuetKeva.REPO_NAME)");
        if (repo.getBoolean("duet_green_screen", true)) {
            repo.storeBoolean("duet_green_screen", false);
            C81567Vzn c81567Vzn = this.LIZ;
            c81567Vzn.LLJJL(new AqS164S0100000_14(c81567Vzn, 141));
            return true;
        }
        if (this.LIZ.LLIIIILZ || o.LJ("duet", event.LIZ)) {
            return false;
        }
        int i = 0;
        for (Integer it : this.LIZ.LLIIII) {
            o.LJIIIIZZ(it, "it");
            i += it.intValue();
        }
        InterfaceC45921I0n.LJJZZI.getClass();
        if (i >= C45911I0d.LIZIZ) {
            return false;
        }
        C81567Vzn c81567Vzn2 = this.LIZ;
        c81567Vzn2.LLJJL(new AqS164S0100000_14(c81567Vzn2, 142));
        return true;
    }
}

package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hal, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44343Hal implements HXK {
    public final ActivityC45651qj LIZ;
    public final InterfaceC82086WJm LIZIZ;
    public final I3X LIZJ;
    public final C82622Wbi LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public Effect LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final MutableLiveData<Integer> LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;

    public final C44342Hak LJ() {
        return (C44342Hak) this.LJIIIZ.getValue();
    }

    @Override // X.HXK
    public final void LIZJ() {
        LJ().LIZ(16385, 10L, 0L, null);
    }

    @Override // X.HXK
    public final MutableLiveData LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.HXK
    public final void LIZLLL(com.ss.android.ugc.effectmanager.effect.model.Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LJIIIIZZ = effect;
    }

    @Override // X.HXK
    public final void LIZIZ(String sessionUrl, String hostName) {
        o.LJIIIZ(sessionUrl, "sessionUrl");
        o.LJIIIZ(hostName, "hostName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_url", sessionUrl);
        jSONObject.put("invitee_name", hostName);
        LJ().LIZ(16385, 6L, 0L, jSONObject.toString());
    }

    public C44343Hal(C29S activity, WRQ cameraApiComponent, I3X recordControlApi, C82622Wbi diContainer) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = activity;
        this.LIZIZ = cameraApiComponent;
        this.LIZJ = recordControlApi;
        this.LIZLLL = diContainer;
        this.LJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 582));
        this.LJFF = C221108m2.LIZIZ(C69452o1.LJLIL);
        this.LJI = C221108m2.LIZIZ(C44344Ham.LJLIL);
        this.LJII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 583));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 585));
        this.LJIIJ = new MutableLiveData<>();
        this.LJIIJJI = new MutableLiveData<>();
    }

    @Override // X.HXK
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C44342Hak LJ = LJ();
        long j = i;
        long j2 = i2;
        long j3 = i3;
        if (!LJ.LIZJ.invoke().booleanValue()) {
            return;
        }
        for (AbstractC44341Haj abstractC44341Haj : (List) LJ.LIZLLL.getValue()) {
            abstractC44341Haj.getClass();
            long j4 = 16385;
            if (j4 == -1 || j4 == j) {
                long LIZ = abstractC44341Haj.LIZ();
                if (LIZ == -1 || LIZ == j2) {
                    StringBuilder LIZJ = V10.LIZJ("[Effect --> Client]: msgID(", j, "), arg1(");
                    LIZJ.append(j2);
                    C0MT.LIZLLL(LIZJ, "), arg2(", j3, "), arg3(");
                    LIZJ.append(str);
                    LIZJ.append("), match handler=");
                    LIZJ.append(C16880lQ.LJLLJ(abstractC44341Haj.getClass()));
                    H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZJ));
                    abstractC44341Haj.LIZIZ((int) j, j3, str);
                }
            }
        }
    }
}

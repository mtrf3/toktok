package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.1pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44691pB extends AbstractC35601aW {
    public List<BattleUserArmy> LIZ;
    public List<BattleUserArmy> LIZIZ;
    public final String LIZJ = "match_contributors_viewer_index";

    @Override // X.AbstractC35601aW
    public final void LIZJ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    @Override // X.InterfaceC18160nU
    public final String getName() {
        return this.LIZJ;
    }

    public static int LIZLLL(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((BattleUserArmy) it.next()).userId == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC18160nU
    public final Object LIZ(JSONArray args) {
        Object LIZ;
        int i;
        o.LJIIIZ(args, "args");
        try {
            Object obj = args.get(0);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (o.LJ(str, "host_team")) {
                i = LIZLLL(this.LIZ);
            } else if (o.LJ(str, "guest_team")) {
                i = LIZLLL(this.LIZIZ);
            } else {
                i = -1;
            }
            LIZ = Integer.valueOf(i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C3C5.m6boximpl(LIZ);
    }

    @Override // X.AbstractC35601aW
    public final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        if (dataChannel != null) {
            dataChannel.lv0(fragment, BattleMvpLeftListChannel.class, new IDqS416S0100000(this, 365));
            dataChannel.lv0(fragment, BattleMvpLeftListChannel.class, new IDqS416S0100000(this, 366));
        }
    }
}

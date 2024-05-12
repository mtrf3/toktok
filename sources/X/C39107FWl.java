package X;

import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.FWl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39107FWl implements InterfaceC39114FWs {
    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        if (message.getTarget() == null) {
            return false;
        }
        String scene = C56672Kh.LIZ().LJJIJIIJI.getValue();
        if (!o.LJ(C39110FWo.LJI, scene)) {
            C39110FWo.LIZ = 0;
        }
        C39110FWo.LJI = scene;
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        o.LJIIIZ(scene, "scene");
        if (LIZ.LJJIJIIJIL.contains(scene)) {
            java.util.Map<String, Integer> map = C39110FWo.LIZLLL;
            String value = C56672Kh.LIZ().LJJIJIIJI.getValue();
            int i = C39110FWo.LIZ + 1;
            C39110FWo.LIZ = i;
            map.put(value, Integer.valueOf(i));
        }
        return false;
    }
}

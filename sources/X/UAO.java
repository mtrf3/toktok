package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UAO {
    public final C76786UBq LIZ;
    public final List<UAS> LIZIZ;

    public UAO(C76786UBq linkLayerSeqEventReporter) {
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        this.LIZ = linkLayerSeqEventReporter;
        this.LIZIZ = new ArrayList();
    }

    public final List<UAS> LIZLLL(U66 linker) {
        o.LJIIIZ(linker, "linker");
        List<UAS> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (UAS uas : list) {
            if (o.LJ(linker, uas.LJIIL.get())) {
                arrayList.add(uas);
            }
        }
        return arrayList;
    }

    public final void LJ(U66 linker) {
        o.LJIIIZ(linker, "linker");
        List<UAS> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (UAS uas : list) {
            if (o.LJ(uas.LJIIL.get(), linker)) {
                arrayList.add(uas);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ArrayList) this.LIZIZ).remove(it.next());
        }
    }

    public final void LJFF(String recordId) {
        o.LJIIIZ(recordId, "recordId");
        for (UAS uas : this.LIZIZ) {
            if (o.LJ(uas.LIZIZ(), recordId)) {
                if (uas != null) {
                    ((ArrayList) this.LIZIZ).remove(uas);
                    return;
                }
                return;
            }
        }
    }

    public final UAS LIZIZ(U66 linker, String linkmicId, U85 u85) {
        Object obj;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(linkmicId, "linkmicId");
        List<UAS> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (UAS uas : list) {
            if (o.LJ(uas.LJIIL.get(), linker)) {
                arrayList.add(uas);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                UAS uas2 = (UAS) obj;
                if (o.LJ(uas2.LIZIZ, linkmicId) || o.LJ(uas2.LIZ, linkmicId)) {
                    if (u85 == null || u85 == uas2.LJI) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return (UAS) obj;
    }

    public final UAS LIZJ(U66 linker, String remoteUserId, U85 u85) {
        UAS uas;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        Iterator<UAS> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                uas = it.next();
                UAS uas2 = uas;
                if (o.LJ(uas2.LIZJ, remoteUserId) && o.LJ(uas2.LJIIL.get(), linker) && (u85 == null || u85 == uas2.LJI)) {
                    break;
                }
            } else {
                uas = null;
                break;
            }
        }
        return uas;
    }

    public static UAS LIZ(UAO uao, U66 linker, String remoteUserId, String remoteRoomId, U85 linkRoleType, String str, String str2, String currentRoomId, String str3, String str4, int i, int i2) {
        String str5;
        LiveMode streamType;
        String str6 = str2;
        String str7 = str;
        String str8 = str3;
        int i3 = i;
        String str9 = null;
        if ((i2 & 16) != 0) {
            str7 = null;
        }
        if ((i2 & 32) != 0) {
            str6 = null;
        }
        if ((i2 & 128) != 0) {
            str8 = null;
        }
        if ((i2 & 256) == 0) {
            str9 = str4;
        }
        if ((i2 & 512) != 0) {
            i3 = 0;
        }
        uao.getClass();
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(remoteUserId, "remoteUserId");
        o.LJIIIZ(remoteRoomId, "remoteRoomId");
        o.LJIIIZ(linkRoleType, "linkRoleType");
        o.LJIIIZ(currentRoomId, "currentRoomId");
        Room LIZJ = linker.LIZJ();
        if (LIZJ != null && (streamType = LIZJ.getStreamType()) != null) {
            str5 = C28509BGv.LIZ(streamType);
        } else {
            str5 = "";
        }
        if (str7 == null) {
            str7 = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        if (str6 == null) {
            str6 = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        UAS uas = new UAS(str6, str7, remoteUserId, remoteRoomId, str8, str9, linkRoleType, C31012CFc.LIZIZ(), UC0.LJIILIIL(linker.getScene()), str5, uao.LIZ, new WeakReference(linker), currentRoomId, C31012CFc.LIZIZ(), C31012CFc.LIZIZ(), i3);
        ((ArrayList) uao.LIZIZ).add(uas);
        return uas;
    }
}

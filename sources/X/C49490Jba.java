package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jba, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49490Jba implements R47 {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ EnterRoomConfig LIZJ;
    public final /* synthetic */ ArrayList<Long> LIZLLL;
    public final /* synthetic */ List<RoomInfo> LJ;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            C49489JbZ c49489JbZ = C49489JbZ.LIZ;
            Context LLLLL = C16880lQ.LLLLL(this.LIZ);
            long j = this.LIZIZ;
            EnterRoomConfig enterRoomConfig = this.LIZJ;
            ArrayList<Long> arrayList = this.LIZLLL;
            List<RoomInfo> list = this.LJ;
            c49489JbZ.getClass();
            C49489JbZ.LJ(j, LLLLL, enterRoomConfig, "from_search_live", arrayList, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49490Jba(Context context, long j, EnterRoomConfig enterRoomConfig, ArrayList<Long> arrayList, List<? extends RoomInfo> list) {
        this.LIZ = context;
        this.LIZIZ = j;
        this.LIZJ = enterRoomConfig;
        this.LIZLLL = arrayList;
        this.LJ = list;
    }
}

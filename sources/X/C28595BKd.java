package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* renamed from: X.BKd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28595BKd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public C28595BKd(EnterRoomConfig enterRoomConfig) {
        this.LJ = -1;
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        this.LIZIZ = str;
        String str2 = roomsData.enterMethod;
        this.LIZ = str2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("_");
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        this.LIZJ = roomsData2.fromDrawerStyle;
        if (TextUtils.equals(roomsData2.windowMode, "small_picture")) {
            this.LIZLLL = true;
        } else {
            this.LIZLLL = false;
        }
        this.LJ = enterRoomConfig.mLogData.positionOutsideLiveRoom;
    }
}

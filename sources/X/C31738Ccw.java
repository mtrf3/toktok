package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Ccw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31738Ccw {
    public String LIZ;
    public String LIZIZ;
    public Room LIZJ;
    public final String LIZLLL;

    public final String LIZ() {
        Room room = this.LIZJ;
        if (room != null) {
            return String.valueOf(room.getId());
        }
        return "";
    }

    public C31738Ccw(EnumC30736C4m enumC30736C4m) {
        String str;
        if (enumC30736C4m == EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            str = "before_live";
        } else if (enumC30736C4m == EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) {
            str = "during_live";
        } else {
            str = "";
        }
        this.LIZLLL = str;
    }
}

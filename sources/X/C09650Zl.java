package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.FeedItemTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;

/* renamed from: X.0Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09650Zl {
    public static final e LIZ;
    public static final Gson LIZIZ;
    public static final Gson LIZJ;

    static {
        e eVar = new e();
        eVar.LIZJ = c.LOWER_CASE_WITH_UNDERSCORES;
        eVar.LIZIZ(new RoomTypeAdapter(), Room.class);
        eVar.LIZIZ(new FeedItemTypeAdapter(), FeedItem.class);
        eVar.LIZIZ(new BooleanTypeAdapter(), Boolean.class);
        eVar.LIZIZ(new BooleanTypeAdapter(), Boolean.TYPE);
        LIZ = eVar;
        LIZIZ = eVar.LIZ();
        LIZJ = new Gson();
    }
}

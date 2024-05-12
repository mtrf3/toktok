package X;

import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class P9J extends P9I {
    public static boolean LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        C19U.LIZLLL(arrayList, "YAL-L41", "YAL-AL50", "YAL-TL50", "YAL-L51");
        C19U.LIZLLL(arrayList, "SEA-AL00", "SEA-TL00", "SEA-AL10", "SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    @Override // X.P9I
    public final boolean LJIIJ() {
        if (!CardStruct.IStatusCode.DEFAULT.equals(LJ()) || LJIIJJI()) {
            return true;
        }
        return false;
    }

    @Override // X.P9I
    public final String LJ() {
        if (LJIIJJI()) {
            return "3";
        }
        return super.LJ();
    }

    public P9J(Context context) {
        super(context);
    }
}

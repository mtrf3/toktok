package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Oid, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62667Oid {
    public static final java.util.Map<String, IWrapChannel> LIZ = new LinkedHashMap();

    static {
        List<IWrapChannel> LJIJ = C62814Ol0.LJIJ(GScope.LJLIL, IWrapChannel.class);
        if (LJIJ == null) {
            LJIJ = new ArrayList();
        }
        for (IWrapChannel iWrapChannel : LJIJ) {
            LIZ.put(iWrapChannel.LJJIFFI(), iWrapChannel);
        }
    }

    public static IWrapChannel LIZ(String str) {
        return (IWrapChannel) ((LinkedHashMap) LIZ).get(str);
    }
}

package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89413f7 {
    public static final java.util.Map<String, PureLogicChannel> LIZ = new LinkedHashMap();

    static {
        List<PureLogicChannel> LJIJ = C62814Ol0.LJIJ(GScope.LJLIL, PureLogicChannel.class);
        if (LJIJ == null) {
            LJIJ = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIJ, 10));
        for (PureLogicChannel pureLogicChannel : LJIJ) {
            arrayList.add(LIZ.put(pureLogicChannel.key(), pureLogicChannel));
        }
    }
}

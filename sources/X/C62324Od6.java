package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.ss.android.ugc.aweme.channel.share.model.ShareChannelService;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Od6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62324Od6 {
    public static final java.util.Map<String, IChannelApi> LIZ = new LinkedHashMap();
    public static List<ShareChannelInfo> LIZIZ = new ArrayList();

    public static void LIZJ() {
        List<ShareChannelInfo> list;
        List<ShareChannelInfo> LJI = C62494Ofq.LJ.LJI();
        LIZIZ = LJI;
        if (LJI == null || LJI.isEmpty() || (list = LIZIZ) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (ShareChannelInfo shareChannelInfo : list) {
            arrayList.add(LIZ.put(shareChannelInfo.channelKey, new ShareChannelService(shareChannelInfo)));
        }
    }

    static {
        List<IChannelApi> LJIJ = C62814Ol0.LJIJ(GScope.LJLIL, IChannelApi.class);
        if (LJIJ == null) {
            LJIJ = new ArrayList();
        }
        for (IChannelApi iChannelApi : LJIJ) {
            LIZ.put(iChannelApi.getChannelKey(), iChannelApi);
        }
        LIZJ();
    }

    public static InterfaceC62225ObV LIZIZ(String key, C62297Ocf c62297Ocf) {
        o.LJIIIZ(key, "key");
        List<ShareChannelInfo> list = LIZIZ;
        if (list == null || list.isEmpty()) {
            LIZJ();
        }
        IChannelApi iChannelApi = (IChannelApi) ((LinkedHashMap) LIZ).get(key);
        if (iChannelApi != null) {
            return iChannelApi.getChannel(c62297Ocf);
        }
        return null;
    }

    public static boolean LIZ(String key, C62297Ocf c62297Ocf, C62394OeE c62394OeE) {
        InterfaceC62225ObV channel;
        o.LJIIIZ(key, "key");
        IChannelApi iChannelApi = (IChannelApi) ((LinkedHashMap) LIZ).get(key);
        if (iChannelApi != null && (channel = iChannelApi.getChannel(c62297Ocf)) != null) {
            c62394OeE.LIZIZ(channel);
            return true;
        }
        return false;
    }
}

package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class LVE extends AbstractC65781Prl implements InterfaceC65784Pro<ConcurrentHashMap<Integer, NoticeGroupAttrs>> {
    public static final LVE LJLIL = new LVE();

    public LVE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ConcurrentHashMap<Integer, NoticeGroupAttrs> invoke() {
        ConcurrentHashMap<Integer, NoticeGroupAttrs> concurrentHashMap = new ConcurrentHashMap<>();
        LVG lvg = LVG.Normal;
        concurrentHashMap.put(99, new NoticeGroupAttrs(lvg, EnumC54302LSw.ShowNum, null, false, 4, null));
        EnumC54302LSw enumC54302LSw = EnumC54302LSw.ShowDot;
        concurrentHashMap.put(101, new NoticeGroupAttrs(lvg, enumC54302LSw, null, false, 4, null));
        concurrentHashMap.put(1000, new NoticeGroupAttrs(lvg, enumC54302LSw, null, false, 4, null));
        return concurrentHashMap;
    }
}

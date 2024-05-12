package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class CFQ extends AbstractC65781Prl implements InterfaceC65784Pro<ConcurrentHashMap<String, Object>> {
    public static final CFQ LJLIL = new CFQ();

    public CFQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ConcurrentHashMap<String, Object> invoke() {
        return new ConcurrentHashMap<>(LivePlayerSettingCacheExp.INSTANCE.getMapSize(), 0.9f);
    }
}

package com.ss.android.ugc.feed.platform.panel.live;

import X.C2K0;
import X.InterfaceC55102Lju;
import X.NK8;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LiveGameBottomBannerComponent extends BasePanelComponent implements IGameLiveAbility, InterfaceC55102Lju {
    public Map<String, NK8> LJLIL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 861651795) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        this.LJLIL = new ConcurrentHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Map<String, NK8> map = this.LJLIL;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility
    public final NK8 N50(String tag) {
        o.LJIIIZ(tag, "tag");
        Map<String, NK8> map = this.LJLIL;
        if (map != null) {
            return (NK8) ((ConcurrentHashMap) map).get(tag);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility
    public final void fw(String tag, NK8 nk8) {
        o.LJIIIZ(tag, "tag");
        Map<String, NK8> map = this.LJLIL;
        if (map != null) {
            ((ConcurrentHashMap) map).put(tag, nk8);
        }
    }
}

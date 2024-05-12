package com.bytedance.lobby.kakao;

import X.C51029K0z;
import X.C66606QCc;
import X.C85999Xp5;
import X.OSZ;
import X.QCI;
import android.app.Application;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class KakaoProvider<T> extends BaseProvider<T> {
    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
    }

    public KakaoProvider(QCI qci) {
        super(LobbyCore.getApplication(), qci);
        Application context = LobbyCore.getApplication();
        String appKey = this.LJLJI.LIZJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        C85999Xp5.LIZLLL("Kakao", "init", C51029K0z.LJJIIZI(new OSZ("app_key", appKey)), C66606QCc.LJLIL, new AqS73S1100000_6(context, appKey, 2));
    }
}

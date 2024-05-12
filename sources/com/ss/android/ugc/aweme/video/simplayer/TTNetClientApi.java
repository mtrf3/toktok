package com.ss.android.ugc.aweme.video.simplayer;

import X.E4Q;
import X.E4T;
import X.EJ6;
import X.InterfaceC195767mG;
import X.InterfaceC195797mJ;
import X.InterfaceC27211Am7;
import X.InterfaceC37276Ek4;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface TTNetClientApi {
    @E4Q
    InterfaceC37276Ek4<String> get(@InterfaceC195797mJ String str, @InterfaceC195767mG List<EJ6> list);

    @E4T
    InterfaceC37276Ek4<String> post(@InterfaceC195797mJ String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC27211Am7 JSONObject jSONObject);
}

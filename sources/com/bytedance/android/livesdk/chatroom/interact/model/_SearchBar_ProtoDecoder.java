package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _SearchBar_ProtoDecoder implements InterfaceC31105CIr<SearchBar> {
    public static SearchBar LIZIZ(Q9H q9h) {
        SearchBar searchBar = new SearchBar();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        searchBar.content = Q9J.LIZIZ(q9h);
                    }
                } else {
                    searchBar.bgImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return searchBar;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SearchBar LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

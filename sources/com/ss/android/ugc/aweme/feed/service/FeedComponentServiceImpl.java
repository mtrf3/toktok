package com.ss.android.ugc.aweme.feed.service;

import X.C66851QLn;
import X.C78741UvJ;
import X.C7C4;
import X.C7C5;
import X.C7G1;
import X.EnumC42934Gt8;
import X.InterfaceC72642tA;
import X.S1D;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FeedComponentServiceImpl implements IFeedComponentService {
    public C66851QLn LIZ;

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final C66851QLn LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = new C66851QLn();
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final C78741UvJ LIZIZ(float f) {
        return new C78741UvJ(5, f, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final S1D LIZLLL(Class cls) {
        if (o.LJ(cls, C7G1.class)) {
            return new S1D();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final List<AnchorCommonStruct> LJFF(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC42934Gt8.DONATION_STICKER.getTYPE()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.service.IFeedComponentService
    public final C7C4 LIZ(String str, int i, InterfaceC72642tA interfaceC72642tA, C7C5 c7c5) {
        return new C7C4(str, i, interfaceC72642tA, c7c5);
    }
}

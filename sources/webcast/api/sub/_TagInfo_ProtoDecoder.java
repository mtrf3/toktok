package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TagInfo_ProtoDecoder implements InterfaceC31105CIr<TagInfo> {
    public static TagInfo LIZIZ(Q9H q9h) {
        TagInfo tagInfo = new TagInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            tagInfo.activityName = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        tagInfo.jumpLink = Q9J.LIZIZ(q9h);
                    }
                } else {
                    tagInfo.tagType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return tagInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TagInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

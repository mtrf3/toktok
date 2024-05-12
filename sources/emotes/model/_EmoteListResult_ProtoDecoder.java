package emotes.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _EmoteListResult_ProtoDecoder implements InterfaceC31105CIr<EmoteListResult> {
    public static EmoteListResult LIZIZ(Q9H q9h) {
        EmoteListResult emoteListResult = new EmoteListResult();
        emoteListResult.emoteList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        emoteListResult.exist = Boolean.valueOf(Q9J.LIZ(q9h));
                    }
                } else {
                    emoteListResult.emoteList.add(_EmoteModel_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return emoteListResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EmoteListResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}

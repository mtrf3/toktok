package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import java.util.ArrayList;

/* renamed from: X.KLt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51569KLt implements IHashTagService {
    @Override // com.ss.android.ugc.aweme.port.in.IHashTagService
    public final void saveLocalHashTag(boolean z, String str) {
        C51568KLs LIZJ = C51568KLs.LIZJ();
        LocalHashTag localHashTag = new LocalHashTag(str, Boolean.TRUE);
        ((ArrayList) LIZJ.LJLJJLL).remove(localHashTag);
        ListProtector.add(LIZJ.LJLJJLL, 0, localHashTag);
        if (LIZJ.LJLIL > 0 && ((ArrayList) LIZJ.LJLJJLL).size() > LIZJ.LJLIL) {
            ListProtector.remove(LIZJ.LJLJJLL, ((ArrayList) r1).size() - 1);
        }
        LIZJ.LIZLLL();
    }
}

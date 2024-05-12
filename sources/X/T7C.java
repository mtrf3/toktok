package X;

import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileQuestionsResponse;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class T7C<T> implements InterfaceC64592gB {
    public final /* synthetic */ T7B LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public T7C(T7B t7b, String str, boolean z, boolean z2) {
        this.LJLIL = t7b;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        TiktokV1ForumProfileQuestionsResponse tiktokV1ForumProfileQuestionsResponse = (TiktokV1ForumProfileQuestionsResponse) obj;
        T7B t7b = this.LJLIL;
        List<ForumStruct> list = tiktokV1ForumProfileQuestionsResponse.questions;
        if (list != null) {
            synchronized (t7b.LJIILJJIL) {
                List<ForumStruct> list2 = t7b.LJII;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it = ((ArrayList) list2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((ForumStruct) it.next()).getId());
                }
                HashSet LLIZLLLIL = ORZ.LLIZLLLIL(arrayList);
                for (ForumStruct forumStruct : list) {
                    if (!LLIZLLLIL.contains(forumStruct.getId())) {
                        ((ArrayList) t7b.LJII).add(0, forumStruct);
                    }
                }
            }
        } else {
            t7b.getClass();
        }
        this.LJLIL.LIZIZ(this.LJLILLLLZI, this.LJLJI, false, C61878OQg.INSTANCE);
        T7B t7b2 = this.LJLIL;
        t7b2.LIZLLL.setValue(new C74100T6i<>(C74118T7a.LIZ(tiktokV1ForumProfileQuestionsResponse, t7b2.LJII)));
    }
}

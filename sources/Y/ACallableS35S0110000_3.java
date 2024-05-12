package Y;

import X.C217808gi;
import X.C217938gv;
import X.C217958gx;
import X.C32I;
import X.Y9G;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionStickerSearchViewModel;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class ACallableS35S0110000_3 implements Callable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        if (r1 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS35S0110000_3 r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS35S0110000_3.call$0(Y.ACallableS35S0110000_3):java.lang.Object");
    }

    public static final Object call$1(ACallableS35S0110000_3 aCallableS35S0110000_3) {
        SearchUserSugResponse LIZIZ;
        if (aCallableS35S0110000_3.z1) {
            ((MentionStickerSearchViewModel) aCallableS35S0110000_3.l0).LJLJJL.clear();
            LIZIZ = C217938gv.LIZIZ(((MentionStickerSearchViewModel) aCallableS35S0110000_3.l0).LJLILLLLZI, new LinkedHashSet());
        } else {
            MentionStickerSearchViewModel mentionStickerSearchViewModel = (MentionStickerSearchViewModel) aCallableS35S0110000_3.l0;
            LIZIZ = C217938gv.LIZIZ(mentionStickerSearchViewModel.LJLILLLLZI, mentionStickerSearchViewModel.LJLJJL);
        }
        C217808gi LIZIZ2 = C217958gx.LIZIZ(LIZIZ, ((MentionStickerSearchViewModel) aCallableS35S0110000_3.l0).LJLILLLLZI);
        MentionStickerSearchViewModel mentionStickerSearchViewModel2 = (MentionStickerSearchViewModel) aCallableS35S0110000_3.l0;
        List<Y9G> list = LIZIZ2.LJLILLLLZI;
        Set<String> set = mentionStickerSearchViewModel2.LJLJJL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Y9G> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ);
        }
        set.addAll(arrayList);
        ((MentionStickerSearchViewModel) aCallableS35S0110000_3.l0).LJLIL = LIZIZ2.LJLIL;
        return LIZIZ2;
    }

    public ACallableS35S0110000_3(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}

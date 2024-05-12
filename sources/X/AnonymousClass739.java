package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS169S0100000_3;

/* renamed from: X.739, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass739<V> implements Callable {
    public final /* synthetic */ C73A LJLIL;
    public final /* synthetic */ java.util.Map<String, Integer> LJLILLLLZI;

    public AnonymousClass739(C73A c73a, java.util.Map<String, Integer> map) {
        this.LJLIL = c73a;
        this.LJLILLLLZI = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        C73A c73a = this.LJLIL;
        Iterator<String> it = c73a.LIZJ.iterator();
        while (it.hasNext()) {
            c73a.LIZIZ(it.next());
        }
        Iterator it2 = ((LinkedHashMap) this.LJLIL.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            java.util.Map<String, Integer> map = this.LJLILLLLZI;
            Comment comment = null;
            if (map != null) {
                if (map.containsKey(entry.getKey())) {
                    Object key = entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    CommentItem commentItem = (CommentItem) ((LinkedHashMap) this.LJLIL.LIZLLL).get(key);
                    it2.remove();
                    C73A c73a2 = this.LJLIL;
                    String str = c73a2.LJII;
                    String str2 = c73a2.LJFF;
                    String str3 = c73a2.LJI;
                    Integer num = this.LJLILLLLZI.get(entry.getKey());
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (commentItem != null) {
                        comment = commentItem.getComment();
                    }
                    C1794072i.LIZLLL(str, str2, str3, i, longValue, comment);
                }
            } else {
                Object key2 = entry.getKey();
                long longValue2 = ((Number) entry.getValue()).longValue();
                CommentItem commentItem2 = (CommentItem) ((LinkedHashMap) this.LJLIL.LIZLLL).get(key2);
                it2.remove();
                C73A c73a3 = this.LJLIL;
                String str4 = c73a3.LJII;
                String str5 = c73a3.LJFF;
                String str6 = c73a3.LJI;
                AqS169S0100000_3 aqS169S0100000_3 = c73a3.LJIIIIZZ;
                if (aqS169S0100000_3 != null) {
                    i2 = ((Number) aqS169S0100000_3.invoke(commentItem2)).intValue();
                } else {
                    i2 = 0;
                }
                if (commentItem2 != null) {
                    comment = commentItem2.getComment();
                }
                C1794072i.LIZLLL(str4, str5, str6, i2, longValue2, comment);
            }
        }
        C73A c73a4 = this.LJLIL;
        Iterator it3 = ((LinkedHashMap) c73a4.LIZLLL).keySet().iterator();
        while (it3.hasNext()) {
            if (!c73a4.LIZJ.contains(it3.next())) {
                it3.remove();
            }
        }
        return C76800UCe.LIZ;
    }
}

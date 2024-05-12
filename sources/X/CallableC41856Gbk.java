package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Gbk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC41856Gbk<V> implements Callable {
    public final /* synthetic */ List<DislikeHashTag> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ List<Integer> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public CallableC41856Gbk(int i, Aweme aweme, String str, String str2, String str3, String str4, List list, List list2) {
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = aweme;
        this.LJLJJI = list2;
        this.LJLJJL = str2;
        this.LJLJJLL = i;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long l;
        ArrayList arrayList = new ArrayList();
        Iterator<DislikeHashTag> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("group_id", this.LJLJI.getAid());
        c188727au.LJIIIZ("author_id", this.LJLJI.getAuthorUid());
        c188727au.LJFF(this.LJLJJI, "reason_id");
        Music music = this.LJLJI.getMusic();
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        c188727au.LJFF(l, "music_id");
        c188727au.LJIIIZ("enter_method", this.LJLJJL);
        c188727au.LJFF(arrayList, "hashtag_name");
        c188727au.LIZLLL(this.LJLJJI.size(), "reason_cnt");
        c188727au.LJIIIZ("status", String.valueOf(this.LJLJJLL));
        c188727au.LJIIIZ("error_code", this.LJLJL);
        c188727au.LJIIIZ("dislike_method", this.LJLJLJ);
        FMX.LJIIL("dislike_submit", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}

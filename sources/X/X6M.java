package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X6M {
    public final String LIZ;
    public XKQ LIZIZ;
    public X6G LIZJ;
    public String LIZLLL;
    public Aweme LJ;
    public UrlModel LJFF;
    public final String LJI = XPS.LIZLLL().LIZ();

    public X6M(String str) {
        this.LIZ = str;
    }

    public static Aweme LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        ReuseAudioApi.IReuseAudioApi iReuseAudioApi = ReuseAudioApi.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(aid);
        LIZ.append(']');
        BatchDetailList batchDetailList = iReuseAudioApi.queryBatchAweme(X1D.LIZIZ(LIZ), 3).execute().LIZIZ;
        o.LJIIIIZZ(batchDetailList, "S_API.queryBatchAweme(\"[…tSource).execute().body()");
        List<Aweme> list = batchDetailList.items;
        if (list != null) {
            return (Aweme) ListProtector.get(list, 0);
        }
        return null;
    }
}

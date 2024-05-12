package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.9R5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9R5 implements Serializable, InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final VideoTrendingTopic LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C9R5() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final String getContentType() {
        return this.LJLILLLLZI;
    }

    public final String getCreationId() {
        return this.LJLJI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final VideoTrendingTopic getSelectedTopic() {
        return this.LJLJJI;
    }

    public C9R5(String enterFrom, String str, String str2, VideoTrendingTopic videoTrendingTopic) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = videoTrendingTopic;
    }

    public /* synthetic */ C9R5(String str, String str2, String str3, VideoTrendingTopic videoTrendingTopic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : videoTrendingTopic);
    }
}

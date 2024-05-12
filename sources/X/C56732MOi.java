package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.MOi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56732MOi implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final Integer LJLJJLL;
    public int LJLJL;
    public final NoticeChannelInfo LJLJLJ;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public /* synthetic */ C56732MOi(int i, int i2, int i3, int i4, int i5, Integer num) {
        this(i, i2, i3, i4, i5, num, LiveLayoutPreloadThreadPriority.DEFAULT, null);
    }

    public C56732MOi(int i, int i2, int i3, int i4, int i5, Integer num, int i6, NoticeChannelInfo noticeChannelInfo) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = num;
        this.LJLJL = i6;
        this.LJLJLJ = noticeChannelInfo;
    }
}

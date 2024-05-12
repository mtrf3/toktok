package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.MRw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56824MRw extends F9E implements InterfaceC57784Mm4 {
    public final NoticeChannelInfo LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C56824MRw(NoticeChannelInfo channelInfo) {
        o.LJIIIZ(channelInfo, "channelInfo");
        this.LJLIL = channelInfo;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}

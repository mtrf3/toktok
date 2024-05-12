package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import kotlin.jvm.internal.AqS69S0201000_6;

/* loaded from: classes7.dex */
public final class ENN<T> implements InterfaceC86003Zc {
    public final /* synthetic */ NoticeList LJLIL;
    public final /* synthetic */ int LJLILLLLZI = 8;

    public ENN(NoticeList noticeList) {
        this.LJLIL = noticeList;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Boolean> interfaceC73573Su9) {
        MS5.LJI(new AqS69S0201000_6(this.LJLIL, this.LJLILLLLZI, (C73433Srt) interfaceC73573Su9, 0));
    }
}

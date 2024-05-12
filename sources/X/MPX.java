package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;

/* loaded from: classes10.dex */
public final class MPX<T> implements InterfaceC86003Zc {
    public final /* synthetic */ MPY LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ MPV LJLJI;

    public MPX(MPY mpy, boolean z, MPV mpv) {
        this.LJLIL = mpy;
        this.LJLILLLLZI = z;
        this.LJLJI = mpv;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C56769MPt<List<MusNotice>>> interfaceC73573Su9) {
        MS5.LJ(new MPW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, (C73433Srt) interfaceC73573Su9));
    }
}

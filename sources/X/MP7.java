package X;

import Y.AfS58S0200000_9;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.List;

/* loaded from: classes10.dex */
public final class MP7<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ MP1 LJLILLLLZI;

    public MP7(String str, MP1 mp1) {
        this.LJLIL = str;
        this.LJLILLLLZI = mp1;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C56769MPt<List<MusNotice>>> interfaceC73573Su9) {
        C73428Sro LJJL = NotificationApi.LIZ().fetchGroupNotice(this.LJLIL, this.LJLILLLLZI.LJII()).LJJL(T16.LIZ());
        MP1 mp1 = this.LJLILLLLZI;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJJL.LJJJLIIL(new AfS58S0200000_9(mp1, c73433Srt, 20), new AfS58S0200000_9(mp1, c73433Srt, 21));
    }
}

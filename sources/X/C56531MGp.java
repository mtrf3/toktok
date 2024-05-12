package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.MGp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56531MGp extends C51031K1b<MH1> {
    public final /* synthetic */ C56530MGo LJLJJL;
    public final /* synthetic */ C68322mC<MH1> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        OSZ<Long, String> osz;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) t;
        int i = abstractC51036K1g.mListQueryType;
        List<Aweme> list = null;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                T t2 = abstractC51036K1g.mData;
                if (t2 != 0) {
                    list = ((ChallengeAwemeList) t2).items;
                }
                if (!((AbstractC51036K1g) t).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = false;
                }
                interfaceC223218pR.j0(list, z);
                return;
            }
            InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) k;
            T t3 = abstractC51036K1g.mData;
            if (t3 != 0) {
                list = ((ChallengeAwemeList) t3).items;
            }
            interfaceC223218pR2.jh(list, !((AbstractC51036K1g) t).isNewDataEmpty());
            return;
        }
        if (abstractC51036K1g.isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
            return;
        }
        InterfaceC223218pR interfaceC223218pR3 = (InterfaceC223218pR) this.LJLILLLLZI;
        T t4 = this.LJLIL;
        T t5 = t4.mData;
        if (t5 != 0) {
            list = ((ChallengeAwemeList) t5).items;
        }
        interfaceC223218pR3.J5(list, ((AbstractC51036K1g) t4).isHasMore());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC65784Pro<OSZ<Long, String>> preloadInfoInvoke = this.LJLJJL.getPreloadInfoInvoke();
        if (preloadInfoInvoke == null || (osz = preloadInfoInvoke.invoke()) == null) {
            osz = new OSZ<>(0L, "");
        }
        C56549MHh.LIZ(osz.getSecond(), "Challenge Detail Aweme", osz.getFirst().longValue(), this.LJLJJLL.element.LJLJJLL, elapsedRealtime, C52941Kq9.LIZ(), new C56533MGr());
    }

    public C56531MGp(C56530MGo c56530MGo, C68322mC<MH1> c68322mC) {
        this.LJLJJL = c56530MGo;
        this.LJLJJLL = c68322mC;
    }
}

package X;

import Y.AObserverS76S0200000_13;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UOt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77127UOt extends AbstractC61103NyV {
    public final /* synthetic */ InterfaceC73573Su9<C77150UPq> LIZIZ;
    public final /* synthetic */ ContactUFR LIZJ;

    public C77127UOt(ContactUFR contactUFR, C73433Srt c73433Srt) {
        this.LIZIZ = c73433Srt;
        this.LIZJ = contactUFR;
    }

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        int i = UF0.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ContactUFR contactUFR = this.LIZJ;
                InterfaceC73573Su9<C77150UPq> emitter = this.LIZIZ;
                o.LJIIIIZZ(emitter, "emitter");
                contactUFR.getClass();
                C26227ARb c26227ARb = new C26227ARb(contactUFR.LIZJ());
                UQ4.LJIILIIL(contactUFR.LIZLLL(), "guide", "contact", contactUFR.LJ(), "off", UQ4.LJII(), null, contactUFR.LJLJJL, 64);
                c26227ARb.LIZ(R.string.p4t);
                UC0.LIZJ(c26227ARb, new AqS144S0200000_13(contactUFR, emitter, 58));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZ();
                return;
            }
            NextLiveData<Boolean> nextLiveData = ((UP0) this.LIZJ.LJLLJ.getValue()).LJII;
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LIZJ.LIZJ());
            o.LJI(LJJIFFI);
            nextLiveData.observe(LJJIFFI, new AObserverS76S0200000_13(c61101NyT, this.LIZIZ, 8));
            ((UP0) this.LIZJ.LJLLJ.getValue()).LIZIZ(this.LIZJ.LJLJJLL);
            return;
        }
        this.LIZIZ.onNext(new C77150UPq(true, 0, 0, null, 30));
        this.LIZIZ.onComplete();
        if (c61101NyT == null) {
            return;
        }
        c61101NyT.LIZ();
    }
}

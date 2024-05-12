package X;

import Y.AObserverS68S0300000_9;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MPW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ MPY LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ MPV LJLJI;
    public final /* synthetic */ InterfaceC73573Su9<C56769MPt<List<MusNotice>>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPW(MPY mpy, boolean z, MPV mpv, C73433Srt c73433Srt) {
        super(0);
        this.LJLIL = mpy;
        this.LJLILLLLZI = z;
        this.LJLJI = mpv;
        this.LJLJJI = c73433Srt;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        EnumC94693nd value;
        LiveData<EnumC94693nd> LJIILIIL = this.LJLIL.LIZ().LJIILIIL();
        if (!this.LJLILLLLZI && ((value = LJIILIIL.getValue()) == EnumC94693nd.SUCCESS || value == EnumC94693nd.EMPTY)) {
            MPV mpv = this.LJLJI;
            InterfaceC73573Su9<C56769MPt<List<MusNotice>>> it = this.LJLJJI;
            o.LJIIIIZZ(it, "it");
            mpv.LIZLLL(value, it);
        } else {
            LJIILIIL.observe(this.LJLIL.LIZ().LJLIL, new AObserverS68S0300000_9(this.LJLJI, this.LJLJJI, LJIILIIL, 1));
            this.LJLIL.LIZ().LJIJJ(this.LJLILLLLZI, this.LJLIL.LIZ);
            this.LJLIL.LIZ = false;
        }
        return C76800UCe.LIZ;
    }
}

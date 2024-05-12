package X;

import Y.IDfS293S0100000_29;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91495ZvX extends AbstractC91380Ztg implements InterfaceC91291ZsF {
    public final AbstractC91590Zx4 LJLJI;
    public final InterfaceC65784Pro<List<String>> LJLJJI;
    public final String LJLJJL;
    public boolean LJLJJLL;
    public final EnumC91180ZqS LJLJL;
    public InterfaceC88472Yns<? super List<? extends InterfaceC91296ZsK>, C76800UCe> LJLJLJ;
    public final C91467Zv5 LJLJLLL;
    public final C91391Ztr LJLL;

    public final String LJIIIIZZ() {
        List<String> invoke = this.LJLJJI.invoke();
        if (invoke.size() > 1000) {
            invoke = invoke.subList(0, 1000);
        }
        return ORZ.LLD(invoke, ",", null, null, null, 62);
    }

    @Override // X.AbstractC91380Ztg, X.InterfaceC91297ZsL
    public final void onAttach() {
        C42625Go9.LIZIZ(this);
        this.LJLJI.Mu(this);
    }

    @Override // X.AbstractC91380Ztg, X.InterfaceC91297ZsL
    public final void onDetach() {
        C42625Go9.LIZJ(this);
        this.LJLJI.bK(this);
    }

    @Override // X.InterfaceC91297ZsL
    public final C91467Zv5 LIZ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC91380Ztg
    public final AbstractC91187ZqZ LJ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    @Override // X.AbstractC91380Ztg
    public final boolean LJI(InterfaceC91296ZsK dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        if (this.LJLIL.size() - LJFF(dataSource) <= 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @QD3
    public final void onCollectAwemeEvent(C70502pi event) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL.isEmpty()) {
            return;
        }
        int i = event.LJLILLLLZI;
        if (i == 1 || i == 0) {
            Iterator<InterfaceC91296ZsK> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC91296ZsK next = it.next();
                if (o.LJ(next.LJIIIIZZ().getAweme().getAid(), event.LJLIL)) {
                    next.LJIIJJI(event.LJLILLLLZI);
                }
            }
        }
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        if (this.LJLL.LIZIZ) {
            return;
        }
        if (LJI(playable)) {
            this.LJLL.LIZIZ(ORZ.LLD(this.LJLJI.LJ(null), ",", null, null, C91581Zwv.LJLIL, 30)).LJJJLIIL(new IDfS293S0100000_29(this, 6), new IDfS293S0100000_29(this, 7));
        }
        if (!ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            SVF.LJIILIIL(SVI.DSP_LIBRARY.getNumber(), playable.LIZIZ());
            C91249ZrZ.LJIIIIZZ(playable.getEventData());
        }
    }

    public C91495ZvX(AbstractC91590Zx4 playerController, C91467Zv5 c91467Zv5, InterfaceC65784Pro candidateClipIds, String playingClipId, EnumC91180ZqS loadType) {
        o.LJIIIZ(playerController, "playerController");
        o.LJIIIZ(candidateClipIds, "candidateClipIds");
        o.LJIIIZ(playingClipId, "playingClipId");
        o.LJIIIZ(loadType, "loadType");
        this.LJLJI = playerController;
        this.LJLJJI = candidateClipIds;
        this.LJLJJL = playingClipId;
        this.LJLJJLL = false;
        this.LJLJL = loadType;
        this.LJLJLLL = c91467Zv5;
        this.LJLL = new C91391Ztr(this);
    }
}

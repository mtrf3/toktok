package X;

import android.text.format.DateUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ukm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78088Ukm implements T43 {
    public final C0M5<Boolean> LJLIL;
    public long LJLILLLLZI;
    public final TEZ LJLJI;
    public final InterfaceC78118UlG LJLJJI;
    public final int LJLJJL;
    public final InterfaceC65784Pro<Boolean> LJLJJLL;

    public final long LIZ() {
        if (this.LJLILLLLZI == -1) {
            this.LJLILLLLZI = this.LJLJJI.getAutoApplyStickerTime(0L);
        }
        return this.LJLILLLLZI;
    }

    public C78088Ukm(TEZ stickerDataManager, InterfaceC78118UlG stickerPreferences, AqS157S0100000_7 aqS157S0100000_7) {
        int LJJIJ = C78866UxK.LJJIJ(stickerDataManager);
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerPreferences, "stickerPreferences");
        this.LJLJI = stickerDataManager;
        this.LJLJJI = stickerPreferences;
        this.LJLJJL = LJJIJ;
        this.LJLJJLL = aqS157S0100000_7;
        this.LJLIL = new C0M5<>();
        this.LJLILLLLZI = -1L;
    }

    @Override // X.T43
    public final boolean LJJIJIIJIL(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        if (this.LJLJI.LLJJIJIIJIL() != null) {
            return false;
        }
        Boolean LJ = this.LJLIL.LJ(LIZ(), null);
        if (LJ == null) {
            LJ = Boolean.valueOf(DateUtils.isToday(LIZ()));
            this.LJLIL.LJI(LIZ(), Boolean.valueOf(LJ.booleanValue()));
        }
        if (LJ.booleanValue() || i != this.LJLJJL || !this.LJLJJLL.invoke().booleanValue()) {
            return false;
        }
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJJI.setAutoApplyStickerTime(LIZ());
        return true;
    }
}

package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.DualStreamViewModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JjP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49975JjP implements InterfaceC49992Jjg {
    public final InterfaceC49985JjZ LIZ;
    public final InterfaceC65784Pro<DualStreamViewModel> LIZIZ;
    public final InterfaceC65784Pro<GlobalDoodleConfig> LIZJ;
    public final InterfaceC65784Pro<C50287JoR> LIZLLL;

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        if (C49993Jjh.LIZ() && C49714JfC.LIZJ(this.LIZIZ.invoke(), this.LIZJ.invoke(), this.LIZLLL.invoke())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        return this.LIZ.LJJJJIZL();
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }

    public C49975JjP(JVP jvp, AqS158S0100000_8 aqS158S0100000_8, AqS158S0100000_8 aqS158S0100000_82, AqS158S0100000_8 aqS158S0100000_83) {
        this.LIZ = jvp;
        this.LIZIZ = aqS158S0100000_8;
        this.LIZJ = aqS158S0100000_82;
        this.LIZLLL = aqS158S0100000_83;
    }
}

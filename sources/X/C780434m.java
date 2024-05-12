package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.empty.CastingPlayerEmpty;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingCellComponent;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.34m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C780434m extends AbstractC65781Prl implements InterfaceC65784Pro<ICastingPlayerService> {
    public static final C780434m LJLIL = new C780434m();

    public C780434m() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICastingPlayerService invoke() {
        if (C4HD.LIZ()) {
            return new ICastingPlayerService() { // from class: X.34R
                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> getCastingCellComponent() {
                    return C65352Pkq.LIZ(CastingCellComponent.class);
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final InterfaceC65350Pko<? extends C8W0> getCastingPanelComponent() {
                    return C65352Pkq.LIZ(CastingPanelComponent.class);
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final void addSeekListener(C34N listener) {
                    o.LJIIIZ(listener, "listener");
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe == null) {
                        XKX.LIZLLL(C780334l.LJLIL, null, null, new C34Q(listener, null), 3);
                        return;
                    }
                    C34L c34l = c71082qe.LIZJ;
                    if (c34l == null) {
                        return;
                    }
                    c34l.LJIIIZ.add(new WeakReference<>(listener));
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final void appendPlaylist(List<? extends Aweme> list) {
                    C34L c34l;
                    o.LJIIIZ(list, "list");
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe != null && (c34l = c71082qe.LIZJ) != null) {
                        c34l.LIZIZ(list);
                    }
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final boolean blockByCasting(Aweme aweme) {
                    C779434c c779434c;
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && c779434c.LJIIIZ() && C78688UuS.LJJJJJ(aweme)) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final ICastingAbility getCastingAbility(InterfaceC55235Lm3 interfaceC55235Lm3) {
                    if (interfaceC55235Lm3 == null) {
                        return null;
                    }
                    return (ICastingAbility) C55096Ljo.LIZ(interfaceC55235Lm3, ICastingAbility.class, null);
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final boolean isCurrentAwemeCasting(String aid) {
                    C779434c c779434c;
                    String str;
                    C34L c34l;
                    o.LJIIIZ(aid, "aid");
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && c779434c.LJIIIZ()) {
                        C71082qe c71082qe2 = C71042qa.LIZIZ;
                        if (c71082qe2 != null && (c34l = c71082qe2.LIZJ) != null) {
                            str = c34l.LIZ;
                        } else {
                            str = null;
                        }
                        if (o.LJ(str, aid)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final void playAweme(String aid) {
                    C71082qe c71082qe;
                    C71052qb c71052qb;
                    o.LJIIIZ(aid, "aid");
                    C71082qe c71082qe2 = C71042qa.LIZIZ;
                    if (c71082qe2 != null && c71082qe2.LIZJ != null && C34L.LIZLLL() && (c71082qe = C71042qa.LIZIZ) != null && (c71052qb = c71082qe.LIZ) != null) {
                        c71052qb.LJIIJ(aid);
                    }
                }

                @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
                public final void seekPosition(long j) {
                    C34L c34l;
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe != null && (c34l = c71082qe.LIZJ) != null) {
                        c34l.LJII(j);
                    }
                }
            };
        }
        return new CastingPlayerEmpty();
    }
}

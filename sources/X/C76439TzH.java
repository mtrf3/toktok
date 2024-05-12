package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TzH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76439TzH extends F9E implements C33Q {
    public final BattleItem4FEModel LJLIL;
    public final BattleItem4FEModel LJLILLLLZI;
    public final BattleItem4FEModel LJLJI;
    public final BattleItem4FEModel LJLJJI;
    public final AbstractC76441TzJ LJLJJL;

    public C76439TzH() {
        this(0);
    }

    public static C76439TzH L(BattleItem4FEModel selfCriticalStrikeCards, BattleItem4FEModel selfSmokeCards, BattleItem4FEModel rivalCriticalStrikeCards, BattleItem4FEModel rivalSmokeCards, AbstractC76441TzJ itemAction) {
        o.LJIIIZ(selfCriticalStrikeCards, "selfCriticalStrikeCards");
        o.LJIIIZ(selfSmokeCards, "selfSmokeCards");
        o.LJIIIZ(rivalCriticalStrikeCards, "rivalCriticalStrikeCards");
        o.LJIIIZ(rivalSmokeCards, "rivalSmokeCards");
        o.LJIIIZ(itemAction, "itemAction");
        return new C76439TzH(selfCriticalStrikeCards, selfSmokeCards, rivalCriticalStrikeCards, rivalSmokeCards, itemAction);
    }

    public static /* synthetic */ C76439TzH M(C76439TzH c76439TzH, BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, BattleItem4FEModel battleItem4FEModel3, BattleItem4FEModel battleItem4FEModel4, AbstractC76441TzJ abstractC76441TzJ, int i) {
        if ((i & 1) != 0) {
            battleItem4FEModel = c76439TzH.LJLIL;
        }
        if ((i & 2) != 0) {
            battleItem4FEModel2 = c76439TzH.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            battleItem4FEModel3 = c76439TzH.LJLJI;
        }
        if ((i & 8) != 0) {
            battleItem4FEModel4 = c76439TzH.LJLJJI;
        }
        if ((i & 16) != 0) {
            abstractC76441TzJ = c76439TzH.LJLJJL;
        }
        c76439TzH.getClass();
        return L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel3, battleItem4FEModel4, abstractC76441TzJ);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public /* synthetic */ C76439TzH(int i) {
        this(new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), C76451TzT.LIZ);
    }

    public C76439TzH(BattleItem4FEModel selfCriticalStrikeCards, BattleItem4FEModel selfSmokeCards, BattleItem4FEModel rivalCriticalStrikeCards, BattleItem4FEModel rivalSmokeCards, AbstractC76441TzJ itemAction) {
        o.LJIIIZ(selfCriticalStrikeCards, "selfCriticalStrikeCards");
        o.LJIIIZ(selfSmokeCards, "selfSmokeCards");
        o.LJIIIZ(rivalCriticalStrikeCards, "rivalCriticalStrikeCards");
        o.LJIIIZ(rivalSmokeCards, "rivalSmokeCards");
        o.LJIIIZ(itemAction, "itemAction");
        this.LJLIL = selfCriticalStrikeCards;
        this.LJLILLLLZI = selfSmokeCards;
        this.LJLJI = rivalCriticalStrikeCards;
        this.LJLJJI = rivalSmokeCards;
        this.LJLJJL = itemAction;
    }
}

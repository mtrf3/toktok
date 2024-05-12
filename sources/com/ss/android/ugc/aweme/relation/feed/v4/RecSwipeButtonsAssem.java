package com.ss.android.ugc.aweme.relation.feed.v4;

import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C53946LFe;
import X.C57664Mk8;
import X.C57665Mk9;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BD;
import X.SY4;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecSwipeButtonsAssem extends ReusedUIContentAssem<RecSwipeButtonsAssem> {
    public final C214298b3 LJZL;
    public boolean LL;
    public SY4 LLD;
    public RelationButton LLF;
    public RelationButton LLFF;

    public RecSwipeButtonsAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecSwipeViewModel.class);
        this.LJZL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 522), C57665Mk9.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        SY4 sy4 = this.LLD;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, null);
            RelationButton relationButton = this.LLF;
            if (relationButton != null) {
                relationButton.LIZIZ();
                RelationButton relationButton2 = this.LLFF;
                if (relationButton2 != null) {
                    relationButton2.LIZIZ();
                    return;
                } else {
                    o.LJIJI("unfollowButton");
                    throw null;
                }
            }
            o.LJIJI("followButton");
            throw null;
        }
        o.LJIJI("notInterestedButton");
        throw null;
    }

    public final RecSwipeViewModel Z3() {
        return (RecSwipeViewModel) this.LJZL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SY4 it = (SY4) view.findViewById(R.id.akk);
        o.LJIIIIZZ(it, "it");
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.MkC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C57629MjZ) obj).LJLJJL);
            }
        }, null, C57664Mk8.LJLIL, 6);
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.MkA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57629MjZ) obj).LJLJI;
            }
        }, null, new AqS191S0100000_9(it, 108), 6);
        C16880lQ.LJJIZ(it, new ACListenerS29S0100000_9(this, 175));
        this.LLD = it;
        RelationButton it2 = (RelationButton) view.findViewById(R.id.akj);
        o.LJIIIIZZ(it2, "it");
        it2.setTracker(new AqS159S0100000_9(this, 1005));
        it2.setFollowClickListener(new AqS191S0100000_9(this, 106));
        it2.setDataChangeListener(new AqS140S0200000_9(this, it2, 93));
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.Mk5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57629MjZ) obj).LJLJI;
            }
        }, null, new AqS191S0100000_9(it2, 107), 6);
        this.LLF = it2;
        RelationButton it3 = (RelationButton) view.findViewById(R.id.akl);
        o.LJIIIIZZ(it3, "it");
        it3.setTracker(new AqS159S0100000_9(this, 1008));
        it3.setFollowClickListener(new AqS172S0200000_9(this, it3, 22));
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.MkB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57629MjZ) obj).LJLJI;
            }
        }, null, new AqS191S0100000_9(it3, 109), 6);
        this.LLFF = it3;
        if (C53946LFe.LIZJ(C212428Vi.LIZ(this), null).LIZIZ <= C7MY.LIZIZ(320)) {
            SY4 sy4 = this.LLD;
            if (sy4 != null) {
                sy4.setButtonSize(2);
                RelationButton relationButton = this.LLF;
                if (relationButton != null) {
                    relationButton.setButtonSize(2);
                    RelationButton relationButton2 = this.LLFF;
                    if (relationButton2 != null) {
                        relationButton2.setButtonSize(2);
                        return;
                    } else {
                        o.LJIJI("unfollowButton");
                        throw null;
                    }
                }
                o.LJIJI("followButton");
                throw null;
            }
            o.LJIJI("notInterestedButton");
            throw null;
        }
    }
}

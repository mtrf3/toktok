package com.ss.android.ugc.aweme.relation.feed.v4;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C57092Lx;
import X.C57601Mj7;
import X.C57613MjJ;
import X.C57614MjK;
import X.C57615MjL;
import X.C57639Mjj;
import X.C57652Mjw;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C8VR;
import X.C8YN;
import X.C9BD;
import X.C9XU;
import X.TBT;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecSwipeUserCardRootAssem extends ReusedUIContentAssem<RecSwipeUserCardRootAssem> {
    public final C214298b3 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C57601Mj7 LLF;
    public final Map<Integer, View> LLFF = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public RecSwipeUserCardRootAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecSwipeViewModel.class);
        this.LJZL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 525), C57652Mjw.INSTANCE, null);
        this.LL = C221108m2.LIZIZ(C57614MjK.LJLIL);
        this.LLD = C221108m2.LIZIZ(C57613MjJ.LJLIL);
        this.LLF = new C57601Mj7(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C9XU.LIZLLL(this.LLF);
    }

    public final RecSwipeViewModel Z3() {
        return (RecSwipeViewModel) this.LJZL.getValue();
    }

    public final void a4(String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (!o.LJ(Z3().LJLJJLL, eventType)) {
            Z3().LJLJL = true;
        }
        RecSwipeViewModel Z3 = Z3();
        Z3.getClass();
        Z3.LJLJJLL = eventType;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int LIZIZ;
        o.LJIIIZ(view, "view");
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this.LLF);
        }
        C8VR.LIZ(this, new AqS140S0200000_9(this, view, 24));
        if (!C57092Lx.LIZ.LJFF) {
            LIZIZ = C7MY.LIZIZ(2);
        } else {
            LIZIZ = C7MY.LIZIZ(12);
        }
        _$_findCachedViewById(R.id.j76).setPadding(0, 0, 0, LIZIZ);
        getContainerView().post(new ARunnableS45S0100000_9(this, 226));
        C8YN.LJII(this, Z3(), new TBT() { // from class: X.Mjy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C57629MjZ) obj).LJLJI;
            }
        }, null, C57615MjL.LJLIL, 6);
        ((LongPressLayout) _$_findCachedViewById(R.id.akx)).setListener(new C57639Mjj(this, view));
    }
}

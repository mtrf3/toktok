package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C213688a4;
import X.C28871Bj;
import X.C2K0;
import X.C55096Ljo;
import X.C8YN;
import X.InterfaceC55102Lju;
import X.MT7;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.notification.creator.vscope.ICreatorFindBaseAdapterAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeResultAllAssem extends CreatorNoticeResultAssem implements ICreatorFindBaseAdapterAbility, InterfaceC55102Lju {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeResultAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 786952119) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.vscope.ICreatorFindBaseAdapterAbility
    public final C28871Bj sd0() {
        return (C28871Bj) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeResultAssem
    public final void C3() {
        x3().qv0(MT7.REFRESH_ALL);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeResultAssem
    public final void v3() {
        x3().qv0(MT7.CHANGE_TAB_ALL);
    }

    @Override // com.ss.android.ugc.aweme.notification.creator.assem.CreatorNoticeResultAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        x3().LJLLL = true;
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 32), 4);
    }
}

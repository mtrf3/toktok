package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TRw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74660TRw extends TRY {
    public final List<Long> LJLIL = new ArrayList();
    public final /* synthetic */ C74843TYx LJLILLLLZI;

    public C74660TRw(C74843TYx c74843TYx) {
        this.LJLILLLLZI = c74843TYx;
    }

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
        TZC tzc = (TZC) this.LJLILLLLZI.mView;
        if (tzc != null) {
            tzc.AP();
        }
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        InterfaceC75441TjB R6;
        InterfaceC74695TTf LLIIJLIL;
        HashMap<String, String> hashMap;
        o.LJIIIZ(provider, "provider");
        MultiLiveGuestInfoList source = provider.getSource();
        if (source != null && (hashMap = source.userTagMap) != null) {
            C74896TaO.LJIIIIZZ(hashMap);
        }
        TZC tzc = (TZC) this.LJLILLLLZI.mView;
        if (tzc != null) {
            tzc.onPlayerListChange(provider.LIZIZ());
        }
        Iterator<LinkPlayerInfo> it = provider.LIZ().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!((ArrayList) this.LJLIL).contains(Long.valueOf(it.next().mUser.getId()))) {
                z = true;
            }
        }
        if (z && (R6 = C8E.LJ().R6()) != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            LLIIJLIL.LJJIIZ("user-list-chage");
        }
        ((ArrayList) this.LJLIL).clear();
        List<Long> list = this.LJLIL;
        List<LinkPlayerInfo> LIZ = provider.LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
        Iterator<LinkPlayerInfo> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().mUser.getId()));
        }
        ((ArrayList) list).addAll(arrayList);
    }
}

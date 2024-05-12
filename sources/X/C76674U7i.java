package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.U7i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76674U7i<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C76684U7s LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ U7T LJLJJI;
    public final /* synthetic */ Long LJLJJL;
    public final /* synthetic */ InterfaceC76768UAy<LeaveGroupResult> LJLJJLL;

    public C76674U7i(C76684U7s c76684U7s, Long l, long j, U7T u7t, Long l2, InterfaceC76768UAy interfaceC76768UAy) {
        this.LJLIL = c76684U7s;
        this.LJLILLLLZI = l;
        this.LJLJI = j;
        this.LJLJJI = u7t;
        this.LJLJJL = l2;
        this.LJLJJLL = interfaceC76768UAy;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        R2P leaveJoinGroupResp = (R2P) obj;
        o.LJIIIZ(leaveJoinGroupResp, "leaveJoinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("leave group", " success data=");
        LIZJ.append(this.LJLIL);
        LIZJ.append(" currentLeaveChannelId=");
        LIZJ.append(this.LJLILLLLZI);
        LIZJ.append(" stayGroupChannelId=");
        LIZJ.append(this.LJLJI);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        U7T u7t = this.LJLJJI;
        C76677U7l c76677U7l = u7t.LJJLIIIJ;
        if (c76677U7l != null) {
            c76677U7l.LIZJ(U7T.LJJJI(u7t.LJIIJJI.LJ.get(this.LJLJJL)));
        }
        if (this.LJLIL.LIZIZ == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && this.LJLJI == 0) {
            String str = "kick_out_if_no_first_frame_came";
            if (!o.LJ(this.LJLIL.LJ, "kick_out_if_no_first_frame_came")) {
                str = "leave_normally";
            }
            U7T u7t2 = this.LJLJJI;
            String str2 = this.LJLIL.LJ;
            List<Long> LJ = u7t2.LJIIJJI.LJ();
            Long l = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                long longValue = ((Number) next).longValue();
                if (l == null || longValue != l.longValue()) {
                    arrayList.add(next);
                }
            }
            u7t2.LJJIIZ(str2, str, true, null, arrayList);
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(leaveJoinGroupResp, this.LJLJJLL, 87)));
    }
}

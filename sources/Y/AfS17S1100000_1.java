package Y;

import X.AbstractC84083Rs;
import X.C26045AKb;
import X.C38306F1q;
import X.C45804HyK;
import X.C61328O5c;
import X.H7B;
import X.InterfaceC64592gB;
import X.InterfaceC84103Ru;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.statemanager.ChatRoomLiveStateManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS17S1100000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS17S1100000_1 afS17S1100000_1, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS17S1100000_1.l1;
        String url = ((ShortenUrlModel) obj).getUrl();
        if (url == null) {
            url = afS17S1100000_1.s0;
        }
        interfaceC88472Yns.invoke(url);
    }

    public static final void accept$1(AfS17S1100000_1 afS17S1100000_1, Object obj) {
        List it = (List) obj;
        InterfaceC84103Ru interfaceC84103Ru = ((AbstractC84083Rs) afS17S1100000_1.l1).LJLLILLLL;
        if (interfaceC84103Ru != null) {
            o.LJIIIIZZ(it, "it");
            interfaceC84103Ru.zs0(afS17S1100000_1.s0, it);
        }
    }

    public static final void accept$2(AfS17S1100000_1 afS17S1100000_1, Object obj) {
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LIZLLL().put(afS17S1100000_1.s0, obj);
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LIZJ().put(afS17S1100000_1.s0, Boolean.FALSE);
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJI(afS17S1100000_1.s0);
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJ();
    }

    public static final void accept$3(AfS17S1100000_1 afS17S1100000_1, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C38306F1q) {
            ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LIZLLL().put(afS17S1100000_1.s0, null);
            int errorCode = ((C38306F1q) th).getErrorCode();
            if (errorCode != 4003110) {
                if (errorCode != 4003157) {
                    if (errorCode == 4003160) {
                        ((HashMap) ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJLLI.getValue()).put(afS17S1100000_1.s0, Boolean.TRUE);
                    }
                } else {
                    ((HashMap) ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJLL.getValue()).put(afS17S1100000_1.s0, Boolean.TRUE);
                }
            } else {
                ((HashMap) ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJLJLLL.getValue()).put(afS17S1100000_1.s0, Boolean.TRUE);
            }
        }
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LIZJ().put(afS17S1100000_1.s0, Boolean.FALSE);
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJI(afS17S1100000_1.s0);
        ((ChatRoomLiveStateManager) afS17S1100000_1.l1).LJ();
    }

    public static final void accept$4(AfS17S1100000_1 afS17S1100000_1, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("templateId ");
        H7B.LIZLLL(new Throwable(C61328O5c.LIZLLL(LIZ, afS17S1100000_1.s0, " remove anchor fail response ", (Throwable) obj, LIZ)));
        Activity LJIJJ = C45804HyK.LJIJJ((Context) afS17S1100000_1.l1);
        if (LJIJJ != null) {
            Context context = (Context) afS17S1100000_1.l1;
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIZ(context.getString(R.string.h5q));
            c26045AKb.LJIIJ();
        }
    }

    public AfS17S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

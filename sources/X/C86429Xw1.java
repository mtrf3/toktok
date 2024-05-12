package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import java.util.List;

/* renamed from: X.Xw1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86429Xw1 implements InterfaceC223888qW {
    public final /* synthetic */ C86428Xw0 LIZ;

    public C86429Xw1(C86428Xw0 c86428Xw0) {
        this.LIZ = c86428Xw0;
    }

    @Override // X.InterfaceC223888qW
    public final void LIZ(Long l) {
        PollStruct pollStruct;
        User user;
        String str;
        C86428Xw0 c86428Xw0 = this.LIZ;
        c86428Xw0.getClass();
        if (l != null) {
            l.longValue();
            InteractStickerStruct interactStickerStruct = c86428Xw0.LJLJLLL;
            if (interactStickerStruct != null) {
                List<NormalTrackTimeStamp> LIZJ = C223998qh.LIZJ(l.longValue(), interactStickerStruct);
                if (LIZJ == null || LIZJ.isEmpty()) {
                    C86431Xw3 c86431Xw3 = c86428Xw0.LJLLJ;
                    if (c86431Xw3 == null) {
                        return;
                    }
                    c86431Xw3.setVisibility(8);
                    return;
                }
                C86431Xw3 c86431Xw32 = c86428Xw0.LJLLJ;
                if (c86431Xw32 != null && c86431Xw32.getVisibility() == 0) {
                    return;
                }
                C86431Xw3 c86431Xw33 = c86428Xw0.LJLLJ;
                InterfaceC86436Xw8 interfaceC86436Xw8 = null;
                if (c86431Xw33 != null) {
                    InteractStickerStruct interactStickerStruct2 = c86428Xw0.LJLJLLL;
                    if (interactStickerStruct2 != null) {
                        pollStruct = interactStickerStruct2.getPollStruct();
                    } else {
                        pollStruct = null;
                    }
                    C245649kW c245649kW = c86428Xw0.LJLJJI;
                    if (c245649kW != null) {
                        user = c245649kW.LIZJ;
                    } else {
                        user = null;
                    }
                    boolean LJIJ = AV1.LJIJ(user);
                    C245649kW c245649kW2 = c86428Xw0.LJLJJI;
                    if (c245649kW2 == null || (str = c245649kW2.LIZLLL) == null) {
                        str = "";
                    }
                    if (c245649kW2 != null) {
                        interfaceC86436Xw8 = c245649kW2.LJIILL;
                    }
                    c86431Xw33.LJI(pollStruct, LJIJ, str, interfaceC86436Xw8, c86428Xw0.LJLJLLL);
                }
                C86431Xw3 c86431Xw34 = c86428Xw0.LJLLJ;
                if (c86431Xw34 != null && c86431Xw34.getPollView() != null) {
                    C223578q1 c223578q1 = c86428Xw0.LJLLL;
                    C86431Xw3 c86431Xw35 = c86428Xw0.LJLLJ;
                    if (c86431Xw35 != null) {
                        c223578q1.LJIIIIZZ(c86431Xw35.getPollView());
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C86431Xw3 c86431Xw36 = c86428Xw0.LJLLJ;
                if (c86431Xw36 == null) {
                    return;
                }
                c86431Xw36.setVisibility(0);
            }
        }
    }
}

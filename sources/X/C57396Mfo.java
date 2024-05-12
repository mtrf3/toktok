package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoResponse;

/* renamed from: X.Mfo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C57396Mfo implements InterfaceC48038ItG {
    public static AnonymousClass064 LIZ(ConstraintLayout constraintLayout) {
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(constraintLayout);
        return anonymousClass064;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((LiveRoomInfoResponse) obj).getRoomStruct();
    }

    public static String LIZIZ(InterfaceC65350Pko interfaceC65350Pko, StringBuilder sb, StringBuilder sb2) {
        sb.append(C39557Ffl.LIZ(interfaceC65350Pko).getName());
        return X1D.LIZIZ(sb2);
    }
}

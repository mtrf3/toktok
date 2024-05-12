package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZF implements InterfaceC75476Tjk {
    public final /* synthetic */ List<ListByTypeResponse.ReservedUser> LIZ;
    public final /* synthetic */ C74842TYw LIZIZ;

    @Override // X.InterfaceC75476Tjk
    public final String LIZJ() {
        String LJIILL = C15380j0.LJIILL(R.string.kl9, C05170If.LIZ(((ListByTypeResponse.ReservedUser) ListProtector.get(this.LIZ, 0)).user));
        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_co…eservationUsers[0].user))");
        return LJIILL;
    }

    @Override // X.InterfaceC75476Tjk
    public final void LIZ() {
        TZQ tzq = new TZQ(((ListByTypeResponse.ReservedUser) ListProtector.get(this.LIZ, 0)).user, "appointment_guide", 4, "");
        tzq.LJ = -1;
        DataChannel dataChannel = this.LIZIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomAnchorInviteGuestEvent.class, tzq);
        }
        Object[] objArr = {C05170If.LIZ(((ListByTypeResponse.ReservedUser) ListProtector.get(this.LIZ, 0)).user)};
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL != null || (LIZLLL = C15380j0.LIZLLL()) != null) {
            C30868C9o.LJFF(LIZLLL, LIZLLL.getString(R.string.kla, objArr));
        }
        C74856TZk.LIZJ = 1;
        C74856TZk.LIZIZ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
    }

    @Override // X.InterfaceC75476Tjk
    public final List<ImageModel> LIZIZ() {
        ImageModel imageModel;
        User user = ((ListByTypeResponse.ReservedUser) ListProtector.get(this.LIZ, 0)).user;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        return C47261Igj.LJJIJ(imageModel);
    }

    public TZF(List<ListByTypeResponse.ReservedUser> list, C74842TYw c74842TYw) {
        this.LIZ = list;
        this.LIZIZ = c74842TYw;
    }
}

package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29821Bn7 extends CQO<GuideMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d65;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final ImageModel LJJLJ() {
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            return owner.getAvatarThumb();
        }
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        String LIZ;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90();
        if (this.LJIJJLI == 0) {
            LIZ = "";
        } else {
            Context LIZLLL = C15380j0.LIZLLL();
            if (Build.VERSION.SDK_INT >= 24) {
                LIZ = C15380j0.LJIILJJIL(R.string.mh2);
                o.LJIIIIZZ(LIZ, "{\n            ResUtil.ge…_capsule_guide)\n        }");
            } else {
                LIZ = C29822Bn8.LIZ(LIZLLL, R.string.mh2, "{\n            context.re…_capsule_guide)\n        }");
            }
        }
        return CPR.LIZIZ(R.color.a8j, LIZ);
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getOwner();
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29821Bn7(GuideMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}

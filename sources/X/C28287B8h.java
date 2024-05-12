package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.B8h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28287B8h extends FrameLayout implements InterfaceC76931UHf {
    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return false;
    }

    public static void LIZ(String str) {
        String str2;
        long j;
        long j2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (o.LJ(str, "click")) {
            str2 = "new_gifter_message_click";
        } else {
            str2 = "new_gifter_message_show";
        }
        BZI LIZ = C28787BRn.LIZ(str2);
        long j3 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(String.valueOf(j), "room_id");
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        LIZ.LJIJJ(String.valueOf(j2), "anchor_id");
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j3 = ((C29374Bfu) LIZIZ).getCurrentUserId();
        }
        LIZ.LJIJJ(String.valueOf(j3), "user_id");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28287B8h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.doq, this);
    }
}

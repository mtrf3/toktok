package X;

import android.net.Uri;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Be5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29261Be5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        long j;
        String str2;
        if (str != null) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            String str3 = "";
            if (room == null) {
                str2 = String.valueOf(j);
            } else if (room.getOwner() == null) {
                str2 = "";
            } else {
                str2 = room.getOwner().getSecUid();
            }
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            if (j != 0) {
                str3 = String.valueOf(j);
            }
            buildUpon.appendQueryParameter("anchor_id", str3);
            buildUpon.appendQueryParameter("sec_anchor_id", str2);
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "uri.toString()");
            C36991EfT c36991EfT = C36991EfT.LJ;
            if (c36991EfT != null) {
                c36991EfT.LIZJ(builder);
            }
        }
    }
}

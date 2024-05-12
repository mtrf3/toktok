package X;

import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.StarCommentPurchasePageEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BNd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28673BNd extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_star_comment_purchase_page");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        String str;
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null || (str = UriProtector.getQueryParameter(uri, "enter_from")) == null) {
            str = "";
        }
        DataChannelGlobal.LJLJJI.sv0(StarCommentPurchasePageEvent.class, str);
        return true;
    }
}

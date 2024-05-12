package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Zsy, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91336Zsy implements InterfaceC47884Iqm {
    public final /* synthetic */ String LIZ;

    public C91336Zsy(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC47884Iqm
    public final String LIZ(int i, java.util.Map map) {
        Uri.Builder buildUpon = UriProtector.parse(this.LIZ).buildUpon();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}

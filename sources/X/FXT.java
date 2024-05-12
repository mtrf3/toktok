package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class FXT implements FZX {
    @Override // X.FZX
    public final List<String> LIZ() {
        return Collections.singletonList("com.transsion.hilauncher");
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(UriProtector.parse("content://com.transsion.hilauncher.unreadprovider"), "change_badge", (String) null, bundle);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw new FXW(e.getMessage(), e);
        }
    }
}

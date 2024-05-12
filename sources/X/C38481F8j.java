package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;

/* renamed from: X.F8j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38481F8j extends ContextWrapper {
    public C38481F8j(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(this, str);
    }
}

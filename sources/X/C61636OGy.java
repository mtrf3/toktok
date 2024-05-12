package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OGy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61636OGy extends FrameLayout {
    public final Fragment LJLIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;

    public final Fragment getFragment() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61636OGy(Context context, ECBaseFragment fragment) {
        super(context, null, 0);
        o.LJIIIZ(fragment, "fragment");
        new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLJJL = "";
    }
}

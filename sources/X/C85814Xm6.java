package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xm6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C85814Xm6 {
    public final ViewStub LJLIL;
    public final InterfaceC85818XmA LJLILLLLZI;
    public final WeakReference<C29S> LJLJI;
    public JSONObject LJLJJI;
    public String LJLJJL;

    public View LIZJ() {
        throw null;
    }

    public final C29S LIZ() {
        return this.LJLJI.get();
    }

    public final String LIZIZ(Integer num, String str) {
        String str2;
        C29S c29s = this.LJLJI.get();
        if (c29s == null || (str2 = c29s.getString(R.string.g5w)) == null) {
            str2 = "Sorry, error occurred";
        }
        if (str == null) {
            return str2;
        }
        if (num != null) {
            num.intValue();
            if (num.intValue() == 1066) {
                return str2;
            }
            return str;
        }
        return str2;
    }

    public C85814Xm6(C29S activity, ViewStub viewStub, InterfaceC85818XmA interfaceC85818XmA) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = interfaceC85818XmA;
        this.LJLJI = new WeakReference<>(activity);
        this.LJLJJL = "";
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0B extends F9E implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final List<String> LJLJI;
    public final int LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ E0B copy$default(E0B e0b, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = e0b.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str2 = e0b.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            list = e0b.LJLJI;
        }
        if ((i2 & 8) != 0) {
            i = e0b.LJLJJI;
        }
        return e0b.copy(str, str2, list, i);
    }

    public final E0B copy(String vid, String token, List<String> hosts, int i) {
        o.LJIIIZ(vid, "vid");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(hosts, "hosts");
        return new E0B(vid, token, hosts, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI)};
    }

    public final boolean isValid() {
        if (TextUtils.isEmpty(this.LJLIL) || TextUtils.isEmpty(this.LJLILLLLZI) || this.LJLJI.isEmpty()) {
            return false;
        }
        return true;
    }

    public final String tryGetHost() {
        if (this.LJLJI.isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.LJLJI, 0);
    }

    public final List<String> getHosts() {
        return this.LJLJI;
    }

    public final String getToken() {
        return this.LJLILLLLZI;
    }

    public final int getVersion() {
        return this.LJLJJI;
    }

    public final String getVid() {
        return this.LJLIL;
    }

    public E0B(String vid, String token, List<String> hosts, int i) {
        o.LJIIIZ(vid, "vid");
        o.LJIIIZ(token, "token");
        o.LJIIIZ(hosts, "hosts");
        this.LJLIL = vid;
        this.LJLILLLLZI = token;
        this.LJLJI = hosts;
        this.LJLJJI = i;
    }

    public /* synthetic */ E0B(String str, String str2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i2 & 8) != 0 ? 2 : i);
    }
}

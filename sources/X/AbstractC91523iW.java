package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC91523iW implements IRouteAction {
    public static final C91533iX Companion = new Object() { // from class: X.3iX
    };
    public Bundle bundle;
    public final C5H3 uri$delegate = C221108m2.LIZIZ(new AqS151S0100000_1(this, 827));
    public String url;

    public abstract boolean doAction(Context context, String str, Bundle bundle);

    private final android.net.Uri getUri() {
        return (android.net.Uri) this.uri$delegate.getValue();
    }

    private final boolean checkParamsValidity() {
        Iterator<String> it = getParamsList().iterator();
        while (it.hasNext()) {
            String param = getParam(it.next());
            if (param == null || param.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public List<String> getParamsList() {
        return C61878OQg.INSTANCE;
    }

    public final String getParam(String key) {
        String string;
        o.LJIIIZ(key, "key");
        Bundle bundle = this.bundle;
        String str = null;
        if (bundle == null || (string = bundle.getString(key)) == null || string.length() == 0) {
            android.net.Uri uri = getUri();
            if (uri != null) {
                str = UriProtector.getQueryParameter(uri, key);
            }
            return str;
        }
        return string;
    }

    public final Serializable getParamSerializable(String key) {
        o.LJIIIZ(key, "key");
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getSerializable(key);
        }
        return null;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (str == null || str.length() == 0) {
            return Boolean.FALSE;
        }
        this.url = str;
        this.bundle = bundle;
        if (!checkParamsValidity()) {
            return Boolean.FALSE;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return Boolean.valueOf(doAction(context, str, bundle));
    }
}

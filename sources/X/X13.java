package X;

import com.ss.ugc.android.davinciresource.jni.MapStringString;
import java.util.Map;

/* loaded from: classes16.dex */
public final class X13 implements Map.Entry<String, String> {
    public MapStringString.Iterator LJLIL;
    public final /* synthetic */ MapStringString LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.LJLIL.getKey();
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.LJLIL.getValue();
    }

    public X13(MapStringString mapStringString) {
        this.LJLILLLLZI = mapStringString;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String value = this.LJLIL.getValue();
        this.LJLIL.setValue(str);
        return value;
    }
}

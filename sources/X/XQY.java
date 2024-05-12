package X;

import java.io.Serializable;

/* loaded from: classes16.dex */
public class XQY<K, V> implements InterfaceC84371X9j<K, V>, Serializable {
    public static final long serialVersionUID = 1;
    public final ConcurrentMapC84812XQi<K, V> LJLIL;

    public XQY(XQ7<? super K, ? super V> xq7) {
        this.LJLIL = new ConcurrentMapC84812XQi<>(xq7);
    }
}

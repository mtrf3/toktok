package X;

import java.io.Serializable;

/* renamed from: X.1qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45641qi<T> extends AbstractC40081hk implements Serializable {
    public static final long serialVersionUID = 1;
    public T mValue;

    public C45641qi() {
    }

    public T get() {
        return this.mValue;
    }

    public C45641qi(T t) {
        this.mValue = t;
    }

    public void set(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            notifyChange();
        }
    }

    public C45641qi(InterfaceC024807w... interfaceC024807wArr) {
        super(interfaceC024807wArr);
    }
}

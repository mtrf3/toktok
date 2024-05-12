package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.Ek4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC37276Ek4<T> extends Cloneable {
    void cancel();

    InterfaceC37276Ek4<T> clone();

    void enqueue(InterfaceC36621EYv<T> interfaceC36621EYv);

    C64797Pbt<T> execute();

    boolean isCanceled();

    Request request();
}

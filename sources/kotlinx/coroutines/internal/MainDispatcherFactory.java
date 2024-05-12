package kotlinx.coroutines.internal;

import X.AbstractC78621UtN;
import java.util.List;

/* loaded from: classes7.dex */
public interface MainDispatcherFactory {
    AbstractC78621UtN createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}

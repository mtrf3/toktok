package kotlinx.coroutines.android;

import X.AbstractC78621UtN;
import X.C16880lQ;
import X.EXR;
import X.XIF;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes7.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public XIF createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new XIF(EXR.LIZ(C16880lQ.LLJJJJ()));
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public /* bridge */ /* synthetic */ AbstractC78621UtN createDispatcher(List list) {
        return createDispatcher((List<? extends MainDispatcherFactory>) list);
    }
}

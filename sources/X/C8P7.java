package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.ContainerTree;
import kotlin.jvm.internal.o;

/* renamed from: X.8P7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8P7 {
    public static ContainerTree LIZ(BaseContainer baseContainer) {
        o.LJIIIZ(baseContainer, "<this>");
        while (true) {
            BaseContainer<?, ?> baseContainer2 = baseContainer.LLF;
            if (baseContainer2 == null) {
                break;
            }
            baseContainer = baseContainer2;
        }
        ContainerTree containerTree = (ContainerTree) new ViewModelProvider(baseContainer).get(ContainerTree.class);
        if (containerTree != null) {
            return containerTree;
        }
        throw new IllegalStateException("Root Container must is ViewModelStoreOwner.");
    }
}

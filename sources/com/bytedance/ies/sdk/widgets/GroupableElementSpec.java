package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.widgets.ElementSpec;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public interface GroupableElementSpec extends ElementSpec {
    List<Integer> getGroupIds();

    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static void dispose(GroupableElementSpec groupableElementSpec) {
            ElementSpec.DefaultImpls.dispose(groupableElementSpec);
        }

        public static void onDispose(GroupableElementSpec groupableElementSpec) {
            ElementSpec.DefaultImpls.onDispose(groupableElementSpec);
        }

        public static void attach(GroupableElementSpec groupableElementSpec, ConstraintProperty constraintProperty) {
            o.LJIIIZ(constraintProperty, "constraintProperty");
            ElementSpec.DefaultImpls.attach(groupableElementSpec, constraintProperty);
        }
    }
}

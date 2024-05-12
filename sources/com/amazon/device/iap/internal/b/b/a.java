package com.amazon.device.iap.internal.b.b;

import X.C16880lQ;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.internal.util.e;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends i {
    public static final String d = C16880lQ.LJLLJ(a.class);
    public TaskManager a;
    public ContextManager b;
    public final String c;

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        String str = d;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data: ");
        LIZ.append(data);
        e.a(str, X1D.LIZIZ(LIZ));
        if (!data.containsKey("purchaseItemIntent")) {
            e.b(str, "did not find intent");
            return false;
        }
        e.a(str, "found intent");
        final Intent intent = (Intent) data.remove("purchaseItemIntent");
        this.a.enqueueAtFront(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.device.iap.internal.b.b.a.1
            public void execute() {
                try {
                    Activity visible = a.this.b.getVisible();
                    if (visible == null) {
                        visible = a.this.b.getRoot();
                    }
                    String str2 = a.d;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("About to fire intent with activity ");
                    LIZ2.append(visible);
                    e.a(str2, X1D.LIZIZ(LIZ2));
                    C16880lQ.LIZIZ(visible, intent);
                } catch (Exception e) {
                    String c = a.this.c();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(a.d);
                    LIZ3.append(".onResult().execute()");
                    MetricsHelper.submitExceptionMetrics(c, X1D.LIZIZ(LIZ3), e);
                    String str3 = a.d;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Exception when attempting to fire intent: ");
                    LIZ4.append(e);
                    e.b(str3, X1D.LIZIZ(LIZ4));
                }
            }
        });
        return true;
    }

    public a(com.amazon.device.iap.internal.b.e eVar, String str, String str2) {
        super(eVar, "purchase_item", str);
        this.c = str2;
        a("sku", str2);
    }
}

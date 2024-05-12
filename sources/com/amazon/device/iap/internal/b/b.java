package com.amazon.device.iap.internal.b;

import X.C16880lQ;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.SimplePrompt;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes.dex */
public class b extends SimplePrompt {
    public static final String a = C16880lQ.LJLLJ(b.class);
    public ContextManager b;
    public final PromptContent c;

    public long getExpirationDurationInSeconds() {
        return 31536000L;
    }

    public void doAction() {
        com.amazon.device.iap.internal.util.e.a(a, "doAction");
        if ("Amazon Appstore required".equalsIgnoreCase(this.c.getTitle()) || "Amazon Appstore Update Required".equalsIgnoreCase(this.c.getTitle())) {
            try {
                Activity visible = this.b.getVisible();
                if (visible == null) {
                    visible = this.b.getRoot();
                }
                C16880lQ.LIZIZ(visible, new Intent("android.intent.action.VIEW", UriProtector.parse("http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl")));
            } catch (Exception e) {
                String str = a;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Exception in PurchaseItemCommandTask.OnSuccess: ");
                LIZ.append(e);
                com.amazon.device.iap.internal.util.e.b(str, X1D.LIZIZ(LIZ));
            }
        }
    }

    public String toString() {
        return a;
    }

    public b(PromptContent promptContent) {
        super(promptContent);
        this.c = promptContent;
    }
}

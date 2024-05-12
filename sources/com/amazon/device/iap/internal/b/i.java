package com.amazon.device.iap.internal.b;

import X.C16880lQ;
import X.X1D;
import com.amazon.android.Kiwi;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.licensing.LicenseFailurePromptContentMapper;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i extends AbstractCommandTask {
    public static final String a = C16880lQ.LJLLJ(i.class);
    public final e b;
    public final String c;
    public final String d;
    public final String e;
    public final Map<String, Object> f;
    public boolean h;
    public i i;
    public i j;
    public final LicenseFailurePromptContentMapper g = new LicenseFailurePromptContentMapper();
    public boolean k = false;

    public abstract boolean a(SuccessResult successResult);

    public boolean isExecutionNeeded() {
        return true;
    }

    public void a_() {
        Kiwi.addCommandToCommandTaskPipeline(this);
    }

    public e b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public Map<String, Object> getCommandData() {
        return this.f;
    }

    public String getCommandName() {
        return this.d;
    }

    public String getCommandVersion() {
        return this.e;
    }

    private void a(PromptContent promptContent) {
        if (promptContent == null) {
            return;
        }
        Kiwi.getPromptManager().present(new b(promptContent));
    }

    public void b(i iVar) {
        this.j = iVar;
    }

    public final void onException(KiwiException kiwiException) {
        i iVar;
        String str = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onException: exception = ");
        LIZ.append(kiwiException.getMessage());
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
        if ("UNHANDLED_EXCEPTION".equals(kiwiException.getType()) && "2.0".equals(this.e) && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(this.g.map(kiwiException));
        }
        if (!this.k) {
            this.b.b();
        }
    }

    public final void onFailure(FailureResult failureResult) {
        String str;
        i iVar;
        String str2 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailure: result = ");
        LIZ.append(failureResult);
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ));
        if (failureResult != null && (str = (String) failureResult.getExtensionData().get("maxVersion")) != null && str.equalsIgnoreCase("1.0") && (iVar = this.j) != null) {
            iVar.a(this.k);
            this.j.a_();
            return;
        }
        if (this.h) {
            a(new PromptContent(failureResult.getDisplayableName(), failureResult.getDisplayableMessage(), failureResult.getButtonLabel(), failureResult.show()));
        }
        if (!this.k) {
            this.b.b();
        }
    }

    public final void onSuccess(SuccessResult successResult) {
        boolean z;
        i iVar;
        String str = (String) successResult.getData().get("errorMessage");
        String str2 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: result = ");
        LIZ.append(successResult);
        LIZ.append(", errorMessage: ");
        LIZ.append(str);
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ));
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            try {
                z = a(successResult);
                if (z && (iVar = this.i) != null) {
                    iVar.a_();
                    return;
                }
            } catch (Exception e) {
                String str3 = a;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Error calling onResult: ");
                LIZ2.append(e);
                com.amazon.device.iap.internal.util.e.b(str3, X1D.LIZIZ(LIZ2));
                z = false;
            }
            if (!this.k) {
                if (z) {
                    this.b.a();
                    return;
                } else {
                    this.b.b();
                    return;
                }
            }
            return;
        }
        if (!this.k) {
            this.b.b();
        }
    }

    public i a(boolean z) {
        this.k = z;
        return this;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void a(i iVar) {
        this.i = iVar;
    }

    public void a(String str, Object obj) {
        this.f.put(str, obj);
    }

    public i(e eVar, String str, String str2) {
        this.b = eVar;
        String requestId = eVar.c().toString();
        this.c = requestId;
        this.d = str;
        this.e = str2;
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        hashMap.put("requestId", requestId);
        hashMap.put("sdkVersion", "2.0.76.4");
        this.h = true;
        this.i = null;
        this.j = null;
    }
}

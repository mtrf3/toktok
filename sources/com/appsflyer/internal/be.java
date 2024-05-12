package com.appsflyer.internal;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class be implements bf {
    public final int AFInAppEventParameterName = (int) TimeUnit.SECONDS.toMillis(30);
    public bd AFInAppEventType;
    public Context AFKeystoreWrapper;
    public y AFVersionDeclaration;
    public av valueOf;
    public ExecutorService values;

    @Override // com.appsflyer.internal.bf
    public final bd AFInAppEventParameterName() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new bd();
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.bf
    public final o AFInAppEventType() {
        Context context = this.AFKeystoreWrapper;
        if (context != null) {
            return new o(context);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.bf
    public final av valueOf() {
        if (this.valueOf == null) {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new bd();
            }
            bd bdVar = this.AFInAppEventType;
            Context context = this.AFKeystoreWrapper;
            if (context != null) {
                bh bhVar = new bh(context);
                Context context2 = this.AFKeystoreWrapper;
                if (context2 != null) {
                    bc bcVar = new bc(ai.values(context2));
                    if (this.values == null) {
                        this.values = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("r/internal/be"));
                    }
                    ExecutorService executorService = this.values;
                    if (this.AFVersionDeclaration == null) {
                        bj bjVar = new bj(this.AFInAppEventParameterName);
                        if (this.values == null) {
                            this.values = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("r/internal/be"));
                        }
                        this.AFVersionDeclaration = new y(bjVar, this.values);
                    }
                    y yVar = this.AFVersionDeclaration;
                    Context context3 = this.AFKeystoreWrapper;
                    if (context3 != null) {
                        this.valueOf = new av(bdVar, bhVar, bcVar, executorService, new bg(yVar, new o(context3)));
                    } else {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.valueOf;
    }
}

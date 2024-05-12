package com.byted.cast.common.discovery;

import com.byted.cast.common.Logger;

/* loaded from: classes29.dex */
public class MDnsLogger implements IDnssdLogger {
    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void d(String str, String str2) {
        Logger.d(str, str2);
    }

    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void e(String str, String str2) {
        Logger.e(str, str2);
    }

    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void i(String str, String str2) {
        Logger.i(str, str2);
    }

    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void v(String str, String str2) {
        Logger.v(str, str2);
    }

    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void w(String str, String str2) {
        Logger.w(str, str2);
    }

    @Override // com.byted.cast.common.discovery.IDnssdLogger
    public void e(String str, String str2, Throwable th) {
        Logger.e(str, str2, th);
    }
}

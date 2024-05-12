package X;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* loaded from: classes12.dex */
public final class QE0 implements ICronetDepend {
    public static volatile QE0 LIZIZ;
    public ICronetDepend LIZ;

    public static QE0 LIZ() {
        if (LIZIZ == null) {
            synchronized (QE0.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QE0();
                }
            }
        }
        return LIZIZ;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final String getSsCookieKey() {
        ICronetDepend iCronetDepend = this.LIZ;
        if (iCronetDepend != null) {
            return iCronetDepend.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        ICronetDepend iCronetDepend = this.LIZ;
        if (iCronetDepend != null) {
            return iCronetDepend.loggerDebug();
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void setAdapter(ICronetDepend iCronetDepend) {
        this.LIZ = iCronetDepend;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void loggerD(String str, String str2) {
        ICronetDepend iCronetDepend = this.LIZ;
        if (iCronetDepend != null) {
            iCronetDepend.loggerD(str, str2);
        }
    }
}

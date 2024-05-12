package X;

import X.QQI;

/* renamed from: X.QTj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67055QTj<T extends QQI> extends QQE<T> {
    public String getCaptchaInfo(T t) {
        return null;
    }

    public boolean needShowCaptcha(T t) {
        return false;
    }

    public boolean needShowPicCaptcha(T t) {
        return false;
    }

    public boolean needShowSecureCaptcha(T t) {
        return false;
    }

    public abstract void onError(T t, int i);

    public void onNeedCaptcha(T t, String str) {
    }

    public void onNeedSecureCaptcha(T t) {
    }

    public abstract void onSuccess(T t);

    @Override // X.QQE
    public void onResponse(T t) {
        if (t.LIZIZ) {
            onSuccess(t);
            return;
        }
        if (needShowCaptcha(t)) {
            if (needShowPicCaptcha(t)) {
                onNeedCaptcha(t, getCaptchaInfo(t));
                return;
            } else {
                onError(t, t.LIZLLL);
                return;
            }
        }
        onError(t, t.LIZLLL);
    }
}

package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.6J6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6J6 {
    public String LJLIL = String.valueOf(SystemClock.elapsedRealtime());

    public abstract String getDesc();

    public abstract String getDetailUrl();

    public abstract String getDonateLink();

    public abstract UrlModel getIcon();

    public abstract String getName();

    public abstract Integer getNgoId();

    public abstract String getOrgId();

    public abstract String getOrgType();

    public String getAddTime() {
        return this.LJLIL;
    }

    public void setAddTime(String str) {
        this.LJLIL = str;
    }
}

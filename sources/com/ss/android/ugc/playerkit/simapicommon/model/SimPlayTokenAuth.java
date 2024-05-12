package com.ss.android.ugc.playerkit.simapicommon.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SimPlayTokenAuth implements Serializable {
    public int LJLIL;

    @InterfaceC65349Pkn("auth")
    public String auth;

    @InterfaceC65349Pkn("hosts")
    public List<String> hosts;
    public Object origin;

    @InterfaceC65349Pkn("token")
    public String token;

    @InterfaceC65349Pkn("version")
    public Integer version;

    @InterfaceC65349Pkn("vid")
    public String vid;

    public void resetHostIndex() {
        this.LJLIL = 0;
    }

    public int getVersion() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.vid) && TextUtils.isEmpty(this.auth) && TextUtils.isEmpty(this.token)) {
            List<String> list = this.hosts;
            if (list == null || list.size() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public String tryGetHost() {
        List<String> list = this.hosts;
        if (list != null && this.LJLIL < list.size()) {
            return (String) ListProtector.get(this.hosts, this.LJLIL);
        }
        return null;
    }

    public boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list != null && this.LJLIL < list.size() - 1) {
            this.LJLIL++;
            return true;
        }
        return false;
    }

    public String getAuth() {
        return this.auth;
    }

    public int getHostIndex() {
        return this.LJLIL;
    }

    public List<String> getHosts() {
        return this.hosts;
    }

    public String getToken() {
        return this.token;
    }

    public String getVid() {
        return this.vid;
    }

    public void setAuth(String str) {
        this.auth = str;
    }

    public void setHostIndex(int i) {
        this.LJLIL = i;
    }

    public void setHosts(List<String> list) {
        this.hosts = list;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setVersion(int i) {
        this.version = Integer.valueOf(i);
    }

    public void setVid(String str) {
        this.vid = str;
    }
}

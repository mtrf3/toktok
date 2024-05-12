package com.ss.android.ugc.aweme.feed.model.video;

import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PlayTokenAuth implements Serializable {

    @InterfaceC65349Pkn("auth")
    public String auth;
    public int hostIndex;

    @InterfaceC65349Pkn("hosts")
    public List<String> hosts;

    @InterfaceC65349Pkn("token")
    public String token;

    @InterfaceC65349Pkn("version")
    public Integer version;

    @InterfaceC65349Pkn("vid")
    public String vid;

    public final void resetHostIndex() {
        this.hostIndex = 0;
    }

    public final int getVersionN() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        o.LJI(num);
        return num.intValue();
    }

    public final String tryGetHost() {
        List<String> list = this.hosts;
        if (list != null) {
            int i = this.hostIndex;
            o.LJI(list);
            if (i < list.size()) {
                List<String> list2 = this.hosts;
                o.LJI(list2);
                return (String) ListProtector.get(list2, this.hostIndex);
            }
        }
        return null;
    }

    public final boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list != null) {
            int i = this.hostIndex;
            o.LJI(list);
            if (i < list.size() - 1) {
                this.hostIndex++;
                return true;
            }
        }
        return false;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final int getHostIndex() {
        return this.hostIndex;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void setAuth(String str) {
        this.auth = str;
    }

    public final void setHostIndex(int i) {
        this.hostIndex = i;
    }

    public final void setHosts(List<String> list) {
        this.hosts = list;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }

    public final void setVersionN(int i) {
        this.version = Integer.valueOf(i);
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}

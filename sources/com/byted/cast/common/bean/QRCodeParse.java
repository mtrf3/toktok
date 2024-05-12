package com.byted.cast.common.bean;

import X.X1D;
import java.util.List;

/* loaded from: classes29.dex */
public class QRCodeParse {
    public String cast_id;
    public List<String> ip;
    public Integer mpt;

    /* renamed from: net, reason: collision with root package name */
    public String f108net;
    public String pcl = "";
    public String pio;
    public Integer port;
    public String protocols;
    public String se;
    public String svn;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QRCodeParse{se='");
        LIZ.append(this.se);
        LIZ.append('\'');
        LIZ.append(", pcl='");
        LIZ.append(this.pcl);
        LIZ.append('\'');
        LIZ.append(", svn='");
        LIZ.append(this.svn);
        LIZ.append('\'');
        LIZ.append(", net='");
        LIZ.append(this.f108net);
        LIZ.append('\'');
        LIZ.append(", ip=");
        LIZ.append(this.ip);
        LIZ.append(", port=");
        LIZ.append(this.port);
        LIZ.append(", mpt=");
        LIZ.append(this.mpt);
        LIZ.append(", protocols='");
        LIZ.append(this.protocols);
        LIZ.append('\'');
        LIZ.append(", pio='");
        LIZ.append(this.pio);
        LIZ.append('\'');
        LIZ.append(", cast_id='");
        LIZ.append(this.cast_id);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getCast_id() {
        return this.cast_id;
    }

    public List<String> getIp() {
        return this.ip;
    }

    public Integer getMpt() {
        return this.mpt;
    }

    public String getNet() {
        return this.f108net;
    }

    public String getPcl() {
        return this.pcl;
    }

    public String getPio() {
        return this.pio;
    }

    public Integer getPort() {
        return this.port;
    }

    public String getProtocols() {
        return this.protocols;
    }

    public String getSe() {
        return this.se;
    }

    public String getSvn() {
        return this.svn;
    }

    public void setCast_id(String str) {
        this.cast_id = str;
    }

    public void setIp(List<String> list) {
        this.ip = list;
    }

    public void setMpt(Integer num) {
        this.mpt = num;
    }

    public void setNet(String str) {
        this.f108net = str;
    }

    public void setPcl(String str) {
        this.pcl = str;
    }

    public void setPio(String str) {
        this.pio = str;
    }

    public void setPort(Integer num) {
        this.port = num;
    }

    public void setProtocols(String str) {
        this.protocols = str;
    }

    public void setSe(String str) {
        this.se = str;
    }

    public void setSvn(String str) {
        this.svn = str;
    }
}

package com.ss.android.ugc.effectmanager.link.model.host;

import X.C77800Ug8;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import defpackage.b1;
import java.net.URI;

/* loaded from: classes7.dex */
public class Host {
    public String host;
    public String path;
    public int port;
    public String schema;
    public long sortTime;
    public long weightTime;

    public long getSortTime() {
        return this.sortTime + this.weightTime;
    }

    public String getItemName() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.schema);
        LIZ.append("://");
        LIZ.append(this.host);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.port != -1) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, ":");
            LIZJ.append(this.port);
            LIZIZ = X1D.LIZIZ(LIZJ);
        }
        if (!TextUtils.isEmpty(this.path)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append(this.path);
            return X1D.LIZIZ(LIZ2);
        }
        return LIZIZ;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Host{weightTime=");
        LIZ.append(this.weightTime);
        LIZ.append(", schema='");
        Q89.LIZIZ(LIZ, this.schema, '\'', ", host='");
        return C77800Ug8.LIZJ(LIZ, this.host, '\'', '}', LIZ);
    }

    public Host(String str) {
        this.port = -1;
        URI create = URI.create(str);
        this.host = create.getHost();
        this.schema = create.getScheme();
        this.port = create.getPort();
        this.path = create.getPath();
    }

    public boolean hostEquals(Host host) {
        if (host == null || !host.host.equals(this.host) || !host.schema.equals(this.schema)) {
            return false;
        }
        return true;
    }

    public Host(URI uri) {
        this.port = -1;
        this.host = uri.getHost();
        this.schema = uri.getScheme();
        this.path = uri.getPath();
    }

    public Host(String str, String str2) {
        this.port = -1;
        this.host = str;
        this.schema = str2;
    }

    public Host(String str, String str2, long j) {
        this.port = -1;
        this.host = str;
        this.schema = str2;
        this.weightTime = j;
    }
}

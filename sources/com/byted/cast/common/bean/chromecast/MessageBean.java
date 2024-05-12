package com.byted.cast.common.bean.chromecast;

import X.X1D;

/* loaded from: classes29.dex */
public class MessageBean {
    public String content;
    public String id;
    public int type;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageBean{type=");
        LIZ.append(this.type);
        LIZ.append(", id='");
        LIZ.append(this.id);
        LIZ.append('\'');
        LIZ.append(", content='");
        LIZ.append(this.content);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}

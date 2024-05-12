package com.byted.cast.render.render;

import com.byted.cast.mediacommon.render.parameters.MediaParameter;

/* loaded from: classes29.dex */
public interface IRender {
    Object getParameter(MediaParameter mediaParameter);

    void render(byte[] bArr, int i);

    void setParameter(MediaParameter mediaParameter, Object obj);

    boolean start();

    boolean stop();
}

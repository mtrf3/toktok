package X;

import java.lang.Enum;

/* loaded from: classes13.dex */
public interface TLG<STATE extends Enum<STATE>> {
    STATE getState();

    void setState(STATE state);
}

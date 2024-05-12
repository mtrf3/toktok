package X;

import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public enum JOK {
    PLAY(1),
    PAUSE(2),
    LOADING(3);

    public static final JOL Companion = new JOL();
    public static final java.util.Map<Integer, JOK> stateValueMap;
    public final int LJLIL;

    public static JOK valueOf(String str) {
        return (JOK) V0N.LJJJ(JOK.class, str);
    }

    static {
        JOK[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (JOK jok : values) {
            linkedHashMap.put(Integer.valueOf(jok.LJLIL), jok);
        }
        stateValueMap = linkedHashMap;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    JOK(int i) {
        this.LJLIL = i;
    }
}

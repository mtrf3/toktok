package X;

/* loaded from: classes6.dex */
public enum CWI {
    StateIdl,
    StateStart,
    StateConnected,
    StatePause,
    StateEnd;

    public static CWI valueOf(String str) {
        return (CWI) V0N.LJJJ(CWI.class, str);
    }
}

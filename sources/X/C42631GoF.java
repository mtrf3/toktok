package X;

/* renamed from: X.GoF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42631GoF {
    public static final void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        String LIZ;
        if (((Boolean) C42632GoG.LIZ.getValue()).booleanValue()) {
            try {
                LIZ = (String) interfaceC65784Pro.invoke();
            } catch (Throwable th) {
                LIZ = C25620zW.LIZ("error:", th);
            }
            C36922EeM.LIZLLL(4, "EventbusIssueLogger", LIZ);
        }
    }
}

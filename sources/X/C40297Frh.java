package X;

/* renamed from: X.Frh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40297Frh extends QNA {
    public final /* synthetic */ InterfaceC36488ETs LIZ;

    public C40297Frh(InterfaceC36488ETs interfaceC36488ETs) {
        this.LIZ = interfaceC36488ETs;
    }

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        InterfaceC36488ETs interfaceC36488ETs = this.LIZ;
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.onSuccess(Integer.valueOf(i));
        }
    }
}

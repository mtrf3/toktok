package X;

/* renamed from: X.1hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40081hk extends C28601Ai {
    public AbstractC40081hk() {
    }

    public AbstractC40081hk(InterfaceC024807w... interfaceC024807wArr) {
        if (interfaceC024807wArr != null && interfaceC024807wArr.length != 0) {
            AbstractC024707v abstractC024707v = new AbstractC024707v() { // from class: X.1Aj
                @Override // X.AbstractC024707v
                public final void LIZ(InterfaceC024807w interfaceC024807w, int i) {
                    AbstractC40081hk.this.notifyChange();
                }
            };
            for (InterfaceC024807w interfaceC024807w : interfaceC024807wArr) {
                interfaceC024807w.addOnPropertyChangedCallback(abstractC024707v);
            }
        }
    }
}

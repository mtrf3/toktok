package X;

/* renamed from: X.1Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28601Ai implements InterfaceC024807w {
    public transient C28631Al mCallbacks;

    public void notifyChange() {
        synchronized (this) {
            C28631Al c28631Al = this.mCallbacks;
            if (c28631Al == null) {
                return;
            }
            c28631Al.LIZJ(0, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Al] */
    @Override // X.InterfaceC024807w
    public void addOnPropertyChangedCallback(AbstractC024707v abstractC024707v) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new C024307r<AbstractC024707v, InterfaceC024807w, Void>() { // from class: X.1Al
                    public static final C28621Ak LJLJJLL = new AbstractC024207q<AbstractC024707v, InterfaceC024807w, Void>() { // from class: X.1Ak
                        @Override // X.AbstractC024207q
                        public final void LIZ(int i, Object obj, Object obj2) {
                            ((AbstractC024707v) obj).LIZ((InterfaceC024807w) obj2, i);
                        }
                    };

                    {
                        C28621Ak c28621Ak = LJLJJLL;
                    }
                };
            }
        }
        LIZ(abstractC024707v);
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            C28631Al c28631Al = this.mCallbacks;
            if (c28631Al == null) {
                return;
            }
            c28631Al.LIZJ(i, this);
        }
    }

    public void removeOnPropertyChangedCallback(AbstractC024707v abstractC024707v) {
        synchronized (this) {
            C28631Al c28631Al = this.mCallbacks;
            if (c28631Al == null) {
                return;
            }
            c28631Al.LJFF(abstractC024707v);
        }
    }
}

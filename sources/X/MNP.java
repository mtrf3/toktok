package X;

/* loaded from: classes10.dex */
public final class MNP extends AbstractC56676MMe {
    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        return false;
    }

    public MNP() {
        super(21);
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(399, 0L, this.type, false, this);
    }
}

package X;

/* renamed from: X.SgT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72725SgT implements OI8 {
    public final /* synthetic */ C208298Fl LIZ;

    @Override // X.OI8
    public final void onSuccess() {
        AbstractC029409q adapter;
        AbstractC029409q adapter2 = this.LIZ.getAdapter();
        if (adapter2 != null) {
            C208298Fl c208298Fl = this.LIZ;
            if (adapter2.getItemCount() >= 1 && (adapter = c208298Fl.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public C72725SgT(C208298Fl c208298Fl) {
        this.LIZ = c208298Fl;
    }
}

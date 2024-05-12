package X;

import android.widget.CompoundButton;

/* renamed from: X.GKk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41342GKk implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ InterfaceC88471Ynr<Integer, Boolean, Object> LJLIL;
    public final /* synthetic */ C41341GKj LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C41342GKk(InterfaceC88471Ynr<? super Integer, ? super Boolean, ? extends Object> interfaceC88471Ynr, C41341GKj c41341GKj) {
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = c41341GKj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.LJLIL.invoke(Integer.valueOf(this.LJLILLLLZI.getAbsoluteAdapterPosition()), Boolean.valueOf(z));
    }
}

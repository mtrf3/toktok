package X;

import com.ss.android.ugc.aweme.setting.model.RestrictInfo;

/* renamed from: X.Oab, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62169Oab extends I4X implements C8BT {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62171Oad) ((I4Y) obj)).LJJIJIIJI((RestrictInfo) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData);
        }
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        I4Y i4y = (I4Y) this.LJLJI;
        if (i4y != null) {
            ((InterfaceC62171Oad) i4y).LJIJJLI();
        }
    }

    public C62169Oab(C62170Oac c62170Oac, InterfaceC62171Oad interfaceC62171Oad) {
        super(c62170Oac, interfaceC62171Oad);
        ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).addNotifyListener(this);
    }
}

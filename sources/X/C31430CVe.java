package X;

/* renamed from: X.CVe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31430CVe extends TBS implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public C31430CVe(Object obj) {
        super(2, obj, C31443CVr.class, "onModelRangeRemoved", "onModelRangeRemoved(II)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        C31435CVj c31435CVj = ((C31443CVr) this.receiver).LJLIL;
        if (c31435CVj != null) {
            c31435CVj.notifyItemRangeRemoved(intValue, intValue2);
        }
        return C76800UCe.LIZ;
    }
}

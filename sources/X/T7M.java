package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7M extends F9E {
    public final T7E LJLIL;
    public final T7H LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public T7M(T7E navigateDialogUiModel, T7H bottomSheetActionEnum) {
        o.LJIIIZ(navigateDialogUiModel, "navigateDialogUiModel");
        o.LJIIIZ(bottomSheetActionEnum, "bottomSheetActionEnum");
        this.LJLIL = navigateDialogUiModel;
        this.LJLILLLLZI = bottomSheetActionEnum;
    }
}

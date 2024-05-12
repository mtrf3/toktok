package X;

import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes7.dex */
public final class DJF extends AbstractC65781Prl implements InterfaceC65784Pro<int[]> {
    public static final DJF LJLIL = new DJF();

    public DJF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final int[] invoke() {
        DJE.LIZ.getClass();
        int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("tablet_landscape_min_screen_size", int[].class, DJE.LIZIZ);
        if (iArr == null || iArr.length != 2) {
            return new int[]{600, 683};
        }
        return iArr;
    }
}

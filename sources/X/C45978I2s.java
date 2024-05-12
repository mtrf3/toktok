package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I2s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45978I2s implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ C46010I3y LIZIZ;

    public C45978I2s(C45850Hz4 c45850Hz4, C46010I3y c46010I3y) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = c46010I3y;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        boolean z;
        String str;
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AlbumBottomTabModule -> onTabSelected -> extraInfo.event?.type == TabHost.ChangeType.NORMAL: ");
        WS0 ws0 = i34.LIZJ;
        boolean z2 = false;
        if (ws0 != null && ws0.LIZJ == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.LIZLLL().shootMode = 19;
        H9G h9g = this.LIZ.LIZLLL().creativeModel.albumTabModel;
        WS0 ws02 = i34.LIZJ;
        if (ws02 != null && (obj = ws02.LIZ) != null) {
            str = (String) obj;
        } else {
            str = "";
        }
        h9g.setFromTag(str);
        InterfaceC45979I2t interfaceC45979I2t = this.LIZIZ.LJLJJI;
        if (interfaceC45979I2t != null) {
            WS0 ws03 = i34.LIZJ;
            if (ws03 != null && ws03.LIZJ == 0) {
                z2 = true;
            }
            interfaceC45979I2t.setAlbumTabIsSelected(true, z2);
            return true;
        }
        o.LJIJI("bottomTabApiComponent");
        throw null;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        InterfaceC45979I2t interfaceC45979I2t = this.LIZIZ.LJLJJI;
        if (interfaceC45979I2t != null) {
            interfaceC45979I2t.setAlbumTabIsSelected(false, false);
            return false;
        }
        o.LJIJI("bottomTabApiComponent");
        throw null;
    }
}

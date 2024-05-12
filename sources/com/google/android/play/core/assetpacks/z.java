package com.google.android.play.core.assetpacks;

import X.C151035wJ;
import X.C151065wM;
import X.C151325wm;
import X.C82890Wg2;
import X.C82891Wg3;
import X.InterfaceC153045zY;
import X.InterfaceC153055zZ;
import X.TMB;
import android.app.Application;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public final class z implements InterfaceC153055zZ {
    public final Object LJLIL;
    public Object LJLILLLLZI;

    public /* synthetic */ z(p2 p2Var, InterfaceC153055zZ interfaceC153055zZ) {
        this.LJLIL = p2Var;
        this.LJLILLLLZI = interfaceC153055zZ;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new y(((p2) ((InterfaceC153055zZ) this.LJLIL)).a(), (v1) ((InterfaceC153055zZ) this.LJLILLLLZI).a());
    }

    public /* synthetic */ z(InterfaceC153045zY interfaceC153045zY) {
        this.LJLIL = interfaceC153045zY;
    }

    public final int LIZIZ(String path, String str, boolean z) {
        String[] strArr;
        int i;
        kotlin.jvm.internal.o.LJIIIZ(path, "path");
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        String[] strArr2 = null;
        String str2 = null;
        strArr2 = null;
        if (c151065wM != null) {
            C151035wJ c151035wJ = c151065wM.LIZ;
            c151035wJ.getClass();
            C151325wm LIZIZ = c151035wJ.LIZIZ();
            int i2 = -1;
            if (LIZIZ != null) {
                if (path.length() > 0) {
                    if (str != null) {
                        strArr = new String[]{str};
                    } else {
                        strArr = null;
                    }
                    TEImageInterface tEImageInterface = LIZIZ.LJII;
                    if (tEImageInterface != null) {
                        i2 = tEImageInterface.addInfoSticker(path, strArr, null);
                    }
                    C151035wJ.LIZJ(LIZIZ, z);
                    i = i2;
                    c151065wM.LJ(i2, z);
                    return i;
                }
                TMB tmb = C82890Wg2.LJFF;
                Application LIZ = C82891Wg3.LIZ();
                tmb.getClass();
                if (LIZ != null) {
                    str2 = LIZ.getString(R.string.hhd);
                }
                new C82890Wg2(LIZ, str2, 1, 1).LIZ();
            }
            i = -1;
            c151065wM.LJ(i2, z);
            return i;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return 0;
        }
        if (str != null && str.length() != 0) {
            strArr2 = new String[]{str};
        }
        return interfaceC153045zY.addInfoSticker(path, strArr2);
    }

    public final void LIZJ(int i, int i2, boolean z) {
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        if (c151065wM != null) {
            C151325wm LIZIZ = c151065wM.LIZ.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJIIIZ(i, i2);
                C151035wJ.LIZJ(LIZIZ, z);
                return;
            }
            return;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return;
        }
        interfaceC153045zY.setInfoStickerLayer(i, i2);
    }

    public final void LJ(float f, int i, boolean z) {
        TEImageInterface tEImageInterface;
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        if (c151065wM != null) {
            C151325wm LIZIZ = c151065wM.LIZ.LIZIZ();
            if (LIZIZ != null) {
                if (i >= 0 && (tEImageInterface = LIZIZ.LJII) != null) {
                    tEImageInterface.setInfoStickerRotation(i, f);
                }
                C151035wJ.LIZJ(LIZIZ, z);
                return;
            }
            return;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return;
        }
        interfaceC153045zY.setInfoStickerRotation(i, f);
    }

    public final void LJFF(float f, int i, boolean z) {
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        if (c151065wM != null) {
            C151325wm LIZIZ = c151065wM.LIZ.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJIIJ(i, f, f);
                C151035wJ.LIZJ(LIZIZ, z);
                return;
            }
            return;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return;
        }
        interfaceC153045zY.setInfoStickerScale(i, f);
    }

    public final int LIZ(String path, float f, float f2, float f3, float f4, boolean z) {
        String str;
        int i;
        kotlin.jvm.internal.o.LJIIIZ(path, "path");
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        if (c151065wM != null) {
            C151035wJ c151035wJ = c151065wM.LIZ;
            c151035wJ.getClass();
            C151325wm LIZIZ = c151035wJ.LIZIZ();
            Integer num = -1;
            if (LIZIZ != null) {
                if (path.length() > 0) {
                    num = C151325wm.LIZ(LIZIZ, path, f, f2, f3, f4);
                    C151035wJ.LIZJ(LIZIZ, z);
                } else {
                    TMB tmb = C82890Wg2.LJFF;
                    Application LIZ = C82891Wg3.LIZ();
                    tmb.getClass();
                    if (LIZ != null) {
                        str = LIZ.getString(R.string.hhd);
                    } else {
                        str = null;
                    }
                    new C82890Wg2(LIZ, str, 1, 1).LIZ();
                }
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            c151065wM.LJ(i, z);
            return i;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return 0;
        }
        return interfaceC153045zY.addImageSticker(path, f, f2, f3, f4);
    }

    public final void LIZLLL(int i, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        C151065wM c151065wM = (C151065wM) this.LJLILLLLZI;
        if (c151065wM != null) {
            if (z2) {
                C151325wm LIZIZ = c151065wM.LIZ.LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.LIZJ(i, f3, -f4);
                    C151035wJ.LIZJ(LIZIZ, z);
                    return;
                }
                return;
            }
            C151325wm LIZIZ2 = c151065wM.LIZ.LIZIZ();
            if (LIZIZ2 == null) {
                return;
            }
            LIZIZ2.LIZJ(i, f3, -f4);
            C151035wJ.LIZJ(LIZIZ2, z);
            return;
        }
        InterfaceC153045zY interfaceC153045zY = (InterfaceC153045zY) this.LJLIL;
        if (interfaceC153045zY == null) {
            return;
        }
        interfaceC153045zY.setInfoStickerPosition(i, f, f2);
    }
}

package X;

import android.graphics.Bitmap;
import android.view.KeyEvent;

/* renamed from: X.1XR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XR implements InterfaceC18710oN, UCZ {
    public final /* synthetic */ InterfaceC88472Yns LIZ;

    public /* synthetic */ C1XR(Object obj) {
        this.LIZ = (InterfaceC88472Yns) obj;
    }

    @Override // X.UCZ
    public void LIZ(Bitmap bitmap) {
        this.LIZ.invoke(bitmap);
    }

    @Override // X.InterfaceC18710oN
    public EnumC18670oJ LIZIZ(KeyEvent keyEvent) {
        if (((Boolean) this.LIZ.invoke(new C24870yJ(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
            if (C24860yI.LIZ(C38891fp.LIZLLL(keyEvent.getKeyCode()), C18500o2.LJFF)) {
                return EnumC18670oJ.REDO;
            }
        } else if (((Boolean) this.LIZ.invoke(new C24870yJ(keyEvent))).booleanValue()) {
            long LIZLLL = C38891fp.LIZLLL(keyEvent.getKeyCode());
            if (C24860yI.LIZ(LIZLLL, C18500o2.LIZIZ) || C24860yI.LIZ(LIZLLL, C18500o2.LJIILL)) {
                return EnumC18670oJ.COPY;
            }
            if (C24860yI.LIZ(LIZLLL, C18500o2.LIZLLL)) {
                return EnumC18670oJ.PASTE;
            }
            if (C24860yI.LIZ(LIZLLL, C18500o2.LJ)) {
                return EnumC18670oJ.CUT;
            }
            if (C24860yI.LIZ(LIZLLL, C18500o2.LIZ)) {
                return EnumC18670oJ.SELECT_ALL;
            }
            if (C24860yI.LIZ(LIZLLL, C18500o2.LJFF)) {
                return EnumC18670oJ.UNDO;
            }
        } else if (!keyEvent.isCtrlPressed()) {
            if (keyEvent.isShiftPressed()) {
                long LIZLLL2 = C38891fp.LIZLLL(keyEvent.getKeyCode());
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJII)) {
                    return EnumC18670oJ.SELECT_LEFT_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIIIIZZ)) {
                    return EnumC18670oJ.SELECT_RIGHT_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIIIZ)) {
                    return EnumC18670oJ.SELECT_UP;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIIJ)) {
                    return EnumC18670oJ.SELECT_DOWN;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIIJJI)) {
                    return EnumC18670oJ.SELECT_PAGE_UP;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIIL)) {
                    return EnumC18670oJ.SELECT_PAGE_DOWN;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIILIIL)) {
                    return EnumC18670oJ.SELECT_LINE_START;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIILJJIL)) {
                    return EnumC18670oJ.SELECT_LINE_END;
                }
                if (C24860yI.LIZ(LIZLLL2, C18500o2.LJIILL)) {
                    return EnumC18670oJ.PASTE;
                }
            } else {
                long LIZLLL3 = C38891fp.LIZLLL(keyEvent.getKeyCode());
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJII)) {
                    return EnumC18670oJ.LEFT_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIIIZZ)) {
                    return EnumC18670oJ.RIGHT_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIIZ)) {
                    return EnumC18670oJ.UP;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIJ)) {
                    return EnumC18670oJ.DOWN;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIJJI)) {
                    return EnumC18670oJ.PAGE_UP;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIL)) {
                    return EnumC18670oJ.PAGE_DOWN;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIILIIL)) {
                    return EnumC18670oJ.LINE_START;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIILJJIL)) {
                    return EnumC18670oJ.LINE_END;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIILLIIL)) {
                    return EnumC18670oJ.NEW_LINE;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIIZILJ)) {
                    return EnumC18670oJ.DELETE_PREV_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIJ)) {
                    return EnumC18670oJ.DELETE_NEXT_CHAR;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIJI)) {
                    return EnumC18670oJ.PASTE;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIJJ)) {
                    return EnumC18670oJ.CUT;
                }
                if (C24860yI.LIZ(LIZLLL3, C18500o2.LJIJJLI)) {
                    return EnumC18670oJ.TAB;
                }
            }
        }
        return null;
    }
}

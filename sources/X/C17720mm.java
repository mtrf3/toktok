package X;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.0mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17720mm {
    public static final C17720mm LJ = new C17720mm(1, (CharSequence) null);
    public static final C17720mm LJFF = new C17720mm(2, (CharSequence) null);
    public static final C17720mm LJI;
    public static final C17720mm LJII;
    public static final C17720mm LJIIIIZZ;
    public static final C17720mm LJIIIZ;
    public static final C17720mm LJIIJ;
    public static final C17720mm LJIIJJI;
    public static final C17720mm LJIIL;
    public static final C17720mm LJIILIIL;
    public static final C17720mm LJIILJJIL;
    public static final C17720mm LJIILL;
    public static final C17720mm LJIILLIIL;
    public static final C17720mm LJIIZILJ;
    public static final C17720mm LJIJ;
    public final Object LIZ;
    public final int LIZIZ;
    public final Class<? extends AbstractC17820mw> LIZJ;
    public final InterfaceC17830mx LIZLLL;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        new C17720mm(4, (CharSequence) null);
        new C17720mm(8, (CharSequence) null);
        LJI = new C17720mm(16, (CharSequence) null);
        new C17720mm(32, (CharSequence) null);
        LJII = new C17720mm(64, (CharSequence) null);
        LJIIIIZZ = new C17720mm(128, (CharSequence) null);
        new C17720mm(256, C34381Wo.class);
        new C17720mm(512, C34381Wo.class);
        new C17720mm(1024, C34391Wp.class);
        new C17720mm(2048, C34391Wp.class);
        LJIIIZ = new C17720mm(4096, (CharSequence) null);
        LJIIJ = new C17720mm(FileUtils.BUFFER_SIZE, (CharSequence) null);
        new C17720mm(16384, (CharSequence) null);
        new C17720mm(32768, (CharSequence) null);
        new C17720mm(65536, (CharSequence) null);
        new C17720mm(131072, C34431Wt.class);
        LJIIJJI = new C17720mm(262144, (CharSequence) null);
        LJIIL = new C17720mm(524288, (CharSequence) null);
        LJIILIIL = new C17720mm(1048576, (CharSequence) null);
        new C17720mm(2097152, C34441Wu.class);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new C17720mm(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new C17720mm(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, C34411Wr.class);
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        LJIILJJIL = new C17720mm(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        LJIILL = new C17720mm(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        LJIILLIIL = new C17720mm(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        LJIIZILJ = new C17720mm(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new C17720mm(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
        if (i >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new C17720mm(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
        if (i >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new C17720mm(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
        if (i >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new C17720mm(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
        if (i >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new C17720mm(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
        if (i >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        LJIJ = new C17720mm(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, C34421Ws.class);
        if (i >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new C17720mm(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, C34401Wq.class);
        if (i >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new C17720mm(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new C17720mm(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17 = null;
        new C17720mm(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        new C17720mm(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
    }

    public final int LIZ() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.LIZ).getId();
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C17720mm)) {
            return false;
        }
        C17720mm c17720mm = (C17720mm) obj;
        Object obj2 = this.LIZ;
        if (obj2 == null) {
            if (c17720mm.LIZ != null) {
                return false;
            }
            return true;
        }
        if (!obj2.equals(c17720mm.LIZ)) {
            return false;
        }
        return true;
    }

    public C17720mm(int i, CharSequence charSequence) {
        this(null, i, charSequence, null, null);
    }

    public C17720mm(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C17720mm(Object obj, int i, CharSequence charSequence, InterfaceC17830mx interfaceC17830mx, Class<? extends AbstractC17820mw> cls) {
        this.LIZIZ = i;
        this.LIZLLL = interfaceC17830mx;
        if (obj == null) {
            this.LIZ = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.LIZ = obj;
        }
        this.LIZJ = cls;
    }
}

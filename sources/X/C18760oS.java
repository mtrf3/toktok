package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.0oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18760oS {
    public static final C1XS LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1XS] */
    static {
        C2ID shortcutModifier = new TBT() { // from class: X.2ID
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                KeyEvent isCtrlPressed = ((C24870yJ) obj).LIZ;
                o.LJIIIZ(isCtrlPressed, "$this$isCtrlPressed");
                return Boolean.valueOf(isCtrlPressed.isCtrlPressed());
            }
        };
        o.LJIIIZ(shortcutModifier, "shortcutModifier");
        final C1XR c1xr = new C1XR(shortcutModifier);
        LIZ = new InterfaceC18710oN() { // from class: X.1XS
            /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC18710oN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.EnumC18670oJ LIZIZ(android.view.KeyEvent r5) {
                /*
                    r4 = this;
                    boolean r0 = r5.isShiftPressed()
                    if (r0 == 0) goto L48
                    boolean r0 = r5.isCtrlPressed()
                    if (r0 == 0) goto L48
                    int r0 = r5.getKeyCode()
                    long r2 = X.C38891fp.LIZLLL(r0)
                    long r0 = X.C18500o2.LJII
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L27
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_LEFT_WORD
                L1e:
                    if (r0 != 0) goto L26
                L20:
                    X.0oN r0 = r1
                    X.0oJ r0 = r0.LIZIZ(r5)
                L26:
                    return r0
                L27:
                    long r0 = X.C18500o2.LJIIIIZZ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L32
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_RIGHT_WORD
                    goto L1e
                L32:
                    long r0 = X.C18500o2.LJIIIZ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L3d
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_PREV_PARAGRAPH
                    goto L1e
                L3d:
                    long r0 = X.C18500o2.LJIIJ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L20
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_NEXT_PARAGRAPH
                    goto L1e
                L48:
                    boolean r0 = r5.isCtrlPressed()
                    if (r0 == 0) goto Lb0
                    int r0 = r5.getKeyCode()
                    long r2 = X.C38891fp.LIZLLL(r0)
                    long r0 = X.C18500o2.LJII
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L61
                    X.0oJ r0 = X.EnumC18670oJ.LEFT_WORD
                    goto L1e
                L61:
                    long r0 = X.C18500o2.LJIIIIZZ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L6c
                    X.0oJ r0 = X.EnumC18670oJ.RIGHT_WORD
                    goto L1e
                L6c:
                    long r0 = X.C18500o2.LJIIIZ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L77
                    X.0oJ r0 = X.EnumC18670oJ.PREV_PARAGRAPH
                    goto L1e
                L77:
                    long r0 = X.C18500o2.LJIIJ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L82
                    X.0oJ r0 = X.EnumC18670oJ.NEXT_PARAGRAPH
                    goto L1e
                L82:
                    long r0 = X.C18500o2.LIZJ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L8d
                    X.0oJ r0 = X.EnumC18670oJ.DELETE_PREV_CHAR
                    goto L1e
                L8d:
                    long r0 = X.C18500o2.LJIJ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L98
                    X.0oJ r0 = X.EnumC18670oJ.DELETE_NEXT_WORD
                    goto L1e
                L98:
                    long r0 = X.C18500o2.LJIIZILJ
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto La4
                    X.0oJ r0 = X.EnumC18670oJ.DELETE_PREV_WORD
                    goto L1e
                La4:
                    long r0 = X.C18500o2.LJI
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L20
                    X.0oJ r0 = X.EnumC18670oJ.DESELECT
                    goto L1e
                Lb0:
                    boolean r0 = r5.isShiftPressed()
                    if (r0 == 0) goto L20
                    int r0 = r5.getKeyCode()
                    long r2 = X.C38891fp.LIZLLL(r0)
                    long r0 = X.C18500o2.LJIILIIL
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto Lca
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_HOME
                    goto L1e
                Lca:
                    long r0 = X.C18500o2.LJIILJJIL
                    boolean r0 = X.C24860yI.LIZ(r2, r0)
                    if (r0 == 0) goto L20
                    X.0oJ r0 = X.EnumC18670oJ.SELECT_END
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1XS.LIZIZ(android.view.KeyEvent):X.0oJ");
            }
        };
    }
}

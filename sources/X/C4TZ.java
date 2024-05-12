package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.4TZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TZ extends AbstractC65781Prl implements InterfaceC65784Pro<C108194Ml> {
    public static final C4TZ LJLIL = new C4TZ();

    public C4TZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Ml] */
    @Override // X.InterfaceC65784Pro
    public final C108194Ml invoke() {
        return new InterfaceC82203Km() { // from class: X.4Ml
            public final C96023pm LIZ = new C96023pm(0);

            @Override // X.InterfaceC82203Km
            public final C4MW LIZIZ() {
                return new C4MW();
            }

            @Override // X.InterfaceC82203Km
            public final void LJFF() {
            }

            @Override // X.InterfaceC82203Km
            public final void LJII() {
            }

            @Override // X.InterfaceC82203Km
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC82203Km
            public final void LJIIL() {
            }

            @Override // X.InterfaceC82203Km
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC82203Km
            public final void LJIILJJIL() {
            }

            @Override // X.InterfaceC82203Km
            public final C96023pm LJIILLIIL() {
                return this.LIZ;
            }

            @Override // X.InterfaceC82203Km
            public final C4WL LJIJ() {
                return C4WL.LIZIZ;
            }

            @Override // X.InterfaceC82203Km
            public final String LIZ(String str) {
                return LJIIIIZZ(0, str);
            }

            @Override // X.InterfaceC82203Km
            public final String LIZJ(String str) {
                return C63171Oql.LIZ(str, "reshow_as_inner_push_time");
            }

            @Override // X.InterfaceC82203Km
            public final int LJ(String str) {
                if (str == null || TextUtils.isEmpty(str)) {
                    return -1;
                }
                String[] split = str.split(":");
                if (split.length != 4) {
                    return -1;
                }
                return CastIntegerProtector.parseInt(split[0]);
            }

            @Override // X.InterfaceC82203Km
            public final C120184ne LJIIJ(String conversationId) {
                o.LJIIIZ(conversationId, "conversationId");
                return new C120184ne(conversationId);
            }

            @Override // X.InterfaceC82203Km
            public final long LJIILL(String str) {
                return C120014nN.LIZLLL(str);
            }

            @Override // X.InterfaceC82203Km
            public final boolean LIZLLL(String conversationId, String value) {
                o.LJIIIZ(conversationId, "conversationId");
                o.LJIIIZ(value, "value");
                return C63171Oql.LIZJ(conversationId, "reshow_as_inner_push_time", value);
            }

            @Override // X.InterfaceC82203Km
            public final AbstractC108304Mw LJI(int i, EnumC97443s4 type) {
                o.LJIIIZ(type, "type");
                int i2 = C97453s5.LIZ[type.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return new C108274Mt(i, type);
                    }
                    throw new C162476Zf();
                }
                return new C4W3(i, type);
            }

            @Override // X.InterfaceC82203Km
            public final String LJIIIIZZ(int i, String str) {
                long LJJ = C1GE.LJJ(str);
                if (LJJ <= 0) {
                    C4ZL.LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getConversationIdByUid toUid invalid: ");
                    LIZ.append(str);
                    C114834f1.LJIIJJI("InternalService", X1D.LIZIZ(LIZ));
                    return null;
                }
                C4ZL.LIZ();
                long LLJJ = C4ZG.LJLIL.LLJJ();
                if (LLJJ <= 0) {
                    C4ZL.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("getConversationIdByUid self uid invalid: ");
                    LIZ2.append(LLJJ);
                    LIZ2.append(", ");
                    C4ZL.LIZ();
                    LIZ2.append(C80763Ey.LIZLLL());
                    C114834f1.LJIIJJI("InternalService", X1D.LIZIZ(LIZ2));
                    return null;
                }
                return C120014nN.LIZJ(i, LJJ, LLJJ);
            }

            @Override // X.InterfaceC82203Km
            public final C4SL LJIIJJI(String str, int[] iArr) {
                return new C4SL(str, iArr);
            }

            @Override // X.InterfaceC82203Km
            public final C63221OrZ LJIIZILJ(String conversationId, boolean z) {
                o.LJIIIZ(conversationId, "conversationId");
                return new C63221OrZ(conversationId, z);
            }
        };
    }
}

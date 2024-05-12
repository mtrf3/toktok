package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MqI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC58046MqI implements Serializable {
    public static final EnumC58046MqI CONTACT;
    public static final EnumC58046MqI FACEBOOK;
    public static final /* synthetic */ EnumC58046MqI[] LJLJI;
    public final int LJLIL;
    public final String LJLILLLLZI;

    public EnumC58046MqI() {
        throw null;
    }

    public static EnumC58046MqI valueOf(String str) {
        return (EnumC58046MqI) V0N.LJJJ(EnumC58046MqI.class, str);
    }

    public static EnumC58046MqI[] values() {
        return (EnumC58046MqI[]) LJLJI.clone();
    }

    public abstract boolean isGrant();

    static {
        EnumC58046MqI enumC58046MqI = new EnumC58046MqI() { // from class: X.MqJ
            @Override // X.EnumC58046MqI
            public final boolean isGrant() {
                return UTK.LIZIZ.LJFF(this).LIZ().LIZLLL;
            }
        };
        CONTACT = enumC58046MqI;
        EnumC58046MqI enumC58046MqI2 = new EnumC58046MqI() { // from class: X.MqK
            @Override // X.EnumC58046MqI
            public final boolean isGrant() {
                return UTK.LIZIZ.LJFF(this).LIZ().LIZLLL;
            }
        };
        FACEBOOK = enumC58046MqI2;
        LJLJI = new EnumC58046MqI[]{enumC58046MqI, enumC58046MqI2};
    }

    public final String getString() {
        return this.LJLILLLLZI;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public EnumC58046MqI(String str, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = i2;
        this.LJLILLLLZI = str2;
    }
}

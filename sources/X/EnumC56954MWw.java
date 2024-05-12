package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MWw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC56954MWw {
    public static final EnumC56954MWw FOLLOW_REQUEST;
    public static final EnumC56954MWw INBOX;
    public static final /* synthetic */ EnumC56954MWw[] LJLIL;

    public EnumC56954MWw() {
        throw null;
    }

    public static EnumC56954MWw valueOf(String str) {
        return (EnumC56954MWw) V0N.LJJJ(EnumC56954MWw.class, str);
    }

    public static EnumC56954MWw[] values() {
        return (EnumC56954MWw[]) LJLIL.clone();
    }

    public abstract String getEnterFrom();

    static {
        EnumC56954MWw enumC56954MWw = new EnumC56954MWw() { // from class: X.MWy
            public final String LJLILLLLZI = "notification_page";

            @Override // X.EnumC56954MWw
            public final String getEnterFrom() {
                return this.LJLILLLLZI;
            }
        };
        INBOX = enumC56954MWw;
        EnumC56954MWw enumC56954MWw2 = new EnumC56954MWw() { // from class: X.MWx
            public final String LJLILLLLZI = "follow_request";

            @Override // X.EnumC56954MWw
            public final String getEnterFrom() {
                return this.LJLILLLLZI;
            }
        };
        FOLLOW_REQUEST = enumC56954MWw2;
        LJLIL = new EnumC56954MWw[]{enumC56954MWw, enumC56954MWw2};
    }

    public EnumC56954MWw(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

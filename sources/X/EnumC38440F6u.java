package X;

import com.bytedance.android.livesdk.livesetting.other.LiveTestSkipAABCheckSettings;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LINK_MIC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.F6u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC38440F6u {
    public static final EnumC38440F6u CAST;
    public static final EnumC38440F6u CMAF;
    public static final EnumC38440F6u LINK_MIC;
    public static final /* synthetic */ EnumC38440F6u[] LJLJJL;
    public static final EnumC38440F6u QUIC;
    public static final EnumC38440F6u RTS;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String[] LJLJJI;

    public static EnumC38440F6u valueOf(String str) {
        return (EnumC38440F6u) V0N.LJJJ(EnumC38440F6u.class, str);
    }

    public static EnumC38440F6u[] values() {
        return (EnumC38440F6u[]) LJLJJL.clone();
    }

    static {
        LiveTestSkipAABCheckSettings liveTestSkipAABCheckSettings = LiveTestSkipAABCheckSettings.INSTANCE;
        EnumC38440F6u enumC38440F6u = new EnumC38440F6u("LINK_MIC", 0, "df_live_byte_link", "com.ss.android.ugc.i18n.bytelink", liveTestSkipAABCheckSettings.getValue());
        LINK_MIC = enumC38440F6u;
        EnumC38440F6u enumC38440F6u2 = new EnumC38440F6u("QUIC", 1, "df_live_quic", "com.ss.android.ugc.i18n.quic", liveTestSkipAABCheckSettings.getValue());
        QUIC = enumC38440F6u2;
        EnumC38440F6u enumC38440F6u3 = new EnumC38440F6u("CAST", 2, "df_live_cast", "com.ss.android.ugc.aweme.cast", liveTestSkipAABCheckSettings.getValue());
        CAST = enumC38440F6u3;
        EnumC38440F6u enumC38440F6u4 = new EnumC38440F6u("RTS", 3, "df_live_rts", "com.ss.android.ugc.i18n.rts", liveTestSkipAABCheckSettings.getValue(), new String[]{"com.ss.android.ugc.i18n.bytelink"});
        RTS = enumC38440F6u4;
        EnumC38440F6u enumC38440F6u5 = new EnumC38440F6u("CMAF", 4, "df_live_cmaf", "com.ss.android.ugc.i18n.cmaf", liveTestSkipAABCheckSettings.getValue());
        CMAF = enumC38440F6u5;
        LJLJJL = new EnumC38440F6u[]{enumC38440F6u, enumC38440F6u2, enumC38440F6u3, enumC38440F6u4, enumC38440F6u5};
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("packageName:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" dependentPkgName:");
        LIZ.append(ORY.LJJJJLL(this.LJLJJI, null, null, null, C38441F6v.LJLIL, 31));
        return X1D.LIZIZ(LIZ);
    }

    public final String[] getDependPlugins() {
        return this.LJLJJI;
    }

    public final String getDfModuleName() {
        return this.LJLIL;
    }

    public final String getPackageName() {
        return this.LJLILLLLZI;
    }

    public final boolean isSkipAAB() {
        return this.LJLJI;
    }

    public /* synthetic */ EnumC38440F6u(String str, int i, String str2, String str3, boolean z) {
        this(str, i, str2, str3, z, new String[0]);
    }

    public EnumC38440F6u(String str, int i, String str2, String str3, boolean z, String[] strArr) {
        this.LJLIL = str2;
        this.LJLILLLLZI = str3;
        this.LJLJI = z;
        this.LJLJJI = strArr;
    }
}

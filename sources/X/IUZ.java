package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IUZ {
    public static final IUZ INSTANCE;
    public static final /* synthetic */ IUZ[] LJLJJLL;
    public ITX LJLIL;
    public IL8 LJLILLLLZI;
    public InterfaceC46688IUa LJLJI;
    public InterfaceC44848Hiu LJLJJI;
    public InterfaceC249119q7 LJLJJL;

    static {
        IUZ iuz = new IUZ();
        INSTANCE = iuz;
        LJLJJLL = new IUZ[]{iuz};
    }

    public static IUZ[] values() {
        return (IUZ[]) LJLJJLL.clone();
    }

    public IL8 cacheChecker() {
        return this.LJLILLLLZI;
    }

    public InterfaceC46688IUa getBitrateManager() {
        return this.LJLJI;
    }

    public InterfaceC44848Hiu getHttpsHelper() {
        return this.LJLJJI;
    }

    public InterfaceC249119q7 getPlayUrlBuilder() {
        return this.LJLJJL;
    }

    public ITX playInfoCallback() {
        return this.LJLIL;
    }

    public static IUZ valueOf(String str) {
        return (IUZ) V0N.LJJJ(IUZ.class, str);
    }

    public IUZ setBitrateManager(InterfaceC46688IUa interfaceC46688IUa) {
        this.LJLJI = interfaceC46688IUa;
        return this;
    }

    public IUZ setCacheChecker(IL8 il8) {
        this.LJLILLLLZI = il8;
        return this;
    }

    public IUZ setHttpsHelper(InterfaceC44848Hiu interfaceC44848Hiu) {
        this.LJLJJI = interfaceC44848Hiu;
        return this;
    }

    public IUZ setPlayInfoCallback(ITX itx) {
        this.LJLIL = itx;
        return this;
    }

    public IUZ setPlayUrlBuilder(InterfaceC249119q7 interfaceC249119q7) {
        this.LJLJJL = interfaceC249119q7;
        return this;
    }
}

package X;

/* renamed from: X.KJu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51518KJu {
    GLOBAL,
    EXTERNAL,
    ACTIVITY(KK1.LJLIL),
    FRAGMENT(KK2.LJLIL),
    ITEM(KK3.LJLIL),
    OBJECT(KK4.LJLIL),
    SESSION_ID(C51472KIa.LJLIL),
    SEARCH_STACK(C51473KIb.LJLIL),
    BIND_AWEME(C51523KJz.LJLIL),
    STREAM_AFFINITY_AWEME(KK0.LJLIL);

    public final InterfaceC88472Yns<KJU, Object> LJLIL;

    public static EnumC51518KJu valueOf(String str) {
        return (EnumC51518KJu) V0N.LJJJ(EnumC51518KJu.class, str);
    }

    public final InterfaceC88472Yns<KJU, Object> getBinder() {
        return this.LJLIL;
    }

    /* synthetic */ EnumC51518KJu() {
        this(KK5.LJLIL);
    }

    EnumC51518KJu(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }
}

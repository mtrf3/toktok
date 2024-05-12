package X;

import java.util.LinkedList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ixg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC48312Ixg implements InterfaceC139745e6<List<Object>> {
    public static final EnumC48312Ixg LJLIL;
    public static final /* synthetic */ EnumC48312Ixg[] LJLILLLLZI;

    static {
        EnumC48312Ixg enumC48312Ixg = new EnumC48312Ixg();
        LJLIL = enumC48312Ixg;
        LJLILLLLZI = new EnumC48312Ixg[]{enumC48312Ixg};
    }

    public static EnumC48312Ixg[] values() {
        return (EnumC48312Ixg[]) LJLILLLLZI.clone();
    }

    @Override // X.InterfaceC139745e6
    public final List<Object> get() {
        return new LinkedList();
    }

    public static EnumC48312Ixg valueOf(String str) {
        return (EnumC48312Ixg) V0N.LJJJ(EnumC48312Ixg.class, str);
    }
}

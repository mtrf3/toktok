package X;

import java.util.HashSet;

/* renamed from: X.Tof, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75781Tof extends AbstractC65781Prl implements InterfaceC65784Pro<HashSet<OSZ<? extends EnumC75419Tip, ? extends EnumC75419Tip>>> {
    public static final C75781Tof LJLIL = new C75781Tof();

    public C75781Tof() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashSet<OSZ<? extends EnumC75419Tip, ? extends EnumC75419Tip>> invoke() {
        HashSet<OSZ<? extends EnumC75419Tip, ? extends EnumC75419Tip>> hashSet = new HashSet<>();
        EnumC75419Tip enumC75419Tip = EnumC75419Tip.StateIdle;
        hashSet.add(new OSZ<>(enumC75419Tip, enumC75419Tip));
        EnumC75419Tip enumC75419Tip2 = EnumC75419Tip.StateInit;
        hashSet.add(new OSZ<>(enumC75419Tip2, enumC75419Tip2));
        EnumC75419Tip enumC75419Tip3 = EnumC75419Tip.StateJoined;
        hashSet.add(new OSZ<>(enumC75419Tip3, enumC75419Tip3));
        EnumC75419Tip enumC75419Tip4 = EnumC75419Tip.StateLinked;
        hashSet.add(new OSZ<>(enumC75419Tip4, enumC75419Tip4));
        hashSet.add(new OSZ<>(enumC75419Tip2, enumC75419Tip));
        hashSet.add(new OSZ<>(enumC75419Tip, enumC75419Tip2));
        hashSet.add(new OSZ<>(enumC75419Tip2, enumC75419Tip3));
        hashSet.add(new OSZ<>(enumC75419Tip, enumC75419Tip3));
        hashSet.add(new OSZ<>(enumC75419Tip2, enumC75419Tip4));
        hashSet.add(new OSZ<>(enumC75419Tip, enumC75419Tip4));
        hashSet.add(new OSZ<>(enumC75419Tip3, enumC75419Tip4));
        hashSet.add(new OSZ<>(enumC75419Tip4, enumC75419Tip));
        hashSet.add(new OSZ<>(enumC75419Tip4, enumC75419Tip2));
        return hashSet;
    }
}

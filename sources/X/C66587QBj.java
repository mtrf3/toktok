package X;

/* renamed from: X.QBj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66587QBj implements InterfaceC65644PpY<String, String> {
    @Override // X.InterfaceC65644PpY
    public final String apply(String str) {
        return str.replaceFirst("/data/data/", "/data/user/0/");
    }
}
